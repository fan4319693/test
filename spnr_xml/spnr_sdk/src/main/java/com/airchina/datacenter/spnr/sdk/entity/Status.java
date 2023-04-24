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
 * <p>Status的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Status">
 *   &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}AlphaLength1">
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Status")
@XmlEnum
public enum Status {


    /**
     * Registered for delivery ASAP
     * 
     */
    R,

    /**
     * Delivery is currently in progress
     * 
     */
    I,

    /**
     * The delivery failed
     * 
     */
    F,

    /**
     * Notification sent successfully
     * 
     */
    S,

    /**
     * Wait until the delivery is requested
     * 
     */
    W,

    /**
     * Delay delivery until DeliveryAfterTime
     * 
     */
    D;

    public String value() {
        return name();
    }

    public static Status fromValue(String v) {
        return valueOf(v);
    }

}
