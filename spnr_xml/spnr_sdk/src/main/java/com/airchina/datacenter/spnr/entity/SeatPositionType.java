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
 * <p>SeatPositionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SeatPositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Together"/>
 *     &lt;enumeration value="Aisle"/>
 *     &lt;enumeration value="Center"/>
 *     &lt;enumeration value="Window"/>
 *     &lt;enumeration value="Specific"/>
 *     &lt;enumeration value="Exit"/>
 *     &lt;enumeration value="Table"/>
 *     &lt;enumeration value="AdjacentAisle"/>
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="Middle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeatPositionType")
@XmlEnum
public enum SeatPositionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Together")
    TOGETHER("Together"),
    @XmlEnumValue("Aisle")
    AISLE("Aisle"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("Window")
    WINDOW("Window"),
    @XmlEnumValue("Specific")
    SPECIFIC("Specific"),
    @XmlEnumValue("Exit")
    EXIT("Exit"),
    @XmlEnumValue("Table")
    TABLE("Table"),
    @XmlEnumValue("AdjacentAisle")
    ADJACENT_AISLE("AdjacentAisle"),
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle");
    private final String value;

    SeatPositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeatPositionType fromValue(String v) {
        for (SeatPositionType c: SeatPositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
