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
 * <p>List_AirFareDateType_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_AirFareDateType_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DiscontinueTravel"/>
 *     &lt;enumeration value="EffectiveTravel"/>
 *     &lt;enumeration value="FirstTicketing"/>
 *     &lt;enumeration value="Historic"/>
 *     &lt;enumeration value="LastTicketing"/>
 *     &lt;enumeration value="TravelCompletion"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_AirFareDateType_Base")
@XmlEnum
public enum ListAirFareDateTypeBase {


    /**
     * The last travel date for this fare.
     * 
     */
    @XmlEnumValue("DiscontinueTravel")
    DISCONTINUE_TRAVEL("DiscontinueTravel"),

    /**
     * The first travel date for this fare.
     * 
     */
    @XmlEnumValue("EffectiveTravel")
    EFFECTIVE_TRAVEL("EffectiveTravel"),

    /**
     * The first date for ticketing.
     * 
     */
    @XmlEnumValue("FirstTicketing")
    FIRST_TICKETING("FirstTicketing"),
    @XmlEnumValue("Historic")
    HISTORIC("Historic"),

    /**
     * The last date for ticketing.
     * 
     */
    @XmlEnumValue("LastTicketing")
    LAST_TICKETING("LastTicketing"),

    /**
     * The date by which travel must be completed.
     * 
     */
    @XmlEnumValue("TravelCompletion")
    TRAVEL_COMPLETION("TravelCompletion"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListAirFareDateTypeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListAirFareDateTypeBase fromValue(String v) {
        for (ListAirFareDateTypeBase c: ListAirFareDateTypeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
