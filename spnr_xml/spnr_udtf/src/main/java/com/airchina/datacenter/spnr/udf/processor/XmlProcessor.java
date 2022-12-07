package com.airchina.datacenter.spnr.udf.processor;

import com.airchina.datacenter.spnr.sdk.SPNRContext;
import com.airchina.datacenter.spnr.udf.pojo.KafkaLogs;
import com.airchina.datacenter.spnr.udf.pojo.XmlParserEx;
import com.airchina.datacenter.spnr.udf.utils.KafkaDao;
import com.google.common.collect.Lists;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;

public class XmlProcessor {

    private final Field[] fields;

    public XmlProcessor(Class clz) {
        this.fields = clz.getDeclaredFields();
    }

    public List<Object[]> process(SPNRContext context, String tb) {
        List<Object[]> ans = Lists.newArrayList();
        // convert pojo as map<field_name,to_list> for get data by table name
        Map<String, List> convertedContext = Dispatcher.convertContext(context);
        List wantedRow = convertedContext.getOrDefault(tb, Collections.emptyList());
        for (Object o : wantedRow) {

            Object[] row;
            try {
                row = processOneRow(o);
            } catch (IllegalAccessException e) {
                // if class mapping error then skip this row
                continue;
            }
            ans.add(row);
        }
        return ans;
    }

    public List<Object[]> process(SPNRContext context, String tb, KafkaLogs kafkaLogs) {
        List<Object[]> ans = Lists.newArrayList();
        // convert pojo as map<field_name,to_list> for get data by table name
        Map<String, List> convertedContext = Dispatcher.convertContext(context);
        List wantedRow = convertedContext.getOrDefault(tb, Collections.emptyList());
        for (Object o : wantedRow) {

            Object[] row;
            try {
                row = processOneRow(o);
            } catch (IllegalAccessException e) {
                // if class mapping error then log this ex if need and skip this row
                if (kafkaLogs != null) {
                    XmlParserEx exLog = new XmlParserEx();
                    exLog.setLog("St.2");
                    exLog.setFullStack(ExceptionUtils.getFullStackTrace(e));
                    kafkaLogs.setXmlParserEx(exLog);
                    KafkaDao.insert(kafkaLogs);
                }
                continue;
            }
            ans.add(row);
        }
        return ans;
    }

    private Object[] processOneRow(Object obj) throws IllegalAccessException {
        Object[] row = new Object[this.fields.length];
        for (int i = 0; i < this.fields.length; i++) {
            this.fields[i].setAccessible(true);
            row[i] = this.fields[i].get(obj);
        }
        return row;
    }

    public StructObjectInspector transformJavaToHive() {
        // only transform at init
        List<String> fieldNames = new ArrayList<>(this.fields.length);
        List<ObjectInspector> fieldOIs = new ArrayList<>(this.fields.length);

        for (Field field : this.fields) {
            fieldNames.add(field.getName());
            PrimitiveObjectInspector fieldPrimitiveOI = PrimitiveObjectInspectorFactory.getPrimitiveObjectInspectorFromClass(
                field.getType());
            fieldOIs.add(fieldPrimitiveOI);
        }
        return ObjectInspectorFactory.getStandardStructObjectInspector(fieldNames, fieldOIs);
    }

}
