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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information significant to defining a rate plan.
 * 
 * <p>RatePlanType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RatePlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}OJ_RatePlanGroup"/>
 *         &lt;element name="Guarantee" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="CancelPolicy" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="MealsIncluded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MealsIncludedGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RatePlanDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element name="RatePlanInclusions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RatePlanInclusionDesciption" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ServiceFeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Commission" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/>
 *         &lt;element name="RestrictionStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RestrictionStatusGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalDetails" type="{http://www.opentravel.org/OTA/2003/05}AdditionalDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EffectiveExpireOptionalDateGroup"/>
 *       &lt;attribute name="BookingCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="16"/>
 *             &lt;minLength value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="RateIndicator" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
 *       &lt;attribute name="RatePlanType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="RatePlanID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="RatePlanName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="MarketCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
 *       &lt;attribute name="ID_RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PriceViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="QualificationType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="RoomRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="PaymentModel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SellingRatePlan" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RatePlanVersion" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanType", propOrder = {
    "releases",
    "regions",
    "userTypes",
    "description",
    "mealPlans",
    "paymentType",
    "paymentModel",
    "notifications",
    "bookingRules",
    "extras",
    "taxesAndMargins",
    "rates",
    "destinationSystemsCode",
    "ratePlanShoulders",
    "sellableProducts",
    "ratePlanLevelFee",
    "uniqueID",
    "childPricings",
    "taxPolicies",
    "specials",
    "sellingMode",
    "guarantee",
    "cancelPenalties",
    "cancelPolicy",
    "mealsIncluded",
    "ratePlanDescription",
    "ratePlanInclusions",
    "commission",
    "restrictionStatus",
    "additionalDetails"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.RoomStayType.RatePlans.RatePlan.class
})
public class RatePlanType {

    @XmlElement(name = "Releases")
    protected RatePlanReleases releases;
    @XmlElement(name = "Regions")
    protected RatePlanRegionRestrictions regions;
    @XmlElement(name = "UserTypes")
    protected RatePlanUserTypeRestrictions userTypes;
    @XmlElement(name = "Description")
    protected List<ParagraphType> description;
    @XmlElement(name = "MealPlans")
    protected RatePlanType.MealPlans mealPlans;
    @XmlElement(name = "PaymentType")
    protected RatePlanType.PaymentType paymentType;
    @XmlElement(name = "PaymentModel")
    protected RatePlanType.PaymentModel paymentModel;
    @XmlElement(name = "Notifications")
    protected RatePlanType.Notifications notifications;
    @XmlElement(name = "BookingRules")
    protected RatePlanType.BookingRules bookingRules;
    @XmlElement(name = "Extras")
    protected RatePlanType.Extras extras;
    @XmlElement(name = "TaxesAndMargins")
    protected RatePlanType.TaxesAndMargins taxesAndMargins;
    @XmlElement(name = "Rates")
    protected RatePlanType.Rates rates;
    @XmlElement(name = "DestinationSystemsCode")
    protected DestinationSystemCodesType destinationSystemsCode;
    @XmlElement(name = "RatePlanShoulders")
    protected RatePlanType.RatePlanShoulders ratePlanShoulders;
    @XmlElement(name = "SellableProducts")
    protected SellableProductsType sellableProducts;
    @XmlElement(name = "RatePlanLevelFee")
    protected RatePlanType.RatePlanLevelFee ratePlanLevelFee;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "ChildPricings")
    protected RatePlanType.ChildPricings childPricings;
    @XmlElement(name = "TaxPolicies")
    protected RatePlanType.TaxPolicies taxPolicies;
    @XmlElement(name = "Specials")
    protected Specials specials;
    @XmlElement(name = "SellingMode")
    protected RatePlanType.SellingMode sellingMode;
    @XmlElement(name = "Guarantee")
    protected List<GuaranteeType> guarantee;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "CancelPolicy")
    protected CancelPenaltiesType cancelPolicy;
    @XmlElement(name = "MealsIncluded")
    protected RatePlanType.MealsIncluded mealsIncluded;
    @XmlElement(name = "RatePlanDescription")
    protected ParagraphType ratePlanDescription;
    @XmlElement(name = "RatePlanInclusions")
    protected RatePlanType.RatePlanInclusions ratePlanInclusions;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "RestrictionStatus")
    protected RatePlanType.RestrictionStatus restrictionStatus;
    @XmlElement(name = "AdditionalDetails")
    protected AdditionalDetailsType additionalDetails;
    @XmlAttribute(name = "BookingCode")
    protected String bookingCode;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "RateIndicator")
    protected String rateIndicator;
    @XmlAttribute(name = "RatePlanType")
    protected String ratePlanType;
    @XmlAttribute(name = "RatePlanID")
    protected String ratePlanID;
    @XmlAttribute(name = "RatePlanName")
    protected String ratePlanName;
    @XmlAttribute(name = "MarketCode")
    protected String marketCode;
    @XmlAttribute(name = "AvailabilityStatus")
    protected String availabilityStatus;
    @XmlAttribute(name = "ID_RequiredInd")
    protected Boolean idRequiredInd;
    @XmlAttribute(name = "PriceViewable")
    protected Boolean priceViewable;
    @XmlAttribute(name = "QualificationType")
    protected String qualificationType;
    @XmlAttribute(name = "RoomRPH")
    protected String roomRPH;
    @XmlAttribute(name = "PaymentModel")
    protected String paymentModelAttr;
    @XmlAttribute(name = "SellingRatePlan")
    protected Boolean sellingRatePlan;
    @XmlAttribute(name = "RatePlanVersion")
    protected Integer ratePlanVersion;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * 获取releases属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanReleases }
     *     
     */
    public RatePlanReleases getReleases() {
        return releases;
    }

    /**
     * 设置releases属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanReleases }
     *     
     */
    public void setReleases(RatePlanReleases value) {
        this.releases = value;
    }

    /**
     * 获取regions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanRegionRestrictions }
     *     
     */
    public RatePlanRegionRestrictions getRegions() {
        return regions;
    }

    /**
     * 设置regions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanRegionRestrictions }
     *     
     */
    public void setRegions(RatePlanRegionRestrictions value) {
        this.regions = value;
    }

    /**
     * 获取userTypes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanUserTypeRestrictions }
     *     
     */
    public RatePlanUserTypeRestrictions getUserTypes() {
        return userTypes;
    }

    /**
     * 设置userTypes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanUserTypeRestrictions }
     *     
     */
    public void setUserTypes(RatePlanUserTypeRestrictions value) {
        this.userTypes = value;
    }

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
     * 获取mealPlans属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.MealPlans }
     *     
     */
    public RatePlanType.MealPlans getMealPlans() {
        return mealPlans;
    }

    /**
     * 设置mealPlans属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.MealPlans }
     *     
     */
    public void setMealPlans(RatePlanType.MealPlans value) {
        this.mealPlans = value;
    }

    /**
     * 获取paymentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.PaymentType }
     *     
     */
    public RatePlanType.PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * 设置paymentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.PaymentType }
     *     
     */
    public void setPaymentType(RatePlanType.PaymentType value) {
        this.paymentType = value;
    }

    /**
     * 获取paymentModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.PaymentModel }
     *     
     */
    public RatePlanType.PaymentModel getPaymentModel() {
        return paymentModel;
    }

    /**
     * 设置paymentModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.PaymentModel }
     *     
     */
    public void setPaymentModel(RatePlanType.PaymentModel value) {
        this.paymentModel = value;
    }

    /**
     * 获取notifications属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.Notifications }
     *     
     */
    public RatePlanType.Notifications getNotifications() {
        return notifications;
    }

    /**
     * 设置notifications属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.Notifications }
     *     
     */
    public void setNotifications(RatePlanType.Notifications value) {
        this.notifications = value;
    }

    /**
     * 获取bookingRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.BookingRules }
     *     
     */
    public RatePlanType.BookingRules getBookingRules() {
        return bookingRules;
    }

    /**
     * 设置bookingRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.BookingRules }
     *     
     */
    public void setBookingRules(RatePlanType.BookingRules value) {
        this.bookingRules = value;
    }

    /**
     * 获取extras属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.Extras }
     *     
     */
    public RatePlanType.Extras getExtras() {
        return extras;
    }

    /**
     * 设置extras属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.Extras }
     *     
     */
    public void setExtras(RatePlanType.Extras value) {
        this.extras = value;
    }

    /**
     * 获取taxesAndMargins属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.TaxesAndMargins }
     *     
     */
    public RatePlanType.TaxesAndMargins getTaxesAndMargins() {
        return taxesAndMargins;
    }

    /**
     * 设置taxesAndMargins属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.TaxesAndMargins }
     *     
     */
    public void setTaxesAndMargins(RatePlanType.TaxesAndMargins value) {
        this.taxesAndMargins = value;
    }

    /**
     * 获取rates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.Rates }
     *     
     */
    public RatePlanType.Rates getRates() {
        return rates;
    }

    /**
     * 设置rates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.Rates }
     *     
     */
    public void setRates(RatePlanType.Rates value) {
        this.rates = value;
    }

    /**
     * 获取destinationSystemsCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestinationSystemCodesType }
     *     
     */
    public DestinationSystemCodesType getDestinationSystemsCode() {
        return destinationSystemsCode;
    }

    /**
     * 设置destinationSystemsCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationSystemCodesType }
     *     
     */
    public void setDestinationSystemsCode(DestinationSystemCodesType value) {
        this.destinationSystemsCode = value;
    }

    /**
     * 获取ratePlanShoulders属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.RatePlanShoulders }
     *     
     */
    public RatePlanType.RatePlanShoulders getRatePlanShoulders() {
        return ratePlanShoulders;
    }

    /**
     * 设置ratePlanShoulders属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.RatePlanShoulders }
     *     
     */
    public void setRatePlanShoulders(RatePlanType.RatePlanShoulders value) {
        this.ratePlanShoulders = value;
    }

    /**
     * 获取sellableProducts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SellableProductsType }
     *     
     */
    public SellableProductsType getSellableProducts() {
        return sellableProducts;
    }

    /**
     * 设置sellableProducts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SellableProductsType }
     *     
     */
    public void setSellableProducts(SellableProductsType value) {
        this.sellableProducts = value;
    }

    /**
     * 获取ratePlanLevelFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.RatePlanLevelFee }
     *     
     */
    public RatePlanType.RatePlanLevelFee getRatePlanLevelFee() {
        return ratePlanLevelFee;
    }

    /**
     * 设置ratePlanLevelFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.RatePlanLevelFee }
     *     
     */
    public void setRatePlanLevelFee(RatePlanType.RatePlanLevelFee value) {
        this.ratePlanLevelFee = value;
    }

    /**
     * 获取uniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * 设置uniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * 获取childPricings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.ChildPricings }
     *     
     */
    public RatePlanType.ChildPricings getChildPricings() {
        return childPricings;
    }

    /**
     * 设置childPricings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.ChildPricings }
     *     
     */
    public void setChildPricings(RatePlanType.ChildPricings value) {
        this.childPricings = value;
    }

    /**
     * 获取taxPolicies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.TaxPolicies }
     *     
     */
    public RatePlanType.TaxPolicies getTaxPolicies() {
        return taxPolicies;
    }

    /**
     * 设置taxPolicies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.TaxPolicies }
     *     
     */
    public void setTaxPolicies(RatePlanType.TaxPolicies value) {
        this.taxPolicies = value;
    }

    /**
     * 获取specials属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Specials }
     *     
     */
    public Specials getSpecials() {
        return specials;
    }

    /**
     * 设置specials属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Specials }
     *     
     */
    public void setSpecials(Specials value) {
        this.specials = value;
    }

    /**
     * 获取sellingMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.SellingMode }
     *     
     */
    public RatePlanType.SellingMode getSellingMode() {
        return sellingMode;
    }

    /**
     * 设置sellingMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.SellingMode }
     *     
     */
    public void setSellingMode(RatePlanType.SellingMode value) {
        this.sellingMode = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteeType }
     * 
     * 
     */
    public List<GuaranteeType> getGuarantee() {
        if (guarantee == null) {
            guarantee = new ArrayList<GuaranteeType>();
        }
        return this.guarantee;
    }

    /**
     * 获取cancelPenalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * 设置cancelPenalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * 获取cancelPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPolicy() {
        return cancelPolicy;
    }

    /**
     * 设置cancelPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPolicy(CancelPenaltiesType value) {
        this.cancelPolicy = value;
    }

    /**
     * 获取mealsIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.MealsIncluded }
     *     
     */
    public RatePlanType.MealsIncluded getMealsIncluded() {
        return mealsIncluded;
    }

    /**
     * 设置mealsIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.MealsIncluded }
     *     
     */
    public void setMealsIncluded(RatePlanType.MealsIncluded value) {
        this.mealsIncluded = value;
    }

    /**
     * 获取ratePlanDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getRatePlanDescription() {
        return ratePlanDescription;
    }

    /**
     * 设置ratePlanDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setRatePlanDescription(ParagraphType value) {
        this.ratePlanDescription = value;
    }

    /**
     * 获取ratePlanInclusions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.RatePlanInclusions }
     *     
     */
    public RatePlanType.RatePlanInclusions getRatePlanInclusions() {
        return ratePlanInclusions;
    }

    /**
     * 设置ratePlanInclusions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.RatePlanInclusions }
     *     
     */
    public void setRatePlanInclusions(RatePlanType.RatePlanInclusions value) {
        this.ratePlanInclusions = value;
    }

    /**
     * 获取commission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * 设置commission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * 获取restrictionStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.RestrictionStatus }
     *     
     */
    public RatePlanType.RestrictionStatus getRestrictionStatus() {
        return restrictionStatus;
    }

    /**
     * 设置restrictionStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.RestrictionStatus }
     *     
     */
    public void setRestrictionStatus(RatePlanType.RestrictionStatus value) {
        this.restrictionStatus = value;
    }

    /**
     * 获取additionalDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDetailsType }
     *     
     */
    public AdditionalDetailsType getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * 设置additionalDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDetailsType }
     *     
     */
    public void setAdditionalDetails(AdditionalDetailsType value) {
        this.additionalDetails = value;
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
     * 获取rateIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateIndicator() {
        return rateIndicator;
    }

    /**
     * 设置rateIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateIndicator(String value) {
        this.rateIndicator = value;
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
     * 获取ratePlanName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanName() {
        return ratePlanName;
    }

    /**
     * 设置ratePlanName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanName(String value) {
        this.ratePlanName = value;
    }

    /**
     * 获取marketCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * 设置marketCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
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
     * 获取idRequiredInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIDRequiredInd() {
        return idRequiredInd;
    }

    /**
     * 设置idRequiredInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIDRequiredInd(Boolean value) {
        this.idRequiredInd = value;
    }

    /**
     * 获取priceViewable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceViewable() {
        return priceViewable;
    }

    /**
     * 设置priceViewable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceViewable(Boolean value) {
        this.priceViewable = value;
    }

    /**
     * 获取qualificationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationType() {
        return qualificationType;
    }

    /**
     * 设置qualificationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationType(String value) {
        this.qualificationType = value;
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
     * 获取paymentModelAttr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentModelAttr() {
        return paymentModelAttr;
    }

    /**
     * 设置paymentModelAttr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentModelAttr(String value) {
        this.paymentModelAttr = value;
    }

    /**
     * 获取sellingRatePlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellingRatePlan() {
        return sellingRatePlan;
    }

    /**
     * 设置sellingRatePlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellingRatePlan(Boolean value) {
        this.sellingRatePlan = value;
    }

    /**
     * 获取ratePlanVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatePlanVersion() {
        return ratePlanVersion;
    }

    /**
     * 设置ratePlanVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatePlanVersion(Integer value) {
        this.ratePlanVersion = value;
    }

    /**
     * 获取createDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * 设置createDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * 获取creatorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * 设置creatorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * 获取lastModifyDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * 设置lastModifyDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * 获取lastModifierID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * 设置lastModifierID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookingRulesType">
     *       &lt;sequence>
     *         &lt;element name="InventoryInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InventoryGroup"/>
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
        "inventoryInfo"
    })
    public static class BookingRules
        extends BookingRulesType
    {

        @XmlElement(name = "InventoryInfo")
        protected RatePlanType.BookingRules.InventoryInfo inventoryInfo;

        /**
         * 获取inventoryInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RatePlanType.BookingRules.InventoryInfo }
         *     
         */
        public RatePlanType.BookingRules.InventoryInfo getInventoryInfo() {
            return inventoryInfo;
        }

        /**
         * 设置inventoryInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RatePlanType.BookingRules.InventoryInfo }
         *     
         */
        public void setInventoryInfo(RatePlanType.BookingRules.InventoryInfo value) {
            this.inventoryInfo = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InventoryGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InventoryInfo {

            @XmlAttribute(name = "InvCodeApplication")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String invCodeApplication;
            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "InvType")
            protected String invType;
            @XmlAttribute(name = "InvTypeCode")
            protected String invTypeCode;
            @XmlAttribute(name = "IsRoom")
            protected Boolean isRoom;

            /**
             * 获取invCodeApplication属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * 设置invCodeApplication属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * 获取invCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * 设置invCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * 获取invType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvType() {
                return invType;
            }

            /**
             * 设置invType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * 获取invTypeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * 设置invTypeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * 获取isRoom属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * 设置isRoom属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
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
     *         &lt;element name="ChildPricing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Pricing" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Ordinal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Price" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="MaxChildAge" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
        "childPricing"
    })
    public static class ChildPricings {

        @XmlElement(name = "ChildPricing")
        protected RatePlanType.ChildPricings.ChildPricing childPricing;

        /**
         * 获取childPricing属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RatePlanType.ChildPricings.ChildPricing }
         *     
         */
        public RatePlanType.ChildPricings.ChildPricing getChildPricing() {
            return childPricing;
        }

        /**
         * 设置childPricing属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RatePlanType.ChildPricings.ChildPricing }
         *     
         */
        public void setChildPricing(RatePlanType.ChildPricings.ChildPricing value) {
            this.childPricing = value;
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
         *         &lt;element name="Pricing" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Ordinal" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Price" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="MaxChildAge" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "pricing"
        })
        public static class ChildPricing {

            @XmlElement(name = "Pricing", required = true)
            protected List<RatePlanType.ChildPricings.ChildPricing.Pricing> pricing;
            @XmlAttribute(name = "MaxChildAge", required = true)
            protected BigInteger maxChildAge;

            /**
             * Gets the value of the pricing property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pricing property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPricing().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RatePlanType.ChildPricings.ChildPricing.Pricing }
             * 
             * 
             */
            public List<RatePlanType.ChildPricings.ChildPricing.Pricing> getPricing() {
                if (pricing == null) {
                    pricing = new ArrayList<RatePlanType.ChildPricings.ChildPricing.Pricing>();
                }
                return this.pricing;
            }

            /**
             * 获取maxChildAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxChildAge() {
                return maxChildAge;
            }

            /**
             * 设置maxChildAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxChildAge(BigInteger value) {
                this.maxChildAge = value;
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
             *       &lt;attribute name="Ordinal" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Price" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Pricing {

                @XmlAttribute(name = "Ordinal")
                protected String ordinal;
                @XmlAttribute(name = "Price", required = true)
                protected float price;

                /**
                 * 获取ordinal属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrdinal() {
                    return ordinal;
                }

                /**
                 * 设置ordinal属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrdinal(String value) {
                    this.ordinal = value;
                }

                /**
                 * 获取price属性的值。
                 * 
                 */
                public float getPrice() {
                    return price;
                }

                /**
                 * 设置price属性的值。
                 * 
                 */
                public void setPrice(float value) {
                    this.price = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Extra">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "extra"
    })
    public static class Extras {

        @XmlElement(name = "Extra")
        protected List<RatePlanType.Extras.Extra> extra;

        /**
         * Gets the value of the extra property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extra property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtra().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatePlanType.Extras.Extra }
         * 
         * 
         */
        public List<RatePlanType.Extras.Extra> getExtra() {
            if (extra == null) {
                extra = new ArrayList<RatePlanType.Extras.Extra>();
            }
            return this.extra;
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
         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Extra {

            @XmlAttribute(name = "Code", required = true)
            protected String code;
            @XmlAttribute(name = "Mandatory")
            protected Boolean mandatory;

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
             * 获取mandatory属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMandatory() {
                return mandatory;
            }

            /**
             * 设置mandatory属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMandatory(Boolean value) {
                this.mandatory = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="MealPlan">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "mealPlan"
    })
    public static class MealPlans {

        @XmlElement(name = "MealPlan")
        protected List<RatePlanType.MealPlans.MealPlan> mealPlan;

        /**
         * Gets the value of the mealPlan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mealPlan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMealPlan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatePlanType.MealPlans.MealPlan }
         * 
         * 
         */
        public List<RatePlanType.MealPlans.MealPlan> getMealPlan() {
            if (mealPlan == null) {
                mealPlan = new ArrayList<RatePlanType.MealPlans.MealPlan>();
            }
            return this.mealPlan;
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
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MealPlan {

            @XmlAttribute(name = "Code")
            @XmlSchemaType(name = "anySimpleType")
            protected String code;
            @XmlAttribute(name = "Name")
            protected String name;

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
             * 获取name属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * 设置name属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MealsIncludedGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MealsIncluded {

        @XmlAttribute(name = "Breakfast")
        protected Boolean breakfast;
        @XmlAttribute(name = "Lunch")
        protected Boolean lunch;
        @XmlAttribute(name = "Dinner")
        protected Boolean dinner;
        @XmlAttribute(name = "MealPlanIndicator")
        protected Boolean mealPlanIndicator;
        @XmlAttribute(name = "MealPlanCodes")
        protected List<String> mealPlanCodes;
        @XmlAttribute(name = "Change")
        protected Boolean change;

        /**
         * 获取breakfast属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBreakfast() {
            return breakfast;
        }

        /**
         * 设置breakfast属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBreakfast(Boolean value) {
            this.breakfast = value;
        }

        /**
         * 获取lunch属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLunch() {
            return lunch;
        }

        /**
         * 设置lunch属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLunch(Boolean value) {
            this.lunch = value;
        }

        /**
         * 获取dinner属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDinner() {
            return dinner;
        }

        /**
         * 设置dinner属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDinner(Boolean value) {
            this.dinner = value;
        }

        /**
         * 获取mealPlanIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMealPlanIndicator() {
            return mealPlanIndicator;
        }

        /**
         * 设置mealPlanIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMealPlanIndicator(Boolean value) {
            this.mealPlanIndicator = value;
        }

        /**
         * Gets the value of the mealPlanCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mealPlanCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMealPlanCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMealPlanCodes() {
            if (mealPlanCodes == null) {
                mealPlanCodes = new ArrayList<String>();
            }
            return this.mealPlanCodes;
        }

        /**
         * 获取change属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChange() {
            return change;
        }

        /**
         * 设置change属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChange(Boolean value) {
            this.change = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Notification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "notification"
    })
    public static class Notifications {

        @XmlElement(name = "Notification")
        protected List<RatePlanType.Notifications.Notification> notification;

        /**
         * Gets the value of the notification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatePlanType.Notifications.Notification }
         * 
         * 
         */
        public List<RatePlanType.Notifications.Notification> getNotification() {
            if (notification == null) {
                notification = new ArrayList<RatePlanType.Notifications.Notification>();
            }
            return this.notification;
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
         *       &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Notification {

            @XmlAttribute(name = "Code", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String code;
            @XmlAttribute(name = "Frequency")
            @XmlSchemaType(name = "anySimpleType")
            protected String frequency;

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
             * 获取frequency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrequency() {
                return frequency;
            }

            /**
             * 设置frequency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrequency(String value) {
                this.frequency = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PaymentModel {

        @XmlValue
        @XmlSchemaType(name = "anySimpleType")
        protected Object value;
        @XmlAttribute(name = "Code", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String code;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setValue(Object value) {
            this.value = value;
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

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PaymentType {

        @XmlValue
        @XmlSchemaType(name = "anySimpleType")
        protected Object value;
        @XmlAttribute(name = "Code", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String code;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setValue(Object value) {
            this.value = value;
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
     *         &lt;element name="RatePlanInclusionDesciption" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ServiceFeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ratePlanInclusionDesciption"
    })
    public static class RatePlanInclusions {

        @XmlElement(name = "RatePlanInclusionDesciption")
        protected ParagraphType ratePlanInclusionDesciption;
        @XmlAttribute(name = "TaxInclusive")
        protected Boolean taxInclusive;
        @XmlAttribute(name = "ServiceFeeInclusive")
        protected Boolean serviceFeeInclusive;

        /**
         * 获取ratePlanInclusionDesciption属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ParagraphType }
         *     
         */
        public ParagraphType getRatePlanInclusionDesciption() {
            return ratePlanInclusionDesciption;
        }

        /**
         * 设置ratePlanInclusionDesciption属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ParagraphType }
         *     
         */
        public void setRatePlanInclusionDesciption(ParagraphType value) {
            this.ratePlanInclusionDesciption = value;
        }

        /**
         * 获取taxInclusive属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTaxInclusive() {
            return taxInclusive;
        }

        /**
         * 设置taxInclusive属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTaxInclusive(Boolean value) {
            this.taxInclusive = value;
        }

        /**
         * 获取serviceFeeInclusive属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isServiceFeeInclusive() {
            return serviceFeeInclusive;
        }

        /**
         * 设置serviceFeeInclusive属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setServiceFeeInclusive(Boolean value) {
            this.serviceFeeInclusive = value;
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
     *         &lt;element name="Fee" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
     *                 &lt;attribute name="MealPlanCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fee"
    })
    public static class RatePlanLevelFee {

        @XmlElement(name = "Fee", required = true)
        protected List<RatePlanType.RatePlanLevelFee.Fee> fee;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * Gets the value of the fee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatePlanType.RatePlanLevelFee.Fee }
         * 
         * 
         */
        public List<RatePlanType.RatePlanLevelFee.Fee> getFee() {
            if (fee == null) {
                fee = new ArrayList<RatePlanType.RatePlanLevelFee.Fee>();
            }
            return this.fee;
        }

        /**
         * 获取uri属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * 设置uri属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
         *       &lt;attribute name="MealPlanCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Fee
            extends FeeType
        {

            @XmlAttribute(name = "MealPlanCode")
            protected String mealPlanCode;

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
     *         &lt;element name="RatePlanShoulder" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SellableProducts" type="{http://www.opentravel.org/OTA/2003/05}SellableProductsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ShoulderRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="PreShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="PostShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="PreShoulderStartDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="PostShoulderEndDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
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
        "ratePlanShoulder"
    })
    public static class RatePlanShoulders {

        @XmlElement(name = "RatePlanShoulder", required = true)
        protected List<RatePlanType.RatePlanShoulders.RatePlanShoulder> ratePlanShoulder;

        /**
         * Gets the value of the ratePlanShoulder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ratePlanShoulder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRatePlanShoulder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatePlanType.RatePlanShoulders.RatePlanShoulder }
         * 
         * 
         */
        public List<RatePlanType.RatePlanShoulders.RatePlanShoulder> getRatePlanShoulder() {
            if (ratePlanShoulder == null) {
                ratePlanShoulder = new ArrayList<RatePlanType.RatePlanShoulders.RatePlanShoulder>();
            }
            return this.ratePlanShoulder;
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
         *         &lt;element name="SellableProducts" type="{http://www.opentravel.org/OTA/2003/05}SellableProductsType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ShoulderRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="PreShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="PostShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="PreShoulderStartDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="PostShoulderEndDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sellableProducts"
        })
        public static class RatePlanShoulder {

            @XmlElement(name = "SellableProducts")
            protected SellableProductsType sellableProducts;
            @XmlAttribute(name = "ShoulderRPH")
            protected String shoulderRPH;
            @XmlAttribute(name = "PreShoulderSellLimit")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger preShoulderSellLimit;
            @XmlAttribute(name = "PostShoulderSellLimit")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger postShoulderSellLimit;
            @XmlAttribute(name = "PreShoulderStartDate")
            protected String preShoulderStartDate;
            @XmlAttribute(name = "PostShoulderEndDate")
            protected String postShoulderEndDate;

            /**
             * 获取sellableProducts属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SellableProductsType }
             *     
             */
            public SellableProductsType getSellableProducts() {
                return sellableProducts;
            }

            /**
             * 设置sellableProducts属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SellableProductsType }
             *     
             */
            public void setSellableProducts(SellableProductsType value) {
                this.sellableProducts = value;
            }

            /**
             * 获取shoulderRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShoulderRPH() {
                return shoulderRPH;
            }

            /**
             * 设置shoulderRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShoulderRPH(String value) {
                this.shoulderRPH = value;
            }

            /**
             * 获取preShoulderSellLimit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPreShoulderSellLimit() {
                return preShoulderSellLimit;
            }

            /**
             * 设置preShoulderSellLimit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPreShoulderSellLimit(BigInteger value) {
                this.preShoulderSellLimit = value;
            }

            /**
             * 获取postShoulderSellLimit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPostShoulderSellLimit() {
                return postShoulderSellLimit;
            }

            /**
             * 设置postShoulderSellLimit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPostShoulderSellLimit(BigInteger value) {
                this.postShoulderSellLimit = value;
            }

            /**
             * 获取preShoulderStartDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreShoulderStartDate() {
                return preShoulderStartDate;
            }

            /**
             * 设置preShoulderStartDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreShoulderStartDate(String value) {
                this.preShoulderStartDate = value;
            }

            /**
             * 获取postShoulderEndDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostShoulderEndDate() {
                return postShoulderEndDate;
            }

            /**
             * 设置postShoulderEndDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostShoulderEndDate(String value) {
                this.postShoulderEndDate = value;
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
     *         &lt;element name="Rate" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateUploadType">
     *                 &lt;sequence>
     *                   &lt;element name="MealPlans" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                             &lt;element name="MealPlan">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="Price" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                     &lt;attribute name="PriceBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                     &lt;attribute name="Under" type="{http://www.w3.org/2001/XMLSchema}int" />
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
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InventoryGroup"/>
     *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
     *                 &lt;attribute name="ExtraNightIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="PricePerUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="RoomType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "rate"
    })
    public static class Rates {

        @XmlElement(name = "Rate", required = true)
        protected List<RatePlanType.Rates.Rate> rate;

        /**
         * Gets the value of the rate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatePlanType.Rates.Rate }
         * 
         * 
         */
        public List<RatePlanType.Rates.Rate> getRate() {
            if (rate == null) {
                rate = new ArrayList<RatePlanType.Rates.Rate>();
            }
            return this.rate;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateUploadType">
         *       &lt;sequence>
         *         &lt;element name="MealPlans" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
         *                   &lt;element name="MealPlan">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="Price" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                           &lt;attribute name="PriceBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                           &lt;attribute name="Under" type="{http://www.w3.org/2001/XMLSchema}int" />
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InventoryGroup"/>
         *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
         *       &lt;attribute name="ExtraNightIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="PricePerUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="RoomType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mealPlans"
        })
        public static class Rate
            extends RateUploadType
        {

            @XmlElement(name = "MealPlans")
            protected RatePlanType.Rates.Rate.MealPlans mealPlans;
            @XmlAttribute(name = "Status")
            protected List<String> status;
            @XmlAttribute(name = "ExtraNightIndicator")
            protected Boolean extraNightIndicator;
            @XmlAttribute(name = "PricePerUnit")
            protected Boolean pricePerUnit;
            @XmlAttribute(name = "RoomType", required = true)
            protected String roomType;
            @XmlAttribute(name = "InvCodeApplication")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String invCodeApplication;
            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "InvType")
            protected String invType;
            @XmlAttribute(name = "InvTypeCode")
            protected String invTypeCode;
            @XmlAttribute(name = "IsRoom")
            protected Boolean isRoom;

            /**
             * 获取mealPlans属性的值。
             * 
             * @return
             *     possible object is
             *     {@link RatePlanType.Rates.Rate.MealPlans }
             *     
             */
            public RatePlanType.Rates.Rate.MealPlans getMealPlans() {
                return mealPlans;
            }

            /**
             * 设置mealPlans属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link RatePlanType.Rates.Rate.MealPlans }
             *     
             */
            public void setMealPlans(RatePlanType.Rates.Rate.MealPlans value) {
                this.mealPlans = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the status property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStatus().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getStatus() {
                if (status == null) {
                    status = new ArrayList<String>();
                }
                return this.status;
            }

            /**
             * 获取extraNightIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isExtraNightIndicator() {
                return extraNightIndicator;
            }

            /**
             * 设置extraNightIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setExtraNightIndicator(Boolean value) {
                this.extraNightIndicator = value;
            }

            /**
             * 获取pricePerUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPricePerUnit() {
                return pricePerUnit;
            }

            /**
             * 设置pricePerUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPricePerUnit(Boolean value) {
                this.pricePerUnit = value;
            }

            /**
             * 获取roomType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomType() {
                return roomType;
            }

            /**
             * 设置roomType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomType(String value) {
                this.roomType = value;
            }

            /**
             * 获取invCodeApplication属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * 设置invCodeApplication属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * 获取invCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * 设置invCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * 获取invType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvType() {
                return invType;
            }

            /**
             * 设置invType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * 获取invTypeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * 设置invTypeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * 获取isRoom属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * 设置isRoom属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
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
             *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
             *         &lt;element name="MealPlan">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="Price" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                 &lt;attribute name="PriceBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                 &lt;attribute name="Under" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                "mealPlan"
            })
            public static class MealPlans {

                @XmlElement(name = "MealPlan")
                protected List<RatePlanType.Rates.Rate.MealPlans.MealPlan> mealPlan;

                /**
                 * Gets the value of the mealPlan property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the mealPlan property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMealPlan().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link RatePlanType.Rates.Rate.MealPlans.MealPlan }
                 * 
                 * 
                 */
                public List<RatePlanType.Rates.Rate.MealPlans.MealPlan> getMealPlan() {
                    if (mealPlan == null) {
                        mealPlan = new ArrayList<RatePlanType.Rates.Rate.MealPlans.MealPlan>();
                    }
                    return this.mealPlan;
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
                 *       &lt;attribute name="Price" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *       &lt;attribute name="PriceBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *       &lt;attribute name="Under" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class MealPlan {

                    @XmlAttribute(name = "Code", required = true)
                    @XmlSchemaType(name = "anySimpleType")
                    protected String code;
                    @XmlAttribute(name = "Price", required = true)
                    protected float price;
                    @XmlAttribute(name = "PriceBeforeTax")
                    protected Float priceBeforeTax;
                    @XmlAttribute(name = "Under")
                    protected Integer under;

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
                     * 获取price属性的值。
                     * 
                     */
                    public float getPrice() {
                        return price;
                    }

                    /**
                     * 设置price属性的值。
                     * 
                     */
                    public void setPrice(float value) {
                        this.price = value;
                    }

                    /**
                     * 获取priceBeforeTax属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    public Float getPriceBeforeTax() {
                        return priceBeforeTax;
                    }

                    /**
                     * 设置priceBeforeTax属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    public void setPriceBeforeTax(Float value) {
                        this.priceBeforeTax = value;
                    }

                    /**
                     * 获取under属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getUnder() {
                        return under;
                    }

                    /**
                     * 设置under属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setUnder(Integer value) {
                        this.under = value;
                    }

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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RestrictionStatusGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RestrictionStatus {

        @XmlAttribute(name = "Restriction")
        protected List<String> restriction;
        @XmlAttribute(name = "Status")
        protected List<String> status;
        @XmlAttribute(name = "SellThroughOpenIndicator")
        protected Boolean sellThroughOpenIndicator;

        /**
         * Gets the value of the restriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the restriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRestriction() {
            if (restriction == null) {
                restriction = new ArrayList<String>();
            }
            return this.restriction;
        }

        /**
         * Gets the value of the status property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the status property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStatus() {
            if (status == null) {
                status = new ArrayList<String>();
            }
            return this.status;
        }

        /**
         * 获取sellThroughOpenIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSellThroughOpenIndicator() {
            return sellThroughOpenIndicator;
        }

        /**
         * 设置sellThroughOpenIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSellThroughOpenIndicator(Boolean value) {
            this.sellThroughOpenIndicator = value;
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
     *         &lt;element name="Contracts" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="Contract" minOccurs="0">
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
     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contracts"
    })
    public static class SellingMode {

        @XmlElement(name = "Contracts")
        protected RatePlanType.SellingMode.Contracts contracts;
        @XmlAttribute(name = "Code", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String code;

        /**
         * 获取contracts属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RatePlanType.SellingMode.Contracts }
         *     
         */
        public RatePlanType.SellingMode.Contracts getContracts() {
            return contracts;
        }

        /**
         * 设置contracts属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RatePlanType.SellingMode.Contracts }
         *     
         */
        public void setContracts(RatePlanType.SellingMode.Contracts value) {
            this.contracts = value;
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;element name="Contract" minOccurs="0">
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
            "contract"
        })
        public static class Contracts {

            @XmlElement(name = "Contract")
            protected List<RatePlanType.SellingMode.Contracts.Contract> contract;

            /**
             * Gets the value of the contract property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contract property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContract().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RatePlanType.SellingMode.Contracts.Contract }
             * 
             * 
             */
            public List<RatePlanType.SellingMode.Contracts.Contract> getContract() {
                if (contract == null) {
                    contract = new ArrayList<RatePlanType.SellingMode.Contracts.Contract>();
                }
                return this.contract;
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
            public static class Contract {

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
     *         &lt;element name="TaxPolicy" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType">
     *                 &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="TaxType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "taxPolicy"
    })
    public static class TaxPolicies {

        @XmlElement(name = "TaxPolicy")
        protected List<RatePlanType.TaxPolicies.TaxPolicy> taxPolicy;

        /**
         * Gets the value of the taxPolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxPolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxPolicy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatePlanType.TaxPolicies.TaxPolicy }
         * 
         * 
         */
        public List<RatePlanType.TaxPolicies.TaxPolicy> getTaxPolicy() {
            if (taxPolicy == null) {
                taxPolicy = new ArrayList<RatePlanType.TaxPolicies.TaxPolicy>();
            }
            return this.taxPolicy;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType">
         *       &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="TaxType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TaxPolicy
            extends TaxType
        {

            @XmlAttribute(name = "NightsForTaxExemptionQuantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger nightsForTaxExemptionQuantity;
            @XmlAttribute(name = "TaxableNightsQuantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger taxableNightsQuantity;
            @XmlAttribute(name = "TaxType")
            @XmlSchemaType(name = "anySimpleType")
            protected String taxType;

            /**
             * 获取nightsForTaxExemptionQuantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNightsForTaxExemptionQuantity() {
                return nightsForTaxExemptionQuantity;
            }

            /**
             * 设置nightsForTaxExemptionQuantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNightsForTaxExemptionQuantity(BigInteger value) {
                this.nightsForTaxExemptionQuantity = value;
            }

            /**
             * 获取taxableNightsQuantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTaxableNightsQuantity() {
                return taxableNightsQuantity;
            }

            /**
             * 设置taxableNightsQuantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTaxableNightsQuantity(BigInteger value) {
                this.taxableNightsQuantity = value;
            }

            /**
             * 获取taxType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxType() {
                return taxType;
            }

            /**
             * 设置taxType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxType(String value) {
                this.taxType = value;
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
     *         &lt;element name="TaxAndMargin" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Tax" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Margin" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
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
        "taxAndMargin"
    })
    public static class TaxesAndMargins {

        @XmlElement(name = "TaxAndMargin")
        protected List<RatePlanType.TaxesAndMargins.TaxAndMargin> taxAndMargin;

        /**
         * Gets the value of the taxAndMargin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxAndMargin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxAndMargin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatePlanType.TaxesAndMargins.TaxAndMargin }
         * 
         * 
         */
        public List<RatePlanType.TaxesAndMargins.TaxAndMargin> getTaxAndMargin() {
            if (taxAndMargin == null) {
                taxAndMargin = new ArrayList<RatePlanType.TaxesAndMargins.TaxAndMargin>();
            }
            return this.taxAndMargin;
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
         *         &lt;element name="Tax" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Margin" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tax",
            "margin"
        })
        public static class TaxAndMargin {

            @XmlElement(name = "Tax")
            protected RatePlanType.TaxesAndMargins.TaxAndMargin.Tax tax;
            @XmlElement(name = "Margin")
            protected RatePlanType.TaxesAndMargins.TaxAndMargin.Margin margin;
            @XmlAttribute(name = "Start", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar start;
            @XmlAttribute(name = "End", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar end;

            /**
             * 获取tax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link RatePlanType.TaxesAndMargins.TaxAndMargin.Tax }
             *     
             */
            public RatePlanType.TaxesAndMargins.TaxAndMargin.Tax getTax() {
                return tax;
            }

            /**
             * 设置tax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link RatePlanType.TaxesAndMargins.TaxAndMargin.Tax }
             *     
             */
            public void setTax(RatePlanType.TaxesAndMargins.TaxAndMargin.Tax value) {
                this.tax = value;
            }

            /**
             * 获取margin属性的值。
             * 
             * @return
             *     possible object is
             *     {@link RatePlanType.TaxesAndMargins.TaxAndMargin.Margin }
             *     
             */
            public RatePlanType.TaxesAndMargins.TaxAndMargin.Margin getMargin() {
                return margin;
            }

            /**
             * 设置margin属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link RatePlanType.TaxesAndMargins.TaxAndMargin.Margin }
             *     
             */
            public void setMargin(RatePlanType.TaxesAndMargins.TaxAndMargin.Margin value) {
                this.margin = value;
            }

            /**
             * 获取start属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getStart() {
                return start;
            }

            /**
             * 设置start属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setStart(XMLGregorianCalendar value) {
                this.start = value;
            }

            /**
             * 获取end属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEnd() {
                return end;
            }

            /**
             * 设置end属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEnd(XMLGregorianCalendar value) {
                this.end = value;
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
             *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Margin {

                @XmlAttribute(name = "Amount")
                protected String amount;
                @XmlAttribute(name = "Code")
                protected String code;

                /**
                 * 获取amount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAmount() {
                    return amount;
                }

                /**
                 * 设置amount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAmount(String value) {
                    this.amount = value;
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
            public static class Tax {

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

}
