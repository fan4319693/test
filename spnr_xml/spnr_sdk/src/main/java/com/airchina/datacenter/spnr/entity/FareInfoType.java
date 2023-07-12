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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Rules for this priced option. 
 * 
 * <p>FareInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FareInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FareReference" maxOccurs="5">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength0to8">
 *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="AccountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="CabinCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RuleInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RuleInfoType">
 *                 &lt;attribute name="TripType" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
 *                 &lt;attribute name="MoneySaverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FilingAirline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="MarketingAirline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
 *         &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
 *         &lt;element name="Date" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="LastRuleChange"/>
 *                       &lt;enumeration value="RuleBecomesInvalid"/>
 *                       &lt;enumeration value="RestrictiveFareEffective"/>
 *                       &lt;enumeration value="RestrictiveFareDiscontinue"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareInfo" maxOccurs="15" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Date" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="Type">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="EffectiveTravel"/>
 *                                 &lt;enumeration value="DiscontinueTravel"/>
 *                                 &lt;enumeration value="FirstTicketing"/>
 *                                 &lt;enumeration value="LastTicketing"/>
 *                                 &lt;enumeration value="TravelCompletion"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Fare" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Taxes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Surcharges" type="{http://www.opentravel.org/OTA/2003/05}FareSurchargesType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ReissueTaxDiff" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="DifferFare" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="PriceType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="ReissueAmt" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="ReissueFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="BaseAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="BaseAmountAdjusted" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="BaseNUC_Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="BaseCabinClassAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="TaxAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="PremiumAddOnAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="TotalFare" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="TotalFareAdjusted" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="FareDescription" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
 *                           &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                           &lt;attribute name="OriginalPrice" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="OriginalTotalPrice" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="yFareAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="OrigPubAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="OrigPubCurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ReissueFees" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ReissueFee" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CustLoyalty" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PTC" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PTC_Group"/>
 *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
 *                   &lt;element name="DiscountPricing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountPricingGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ReissueFeeDescription" type="{http://www.opentravel.org/OTA/2003/05}FeeDescType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}AirRemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Endorsements" type="{http://www.opentravel.org/OTA/2003/05}FareInfoEndorsementsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareComponentGroup"/>
 *                 &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="FareSystemId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GlobalIndicatorCode" type="{http://www.opentravel.org/OTA/2003/05}GlobalIndicatorType" />
 *                 &lt;attribute name="MaximumPermittedMileage" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="TripType" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
 *                 &lt;attribute name="FareType" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to3" />
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="DisCount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="GdsEi" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="RmkOt" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Zvalue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Zkey" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="ZValueKey" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="AdjustedFareIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="fareRph" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PenaltyPolicyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareFamily" type="{http://www.opentravel.org/OTA/2003/05}FareFamilyType" minOccurs="0"/>
 *         &lt;element name="TS_FareRule_Ref1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TS_FareRule_Ref2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareSource" type="{http://www.opentravel.org/OTA/2003/05}FareSourceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}NegotiatedFareAttributes"/>
 *       &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *       &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *       &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FlightSegmentDirectionIndicator" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInfoType", propOrder = {
    "departureDate",
    "fareReference",
    "ruleInfo",
    "filingAirline",
    "marketingAirline",
    "departureAirport",
    "arrivalAirport",
    "date",
    "fareInfo",
    "fareFamily",
    "tsFareRuleRef1",
    "tsFareRuleRef2",
    "fareSource"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.PTCFareBreakdownType.FareInfo.class,
    com.airchina.datacenter.spnr.entity.AirItineraryPricingInfoType.FareInfos.FareInfo.class
})
public class FareInfoType {

    @XmlElement(name = "DepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "FareReference", required = true)
    protected List<FareInfoType.FareReference> fareReference;
    @XmlElement(name = "RuleInfo")
    protected FareInfoType.RuleInfo ruleInfo;
    @XmlElement(name = "FilingAirline")
    protected CompanyNameType filingAirline;
    @XmlElement(name = "MarketingAirline")
    protected List<CompanyNameType> marketingAirline;
    @XmlElement(name = "DepartureAirport", required = true)
    protected LocationType departureAirport;
    @XmlElement(name = "ArrivalAirport", required = true)
    protected LocationType arrivalAirport;
    @XmlElement(name = "Date")
    protected List<FareInfoType.Date> date;
    @XmlElement(name = "FareInfo")
    protected List<FareInfoType.FareInfo> fareInfo;
    @XmlElement(name = "FareFamily")
    protected FareFamilyType fareFamily;
    @XmlElement(name = "TS_FareRule_Ref1")
    protected String tsFareRuleRef1;
    @XmlElement(name = "TS_FareRule_Ref2")
    protected String tsFareRuleRef2;
    @XmlElement(name = "FareSource")
    protected List<FareSourceType> fareSource;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "TariffNumber")
    protected String tariffNumber;
    @XmlAttribute(name = "RuleNumber")
    protected String ruleNumber;
    @XmlAttribute(name = "TourCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String tourCode;
    @XmlAttribute(name = "FlightSegmentRPH")
    protected String flightSegmentRPH;
    @XmlAttribute(name = "OriginDestinationRPH")
    @XmlSchemaType(name = "anySimpleType")
    protected String originDestinationRPH;
    @XmlAttribute(name = "FlightSegmentDirectionIndicator")
    protected AirTripType flightSegmentDirectionIndicator;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "NegotiatedFareCode")
    protected String negotiatedFareCode;

    /**
     * 获取departureDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * 设置departureDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the fareReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoType.FareReference }
     * 
     * 
     */
    public List<FareInfoType.FareReference> getFareReference() {
        if (fareReference == null) {
            fareReference = new ArrayList<FareInfoType.FareReference>();
        }
        return this.fareReference;
    }

    /**
     * 获取ruleInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FareInfoType.RuleInfo }
     *     
     */
    public FareInfoType.RuleInfo getRuleInfo() {
        return ruleInfo;
    }

    /**
     * 设置ruleInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FareInfoType.RuleInfo }
     *     
     */
    public void setRuleInfo(FareInfoType.RuleInfo value) {
        this.ruleInfo = value;
    }

    /**
     * 获取filingAirline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getFilingAirline() {
        return filingAirline;
    }

    /**
     * 设置filingAirline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setFilingAirline(CompanyNameType value) {
        this.filingAirline = value;
    }

    /**
     * Gets the value of the marketingAirline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingAirline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingAirline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNameType }
     * 
     * 
     */
    public List<CompanyNameType> getMarketingAirline() {
        if (marketingAirline == null) {
            marketingAirline = new ArrayList<CompanyNameType>();
        }
        return this.marketingAirline;
    }

    /**
     * 获取departureAirport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDepartureAirport() {
        return departureAirport;
    }

    /**
     * 设置departureAirport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDepartureAirport(LocationType value) {
        this.departureAirport = value;
    }

    /**
     * 获取arrivalAirport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * 设置arrivalAirport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setArrivalAirport(LocationType value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the date property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoType.Date }
     * 
     * 
     */
    public List<FareInfoType.Date> getDate() {
        if (date == null) {
            date = new ArrayList<FareInfoType.Date>();
        }
        return this.date;
    }

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
     * {@link FareInfoType.FareInfo }
     * 
     * 
     */
    public List<FareInfoType.FareInfo> getFareInfo() {
        if (fareInfo == null) {
            fareInfo = new ArrayList<FareInfoType.FareInfo>();
        }
        return this.fareInfo;
    }

    /**
     * 获取fareFamily属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FareFamilyType }
     *     
     */
    public FareFamilyType getFareFamily() {
        return fareFamily;
    }

    /**
     * 设置fareFamily属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FareFamilyType }
     *     
     */
    public void setFareFamily(FareFamilyType value) {
        this.fareFamily = value;
    }

    /**
     * 获取tsFareRuleRef1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSFareRuleRef1() {
        return tsFareRuleRef1;
    }

    /**
     * 设置tsFareRuleRef1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSFareRuleRef1(String value) {
        this.tsFareRuleRef1 = value;
    }

    /**
     * 获取tsFareRuleRef2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSFareRuleRef2() {
        return tsFareRuleRef2;
    }

    /**
     * 设置tsFareRuleRef2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSFareRuleRef2(String value) {
        this.tsFareRuleRef2 = value;
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
     * 获取flightSegmentDirectionIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirTripType }
     *     
     */
    public AirTripType getFlightSegmentDirectionIndicator() {
        return flightSegmentDirectionIndicator;
    }

    /**
     * 设置flightSegmentDirectionIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirTripType }
     *     
     */
    public void setFlightSegmentDirectionIndicator(AirTripType value) {
        this.flightSegmentDirectionIndicator = value;
    }

    /**
     * 获取negotiatedFare属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNegotiatedFare() {
        if (negotiatedFare == null) {
            return false;
        } else {
            return negotiatedFare;
        }
    }

    /**
     * 设置negotiatedFare属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiatedFare(Boolean value) {
        this.negotiatedFare = value;
    }

    /**
     * 获取negotiatedFareCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedFareCode() {
        return negotiatedFareCode;
    }

    /**
     * 设置negotiatedFareCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiatedFareCode(String value) {
        this.negotiatedFareCode = value;
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
     *       &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="LastRuleChange"/>
     *             &lt;enumeration value="RuleBecomesInvalid"/>
     *             &lt;enumeration value="RestrictiveFareEffective"/>
     *             &lt;enumeration value="RestrictiveFareDiscontinue"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Date {

        @XmlAttribute(name = "Date")
        protected String date;
        @XmlAttribute(name = "Type")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

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
     *       &lt;sequence>
     *         &lt;element name="Date" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="Type">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="EffectiveTravel"/>
     *                       &lt;enumeration value="DiscontinueTravel"/>
     *                       &lt;enumeration value="FirstTicketing"/>
     *                       &lt;enumeration value="LastTicketing"/>
     *                       &lt;enumeration value="TravelCompletion"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Fare" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Taxes" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Surcharges" type="{http://www.opentravel.org/OTA/2003/05}FareSurchargesType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ReissueTaxDiff" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="DifferFare" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="PriceType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="ReissueAmt" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="ReissueFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="BaseAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="BaseAmountAdjusted" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="BaseNUC_Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="BaseCabinClassAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="TaxAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="PremiumAddOnAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="TotalFare" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="TotalFareAdjusted" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="FareDescription" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
     *                 &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *                 &lt;attribute name="OriginalPrice" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="OriginalTotalPrice" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="yFareAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="OrigPubAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="OrigPubCurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ReissueFees" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ReissueFee" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CustLoyalty" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PTC" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PTC_Group"/>
     *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
     *         &lt;element name="DiscountPricing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountPricingGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ReissueFeeDescription" type="{http://www.opentravel.org/OTA/2003/05}FeeDescType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}AirRemarkType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Endorsements" type="{http://www.opentravel.org/OTA/2003/05}FareInfoEndorsementsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareComponentGroup"/>
     *       &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="FareSystemId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GlobalIndicatorCode" type="{http://www.opentravel.org/OTA/2003/05}GlobalIndicatorType" />
     *       &lt;attribute name="MaximumPermittedMileage" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="TripType" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
     *       &lt;attribute name="FareType" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to3" />
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="DisCount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="GdsEi" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="RmkOt" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Zvalue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Zkey" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="ZValueKey" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="AdjustedFareIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="fareRph" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PenaltyPolicyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "date",
        "fare",
        "reissueFees",
        "ptc",
        "loyalty",
        "discountPricing",
        "reissueFeeDescription",
        "remark",
        "endorsements"
    })
    public static class FareInfo {

        @XmlElement(name = "Date")
        protected List<FareInfoType.FareInfo.Date> date;
        @XmlElement(name = "Fare")
        protected FareInfoType.FareInfo.Fare fare;
        @XmlElement(name = "ReissueFees")
        protected FareInfoType.FareInfo.ReissueFees reissueFees;
        @XmlElement(name = "PTC")
        protected List<FareInfoType.FareInfo.PTC> ptc;
        @XmlElement(name = "Loyalty")
        protected LoyaltyPricingType loyalty;
        @XmlElement(name = "DiscountPricing")
        protected FareInfoType.FareInfo.DiscountPricing discountPricing;
        @XmlElement(name = "ReissueFeeDescription")
        protected List<FeeDescType> reissueFeeDescription;
        @XmlElement(name = "Remark")
        protected List<AirRemarkType> remark;
        @XmlElement(name = "Endorsements")
        protected FareInfoEndorsementsType endorsements;
        @XmlAttribute(name = "FareBasisCode")
        protected String fareBasisCode;
        @XmlAttribute(name = "FareSystemId")
        protected String fareSystemId;
        @XmlAttribute(name = "GlobalIndicatorCode")
        protected GlobalIndicatorType globalIndicatorCode;
        @XmlAttribute(name = "MaximumPermittedMileage")
        protected BigInteger maximumPermittedMileage;
        @XmlAttribute(name = "TripType")
        protected AirTripType tripType;
        @XmlAttribute(name = "FareType")
        protected String fareType;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "FareBasis")
        @XmlSchemaType(name = "anySimpleType")
        protected String fareBasis;
        @XmlAttribute(name = "DisCount")
        @XmlSchemaType(name = "anySimpleType")
        protected String disCount;
        @XmlAttribute(name = "GdsEi")
        @XmlSchemaType(name = "anySimpleType")
        protected String gdsEi;
        @XmlAttribute(name = "RmkOt")
        @XmlSchemaType(name = "anySimpleType")
        protected String rmkOt;
        @XmlAttribute(name = "Zvalue")
        @XmlSchemaType(name = "anySimpleType")
        protected String zvalue;
        @XmlAttribute(name = "Zkey")
        @XmlSchemaType(name = "anySimpleType")
        protected String zkey;
        @XmlAttribute(name = "ZValueKey")
        @XmlSchemaType(name = "anySimpleType")
        protected String zValueKey;
        @XmlAttribute(name = "AdjustedFareIndicator")
        protected Boolean adjustedFareIndicator;
        @XmlAttribute(name = "fareRph")
        protected String fareRph;
        @XmlAttribute(name = "PenaltyPolicyCode")
        protected String penaltyPolicyCode;
        @XmlAttribute(name = "FC_RPH")
        protected String fcrph;
        @XmlAttribute(name = "FC_PriceInd")
        protected Boolean fcPriceInd;

        /**
         * Gets the value of the date property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the date property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareInfoType.FareInfo.Date }
         * 
         * 
         */
        public List<FareInfoType.FareInfo.Date> getDate() {
            if (date == null) {
                date = new ArrayList<FareInfoType.FareInfo.Date>();
            }
            return this.date;
        }

        /**
         * 获取fare属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FareInfoType.FareInfo.Fare }
         *     
         */
        public FareInfoType.FareInfo.Fare getFare() {
            return fare;
        }

        /**
         * 设置fare属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FareInfoType.FareInfo.Fare }
         *     
         */
        public void setFare(FareInfoType.FareInfo.Fare value) {
            this.fare = value;
        }

        /**
         * 获取reissueFees属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FareInfoType.FareInfo.ReissueFees }
         *     
         */
        public FareInfoType.FareInfo.ReissueFees getReissueFees() {
            return reissueFees;
        }

        /**
         * 设置reissueFees属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FareInfoType.FareInfo.ReissueFees }
         *     
         */
        public void setReissueFees(FareInfoType.FareInfo.ReissueFees value) {
            this.reissueFees = value;
        }

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
         * {@link FareInfoType.FareInfo.PTC }
         * 
         * 
         */
        public List<FareInfoType.FareInfo.PTC> getPTC() {
            if (ptc == null) {
                ptc = new ArrayList<FareInfoType.FareInfo.PTC>();
            }
            return this.ptc;
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
         * 获取discountPricing属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FareInfoType.FareInfo.DiscountPricing }
         *     
         */
        public FareInfoType.FareInfo.DiscountPricing getDiscountPricing() {
            return discountPricing;
        }

        /**
         * 设置discountPricing属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FareInfoType.FareInfo.DiscountPricing }
         *     
         */
        public void setDiscountPricing(FareInfoType.FareInfo.DiscountPricing value) {
            this.discountPricing = value;
        }

        /**
         * Gets the value of the reissueFeeDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reissueFeeDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReissueFeeDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeeDescType }
         * 
         * 
         */
        public List<FeeDescType> getReissueFeeDescription() {
            if (reissueFeeDescription == null) {
                reissueFeeDescription = new ArrayList<FeeDescType>();
            }
            return this.reissueFeeDescription;
        }

        /**
         * Gets the value of the remark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirRemarkType }
         * 
         * 
         */
        public List<AirRemarkType> getRemark() {
            if (remark == null) {
                remark = new ArrayList<AirRemarkType>();
            }
            return this.remark;
        }

        /**
         * 获取endorsements属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FareInfoEndorsementsType }
         *     
         */
        public FareInfoEndorsementsType getEndorsements() {
            return endorsements;
        }

        /**
         * 设置endorsements属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FareInfoEndorsementsType }
         *     
         */
        public void setEndorsements(FareInfoEndorsementsType value) {
            this.endorsements = value;
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
         * 获取fareSystemId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareSystemId() {
            return fareSystemId;
        }

        /**
         * 设置fareSystemId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareSystemId(String value) {
            this.fareSystemId = value;
        }

        /**
         * 获取globalIndicatorCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link GlobalIndicatorType }
         *     
         */
        public GlobalIndicatorType getGlobalIndicatorCode() {
            return globalIndicatorCode;
        }

        /**
         * 设置globalIndicatorCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link GlobalIndicatorType }
         *     
         */
        public void setGlobalIndicatorCode(GlobalIndicatorType value) {
            this.globalIndicatorCode = value;
        }

        /**
         * 获取maximumPermittedMileage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumPermittedMileage() {
            return maximumPermittedMileage;
        }

        /**
         * 设置maximumPermittedMileage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumPermittedMileage(BigInteger value) {
            this.maximumPermittedMileage = value;
        }

        /**
         * 获取tripType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirTripType }
         *     
         */
        public AirTripType getTripType() {
            return tripType;
        }

        /**
         * 设置tripType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirTripType }
         *     
         */
        public void setTripType(AirTripType value) {
            this.tripType = value;
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
         * 获取fareBasis属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareBasis() {
            return fareBasis;
        }

        /**
         * 设置fareBasis属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareBasis(String value) {
            this.fareBasis = value;
        }

        /**
         * 获取disCount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisCount() {
            return disCount;
        }

        /**
         * 设置disCount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisCount(String value) {
            this.disCount = value;
        }

        /**
         * 获取gdsEi属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGdsEi() {
            return gdsEi;
        }

        /**
         * 设置gdsEi属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGdsEi(String value) {
            this.gdsEi = value;
        }

        /**
         * 获取rmkOt属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRmkOt() {
            return rmkOt;
        }

        /**
         * 设置rmkOt属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRmkOt(String value) {
            this.rmkOt = value;
        }

        /**
         * 获取zvalue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZvalue() {
            return zvalue;
        }

        /**
         * 设置zvalue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZvalue(String value) {
            this.zvalue = value;
        }

        /**
         * 获取zkey属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZkey() {
            return zkey;
        }

        /**
         * 设置zkey属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZkey(String value) {
            this.zkey = value;
        }

        /**
         * 获取zValueKey属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZValueKey() {
            return zValueKey;
        }

        /**
         * 设置zValueKey属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZValueKey(String value) {
            this.zValueKey = value;
        }

        /**
         * 获取adjustedFareIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAdjustedFareIndicator() {
            return adjustedFareIndicator;
        }

        /**
         * 设置adjustedFareIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAdjustedFareIndicator(Boolean value) {
            this.adjustedFareIndicator = value;
        }

        /**
         * 获取fareRph属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareRph() {
            return fareRph;
        }

        /**
         * 设置fareRph属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareRph(String value) {
            this.fareRph = value;
        }

        /**
         * 获取penaltyPolicyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPenaltyPolicyCode() {
            return penaltyPolicyCode;
        }

        /**
         * 设置penaltyPolicyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPenaltyPolicyCode(String value) {
            this.penaltyPolicyCode = value;
        }

        /**
         * 获取fcrph属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFCRPH() {
            return fcrph;
        }

        /**
         * 设置fcrph属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFCRPH(String value) {
            this.fcrph = value;
        }

        /**
         * 获取fcPriceInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFCPriceInd() {
            return fcPriceInd;
        }

        /**
         * 设置fcPriceInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFCPriceInd(Boolean value) {
            this.fcPriceInd = value;
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
         *       &lt;attribute name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="Type">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="EffectiveTravel"/>
         *             &lt;enumeration value="DiscontinueTravel"/>
         *             &lt;enumeration value="FirstTicketing"/>
         *             &lt;enumeration value="LastTicketing"/>
         *             &lt;enumeration value="TravelCompletion"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Date {

            @XmlAttribute(name = "Date")
            protected String date;
            @XmlAttribute(name = "Type")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String type;

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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountPricingGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DiscountPricing {

            @XmlAttribute(name = "Purpose")
            protected String purpose;
            @XmlAttribute(name = "Type")
            protected String type;
            @XmlAttribute(name = "Usage")
            protected String usage;
            @XmlAttribute(name = "Discount")
            protected String discount;
            @XmlAttribute(name = "TicketDesignatorCode")
            protected String ticketDesignatorCode;
            @XmlAttribute(name = "Text")
            protected String text;

            /**
             * 获取purpose属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurpose() {
                return purpose;
            }

            /**
             * 设置purpose属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurpose(String value) {
                this.purpose = value;
            }

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

            /**
             * 获取usage属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsage() {
                return usage;
            }

            /**
             * 设置usage属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsage(String value) {
                this.usage = value;
            }

            /**
             * 获取discount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiscount() {
                return discount;
            }

            /**
             * 设置discount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiscount(String value) {
                this.discount = value;
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
             * 获取text属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * 设置text属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
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
         *         &lt;element name="Taxes" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Surcharges" type="{http://www.opentravel.org/OTA/2003/05}FareSurchargesType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ReissueTaxDiff" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="DifferFare" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="PriceType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="ReissueAmt" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="ReissueFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="BaseAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="BaseAmountAdjusted" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="BaseNUC_Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="BaseCabinClassAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="TaxAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="PremiumAddOnAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="TotalFare" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="TotalFareAdjusted" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="FareDescription" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
         *       &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *       &lt;attribute name="OriginalPrice" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="OriginalTotalPrice" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="yFareAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="OrigPubAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="OrigPubCurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "taxes",
            "surcharges"
        })
        public static class Fare {

            @XmlElement(name = "Taxes")
            protected FareInfoType.FareInfo.Fare.Taxes taxes;
            @XmlElement(name = "Surcharges")
            protected FareSurchargesType surcharges;
            @XmlAttribute(name = "ReissueTaxDiff")
            protected BigDecimal reissueTaxDiff;
            @XmlAttribute(name = "DifferFare")
            protected BigDecimal differFare;
            @XmlAttribute(name = "PriceType")
            protected String priceType;
            @XmlAttribute(name = "ReissueAmt")
            protected BigDecimal reissueAmt;
            @XmlAttribute(name = "ReissueFee")
            protected BigDecimal reissueFee;
            @XmlAttribute(name = "BaseAmount")
            protected BigDecimal baseAmount;
            @XmlAttribute(name = "BaseAmountAdjusted")
            protected BigDecimal baseAmountAdjusted;
            @XmlAttribute(name = "BaseNUC_Amount")
            protected BigDecimal baseNUCAmount;
            @XmlAttribute(name = "BaseCabinClassAmount")
            protected BigDecimal baseCabinClassAmount;
            @XmlAttribute(name = "TaxAmount")
            protected BigDecimal taxAmount;
            @XmlAttribute(name = "PremiumAddOnAmount")
            protected BigDecimal premiumAddOnAmount;
            @XmlAttribute(name = "TotalFare")
            protected BigDecimal totalFare;
            @XmlAttribute(name = "TotalFareAdjusted")
            protected BigDecimal totalFareAdjusted;
            @XmlAttribute(name = "FareDescription")
            protected String fareDescription;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "OriginalPrice")
            protected BigDecimal originalPrice;
            @XmlAttribute(name = "OriginalTotalPrice")
            protected BigDecimal originalTotalPrice;
            @XmlAttribute(name = "yFareAmount")
            protected BigDecimal yFareAmount;
            @XmlAttribute(name = "OrigPubAmount")
            protected BigDecimal origPubAmount;
            @XmlAttribute(name = "OrigPubCurrencyCode")
            protected String origPubCurrencyCode;

            /**
             * 获取taxes属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FareInfoType.FareInfo.Fare.Taxes }
             *     
             */
            public FareInfoType.FareInfo.Fare.Taxes getTaxes() {
                return taxes;
            }

            /**
             * 设置taxes属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FareInfoType.FareInfo.Fare.Taxes }
             *     
             */
            public void setTaxes(FareInfoType.FareInfo.Fare.Taxes value) {
                this.taxes = value;
            }

            /**
             * 获取surcharges属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FareSurchargesType }
             *     
             */
            public FareSurchargesType getSurcharges() {
                return surcharges;
            }

            /**
             * 设置surcharges属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FareSurchargesType }
             *     
             */
            public void setSurcharges(FareSurchargesType value) {
                this.surcharges = value;
            }

            /**
             * 获取reissueTaxDiff属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getReissueTaxDiff() {
                return reissueTaxDiff;
            }

            /**
             * 设置reissueTaxDiff属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setReissueTaxDiff(BigDecimal value) {
                this.reissueTaxDiff = value;
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
             * 获取priceType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceType() {
                return priceType;
            }

            /**
             * 设置priceType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceType(String value) {
                this.priceType = value;
            }

            /**
             * 获取reissueAmt属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getReissueAmt() {
                return reissueAmt;
            }

            /**
             * 设置reissueAmt属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setReissueAmt(BigDecimal value) {
                this.reissueAmt = value;
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
             * 获取baseAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseAmount() {
                return baseAmount;
            }

            /**
             * 设置baseAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseAmount(BigDecimal value) {
                this.baseAmount = value;
            }

            /**
             * 获取baseAmountAdjusted属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseAmountAdjusted() {
                return baseAmountAdjusted;
            }

            /**
             * 设置baseAmountAdjusted属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseAmountAdjusted(BigDecimal value) {
                this.baseAmountAdjusted = value;
            }

            /**
             * 获取baseNUCAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseNUCAmount() {
                return baseNUCAmount;
            }

            /**
             * 设置baseNUCAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseNUCAmount(BigDecimal value) {
                this.baseNUCAmount = value;
            }

            /**
             * 获取baseCabinClassAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseCabinClassAmount() {
                return baseCabinClassAmount;
            }

            /**
             * 设置baseCabinClassAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseCabinClassAmount(BigDecimal value) {
                this.baseCabinClassAmount = value;
            }

            /**
             * 获取taxAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTaxAmount() {
                return taxAmount;
            }

            /**
             * 设置taxAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTaxAmount(BigDecimal value) {
                this.taxAmount = value;
            }

            /**
             * 获取premiumAddOnAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPremiumAddOnAmount() {
                return premiumAddOnAmount;
            }

            /**
             * 设置premiumAddOnAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPremiumAddOnAmount(BigDecimal value) {
                this.premiumAddOnAmount = value;
            }

            /**
             * 获取totalFare属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalFare() {
                return totalFare;
            }

            /**
             * 设置totalFare属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalFare(BigDecimal value) {
                this.totalFare = value;
            }

            /**
             * 获取totalFareAdjusted属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalFareAdjusted() {
                return totalFareAdjusted;
            }

            /**
             * 设置totalFareAdjusted属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalFareAdjusted(BigDecimal value) {
                this.totalFareAdjusted = value;
            }

            /**
             * 获取fareDescription属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareDescription() {
                return fareDescription;
            }

            /**
             * 设置fareDescription属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareDescription(String value) {
                this.fareDescription = value;
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
             * 获取originalTotalPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getOriginalTotalPrice() {
                return originalTotalPrice;
            }

            /**
             * 设置originalTotalPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setOriginalTotalPrice(BigDecimal value) {
                this.originalTotalPrice = value;
            }

            /**
             * 获取yFareAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getYFareAmount() {
                return yFareAmount;
            }

            /**
             * 设置yFareAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setYFareAmount(BigDecimal value) {
                this.yFareAmount = value;
            }

            /**
             * 获取origPubAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getOrigPubAmount() {
                return origPubAmount;
            }

            /**
             * 设置origPubAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setOrigPubAmount(BigDecimal value) {
                this.origPubAmount = value;
            }

            /**
             * 获取origPubCurrencyCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrigPubCurrencyCode() {
                return origPubCurrencyCode;
            }

            /**
             * 设置origPubCurrencyCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrigPubCurrencyCode(String value) {
                this.origPubCurrencyCode = value;
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
             *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
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
            public static class Taxes {

                @XmlElement(name = "Tax", required = true)
                protected List<AirTaxType> tax;

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
                 * {@link AirTaxType }
                 * 
                 * 
                 */
                public List<AirTaxType> getTax() {
                    if (tax == null) {
                        tax = new ArrayList<AirTaxType>();
                    }
                    return this.tax;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PTC_Group"/>
         *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PTC {

            @XmlAttribute(name = "Quantity")
            protected Integer quantity;
            @XmlAttribute(name = "PassengerTypeCode")
            protected String passengerTypeCode;
            @XmlAttribute(name = "PTCSubType")
            protected String ptcSubType;

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
             * 获取ptcSubType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPTCSubType() {
                return ptcSubType;
            }

            /**
             * 设置ptcSubType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPTCSubType(String value) {
                this.ptcSubType = value;
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
         *         &lt;element name="ReissueFee" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CustLoyalty" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
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
            "reissueFee"
        })
        public static class ReissueFees {

            @XmlElement(name = "ReissueFee")
            protected List<FareInfoType.FareInfo.ReissueFees.ReissueFee> reissueFee;

            /**
             * Gets the value of the reissueFee property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reissueFee property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReissueFee().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareInfoType.FareInfo.ReissueFees.ReissueFee }
             * 
             * 
             */
            public List<FareInfoType.FareInfo.ReissueFees.ReissueFee> getReissueFee() {
                if (reissueFee == null) {
                    reissueFee = new ArrayList<FareInfoType.FareInfo.ReissueFees.ReissueFee>();
                }
                return this.reissueFee;
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
             *         &lt;element name="CustLoyalty" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "custLoyalty"
            })
            public static class ReissueFee {

                @XmlElement(name = "CustLoyalty")
                protected FareInfoType.FareInfo.ReissueFees.ReissueFee.CustLoyalty custLoyalty;
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
                 * 获取custLoyalty属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareInfoType.FareInfo.ReissueFees.ReissueFee.CustLoyalty }
                 *     
                 */
                public FareInfoType.FareInfo.ReissueFees.ReissueFee.CustLoyalty getCustLoyalty() {
                    return custLoyalty;
                }

                /**
                 * 设置custLoyalty属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareInfoType.FareInfo.ReissueFees.ReissueFee.CustLoyalty }
                 *     
                 */
                public void setCustLoyalty(FareInfoType.FareInfo.ReissueFees.ReissueFee.CustLoyalty value) {
                    this.custLoyalty = value;
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
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class CustLoyalty {

                    @XmlAttribute(name = "ProgramID")
                    protected String programID;
                    @XmlAttribute(name = "MembershipID")
                    protected String membershipID;
                    @XmlAttribute(name = "Password")
                    protected String password;
                    @XmlAttribute(name = "PasswordStatus")
                    protected String passwordStatus;
                    @XmlAttribute(name = "Status")
                    protected String status;
                    @XmlAttribute(name = "TravelSector")
                    protected String travelSector;
                    @XmlAttribute(name = "CustomerValue")
                    protected String customerValue;
                    @XmlAttribute(name = "SingleVendorInd")
                    protected String singleVendorInd;
                    @XmlAttribute(name = "RPH")
                    protected String rph;
                    @XmlAttribute(name = "VendorCode")
                    protected List<String> vendorCode;
                    @XmlAttribute(name = "EffectiveDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar effectiveDate;
                    @XmlAttribute(name = "ExpireDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar expireDate;
                    @XmlAttribute(name = "SignupDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar signupDate;
                    @XmlAttribute(name = "ShareSynchInd")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String shareSynchInd;
                    @XmlAttribute(name = "ShareMarketInd")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String shareMarketInd;
                    @XmlAttribute(name = "LoyalLevel")
                    protected String loyalLevel;
                    @XmlAttribute(name = "LoyalLevelCode")
                    protected Integer loyalLevelCode;

                    /**
                     * 获取programID属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProgramID() {
                        return programID;
                    }

                    /**
                     * 设置programID属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProgramID(String value) {
                        this.programID = value;
                    }

                    /**
                     * 获取membershipID属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMembershipID() {
                        return membershipID;
                    }

                    /**
                     * 设置membershipID属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMembershipID(String value) {
                        this.membershipID = value;
                    }

                    /**
                     * 获取password属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPassword() {
                        return password;
                    }

                    /**
                     * 设置password属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPassword(String value) {
                        this.password = value;
                    }

                    /**
                     * 获取passwordStatus属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPasswordStatus() {
                        return passwordStatus;
                    }

                    /**
                     * 设置passwordStatus属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPasswordStatus(String value) {
                        this.passwordStatus = value;
                    }

                    /**
                     * 获取status属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStatus() {
                        return status;
                    }

                    /**
                     * 设置status属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStatus(String value) {
                        this.status = value;
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
                     * 获取customerValue属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCustomerValue() {
                        return customerValue;
                    }

                    /**
                     * 设置customerValue属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCustomerValue(String value) {
                        this.customerValue = value;
                    }

                    /**
                     * 获取singleVendorInd属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSingleVendorInd() {
                        return singleVendorInd;
                    }

                    /**
                     * 设置singleVendorInd属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSingleVendorInd(String value) {
                        this.singleVendorInd = value;
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
                     * Gets the value of the vendorCode property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getVendorCode().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getVendorCode() {
                        if (vendorCode == null) {
                            vendorCode = new ArrayList<String>();
                        }
                        return this.vendorCode;
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
                     * 获取signupDate属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getSignupDate() {
                        return signupDate;
                    }

                    /**
                     * 设置signupDate属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setSignupDate(XMLGregorianCalendar value) {
                        this.signupDate = value;
                    }

                    /**
                     * 获取shareSynchInd属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getShareSynchInd() {
                        return shareSynchInd;
                    }

                    /**
                     * 设置shareSynchInd属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setShareSynchInd(String value) {
                        this.shareSynchInd = value;
                    }

                    /**
                     * 获取shareMarketInd属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getShareMarketInd() {
                        return shareMarketInd;
                    }

                    /**
                     * 设置shareMarketInd属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setShareMarketInd(String value) {
                        this.shareMarketInd = value;
                    }

                    /**
                     * 获取loyalLevel属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLoyalLevel() {
                        return loyalLevel;
                    }

                    /**
                     * 设置loyalLevel属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLoyalLevel(String value) {
                        this.loyalLevel = value;
                    }

                    /**
                     * 获取loyalLevelCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getLoyalLevelCode() {
                        return loyalLevelCode;
                    }

                    /**
                     * 设置loyalLevelCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setLoyalLevelCode(Integer value) {
                        this.loyalLevelCode = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength0to8">
     *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="AccountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="CabinCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
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
    public static class FareReference {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ResBookDesigCode")
        protected String resBookDesigCode;
        @XmlAttribute(name = "TicketDesignatorCode")
        protected String ticketDesignatorCode;
        @XmlAttribute(name = "AccountCode")
        protected String accountCode;
        @XmlAttribute(name = "CabinCode")
        protected String cabinCode;

        /**
         * Used for Character Strings, length 0 to 8
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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
         * 获取cabinCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCabinCode() {
            return cabinCode;
        }

        /**
         * 设置cabinCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCabinCode(String value) {
            this.cabinCode = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RuleInfoType">
     *       &lt;attribute name="TripType" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
     *       &lt;attribute name="MoneySaverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RuleInfo
        extends RuleInfoType
    {

        @XmlAttribute(name = "TripType")
        protected AirTripType tripType;
        @XmlAttribute(name = "MoneySaverInd")
        protected Boolean moneySaverInd;

        /**
         * 获取tripType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirTripType }
         *     
         */
        public AirTripType getTripType() {
            return tripType;
        }

        /**
         * 设置tripType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirTripType }
         *     
         */
        public void setTripType(AirTripType value) {
            this.tripType = value;
        }

        /**
         * 获取moneySaverInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMoneySaverInd() {
            return moneySaverInd;
        }

        /**
         * 设置moneySaverInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMoneySaverInd(Boolean value) {
            this.moneySaverInd = value;
        }

    }

}
