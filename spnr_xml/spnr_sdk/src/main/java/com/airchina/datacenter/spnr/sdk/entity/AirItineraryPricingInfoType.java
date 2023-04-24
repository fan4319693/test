//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

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
 * Pricing Information for an Air Itinerary
 * 
 * <p>AirItineraryPricingInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirItineraryPricingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItinTotalFare" type="{http://www.opentravel.org/OTA/2003/05}FareType" minOccurs="0"/>
 *         &lt;element name="PTC_FareBreakdowns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PTC_FareBreakdown" type="{http://www.opentravel.org/OTA/2003/05}PTCFareBreakdownType" maxOccurs="20"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareInfo" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareSource" type="{http://www.opentravel.org/OTA/2003/05}FareSourceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecialServiceRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SpecialServiceRequest" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialServiceRequestType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BagAllowRefs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BagAllowRef" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="OriginDestinationRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="BaggageRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Loyalty" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType">
 *                 &lt;sequence>
 *                   &lt;element name="PricingParameters">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PricingParameter" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Tags" type="{http://www.opentravel.org/OTA/2003/05}TagsType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://www.opentravel.org/OTA/2003/05}PricingSourceType" />
 *       &lt;attribute name="PricingScope" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PriceRange" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="API_RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="OD_RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="ResBookDesigCodeList" type="{http://www.opentravel.org/OTA/2003/05}ListOfStringLength1to8" />
 *       &lt;attribute name="LoyaltyPricingType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MinGroupSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PriceQuoteDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *       &lt;attribute name="PriceLeastPassengerQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="GroupFareInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItineraryPricingInfoType", propOrder = {
    "itinTotalFare",
    "ptcFareBreakdowns",
    "fareInfos",
    "fareSource",
    "specialServiceRequests",
    "bagAllowRefs",
    "loyalty",
    "tags",
    "tpaExtensions"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.AirSearchCriteriaType.AirItineraryPricingInfo.class,
    com.airchina.datacenter.spnr.sdk.entity.PricedItineraryType.AirItineraryPricingInfo.class,
    BookingPriceInfoType.class,
    com.airchina.datacenter.spnr.sdk.entity.AirReservationType.AirItineraryPricingInfo.class
})
public class AirItineraryPricingInfoType {

    @XmlElement(name = "ItinTotalFare")
    protected FareType itinTotalFare;
    @XmlElement(name = "PTC_FareBreakdowns")
    protected AirItineraryPricingInfoType.PTCFareBreakdowns ptcFareBreakdowns;
    @XmlElement(name = "FareInfos")
    protected AirItineraryPricingInfoType.FareInfos fareInfos;
    @XmlElement(name = "FareSource")
    protected List<FareSourceType> fareSource;
    @XmlElement(name = "SpecialServiceRequests")
    protected AirItineraryPricingInfoType.SpecialServiceRequests specialServiceRequests;
    @XmlElement(name = "BagAllowRefs")
    protected AirItineraryPricingInfoType.BagAllowRefs bagAllowRefs;
    @XmlElement(name = "Loyalty")
    protected AirItineraryPricingInfoType.Loyalty loyalty;
    @XmlElement(name = "Tags")
    protected TagsType tags;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "PricingSource")
    protected PricingSourceType pricingSource;
    @XmlAttribute(name = "PricingScope")
    protected String pricingScope;
    @XmlAttribute(name = "PriceRange")
    protected Integer priceRange;
    @XmlAttribute(name = "API_RPH")
    protected String apirph;
    @XmlAttribute(name = "OD_RPH")
    protected String odrph;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "ResBookDesigCodeList")
    protected List<String> resBookDesigCodeList;
    @XmlAttribute(name = "LoyaltyPricingType")
    @XmlSchemaType(name = "anySimpleType")
    protected String loyaltyPricingType;
    @XmlAttribute(name = "MinGroupSize")
    protected BigInteger minGroupSize;
    @XmlAttribute(name = "PriceQuoteDate")
    protected String priceQuoteDate;
    @XmlAttribute(name = "PriceLeastPassengerQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger priceLeastPassengerQuantity;
    @XmlAttribute(name = "GroupFareInd")
    protected Boolean groupFareInd;

    /**
     * 获取itinTotalFare属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getItinTotalFare() {
        return itinTotalFare;
    }

    /**
     * 设置itinTotalFare属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setItinTotalFare(FareType value) {
        this.itinTotalFare = value;
    }

    /**
     * 获取ptcFareBreakdowns属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType.PTCFareBreakdowns }
     *     
     */
    public AirItineraryPricingInfoType.PTCFareBreakdowns getPTCFareBreakdowns() {
        return ptcFareBreakdowns;
    }

    /**
     * 设置ptcFareBreakdowns属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType.PTCFareBreakdowns }
     *     
     */
    public void setPTCFareBreakdowns(AirItineraryPricingInfoType.PTCFareBreakdowns value) {
        this.ptcFareBreakdowns = value;
    }

    /**
     * 获取fareInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType.FareInfos }
     *     
     */
    public AirItineraryPricingInfoType.FareInfos getFareInfos() {
        return fareInfos;
    }

    /**
     * 设置fareInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType.FareInfos }
     *     
     */
    public void setFareInfos(AirItineraryPricingInfoType.FareInfos value) {
        this.fareInfos = value;
    }

    /**
     * Gets the value of the fareSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSourceType }
     * 
     * 
     */
    public List<FareSourceType> getFareSource() {
        if (fareSource == null) {
            fareSource = new ArrayList<FareSourceType>();
        }
        return this.fareSource;
    }

    /**
     * 获取specialServiceRequests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType.SpecialServiceRequests }
     *     
     */
    public AirItineraryPricingInfoType.SpecialServiceRequests getSpecialServiceRequests() {
        return specialServiceRequests;
    }

    /**
     * 设置specialServiceRequests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType.SpecialServiceRequests }
     *     
     */
    public void setSpecialServiceRequests(AirItineraryPricingInfoType.SpecialServiceRequests value) {
        this.specialServiceRequests = value;
    }

    /**
     * 获取bagAllowRefs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType.BagAllowRefs }
     *     
     */
    public AirItineraryPricingInfoType.BagAllowRefs getBagAllowRefs() {
        return bagAllowRefs;
    }

    /**
     * 设置bagAllowRefs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType.BagAllowRefs }
     *     
     */
    public void setBagAllowRefs(AirItineraryPricingInfoType.BagAllowRefs value) {
        this.bagAllowRefs = value;
    }

    /**
     * 获取loyalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType.Loyalty }
     *     
     */
    public AirItineraryPricingInfoType.Loyalty getLoyalty() {
        return loyalty;
    }

    /**
     * 设置loyalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType.Loyalty }
     *     
     */
    public void setLoyalty(AirItineraryPricingInfoType.Loyalty value) {
        this.loyalty = value;
    }

    /**
     * 获取tags属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TagsType }
     *     
     */
    public TagsType getTags() {
        return tags;
    }

    /**
     * 设置tags属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TagsType }
     *     
     */
    public void setTags(TagsType value) {
        this.tags = value;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * 获取pricingSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricingSourceType }
     *     
     */
    public PricingSourceType getPricingSource() {
        return pricingSource;
    }

    /**
     * 设置pricingSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSourceType }
     *     
     */
    public void setPricingSource(PricingSourceType value) {
        this.pricingSource = value;
    }

    /**
     * 获取pricingScope属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingScope() {
        return pricingScope;
    }

    /**
     * 设置pricingScope属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingScope(String value) {
        this.pricingScope = value;
    }

    /**
     * 获取priceRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriceRange() {
        return priceRange;
    }

    /**
     * 设置priceRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriceRange(Integer value) {
        this.priceRange = value;
    }

    /**
     * 获取apirph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPIRPH() {
        return apirph;
    }

    /**
     * 设置apirph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPIRPH(String value) {
        this.apirph = value;
    }

    /**
     * 获取odrph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODRPH() {
        return odrph;
    }

    /**
     * 设置odrph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODRPH(String value) {
        this.odrph = value;
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
     * Gets the value of the resBookDesigCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resBookDesigCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResBookDesigCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResBookDesigCodeList() {
        if (resBookDesigCodeList == null) {
            resBookDesigCodeList = new ArrayList<String>();
        }
        return this.resBookDesigCodeList;
    }

    /**
     * 获取loyaltyPricingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyPricingType() {
        return loyaltyPricingType;
    }

    /**
     * 设置loyaltyPricingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyPricingType(String value) {
        this.loyaltyPricingType = value;
    }

    /**
     * 获取minGroupSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinGroupSize() {
        return minGroupSize;
    }

    /**
     * 设置minGroupSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinGroupSize(BigInteger value) {
        this.minGroupSize = value;
    }

    /**
     * 获取priceQuoteDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceQuoteDate() {
        return priceQuoteDate;
    }

    /**
     * 设置priceQuoteDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceQuoteDate(String value) {
        this.priceQuoteDate = value;
    }

    /**
     * 获取priceLeastPassengerQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriceLeastPassengerQuantity() {
        return priceLeastPassengerQuantity;
    }

    /**
     * 设置priceLeastPassengerQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriceLeastPassengerQuantity(BigInteger value) {
        this.priceLeastPassengerQuantity = value;
    }

    /**
     * 获取groupFareInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupFareInd() {
        return groupFareInd;
    }

    /**
     * 设置groupFareInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupFareInd(Boolean value) {
        this.groupFareInd = value;
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
     *         &lt;element name="BagAllowRef" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="OriginDestinationRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="BaggageRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "bagAllowRef"
    })
    public static class BagAllowRefs {

        @XmlElement(name = "BagAllowRef")
        protected List<AirItineraryPricingInfoType.BagAllowRefs.BagAllowRef> bagAllowRef;

        /**
         * Gets the value of the bagAllowRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bagAllowRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBagAllowRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirItineraryPricingInfoType.BagAllowRefs.BagAllowRef }
         * 
         * 
         */
        public List<AirItineraryPricingInfoType.BagAllowRefs.BagAllowRef> getBagAllowRef() {
            if (bagAllowRef == null) {
                bagAllowRef = new ArrayList<AirItineraryPricingInfoType.BagAllowRefs.BagAllowRef>();
            }
            return this.bagAllowRef;
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
         *       &lt;attribute name="OriginDestinationRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="BaggageRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BagAllowRef {

            @XmlAttribute(name = "OriginDestinationRPH")
            protected String originDestinationRPH;
            @XmlAttribute(name = "FlightSegmentRPH")
            protected String flightSegmentRPH;
            @XmlAttribute(name = "BaggageRPH", required = true)
            protected String baggageRPH;

            /**
             * 获取originDestinationRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginDestinationRPH() {
                return originDestinationRPH;
            }

            /**
             * 设置originDestinationRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginDestinationRPH(String value) {
                this.originDestinationRPH = value;
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
             * 获取baggageRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBaggageRPH() {
                return baggageRPH;
            }

            /**
             * 设置baggageRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBaggageRPH(String value) {
                this.baggageRPH = value;
            }

        }

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
     *         &lt;element name="FareInfo" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fareInfo"
    })
    public static class FareInfos {

        @XmlElement(name = "FareInfo", required = true)
        protected List<AirItineraryPricingInfoType.FareInfos.FareInfo> fareInfo;
        @XmlAttribute(name = "Seq")
        @XmlSchemaType(name = "anySimpleType")
        protected String seq;

        /**
         * Gets the value of the fareInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirItineraryPricingInfoType.FareInfos.FareInfo }
         * 
         * 
         */
        public List<AirItineraryPricingInfoType.FareInfos.FareInfo> getFareInfo() {
            if (fareInfo == null) {
                fareInfo = new ArrayList<AirItineraryPricingInfoType.FareInfos.FareInfo>();
            }
            return this.fareInfo;
        }

        /**
         * 获取seq属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeq() {
            return seq;
        }

        /**
         * 设置seq属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeq(String value) {
            this.seq = value;
        }


        /**
         *  Information used to define a fare and its associated rules information.
         * 
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tpaExtensions"
        })
        public static class FareInfo
            extends FareInfoType
        {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;

            /**
             * 获取tpaExtensions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TPAExtensionsType }
             *     
             */
            public TPAExtensionsType getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * 设置tpaExtensions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TPAExtensionsType }
             *     
             */
            public void setTPAExtensions(TPAExtensionsType value) {
                this.tpaExtensions = value;
            }

        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType">
     *       &lt;sequence>
     *         &lt;element name="PricingParameters">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PricingParameter" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pricingParameters"
    })
    public static class Loyalty
        extends LoyaltyPricingType
    {

        @XmlElement(name = "PricingParameters", required = true)
        protected AirItineraryPricingInfoType.Loyalty.PricingParameters pricingParameters;

        /**
         * 获取pricingParameters属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirItineraryPricingInfoType.Loyalty.PricingParameters }
         *     
         */
        public AirItineraryPricingInfoType.Loyalty.PricingParameters getPricingParameters() {
            return pricingParameters;
        }

        /**
         * 设置pricingParameters属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirItineraryPricingInfoType.Loyalty.PricingParameters }
         *     
         */
        public void setPricingParameters(AirItineraryPricingInfoType.Loyalty.PricingParameters value) {
            this.pricingParameters = value;
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
         *         &lt;element name="PricingParameter" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "pricingParameter"
        })
        public static class PricingParameters {

            @XmlElement(name = "PricingParameter", required = true)
            protected List<AirItineraryPricingInfoType.Loyalty.PricingParameters.PricingParameter> pricingParameter;

            /**
             * Gets the value of the pricingParameter property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pricingParameter property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPricingParameter().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirItineraryPricingInfoType.Loyalty.PricingParameters.PricingParameter }
             * 
             * 
             */
            public List<AirItineraryPricingInfoType.Loyalty.PricingParameters.PricingParameter> getPricingParameter() {
                if (pricingParameter == null) {
                    pricingParameter = new ArrayList<AirItineraryPricingInfoType.Loyalty.PricingParameters.PricingParameter>();
                }
                return this.pricingParameter;
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
             *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PricingParameter {

                @XmlAttribute(name = "Code", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String code;

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

            }

        }

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
     *         &lt;element name="PTC_FareBreakdown" type="{http://www.opentravel.org/OTA/2003/05}PTCFareBreakdownType" maxOccurs="20"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ptcFareBreakdown"
    })
    public static class PTCFareBreakdowns {

        @XmlElement(name = "PTC_FareBreakdown", required = true)
        protected List<PTCFareBreakdownType> ptcFareBreakdown;
        @XmlAttribute(name = "Seq")
        @XmlSchemaType(name = "anySimpleType")
        protected String seq;

        /**
         * Gets the value of the ptcFareBreakdown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptcFareBreakdown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPTCFareBreakdown().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType }
         * 
         * 
         */
        public List<PTCFareBreakdownType> getPTCFareBreakdown() {
            if (ptcFareBreakdown == null) {
                ptcFareBreakdown = new ArrayList<PTCFareBreakdownType>();
            }
            return this.ptcFareBreakdown;
        }

        /**
         * 获取seq属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeq() {
            return seq;
        }

        /**
         * 设置seq属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeq(String value) {
            this.seq = value;
        }

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
     *         &lt;element name="SpecialServiceRequest" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialServiceRequestType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "specialServiceRequest"
    })
    public static class SpecialServiceRequests {

        @XmlElement(name = "SpecialServiceRequest", required = true)
        protected List<AirItineraryPricingInfoType.SpecialServiceRequests.SpecialServiceRequest> specialServiceRequest;

        /**
         * Gets the value of the specialServiceRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialServiceRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialServiceRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirItineraryPricingInfoType.SpecialServiceRequests.SpecialServiceRequest }
         * 
         * 
         */
        public List<AirItineraryPricingInfoType.SpecialServiceRequests.SpecialServiceRequest> getSpecialServiceRequest() {
            if (specialServiceRequest == null) {
                specialServiceRequest = new ArrayList<AirItineraryPricingInfoType.SpecialServiceRequests.SpecialServiceRequest>();
            }
            return this.specialServiceRequest;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialServiceRequestType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SpecialServiceRequest
            extends SpecialServiceRequestType
        {


        }

    }

}
