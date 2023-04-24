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
 * <p>TravelPurposeEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TravelPurposeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSignificant"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Conference"/>
 *     &lt;enumeration value="Consortiums"/>
 *     &lt;enumeration value="HomeVisiting"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelPurposeEnum")
@XmlEnum
public enum TravelPurposeEnum {

    @XmlEnumValue("NotSignificant")
    NOT_SIGNIFICANT("NotSignificant"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Conference")
    CONFERENCE("Conference"),
    @XmlEnumValue("Consortiums")
    CONSORTIUMS("Consortiums"),
    @XmlEnumValue("HomeVisiting")
    HOME_VISITING("HomeVisiting"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    TravelPurposeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelPurposeEnum fromValue(String v) {
        for (TravelPurposeEnum c: TravelPurposeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
