package com.airchina.datacenter.spnr.sm4;

import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.JavaStringObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;

public class TestCase {
    public static void main(String[] args) throws HiveException {

        Sm4Decrypt sm4Decrypt = new Sm4Decrypt();
        ObjectInspector inspector0 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        ObjectInspector inspector1 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        ObjectInspector inspector2 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        JavaStringObjectInspector initialize = (JavaStringObjectInspector) sm4Decrypt.initialize(new ObjectInspector[]{
                inspector0, inspector1, inspector2});

        /* 18234081450 1e86e12cd728c100be6144e49030af73
         * 张三 f19b896b983340869c5af5dcb964cbb0
         */
        GenericUDF.DeferredJavaObject column = new GenericUDF.DeferredJavaObject("f19b896b983340869c5af5dcb964cbb0");
        GenericUDF.DeferredJavaObject version = new GenericUDF.DeferredJavaObject("version");
        GenericUDF.DeferredJavaObject algorithm = new GenericUDF.DeferredJavaObject("cbc");
        Object evaluate = sm4Decrypt.evaluate(new GenericUDF.DeferredObject[]{column, version, algorithm});
        System.out.println(evaluate);
    }
}
