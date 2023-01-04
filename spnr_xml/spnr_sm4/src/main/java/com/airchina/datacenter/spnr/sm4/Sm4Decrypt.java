package com.airchina.datacenter.spnr.sm4;

import com.airchina.datacenter.spnr.sm4.util.Sm4Utils;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

/*
* SM4 CBC ECB
* */
@Description(name = "Sm4Encrypt",
            value = "_FUNC_(column, version, algorithm), algorithm{CBC,ECB}" +
                    "return ",
            extended = "> SELECT _FUNC_(column, version, algorithm) FROM src")
public class Sm4Decrypt extends GenericUDF {

    private StringObjectInspector column;
    private StringObjectInspector version;
    private StringObjectInspector algorithm;

    @Override
    public ObjectInspector initialize(ObjectInspector[] objectInspectors) throws UDFArgumentException {
        // 1、参数个数检查
        if (objectInspectors.length != 3) {
            throw new UDFArgumentException("函数需要三个参数");
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
        this.version = (StringObjectInspector) in1;
        this.algorithm = (StringObjectInspector) in2;

        return PrimitiveObjectInspectorFactory.javaStringObjectInspector;
    }

    @Override
    public Object evaluate(DeferredObject[] deferredObjects) throws HiveException {
        String column = this.column.getPrimitiveJavaObject(deferredObjects[0].get());
        String version = this.version.getPrimitiveJavaObject(deferredObjects[1].get());
        String algorithm = this.algorithm.getPrimitiveJavaObject(deferredObjects[2].get());

        Sm4Utils sm4Utils = Sm4Utils.getInstance(algorithm);
        try {
            return sm4Utils.cbcDecrypt(ByteUtils.toHexString(getKey()), column);
        } catch (IllegalBlockSizeException | BadPaddingException | InvalidAlgorithmParameterException | InvalidKeyException e) {
            throw new HiveException("There is something wrong, see ", e);
        }
    }

    private byte[] getKey() {
        return new byte[]{
                (byte)0xfe, (byte)0xff, (byte)0xe9, (byte)0x92, (byte)0x86, (byte)0x65, (byte)0x73, (byte)0x1c,
                (byte)0x6d, (byte)0x6a, (byte)0x8f, (byte)0x94, (byte)0x67, (byte)0x30, (byte)0x83, (byte)0x08};
    }

    @Override
    public String getDisplayString(String[] strings) {
        return column + "-" + version + "-" + algorithm;
    }
}
