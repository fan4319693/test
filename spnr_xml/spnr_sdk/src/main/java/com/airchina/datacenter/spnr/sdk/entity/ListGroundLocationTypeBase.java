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
 * <p>List_GroundLocationType_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_GroundLocationType_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Airport"/>
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="PointOfInterest"/>
 *     &lt;enumeration value="Port"/>
 *     &lt;enumeration value="Region"/>
 *     &lt;enumeration value="HomeResidence"/>
 *     &lt;enumeration value="TrainStation"/>
 *     &lt;enumeration value="Vicinity"/>
 *     &lt;enumeration value="BusStation"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_GroundLocationType_Base")
@XmlEnum
public enum ListGroundLocationTypeBase {

    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("PointOfInterest")
    POINT_OF_INTEREST("PointOfInterest"),
    @XmlEnumValue("Port")
    PORT("Port"),
    @XmlEnumValue("Region")
    REGION("Region"),
    @XmlEnumValue("HomeResidence")
    HOME_RESIDENCE("HomeResidence"),
    @XmlEnumValue("TrainStation")
    TRAIN_STATION("TrainStation"),
    @XmlEnumValue("Vicinity")
    VICINITY("Vicinity"),
    @XmlEnumValue("BusStation")
    BUS_STATION("BusStation"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListGroundLocationTypeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListGroundLocationTypeBase fromValue(String v) {
        for (ListGroundLocationTypeBase c: ListGroundLocationTypeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
