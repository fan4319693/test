package com.airchina.datacenter.spnr.sm4;

import com.airchina.datacenter.spnr.sm4.util.Sm4Utils;
import org.apache.commons.codec.DecoderException;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/*
* SM4 CBC ECB
* */
@Description(name = "Sm4Encrypt",
            value = "_FUNC_(column, keyByKey, key, algorithm), algorithm{CBC,ECB}" +
                    "return ",
            extended = "> SELECT _FUNC_(column, keyByKey, key, algorithm) FROM src")
public class Sm4Decrypt extends GenericUDF {

    private StringObjectInspector column;
    private StringObjectInspector keyByKey;
    private StringObjectInspector key;
    private StringObjectInspector algorithm;

    @Override
    public ObjectInspector initialize(ObjectInspector[] objectInspectors) throws UDFArgumentException {
        // 1、参数个数检查
        if (objectInspectors.length != 4) {
            throw new UDFArgumentException("函数需要四个参数");
        }
        ObjectInspector in0 = objectInspectors[0];
        ObjectInspector in1 = objectInspectors[1];
        ObjectInspector in2 = objectInspectors[2];
        ObjectInspector in3 = objectInspectors[3];

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
        if (in3.getCategory() != ObjectInspector.Category.PRIMITIVE
                || !PrimitiveObjectInspector.PrimitiveCategory.STRING.equals(((PrimitiveObjectInspector) in3).getPrimitiveCategory())) {
            throw new UDFArgumentException("第四个参数不是hive原始string数据类型");
        }

        this.column = (StringObjectInspector) in0;
        this.keyByKey = (StringObjectInspector) in1;
        this.key = (StringObjectInspector) in2;
        this.algorithm = (StringObjectInspector) in3;

        return PrimitiveObjectInspectorFactory.javaStringObjectInspector;
    }

    @Override
    public Object evaluate(DeferredObject[] deferredObjects) throws HiveException {
        String column = this.column.getPrimitiveJavaObject(deferredObjects[0].get());
        String keyByKey = this.keyByKey.getPrimitiveJavaObject(deferredObjects[1].get());
        String key = this.key.getPrimitiveJavaObject(deferredObjects[2].get());
        String algorithm = this.algorithm.getPrimitiveJavaObject(deferredObjects[3].get());

        try {
            String ecbKey = Sm4Utils.ecbDecrypt(keyByKey, key, algorithm);
            return Sm4Utils.ecbDecrypt(ecbKey, column, algorithm);
        } catch (IllegalBlockSizeException | BadPaddingException | InvalidAlgorithmParameterException
                | InvalidKeyException | NoSuchPaddingException | NoSuchAlgorithmException | DecoderException e) {
            throw new HiveException("There is something wrong, see ", e);
        }
    }

    @Override
    public String getDisplayString(String[] strings) {
        return column + "-" + keyByKey + "-" + key + "-" + algorithm;
    }
}
