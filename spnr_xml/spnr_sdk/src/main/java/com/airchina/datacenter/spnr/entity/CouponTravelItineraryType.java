//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the redemption value of a coupon. It can be a fixed amount or a percentage off from total price.
 * 
 * <p>CouponTravelItineraryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CouponTravelItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItineraryInfo" type="{http://www.opentravel.org/OTA/2003/05}CouponItineraryInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponTravelItineraryType", propOrder = {
    "itineraryInfo"
})
public class CouponTravelItineraryType {

    @XmlElement(name = "ItineraryInfo")
    protected CouponItineraryInfoType itineraryInfo;

    /**
     * 获取itineraryInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponItineraryInfoType }
     *     
     */
    public CouponItineraryInfoType getItineraryInfo() {
        return itineraryInfo;
    }

    /**
     * 设置itineraryInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponItineraryInfoType }
     *     
     */
    public void setItineraryInfo(CouponItineraryInfoType value) {
        this.itineraryInfo = value;
    }

}
