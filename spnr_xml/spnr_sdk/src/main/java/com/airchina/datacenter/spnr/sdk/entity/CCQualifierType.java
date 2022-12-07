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
import javax.xml.bind.annotation.XmlType;


/**
 * Credit Card Qualifier information.
 * 
 * <p>CCQualifierType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CCQualifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CCNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}CCExpiration"/>
 *         &lt;element name="CardholderFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardholderLastName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCAddressGroup" type="{http://www.opentravel.org/OTA/2003/05}AddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCQualifierType", propOrder = {
    "ccCode",
    "ccNumber",
    "ccExpiration",
    "cardholderFirstName",
    "cardholderLastName",
    "ccAddressGroup"
})
public class CCQualifierType {

    @XmlElement(name = "CCCode", required = true)
    protected String ccCode;
    @XmlElement(name = "CCNumber", required = true)
    protected String ccNumber;
    @XmlElement(name = "CCExpiration", required = true)
    protected CCExpiration ccExpiration;
    @XmlElement(name = "CardholderFirstName")
    protected String cardholderFirstName;
    @XmlElement(name = "CardholderLastName")
    protected String cardholderLastName;
    @XmlElement(name = "CCAddressGroup")
    protected AddressType ccAddressGroup;

    /**
     * 获取ccCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCCode() {
        return ccCode;
    }

    /**
     * 设置ccCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCCode(String value) {
        this.ccCode = value;
    }

    /**
     * 获取ccNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCNumber() {
        return ccNumber;
    }

    /**
     * 设置ccNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCNumber(String value) {
        this.ccNumber = value;
    }

    /**
     * 获取ccExpiration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CCExpiration }
     *     
     */
    public CCExpiration getCCExpiration() {
        return ccExpiration;
    }

    /**
     * 设置ccExpiration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CCExpiration }
     *     
     */
    public void setCCExpiration(CCExpiration value) {
        this.ccExpiration = value;
    }

    /**
     * 获取cardholderFirstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderFirstName() {
        return cardholderFirstName;
    }

    /**
     * 设置cardholderFirstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderFirstName(String value) {
        this.cardholderFirstName = value;
    }

    /**
     * 获取cardholderLastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderLastName() {
        return cardholderLastName;
    }

    /**
     * 设置cardholderLastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderLastName(String value) {
        this.cardholderLastName = value;
    }

    /**
     * 获取ccAddressGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getCCAddressGroup() {
        return ccAddressGroup;
    }

    /**
     * 设置ccAddressGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setCCAddressGroup(AddressType value) {
        this.ccAddressGroup = value;
    }

}
