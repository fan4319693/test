//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Itinerary reservation information.
 * 
 * <p>CouponItineraryInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CouponItineraryInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}CouponTicketingType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TripType" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponItineraryInfoType", propOrder = {
    "ticketing"
})
public class CouponItineraryInfoType {

    @XmlElement(name = "Ticketing")
    protected CouponTicketingType ticketing;
    @XmlAttribute(name = "TripType")
    protected AirTripType tripType;

    /**
     * 获取ticketing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponTicketingType }
     *     
     */
    public CouponTicketingType getTicketing() {
        return ticketing;
    }

    /**
     * 设置ticketing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponTicketingType }
     *     
     */
    public void setTicketing(CouponTicketingType value) {
        this.ticketing = value;
    }

    /**
     * 获取tripType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirTripType }
     *     
     */
    public AirTripType getTripType() {
        return tripType;
    }

    /**
     * 设置tripType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirTripType }
     *     
     */
    public void setTripType(AirTripType value) {
        this.tripType = value;
    }

}
