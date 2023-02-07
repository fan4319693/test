package com.airchina.datacenter.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AesUtils {

    private static final String ENCODING = "UTF-8";

    private static final String ALGORITHM = "AES";

    private static final int AES128_KEY_LENGTH = 16;

    private static final int AES256_KEY_LENGTH = 32;

    private static Logger log = LoggerFactory.getLogger(AesUtils.class);



    /**
     * 加密
     *
     * @param plainText
     * @param sKey
     * @return java.lang.String
     */
    public static String encrypt(String plainText, String sKey, String sIv) {
        if (StringUtils.isBlank(sKey)) {
            log.warn("sKey is blank");
            return null;
        }
        // 判断Key是否为32位
        if (sKey.length() != AES128_KEY_LENGTH && sKey.length() != AES256_KEY_LENGTH) {
            log.warn("sKey's length is illegal");
            return null;
        }

        if (StringUtils.isBlank(sIv)) {
            return encrypt(plainText, sKey);
        }

        try {
            byte[] raw = sKey.getBytes(ENCODING);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, ALGORITHM);
            IvParameterSpec ivSpec = new IvParameterSpec(sIv.getBytes(ENCODING));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivSpec);
            byte[] encrypted = cipher.doFinal(plainText.getBytes(ENCODING));
            return toHexString(encrypted);
        } catch (Exception e) {
            log.error("plainText:{} encrypt by key: {} error", plainText, sKey, e);
            return null;
        }
    }

    /**
     * 解密
     *
     * @param cipherText
     * @param sKey
     * @return java.lang.String
     */
    public static String decrypt(String cipherText, String sKey, String sIv) {
        if (StringUtils.isBlank(sKey)) {
            log.warn("sKey is blank");
            return null;
        }
        // 判断Key是否为16/32位
        if (sKey.length() != AES128_KEY_LENGTH && sKey.length() != AES256_KEY_LENGTH) {
            log.warn("sKey's length is illegal");
            return null;
        }

        if (StringUtils.isBlank(sIv)) {
            // 兼容旧数据
            return decrypt(cipherText, sKey);
        }

        try {
            byte[] raw = sKey.getBytes(ENCODING);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, ALGORITHM);
            IvParameterSpec ivSpec = new IvParameterSpec(sIv.getBytes(ENCODING));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivSpec);
            byte[] encrypted1 = convertHexString(cipherText);
            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original, ENCODING);
            return originalString;
        } catch (Exception e) {
            log.error("cipherText:{} decrypt by key: {} error", cipherText, sKey, e);
            return null;
        }
    }

    /**
     * 加密
     *
     * @param plainText
     * @param sKey
     * @return java.lang.String
     */
    public static String encrypt(String plainText, String sKey) {
        if (StringUtils.isBlank(sKey)) {
            log.warn("sKey is blank");
            return null;
        }
        // 判断Key是否为16位
        if (sKey.length() != AES128_KEY_LENGTH) {
            log.warn("sKey's length is not equal 16");
            return null;
        }
        try {
            byte[] raw = sKey.getBytes(ENCODING);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            byte[] encrypted = cipher.doFinal(plainText.getBytes(ENCODING));
            return toHexString(encrypted);
        } catch (Exception e) {
            log.error("plainText:{} encrypt by key: {} error", plainText, sKey, e);
            return null;
        }
    }

    /**
     * 解密
     *
     * @param cipherText
     * @param sKey
     * @return String
     */
    public static String decrypt(String cipherText, String sKey) {
        try {
            if (StringUtils.isBlank(sKey)) {
                log.warn("sKey is blank");
                return null;
            }
            // 判断Key是否为16位
            if (sKey.length() != AES128_KEY_LENGTH) {
                log.warn("sKey's length is not equal 16");
                return null;
            }
            byte[] raw = sKey.getBytes(ENCODING);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            byte[] encrypted1 = convertHexString(cipherText);
            try {
                byte[] original = cipher.doFinal(encrypted1);
                String originalString = new String(original, ENCODING);
                return originalString;
            } catch (Exception e) {
                log.error("cipherText:{} decrypt by key: {} error", cipherText, sKey, e);
                return null;
            }
        } catch (Exception ex) {
            log.error("cipherText:{} decrypt by key: {} error", cipherText, sKey, ex);
            return null;
        }
    }

    /**
     * 转字符串
     *
     * @param bytes
     * @return
     */
    private static String toHexString(byte[] bytes) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0, len = bytes.length; i < len; i++) {
            String plainText = Integer.toHexString(0xff & bytes[i]);
            if (plainText.length() < 2) {
                plainText = "0" + plainText;
            }
            hexString.append(plainText);
        }
        return hexString.toString();
    }

    /**
     * 字符串转byte数组
     *
     * @param text
     * @return
     */
    private static byte[] convertHexString(String text) {
        byte digest[] = new byte[text.length() / 2];
        for (int i = 0; i < digest.length; i++) {
            String byteString = text.substring(2 * i, 2 * i + 2);
            int byteValue = Integer.parseInt(byteString, 16);
            digest[i] = (byte) byteValue;
        }
        return digest;
    }

}
