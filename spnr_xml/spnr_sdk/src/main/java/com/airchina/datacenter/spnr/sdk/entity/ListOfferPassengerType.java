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
 * <p>List_OfferPassengerType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferPassengerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CorporateEmployee"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="FrequentGuest"/>
 *     &lt;enumeration value="FrequentTraveler"/>
 *     &lt;enumeration value="Government"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="LoyaltyProgramMember"/>
 *     &lt;enumeration value="MeetingAttendee"/>
 *     &lt;enumeration value="Military"/>
 *     &lt;enumeration value="Retired"/>
 *     &lt;enumeration value="VIP"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferPassengerType")
@XmlEnum
public enum ListOfferPassengerType {

    @XmlEnumValue("CorporateEmployee")
    CORPORATE_EMPLOYEE("CorporateEmployee"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("FrequentGuest")
    FREQUENT_GUEST("FrequentGuest"),
    @XmlEnumValue("FrequentTraveler")
    FREQUENT_TRAVELER("FrequentTraveler"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("LoyaltyProgramMember")
    LOYALTY_PROGRAM_MEMBER("LoyaltyProgramMember"),
    @XmlEnumValue("MeetingAttendee")
    MEETING_ATTENDEE("MeetingAttendee"),
    @XmlEnumValue("Military")
    MILITARY("Military"),
    @XmlEnumValue("Retired")
    RETIRED("Retired"),
    VIP("VIP"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferPassengerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferPassengerType fromValue(String v) {
        for (ListOfferPassengerType c: ListOfferPassengerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
