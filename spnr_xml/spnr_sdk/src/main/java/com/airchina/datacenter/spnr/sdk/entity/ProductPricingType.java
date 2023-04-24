//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ProductPricingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProductPricingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportingExchangeRates" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PostPayTotal" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrePayTotal" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Includes" type="{http://www.opentravel.org/OTA/2003/05}IncludesType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitPrice"/>
 *                 &lt;attribute name="MOR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}SPNR_PriceAdjustmentsType" minOccurs="0"/>
 *         &lt;element name="CancellationFees" type="{http://www.opentravel.org/OTA/2003/05}CancellationFeesType" minOccurs="0"/>
 *         &lt;element name="AmendmentFees" type="{http://www.opentravel.org/OTA/2003/05}AmendmentFeesType" minOccurs="0"/>
 *         &lt;element name="CancellationRefunds" type="{http://www.opentravel.org/OTA/2003/05}CancellationRefundsType" minOccurs="0"/>
 *         &lt;element name="TotalPrice">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ComponentTotal" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *                   &lt;element name="AmendmentFees" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *                   &lt;element name="ExcludedAdjustments" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyProductType" minOccurs="0"/>
 *         &lt;element name="InfoAmount" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ProductPricingType", propOrder = {
    "reportingExchangeRates",
    "postPayTotal",
    "prePayTotal",
    "priceAdjustments",
    "cancellationFees",
    "amendmentFees",
    "cancellationRefunds",
    "totalPrice",
    "loyalty",
    "infoAmount"
})
public class ProductPricingType {

    @XmlElement(name = "ReportingExchangeRates")
    protected List<ProductPricingType.ReportingExchangeRates> reportingExchangeRates;
    @XmlElement(name = "PostPayTotal")
    protected ProductPricingType.PostPayTotal postPayTotal;
    @XmlElement(name = "PrePayTotal")
    protected ProductPricingType.PrePayTotal prePayTotal;
    @XmlElement(name = "PriceAdjustments")
    protected SPNRPriceAdjustmentsType priceAdjustments;
    @XmlElement(name = "CancellationFees")
    protected CancellationFeesType cancellationFees;
    @XmlElement(name = "AmendmentFees")
    protected AmendmentFeesType amendmentFees;
    @XmlElement(name = "CancellationRefunds")
    protected CancellationRefundsType cancellationRefunds;
    @XmlElement(name = "TotalPrice", required = true)
    protected ProductPricingType.TotalPrice totalPrice;
    @XmlElement(name = "Loyalty")
    protected LoyaltyProductType loyalty;
    @XmlElement(name = "InfoAmount")
    protected List<ProductPricingType.InfoAmount> infoAmount;

    /**
     * Gets the value of the reportingExchangeRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportingExchangeRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportingExchangeRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPricingType.ReportingExchangeRates }
     * 
     * 
     */
    public List<ProductPricingType.ReportingExchangeRates> getReportingExchangeRates() {
        if (reportingExchangeRates == null) {
            reportingExchangeRates = new ArrayList<ProductPricingType.ReportingExchangeRates>();
        }
        return this.reportingExchangeRates;
    }

    /**
     * 获取postPayTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType.PostPayTotal }
     *     
     */
    public ProductPricingType.PostPayTotal getPostPayTotal() {
        return postPayTotal;
    }

    /**
     * 设置postPayTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType.PostPayTotal }
     *     
     */
    public void setPostPayTotal(ProductPricingType.PostPayTotal value) {
        this.postPayTotal = value;
    }

    /**
     * 获取prePayTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType.PrePayTotal }
     *     
     */
    public ProductPricingType.PrePayTotal getPrePayTotal() {
        return prePayTotal;
    }

    /**
     * 设置prePayTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType.PrePayTotal }
     *     
     */
    public void setPrePayTotal(ProductPricingType.PrePayTotal value) {
        this.prePayTotal = value;
    }

    /**
     * 获取priceAdjustments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SPNRPriceAdjustmentsType }
     *     
     */
    public SPNRPriceAdjustmentsType getPriceAdjustments() {
        return priceAdjustments;
    }

    /**
     * 设置priceAdjustments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SPNRPriceAdjustmentsType }
     *     
     */
    public void setPriceAdjustments(SPNRPriceAdjustmentsType value) {
        this.priceAdjustments = value;
    }

    /**
     * 获取cancellationFees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancellationFeesType }
     *     
     */
    public CancellationFeesType getCancellationFees() {
        return cancellationFees;
    }

    /**
     * 设置cancellationFees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationFeesType }
     *     
     */
    public void setCancellationFees(CancellationFeesType value) {
        this.cancellationFees = value;
    }

    /**
     * 获取amendmentFees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmendmentFeesType }
     *     
     */
    public AmendmentFeesType getAmendmentFees() {
        return amendmentFees;
    }

    /**
     * 设置amendmentFees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentFeesType }
     *     
     */
    public void setAmendmentFees(AmendmentFeesType value) {
        this.amendmentFees = value;
    }

    /**
     * 获取cancellationRefunds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancellationRefundsType }
     *     
     */
    public CancellationRefundsType getCancellationRefunds() {
        return cancellationRefunds;
    }

    /**
     * 设置cancellationRefunds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRefundsType }
     *     
     */
    public void setCancellationRefunds(CancellationRefundsType value) {
        this.cancellationRefunds = value;
    }

    /**
     * 获取totalPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType.TotalPrice }
     *     
     */
    public ProductPricingType.TotalPrice getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置totalPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType.TotalPrice }
     *     
     */
    public void setTotalPrice(ProductPricingType.TotalPrice value) {
        this.totalPrice = value;
    }

    /**
     * 获取loyalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProductType }
     *     
     */
    public LoyaltyProductType getLoyalty() {
        return loyalty;
    }

    /**
     * 设置loyalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProductType }
     *     
     */
    public void setLoyalty(LoyaltyProductType value) {
        this.loyalty = value;
    }

    /**
     * Gets the value of the infoAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPricingType.InfoAmount }
     * 
     * 
     */
    public List<ProductPricingType.InfoAmount> getInfoAmount() {
        if (infoAmount == null) {
            infoAmount = new ArrayList<ProductPricingType.InfoAmount>();
        }
        return this.infoAmount;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InfoAmount
        extends CurrencyAmountType
    {

        @XmlAttribute(name = "Type")
        protected String type;

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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PostPayTotal {

        @XmlAttribute(name = "Amount")
        protected Float amount;
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
     *         &lt;element name="Includes" type="{http://www.opentravel.org/OTA/2003/05}IncludesType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitPrice"/>
     *       &lt;attribute name="MOR" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "includes",
        "loyalty"
    })
    public static class PrePayTotal {

        @XmlElement(name = "Includes")
        protected List<IncludesType> includes;
        @XmlElement(name = "Loyalty")
        protected LoyaltyPricingType loyalty;
        @XmlAttribute(name = "MOR")
        protected String mor;
        @XmlAttribute(name = "Amount")
        protected Float amount;
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
        @XmlAttribute(name = "UnitPrice")
        protected Float unitPrice;

        /**
         * Gets the value of the includes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncludes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IncludesType }
         * 
         * 
         */
        public List<IncludesType> getIncludes() {
            if (includes == null) {
                includes = new ArrayList<IncludesType>();
            }
            return this.includes;
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
         * 获取mor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMOR() {
            return mor;
        }

        /**
         * 设置mor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMOR(String value) {
            this.mor = value;
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
         * 获取unitPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getUnitPrice() {
            return unitPrice;
        }

        /**
         * 设置unitPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setUnitPrice(Float value) {
            this.unitPrice = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReportingExchangeRates {

        @XmlAttribute(name = "FromCurrency")
        protected String fromCurrency;
        @XmlAttribute(name = "ToCurrency")
        protected String toCurrency;
        @XmlAttribute(name = "Rate")
        protected BigDecimal rate;
        @XmlAttribute(name = "Date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "CompanyID")
        protected String companyID;
        @XmlAttribute(name = "RateID")
        protected String rateID;

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
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRate() {
            return rate;
        }

        /**
         * 设置rate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRate(BigDecimal value) {
            this.rate = value;
        }

        /**
         * 获取date属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * 设置date属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * 获取companyID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyID() {
            return companyID;
        }

        /**
         * 设置companyID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyID(String value) {
            this.companyID = value;
        }

        /**
         * 获取rateID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateID() {
            return rateID;
        }

        /**
         * 设置rateID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateID(String value) {
            this.rateID = value;
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
     *         &lt;element name="ComponentTotal" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
     *         &lt;element name="AmendmentFees" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
     *         &lt;element name="ExcludedAdjustments" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
     *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "componentTotal",
        "amendmentFees",
        "excludedAdjustments",
        "loyalty"
    })
    public static class TotalPrice {

        @XmlElement(name = "ComponentTotal")
        protected CurrencyAmountType componentTotal;
        @XmlElement(name = "AmendmentFees")
        protected CurrencyAmountType amendmentFees;
        @XmlElement(name = "ExcludedAdjustments")
        protected CurrencyAmountType excludedAdjustments;
        @XmlElement(name = "Loyalty")
        protected LoyaltyPricingType loyalty;
        @XmlAttribute(name = "Amount")
        protected Float amount;
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
         * 获取componentTotal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountType }
         *     
         */
        public CurrencyAmountType getComponentTotal() {
            return componentTotal;
        }

        /**
         * 设置componentTotal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountType }
         *     
         */
        public void setComponentTotal(CurrencyAmountType value) {
            this.componentTotal = value;
        }

        /**
         * 获取amendmentFees属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountType }
         *     
         */
        public CurrencyAmountType getAmendmentFees() {
            return amendmentFees;
        }

        /**
         * 设置amendmentFees属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountType }
         *     
         */
        public void setAmendmentFees(CurrencyAmountType value) {
            this.amendmentFees = value;
        }

        /**
         * 获取excludedAdjustments属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountType }
         *     
         */
        public CurrencyAmountType getExcludedAdjustments() {
            return excludedAdjustments;
        }

        /**
         * 设置excludedAdjustments属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountType }
         *     
         */
        public void setExcludedAdjustments(CurrencyAmountType value) {
            this.excludedAdjustments = value;
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
