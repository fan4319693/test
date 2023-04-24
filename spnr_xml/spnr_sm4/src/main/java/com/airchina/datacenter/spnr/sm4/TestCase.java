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
        ObjectInspector inspector3 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        JavaStringObjectInspector initialize = (JavaStringObjectInspector) sm4Decrypt.initialize(new ObjectInspector[]{
                inspector0, inspector1, inspector2, inspector3});

        /* MH55FE 8miGQF/6XGq0Yj1JEllyrA== ZW5jS2V5QDIwMjI= zl6pUqocNU7PixYT2NeC5AME4gvTzL4NEPZzasozLAY=
         */
        GenericUDF.DeferredJavaObject column = new GenericUDF.DeferredJavaObject("8miGQF/6XGq0Yj1JEllyrA==1");
        GenericUDF.DeferredJavaObject keyByKey = new GenericUDF.DeferredJavaObject("ZW5jS2V5QDIwMjI=");
        GenericUDF.DeferredJavaObject key = new GenericUDF.DeferredJavaObject("zl6pUqocNU7PixYT2NeC5AME4gvTzL4NEPZzasozLAY=");
        GenericUDF.DeferredJavaObject algorithm = new GenericUDF.DeferredJavaObject("ECB");
        Object evaluate = sm4Decrypt.evaluate(new GenericUDF.DeferredObject[]{column, keyByKey, key, algorithm});
        System.out.println("|" + evaluate + "|");

    }
}
