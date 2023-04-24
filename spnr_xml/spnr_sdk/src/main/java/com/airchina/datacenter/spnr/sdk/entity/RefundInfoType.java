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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RefundInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RefundInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HistoryAttribute"/>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="eRefundNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}RefundInfoStatusType" />
 *       &lt;attribute name="IssueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundInfoType")
public class RefundInfoType {

    @XmlAttribute(name = "ID")
    protected BigInteger id;
    @XmlAttribute(name = "AuditID")
    protected Integer auditID;
    @XmlAttribute(name = "eRefundNumber")
    protected String eRefundNumber;
    @XmlAttribute(name = "Status")
    protected RefundInfoStatusType status;
    @XmlAttribute(name = "IssueTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueTime;
    @XmlAttribute(name = "HistoryID")
    protected BigInteger historyID;
    @XmlAttribute(name = "Historic")
    protected Boolean historic;
    @XmlAttribute(name = "LiveID")
    protected Integer liveID;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * 获取auditID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuditID() {
        return auditID;
    }

    /**
     * 设置auditID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuditID(Integer value) {
        this.auditID = value;
    }

    /**
     * 获取eRefundNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERefundNumber() {
        return eRefundNumber;
    }

    /**
     * 设置eRefundNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERefundNumber(String value) {
        this.eRefundNumber = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RefundInfoStatusType }
     *     
     */
    public RefundInfoStatusType getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RefundInfoStatusType }
     *     
     */
    public void setStatus(RefundInfoStatusType value) {
        this.status = value;
    }

    /**
     * 获取issueTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueTime() {
        return issueTime;
    }

    /**
     * 设置issueTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueTime(XMLGregorianCalendar value) {
        this.issueTime = value;
    }

    /**
     * 获取historyID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHistoryID() {
        return historyID;
    }

    /**
     * 设置historyID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHistoryID(BigInteger value) {
        this.historyID = value;
    }

    /**
     * 获取historic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHistoric() {
        return historic;
    }

    /**
     * 设置historic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistoric(Boolean value) {
        this.historic = value;
    }

    /**
     * 获取liveID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLiveID() {
        return liveID;
    }

    /**
     * 设置liveID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLiveID(Integer value) {
        this.liveID = value;
    }

}
