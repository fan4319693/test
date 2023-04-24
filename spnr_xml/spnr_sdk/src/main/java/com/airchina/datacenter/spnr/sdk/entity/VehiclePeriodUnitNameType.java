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
 * <p>VehiclePeriodUnitNameType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="VehiclePeriodUnitNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="RentalPeriod"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="Weekend"/>
 *     &lt;enumeration value="Bundle"/>
 *     &lt;enumeration value="Package"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehiclePeriodUnitNameType")
@XmlEnum
public enum VehiclePeriodUnitNameType {

    @XmlEnumValue("RentalPeriod")
    RENTAL_PERIOD("RentalPeriod"),
    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Hour")
    HOUR("Hour"),

    /**
     * The calculation is for each weekend.
     * 
     */
    @XmlEnumValue("Weekend")
    WEEKEND("Weekend"),

    /**
     * The rate is the same regardless of the number of days the vehicle is rented.
     * 
     */
    @XmlEnumValue("Bundle")
    BUNDLE("Bundle"),

    /**
     * The charge is based on the package.
     * 
     */
    @XmlEnumValue("Package")
    PACKAGE("Package");
    private final String value;

    VehiclePeriodUnitNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehiclePeriodUnitNameType fromValue(String v) {
        for (VehiclePeriodUnitNameType c: VehiclePeriodUnitNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
