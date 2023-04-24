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
 * <p>OffLocationServiceID_Type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OffLocationServiceID_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="CustPickUp"/>
 *     &lt;enumeration value="VehDelivery"/>
 *     &lt;enumeration value="CustDropOff"/>
 *     &lt;enumeration value="VehCollection"/>
 *     &lt;enumeration value="Exchange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OffLocationServiceID_Type")
@XmlEnum
public enum OffLocationServiceIDType {


    /**
     * Indicates that the associated information describes an offered service by which the customer may be picked up and taken to the rental facility, to rent a vehicle.
     * 
     */
    @XmlEnumValue("CustPickUp")
    CUST_PICK_UP("CustPickUp"),

    /**
     * Indicates that the associated information describes an offered service by which the vehicle may be delivered to a location, rather than the customer taking delivery at the rental facility.
     * 
     */
    @XmlEnumValue("VehDelivery")
    VEH_DELIVERY("VehDelivery"),

    /**
     * Indicates that the associated information describes an offered service by which the customer may be dropped off at a location after the vehicle rental period has ended.
     * 
     */
    @XmlEnumValue("CustDropOff")
    CUST_DROP_OFF("CustDropOff"),

    /**
     * Indicates that the associated information describes an offered service by which the vehicle may be collected from a location, rather than the customer returning the vehicle to the rental facility.
     * 
     */
    @XmlEnumValue("VehCollection")
    VEH_COLLECTION("VehCollection"),

    /**
     * Indicates that the associated information describes an offered service by which the customer will be delivered the exchanged car.
     * 
     */
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange");
    private final String value;

    OffLocationServiceIDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OffLocationServiceIDType fromValue(String v) {
        for (OffLocationServiceIDType c: OffLocationServiceIDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
