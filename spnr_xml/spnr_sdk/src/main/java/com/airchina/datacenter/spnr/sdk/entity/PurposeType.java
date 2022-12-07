//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PurposeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PurposeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sell"/>
 *     &lt;enumeration value="Net"/>
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="Additional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurposeType")
@XmlEnum
public enum PurposeType {

    @XmlEnumValue("Sell")
    SELL("Sell"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Additional")
    ADDITIONAL("Additional");
    private final String value;

    PurposeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurposeType fromValue(String v) {
        for (PurposeType c: PurposeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
