//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FareApplicationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FareApplicationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OneWay"/>
 *     &lt;enumeration value="Return"/>
 *     &lt;enumeration value="HalfReturn"/>
 *     &lt;enumeration value="Roundtrip"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareApplicationType")
@XmlEnum
public enum FareApplicationType {

    @XmlEnumValue("OneWay")
    ONE_WAY("OneWay"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("HalfReturn")
    HALF_RETURN("HalfReturn"),

    /**
     * Specifies that the fare is for a roundtrip.
     * 
     */
    @XmlEnumValue("Roundtrip")
    ROUNDTRIP("Roundtrip");
    private final String value;

    FareApplicationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareApplicationType fromValue(String v) {
        for (FareApplicationType c: FareApplicationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
