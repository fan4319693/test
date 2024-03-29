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
 * <p>List_GlobalIndicatorType_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_GlobalIndicatorType_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="DO"/>
 *     &lt;enumeration value="EH"/>
 *     &lt;enumeration value="FE"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PN"/>
 *     &lt;enumeration value="PO"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="WH"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_GlobalIndicatorType_Base")
@XmlEnum
public enum ListGlobalIndicatorTypeBase {


    /**
     * Atlantic/Pacific Round-the-World
     * 
     */
    AP("AP"),

    /**
     * Atlantic Ocean
     * 
     */
    AT("AT"),

    /**
     * Circle trip
     * 
     */
    CT("CT"),

    /**
     * Domestic
     * 
     */
    DO("DO"),

    /**
     * Eastern Hemisphere
     * 
     */
    EH("EH"),

    /**
     * Within the Far East
     * 
     */
    FE("FE"),

    /**
     * Pacific Ocean
     * 
     */
    PA("PA"),

    /**
     * TC1-TC3 via Pacific/N. America
     * 
     */
    PN("PN"),

    /**
     * Polar Route
     * 
     */
    PO("PO"),

    /**
     * Russia Area 3
     * 
     */
    RU("RU"),

    /**
     * Round the world
     * 
     */
    RW("RW"),

    /**
     * South Atlantic only
     * 
     */
    SA("SA"),

    /**
     * Trans Siberia Route
     * 
     */
    TS("TS"),

    /**
     * Western Hemisphere
     * 
     */
    WH("WH"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListGlobalIndicatorTypeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListGlobalIndicatorTypeBase fromValue(String v) {
        for (ListGlobalIndicatorTypeBase c: ListGlobalIndicatorTypeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
