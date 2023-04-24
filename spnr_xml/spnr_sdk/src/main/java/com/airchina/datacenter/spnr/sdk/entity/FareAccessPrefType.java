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
 * <p>FareAccessPrefType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FareAccessPrefType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="PointToPoint"/>
 *     &lt;enumeration value="Through"/>
 *     &lt;enumeration value="Joint"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Negotiated"/>
 *     &lt;enumeration value="Net"/>
 *     &lt;enumeration value="Historical"/>
 *     &lt;enumeration value="SecurateAir"/>
 *     &lt;enumeration value="Moneysaver"/>
 *     &lt;enumeration value="MoneysaverRoundtrip"/>
 *     &lt;enumeration value="MoneysaverNoOneWay"/>
 *     &lt;enumeration value="MoneysaverOneWayOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareAccessPrefType")
@XmlEnum
public enum FareAccessPrefType {

    @XmlEnumValue("PointToPoint")
    POINT_TO_POINT("PointToPoint"),
    @XmlEnumValue("Through")
    THROUGH("Through"),
    @XmlEnumValue("Joint")
    JOINT("Joint"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Negotiated")
    NEGOTIATED("Negotiated"),
    @XmlEnumValue("Net")
    NET("Net"),

    /**
     * To request ATPCO historical fare/rule information.
     * 
     * 
     * 
     * 
     */
    @XmlEnumValue("Historical")
    HISTORICAL("Historical"),

    /**
     * To request fares for a specified agreement.
     * 
     */
    @XmlEnumValue("SecurateAir")
    SECURATE_AIR("SecurateAir"),

    /**
     * To request all airline fares for the specified city pair, lowest to highest.
     * 
     */
    @XmlEnumValue("Moneysaver")
    MONEYSAVER("Moneysaver"),

    /**
     * All roundtrip airline fares for the specified city pair including one way fares.
     * 
     * 
     * 
     */
    @XmlEnumValue("MoneysaverRoundtrip")
    MONEYSAVER_ROUNDTRIP("MoneysaverRoundtrip"),

    /**
     * All airline fares for the specified city pair but no one way fares.
     * 
     */
    @XmlEnumValue("MoneysaverNoOneWay")
    MONEYSAVER_NO_ONE_WAY("MoneysaverNoOneWay"),

    /**
     * Only one-way fares for all airlines for the specified city pair.
     * 
     */
    @XmlEnumValue("MoneysaverOneWayOnly")
    MONEYSAVER_ONE_WAY_ONLY("MoneysaverOneWayOnly");
    private final String value;

    FareAccessPrefType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareAccessPrefType fromValue(String v) {
        for (FareAccessPrefType c: FareAccessPrefType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
