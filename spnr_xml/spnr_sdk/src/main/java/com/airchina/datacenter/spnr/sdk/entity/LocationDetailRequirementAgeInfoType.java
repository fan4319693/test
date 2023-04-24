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
 * <p>LocationDetailRequirementAgeInfoType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailRequirementAgeInfoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="MinimumAge"/>
 *     &lt;enumeration value="MinimumAgeExceptions"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailRequirementAgeInfoType")
@XmlEnum
public enum LocationDetailRequirementAgeInfoType {


    /**
     * Indicates that the associated information describes requirements and restrictions concerning the minimum age permitted for the rental of a vehicle.
     * 
     */
    @XmlEnumValue("MinimumAge")
    MINIMUM_AGE("MinimumAge"),

    /**
     * Indicates that the associated information describes the exceptions to the requirements and restrictions concerning the minimum age permitted for the rental of a vehicle.
     * 
     */
    @XmlEnumValue("MinimumAgeExceptions")
    MINIMUM_AGE_EXCEPTIONS("MinimumAgeExceptions"),

    /**
     * Indicates that the associated information describes miscellaneous requirements and restrictions with regard to the age of the renter of a vehicle.
     * 
     */
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous");
    private final String value;

    LocationDetailRequirementAgeInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailRequirementAgeInfoType fromValue(String v) {
        for (LocationDetailRequirementAgeInfoType c: LocationDetailRequirementAgeInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
