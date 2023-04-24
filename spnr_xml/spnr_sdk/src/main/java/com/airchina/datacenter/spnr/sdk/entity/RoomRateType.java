//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Individual rate amount. This rate is valid for a range of number of occupants and an occupant type.
 * 
 * <p>RoomRateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rates" type="{http://www.opentravel.org/OTA/2003/05}RateType"/>
 *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
 *         &lt;element name="RoomRateDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element name="Features" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Feature" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RoomAmenity" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Quantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *                           &lt;attribute name="RoomViewCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RatePlanGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EffectiveExpireOptionalDateGroup"/>
 *       &lt;attribute name="BookingCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="BedTypeID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RoomTypeCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="InvBlockCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="NumberOfUnits" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
 *       &lt;attribute name="RoomRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="SessionControlled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Seamless" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AssignedLayout" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AverageBaseRate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="AverageRate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="AveragePointsRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="MaxNightlyRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomRateType", propOrder = {
    "rates",
    "loyalty",
    "roomRateDescription",
    "features",
    "total"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.RoomStayType.RoomRates.RoomRate.class
})
public class RoomRateType {

    @XmlElement(name = "Rates", required = true)
    protected RateType rates;
    @XmlElement(name = "Loyalty")
    protected LoyaltyPricingType loyalty;
    @XmlElement(name = "RoomRateDescription")
    protected ParagraphType roomRateDescription;
    @XmlElement(name = "Features")
    protected RoomRateType.Features features;
    @XmlElement(name = "Total")
    protected TotalType total;
    @XmlAttribute(name = "BookingCode")
    protected String bookingCode;
    @XmlAttribute(name = "BedTypeID")
    @XmlSchemaType(name = "anySimpleType")
    protected String bedTypeID;
    @XmlAttribute(name = "RoomTypeCode")
    protected String roomTypeCode;
    @XmlAttribute(name = "InvBlockCode")
    protected String invBlockCode;
    @XmlAttribute(name = "NumberOfUnits")
    protected Integer numberOfUnits;
    @XmlAttribute(name = "AvailabilityStatus")
    protected String availabilityStatus;
    @XmlAttribute(name = "RoomRPH")
    protected String roomRPH;
    @XmlAttribute(name = "SessionControlled")
    protected Boolean sessionControlled;
    @XmlAttribute(name = "Seamless")
    protected Boolean seamless;
    @XmlAttribute(name = "MealPlanCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String mealPlanCode;
    @XmlAttribute(name = "AssignedLayout")
    @XmlSchemaType(name = "anySimpleType")
    protected String assignedLayout;
    @XmlAttribute(name = "AverageBaseRate", required = true)
    protected float averageBaseRate;
    @XmlAttribute(name = "AverageRate", required = true)
    protected float averageRate;
    @XmlAttribute(name = "AveragePointsRate")
    protected Float averagePointsRate;
    @XmlAttribute(name = "MaxNightlyRate")
    protected Float maxNightlyRate;
    @XmlAttribute(name = "RatePlanType")
    protected String ratePlanType;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "RatePlanID")
    protected String ratePlanID;
    @XmlAttribute(name = "RatePlanQualifier")
    protected Boolean ratePlanQualifier;
    @XmlAttribute(name = "RatePlanCategory")
    protected String ratePlanCategory;
    @XmlAttribute(name = "Reference")
    protected Integer reference;
    @XmlAttribute(name = "PromotionCode")
    protected String promotionCode;
    @XmlAttribute(name = "PromotionVendorCode")
    protected List<String> promotionVendorCode;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * 获取rates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getRates() {
        return rates;
    }

    /**
     * 设置rates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setRates(RateType value) {
        this.rates = value;
    }

    /**
     * 获取loyalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyPricingType }
     *     
     */
    public LoyaltyPricingType getLoyalty() {
        return loyalty;
    }

    /**
     * 设置loyalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyPricingType }
     *     
     */
    public void setLoyalty(LoyaltyPricingType value) {
        this.loyalty = value;
    }

    /**
     * 获取roomRateDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getRoomRateDescription() {
        return roomRateDescription;
    }

    /**
     * 设置roomRateDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setRoomRateDescription(ParagraphType value) {
        this.roomRateDescription = value;
    }

    /**
     * 获取features属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomRateType.Features }
     *     
     */
    public RoomRateType.Features getFeatures() {
        return features;
    }

    /**
     * 设置features属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRateType.Features }
     *     
     */
    public void setFeatures(RoomRateType.Features value) {
        this.features = value;
    }

    /**
     * 获取total属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setTotal(TotalType value) {
        this.total = value;
    }

    /**
     * 获取bookingCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * 设置bookingCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * 获取bedTypeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedTypeID() {
        return bedTypeID;
    }

    /**
     * 设置bedTypeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedTypeID(String value) {
        this.bedTypeID = value;
    }

    /**
     * 获取roomTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * 设置roomTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    /**
     * 获取invBlockCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvBlockCode() {
        return invBlockCode;
    }

    /**
     * 设置invBlockCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvBlockCode(String value) {
        this.invBlockCode = value;
    }

    /**
     * 获取numberOfUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * 设置numberOfUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfUnits(Integer value) {
        this.numberOfUnits = value;
    }

    /**
     * 获取availabilityStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * 设置availabilityStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityStatus(String value) {
        this.availabilityStatus = value;
    }

    /**
     * 获取roomRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomRPH() {
        return roomRPH;
    }

    /**
     * 设置roomRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomRPH(String value) {
        this.roomRPH = value;
    }

    /**
     * 获取sessionControlled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionControlled() {
        return sessionControlled;
    }

    /**
     * 设置sessionControlled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionControlled(Boolean value) {
        this.sessionControlled = value;
    }

    /**
     * 获取seamless属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeamless() {
        return seamless;
    }

    /**
     * 设置seamless属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeamless(Boolean value) {
        this.seamless = value;
    }

    /**
     * 获取mealPlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealPlanCode() {
        return mealPlanCode;
    }

    /**
     * 设置mealPlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealPlanCode(String value) {
        this.mealPlanCode = value;
    }

    /**
     * 获取assignedLayout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedLayout() {
        return assignedLayout;
    }

    /**
     * 设置assignedLayout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedLayout(String value) {
        this.assignedLayout = value;
    }

    /**
     * 获取averageBaseRate属性的值。
     * 
     */
    public float getAverageBaseRate() {
        return averageBaseRate;
    }

    /**
     * 设置averageBaseRate属性的值。
     * 
     */
    public void setAverageBaseRate(float value) {
        this.averageBaseRate = value;
    }

    /**
     * 获取averageRate属性的值。
     * 
     */
    public float getAverageRate() {
        return averageRate;
    }

    /**
     * 设置averageRate属性的值。
     * 
     */
    public void setAverageRate(float value) {
        this.averageRate = value;
    }

    /**
     * 获取averagePointsRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAveragePointsRate() {
        return averagePointsRate;
    }

    /**
     * 设置averagePointsRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAveragePointsRate(Float value) {
        this.averagePointsRate = value;
    }

    /**
     * 获取maxNightlyRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxNightlyRate() {
        return maxNightlyRate;
    }

    /**
     * 设置maxNightlyRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxNightlyRate(Float value) {
        this.maxNightlyRate = value;
    }

    /**
     * 获取ratePlanType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * 设置ratePlanType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * 获取ratePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * 设置ratePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * 获取ratePlanID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanID() {
        return ratePlanID;
    }

    /**
     * 设置ratePlanID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanID(String value) {
        this.ratePlanID = value;
    }

    /**
     * 获取ratePlanQualifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRatePlanQualifier() {
        return ratePlanQualifier;
    }

    /**
     * 设置ratePlanQualifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRatePlanQualifier(Boolean value) {
        this.ratePlanQualifier = value;
    }

    /**
     * 获取ratePlanCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCategory() {
        return ratePlanCategory;
    }

    /**
     * 设置ratePlanCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCategory(String value) {
        this.ratePlanCategory = value;
    }

    /**
     * 获取reference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReference() {
        return reference;
    }

    /**
     * 设置reference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReference(Integer value) {
        this.reference = value;
    }

    /**
     * 获取promotionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * 设置promotionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the promotionVendorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionVendorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPromotionVendorCode() {
        if (promotionVendorCode == null) {
            promotionVendorCode = new ArrayList<String>();
        }
        return this.promotionVendorCode;
    }

    /**
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * 获取expireDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * 设置expireDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
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
     *         &lt;element name="Feature" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RoomAmenity" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Quantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
     *                 &lt;attribute name="RoomViewCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
        "feature"
    })
    public static class Features {

        @XmlElement(name = "Feature")
        protected List<RoomRateType.Features.Feature> feature;

        /**
         * Gets the value of the feature property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feature property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeature().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomRateType.Features.Feature }
         * 
         * 
         */
        public List<RoomRateType.Features.Feature> getFeature() {
            if (feature == null) {
                feature = new ArrayList<RoomRateType.Features.Feature>();
            }
            return this.feature;
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
         *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="RoomAmenity" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Quantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
         *       &lt;attribute name="RoomViewCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description"
        })
        public static class Feature {

            @XmlElement(name = "Description")
            protected List<ParagraphType> description;
            @XmlAttribute(name = "RoomAmenity")
            protected String roomAmenity;
            @XmlAttribute(name = "Quantity")
            protected Integer quantity;
            @XmlAttribute(name = "RoomViewCode")
            protected String roomViewCode;

            /**
             * Gets the value of the description property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the description property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ParagraphType }
             * 
             * 
             */
            public List<ParagraphType> getDescription() {
                if (description == null) {
                    description = new ArrayList<ParagraphType>();
                }
                return this.description;
            }

            /**
             * 获取roomAmenity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomAmenity() {
                return roomAmenity;
            }

            /**
             * 设置roomAmenity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomAmenity(String value) {
                this.roomAmenity = value;
            }

            /**
             * 获取quantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getQuantity() {
                return quantity;
            }

            /**
             * 设置quantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setQuantity(Integer value) {
                this.quantity = value;
            }

            /**
             * 获取roomViewCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomViewCode() {
                return roomViewCode;
            }

            /**
             * 设置roomViewCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomViewCode(String value) {
                this.roomViewCode = value;
            }

        }

    }

}
