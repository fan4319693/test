//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service reference information.
 * 
 * <p>ServiceRefInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceRefInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TravelerIDRef"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SegmentIDRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServicePrice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeType"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="Redemption" type="{http://www.opentravel.org/OTA/2003/05}FullRedemptionType" minOccurs="0"/>
 *                     &lt;element name="RedemptionCurrency" type="{http://www.opentravel.org/OTA/2003/05}PartialRedemptionType" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}PriceRefKey" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescriptionVariable" type="{http://www.opentravel.org/OTA/2003/05}SrvcDesVariableType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonCodeReq"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ServiceTypeCode"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}Method"/>
 *       &lt;attribute name="AssociationID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRefInfoType", propOrder = {
    "travelerIDRef",
    "segmentIDRef",
    "servicePrice",
    "priceRefKey",
    "description",
    "descriptionVariable"
})
public class ServiceRefInfoType {

    @XmlElement(name = "TravelerIDRef", required = true)
    protected TravelerIDRefType travelerIDRef;
    @XmlElement(name = "SegmentIDRef")
    protected List<SegmentIDRefType> segmentIDRef;
    @XmlElement(name = "ServicePrice")
    protected ServiceRefInfoType.ServicePrice servicePrice;
    @XmlElement(name = "PriceRefKey")
    protected String priceRefKey;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "DescriptionVariable")
    protected SrvcDesVariableType descriptionVariable;
    @XmlAttribute(name = "AssociationID", required = true)
    protected String associationID;
    @XmlAttribute(name = "ReasonCode", required = true)
    protected String reasonCode;
    @XmlAttribute(name = "ServiceType")
    protected String serviceType;
    @XmlAttribute(name = "ServiceCode")
    protected String serviceCode;
    @XmlAttribute(name = "SubCode")
    protected String subCode;
    @XmlAttribute(name = "Method", required = true)
    protected String method;

    /**
     * 获取travelerIDRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelerIDRefType }
     *     
     */
    public TravelerIDRefType getTravelerIDRef() {
        return travelerIDRef;
    }

    /**
     * 设置travelerIDRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerIDRefType }
     *     
     */
    public void setTravelerIDRef(TravelerIDRefType value) {
        this.travelerIDRef = value;
    }

    /**
     * Gets the value of the segmentIDRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentIDRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentIDRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentIDRefType }
     * 
     * 
     */
    public List<SegmentIDRefType> getSegmentIDRef() {
        if (segmentIDRef == null) {
            segmentIDRef = new ArrayList<SegmentIDRefType>();
        }
        return this.segmentIDRef;
    }

    /**
     * 获取servicePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceRefInfoType.ServicePrice }
     *     
     */
    public ServiceRefInfoType.ServicePrice getServicePrice() {
        return servicePrice;
    }

    /**
     * 设置servicePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRefInfoType.ServicePrice }
     *     
     */
    public void setServicePrice(ServiceRefInfoType.ServicePrice value) {
        this.servicePrice = value;
    }

    /**
     * 获取priceRefKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRefKey() {
        return priceRefKey;
    }

    /**
     * 设置priceRefKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRefKey(String value) {
        this.priceRefKey = value;
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
     * 获取descriptionVariable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SrvcDesVariableType }
     *     
     */
    public SrvcDesVariableType getDescriptionVariable() {
        return descriptionVariable;
    }

    /**
     * 设置descriptionVariable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SrvcDesVariableType }
     *     
     */
    public void setDescriptionVariable(SrvcDesVariableType value) {
        this.descriptionVariable = value;
    }

    /**
     * 获取associationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationID() {
        return associationID;
    }

    /**
     * 设置associationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationID(String value) {
        this.associationID = value;
    }

    /**
     * 获取reasonCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * 设置reasonCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * 获取serviceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * 设置serviceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * 获取serviceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * 设置serviceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * 获取subCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * 设置subCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

    /**
     * 获取method属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置method属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
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
     *         &lt;element name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeType"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="Redemption" type="{http://www.opentravel.org/OTA/2003/05}FullRedemptionType" minOccurs="0"/>
     *           &lt;element name="RedemptionCurrency" type="{http://www.opentravel.org/OTA/2003/05}PartialRedemptionType" minOccurs="0"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currencyCode",
        "redemption",
        "redemptionCurrency"
    })
    public static class ServicePrice {

        @XmlElement(name = "CurrencyCode", required = true)
        protected CurrencyCodeType currencyCode;
        @XmlElement(name = "Redemption")
        protected FullRedemptionType redemption;
        @XmlElement(name = "RedemptionCurrency")
        protected PartialRedemptionType redemptionCurrency;
        @XmlAttribute(name = "Total", required = true)
        protected BigInteger total;

        /**
         * 获取currencyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CurrencyCodeType }
         *     
         */
        public CurrencyCodeType getCurrencyCode() {
            return currencyCode;
        }

        /**
         * 设置currencyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyCodeType }
         *     
         */
        public void setCurrencyCode(CurrencyCodeType value) {
            this.currencyCode = value;
        }

        /**
         * 获取redemption属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FullRedemptionType }
         *     
         */
        public FullRedemptionType getRedemption() {
            return redemption;
        }

        /**
         * 设置redemption属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FullRedemptionType }
         *     
         */
        public void setRedemption(FullRedemptionType value) {
            this.redemption = value;
        }

        /**
         * 获取redemptionCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PartialRedemptionType }
         *     
         */
        public PartialRedemptionType getRedemptionCurrency() {
            return redemptionCurrency;
        }

        /**
         * 设置redemptionCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PartialRedemptionType }
         *     
         */
        public void setRedemptionCurrency(PartialRedemptionType value) {
            this.redemptionCurrency = value;
        }

        /**
         * 获取total属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotal() {
            return total;
        }

        /**
         * 设置total属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotal(BigInteger value) {
            this.total = value;
        }

    }

}
