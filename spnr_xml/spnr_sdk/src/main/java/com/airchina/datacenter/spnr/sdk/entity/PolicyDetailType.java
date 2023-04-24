//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains such specific, policy-identifying details such as policy number, reference number, effective and expiration dates.
 * 
 * <p>PolicyDetail_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PolicyDetail_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyNumber" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"/>
 *         &lt;element name="RefNumber" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="PlanRestrictions" type="{http://www.opentravel.org/OTA/2003/05}PlanRestrictionType" minOccurs="0"/>
 *         &lt;element name="PolicyDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EffectiveExpireOptionalDateGroup"/>
 *       &lt;attribute name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyDetail_Type", propOrder = {
    "policyNumber",
    "refNumber",
    "planRestrictions",
    "policyDetailURL"
})
public class PolicyDetailType {

    @XmlElement(name = "PolicyNumber", required = true)
    protected UniqueIDType policyNumber;
    @XmlElement(name = "RefNumber")
    protected List<UniqueIDType> refNumber;
    @XmlElement(name = "PlanRestrictions")
    protected PlanRestrictionType planRestrictions;
    @XmlElement(name = "PolicyDetailURL")
    protected URLType policyDetailURL;
    @XmlAttribute(name = "OrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * 获取policyNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getPolicyNumber() {
        return policyNumber;
    }

    /**
     * 设置policyNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setPolicyNumber(UniqueIDType value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getRefNumber() {
        if (refNumber == null) {
            refNumber = new ArrayList<UniqueIDType>();
        }
        return this.refNumber;
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
     * 获取policyDetailURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getPolicyDetailURL() {
        return policyDetailURL;
    }

    /**
     * 设置policyDetailURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setPolicyDetailURL(URLType value) {
        this.policyDetailURL = value;
    }

    /**
     * 获取orderDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * 设置orderDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
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
