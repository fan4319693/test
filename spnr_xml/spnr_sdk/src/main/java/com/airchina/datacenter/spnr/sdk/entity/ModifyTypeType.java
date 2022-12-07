//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ModifyTypeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ModifyTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
 *       &lt;attribute name="oldMPNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="splitRequired" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NeedCancel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="oldPNR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OriginalHistoryID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="freeDateChange" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AuditID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="OpenTag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OfflineSplit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="XPATH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Action" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="CustomerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="ContactPersonRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="OrigCabinClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReshopID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyTypeType")
public class ModifyTypeType {

    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "oldMPNum")
    protected BigInteger oldMPNum;
    @XmlAttribute(name = "splitRequired")
    protected String splitRequired;
    @XmlAttribute(name = "NeedCancel")
    protected Boolean needCancel;
    @XmlAttribute(name = "oldPNR")
    protected String oldPNR;
    @XmlAttribute(name = "OriginalHistoryID")
    protected BigInteger originalHistoryID;
    @XmlAttribute(name = "freeDateChange")
    protected String freeDateChange;
    @XmlAttribute(name = "AuditID", required = true)
    protected int auditID;
    @XmlAttribute(name = "OpenTag")
    protected String openTag;
    @XmlAttribute(name = "OfflineSplit")
    protected Boolean offlineSplit;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "XPATH")
    protected String xpath;
    @XmlAttribute(name = "Action")
    @XmlSchemaType(name = "anySimpleType")
    protected String action;
    @XmlAttribute(name = "FlightSegmentRPH")
    protected String flightSegmentRPH;
    @XmlAttribute(name = "CustomerRPH")
    protected String customerRPH;
    @XmlAttribute(name = "ContactPersonRPH")
    protected String contactPersonRPH;
    @XmlAttribute(name = "OrigCabinClass")
    protected String origCabinClass;
    @XmlAttribute(name = "ReshopID")
    @XmlSchemaType(name = "anySimpleType")
    protected String reshopID;

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
     * 获取oldMPNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOldMPNum() {
        return oldMPNum;
    }

    /**
     * 设置oldMPNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOldMPNum(BigInteger value) {
        this.oldMPNum = value;
    }

    /**
     * 获取splitRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitRequired() {
        return splitRequired;
    }

    /**
     * 设置splitRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitRequired(String value) {
        this.splitRequired = value;
    }

    /**
     * 获取needCancel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedCancel() {
        return needCancel;
    }

    /**
     * 设置needCancel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedCancel(Boolean value) {
        this.needCancel = value;
    }

    /**
     * 获取oldPNR属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPNR() {
        return oldPNR;
    }

    /**
     * 设置oldPNR属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPNR(String value) {
        this.oldPNR = value;
    }

    /**
     * 获取originalHistoryID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalHistoryID() {
        return originalHistoryID;
    }

    /**
     * 设置originalHistoryID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalHistoryID(BigInteger value) {
        this.originalHistoryID = value;
    }

    /**
     * 获取freeDateChange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeDateChange() {
        return freeDateChange;
    }

    /**
     * 设置freeDateChange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeDateChange(String value) {
        this.freeDateChange = value;
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
     * 获取openTag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenTag() {
        return openTag;
    }

    /**
     * 设置openTag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenTag(String value) {
        this.openTag = value;
    }

    /**
     * 获取offlineSplit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfflineSplit() {
        return offlineSplit;
    }

    /**
     * 设置offlineSplit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfflineSplit(Boolean value) {
        this.offlineSplit = value;
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
     * 获取xpath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPATH() {
        return xpath;
    }

    /**
     * 设置xpath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPATH(String value) {
        this.xpath = value;
    }

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * 获取flightSegmentRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSegmentRPH() {
        return flightSegmentRPH;
    }

    /**
     * 设置flightSegmentRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSegmentRPH(String value) {
        this.flightSegmentRPH = value;
    }

    /**
     * 获取customerRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRPH() {
        return customerRPH;
    }

    /**
     * 设置customerRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRPH(String value) {
        this.customerRPH = value;
    }

    /**
     * 获取contactPersonRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonRPH() {
        return contactPersonRPH;
    }

    /**
     * 设置contactPersonRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonRPH(String value) {
        this.contactPersonRPH = value;
    }

    /**
     * 获取origCabinClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigCabinClass() {
        return origCabinClass;
    }

    /**
     * 设置origCabinClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigCabinClass(String value) {
        this.origCabinClass = value;
    }

    /**
     * 获取reshopID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReshopID() {
        return reshopID;
    }

    /**
     * 设置reshopID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReshopID(String value) {
        this.reshopID = value;
    }

}
