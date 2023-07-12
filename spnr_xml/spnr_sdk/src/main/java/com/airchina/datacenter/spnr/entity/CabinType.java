//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CabinType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CabinType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Economy"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CabinType")
@XmlEnum
public enum CabinType {


    /**
     * First class compartment. 
     * 
     */
    @XmlEnumValue("First")
    FIRST("First"),

    /**
     * Business class compartment. 
     * 
     */
    @XmlEnumValue("Business")
    BUSINESS("Business"),

    /**
     * Economy (or sometimes referred to as Coach) class compartment.
     * 
     */
    @XmlEnumValue("Economy")
    ECONOMY("Economy"),

    /**
     * First class compartment. 
     * 
     */
    F("F"),

    /**
     * Business class compartment. 
     * 
     */
    J("J"),

    /**
     * Business.
     * 
     */
    C("C"),

    /**
     * Economy (or sometimes referred to as Coach) class compartment.
     * 
     */
    Y("Y");
    private final String value;

    CabinType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CabinType fromValue(String v) {
        for (CabinType c: CabinType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
