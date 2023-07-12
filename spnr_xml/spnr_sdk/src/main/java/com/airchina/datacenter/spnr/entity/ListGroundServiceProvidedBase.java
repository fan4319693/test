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
 * <p>List_GroundServiceProvided_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_GroundServiceProvided_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirportTransfer"/>
 *     &lt;enumeration value="SharedTransportation"/>
 *     &lt;enumeration value="Hourly"/>
 *     &lt;enumeration value="Mileage"/>
 *     &lt;enumeration value="SimpleTransfer"/>
 *     &lt;enumeration value="Shuttle"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_GroundServiceProvided_Base")
@XmlEnum
public enum ListGroundServiceProvidedBase {

    @XmlEnumValue("AirportTransfer")
    AIRPORT_TRANSFER("AirportTransfer"),
    @XmlEnumValue("SharedTransportation")
    SHARED_TRANSPORTATION("SharedTransportation"),
    @XmlEnumValue("Hourly")
    HOURLY("Hourly"),
    @XmlEnumValue("Mileage")
    MILEAGE("Mileage"),
    @XmlEnumValue("SimpleTransfer")
    SIMPLE_TRANSFER("SimpleTransfer"),
    @XmlEnumValue("Shuttle")
    SHUTTLE("Shuttle"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListGroundServiceProvidedBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListGroundServiceProvidedBase fromValue(String v) {
        for (ListGroundServiceProvidedBase c: ListGroundServiceProvidedBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
