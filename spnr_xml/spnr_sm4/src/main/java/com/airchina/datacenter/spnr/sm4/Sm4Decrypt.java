package com.airchina.datacenter.spnr.sm4;

import com.airchina.datacenter.spnr.sm4.util.Sm4Utils;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.exec.UDFArgumentTypeException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDFUtils;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/*
* SM4 秘钥的秘钥解密秘钥后，再解密密文
* */
@Description(name = "sm4_decrypt",
            value = "_FUNC_(column, keyByKey, key, algorithm) - Returns column if column is null or ''",
            extended = "Example:\n" +
                    "> SELECT _FUNC_('8miGQF/6XGq0Yj1JEllyrA==', 'ZW5jS2V5QDIwMjI=', 'zl6pUqocNU7PixYT2NeC5AME4gvTzL4NEPZzasozLAY=', 'ECB') FROM src;\n" + "  MH55FE")
public class Sm4Decrypt extends GenericUDF {

    private ObjectInspector column;
    private ObjectInspector keyByKey;
    private ObjectInspector key;
    private ObjectInspector algorithm;

    private transient GenericUDFUtils.ReturnObjectInspectorResolver returnOIResolver;
    @Override
    public ObjectInspector initialize(ObjectInspector[] objectInspectors) throws UDFArgumentException {
        // 1、参数个数检查
        if (objectInspectors.length != 4) {
            throw new UDFArgumentException("函数需要四个参数");
        }

        // 2、参数类型检查，参数类型为string
        for (int i = 0; i < objectInspectors.length; i++) {
            if (objectInspectors[i].getCategory() != ObjectInspector.Category.PRIMITIVE) {
                throw new UDFArgumentTypeException(i, "Only primitive type arguments are accepted but "
                        + objectInspectors[i].getTypeName() + " is passed.");
            }
        }

        this.column = objectInspectors[0];
        this.keyByKey = objectInspectors[1];
        this.key = objectInspectors[2];
        this.algorithm = objectInspectors[3];

        return PrimitiveObjectInspectorFactory.javaStringObjectInspector;
    }

    @Override
    public Object evaluate(DeferredObject[] deferredObjects) throws HiveException {
        if (deferredObjects[0] == null || deferredObjects[0].get() == null) {
            return null;
        }
        if (deferredObjects[1] == null || deferredObjects[1].get() == null || deferredObjects[2] == null
                ||deferredObjects[2].get() == null) {
            throw new HiveException("keyByKey or key can`t be null");
        }

        String column = ((StringObjectInspector) this.column).getPrimitiveJavaObject(deferredObjects[0].get());
        String keyByKey = ((StringObjectInspector) this.keyByKey).getPrimitiveJavaObject(deferredObjects[1].get());
        String key = ((StringObjectInspector) this.key).getPrimitiveJavaObject(deferredObjects[2].get());
        String algorithm = ((StringObjectInspector) this.algorithm).getPrimitiveJavaObject(deferredObjects[3].get());

        if (StringUtils.isBlank(column)) {
            return column;
        }

        try{
            String ecbKey = Sm4Utils.ecbDecrypt(keyByKey, key, algorithm);
            return Sm4Utils.ecbDecrypt(ecbKey, column, algorithm);
        } catch (Exception e) {
            throw new HiveException("column (" + column + ") or keyByKey (" + keyByKey + ") or key (" + key + ") " +
                    "or algorithm (" + algorithm + ") is wrong, "  + e.getMessage(), e);
        }
    }

    @Override
    public String getDisplayString(String[] strings) {
        StringBuilder sb = new StringBuilder();
        sb.append("sm4_decrypt(");
        sb.append(strings[0]);
        sb.append(',');
        sb.append(strings[1]);
        sb.append(',');
        sb.append(strings[2]);
        sb.append(',');
        sb.append(strings[3]);
        sb.append(')');
        return sb.toString() ;
    }
}
