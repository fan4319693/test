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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  Full information about individual tickets
 * 
 * <p>TicketingFullInfo_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TicketingFullInfo_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType">
 *       &lt;sequence>
 *         &lt;element name="ConjunctiveTicketNbr" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CouponInfo" maxOccurs="4">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="FlightRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                           &lt;attribute name="CouponNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
 *                           &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DocumentNumberCheckDigit">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{1}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="PaperTicketInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AirlineAccountingCode" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9]{3}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="FormAndSerialNumber" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9a-zA-Z]{10}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightInfo" maxOccurs="16" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CarrierInfo" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>OperatingAirlineType">
 *                           &lt;attribute name="MarketingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="BookedRBD" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
 *                           &lt;attribute name="TicketedRBD" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
 *                           &lt;attribute name="FrequentFlierMiles" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to5" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AircraftOwner" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                   &lt;element name="DepartureInformation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CheckInCutOffGroup"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
 *                           &lt;attribute name="DateOfDeparture" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="JulianDateOfDeparture">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{3}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                           &lt;attribute name="ScheduledDepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                           &lt;attribute name="LatestCheckInDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="BoardingDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="OtherCheckInInformation" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ArrivalInformation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
 *                           &lt;attribute name="DateOfArrival" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                           &lt;attribute name="ScheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                           &lt;attribute name="DateChangeIdentifier">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="-1"/>
 *                                 &lt;enumeration value="+1"/>
 *                                 &lt;enumeration value="+2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ServiceDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MealService" maxOccurs="12" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}MealServiceType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *                           &lt;attribute name="DeniedBoardingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="FlightProductName" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                           &lt;attribute name="InFlightServiceCodes" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TransitPoint" type="{http://www.opentravel.org/OTA/2003/05}LocationType" maxOccurs="16" minOccurs="0"/>
 *                   &lt;element name="BookingInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BookingReferenceID" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="CabinType" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *                 &lt;attribute name="CabinName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="FlightStatus" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="StopOverIndicator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerInfo" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PassengerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *                   &lt;element name="PassengerWeight" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OtherServiceInformation" type="{http://www.opentravel.org/OTA/2003/05}OtherServiceInfoType" maxOccurs="9" minOccurs="0"/>
 *                   &lt;element name="ContactInfo" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
 *                           &lt;sequence>
 *                             &lt;element name="Relationship" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="OptionToDecline" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PassengerType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PassengerTypeQuantityType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GenderGroup"/>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="PassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="JumpSeatAuthority" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                 &lt;attribute name="SecurityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="GroupReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="AddToStandbyDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                 &lt;attribute name="InfantIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="EmployeeSeniorityDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                 &lt;attribute name="EmployeeLengthOfService" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PTC_FareBreakdowns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PTC_FareBreakdown" type="{http://www.opentravel.org/OTA/2003/05}PTCFareBreakdownType" maxOccurs="20"/>
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
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentDetail" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
 *                           &lt;attribute name="PaymentReason" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PaymentTotal" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PricingInfo" type="{http://www.opentravel.org/OTA/2003/05}FareType" minOccurs="0"/>
 *         &lt;element name="PaymentTotal" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FormOfPayment" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" maxOccurs="4" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CityCodeOfIssue" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *         &lt;element name="ACN_Number" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *       &lt;attribute name="AirlineAccountingCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{3}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FormAndSerialNumber">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9a-zA-Z]{10}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AgencyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="CountryCodeOfIssue" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *       &lt;attribute name="IssuingCompanyName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9a-zA-Z]{1,35}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="EndorsementInfo" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="DateOfIssue" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *       &lt;attribute name="OriginalDateofIssue" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *       &lt;attribute name="OpenStatusModDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="IssuingAgentID" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *       &lt;attribute name="TicketBookReference" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *       &lt;attribute name="SettlementAuthCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingFullInfo_Type", propOrder = {
    "conjunctiveTicketNbr",
    "flightInfo",
    "passengerInfo",
    "ptcFareBreakdowns",
    "endorsements",
    "paymentInfo",
    "pricingInfo",
    "paymentTotal",
    "cityCodeOfIssue",
    "acnNumber"
})
public class TicketingFullInfoType
    extends TicketingInfoType
{

    @XmlElement(name = "ConjunctiveTicketNbr")
    protected List<TicketingFullInfoType.ConjunctiveTicketNbr> conjunctiveTicketNbr;
    @XmlElement(name = "FlightInfo")
    protected List<TicketingFullInfoType.FlightInfo> flightInfo;
    @XmlElement(name = "PassengerInfo")
    protected List<TicketingFullInfoType.PassengerInfo> passengerInfo;
    @XmlElement(name = "PTC_FareBreakdowns")
    protected TicketingFullInfoType.PTCFareBreakdowns ptcFareBreakdowns;
    @XmlElement(name = "Endorsements")
    protected TicketingFullInfoType.Endorsements endorsements;
    @XmlElement(name = "PaymentInfo")
    protected TicketingFullInfoType.PaymentInfo paymentInfo;
    @XmlElement(name = "PricingInfo")
    protected FareType pricingInfo;
    @XmlElement(name = "PaymentTotal")
    protected TicketingFullInfoType.PaymentTotal paymentTotal;
    @XmlElement(name = "CityCodeOfIssue")
    protected LocationType cityCodeOfIssue;
    @XmlElement(name = "ACN_Number")
    protected UniqueIDType acnNumber;
    @XmlAttribute(name = "AirlineAccountingCode")
    protected String airlineAccountingCode;
    @XmlAttribute(name = "FormAndSerialNumber")
    protected String formAndSerialNumber;
    @XmlAttribute(name = "AgencyCode")
    protected String agencyCode;
    @XmlAttribute(name = "CountryCodeOfIssue")
    protected String countryCodeOfIssue;
    @XmlAttribute(name = "IssuingCompanyName")
    protected String issuingCompanyName;
    @XmlAttribute(name = "EndorsementInfo")
    protected String endorsementInfo;
    @XmlAttribute(name = "DateOfIssue")
    protected String dateOfIssue;
    @XmlAttribute(name = "OriginalDateofIssue")
    protected String originalDateofIssue;
    @XmlAttribute(name = "OpenStatusModDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openStatusModDateTime;
    @XmlAttribute(name = "IssuingAgentID")
    protected String issuingAgentID;
    @XmlAttribute(name = "TicketBookReference")
    protected String ticketBookReference;
    @XmlAttribute(name = "SettlementAuthCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String settlementAuthCode;
    @XmlAttribute(name = "ProductNumber")
    protected String productNumber;
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
     * Gets the value of the conjunctiveTicketNbr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conjunctiveTicketNbr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConjunctiveTicketNbr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingFullInfoType.ConjunctiveTicketNbr }
     * 
     * 
     */
    public List<TicketingFullInfoType.ConjunctiveTicketNbr> getConjunctiveTicketNbr() {
        if (conjunctiveTicketNbr == null) {
            conjunctiveTicketNbr = new ArrayList<TicketingFullInfoType.ConjunctiveTicketNbr>();
        }
        return this.conjunctiveTicketNbr;
    }

    /**
     * Gets the value of the flightInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingFullInfoType.FlightInfo }
     * 
     * 
     */
    public List<TicketingFullInfoType.FlightInfo> getFlightInfo() {
        if (flightInfo == null) {
            flightInfo = new ArrayList<TicketingFullInfoType.FlightInfo>();
        }
        return this.flightInfo;
    }

    /**
     * Gets the value of the passengerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingFullInfoType.PassengerInfo }
     * 
     * 
     */
    public List<TicketingFullInfoType.PassengerInfo> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<TicketingFullInfoType.PassengerInfo>();
        }
        return this.passengerInfo;
    }

    /**
     * 获取ptcFareBreakdowns属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TicketingFullInfoType.PTCFareBreakdowns }
     *     
     */
    public TicketingFullInfoType.PTCFareBreakdowns getPTCFareBreakdowns() {
        return ptcFareBreakdowns;
    }

    /**
     * 设置ptcFareBreakdowns属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingFullInfoType.PTCFareBreakdowns }
     *     
     */
    public void setPTCFareBreakdowns(TicketingFullInfoType.PTCFareBreakdowns value) {
        this.ptcFareBreakdowns = value;
    }

    /**
     * 获取endorsements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TicketingFullInfoType.Endorsements }
     *     
     */
    public TicketingFullInfoType.Endorsements getEndorsements() {
        return endorsements;
    }

    /**
     * 设置endorsements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingFullInfoType.Endorsements }
     *     
     */
    public void setEndorsements(TicketingFullInfoType.Endorsements value) {
        this.endorsements = value;
    }

    /**
     * 获取paymentInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TicketingFullInfoType.PaymentInfo }
     *     
     */
    public TicketingFullInfoType.PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * 设置paymentInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingFullInfoType.PaymentInfo }
     *     
     */
    public void setPaymentInfo(TicketingFullInfoType.PaymentInfo value) {
        this.paymentInfo = value;
    }

    /**
     * 获取pricingInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getPricingInfo() {
        return pricingInfo;
    }

    /**
     * 设置pricingInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setPricingInfo(FareType value) {
        this.pricingInfo = value;
    }

    /**
     * 获取paymentTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TicketingFullInfoType.PaymentTotal }
     *     
     */
    public TicketingFullInfoType.PaymentTotal getPaymentTotal() {
        return paymentTotal;
    }

    /**
     * 设置paymentTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingFullInfoType.PaymentTotal }
     *     
     */
    public void setPaymentTotal(TicketingFullInfoType.PaymentTotal value) {
        this.paymentTotal = value;
    }

    /**
     * 获取cityCodeOfIssue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getCityCodeOfIssue() {
        return cityCodeOfIssue;
    }

    /**
     * 设置cityCodeOfIssue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setCityCodeOfIssue(LocationType value) {
        this.cityCodeOfIssue = value;
    }

    /**
     * 获取acnNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getACNNumber() {
        return acnNumber;
    }

    /**
     * 设置acnNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setACNNumber(UniqueIDType value) {
        this.acnNumber = value;
    }

    /**
     * 获取airlineAccountingCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineAccountingCode() {
        return airlineAccountingCode;
    }

    /**
     * 设置airlineAccountingCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineAccountingCode(String value) {
        this.airlineAccountingCode = value;
    }

    /**
     * 获取formAndSerialNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormAndSerialNumber() {
        return formAndSerialNumber;
    }

    /**
     * 设置formAndSerialNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormAndSerialNumber(String value) {
        this.formAndSerialNumber = value;
    }

    /**
     * 获取agencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * 设置agencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * 获取countryCodeOfIssue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCodeOfIssue() {
        return countryCodeOfIssue;
    }

    /**
     * 设置countryCodeOfIssue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCodeOfIssue(String value) {
        this.countryCodeOfIssue = value;
    }

    /**
     * 获取issuingCompanyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingCompanyName() {
        return issuingCompanyName;
    }

    /**
     * 设置issuingCompanyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingCompanyName(String value) {
        this.issuingCompanyName = value;
    }

    /**
     * 获取endorsementInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsementInfo() {
        return endorsementInfo;
    }

    /**
     * 设置endorsementInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementInfo(String value) {
        this.endorsementInfo = value;
    }

    /**
     * 获取dateOfIssue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * 设置dateOfIssue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfIssue(String value) {
        this.dateOfIssue = value;
    }

    /**
     * 获取originalDateofIssue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDateofIssue() {
        return originalDateofIssue;
    }

    /**
     * 设置originalDateofIssue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDateofIssue(String value) {
        this.originalDateofIssue = value;
    }

    /**
     * 获取openStatusModDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenStatusModDateTime() {
        return openStatusModDateTime;
    }

    /**
     * 设置openStatusModDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenStatusModDateTime(XMLGregorianCalendar value) {
        this.openStatusModDateTime = value;
    }

    /**
     * 获取issuingAgentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingAgentID() {
        return issuingAgentID;
    }

    /**
     * 设置issuingAgentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingAgentID(String value) {
        this.issuingAgentID = value;
    }

    /**
     * 获取ticketBookReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketBookReference() {
        return ticketBookReference;
    }

    /**
     * 设置ticketBookReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketBookReference(String value) {
        this.ticketBookReference = value;
    }

    /**
     * 获取settlementAuthCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAuthCode() {
        return settlementAuthCode;
    }

    /**
     * 设置settlementAuthCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAuthCode(String value) {
        this.settlementAuthCode = value;
    }

    /**
     * 获取productNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNumber() {
        return productNumber;
    }

    /**
     * 设置productNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNumber(String value) {
        this.productNumber = value;
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
     *       &lt;sequence>
     *         &lt;element name="CouponInfo" maxOccurs="4">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="FlightRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *                 &lt;attribute name="CouponNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
     *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DocumentNumberCheckDigit">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{1}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="PaperTicketInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="AirlineAccountingCode" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{3}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="FormAndSerialNumber" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9a-zA-Z]{10}"/>
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
    @XmlType(name = "", propOrder = {
        "couponInfo"
    })
    public static class ConjunctiveTicketNbr {

        @XmlElement(name = "CouponInfo", required = true)
        protected List<TicketingFullInfoType.ConjunctiveTicketNbr.CouponInfo> couponInfo;
        @XmlAttribute(name = "AirlineAccountingCode", required = true)
        protected String airlineAccountingCode;
        @XmlAttribute(name = "FormAndSerialNumber", required = true)
        protected String formAndSerialNumber;

        /**
         * Gets the value of the couponInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketingFullInfoType.ConjunctiveTicketNbr.CouponInfo }
         * 
         * 
         */
        public List<TicketingFullInfoType.ConjunctiveTicketNbr.CouponInfo> getCouponInfo() {
            if (couponInfo == null) {
                couponInfo = new ArrayList<TicketingFullInfoType.ConjunctiveTicketNbr.CouponInfo>();
            }
            return this.couponInfo;
        }

        /**
         * 获取airlineAccountingCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirlineAccountingCode() {
            return airlineAccountingCode;
        }

        /**
         * 设置airlineAccountingCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirlineAccountingCode(String value) {
            this.airlineAccountingCode = value;
        }

        /**
         * 获取formAndSerialNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormAndSerialNumber() {
            return formAndSerialNumber;
        }

        /**
         * 设置formAndSerialNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormAndSerialNumber(String value) {
            this.formAndSerialNumber = value;
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
         *       &lt;attribute name="FlightRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
         *       &lt;attribute name="CouponNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
         *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DocumentNumberCheckDigit">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{1}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="PaperTicketInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CouponInfo {

            @XmlAttribute(name = "FlightRPH", required = true)
            protected List<String> flightRPH;
            @XmlAttribute(name = "CouponNumber", required = true)
            protected int couponNumber;
            @XmlAttribute(name = "Status")
            protected String status;
            @XmlAttribute(name = "DocumentNumberCheckDigit")
            protected String documentNumberCheckDigit;
            @XmlAttribute(name = "PaperTicketInd")
            protected Boolean paperTicketInd;
            @XmlAttribute(name = "CouponReference")
            protected String couponReference;

            /**
             * Gets the value of the flightRPH property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightRPH property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightRPH().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getFlightRPH() {
                if (flightRPH == null) {
                    flightRPH = new ArrayList<String>();
                }
                return this.flightRPH;
            }

            /**
             * 获取couponNumber属性的值。
             * 
             */
            public int getCouponNumber() {
                return couponNumber;
            }

            /**
             * 设置couponNumber属性的值。
             * 
             */
            public void setCouponNumber(int value) {
                this.couponNumber = value;
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
             * 获取documentNumberCheckDigit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentNumberCheckDigit() {
                return documentNumberCheckDigit;
            }

            /**
             * 设置documentNumberCheckDigit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentNumberCheckDigit(String value) {
                this.documentNumberCheckDigit = value;
            }

            /**
             * 获取paperTicketInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPaperTicketInd() {
                return paperTicketInd;
            }

            /**
             * 设置paperTicketInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPaperTicketInd(Boolean value) {
                this.paperTicketInd = value;
            }

            /**
             * 获取couponReference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCouponReference() {
                return couponReference;
            }

            /**
             * 设置couponReference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCouponReference(String value) {
                this.couponReference = value;
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
     *         &lt;element name="Endorsement" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "endorsement"
    })
    public static class Endorsements {

        @XmlElement(name = "Endorsement", required = true)
        protected List<TicketingFullInfoType.Endorsements.Endorsement> endorsement;

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
         * {@link TicketingFullInfoType.Endorsements.Endorsement }
         * 
         * 
         */
        public List<TicketingFullInfoType.Endorsements.Endorsement> getEndorsement() {
            if (endorsement == null) {
                endorsement = new ArrayList<TicketingFullInfoType.Endorsements.Endorsement>();
            }
            return this.endorsement;
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
     *       &lt;sequence>
     *         &lt;element name="CarrierInfo" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>OperatingAirlineType">
     *                 &lt;attribute name="MarketingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="BookedRBD" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
     *                 &lt;attribute name="TicketedRBD" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
     *                 &lt;attribute name="FrequentFlierMiles" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to5" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AircraftOwner" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *         &lt;element name="DepartureInformation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CheckInCutOffGroup"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
     *                 &lt;attribute name="DateOfDeparture" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="JulianDateOfDeparture">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{3}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *                 &lt;attribute name="ScheduledDepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *                 &lt;attribute name="LatestCheckInDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="BoardingDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="OtherCheckInInformation" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ArrivalInformation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
     *                 &lt;attribute name="DateOfArrival" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *                 &lt;attribute name="ScheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *                 &lt;attribute name="DateChangeIdentifier">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="-1"/>
     *                       &lt;enumeration value="+1"/>
     *                       &lt;enumeration value="+2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ServiceDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MealService" maxOccurs="12" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}MealServiceType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *                 &lt;attribute name="DeniedBoardingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="FlightProductName" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
     *                 &lt;attribute name="InFlightServiceCodes" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TransitPoint" type="{http://www.opentravel.org/OTA/2003/05}LocationType" maxOccurs="16" minOccurs="0"/>
     *         &lt;element name="BookingInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BookingReferenceID" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="CabinType" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
     *       &lt;attribute name="CabinName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="FlightStatus" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="StopOverIndicator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "carrierInfo",
        "aircraftOwner",
        "departureInformation",
        "arrivalInformation",
        "serviceDetails",
        "transitPoint",
        "bookingInfo"
    })
    public static class FlightInfo {

        @XmlElement(name = "CarrierInfo")
        protected List<TicketingFullInfoType.FlightInfo.CarrierInfo> carrierInfo;
        @XmlElement(name = "AircraftOwner")
        protected CompanyNameType aircraftOwner;
        @XmlElement(name = "DepartureInformation", required = true)
        protected TicketingFullInfoType.FlightInfo.DepartureInformation departureInformation;
        @XmlElement(name = "ArrivalInformation")
        protected TicketingFullInfoType.FlightInfo.ArrivalInformation arrivalInformation;
        @XmlElement(name = "ServiceDetails")
        protected TicketingFullInfoType.FlightInfo.ServiceDetails serviceDetails;
        @XmlElement(name = "TransitPoint")
        protected List<LocationType> transitPoint;
        @XmlElement(name = "BookingInfo")
        protected TicketingFullInfoType.FlightInfo.BookingInfo bookingInfo;
        @XmlAttribute(name = "RPH", required = true)
        protected String rph;
        @XmlAttribute(name = "CabinType")
        protected CabinType cabinType;
        @XmlAttribute(name = "CabinName")
        protected String cabinName;
        @XmlAttribute(name = "FlightStatus")
        @XmlSchemaType(name = "anySimpleType")
        protected String flightStatus;
        @XmlAttribute(name = "SequenceNumber")
        @XmlSchemaType(name = "anySimpleType")
        protected String sequenceNumber;
        @XmlAttribute(name = "StopOverIndicator")
        @XmlSchemaType(name = "anySimpleType")
        protected String stopOverIndicator;

        /**
         * Gets the value of the carrierInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrierInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrierInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketingFullInfoType.FlightInfo.CarrierInfo }
         * 
         * 
         */
        public List<TicketingFullInfoType.FlightInfo.CarrierInfo> getCarrierInfo() {
            if (carrierInfo == null) {
                carrierInfo = new ArrayList<TicketingFullInfoType.FlightInfo.CarrierInfo>();
            }
            return this.carrierInfo;
        }

        /**
         * 获取aircraftOwner属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CompanyNameType }
         *     
         */
        public CompanyNameType getAircraftOwner() {
            return aircraftOwner;
        }

        /**
         * 设置aircraftOwner属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyNameType }
         *     
         */
        public void setAircraftOwner(CompanyNameType value) {
            this.aircraftOwner = value;
        }

        /**
         * 获取departureInformation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TicketingFullInfoType.FlightInfo.DepartureInformation }
         *     
         */
        public TicketingFullInfoType.FlightInfo.DepartureInformation getDepartureInformation() {
            return departureInformation;
        }

        /**
         * 设置departureInformation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TicketingFullInfoType.FlightInfo.DepartureInformation }
         *     
         */
        public void setDepartureInformation(TicketingFullInfoType.FlightInfo.DepartureInformation value) {
            this.departureInformation = value;
        }

        /**
         * 获取arrivalInformation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TicketingFullInfoType.FlightInfo.ArrivalInformation }
         *     
         */
        public TicketingFullInfoType.FlightInfo.ArrivalInformation getArrivalInformation() {
            return arrivalInformation;
        }

        /**
         * 设置arrivalInformation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TicketingFullInfoType.FlightInfo.ArrivalInformation }
         *     
         */
        public void setArrivalInformation(TicketingFullInfoType.FlightInfo.ArrivalInformation value) {
            this.arrivalInformation = value;
        }

        /**
         * 获取serviceDetails属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TicketingFullInfoType.FlightInfo.ServiceDetails }
         *     
         */
        public TicketingFullInfoType.FlightInfo.ServiceDetails getServiceDetails() {
            return serviceDetails;
        }

        /**
         * 设置serviceDetails属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TicketingFullInfoType.FlightInfo.ServiceDetails }
         *     
         */
        public void setServiceDetails(TicketingFullInfoType.FlightInfo.ServiceDetails value) {
            this.serviceDetails = value;
        }

        /**
         * Gets the value of the transitPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transitPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransitPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LocationType }
         * 
         * 
         */
        public List<LocationType> getTransitPoint() {
            if (transitPoint == null) {
                transitPoint = new ArrayList<LocationType>();
            }
            return this.transitPoint;
        }

        /**
         * 获取bookingInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TicketingFullInfoType.FlightInfo.BookingInfo }
         *     
         */
        public TicketingFullInfoType.FlightInfo.BookingInfo getBookingInfo() {
            return bookingInfo;
        }

        /**
         * 设置bookingInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TicketingFullInfoType.FlightInfo.BookingInfo }
         *     
         */
        public void setBookingInfo(TicketingFullInfoType.FlightInfo.BookingInfo value) {
            this.bookingInfo = value;
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
         * 获取cabinType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CabinType }
         *     
         */
        public CabinType getCabinType() {
            return cabinType;
        }

        /**
         * 设置cabinType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CabinType }
         *     
         */
        public void setCabinType(CabinType value) {
            this.cabinType = value;
        }

        /**
         * 获取cabinName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCabinName() {
            return cabinName;
        }

        /**
         * 设置cabinName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCabinName(String value) {
            this.cabinName = value;
        }

        /**
         * 获取flightStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightStatus() {
            return flightStatus;
        }

        /**
         * 设置flightStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightStatus(String value) {
            this.flightStatus = value;
        }

        /**
         * 获取sequenceNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * 设置sequenceNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequenceNumber(String value) {
            this.sequenceNumber = value;
        }

        /**
         * 获取stopOverIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStopOverIndicator() {
            return stopOverIndicator;
        }

        /**
         * 设置stopOverIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStopOverIndicator(String value) {
            this.stopOverIndicator = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
         *       &lt;attribute name="DateOfArrival" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
         *       &lt;attribute name="ScheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
         *       &lt;attribute name="DateChangeIdentifier">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="-1"/>
         *             &lt;enumeration value="+1"/>
         *             &lt;enumeration value="+2"/>
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
        public static class ArrivalInformation {

            @XmlAttribute(name = "DateOfArrival")
            protected String dateOfArrival;
            @XmlAttribute(name = "DayOfWeek")
            protected DayOfWeekType dayOfWeek;
            @XmlAttribute(name = "ScheduledArrivalTime")
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar scheduledArrivalTime;
            @XmlAttribute(name = "DateChangeIdentifier")
            protected String dateChangeIdentifier;
            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "LocationName")
            protected String locationName;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "Terminal")
            protected String terminal;
            @XmlAttribute(name = "Gate")
            protected String gate;
            @XmlAttribute(name = "TS_CityCode")
            protected String tsCityCode;
            @XmlAttribute(name = "TS_CityName")
            protected String tsCityName;
            @XmlAttribute(name = "CityAirportName")
            protected String cityAirportName;
            @XmlAttribute(name = "CountryCode")
            protected String countryCode;
            @XmlAttribute(name = "CountryName")
            protected String countryName;

            /**
             * 获取dateOfArrival属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateOfArrival() {
                return dateOfArrival;
            }

            /**
             * 设置dateOfArrival属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfArrival(String value) {
                this.dateOfArrival = value;
            }

            /**
             * 获取dayOfWeek属性的值。
             * 
             * @return
             *     possible object is
             *     {@link DayOfWeekType }
             *     
             */
            public DayOfWeekType getDayOfWeek() {
                return dayOfWeek;
            }

            /**
             * 设置dayOfWeek属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link DayOfWeekType }
             *     
             */
            public void setDayOfWeek(DayOfWeekType value) {
                this.dayOfWeek = value;
            }

            /**
             * 获取scheduledArrivalTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getScheduledArrivalTime() {
                return scheduledArrivalTime;
            }

            /**
             * 设置scheduledArrivalTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setScheduledArrivalTime(XMLGregorianCalendar value) {
                this.scheduledArrivalTime = value;
            }

            /**
             * 获取dateChangeIdentifier属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateChangeIdentifier() {
                return dateChangeIdentifier;
            }

            /**
             * 设置dateChangeIdentifier属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateChangeIdentifier(String value) {
                this.dateChangeIdentifier = value;
            }

            /**
             * 获取locationCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * 设置locationCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
            }

            /**
             * 获取locationName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationName() {
                return locationName;
            }

            /**
             * 设置locationName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationName(String value) {
                this.locationName = value;
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
                if (codeContext == null) {
                    return "IATA";
                } else {
                    return codeContext;
                }
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
             * 获取terminal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminal() {
                return terminal;
            }

            /**
             * 设置terminal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminal(String value) {
                this.terminal = value;
            }

            /**
             * 获取gate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGate() {
                return gate;
            }

            /**
             * 设置gate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGate(String value) {
                this.gate = value;
            }

            /**
             * 获取tsCityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTSCityCode() {
                return tsCityCode;
            }

            /**
             * 设置tsCityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTSCityCode(String value) {
                this.tsCityCode = value;
            }

            /**
             * 获取tsCityName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTSCityName() {
                return tsCityName;
            }

            /**
             * 设置tsCityName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTSCityName(String value) {
                this.tsCityName = value;
            }

            /**
             * 获取cityAirportName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityAirportName() {
                return cityAirportName;
            }

            /**
             * 设置cityAirportName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityAirportName(String value) {
                this.cityAirportName = value;
            }

            /**
             * 获取countryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * 设置countryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * 获取countryName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryName() {
                return countryName;
            }

            /**
             * 设置countryName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryName(String value) {
                this.countryName = value;
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
         *         &lt;element name="BookingReferenceID" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
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
            "bookingReferenceID"
        })
        public static class BookingInfo {

            @XmlElement(name = "BookingReferenceID")
            protected List<TicketingFullInfoType.FlightInfo.BookingInfo.BookingReferenceID> bookingReferenceID;

            /**
             * Gets the value of the bookingReferenceID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bookingReferenceID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBookingReferenceID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TicketingFullInfoType.FlightInfo.BookingInfo.BookingReferenceID }
             * 
             * 
             */
            public List<TicketingFullInfoType.FlightInfo.BookingInfo.BookingReferenceID> getBookingReferenceID() {
                if (bookingReferenceID == null) {
                    bookingReferenceID = new ArrayList<TicketingFullInfoType.FlightInfo.BookingInfo.BookingReferenceID>();
                }
                return this.bookingReferenceID;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BookingReferenceID
                extends UniqueIDType
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
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>OperatingAirlineType">
         *       &lt;attribute name="MarketingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="BookedRBD" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
         *       &lt;attribute name="TicketedRBD" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
         *       &lt;attribute name="FrequentFlierMiles" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to5" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CarrierInfo
            extends OperatingAirlineType
        {

            @XmlAttribute(name = "MarketingInd")
            protected Boolean marketingInd;
            @XmlAttribute(name = "BookedRBD")
            protected String bookedRBD;
            @XmlAttribute(name = "TicketedRBD")
            protected String ticketedRBD;
            @XmlAttribute(name = "FrequentFlierMiles")
            protected String frequentFlierMiles;

            /**
             * 获取marketingInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMarketingInd() {
                return marketingInd;
            }

            /**
             * 设置marketingInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMarketingInd(Boolean value) {
                this.marketingInd = value;
            }

            /**
             * 获取bookedRBD属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBookedRBD() {
                return bookedRBD;
            }

            /**
             * 设置bookedRBD属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBookedRBD(String value) {
                this.bookedRBD = value;
            }

            /**
             * 获取ticketedRBD属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketedRBD() {
                return ticketedRBD;
            }

            /**
             * 设置ticketedRBD属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketedRBD(String value) {
                this.ticketedRBD = value;
            }

            /**
             * 获取frequentFlierMiles属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrequentFlierMiles() {
                return frequentFlierMiles;
            }

            /**
             * 设置frequentFlierMiles属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrequentFlierMiles(String value) {
                this.frequentFlierMiles = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CheckInCutOffGroup"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
         *       &lt;attribute name="DateOfDeparture" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="JulianDateOfDeparture">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{3}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
         *       &lt;attribute name="ScheduledDepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" />
         *       &lt;attribute name="LatestCheckInDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="BoardingDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="OtherCheckInInformation" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DepartureInformation {

            @XmlAttribute(name = "DateOfDeparture")
            protected String dateOfDeparture;
            @XmlAttribute(name = "JulianDateOfDeparture")
            protected String julianDateOfDeparture;
            @XmlAttribute(name = "DayOfWeek")
            protected DayOfWeekType dayOfWeek;
            @XmlAttribute(name = "ScheduledDepartureTime")
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar scheduledDepartureTime;
            @XmlAttribute(name = "LatestCheckInDateTime")
            protected String latestCheckInDateTime;
            @XmlAttribute(name = "BoardingDateTime")
            protected String boardingDateTime;
            @XmlAttribute(name = "OtherCheckInInformation")
            protected String otherCheckInInformation;
            @XmlAttribute(name = "CheckInCutOffUnitMultiplier")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger checkInCutOffUnitMultiplier;
            @XmlAttribute(name = "CheckInCutOffUnit")
            protected String checkInCutOffUnit;
            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "LocationName")
            protected String locationName;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "Terminal")
            protected String terminal;
            @XmlAttribute(name = "Gate")
            protected String gate;
            @XmlAttribute(name = "TS_CityCode")
            protected String tsCityCode;
            @XmlAttribute(name = "TS_CityName")
            protected String tsCityName;
            @XmlAttribute(name = "CityAirportName")
            protected String cityAirportName;
            @XmlAttribute(name = "CountryCode")
            protected String countryCode;
            @XmlAttribute(name = "CountryName")
            protected String countryName;

            /**
             * 获取dateOfDeparture属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateOfDeparture() {
                return dateOfDeparture;
            }

            /**
             * 设置dateOfDeparture属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfDeparture(String value) {
                this.dateOfDeparture = value;
            }

            /**
             * 获取julianDateOfDeparture属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJulianDateOfDeparture() {
                return julianDateOfDeparture;
            }

            /**
             * 设置julianDateOfDeparture属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJulianDateOfDeparture(String value) {
                this.julianDateOfDeparture = value;
            }

            /**
             * 获取dayOfWeek属性的值。
             * 
             * @return
             *     possible object is
             *     {@link DayOfWeekType }
             *     
             */
            public DayOfWeekType getDayOfWeek() {
                return dayOfWeek;
            }

            /**
             * 设置dayOfWeek属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link DayOfWeekType }
             *     
             */
            public void setDayOfWeek(DayOfWeekType value) {
                this.dayOfWeek = value;
            }

            /**
             * 获取scheduledDepartureTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getScheduledDepartureTime() {
                return scheduledDepartureTime;
            }

            /**
             * 设置scheduledDepartureTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setScheduledDepartureTime(XMLGregorianCalendar value) {
                this.scheduledDepartureTime = value;
            }

            /**
             * 获取latestCheckInDateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLatestCheckInDateTime() {
                return latestCheckInDateTime;
            }

            /**
             * 设置latestCheckInDateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLatestCheckInDateTime(String value) {
                this.latestCheckInDateTime = value;
            }

            /**
             * 获取boardingDateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBoardingDateTime() {
                return boardingDateTime;
            }

            /**
             * 设置boardingDateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBoardingDateTime(String value) {
                this.boardingDateTime = value;
            }

            /**
             * 获取otherCheckInInformation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherCheckInInformation() {
                return otherCheckInInformation;
            }

            /**
             * 设置otherCheckInInformation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherCheckInInformation(String value) {
                this.otherCheckInInformation = value;
            }

            /**
             * 获取checkInCutOffUnitMultiplier属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCheckInCutOffUnitMultiplier() {
                return checkInCutOffUnitMultiplier;
            }

            /**
             * 设置checkInCutOffUnitMultiplier属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCheckInCutOffUnitMultiplier(BigInteger value) {
                this.checkInCutOffUnitMultiplier = value;
            }

            /**
             * 获取checkInCutOffUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckInCutOffUnit() {
                return checkInCutOffUnit;
            }

            /**
             * 设置checkInCutOffUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckInCutOffUnit(String value) {
                this.checkInCutOffUnit = value;
            }

            /**
             * 获取locationCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * 设置locationCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
            }

            /**
             * 获取locationName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationName() {
                return locationName;
            }

            /**
             * 设置locationName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationName(String value) {
                this.locationName = value;
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
                if (codeContext == null) {
                    return "IATA";
                } else {
                    return codeContext;
                }
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
             * 获取terminal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminal() {
                return terminal;
            }

            /**
             * 设置terminal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminal(String value) {
                this.terminal = value;
            }

            /**
             * 获取gate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGate() {
                return gate;
            }

            /**
             * 设置gate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGate(String value) {
                this.gate = value;
            }

            /**
             * 获取tsCityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTSCityCode() {
                return tsCityCode;
            }

            /**
             * 设置tsCityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTSCityCode(String value) {
                this.tsCityCode = value;
            }

            /**
             * 获取tsCityName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTSCityName() {
                return tsCityName;
            }

            /**
             * 设置tsCityName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTSCityName(String value) {
                this.tsCityName = value;
            }

            /**
             * 获取cityAirportName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityAirportName() {
                return cityAirportName;
            }

            /**
             * 设置cityAirportName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityAirportName(String value) {
                this.cityAirportName = value;
            }

            /**
             * 获取countryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * 设置countryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * 获取countryName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryName() {
                return countryName;
            }

            /**
             * 设置countryName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryName(String value) {
                this.countryName = value;
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
         *         &lt;element name="MealService" maxOccurs="12" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}MealServiceType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
         *       &lt;attribute name="DeniedBoardingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="FlightProductName" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
         *       &lt;attribute name="InFlightServiceCodes" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mealService"
        })
        public static class ServiceDetails {

            @XmlElement(name = "MealService")
            protected List<TicketingFullInfoType.FlightInfo.ServiceDetails.MealService> mealService;
            @XmlAttribute(name = "DeniedBoardingIndicator")
            protected Boolean deniedBoardingIndicator;
            @XmlAttribute(name = "FlightProductName")
            protected String flightProductName;
            @XmlAttribute(name = "InFlightServiceCodes")
            protected List<String> inFlightServiceCodes;
            @XmlAttribute(name = "UnitOfMeasureQuantity")
            protected BigDecimal unitOfMeasureQuantity;
            @XmlAttribute(name = "UnitOfMeasure")
            protected String unitOfMeasure;
            @XmlAttribute(name = "UnitOfMeasureCode")
            protected String unitOfMeasureCode;

            /**
             * Gets the value of the mealService property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mealService property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMealService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TicketingFullInfoType.FlightInfo.ServiceDetails.MealService }
             * 
             * 
             */
            public List<TicketingFullInfoType.FlightInfo.ServiceDetails.MealService> getMealService() {
                if (mealService == null) {
                    mealService = new ArrayList<TicketingFullInfoType.FlightInfo.ServiceDetails.MealService>();
                }
                return this.mealService;
            }

            /**
             * 获取deniedBoardingIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDeniedBoardingIndicator() {
                return deniedBoardingIndicator;
            }

            /**
             * 设置deniedBoardingIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDeniedBoardingIndicator(Boolean value) {
                this.deniedBoardingIndicator = value;
            }

            /**
             * 获取flightProductName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightProductName() {
                return flightProductName;
            }

            /**
             * 设置flightProductName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightProductName(String value) {
                this.flightProductName = value;
            }

            /**
             * Gets the value of the inFlightServiceCodes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the inFlightServiceCodes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInFlightServiceCodes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getInFlightServiceCodes() {
                if (inFlightServiceCodes == null) {
                    inFlightServiceCodes = new ArrayList<String>();
                }
                return this.inFlightServiceCodes;
            }

            /**
             * 获取unitOfMeasureQuantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitOfMeasureQuantity() {
                return unitOfMeasureQuantity;
            }

            /**
             * 设置unitOfMeasureQuantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitOfMeasureQuantity(BigDecimal value) {
                this.unitOfMeasureQuantity = value;
            }

            /**
             * 获取unitOfMeasure属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitOfMeasure() {
                return unitOfMeasure;
            }

            /**
             * 设置unitOfMeasure属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitOfMeasure(String value) {
                this.unitOfMeasure = value;
            }

            /**
             * 获取unitOfMeasureCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitOfMeasureCode() {
                return unitOfMeasureCode;
            }

            /**
             * 设置unitOfMeasureCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitOfMeasureCode(String value) {
                this.unitOfMeasureCode = value;
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
             *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}MealServiceType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MealService {

                @XmlAttribute(name = "Code", required = true)
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
     *         &lt;element name="PTC_FareBreakdown" type="{http://www.opentravel.org/OTA/2003/05}PTCFareBreakdownType" maxOccurs="20"/>
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
        "ptcFareBreakdown"
    })
    public static class PTCFareBreakdowns {

        @XmlElement(name = "PTC_FareBreakdown", required = true)
        protected List<PTCFareBreakdownType> ptcFareBreakdown;

        /**
         * Gets the value of the ptcFareBreakdown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptcFareBreakdown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPTCFareBreakdown().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType }
         * 
         * 
         */
        public List<PTCFareBreakdownType> getPTCFareBreakdown() {
            if (ptcFareBreakdown == null) {
                ptcFareBreakdown = new ArrayList<PTCFareBreakdownType>();
            }
            return this.ptcFareBreakdown;
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
     *         &lt;element name="PassengerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
     *         &lt;element name="PassengerWeight" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OtherServiceInformation" type="{http://www.opentravel.org/OTA/2003/05}OtherServiceInfoType" maxOccurs="9" minOccurs="0"/>
     *         &lt;element name="ContactInfo" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
     *                 &lt;sequence>
     *                   &lt;element name="Relationship" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="OptionToDecline" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PassengerType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PassengerTypeQuantityType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GenderGroup"/>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="PassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="JumpSeatAuthority" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *       &lt;attribute name="SecurityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="GroupReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="AddToStandbyDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *       &lt;attribute name="InfantIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="EmployeeSeniorityDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *       &lt;attribute name="EmployeeLengthOfService" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "passengerName",
        "passengerWeight",
        "otherServiceInformation",
        "contactInfo",
        "passengerType"
    })
    public static class PassengerInfo {

        @XmlElement(name = "PassengerName")
        protected PersonNameType passengerName;
        @XmlElement(name = "PassengerWeight")
        protected TicketingFullInfoType.PassengerInfo.PassengerWeight passengerWeight;
        @XmlElement(name = "OtherServiceInformation")
        protected List<OtherServiceInfoType> otherServiceInformation;
        @XmlElement(name = "ContactInfo")
        protected List<TicketingFullInfoType.PassengerInfo.ContactInfo> contactInfo;
        @XmlElement(name = "PassengerType")
        protected TicketingFullInfoType.PassengerInfo.PassengerType passengerType;
        @XmlAttribute(name = "RPH", required = true)
        protected String rph;
        @XmlAttribute(name = "PassengerRPH")
        protected String passengerRPH;
        @XmlAttribute(name = "JumpSeatAuthority")
        protected String jumpSeatAuthority;
        @XmlAttribute(name = "SecurityCode")
        protected String securityCode;
        @XmlAttribute(name = "GroupReference")
        protected String groupReference;
        @XmlAttribute(name = "AddToStandbyDateTime")
        protected String addToStandbyDateTime;
        @XmlAttribute(name = "InfantIndicator")
        protected Boolean infantIndicator;
        @XmlAttribute(name = "EmployeeSeniorityDate")
        protected String employeeSeniorityDate;
        @XmlAttribute(name = "EmployeeLengthOfService")
        protected Duration employeeLengthOfService;

        /**
         * 获取passengerName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PersonNameType }
         *     
         */
        public PersonNameType getPassengerName() {
            return passengerName;
        }

        /**
         * 设置passengerName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PersonNameType }
         *     
         */
        public void setPassengerName(PersonNameType value) {
            this.passengerName = value;
        }

        /**
         * 获取passengerWeight属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TicketingFullInfoType.PassengerInfo.PassengerWeight }
         *     
         */
        public TicketingFullInfoType.PassengerInfo.PassengerWeight getPassengerWeight() {
            return passengerWeight;
        }

        /**
         * 设置passengerWeight属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TicketingFullInfoType.PassengerInfo.PassengerWeight }
         *     
         */
        public void setPassengerWeight(TicketingFullInfoType.PassengerInfo.PassengerWeight value) {
            this.passengerWeight = value;
        }

        /**
         * Gets the value of the otherServiceInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherServiceInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherServiceInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OtherServiceInfoType }
         * 
         * 
         */
        public List<OtherServiceInfoType> getOtherServiceInformation() {
            if (otherServiceInformation == null) {
                otherServiceInformation = new ArrayList<OtherServiceInfoType>();
            }
            return this.otherServiceInformation;
        }

        /**
         * Gets the value of the contactInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketingFullInfoType.PassengerInfo.ContactInfo }
         * 
         * 
         */
        public List<TicketingFullInfoType.PassengerInfo.ContactInfo> getContactInfo() {
            if (contactInfo == null) {
                contactInfo = new ArrayList<TicketingFullInfoType.PassengerInfo.ContactInfo>();
            }
            return this.contactInfo;
        }

        /**
         * 获取passengerType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TicketingFullInfoType.PassengerInfo.PassengerType }
         *     
         */
        public TicketingFullInfoType.PassengerInfo.PassengerType getPassengerType() {
            return passengerType;
        }

        /**
         * 设置passengerType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TicketingFullInfoType.PassengerInfo.PassengerType }
         *     
         */
        public void setPassengerType(TicketingFullInfoType.PassengerInfo.PassengerType value) {
            this.passengerType = value;
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
         * 获取passengerRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassengerRPH() {
            return passengerRPH;
        }

        /**
         * 设置passengerRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassengerRPH(String value) {
            this.passengerRPH = value;
        }

        /**
         * 获取jumpSeatAuthority属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJumpSeatAuthority() {
            return jumpSeatAuthority;
        }

        /**
         * 设置jumpSeatAuthority属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJumpSeatAuthority(String value) {
            this.jumpSeatAuthority = value;
        }

        /**
         * 获取securityCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecurityCode() {
            return securityCode;
        }

        /**
         * 设置securityCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecurityCode(String value) {
            this.securityCode = value;
        }

        /**
         * 获取groupReference属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupReference() {
            return groupReference;
        }

        /**
         * 设置groupReference属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupReference(String value) {
            this.groupReference = value;
        }

        /**
         * 获取addToStandbyDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddToStandbyDateTime() {
            return addToStandbyDateTime;
        }

        /**
         * 设置addToStandbyDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddToStandbyDateTime(String value) {
            this.addToStandbyDateTime = value;
        }

        /**
         * 获取infantIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInfantIndicator() {
            return infantIndicator;
        }

        /**
         * 设置infantIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInfantIndicator(Boolean value) {
            this.infantIndicator = value;
        }

        /**
         * 获取employeeSeniorityDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployeeSeniorityDate() {
            return employeeSeniorityDate;
        }

        /**
         * 设置employeeSeniorityDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployeeSeniorityDate(String value) {
            this.employeeSeniorityDate = value;
        }

        /**
         * 获取employeeLengthOfService属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getEmployeeLengthOfService() {
            return employeeLengthOfService;
        }

        /**
         * 设置employeeLengthOfService属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setEmployeeLengthOfService(Duration value) {
            this.employeeLengthOfService = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
         *       &lt;sequence>
         *         &lt;element name="Relationship" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64"/>
         *       &lt;/sequence>
         *       &lt;attribute name="OptionToDecline" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "relationship"
        })
        public static class ContactInfo
            extends ContactPersonType
        {

            @XmlElement(name = "Relationship", required = true)
            protected String relationship;
            @XmlAttribute(name = "OptionToDecline")
            protected Boolean optionToDecline;

            /**
             * 获取relationship属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelationship() {
                return relationship;
            }

            /**
             * 设置relationship属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelationship(String value) {
                this.relationship = value;
            }

            /**
             * 获取optionToDecline属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOptionToDecline() {
                return optionToDecline;
            }

            /**
             * 设置optionToDecline属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOptionToDecline(Boolean value) {
                this.optionToDecline = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PassengerTypeQuantityType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GenderGroup"/>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PassengerType
            extends PassengerTypeQuantityType
        {

            @XmlAttribute(name = "Gender")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String gender;

            /**
             * 获取gender属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGender() {
                return gender;
            }

            /**
             * 设置gender属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGender(String value) {
                this.gender = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PassengerWeight {

            @XmlAttribute(name = "UnitOfMeasureQuantity")
            protected BigDecimal unitOfMeasureQuantity;
            @XmlAttribute(name = "UnitOfMeasure")
            protected String unitOfMeasure;
            @XmlAttribute(name = "UnitOfMeasureCode")
            protected String unitOfMeasureCode;

            /**
             * 获取unitOfMeasureQuantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitOfMeasureQuantity() {
                return unitOfMeasureQuantity;
            }

            /**
             * 设置unitOfMeasureQuantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitOfMeasureQuantity(BigDecimal value) {
                this.unitOfMeasureQuantity = value;
            }

            /**
             * 获取unitOfMeasure属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitOfMeasure() {
                return unitOfMeasure;
            }

            /**
             * 设置unitOfMeasure属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitOfMeasure(String value) {
                this.unitOfMeasure = value;
            }

            /**
             * 获取unitOfMeasureCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitOfMeasureCode() {
                return unitOfMeasureCode;
            }

            /**
             * 设置unitOfMeasureCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitOfMeasureCode(String value) {
                this.unitOfMeasureCode = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
     *       &lt;sequence>
     *         &lt;element name="PaymentDetail" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
     *                 &lt;attribute name="PaymentReason" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PaymentTotal" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
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
        "paymentDetail",
        "paymentTotal"
    })
    public static class PaymentInfo
        extends PaymentDetailType
    {

        @XmlElement(name = "PaymentDetail", required = true)
        protected List<TicketingFullInfoType.PaymentInfo.PaymentDetail> paymentDetail;
        @XmlElement(name = "PaymentTotal")
        protected TicketingFullInfoType.PaymentInfo.PaymentTotal paymentTotal;

        /**
         * Gets the value of the paymentDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketingFullInfoType.PaymentInfo.PaymentDetail }
         * 
         * 
         */
        public List<TicketingFullInfoType.PaymentInfo.PaymentDetail> getPaymentDetail() {
            if (paymentDetail == null) {
                paymentDetail = new ArrayList<TicketingFullInfoType.PaymentInfo.PaymentDetail>();
            }
            return this.paymentDetail;
        }

        /**
         * 获取paymentTotal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TicketingFullInfoType.PaymentInfo.PaymentTotal }
         *     
         */
        public TicketingFullInfoType.PaymentInfo.PaymentTotal getPaymentTotal() {
            return paymentTotal;
        }

        /**
         * 设置paymentTotal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TicketingFullInfoType.PaymentInfo.PaymentTotal }
         *     
         */
        public void setPaymentTotal(TicketingFullInfoType.PaymentInfo.PaymentTotal value) {
            this.paymentTotal = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
         *       &lt;attribute name="PaymentReason" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PaymentDetail
            extends PaymentDetailType
        {

            @XmlAttribute(name = "PaymentReason")
            protected String paymentReason;

            /**
             * 获取paymentReason属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentReason() {
                return paymentReason;
            }

            /**
             * 设置paymentReason属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentReason(String value) {
                this.paymentReason = value;
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
        public static class PaymentTotal {

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
     *         &lt;element name="FormOfPayment" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" maxOccurs="4" minOccurs="0"/>
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
        "formOfPayment"
    })
    public static class PaymentTotal {

        @XmlElement(name = "FormOfPayment")
        protected List<PaymentDetailType> formOfPayment;
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
         * Gets the value of the formOfPayment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFormOfPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentDetailType }
         * 
         * 
         */
        public List<PaymentDetailType> getFormOfPayment() {
            if (formOfPayment == null) {
                formOfPayment = new ArrayList<PaymentDetailType>();
            }
            return this.formOfPayment;
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
