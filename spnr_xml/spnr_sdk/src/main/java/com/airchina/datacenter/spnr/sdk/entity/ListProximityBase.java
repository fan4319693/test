//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>List_Proximity_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_Proximity_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nearby"/>
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="Offsite"/>
 *     &lt;enumeration value="Onsite"/>
 *     &lt;enumeration value="OnsiteAndOffsite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_Proximity_Base")
@XmlEnum
public enum ListProximityBase {

    @XmlEnumValue("Nearby")
    NEARBY("Nearby"),
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("Offsite")
    OFFSITE("Offsite"),
    @XmlEnumValue("Onsite")
    ONSITE("Onsite"),
    @XmlEnumValue("OnsiteAndOffsite")
    ONSITE_AND_OFFSITE("OnsiteAndOffsite");
    private final String value;

    ListProximityBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListProximityBase fromValue(String v) {
        for (ListProximityBase c: ListProximityBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
