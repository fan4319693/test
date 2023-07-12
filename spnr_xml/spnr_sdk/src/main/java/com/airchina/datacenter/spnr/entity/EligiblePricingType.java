//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EligiblePricingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EligiblePricingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyConversionGroup"/>
 *                 &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="OriginalPrice" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                 &lt;attribute name="DifferFare" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                 &lt;attribute name="ReissueFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                 &lt;attribute name="RefundAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                 &lt;attribute name="UsedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                 &lt;attribute name="NonRefundableAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                 &lt;attribute name="RoundTripAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *         &lt;element name="TotalFare">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OriginalPrice" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                 &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ItemRPH_List" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *       &lt;attribute name="AssociatedItemRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligiblePricingType", propOrder = {
    "baseFare",
    "priceAdjustments",
    "totalFare"
})
public class EligiblePricingType {

    @XmlElement(name = "BaseFare")
    protected EligiblePricingType.BaseFare baseFare;
    @XmlElement(name = "PriceAdjustments")
    protected ExPriceAdjustmentsType priceAdjustments;
    @XmlElement(name = "TotalFare", required = true)
    protected EligiblePricingType.TotalFare totalFare;
    @XmlAttribute(name = "ItemRPH_List")
    protected List<String> itemRPHList;
    @XmlAttribute(name = "AssociatedItemRPH")
    protected List<String> associatedItemRPH;

    /**
     * 获取baseFare属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EligiblePricingType.BaseFare }
     *     
     */
    public EligiblePricingType.BaseFare getBaseFare() {
        return baseFare;
    }

    /**
     * 设置baseFare属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EligiblePricingType.BaseFare }
     *     
     */
    public void setBaseFare(EligiblePricingType.BaseFare value) {
        this.baseFare = value;
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
     * 获取totalFare属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EligiblePricingType.TotalFare }
     *     
     */
    public EligiblePricingType.TotalFare getTotalFare() {
        return totalFare;
    }

    /**
     * 设置totalFare属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EligiblePricingType.TotalFare }
     *     
     */
    public void setTotalFare(EligiblePricingType.TotalFare value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the itemRPHList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemRPHList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemRPHList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getItemRPHList() {
        if (itemRPHList == null) {
            itemRPHList = new ArrayList<String>();
        }
        return this.itemRPHList;
    }

    /**
     * Gets the value of the associatedItemRPH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedItemRPH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedItemRPH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssociatedItemRPH() {
        if (associatedItemRPH == null) {
            associatedItemRPH = new ArrayList<String>();
        }
        return this.associatedItemRPH;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyConversionGroup"/>
     *       &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="OriginalPrice" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *       &lt;attribute name="DifferFare" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *       &lt;attribute name="ReissueFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *       &lt;attribute name="RefundAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *       &lt;attribute name="UsedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *       &lt;attribute name="NonRefundableAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *       &lt;attribute name="RoundTripAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BaseFare {

        @XmlAttribute(name = "Adjusted")
        protected Float adjusted;
        @XmlAttribute(name = "OriginalPrice")
        protected BigDecimal originalPrice;
        @XmlAttribute(name = "DifferFare")
        protected BigDecimal differFare;
        @XmlAttribute(name = "ReissueFee")
        protected BigDecimal reissueFee;
        @XmlAttribute(name = "RefundAmount")
        protected BigDecimal refundAmount;
        @XmlAttribute(name = "UsedAmount")
        protected BigDecimal usedAmount;
        @XmlAttribute(name = "NonRefundableAmount")
        protected BigDecimal nonRefundableAmount;
        @XmlAttribute(name = "RoundTripAmount")
        protected BigDecimal roundTripAmount;
        @XmlAttribute(name = "Amount")
        protected Float amount;
        @XmlAttribute(name = "BaseAmount")
        protected Float baseAmount;
        @XmlAttribute(name = "PrePayInd")
        protected Boolean prePayInd;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;
        @XmlAttribute(name = "OriginalAmount")
        protected Float originalAmount;
        @XmlAttribute(name = "OriginalCurrencyCode")
        protected String originalCurrencyCode;
        @XmlAttribute(name = "FromCurrency")
        protected String fromCurrency;
        @XmlAttribute(name = "ToCurrency")
        protected String toCurrency;
        @XmlAttribute(name = "Rate")
        protected Float rate;

        /**
         * 获取adjusted属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getAdjusted() {
            return adjusted;
        }

        /**
         * 设置adjusted属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setAdjusted(Float value) {
            this.adjusted = value;
        }

        /**
         * 获取originalPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOriginalPrice() {
            return originalPrice;
        }

        /**
         * 设置originalPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOriginalPrice(BigDecimal value) {
            this.originalPrice = value;
        }

        /**
         * 获取differFare属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDifferFare() {
            return differFare;
        }

        /**
         * 设置differFare属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDifferFare(BigDecimal value) {
            this.differFare = value;
        }

        /**
         * 获取reissueFee属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getReissueFee() {
            return reissueFee;
        }

        /**
         * 设置reissueFee属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setReissueFee(BigDecimal value) {
            this.reissueFee = value;
        }

        /**
         * 获取refundAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRefundAmount() {
            return refundAmount;
        }

        /**
         * 设置refundAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRefundAmount(BigDecimal value) {
            this.refundAmount = value;
        }

        /**
         * 获取usedAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUsedAmount() {
            return usedAmount;
        }

        /**
         * 设置usedAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUsedAmount(BigDecimal value) {
            this.usedAmount = value;
        }

        /**
         * 获取nonRefundableAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNonRefundableAmount() {
            return nonRefundableAmount;
        }

        /**
         * 设置nonRefundableAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNonRefundableAmount(BigDecimal value) {
            this.nonRefundableAmount = value;
        }

        /**
         * 获取roundTripAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRoundTripAmount() {
            return roundTripAmount;
        }

        /**
         * 设置roundTripAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRoundTripAmount(BigDecimal value) {
            this.roundTripAmount = value;
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
         * 获取baseAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getBaseAmount() {
            return baseAmount;
        }

        /**
         * 设置baseAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setBaseAmount(Float value) {
            this.baseAmount = value;
        }

        /**
         * 获取prePayInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrePayInd() {
            return prePayInd;
        }

        /**
         * 设置prePayInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrePayInd(Boolean value) {
            this.prePayInd = value;
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
         * 获取originalAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getOriginalAmount() {
            return originalAmount;
        }

        /**
         * 设置originalAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setOriginalAmount(Float value) {
            this.originalAmount = value;
        }

        /**
         * 获取originalCurrencyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalCurrencyCode() {
            return originalCurrencyCode;
        }

        /**
         * 设置originalCurrencyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalCurrencyCode(String value) {
            this.originalCurrencyCode = value;
        }

        /**
         * 获取fromCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromCurrency() {
            return fromCurrency;
        }

        /**
         * 设置fromCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromCurrency(String value) {
            this.fromCurrency = value;
        }

        /**
         * 获取toCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToCurrency() {
            return toCurrency;
        }

        /**
         * 设置toCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToCurrency(String value) {
            this.toCurrency = value;
        }

        /**
         * 获取rate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getRate() {
            return rate;
        }

        /**
         * 设置rate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setRate(Float value) {
            this.rate = value;
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
     *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginalPrice" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "loyalty"
    })
    public static class TotalFare {

        @XmlElement(name = "Loyalty")
        protected LoyaltyPricingType loyalty;
        @XmlAttribute(name = "Adjusted")
        protected String adjusted;
        @XmlAttribute(name = "OriginalPrice")
        protected BigDecimal originalPrice;
        @XmlAttribute(name = "Currency")
        protected String currency;
        @XmlAttribute(name = "Amount")
        protected Float amount;
        @XmlAttribute(name = "BaseAmount")
        protected Float baseAmount;
        @XmlAttribute(name = "PrePayInd")
        protected Boolean prePayInd;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;
        @XmlAttribute(name = "OriginalAmount")
        protected Float originalAmount;
        @XmlAttribute(name = "OriginalCurrencyCode")
        protected String originalCurrencyCode;

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
         * 获取adjusted属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjusted() {
            return adjusted;
        }

        /**
         * 设置adjusted属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjusted(String value) {
            this.adjusted = value;
        }

        /**
         * 获取originalPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOriginalPrice() {
            return originalPrice;
        }

        /**
         * 设置originalPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOriginalPrice(BigDecimal value) {
            this.originalPrice = value;
        }

        /**
         * 获取currency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * 设置currency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
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
         * 获取baseAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getBaseAmount() {
            return baseAmount;
        }

        /**
         * 设置baseAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setBaseAmount(Float value) {
            this.baseAmount = value;
        }

        /**
         * 获取prePayInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrePayInd() {
            return prePayInd;
        }

        /**
         * 设置prePayInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrePayInd(Boolean value) {
            this.prePayInd = value;
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
         * 获取originalAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getOriginalAmount() {
            return originalAmount;
        }

        /**
         * 设置originalAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setOriginalAmount(Float value) {
            this.originalAmount = value;
        }

        /**
         * 获取originalCurrencyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalCurrencyCode() {
            return originalCurrencyCode;
        }

        /**
         * 设置originalCurrencyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalCurrencyCode(String value) {
            this.originalCurrencyCode = value;
        }

    }

}
