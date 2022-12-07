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
 * <p>TravelerGenderType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TravelerGenderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="1"/>
 *     &lt;maxLength value="2"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelerGenderType")
@XmlEnum
public enum TravelerGenderType {


    /**
     * F = FEMALE
     * 
     */
    F,

    /**
     * M = MALE
     * 
     */
    M,

    /**
     * MI = MALE INFANT
     * 
     */
    MI,

    /**
     * FI = FEMALE INFANT
     * 
     */
    FI,

    /**
     * U = UNDISCLOSED/ UNKNOWN GENDER
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static TravelerGenderType fromValue(String v) {
        return valueOf(v);
    }

}
