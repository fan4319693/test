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
 * <p>LocationDetailVehicleInfoType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailVehicleInfoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="GeneralInformation"/>
 *     &lt;enumeration value="Disclaimer"/>
 *     &lt;enumeration value="AdvancedBooking"/>
 *     &lt;enumeration value="NonSmokingVehicles"/>
 *     &lt;enumeration value="SpecialityVehicles"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailVehicleInfoType")
@XmlEnum
public enum LocationDetailVehicleInfoType {


    /**
     * Indicates that the associated information describes general information about the vehicles that are typically offered for rental.
     * 
     */
    @XmlEnumValue("GeneralInformation")
    GENERAL_INFORMATION("GeneralInformation"),

    /**
     * Indicates that the associated information provides the disclaimers about the vehicles that are typically offered for rental.  This may be typically that not all vehicles may be available at any one time, for example.
     * 
     */
    @XmlEnumValue("Disclaimer")
    DISCLAIMER("Disclaimer"),

    /**
     * Indicates that the associated information describes any advance booking requiremennts about one or more vehicle types.  Some unusual vehicles may not be available at short notice.
     * 
     */
    @XmlEnumValue("AdvancedBooking")
    ADVANCED_BOOKING("AdvancedBooking"),

    /**
     * Indicates that the associated information describes general information about non-smoking vehicles that may be offered for rental.
     * 
     */
    @XmlEnumValue("NonSmokingVehicles")
    NON_SMOKING_VEHICLES("NonSmokingVehicles"),

    /**
     * Indicates that the associated information describes special, unusual or high-end vehicles that may be offered for rental.
     * 
     */
    @XmlEnumValue("SpecialityVehicles")
    SPECIALITY_VEHICLES("SpecialityVehicles");
    private final String value;

    LocationDetailVehicleInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailVehicleInfoType fromValue(String v) {
        for (LocationDetailVehicleInfoType c: LocationDetailVehicleInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
