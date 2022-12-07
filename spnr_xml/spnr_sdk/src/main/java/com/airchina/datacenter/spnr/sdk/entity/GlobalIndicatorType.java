//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GlobalIndicatorType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
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
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GlobalIndicatorType")
@XmlEnum
public enum GlobalIndicatorType {


    /**
     * Atlantic/Pacific Round-the-World
     * 
     */
    AP,

    /**
     * Atlantic Ocean
     * 
     */
    AT,

    /**
     * Circle trip
     * 
     * 
     */
    CT,

    /**
     * Domestic
     * 
     * 
     */
    DO,

    /**
     * Eastern Hemisphere
     * 
     */
    EH,

    /**
     * Within the Far East
     * 
     * 
     */
    FE,

    /**
     * Pacific Ocean
     * 
     */
    PA,

    /**
     * TC1-TC3 via Pacific/N. America
     * 
     * 
     */
    PN,

    /**
     * Polar Route
     * 
     */
    PO,

    /**
     * Russia Area 3
     * 
     * 
     */
    RU,

    /**
     * Round the world
     * 
     * 
     */
    RW,

    /**
     * South Atlantic only
     * 
     */
    SA,

    /**
     * Trans Siberia Route
     * 
     */
    TS,

    /**
     * Western Hemisphere
     * 
     */
    WH;

    public String value() {
        return name();
    }

    public static GlobalIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
