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
 * <p>List_OfferReservationStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferReservationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Tentative"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferReservationStatus")
@XmlEnum
public enum ListOfferReservationStatus {


    /**
     * Reservation has been confirmed.
     * 
     */
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),

    /**
     * No reservation.
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * The reservation is tentative and has been guaranteed.
     * 
     */
    @XmlEnumValue("Tentative")
    TENTATIVE("Tentative"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferReservationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferReservationStatus fromValue(String v) {
        for (ListOfferReservationStatus c: ListOfferReservationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
