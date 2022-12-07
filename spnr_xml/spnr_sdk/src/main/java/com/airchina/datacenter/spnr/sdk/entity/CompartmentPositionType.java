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
 * <p>CompartmentPositionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CompartmentPositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CloseToRestaurantCar"/>
 *     &lt;enumeration value="CloseToExit"/>
 *     &lt;enumeration value="CloseToToilet"/>
 *     &lt;enumeration value="MiddleOfCar"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompartmentPositionType")
@XmlEnum
public enum CompartmentPositionType {

    @XmlEnumValue("CloseToRestaurantCar")
    CLOSE_TO_RESTAURANT_CAR("CloseToRestaurantCar"),
    @XmlEnumValue("CloseToExit")
    CLOSE_TO_EXIT("CloseToExit"),
    @XmlEnumValue("CloseToToilet")
    CLOSE_TO_TOILET("CloseToToilet"),
    @XmlEnumValue("MiddleOfCar")
    MIDDLE_OF_CAR("MiddleOfCar");
    private final String value;

    CompartmentPositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompartmentPositionType fromValue(String v) {
        for (CompartmentPositionType c: CompartmentPositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
