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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ProductBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProductBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Air" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirReservationType">
 *                 &lt;sequence>
 *                   &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="SupplierPenalties" type="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="Insurance" type="{http://www.opentravel.org/OTA/2003/05}InsuranceProductLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vehicle" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleReservationType">
 *                 &lt;sequence>
 *                   &lt;element name="VehResRQInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationRQAdditionalInfoType" minOccurs="0"/>
 *                   &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/>
 *                   &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="SupplierPenalties" type="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="BookingReferenceID" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CompanyName" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="VoucherURL" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="IDContext" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DriverType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerCountGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="VehAvailCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Hotel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
 *                 &lt;sequence>
 *                   &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/>
 *                   &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="SupplierPenalties">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType">
 *                           &lt;sequence>
 *                             &lt;element name="CancelPenalty" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltyType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ferry" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FerryProductType">
 *                 &lt;sequence>
 *                   &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/>
 *                   &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="SupplierPenalties" type="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DestActivityReservationType">
 *                 &lt;sequence>
 *                   &lt;element name="Air" type="{http://www.opentravel.org/OTA/2003/05}AirReservationType" minOccurs="0"/>
 *                   &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/>
 *                   &lt;element name="ReservationItemReferences" type="{http://www.opentravel.org/OTA/2003/05}ReservationItemReferencesType" minOccurs="0"/>
 *                   &lt;element name="BookingReferenceID" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CompanyName" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TPA_Extensions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DestActivityDescriptiveContent" type="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType"/>
 *                             &lt;element name="SupplierSpecificInfos" type="{http://www.opentravel.org/OTA/2003/05}SupplierSpecificInfosType" minOccurs="0"/>
 *                             &lt;element name="Insurance" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}InsCoverageType">
 *                                     &lt;sequence>
 *                                       &lt;element name="InsuranceCustomer" type="{http://www.opentravel.org/OTA/2003/05}InsuranceCustomerType" minOccurs="0"/>
 *                                       &lt;element name="PlanCost" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PlanCostType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ExchangeRate" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}SPNR_PriceAdjustmentsType" minOccurs="0"/>
 *                                                 &lt;element name="IncrementalPrices" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="IncrementalPrice" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                                                   &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                                                   &lt;attribute name="FrequencyType" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                                       &lt;element name="PolicyDetail" type="{http://www.opentravel.org/OTA/2003/05}PolicyDetail_Type" minOccurs="0"/>
 *                                       &lt;element name="QuoteDetail" type="{http://www.opentravel.org/OTA/2003/05}QuoteDetail_Type" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="SupplierPenalties" type="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="ReservationReferences" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ReservationReference" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Insurance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}InsCoverageType">
 *                 &lt;sequence>
 *                   &lt;element name="InsuranceCustomer" type="{http://www.opentravel.org/OTA/2003/05}InsuranceCustomerType"/>
 *                   &lt;element name="PlanCost" type="{http://www.opentravel.org/OTA/2003/05}PlanCostType" minOccurs="0"/>
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/>
 *                   &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="SupplierPenalties" type="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="PolicyDetail" type="{http://www.opentravel.org/OTA/2003/05}PolicyDetail_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Baggage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Air" type="{http://www.opentravel.org/OTA/2003/05}AirReservationType" minOccurs="0"/>
 *                   &lt;element name="OriginDestination">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Service">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}DescriptionDetails" minOccurs="0"/>
 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServicePrice" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceDate" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrier" minOccurs="0"/>
 *                                       &lt;element name="MSCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BookingInstructions" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SSRCode" type="{http://www.opentravel.org/OTA/2003/05}SSRCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="UpgradeMethod" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Baggage" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="MaxWeight" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                                         &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="MinWeight" type="{http://www.opentravel.org/OTA/2003/05}BaggageWeightType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="MaxDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="MinDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                                 &lt;element name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="SpecialItem">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;enumeration value="N"/>
 *                                                     &lt;enumeration value="Y"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Attributes" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Diagnostics" minOccurs="0"/>
 *                                       &lt;element name="S5" type="{http://www.opentravel.org/OTA/2003/05}S5Type" minOccurs="0"/>
 *                                       &lt;element name="S7" type="{http://www.opentravel.org/OTA/2003/05}S7Type" minOccurs="0"/>
 *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                       &lt;element name="TotalAmount" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
 *                                       &lt;element name="ExchangeRate" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}InfoType" minOccurs="0"/>
 *                                       &lt;element name="FlightSegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="SegmentIDRef" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="TravelerIDRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SrvcItemAttributesGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DepartureArrivalCode"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TravelerInfo" type="{http://www.opentravel.org/OTA/2003/05}TravelerInfoType"/>
 *                   &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="EMD_Info" type="{http://www.opentravel.org/OTA/2003/05}EMD_Type" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="BookingOrderIndicator" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="BundleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Refundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Cancelable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="isSegBind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AncillaryProduct" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Air" type="{http://www.opentravel.org/OTA/2003/05}AirReservationType" minOccurs="0"/>
 *                   &lt;element name="Content" type="{http://www.opentravel.org/OTA/2003/05}ProductContentType"/>
 *                   &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/>
 *                   &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="TravelerInfo" type="{http://www.opentravel.org/OTA/2003/05}TravelerInfoType"/>
 *                   &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="EMD_Info" type="{http://www.opentravel.org/OTA/2003/05}EMD_Type" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Attributes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Attribute" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" minOccurs="0"/>
 *                   &lt;element name="AncillaryProducts" type="{http://www.opentravel.org/OTA/2003/05}AirAncillariesBundledProductsSummaryType" minOccurs="0"/>
 *                   &lt;element name="FlightSegment" type="{http://www.opentravel.org/OTA/2003/05}FlightSegmentWithPrice" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Prices" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductPricesType"/>
 *                   &lt;element name="Voucher" type="{http://www.opentravel.org/OTA/2003/05}SPNRVoucherType" minOccurs="0"/>
 *                   &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}SPNR_WarningsType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="GroundTransportService" type="{http://www.opentravel.org/OTA/2003/05}GroundTransportServiceType" minOccurs="0"/>
 *                   &lt;element name="Lounge" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryLoungeProductType" minOccurs="0"/>
 *                   &lt;element name="SupplierDescriptiveContent" type="{http://www.opentravel.org/OTA/2003/05}SupplierDescriptiveContentType" minOccurs="0"/>
 *                   &lt;element name="SupplierBookingReferenceID" type="{http://www.opentravel.org/OTA/2003/05}SupplierBookingReferenceIDType" minOccurs="0"/>
 *                   &lt;element name="QRData" type="{http://www.opentravel.org/OTA/2003/05}QRDataType" minOccurs="0"/>
 *                   &lt;element name="CarbonOffsets" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryOffsetProductType" minOccurs="0"/>
 *                   &lt;element name="OriginalFlightSegment" type="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TSAncillaryProductGroup"/>
 *                 &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
 *                 &lt;attribute name="PoolID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AssociatedProductNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PassengerIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Category" use="required" type="{http://www.opentravel.org/OTA/2003/05}AncillaryProductCategoryType" />
 *                 &lt;attribute name="Airport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}AirportAncillaryDirection" />
 *                 &lt;attribute name="Origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Destination" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BookingREF" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ProductSequence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SellingProposition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BundleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SupplierProductCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VoucherRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Coupons" type="{http://www.opentravel.org/OTA/2003/05}CouponsType" minOccurs="0"/>
 *         &lt;element name="Membership" type="{http://www.opentravel.org/OTA/2003/05}MembershipReservationType" minOccurs="0"/>
 *         &lt;element name="ItineraryReceipt" type="{http://www.opentravel.org/OTA/2003/05}ItineraryReceiptProductType" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrimaryLangID_Group"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ActionAttributes"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProductIDs"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HistoryAttribute"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CommonProductAttributes"/>
 *       &lt;attribute name="PolicyStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookedWith" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *       &lt;attribute name="ReplacedBy" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *       &lt;attribute name="RecoveredFrom" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *       &lt;attribute name="ProductType" use="required" type="{http://www.opentravel.org/OTA/2003/05}ProductTypeType" />
 *       &lt;attribute name="ProductSubType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrochureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SaleModel" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PayOnArrival" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Synchronised" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ChangeAllowed" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ManualSegment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProductTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SearchID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *       &lt;attribute name="CheapestAlternative" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="PostTravel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Refundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SplitFrom" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductBase", propOrder = {
    "air",
    "vehicle",
    "hotel",
    "ferry",
    "activity",
    "insurance",
    "baggage",
    "ancillaryProduct",
    "coupons",
    "membership",
    "itineraryReceipt"
})
@XmlSeeAlso({
    ModularProductType.class
})
public class ProductBase {

    @XmlElement(name = "Air")
    protected ProductBase.Air air;
    @XmlElement(name = "Vehicle")
    protected ProductBase.Vehicle vehicle;
    @XmlElement(name = "Hotel")
    protected ProductBase.Hotel hotel;
    @XmlElement(name = "Ferry")
    protected ProductBase.Ferry ferry;
    @XmlElement(name = "Activity")
    protected ProductBase.Activity activity;
    @XmlElement(name = "Insurance")
    protected ProductBase.Insurance insurance;
    @XmlElement(name = "Baggage")
    protected ProductBase.ProductBaseBaggage baggage;
    @XmlElement(name = "AncillaryProduct")
    protected ProductBase.AncillaryProduct ancillaryProduct;
    @XmlElement(name = "Coupons")
    protected CouponsType coupons;
    @XmlElement(name = "Membership")
    protected MembershipReservationType membership;
    @XmlElement(name = "ItineraryReceipt")
    protected ItineraryReceiptProductType itineraryReceipt;
    @XmlAttribute(name = "PolicyStatus")
    protected String policyStatus;
    @XmlAttribute(name = "BookedWith")
    protected List<String> bookedWith;
    @XmlAttribute(name = "ReplacedBy")
    protected List<String> replacedBy;
    @XmlAttribute(name = "RecoveredFrom")
    protected List<String> recoveredFrom;
    @XmlAttribute(name = "ProductType", required = true)
    protected String productType;
    @XmlAttribute(name = "ProductSubType")
    protected String productSubType;
    @XmlAttribute(name = "BrochureCode")
    protected String brochureCode;
    @XmlAttribute(name = "SaleModel")
    @XmlSchemaType(name = "anySimpleType")
    protected String saleModel;
    @XmlAttribute(name = "PayOnArrival")
    protected Boolean payOnArrival;
    @XmlAttribute(name = "Synchronised")
    protected Boolean synchronised;
    @XmlAttribute(name = "ChangeAllowed")
    @XmlSchemaType(name = "anySimpleType")
    protected String changeAllowed;
    @XmlAttribute(name = "BookingChannel")
    protected String bookingChannel;
    @XmlAttribute(name = "EchoToken")
    @XmlSchemaType(name = "anySimpleType")
    protected String echoToken;
    @XmlAttribute(name = "ManualSegment")
    protected Boolean manualSegment;
    @XmlAttribute(name = "ProductTypeCode")
    protected String productTypeCode;
    @XmlAttribute(name = "ServiceCode")
    protected String serviceCode;
    @XmlAttribute(name = "SearchID")
    protected String searchID;
    @XmlAttribute(name = "CheapestAlternative")
    protected Float cheapestAlternative;
    @XmlAttribute(name = "PostTravel")
    protected Boolean postTravel;
    @XmlAttribute(name = "Refundable")
    protected Boolean refundable;
    @XmlAttribute(name = "SplitFrom")
    protected BigInteger splitFrom;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;
    @XmlAttribute(name = "Action")
    protected ActionCodeType action;
    @XmlAttribute(name = "ProductNumber")
    protected BigInteger productNumber;
    @XmlAttribute(name = "MasterProductNumber")
    protected BigInteger masterProductNumber;
    @XmlAttribute(name = "HistoryID")
    protected BigInteger historyID;
    @XmlAttribute(name = "Historic")
    protected Boolean historic;
    @XmlAttribute(name = "LiveID")
    protected Integer liveID;
    @XmlAttribute(name = "BookingStatus", required = true)
    protected String bookingStatus;
    @XmlAttribute(name = "CancellationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;
    @XmlAttribute(name = "BookingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookingDate;
    @XmlAttribute(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "PromotionType")
    protected String promotionType;
    @XmlAttribute(name = "LastModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlAttribute(name = "Destination")
    protected String destination;

    /**
     * 获取air属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductBase.Air }
     *     
     */
    public ProductBase.Air getAir() {
        return air;
    }

    /**
     * 设置air属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBase.Air }
     *     
     */
    public void setAir(ProductBase.Air value) {
        this.air = value;
    }

    /**
     * 获取vehicle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductBase.Vehicle }
     *     
     */
    public ProductBase.Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * 设置vehicle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBase.Vehicle }
     *     
     */
    public void setVehicle(ProductBase.Vehicle value) {
        this.vehicle = value;
    }

    /**
     * 获取hotel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductBase.Hotel }
     *     
     */
    public ProductBase.Hotel getHotel() {
        return hotel;
    }

    /**
     * 设置hotel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBase.Hotel }
     *     
     */
    public void setHotel(ProductBase.Hotel value) {
        this.hotel = value;
    }

    /**
     * 获取ferry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductBase.Ferry }
     *     
     */
    public ProductBase.Ferry getFerry() {
        return ferry;
    }

    /**
     * 设置ferry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBase.Ferry }
     *     
     */
    public void setFerry(ProductBase.Ferry value) {
        this.ferry = value;
    }

    /**
     * 获取activity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductBase.Activity }
     *     
     */
    public ProductBase.Activity getActivity() {
        return activity;
    }

    /**
     * 设置activity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBase.Activity }
     *     
     */
    public void setActivity(ProductBase.Activity value) {
        this.activity = value;
    }

    /**
     * 获取insurance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductBase.Insurance }
     *     
     */
    public ProductBase.Insurance getInsurance() {
        return insurance;
    }

    /**
     * 设置insurance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBase.Insurance }
     *     
     */
    public void setInsurance(ProductBase.Insurance value) {
        this.insurance = value;
    }

    /**
     * 获取baggage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductBase.ProductBaseBaggage }
     *     
     */
    public ProductBase.ProductBaseBaggage getBaggage() {
        return baggage;
    }

    /**
     * 设置baggage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBase.ProductBaseBaggage }
     *     
     */
    public void setBaggage(ProductBase.ProductBaseBaggage value) {
        this.baggage = value;
    }

    /**
     * 获取ancillaryProduct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductBase.AncillaryProduct }
     *     
     */
    public ProductBase.AncillaryProduct getAncillaryProduct() {
        return ancillaryProduct;
    }

    /**
     * 设置ancillaryProduct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBase.AncillaryProduct }
     *     
     */
    public void setAncillaryProduct(ProductBase.AncillaryProduct value) {
        this.ancillaryProduct = value;
    }

    /**
     * 获取coupons属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponsType }
     *     
     */
    public CouponsType getCoupons() {
        return coupons;
    }

    /**
     * 设置coupons属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponsType }
     *     
     */
    public void setCoupons(CouponsType value) {
        this.coupons = value;
    }

    /**
     * 获取membership属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MembershipReservationType }
     *     
     */
    public MembershipReservationType getMembership() {
        return membership;
    }

    /**
     * 设置membership属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipReservationType }
     *     
     */
    public void setMembership(MembershipReservationType value) {
        this.membership = value;
    }

    /**
     * 获取itineraryReceipt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItineraryReceiptProductType }
     *     
     */
    public ItineraryReceiptProductType getItineraryReceipt() {
        return itineraryReceipt;
    }

    /**
     * 设置itineraryReceipt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryReceiptProductType }
     *     
     */
    public void setItineraryReceipt(ItineraryReceiptProductType value) {
        this.itineraryReceipt = value;
    }

    /**
     * 获取policyStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyStatus() {
        return policyStatus;
    }

    /**
     * 设置policyStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyStatus(String value) {
        this.policyStatus = value;
    }

    /**
     * Gets the value of the bookedWith property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookedWith property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookedWith().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBookedWith() {
        if (bookedWith == null) {
            bookedWith = new ArrayList<String>();
        }
        return this.bookedWith;
    }

    /**
     * Gets the value of the replacedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReplacedBy() {
        if (replacedBy == null) {
            replacedBy = new ArrayList<String>();
        }
        return this.replacedBy;
    }

    /**
     * Gets the value of the recoveredFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoveredFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecoveredFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecoveredFrom() {
        if (recoveredFrom == null) {
            recoveredFrom = new ArrayList<String>();
        }
        return this.recoveredFrom;
    }

    /**
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * 获取productSubType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSubType() {
        return productSubType;
    }

    /**
     * 设置productSubType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSubType(String value) {
        this.productSubType = value;
    }

    /**
     * 获取brochureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrochureCode() {
        return brochureCode;
    }

    /**
     * 设置brochureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrochureCode(String value) {
        this.brochureCode = value;
    }

    /**
     * 获取saleModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleModel() {
        return saleModel;
    }

    /**
     * 设置saleModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleModel(String value) {
        this.saleModel = value;
    }

    /**
     * 获取payOnArrival属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayOnArrival() {
        return payOnArrival;
    }

    /**
     * 设置payOnArrival属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayOnArrival(Boolean value) {
        this.payOnArrival = value;
    }

    /**
     * 获取synchronised属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSynchronised() {
        return synchronised;
    }

    /**
     * 设置synchronised属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSynchronised(Boolean value) {
        this.synchronised = value;
    }

    /**
     * 获取changeAllowed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeAllowed() {
        return changeAllowed;
    }

    /**
     * 设置changeAllowed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeAllowed(String value) {
        this.changeAllowed = value;
    }

    /**
     * 获取bookingChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingChannel() {
        return bookingChannel;
    }

    /**
     * 设置bookingChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingChannel(String value) {
        this.bookingChannel = value;
    }

    /**
     * 获取echoToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * 设置echoToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * 获取manualSegment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualSegment() {
        return manualSegment;
    }

    /**
     * 设置manualSegment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualSegment(Boolean value) {
        this.manualSegment = value;
    }

    /**
     * 获取productTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * 设置productTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
    }

    /**
     * 获取serviceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * 设置serviceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * 获取searchID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchID() {
        return searchID;
    }

    /**
     * 设置searchID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchID(String value) {
        this.searchID = value;
    }

    /**
     * 获取cheapestAlternative属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCheapestAlternative() {
        return cheapestAlternative;
    }

    /**
     * 设置cheapestAlternative属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCheapestAlternative(Float value) {
        this.cheapestAlternative = value;
    }

    /**
     * 获取postTravel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostTravel() {
        return postTravel;
    }

    /**
     * 设置postTravel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostTravel(Boolean value) {
        this.postTravel = value;
    }

    /**
     * 获取refundable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundable() {
        return refundable;
    }

    /**
     * 设置refundable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundable(Boolean value) {
        this.refundable = value;
    }

    /**
     * 获取splitFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSplitFrom() {
        return splitFrom;
    }

    /**
     * 设置splitFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSplitFrom(BigInteger value) {
        this.splitFrom = value;
    }

    /**
     * 获取primaryLangID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * 设置primaryLangID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeType }
     *     
     */
    public ActionCodeType getAction() {
        return action;
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeType }
     *     
     */
    public void setAction(ActionCodeType value) {
        this.action = value;
    }

    /**
     * 获取productNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductNumber() {
        return productNumber;
    }

    /**
     * 设置productNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductNumber(BigInteger value) {
        this.productNumber = value;
    }

    /**
     * 获取masterProductNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMasterProductNumber() {
        return masterProductNumber;
    }

    /**
     * 设置masterProductNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMasterProductNumber(BigInteger value) {
        this.masterProductNumber = value;
    }

    /**
     * 获取historyID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHistoryID() {
        return historyID;
    }

    /**
     * 设置historyID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHistoryID(BigInteger value) {
        this.historyID = value;
    }

    /**
     * 获取historic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHistoric() {
        return historic;
    }

    /**
     * 设置historic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistoric(Boolean value) {
        this.historic = value;
    }

    /**
     * 获取liveID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLiveID() {
        return liveID;
    }

    /**
     * 设置liveID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLiveID(Integer value) {
        this.liveID = value;
    }

    /**
     * 获取bookingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingStatus() {
        return bookingStatus;
    }

    /**
     * 设置bookingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingStatus(String value) {
        this.bookingStatus = value;
    }

    /**
     * 获取cancellationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * 设置cancellationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * 获取bookingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDate() {
        return bookingDate;
    }

    /**
     * 设置bookingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingDate(XMLGregorianCalendar value) {
        this.bookingDate = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * 获取promotionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionType() {
        return promotionType;
    }

    /**
     * 设置promotionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionType(String value) {
        this.promotionType = value;
    }

    /**
     * 获取lastModified属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * 设置lastModified属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * 获取destination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 设置destination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DestActivityReservationType">
     *       &lt;sequence>
     *         &lt;element name="Air" type="{http://www.opentravel.org/OTA/2003/05}AirReservationType" minOccurs="0"/>
     *         &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/>
     *         &lt;element name="ReservationItemReferences" type="{http://www.opentravel.org/OTA/2003/05}ReservationItemReferencesType" minOccurs="0"/>
     *         &lt;element name="BookingReferenceID" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CompanyName" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TPA_Extensions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DestActivityDescriptiveContent" type="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType"/>
     *                   &lt;element name="SupplierSpecificInfos" type="{http://www.opentravel.org/OTA/2003/05}SupplierSpecificInfosType" minOccurs="0"/>
     *                   &lt;element name="Insurance" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}InsCoverageType">
     *                           &lt;sequence>
     *                             &lt;element name="InsuranceCustomer" type="{http://www.opentravel.org/OTA/2003/05}InsuranceCustomerType" minOccurs="0"/>
     *                             &lt;element name="PlanCost" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PlanCostType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ExchangeRate" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}SPNR_PriceAdjustmentsType" minOccurs="0"/>
     *                                       &lt;element name="IncrementalPrices" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="IncrementalPrice" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                                                         &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                                         &lt;attribute name="FrequencyType" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *                             &lt;element name="PolicyDetail" type="{http://www.opentravel.org/OTA/2003/05}PolicyDetail_Type" minOccurs="0"/>
     *                             &lt;element name="QuoteDetail" type="{http://www.opentravel.org/OTA/2003/05}QuoteDetail_Type" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
     *         &lt;element name="SupplierPenalties" type="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType" minOccurs="0"/>
     *         &lt;element name="ReservationReferences" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ReservationReference" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
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
        "air",
        "cancellationPenalties",
        "reservationItemReferences",
        "bookingReferenceID",
        "tpaExtensions",
        "amendmentPenalties",
        "supplierPenalties",
        "reservationReferences"
    })
    public static class Activity
        extends DestActivityReservationType
    {

        @XmlElement(name = "Air")
        protected AirReservationType air;
        @XmlElement(name = "CancellationPenalties", required = true)
        protected CancelPenaltiesType cancellationPenalties;
        @XmlElement(name = "ReservationItemReferences")
        protected ReservationItemReferencesType reservationItemReferences;
        @XmlElement(name = "BookingReferenceID")
        protected ProductBase.Activity.BookingReferenceID bookingReferenceID;
        @XmlElement(name = "TPA_Extensions")
        protected ProductBase.Activity.TPAExtensions tpaExtensions;
        @XmlElement(name = "AmendmentPenalties")
        protected OJAmendPenaltiesType amendmentPenalties;
        @XmlElement(name = "SupplierPenalties")
        protected SupplierPenaltiesType supplierPenalties;
        @XmlElement(name = "ReservationReferences")
        protected ProductBase.Activity.ReservationReferences reservationReferences;

        /**
         * 获取air属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirReservationType }
         *     
         */
        public AirReservationType getAir() {
            return air;
        }

        /**
         * 设置air属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirReservationType }
         *     
         */
        public void setAir(AirReservationType value) {
            this.air = value;
        }

        /**
         * 获取cancellationPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public CancelPenaltiesType getCancellationPenalties() {
            return cancellationPenalties;
        }

        /**
         * 设置cancellationPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public void setCancellationPenalties(CancelPenaltiesType value) {
            this.cancellationPenalties = value;
        }

        /**
         * 获取reservationItemReferences属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ReservationItemReferencesType }
         *     
         */
        public ReservationItemReferencesType getReservationItemReferences() {
            return reservationItemReferences;
        }

        /**
         * 设置reservationItemReferences属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationItemReferencesType }
         *     
         */
        public void setReservationItemReferences(ReservationItemReferencesType value) {
            this.reservationItemReferences = value;
        }

        /**
         * 获取bookingReferenceID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProductBase.Activity.BookingReferenceID }
         *     
         */
        public ProductBase.Activity.BookingReferenceID getBookingReferenceID() {
            return bookingReferenceID;
        }

        /**
         * 设置bookingReferenceID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProductBase.Activity.BookingReferenceID }
         *     
         */
        public void setBookingReferenceID(ProductBase.Activity.BookingReferenceID value) {
            this.bookingReferenceID = value;
        }

        /**
         * 获取tpaExtensions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProductBase.Activity.TPAExtensions }
         *     
         */
        public ProductBase.Activity.TPAExtensions getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * 设置tpaExtensions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProductBase.Activity.TPAExtensions }
         *     
         */
        public void setTPAExtensions(ProductBase.Activity.TPAExtensions value) {
            this.tpaExtensions = value;
        }

        /**
         * 获取amendmentPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public OJAmendPenaltiesType getAmendmentPenalties() {
            return amendmentPenalties;
        }

        /**
         * 设置amendmentPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public void setAmendmentPenalties(OJAmendPenaltiesType value) {
            this.amendmentPenalties = value;
        }

        /**
         * 获取supplierPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierPenaltiesType }
         *     
         */
        public SupplierPenaltiesType getSupplierPenalties() {
            return supplierPenalties;
        }

        /**
         * 设置supplierPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierPenaltiesType }
         *     
         */
        public void setSupplierPenalties(SupplierPenaltiesType value) {
            this.supplierPenalties = value;
        }

        /**
         * 获取reservationReferences属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProductBase.Activity.ReservationReferences }
         *     
         */
        public ProductBase.Activity.ReservationReferences getReservationReferences() {
            return reservationReferences;
        }

        /**
         * 设置reservationReferences属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProductBase.Activity.ReservationReferences }
         *     
         */
        public void setReservationReferences(ProductBase.Activity.ReservationReferences value) {
            this.reservationReferences = value;
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
         *         &lt;element name="CompanyName" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "companyName"
        })
        public static class BookingReferenceID {

            @XmlElement(name = "CompanyName")
            protected ProductBase.Activity.BookingReferenceID.CompanyName companyName;
            @XmlAttribute(name = "ID")
            protected String id;

            /**
             * 获取companyName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ProductBase.Activity.BookingReferenceID.CompanyName }
             *     
             */
            public ProductBase.Activity.BookingReferenceID.CompanyName getCompanyName() {
                return companyName;
            }

            /**
             * 设置companyName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ProductBase.Activity.BookingReferenceID.CompanyName }
             *     
             */
            public void setCompanyName(ProductBase.Activity.BookingReferenceID.CompanyName value) {
                this.companyName = value;
            }

            /**
             * 获取id属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * 设置id属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
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
             *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CompanyName {

                @XmlAttribute(name = "Code")
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
         *         &lt;element name="ReservationReference" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded"/>
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
            "reservationReference"
        })
        public static class ReservationReferences {

            @XmlElement(name = "ReservationReference", required = true)
            protected List<UniqueIDType> reservationReference;

            /**
             * Gets the value of the reservationReference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reservationReference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReservationReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UniqueIDType }
             * 
             * 
             */
            public List<UniqueIDType> getReservationReference() {
                if (reservationReference == null) {
                    reservationReference = new ArrayList<UniqueIDType>();
                }
                return this.reservationReference;
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
         *         &lt;element name="DestActivityDescriptiveContent" type="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType"/>
         *         &lt;element name="SupplierSpecificInfos" type="{http://www.opentravel.org/OTA/2003/05}SupplierSpecificInfosType" minOccurs="0"/>
         *         &lt;element name="Insurance" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}InsCoverageType">
         *                 &lt;sequence>
         *                   &lt;element name="InsuranceCustomer" type="{http://www.opentravel.org/OTA/2003/05}InsuranceCustomerType" minOccurs="0"/>
         *                   &lt;element name="PlanCost" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PlanCostType">
         *                           &lt;sequence>
         *                             &lt;element name="ExchangeRate" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}SPNR_PriceAdjustmentsType" minOccurs="0"/>
         *                             &lt;element name="IncrementalPrices" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="IncrementalPrice" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                                               &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                               &lt;attribute name="FrequencyType" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
         *                   &lt;element name="PolicyDetail" type="{http://www.opentravel.org/OTA/2003/05}PolicyDetail_Type" minOccurs="0"/>
         *                   &lt;element name="QuoteDetail" type="{http://www.opentravel.org/OTA/2003/05}QuoteDetail_Type" minOccurs="0"/>
         *                 &lt;/sequence>
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
            "destActivityDescriptiveContent",
            "supplierSpecificInfos",
            "insurance"
        })
        public static class TPAExtensions {

            @XmlElement(name = "DestActivityDescriptiveContent", required = true)
            protected DestActivityDescriptiveContentType destActivityDescriptiveContent;
            @XmlElement(name = "SupplierSpecificInfos")
            protected SupplierSpecificInfosType supplierSpecificInfos;
            @XmlElement(name = "Insurance")
            protected ProductBase.Activity.TPAExtensions.Insurance insurance;

            /**
             * 获取destActivityDescriptiveContent属性的值。
             * 
             * @return
             *     possible object is
             *     {@link DestActivityDescriptiveContentType }
             *     
             */
            public DestActivityDescriptiveContentType getDestActivityDescriptiveContent() {
                return destActivityDescriptiveContent;
            }

            /**
             * 设置destActivityDescriptiveContent属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link DestActivityDescriptiveContentType }
             *     
             */
            public void setDestActivityDescriptiveContent(DestActivityDescriptiveContentType value) {
                this.destActivityDescriptiveContent = value;
            }

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
             * 获取insurance属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ProductBase.Activity.TPAExtensions.Insurance }
             *     
             */
            public ProductBase.Activity.TPAExtensions.Insurance getInsurance() {
                return insurance;
            }

            /**
             * 设置insurance属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ProductBase.Activity.TPAExtensions.Insurance }
             *     
             */
            public void setInsurance(ProductBase.Activity.TPAExtensions.Insurance value) {
                this.insurance = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}InsCoverageType">
             *       &lt;sequence>
             *         &lt;element name="InsuranceCustomer" type="{http://www.opentravel.org/OTA/2003/05}InsuranceCustomerType" minOccurs="0"/>
             *         &lt;element name="PlanCost" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PlanCostType">
             *                 &lt;sequence>
             *                   &lt;element name="ExchangeRate" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}SPNR_PriceAdjustmentsType" minOccurs="0"/>
             *                   &lt;element name="IncrementalPrices" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="IncrementalPrice" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *                                     &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                                     &lt;attribute name="FrequencyType" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
             *         &lt;element name="PolicyDetail" type="{http://www.opentravel.org/OTA/2003/05}PolicyDetail_Type" minOccurs="0"/>
             *         &lt;element name="QuoteDetail" type="{http://www.opentravel.org/OTA/2003/05}QuoteDetail_Type" minOccurs="0"/>
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
                "insuranceCustomer",
                "planCost",
                "uniqueID",
                "policyDetail",
                "quoteDetail"
            })
            public static class Insurance
                extends InsCoverageType
            {

                @XmlElement(name = "InsuranceCustomer")
                protected InsuranceCustomerType insuranceCustomer;
                @XmlElement(name = "PlanCost")
                protected ProductBase.Activity.TPAExtensions.Insurance.PlanCost planCost;
                @XmlElement(name = "UniqueID")
                protected UniqueIDType uniqueID;
                @XmlElement(name = "PolicyDetail")
                protected PolicyDetailType policyDetail;
                @XmlElement(name = "QuoteDetail")
                protected QuoteDetailType quoteDetail;

                /**
                 * 获取insuranceCustomer属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link InsuranceCustomerType }
                 *     
                 */
                public InsuranceCustomerType getInsuranceCustomer() {
                    return insuranceCustomer;
                }

                /**
                 * 设置insuranceCustomer属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InsuranceCustomerType }
                 *     
                 */
                public void setInsuranceCustomer(InsuranceCustomerType value) {
                    this.insuranceCustomer = value;
                }

                /**
                 * 获取planCost属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProductBase.Activity.TPAExtensions.Insurance.PlanCost }
                 *     
                 */
                public ProductBase.Activity.TPAExtensions.Insurance.PlanCost getPlanCost() {
                    return planCost;
                }

                /**
                 * 设置planCost属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProductBase.Activity.TPAExtensions.Insurance.PlanCost }
                 *     
                 */
                public void setPlanCost(ProductBase.Activity.TPAExtensions.Insurance.PlanCost value) {
                    this.planCost = value;
                }

                /**
                 * 获取uniqueID属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UniqueIDType }
                 *     
                 */
                public UniqueIDType getUniqueID() {
                    return uniqueID;
                }

                /**
                 * 设置uniqueID属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UniqueIDType }
                 *     
                 */
                public void setUniqueID(UniqueIDType value) {
                    this.uniqueID = value;
                }

                /**
                 * 获取policyDetail属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link PolicyDetailType }
                 *     
                 */
                public PolicyDetailType getPolicyDetail() {
                    return policyDetail;
                }

                /**
                 * 设置policyDetail属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PolicyDetailType }
                 *     
                 */
                public void setPolicyDetail(PolicyDetailType value) {
                    this.policyDetail = value;
                }

                /**
                 * 获取quoteDetail属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link QuoteDetailType }
                 *     
                 */
                public QuoteDetailType getQuoteDetail() {
                    return quoteDetail;
                }

                /**
                 * 设置quoteDetail属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QuoteDetailType }
                 *     
                 */
                public void setQuoteDetail(QuoteDetailType value) {
                    this.quoteDetail = value;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PlanCostType">
                 *       &lt;sequence>
                 *         &lt;element name="ExchangeRate" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}SPNR_PriceAdjustmentsType" minOccurs="0"/>
                 *         &lt;element name="IncrementalPrices" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="IncrementalPrice" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
                 *                           &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                           &lt;attribute name="FrequencyType" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
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
                    "exchangeRate",
                    "priceAdjustments",
                    "incrementalPrices"
                })
                public static class PlanCost
                    extends PlanCostType
                {

                    @XmlElement(name = "ExchangeRate")
                    protected List<ProductBase.Activity.TPAExtensions.Insurance.PlanCost.ExchangeRate> exchangeRate;
                    @XmlElement(name = "PriceAdjustments")
                    protected SPNRPriceAdjustmentsType priceAdjustments;
                    @XmlElement(name = "IncrementalPrices")
                    protected ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices incrementalPrices;

                    /**
                     * Gets the value of the exchangeRate property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the exchangeRate property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getExchangeRate().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ProductBase.Activity.TPAExtensions.Insurance.PlanCost.ExchangeRate }
                     * 
                     * 
                     */
                    public List<ProductBase.Activity.TPAExtensions.Insurance.PlanCost.ExchangeRate> getExchangeRate() {
                        if (exchangeRate == null) {
                            exchangeRate = new ArrayList<ProductBase.Activity.TPAExtensions.Insurance.PlanCost.ExchangeRate>();
                        }
                        return this.exchangeRate;
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
                     * 获取incrementalPrices属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices }
                     *     
                     */
                    public ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices getIncrementalPrices() {
                        return incrementalPrices;
                    }

                    /**
                     * 设置incrementalPrices属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices }
                     *     
                     */
                    public void setIncrementalPrices(ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices value) {
                        this.incrementalPrices = value;
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
                    public static class ExchangeRate {

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
                     *         &lt;element name="IncrementalPrice" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
                     *                 &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *                 &lt;attribute name="FrequencyType" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
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
                        "incrementalPrice"
                    })
                    public static class IncrementalPrices {

                        @XmlElement(name = "IncrementalPrice", required = true)
                        protected List<ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices.IncrementalPrice> incrementalPrice;

                        /**
                         * Gets the value of the incrementalPrice property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the incrementalPrice property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIncrementalPrice().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices.IncrementalPrice }
                         * 
                         * 
                         */
                        public List<ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices.IncrementalPrice> getIncrementalPrice() {
                            if (incrementalPrice == null) {
                                incrementalPrice = new ArrayList<ProductBase.Activity.TPAExtensions.Insurance.PlanCost.IncrementalPrices.IncrementalPrice>();
                            }
                            return this.incrementalPrice;
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
                         *       &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                         *       &lt;attribute name="FrequencyType" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class IncrementalPrice {

                            @XmlAttribute(name = "Frequency")
                            @XmlSchemaType(name = "positiveInteger")
                            protected BigInteger frequency;
                            @XmlAttribute(name = "FrequencyType")
                            protected String frequencyType;
                            @XmlAttribute(name = "Amount")
                            protected Float amount;
                            @XmlAttribute(name = "PrePayInd")
                            protected Boolean prePayInd;
                            @XmlAttribute(name = "OriginalAmount")
                            protected Float originalAmount;
                            @XmlAttribute(name = "OriginalCurrencyCode")
                            protected String originalCurrencyCode;
                            @XmlAttribute(name = "CurrencyCode")
                            protected String currencyCode;
                            @XmlAttribute(name = "DecimalPlaces")
                            @XmlSchemaType(name = "nonNegativeInteger")
                            protected BigInteger decimalPlaces;

                            /**
                             * 获取frequency属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getFrequency() {
                                return frequency;
                            }

                            /**
                             * 设置frequency属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setFrequency(BigInteger value) {
                                this.frequency = value;
                            }

                            /**
                             * 获取frequencyType属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getFrequencyType() {
                                return frequencyType;
                            }

                            /**
                             * 设置frequencyType属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setFrequencyType(String value) {
                                this.frequencyType = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirReservationType">
     *       &lt;sequence>
     *         &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
     *         &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
     *         &lt;element name="SupplierPenalties" type="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType" minOccurs="0"/>
     *         &lt;element name="Insurance" type="{http://www.opentravel.org/OTA/2003/05}InsuranceProductLinkType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
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
        "cancellationPenalties",
        "amendmentPenalties",
        "supplierPenalties",
        "insurance",
        "agent"
    })
    public static class Air
        extends AirReservationType
    {

        @XmlElement(name = "CancellationPenalties")
        protected CancelPenaltiesType cancellationPenalties;
        @XmlElement(name = "AmendmentPenalties")
        protected OJAmendPenaltiesType amendmentPenalties;
        @XmlElement(name = "SupplierPenalties")
        protected SupplierPenaltiesType supplierPenalties;
        @XmlElement(name = "Insurance")
        protected List<InsuranceProductLinkType> insurance;
        @XmlElement(name = "Agent")
        protected AgentDetailsType agent;

        /**
         * 获取cancellationPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public CancelPenaltiesType getCancellationPenalties() {
            return cancellationPenalties;
        }

        /**
         * 设置cancellationPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public void setCancellationPenalties(CancelPenaltiesType value) {
            this.cancellationPenalties = value;
        }

        /**
         * 获取amendmentPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public OJAmendPenaltiesType getAmendmentPenalties() {
            return amendmentPenalties;
        }

        /**
         * 设置amendmentPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public void setAmendmentPenalties(OJAmendPenaltiesType value) {
            this.amendmentPenalties = value;
        }

        /**
         * 获取supplierPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierPenaltiesType }
         *     
         */
        public SupplierPenaltiesType getSupplierPenalties() {
            return supplierPenalties;
        }

        /**
         * 设置supplierPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierPenaltiesType }
         *     
         */
        public void setSupplierPenalties(SupplierPenaltiesType value) {
            this.supplierPenalties = value;
        }

        /**
         * Gets the value of the insurance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the insurance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInsurance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InsuranceProductLinkType }
         * 
         * 
         */
        public List<InsuranceProductLinkType> getInsurance() {
            if (insurance == null) {
                insurance = new ArrayList<InsuranceProductLinkType>();
            }
            return this.insurance;
        }

        /**
         * 获取agent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AgentDetailsType }
         *     
         */
        public AgentDetailsType getAgent() {
            return agent;
        }

        /**
         * 设置agent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AgentDetailsType }
         *     
         */
        public void setAgent(AgentDetailsType value) {
            this.agent = value;
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
     *         &lt;element name="Air" type="{http://www.opentravel.org/OTA/2003/05}AirReservationType" minOccurs="0"/>
     *         &lt;element name="Content" type="{http://www.opentravel.org/OTA/2003/05}ProductContentType"/>
     *         &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/>
     *         &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
     *         &lt;element name="TravelerInfo" type="{http://www.opentravel.org/OTA/2003/05}TravelerInfoType"/>
     *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="EMD_Info" type="{http://www.opentravel.org/OTA/2003/05}EMD_Type" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Attributes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Attribute" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" minOccurs="0"/>
     *         &lt;element name="AncillaryProducts" type="{http://www.opentravel.org/OTA/2003/05}AirAncillariesBundledProductsSummaryType" minOccurs="0"/>
     *         &lt;element name="FlightSegment" type="{http://www.opentravel.org/OTA/2003/05}FlightSegmentWithPrice" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Prices" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductPricesType"/>
     *         &lt;element name="Voucher" type="{http://www.opentravel.org/OTA/2003/05}SPNRVoucherType" minOccurs="0"/>
     *         &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}SPNR_WarningsType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="GroundTransportService" type="{http://www.opentravel.org/OTA/2003/05}GroundTransportServiceType" minOccurs="0"/>
     *         &lt;element name="Lounge" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryLoungeProductType" minOccurs="0"/>
     *         &lt;element name="SupplierDescriptiveContent" type="{http://www.opentravel.org/OTA/2003/05}SupplierDescriptiveContentType" minOccurs="0"/>
     *         &lt;element name="SupplierBookingReferenceID" type="{http://www.opentravel.org/OTA/2003/05}SupplierBookingReferenceIDType" minOccurs="0"/>
     *         &lt;element name="QRData" type="{http://www.opentravel.org/OTA/2003/05}QRDataType" minOccurs="0"/>
     *         &lt;element name="CarbonOffsets" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryOffsetProductType" minOccurs="0"/>
     *         &lt;element name="OriginalFlightSegment" type="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TSAncillaryProductGroup"/>
     *       &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
     *       &lt;attribute name="PoolID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AssociatedProductNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PassengerIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Category" use="required" type="{http://www.opentravel.org/OTA/2003/05}AncillaryProductCategoryType" />
     *       &lt;attribute name="Airport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}AirportAncillaryDirection" />
     *       &lt;attribute name="Origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Destination" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BookingREF" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProductSequence" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SellingProposition" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BundleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SupplierProductCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VoucherRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "air",
        "content",
        "cancellationPenalties",
        "amendmentPenalties",
        "travelerInfo",
        "ticketing",
        "emdInfo",
        "attributes",
        "contact",
        "ancillaryProducts",
        "flightSegment",
        "prices",
        "voucher",
        "warnings",
        "groundTransportService",
        "lounge",
        "supplierDescriptiveContent",
        "supplierBookingReferenceID",
        "qrData",
        "carbonOffsets",
        "originalFlightSegment"
    })
    public static class AncillaryProduct {

        @XmlElement(name = "Air")
        protected AirReservationType air;
        @XmlElement(name = "Content", required = true)
        protected ProductContentType content;
        @XmlElement(name = "CancellationPenalties", required = true)
        protected CancelPenaltiesType cancellationPenalties;
        @XmlElement(name = "AmendmentPenalties")
        protected OJAmendPenaltiesType amendmentPenalties;
        @XmlElement(name = "TravelerInfo", required = true)
        protected TravelerInfoType travelerInfo;
        @XmlElement(name = "Ticketing")
        protected List<TicketingInfoType> ticketing;
        @XmlElement(name = "EMD_Info")
        protected List<EMDType> emdInfo;
        @XmlElement(name = "Attributes")
        protected ProductBase.AncillaryProduct.Attributes attributes;
        @XmlElement(name = "Contact")
        protected ContactPersonType contact;
        @XmlElement(name = "AncillaryProducts")
        protected AirAncillariesBundledProductsSummaryType ancillaryProducts;
        @XmlElement(name = "FlightSegment")
        protected List<FlightSegmentWithPrice> flightSegment;
        @XmlElement(name = "Prices", required = true)
        protected AirAncillaryProductPricesType prices;
        @XmlElement(name = "Voucher")
        protected SPNRVoucherType voucher;
        @XmlElement(name = "Warnings")
        protected List<SPNRWarningsType> warnings;
        @XmlElement(name = "GroundTransportService")
        protected GroundTransportServiceType groundTransportService;
        @XmlElement(name = "Lounge")
        protected AirAncillaryLoungeProductType lounge;
        @XmlElement(name = "SupplierDescriptiveContent")
        protected SupplierDescriptiveContentType supplierDescriptiveContent;
        @XmlElement(name = "SupplierBookingReferenceID")
        protected SupplierBookingReferenceIDType supplierBookingReferenceID;
        @XmlElement(name = "QRData")
        protected QRDataType qrData;
        @XmlElement(name = "CarbonOffsets")
        protected AirAncillaryOffsetProductType carbonOffsets;
        @XmlElement(name = "OriginalFlightSegment")
        protected List<BookFlightSegmentType> originalFlightSegment;
        @XmlAttribute(name = "FlightNumber")
        protected String flightNumber;
        @XmlAttribute(name = "PoolID")
        @XmlSchemaType(name = "anySimpleType")
        protected String poolID;
        @XmlAttribute(name = "CabinClass")
        protected String cabinClass;
        @XmlAttribute(name = "Carrier")
        protected String carrier;
        @XmlAttribute(name = "Name", required = true)
        protected String name;
        @XmlAttribute(name = "AssociatedProductNumber")
        protected Integer associatedProductNumber;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Date", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "Quantity", required = true)
        protected String quantity;
        @XmlAttribute(name = "PassengerIndex")
        protected String passengerIndex;
        @XmlAttribute(name = "Category", required = true)
        protected AncillaryProductCategoryType category;
        @XmlAttribute(name = "Airport")
        protected String airport;
        @XmlAttribute(name = "Terminal")
        protected String terminal;
        @XmlAttribute(name = "Direction")
        protected AirportAncillaryDirection direction;
        @XmlAttribute(name = "Origin", required = true)
        protected String origin;
        @XmlAttribute(name = "Destination", required = true)
        protected String destination;
        @XmlAttribute(name = "SeatNumber")
        protected String seatNumber;
        @XmlAttribute(name = "REF")
        protected String ref;
        @XmlAttribute(name = "BookingReferenceID")
        protected String bookingReferenceID;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "SubType")
        protected String subType;
        @XmlAttribute(name = "BookingREF")
        protected Integer bookingREF;
        @XmlAttribute(name = "BookingStatus")
        protected String bookingStatus;
        @XmlAttribute(name = "BookingChannel")
        protected String bookingChannel;
        @XmlAttribute(name = "ProductSequence")
        protected String productSequence;
        @XmlAttribute(name = "SellingProposition")
        protected String sellingProposition;
        @XmlAttribute(name = "BundleCode")
        protected String bundleCode;
        @XmlAttribute(name = "SupplierCode")
        protected String supplierCode;
        @XmlAttribute(name = "SupplierProductCode")
        protected String supplierProductCode;
        @XmlAttribute(name = "OriginDestinationRPH")
        protected String originDestinationRPH;
        @XmlAttribute(name = "FlightSegmentRPH")
        protected String flightSegmentRPH;
        @XmlAttribute(name = "VoucherRequired")
        protected Boolean voucherRequired;
        @XmlAttribute(name = "Tag")
        protected String tag;
        @XmlAttribute(name = "Cancelable")
        protected Boolean cancelable;
        @XmlAttribute(name = "isSegBind")
        protected Boolean isSegBind;
        @XmlAttribute(name = "Refundable")
        protected Boolean refundable;

        /**
         * 获取air属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirReservationType }
         *     
         */
        public AirReservationType getAir() {
            return air;
        }

        /**
         * 设置air属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirReservationType }
         *     
         */
        public void setAir(AirReservationType value) {
            this.air = value;
        }

        /**
         * 获取content属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProductContentType }
         *     
         */
        public ProductContentType getContent() {
            return content;
        }

        /**
         * 设置content属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProductContentType }
         *     
         */
        public void setContent(ProductContentType value) {
            this.content = value;
        }

        /**
         * 获取cancellationPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public CancelPenaltiesType getCancellationPenalties() {
            return cancellationPenalties;
        }

        /**
         * 设置cancellationPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public void setCancellationPenalties(CancelPenaltiesType value) {
            this.cancellationPenalties = value;
        }

        /**
         * 获取amendmentPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public OJAmendPenaltiesType getAmendmentPenalties() {
            return amendmentPenalties;
        }

        /**
         * 设置amendmentPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public void setAmendmentPenalties(OJAmendPenaltiesType value) {
            this.amendmentPenalties = value;
        }

        /**
         * 获取travelerInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TravelerInfoType }
         *     
         */
        public TravelerInfoType getTravelerInfo() {
            return travelerInfo;
        }

        /**
         * 设置travelerInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerInfoType }
         *     
         */
        public void setTravelerInfo(TravelerInfoType value) {
            this.travelerInfo = value;
        }

        /**
         * Gets the value of the ticketing property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketing property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketing().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketingInfoType }
         * 
         * 
         */
        public List<TicketingInfoType> getTicketing() {
            if (ticketing == null) {
                ticketing = new ArrayList<TicketingInfoType>();
            }
            return this.ticketing;
        }

        /**
         * Gets the value of the emdInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emdInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEMDInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EMDType }
         * 
         * 
         */
        public List<EMDType> getEMDInfo() {
            if (emdInfo == null) {
                emdInfo = new ArrayList<EMDType>();
            }
            return this.emdInfo;
        }

        /**
         * 获取attributes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProductBase.AncillaryProduct.Attributes }
         *     
         */
        public ProductBase.AncillaryProduct.Attributes getAttributes() {
            return attributes;
        }

        /**
         * 设置attributes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProductBase.AncillaryProduct.Attributes }
         *     
         */
        public void setAttributes(ProductBase.AncillaryProduct.Attributes value) {
            this.attributes = value;
        }

        /**
         * 获取contact属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ContactPersonType }
         *     
         */
        public ContactPersonType getContact() {
            return contact;
        }

        /**
         * 设置contact属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ContactPersonType }
         *     
         */
        public void setContact(ContactPersonType value) {
            this.contact = value;
        }

        /**
         * 获取ancillaryProducts属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirAncillariesBundledProductsSummaryType }
         *     
         */
        public AirAncillariesBundledProductsSummaryType getAncillaryProducts() {
            return ancillaryProducts;
        }

        /**
         * 设置ancillaryProducts属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirAncillariesBundledProductsSummaryType }
         *     
         */
        public void setAncillaryProducts(AirAncillariesBundledProductsSummaryType value) {
            this.ancillaryProducts = value;
        }

        /**
         * Gets the value of the flightSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightSegmentWithPrice }
         * 
         * 
         */
        public List<FlightSegmentWithPrice> getFlightSegment() {
            if (flightSegment == null) {
                flightSegment = new ArrayList<FlightSegmentWithPrice>();
            }
            return this.flightSegment;
        }

        /**
         * 获取prices属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirAncillaryProductPricesType }
         *     
         */
        public AirAncillaryProductPricesType getPrices() {
            return prices;
        }

        /**
         * 设置prices属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirAncillaryProductPricesType }
         *     
         */
        public void setPrices(AirAncillaryProductPricesType value) {
            this.prices = value;
        }

        /**
         * 获取voucher属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SPNRVoucherType }
         *     
         */
        public SPNRVoucherType getVoucher() {
            return voucher;
        }

        /**
         * 设置voucher属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SPNRVoucherType }
         *     
         */
        public void setVoucher(SPNRVoucherType value) {
            this.voucher = value;
        }

        /**
         * Gets the value of the warnings property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warnings property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarnings().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SPNRWarningsType }
         * 
         * 
         */
        public List<SPNRWarningsType> getWarnings() {
            if (warnings == null) {
                warnings = new ArrayList<SPNRWarningsType>();
            }
            return this.warnings;
        }

        /**
         * 获取groundTransportService属性的值。
         * 
         * @return
         *     possible object is
         *     {@link GroundTransportServiceType }
         *     
         */
        public GroundTransportServiceType getGroundTransportService() {
            return groundTransportService;
        }

        /**
         * 设置groundTransportService属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link GroundTransportServiceType }
         *     
         */
        public void setGroundTransportService(GroundTransportServiceType value) {
            this.groundTransportService = value;
        }

        /**
         * 获取lounge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirAncillaryLoungeProductType }
         *     
         */
        public AirAncillaryLoungeProductType getLounge() {
            return lounge;
        }

        /**
         * 设置lounge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirAncillaryLoungeProductType }
         *     
         */
        public void setLounge(AirAncillaryLoungeProductType value) {
            this.lounge = value;
        }

        /**
         * 获取supplierDescriptiveContent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierDescriptiveContentType }
         *     
         */
        public SupplierDescriptiveContentType getSupplierDescriptiveContent() {
            return supplierDescriptiveContent;
        }

        /**
         * 设置supplierDescriptiveContent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierDescriptiveContentType }
         *     
         */
        public void setSupplierDescriptiveContent(SupplierDescriptiveContentType value) {
            this.supplierDescriptiveContent = value;
        }

        /**
         * 获取supplierBookingReferenceID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierBookingReferenceIDType }
         *     
         */
        public SupplierBookingReferenceIDType getSupplierBookingReferenceID() {
            return supplierBookingReferenceID;
        }

        /**
         * 设置supplierBookingReferenceID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierBookingReferenceIDType }
         *     
         */
        public void setSupplierBookingReferenceID(SupplierBookingReferenceIDType value) {
            this.supplierBookingReferenceID = value;
        }

        /**
         * 获取qrData属性的值。
         * 
         * @return
         *     possible object is
         *     {@link QRDataType }
         *     
         */
        public QRDataType getQRData() {
            return qrData;
        }

        /**
         * 设置qrData属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link QRDataType }
         *     
         */
        public void setQRData(QRDataType value) {
            this.qrData = value;
        }

        /**
         * 获取carbonOffsets属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirAncillaryOffsetProductType }
         *     
         */
        public AirAncillaryOffsetProductType getCarbonOffsets() {
            return carbonOffsets;
        }

        /**
         * 设置carbonOffsets属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirAncillaryOffsetProductType }
         *     
         */
        public void setCarbonOffsets(AirAncillaryOffsetProductType value) {
            this.carbonOffsets = value;
        }

        /**
         * Gets the value of the originalFlightSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originalFlightSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginalFlightSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookFlightSegmentType }
         * 
         * 
         */
        public List<BookFlightSegmentType> getOriginalFlightSegment() {
            if (originalFlightSegment == null) {
                originalFlightSegment = new ArrayList<BookFlightSegmentType>();
            }
            return this.originalFlightSegment;
        }

        /**
         * 获取flightNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightNumber() {
            return flightNumber;
        }

        /**
         * 设置flightNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightNumber(String value) {
            this.flightNumber = value;
        }

        /**
         * 获取poolID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPoolID() {
            return poolID;
        }

        /**
         * 设置poolID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPoolID(String value) {
            this.poolID = value;
        }

        /**
         * 获取cabinClass属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCabinClass() {
            return cabinClass;
        }

        /**
         * 设置cabinClass属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCabinClass(String value) {
            this.cabinClass = value;
        }

        /**
         * 获取carrier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarrier() {
            return carrier;
        }

        /**
         * 设置carrier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarrier(String value) {
            this.carrier = value;
        }

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * 获取associatedProductNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAssociatedProductNumber() {
            return associatedProductNumber;
        }

        /**
         * 设置associatedProductNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAssociatedProductNumber(Integer value) {
            this.associatedProductNumber = value;
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
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantity(String value) {
            this.quantity = value;
        }

        /**
         * 获取passengerIndex属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassengerIndex() {
            return passengerIndex;
        }

        /**
         * 设置passengerIndex属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassengerIndex(String value) {
            this.passengerIndex = value;
        }

        /**
         * 获取category属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AncillaryProductCategoryType }
         *     
         */
        public AncillaryProductCategoryType getCategory() {
            return category;
        }

        /**
         * 设置category属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AncillaryProductCategoryType }
         *     
         */
        public void setCategory(AncillaryProductCategoryType value) {
            this.category = value;
        }

        /**
         * 获取airport属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirport() {
            return airport;
        }

        /**
         * 设置airport属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirport(String value) {
            this.airport = value;
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
         * 获取direction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirportAncillaryDirection }
         *     
         */
        public AirportAncillaryDirection getDirection() {
            return direction;
        }

        /**
         * 设置direction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirportAncillaryDirection }
         *     
         */
        public void setDirection(AirportAncillaryDirection value) {
            this.direction = value;
        }

        /**
         * 获取origin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * 设置origin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * 获取destination属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestination() {
            return destination;
        }

        /**
         * 设置destination属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestination(String value) {
            this.destination = value;
        }

        /**
         * 获取seatNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeatNumber() {
            return seatNumber;
        }

        /**
         * 设置seatNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeatNumber(String value) {
            this.seatNumber = value;
        }

        /**
         * 获取ref属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREF() {
            return ref;
        }

        /**
         * 设置ref属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREF(String value) {
            this.ref = value;
        }

        /**
         * 获取bookingReferenceID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingReferenceID() {
            return bookingReferenceID;
        }

        /**
         * 设置bookingReferenceID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingReferenceID(String value) {
            this.bookingReferenceID = value;
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
         * 获取subType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubType() {
            return subType;
        }

        /**
         * 设置subType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubType(String value) {
            this.subType = value;
        }

        /**
         * 获取bookingREF属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBookingREF() {
            return bookingREF;
        }

        /**
         * 设置bookingREF属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBookingREF(Integer value) {
            this.bookingREF = value;
        }

        /**
         * 获取bookingStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingStatus() {
            return bookingStatus;
        }

        /**
         * 设置bookingStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingStatus(String value) {
            this.bookingStatus = value;
        }

        /**
         * 获取bookingChannel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingChannel() {
            return bookingChannel;
        }

        /**
         * 设置bookingChannel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingChannel(String value) {
            this.bookingChannel = value;
        }

        /**
         * 获取productSequence属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductSequence() {
            return productSequence;
        }

        /**
         * 设置productSequence属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductSequence(String value) {
            this.productSequence = value;
        }

        /**
         * 获取sellingProposition属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSellingProposition() {
            return sellingProposition;
        }

        /**
         * 设置sellingProposition属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSellingProposition(String value) {
            this.sellingProposition = value;
        }

        /**
         * 获取bundleCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBundleCode() {
            return bundleCode;
        }

        /**
         * 设置bundleCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBundleCode(String value) {
            this.bundleCode = value;
        }

        /**
         * 获取supplierCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierCode() {
            return supplierCode;
        }

        /**
         * 设置supplierCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplierCode(String value) {
            this.supplierCode = value;
        }

        /**
         * 获取supplierProductCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierProductCode() {
            return supplierProductCode;
        }

        /**
         * 设置supplierProductCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplierProductCode(String value) {
            this.supplierProductCode = value;
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
         * 获取voucherRequired属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVoucherRequired() {
            return voucherRequired;
        }

        /**
         * 设置voucherRequired属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVoucherRequired(Boolean value) {
            this.voucherRequired = value;
        }

        /**
         * 获取tag属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTag() {
            return tag;
        }

        /**
         * 设置tag属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTag(String value) {
            this.tag = value;
        }

        /**
         * 获取cancelable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancelable() {
            return cancelable;
        }

        /**
         * 设置cancelable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCancelable(Boolean value) {
            this.cancelable = value;
        }

        /**
         * 获取isSegBind属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsSegBind() {
            return isSegBind;
        }

        /**
         * 设置isSegBind属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsSegBind(Boolean value) {
            this.isSegBind = value;
        }

        /**
         * 获取refundable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRefundable() {
            return refundable;
        }

        /**
         * 设置refundable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRefundable(Boolean value) {
            this.refundable = value;
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
         *         &lt;element name="Attribute" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "attribute"
        })
        public static class Attributes {

            @XmlElement(name = "Attribute")
            protected List<ProductBase.AncillaryProduct.Attributes.Attribute> attribute;

            /**
             * Gets the value of the attribute property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attribute property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttribute().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProductBase.AncillaryProduct.Attributes.Attribute }
             * 
             * 
             */
            public List<ProductBase.AncillaryProduct.Attributes.Attribute> getAttribute() {
                if (attribute == null) {
                    attribute = new ArrayList<ProductBase.AncillaryProduct.Attributes.Attribute>();
                }
                return this.attribute;
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
             *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Attribute {

                @XmlAttribute(name = "Code", required = true)
                protected String code;
                @XmlAttribute(name = "Name", required = true)
                protected String name;

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
                 * 获取name属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * 设置name属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FerryProductType">
     *       &lt;sequence>
     *         &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/>
     *         &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
     *         &lt;element name="SupplierPenalties" type="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType" minOccurs="0"/>
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
        "cancellationPenalties",
        "amendmentPenalties",
        "supplierPenalties"
    })
    public static class Ferry
        extends FerryProductType
    {

        @XmlElement(name = "CancellationPenalties", required = true)
        protected CancelPenaltiesType cancellationPenalties;
        @XmlElement(name = "AmendmentPenalties")
        protected OJAmendPenaltiesType amendmentPenalties;
        @XmlElement(name = "SupplierPenalties")
        protected SupplierPenaltiesType supplierPenalties;

        /**
         * 获取cancellationPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public CancelPenaltiesType getCancellationPenalties() {
            return cancellationPenalties;
        }

        /**
         * 设置cancellationPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public void setCancellationPenalties(CancelPenaltiesType value) {
            this.cancellationPenalties = value;
        }

        /**
         * 获取amendmentPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public OJAmendPenaltiesType getAmendmentPenalties() {
            return amendmentPenalties;
        }

        /**
         * 设置amendmentPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public void setAmendmentPenalties(OJAmendPenaltiesType value) {
            this.amendmentPenalties = value;
        }

        /**
         * 获取supplierPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierPenaltiesType }
         *     
         */
        public SupplierPenaltiesType getSupplierPenalties() {
            return supplierPenalties;
        }

        /**
         * 设置supplierPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierPenaltiesType }
         *     
         */
        public void setSupplierPenalties(SupplierPenaltiesType value) {
            this.supplierPenalties = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
     *       &lt;sequence>
     *         &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/>
     *         &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
     *         &lt;element name="SupplierPenalties">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType">
     *                 &lt;sequence>
     *                   &lt;element name="CancelPenalty" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltyType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "cancellationPenalties",
        "amendmentPenalties",
        "supplierPenalties"
    })
    public static class Hotel
        extends HotelReservationType
    {

        @XmlElement(name = "CancellationPenalties", required = true)
        protected CancelPenaltiesType cancellationPenalties;
        @XmlElement(name = "AmendmentPenalties")
        protected OJAmendPenaltiesType amendmentPenalties;
        @XmlElement(name = "SupplierPenalties", required = true)
        protected ProductBase.Hotel.SupplierPenalties supplierPenalties;

        /**
         * 获取cancellationPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public CancelPenaltiesType getCancellationPenalties() {
            return cancellationPenalties;
        }

        /**
         * 设置cancellationPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public void setCancellationPenalties(CancelPenaltiesType value) {
            this.cancellationPenalties = value;
        }

        /**
         * 获取amendmentPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public OJAmendPenaltiesType getAmendmentPenalties() {
            return amendmentPenalties;
        }

        /**
         * 设置amendmentPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public void setAmendmentPenalties(OJAmendPenaltiesType value) {
            this.amendmentPenalties = value;
        }

        /**
         * 获取supplierPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProductBase.Hotel.SupplierPenalties }
         *     
         */
        public ProductBase.Hotel.SupplierPenalties getSupplierPenalties() {
            return supplierPenalties;
        }

        /**
         * 设置supplierPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProductBase.Hotel.SupplierPenalties }
         *     
         */
        public void setSupplierPenalties(ProductBase.Hotel.SupplierPenalties value) {
            this.supplierPenalties = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType">
         *       &lt;sequence>
         *         &lt;element name="CancelPenalty" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltyType" maxOccurs="unbounded" minOccurs="0"/>
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
            "cancelPenalty"
        })
        public static class SupplierPenalties
            extends SupplierPenaltiesType
        {

            @XmlElement(name = "CancelPenalty")
            protected List<CancelPenaltyType> cancelPenalty;

            /**
             * Gets the value of the cancelPenalty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cancelPenalty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCancelPenalty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CancelPenaltyType }
             * 
             * 
             */
            public List<CancelPenaltyType> getCancelPenalty() {
                if (cancelPenalty == null) {
                    cancelPenalty = new ArrayList<CancelPenaltyType>();
                }
                return this.cancelPenalty;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}InsCoverageType">
     *       &lt;sequence>
     *         &lt;element name="InsuranceCustomer" type="{http://www.opentravel.org/OTA/2003/05}InsuranceCustomerType"/>
     *         &lt;element name="PlanCost" type="{http://www.opentravel.org/OTA/2003/05}PlanCostType" minOccurs="0"/>
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *         &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/>
     *         &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
     *         &lt;element name="SupplierPenalties" type="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType" minOccurs="0"/>
     *         &lt;element name="PolicyDetail" type="{http://www.opentravel.org/OTA/2003/05}PolicyDetail_Type" minOccurs="0"/>
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
        "rest"
    })
    public static class Insurance
        extends InsCoverageType
    {

        @XmlElementRefs({
            @XmlElementRef(name = "PlanCost", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PolicyDetail", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CancellationPenalties", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "InsuranceCustomer", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "UniqueID", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AmendmentPenalties", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SupplierPenalties", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> rest;

        /**
         * 获取内容模型的其余部分。
         * 
         * <p>
         * 由于以下原因, 您获取的是此 "catch-all" 属性: 
         * 字段名称 "CancellationPenalties" 由模式的两个不同部分使用。请参阅: 
         * file:/D:/code/CA/spnr/xsd/OJ_SuperPNR.xsd的第 648 行
         * file:/D:/code/CA/spnr/xsd/OTA_InsuranceCommonTypes.xsd的第 480 行
         * <p>
         * 要清除此属性, 请将属性定制设置应用于以下两个声明
         * 或其中一个以更改其名称: 
         * Gets the value of the rest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link PlanCostType }{@code >}
         * {@link JAXBElement }{@code <}{@link PolicyDetailType }{@code >}
         * {@link JAXBElement }{@code <}{@link CancelPenaltiesType }{@code >}
         * {@link JAXBElement }{@code <}{@link InsuranceCustomerType }{@code >}
         * {@link JAXBElement }{@code <}{@link UniqueIDType }{@code >}
         * {@link JAXBElement }{@code <}{@link OJAmendPenaltiesType }{@code >}
         * {@link JAXBElement }{@code <}{@link SupplierPenaltiesType }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getRest() {
            if (rest == null) {
                rest = new ArrayList<JAXBElement<?>>();
            }
            return this.rest;
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
     *         &lt;element name="Air" type="{http://www.opentravel.org/OTA/2003/05}AirReservationType" minOccurs="0"/>
     *         &lt;element name="OriginDestination">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Service">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}DescriptionDetails" minOccurs="0"/>
     *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServicePrice" minOccurs="0"/>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceDate" minOccurs="0"/>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrier" minOccurs="0"/>
     *                             &lt;element name="MSCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BookingInstructions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SSRCode" type="{http://www.opentravel.org/OTA/2003/05}SSRCodeType" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="UpgradeMethod" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Baggage" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="MaxWeight" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                               &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="MinWeight" type="{http://www.opentravel.org/OTA/2003/05}BaggageWeightType" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="MaxDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="MinDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                                       &lt;element name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="SpecialItem">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;enumeration value="N"/>
     *                                           &lt;enumeration value="Y"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Attributes" minOccurs="0"/>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Diagnostics" minOccurs="0"/>
     *                             &lt;element name="S5" type="{http://www.opentravel.org/OTA/2003/05}S5Type" minOccurs="0"/>
     *                             &lt;element name="S7" type="{http://www.opentravel.org/OTA/2003/05}S7Type" minOccurs="0"/>
     *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                             &lt;element name="TotalAmount" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
     *                             &lt;element name="ExchangeRate" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}InfoType" minOccurs="0"/>
     *                             &lt;element name="FlightSegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="SegmentIDRef" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="TravelerIDRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SrvcItemAttributesGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DepartureArrivalCode"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TravelerInfo" type="{http://www.opentravel.org/OTA/2003/05}TravelerInfoType"/>
     *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="EMD_Info" type="{http://www.opentravel.org/OTA/2003/05}EMD_Type" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
     *         &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="BookingOrderIndicator" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="BundleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Refundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Cancelable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="isSegBind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "air",
        "originDestination",
        "travelerInfo",
        "ticketing",
        "emdInfo",
        "cancellationPenalties",
        "amendmentPenalties"
    })
    public static class ProductBaseBaggage {

        @XmlElement(name = "Air")
        protected AirReservationType air;
        @XmlElement(name = "OriginDestination", required = true)
        protected ProductBase.ProductBaseBaggage.OriginDestination originDestination;
        @XmlElement(name = "TravelerInfo", required = true)
        protected TravelerInfoType travelerInfo;
        @XmlElement(name = "Ticketing")
        protected List<TicketingInfoType> ticketing;
        @XmlElement(name = "EMD_Info")
        protected List<EMDType> emdInfo;
        @XmlElement(name = "CancellationPenalties")
        protected CancelPenaltiesType cancellationPenalties;
        @XmlElement(name = "AmendmentPenalties")
        protected OJAmendPenaltiesType amendmentPenalties;
        @XmlAttribute(name = "Quantity", required = true)
        protected int quantity;
        @XmlAttribute(name = "BookingOrderIndicator")
        protected Integer bookingOrderIndicator;
        @XmlAttribute(name = "BundleCode")
        protected String bundleCode;
        @XmlAttribute(name = "Refundable")
        protected Boolean refundable;
        @XmlAttribute(name = "Cancelable")
        protected Boolean cancelable;
        @XmlAttribute(name = "isSegBind")
        protected Boolean isSegBind;
        @XmlAttribute(name = "BookingReferenceID")
        protected Integer bookingReferenceID;
        @XmlAttribute(name = "OriginDestinationRPH")
        protected String originDestinationRPH;
        @XmlAttribute(name = "FlightSegmentRPH")
        protected String flightSegmentRPH;

        /**
         * 获取air属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirReservationType }
         *     
         */
        public AirReservationType getAir() {
            return air;
        }

        /**
         * 设置air属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirReservationType }
         *     
         */
        public void setAir(AirReservationType value) {
            this.air = value;
        }

        /**
         * 获取originDestination属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProductBase.ProductBaseBaggage.OriginDestination }
         *     
         */
        public ProductBase.ProductBaseBaggage.OriginDestination getOriginDestination() {
            return originDestination;
        }

        /**
         * 设置originDestination属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProductBase.ProductBaseBaggage.OriginDestination }
         *     
         */
        public void setOriginDestination(ProductBase.ProductBaseBaggage.OriginDestination value) {
            this.originDestination = value;
        }

        /**
         * 获取travelerInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TravelerInfoType }
         *     
         */
        public TravelerInfoType getTravelerInfo() {
            return travelerInfo;
        }

        /**
         * 设置travelerInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerInfoType }
         *     
         */
        public void setTravelerInfo(TravelerInfoType value) {
            this.travelerInfo = value;
        }

        /**
         * Gets the value of the ticketing property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketing property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketing().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketingInfoType }
         * 
         * 
         */
        public List<TicketingInfoType> getTicketing() {
            if (ticketing == null) {
                ticketing = new ArrayList<TicketingInfoType>();
            }
            return this.ticketing;
        }

        /**
         * Gets the value of the emdInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emdInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEMDInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EMDType }
         * 
         * 
         */
        public List<EMDType> getEMDInfo() {
            if (emdInfo == null) {
                emdInfo = new ArrayList<EMDType>();
            }
            return this.emdInfo;
        }

        /**
         * 获取cancellationPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public CancelPenaltiesType getCancellationPenalties() {
            return cancellationPenalties;
        }

        /**
         * 设置cancellationPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public void setCancellationPenalties(CancelPenaltiesType value) {
            this.cancellationPenalties = value;
        }

        /**
         * 获取amendmentPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public OJAmendPenaltiesType getAmendmentPenalties() {
            return amendmentPenalties;
        }

        /**
         * 设置amendmentPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public void setAmendmentPenalties(OJAmendPenaltiesType value) {
            this.amendmentPenalties = value;
        }

        /**
         * 获取quantity属性的值。
         * 
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         */
        public void setQuantity(int value) {
            this.quantity = value;
        }

        /**
         * 获取bookingOrderIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBookingOrderIndicator() {
            return bookingOrderIndicator;
        }

        /**
         * 设置bookingOrderIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBookingOrderIndicator(Integer value) {
            this.bookingOrderIndicator = value;
        }

        /**
         * 获取bundleCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBundleCode() {
            return bundleCode;
        }

        /**
         * 设置bundleCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBundleCode(String value) {
            this.bundleCode = value;
        }

        /**
         * 获取refundable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRefundable() {
            return refundable;
        }

        /**
         * 设置refundable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRefundable(Boolean value) {
            this.refundable = value;
        }

        /**
         * 获取cancelable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancelable() {
            return cancelable;
        }

        /**
         * 设置cancelable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCancelable(Boolean value) {
            this.cancelable = value;
        }

        /**
         * 获取isSegBind属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsSegBind() {
            return isSegBind;
        }

        /**
         * 设置isSegBind属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsSegBind(Boolean value) {
            this.isSegBind = value;
        }

        /**
         * 获取bookingReferenceID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBookingReferenceID() {
            return bookingReferenceID;
        }

        /**
         * 设置bookingReferenceID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBookingReferenceID(Integer value) {
            this.bookingReferenceID = value;
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Service">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}DescriptionDetails" minOccurs="0"/>
         *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServicePrice" minOccurs="0"/>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceDate" minOccurs="0"/>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrier" minOccurs="0"/>
         *                   &lt;element name="MSCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BookingInstructions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SSRCode" type="{http://www.opentravel.org/OTA/2003/05}SSRCodeType" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="UpgradeMethod" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Baggage" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="MaxWeight" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                                     &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="MinWeight" type="{http://www.opentravel.org/OTA/2003/05}BaggageWeightType" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="MaxDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="MinDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                             &lt;element name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="SpecialItem">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;enumeration value="N"/>
         *                                 &lt;enumeration value="Y"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Attributes" minOccurs="0"/>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Diagnostics" minOccurs="0"/>
         *                   &lt;element name="S5" type="{http://www.opentravel.org/OTA/2003/05}S5Type" minOccurs="0"/>
         *                   &lt;element name="S7" type="{http://www.opentravel.org/OTA/2003/05}S7Type" minOccurs="0"/>
         *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                   &lt;element name="TotalAmount" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
         *                   &lt;element name="ExchangeRate" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}InfoType" minOccurs="0"/>
         *                   &lt;element name="FlightSegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="SegmentIDRef" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="TravelerIDRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SrvcItemAttributesGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DepartureArrivalCode"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "service"
        })
        public static class OriginDestination {

            @XmlElement(name = "Service", required = true)
            protected ProductBase.ProductBaseBaggage.OriginDestination.Service service;
            @XmlAttribute(name = "DepartureCode", required = true)
            protected String departureCode;
            @XmlAttribute(name = "ArrivalCode", required = true)
            protected String arrivalCode;

            /**
             * 获取service属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ProductBase.ProductBaseBaggage.OriginDestination.Service }
             *     
             */
            public ProductBase.ProductBaseBaggage.OriginDestination.Service getService() {
                return service;
            }

            /**
             * 设置service属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ProductBase.ProductBaseBaggage.OriginDestination.Service }
             *     
             */
            public void setService(ProductBase.ProductBaseBaggage.OriginDestination.Service value) {
                this.service = value;
            }

            /**
             * 获取departureCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartureCode() {
                return departureCode;
            }

            /**
             * 设置departureCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartureCode(String value) {
                this.departureCode = value;
            }

            /**
             * 获取arrivalCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrivalCode() {
                return arrivalCode;
            }

            /**
             * 设置arrivalCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrivalCode(String value) {
                this.arrivalCode = value;
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
             *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}DescriptionDetails" minOccurs="0"/>
             *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServicePrice" minOccurs="0"/>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceDate" minOccurs="0"/>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrier" minOccurs="0"/>
             *         &lt;element name="MSCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BookingInstructions" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SSRCode" type="{http://www.opentravel.org/OTA/2003/05}SSRCodeType" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="UpgradeMethod" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Baggage" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="MaxWeight" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                           &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="MinWeight" type="{http://www.opentravel.org/OTA/2003/05}BaggageWeightType" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="MaxDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="MinDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *                   &lt;element name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="SpecialItem">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="N"/>
             *                       &lt;enumeration value="Y"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Attributes" minOccurs="0"/>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Diagnostics" minOccurs="0"/>
             *         &lt;element name="S5" type="{http://www.opentravel.org/OTA/2003/05}S5Type" minOccurs="0"/>
             *         &lt;element name="S7" type="{http://www.opentravel.org/OTA/2003/05}S7Type" minOccurs="0"/>
             *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *         &lt;element name="TotalAmount" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
             *         &lt;element name="ExchangeRate" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}InfoType" minOccurs="0"/>
             *         &lt;element name="FlightSegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="SegmentIDRef" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="TravelerIDRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SrvcItemAttributesGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "description",
                "descriptionDetails",
                "amount",
                "servicePrice",
                "serviceDate",
                "validatingCarrier",
                "msCarrier",
                "bookingInstructions",
                "baggage",
                "attributes",
                "diagnostics",
                "s5",
                "s7",
                "priceAdjustments",
                "totalAmount",
                "exchangeRate",
                "info",
                "flightSegmentNumber",
                "segmentIDRef",
                "travelerIDRef"
            })
            public static class Service {

                @XmlElement(name = "Description", required = true)
                protected String description;
                @XmlElement(name = "DescriptionDetails")
                protected DescriptionDetails descriptionDetails;
                @XmlElement(name = "Amount")
                protected String amount;
                @XmlElement(name = "ServicePrice")
                protected ServicePrice servicePrice;
                @XmlElement(name = "ServiceDate")
                protected DateTimeType serviceDate;
                @XmlElement(name = "ValidatingCarrier")
                protected String validatingCarrier;
                @XmlElement(name = "MSCarrier")
                protected String msCarrier;
                @XmlElement(name = "BookingInstructions")
                protected ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions bookingInstructions;
                @XmlElement(name = "Baggage")
                protected ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage baggage;
                @XmlElement(name = "Attributes")
                protected AttributesType attributes;
                @XmlElement(name = "Diagnostics")
                protected DiagnosticsType diagnostics;
                @XmlElement(name = "S5")
                protected S5Type s5;
                @XmlElement(name = "S7")
                protected S7Type s7;
                @XmlElement(name = "PriceAdjustments")
                protected ExPriceAdjustmentsType priceAdjustments;
                @XmlElement(name = "TotalAmount", required = true)
                protected TotalType totalAmount;
                @XmlElement(name = "ExchangeRate")
                protected ProductBase.ProductBaseBaggage.OriginDestination.Service.ExchangeRate exchangeRate;
                @XmlElement(name = "Info")
                protected InfoType info;
                @XmlElement(name = "FlightSegmentNumber")
                protected List<String> flightSegmentNumber;
                @XmlElement(name = "SegmentIDRef")
                protected List<String> segmentIDRef;
                @XmlElement(name = "TravelerIDRef", type = Integer.class)
                protected List<Integer> travelerIDRef;
                @XmlAttribute(name = "CanUnbundle")
                protected String canUnbundle;
                @XmlAttribute(name = "FQTVCarrier")
                protected String fqtvCarrier;
                @XmlAttribute(name = "FQTVNumber")
                protected String fqtvNumber;
                @XmlAttribute(name = "FQTVStatus")
                protected String fqtvStatus;
                @XmlAttribute(name = "Type")
                protected String type;
                @XmlAttribute(name = "TypeValue")
                protected String typeValue;
                @XmlAttribute(name = "Airline")
                protected String airline;
                @XmlAttribute(name = "FareBrand")
                protected String fareBrand;
                @XmlAttribute(name = "DealID")
                protected String dealID;
                @XmlAttribute(name = "ProviderIDRef")
                protected String providerIDRef;
                @XmlAttribute(name = "NotValidBefore")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar notValidBefore;
                @XmlAttribute(name = "NotValidAfter")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar notValidAfter;
                @XmlAttribute(name = "ServiceType")
                protected String serviceType;
                @XmlAttribute(name = "ServiceCode")
                protected String serviceCode;
                @XmlAttribute(name = "SubCode")
                protected String subCode;
                @XmlAttribute(name = "ApplyToAll")
                protected String applyToAll;
                @XmlAttribute(name = "MaxQuantity")
                protected Integer maxQuantity;
                @XmlAttribute(name = "Source")
                protected String source;
                @XmlAttribute(name = "Icon")
                protected String icon;
                @XmlAttribute(name = "Bundle")
                protected String bundle;
                @XmlAttribute(name = "Method", required = true)
                protected String method;
                @XmlAttribute(name = "Status")
                protected String status;
                @XmlAttribute(name = "ReasonCode")
                protected String reasonCode;
                @XmlAttribute(name = "DisplayPriority")
                protected SrvcDisplayPriorityType displayPriority;
                @XmlAttribute(name = "CanDeselect")
                protected String canDeselect;

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

                /**
                 * 获取descriptionDetails属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link DescriptionDetails }
                 *     
                 */
                public DescriptionDetails getDescriptionDetails() {
                    return descriptionDetails;
                }

                /**
                 * 设置descriptionDetails属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DescriptionDetails }
                 *     
                 */
                public void setDescriptionDetails(DescriptionDetails value) {
                    this.descriptionDetails = value;
                }

                /**
                 * 获取amount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAmount() {
                    return amount;
                }

                /**
                 * 设置amount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAmount(String value) {
                    this.amount = value;
                }

                /**
                 * 获取servicePrice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ServicePrice }
                 *     
                 */
                public ServicePrice getServicePrice() {
                    return servicePrice;
                }

                /**
                 * 设置servicePrice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ServicePrice }
                 *     
                 */
                public void setServicePrice(ServicePrice value) {
                    this.servicePrice = value;
                }

                /**
                 * 获取serviceDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link DateTimeType }
                 *     
                 */
                public DateTimeType getServiceDate() {
                    return serviceDate;
                }

                /**
                 * 设置serviceDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DateTimeType }
                 *     
                 */
                public void setServiceDate(DateTimeType value) {
                    this.serviceDate = value;
                }

                /**
                 * 获取validatingCarrier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValidatingCarrier() {
                    return validatingCarrier;
                }

                /**
                 * 设置validatingCarrier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValidatingCarrier(String value) {
                    this.validatingCarrier = value;
                }

                /**
                 * 获取msCarrier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMSCarrier() {
                    return msCarrier;
                }

                /**
                 * 设置msCarrier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMSCarrier(String value) {
                    this.msCarrier = value;
                }

                /**
                 * 获取bookingInstructions属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions }
                 *     
                 */
                public ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions getBookingInstructions() {
                    return bookingInstructions;
                }

                /**
                 * 设置bookingInstructions属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions }
                 *     
                 */
                public void setBookingInstructions(ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions value) {
                    this.bookingInstructions = value;
                }

                /**
                 * 获取baggage属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage }
                 *     
                 */
                public ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage getBaggage() {
                    return baggage;
                }

                /**
                 * 设置baggage属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage }
                 *     
                 */
                public void setBaggage(ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage value) {
                    this.baggage = value;
                }

                /**
                 * 获取attributes属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link AttributesType }
                 *     
                 */
                public AttributesType getAttributes() {
                    return attributes;
                }

                /**
                 * 设置attributes属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AttributesType }
                 *     
                 */
                public void setAttributes(AttributesType value) {
                    this.attributes = value;
                }

                /**
                 * 获取diagnostics属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link DiagnosticsType }
                 *     
                 */
                public DiagnosticsType getDiagnostics() {
                    return diagnostics;
                }

                /**
                 * 设置diagnostics属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DiagnosticsType }
                 *     
                 */
                public void setDiagnostics(DiagnosticsType value) {
                    this.diagnostics = value;
                }

                /**
                 * 获取s5属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link S5Type }
                 *     
                 */
                public S5Type getS5() {
                    return s5;
                }

                /**
                 * 设置s5属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link S5Type }
                 *     
                 */
                public void setS5(S5Type value) {
                    this.s5 = value;
                }

                /**
                 * 获取s7属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link S7Type }
                 *     
                 */
                public S7Type getS7() {
                    return s7;
                }

                /**
                 * 设置s7属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link S7Type }
                 *     
                 */
                public void setS7(S7Type value) {
                    this.s7 = value;
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
                 * 获取totalAmount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TotalType }
                 *     
                 */
                public TotalType getTotalAmount() {
                    return totalAmount;
                }

                /**
                 * 设置totalAmount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TotalType }
                 *     
                 */
                public void setTotalAmount(TotalType value) {
                    this.totalAmount = value;
                }

                /**
                 * 获取exchangeRate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.ExchangeRate }
                 *     
                 */
                public ProductBase.ProductBaseBaggage.OriginDestination.Service.ExchangeRate getExchangeRate() {
                    return exchangeRate;
                }

                /**
                 * 设置exchangeRate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.ExchangeRate }
                 *     
                 */
                public void setExchangeRate(ProductBase.ProductBaseBaggage.OriginDestination.Service.ExchangeRate value) {
                    this.exchangeRate = value;
                }

                /**
                 * 获取info属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link InfoType }
                 *     
                 */
                public InfoType getInfo() {
                    return info;
                }

                /**
                 * 设置info属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InfoType }
                 *     
                 */
                public void setInfo(InfoType value) {
                    this.info = value;
                }

                /**
                 * Gets the value of the flightSegmentNumber property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the flightSegmentNumber property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFlightSegmentNumber().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getFlightSegmentNumber() {
                    if (flightSegmentNumber == null) {
                        flightSegmentNumber = new ArrayList<String>();
                    }
                    return this.flightSegmentNumber;
                }

                /**
                 * Gets the value of the segmentIDRef property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the segmentIDRef property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSegmentIDRef().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getSegmentIDRef() {
                    if (segmentIDRef == null) {
                        segmentIDRef = new ArrayList<String>();
                    }
                    return this.segmentIDRef;
                }

                /**
                 * Gets the value of the travelerIDRef property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the travelerIDRef property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTravelerIDRef().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Integer }
                 * 
                 * 
                 */
                public List<Integer> getTravelerIDRef() {
                    if (travelerIDRef == null) {
                        travelerIDRef = new ArrayList<Integer>();
                    }
                    return this.travelerIDRef;
                }

                /**
                 * 获取canUnbundle属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCanUnbundle() {
                    return canUnbundle;
                }

                /**
                 * 设置canUnbundle属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCanUnbundle(String value) {
                    this.canUnbundle = value;
                }

                /**
                 * 获取fqtvCarrier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQTVCarrier() {
                    return fqtvCarrier;
                }

                /**
                 * 设置fqtvCarrier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQTVCarrier(String value) {
                    this.fqtvCarrier = value;
                }

                /**
                 * 获取fqtvNumber属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQTVNumber() {
                    return fqtvNumber;
                }

                /**
                 * 设置fqtvNumber属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQTVNumber(String value) {
                    this.fqtvNumber = value;
                }

                /**
                 * 获取fqtvStatus属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQTVStatus() {
                    return fqtvStatus;
                }

                /**
                 * 设置fqtvStatus属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQTVStatus(String value) {
                    this.fqtvStatus = value;
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
                 * 获取typeValue属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeValue() {
                    return typeValue;
                }

                /**
                 * 设置typeValue属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeValue(String value) {
                    this.typeValue = value;
                }

                /**
                 * 获取airline属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAirline() {
                    return airline;
                }

                /**
                 * 设置airline属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAirline(String value) {
                    this.airline = value;
                }

                /**
                 * 获取fareBrand属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFareBrand() {
                    return fareBrand;
                }

                /**
                 * 设置fareBrand属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFareBrand(String value) {
                    this.fareBrand = value;
                }

                /**
                 * 获取dealID属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDealID() {
                    return dealID;
                }

                /**
                 * 设置dealID属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDealID(String value) {
                    this.dealID = value;
                }

                /**
                 * 获取providerIDRef属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProviderIDRef() {
                    return providerIDRef;
                }

                /**
                 * 设置providerIDRef属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProviderIDRef(String value) {
                    this.providerIDRef = value;
                }

                /**
                 * 获取notValidBefore属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getNotValidBefore() {
                    return notValidBefore;
                }

                /**
                 * 设置notValidBefore属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setNotValidBefore(XMLGregorianCalendar value) {
                    this.notValidBefore = value;
                }

                /**
                 * 获取notValidAfter属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getNotValidAfter() {
                    return notValidAfter;
                }

                /**
                 * 设置notValidAfter属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setNotValidAfter(XMLGregorianCalendar value) {
                    this.notValidAfter = value;
                }

                /**
                 * 获取serviceType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceType() {
                    return serviceType;
                }

                /**
                 * 设置serviceType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceType(String value) {
                    this.serviceType = value;
                }

                /**
                 * 获取serviceCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceCode() {
                    return serviceCode;
                }

                /**
                 * 设置serviceCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceCode(String value) {
                    this.serviceCode = value;
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
                 * 获取applyToAll属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getApplyToAll() {
                    return applyToAll;
                }

                /**
                 * 设置applyToAll属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setApplyToAll(String value) {
                    this.applyToAll = value;
                }

                /**
                 * 获取maxQuantity属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getMaxQuantity() {
                    return maxQuantity;
                }

                /**
                 * 设置maxQuantity属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setMaxQuantity(Integer value) {
                    this.maxQuantity = value;
                }

                /**
                 * 获取source属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSource() {
                    return source;
                }

                /**
                 * 设置source属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSource(String value) {
                    this.source = value;
                }

                /**
                 * 获取icon属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIcon() {
                    return icon;
                }

                /**
                 * 设置icon属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIcon(String value) {
                    this.icon = value;
                }

                /**
                 * 获取bundle属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBundle() {
                    return bundle;
                }

                /**
                 * 设置bundle属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBundle(String value) {
                    this.bundle = value;
                }

                /**
                 * 获取method属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMethod() {
                    return method;
                }

                /**
                 * 设置method属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMethod(String value) {
                    this.method = value;
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
                 * 获取reasonCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReasonCode() {
                    return reasonCode;
                }

                /**
                 * 设置reasonCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReasonCode(String value) {
                    this.reasonCode = value;
                }

                /**
                 * 获取displayPriority属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SrvcDisplayPriorityType }
                 *     
                 */
                public SrvcDisplayPriorityType getDisplayPriority() {
                    return displayPriority;
                }

                /**
                 * 设置displayPriority属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SrvcDisplayPriorityType }
                 *     
                 */
                public void setDisplayPriority(SrvcDisplayPriorityType value) {
                    this.displayPriority = value;
                }

                /**
                 * 获取canDeselect属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCanDeselect() {
                    return canDeselect;
                }

                /**
                 * 设置canDeselect属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCanDeselect(String value) {
                    this.canDeselect = value;
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
                 *         &lt;element name="MaxWeight" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *                 &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="MinWeight" type="{http://www.opentravel.org/OTA/2003/05}BaggageWeightType" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="MaxDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="MinDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
                 *         &lt;element name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="SpecialItem">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="N"/>
                 *             &lt;enumeration value="Y"/>
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
                    "maxWeight",
                    "minWeight",
                    "maxDimensions",
                    "minDimensions",
                    "excessFirst",
                    "excessLast"
                })
                public static class Baggage {

                    @XmlElement(name = "MaxWeight")
                    protected List<ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage.MaxWeight> maxWeight;
                    @XmlElement(name = "MinWeight")
                    protected List<BaggageWeightType> minWeight;
                    @XmlElement(name = "MaxDimensions")
                    protected List<SPNRBaggageDimensionsType> maxDimensions;
                    @XmlElement(name = "MinDimensions")
                    protected List<SPNRBaggageDimensionsType> minDimensions;
                    @XmlElement(name = "ExcessFirst")
                    protected BigInteger excessFirst;
                    @XmlElement(name = "ExcessLast")
                    protected BigInteger excessLast;
                    @XmlAttribute(name = "SpecialItem")
                    protected String specialItem;

                    /**
                     * Gets the value of the maxWeight property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the maxWeight property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getMaxWeight().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage.MaxWeight }
                     * 
                     * 
                     */
                    public List<ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage.MaxWeight> getMaxWeight() {
                        if (maxWeight == null) {
                            maxWeight = new ArrayList<ProductBase.ProductBaseBaggage.OriginDestination.Service.Baggage.MaxWeight>();
                        }
                        return this.maxWeight;
                    }

                    /**
                     * Gets the value of the minWeight property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the minWeight property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getMinWeight().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link BaggageWeightType }
                     * 
                     * 
                     */
                    public List<BaggageWeightType> getMinWeight() {
                        if (minWeight == null) {
                            minWeight = new ArrayList<BaggageWeightType>();
                        }
                        return this.minWeight;
                    }

                    /**
                     * Gets the value of the maxDimensions property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the maxDimensions property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getMaxDimensions().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link SPNRBaggageDimensionsType }
                     * 
                     * 
                     */
                    public List<SPNRBaggageDimensionsType> getMaxDimensions() {
                        if (maxDimensions == null) {
                            maxDimensions = new ArrayList<SPNRBaggageDimensionsType>();
                        }
                        return this.maxDimensions;
                    }

                    /**
                     * Gets the value of the minDimensions property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the minDimensions property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getMinDimensions().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link SPNRBaggageDimensionsType }
                     * 
                     * 
                     */
                    public List<SPNRBaggageDimensionsType> getMinDimensions() {
                        if (minDimensions == null) {
                            minDimensions = new ArrayList<SPNRBaggageDimensionsType>();
                        }
                        return this.minDimensions;
                    }

                    /**
                     * 获取excessFirst属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getExcessFirst() {
                        return excessFirst;
                    }

                    /**
                     * 设置excessFirst属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setExcessFirst(BigInteger value) {
                        this.excessFirst = value;
                    }

                    /**
                     * 获取excessLast属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getExcessLast() {
                        return excessLast;
                    }

                    /**
                     * 设置excessLast属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setExcessLast(BigInteger value) {
                        this.excessLast = value;
                    }

                    /**
                     * 获取specialItem属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSpecialItem() {
                        return specialItem;
                    }

                    /**
                     * 设置specialItem属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSpecialItem(String value) {
                        this.specialItem = value;
                    }


                    /**
                     * <p>anonymous complex type的 Java 类。
                     * 
                     * <p>以下模式片段指定包含在此类中的预期内容。
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                     *       &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
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
                    public static class MaxWeight {

                        @XmlValue
                        protected BigDecimal value;
                        @XmlAttribute(name = "Unit", required = true)
                        protected WeightUnitType unit;

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
                         * 获取unit属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link WeightUnitType }
                         *     
                         */
                        public WeightUnitType getUnit() {
                            return unit;
                        }

                        /**
                         * 设置unit属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link WeightUnitType }
                         *     
                         */
                        public void setUnit(WeightUnitType value) {
                            this.unit = value;
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
                 *         &lt;element name="SSRCode" type="{http://www.opentravel.org/OTA/2003/05}SSRCodeType" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="UpgradeMethod" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
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
                    "ssrCode",
                    "osiText",
                    "method",
                    "upgradeMethod",
                    "text",
                    "equipment"
                })
                public static class BookingInstructions {

                    @XmlElement(name = "SSRCode")
                    protected List<String> ssrCode;
                    @XmlElement(name = "OSIText")
                    protected List<String> osiText;
                    @XmlElement(name = "Method")
                    protected String method;
                    @XmlElement(name = "UpgradeMethod")
                    protected ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions.UpgradeMethod upgradeMethod;
                    @XmlElement(name = "Text")
                    protected List<String> text;
                    @XmlElement(name = "Equipment")
                    protected EquipmentDetailType equipment;

                    /**
                     * Gets the value of the ssrCode property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the ssrCode property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSSRCode().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getSSRCode() {
                        if (ssrCode == null) {
                            ssrCode = new ArrayList<String>();
                        }
                        return this.ssrCode;
                    }

                    /**
                     * Gets the value of the osiText property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the osiText property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getOSIText().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getOSIText() {
                        if (osiText == null) {
                            osiText = new ArrayList<String>();
                        }
                        return this.osiText;
                    }

                    /**
                     * 获取method属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMethod() {
                        return method;
                    }

                    /**
                     * 设置method属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMethod(String value) {
                        this.method = value;
                    }

                    /**
                     * 获取upgradeMethod属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions.UpgradeMethod }
                     *     
                     */
                    public ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions.UpgradeMethod getUpgradeMethod() {
                        return upgradeMethod;
                    }

                    /**
                     * 设置upgradeMethod属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions.UpgradeMethod }
                     *     
                     */
                    public void setUpgradeMethod(ProductBase.ProductBaseBaggage.OriginDestination.Service.BookingInstructions.UpgradeMethod value) {
                        this.upgradeMethod = value;
                    }

                    /**
                     * Gets the value of the text property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the text property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getText().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getText() {
                        if (text == null) {
                            text = new ArrayList<String>();
                        }
                        return this.text;
                    }

                    /**
                     * 获取equipment属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link EquipmentDetailType }
                     *     
                     */
                    public EquipmentDetailType getEquipment() {
                        return equipment;
                    }

                    /**
                     * 设置equipment属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EquipmentDetailType }
                     *     
                     */
                    public void setEquipment(EquipmentDetailType value) {
                        this.equipment = value;
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
                     *       &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
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
                    public static class UpgradeMethod {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "NewClass")
                        protected String newClass;

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
                         * 获取newClass属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNewClass() {
                            return newClass;
                        }

                        /**
                         * 设置newClass属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNewClass(String value) {
                            this.newClass = value;
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
                public static class ExchangeRate {

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleReservationType">
     *       &lt;sequence>
     *         &lt;element name="VehResRQInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationRQAdditionalInfoType" minOccurs="0"/>
     *         &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType"/>
     *         &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
     *         &lt;element name="SupplierPenalties" type="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType" minOccurs="0"/>
     *         &lt;element name="BookingReferenceID" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CompanyName" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="VoucherURL" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="IDContext" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DriverType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerCountGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="VehAvailCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehResRQInfo",
        "cancellationPenalties",
        "amendmentPenalties",
        "supplierPenalties",
        "bookingReferenceID",
        "driverType",
        "vehAvailCore"
    })
    public static class Vehicle
        extends VehicleReservationType
    {

        @XmlElement(name = "VehResRQInfo")
        protected VehicleReservationRQAdditionalInfoType vehResRQInfo;
        @XmlElement(name = "CancellationPenalties", required = true)
        protected CancelPenaltiesType cancellationPenalties;
        @XmlElement(name = "AmendmentPenalties")
        protected OJAmendPenaltiesType amendmentPenalties;
        @XmlElement(name = "SupplierPenalties")
        protected SupplierPenaltiesType supplierPenalties;
        @XmlElement(name = "BookingReferenceID")
        protected ProductBase.Vehicle.BookingReferenceID bookingReferenceID;
        @XmlElement(name = "DriverType")
        protected ProductBase.Vehicle.DriverType driverType;
        @XmlElement(name = "VehAvailCore")
        protected VehicleAvailCoreType vehAvailCore;
        @XmlAttribute(name = "BookingReferenceID")
        @XmlSchemaType(name = "anySimpleType")
        protected String bookingReferenceIDAttr2;

        /**
         * 获取vehResRQInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VehicleReservationRQAdditionalInfoType }
         *     
         */
        public VehicleReservationRQAdditionalInfoType getVehResRQInfo() {
            return vehResRQInfo;
        }

        /**
         * 设置vehResRQInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleReservationRQAdditionalInfoType }
         *     
         */
        public void setVehResRQInfo(VehicleReservationRQAdditionalInfoType value) {
            this.vehResRQInfo = value;
        }

        /**
         * 获取cancellationPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public CancelPenaltiesType getCancellationPenalties() {
            return cancellationPenalties;
        }

        /**
         * 设置cancellationPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public void setCancellationPenalties(CancelPenaltiesType value) {
            this.cancellationPenalties = value;
        }

        /**
         * 获取amendmentPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public OJAmendPenaltiesType getAmendmentPenalties() {
            return amendmentPenalties;
        }

        /**
         * 设置amendmentPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OJAmendPenaltiesType }
         *     
         */
        public void setAmendmentPenalties(OJAmendPenaltiesType value) {
            this.amendmentPenalties = value;
        }

        /**
         * 获取supplierPenalties属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierPenaltiesType }
         *     
         */
        public SupplierPenaltiesType getSupplierPenalties() {
            return supplierPenalties;
        }

        /**
         * 设置supplierPenalties属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierPenaltiesType }
         *     
         */
        public void setSupplierPenalties(SupplierPenaltiesType value) {
            this.supplierPenalties = value;
        }

        /**
         * 获取bookingReferenceID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProductBase.Vehicle.BookingReferenceID }
         *     
         */
        public ProductBase.Vehicle.BookingReferenceID getBookingReferenceID() {
            return bookingReferenceID;
        }

        /**
         * 设置bookingReferenceID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProductBase.Vehicle.BookingReferenceID }
         *     
         */
        public void setBookingReferenceID(ProductBase.Vehicle.BookingReferenceID value) {
            this.bookingReferenceID = value;
        }

        /**
         * 获取driverType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProductBase.Vehicle.DriverType }
         *     
         */
        public ProductBase.Vehicle.DriverType getDriverType() {
            return driverType;
        }

        /**
         * 设置driverType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProductBase.Vehicle.DriverType }
         *     
         */
        public void setDriverType(ProductBase.Vehicle.DriverType value) {
            this.driverType = value;
        }

        /**
         * 获取vehAvailCore属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VehicleAvailCoreType }
         *     
         */
        public VehicleAvailCoreType getVehAvailCore() {
            return vehAvailCore;
        }

        /**
         * 设置vehAvailCore属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleAvailCoreType }
         *     
         */
        public void setVehAvailCore(VehicleAvailCoreType value) {
            this.vehAvailCore = value;
        }

        /**
         * 获取bookingReferenceIDAttr2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingReferenceIDAttr2() {
            return bookingReferenceIDAttr2;
        }

        /**
         * 设置bookingReferenceIDAttr2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingReferenceIDAttr2(String value) {
            this.bookingReferenceIDAttr2 = value;
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
         *         &lt;element name="CompanyName" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="VoucherURL" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="IDContext" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "companyName",
            "voucherURL"
        })
        public static class BookingReferenceID {

            @XmlElement(name = "CompanyName")
            protected ProductBase.Vehicle.BookingReferenceID.CompanyName companyName;
            @XmlElement(name = "VoucherURL")
            protected List<ProductBase.Vehicle.BookingReferenceID.VoucherURL> voucherURL;
            @XmlAttribute(name = "IDContext")
            @XmlSchemaType(name = "anySimpleType")
            protected String idContext;
            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "BookingReferenceID")
            protected String bookingReferenceIDAttr;

            /**
             * 获取companyName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ProductBase.Vehicle.BookingReferenceID.CompanyName }
             *     
             */
            public ProductBase.Vehicle.BookingReferenceID.CompanyName getCompanyName() {
                return companyName;
            }

            /**
             * 设置companyName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ProductBase.Vehicle.BookingReferenceID.CompanyName }
             *     
             */
            public void setCompanyName(ProductBase.Vehicle.BookingReferenceID.CompanyName value) {
                this.companyName = value;
            }

            /**
             * Gets the value of the voucherURL property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the voucherURL property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVoucherURL().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProductBase.Vehicle.BookingReferenceID.VoucherURL }
             * 
             * 
             */
            public List<ProductBase.Vehicle.BookingReferenceID.VoucherURL> getVoucherURL() {
                if (voucherURL == null) {
                    voucherURL = new ArrayList<ProductBase.Vehicle.BookingReferenceID.VoucherURL>();
                }
                return this.voucherURL;
            }

            /**
             * 获取idContext属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDContext() {
                return idContext;
            }

            /**
             * 设置idContext属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDContext(String value) {
                this.idContext = value;
            }

            /**
             * 获取id属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * 设置id属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * 获取bookingReferenceIDAttr属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBookingReferenceIDAttr() {
                return bookingReferenceIDAttr;
            }

            /**
             * 设置bookingReferenceIDAttr属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBookingReferenceIDAttr(String value) {
                this.bookingReferenceIDAttr = value;
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
             *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CompanyName {

                @XmlAttribute(name = "Code")
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


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class VoucherURL {

                @XmlAttribute(name = "RPH")
                @XmlSchemaType(name = "anySimpleType")
                protected String rph;
                @XmlAttribute(name = "URL")
                @XmlSchemaType(name = "anySimpleType")
                protected String url;

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
                 * 获取url属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getURL() {
                    return url;
                }

                /**
                 * 设置url属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setURL(String value) {
                    this.url = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerCountGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DriverType {

            @XmlAttribute(name = "Age")
            protected Integer age;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "URI")
            @XmlSchemaType(name = "anyURI")
            protected String uri;
            @XmlAttribute(name = "PTCSubType")
            protected String ptcSubType;
            @XmlAttribute(name = "Virtual")
            protected Boolean virtual;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;

            /**
             * 获取age属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAge() {
                return age;
            }

            /**
             * 设置age属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAge(Integer value) {
                this.age = value;
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
             * 获取uri属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getURI() {
                return uri;
            }

            /**
             * 设置uri属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setURI(String value) {
                this.uri = value;
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

            /**
             * 获取virtual属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isVirtual() {
                return virtual;
            }

            /**
             * 设置virtual属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setVirtual(Boolean value) {
                this.virtual = value;
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

}
