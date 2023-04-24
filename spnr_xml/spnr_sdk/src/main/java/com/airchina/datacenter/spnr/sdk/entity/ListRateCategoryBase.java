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
 * <p>List_RateCategory_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_RateCategory_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Association"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="BusinessStandard"/>
 *     &lt;enumeration value="Consortiums"/>
 *     &lt;enumeration value="Conventions"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="Credential"/>
 *     &lt;enumeration value="Employee"/>
 *     &lt;enumeration value="FullyInclusive"/>
 *     &lt;enumeration value="Government"/>
 *     &lt;enumeration value="Inclusive"/>
 *     &lt;enumeration value="Industry"/>
 *     &lt;enumeration value="Leisure"/>
 *     &lt;enumeration value="Negotiated"/>
 *     &lt;enumeration value="Promotional"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="VIP"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_RateCategory_Base")
@XmlEnum
public enum ListRateCategoryBase {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Association")
    ASSOCIATION("Association"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("BusinessStandard")
    BUSINESS_STANDARD("BusinessStandard"),
    @XmlEnumValue("Consortiums")
    CONSORTIUMS("Consortiums"),
    @XmlEnumValue("Conventions")
    CONVENTIONS("Conventions"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Credential")
    CREDENTIAL("Credential"),
    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("FullyInclusive")
    FULLY_INCLUSIVE("FullyInclusive"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Inclusive")
    INCLUSIVE("Inclusive"),
    @XmlEnumValue("Industry")
    INDUSTRY("Industry"),
    @XmlEnumValue("Leisure")
    LEISURE("Leisure"),
    @XmlEnumValue("Negotiated")
    NEGOTIATED("Negotiated"),
    @XmlEnumValue("Promotional")
    PROMOTIONAL("Promotional"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    VIP("VIP"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListRateCategoryBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListRateCategoryBase fromValue(String v) {
        for (ListRateCategoryBase c: ListRateCategoryBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
