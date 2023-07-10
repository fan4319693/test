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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SupplierSpecificInfos" type="{http://www.opentravel.org/OTA/2003/05}SupplierSpecificInfosType" minOccurs="0"/>
 *         &lt;element name="Rate" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}BasicRate"/>
 *                   &lt;element name="TotalRate">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
 *                           &lt;attribute name="RecommendedAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="RecommendedCurrency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CalculatedTotal" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
 *                   &lt;element name="NegotiatedPrice" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Availability" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="PassengerTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="CountReleased" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="CountBooked" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Discounts" minOccurs="0"/>
 *         &lt;element name="CalculatedTotal" type="{http://www.opentravel.org/OTA/2003/05}TotalType" maxOccurs="2"/>
 *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MinAdvPurchase" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CategoryCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Availability" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MinimumTickets" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MaxAdvPurchase" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RateType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CountReleased" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CountBooked" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="LoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="LoyaltyPricingType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supplierSpecificInfos",
    "rate",
    "priceAdjustments",
    "discounts",
    "calculatedTotal",
    "loyalty"
})
@XmlRootElement(name = "Rates")
public class Rates {

    @XmlElement(name = "SupplierSpecificInfos")
    protected SupplierSpecificInfosType supplierSpecificInfos;
    @XmlElement(name = "Rate", required = true)
    protected List<Rates.Rate> rate;
    @XmlElement(name = "PriceAdjustments", required = true)
    protected ExPriceAdjustmentsType priceAdjustments;
    @XmlElement(name = "Discounts")
    protected Discounts discounts;
    @XmlElement(name = "CalculatedTotal", required = true)
    protected List<TotalType> calculatedTotal;
    @XmlElement(name = "Loyalty")
    protected LoyaltyPricingType loyalty;
    @XmlAttribute(name = "MinAdvPurchase")
    @XmlSchemaType(name = "anySimpleType")
    protected String minAdvPurchase;
    @XmlAttribute(name = "CategoryCode", required = true)
    protected String categoryCode;
    @XmlAttribute(name = "Availability")
    protected BigInteger availability;
    @XmlAttribute(name = "MinimumTickets")
    @XmlSchemaType(name = "anySimpleType")
    protected String minimumTickets;
    @XmlAttribute(name = "MaxAdvPurchase")
    @XmlSchemaType(name = "anySimpleType")
    protected String maxAdvPurchase;
    @XmlAttribute(name = "RateType")
    @XmlSchemaType(name = "anySimpleType")
    protected String rateType;
    @XmlAttribute(name = "CountReleased")
    protected Integer countReleased;
    @XmlAttribute(name = "CountBooked")
    protected Integer countBooked;
    @XmlAttribute(name = "LoyaltyIndicator")
    protected Boolean loyaltyIndicator;
    @XmlAttribute(name = "LoyaltyPricingType")
    @XmlSchemaType(name = "anySimpleType")
    protected String loyaltyPricingType;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * 获取supplierSpecificInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierSpecificInfosType }
     *     
     */
    public SupplierSpecificInfosType getSupplierSpecificInfos() {
        return supplierSpecificInfos;
    }

    /**
     * 设置supplierSpecificInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierSpecificInfosType }
     *     
     */
    public void setSupplierSpecificInfos(SupplierSpecificInfosType value) {
        this.supplierSpecificInfos = value;
    }

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
     * {@link Rates.Rate }
     * 
     * 
     */
    public List<Rates.Rate> getRate() {
        if (rate == null) {
            rate = new ArrayList<Rates.Rate>();
        }
        return this.rate;
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
     * 获取discounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Discounts }
     *     
     */
    public Discounts getDiscounts() {
        return discounts;
    }

    /**
     * 设置discounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Discounts }
     *     
     */
    public void setDiscounts(Discounts value) {
        this.discounts = value;
    }

    /**
     * Gets the value of the calculatedTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculatedTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculatedTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalType }
     * 
     * 
     */
    public List<TotalType> getCalculatedTotal() {
        if (calculatedTotal == null) {
            calculatedTotal = new ArrayList<TotalType>();
        }
        return this.calculatedTotal;
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
     * 获取minAdvPurchase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAdvPurchase() {
        return minAdvPurchase;
    }

    /**
     * 设置minAdvPurchase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAdvPurchase(String value) {
        this.minAdvPurchase = value;
    }

    /**
     * 获取categoryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * 设置categoryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * 获取availability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailability() {
        return availability;
    }

    /**
     * 设置availability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailability(BigInteger value) {
        this.availability = value;
    }

    /**
     * 获取minimumTickets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumTickets() {
        return minimumTickets;
    }

    /**
     * 设置minimumTickets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumTickets(String value) {
        this.minimumTickets = value;
    }

    /**
     * 获取maxAdvPurchase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAdvPurchase() {
        return maxAdvPurchase;
    }

    /**
     * 设置maxAdvPurchase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAdvPurchase(String value) {
        this.maxAdvPurchase = value;
    }

    /**
     * 获取rateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * 设置rateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(String value) {
        this.rateType = value;
    }

    /**
     * 获取countReleased属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountReleased() {
        return countReleased;
    }

    /**
     * 设置countReleased属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountReleased(Integer value) {
        this.countReleased = value;
    }

    /**
     * 获取countBooked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountBooked() {
        return countBooked;
    }

    /**
     * 设置countBooked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountBooked(Integer value) {
        this.countBooked = value;
    }

    /**
     * 获取loyaltyIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoyaltyIndicator() {
        return loyaltyIndicator;
    }

    /**
     * 设置loyaltyIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoyaltyIndicator(Boolean value) {
        this.loyaltyIndicator = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}BasicRate"/>
     *         &lt;element name="TotalRate">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
     *                 &lt;attribute name="RecommendedAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="RecommendedCurrency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CalculatedTotal" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
     *         &lt;element name="NegotiatedPrice" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Availability" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="PassengerTypeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="CountReleased" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="CountBooked" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "basicRate",
        "totalRate",
        "calculatedTotal",
        "negotiatedPrice",
        "priceAdjustments",
        "loyalty"
    })
    public static class Rate {

        @XmlElement(name = "BasicRate", required = true)
        protected BasicRate basicRate;
        @XmlElement(name = "TotalRate", required = true)
        protected Rates.Rate.TotalRate totalRate;
        @XmlElement(name = "CalculatedTotal", required = true)
        protected TotalType calculatedTotal;
        @XmlElement(name = "NegotiatedPrice")
        protected Rates.Rate.NegotiatedPrice negotiatedPrice;
        @XmlElement(name = "PriceAdjustments")
        protected ExPriceAdjustmentsType priceAdjustments;
        @XmlElement(name = "Loyalty")
        protected LoyaltyPricingType loyalty;
        @XmlAttribute(name = "Availability")
        protected BigInteger availability;
        @XmlAttribute(name = "PassengerTypeCode", required = true)
        protected String passengerTypeCode;
        @XmlAttribute(name = "Quantity")
        protected BigInteger quantity;
        @XmlAttribute(name = "CountReleased")
        protected Integer countReleased;
        @XmlAttribute(name = "CountBooked")
        protected Integer countBooked;

        /**
         * 获取basicRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BasicRate }
         *     
         */
        public BasicRate getBasicRate() {
            return basicRate;
        }

        /**
         * 设置basicRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BasicRate }
         *     
         */
        public void setBasicRate(BasicRate value) {
            this.basicRate = value;
        }

        /**
         * 获取totalRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Rates.Rate.TotalRate }
         *     
         */
        public Rates.Rate.TotalRate getTotalRate() {
            return totalRate;
        }

        /**
         * 设置totalRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Rates.Rate.TotalRate }
         *     
         */
        public void setTotalRate(Rates.Rate.TotalRate value) {
            this.totalRate = value;
        }

        /**
         * 获取calculatedTotal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TotalType }
         *     
         */
        public TotalType getCalculatedTotal() {
            return calculatedTotal;
        }

        /**
         * 设置calculatedTotal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TotalType }
         *     
         */
        public void setCalculatedTotal(TotalType value) {
            this.calculatedTotal = value;
        }

        /**
         * 获取negotiatedPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Rates.Rate.NegotiatedPrice }
         *     
         */
        public Rates.Rate.NegotiatedPrice getNegotiatedPrice() {
            return negotiatedPrice;
        }

        /**
         * 设置negotiatedPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Rates.Rate.NegotiatedPrice }
         *     
         */
        public void setNegotiatedPrice(Rates.Rate.NegotiatedPrice value) {
            this.negotiatedPrice = value;
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
         * 获取availability属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAvailability() {
            return availability;
        }

        /**
         * 设置availability属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAvailability(BigInteger value) {
            this.availability = value;
        }

        /**
         * 获取passengerTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassengerTypeCode() {
            return passengerTypeCode;
        }

        /**
         * 设置passengerTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassengerTypeCode(String value) {
            this.passengerTypeCode = value;
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
         * 获取countReleased属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCountReleased() {
            return countReleased;
        }

        /**
         * 设置countReleased属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCountReleased(Integer value) {
            this.countReleased = value;
        }

        /**
         * 获取countBooked属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCountBooked() {
            return countBooked;
        }

        /**
         * 设置countBooked属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCountBooked(Integer value) {
            this.countBooked = value;
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
        public static class NegotiatedPrice {

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


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
         *       &lt;attribute name="RecommendedAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="RecommendedCurrency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TotalRate
            extends TotalType
        {

            @XmlAttribute(name = "RecommendedAmount")
            protected Float recommendedAmount;
            @XmlAttribute(name = "RecommendedCurrency")
            protected String recommendedCurrency;

            /**
             * 获取recommendedAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getRecommendedAmount() {
                return recommendedAmount;
            }

            /**
             * 设置recommendedAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setRecommendedAmount(Float value) {
                this.recommendedAmount = value;
            }

            /**
             * 获取recommendedCurrency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecommendedCurrency() {
                return recommendedCurrency;
            }

            /**
             * 设置recommendedCurrency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecommendedCurrency(String value) {
                this.recommendedCurrency = value;
            }

        }

    }

}
