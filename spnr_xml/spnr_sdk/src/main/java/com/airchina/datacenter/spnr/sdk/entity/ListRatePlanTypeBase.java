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
 * <p>List_RatePlanType_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_RatePlanType_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Association"/>
 *     &lt;enumeration value="ClubConcierge"/>
 *     &lt;enumeration value="Consortia"/>
 *     &lt;enumeration value="Contract"/>
 *     &lt;enumeration value="Convention"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="DayRate"/>
 *     &lt;enumeration value="DistressedInventory"/>
 *     &lt;enumeration value="FamilyPlan"/>
 *     &lt;enumeration value="Government"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="LastRoomAvailable"/>
 *     &lt;enumeration value="Military"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="Multi-DayPackage"/>
 *     &lt;enumeration value="Negotiated"/>
 *     &lt;enumeration value="Net"/>
 *     &lt;enumeration value="NonLastRoomAvailable"/>
 *     &lt;enumeration value="Package"/>
 *     &lt;enumeration value="Promotional"/>
 *     &lt;enumeration value="PromotionalPackageTour"/>
 *     &lt;enumeration value="Published"/>
 *     &lt;enumeration value="RegularRack"/>
 *     &lt;enumeration value="SeniorCitizen"/>
 *     &lt;enumeration value="TourWholesale"/>
 *     &lt;enumeration value="TravelIndustry"/>
 *     &lt;enumeration value="Weekend"/>
 *     &lt;enumeration value="Weekly"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_RatePlanType_Base")
@XmlEnum
public enum ListRatePlanTypeBase {

    @XmlEnumValue("Association")
    ASSOCIATION("Association"),
    @XmlEnumValue("ClubConcierge")
    CLUB_CONCIERGE("ClubConcierge"),
    @XmlEnumValue("Consortia")
    CONSORTIA("Consortia"),
    @XmlEnumValue("Contract")
    CONTRACT("Contract"),
    @XmlEnumValue("Convention")
    CONVENTION("Convention"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("DayRate")
    DAY_RATE("DayRate"),
    @XmlEnumValue("DistressedInventory")
    DISTRESSED_INVENTORY("DistressedInventory"),
    @XmlEnumValue("FamilyPlan")
    FAMILY_PLAN("FamilyPlan"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("LastRoomAvailable")
    LAST_ROOM_AVAILABLE("LastRoomAvailable"),
    @XmlEnumValue("Military")
    MILITARY("Military"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Multi-DayPackage")
    MULTI_DAY_PACKAGE("Multi-DayPackage"),
    @XmlEnumValue("Negotiated")
    NEGOTIATED("Negotiated"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("NonLastRoomAvailable")
    NON_LAST_ROOM_AVAILABLE("NonLastRoomAvailable"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("Promotional")
    PROMOTIONAL("Promotional"),
    @XmlEnumValue("PromotionalPackageTour")
    PROMOTIONAL_PACKAGE_TOUR("PromotionalPackageTour"),
    @XmlEnumValue("Published")
    PUBLISHED("Published"),
    @XmlEnumValue("RegularRack")
    REGULAR_RACK("RegularRack"),
    @XmlEnumValue("SeniorCitizen")
    SENIOR_CITIZEN("SeniorCitizen"),
    @XmlEnumValue("TourWholesale")
    TOUR_WHOLESALE("TourWholesale"),
    @XmlEnumValue("TravelIndustry")
    TRAVEL_INDUSTRY("TravelIndustry"),
    @XmlEnumValue("Weekend")
    WEEKEND("Weekend"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListRatePlanTypeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListRatePlanTypeBase fromValue(String v) {
        for (ListRatePlanTypeBase c: ListRatePlanTypeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
