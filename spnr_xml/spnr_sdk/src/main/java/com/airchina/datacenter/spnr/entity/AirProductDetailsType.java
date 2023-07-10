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
 * <p>AirProductDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirProductDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType"/>
 *         &lt;element name="SpecialReqDetails" type="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirProductDetailsType", propOrder = {
    "pricedItinerary",
    "specialReqDetails"
})
public class AirProductDetailsType {

    @XmlElement(name = "PricedItinerary", required = true)
    protected PricedItineraryType pricedItinerary;
    @XmlElement(name = "SpecialReqDetails")
    protected SpecialReqDetailsType specialReqDetails;

    /**
     * 获取pricedItinerary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricedItineraryType }
     *     
     */
    public PricedItineraryType getPricedItinerary() {
        return pricedItinerary;
    }

    /**
     * 设置pricedItinerary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricedItineraryType }
     *     
     */
    public void setPricedItinerary(PricedItineraryType value) {
        this.pricedItinerary = value;
    }

    /**
     * 获取specialReqDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType }
     *     
     */
    public SpecialReqDetailsType getSpecialReqDetails() {
        return specialReqDetails;
    }

    /**
     * 设置specialReqDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType }
     *     
     */
    public void setSpecialReqDetails(SpecialReqDetailsType value) {
        this.specialReqDetails = value;
    }

}
