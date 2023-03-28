package com.airchina.datacenter.spnr.sm4.util;

import java.nio.charset.StandardCharsets;
import java.security.*;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;

/**
 * SM4 对称、分组加密：置换替换
 */
public class Sm4Utils {
    private Sm4Utils() {};
    static {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
    }

    private static final String IV = "99aa3e68ed8173a0eed06684eed06684";
    // 填充模式
    private static final String PADMODE = "PKCS5Padding";
    private static final String SM4 = "SM4";
    private static final String CBC = "CBC";
    private static final String ECB = "ECB";

    /**
     * SM4 Cbc模式 加密
     * @param key 密钥
     * @param data 明文
     * @return 密文
     */
    public static String cbcEncrypt(String key, String data, String algorithm_mode) throws IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, DecoderException, NoSuchProviderException {
        byte[] keyData = key.getBytes(StandardCharsets.UTF_8);
        byte[] srcData = data.getBytes(StandardCharsets.UTF_8);
        byte[] encryptMode = encryptMode(keyData, srcData, algorithm_mode);
        return Base64.toBase64String(encryptMode);
    }

    /**
     * SM4 Cbc模式 解密
     * @param key 密钥
     * @param data 密文
     * @return 明文
     */
    public static String cbcDecrypt(String key, String data, String algorithm_mode) throws IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, DecoderException, NoSuchProviderException {
        byte[] keyData = key.getBytes(StandardCharsets.UTF_8);
        byte[] srcData = Base64.decode(data);
        byte[] decryptMode = decryptMode(keyData, srcData, algorithm_mode);
        return new String(decryptMode, StandardCharsets.UTF_8);
    }

    /**
     * SM4 Ecb模式 加密
     * @param key 密钥 ByteUtils.fromHexString(key); key.getBytes(StandardCharsets.UTF_8);
     * @param data 明文
     * @return 密文
     */
    public static String ecbEncrypt(String key, String data, String algorithm_mode) throws IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, DecoderException, NoSuchProviderException {
        byte[] keyData = key.getBytes(StandardCharsets.UTF_8);
        byte[] srcData = data.getBytes(StandardCharsets.UTF_8);
        byte[] encryptMode = encryptMode(keyData, srcData, algorithm_mode);
        return Base64.toBase64String(encryptMode);
    }

    /**
     * SM4 Ecb模式 解密
     * @param key 密钥 key.getBytes(StandardCharsets.UTF_8); ByteUtils.fromHexString(key);
     * @param data 密文
     * @return 明文
     */
    public static String ecbDecrypt(String key, String data, String algorithm_mode) throws IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, DecoderException, NoSuchProviderException {
        if (!ECB.equals(algorithm_mode)) {
            throw new NoSuchAlgorithmException("The algorithm only accepts ECB, but receives " + algorithm_mode);
        }
        byte[] keyData = key.getBytes(StandardCharsets.UTF_8);
        if (keyData.length != 16) {
            throw new InvalidKeyException("SM4's key should be 16bytes, 128bits, receive " + key);
        }
        byte[] srcData;
        try {
            srcData = Base64.decode(data);
        } catch (org.bouncycastle.util.encoders.DecoderException e) {
            throw new DecoderException("The column can`t be decode to Base64, please check it " + data);
        }
        byte[] decryptMode = decryptMode(keyData, srcData, algorithm_mode);
        return new String(decryptMode, StandardCharsets.UTF_8);
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
    private static Cipher initCipher(int mode, byte[] key, String algorithm_mode) throws InvalidAlgorithmParameterException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, DecoderException, NoSuchProviderException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, SM4);
        String param = SM4 + "/" + algorithm_mode + "/" + PADMODE;
        Cipher cipher = Cipher.getInstance(param, BouncyCastleProvider.PROVIDER_NAME);
        if (ECB.equals(algorithm_mode)) {
            cipher.init(mode, secretKeySpec);
        }else {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(Hex.decodeHex(IV.toCharArray()));
            cipher.init(mode, secretKeySpec, ivParameterSpec);
        }
        return cipher;
    }

    /**
     * 加密
     * @param key
     * @param data
     */
    private static byte[] encryptMode(byte[] key, byte[] data, String algorithm_mode) throws InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, NoSuchPaddingException, DecoderException, NoSuchProviderException {
        Cipher cipher = initCipher(Cipher.ENCRYPT_MODE, key, algorithm_mode);
        return cipher.doFinal(data);
    }

    /**
     * 解密
     * @param key
     * @param data
     */
    private static byte[] decryptMode(byte[] key, byte[] data, String algorithm_mode) throws InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, NoSuchPaddingException, DecoderException, NoSuchProviderException {
        Cipher cipher = initCipher(Cipher.DECRYPT_MODE, key, algorithm_mode);
        return cipher.doFinal(data);
    }
}