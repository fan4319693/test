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
 * <p>List_OfferTourActivityCategory的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferTourActivityCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accessible"/>
 *     &lt;enumeration value="Adventure"/>
 *     &lt;enumeration value="Cultural"/>
 *     &lt;enumeration value="EcoAdventure"/>
 *     &lt;enumeration value="Educational"/>
 *     &lt;enumeration value="Family"/>
 *     &lt;enumeration value="FoodAndBeverage"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Romantic"/>
 *     &lt;enumeration value="SportsAndRecreation"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferTourActivityCategory")
@XmlEnum
public enum ListOfferTourActivityCategory {

    @XmlEnumValue("Accessible")
    ACCESSIBLE("Accessible"),
    @XmlEnumValue("Adventure")
    ADVENTURE("Adventure"),
    @XmlEnumValue("Cultural")
    CULTURAL("Cultural"),
    @XmlEnumValue("EcoAdventure")
    ECO_ADVENTURE("EcoAdventure"),
    @XmlEnumValue("Educational")
    EDUCATIONAL("Educational"),

    /**
     * The tour and/or activity content and extertion level are family friendly for children, adults and seniors.
     * 
     */
    @XmlEnumValue("Family")
    FAMILY("Family"),
    @XmlEnumValue("FoodAndBeverage")
    FOOD_AND_BEVERAGE("FoodAndBeverage"),

    /**
     * A day tour or activity that is well-suited for larger parties, e.g. 8+ attendees within a group.
     * 
     */
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Romantic")
    ROMANTIC("Romantic"),
    @XmlEnumValue("SportsAndRecreation")
    SPORTS_AND_RECREATION("SportsAndRecreation"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferTourActivityCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferTourActivityCategory fromValue(String v) {
        for (ListOfferTourActivityCategory c: ListOfferTourActivityCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
