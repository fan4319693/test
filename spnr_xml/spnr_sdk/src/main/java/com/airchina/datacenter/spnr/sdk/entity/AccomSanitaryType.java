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
 * <p>AccomSanitaryType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AccomSanitaryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccomSanitaryType")
@XmlEnum
public enum AccomSanitaryType {


    /**
     * Bath and WC
     * 
     */
    B,

    /**
     * Shower and WC
     * 
     */
    H,

    /**
     * Bath Shower and WC
     * 
     */
    I,

    /**
     * Washbasin and WC
     * 
     */
    V,

    /**
     * Washbasin
     * 
     */
    W,

    /**
     * WC
     * 
     */
    Y;

    public String value() {
        return name();
    }

    public static AccomSanitaryType fromValue(String v) {
        return valueOf(v);
    }

}
