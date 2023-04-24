//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChoicePrefType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ChoicePrefType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChoicePrefType")
@XmlEnum
public enum ChoicePrefType {


    /**
     * P = PREFERENCE PREFERRED
     * Search results that do or do not satisfy this preference should be returned.
     * 
     */
    P,

    /**
     * R = PREFERENCE REQUIRED
     * Only search results that satisfy this preference should be returned.
     * 
     */
    R;

    public String value() {
        return name();
    }

    public static ChoicePrefType fromValue(String v) {
        return valueOf(v);
    }

}
