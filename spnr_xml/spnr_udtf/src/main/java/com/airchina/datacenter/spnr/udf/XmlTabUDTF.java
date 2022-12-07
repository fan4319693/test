package com.airchina.datacenter.spnr.udf;

import com.airchina.datacenter.spnr.sdk.SPNRContext;
import com.airchina.datacenter.spnr.sdk.SuperPNRJAXBProcessor;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector.Category;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector.PrimitiveCategory;
import org.apache.hadoop.hive.serde2.objectinspector.StructField;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.WritableConstantStringObjectInspector;
import org.apache.hadoop.io.Text;
import com.airchina.datacenter.spnr.udf.pojo.KafkaLogs;
import com.airchina.datacenter.spnr.udf.pojo.XmlParserEx;
import com.airchina.datacenter.spnr.udf.processor.Dispatcher;
import com.airchina.datacenter.spnr.udf.processor.XmlProcessor;
import com.airchina.datacenter.spnr.udf.utils.KafkaDao;

public class XmlTabUDTF extends GenericUDTF {

    private static final Log log = LogFactory.getLog(XmlTabUDTF.class);
    private static final SuperPNRJAXBProcessor spnrExtractprocessor = SuperPNRJAXBProcessor.getInstance();
    private StringObjectInspector soi;
    private XmlProcessor xmlProcessor;
    private String tb_lc;
    private boolean kfLogFlag;
    private KafkaLogs kafkaLogs;

    @Override
    public StructObjectInspector initialize(StructObjectInspector argOIs) throws UDFArgumentException {
        if (argOIs.getAllStructFieldRefs().size() < 2) {
            throw new UDFArgumentException("We need 2 params:xml content and corresponding table name.");
        }

        StructField xmlContentParam = argOIs.getAllStructFieldRefs().get(0);
        StructField tableNameParam = argOIs.getAllStructFieldRefs().get(1);

        // check fist param
        if (xmlContentParam.getFieldObjectInspector().getCategory() != Category.PRIMITIVE) {
            throw new UDFArgumentException("First parma must Primitive(String).");
        }
        PrimitiveObjectInspector xmlContentPrimitiveOI = (PrimitiveObjectInspector) xmlContentParam.getFieldObjectInspector();
        if (xmlContentPrimitiveOI.getPrimitiveCategory() != PrimitiveCategory.STRING) {
            throw new UDFArgumentException("Fist param must String");
        }
        this.soi = (StringObjectInspector) xmlContentParam.getFieldObjectInspector();

        // check second param
        if (tableNameParam.getFieldObjectInspector().getCategory() != Category.PRIMITIVE) {
            throw new UDFArgumentException("Second param must Primitive(String).");
        }
        PrimitiveObjectInspector tableNamePrimitiveOI = (PrimitiveObjectInspector) tableNameParam.getFieldObjectInspector();
        if (tableNamePrimitiveOI.getPrimitiveCategory() != PrimitiveCategory.STRING) {
            throw new UDFArgumentException("Second param must String");
        }

        // check table name in list
        String tableName_lc = Arguments
            .asConstantNonNullString(tableNameParam.getFieldObjectInspector(), "table_name")
            .toLowerCase();
        if (!Dispatcher.contains(tableName_lc)) {
            throw new UDFArgumentException("Can not process table " + tableName_lc);
        }
        this.xmlProcessor = Dispatcher.getProcessor(tableName_lc);
        this.tb_lc = tableName_lc;
        this.kfLogFlag = false;
        if (argOIs.getAllStructFieldRefs().size() > 2 && argOIs.getAllStructFieldRefs().size() != 4) {
            throw new UDFArgumentException("Or use kafka log ex need bt and topic!");
        } else if (argOIs.getAllStructFieldRefs().size() == 4) {
            StructField btParam = argOIs.getAllStructFieldRefs().get(2);
            StructField topicParam = argOIs.getAllStructFieldRefs().get(3);
            // pass check
            String bt = Arguments.asConstantNonNullString(btParam.getFieldObjectInspector(), "bt");
            String topic = Arguments.asConstantNonNullString(topicParam.getFieldObjectInspector(), "topic");
            this.kafkaLogs = new KafkaLogs();
            this.kafkaLogs.setBt(bt);
            this.kafkaLogs.setTopic(topic);
            this.kfLogFlag = true;
        }
        return xmlProcessor.transformJavaToHive();
    }


    /**
     * 1. 先 SDK 转 xml 为 pojo
     * 2. 然后 pojo 打平到字段
     * 字段信息 initialize 中已经根据传进来的函数参数初始化好了，所有的参数到字段信息初始化在 Dispatcher 中静态初始化的
     * 带入这里的 pojo （不同参数应该取 pojo 哪个 obj 也是 Dispatcher 静态初始化好的）取值
     * 3. 最后 forward
     * @param args
     *          object array of arguments
     * @throws HiveException
     */
    @Override
    public void process(Object[] args) throws HiveException {
        if (args == null || args[0] == null) {
            return;
        }
        String xmlText = this.soi.getPrimitiveJavaObject(args[0]);
        List<Object[]> data = javaProcess(xmlText);
        if (data == null || data.isEmpty()) {
            return;
        }

        for (Object[] row : data) {
            forward(row);
        }
    }

    public List<Object[]> javaProcess(String xmlText) {
        SPNRContext context = null;
        XmlParserEx exData = new XmlParserEx();

        try {
            context = spnrExtractprocessor.process(xmlText);
        } catch (Exception e) {
            // TODO: 2022/7/15 Log some full stacktrace
            if (kfLogFlag) {
                exData.setXml(xmlText);
                exData.setFullStack(ExceptionUtils.getFullStackTrace(e));
                exData.setLog("St.1");
                kafkaLogs.setXmlParserEx(exData);

                KafkaDao.insert(kafkaLogs);
            }
        }
        if (context != null) {
            if (kfLogFlag) {
                return this.xmlProcessor.process(context, this.tb_lc, kafkaLogs);
            } else {
                return this.xmlProcessor.process(context, this.tb_lc);
            }
        }
        return null;
    }

    public void setter(String tb_lc) {
        this.xmlProcessor = Dispatcher.getProcessor(tb_lc);
        this.tb_lc = tb_lc;
    }

    @Override
    public void close() throws HiveException {
        if (kfLogFlag) {
            KafkaDao.close(this.kafkaLogs);
        }
    }

    private static class Arguments {

        public static String asConstantNonNullString(final ObjectInspector oi, final String parmaName)
            throws UDFArgumentException {
            if (!(oi instanceof WritableConstantStringObjectInspector)) {
                throw new UDFArgumentException(parmaName + " must be a constant string.");
            }
            final Text text = ((WritableConstantStringObjectInspector) oi).getWritableConstantValue();
            if (text == null) {
                throw new UDFArgumentException(parmaName + " must not be NULL.");
            }
            return text.toString();
        }

        public static List<String> asConstantNonNullStrings(final List<ObjectInspector> ois, final String name)
            throws UDFArgumentException {
            final List<String> strs = new ArrayList<>();
            for (final ObjectInspector oi : ois) {
                strs.add(asConstantNonNullString(oi, name));
            }
            return strs;
        }

        public static StringObjectInspector asString(final ObjectInspector oi, final String name)
            throws UDFArgumentException {
            if (!(oi instanceof StringObjectInspector)) {
                throw new UDFArgumentException(name + " must be of string type.");
            }
            return (StringObjectInspector) oi;
        }
    }
}
