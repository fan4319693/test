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
 * <p>OJ_RemarkType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OJ_RemarkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Agent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType">
 *                 &lt;attribute name="InitialAgent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RefundQualifiers" type="{http://www.opentravel.org/OTA/2003/05}RefundQualifiersType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Restricted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Supplier_RPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CustomerVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Active" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Deleted" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TicketVisible" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="VoucherVisible" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EmailVisible" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="AuditID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="HistoryRPH" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="LiveRPH" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SeqNo" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJ_RemarkType", propOrder = {
    "text",
    "agent",
    "refundQualifiers"
})
public class OJRemarkType {

    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "Agent")
    protected OJRemarkType.Agent agent;
    @XmlElement(name = "RefundQualifiers")
    protected RefundQualifiersType refundQualifiers;
    @XmlAttribute(name = "Restricted")
    protected Boolean restricted;
    @XmlAttribute(name = "Supplier_RPH")
    @XmlSchemaType(name = "anySimpleType")
    protected String supplierRPH;
    @XmlAttribute(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "CustomerVisible")
    protected Boolean customerVisible;
    @XmlAttribute(name = "Active", required = true)
    protected boolean active;
    @XmlAttribute(name = "Deleted")
    @XmlSchemaType(name = "anySimpleType")
    protected String deleted;
    @XmlAttribute(name = "TicketVisible")
    @XmlSchemaType(name = "anySimpleType")
    protected String ticketVisible;
    @XmlAttribute(name = "VoucherVisible")
    @XmlSchemaType(name = "anySimpleType")
    protected String voucherVisible;
    @XmlAttribute(name = "EmailVisible")
    @XmlSchemaType(name = "anySimpleType")
    protected String emailVisible;
    @XmlAttribute(name = "RPH")
    @XmlSchemaType(name = "anySimpleType")
    protected String rph;
    @XmlAttribute(name = "LastModified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlAttribute(name = "AuditID", required = true)
    protected int auditID;
    @XmlAttribute(name = "HistoryRPH")
    protected Integer historyRPH;
    @XmlAttribute(name = "LiveRPH")
    protected Integer liveRPH;
    @XmlAttribute(name = "SeqNo")
    protected Integer seqNo;

    /**
     * 获取text属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * 设置text属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * 获取agent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OJRemarkType.Agent }
     *     
     */
    public OJRemarkType.Agent getAgent() {
        return agent;
    }

    /**
     * 设置agent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OJRemarkType.Agent }
     *     
     */
    public void setAgent(OJRemarkType.Agent value) {
        this.agent = value;
    }

    /**
     * 获取refundQualifiers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RefundQualifiersType }
     *     
     */
    public RefundQualifiersType getRefundQualifiers() {
        return refundQualifiers;
    }

    /**
     * 设置refundQualifiers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RefundQualifiersType }
     *     
     */
    public void setRefundQualifiers(RefundQualifiersType value) {
        this.refundQualifiers = value;
    }

    /**
     * 获取restricted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestricted() {
        return restricted;
    }

    /**
     * 设置restricted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestricted(Boolean value) {
        this.restricted = value;
    }

    /**
     * 获取supplierRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierRPH() {
        return supplierRPH;
    }

    /**
     * 设置supplierRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierRPH(String value) {
        this.supplierRPH = value;
    }

    /**
     * 获取date属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * 设置date属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取codeContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * 设置codeContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * 获取customerVisible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerVisible() {
        return customerVisible;
    }

    /**
     * 设置customerVisible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerVisible(Boolean value) {
        this.customerVisible = value;
    }

    /**
     * 获取active属性的值。
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * 设置active属性的值。
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * 获取deleted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置deleted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleted(String value) {
        this.deleted = value;
    }

    /**
     * 获取ticketVisible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketVisible() {
        return ticketVisible;
    }

    /**
     * 设置ticketVisible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketVisible(String value) {
        this.ticketVisible = value;
    }

    /**
     * 获取voucherVisible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherVisible() {
        return voucherVisible;
    }

    /**
     * 设置voucherVisible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherVisible(String value) {
        this.voucherVisible = value;
    }

    /**
     * 获取emailVisible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailVisible() {
        return emailVisible;
    }

    /**
     * 设置emailVisible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailVisible(String value) {
        this.emailVisible = value;
    }

    /**
     * 获取rph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * 设置rph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * 获取lastModified属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * 设置lastModified属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * 获取auditID属性的值。
     * 
     */
    public int getAuditID() {
        return auditID;
    }

    /**
     * 设置auditID属性的值。
     * 
     */
    public void setAuditID(int value) {
        this.auditID = value;
    }

    /**
     * 获取historyRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHistoryRPH() {
        return historyRPH;
    }

    /**
     * 设置historyRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHistoryRPH(Integer value) {
        this.historyRPH = value;
    }

    /**
     * 获取liveRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLiveRPH() {
        return liveRPH;
    }

    /**
     * 设置liveRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLiveRPH(Integer value) {
        this.liveRPH = value;
    }

    /**
     * 获取seqNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * 设置seqNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeqNo(Integer value) {
        this.seqNo = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType">
     *       &lt;attribute name="InitialAgent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Agent
        extends AgentDetailsType
    {

        @XmlAttribute(name = "InitialAgent")
        protected String initialAgent;
        @XmlAttribute(name = "GroupID")
        protected String groupID;

        /**
         * 获取initialAgent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitialAgent() {
            return initialAgent;
        }

        /**
         * 设置initialAgent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitialAgent(String value) {
            this.initialAgent = value;
        }

        /**
         * 获取groupID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupID() {
            return groupID;
        }

        /**
         * 设置groupID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupID(String value) {
            this.groupID = value;
        }

    }

}
