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
 * <p>List_OfferPaymentCardType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferPaymentCardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AmericanExpress"/>
 *     &lt;enumeration value="DiscoverCard"/>
 *     &lt;enumeration value="Eurocard"/>
 *     &lt;enumeration value="Mastercard"/>
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferPaymentCardType")
@XmlEnum
public enum ListOfferPaymentCardType {

    @XmlEnumValue("AmericanExpress")
    AMERICAN_EXPRESS("AmericanExpress"),
    @XmlEnumValue("DiscoverCard")
    DISCOVER_CARD("DiscoverCard"),
    @XmlEnumValue("Eurocard")
    EUROCARD("Eurocard"),
    @XmlEnumValue("Mastercard")
    MASTERCARD("Mastercard"),
    VISA("VISA"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferPaymentCardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferPaymentCardType fromValue(String v) {
        for (ListOfferPaymentCardType c: ListOfferPaymentCardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
