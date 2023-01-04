package com.airchina.datacenter.spnr.sm4.util;

import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

@Slf4j
public class SM4Case {
    public static void main(String[] args) throws InvalidKeyException, BadPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException {
        byte[] keys = new byte[]{
                (byte)0xfe, (byte)0xff, (byte)0xe9, (byte)0x92, (byte)0x86, (byte)0x65, (byte)0x73, (byte)0x1c,
                (byte)0x6d, (byte)0x6a, (byte)0x8f, (byte)0x94, (byte)0x67, (byte)0x30, (byte)0x83, (byte)0x08
        };
        byte[] input = new byte[]{
                (byte)0xd9, (byte)0x31, (byte)0x32, (byte)0x25, (byte)0xf8, (byte)0x84, (byte)0x06, (byte)0xe5,
                (byte)0xa5, (byte)0x59, (byte)0x09, (byte)0xc5, (byte)0xaf, (byte)0xf5, (byte)0x26, (byte)0x9a
        };
        byte[] iv = new byte[]{
                (byte)0x99, (byte)0xaa, (byte)0x3e, (byte)0x68, (byte)0xed, (byte)0x81, (byte)0x73, (byte)0xa0,
                (byte)0xee, (byte)0xd0, (byte)0x66, (byte)0x84, (byte)0xee, (byte)0xd0, (byte)0x66, (byte)0x84
        };
        byte[] aad = new byte[]{
                (byte)0x4d, (byte)0x23, (byte)0xc3, (byte)0xce, (byte)0xc3, (byte)0x34, (byte)0xb4, (byte)0x9b,
                (byte)0xdb, (byte)0x37, (byte)0x0c, (byte)0x43, (byte)0x7f, (byte)0xec, (byte)0x78, (byte)0xde
        };
        byte[] cipher;
        byte[] plain;

        System.out.println("Test Parameter");
//        System.out.println(keys.length + " bytes key:" + DatatypeConverter.printHexBinary(keys));
//        System.out.println(iv.length + " bytes iv:" + DatatypeConverter.printHexBinary(iv));
//        System.out.println(aad.length + " bytes aad:" + DatatypeConverter.printHexBinary(aad));
//        System.out.println(input.length + " bytes input:" + DatatypeConverter.printHexBinary(input));
//        System.out.println("=================================================================\n");

        Sm4Utils sm4Utils = Sm4Utils.getInstance(Sm4Utils.CBC);
        String column = "zl6pUqocNU7PixYT2NeC5AME4gvTzL4NEPZzasozLAY=";
        String hexKey = "ZW5jS2V5QDIwMjI=";
        String decrypt = sm4Utils.cbcDecrypt(hexKey, column);
        log.info("decrypt {}", decrypt);


    }
}
