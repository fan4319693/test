//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Base charge and additional charges related to a room that includes such things as additional guest amounts, cancel fees, etc. Also includes Discount percentages, total amount, and the rate description.
 * 
 * <p>AmountType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NightlyRates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="NightlyRate" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SellingPrices"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
 *                           &lt;attribute name="AmountAfterTax" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="NightNumber" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 &lt;minInclusive value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="RatePlanCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="64"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="BuyingAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="MealPriceBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="MealPriceAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="OnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Base">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SellingPrices"/>
 *                 &lt;attribute name="BuyingAmount">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                       &lt;minInclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="MealPriceBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="MealPriceAfterTax" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalGuestAmounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalGuestAmount" type="{http://www.opentravel.org/OTA/2003/05}AdditionalGuestAmountType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
 *                 &lt;attribute name="AmountBeforeTax" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                 &lt;attribute name="AmountAfterTax" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}FeesType" minOccurs="0"/>
 *         &lt;element name="CancelPolicies" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="PaymentPolicies" type="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType" minOccurs="0"/>
 *         &lt;element name="Discount" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DiscountType">
 *                 &lt;attribute name="AppliesTo">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="Base"/>
 *                       &lt;enumeration value="AdditionalGuestAmount"/>
 *                       &lt;enumeration value="Fee"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ItemRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RateDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element name="AdvanceBookingRestriction" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
 *                 &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Taxes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}TaxType" maxOccurs="99" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BuyTaxes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}TaxType" maxOccurs="99" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Total" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SellingPrices"/>
 *                 &lt;attribute name="BuyingAmount">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                       &lt;minInclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="MealPriceBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="MealPriceAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalCharges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalCharge" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Amount" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *                           &lt;attribute name="RoomAmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
 *                 &lt;attribute name="AmountBeforeTax" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                 &lt;attribute name="AmountAfterTax" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Specials" type="{http://www.opentravel.org/OTA/2003/05}SpecialType" minOccurs="0"/>
 *         &lt;element name="BuySpecials" type="{http://www.opentravel.org/OTA/2003/05}SpecialType" minOccurs="0"/>
 *         &lt;element name="Extras" type="{http://www.opentravel.org/OTA/2003/05}ExtraType" minOccurs="0"/>
 *         &lt;element name="BuyExtras" type="{http://www.opentravel.org/OTA/2003/05}ExtraType" minOccurs="0"/>
 *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EffectiveExpireOptionalDateGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AgeQualifyingGroup"/>
 *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NumberOfUnits" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *       &lt;attribute name="UnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MinGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MaxGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="StayOverDate" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *       &lt;attribute name="AlternateCurrencyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {
    "nightlyRates",
    "base",
    "additionalGuestAmounts",
    "fees",
    "cancelPolicies",
    "paymentPolicies",
    "discount",
    "rateDescription",
    "advanceBookingRestriction",
    "taxes",
    "buyTaxes",
    "total",
    "loyalty",
    "additionalCharges",
    "specials",
    "buySpecials",
    "extras",
    "buyExtras",
    "priceAdjustments"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.RateType.Rate.class
})
public class AmountType {

    @XmlElement(name = "NightlyRates")
    protected AmountType.NightlyRates nightlyRates;
    @XmlElement(name = "Base", required = true)
    protected AmountType.Base base;
    @XmlElement(name = "AdditionalGuestAmounts")
    protected AmountType.AdditionalGuestAmounts additionalGuestAmounts;
    @XmlElement(name = "Fees")
    protected FeesType fees;
    @XmlElement(name = "CancelPolicies")
    protected CancelPenaltiesType cancelPolicies;
    @XmlElement(name = "PaymentPolicies")
    protected RequiredPaymentsType paymentPolicies;
    @XmlElement(name = "Discount")
    protected List<AmountType.Discount> discount;
    @XmlElement(name = "RateDescription")
    protected ParagraphType rateDescription;
    @XmlElement(name = "AdvanceBookingRestriction")
    protected AmountType.AdvanceBookingRestriction advanceBookingRestriction;
    @XmlElement(name = "Taxes")
    protected AmountType.Taxes taxes;
    @XmlElement(name = "BuyTaxes")
    protected AmountType.BuyTaxes buyTaxes;
    @XmlElement(name = "Total")
    protected AmountType.Total total;
    @XmlElement(name = "Loyalty")
    protected List<LoyaltyPricingType> loyalty;
    @XmlElement(name = "AdditionalCharges")
    protected AmountType.AdditionalCharges additionalCharges;
    @XmlElement(name = "Specials")
    protected SpecialType specials;
    @XmlElement(name = "BuySpecials")
    protected SpecialType buySpecials;
    @XmlElement(name = "Extras")
    protected ExtraType extras;
    @XmlElement(name = "BuyExtras")
    protected ExtraType buyExtras;
    @XmlElement(name = "PriceAdjustments", required = true)
    protected ExPriceAdjustmentsType priceAdjustments;
    @XmlAttribute(name = "GuaranteedInd")
    protected Boolean guaranteedInd;
    @XmlAttribute(name = "NumberOfUnits")
    protected Integer numberOfUnits;
    @XmlAttribute(name = "RateTimeUnit")
    protected String rateTimeUnit;
    @XmlAttribute(name = "UnitMultiplier")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger unitMultiplier;
    @XmlAttribute(name = "MinGuestApplicable")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minGuestApplicable;
    @XmlAttribute(name = "MaxGuestApplicable")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxGuestApplicable;
    @XmlAttribute(name = "MinLOS")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minLOS;
    @XmlAttribute(name = "MaxLOS")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxLOS;
    @XmlAttribute(name = "StayOverDate")
    protected DayOfWeekType stayOverDate;
    @XmlAttribute(name = "AlternateCurrencyInd")
    protected Boolean alternateCurrencyInd;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "AgeQualifyingCode")
    protected String ageQualifyingCode;
    @XmlAttribute(name = "MinAge")
    protected Integer minAge;
    @XmlAttribute(name = "MaxAge")
    protected Integer maxAge;
    @XmlAttribute(name = "AgeTimeUnit")
    protected String ageTimeUnit;
    @XmlAttribute(name = "RuleCode")
    protected String ruleCode;

    /**
     * 获取nightlyRates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountType.NightlyRates }
     *     
     */
    public AmountType.NightlyRates getNightlyRates() {
        return nightlyRates;
    }

    /**
     * 设置nightlyRates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType.NightlyRates }
     *     
     */
    public void setNightlyRates(AmountType.NightlyRates value) {
        this.nightlyRates = value;
    }

    /**
     * 获取base属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountType.Base }
     *     
     */
    public AmountType.Base getBase() {
        return base;
    }

    /**
     * 设置base属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType.Base }
     *     
     */
    public void setBase(AmountType.Base value) {
        this.base = value;
    }

    /**
     * 获取additionalGuestAmounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountType.AdditionalGuestAmounts }
     *     
     */
    public AmountType.AdditionalGuestAmounts getAdditionalGuestAmounts() {
        return additionalGuestAmounts;
    }

    /**
     * 设置additionalGuestAmounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType.AdditionalGuestAmounts }
     *     
     */
    public void setAdditionalGuestAmounts(AmountType.AdditionalGuestAmounts value) {
        this.additionalGuestAmounts = value;
    }

    /**
     * 获取fees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FeesType }
     *     
     */
    public FeesType getFees() {
        return fees;
    }

    /**
     * 设置fees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FeesType }
     *     
     */
    public void setFees(FeesType value) {
        this.fees = value;
    }

    /**
     * 获取cancelPolicies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPolicies() {
        return cancelPolicies;
    }

    /**
     * 设置cancelPolicies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPolicies(CancelPenaltiesType value) {
        this.cancelPolicies = value;
    }

    /**
     * 获取paymentPolicies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequiredPaymentsType }
     *     
     */
    public RequiredPaymentsType getPaymentPolicies() {
        return paymentPolicies;
    }

    /**
     * 设置paymentPolicies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredPaymentsType }
     *     
     */
    public void setPaymentPolicies(RequiredPaymentsType value) {
        this.paymentPolicies = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType.Discount }
     * 
     * 
     */
    public List<AmountType.Discount> getDiscount() {
        if (discount == null) {
            discount = new ArrayList<AmountType.Discount>();
        }
        return this.discount;
    }

    /**
     * 获取rateDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getRateDescription() {
        return rateDescription;
    }

    /**
     * 设置rateDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setRateDescription(ParagraphType value) {
        this.rateDescription = value;
    }

    /**
     * 获取advanceBookingRestriction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountType.AdvanceBookingRestriction }
     *     
     */
    public AmountType.AdvanceBookingRestriction getAdvanceBookingRestriction() {
        return advanceBookingRestriction;
    }

    /**
     * 设置advanceBookingRestriction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType.AdvanceBookingRestriction }
     *     
     */
    public void setAdvanceBookingRestriction(AmountType.AdvanceBookingRestriction value) {
        this.advanceBookingRestriction = value;
    }

    /**
     * 获取taxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountType.Taxes }
     *     
     */
    public AmountType.Taxes getTaxes() {
        return taxes;
    }

    /**
     * 设置taxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType.Taxes }
     *     
     */
    public void setTaxes(AmountType.Taxes value) {
        this.taxes = value;
    }

    /**
     * 获取buyTaxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountType.BuyTaxes }
     *     
     */
    public AmountType.BuyTaxes getBuyTaxes() {
        return buyTaxes;
    }

    /**
     * 设置buyTaxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType.BuyTaxes }
     *     
     */
    public void setBuyTaxes(AmountType.BuyTaxes value) {
        this.buyTaxes = value;
    }

    /**
     * 获取total属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountType.Total }
     *     
     */
    public AmountType.Total getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType.Total }
     *     
     */
    public void setTotal(AmountType.Total value) {
        this.total = value;
    }

    /**
     * Gets the value of the loyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPricingType }
     * 
     * 
     */
    public List<LoyaltyPricingType> getLoyalty() {
        if (loyalty == null) {
            loyalty = new ArrayList<LoyaltyPricingType>();
        }
        return this.loyalty;
    }

    /**
     * 获取additionalCharges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountType.AdditionalCharges }
     *     
     */
    public AmountType.AdditionalCharges getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     * 设置additionalCharges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType.AdditionalCharges }
     *     
     */
    public void setAdditionalCharges(AmountType.AdditionalCharges value) {
        this.additionalCharges = value;
    }

    /**
     * 获取specials属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialType }
     *     
     */
    public SpecialType getSpecials() {
        return specials;
    }

    /**
     * 设置specials属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialType }
     *     
     */
    public void setSpecials(SpecialType value) {
        this.specials = value;
    }

    /**
     * 获取buySpecials属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialType }
     *     
     */
    public SpecialType getBuySpecials() {
        return buySpecials;
    }

    /**
     * 设置buySpecials属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialType }
     *     
     */
    public void setBuySpecials(SpecialType value) {
        this.buySpecials = value;
    }

    /**
     * 获取extras属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtraType }
     *     
     */
    public ExtraType getExtras() {
        return extras;
    }

    /**
     * 设置extras属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraType }
     *     
     */
    public void setExtras(ExtraType value) {
        this.extras = value;
    }

    /**
     * 获取buyExtras属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtraType }
     *     
     */
    public ExtraType getBuyExtras() {
        return buyExtras;
    }

    /**
     * 设置buyExtras属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraType }
     *     
     */
    public void setBuyExtras(ExtraType value) {
        this.buyExtras = value;
    }

    /**
     * 获取priceAdjustments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExPriceAdjustmentsType }
     *     
     */
    public ExPriceAdjustmentsType getPriceAdjustments() {
        return priceAdjustments;
    }

    /**
     * 设置priceAdjustments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExPriceAdjustmentsType }
     *     
     */
    public void setPriceAdjustments(ExPriceAdjustmentsType value) {
        this.priceAdjustments = value;
    }

    /**
     * 获取guaranteedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteedInd() {
        return guaranteedInd;
    }

    /**
     * 设置guaranteedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteedInd(Boolean value) {
        this.guaranteedInd = value;
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
     * 获取rateTimeUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateTimeUnit() {
        return rateTimeUnit;
    }

    /**
     * 设置rateTimeUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateTimeUnit(String value) {
        this.rateTimeUnit = value;
    }

    /**
     * 获取unitMultiplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * 设置unitMultiplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitMultiplier(BigInteger value) {
        this.unitMultiplier = value;
    }

    /**
     * 获取minGuestApplicable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinGuestApplicable() {
        return minGuestApplicable;
    }

    /**
     * 设置minGuestApplicable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinGuestApplicable(BigInteger value) {
        this.minGuestApplicable = value;
    }

    /**
     * 获取maxGuestApplicable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxGuestApplicable() {
        return maxGuestApplicable;
    }

    /**
     * 设置maxGuestApplicable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxGuestApplicable(BigInteger value) {
        this.maxGuestApplicable = value;
    }

    /**
     * 获取minLOS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinLOS() {
        return minLOS;
    }

    /**
     * 设置minLOS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinLOS(BigInteger value) {
        this.minLOS = value;
    }

    /**
     * 获取maxLOS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxLOS() {
        return maxLOS;
    }

    /**
     * 设置maxLOS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxLOS(BigInteger value) {
        this.maxLOS = value;
    }

    /**
     * 获取stayOverDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getStayOverDate() {
        return stayOverDate;
    }

    /**
     * 设置stayOverDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setStayOverDate(DayOfWeekType value) {
        this.stayOverDate = value;
    }

    /**
     * 获取alternateCurrencyInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternateCurrencyInd() {
        return alternateCurrencyInd;
    }

    /**
     * 设置alternateCurrencyInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternateCurrencyInd(Boolean value) {
        this.alternateCurrencyInd = value;
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
     * 获取ageQualifyingCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    /**
     * 设置ageQualifyingCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeQualifyingCode(String value) {
        this.ageQualifyingCode = value;
    }

    /**
     * 获取minAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinAge() {
        return minAge;
    }

    /**
     * 设置minAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinAge(Integer value) {
        this.minAge = value;
    }

    /**
     * 获取maxAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAge() {
        return maxAge;
    }

    /**
     * 设置maxAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAge(Integer value) {
        this.maxAge = value;
    }

    /**
     * 获取ageTimeUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeTimeUnit() {
        return ageTimeUnit;
    }

    /**
     * 设置ageTimeUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeTimeUnit(String value) {
        this.ageTimeUnit = value;
    }

    /**
     * 获取ruleCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * 设置ruleCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleCode(String value) {
        this.ruleCode = value;
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
     *         &lt;element name="AdditionalCharge" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Amount" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
     *                 &lt;attribute name="RoomAmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
     *       &lt;attribute name="AmountBeforeTax" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *       &lt;attribute name="AmountAfterTax" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "additionalCharge"
    })
    public static class AdditionalCharges {

        @XmlElement(name = "AdditionalCharge", required = true)
        protected List<AmountType.AdditionalCharges.AdditionalCharge> additionalCharge;
        @XmlAttribute(name = "AmountBeforeTax")
        protected BigDecimal amountBeforeTax;
        @XmlAttribute(name = "AmountAfterTax")
        protected BigDecimal amountAfterTax;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the additionalCharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalCharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalCharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AmountType.AdditionalCharges.AdditionalCharge }
         * 
         * 
         */
        public List<AmountType.AdditionalCharges.AdditionalCharge> getAdditionalCharge() {
            if (additionalCharge == null) {
                additionalCharge = new ArrayList<AmountType.AdditionalCharges.AdditionalCharge>();
            }
            return this.additionalCharge;
        }

        /**
         * 获取amountBeforeTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountBeforeTax() {
            return amountBeforeTax;
        }

        /**
         * 设置amountBeforeTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmountBeforeTax(BigDecimal value) {
            this.amountBeforeTax = value;
        }

        /**
         * 获取amountAfterTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountAfterTax() {
            return amountAfterTax;
        }

        /**
         * 设置amountAfterTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmountAfterTax(BigDecimal value) {
            this.amountAfterTax = value;
        }

        /**
         * 获取currencyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * 设置currencyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * 获取decimalPlaces属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * 设置decimalPlaces属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
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
         *         &lt;element name="Amount" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
         *       &lt;attribute name="RoomAmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "amount"
        })
        public static class AdditionalCharge {

            @XmlElement(name = "Amount")
            protected TotalType amount;
            @XmlAttribute(name = "RoomAmenityCode")
            protected String roomAmenityCode;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;

            /**
             * 获取amount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TotalType }
             *     
             */
            public TotalType getAmount() {
                return amount;
            }

            /**
             * 设置amount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TotalType }
             *     
             */
            public void setAmount(TotalType value) {
                this.amount = value;
            }

            /**
             * 获取roomAmenityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomAmenityCode() {
                return roomAmenityCode;
            }

            /**
             * 设置roomAmenityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomAmenityCode(String value) {
                this.roomAmenityCode = value;
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
     *         &lt;element name="AdditionalGuestAmount" type="{http://www.opentravel.org/OTA/2003/05}AdditionalGuestAmountType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
     *       &lt;attribute name="AmountBeforeTax" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *       &lt;attribute name="AmountAfterTax" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "additionalGuestAmount"
    })
    public static class AdditionalGuestAmounts {

        @XmlElement(name = "AdditionalGuestAmount", required = true)
        protected List<AdditionalGuestAmountType> additionalGuestAmount;
        @XmlAttribute(name = "AmountBeforeTax")
        protected BigDecimal amountBeforeTax;
        @XmlAttribute(name = "AmountAfterTax")
        protected BigDecimal amountAfterTax;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the additionalGuestAmount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalGuestAmount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalGuestAmount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdditionalGuestAmountType }
         * 
         * 
         */
        public List<AdditionalGuestAmountType> getAdditionalGuestAmount() {
            if (additionalGuestAmount == null) {
                additionalGuestAmount = new ArrayList<AdditionalGuestAmountType>();
            }
            return this.additionalGuestAmount;
        }

        /**
         * 获取amountBeforeTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountBeforeTax() {
            return amountBeforeTax;
        }

        /**
         * 设置amountBeforeTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmountBeforeTax(BigDecimal value) {
            this.amountBeforeTax = value;
        }

        /**
         * 获取amountAfterTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountAfterTax() {
            return amountAfterTax;
        }

        /**
         * 设置amountAfterTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmountAfterTax(BigDecimal value) {
            this.amountAfterTax = value;
        }

        /**
         * 获取currencyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * 设置currencyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * 获取decimalPlaces属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * 设置decimalPlaces属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
     *       &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdvanceBookingRestriction {

        @XmlAttribute(name = "MinAdvancedBookingOffset")
        protected Duration minAdvancedBookingOffset;
        @XmlAttribute(name = "MaxAdvancedBookingOffset")
        protected Duration maxAdvancedBookingOffset;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected BigInteger duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "RangeNum")
        protected BigInteger rangeNum;
        @XmlAttribute(name = "SearchTimeZone")
        protected String searchTimeZone;
        @XmlAttribute(name = "Mon")
        protected Boolean mon;
        @XmlAttribute(name = "Tue")
        protected Boolean tue;
        @XmlAttribute(name = "Weds")
        protected Boolean weds;
        @XmlAttribute(name = "Thur")
        protected Boolean thur;
        @XmlAttribute(name = "Fri")
        protected Boolean fri;
        @XmlAttribute(name = "Sat")
        protected Boolean sat;
        @XmlAttribute(name = "Sun")
        protected Boolean sun;

        /**
         * 获取minAdvancedBookingOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMinAdvancedBookingOffset() {
            return minAdvancedBookingOffset;
        }

        /**
         * 设置minAdvancedBookingOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMinAdvancedBookingOffset(Duration value) {
            this.minAdvancedBookingOffset = value;
        }

        /**
         * 获取maxAdvancedBookingOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMaxAdvancedBookingOffset() {
            return maxAdvancedBookingOffset;
        }

        /**
         * 设置maxAdvancedBookingOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMaxAdvancedBookingOffset(Duration value) {
            this.maxAdvancedBookingOffset = value;
        }

        /**
         * 获取start属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * 设置start属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
            this.duration = value;
        }

        /**
         * 获取end属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * 设置end属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRangeNum(BigInteger value) {
            this.rangeNum = value;
        }

        /**
         * 获取searchTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchTimeZone() {
            return searchTimeZone;
        }

        /**
         * 设置searchTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchTimeZone(String value) {
            this.searchTimeZone = value;
        }

        /**
         * 获取mon属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMon() {
            return mon;
        }

        /**
         * 设置mon属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMon(Boolean value) {
            this.mon = value;
        }

        /**
         * 获取tue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTue() {
            return tue;
        }

        /**
         * 设置tue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTue(Boolean value) {
            this.tue = value;
        }

        /**
         * 获取weds属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWeds() {
            return weds;
        }

        /**
         * 设置weds属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWeds(Boolean value) {
            this.weds = value;
        }

        /**
         * 获取thur属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isThur() {
            return thur;
        }

        /**
         * 设置thur属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setThur(Boolean value) {
            this.thur = value;
        }

        /**
         * 获取fri属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFri() {
            return fri;
        }

        /**
         * 设置fri属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFri(Boolean value) {
            this.fri = value;
        }

        /**
         * 获取sat属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSat() {
            return sat;
        }

        /**
         * 设置sat属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSat(Boolean value) {
            this.sat = value;
        }

        /**
         * 获取sun属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSun() {
            return sun;
        }

        /**
         * 设置sun属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSun(Boolean value) {
            this.sun = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SellingPrices"/>
     *       &lt;attribute name="BuyingAmount">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *             &lt;minInclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="MealPriceBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="MealPriceAfterTax" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Base
        extends TotalType
    {

        @XmlAttribute(name = "BuyingAmount")
        protected Double buyingAmount;
        @XmlAttribute(name = "MealPriceBeforeTax")
        protected Float mealPriceBeforeTax;
        @XmlAttribute(name = "MealPriceAfterTax")
        @XmlSchemaType(name = "anySimpleType")
        protected String mealPriceAfterTax;
        @XmlAttribute(name = "SellAmountBeforeTax")
        protected Float sellAmountBeforeTax;
        @XmlAttribute(name = "SellAmountAfterTax")
        protected Float sellAmountAfterTax;
        @XmlAttribute(name = "SellMealPriceBeforeTax")
        protected Float sellMealPriceBeforeTax;
        @XmlAttribute(name = "SellMealPriceAfterTax")
        protected Float sellMealPriceAfterTax;
        @XmlAttribute(name = "SellAmount")
        protected Float sellAmount;

        /**
         * 获取buyingAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getBuyingAmount() {
            return buyingAmount;
        }

        /**
         * 设置buyingAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setBuyingAmount(Double value) {
            this.buyingAmount = value;
        }

        /**
         * 获取mealPriceBeforeTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMealPriceBeforeTax() {
            return mealPriceBeforeTax;
        }

        /**
         * 设置mealPriceBeforeTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMealPriceBeforeTax(Float value) {
            this.mealPriceBeforeTax = value;
        }

        /**
         * 获取mealPriceAfterTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMealPriceAfterTax() {
            return mealPriceAfterTax;
        }

        /**
         * 设置mealPriceAfterTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMealPriceAfterTax(String value) {
            this.mealPriceAfterTax = value;
        }

        /**
         * 获取sellAmountBeforeTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSellAmountBeforeTax() {
            return sellAmountBeforeTax;
        }

        /**
         * 设置sellAmountBeforeTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSellAmountBeforeTax(Float value) {
            this.sellAmountBeforeTax = value;
        }

        /**
         * 获取sellAmountAfterTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSellAmountAfterTax() {
            return sellAmountAfterTax;
        }

        /**
         * 设置sellAmountAfterTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSellAmountAfterTax(Float value) {
            this.sellAmountAfterTax = value;
        }

        /**
         * 获取sellMealPriceBeforeTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSellMealPriceBeforeTax() {
            return sellMealPriceBeforeTax;
        }

        /**
         * 设置sellMealPriceBeforeTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSellMealPriceBeforeTax(Float value) {
            this.sellMealPriceBeforeTax = value;
        }

        /**
         * 获取sellMealPriceAfterTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSellMealPriceAfterTax() {
            return sellMealPriceAfterTax;
        }

        /**
         * 设置sellMealPriceAfterTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSellMealPriceAfterTax(Float value) {
            this.sellMealPriceAfterTax = value;
        }

        /**
         * 获取sellAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSellAmount() {
            return sellAmount;
        }

        /**
         * 设置sellAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSellAmount(Float value) {
            this.sellAmount = value;
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
     *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}TaxType" maxOccurs="99" minOccurs="0"/>
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
        "tax"
    })
    public static class BuyTaxes {

        @XmlElement(name = "Tax")
        protected List<TaxType> tax;

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxType }
         * 
         * 
         */
        public List<TaxType> getTax() {
            if (tax == null) {
                tax = new ArrayList<TaxType>();
            }
            return this.tax;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DiscountType">
     *       &lt;attribute name="AppliesTo">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="Base"/>
     *             &lt;enumeration value="AdditionalGuestAmount"/>
     *             &lt;enumeration value="Fee"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ItemRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Discount
        extends DiscountType
    {

        @XmlAttribute(name = "AppliesTo")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String appliesTo;
        @XmlAttribute(name = "ItemRPH")
        protected String itemRPH;

        /**
         * 获取appliesTo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppliesTo() {
            return appliesTo;
        }

        /**
         * 设置appliesTo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppliesTo(String value) {
            this.appliesTo = value;
        }

        /**
         * 获取itemRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemRPH() {
            return itemRPH;
        }

        /**
         * 设置itemRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemRPH(String value) {
            this.itemRPH = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="NightlyRate" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SellingPrices"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
     *                 &lt;attribute name="AmountAfterTax" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="NightNumber" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="RatePlanCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="64"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="BuyingAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="MealPriceBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="MealPriceAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="OnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "nightlyRate"
    })
    public static class NightlyRates {

        @XmlElement(name = "NightlyRate", required = true)
        protected List<AmountType.NightlyRates.NightlyRate> nightlyRate;

        /**
         * Gets the value of the nightlyRate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nightlyRate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNightlyRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AmountType.NightlyRates.NightlyRate }
         * 
         * 
         */
        public List<AmountType.NightlyRates.NightlyRate> getNightlyRate() {
            if (nightlyRate == null) {
                nightlyRate = new ArrayList<AmountType.NightlyRates.NightlyRate>();
            }
            return this.nightlyRate;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SellingPrices"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
         *       &lt;attribute name="AmountAfterTax" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="NightNumber" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             &lt;minInclusive value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="RatePlanCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="64"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="BuyingAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="MealPriceBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="MealPriceAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="OnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NightlyRate {

            @XmlAttribute(name = "AmountAfterTax", required = true)
            protected float amountAfterTax;
            @XmlAttribute(name = "AmountBeforeTax")
            protected Float amountBeforeTax;
            @XmlAttribute(name = "NightNumber", required = true)
            protected int nightNumber;
            @XmlAttribute(name = "RatePlanCode")
            protected String ratePlanCode;
            @XmlAttribute(name = "BuyingAmount")
            protected Float buyingAmount;
            @XmlAttribute(name = "MealPriceBeforeTax")
            protected Float mealPriceBeforeTax;
            @XmlAttribute(name = "MealPriceAfterTax")
            protected Float mealPriceAfterTax;
            @XmlAttribute(name = "Date")
            protected String date;
            @XmlAttribute(name = "OnRequest")
            protected Boolean onRequest;
            @XmlAttribute(name = "SellAmountBeforeTax")
            protected Float sellAmountBeforeTax;
            @XmlAttribute(name = "SellAmountAfterTax")
            protected Float sellAmountAfterTax;
            @XmlAttribute(name = "SellMealPriceBeforeTax")
            protected Float sellMealPriceBeforeTax;
            @XmlAttribute(name = "SellMealPriceAfterTax")
            protected Float sellMealPriceAfterTax;
            @XmlAttribute(name = "SellAmount")
            protected Float sellAmount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * 获取amountAfterTax属性的值。
             * 
             */
            public float getAmountAfterTax() {
                return amountAfterTax;
            }

            /**
             * 设置amountAfterTax属性的值。
             * 
             */
            public void setAmountAfterTax(float value) {
                this.amountAfterTax = value;
            }

            /**
             * 获取amountBeforeTax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getAmountBeforeTax() {
                return amountBeforeTax;
            }

            /**
             * 设置amountBeforeTax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setAmountBeforeTax(Float value) {
                this.amountBeforeTax = value;
            }

            /**
             * 获取nightNumber属性的值。
             * 
             */
            public int getNightNumber() {
                return nightNumber;
            }

            /**
             * 设置nightNumber属性的值。
             * 
             */
            public void setNightNumber(int value) {
                this.nightNumber = value;
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
             * 获取buyingAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getBuyingAmount() {
                return buyingAmount;
            }

            /**
             * 设置buyingAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setBuyingAmount(Float value) {
                this.buyingAmount = value;
            }

            /**
             * 获取mealPriceBeforeTax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getMealPriceBeforeTax() {
                return mealPriceBeforeTax;
            }

            /**
             * 设置mealPriceBeforeTax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setMealPriceBeforeTax(Float value) {
                this.mealPriceBeforeTax = value;
            }

            /**
             * 获取mealPriceAfterTax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getMealPriceAfterTax() {
                return mealPriceAfterTax;
            }

            /**
             * 设置mealPriceAfterTax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setMealPriceAfterTax(Float value) {
                this.mealPriceAfterTax = value;
            }

            /**
             * 获取date属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDate() {
                return date;
            }

            /**
             * 设置date属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDate(String value) {
                this.date = value;
            }

            /**
             * 获取onRequest属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOnRequest() {
                return onRequest;
            }

            /**
             * 设置onRequest属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOnRequest(Boolean value) {
                this.onRequest = value;
            }

            /**
             * 获取sellAmountBeforeTax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getSellAmountBeforeTax() {
                return sellAmountBeforeTax;
            }

            /**
             * 设置sellAmountBeforeTax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setSellAmountBeforeTax(Float value) {
                this.sellAmountBeforeTax = value;
            }

            /**
             * 获取sellAmountAfterTax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getSellAmountAfterTax() {
                return sellAmountAfterTax;
            }

            /**
             * 设置sellAmountAfterTax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setSellAmountAfterTax(Float value) {
                this.sellAmountAfterTax = value;
            }

            /**
             * 获取sellMealPriceBeforeTax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getSellMealPriceBeforeTax() {
                return sellMealPriceBeforeTax;
            }

            /**
             * 设置sellMealPriceBeforeTax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setSellMealPriceBeforeTax(Float value) {
                this.sellMealPriceBeforeTax = value;
            }

            /**
             * 获取sellMealPriceAfterTax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getSellMealPriceAfterTax() {
                return sellMealPriceAfterTax;
            }

            /**
             * 设置sellMealPriceAfterTax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setSellMealPriceAfterTax(Float value) {
                this.sellMealPriceAfterTax = value;
            }

            /**
             * 获取sellAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getSellAmount() {
                return sellAmount;
            }

            /**
             * 设置sellAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setSellAmount(Float value) {
                this.sellAmount = value;
            }

            /**
             * 获取currencyCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * 设置currencyCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * 获取decimalPlaces属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * 设置decimalPlaces属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
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
     *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}TaxType" maxOccurs="99" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tax"
    })
    public static class Taxes {

        @XmlElement(name = "Tax")
        protected List<TaxType> tax;
        @XmlAttribute(name = "Amount")
        protected Float amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxType }
         * 
         * 
         */
        public List<TaxType> getTax() {
            if (tax == null) {
                tax = new ArrayList<TaxType>();
            }
            return this.tax;
        }

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setAmount(Float value) {
            this.amount = value;
        }

        /**
         * 获取currencyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * 设置currencyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SellingPrices"/>
     *       &lt;attribute name="BuyingAmount">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *             &lt;minInclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="MealPriceBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="MealPriceAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Total
        extends TotalType
    {

        @XmlAttribute(name = "BuyingAmount")
        protected Double buyingAmount;
        @XmlAttribute(name = "MealPriceBeforeTax")
        protected Float mealPriceBeforeTax;
        @XmlAttribute(name = "MealPriceAfterTax")
        protected Float mealPriceAfterTax;
        @XmlAttribute(name = "SellAmountBeforeTax")
        protected Float sellAmountBeforeTax;
        @XmlAttribute(name = "SellAmountAfterTax")
        protected Float sellAmountAfterTax;
        @XmlAttribute(name = "SellMealPriceBeforeTax")
        protected Float sellMealPriceBeforeTax;
        @XmlAttribute(name = "SellMealPriceAfterTax")
        protected Float sellMealPriceAfterTax;
        @XmlAttribute(name = "SellAmount")
        protected Float sellAmount;

        /**
         * 获取buyingAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getBuyingAmount() {
            return buyingAmount;
        }

        /**
         * 设置buyingAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setBuyingAmount(Double value) {
            this.buyingAmount = value;
        }

        /**
         * 获取mealPriceBeforeTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMealPriceBeforeTax() {
            return mealPriceBeforeTax;
        }

        /**
         * 设置mealPriceBeforeTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMealPriceBeforeTax(Float value) {
            this.mealPriceBeforeTax = value;
        }

        /**
         * 获取mealPriceAfterTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMealPriceAfterTax() {
            return mealPriceAfterTax;
        }

        /**
         * 设置mealPriceAfterTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMealPriceAfterTax(Float value) {
            this.mealPriceAfterTax = value;
        }

        /**
         * 获取sellAmountBeforeTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSellAmountBeforeTax() {
            return sellAmountBeforeTax;
        }

        /**
         * 设置sellAmountBeforeTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSellAmountBeforeTax(Float value) {
            this.sellAmountBeforeTax = value;
        }

        /**
         * 获取sellAmountAfterTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSellAmountAfterTax() {
            return sellAmountAfterTax;
        }

        /**
         * 设置sellAmountAfterTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSellAmountAfterTax(Float value) {
            this.sellAmountAfterTax = value;
        }

        /**
         * 获取sellMealPriceBeforeTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSellMealPriceBeforeTax() {
            return sellMealPriceBeforeTax;
        }

        /**
         * 设置sellMealPriceBeforeTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSellMealPriceBeforeTax(Float value) {
            this.sellMealPriceBeforeTax = value;
        }

        /**
         * 获取sellMealPriceAfterTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSellMealPriceAfterTax() {
            return sellMealPriceAfterTax;
        }

        /**
         * 设置sellMealPriceAfterTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSellMealPriceAfterTax(Float value) {
            this.sellMealPriceAfterTax = value;
        }

        /**
         * 获取sellAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSellAmount() {
            return sellAmount;
        }

        /**
         * 设置sellAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSellAmount(Float value) {
            this.sellAmount = value;
        }

    }

}
