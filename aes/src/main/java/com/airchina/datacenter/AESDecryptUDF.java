/*
 * File Name: AESDecrypt
 * Version: 1.0
 * Last Modified Time: 2023-02-07 15:01
 */
/*
 * Copyright @ 2013 Airchina.
 * All right reserved.
 */
package com.airchina.datacenter;

/**
 * @author
 * @date 2023/2/7 15:01
 */

import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector;

import com.airchina.datacenter.util.AesUtils;

/**
 * <p>Class Name: AESDecrypt</p>
 * <p>Description: 类功能说明</p>
 * <p>Sample: 该类的典型使用方法和用例</p>
 * <p>Author: WangYue</p>
 * <p>Date: 2023-02-07 15:01</p>
 */
public class AESDecryptUDF extends GenericUDF {


    private StringObjectInspector column;
    private StringObjectInspector cryptoKey;
    private StringObjectInspector cryptoIv;

    public ObjectInspector initialize(ObjectInspector[] objectInspectors) throws UDFArgumentException {
        // 1、参数个数检查
        if (objectInspectors.length != 3) {
            throw new UDFArgumentException("函数需要3个参数");
        }
        ObjectInspector in0 = objectInspectors[0];
        ObjectInspector in1 = objectInspectors[1];
        ObjectInspector in2 = objectInspectors[2];

        // 2、参数类型检查，参数类型为string
        if (in0.getCategory() != ObjectInspector.Category.PRIMITIVE
                || !PrimitiveObjectInspector.PrimitiveCategory.STRING.equals(((PrimitiveObjectInspector) in0).getPrimitiveCategory())) {
            throw new UDFArgumentException("第一个参数不是hive原始string数据类型");
        }
        if (in1.getCategory() != ObjectInspector.Category.PRIMITIVE
                || !PrimitiveObjectInspector.PrimitiveCategory.STRING.equals(((PrimitiveObjectInspector) in1).getPrimitiveCategory())) {
            throw new UDFArgumentException("第二个参数不是hive原始string数据类型");
        }
        if (in2.getCategory() != ObjectInspector.Category.PRIMITIVE
                || !PrimitiveObjectInspector.PrimitiveCategory.STRING.equals(((PrimitiveObjectInspector) in2).getPrimitiveCategory())) {
            throw new UDFArgumentException("第三个参数不是hive原始string数据类型");
        }

        this.column = (StringObjectInspector) in0;
        this.cryptoKey = (StringObjectInspector) in1;
        this.cryptoIv = (StringObjectInspector) in2;

        return PrimitiveObjectInspectorFactory.javaStringObjectInspector;

    }

    public Object evaluate(DeferredObject[] deferredObjects) throws HiveException {
        String column = this.column.getPrimitiveJavaObject(deferredObjects[0].get());
        String cryptoKey = this.cryptoKey.getPrimitiveJavaObject(deferredObjects[1].get());
        String cryptoIv = this.cryptoIv.getPrimitiveJavaObject(deferredObjects[2].get());
        return AesUtils.decrypt(column, cryptoKey, cryptoIv);
    }

    public String getDisplayString(String[] strings) {
        return null;
    }
}