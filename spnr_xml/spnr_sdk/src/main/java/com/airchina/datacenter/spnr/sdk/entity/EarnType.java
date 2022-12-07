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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Used to describe how loyalty units might be earned
 * 
 * <p>EarnType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EarnType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}LoyaltyBaseType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EarnAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarnType")
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyProductType.Earn.class,
    PackageEarnType.class,
    com.airchina.datacenter.spnr.sdk.entity.PaymentLoyaltyType.Earn.class,
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyPricingType.Combinations.Combination.Earn.class,
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyDetailsPricingType.Combinations.Combination.Earn.class,
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyPTCType.PTC.Earn.class,
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyPricingType.Earn.class
})
public class EarnType
    extends LoyaltyBaseType
{

    @XmlAttribute(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlAttribute(name = "ValidFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFromDate;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "PTCReference_List")
    protected String ptcReferenceList;

    /**
     * 获取expiryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * 设置expiryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * 获取validFromDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFromDate() {
        return validFromDate;
    }

    /**
     * 设置validFromDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFromDate(XMLGregorianCalendar value) {
        this.validFromDate = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * 获取ptcReferenceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTCReferenceList() {
        return ptcReferenceList;
    }

    /**
     * 设置ptcReferenceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTCReferenceList(String value) {
        this.ptcReferenceList = value;
    }

}
