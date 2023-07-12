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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 *  Pricing information for an itinerary.
 * 
 * <p>BookingPriceInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BookingPriceInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
 *       &lt;sequence>
 *         &lt;element name="PriceRequestInformation" type="{http://www.opentravel.org/OTA/2003/05}PriceRequestInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RepriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="BookingFare" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FareFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FarefamilyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingPriceInfoType", propOrder = {
    "priceRequestInformation"
})
@XmlSeeAlso({
    FareQuoteInfoType.class
})
public class BookingPriceInfoType
    extends AirItineraryPricingInfoType
{

    @XmlElement(name = "PriceRequestInformation")
    protected PriceRequestInformationType priceRequestInformation;
    @XmlAttribute(name = "RepriceRequired")
    protected Boolean repriceRequired;
    @XmlAttribute(name = "BookingFare")
    @XmlSchemaType(name = "anySimpleType")
    protected String bookingFare;
    @XmlAttribute(name = "FareFamilyCode")
    protected String fareFamilyCode;
    @XmlAttribute(name = "FareFamilyName")
    protected String fareFamilyName;
    @XmlAttribute(name = "FarefamilyName")
    protected String farefamilyName;

    /**
     * 获取priceRequestInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PriceRequestInformationType }
     *     
     */
    public PriceRequestInformationType getPriceRequestInformation() {
        return priceRequestInformation;
    }

    /**
     * 设置priceRequestInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRequestInformationType }
     *     
     */
    public void setPriceRequestInformation(PriceRequestInformationType value) {
        this.priceRequestInformation = value;
    }

    /**
     * 获取repriceRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRepriceRequired() {
        if (repriceRequired == null) {
            return false;
        } else {
            return repriceRequired;
        }
    }

    /**
     * 设置repriceRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepriceRequired(Boolean value) {
        this.repriceRequired = value;
    }

    /**
     * 获取bookingFare属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingFare() {
        return bookingFare;
    }

    /**
     * 设置bookingFare属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingFare(String value) {
        this.bookingFare = value;
    }

    /**
     * 获取fareFamilyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareFamilyCode() {
        return fareFamilyCode;
    }

    /**
     * 设置fareFamilyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareFamilyCode(String value) {
        this.fareFamilyCode = value;
    }

    /**
     * 获取fareFamilyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareFamilyName() {
        return fareFamilyName;
    }

    /**
     * 设置fareFamilyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareFamilyName(String value) {
        this.fareFamilyName = value;
    }

    /**
     * 获取farefamilyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarefamilyName() {
        return farefamilyName;
    }

    /**
     * 设置farefamilyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarefamilyName(String value) {
        this.farefamilyName = value;
    }

}
