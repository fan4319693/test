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
 * <p>RailPassengerOccupationEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RailPassengerOccupationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSignificant"/>
 *     &lt;enumeration value="RailEmployee"/>
 *     &lt;enumeration value="GovernmentEmployee"/>
 *     &lt;enumeration value="Farmer"/>
 *     &lt;enumeration value="Military"/>
 *     &lt;enumeration value="Journalist"/>
 *     &lt;enumeration value="Student"/>
 *     &lt;enumeration value="VIP"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RailPassengerOccupationEnum")
@XmlEnum
public enum RailPassengerOccupationEnum {

    @XmlEnumValue("NotSignificant")
    NOT_SIGNIFICANT("NotSignificant"),
    @XmlEnumValue("RailEmployee")
    RAIL_EMPLOYEE("RailEmployee"),
    @XmlEnumValue("GovernmentEmployee")
    GOVERNMENT_EMPLOYEE("GovernmentEmployee"),
    @XmlEnumValue("Farmer")
    FARMER("Farmer"),
    @XmlEnumValue("Military")
    MILITARY("Military"),
    @XmlEnumValue("Journalist")
    JOURNALIST("Journalist"),
    @XmlEnumValue("Student")
    STUDENT("Student"),
    VIP("VIP"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    RailPassengerOccupationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RailPassengerOccupationEnum fromValue(String v) {
        for (RailPassengerOccupationEnum c: RailPassengerOccupationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
