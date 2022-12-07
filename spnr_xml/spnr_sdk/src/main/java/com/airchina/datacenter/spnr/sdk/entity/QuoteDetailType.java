//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains the information about the plan, such as the name of the insurance company and restrictions, specific to the quote.
 * 
 * <p>QuoteDetail_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QuoteDetail_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProviderCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType"/>
 *         &lt;element name="QuoteDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
 *         &lt;element name="PlanRestrictions" type="{http://www.opentravel.org/OTA/2003/05}PlanRestrictionType" minOccurs="0"/>
 *         &lt;element name="BookingDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EffectiveExpireOptionalDateGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteDetail_Type", propOrder = {
    "providerCompany",
    "quoteDetailURL",
    "planRestrictions",
    "bookingDetailURL"
})
public class QuoteDetailType {

    @XmlElement(name = "ProviderCompany", required = true)
    protected CompanyNameType providerCompany;
    @XmlElement(name = "QuoteDetailURL")
    protected URLType quoteDetailURL;
    @XmlElement(name = "PlanRestrictions")
    protected PlanRestrictionType planRestrictions;
    @XmlElement(name = "BookingDetailURL")
    protected URLType bookingDetailURL;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * 获取providerCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getProviderCompany() {
        return providerCompany;
    }

    /**
     * 设置providerCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setProviderCompany(CompanyNameType value) {
        this.providerCompany = value;
    }

    /**
     * 获取quoteDetailURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getQuoteDetailURL() {
        return quoteDetailURL;
    }

    /**
     * 设置quoteDetailURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setQuoteDetailURL(URLType value) {
        this.quoteDetailURL = value;
    }

    /**
     * 获取planRestrictions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PlanRestrictionType }
     *     
     */
    public PlanRestrictionType getPlanRestrictions() {
        return planRestrictions;
    }

    /**
     * 设置planRestrictions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PlanRestrictionType }
     *     
     */
    public void setPlanRestrictions(PlanRestrictionType value) {
        this.planRestrictions = value;
    }

    /**
     * 获取bookingDetailURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getBookingDetailURL() {
        return bookingDetailURL;
    }

    /**
     * 设置bookingDetailURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setBookingDetailURL(URLType value) {
        this.bookingDetailURL = value;
    }

    /**
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * 获取expireDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * 设置expireDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

}
