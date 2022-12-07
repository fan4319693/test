//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OnLocationServiceID_Type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OnLocationServiceID_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="ComputerDrivingDirections"/>
 *     &lt;enumeration value="ExpressReturnService"/>
 *     &lt;enumeration value="SpecialNeeds"/>
 *     &lt;enumeration value="FrequentRenter"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OnLocationServiceID_Type")
@XmlEnum
public enum OnLocationServiceIDType {


    /**
     * Indicates that the associated information describes computerized driving directions services, such as availability of maps, turn-by-turn directions, etc.
     * 
     */
    @XmlEnumValue("ComputerDrivingDirections")
    COMPUTER_DRIVING_DIRECTIONS("ComputerDrivingDirections"),

    /**
     * Indicates that the associated information describes express return servies, such as leaving the vehicle in the return lot without the need to return to the rental counter. 
     * 
     */
    @XmlEnumValue("ExpressReturnService")
    EXPRESS_RETURN_SERVICE("ExpressReturnService"),

    /**
     * Indicates that the associated information describes services ofered to those with special needs, such as physically impaired.
     * 
     */
    @XmlEnumValue("SpecialNeeds")
    SPECIAL_NEEDS("SpecialNeeds"),

    /**
     * Indicates that the associated information describes those services offered to members of the company's frequent renter program.  Such services may include covered collection of vehicle, bypassing the rental counter, etc.
     * 
     */
    @XmlEnumValue("FrequentRenter")
    FREQUENT_RENTER("FrequentRenter"),

    /**
     * Indicates that the associated information describes the miscellaneous services that are offered at the rental facility.
     * 
     */
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous");
    private final String value;

    OnLocationServiceIDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnLocationServiceIDType fromValue(String v) {
        for (OnLocationServiceIDType c: OnLocationServiceIDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
