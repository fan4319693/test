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
 * <p>SpecialRemarkOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialRemarkOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Itinerary"/>
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="Endorsement"/>
 *     &lt;enumeration value="Save"/>
 *     &lt;enumeration value="Confidential"/>
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="GRMS"/>
 *     &lt;enumeration value="Split"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialRemarkOptionType")
@XmlEnum
public enum SpecialRemarkOptionType {


    /**
     *  Remarks apply to the itinerary.
     * 
     */
    @XmlEnumValue("Itinerary")
    ITINERARY("Itinerary"),

    /**
     *  Remarks apply to the invoice.
     * 
     */
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),

    /**
     *  Remarks apply to the endorsement.
     * 
     */
    @XmlEnumValue("Endorsement")
    ENDORSEMENT("Endorsement"),

    /**
     * Remarks which can be deleted by the author only.
     * 
     */
    @XmlEnumValue("Save")
    SAVE("Save"),

    /**
     * Confidential remarks which are visible only to the author and system providers.
     * 
     */
    @XmlEnumValue("Confidential")
    CONFIDENTIAL("Confidential"),

    /**
     * Free text remarks which can be sent to specific airlines.
     * 
     */
    @XmlEnumValue("Free")
    FREE("Free"),

    /**
     * Remarks from or to a specific group revenue management system (GRMS).
     * 
     */
    GRMS("GRMS"),

    /**
     * Remarks containing information about split transaction (Split off PNR address, time, who, etc.).
     * 
     */
    @XmlEnumValue("Split")
    SPLIT("Split");
    private final String value;

    SpecialRemarkOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialRemarkOptionType fromValue(String v) {
        for (SpecialRemarkOptionType c: SpecialRemarkOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
