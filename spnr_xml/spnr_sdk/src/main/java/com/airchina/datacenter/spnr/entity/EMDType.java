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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A container for electronic miscellaneous document information
 * 
 * <p>EMD_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EMD_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelerRefNumber" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerRefNumberGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AgentID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="PaymentDetail" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="OriginDestination" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustLoyalty" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Endorsement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Info" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to255" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AddReferenceID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="BaseFare" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *                 &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05}FareAmountType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EquivFare" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *                 &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05}FareAmountType" />
 *                 &lt;attribute name="BankExchangeRate" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalFare" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *                 &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05}FareAmountType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Taxes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tax" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirTaxType">
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnstructuredFareCalc" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="FareCalcMode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
 *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *                 &lt;attribute name="ReportingCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
 *                 &lt;attribute name="Info" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ET_FareInfo">
 *                 &lt;sequence>
 *                   &lt;element name="PenaltyAmount" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *                 &lt;attribute name="NonEndorsableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonRefundableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PenaltyRestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PresentCreditCardInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AroundTheWorldFareInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonInterlineableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonCommissionableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonReissuableNonExchgInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketDocument" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CouponInfo" maxOccurs="4">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SoldFlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
 *                             &lt;choice>
 *                               &lt;element name="CheckedInAirlineRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
 *                               &lt;element name="FlownAirlineSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
 *                             &lt;/choice>
 *                             &lt;element name="ExcessBaggage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PresentInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="To" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                                     &lt;attribute name="At" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ReasonForIssuance" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonForIssuanceGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ValidatingAirline" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FiledFeeInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                     &lt;attribute name="BSR_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *                           &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
 *                           &lt;attribute name="InConnectionNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
 *                           &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                           &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
 *                           &lt;attribute name="Duration" type="{http://www.opentravel.org/OTA/2003/05}DurationType" />
 *                           &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
 *                           &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *                           &lt;attribute name="InvoluntaryIndCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="I"/>
 *                                 &lt;enumeration value="L"/>
 *                                 &lt;enumeration value="S"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="SettlementAuthCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                           &lt;attribute name="Value" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="AssociateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="PromotionalCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                           &lt;attribute name="Remark" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                           &lt;attribute name="TaxOnEMD_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="AssocFareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="ConsumedAtIssuanceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="DateOfService" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *                 &lt;attribute name="TicketDocumentNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Ticket"/>
 *                       &lt;enumeration value="EMD"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PrimaryDocInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="InConnectionDocNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExchangeTktNbrInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Commission" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareComponent" type="{http://www.opentravel.org/OTA/2003/05}FareComponentType" minOccurs="0"/>
 *         &lt;element name="CarrierFeeInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentDetail" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" minOccurs="0"/>
 *                   &lt;element name="CarrierFee" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FeeAmount" maxOccurs="9">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
 *                                     &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
 *                                     &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                     &lt;attribute name="ApplicationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
 *                           &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *                           &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                           &lt;attribute name="RuleCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
 *                           &lt;attribute name="FareClassCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                           &lt;attribute name="ReportingCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Taxes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExchResidualFareComponent" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareComponentType">
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
 *                   &lt;element name="TotalAmount" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                           &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OriginalIssueInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Information">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="0"/>
 *                       &lt;maxLength value="34"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="TicketDocumentNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="IssuingAgentID" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to8" />
 *                 &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="LocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReissuedFlown" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
 *                 &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *                 &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="WaiverCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
 *                 &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResponseComment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/>
 *         &lt;element name="PresentInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="To" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                 &lt;attribute name="At" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReasonForIssuance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonForIssuanceGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ValidatingAirline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaxCouponInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TicketDocument" maxOccurs="4">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CouponNumber" maxOccurs="4">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TaxCouponInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *                                               &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
 *                                       &lt;element name="UnticketedPointInfo" maxOccurs="5" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="CityAirportCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                                               &lt;attribute name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                                               &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                                               &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="JourneyTurnaroundCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *       &lt;attribute name="TotalFltSegQty" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *       &lt;attribute name="SpecificData" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="TaxOnCommissionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TicketingModeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
 *       &lt;attribute name="EMD_Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="EMD-S"/>
 *             &lt;enumeration value="EMD-A"/>
 *             &lt;enumeration value="VirtualEMD"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="QuoteInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="ProductStatus">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="EXCHANGE"/>
 *             &lt;enumeration value="EXCHANGING"/>
 *             &lt;enumeration value="EXCEPTION"/>
 *             &lt;enumeration value="UPGRADE"/>
 *             &lt;enumeration value="FAILURE"/>
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
@XmlType(name = "EMD_Type", propOrder = {
    "travelerRefNumber",
    "agentID",
    "paymentDetail",
    "originDestination",
    "custLoyalty",
    "endorsement",
    "addReferenceID",
    "baseFare",
    "equivFare",
    "totalFare",
    "taxes",
    "unstructuredFareCalc",
    "fareInfo",
    "ticketDocument",
    "commission",
    "fareComponent",
    "carrierFeeInfo",
    "exchResidualFareComponent",
    "originalIssueInfo",
    "reissuedFlown",
    "responseComment",
    "presentInfo",
    "reasonForIssuance",
    "validatingAirline",
    "taxCouponInformation"
})
public class EMDType {

    @XmlElement(name = "TravelerRefNumber")
    protected EMDType.TravelerRefNumber travelerRefNumber;
    @XmlElement(name = "AgentID")
    protected List<UniqueIDType> agentID;
    @XmlElement(name = "PaymentDetail")
    protected List<PaymentDetailType> paymentDetail;
    @XmlElement(name = "OriginDestination")
    protected EMDType.OriginDestination originDestination;
    @XmlElement(name = "CustLoyalty")
    protected List<EMDType.CustLoyalty> custLoyalty;
    @XmlElement(name = "Endorsement")
    protected EMDType.Endorsement endorsement;
    @XmlElement(name = "AddReferenceID")
    protected List<UniqueIDType> addReferenceID;
    @XmlElement(name = "BaseFare")
    protected List<EMDType.BaseFare> baseFare;
    @XmlElement(name = "EquivFare")
    protected List<EMDType.EquivFare> equivFare;
    @XmlElement(name = "TotalFare")
    protected List<EMDType.TotalFare> totalFare;
    @XmlElement(name = "Taxes")
    protected EMDType.Taxes taxes;
    @XmlElement(name = "UnstructuredFareCalc")
    protected List<EMDType.UnstructuredFareCalc> unstructuredFareCalc;
    @XmlElement(name = "FareInfo")
    protected EMDType.FareInfo fareInfo;
    @XmlElement(name = "TicketDocument", required = true)
    protected List<EMDType.TicketDocument> ticketDocument;
    @XmlElement(name = "Commission")
    protected EMDType.Commission commission;
    @XmlElement(name = "FareComponent")
    protected FareComponentType fareComponent;
    @XmlElement(name = "CarrierFeeInfo")
    protected EMDType.CarrierFeeInfo carrierFeeInfo;
    @XmlElement(name = "ExchResidualFareComponent")
    protected List<EMDType.ExchResidualFareComponent> exchResidualFareComponent;
    @XmlElement(name = "OriginalIssueInfo")
    protected EMDType.OriginalIssueInfo originalIssueInfo;
    @XmlElement(name = "ReissuedFlown")
    protected List<EMDType.ReissuedFlown> reissuedFlown;
    @XmlElement(name = "ResponseComment")
    protected FreeTextType responseComment;
    @XmlElement(name = "PresentInfo")
    protected EMDType.PresentInfo presentInfo;
    @XmlElement(name = "ReasonForIssuance")
    protected EMDType.ReasonForIssuance reasonForIssuance;
    @XmlElement(name = "ValidatingAirline")
    protected EMDType.ValidatingAirline validatingAirline;
    @XmlElement(name = "TaxCouponInformation")
    protected EMDType.TaxCouponInformation taxCouponInformation;
    @XmlAttribute(name = "TotalFltSegQty", required = true)
    protected int totalFltSegQty;
    @XmlAttribute(name = "SpecificData")
    protected String specificData;
    @XmlAttribute(name = "TaxOnCommissionInd")
    protected Boolean taxOnCommissionInd;
    @XmlAttribute(name = "TicketingModeCode")
    protected String ticketingModeCode;
    @XmlAttribute(name = "EMD_Type")
    protected String emdType;
    @XmlAttribute(name = "QuoteInd")
    protected Boolean quoteInd;
    @XmlAttribute(name = "Operation")
    protected ActionType operation;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "ProductStatus")
    protected String productStatus;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;

    /**
     * 获取travelerRefNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMDType.TravelerRefNumber }
     *     
     */
    public EMDType.TravelerRefNumber getTravelerRefNumber() {
        return travelerRefNumber;
    }

    /**
     * 设置travelerRefNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.TravelerRefNumber }
     *     
     */
    public void setTravelerRefNumber(EMDType.TravelerRefNumber value) {
        this.travelerRefNumber = value;
    }

    /**
     * Gets the value of the agentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getAgentID() {
        if (agentID == null) {
            agentID = new ArrayList<UniqueIDType>();
        }
        return this.agentID;
    }

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
     * {@link PaymentDetailType }
     * 
     * 
     */
    public List<PaymentDetailType> getPaymentDetail() {
        if (paymentDetail == null) {
            paymentDetail = new ArrayList<PaymentDetailType>();
        }
        return this.paymentDetail;
    }

    /**
     * 获取originDestination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMDType.OriginDestination }
     *     
     */
    public EMDType.OriginDestination getOriginDestination() {
        return originDestination;
    }

    /**
     * 设置originDestination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.OriginDestination }
     *     
     */
    public void setOriginDestination(EMDType.OriginDestination value) {
        this.originDestination = value;
    }

    /**
     * Gets the value of the custLoyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.CustLoyalty }
     * 
     * 
     */
    public List<EMDType.CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<EMDType.CustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * 获取endorsement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMDType.Endorsement }
     *     
     */
    public EMDType.Endorsement getEndorsement() {
        return endorsement;
    }

    /**
     * 设置endorsement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.Endorsement }
     *     
     */
    public void setEndorsement(EMDType.Endorsement value) {
        this.endorsement = value;
    }

    /**
     * Gets the value of the addReferenceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addReferenceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddReferenceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getAddReferenceID() {
        if (addReferenceID == null) {
            addReferenceID = new ArrayList<UniqueIDType>();
        }
        return this.addReferenceID;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.BaseFare }
     * 
     * 
     */
    public List<EMDType.BaseFare> getBaseFare() {
        if (baseFare == null) {
            baseFare = new ArrayList<EMDType.BaseFare>();
        }
        return this.baseFare;
    }

    /**
     * Gets the value of the equivFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equivFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquivFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.EquivFare }
     * 
     * 
     */
    public List<EMDType.EquivFare> getEquivFare() {
        if (equivFare == null) {
            equivFare = new ArrayList<EMDType.EquivFare>();
        }
        return this.equivFare;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.TotalFare }
     * 
     * 
     */
    public List<EMDType.TotalFare> getTotalFare() {
        if (totalFare == null) {
            totalFare = new ArrayList<EMDType.TotalFare>();
        }
        return this.totalFare;
    }

    /**
     * 获取taxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMDType.Taxes }
     *     
     */
    public EMDType.Taxes getTaxes() {
        return taxes;
    }

    /**
     * 设置taxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.Taxes }
     *     
     */
    public void setTaxes(EMDType.Taxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the unstructuredFareCalc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unstructuredFareCalc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnstructuredFareCalc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.UnstructuredFareCalc }
     * 
     * 
     */
    public List<EMDType.UnstructuredFareCalc> getUnstructuredFareCalc() {
        if (unstructuredFareCalc == null) {
            unstructuredFareCalc = new ArrayList<EMDType.UnstructuredFareCalc>();
        }
        return this.unstructuredFareCalc;
    }

    /**
     * 获取fareInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMDType.FareInfo }
     *     
     */
    public EMDType.FareInfo getFareInfo() {
        return fareInfo;
    }

    /**
     * 设置fareInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.FareInfo }
     *     
     */
    public void setFareInfo(EMDType.FareInfo value) {
        this.fareInfo = value;
    }

    /**
     * Gets the value of the ticketDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.TicketDocument }
     * 
     * 
     */
    public List<EMDType.TicketDocument> getTicketDocument() {
        if (ticketDocument == null) {
            ticketDocument = new ArrayList<EMDType.TicketDocument>();
        }
        return this.ticketDocument;
    }

    /**
     * 获取commission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMDType.Commission }
     *     
     */
    public EMDType.Commission getCommission() {
        return commission;
    }

    /**
     * 设置commission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.Commission }
     *     
     */
    public void setCommission(EMDType.Commission value) {
        this.commission = value;
    }

    /**
     * 获取fareComponent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType }
     *     
     */
    public FareComponentType getFareComponent() {
        return fareComponent;
    }

    /**
     * 设置fareComponent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType }
     *     
     */
    public void setFareComponent(FareComponentType value) {
        this.fareComponent = value;
    }

    /**
     * 获取carrierFeeInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMDType.CarrierFeeInfo }
     *     
     */
    public EMDType.CarrierFeeInfo getCarrierFeeInfo() {
        return carrierFeeInfo;
    }

    /**
     * 设置carrierFeeInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.CarrierFeeInfo }
     *     
     */
    public void setCarrierFeeInfo(EMDType.CarrierFeeInfo value) {
        this.carrierFeeInfo = value;
    }

    /**
     * Gets the value of the exchResidualFareComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchResidualFareComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchResidualFareComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.ExchResidualFareComponent }
     * 
     * 
     */
    public List<EMDType.ExchResidualFareComponent> getExchResidualFareComponent() {
        if (exchResidualFareComponent == null) {
            exchResidualFareComponent = new ArrayList<EMDType.ExchResidualFareComponent>();
        }
        return this.exchResidualFareComponent;
    }

    /**
     * 获取originalIssueInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMDType.OriginalIssueInfo }
     *     
     */
    public EMDType.OriginalIssueInfo getOriginalIssueInfo() {
        return originalIssueInfo;
    }

    /**
     * 设置originalIssueInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.OriginalIssueInfo }
     *     
     */
    public void setOriginalIssueInfo(EMDType.OriginalIssueInfo value) {
        this.originalIssueInfo = value;
    }

    /**
     * Gets the value of the reissuedFlown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reissuedFlown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReissuedFlown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.ReissuedFlown }
     * 
     * 
     */
    public List<EMDType.ReissuedFlown> getReissuedFlown() {
        if (reissuedFlown == null) {
            reissuedFlown = new ArrayList<EMDType.ReissuedFlown>();
        }
        return this.reissuedFlown;
    }

    /**
     * 获取responseComment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreeTextType }
     *     
     */
    public FreeTextType getResponseComment() {
        return responseComment;
    }

    /**
     * 设置responseComment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextType }
     *     
     */
    public void setResponseComment(FreeTextType value) {
        this.responseComment = value;
    }

    /**
     * 获取presentInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMDType.PresentInfo }
     *     
     */
    public EMDType.PresentInfo getPresentInfo() {
        return presentInfo;
    }

    /**
     * 设置presentInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.PresentInfo }
     *     
     */
    public void setPresentInfo(EMDType.PresentInfo value) {
        this.presentInfo = value;
    }

    /**
     * 获取reasonForIssuance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMDType.ReasonForIssuance }
     *     
     */
    public EMDType.ReasonForIssuance getReasonForIssuance() {
        return reasonForIssuance;
    }

    /**
     * 设置reasonForIssuance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.ReasonForIssuance }
     *     
     */
    public void setReasonForIssuance(EMDType.ReasonForIssuance value) {
        this.reasonForIssuance = value;
    }

    /**
     * 获取validatingAirline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMDType.ValidatingAirline }
     *     
     */
    public EMDType.ValidatingAirline getValidatingAirline() {
        return validatingAirline;
    }

    /**
     * 设置validatingAirline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.ValidatingAirline }
     *     
     */
    public void setValidatingAirline(EMDType.ValidatingAirline value) {
        this.validatingAirline = value;
    }

    /**
     * 获取taxCouponInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMDType.TaxCouponInformation }
     *     
     */
    public EMDType.TaxCouponInformation getTaxCouponInformation() {
        return taxCouponInformation;
    }

    /**
     * 设置taxCouponInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.TaxCouponInformation }
     *     
     */
    public void setTaxCouponInformation(EMDType.TaxCouponInformation value) {
        this.taxCouponInformation = value;
    }

    /**
     * 获取totalFltSegQty属性的值。
     * 
     */
    public int getTotalFltSegQty() {
        return totalFltSegQty;
    }

    /**
     * 设置totalFltSegQty属性的值。
     * 
     */
    public void setTotalFltSegQty(int value) {
        this.totalFltSegQty = value;
    }

    /**
     * 获取specificData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificData() {
        return specificData;
    }

    /**
     * 设置specificData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificData(String value) {
        this.specificData = value;
    }

    /**
     * 获取taxOnCommissionInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxOnCommissionInd() {
        return taxOnCommissionInd;
    }

    /**
     * 设置taxOnCommissionInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxOnCommissionInd(Boolean value) {
        this.taxOnCommissionInd = value;
    }

    /**
     * 获取ticketingModeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingModeCode() {
        return ticketingModeCode;
    }

    /**
     * 设置ticketingModeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingModeCode(String value) {
        this.ticketingModeCode = value;
    }

    /**
     * 获取emdType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDType() {
        return emdType;
    }

    /**
     * 设置emdType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMDType(String value) {
        this.emdType = value;
    }

    /**
     * 获取quoteInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuoteInd() {
        return quoteInd;
    }

    /**
     * 设置quoteInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuoteInd(Boolean value) {
        this.quoteInd = value;
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
     * 获取productStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * 设置productStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStatus(String value) {
        this.productStatus = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *       &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05}FareAmountType" />
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

        @XmlAttribute(name = "Purpose")
        protected PurposeType purpose;
        @XmlAttribute(name = "FareAmountType")
        protected FareAmountType fareAmountType;
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
         * 获取fareAmountType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FareAmountType }
         *     
         */
        public FareAmountType getFareAmountType() {
            return fareAmountType;
        }

        /**
         * 设置fareAmountType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FareAmountType }
         *     
         */
        public void setFareAmountType(FareAmountType value) {
            this.fareAmountType = value;
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
     *         &lt;element name="PaymentDetail" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" minOccurs="0"/>
     *         &lt;element name="CarrierFee" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FeeAmount" maxOccurs="9">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
     *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
     *                           &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                           &lt;attribute name="ApplicationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
     *                 &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *                 &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *                 &lt;attribute name="RuleCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
     *                 &lt;attribute name="FareClassCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                 &lt;attribute name="ReportingCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Taxes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
     *                 &lt;/sequence>
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
        "paymentDetail",
        "carrierFee",
        "taxes"
    })
    public static class CarrierFeeInfo {

        @XmlElement(name = "PaymentDetail")
        protected PaymentDetailType paymentDetail;
        @XmlElement(name = "CarrierFee")
        protected List<EMDType.CarrierFeeInfo.CarrierFee> carrierFee;
        @XmlElement(name = "Taxes")
        protected EMDType.CarrierFeeInfo.Taxes taxes;

        /**
         * 获取paymentDetail属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PaymentDetailType }
         *     
         */
        public PaymentDetailType getPaymentDetail() {
            return paymentDetail;
        }

        /**
         * 设置paymentDetail属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentDetailType }
         *     
         */
        public void setPaymentDetail(PaymentDetailType value) {
            this.paymentDetail = value;
        }

        /**
         * Gets the value of the carrierFee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrierFee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrierFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EMDType.CarrierFeeInfo.CarrierFee }
         * 
         * 
         */
        public List<EMDType.CarrierFeeInfo.CarrierFee> getCarrierFee() {
            if (carrierFee == null) {
                carrierFee = new ArrayList<EMDType.CarrierFeeInfo.CarrierFee>();
            }
            return this.carrierFee;
        }

        /**
         * 获取taxes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link EMDType.CarrierFeeInfo.Taxes }
         *     
         */
        public EMDType.CarrierFeeInfo.Taxes getTaxes() {
            return taxes;
        }

        /**
         * 设置taxes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link EMDType.CarrierFeeInfo.Taxes }
         *     
         */
        public void setTaxes(EMDType.CarrierFeeInfo.Taxes value) {
            this.taxes = value;
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
         *         &lt;element name="FeeAmount" maxOccurs="9">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
         *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
         *                 &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                 &lt;attribute name="ApplicationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
         *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
         *       &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
         *       &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
         *       &lt;attribute name="RuleCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
         *       &lt;attribute name="FareClassCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *       &lt;attribute name="ReportingCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "feeAmount"
        })
        public static class CarrierFee {

            @XmlElement(name = "FeeAmount", required = true)
            protected List<EMDType.CarrierFeeInfo.CarrierFee.FeeAmount> feeAmount;
            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "Number")
            protected Integer number;
            @XmlAttribute(name = "TariffNumber")
            protected String tariffNumber;
            @XmlAttribute(name = "RuleNumber")
            protected String ruleNumber;
            @XmlAttribute(name = "RuleCode")
            protected String ruleCode;
            @XmlAttribute(name = "FareClassCode")
            protected String fareClassCode;
            @XmlAttribute(name = "ReportingCode")
            protected String reportingCode;
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
             * Gets the value of the feeAmount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the feeAmount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFeeAmount().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EMDType.CarrierFeeInfo.CarrierFee.FeeAmount }
             * 
             * 
             */
            public List<EMDType.CarrierFeeInfo.CarrierFee.FeeAmount> getFeeAmount() {
                if (feeAmount == null) {
                    feeAmount = new ArrayList<EMDType.CarrierFeeInfo.CarrierFee.FeeAmount>();
                }
                return this.feeAmount;
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
             * 获取number属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumber() {
                return number;
            }

            /**
             * 设置number属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumber(Integer value) {
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
             * 获取fareClassCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareClassCode() {
                return fareClassCode;
            }

            /**
             * 设置fareClassCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareClassCode(String value) {
                this.fareClassCode = value;
            }

            /**
             * 获取reportingCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportingCode() {
                return reportingCode;
            }

            /**
             * 设置reportingCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReportingCode(String value) {
                this.reportingCode = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
             *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
             *       &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *       &lt;attribute name="ApplicationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FeeAmount {

                @XmlAttribute(name = "Type", required = true)
                protected String type;
                @XmlAttribute(name = "Amount", required = true)
                protected BigDecimal amount;
                @XmlAttribute(name = "ApplicationCode", required = true)
                protected List<String> applicationCode;
                @XmlAttribute(name = "OriginCityCode")
                protected String originCityCode;
                @XmlAttribute(name = "OriginCodeContext")
                protected String originCodeContext;
                @XmlAttribute(name = "DestinationCityCode")
                protected String destinationCityCode;
                @XmlAttribute(name = "DestinationCodeContext")
                protected String destinationCodeContext;

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
                 * Gets the value of the applicationCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the applicationCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getApplicationCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getApplicationCode() {
                    if (applicationCode == null) {
                        applicationCode = new ArrayList<String>();
                    }
                    return this.applicationCode;
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
         *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
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

            @XmlElement(name = "Tax")
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
    public static class Commission {

        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Info" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to255" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Endorsement {

        @XmlAttribute(name = "Info")
        protected String info;

        /**
         * 获取info属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * 设置info属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
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
     *       &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *       &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05}FareAmountType" />
     *       &lt;attribute name="BankExchangeRate" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EquivFare {

        @XmlAttribute(name = "Purpose")
        protected PurposeType purpose;
        @XmlAttribute(name = "FareAmountType")
        protected FareAmountType fareAmountType;
        @XmlAttribute(name = "BankExchangeRate")
        protected BigDecimal bankExchangeRate;
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
         * 获取fareAmountType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FareAmountType }
         *     
         */
        public FareAmountType getFareAmountType() {
            return fareAmountType;
        }

        /**
         * 设置fareAmountType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FareAmountType }
         *     
         */
        public void setFareAmountType(FareAmountType value) {
            this.fareAmountType = value;
        }

        /**
         * 获取bankExchangeRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBankExchangeRate() {
            return bankExchangeRate;
        }

        /**
         * 设置bankExchangeRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBankExchangeRate(BigDecimal value) {
            this.bankExchangeRate = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareComponentType">
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
     *         &lt;element name="TotalAmount" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                 &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
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
        "taxes",
        "totalAmount"
    })
    public static class ExchResidualFareComponent
        extends FareComponentType
    {

        @XmlElement(name = "Taxes")
        protected EMDType.ExchResidualFareComponent.Taxes taxes;
        @XmlElement(name = "TotalAmount")
        protected EMDType.ExchResidualFareComponent.TotalAmount totalAmount;

        /**
         * 获取taxes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link EMDType.ExchResidualFareComponent.Taxes }
         *     
         */
        public EMDType.ExchResidualFareComponent.Taxes getTaxes() {
            return taxes;
        }

        /**
         * 设置taxes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link EMDType.ExchResidualFareComponent.Taxes }
         *     
         */
        public void setTaxes(EMDType.ExchResidualFareComponent.Taxes value) {
            this.taxes = value;
        }

        /**
         * 获取totalAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link EMDType.ExchResidualFareComponent.TotalAmount }
         *     
         */
        public EMDType.ExchResidualFareComponent.TotalAmount getTotalAmount() {
            return totalAmount;
        }

        /**
         * 设置totalAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link EMDType.ExchResidualFareComponent.TotalAmount }
         *     
         */
        public void setTotalAmount(EMDType.ExchResidualFareComponent.TotalAmount value) {
            this.totalAmount = value;
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
        public static class TotalAmount {

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

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ET_FareInfo">
     *       &lt;sequence>
     *         &lt;element name="PenaltyAmount" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" maxOccurs="3" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *       &lt;attribute name="NonEndorsableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonRefundableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PenaltyRestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PresentCreditCardInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AroundTheWorldFareInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonInterlineableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonCommissionableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonReissuableNonExchgInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "penaltyAmount"
    })
    public static class FareInfo
        extends ETFareInfo
    {

        @XmlElement(name = "PenaltyAmount")
        protected List<VoluntaryChangesType> penaltyAmount;
        @XmlAttribute(name = "NonEndorsableInd")
        protected Boolean nonEndorsableInd;
        @XmlAttribute(name = "NonRefundableInd")
        protected Boolean nonRefundableInd;
        @XmlAttribute(name = "PenaltyRestrictionInd")
        protected Boolean penaltyRestrictionInd;
        @XmlAttribute(name = "PresentCreditCardInd")
        protected Boolean presentCreditCardInd;
        @XmlAttribute(name = "AroundTheWorldFareInd")
        protected Boolean aroundTheWorldFareInd;
        @XmlAttribute(name = "NonInterlineableInd")
        protected Boolean nonInterlineableInd;
        @XmlAttribute(name = "NonCommissionableInd")
        protected Boolean nonCommissionableInd;
        @XmlAttribute(name = "NonReissuableNonExchgInd")
        protected Boolean nonReissuableNonExchgInd;
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
         * Gets the value of the penaltyAmount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the penaltyAmount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPenaltyAmount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VoluntaryChangesType }
         * 
         * 
         */
        public List<VoluntaryChangesType> getPenaltyAmount() {
            if (penaltyAmount == null) {
                penaltyAmount = new ArrayList<VoluntaryChangesType>();
            }
            return this.penaltyAmount;
        }

        /**
         * 获取nonEndorsableInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonEndorsableInd() {
            return nonEndorsableInd;
        }

        /**
         * 设置nonEndorsableInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonEndorsableInd(Boolean value) {
            this.nonEndorsableInd = value;
        }

        /**
         * 获取nonRefundableInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonRefundableInd() {
            return nonRefundableInd;
        }

        /**
         * 设置nonRefundableInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonRefundableInd(Boolean value) {
            this.nonRefundableInd = value;
        }

        /**
         * 获取penaltyRestrictionInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPenaltyRestrictionInd() {
            return penaltyRestrictionInd;
        }

        /**
         * 设置penaltyRestrictionInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPenaltyRestrictionInd(Boolean value) {
            this.penaltyRestrictionInd = value;
        }

        /**
         * 获取presentCreditCardInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPresentCreditCardInd() {
            return presentCreditCardInd;
        }

        /**
         * 设置presentCreditCardInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPresentCreditCardInd(Boolean value) {
            this.presentCreditCardInd = value;
        }

        /**
         * 获取aroundTheWorldFareInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAroundTheWorldFareInd() {
            return aroundTheWorldFareInd;
        }

        /**
         * 设置aroundTheWorldFareInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAroundTheWorldFareInd(Boolean value) {
            this.aroundTheWorldFareInd = value;
        }

        /**
         * 获取nonInterlineableInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonInterlineableInd() {
            return nonInterlineableInd;
        }

        /**
         * 设置nonInterlineableInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonInterlineableInd(Boolean value) {
            this.nonInterlineableInd = value;
        }

        /**
         * 获取nonCommissionableInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonCommissionableInd() {
            return nonCommissionableInd;
        }

        /**
         * 设置nonCommissionableInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonCommissionableInd(Boolean value) {
            this.nonCommissionableInd = value;
        }

        /**
         * 获取nonReissuableNonExchgInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonReissuableNonExchgInd() {
            return nonReissuableNonExchgInd;
        }

        /**
         * 设置nonReissuableNonExchgInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonReissuableNonExchgInd(Boolean value) {
            this.nonReissuableNonExchgInd = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OriginDestination {

        @XmlAttribute(name = "OriginCityCode")
        protected String originCityCode;
        @XmlAttribute(name = "OriginCodeContext")
        protected String originCodeContext;
        @XmlAttribute(name = "DestinationCityCode")
        protected String destinationCityCode;
        @XmlAttribute(name = "DestinationCodeContext")
        protected String destinationCodeContext;

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
     *       &lt;attribute name="Information">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="0"/>
     *             &lt;maxLength value="34"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="TicketDocumentNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="IssuingAgentID" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to8" />
     *       &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="LocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OriginalIssueInfo {

        @XmlAttribute(name = "Information")
        protected String information;
        @XmlAttribute(name = "TicketDocumentNbr")
        protected String ticketDocumentNbr;
        @XmlAttribute(name = "IssuingAgentID")
        protected String issuingAgentID;
        @XmlAttribute(name = "DateOfIssue")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfIssue;
        @XmlAttribute(name = "LocationCode")
        protected String locationCode;

        /**
         * 获取information属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInformation() {
            return information;
        }

        /**
         * 设置information属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInformation(String value) {
            this.information = value;
        }

        /**
         * 获取ticketDocumentNbr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDocumentNbr() {
            return ticketDocumentNbr;
        }

        /**
         * 设置ticketDocumentNbr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDocumentNbr(String value) {
            this.ticketDocumentNbr = value;
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
         * 获取dateOfIssue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfIssue() {
            return dateOfIssue;
        }

        /**
         * 设置dateOfIssue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOfIssue(XMLGregorianCalendar value) {
            this.dateOfIssue = value;
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
     *       &lt;attribute name="To" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *       &lt;attribute name="At" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PresentInfo {

        @XmlAttribute(name = "To")
        protected String to;
        @XmlAttribute(name = "At")
        protected String at;

        /**
         * 获取to属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTo() {
            return to;
        }

        /**
         * 设置to属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTo(String value) {
            this.to = value;
        }

        /**
         * 获取at属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAt() {
            return at;
        }

        /**
         * 设置at属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAt(String value) {
            this.at = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonForIssuanceGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReasonForIssuance {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "SubCode")
        protected String subCode;
        @XmlAttribute(name = "Description")
        protected String description;

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
         * 获取subCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubCode() {
            return subCode;
        }

        /**
         * 设置subCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubCode(String value) {
            this.subCode = value;
        }

        /**
         * 获取description属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * 设置description属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
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
     *         &lt;element name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
     *       &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
     *       &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="WaiverCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
     *       &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightSegmentRPH"
    })
    public static class ReissuedFlown {

        @XmlElement(name = "FlightSegmentRPH")
        protected String flightSegmentRPH;
        @XmlAttribute(name = "Number", required = true)
        protected int number;
        @XmlAttribute(name = "CouponItinerarySeqNbr")
        protected Integer couponItinerarySeqNbr;
        @XmlAttribute(name = "FareBasisCode")
        protected String fareBasisCode;
        @XmlAttribute(name = "TicketDocumentNbr", required = true)
        protected String ticketDocumentNbr;
        @XmlAttribute(name = "DateOfIssue")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfIssue;
        @XmlAttribute(name = "WaiverCode")
        protected String waiverCode;
        @XmlAttribute(name = "TicketDesignatorCode")
        protected String ticketDesignatorCode;

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
         * 获取ticketDocumentNbr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDocumentNbr() {
            return ticketDocumentNbr;
        }

        /**
         * 设置ticketDocumentNbr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDocumentNbr(String value) {
            this.ticketDocumentNbr = value;
        }

        /**
         * 获取dateOfIssue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfIssue() {
            return dateOfIssue;
        }

        /**
         * 设置dateOfIssue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOfIssue(XMLGregorianCalendar value) {
            this.dateOfIssue = value;
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
     *         &lt;element name="TicketDocument" maxOccurs="4">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CouponNumber" maxOccurs="4">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TaxCouponInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
     *                                     &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
     *                             &lt;element name="UnticketedPointInfo" maxOccurs="5" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="CityAirportCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                                     &lt;attribute name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                                     &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                                     &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="JourneyTurnaroundCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ticketDocument"
    })
    public static class TaxCouponInformation {

        @XmlElement(name = "TicketDocument", required = true)
        protected List<EMDType.TaxCouponInformation.TicketDocument> ticketDocument;
        @XmlAttribute(name = "BirthDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;
        @XmlAttribute(name = "JourneyTurnaroundCityCode")
        protected String journeyTurnaroundCityCode;

        /**
         * Gets the value of the ticketDocument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketDocument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EMDType.TaxCouponInformation.TicketDocument }
         * 
         * 
         */
        public List<EMDType.TaxCouponInformation.TicketDocument> getTicketDocument() {
            if (ticketDocument == null) {
                ticketDocument = new ArrayList<EMDType.TaxCouponInformation.TicketDocument>();
            }
            return this.ticketDocument;
        }

        /**
         * 获取birthDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * 设置birthDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * 获取journeyTurnaroundCityCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJourneyTurnaroundCityCode() {
            return journeyTurnaroundCityCode;
        }

        /**
         * 设置journeyTurnaroundCityCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJourneyTurnaroundCityCode(String value) {
            this.journeyTurnaroundCityCode = value;
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
         *         &lt;element name="CouponNumber" maxOccurs="4">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TaxCouponInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
         *                           &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
         *                   &lt;element name="UnticketedPointInfo" maxOccurs="5" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="CityAirportCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *                           &lt;attribute name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *                           &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *                           &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "couponNumber"
        })
        public static class TicketDocument {

            @XmlElement(name = "CouponNumber", required = true)
            protected List<EMDType.TaxCouponInformation.TicketDocument.CouponNumber> couponNumber;
            @XmlAttribute(name = "TicketDocumentNbr", required = true)
            protected String ticketDocumentNbr;

            /**
             * Gets the value of the couponNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the couponNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCouponNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EMDType.TaxCouponInformation.TicketDocument.CouponNumber }
             * 
             * 
             */
            public List<EMDType.TaxCouponInformation.TicketDocument.CouponNumber> getCouponNumber() {
                if (couponNumber == null) {
                    couponNumber = new ArrayList<EMDType.TaxCouponInformation.TicketDocument.CouponNumber>();
                }
                return this.couponNumber;
            }

            /**
             * 获取ticketDocumentNbr属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketDocumentNbr() {
                return ticketDocumentNbr;
            }

            /**
             * 设置ticketDocumentNbr属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketDocumentNbr(String value) {
                this.ticketDocumentNbr = value;
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
             *         &lt;element name="TaxCouponInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
             *                 &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
             *         &lt;element name="UnticketedPointInfo" maxOccurs="5" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="CityAirportCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
             *                 &lt;attribute name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
             *                 &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
             *                 &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "taxCouponInfo",
                "tax",
                "unticketedPointInfo"
            })
            public static class CouponNumber {

                @XmlElement(name = "TaxCouponInfo")
                protected EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo taxCouponInfo;
                @XmlElement(name = "Tax")
                protected List<AirTaxType> tax;
                @XmlElement(name = "UnticketedPointInfo")
                protected List<EMDType.TaxCouponInformation.TicketDocument.CouponNumber.UnticketedPointInfo> unticketedPointInfo;
                @XmlAttribute(name = "Number", required = true)
                protected int number;

                /**
                 * 获取taxCouponInfo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo }
                 *     
                 */
                public EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo getTaxCouponInfo() {
                    return taxCouponInfo;
                }

                /**
                 * 设置taxCouponInfo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo }
                 *     
                 */
                public void setTaxCouponInfo(EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo value) {
                    this.taxCouponInfo = value;
                }

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

                /**
                 * Gets the value of the unticketedPointInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the unticketedPointInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUnticketedPointInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EMDType.TaxCouponInformation.TicketDocument.CouponNumber.UnticketedPointInfo }
                 * 
                 * 
                 */
                public List<EMDType.TaxCouponInformation.TicketDocument.CouponNumber.UnticketedPointInfo> getUnticketedPointInfo() {
                    if (unticketedPointInfo == null) {
                        unticketedPointInfo = new ArrayList<EMDType.TaxCouponInformation.TicketDocument.CouponNumber.UnticketedPointInfo>();
                    }
                    return this.unticketedPointInfo;
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
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
                 *       &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class TaxCouponInfo {

                    @XmlAttribute(name = "Cabin")
                    protected CabinType cabin;
                    @XmlAttribute(name = "AirEquipType")
                    protected String airEquipType;

                    /**
                     * 获取cabin属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link CabinType }
                     *     
                     */
                    public CabinType getCabin() {
                        return cabin;
                    }

                    /**
                     * 设置cabin属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CabinType }
                     *     
                     */
                    public void setCabin(CabinType value) {
                        this.cabin = value;
                    }

                    /**
                     * 获取airEquipType属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAirEquipType() {
                        return airEquipType;
                    }

                    /**
                     * 设置airEquipType属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAirEquipType(String value) {
                        this.airEquipType = value;
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
                 *       &lt;attribute name="CityAirportCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
                 *       &lt;attribute name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
                 *       &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
                 *       &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class UnticketedPointInfo {

                    @XmlAttribute(name = "CityAirportCode")
                    protected String cityAirportCode;
                    @XmlAttribute(name = "ArrivalDate")
                    protected String arrivalDate;
                    @XmlAttribute(name = "DepartureDate")
                    protected String departureDate;
                    @XmlAttribute(name = "AirEquipType")
                    protected String airEquipType;

                    /**
                     * 获取cityAirportCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCityAirportCode() {
                        return cityAirportCode;
                    }

                    /**
                     * 设置cityAirportCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCityAirportCode(String value) {
                        this.cityAirportCode = value;
                    }

                    /**
                     * 获取arrivalDate属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getArrivalDate() {
                        return arrivalDate;
                    }

                    /**
                     * 设置arrivalDate属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setArrivalDate(String value) {
                        this.arrivalDate = value;
                    }

                    /**
                     * 获取departureDate属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDepartureDate() {
                        return departureDate;
                    }

                    /**
                     * 设置departureDate属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDepartureDate(String value) {
                        this.departureDate = value;
                    }

                    /**
                     * 获取airEquipType属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAirEquipType() {
                        return airEquipType;
                    }

                    /**
                     * 设置airEquipType属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAirEquipType(String value) {
                        this.airEquipType = value;
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
     *       &lt;sequence>
     *         &lt;element name="Tax" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirTaxType">
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
        "tax"
    })
    public static class Taxes {

        @XmlElement(name = "Tax", required = true)
        protected List<EMDType.Taxes.Tax> tax;

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
         * {@link EMDType.Taxes.Tax }
         * 
         * 
         */
        public List<EMDType.Taxes.Tax> getTax() {
            if (tax == null) {
                tax = new ArrayList<EMDType.Taxes.Tax>();
            }
            return this.tax;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirTaxType">
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Tax
            extends AirTaxType
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
     *         &lt;element name="CouponInfo" maxOccurs="4">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SoldFlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element name="CheckedInAirlineRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
     *                     &lt;element name="FlownAirlineSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
     *                   &lt;/choice>
     *                   &lt;element name="ExcessBaggage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PresentInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="To" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *                           &lt;attribute name="At" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ReasonForIssuance" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonForIssuanceGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ValidatingAirline" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FiledFeeInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                           &lt;attribute name="BSR_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *                 &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
     *                 &lt;attribute name="InConnectionNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
     *                 &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                 &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
     *                 &lt;attribute name="Duration" type="{http://www.opentravel.org/OTA/2003/05}DurationType" />
     *                 &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
     *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
     *                 &lt;attribute name="InvoluntaryIndCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="I"/>
     *                       &lt;enumeration value="L"/>
     *                       &lt;enumeration value="S"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="SettlementAuthCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
     *                 &lt;attribute name="Value" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="AssociateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="PromotionalCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
     *                 &lt;attribute name="Remark" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *                 &lt;attribute name="TaxOnEMD_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="AssocFareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="ConsumedAtIssuanceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="DateOfService" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *       &lt;attribute name="TicketDocumentNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Ticket"/>
     *             &lt;enumeration value="EMD"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PrimaryDocInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="InConnectionDocNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExchangeTktNbrInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    public static class TicketDocument {

        @XmlElement(name = "CouponInfo", required = true)
        protected List<EMDType.TicketDocument.CouponInfo> couponInfo;
        @XmlAttribute(name = "TicketDocumentNbr")
        protected String ticketDocumentNbr;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "PrimaryDocInd")
        protected Boolean primaryDocInd;
        @XmlAttribute(name = "InConnectionDocNbr")
        protected String inConnectionDocNbr;
        @XmlAttribute(name = "DateOfIssue")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfIssue;
        @XmlAttribute(name = "ExchangeTktNbrInd")
        protected Boolean exchangeTktNbrInd;
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
         * {@link EMDType.TicketDocument.CouponInfo }
         * 
         * 
         */
        public List<EMDType.TicketDocument.CouponInfo> getCouponInfo() {
            if (couponInfo == null) {
                couponInfo = new ArrayList<EMDType.TicketDocument.CouponInfo>();
            }
            return this.couponInfo;
        }

        /**
         * 获取ticketDocumentNbr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDocumentNbr() {
            return ticketDocumentNbr;
        }

        /**
         * 设置ticketDocumentNbr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDocumentNbr(String value) {
            this.ticketDocumentNbr = value;
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
         * 获取primaryDocInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryDocInd() {
            return primaryDocInd;
        }

        /**
         * 设置primaryDocInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryDocInd(Boolean value) {
            this.primaryDocInd = value;
        }

        /**
         * 获取inConnectionDocNbr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInConnectionDocNbr() {
            return inConnectionDocNbr;
        }

        /**
         * 设置inConnectionDocNbr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInConnectionDocNbr(String value) {
            this.inConnectionDocNbr = value;
        }

        /**
         * 获取dateOfIssue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfIssue() {
            return dateOfIssue;
        }

        /**
         * 设置dateOfIssue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOfIssue(XMLGregorianCalendar value) {
            this.dateOfIssue = value;
        }

        /**
         * 获取exchangeTktNbrInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExchangeTktNbrInd() {
            return exchangeTktNbrInd;
        }

        /**
         * 设置exchangeTktNbrInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExchangeTktNbrInd(Boolean value) {
            this.exchangeTktNbrInd = value;
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
         *         &lt;element name="SoldFlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
         *         &lt;choice>
         *           &lt;element name="CheckedInAirlineRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
         *           &lt;element name="FlownAirlineSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
         *         &lt;/choice>
         *         &lt;element name="ExcessBaggage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PresentInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="To" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *                 &lt;attribute name="At" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ReasonForIssuance" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonForIssuanceGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ValidatingAirline" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FiledFeeInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                 &lt;attribute name="BSR_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
         *       &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
         *       &lt;attribute name="InConnectionNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
         *       &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *       &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
         *       &lt;attribute name="Duration" type="{http://www.opentravel.org/OTA/2003/05}DurationType" />
         *       &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
         *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
         *       &lt;attribute name="InvoluntaryIndCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="I"/>
         *             &lt;enumeration value="L"/>
         *             &lt;enumeration value="S"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="SettlementAuthCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
         *       &lt;attribute name="Value" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="AssociateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="PromotionalCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
         *       &lt;attribute name="Remark" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *       &lt;attribute name="TaxOnEMD_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="AssocFareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="ConsumedAtIssuanceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="DateOfService" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "soldFlightSegmentRPH",
            "checkedInAirlineRPH",
            "flownAirlineSegmentRPH",
            "excessBaggage",
            "presentInfo",
            "reasonForIssuance",
            "validatingAirline",
            "filedFeeInfo"
        })
        public static class CouponInfo {

            @XmlElement(name = "SoldFlightSegmentRPH")
            protected String soldFlightSegmentRPH;
            @XmlElement(name = "CheckedInAirlineRPH")
            protected String checkedInAirlineRPH;
            @XmlElement(name = "FlownAirlineSegmentRPH")
            protected String flownAirlineSegmentRPH;
            @XmlElement(name = "ExcessBaggage")
            protected EMDType.TicketDocument.CouponInfo.ExcessBaggage excessBaggage;
            @XmlElement(name = "PresentInfo")
            protected EMDType.TicketDocument.CouponInfo.PresentInfo presentInfo;
            @XmlElement(name = "ReasonForIssuance")
            protected EMDType.TicketDocument.CouponInfo.ReasonForIssuance reasonForIssuance;
            @XmlElement(name = "ValidatingAirline")
            protected EMDType.TicketDocument.CouponInfo.ValidatingAirline validatingAirline;
            @XmlElement(name = "FiledFeeInfo")
            protected EMDType.TicketDocument.CouponInfo.FiledFeeInfo filedFeeInfo;
            @XmlAttribute(name = "Number")
            protected Integer number;
            @XmlAttribute(name = "InConnectionNbr")
            protected Integer inConnectionNbr;
            @XmlAttribute(name = "CouponReference")
            protected String couponReference;
            @XmlAttribute(name = "FareBasisCode")
            protected String fareBasisCode;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "Status")
            protected String status;
            @XmlAttribute(name = "CouponItinerarySeqNbr")
            protected Integer couponItinerarySeqNbr;
            @XmlAttribute(name = "InvoluntaryIndCode")
            protected String involuntaryIndCode;
            @XmlAttribute(name = "SettlementAuthCode")
            protected String settlementAuthCode;
            @XmlAttribute(name = "Value")
            protected BigDecimal value;
            @XmlAttribute(name = "AssociateInd")
            protected Boolean associateInd;
            @XmlAttribute(name = "PromotionalCode")
            protected String promotionalCode;
            @XmlAttribute(name = "Remark")
            protected String remark;
            @XmlAttribute(name = "TaxOnEMD_Ind")
            protected Boolean taxOnEMDInd;
            @XmlAttribute(name = "AssocFareBasisCode")
            protected String assocFareBasisCode;
            @XmlAttribute(name = "ConsumedAtIssuanceInd")
            protected Boolean consumedAtIssuanceInd;
            @XmlAttribute(name = "DateOfService")
            protected String dateOfService;
            @XmlAttribute(name = "UnitOfMeasureQuantity")
            protected BigDecimal unitOfMeasureQuantity;
            @XmlAttribute(name = "UnitOfMeasure")
            protected String unitOfMeasure;
            @XmlAttribute(name = "UnitOfMeasureCode")
            protected String unitOfMeasureCode;

            /**
             * 获取soldFlightSegmentRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSoldFlightSegmentRPH() {
                return soldFlightSegmentRPH;
            }

            /**
             * 设置soldFlightSegmentRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSoldFlightSegmentRPH(String value) {
                this.soldFlightSegmentRPH = value;
            }

            /**
             * 获取checkedInAirlineRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckedInAirlineRPH() {
                return checkedInAirlineRPH;
            }

            /**
             * 设置checkedInAirlineRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckedInAirlineRPH(String value) {
                this.checkedInAirlineRPH = value;
            }

            /**
             * 获取flownAirlineSegmentRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlownAirlineSegmentRPH() {
                return flownAirlineSegmentRPH;
            }

            /**
             * 设置flownAirlineSegmentRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlownAirlineSegmentRPH(String value) {
                this.flownAirlineSegmentRPH = value;
            }

            /**
             * 获取excessBaggage属性的值。
             * 
             * @return
             *     possible object is
             *     {@link EMDType.TicketDocument.CouponInfo.ExcessBaggage }
             *     
             */
            public EMDType.TicketDocument.CouponInfo.ExcessBaggage getExcessBaggage() {
                return excessBaggage;
            }

            /**
             * 设置excessBaggage属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link EMDType.TicketDocument.CouponInfo.ExcessBaggage }
             *     
             */
            public void setExcessBaggage(EMDType.TicketDocument.CouponInfo.ExcessBaggage value) {
                this.excessBaggage = value;
            }

            /**
             * 获取presentInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link EMDType.TicketDocument.CouponInfo.PresentInfo }
             *     
             */
            public EMDType.TicketDocument.CouponInfo.PresentInfo getPresentInfo() {
                return presentInfo;
            }

            /**
             * 设置presentInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link EMDType.TicketDocument.CouponInfo.PresentInfo }
             *     
             */
            public void setPresentInfo(EMDType.TicketDocument.CouponInfo.PresentInfo value) {
                this.presentInfo = value;
            }

            /**
             * 获取reasonForIssuance属性的值。
             * 
             * @return
             *     possible object is
             *     {@link EMDType.TicketDocument.CouponInfo.ReasonForIssuance }
             *     
             */
            public EMDType.TicketDocument.CouponInfo.ReasonForIssuance getReasonForIssuance() {
                return reasonForIssuance;
            }

            /**
             * 设置reasonForIssuance属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link EMDType.TicketDocument.CouponInfo.ReasonForIssuance }
             *     
             */
            public void setReasonForIssuance(EMDType.TicketDocument.CouponInfo.ReasonForIssuance value) {
                this.reasonForIssuance = value;
            }

            /**
             * 获取validatingAirline属性的值。
             * 
             * @return
             *     possible object is
             *     {@link EMDType.TicketDocument.CouponInfo.ValidatingAirline }
             *     
             */
            public EMDType.TicketDocument.CouponInfo.ValidatingAirline getValidatingAirline() {
                return validatingAirline;
            }

            /**
             * 设置validatingAirline属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link EMDType.TicketDocument.CouponInfo.ValidatingAirline }
             *     
             */
            public void setValidatingAirline(EMDType.TicketDocument.CouponInfo.ValidatingAirline value) {
                this.validatingAirline = value;
            }

            /**
             * 获取filedFeeInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link EMDType.TicketDocument.CouponInfo.FiledFeeInfo }
             *     
             */
            public EMDType.TicketDocument.CouponInfo.FiledFeeInfo getFiledFeeInfo() {
                return filedFeeInfo;
            }

            /**
             * 设置filedFeeInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link EMDType.TicketDocument.CouponInfo.FiledFeeInfo }
             *     
             */
            public void setFiledFeeInfo(EMDType.TicketDocument.CouponInfo.FiledFeeInfo value) {
                this.filedFeeInfo = value;
            }

            /**
             * 获取number属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumber() {
                return number;
            }

            /**
             * 设置number属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumber(Integer value) {
                this.number = value;
            }

            /**
             * 获取inConnectionNbr属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getInConnectionNbr() {
                return inConnectionNbr;
            }

            /**
             * 设置inConnectionNbr属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setInConnectionNbr(Integer value) {
                this.inConnectionNbr = value;
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
             *     {@link String }
             *     
             */
            public String getDuration() {
                return duration;
            }

            /**
             * 设置duration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuration(String value) {
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
             * 获取involuntaryIndCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvoluntaryIndCode() {
                return involuntaryIndCode;
            }

            /**
             * 设置involuntaryIndCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvoluntaryIndCode(String value) {
                this.involuntaryIndCode = value;
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
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * 获取associateInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAssociateInd() {
                return associateInd;
            }

            /**
             * 设置associateInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAssociateInd(Boolean value) {
                this.associateInd = value;
            }

            /**
             * 获取promotionalCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPromotionalCode() {
                return promotionalCode;
            }

            /**
             * 设置promotionalCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPromotionalCode(String value) {
                this.promotionalCode = value;
            }

            /**
             * 获取remark属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemark() {
                return remark;
            }

            /**
             * 设置remark属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemark(String value) {
                this.remark = value;
            }

            /**
             * 获取taxOnEMDInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isTaxOnEMDInd() {
                return taxOnEMDInd;
            }

            /**
             * 设置taxOnEMDInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTaxOnEMDInd(Boolean value) {
                this.taxOnEMDInd = value;
            }

            /**
             * 获取assocFareBasisCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssocFareBasisCode() {
                return assocFareBasisCode;
            }

            /**
             * 设置assocFareBasisCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssocFareBasisCode(String value) {
                this.assocFareBasisCode = value;
            }

            /**
             * 获取consumedAtIssuanceInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isConsumedAtIssuanceInd() {
                return consumedAtIssuanceInd;
            }

            /**
             * 设置consumedAtIssuanceInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setConsumedAtIssuanceInd(Boolean value) {
                this.consumedAtIssuanceInd = value;
            }

            /**
             * 获取dateOfService属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateOfService() {
                return dateOfService;
            }

            /**
             * 设置dateOfService属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfService(String value) {
                this.dateOfService = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
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
            public static class ExcessBaggage {

                @XmlAttribute(name = "UnitOfMeasureQuantity")
                protected BigDecimal unitOfMeasureQuantity;
                @XmlAttribute(name = "UnitOfMeasure")
                protected String unitOfMeasure;
                @XmlAttribute(name = "UnitOfMeasureCode")
                protected String unitOfMeasureCode;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *       &lt;attribute name="BSR_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FiledFeeInfo {

                @XmlAttribute(name = "BSR_Rate")
                protected BigDecimal bsrRate;
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
                 * 获取bsrRate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getBSRRate() {
                    return bsrRate;
                }

                /**
                 * 设置bsrRate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setBSRRate(BigDecimal value) {
                    this.bsrRate = value;
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
             *       &lt;attribute name="To" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
             *       &lt;attribute name="At" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PresentInfo {

                @XmlAttribute(name = "To")
                protected String to;
                @XmlAttribute(name = "At")
                protected String at;

                /**
                 * 获取to属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTo() {
                    return to;
                }

                /**
                 * 设置to属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTo(String value) {
                    this.to = value;
                }

                /**
                 * 获取at属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAt() {
                    return at;
                }

                /**
                 * 设置at属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAt(String value) {
                    this.at = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonForIssuanceGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ReasonForIssuance {

                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "SubCode")
                protected String subCode;
                @XmlAttribute(name = "Description")
                protected String description;

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
                 * 获取subCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubCode() {
                    return subCode;
                }

                /**
                 * 设置subCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubCode(String value) {
                    this.subCode = value;
                }

                /**
                 * 获取description属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * 设置description属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ValidatingAirline {

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
     *       &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *       &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05}FareAmountType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalFare {

        @XmlAttribute(name = "Purpose")
        protected PurposeType purpose;
        @XmlAttribute(name = "FareAmountType")
        protected FareAmountType fareAmountType;
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
         * 获取fareAmountType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FareAmountType }
         *     
         */
        public FareAmountType getFareAmountType() {
            return fareAmountType;
        }

        /**
         * 设置fareAmountType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FareAmountType }
         *     
         */
        public void setFareAmountType(FareAmountType value) {
            this.fareAmountType = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerRefNumberGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelerRefNumber {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "SurnameRefNumber")
        protected String surnameRefNumber;

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
         * 获取surnameRefNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurnameRefNumber() {
            return surnameRefNumber;
        }

        /**
         * 设置surnameRefNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurnameRefNumber(String value) {
            this.surnameRefNumber = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="FareCalcMode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
     *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *       &lt;attribute name="ReportingCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
     *       &lt;attribute name="Info" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class UnstructuredFareCalc {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "FareCalcMode")
        protected String fareCalcMode;
        @XmlAttribute(name = "Operation")
        protected ActionType operation;
        @XmlAttribute(name = "Type")
        protected PurposeType type;
        @XmlAttribute(name = "ReportingCode")
        protected String reportingCode;
        @XmlAttribute(name = "Info", required = true)
        protected String info;

        /**
         * 获取value属性的值。
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
         * 获取fareCalcMode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareCalcMode() {
            return fareCalcMode;
        }

        /**
         * 设置fareCalcMode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareCalcMode(String value) {
            this.fareCalcMode = value;
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
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PurposeType }
         *     
         */
        public PurposeType getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PurposeType }
         *     
         */
        public void setType(PurposeType value) {
            this.type = value;
        }

        /**
         * 获取reportingCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReportingCode() {
            return reportingCode;
        }

        /**
         * 设置reportingCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReportingCode(String value) {
            this.reportingCode = value;
        }

        /**
         * 获取info属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * 设置info属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ValidatingAirline {

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

}
