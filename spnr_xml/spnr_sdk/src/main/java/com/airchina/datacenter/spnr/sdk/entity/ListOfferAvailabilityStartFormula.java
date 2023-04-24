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
 * <p>List_OfferAvailabilityStartFormula的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferAvailabilityStartFormula">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CustomerSpecified"/>
 *     &lt;enumeration value="FlightArrival"/>
 *     &lt;enumeration value="RentalCarDropOff"/>
 *     &lt;enumeration value="TravelGracePeriod_Distance"/>
 *     &lt;enumeration value="TravelGracePeriod_PrivateSchedule"/>
 *     &lt;enumeration value="TravelGracePeriod_PublicSchedule"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferAvailabilityStartFormula")
@XmlEnum
public enum ListOfferAvailabilityStartFormula {


    /**
     * The customer has specified the earliest start date or date and time.
     * 
     */
    @XmlEnumValue("CustomerSpecified")
    CUSTOMER_SPECIFIED("CustomerSpecified"),
    @XmlEnumValue("FlightArrival")
    FLIGHT_ARRIVAL("FlightArrival"),
    @XmlEnumValue("RentalCarDropOff")
    RENTAL_CAR_DROP_OFF("RentalCarDropOff"),

    /**
     * The travel grace period (travel time between two locations) has been estimated based on the calculated distance between the known start and end locations.
     * 
     */
    @XmlEnumValue("TravelGracePeriod_Distance")
    TRAVEL_GRACE_PERIOD_DISTANCE("TravelGracePeriod_Distance"),

    /**
     * The travel grace period (travel time between two locations) has been estimated based on a known operating schedule for a supplier or prearranged mode of transportation between the start and end locations.
     * 
     */
    @XmlEnumValue("TravelGracePeriod_PrivateSchedule")
    TRAVEL_GRACE_PERIOD_PRIVATE_SCHEDULE("TravelGracePeriod_PrivateSchedule"),

    /**
     * The travel grace period (travel time between two locations) has been estimated based on a known operating schedule for a public mode of transportation between the start and end locations.
     * 
     */
    @XmlEnumValue("TravelGracePeriod_PublicSchedule")
    TRAVEL_GRACE_PERIOD_PUBLIC_SCHEDULE("TravelGracePeriod_PublicSchedule"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferAvailabilityStartFormula(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferAvailabilityStartFormula fromValue(String v) {
        for (ListOfferAvailabilityStartFormula c: ListOfferAvailabilityStartFormula.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
