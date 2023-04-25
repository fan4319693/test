package com.airchina.datacenter.spnr.udf;

import com.airchina.datacenter.spnr.sdk.utils.Constants;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.udf.XmlPathUDF </p>
 * <p>Description: 清洗国航原始的xml, 提取必要的节点 </p>
 * <p>Sample: new XmlPathUDF() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class XmlPathUDF extends GenericUDF {

    private static final Log logger = LogFactory.getLog(XmlPathUDF.class);

    /**
     * 功能说明: 待提取国航原始xml的子节点的路径
     * 最后修改时间: 2023/04/20
     */
    private String XmlPath = Constants.XML_PATH_DEFAULT;

    /**
     * 功能说明: xml文本的读取器
     * 最后修改时间: 2023/04/20
     */
    private SAXReader reader;

    /**
     * 功能说明: 提取String的文本
     * 最后修改时间: 2023/04/20
     */
    private StringObjectInspector soi;

    @Override
    public ObjectInspector initialize(ObjectInspector[] arguments) {
        this.reader = new SAXReader();

        //该UDF默认只传一个参数, xml的文本, 提取的节点路径使用默认值, 若有第2个参数, 则用传入的节点路径
        if (arguments.length == 2) {
            this.XmlPath = arguments[1].toString();
        }
        this.soi = (StringObjectInspector) arguments[0];
        logger.info("Set xml path as " + this.XmlPath);
        return PrimitiveObjectInspectorFactory.javaStringObjectInspector;
    }

    @Override
    public Object evaluate(DeferredObject[] arguments) throws HiveException {
        String xmlContent = soi.getPrimitiveJavaObject(arguments[0].get());
        // remove namespace or may select node with null
        xmlContent = xmlContent.replaceAll("xmlns=\"[^>,^\\s]+\"", "");
        Document doc = null;
        try {
            doc = this.reader.read(IOUtils.toInputStream(xmlContent));
            Node spnr = doc.selectSingleNode(this.XmlPath);
            if (spnr != null) {
                return spnr.asXML();
            }
        } catch (DocumentException e) {
            logger.error(e);
            throw new HiveException("Can not parse XML!");
        }
        return null;
    }

    @Override
    public String getDisplayString(String[] children) {
        return null;
    }
}
