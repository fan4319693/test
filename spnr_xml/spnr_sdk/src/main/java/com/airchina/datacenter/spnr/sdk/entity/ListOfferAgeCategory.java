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
 * <p>List_OfferAgeCategory的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferAgeCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Adult"/>
 *     &lt;enumeration value="Child"/>
 *     &lt;enumeration value="Infant"/>
 *     &lt;enumeration value="Over10"/>
 *     &lt;enumeration value="Over12"/>
 *     &lt;enumeration value="Over21"/>
 *     &lt;enumeration value="Over65"/>
 *     &lt;enumeration value="Senior"/>
 *     &lt;enumeration value="Under2"/>
 *     &lt;enumeration value="Under10"/>
 *     &lt;enumeration value="Under12"/>
 *     &lt;enumeration value="Under17"/>
 *     &lt;enumeration value="Under18"/>
 *     &lt;enumeration value="Under21"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferAgeCategory")
@XmlEnum
public enum ListOfferAgeCategory {

    @XmlEnumValue("Adult")
    ADULT("Adult"),
    @XmlEnumValue("Child")
    CHILD("Child"),
    @XmlEnumValue("Infant")
    INFANT("Infant"),
    @XmlEnumValue("Over10")
    OVER_10("Over10"),
    @XmlEnumValue("Over12")
    OVER_12("Over12"),
    @XmlEnumValue("Over21")
    OVER_21("Over21"),
    @XmlEnumValue("Over65")
    OVER_65("Over65"),
    @XmlEnumValue("Senior")
    SENIOR("Senior"),
    @XmlEnumValue("Under2")
    UNDER_2("Under2"),
    @XmlEnumValue("Under10")
    UNDER_10("Under10"),
    @XmlEnumValue("Under12")
    UNDER_12("Under12"),
    @XmlEnumValue("Under17")
    UNDER_17("Under17"),
    @XmlEnumValue("Under18")
    UNDER_18("Under18"),
    @XmlEnumValue("Under21")
    UNDER_21("Under21"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferAgeCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferAgeCategory fromValue(String v) {
        for (ListOfferAgeCategory c: ListOfferAgeCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
