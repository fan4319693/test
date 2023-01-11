package com.airchina.datacenter.spnr.sm4;

import com.airchina.datacenter.spnr.sm4.util.Sm4Utils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.DecoderException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.JavaStringObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.logging.log4j.core.util.Assert;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Slf4j
public class TestCase {
    public static void main(String[] args) throws HiveException, InvalidKeyException, BadPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, DecoderException, NoSuchAlgorithmException, NoSuchPaddingException {

        Sm4Decrypt sm4Decrypt = new Sm4Decrypt();
        ObjectInspector inspector0 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        ObjectInspector inspector1 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        ObjectInspector inspector2 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        ObjectInspector inspector3 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        JavaStringObjectInspector initialize = (JavaStringObjectInspector) sm4Decrypt.initialize(new ObjectInspector[]{
                inspector0, inspector1, inspector2, inspector3});

        /* 手机号 dKLZb4J8s2lpR4tQFaacMw==
         * 张三 MpuCFke1ymfcR8HQC9prhg==
         */
        GenericUDF.DeferredJavaObject column = new GenericUDF.DeferredJavaObject("MpuCFke1ymfcR8HQC9prhg==");
        GenericUDF.DeferredJavaObject keyByKey = new GenericUDF.DeferredJavaObject("ZW5jS2V5QDIwMjI=");
        GenericUDF.DeferredJavaObject key = new GenericUDF.DeferredJavaObject("zl6pUqocNU7PixYT2NeC5AME4gvTzL4NEPZzasozLAY=");
        GenericUDF.DeferredJavaObject algorithm = new GenericUDF.DeferredJavaObject("ECB");
        Object evaluate = sm4Decrypt.evaluate(new GenericUDF.DeferredObject[]{column, keyByKey, key, algorithm});
        System.out.println(evaluate);

//        String datas ="y5DZ2r0ZlfL7xw1w5Gc3gjTWrcZSYTX4sBdGUCfWnoM=";
//        byte[] keys = new byte[]{
//                (byte)0xfe, (byte)0xff, (byte)0xe9, (byte)0x92, (byte)0x86, (byte)0x65, (byte)0x73, (byte)0x1c,
//                (byte)0x6d, (byte)0x6a, (byte)0x8f, (byte)0x94, (byte)0x67, (byte)0x30, (byte)0x83, (byte)0x08
//        };
//        String hexKey = ByteUtils.toHexString(keys);
//        log.info("hexKey {}", ByteUtils.fromHexString(hexKey).length);
//        String decrypt = Sm4Utils.ecbHexDecrypt(hexKey, datas, "ECB");
//        log.info("decrypt = {}", decrypt);

//        String column = "张三";
//        String key ="zl6pUqocNU7PixYT2NeC5AME4gvTzL4NEPZzasozLAY=";
//        String keyByKey = "ZW5jS2V5QDIwMjI=";
//        String decryptKey = Sm4Utils.ecbDecrypt(keyByKey, key, "ECB");
//        assert("itineraryKey@sm4".equals(decryptKey));
//        String encryptKey = Sm4Utils.ecbEncrypt(keyByKey, decryptKey, "ECB");
//        assert(key.equals(encryptKey));
//
//        String encrypt = Sm4Utils.ecbEncrypt(decryptKey, column, "ECB");
//        log.info("encrypt = {}", encrypt);
//        String decrypt = Sm4Utils.ecbDecrypt(decryptKey, encrypt, "ECB");
//        log.info("decrypt = {}", decrypt);
    }
}
