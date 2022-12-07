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
 * <p>List_OfferVehicleClass的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferVehicleClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Compact/Economy"/>
 *     &lt;enumeration value="Exotic"/>
 *     &lt;enumeration value="Fullsize"/>
 *     &lt;enumeration value="FuelEfficient"/>
 *     &lt;enumeration value="Intermediate/Midsize"/>
 *     &lt;enumeration value="LargeSUV"/>
 *     &lt;enumeration value="Luxury/Premium"/>
 *     &lt;enumeration value="Minivan"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Stretch"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferVehicleClass")
@XmlEnum
public enum ListOfferVehicleClass {

    @XmlEnumValue("Compact/Economy")
    COMPACT_ECONOMY("Compact/Economy"),
    @XmlEnumValue("Exotic")
    EXOTIC("Exotic"),
    @XmlEnumValue("Fullsize")
    FULLSIZE("Fullsize"),
    @XmlEnumValue("FuelEfficient")
    FUEL_EFFICIENT("FuelEfficient"),
    @XmlEnumValue("Intermediate/Midsize")
    INTERMEDIATE_MIDSIZE("Intermediate/Midsize"),
    @XmlEnumValue("LargeSUV")
    LARGE_SUV("LargeSUV"),
    @XmlEnumValue("Luxury/Premium")
    LUXURY_PREMIUM("Luxury/Premium"),
    @XmlEnumValue("Minivan")
    MINIVAN("Minivan"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Stretch")
    STRETCH("Stretch"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferVehicleClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferVehicleClass fromValue(String v) {
        for (ListOfferVehicleClass c: ListOfferVehicleClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
