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
 * <p>StayUnitType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="StayUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Minutes"/>
 *     &lt;enumeration value="Hours"/>
 *     &lt;enumeration value="Days"/>
 *     &lt;enumeration value="Months"/>
 *     &lt;enumeration value="MON"/>
 *     &lt;enumeration value="TUES"/>
 *     &lt;enumeration value="WED"/>
 *     &lt;enumeration value="THU"/>
 *     &lt;enumeration value="FRI"/>
 *     &lt;enumeration value="SAT"/>
 *     &lt;enumeration value="SUN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StayUnitType")
@XmlEnum
public enum StayUnitType {


    /**
     *  Stay restriction in minutes.
     * 
     */
    @XmlEnumValue("Minutes")
    MINUTES("Minutes"),

    /**
     *  Stay restriction in hours.
     * 
     */
    @XmlEnumValue("Hours")
    HOURS("Hours"),

    /**
     *  Stay restriction in days.
     * 
     */
    @XmlEnumValue("Days")
    DAYS("Days"),

    /**
     *  Stay restriction in months.
     * 
     */
    @XmlEnumValue("Months")
    MONTHS("Months"),

    /**
     * Monday
     * 
     */
    MON("MON"),

    /**
     * Tuesday
     * 
     */
    TUES("TUES"),

    /**
     * Wednesday
     * 
     */
    WED("WED"),

    /**
     * Thursday
     * 
     */
    THU("THU"),

    /**
     * Friday
     * 
     */
    FRI("FRI"),

    /**
     * Saturday
     * 
     */
    SAT("SAT"),

    /**
     * Sunday
     * 
     */
    SUN("SUN");
    private final String value;

    StayUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StayUnitType fromValue(String v) {
        for (StayUnitType c: StayUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
