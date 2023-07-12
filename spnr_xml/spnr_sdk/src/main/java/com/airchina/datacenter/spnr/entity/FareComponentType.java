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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Information representing sold data supporting the fare construction applicable to each fare component in a transaction.
 * 
 * <p>FareComponentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FareComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceableUnit" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareComponentDetail" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CouponSequence" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *                                     &lt;attribute name="SequenceNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                                     &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *                                     &lt;attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ConstructionPrinciple" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
 *                                     &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
 *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                     &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BaseAmount" maxOccurs="3">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                     &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TicketDesignator" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="TicketDesignatorCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                                     &lt;attribute name="TicketDesignatorQualifier" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *                           &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
 *                           &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *                           &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                           &lt;attribute name="WaiverCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
 *                           &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                           &lt;attribute name="RuleCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
 *                           &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="AgreementCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalConstructionAmount" maxOccurs="3">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Purpose" use="required" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *       &lt;attribute name="PriceQuoteDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *       &lt;attribute name="AccountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="PricingDesignator" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentType", propOrder = {
    "priceableUnit",
    "totalConstructionAmount"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.EMDType.ExchResidualFareComponent.class
})
public class FareComponentType {

    @XmlElement(name = "PriceableUnit", required = true)
    protected List<FareComponentType.PriceableUnit> priceableUnit;
    @XmlElement(name = "TotalConstructionAmount", required = true)
    protected List<FareComponentType.TotalConstructionAmount> totalConstructionAmount;
    @XmlAttribute(name = "PriceQuoteDate")
    protected String priceQuoteDate;
    @XmlAttribute(name = "AccountCode")
    protected String accountCode;
    @XmlAttribute(name = "PricingDesignator")
    protected String pricingDesignator;
    @XmlAttribute(name = "ExchangeRate")
    protected BigDecimal exchangeRate;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;

    /**
     * Gets the value of the priceableUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceableUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceableUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentType.PriceableUnit }
     * 
     * 
     */
    public List<FareComponentType.PriceableUnit> getPriceableUnit() {
        if (priceableUnit == null) {
            priceableUnit = new ArrayList<FareComponentType.PriceableUnit>();
        }
        return this.priceableUnit;
    }

    /**
     * Gets the value of the totalConstructionAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalConstructionAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalConstructionAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentType.TotalConstructionAmount }
     * 
     * 
     */
    public List<FareComponentType.TotalConstructionAmount> getTotalConstructionAmount() {
        if (totalConstructionAmount == null) {
            totalConstructionAmount = new ArrayList<FareComponentType.TotalConstructionAmount>();
        }
        return this.totalConstructionAmount;
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
     * 获取accountCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * 设置accountCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * 获取pricingDesignator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingDesignator() {
        return pricingDesignator;
    }

    /**
     * 设置pricingDesignator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingDesignator(String value) {
        this.pricingDesignator = value;
    }

    /**
     * 获取exchangeRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * 设置exchangeRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FareComponentDetail" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CouponSequence" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *                           &lt;attribute name="SequenceNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                           &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
     *                           &lt;attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ConstructionPrinciple" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
     *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
     *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                           &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BaseAmount" maxOccurs="3">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                           &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TicketDesignator" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="TicketDesignatorCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                           &lt;attribute name="TicketDesignatorQualifier" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
     *                 &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *                 &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *                 &lt;attribute name="WaiverCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
     *                 &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *                 &lt;attribute name="RuleCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
     *                 &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="AgreementCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fareComponentDetail"
    })
    public static class PriceableUnit {

        @XmlElement(name = "FareComponentDetail", required = true)
        protected List<FareComponentType.PriceableUnit.FareComponentDetail> fareComponentDetail;
        @XmlAttribute(name = "Number", required = true)
        protected String number;

        /**
         * Gets the value of the fareComponentDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareComponentDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareComponentDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareComponentType.PriceableUnit.FareComponentDetail }
         * 
         * 
         */
        public List<FareComponentType.PriceableUnit.FareComponentDetail> getFareComponentDetail() {
            if (fareComponentDetail == null) {
                fareComponentDetail = new ArrayList<FareComponentType.PriceableUnit.FareComponentDetail>();
            }
            return this.fareComponentDetail;
        }

        /**
         * 获取number属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * 设置number属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
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
         *         &lt;element name="CouponSequence" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
         *                 &lt;attribute name="SequenceNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *                 &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
         *                 &lt;attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ConstructionPrinciple" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
         *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
         *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                 &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BaseAmount" maxOccurs="3">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                 &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TicketDesignator" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="TicketDesignatorCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *                 &lt;attribute name="TicketDesignatorQualifier" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
         *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
         *       &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
         *       &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
         *       &lt;attribute name="WaiverCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
         *       &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *       &lt;attribute name="RuleCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
         *       &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="AgreementCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "couponSequence",
            "constructionPrinciple",
            "baseAmount",
            "ticketDesignator"
        })
        public static class FareComponentDetail {

            @XmlElement(name = "CouponSequence", required = true)
            protected List<FareComponentType.PriceableUnit.FareComponentDetail.CouponSequence> couponSequence;
            @XmlElement(name = "ConstructionPrinciple")
            protected List<FareComponentType.PriceableUnit.FareComponentDetail.ConstructionPrinciple> constructionPrinciple;
            @XmlElement(name = "BaseAmount", required = true)
            protected List<FareComponentType.PriceableUnit.FareComponentDetail.BaseAmount> baseAmount;
            @XmlElement(name = "TicketDesignator")
            protected List<FareComponentType.PriceableUnit.FareComponentDetail.TicketDesignator> ticketDesignator;
            @XmlAttribute(name = "Number", required = true)
            protected int number;
            @XmlAttribute(name = "TariffNumber")
            protected String tariffNumber;
            @XmlAttribute(name = "RuleNumber")
            protected String ruleNumber;
            @XmlAttribute(name = "WaiverCode")
            protected String waiverCode;
            @XmlAttribute(name = "PassengerTypeCode")
            protected String passengerTypeCode;
            @XmlAttribute(name = "RuleCode")
            protected String ruleCode;
            @XmlAttribute(name = "FareBasisCode")
            protected String fareBasisCode;
            @XmlAttribute(name = "AgreementCode")
            protected String agreementCode;
            @XmlAttribute(name = "CompanyType")
            protected String companyType;
            @XmlAttribute(name = "CompanyShortName")
            protected String companyShortName;
            @XmlAttribute(name = "TravelSector")
            protected String travelSector;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;

            /**
             * Gets the value of the couponSequence property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the couponSequence property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCouponSequence().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareComponentType.PriceableUnit.FareComponentDetail.CouponSequence }
             * 
             * 
             */
            public List<FareComponentType.PriceableUnit.FareComponentDetail.CouponSequence> getCouponSequence() {
                if (couponSequence == null) {
                    couponSequence = new ArrayList<FareComponentType.PriceableUnit.FareComponentDetail.CouponSequence>();
                }
                return this.couponSequence;
            }

            /**
             * Gets the value of the constructionPrinciple property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the constructionPrinciple property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConstructionPrinciple().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareComponentType.PriceableUnit.FareComponentDetail.ConstructionPrinciple }
             * 
             * 
             */
            public List<FareComponentType.PriceableUnit.FareComponentDetail.ConstructionPrinciple> getConstructionPrinciple() {
                if (constructionPrinciple == null) {
                    constructionPrinciple = new ArrayList<FareComponentType.PriceableUnit.FareComponentDetail.ConstructionPrinciple>();
                }
                return this.constructionPrinciple;
            }

            /**
             * Gets the value of the baseAmount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the baseAmount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBaseAmount().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareComponentType.PriceableUnit.FareComponentDetail.BaseAmount }
             * 
             * 
             */
            public List<FareComponentType.PriceableUnit.FareComponentDetail.BaseAmount> getBaseAmount() {
                if (baseAmount == null) {
                    baseAmount = new ArrayList<FareComponentType.PriceableUnit.FareComponentDetail.BaseAmount>();
                }
                return this.baseAmount;
            }

            /**
             * Gets the value of the ticketDesignator property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ticketDesignator property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTicketDesignator().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareComponentType.PriceableUnit.FareComponentDetail.TicketDesignator }
             * 
             * 
             */
            public List<FareComponentType.PriceableUnit.FareComponentDetail.TicketDesignator> getTicketDesignator() {
                if (ticketDesignator == null) {
                    ticketDesignator = new ArrayList<FareComponentType.PriceableUnit.FareComponentDetail.TicketDesignator>();
                }
                return this.ticketDesignator;
            }

            /**
             * 获取number属性的值。
             * 
             */
            public int getNumber() {
                return number;
            }

            /**
             * 设置number属性的值。
             * 
             */
            public void setNumber(int value) {
                this.number = value;
            }

            /**
             * 获取tariffNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTariffNumber() {
                return tariffNumber;
            }

            /**
             * 设置tariffNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTariffNumber(String value) {
                this.tariffNumber = value;
            }

            /**
             * 获取ruleNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRuleNumber() {
                return ruleNumber;
            }

            /**
             * 设置ruleNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRuleNumber(String value) {
                this.ruleNumber = value;
            }

            /**
             * 获取waiverCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWaiverCode() {
                return waiverCode;
            }

            /**
             * 设置waiverCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWaiverCode(String value) {
                this.waiverCode = value;
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
             * 获取fareBasisCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareBasisCode() {
                return fareBasisCode;
            }

            /**
             * 设置fareBasisCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareBasisCode(String value) {
                this.fareBasisCode = value;
            }

            /**
             * 获取agreementCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgreementCode() {
                return agreementCode;
            }

            /**
             * 设置agreementCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgreementCode(String value) {
                this.agreementCode = value;
            }

            /**
             * 获取companyType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanyType() {
                return companyType;
            }

            /**
             * 设置companyType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyType(String value) {
                this.companyType = value;
            }

            /**
             * 获取companyShortName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanyShortName() {
                return companyShortName;
            }

            /**
             * 设置companyShortName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyShortName(String value) {
                this.companyShortName = value;
            }

            /**
             * 获取travelSector属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTravelSector() {
                return travelSector;
            }

            /**
             * 设置travelSector属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTravelSector(String value) {
                this.travelSector = value;
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
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *       &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BaseAmount {

                @XmlAttribute(name = "Purpose")
                protected PurposeType purpose;
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
                 * 获取purpose属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link PurposeType }
                 *     
                 */
                public PurposeType getPurpose() {
                    return purpose;
                }

                /**
                 * 设置purpose属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PurposeType }
                 *     
                 */
                public void setPurpose(PurposeType value) {
                    this.purpose = value;
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


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
             *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
             *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *       &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ConstructionPrinciple {

                @XmlAttribute(name = "Code", required = true)
                protected String code;
                @XmlAttribute(name = "Amount")
                protected BigDecimal amount;
                @XmlAttribute(name = "Percent")
                protected BigDecimal percent;
                @XmlAttribute(name = "OriginCityCode")
                protected String originCityCode;
                @XmlAttribute(name = "OriginCodeContext")
                protected String originCodeContext;
                @XmlAttribute(name = "DestinationCityCode")
                protected String destinationCityCode;
                @XmlAttribute(name = "DestinationCodeContext")
                protected String destinationCodeContext;

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
                 * 获取amount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmount() {
                    return amount;
                }

                /**
                 * 设置amount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmount(BigDecimal value) {
                    this.amount = value;
                }

                /**
                 * 获取percent属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPercent() {
                    return percent;
                }

                /**
                 * 设置percent属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPercent(BigDecimal value) {
                    this.percent = value;
                }

                /**
                 * 获取originCityCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginCityCode() {
                    return originCityCode;
                }

                /**
                 * 设置originCityCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginCityCode(String value) {
                    this.originCityCode = value;
                }

                /**
                 * 获取originCodeContext属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginCodeContext() {
                    return originCodeContext;
                }

                /**
                 * 设置originCodeContext属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginCodeContext(String value) {
                    this.originCodeContext = value;
                }

                /**
                 * 获取destinationCityCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestinationCityCode() {
                    return destinationCityCode;
                }

                /**
                 * 设置destinationCityCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestinationCityCode(String value) {
                    this.destinationCityCode = value;
                }

                /**
                 * 获取destinationCodeContext属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestinationCodeContext() {
                    return destinationCodeContext;
                }

                /**
                 * 设置destinationCodeContext属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestinationCodeContext(String value) {
                    this.destinationCodeContext = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
             *       &lt;attribute name="SequenceNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
             *       &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
             *       &lt;attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CouponSequence {

                @XmlAttribute(name = "SequenceNbr")
                protected String sequenceNbr;
                @XmlAttribute(name = "CouponItinerarySeqNbr")
                protected Integer couponItinerarySeqNbr;
                @XmlAttribute(name = "StopoverInd")
                protected Boolean stopoverInd;
                @XmlAttribute(name = "ResBookDesigCode")
                protected String resBookDesigCode;
                @XmlAttribute(name = "OriginCityCode")
                protected String originCityCode;
                @XmlAttribute(name = "OriginCodeContext")
                protected String originCodeContext;
                @XmlAttribute(name = "DestinationCityCode")
                protected String destinationCityCode;
                @XmlAttribute(name = "DestinationCodeContext")
                protected String destinationCodeContext;
                @XmlAttribute(name = "CompanyType")
                protected String companyType;
                @XmlAttribute(name = "CompanyShortName")
                protected String companyShortName;
                @XmlAttribute(name = "TravelSector")
                protected String travelSector;
                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * 获取sequenceNbr属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSequenceNbr() {
                    return sequenceNbr;
                }

                /**
                 * 设置sequenceNbr属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSequenceNbr(String value) {
                    this.sequenceNbr = value;
                }

                /**
                 * 获取couponItinerarySeqNbr属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getCouponItinerarySeqNbr() {
                    return couponItinerarySeqNbr;
                }

                /**
                 * 设置couponItinerarySeqNbr属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setCouponItinerarySeqNbr(Integer value) {
                    this.couponItinerarySeqNbr = value;
                }

                /**
                 * 获取stopoverInd属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isStopoverInd() {
                    return stopoverInd;
                }

                /**
                 * 设置stopoverInd属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setStopoverInd(Boolean value) {
                    this.stopoverInd = value;
                }

                /**
                 * 获取resBookDesigCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResBookDesigCode() {
                    return resBookDesigCode;
                }

                /**
                 * 设置resBookDesigCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setResBookDesigCode(String value) {
                    this.resBookDesigCode = value;
                }

                /**
                 * 获取originCityCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginCityCode() {
                    return originCityCode;
                }

                /**
                 * 设置originCityCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginCityCode(String value) {
                    this.originCityCode = value;
                }

                /**
                 * 获取originCodeContext属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginCodeContext() {
                    return originCodeContext;
                }

                /**
                 * 设置originCodeContext属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginCodeContext(String value) {
                    this.originCodeContext = value;
                }

                /**
                 * 获取destinationCityCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestinationCityCode() {
                    return destinationCityCode;
                }

                /**
                 * 设置destinationCityCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestinationCityCode(String value) {
                    this.destinationCityCode = value;
                }

                /**
                 * 获取destinationCodeContext属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestinationCodeContext() {
                    return destinationCodeContext;
                }

                /**
                 * 设置destinationCodeContext属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestinationCodeContext(String value) {
                    this.destinationCodeContext = value;
                }

                /**
                 * 获取companyType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompanyType() {
                    return companyType;
                }

                /**
                 * 设置companyType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompanyType(String value) {
                    this.companyType = value;
                }

                /**
                 * 获取companyShortName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompanyShortName() {
                    return companyShortName;
                }

                /**
                 * 设置companyShortName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompanyShortName(String value) {
                    this.companyShortName = value;
                }

                /**
                 * 获取travelSector属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTravelSector() {
                    return travelSector;
                }

                /**
                 * 设置travelSector属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTravelSector(String value) {
                    this.travelSector = value;
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
             *       &lt;attribute name="TicketDesignatorCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
             *       &lt;attribute name="TicketDesignatorQualifier" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TicketDesignator {

                @XmlAttribute(name = "TicketDesignatorCode", required = true)
                protected String ticketDesignatorCode;
                @XmlAttribute(name = "TicketDesignatorQualifier")
                protected String ticketDesignatorQualifier;

                /**
                 * 获取ticketDesignatorCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTicketDesignatorCode() {
                    return ticketDesignatorCode;
                }

                /**
                 * 设置ticketDesignatorCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTicketDesignatorCode(String value) {
                    this.ticketDesignatorCode = value;
                }

                /**
                 * 获取ticketDesignatorQualifier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTicketDesignatorQualifier() {
                    return ticketDesignatorQualifier;
                }

                /**
                 * 设置ticketDesignatorQualifier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTicketDesignatorQualifier(String value) {
                    this.ticketDesignatorQualifier = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attribute name="Purpose" use="required" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalConstructionAmount {

        @XmlAttribute(name = "Purpose", required = true)
        protected PurposeType purpose;
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
         * 获取purpose属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PurposeType }
         *     
         */
        public PurposeType getPurpose() {
            return purpose;
        }

        /**
         * 设置purpose属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PurposeType }
         *     
         */
        public void setPurpose(PurposeType value) {
            this.purpose = value;
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
