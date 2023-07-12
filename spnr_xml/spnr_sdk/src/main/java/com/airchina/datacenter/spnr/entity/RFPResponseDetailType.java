//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Provides an area to send comments regarding the RFP response.
 * 
 * <p>RFP_ResponseDetailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RFP_ResponseDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeliveryResponseGroup"/>
 *       &lt;attribute name="DetailIncludedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DeclineIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DeclineReasonCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="CodeDetail" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFP_ResponseDetailType", propOrder = {
    "comments"
})
public class RFPResponseDetailType {

    @XmlElement(name = "Comments")
    protected RFPResponseDetailType.Comments comments;
    @XmlAttribute(name = "DetailIncludedIndicator")
    protected Boolean detailIncludedIndicator;
    @XmlAttribute(name = "DeclineIndicator")
    protected Boolean declineIndicator;
    @XmlAttribute(name = "DeclineReasonCode")
    protected String declineReasonCode;
    @XmlAttribute(name = "CodeDetail")
    protected String codeDetail;
    @XmlAttribute(name = "MinimumTime")
    protected Duration minimumTime;
    @XmlAttribute(name = "MaximumTime")
    protected Duration maximumTime;
    @XmlAttribute(name = "ResponseMethod")
    protected String responseMethod;
    @XmlAttribute(name = "ResponseTimeUnit")
    protected String responseTimeUnit;

    /**
     * 获取comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RFPResponseDetailType.Comments }
     *     
     */
    public RFPResponseDetailType.Comments getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RFPResponseDetailType.Comments }
     *     
     */
    public void setComments(RFPResponseDetailType.Comments value) {
        this.comments = value;
    }

    /**
     * 获取detailIncludedIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetailIncludedIndicator() {
        return detailIncludedIndicator;
    }

    /**
     * 设置detailIncludedIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailIncludedIndicator(Boolean value) {
        this.detailIncludedIndicator = value;
    }

    /**
     * 获取declineIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeclineIndicator() {
        return declineIndicator;
    }

    /**
     * 设置declineIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeclineIndicator(Boolean value) {
        this.declineIndicator = value;
    }

    /**
     * 获取declineReasonCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclineReasonCode() {
        return declineReasonCode;
    }

    /**
     * 设置declineReasonCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclineReasonCode(String value) {
        this.declineReasonCode = value;
    }

    /**
     * 获取codeDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDetail() {
        return codeDetail;
    }

    /**
     * 设置codeDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDetail(String value) {
        this.codeDetail = value;
    }

    /**
     * 获取minimumTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumTime() {
        return minimumTime;
    }

    /**
     * 设置minimumTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumTime(Duration value) {
        this.minimumTime = value;
    }

    /**
     * 获取maximumTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumTime() {
        return maximumTime;
    }

    /**
     * 设置maximumTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumTime(Duration value) {
        this.maximumTime = value;
    }

    /**
     * 获取responseMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMethod() {
        return responseMethod;
    }

    /**
     * 设置responseMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMethod(String value) {
        this.responseMethod = value;
    }

    /**
     * 获取responseTimeUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseTimeUnit() {
        return responseTimeUnit;
    }

    /**
     * 设置responseTimeUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTimeUnit(String value) {
        this.responseTimeUnit = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comment"
    })
    public static class Comments {

        @XmlElement(name = "Comment", required = true)
        protected List<ParagraphType> comment;

        /**
         * Gets the value of the comment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         * 
         * 
         */
        public List<ParagraphType> getComment() {
            if (comment == null) {
                comment = new ArrayList<ParagraphType>();
            }
            return this.comment;
        }

    }

}
