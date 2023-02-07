/*
 * File Name: AESDecryptUDFTest
 * Version: 1.0
 * Last Modified Time: 2023-02-07 16:32
 */
/*
 * Copyright @ 2013 Airchina.
 * All right reserved.
 */
package com.airchina.datacenter;

import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.JavaStringObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.junit.Assert;

/**
 * @author
 * @date 2023/2/7 16:32
 */

/**
 * <p>Class Name: AESDecryptUDFTest</p>
 * <p>Description: 类功能说明</p>
 * <p>Sample: 该类的典型使用方法和用例</p>
 * <p>Author: WangYue</p>
 * <p>Date: 2023-02-07 16:32</p>
 */
public class AESDecryptUDFTest {
    public static void main(String[] args) throws HiveException {

        AESDecryptUDF aesDecryptUDF = new AESDecryptUDF();
        ObjectInspector inspector0 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        ObjectInspector inspector1 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        ObjectInspector inspector2 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        aesDecryptUDF.initialize(new ObjectInspector[]{inspector0, inspector1, inspector2});

        GenericUDF.DeferredJavaObject column = new GenericUDF.DeferredJavaObject("2a396a6063d0453b6ab55d55d22bd28b");
        GenericUDF.DeferredJavaObject cryptoKey = new GenericUDF.DeferredJavaObject("wVu8I65saUjc5A5dYyh7v0LVzqTNXx73");
        GenericUDF.DeferredJavaObject cryptoIv = new GenericUDF.DeferredJavaObject("3qIStLqbzL7lEbMR");
        Object evaluate = aesDecryptUDF.evaluate(new GenericUDF.DeferredObject[]{column, cryptoKey, cryptoIv});
        System.out.println(evaluate);
        Assert.assertEquals("+86-13918460444", evaluate);

    }


}