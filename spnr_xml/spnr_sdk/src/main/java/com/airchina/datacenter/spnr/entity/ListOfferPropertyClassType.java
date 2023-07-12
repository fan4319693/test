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
 * <p>List_OfferPropertyClassType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferPropertyClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ConferenceMeeting"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="Budget/Economy/Hostel"/>
 *     &lt;enumeration value="ExtendedStay"/>
 *     &lt;enumeration value="Golf"/>
 *     &lt;enumeration value="Luxury/Upscale/Resort"/>
 *     &lt;enumeration value="Midscale"/>
 *     &lt;enumeration value="Ski"/>
 *     &lt;enumeration value="Spa"/>
 *     &lt;enumeration value="VacationRental"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferPropertyClassType")
@XmlEnum
public enum ListOfferPropertyClassType {


    /**
     * A property with a combination of conference facilities and guest rooms.
     * 
     */
    @XmlEnumValue("ConferenceMeeting")
    CONFERENCE_MEETING("ConferenceMeeting"),

    /**
     * A property that accommodates corporate negotiated rates and/or is company policy mandated for traveling employees.
     * 
     */
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),

    /**
     * A property with room rates that are lower than the area average.
     * 
     */
    @XmlEnumValue("Budget/Economy/Hostel")
    BUDGET_ECONOMY_HOSTEL("Budget/Economy/Hostel"),

    /**
     * A property that offers extended stay accommodations with typical reservations two weeks or greater in length.
     * 
     */
    @XmlEnumValue("ExtendedStay")
    EXTENDED_STAY("ExtendedStay"),

    /**
     * A property that has a golf facility onsite or nearby.
     * 
     */
    @XmlEnumValue("Golf")
    GOLF("Golf"),

    /**
     * A property with higher than average features, amenities, services and room rates.
     * 
     */
    @XmlEnumValue("Luxury/Upscale/Resort")
    LUXURY_UPSCALE_RESORT("Luxury/Upscale/Resort"),

    /**
     * A property with room rates that are average for the area.
     * 
     */
    @XmlEnumValue("Midscale")
    MIDSCALE("Midscale"),

    /**
     * A property that has a ski facility onsite or nearby.
     * 
     */
    @XmlEnumValue("Ski")
    SKI("Ski"),

    /**
     * A property that has a spa onsite or nearby.
     * 
     */
    @XmlEnumValue("Spa")
    SPA("Spa"),

    /**
     * A private house or timeshare property that typically accommodates vacationing travelers.
     * 
     */
    @XmlEnumValue("VacationRental")
    VACATION_RENTAL("VacationRental"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferPropertyClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferPropertyClassType fromValue(String v) {
        for (ListOfferPropertyClassType c: ListOfferPropertyClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
