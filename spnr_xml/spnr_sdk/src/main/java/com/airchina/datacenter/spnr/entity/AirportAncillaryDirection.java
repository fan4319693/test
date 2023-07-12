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
 * <p>AirportAncillaryDirection的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AirportAncillaryDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Arrive"/>
 *     &lt;enumeration value="Connection"/>
 *     &lt;enumeration value="Depart"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AirportAncillaryDirection")
@XmlEnum
public enum AirportAncillaryDirection {

    @XmlEnumValue("Arrive")
    ARRIVE("Arrive"),
    @XmlEnumValue("Connection")
    CONNECTION("Connection"),
    @XmlEnumValue("Depart")
    DEPART("Depart");
    private final String value;

    AirportAncillaryDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirportAncillaryDirection fromValue(String v) {
        for (AirportAncillaryDirection c: AirportAncillaryDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
