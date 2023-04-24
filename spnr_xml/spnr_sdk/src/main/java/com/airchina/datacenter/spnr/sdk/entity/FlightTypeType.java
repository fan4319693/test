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
 * <p>FlightTypeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FlightTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Nonstop"/>
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="Connection"/>
 *     &lt;enumeration value="SingleConnection"/>
 *     &lt;enumeration value="DoubleConnection"/>
 *     &lt;enumeration value="CustomConnection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightTypeType")
@XmlEnum
public enum FlightTypeType {


    /**
     * Indicates the flight does not make any scheduled stops between 2 points.
     * 
     */
    @XmlEnumValue("Nonstop")
    NONSTOP("Nonstop"),

    /**
     * Indicates the flight makes a scheduled stop(s) between 2 points.
     * 
     */
    @XmlEnumValue("Direct")
    DIRECT("Direct"),

    /**
     * Indicates the flight will require a change of aircraft at a connecting point(s).
     * 
     */
    @XmlEnumValue("Connection")
    CONNECTION("Connection"),

    /**
     * A trip with only one connection.
     * 
     */
    @XmlEnumValue("SingleConnection")
    SINGLE_CONNECTION("SingleConnection"),

    /**
     * A trip with only two connections.
     * 
     */
    @XmlEnumValue("DoubleConnection")
    DOUBLE_CONNECTION("DoubleConnection"),

    /**
     * Similar to Connection, a Custom Connection configured by Airline within xDistributor.
     * 
     */
    @XmlEnumValue("CustomConnection")
    CUSTOM_CONNECTION("CustomConnection");
    private final String value;

    FlightTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightTypeType fromValue(String v) {
        for (FlightTypeType c: FlightTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
