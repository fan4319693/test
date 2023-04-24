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
 * <p>AncillaryProductCategoryType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AncillaryProductCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="segment"/>
 *     &lt;enumeration value="journey"/>
 *     &lt;enumeration value="airport"/>
 *     &lt;enumeration value="baggage"/>
 *     &lt;enumeration value="seat"/>
 *     &lt;enumeration value="bound"/>
 *     &lt;enumeration value="CrossSell"/>
 *     &lt;enumeration value="BrandedFare"/>
 *     &lt;enumeration value="itinerary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AncillaryProductCategoryType")
@XmlEnum
public enum AncillaryProductCategoryType {

    @XmlEnumValue("segment")
    SEGMENT("segment"),
    @XmlEnumValue("journey")
    JOURNEY("journey"),
    @XmlEnumValue("airport")
    AIRPORT("airport"),
    @XmlEnumValue("baggage")
    BAGGAGE("baggage"),
    @XmlEnumValue("seat")
    SEAT("seat"),
    @XmlEnumValue("bound")
    BOUND("bound"),
    @XmlEnumValue("CrossSell")
    CROSS_SELL("CrossSell"),
    @XmlEnumValue("BrandedFare")
    BRANDED_FARE("BrandedFare"),
    @XmlEnumValue("itinerary")
    ITINERARY("itinerary");
    private final String value;

    AncillaryProductCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AncillaryProductCategoryType fromValue(String v) {
        for (AncillaryProductCategoryType c: AncillaryProductCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
