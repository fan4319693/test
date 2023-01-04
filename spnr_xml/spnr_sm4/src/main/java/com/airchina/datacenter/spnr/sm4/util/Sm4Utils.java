package com.airchina.datacenter.spnr.sm4.util;

import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Security;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;

/**
 * SM4 对称、分组加密：置换替换
 */
@Slf4j
public class Sm4Utils {
    private static Sm4Utils sm4Utils;

    private final static byte[] IV = new byte[]{
            (byte)0x99, (byte)0xaa, (byte)0x3e, (byte)0x68, (byte)0xed, (byte)0x81, (byte)0x73, (byte)0xa0,
            (byte)0xee, (byte)0xd0, (byte)0x66, (byte)0x84, (byte)0xee, (byte)0xd0, (byte)0x66, (byte)0x84
    };
    // 填充模式
    public static final String PADMODE = "PKCS5Padding";
    public static final String SM4 = "SM4";
    public static final String CBC = "CBC";
    public static final String ECB = "ECB";
    private Cipher cipher;

    private Sm4Utils (String algorithm_mode){
        try {
            Security.addProvider(new BouncyCastleProvider());
            String param = SM4 + "/" + algorithm_mode + "/" + PADMODE;
            this.cipher = Cipher.getInstance(param);
        } catch (Exception e) {
            log.error("Fail: Cipher.getInstance {}", e);
        }
    }

    public static Sm4Utils getInstance( String algorithm_mode) {
        if (sm4Utils == null) {
            sm4Utils = new Sm4Utils(algorithm_mode);
        }
        return sm4Utils;
    }

    /**
     * SM4 Cbc模式 加密
     * @param key 密钥
     * @param data 明文
     * @return 密文
     */
    public String cbcEncrypt(String key, String data) throws IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeyException {
        byte[] keyData = ByteUtils.fromHexString(key);
        byte[] srcData = data.getBytes(StandardCharsets.UTF_8);
        byte[] encryptMode = encryptMode(keyData, srcData);
        return ByteUtils.toHexString(encryptMode);
    }

    /**
     * SM4 Cbc模式 解密
     * @param key 密钥
     * @param data 密文
     * @return 明文
     */
    public String cbcDecrypt(String key, String data) throws IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeyException {
        byte[] keyData = ByteUtils.fromHexString(key);
        byte[] srcData = ByteUtils.fromHexString(data);
        byte[] decryptMode = decryptMode(keyData, srcData);
        return new String(decryptMode, StandardCharsets.UTF_8);
    }

    /**
     * SM4 Ecb模式 加密
     * @param key 密钥
     * @param data 明文
     * @return 密文
     */
    public String ecbEncrypt(String key, String data) throws IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeyException {
        byte[] keyData = ByteUtils.fromHexString(key);
        byte[] srcData = data.getBytes(StandardCharsets.UTF_8);
        byte[] encryptMode = encryptMode(keyData, srcData);
        return ByteUtils.toHexString(encryptMode);
    }

    /**
     * SM4 Ecb模式 解密
     * @param key 密钥
     * @param data 密文
     * @return 明文
     */
    public String ecbDecrypt(String key, String data) throws IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeyException {
        byte[] keyData = ByteUtils.fromHexString(key);
        byte[] srcData = ByteUtils.fromHexString(data);
        byte[] decryptMode = decryptMode(keyData, srcData);
        return new String(decryptMode, StandardCharsets.UTF_8);
    }

    /**
     * 初始化向量
     * @param len 长度
     * @return
     */
    private IvParameterSpec getIv(int len) {
        //使用 IV 的例子是反馈模式中的密码，如，CBC 模式中的 DES 和使用 OAEP 编码操作的 RSA 密码
        byte[] zero = new byte[len];
        return new IvParameterSpec(zero);
    }

    /**
     * 补足长度
     * @param src
     * @param len
     * @return
     */
    private byte[] padding(byte[] src, int len) {
        int paddingLength = len - src.length % len;
        if (len == paddingLength) {
            return src;
        }
        byte[] newsrc = new byte[src.length + paddingLength];
        System.arraycopy(src, 0, newsrc, 0, src.length);
        return newsrc;
    }

    /**
     * 初始化Cipher
     * 生成国密Key：SM4，密钥为 128bit， 16byte
    * */
    private void initCipher(int mode, byte[] key) throws InvalidAlgorithmParameterException, InvalidKeyException {
        if (key.length != 16) {
            log.error("SM4's key should be 16bytes, 128bits.");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, SM4);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(IV);
        cipher.init(mode, secretKeySpec, ivParameterSpec);
    }

    /**
     * 加密
     * @param key
     * @param data
     */
    private byte[] encryptMode(byte[] key, byte[] data) throws InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        initCipher(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(data);
    }

    /**
     * 解密
     * @param key
     * @param data
     */
    private byte[] decryptMode(byte[] key, byte[] data) throws InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        initCipher(Cipher.DECRYPT_MODE, key);
        return cipher.doFinal(data);
    }
}