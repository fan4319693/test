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
 * <p>List_OfferCustomerValueBasis的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferCustomerValueBasis">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ClassOfService"/>
 *     &lt;enumeration value="CorporateClient"/>
 *     &lt;enumeration value="FareClass"/>
 *     &lt;enumeration value="FrequentGuest"/>
 *     &lt;enumeration value="FrequentTraveler"/>
 *     &lt;enumeration value="LoyaltyMemberTimePeriod"/>
 *     &lt;enumeration value="LoyaltyProgramLevel"/>
 *     &lt;enumeration value="PreferredClient"/>
 *     &lt;enumeration value="PremiumOfferPurchase"/>
 *     &lt;enumeration value="TripPrice"/>
 *     &lt;enumeration value="TripPurpose"/>
 *     &lt;enumeration value="UpgradePurchased"/>
 *     &lt;enumeration value="VIP"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferCustomerValueBasis")
@XmlEnum
public enum ListOfferCustomerValueBasis {


    /**
     * Class of service booked by the traveler, e.g. first, business, economy.
     * 
     */
    @XmlEnumValue("ClassOfService")
    CLASS_OF_SERVICE("ClassOfService"),

    /**
     * Traveler is an employee with a preferred or negotiated rate corporate account.
     * 
     */
    @XmlEnumValue("CorporateClient")
    CORPORATE_CLIENT("CorporateClient"),
    @XmlEnumValue("FareClass")
    FARE_CLASS("FareClass"),
    @XmlEnumValue("FrequentGuest")
    FREQUENT_GUEST("FrequentGuest"),
    @XmlEnumValue("FrequentTraveler")
    FREQUENT_TRAVELER("FrequentTraveler"),
    @XmlEnumValue("LoyaltyMemberTimePeriod")
    LOYALTY_MEMBER_TIME_PERIOD("LoyaltyMemberTimePeriod"),
    @XmlEnumValue("LoyaltyProgramLevel")
    LOYALTY_PROGRAM_LEVEL("LoyaltyProgramLevel"),
    @XmlEnumValue("PreferredClient")
    PREFERRED_CLIENT("PreferredClient"),
    @XmlEnumValue("PremiumOfferPurchase")
    PREMIUM_OFFER_PURCHASE("PremiumOfferPurchase"),
    @XmlEnumValue("TripPrice")
    TRIP_PRICE("TripPrice"),
    @XmlEnumValue("TripPurpose")
    TRIP_PURPOSE("TripPurpose"),
    @XmlEnumValue("UpgradePurchased")
    UPGRADE_PURCHASED("UpgradePurchased"),
    VIP("VIP"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferCustomerValueBasis(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferCustomerValueBasis fromValue(String v) {
        for (ListOfferCustomerValueBasis c: ListOfferCustomerValueBasis.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
