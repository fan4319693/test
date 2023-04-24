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
import javax.xml.bind.annotation.XmlType;


/**
 * Review info for the external system.
 * 
 * <p>ExternalReviewType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExternalReviewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Approved" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ReviewerID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReviewID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AssociatedID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReviewType", propOrder = {
    "comment"
})
public class ExternalReviewType {

    @XmlElement(name = "Comment")
    protected FreeTextType comment;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Approved")
    protected Boolean approved;
    @XmlAttribute(name = "ReviewerID")
    protected String reviewerID;
    @XmlAttribute(name = "ReviewID")
    protected String reviewID;
    @XmlAttribute(name = "AssociatedID")
    protected String associatedID;

    /**
     * 获取comment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreeTextType }
     *     
     */
    public FreeTextType getComment() {
        return comment;
    }

    /**
     * 设置comment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextType }
     *     
     */
    public void setComment(FreeTextType value) {
        this.comment = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * 获取approved属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproved() {
        return approved;
    }

    /**
     * 设置approved属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproved(Boolean value) {
        this.approved = value;
    }

    /**
     * 获取reviewerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewerID() {
        return reviewerID;
    }

    /**
     * 设置reviewerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewerID(String value) {
        this.reviewerID = value;
    }

    /**
     * 获取reviewID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewID() {
        return reviewID;
    }

    /**
     * 设置reviewID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewID(String value) {
        this.reviewID = value;
    }

    /**
     * 获取associatedID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedID() {
        return associatedID;
    }

    /**
     * 设置associatedID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedID(String value) {
        this.associatedID = value;
    }

}
