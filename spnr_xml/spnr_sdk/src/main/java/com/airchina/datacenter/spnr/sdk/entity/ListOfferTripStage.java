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
 * <p>List_OfferTripStage的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferTripStage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PreTrip"/>
 *     &lt;enumeration value="InTrip"/>
 *     &lt;enumeration value="PostTrip"/>
 *     &lt;enumeration value="_Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferTripStage")
@XmlEnum
public enum ListOfferTripStage {


    /**
     * Passenger is checking in at airport.
     * 
     */
    @XmlEnumValue("PreTrip")
    PRE_TRIP("PreTrip"),

    /**
     * The traveler has started, but not completed, this trip mode.
     * 
     */
    @XmlEnumValue("InTrip")
    IN_TRIP("InTrip"),

    /**
     * The traveler has completed the trip mode.
     * 
     */
    @XmlEnumValue("PostTrip")
    POST_TRIP("PostTrip"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("_Other")
    OTHER("_Other");
    private final String value;

    ListOfferTripStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferTripStage fromValue(String v) {
        for (ListOfferTripStage c: ListOfferTripStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}