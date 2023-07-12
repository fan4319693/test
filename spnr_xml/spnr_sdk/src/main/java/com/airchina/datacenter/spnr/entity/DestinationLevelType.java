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
 * <p>DestinationLevelType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DestinationLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Continent"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="State"/>
 *     &lt;enumeration value="Area"/>
 *     &lt;enumeration value="SubArea"/>
 *     &lt;enumeration value="Resort"/>
 *     &lt;enumeration value="District"/>
 *     &lt;enumeration value="Region"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DestinationLevelType")
@XmlEnum
public enum DestinationLevelType {

    @XmlEnumValue("Continent")
    CONTINENT("Continent"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("SubArea")
    SUB_AREA("SubArea"),
    @XmlEnumValue("Resort")
    RESORT("Resort"),
    @XmlEnumValue("District")
    DISTRICT("District"),
    @XmlEnumValue("Region")
    REGION("Region");
    private final String value;

    DestinationLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DestinationLevelType fromValue(String v) {
        for (DestinationLevelType c: DestinationLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
