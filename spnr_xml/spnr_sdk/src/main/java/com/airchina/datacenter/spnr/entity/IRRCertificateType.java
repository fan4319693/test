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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Electronic Certificate information. =notes=
 * 				1. Supports non-revenue and flightpass certificates.
 * 
 * <p>IRRCertificateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IRRCertificateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuingAirline" type="{http://www.opentravel.org/OTA/2003/05}AirlineCodeType" minOccurs="0"/>
 *         &lt;element name="IssueDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ImageData" type="{http://www.opentravel.org/OTA/2003/05}AttachmentsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OJ_SuperPNR_RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IRRCertificateType", propOrder = {
    "number",
    "issuingAirline",
    "issueDateTime",
    "imageData"
})
public class IRRCertificateType {

    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "IssuingAirline")
    protected String issuingAirline;
    @XmlElement(name = "IssueDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDateTime;
    @XmlElement(name = "ImageData")
    protected AttachmentsType imageData;
    @XmlAttribute(name = "OJ_SuperPNR_RPH")
    protected String ojSuperPNRRPH;

    /**
     * 获取number属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置number属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * 获取issuingAirline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingAirline() {
        return issuingAirline;
    }

    /**
     * 设置issuingAirline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingAirline(String value) {
        this.issuingAirline = value;
    }

    /**
     * 获取issueDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDateTime() {
        return issueDateTime;
    }

    /**
     * 设置issueDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDateTime(XMLGregorianCalendar value) {
        this.issueDateTime = value;
    }

    /**
     * 获取imageData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AttachmentsType }
     *     
     */
    public AttachmentsType getImageData() {
        return imageData;
    }

    /**
     * 设置imageData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentsType }
     *     
     */
    public void setImageData(AttachmentsType value) {
        this.imageData = value;
    }

    /**
     * 获取ojSuperPNRRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOJSuperPNRRPH() {
        return ojSuperPNRRPH;
    }

    /**
     * 设置ojSuperPNRRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOJSuperPNRRPH(String value) {
        this.ojSuperPNRRPH = value;
    }

}
