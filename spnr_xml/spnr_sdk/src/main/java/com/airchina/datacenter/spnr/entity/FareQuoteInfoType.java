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
 * Pricing information for the air itinerary to be booked. Each price element contains a fare quoted and associated modifiers
 * 
 * <p>FareQuoteInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FareQuoteInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookingPriceInfoType">
 *       &lt;sequence>
 *         &lt;element name="FlightRefNumber" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightRefNumberGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketDesignators" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TicketDesignator" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="FlightRefRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="TicketDesignatorExtension" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Endorsements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Endorsement" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonEndorsableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Commission" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *                 &lt;attribute name="CapAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                 &lt;attribute name="AdditionalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="FareType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Published"/>
 *             &lt;enumeration value="Private"/>
 *             &lt;enumeration value="Both"/>
 *             &lt;enumeration value="Airline"/>
 *             &lt;enumeration value="Agency"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TourCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="BulkTicketInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *       &lt;attribute name="NetFaresOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQuoteInfoType", propOrder = {
    "flightRefNumber",
    "ticketDesignators",
    "endorsements",
    "commission"
})
public class FareQuoteInfoType
    extends BookingPriceInfoType
{

    @XmlElement(name = "FlightRefNumber")
    protected List<FareQuoteInfoType.FlightRefNumber> flightRefNumber;
    @XmlElement(name = "TicketDesignators")
    protected FareQuoteInfoType.TicketDesignators ticketDesignators;
    @XmlElement(name = "Endorsements")
    protected FareQuoteInfoType.Endorsements endorsements;
    @XmlElement(name = "Commission")
    protected List<FareQuoteInfoType.Commission> commission;
    @XmlAttribute(name = "FareType")
    protected String fareType;
    @XmlAttribute(name = "TourCode")
    protected String tourCode;
    @XmlAttribute(name = "BulkTicketInd")
    protected Boolean bulkTicketInd;
    @XmlAttribute(name = "Operation")
    protected ActionType operation;
    @XmlAttribute(name = "NetFaresOnlyInd")
    protected Boolean netFaresOnlyInd;

    /**
     * Gets the value of the flightRefNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightRefNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareQuoteInfoType.FlightRefNumber }
     * 
     * 
     */
    public List<FareQuoteInfoType.FlightRefNumber> getFlightRefNumber() {
        if (flightRefNumber == null) {
            flightRefNumber = new ArrayList<FareQuoteInfoType.FlightRefNumber>();
        }
        return this.flightRefNumber;
    }

    /**
     * 获取ticketDesignators属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FareQuoteInfoType.TicketDesignators }
     *     
     */
    public FareQuoteInfoType.TicketDesignators getTicketDesignators() {
        return ticketDesignators;
    }

    /**
     * 设置ticketDesignators属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FareQuoteInfoType.TicketDesignators }
     *     
     */
    public void setTicketDesignators(FareQuoteInfoType.TicketDesignators value) {
        this.ticketDesignators = value;
    }

    /**
     * 获取endorsements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FareQuoteInfoType.Endorsements }
     *     
     */
    public FareQuoteInfoType.Endorsements getEndorsements() {
        return endorsements;
    }

    /**
     * 设置endorsements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FareQuoteInfoType.Endorsements }
     *     
     */
    public void setEndorsements(FareQuoteInfoType.Endorsements value) {
        this.endorsements = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareQuoteInfoType.Commission }
     * 
     * 
     */
    public List<FareQuoteInfoType.Commission> getCommission() {
        if (commission == null) {
            commission = new ArrayList<FareQuoteInfoType.Commission>();
        }
        return this.commission;
    }

    /**
     * 获取fareType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareType() {
        return fareType;
    }

    /**
     * 设置fareType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareType(String value) {
        this.fareType = value;
    }

    /**
     * 获取tourCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * 设置tourCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * 获取bulkTicketInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkTicketInd() {
        return bulkTicketInd;
    }

    /**
     * 设置bulkTicketInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkTicketInd(Boolean value) {
        this.bulkTicketInd = value;
    }

    /**
     * 获取operation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getOperation() {
        return operation;
    }

    /**
     * 设置operation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setOperation(ActionType value) {
        this.operation = value;
    }

    /**
     * 获取netFaresOnlyInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetFaresOnlyInd() {
        return netFaresOnlyInd;
    }

    /**
     * 设置netFaresOnlyInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetFaresOnlyInd(Boolean value) {
        this.netFaresOnlyInd = value;
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
     *       &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *       &lt;attribute name="CapAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *       &lt;attribute name="AdditionalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Commission {

        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
        @XmlAttribute(name = "CapAmount")
        protected BigDecimal capAmount;
        @XmlAttribute(name = "AdditionalInd")
        protected Boolean additionalInd;
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
         * 获取capAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCapAmount() {
            return capAmount;
        }

        /**
         * 设置capAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCapAmount(BigDecimal value) {
            this.capAmount = value;
        }

        /**
         * 获取additionalInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAdditionalInd() {
            return additionalInd;
        }

        /**
         * 设置additionalInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAdditionalInd(Boolean value) {
            this.additionalInd = value;
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
     *       &lt;sequence>
     *         &lt;element name="Endorsement" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonEndorsableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "endorsement"
    })
    public static class Endorsements {

        @XmlElement(name = "Endorsement", required = true)
        protected List<FareQuoteInfoType.Endorsements.Endorsement> endorsement;
        @XmlAttribute(name = "NonRefundableIndicator")
        protected Boolean nonRefundableIndicator;
        @XmlAttribute(name = "NonEndorsableIndicator")
        protected Boolean nonEndorsableIndicator;

        /**
         * Gets the value of the endorsement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endorsement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEndorsement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareQuoteInfoType.Endorsements.Endorsement }
         * 
         * 
         */
        public List<FareQuoteInfoType.Endorsements.Endorsement> getEndorsement() {
            if (endorsement == null) {
                endorsement = new ArrayList<FareQuoteInfoType.Endorsements.Endorsement>();
            }
            return this.endorsement;
        }

        /**
         * 获取nonRefundableIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonRefundableIndicator() {
            return nonRefundableIndicator;
        }

        /**
         * 设置nonRefundableIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonRefundableIndicator(Boolean value) {
            this.nonRefundableIndicator = value;
        }

        /**
         * 获取nonEndorsableIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonEndorsableIndicator() {
            return nonEndorsableIndicator;
        }

        /**
         * 设置nonEndorsableIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonEndorsableIndicator(Boolean value) {
            this.nonEndorsableIndicator = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Endorsement
            extends FreeTextType
        {


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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightRefNumberGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightRefNumber {

        @XmlAttribute(name = "RPH")
        protected String rph;

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
     *         &lt;element name="TicketDesignator" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="FlightRefRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="TicketDesignatorExtension" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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
        "ticketDesignator"
    })
    public static class TicketDesignators {

        @XmlElement(name = "TicketDesignator", required = true)
        protected List<FareQuoteInfoType.TicketDesignators.TicketDesignator> ticketDesignator;

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
         * {@link FareQuoteInfoType.TicketDesignators.TicketDesignator }
         * 
         * 
         */
        public List<FareQuoteInfoType.TicketDesignators.TicketDesignator> getTicketDesignator() {
            if (ticketDesignator == null) {
                ticketDesignator = new ArrayList<FareQuoteInfoType.TicketDesignators.TicketDesignator>();
            }
            return this.ticketDesignator;
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
         *       &lt;attribute name="FlightRefRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="TicketDesignatorExtension" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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

            @XmlAttribute(name = "FlightRefRPH")
            protected String flightRefRPH;
            @XmlAttribute(name = "TicketDesignatorCode")
            protected String ticketDesignatorCode;
            @XmlAttribute(name = "TicketDesignatorExtension")
            protected String ticketDesignatorExtension;

            /**
             * 获取flightRefRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightRefRPH() {
                return flightRefRPH;
            }

            /**
             * 设置flightRefRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightRefRPH(String value) {
                this.flightRefRPH = value;
            }

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
             * 获取ticketDesignatorExtension属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketDesignatorExtension() {
                return ticketDesignatorExtension;
            }

            /**
             * 设置ticketDesignatorExtension属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketDesignatorExtension(String value) {
                this.ticketDesignatorExtension = value;
            }

        }

    }

}
