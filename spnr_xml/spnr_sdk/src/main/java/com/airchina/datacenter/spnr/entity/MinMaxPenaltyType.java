//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MinMaxPenaltyType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MinMaxPenaltyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAX"/>
 *     &lt;enumeration value="MIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MinMaxPenaltyType")
@XmlEnum
public enum MinMaxPenaltyType {


    /**
     * MAX = MAXIMUM PENALTY AMOUNT
     * 
     */
    MAX,

    /**
     * MIN = MINIMUM PENALTY AMOUNT
     * 
     */
    MIN;

    public String value() {
        return name();
    }

    public static MinMaxPenaltyType fromValue(String v) {
        return valueOf(v);
    }

}
