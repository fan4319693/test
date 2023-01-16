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
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;
import org.bouncycastle.util.encoders.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.*;

@Slf4j
public class TestCase {
    public static void main(String[] args) throws HiveException, InvalidKeyException, BadPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, DecoderException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException {

        Sm4Decrypt sm4Decrypt = new Sm4Decrypt();
        ObjectInspector inspector0 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        ObjectInspector inspector1 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        ObjectInspector inspector2 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        ObjectInspector inspector3 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        JavaStringObjectInspector initialize = (JavaStringObjectInspector) sm4Decrypt.initialize(new ObjectInspector[]{
                inspector0, inspector1, inspector2, inspector3});

        /* MH55FE 8miGQF/6XGq0Yj1JEllyrA==
         */
        GenericUDF.DeferredJavaObject column = new GenericUDF.DeferredJavaObject("8miGQF/6XGq0Yj1JEllyrA==");
        GenericUDF.DeferredJavaObject keyByKey = new GenericUDF.DeferredJavaObject("ZW5jS2V5QDIwMjI=");
        GenericUDF.DeferredJavaObject key = new GenericUDF.DeferredJavaObject("zl6pUqocNU7PixYT2NeC5AME4gvTzL4NEPZzasozLAY=");
        GenericUDF.DeferredJavaObject algorithm = new GenericUDF.DeferredJavaObject("ECB");
        Object evaluate = sm4Decrypt.evaluate(new GenericUDF.DeferredObject[]{column, keyByKey, key, algorithm});
        System.out.println(evaluate);

//        byte[] keyData = "xxx".getBytes(StandardCharsets.UTF_8);
//        byte[] srcData = Base64.decode("8miGQF/6XGq0Yj1JEllyrA==");
//        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
//        Cipher cipher = Cipher.getInstance("SM4/ECB/PKCS5Padding/", BouncyCastleProvider.PROVIDER_NAME);
//        SecretKeySpec secretKeySpec = new SecretKeySpec(keyData, "SM4");
//        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
//        byte[] doFinal = cipher.doFinal(srcData);
//        String value = new String(doFinal, StandardCharsets.UTF_8);
//        log.info("value {}", value);
    }
}
