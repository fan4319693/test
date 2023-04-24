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
 * <p>LoyaltyPTCType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LoyaltyPTCType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PTC" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Cash" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                             &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
 *                             &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Redemption" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                             &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
 *                             &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *                             &lt;element name="Redeem">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Earn" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}EarnType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="CurrencyCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="EarnQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="BookingRateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "LoyaltyPTCType", propOrder = {
    "ptc"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyProductType.PTCs.class,
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyPricingType.Combinations.Combination.PTCs.class,
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyDetailsPricingType.Combinations.Combination.PTCs.class
})
public class LoyaltyPTCType {

    @XmlElement(name = "PTC", required = true)
    protected List<LoyaltyPTCType.PTC> ptc;

    /**
     * Gets the value of the ptc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPTC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPTCType.PTC }
     * 
     * 
     */
    public List<LoyaltyPTCType.PTC> getPTC() {
        if (ptc == null) {
            ptc = new ArrayList<LoyaltyPTCType.PTC>();
        }
        return this.ptc;
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
     *         &lt;element name="Cash" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                   &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
     *                   &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Redemption" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                   &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
     *                   &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
     *                   &lt;element name="Redeem">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Earn" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}EarnType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="CurrencyCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="EarnQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="BookingRateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cash",
        "redemption",
        "earn"
    })
    public static class PTC {

        @XmlElement(name = "Cash")
        protected List<LoyaltyPTCType.PTC.Cash> cash;
        @XmlElement(name = "Redemption")
        protected LoyaltyPTCType.PTC.Redemption redemption;
        @XmlElement(name = "Earn")
        protected LoyaltyPTCType.PTC.Earn earn;
        @XmlAttribute(name = "RPH", required = true)
        protected String rph;
        @XmlAttribute(name = "Code", required = true)
        protected String code;
        @XmlAttribute(name = "Count", required = true)
        protected String count;
        @XmlAttribute(name = "Amount", required = true)
        protected float amount;
        @XmlAttribute(name = "CurrencyCode", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String currencyCode;
        @XmlAttribute(name = "Quantity", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "EarnQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger earnQuantity;
        @XmlAttribute(name = "BookingRateReference")
        protected String bookingRateReference;

        /**
         * Gets the value of the cash property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cash property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCash().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LoyaltyPTCType.PTC.Cash }
         * 
         * 
         */
        public List<LoyaltyPTCType.PTC.Cash> getCash() {
            if (cash == null) {
                cash = new ArrayList<LoyaltyPTCType.PTC.Cash>();
            }
            return this.cash;
        }

        /**
         * 获取redemption属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LoyaltyPTCType.PTC.Redemption }
         *     
         */
        public LoyaltyPTCType.PTC.Redemption getRedemption() {
            return redemption;
        }

        /**
         * 设置redemption属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LoyaltyPTCType.PTC.Redemption }
         *     
         */
        public void setRedemption(LoyaltyPTCType.PTC.Redemption value) {
            this.redemption = value;
        }

        /**
         * 获取earn属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LoyaltyPTCType.PTC.Earn }
         *     
         */
        public LoyaltyPTCType.PTC.Earn getEarn() {
            return earn;
        }

        /**
         * 设置earn属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LoyaltyPTCType.PTC.Earn }
         *     
         */
        public void setEarn(LoyaltyPTCType.PTC.Earn value) {
            this.earn = value;
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
         * 获取count属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCount() {
            return count;
        }

        /**
         * 设置count属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCount(String value) {
            this.count = value;
        }

        /**
         * 获取amount属性的值。
         * 
         */
        public float getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         */
        public void setAmount(float value) {
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
         * 获取earnQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEarnQuantity() {
            return earnQuantity;
        }

        /**
         * 设置earnQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEarnQuantity(BigInteger value) {
            this.earnQuantity = value;
        }

        /**
         * 获取bookingRateReference属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingRateReference() {
            return bookingRateReference;
        }

        /**
         * 设置bookingRateReference属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingRateReference(String value) {
            this.bookingRateReference = value;
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
         *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *         &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
         *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
         *       &lt;/sequence>
         *       &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "priceAdjustments",
            "formulas",
            "total"
        })
        public static class Cash {

            @XmlElement(name = "PriceAdjustments")
            protected ExPriceAdjustmentsType priceAdjustments;
            @XmlElement(name = "Formulas")
            protected FormulasType formulas;
            @XmlElement(name = "Total", required = true)
            protected TotalType total;
            @XmlAttribute(name = "RateReference")
            protected String rateReference;

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
             * 获取formulas属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FormulasType }
             *     
             */
            public FormulasType getFormulas() {
                return formulas;
            }

            /**
             * 设置formulas属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FormulasType }
             *     
             */
            public void setFormulas(FormulasType value) {
                this.formulas = value;
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
             * 获取rateReference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRateReference() {
                return rateReference;
            }

            /**
             * 设置rateReference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRateReference(String value) {
                this.rateReference = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}EarnType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Earn
            extends EarnType
        {


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
         *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *         &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
         *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
         *         &lt;element name="Redeem">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "priceAdjustments",
            "formulas",
            "total",
            "redeem"
        })
        public static class Redemption {

            @XmlElement(name = "PriceAdjustments")
            protected ExPriceAdjustmentsType priceAdjustments;
            @XmlElement(name = "Formulas")
            protected FormulasType formulas;
            @XmlElement(name = "Total")
            protected TotalType total;
            @XmlElement(name = "Redeem", required = true)
            protected LoyaltyPTCType.PTC.Redemption.Redeem redeem;
            @XmlAttribute(name = "RateReference")
            protected String rateReference;

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
             * 获取formulas属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FormulasType }
             *     
             */
            public FormulasType getFormulas() {
                return formulas;
            }

            /**
             * 设置formulas属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FormulasType }
             *     
             */
            public void setFormulas(FormulasType value) {
                this.formulas = value;
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
             * 获取redeem属性的值。
             * 
             * @return
             *     possible object is
             *     {@link LoyaltyPTCType.PTC.Redemption.Redeem }
             *     
             */
            public LoyaltyPTCType.PTC.Redemption.Redeem getRedeem() {
                return redeem;
            }

            /**
             * 设置redeem属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link LoyaltyPTCType.PTC.Redemption.Redeem }
             *     
             */
            public void setRedeem(LoyaltyPTCType.PTC.Redemption.Redeem value) {
                this.redeem = value;
            }

            /**
             * 获取rateReference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRateReference() {
                return rateReference;
            }

            /**
             * 设置rateReference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRateReference(String value) {
                this.rateReference = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Redeem
                extends RedeemType
            {


            }

        }

    }

}
