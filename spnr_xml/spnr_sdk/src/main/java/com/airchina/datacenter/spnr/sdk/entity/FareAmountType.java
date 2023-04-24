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
 * <p>FareAmountType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FareAmountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOADC"/>
 *     &lt;enumeration value="Bulk"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="Additional_Collection"/>
 *     &lt;enumeration value="Charter_Fare"/>
 *     &lt;enumeration value="No_Fare"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareAmountType")
@XmlEnum
public enum FareAmountType {

    NOADC("NOADC"),
    @XmlEnumValue("Bulk")
    BULK("Bulk"),
    IT("IT"),

    /**
     * This amount represents an additional collection.
     * 
     */
    @XmlEnumValue("Additional_Collection")
    ADDITIONAL_COLLECTION("Additional_Collection"),

    /**
     * This amount represents a fare for a charter flight.
     * 
     */
    @XmlEnumValue("Charter_Fare")
    CHARTER_FARE("Charter_Fare"),

    /**
     * No fare applies.
     * 
     */
    @XmlEnumValue("No_Fare")
    NO_FARE("No_Fare");
    private final String value;

    FareAmountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareAmountType fromValue(String v) {
        for (FareAmountType c: FareAmountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
