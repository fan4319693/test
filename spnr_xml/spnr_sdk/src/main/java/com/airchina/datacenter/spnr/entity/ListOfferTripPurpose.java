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
 * <p>List_OfferTripPurpose的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferTripPurpose">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BereavmentOrEmergency"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="BusinessAndPersonal"/>
 *     &lt;enumeration value="CharterOrGroup"/>
 *     &lt;enumeration value="ConferenceOrEvent"/>
 *     &lt;enumeration value="Personal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferTripPurpose")
@XmlEnum
public enum ListOfferTripPurpose {

    @XmlEnumValue("BereavmentOrEmergency")
    BEREAVMENT_OR_EMERGENCY("BereavmentOrEmergency"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("BusinessAndPersonal")
    BUSINESS_AND_PERSONAL("BusinessAndPersonal"),
    @XmlEnumValue("CharterOrGroup")
    CHARTER_OR_GROUP("CharterOrGroup"),
    @XmlEnumValue("ConferenceOrEvent")
    CONFERENCE_OR_EVENT("ConferenceOrEvent"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal");
    private final String value;

    ListOfferTripPurpose(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferTripPurpose fromValue(String v) {
        for (ListOfferTripPurpose c: ListOfferTripPurpose.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
