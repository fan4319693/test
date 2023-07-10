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
 * <p>AirAncillaryProductType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirAncillaryProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Restrictions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PassengerType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}TravelerCodes" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CabinClass" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LoyaltyPrograms" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LoyaltyProgram" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyProgramType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TravelerIDRef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductDescriptiveContent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Baggage" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MaxWeight" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                     &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MaxDimensions" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Length" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                               &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Height" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                               &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Width" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                               &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="LCM" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MinWeight" type="{http://www.opentravel.org/OTA/2003/05}BaggageWeightType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="MinDimensions" type="{http://www.opentravel.org/OTA/2003/05}BaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="CategoryType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="InventoryType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="IATACode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Content" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductLocalisedContentType" minOccurs="0"/>
 *         &lt;element name="CarbonOffsets" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryOffsetProductType" minOccurs="0"/>
 *         &lt;element name="DefaultContent" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductLocalisedContentType" minOccurs="0"/>
 *         &lt;element name="EligibleItem" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryEligibleItemType" minOccurs="0"/>
 *         &lt;element name="Lounge" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryLoungeProductType" minOccurs="0"/>
 *         &lt;element name="AncillaryProducts" type="{http://www.opentravel.org/OTA/2003/05}AncillaryProductsType" minOccurs="0"/>
 *         &lt;element name="Prices" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductPricesType" minOccurs="0"/>
 *         &lt;element name="PaxChangeFees" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductPaxChangeFeesType" minOccurs="0"/>
 *         &lt;element name="TravelerInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AirTraveler" type="{http://www.opentravel.org/OTA/2003/05}AirTravelerType"/>
 *                   &lt;element name="SpecialReqDetails" type="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *         &lt;element name="ProductGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductGroup" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Content" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductLocalisedContentType"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="GroupCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="GroupsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExchangeRate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightSegment" type="{http://www.opentravel.org/OTA/2003/05}FlightSegmentWithPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GroundTransportService" type="{http://www.opentravel.org/OTA/2003/05}GroundTransportServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServiceRPHs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" minOccurs="0"/>
 *         &lt;element name="TravelerInputs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TravelerInput" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyDetailsPricingType" minOccurs="0"/>
 *         &lt;element name="SupplierBookingReferenceID" type="{http://www.opentravel.org/OTA/2003/05}SupplierBookingReferenceIDType" minOccurs="0"/>
 *         &lt;element name="QRData" type="{http://www.opentravel.org/OTA/2003/05}QRDataType" minOccurs="0"/>
 *         &lt;element name="OriginalFlightSegment" type="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SupplierDescriptiveContent" type="{http://www.opentravel.org/OTA/2003/05}SupplierDescriptiveContentType" minOccurs="0"/>
 *         &lt;element name="OnBoard" type="{http://www.opentravel.org/OTA/2003/05}OnBoardAncillaryType" minOccurs="0"/>
 *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SaleModelGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TSAncillaryProductGroup"/>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaxItemsPerPax">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AncillaryProductStatusType" />
 *       &lt;attribute name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Category" use="required" type="{http://www.opentravel.org/OTA/2003/05}AncillaryProductCategoryType" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Available" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Airport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
 *       &lt;attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SellingProposition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProductAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}AirportAncillaryDirection" />
 *       &lt;attribute name="ProductSequence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SupplierProductCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProductRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="BundleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Destination" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VoucherRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AvailableFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="AvailableTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ConsumptionStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ConsumptionEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirAncillaryProductType", propOrder = {
    "restrictions",
    "productDescriptiveContent",
    "content",
    "carbonOffsets",
    "defaultContent",
    "eligibleItem",
    "lounge",
    "ancillaryProducts",
    "prices",
    "paxChangeFees",
    "travelerInfo",
    "attributes",
    "productGroups",
    "exchangeRate",
    "flightSegment",
    "groundTransportService",
    "serviceRPHs",
    "contact",
    "travelerInputs",
    "loyalty",
    "supplierBookingReferenceID",
    "qrData",
    "originalFlightSegment",
    "supplierDescriptiveContent",
    "onBoard",
    "ticketing"
})
public class AirAncillaryProductType {

    @XmlElement(name = "Restrictions")
    protected AirAncillaryProductType.Restrictions restrictions;
    @XmlElement(name = "ProductDescriptiveContent")
    protected AirAncillaryProductType.ProductDescriptiveContent productDescriptiveContent;
    @XmlElement(name = "Content")
    protected AirAncillaryProductLocalisedContentType content;
    @XmlElement(name = "CarbonOffsets")
    protected AirAncillaryOffsetProductType carbonOffsets;
    @XmlElement(name = "DefaultContent")
    protected AirAncillaryProductLocalisedContentType defaultContent;
    @XmlElement(name = "EligibleItem")
    protected AirAncillaryEligibleItemType eligibleItem;
    @XmlElement(name = "Lounge")
    protected AirAncillaryLoungeProductType lounge;
    @XmlElement(name = "AncillaryProducts")
    protected AncillaryProductsType ancillaryProducts;
    @XmlElement(name = "Prices")
    protected AirAncillaryProductPricesType prices;
    @XmlElement(name = "PaxChangeFees")
    protected AirAncillaryProductPaxChangeFeesType paxChangeFees;
    @XmlElement(name = "TravelerInfo")
    protected AirAncillaryProductType.TravelerInfo travelerInfo;
    @XmlElement(name = "Attributes")
    protected AirAncillaryProductType.Attributes attributes;
    @XmlElement(name = "ProductGroups")
    protected AirAncillaryProductType.ProductGroups productGroups;
    @XmlElement(name = "ExchangeRate")
    protected List<AirAncillaryProductType.ExchangeRate> exchangeRate;
    @XmlElement(name = "FlightSegment")
    protected List<FlightSegmentWithPrice> flightSegment;
    @XmlElement(name = "GroundTransportService")
    protected List<GroundTransportServiceType> groundTransportService;
    @XmlElement(name = "ServiceRPHs")
    protected AirAncillaryProductType.ServiceRPHs serviceRPHs;
    @XmlElement(name = "Contact")
    protected ContactPersonType contact;
    @XmlElement(name = "TravelerInputs")
    protected AirAncillaryProductType.TravelerInputs travelerInputs;
    @XmlElement(name = "Loyalty")
    protected LoyaltyDetailsPricingType loyalty;
    @XmlElement(name = "SupplierBookingReferenceID")
    protected SupplierBookingReferenceIDType supplierBookingReferenceID;
    @XmlElement(name = "QRData")
    protected QRDataType qrData;
    @XmlElement(name = "OriginalFlightSegment")
    protected List<BookFlightSegmentType> originalFlightSegment;
    @XmlElement(name = "SupplierDescriptiveContent")
    protected SupplierDescriptiveContentType supplierDescriptiveContent;
    @XmlElement(name = "OnBoard")
    protected OnBoardAncillaryType onBoard;
    @XmlElement(name = "Ticketing")
    protected List<TicketingInfoType> ticketing;
    @XmlAttribute(name = "Version")
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "MaxItemsPerPax")
    protected BigInteger maxItemsPerPax;
    @XmlAttribute(name = "Status")
    protected AncillaryProductStatusType status;
    @XmlAttribute(name = "BookingStatus")
    protected String bookingStatus;
    @XmlAttribute(name = "BookingReferenceID")
    protected String bookingReferenceID;
    @XmlAttribute(name = "Category", required = true)
    protected AncillaryProductCategoryType category;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Tag")
    protected String tag;
    @XmlAttribute(name = "Available")
    protected Integer available;
    @XmlAttribute(name = "SSRCode")
    protected String ssrCode;
    @XmlAttribute(name = "ExcessLast")
    protected Integer excessLast;
    @XmlAttribute(name = "ExcessFirst")
    protected Integer excessFirst;
    @XmlAttribute(name = "Quantity")
    protected Integer quantity;
    @XmlAttribute(name = "BookingChannel")
    protected String bookingChannel;
    @XmlAttribute(name = "Airport")
    protected String airport;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "CabinClass")
    protected String cabinClass;
    @XmlAttribute(name = "Terminal")
    protected String terminal;
    @XmlAttribute(name = "Carrier")
    protected String carrier;
    @XmlAttribute(name = "Priority")
    protected Integer priority;
    @XmlAttribute(name = "ProfileType")
    protected String profileType;
    @XmlAttribute(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "SubType")
    protected String subType;
    @XmlAttribute(name = "SellingProposition")
    protected String sellingProposition;
    @XmlAttribute(name = "ProductAvailability")
    protected Boolean productAvailability;
    @XmlAttribute(name = "Direction")
    protected AirportAncillaryDirection direction;
    @XmlAttribute(name = "ProductSequence")
    protected String productSequence;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "SupplierProductCode")
    protected String supplierProductCode;
    @XmlAttribute(name = "ProductRPH", required = true)
    protected String productRPH;
    @XmlAttribute(name = "BundleCode")
    protected String bundleCode;
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    @XmlAttribute(name = "OriginDestinationRPH")
    protected String originDestinationRPH;
    @XmlAttribute(name = "FlightSegmentRPH")
    protected String flightSegmentRPH;
    @XmlAttribute(name = "VoucherRequired")
    protected Boolean voucherRequired;
    @XmlAttribute(name = "AvailableFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar availableFrom;
    @XmlAttribute(name = "AvailableTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar availableTo;
    @XmlAttribute(name = "ConsumptionStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar consumptionStartDate;
    @XmlAttribute(name = "ConsumptionEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar consumptionEndDate;
    @XmlAttribute(name = "SaleModel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String saleModel;
    @XmlAttribute(name = "Cancelable")
    protected Boolean cancelable;
    @XmlAttribute(name = "isSegBind")
    protected Boolean isSegBind;
    @XmlAttribute(name = "Refundable")
    protected Boolean refundable;

    /**
     * 获取restrictions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductType.Restrictions }
     *     
     */
    public AirAncillaryProductType.Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * 设置restrictions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductType.Restrictions }
     *     
     */
    public void setRestrictions(AirAncillaryProductType.Restrictions value) {
        this.restrictions = value;
    }

    /**
     * 获取productDescriptiveContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductType.ProductDescriptiveContent }
     *     
     */
    public AirAncillaryProductType.ProductDescriptiveContent getProductDescriptiveContent() {
        return productDescriptiveContent;
    }

    /**
     * 设置productDescriptiveContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductType.ProductDescriptiveContent }
     *     
     */
    public void setProductDescriptiveContent(AirAncillaryProductType.ProductDescriptiveContent value) {
        this.productDescriptiveContent = value;
    }

    /**
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductLocalisedContentType }
     *     
     */
    public AirAncillaryProductLocalisedContentType getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductLocalisedContentType }
     *     
     */
    public void setContent(AirAncillaryProductLocalisedContentType value) {
        this.content = value;
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
     * 获取defaultContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductLocalisedContentType }
     *     
     */
    public AirAncillaryProductLocalisedContentType getDefaultContent() {
        return defaultContent;
    }

    /**
     * 设置defaultContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductLocalisedContentType }
     *     
     */
    public void setDefaultContent(AirAncillaryProductLocalisedContentType value) {
        this.defaultContent = value;
    }

    /**
     * 获取eligibleItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryEligibleItemType }
     *     
     */
    public AirAncillaryEligibleItemType getEligibleItem() {
        return eligibleItem;
    }

    /**
     * 设置eligibleItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryEligibleItemType }
     *     
     */
    public void setEligibleItem(AirAncillaryEligibleItemType value) {
        this.eligibleItem = value;
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
     * 获取ancillaryProducts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AncillaryProductsType }
     *     
     */
    public AncillaryProductsType getAncillaryProducts() {
        return ancillaryProducts;
    }

    /**
     * 设置ancillaryProducts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryProductsType }
     *     
     */
    public void setAncillaryProducts(AncillaryProductsType value) {
        this.ancillaryProducts = value;
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
     * 获取paxChangeFees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductPaxChangeFeesType }
     *     
     */
    public AirAncillaryProductPaxChangeFeesType getPaxChangeFees() {
        return paxChangeFees;
    }

    /**
     * 设置paxChangeFees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductPaxChangeFeesType }
     *     
     */
    public void setPaxChangeFees(AirAncillaryProductPaxChangeFeesType value) {
        this.paxChangeFees = value;
    }

    /**
     * 获取travelerInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductType.TravelerInfo }
     *     
     */
    public AirAncillaryProductType.TravelerInfo getTravelerInfo() {
        return travelerInfo;
    }

    /**
     * 设置travelerInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductType.TravelerInfo }
     *     
     */
    public void setTravelerInfo(AirAncillaryProductType.TravelerInfo value) {
        this.travelerInfo = value;
    }

    /**
     * 获取attributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductType.Attributes }
     *     
     */
    public AirAncillaryProductType.Attributes getAttributes() {
        return attributes;
    }

    /**
     * 设置attributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductType.Attributes }
     *     
     */
    public void setAttributes(AirAncillaryProductType.Attributes value) {
        this.attributes = value;
    }

    /**
     * 获取productGroups属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductType.ProductGroups }
     *     
     */
    public AirAncillaryProductType.ProductGroups getProductGroups() {
        return productGroups;
    }

    /**
     * 设置productGroups属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductType.ProductGroups }
     *     
     */
    public void setProductGroups(AirAncillaryProductType.ProductGroups value) {
        this.productGroups = value;
    }

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
     * {@link AirAncillaryProductType.ExchangeRate }
     * 
     * 
     */
    public List<AirAncillaryProductType.ExchangeRate> getExchangeRate() {
        if (exchangeRate == null) {
            exchangeRate = new ArrayList<AirAncillaryProductType.ExchangeRate>();
        }
        return this.exchangeRate;
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
     * Gets the value of the groundTransportService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groundTransportService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroundTransportService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroundTransportServiceType }
     * 
     * 
     */
    public List<GroundTransportServiceType> getGroundTransportService() {
        if (groundTransportService == null) {
            groundTransportService = new ArrayList<GroundTransportServiceType>();
        }
        return this.groundTransportService;
    }

    /**
     * 获取serviceRPHs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductType.ServiceRPHs }
     *     
     */
    public AirAncillaryProductType.ServiceRPHs getServiceRPHs() {
        return serviceRPHs;
    }

    /**
     * 设置serviceRPHs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductType.ServiceRPHs }
     *     
     */
    public void setServiceRPHs(AirAncillaryProductType.ServiceRPHs value) {
        this.serviceRPHs = value;
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
     * 获取travelerInputs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductType.TravelerInputs }
     *     
     */
    public AirAncillaryProductType.TravelerInputs getTravelerInputs() {
        return travelerInputs;
    }

    /**
     * 设置travelerInputs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductType.TravelerInputs }
     *     
     */
    public void setTravelerInputs(AirAncillaryProductType.TravelerInputs value) {
        this.travelerInputs = value;
    }

    /**
     * 获取loyalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyDetailsPricingType }
     *     
     */
    public LoyaltyDetailsPricingType getLoyalty() {
        return loyalty;
    }

    /**
     * 设置loyalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyDetailsPricingType }
     *     
     */
    public void setLoyalty(LoyaltyDetailsPricingType value) {
        this.loyalty = value;
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
     * 获取onBoard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OnBoardAncillaryType }
     *     
     */
    public OnBoardAncillaryType getOnBoard() {
        return onBoard;
    }

    /**
     * 设置onBoard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OnBoardAncillaryType }
     *     
     */
    public void setOnBoard(OnBoardAncillaryType value) {
        this.onBoard = value;
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
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     * 获取maxItemsPerPax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxItemsPerPax() {
        return maxItemsPerPax;
    }

    /**
     * 设置maxItemsPerPax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxItemsPerPax(BigInteger value) {
        this.maxItemsPerPax = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AncillaryProductStatusType }
     *     
     */
    public AncillaryProductStatusType getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryProductStatusType }
     *     
     */
    public void setStatus(AncillaryProductStatusType value) {
        this.status = value;
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
     * 获取available属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * 设置available属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailable(Integer value) {
        this.available = value;
    }

    /**
     * 获取ssrCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * 设置ssrCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

    /**
     * 获取excessLast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessLast() {
        return excessLast;
    }

    /**
     * 设置excessLast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessLast(Integer value) {
        this.excessLast = value;
    }

    /**
     * 获取excessFirst属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessFirst() {
        return excessFirst;
    }

    /**
     * 设置excessFirst属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessFirst(Integer value) {
        this.excessFirst = value;
    }

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
     * 获取priority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * 获取profileType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * 设置profileType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
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
     * 获取productAvailability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductAvailability() {
        return productAvailability;
    }

    /**
     * 设置productAvailability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductAvailability(Boolean value) {
        this.productAvailability = value;
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
     * 获取productRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRPH() {
        return productRPH;
    }

    /**
     * 设置productRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRPH(String value) {
        this.productRPH = value;
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
     * 获取availableFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailableFrom() {
        return availableFrom;
    }

    /**
     * 设置availableFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailableFrom(XMLGregorianCalendar value) {
        this.availableFrom = value;
    }

    /**
     * 获取availableTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailableTo() {
        return availableTo;
    }

    /**
     * 设置availableTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailableTo(XMLGregorianCalendar value) {
        this.availableTo = value;
    }

    /**
     * 获取consumptionStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConsumptionStartDate() {
        return consumptionStartDate;
    }

    /**
     * 设置consumptionStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConsumptionStartDate(XMLGregorianCalendar value) {
        this.consumptionStartDate = value;
    }

    /**
     * 获取consumptionEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConsumptionEndDate() {
        return consumptionEndDate;
    }

    /**
     * 设置consumptionEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConsumptionEndDate(XMLGregorianCalendar value) {
        this.consumptionEndDate = value;
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
        protected List<AirAncillaryProductType.Attributes.Attribute> attribute;

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
         * {@link AirAncillaryProductType.Attributes.Attribute }
         * 
         * 
         */
        public List<AirAncillaryProductType.Attributes.Attribute> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<AirAncillaryProductType.Attributes.Attribute>();
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
     *         &lt;element name="Baggage" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MaxWeight" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                           &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MaxDimensions" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Length" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Height" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Width" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="LCM" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MinWeight" type="{http://www.opentravel.org/OTA/2003/05}BaggageWeightType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="MinDimensions" type="{http://www.opentravel.org/OTA/2003/05}BaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="CategoryType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="InventoryType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="IATACode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "baggage"
    })
    public static class ProductDescriptiveContent {

        @XmlElement(name = "Baggage")
        protected AirAncillaryProductType.ProductDescriptiveContent.Baggage baggage;
        @XmlAttribute(name = "SupplierCode")
        @XmlSchemaType(name = "anySimpleType")
        protected String supplierCode;
        @XmlAttribute(name = "Tag")
        @XmlSchemaType(name = "anySimpleType")
        protected String tag;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;
        @XmlAttribute(name = "CategoryType", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String categoryType;
        @XmlAttribute(name = "Name", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String name;
        @XmlAttribute(name = "Code", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String code;
        @XmlAttribute(name = "InventoryType", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String inventoryType;
        @XmlAttribute(name = "Enabled", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String enabled;
        @XmlAttribute(name = "IATACode")
        @XmlSchemaType(name = "anySimpleType")
        protected String iataCode;
        @XmlAttribute(name = "Priority")
        @XmlSchemaType(name = "anySimpleType")
        protected String priority;
        @XmlAttribute(name = "ProfileType")
        @XmlSchemaType(name = "anySimpleType")
        protected String profileType;

        /**
         * 获取baggage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage }
         *     
         */
        public AirAncillaryProductType.ProductDescriptiveContent.Baggage getBaggage() {
            return baggage;
        }

        /**
         * 设置baggage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage }
         *     
         */
        public void setBaggage(AirAncillaryProductType.ProductDescriptiveContent.Baggage value) {
            this.baggage = value;
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
         * 获取categoryType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoryType() {
            return categoryType;
        }

        /**
         * 设置categoryType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoryType(String value) {
            this.categoryType = value;
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
         * 获取inventoryType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInventoryType() {
            return inventoryType;
        }

        /**
         * 设置inventoryType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInventoryType(String value) {
            this.inventoryType = value;
        }

        /**
         * 获取enabled属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnabled() {
            return enabled;
        }

        /**
         * 设置enabled属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnabled(String value) {
            this.enabled = value;
        }

        /**
         * 获取iataCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIATACode() {
            return iataCode;
        }

        /**
         * 设置iataCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIATACode(String value) {
            this.iataCode = value;
        }

        /**
         * 获取priority属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriority() {
            return priority;
        }

        /**
         * 设置priority属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriority(String value) {
            this.priority = value;
        }

        /**
         * 获取profileType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfileType() {
            return profileType;
        }

        /**
         * 设置profileType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfileType(String value) {
            this.profileType = value;
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
         *                 &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MaxDimensions" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Length" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Height" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Width" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="LCM" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MinWeight" type="{http://www.opentravel.org/OTA/2003/05}BaggageWeightType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="MinDimensions" type="{http://www.opentravel.org/OTA/2003/05}BaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
            "maxWeight",
            "maxDimensions",
            "minWeight",
            "minDimensions",
            "excessFirst",
            "excessLast"
        })
        public static class Baggage {

            @XmlElement(name = "MaxWeight")
            protected List<AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxWeight> maxWeight;
            @XmlElement(name = "MaxDimensions")
            protected List<AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions> maxDimensions;
            @XmlElement(name = "MinWeight")
            protected List<BaggageWeightType> minWeight;
            @XmlElement(name = "MinDimensions")
            protected List<BaggageDimensionsType> minDimensions;
            @XmlElement(name = "ExcessFirst")
            protected BigInteger excessFirst;
            @XmlElement(name = "ExcessLast")
            protected BigInteger excessLast;

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
             * {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxWeight }
             * 
             * 
             */
            public List<AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxWeight> getMaxWeight() {
                if (maxWeight == null) {
                    maxWeight = new ArrayList<AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxWeight>();
                }
                return this.maxWeight;
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
             * {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions }
             * 
             * 
             */
            public List<AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions> getMaxDimensions() {
                if (maxDimensions == null) {
                    maxDimensions = new ArrayList<AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions>();
                }
                return this.maxDimensions;
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
             * {@link BaggageDimensionsType }
             * 
             * 
             */
            public List<BaggageDimensionsType> getMinDimensions() {
                if (minDimensions == null) {
                    minDimensions = new ArrayList<BaggageDimensionsType>();
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Length" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Height" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Width" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="LCM" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "length",
                "height",
                "width"
            })
            public static class MaxDimensions {

                @XmlElement(name = "Length")
                protected AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Length length;
                @XmlElement(name = "Height")
                protected AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Height height;
                @XmlElement(name = "Width")
                protected AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Width width;
                @XmlAttribute(name = "Units", required = true)
                protected String units;
                @XmlAttribute(name = "LCM")
                protected BigInteger lcm;

                /**
                 * 获取length属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Length }
                 *     
                 */
                public AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Length getLength() {
                    return length;
                }

                /**
                 * 设置length属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Length }
                 *     
                 */
                public void setLength(AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Length value) {
                    this.length = value;
                }

                /**
                 * 获取height属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Height }
                 *     
                 */
                public AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Height getHeight() {
                    return height;
                }

                /**
                 * 设置height属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Height }
                 *     
                 */
                public void setHeight(AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Height value) {
                    this.height = value;
                }

                /**
                 * 获取width属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Width }
                 *     
                 */
                public AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Width getWidth() {
                    return width;
                }

                /**
                 * 设置width属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Width }
                 *     
                 */
                public void setWidth(AirAncillaryProductType.ProductDescriptiveContent.Baggage.MaxDimensions.Width value) {
                    this.width = value;
                }

                /**
                 * 获取units属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnits() {
                    return units;
                }

                /**
                 * 设置units属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnits(String value) {
                    this.units = value;
                }

                /**
                 * 获取lcm属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getLCM() {
                    return lcm;
                }

                /**
                 * 设置lcm属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setLCM(BigInteger value) {
                    this.lcm = value;
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
                 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class Height {

                    @XmlValue
                    protected BigDecimal value;
                    @XmlAttribute(name = "Type")
                    protected String type;

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
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class Length {

                    @XmlValue
                    protected BigDecimal value;
                    @XmlAttribute(name = "Type")
                    protected String type;

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
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class Width {

                    @XmlValue
                    protected BigDecimal value;
                    @XmlAttribute(name = "Type")
                    protected String type;

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
             *       &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                protected String unit;

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
                 *     {@link String }
                 *     
                 */
                public String getUnit() {
                    return unit;
                }

                /**
                 * 设置unit属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnit(String value) {
                    this.unit = value;
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
     *         &lt;element name="ProductGroup" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Content" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductLocalisedContentType"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="GroupCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="GroupsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "productGroup"
    })
    public static class ProductGroups {

        @XmlElement(name = "ProductGroup")
        protected List<AirAncillaryProductType.ProductGroups.ProductGroup> productGroup;
        @XmlAttribute(name = "GroupsCode")
        protected String groupsCode;

        /**
         * Gets the value of the productGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirAncillaryProductType.ProductGroups.ProductGroup }
         * 
         * 
         */
        public List<AirAncillaryProductType.ProductGroups.ProductGroup> getProductGroup() {
            if (productGroup == null) {
                productGroup = new ArrayList<AirAncillaryProductType.ProductGroups.ProductGroup>();
            }
            return this.productGroup;
        }

        /**
         * 获取groupsCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupsCode() {
            return groupsCode;
        }

        /**
         * 设置groupsCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupsCode(String value) {
            this.groupsCode = value;
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
         *         &lt;element name="Content" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductLocalisedContentType"/>
         *       &lt;/sequence>
         *       &lt;attribute name="GroupCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class ProductGroup {

            @XmlElement(name = "Content", required = true)
            protected AirAncillaryProductLocalisedContentType content;
            @XmlAttribute(name = "GroupCode", required = true)
            protected String groupCode;

            /**
             * 获取content属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AirAncillaryProductLocalisedContentType }
             *     
             */
            public AirAncillaryProductLocalisedContentType getContent() {
                return content;
            }

            /**
             * 设置content属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AirAncillaryProductLocalisedContentType }
             *     
             */
            public void setContent(AirAncillaryProductLocalisedContentType value) {
                this.content = value;
            }

            /**
             * 获取groupCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupCode() {
                return groupCode;
            }

            /**
             * 设置groupCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupCode(String value) {
                this.groupCode = value;
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
     *         &lt;element name="PassengerType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}TravelerCodes" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CabinClass" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LoyaltyPrograms" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LoyaltyProgram" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyProgramType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TravelerIDRef" maxOccurs="unbounded" minOccurs="0"/>
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
        "passengerType",
        "cabinClass",
        "loyaltyPrograms",
        "travelerIDRef"
    })
    public static class Restrictions {

        @XmlElement(name = "PassengerType")
        protected List<AirAncillaryProductType.Restrictions.PassengerType> passengerType;
        @XmlElement(name = "CabinClass")
        protected List<AirAncillaryProductType.Restrictions.CabinClass> cabinClass;
        @XmlElement(name = "LoyaltyPrograms")
        protected AirAncillaryProductType.Restrictions.LoyaltyPrograms loyaltyPrograms;
        @XmlElement(name = "TravelerIDRef")
        protected List<TravelerIDRefType> travelerIDRef;

        /**
         * Gets the value of the passengerType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirAncillaryProductType.Restrictions.PassengerType }
         * 
         * 
         */
        public List<AirAncillaryProductType.Restrictions.PassengerType> getPassengerType() {
            if (passengerType == null) {
                passengerType = new ArrayList<AirAncillaryProductType.Restrictions.PassengerType>();
            }
            return this.passengerType;
        }

        /**
         * Gets the value of the cabinClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirAncillaryProductType.Restrictions.CabinClass }
         * 
         * 
         */
        public List<AirAncillaryProductType.Restrictions.CabinClass> getCabinClass() {
            if (cabinClass == null) {
                cabinClass = new ArrayList<AirAncillaryProductType.Restrictions.CabinClass>();
            }
            return this.cabinClass;
        }

        /**
         * 获取loyaltyPrograms属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirAncillaryProductType.Restrictions.LoyaltyPrograms }
         *     
         */
        public AirAncillaryProductType.Restrictions.LoyaltyPrograms getLoyaltyPrograms() {
            return loyaltyPrograms;
        }

        /**
         * 设置loyaltyPrograms属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirAncillaryProductType.Restrictions.LoyaltyPrograms }
         *     
         */
        public void setLoyaltyPrograms(AirAncillaryProductType.Restrictions.LoyaltyPrograms value) {
            this.loyaltyPrograms = value;
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
         * {@link TravelerIDRefType }
         * 
         * 
         */
        public List<TravelerIDRefType> getTravelerIDRef() {
            if (travelerIDRef == null) {
                travelerIDRef = new ArrayList<TravelerIDRefType>();
            }
            return this.travelerIDRef;
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CabinClass {

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
         *         &lt;element name="LoyaltyProgram" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyProgramType" maxOccurs="unbounded"/>
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
            "loyaltyProgram"
        })
        public static class LoyaltyPrograms {

            @XmlElement(name = "LoyaltyProgram", required = true)
            protected List<LoyaltyProgramType> loyaltyProgram;

            /**
             * Gets the value of the loyaltyProgram property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the loyaltyProgram property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLoyaltyProgram().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LoyaltyProgramType }
             * 
             * 
             */
            public List<LoyaltyProgramType> getLoyaltyProgram() {
                if (loyaltyProgram == null) {
                    loyaltyProgram = new ArrayList<LoyaltyProgramType>();
                }
                return this.loyaltyProgram;
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
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}TravelerCodes" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PassengerType {

            @XmlAttribute(name = "Code", required = true)
            protected TravelerCodes code;

            /**
             * 获取code属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TravelerCodes }
             *     
             */
            public TravelerCodes getCode() {
                return code;
            }

            /**
             * 设置code属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TravelerCodes }
             *     
             */
            public void setCode(TravelerCodes value) {
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
     *         &lt;element name="ServiceRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" maxOccurs="unbounded"/>
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
        "serviceRPH"
    })
    public static class ServiceRPHs {

        @XmlElement(name = "ServiceRPH", required = true)
        protected List<String> serviceRPH;

        /**
         * Gets the value of the serviceRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getServiceRPH() {
            if (serviceRPH == null) {
                serviceRPH = new ArrayList<String>();
            }
            return this.serviceRPH;
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
     *         &lt;element name="AirTraveler" type="{http://www.opentravel.org/OTA/2003/05}AirTravelerType"/>
     *         &lt;element name="SpecialReqDetails" type="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType" maxOccurs="unbounded" minOccurs="0"/>
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
        "airTraveler",
        "specialReqDetails"
    })
    public static class TravelerInfo {

        @XmlElement(name = "AirTraveler", required = true)
        protected AirTravelerType airTraveler;
        @XmlElement(name = "SpecialReqDetails")
        protected List<SpecialReqDetailsType> specialReqDetails;

        /**
         * 获取airTraveler属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirTravelerType }
         *     
         */
        public AirTravelerType getAirTraveler() {
            return airTraveler;
        }

        /**
         * 设置airTraveler属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirTravelerType }
         *     
         */
        public void setAirTraveler(AirTravelerType value) {
            this.airTraveler = value;
        }

        /**
         * Gets the value of the specialReqDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialReqDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialReqDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialReqDetailsType }
         * 
         * 
         */
        public List<SpecialReqDetailsType> getSpecialReqDetails() {
            if (specialReqDetails == null) {
                specialReqDetails = new ArrayList<SpecialReqDetailsType>();
            }
            return this.specialReqDetails;
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
     *         &lt;element name="TravelerInput" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "travelerInput"
    })
    public static class TravelerInputs {

        @XmlElement(name = "TravelerInput")
        protected List<AirAncillaryProductType.TravelerInputs.TravelerInput> travelerInput;

        /**
         * Gets the value of the travelerInput property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelerInput property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelerInput().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirAncillaryProductType.TravelerInputs.TravelerInput }
         * 
         * 
         */
        public List<AirAncillaryProductType.TravelerInputs.TravelerInput> getTravelerInput() {
            if (travelerInput == null) {
                travelerInput = new ArrayList<AirAncillaryProductType.TravelerInputs.TravelerInput>();
            }
            return this.travelerInput;
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
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TravelerInput {

            @XmlAttribute(name = "Code", required = true)
            protected String code;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "Mandatory", required = true)
            protected boolean mandatory;

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

            /**
             * 获取mandatory属性的值。
             * 
             */
            public boolean isMandatory() {
                return mandatory;
            }

            /**
             * 设置mandatory属性的值。
             * 
             */
            public void setMandatory(boolean value) {
                this.mandatory = value;
            }

        }

    }

}
