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
 * <p>List_OfferTripMode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferTripMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Activity"/>
 *     &lt;enumeration value="Flight"/>
 *     &lt;enumeration value="Cruise"/>
 *     &lt;enumeration value="DayTour"/>
 *     &lt;enumeration value="GroundTransportation"/>
 *     &lt;enumeration value="Lodging"/>
 *     &lt;enumeration value="PackageTour"/>
 *     &lt;enumeration value="Train"/>
 *     &lt;enumeration value="VehicleRental"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferTripMode")
@XmlEnum
public enum ListOfferTripMode {

    @XmlEnumValue("Activity")
    ACTIVITY("Activity"),
    @XmlEnumValue("Flight")
    FLIGHT("Flight"),
    @XmlEnumValue("Cruise")
    CRUISE("Cruise"),
    @XmlEnumValue("DayTour")
    DAY_TOUR("DayTour"),
    @XmlEnumValue("GroundTransportation")
    GROUND_TRANSPORTATION("GroundTransportation"),
    @XmlEnumValue("Lodging")
    LODGING("Lodging"),
    @XmlEnumValue("PackageTour")
    PACKAGE_TOUR("PackageTour"),
    @XmlEnumValue("Train")
    TRAIN("Train"),
    @XmlEnumValue("VehicleRental")
    VEHICLE_RENTAL("VehicleRental"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferTripMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferTripMode fromValue(String v) {
        for (ListOfferTripMode c: ListOfferTripMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
