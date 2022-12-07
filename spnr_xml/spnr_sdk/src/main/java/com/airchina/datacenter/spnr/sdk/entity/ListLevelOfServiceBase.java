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
 * <p>List_LevelOfService_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_LevelOfService_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Deluxe"/>
 *     &lt;enumeration value="Economy"/>
 *     &lt;enumeration value="Exclusive"/>
 *     &lt;enumeration value="Executive"/>
 *     &lt;enumeration value="Luxury"/>
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Shuttle"/>
 *     &lt;enumeration value="VIP"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_LevelOfService_Base")
@XmlEnum
public enum ListLevelOfServiceBase {

    @XmlEnumValue("Deluxe")
    DELUXE("Deluxe"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy"),
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),
    @XmlEnumValue("Executive")
    EXECUTIVE("Executive"),
    @XmlEnumValue("Luxury")
    LUXURY("Luxury"),
    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Shuttle")
    SHUTTLE("Shuttle"),
    VIP("VIP"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListLevelOfServiceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListLevelOfServiceBase fromValue(String v) {
        for (ListLevelOfServiceBase c: ListLevelOfServiceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
