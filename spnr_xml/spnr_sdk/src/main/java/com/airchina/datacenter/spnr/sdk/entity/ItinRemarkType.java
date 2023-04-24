//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
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
 * An individual Itinerary Remark.
 * 
 * <p>ItinRemarkType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItinRemarkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/>
 *         &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="AuditID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="HistoryRPH" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="LiveRPH" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SeqNo" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Active" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItinRemarkType", propOrder = {
    "text",
    "agent"
})
public class ItinRemarkType {

    @XmlElement(name = "Text")
    protected FreeTextType text;
    @XmlElement(name = "Agent")
    protected AgentDetailsType agent;
    @XmlAttribute(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "RPH")
    protected Integer rph;
    @XmlAttribute(name = "AuditID", required = true)
    protected int auditID;
    @XmlAttribute(name = "HistoryRPH")
    protected Integer historyRPH;
    @XmlAttribute(name = "LiveRPH")
    protected Integer liveRPH;
    @XmlAttribute(name = "SeqNo")
    protected Integer seqNo;
    @XmlAttribute(name = "Active", required = true)
    protected boolean active;

    /**
     * 获取text属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreeTextType }
     *     
     */
    public FreeTextType getText() {
        return text;
    }

    /**
     * 设置text属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextType }
     *     
     */
    public void setText(FreeTextType value) {
        this.text = value;
    }

    /**
     * 获取agent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgentDetailsType }
     *     
     */
    public AgentDetailsType getAgent() {
        return agent;
    }

    /**
     * 设置agent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgentDetailsType }
     *     
     */
    public void setAgent(AgentDetailsType value) {
        this.agent = value;
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
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取rph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRPH() {
        return rph;
    }

    /**
     * 设置rph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRPH(Integer value) {
        this.rph = value;
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

}
