//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Attachment contents
 * 
 * <p>AttachmentsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AttachmentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentData" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HistoryAttribute"/>
 *       &lt;attribute name="Action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Role" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Part" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="TotalParts" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="UploadDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Content-Location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Content-Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Content-Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Content-ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Content-Transfer-Encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Content-Length" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RepositoryType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="database"/>
 *             &lt;enumeration value="fileServer"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentsType", propOrder = {
    "contentData"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.SuperPNRType.Attachments.Attachment.class,
    com.airchina.datacenter.spnr.entity.PackageProductType.Attachments.Attachment.class
})
public class AttachmentsType {

    @XmlElement(name = "ContentData")
    protected List<String> contentData;
    @XmlAttribute(name = "Action")
    protected String action;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Role")
    protected String role;
    @XmlAttribute(name = "Part")
    protected BigInteger part;
    @XmlAttribute(name = "TotalParts")
    protected BigInteger totalParts;
    @XmlAttribute(name = "UploadDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String uploadDate;
    @XmlAttribute(name = "Content-Location")
    protected String contentLocation;
    @XmlAttribute(name = "Content-Type")
    protected String contentType;
    @XmlAttribute(name = "Content-Description")
    protected String contentDescription;
    @XmlAttribute(name = "Content-ID")
    protected String contentID;
    @XmlAttribute(name = "Content-Transfer-Encoding")
    protected String contentTransferEncoding;
    @XmlAttribute(name = "Content-Length")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentLength;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "RepositoryType")
    protected String repositoryType;
    @XmlAttribute(name = "HistoryID")
    protected BigInteger historyID;
    @XmlAttribute(name = "Historic")
    protected Boolean historic;
    @XmlAttribute(name = "LiveID")
    protected Integer liveID;

    /**
     * Gets the value of the contentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContentData() {
        if (contentData == null) {
            contentData = new ArrayList<String>();
        }
        return this.contentData;
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
     * 获取role属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置role属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * 获取part属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPart() {
        return part;
    }

    /**
     * 设置part属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPart(BigInteger value) {
        this.part = value;
    }

    /**
     * 获取totalParts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalParts() {
        return totalParts;
    }

    /**
     * 设置totalParts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalParts(BigInteger value) {
        this.totalParts = value;
    }

    /**
     * 获取uploadDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadDate() {
        return uploadDate;
    }

    /**
     * 设置uploadDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadDate(String value) {
        this.uploadDate = value;
    }

    /**
     * 获取contentLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /**
     * 设置contentLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentLocation(String value) {
        this.contentLocation = value;
    }

    /**
     * 获取contentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * 设置contentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * 获取contentDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentDescription() {
        return contentDescription;
    }

    /**
     * 设置contentDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDescription(String value) {
        this.contentDescription = value;
    }

    /**
     * 获取contentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentID() {
        return contentID;
    }

    /**
     * 设置contentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentID(String value) {
        this.contentID = value;
    }

    /**
     * 获取contentTransferEncoding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentTransferEncoding() {
        return contentTransferEncoding;
    }

    /**
     * 设置contentTransferEncoding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentTransferEncoding(String value) {
        this.contentTransferEncoding = value;
    }

    /**
     * 获取contentLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentLength() {
        return contentLength;
    }

    /**
     * 设置contentLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentLength(String value) {
        this.contentLength = value;
    }

    /**
     * 获取key属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置key属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * 获取repositoryType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryType() {
        return repositoryType;
    }

    /**
     * 设置repositoryType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryType(String value) {
        this.repositoryType = value;
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
