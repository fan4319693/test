//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Element to descibe an accrual stored in the database
 * 
 * <p>AccrualType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccrualType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AccrualID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ValidFromDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="PointsAwarded" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PointsRemaining" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SPNRID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TransactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccrualType")
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.RedemptionType.Accruals.Accrual.class
})
public class AccrualType {

    @XmlAttribute(name = "AccrualID")
    protected String accrualID;
    @XmlAttribute(name = "ValidFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFromDate;
    @XmlAttribute(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlAttribute(name = "TransactionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlAttribute(name = "PointsAwarded")
    protected BigInteger pointsAwarded;
    @XmlAttribute(name = "PointsRemaining")
    protected BigInteger pointsRemaining;
    @XmlAttribute(name = "SPNRID")
    protected String spnrid;
    @XmlAttribute(name = "MasterProductNumber")
    protected String masterProductNumber;
    @XmlAttribute(name = "ProductNumber")
    protected String productNumber;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "TransactionStatus")
    protected String transactionStatus;
    @XmlAttribute(name = "TransactionType")
    protected String transactionType;

    /**
     * 获取accrualID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrualID() {
        return accrualID;
    }

    /**
     * 设置accrualID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccrualID(String value) {
        this.accrualID = value;
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
     * 获取transactionDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * 设置transactionDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * 获取pointsAwarded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsAwarded() {
        return pointsAwarded;
    }

    /**
     * 设置pointsAwarded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsAwarded(BigInteger value) {
        this.pointsAwarded = value;
    }

    /**
     * 获取pointsRemaining属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsRemaining() {
        return pointsRemaining;
    }

    /**
     * 设置pointsRemaining属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsRemaining(BigInteger value) {
        this.pointsRemaining = value;
    }

    /**
     * 获取spnrid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPNRID() {
        return spnrid;
    }

    /**
     * 设置spnrid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPNRID(String value) {
        this.spnrid = value;
    }

    /**
     * 获取masterProductNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterProductNumber() {
        return masterProductNumber;
    }

    /**
     * 设置masterProductNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterProductNumber(String value) {
        this.masterProductNumber = value;
    }

    /**
     * 获取productNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNumber() {
        return productNumber;
    }

    /**
     * 设置productNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNumber(String value) {
        this.productNumber = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取transactionStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * 设置transactionStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatus(String value) {
        this.transactionStatus = value;
    }

    /**
     * 获取transactionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * 设置transactionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

}
