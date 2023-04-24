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
 * <p>RatePeriodSimpleType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RatePeriodSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Hourly"/>
 *     &lt;enumeration value="Daily"/>
 *     &lt;enumeration value="Weekly"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="WeekendDay"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Package"/>
 *     &lt;enumeration value="Bundle"/>
 *     &lt;enumeration value="Total"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RatePeriodSimpleType")
@XmlEnum
public enum RatePeriodSimpleType {

    @XmlEnumValue("Hourly")
    HOURLY("Hourly"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("WeekendDay")
    WEEKEND_DAY("WeekendDay"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The rate period is based on the package.
     * 
     */
    @XmlEnumValue("Package")
    PACKAGE("Package"),

    /**
     * The rate is the same regardless of the number of days the vehicle is rented
     * 
     */
    @XmlEnumValue("Bundle")
    BUNDLE("Bundle"),

    /**
     * The rate is the total, no specific rate period.
     * 
     */
    @XmlEnumValue("Total")
    TOTAL("Total");
    private final String value;

    RatePeriodSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RatePeriodSimpleType fromValue(String v) {
        for (RatePeriodSimpleType c: RatePeriodSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
