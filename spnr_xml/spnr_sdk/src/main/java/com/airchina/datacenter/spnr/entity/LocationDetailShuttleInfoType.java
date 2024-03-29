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
 * <p>LocationDetailShuttleInfoType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailShuttleInfoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Transportation"/>
 *     &lt;enumeration value="Frequency"/>
 *     &lt;enumeration value="PickupInfo"/>
 *     &lt;enumeration value="Distance"/>
 *     &lt;enumeration value="ElapsedTime"/>
 *     &lt;enumeration value="Fee"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *     &lt;enumeration value="Hours"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailShuttleInfoType")
@XmlEnum
public enum LocationDetailShuttleInfoType {


    /**
     * Indicates that the associated information describes the shuttle, such as shared bus, tram, company-specific bus.
     * 
     */
    @XmlEnumValue("Transportation")
    TRANSPORTATION("Transportation"),

    /**
     * Indicates that the associated information describes the frequency with which the shuttle service operates.
     * 
     */
    @XmlEnumValue("Frequency")
    FREQUENCY("Frequency"),

    /**
     * Indicates that the associated information describes where the shuttle service picks up those who are renting vehicles, how to get to the shuttle pick up location, etc/
     * 
     */
    @XmlEnumValue("PickupInfo")
    PICKUP_INFO("PickupInfo"),

    /**
     * Indicates that the associated information describes the distance that the shuttle will travel, from point of pickup to arrival at the rental facility.
     * 
     */
    @XmlEnumValue("Distance")
    DISTANCE("Distance"),

    /**
     * Indicates that the associated information describes the approximate elapsed time from point of pickup to arrival at the rental facility.
     * 
     */
    @XmlEnumValue("ElapsedTime")
    ELAPSED_TIME("ElapsedTime"),

    /**
     * Indicates that the associated information describes any shuttle fees that may apply.
     * 
     */
    @XmlEnumValue("Fee")
    FEE("Fee"),

    /**
     * Indicates that the associated information describes miscellaneous information about the shuttle service.
     * 
     */
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous"),

    /**
     * Indicates the information pertains to the shuttle hours of operation.
     * 
     */
    @XmlEnumValue("Hours")
    HOURS("Hours");
    private final String value;

    LocationDetailShuttleInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailShuttleInfoType fromValue(String v) {
        for (LocationDetailShuttleInfoType c: LocationDetailShuttleInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
