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
 * <p>PaymentOptionStageType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentOptionStageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Search"/>
 *     &lt;enumeration value="Selection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentOptionStageType")
@XmlEnum
public enum PaymentOptionStageType {


    /**
     * Payment options for type Search.
     * 
     */
    @XmlEnumValue("Search")
    SEARCH("Search"),

    /**
     * Payment options for type Selection.
     * 
     */
    @XmlEnumValue("Selection")
    SELECTION("Selection");
    private final String value;

    PaymentOptionStageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentOptionStageType fromValue(String v) {
        for (PaymentOptionStageType c: PaymentOptionStageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
