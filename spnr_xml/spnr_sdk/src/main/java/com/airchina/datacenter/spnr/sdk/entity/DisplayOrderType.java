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
 * <p>DisplayOrderType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DisplayOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="ByDepartureTime"/>
 *     &lt;enumeration value="ByArrivalTime"/>
 *     &lt;enumeration value="ByJourneyTime"/>
 *     &lt;enumeration value="ByPriceHighToLow"/>
 *     &lt;enumeration value="ByPriceLowToHigh"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisplayOrderType")
@XmlEnum
public enum DisplayOrderType {


    /**
     * Display products by departure time
     * 
     */
    @XmlEnumValue("ByDepartureTime")
    BY_DEPARTURE_TIME("ByDepartureTime"),

    /**
     * Display products by arrival time
     * 
     */
    @XmlEnumValue("ByArrivalTime")
    BY_ARRIVAL_TIME("ByArrivalTime"),

    /**
     * Display products by journey time
     * 
     */
    @XmlEnumValue("ByJourneyTime")
    BY_JOURNEY_TIME("ByJourneyTime"),

    /**
     * AWG ToDo
     * 
     */
    @XmlEnumValue("ByPriceHighToLow")
    BY_PRICE_HIGH_TO_LOW("ByPriceHighToLow"),

    /**
     * AWG ToDo
     * 
     */
    @XmlEnumValue("ByPriceLowToHigh")
    BY_PRICE_LOW_TO_HIGH("ByPriceLowToHigh");
    private final String value;

    DisplayOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisplayOrderType fromValue(String v) {
        for (DisplayOrderType c: DisplayOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
