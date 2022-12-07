//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProtectedFormatType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectedFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENCRYPTED"/>
 *     &lt;enumeration value="MASKED"/>
 *     &lt;enumeration value="PKI"/>
 *     &lt;enumeration value="TOKENIZED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProtectedFormatType")
@XmlEnum
public enum ProtectedFormatType {

    ENCRYPTED,
    MASKED,
    PKI,
    TOKENIZED;

    public String value() {
        return name();
    }

    public static ProtectedFormatType fromValue(String v) {
        return valueOf(v);
    }

}
