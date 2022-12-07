//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="OfferExpiresDate" type="{http://www.opentravel.org/OTA/2003/05}DateTimeType" minOccurs="0"/>
 *         &lt;element name="OfferExpiresTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "offerExpiresDate",
    "offerExpiresTimestamp"
})
@XmlRootElement(name = "OfferTimeLimit")
public class OfferTimeLimit {

    @XmlElement(name = "OfferExpiresDate")
    protected DateTimeType offerExpiresDate;
    @XmlElement(name = "OfferExpiresTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offerExpiresTimestamp;

    /**
     * 获取offerExpiresDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getOfferExpiresDate() {
        return offerExpiresDate;
    }

    /**
     * 设置offerExpiresDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setOfferExpiresDate(DateTimeType value) {
        this.offerExpiresDate = value;
    }

    /**
     * 获取offerExpiresTimestamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferExpiresTimestamp() {
        return offerExpiresTimestamp;
    }

    /**
     * 设置offerExpiresTimestamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfferExpiresTimestamp(XMLGregorianCalendar value) {
        this.offerExpiresTimestamp = value;
    }

}
