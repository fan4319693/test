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
 * <p>List_ChargeUnit_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_ChargeUnit_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AdditionsPerStay"/>
 *     &lt;enumeration value="Complimentary"/>
 *     &lt;enumeration value="Event"/>
 *     &lt;enumeration value="Gallon"/>
 *     &lt;enumeration value="Item"/>
 *     &lt;enumeration value="MaximumCharge"/>
 *     &lt;enumeration value="MinimumCharge"/>
 *     &lt;enumeration value="OneTimeUse"/>
 *     &lt;enumeration value="OneWay"/>
 *     &lt;enumeration value="Order"/>
 *     &lt;enumeration value="OverMinuteCharge"/>
 *     &lt;enumeration value="Person"/>
 *     &lt;enumeration value="Rental"/>
 *     &lt;enumeration value="Reservation/Booking"/>
 *     &lt;enumeration value="Room"/>
 *     &lt;enumeration value="Stay"/>
 *     &lt;enumeration value="Tray"/>
 *     &lt;enumeration value="Unit"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_ChargeUnit_Base")
@XmlEnum
public enum ListChargeUnitBase {

    @XmlEnumValue("AdditionsPerStay")
    ADDITIONS_PER_STAY("AdditionsPerStay"),
    @XmlEnumValue("Complimentary")
    COMPLIMENTARY("Complimentary"),
    @XmlEnumValue("Event")
    EVENT("Event"),
    @XmlEnumValue("Gallon")
    GALLON("Gallon"),
    @XmlEnumValue("Item")
    ITEM("Item"),
    @XmlEnumValue("MaximumCharge")
    MAXIMUM_CHARGE("MaximumCharge"),
    @XmlEnumValue("MinimumCharge")
    MINIMUM_CHARGE("MinimumCharge"),
    @XmlEnumValue("OneTimeUse")
    ONE_TIME_USE("OneTimeUse"),
    @XmlEnumValue("OneWay")
    ONE_WAY("OneWay"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("OverMinuteCharge")
    OVER_MINUTE_CHARGE("OverMinuteCharge"),
    @XmlEnumValue("Person")
    PERSON("Person"),
    @XmlEnumValue("Rental")
    RENTAL("Rental"),
    @XmlEnumValue("Reservation/Booking")
    RESERVATION_BOOKING("Reservation/Booking"),
    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("Stay")
    STAY("Stay"),
    @XmlEnumValue("Tray")
    TRAY("Tray"),
    @XmlEnumValue("Unit")
    UNIT("Unit"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListChargeUnitBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListChargeUnitBase fromValue(String v) {
        for (ListChargeUnitBase c: ListChargeUnitBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
