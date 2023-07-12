//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>List_ApplyToLevel_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_ApplyToLevel_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cabin"/>
 *     &lt;enumeration value="Facility"/>
 *     &lt;enumeration value="GuestRoom"/>
 *     &lt;enumeration value="MeetingRoom"/>
 *     &lt;enumeration value="Property"/>
 *     &lt;enumeration value="Seat"/>
 *     &lt;enumeration value="Ship"/>
 *     &lt;enumeration value="Unit"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_ApplyToLevel_Base")
@XmlEnum
public enum ListApplyToLevelBase {


    /**
     * An airplane, train or ship cabin.
     * 
     */
    @XmlEnumValue("Cabin")
    CABIN("Cabin"),

    /**
     * An on or offsite facility, such as a restaurant or car rental location.
     * 
     */
    @XmlEnumValue("Facility")
    FACILITY("Facility"),

    /**
     * A guest room.
     * 
     */
    @XmlEnumValue("GuestRoom")
    GUEST_ROOM("GuestRoom"),

    /**
     * A meeting room.
     * 
     */
    @XmlEnumValue("MeetingRoom")
    MEETING_ROOM("MeetingRoom"),

    /**
     * A property, such as a hotel or vacation rental unit.
     * 
     */
    @XmlEnumValue("Property")
    PROPERTY("Property"),

    /**
     * A seat, such as an airplane or train seat.
     * 
     */
    @XmlEnumValue("Seat")
    SEAT("Seat"),

    /**
     * A cruise ship.
     * 
     */
    @XmlEnumValue("Ship")
    SHIP("Ship"),

    /**
     * A vacation rental unit.
     * 
     */
    @XmlEnumValue("Unit")
    UNIT("Unit"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListApplyToLevelBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListApplyToLevelBase fromValue(String v) {
        for (ListApplyToLevelBase c: ListApplyToLevelBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
