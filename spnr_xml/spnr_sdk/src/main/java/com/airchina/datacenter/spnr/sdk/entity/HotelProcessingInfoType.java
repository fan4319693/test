//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of information that specifies how the message processing should occur or how the data should be returned.
 * 
 * <p>HotelProcessingInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelProcessingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationRestrictions" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationRestrictionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelProcessingInfoType", propOrder = {
    "reservationRestrictions"
})
public class HotelProcessingInfoType {

    @XmlElement(name = "ReservationRestrictions")
    protected HotelReservationRestrictionsType reservationRestrictions;

    /**
     * 获取reservationRestrictions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationRestrictionsType }
     *     
     */
    public HotelReservationRestrictionsType getReservationRestrictions() {
        return reservationRestrictions;
    }

    /**
     * 设置reservationRestrictions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationRestrictionsType }
     *     
     */
    public void setReservationRestrictions(HotelReservationRestrictionsType value) {
        this.reservationRestrictions = value;
    }

}
