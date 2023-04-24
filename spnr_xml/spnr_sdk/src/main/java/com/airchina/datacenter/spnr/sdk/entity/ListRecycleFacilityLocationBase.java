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
 * <p>List_RecycleFacilityLocation_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_RecycleFacilityLocation_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CommonAreas"/>
 *     &lt;enumeration value="Garage"/>
 *     &lt;enumeration value="GuestRoom"/>
 *     &lt;enumeration value="MeetingRoom"/>
 *     &lt;enumeration value="Restaurant"/>
 *     &lt;enumeration value="StaffArea"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_RecycleFacilityLocation_Base")
@XmlEnum
public enum ListRecycleFacilityLocationBase {

    @XmlEnumValue("CommonAreas")
    COMMON_AREAS("CommonAreas"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    @XmlEnumValue("GuestRoom")
    GUEST_ROOM("GuestRoom"),
    @XmlEnumValue("MeetingRoom")
    MEETING_ROOM("MeetingRoom"),
    @XmlEnumValue("Restaurant")
    RESTAURANT("Restaurant"),
    @XmlEnumValue("StaffArea")
    STAFF_AREA("StaffArea"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListRecycleFacilityLocationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListRecycleFacilityLocationBase fromValue(String v) {
        for (ListRecycleFacilityLocationBase c: ListRecycleFacilityLocationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
