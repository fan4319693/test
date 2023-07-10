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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Package" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Accomodation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Room" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Price" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Original">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Pricing">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PriceAdjustments" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="PriceAdjustment" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                                                   &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Selling">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Modular">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Original">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Pricing">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Selling">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PriceAdjustments" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PriceAdjustment" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                               &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="RoomStay" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
 *                                               &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="RedemptionChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="EarnChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                     &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                                     &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="AmountChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="RangeNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="CheckoutDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="Display" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                     &lt;attribute name="OriginalCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="Rate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                     &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ChainCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
 *                           &lt;attribute name="HotelCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                           &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="StarRating" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="ApartmentInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Vehicles" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Vehicle" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Price" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Original">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Pricing">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Selling">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Modular">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Original">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Pricing">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Selling">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PriceAdjustments" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                               &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="VehAvail" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="VehAvailCore">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType">
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                                                 &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/>
 *                                                 &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="RedemptionChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="EarnChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="Category" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                     &lt;attribute name="Size" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                     &lt;attribute name="Reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                     &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                                     &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="AmountChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="PickUpDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                                     &lt;attribute name="ReturnDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Display" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                     &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="Num24HourPeriods" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                     &lt;attribute name="RangeNum" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                     &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Nights" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Flights" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Price" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Modular">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                             &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="PricedItinerary" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ExchangeRate" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ReportingExchangeRates" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="OutboundSegmentReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="InboundSegmentReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Airline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="CheckoutDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                     &lt;attribute name="Num24HourPeriods" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                     &lt;attribute name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="VehicleRangeNum" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                     &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RedemptionChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="EarnChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="Currency" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                           &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="AmountChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="CheckoutDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="DepartureAirport" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
 *                           &lt;attribute name="PickUpLocation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="SupplierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
 *                           &lt;attribute name="Num24HourPeriods" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
 *                           &lt;attribute name="OriginalCurrency" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
 *                           &lt;attribute name="Rate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="VehicleRangeNum" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Extras" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Extra" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                       &lt;element name="DestActivityDescriptiveContent" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ExchangeRate" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ReportingExchangeRates" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Price" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Modular">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                 &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                 &lt;attribute name="Reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RangeNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PricedItineraries" type="{http://www.opentravel.org/OTA/2003/05}PricedItinerariesType" minOccurs="0"/>
 *         &lt;element name="RoomStays" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomStay" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
 *                           &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MoreIndicator" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehAvails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehAvail" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VehAvailCore">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType">
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                             &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/>
 *                             &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DestActivityDescriptiveContents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DestActivityDescriptiveContent" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType">
 *                           &lt;sequence>
 *                             &lt;element name="ExchangeRate" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ReportingExchangeRates" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
    "_package",
    "pricedItineraries",
    "roomStays",
    "vehAvails",
    "destActivityDescriptiveContents"
})
@XmlRootElement(name = "SearchResponse")
public class SearchResponse {

    @XmlElement(name = "Package")
    protected List<SearchResponse.Package> _package;
    @XmlElement(name = "PricedItineraries")
    protected PricedItinerariesType pricedItineraries;
    @XmlElement(name = "RoomStays")
    protected SearchResponse.RoomStays roomStays;
    @XmlElement(name = "VehAvails")
    protected SearchResponse.VehAvails vehAvails;
    @XmlElement(name = "DestActivityDescriptiveContents")
    protected SearchResponse.DestActivityDescriptiveContents destActivityDescriptiveContents;

    /**
     * Gets the value of the package property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchResponse.Package }
     * 
     * 
     */
    public List<SearchResponse.Package> getPackage() {
        if (_package == null) {
            _package = new ArrayList<SearchResponse.Package>();
        }
        return this._package;
    }

    /**
     * 获取pricedItineraries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricedItinerariesType }
     *     
     */
    public PricedItinerariesType getPricedItineraries() {
        return pricedItineraries;
    }

    /**
     * 设置pricedItineraries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricedItinerariesType }
     *     
     */
    public void setPricedItineraries(PricedItinerariesType value) {
        this.pricedItineraries = value;
    }

    /**
     * 获取roomStays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchResponse.RoomStays }
     *     
     */
    public SearchResponse.RoomStays getRoomStays() {
        return roomStays;
    }

    /**
     * 设置roomStays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResponse.RoomStays }
     *     
     */
    public void setRoomStays(SearchResponse.RoomStays value) {
        this.roomStays = value;
    }

    /**
     * 获取vehAvails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchResponse.VehAvails }
     *     
     */
    public SearchResponse.VehAvails getVehAvails() {
        return vehAvails;
    }

    /**
     * 设置vehAvails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResponse.VehAvails }
     *     
     */
    public void setVehAvails(SearchResponse.VehAvails value) {
        this.vehAvails = value;
    }

    /**
     * 获取destActivityDescriptiveContents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchResponse.DestActivityDescriptiveContents }
     *     
     */
    public SearchResponse.DestActivityDescriptiveContents getDestActivityDescriptiveContents() {
        return destActivityDescriptiveContents;
    }

    /**
     * 设置destActivityDescriptiveContents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResponse.DestActivityDescriptiveContents }
     *     
     */
    public void setDestActivityDescriptiveContents(SearchResponse.DestActivityDescriptiveContents value) {
        this.destActivityDescriptiveContents = value;
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
     *         &lt;element name="DestActivityDescriptiveContent" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType">
     *                 &lt;sequence>
     *                   &lt;element name="ExchangeRate" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ReportingExchangeRates" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "destActivityDescriptiveContent"
    })
    public static class DestActivityDescriptiveContents {

        @XmlElement(name = "DestActivityDescriptiveContent", required = true)
        protected List<SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent> destActivityDescriptiveContent;

        /**
         * Gets the value of the destActivityDescriptiveContent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the destActivityDescriptiveContent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDestActivityDescriptiveContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent }
         * 
         * 
         */
        public List<SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent> getDestActivityDescriptiveContent() {
            if (destActivityDescriptiveContent == null) {
                destActivityDescriptiveContent = new ArrayList<SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent>();
            }
            return this.destActivityDescriptiveContent;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType">
         *       &lt;sequence>
         *         &lt;element name="ExchangeRate" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ReportingExchangeRates" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
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
            "reportingExchangeRates"
        })
        public static class DestActivityDescriptiveContent
            extends DestActivityDescriptiveContentType
        {

            @XmlElement(name = "ExchangeRate")
            protected SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ExchangeRate exchangeRate;
            @XmlElement(name = "ReportingExchangeRates")
            protected SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ReportingExchangeRates reportingExchangeRates;

            /**
             * 获取exchangeRate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ExchangeRate }
             *     
             */
            public SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ExchangeRate getExchangeRate() {
                return exchangeRate;
            }

            /**
             * 设置exchangeRate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ExchangeRate }
             *     
             */
            public void setExchangeRate(SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ExchangeRate value) {
                this.exchangeRate = value;
            }

            /**
             * 获取reportingExchangeRates属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ReportingExchangeRates }
             *     
             */
            public SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ReportingExchangeRates getReportingExchangeRates() {
                return reportingExchangeRates;
            }

            /**
             * 设置reportingExchangeRates属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ReportingExchangeRates }
             *     
             */
            public void setReportingExchangeRates(SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.ReportingExchangeRates value) {
                this.reportingExchangeRates = value;
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
     *         &lt;element name="Accomodation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Room" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Price" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Original">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Pricing">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PriceAdjustments" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="PriceAdjustment" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                         &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                                                         &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Selling">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Modular">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Original">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Pricing">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Selling">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PriceAdjustments" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PriceAdjustment" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentType" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                                     &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="RoomStay" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
     *                                     &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="RedemptionChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="EarnChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                           &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *                           &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="AmountChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="RangeNum" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="CheckoutDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="Display" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                           &lt;attribute name="OriginalCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="Rate" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                           &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ChainCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
     *                 &lt;attribute name="HotelCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="StarRating" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="ApartmentInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Vehicles" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Vehicle" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Price" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Original">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Pricing">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Selling">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Modular">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Original">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Pricing">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Selling">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PriceAdjustments" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                                     &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="VehAvail" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="VehAvailCore">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType">
     *                                             &lt;/extension>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *                                       &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/>
     *                                       &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="RedemptionChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="EarnChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="Category" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                           &lt;attribute name="Size" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                           &lt;attribute name="Reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                           &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *                           &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="AmountChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="PickUpDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                           &lt;attribute name="ReturnDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Display" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                           &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="Num24HourPeriods" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                           &lt;attribute name="RangeNum" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                           &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Nights" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Flights" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Price" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Modular">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="PricedItinerary" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType">
     *                           &lt;sequence>
     *                             &lt;element name="ExchangeRate" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ReportingExchangeRates" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="OutboundSegmentReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="InboundSegmentReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Airline" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="CheckoutDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                           &lt;attribute name="Num24HourPeriods" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                           &lt;attribute name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="VehicleRangeNum" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RedemptionChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="EarnChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="Currency" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *                 &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="AmountChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="CheckoutDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="DepartureAirport" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
     *                 &lt;attribute name="PickUpLocation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="SupplierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
     *                 &lt;attribute name="Num24HourPeriods" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
     *                 &lt;attribute name="OriginalCurrency" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
     *                 &lt;attribute name="Rate" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="VehicleRangeNum" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Extras" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Extra" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                             &lt;element name="DestActivityDescriptiveContent" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ExchangeRate" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ReportingExchangeRates" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Price" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Modular">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *       &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *       &lt;attribute name="Reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RangeNum" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accomodation",
        "vehicles",
        "flights",
        "extras",
        "price",
        "priceAdjustments",
        "loyalty"
    })
    public static class Package {

        @XmlElement(name = "Accomodation")
        protected List<SearchResponse.Package.Accomodation> accomodation;
        @XmlElement(name = "Vehicles")
        protected List<SearchResponse.Package.Vehicles> vehicles;
        @XmlElement(name = "Flights")
        protected List<SearchResponse.Package.Flights> flights;
        @XmlElement(name = "Extras")
        protected SearchResponse.Package.Extras extras;
        @XmlElement(name = "Price")
        protected SearchResponse.Package.Price price;
        @XmlElement(name = "PriceAdjustments")
        protected ExPriceAdjustmentsType priceAdjustments;
        @XmlElement(name = "Loyalty")
        protected LoyaltyPricingType loyalty;
        @XmlAttribute(name = "Amount", required = true)
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode", required = true)
        protected String currencyCode;
        @XmlAttribute(name = "Reference", required = true)
        protected String reference;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;
        @XmlAttribute(name = "selected")
        protected Boolean selected;
        @XmlAttribute(name = "RangeNum")
        protected String rangeNum;
        @XmlAttribute(name = "CombineAndSaveAmount")
        @XmlSchemaType(name = "anySimpleType")
        protected String combineAndSaveAmount;
        @XmlAttribute(name = "AdjustedAmount")
        @XmlSchemaType(name = "anySimpleType")
        protected String adjustedAmount;

        /**
         * Gets the value of the accomodation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accomodation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccomodation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchResponse.Package.Accomodation }
         * 
         * 
         */
        public List<SearchResponse.Package.Accomodation> getAccomodation() {
            if (accomodation == null) {
                accomodation = new ArrayList<SearchResponse.Package.Accomodation>();
            }
            return this.accomodation;
        }

        /**
         * Gets the value of the vehicles property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicles property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicles().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchResponse.Package.Vehicles }
         * 
         * 
         */
        public List<SearchResponse.Package.Vehicles> getVehicles() {
            if (vehicles == null) {
                vehicles = new ArrayList<SearchResponse.Package.Vehicles>();
            }
            return this.vehicles;
        }

        /**
         * Gets the value of the flights property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flights property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlights().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchResponse.Package.Flights }
         * 
         * 
         */
        public List<SearchResponse.Package.Flights> getFlights() {
            if (flights == null) {
                flights = new ArrayList<SearchResponse.Package.Flights>();
            }
            return this.flights;
        }

        /**
         * 获取extras属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SearchResponse.Package.Extras }
         *     
         */
        public SearchResponse.Package.Extras getExtras() {
            return extras;
        }

        /**
         * 设置extras属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SearchResponse.Package.Extras }
         *     
         */
        public void setExtras(SearchResponse.Package.Extras value) {
            this.extras = value;
        }

        /**
         * 获取price属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SearchResponse.Package.Price }
         *     
         */
        public SearchResponse.Package.Price getPrice() {
            return price;
        }

        /**
         * 设置price属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SearchResponse.Package.Price }
         *     
         */
        public void setPrice(SearchResponse.Package.Price value) {
            this.price = value;
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
         * 获取reference属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReference() {
            return reference;
        }

        /**
         * 设置reference属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReference(String value) {
            this.reference = value;
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
         * 获取selected属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSelected() {
            return selected;
        }

        /**
         * 设置selected属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSelected(Boolean value) {
            this.selected = value;
        }

        /**
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRangeNum(String value) {
            this.rangeNum = value;
        }

        /**
         * 获取combineAndSaveAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCombineAndSaveAmount() {
            return combineAndSaveAmount;
        }

        /**
         * 设置combineAndSaveAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCombineAndSaveAmount(String value) {
            this.combineAndSaveAmount = value;
        }

        /**
         * 获取adjustedAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjustedAmount() {
            return adjustedAmount;
        }

        /**
         * 设置adjustedAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjustedAmount(String value) {
            this.adjustedAmount = value;
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
         *         &lt;element name="Room" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Price" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Original">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Pricing">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PriceAdjustments" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="PriceAdjustment" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                                               &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Selling">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Modular">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Original">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Pricing">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Selling">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PriceAdjustments" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PriceAdjustment" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentType" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                           &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="RoomStay" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
         *                           &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="RedemptionChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="EarnChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                 &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *                 &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="AmountChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="RangeNum" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="CheckoutDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="Display" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                 &lt;attribute name="OriginalCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="Rate" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                 &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ChainCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
         *       &lt;attribute name="HotelCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="StarRating" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="ApartmentInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "room"
        })
        public static class Accomodation {

            @XmlElement(name = "Room", required = true)
            protected List<SearchResponse.Package.Accomodation.Room> room;
            @XmlAttribute(name = "ChainCode", required = true)
            protected String chainCode;
            @XmlAttribute(name = "HotelCode", required = true)
            protected String hotelCode;
            @XmlAttribute(name = "Reference")
            protected String reference;
            @XmlAttribute(name = "Selected")
            @XmlSchemaType(name = "anySimpleType")
            protected String selected;
            @XmlAttribute(name = "StarRating")
            @XmlSchemaType(name = "anySimpleType")
            protected String starRating;
            @XmlAttribute(name = "ApartmentInd")
            @XmlSchemaType(name = "anySimpleType")
            protected String apartmentInd;
            @XmlAttribute(name = "SupplierCode")
            @XmlSchemaType(name = "anySimpleType")
            protected String supplierCode;
            @XmlAttribute(name = "HotelCityCode")
            @XmlSchemaType(name = "anySimpleType")
            protected String hotelCityCode;

            /**
             * Gets the value of the room property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the room property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoom().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SearchResponse.Package.Accomodation.Room }
             * 
             * 
             */
            public List<SearchResponse.Package.Accomodation.Room> getRoom() {
                if (room == null) {
                    room = new ArrayList<SearchResponse.Package.Accomodation.Room>();
                }
                return this.room;
            }

            /**
             * 获取chainCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChainCode() {
                return chainCode;
            }

            /**
             * 设置chainCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChainCode(String value) {
                this.chainCode = value;
            }

            /**
             * 获取hotelCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCode() {
                return hotelCode;
            }

            /**
             * 设置hotelCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCode(String value) {
                this.hotelCode = value;
            }

            /**
             * 获取reference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference() {
                return reference;
            }

            /**
             * 设置reference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference(String value) {
                this.reference = value;
            }

            /**
             * 获取selected属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelected() {
                return selected;
            }

            /**
             * 设置selected属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelected(String value) {
                this.selected = value;
            }

            /**
             * 获取starRating属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStarRating() {
                return starRating;
            }

            /**
             * 设置starRating属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStarRating(String value) {
                this.starRating = value;
            }

            /**
             * 获取apartmentInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApartmentInd() {
                return apartmentInd;
            }

            /**
             * 设置apartmentInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApartmentInd(String value) {
                this.apartmentInd = value;
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
             * 获取hotelCityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCityCode() {
                return hotelCityCode;
            }

            /**
             * 设置hotelCityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCityCode(String value) {
                this.hotelCityCode = value;
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
             *         &lt;element name="Price" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Original">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Pricing">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PriceAdjustments" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="PriceAdjustment" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *                                     &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Selling">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Modular">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Original">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Pricing">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Selling">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PriceAdjustments" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PriceAdjustment" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentType" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *                 &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="RoomStay" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
             *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="RedemptionChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="EarnChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *       &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
             *       &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="AmountChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="RangeNum" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}date" />
             *       &lt;attribute name="CheckoutDate" type="{http://www.w3.org/2001/XMLSchema}date" />
             *       &lt;attribute name="Display" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *       &lt;attribute name="OriginalCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="Rate" type="{http://www.w3.org/2001/XMLSchema}float" />
             *       &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "price",
                "priceAdjustments",
                "loyalty",
                "roomStay"
            })
            public static class Room {

                @XmlElement(name = "Price")
                protected SearchResponse.Package.Accomodation.Room.Price price;
                @XmlElement(name = "PriceAdjustments")
                protected SearchResponse.Package.Accomodation.Room.PriceAdjustments priceAdjustments;
                @XmlElement(name = "Loyalty")
                protected List<LoyaltyPricingType> loyalty;
                @XmlElement(name = "RoomStay")
                protected SearchResponse.Package.Accomodation.Room.RoomStay roomStay;
                @XmlAttribute(name = "RedemptionChange")
                @XmlSchemaType(name = "anySimpleType")
                protected String redemptionChange;
                @XmlAttribute(name = "EarnChange")
                @XmlSchemaType(name = "anySimpleType")
                protected String earnChange;
                @XmlAttribute(name = "RoomIndex")
                @XmlSchemaType(name = "anySimpleType")
                protected String roomIndex;
                @XmlAttribute(name = "Reference")
                @XmlSchemaType(name = "anySimpleType")
                protected String reference;
                @XmlAttribute(name = "RoomTypeCode")
                @XmlSchemaType(name = "anySimpleType")
                protected String roomTypeCode;
                @XmlAttribute(name = "RatePlanCode")
                @XmlSchemaType(name = "anySimpleType")
                protected String ratePlanCode;
                @XmlAttribute(name = "Amount", required = true)
                protected BigDecimal amount;
                @XmlAttribute(name = "Adjusted")
                @XmlSchemaType(name = "anySimpleType")
                protected String adjusted;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "Selected")
                @XmlSchemaType(name = "anySimpleType")
                protected String selected;
                @XmlAttribute(name = "AmountChange")
                @XmlSchemaType(name = "anySimpleType")
                protected String amountChange;
                @XmlAttribute(name = "RangeNum")
                protected String rangeNum;
                @XmlAttribute(name = "CheckinDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar checkinDate;
                @XmlAttribute(name = "CheckoutDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar checkoutDate;
                @XmlAttribute(name = "Display")
                protected Boolean display;
                @XmlAttribute(name = "OriginalCurrencyCode")
                @XmlSchemaType(name = "anySimpleType")
                protected String originalCurrencyCode;
                @XmlAttribute(name = "Rate")
                protected Float rate;
                @XmlAttribute(name = "CombineAndSaveAmount")
                protected Float combineAndSaveAmount;

                /**
                 * 获取price属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchResponse.Package.Accomodation.Room.Price }
                 *     
                 */
                public SearchResponse.Package.Accomodation.Room.Price getPrice() {
                    return price;
                }

                /**
                 * 设置price属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchResponse.Package.Accomodation.Room.Price }
                 *     
                 */
                public void setPrice(SearchResponse.Package.Accomodation.Room.Price value) {
                    this.price = value;
                }

                /**
                 * 获取priceAdjustments属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchResponse.Package.Accomodation.Room.PriceAdjustments }
                 *     
                 */
                public SearchResponse.Package.Accomodation.Room.PriceAdjustments getPriceAdjustments() {
                    return priceAdjustments;
                }

                /**
                 * 设置priceAdjustments属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchResponse.Package.Accomodation.Room.PriceAdjustments }
                 *     
                 */
                public void setPriceAdjustments(SearchResponse.Package.Accomodation.Room.PriceAdjustments value) {
                    this.priceAdjustments = value;
                }

                /**
                 * Gets the value of the loyalty property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the loyalty property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLoyalty().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link LoyaltyPricingType }
                 * 
                 * 
                 */
                public List<LoyaltyPricingType> getLoyalty() {
                    if (loyalty == null) {
                        loyalty = new ArrayList<LoyaltyPricingType>();
                    }
                    return this.loyalty;
                }

                /**
                 * 获取roomStay属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchResponse.Package.Accomodation.Room.RoomStay }
                 *     
                 */
                public SearchResponse.Package.Accomodation.Room.RoomStay getRoomStay() {
                    return roomStay;
                }

                /**
                 * 设置roomStay属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchResponse.Package.Accomodation.Room.RoomStay }
                 *     
                 */
                public void setRoomStay(SearchResponse.Package.Accomodation.Room.RoomStay value) {
                    this.roomStay = value;
                }

                /**
                 * 获取redemptionChange属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRedemptionChange() {
                    return redemptionChange;
                }

                /**
                 * 设置redemptionChange属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRedemptionChange(String value) {
                    this.redemptionChange = value;
                }

                /**
                 * 获取earnChange属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEarnChange() {
                    return earnChange;
                }

                /**
                 * 设置earnChange属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEarnChange(String value) {
                    this.earnChange = value;
                }

                /**
                 * 获取roomIndex属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomIndex() {
                    return roomIndex;
                }

                /**
                 * 设置roomIndex属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomIndex(String value) {
                    this.roomIndex = value;
                }

                /**
                 * 获取reference属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReference() {
                    return reference;
                }

                /**
                 * 设置reference属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReference(String value) {
                    this.reference = value;
                }

                /**
                 * 获取roomTypeCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomTypeCode() {
                    return roomTypeCode;
                }

                /**
                 * 设置roomTypeCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomTypeCode(String value) {
                    this.roomTypeCode = value;
                }

                /**
                 * 获取ratePlanCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRatePlanCode() {
                    return ratePlanCode;
                }

                /**
                 * 设置ratePlanCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRatePlanCode(String value) {
                    this.ratePlanCode = value;
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
                 * 获取adjusted属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdjusted() {
                    return adjusted;
                }

                /**
                 * 设置adjusted属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdjusted(String value) {
                    this.adjusted = value;
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
                 * 获取selected属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSelected() {
                    return selected;
                }

                /**
                 * 设置selected属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSelected(String value) {
                    this.selected = value;
                }

                /**
                 * 获取amountChange属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAmountChange() {
                    return amountChange;
                }

                /**
                 * 设置amountChange属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAmountChange(String value) {
                    this.amountChange = value;
                }

                /**
                 * 获取rangeNum属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRangeNum() {
                    return rangeNum;
                }

                /**
                 * 设置rangeNum属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRangeNum(String value) {
                    this.rangeNum = value;
                }

                /**
                 * 获取checkinDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCheckinDate() {
                    return checkinDate;
                }

                /**
                 * 设置checkinDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCheckinDate(XMLGregorianCalendar value) {
                    this.checkinDate = value;
                }

                /**
                 * 获取checkoutDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCheckoutDate() {
                    return checkoutDate;
                }

                /**
                 * 设置checkoutDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCheckoutDate(XMLGregorianCalendar value) {
                    this.checkoutDate = value;
                }

                /**
                 * 获取display属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isDisplay() {
                    if (display == null) {
                        return false;
                    } else {
                        return display;
                    }
                }

                /**
                 * 设置display属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setDisplay(Boolean value) {
                    this.display = value;
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
                 * 获取rate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *     
                 */
                public Float getRate() {
                    return rate;
                }

                /**
                 * 设置rate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *     
                 */
                public void setRate(Float value) {
                    this.rate = value;
                }

                /**
                 * 获取combineAndSaveAmount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *     
                 */
                public Float getCombineAndSaveAmount() {
                    return combineAndSaveAmount;
                }

                /**
                 * 设置combineAndSaveAmount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *     
                 */
                public void setCombineAndSaveAmount(Float value) {
                    this.combineAndSaveAmount = value;
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
                 *         &lt;element name="Original">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Pricing">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PriceAdjustments" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="PriceAdjustment" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
                 *                           &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Selling">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Modular">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Original">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Pricing">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Selling">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "original",
                    "pricing",
                    "selling",
                    "modular"
                })
                public static class Price {

                    @XmlElement(name = "Original", required = true)
                    protected SearchResponse.Package.Accomodation.Room.Price.Original original;
                    @XmlElement(name = "Pricing", required = true)
                    protected SearchResponse.Package.Accomodation.Room.Price.Pricing pricing;
                    @XmlElement(name = "Selling", required = true)
                    protected SearchResponse.Package.Accomodation.Room.Price.Selling selling;
                    @XmlElement(name = "Modular", required = true)
                    protected SearchResponse.Package.Accomodation.Room.Price.Modular modular;

                    /**
                     * 获取original属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SearchResponse.Package.Accomodation.Room.Price.Original }
                     *     
                     */
                    public SearchResponse.Package.Accomodation.Room.Price.Original getOriginal() {
                        return original;
                    }

                    /**
                     * 设置original属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SearchResponse.Package.Accomodation.Room.Price.Original }
                     *     
                     */
                    public void setOriginal(SearchResponse.Package.Accomodation.Room.Price.Original value) {
                        this.original = value;
                    }

                    /**
                     * 获取pricing属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SearchResponse.Package.Accomodation.Room.Price.Pricing }
                     *     
                     */
                    public SearchResponse.Package.Accomodation.Room.Price.Pricing getPricing() {
                        return pricing;
                    }

                    /**
                     * 设置pricing属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SearchResponse.Package.Accomodation.Room.Price.Pricing }
                     *     
                     */
                    public void setPricing(SearchResponse.Package.Accomodation.Room.Price.Pricing value) {
                        this.pricing = value;
                    }

                    /**
                     * 获取selling属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SearchResponse.Package.Accomodation.Room.Price.Selling }
                     *     
                     */
                    public SearchResponse.Package.Accomodation.Room.Price.Selling getSelling() {
                        return selling;
                    }

                    /**
                     * 设置selling属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SearchResponse.Package.Accomodation.Room.Price.Selling }
                     *     
                     */
                    public void setSelling(SearchResponse.Package.Accomodation.Room.Price.Selling value) {
                        this.selling = value;
                    }

                    /**
                     * 获取modular属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SearchResponse.Package.Accomodation.Room.Price.Modular }
                     *     
                     */
                    public SearchResponse.Package.Accomodation.Room.Price.Modular getModular() {
                        return modular;
                    }

                    /**
                     * 设置modular属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SearchResponse.Package.Accomodation.Room.Price.Modular }
                     *     
                     */
                    public void setModular(SearchResponse.Package.Accomodation.Room.Price.Modular value) {
                        this.modular = value;
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
                     *         &lt;element name="Original">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Pricing">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Selling">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
                        "original",
                        "pricing",
                        "selling"
                    })
                    public static class Modular {

                        @XmlElement(name = "Original", required = true)
                        protected SearchResponse.Package.Accomodation.Room.Price.Modular.Original original;
                        @XmlElement(name = "Pricing", required = true)
                        protected SearchResponse.Package.Accomodation.Room.Price.Modular.Pricing pricing;
                        @XmlElement(name = "Selling", required = true)
                        protected SearchResponse.Package.Accomodation.Room.Price.Modular.Selling selling;

                        /**
                         * 获取original属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link SearchResponse.Package.Accomodation.Room.Price.Modular.Original }
                         *     
                         */
                        public SearchResponse.Package.Accomodation.Room.Price.Modular.Original getOriginal() {
                            return original;
                        }

                        /**
                         * 设置original属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SearchResponse.Package.Accomodation.Room.Price.Modular.Original }
                         *     
                         */
                        public void setOriginal(SearchResponse.Package.Accomodation.Room.Price.Modular.Original value) {
                            this.original = value;
                        }

                        /**
                         * 获取pricing属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link SearchResponse.Package.Accomodation.Room.Price.Modular.Pricing }
                         *     
                         */
                        public SearchResponse.Package.Accomodation.Room.Price.Modular.Pricing getPricing() {
                            return pricing;
                        }

                        /**
                         * 设置pricing属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SearchResponse.Package.Accomodation.Room.Price.Modular.Pricing }
                         *     
                         */
                        public void setPricing(SearchResponse.Package.Accomodation.Room.Price.Modular.Pricing value) {
                            this.pricing = value;
                        }

                        /**
                         * 获取selling属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link SearchResponse.Package.Accomodation.Room.Price.Modular.Selling }
                         *     
                         */
                        public SearchResponse.Package.Accomodation.Room.Price.Modular.Selling getSelling() {
                            return selling;
                        }

                        /**
                         * 设置selling属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SearchResponse.Package.Accomodation.Room.Price.Modular.Selling }
                         *     
                         */
                        public void setSelling(SearchResponse.Package.Accomodation.Room.Price.Modular.Selling value) {
                            this.selling = value;
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
                         *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Original {

                            @XmlAttribute(name = "Amount")
                            protected BigDecimal amount;
                            @XmlAttribute(name = "CurrencyCode")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String currencyCode;

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
                         *       &lt;/sequence>
                         *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "priceAdjustments"
                        })
                        public static class Pricing {

                            @XmlElement(name = "PriceAdjustments")
                            protected ExPriceAdjustmentsType priceAdjustments;
                            @XmlAttribute(name = "Amount")
                            protected BigDecimal amount;
                            @XmlAttribute(name = "CurrencyCode")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String currencyCode;
                            @XmlAttribute(name = "AdjustedAmount")
                            protected BigDecimal adjustedAmount;

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
                             * 获取adjustedAmount属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getAdjustedAmount() {
                                return adjustedAmount;
                            }

                            /**
                             * 设置adjustedAmount属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setAdjustedAmount(BigDecimal value) {
                                this.adjustedAmount = value;
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
                         *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                         *       &lt;/sequence>
                         *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "priceAdjustments"
                        })
                        public static class Selling {

                            @XmlElement(name = "PriceAdjustments")
                            protected ExPriceAdjustmentsType priceAdjustments;
                            @XmlAttribute(name = "Amount")
                            protected BigDecimal amount;
                            @XmlAttribute(name = "CurrencyCode")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String currencyCode;
                            @XmlAttribute(name = "AdjustedAmount")
                            protected BigDecimal adjustedAmount;

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
                             * 获取adjustedAmount属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getAdjustedAmount() {
                                return adjustedAmount;
                            }

                            /**
                             * 设置adjustedAmount属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setAdjustedAmount(BigDecimal value) {
                                this.adjustedAmount = value;
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
                     *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Original {

                        @XmlAttribute(name = "Amount")
                        protected BigDecimal amount;
                        @XmlAttribute(name = "CurrencyCode")
                        @XmlSchemaType(name = "anySimpleType")
                        protected String currencyCode;

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
                     *         &lt;element name="PriceAdjustments" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="PriceAdjustment" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
                     *                 &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "priceAdjustments"
                    })
                    public static class Pricing {

                        @XmlElement(name = "PriceAdjustments")
                        protected SearchResponse.Package.Accomodation.Room.Price.Pricing.PriceAdjustments priceAdjustments;
                        @XmlAttribute(name = "Amount")
                        protected BigDecimal amount;
                        @XmlAttribute(name = "CurrencyCode")
                        @XmlSchemaType(name = "anySimpleType")
                        protected String currencyCode;
                        @XmlAttribute(name = "AdjustedAmount")
                        protected BigDecimal adjustedAmount;

                        /**
                         * 获取priceAdjustments属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link SearchResponse.Package.Accomodation.Room.Price.Pricing.PriceAdjustments }
                         *     
                         */
                        public SearchResponse.Package.Accomodation.Room.Price.Pricing.PriceAdjustments getPriceAdjustments() {
                            return priceAdjustments;
                        }

                        /**
                         * 设置priceAdjustments属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SearchResponse.Package.Accomodation.Room.Price.Pricing.PriceAdjustments }
                         *     
                         */
                        public void setPriceAdjustments(SearchResponse.Package.Accomodation.Room.Price.Pricing.PriceAdjustments value) {
                            this.priceAdjustments = value;
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
                         * 获取adjustedAmount属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getAdjustedAmount() {
                            return adjustedAmount;
                        }

                        /**
                         * 设置adjustedAmount属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setAdjustedAmount(BigDecimal value) {
                            this.adjustedAmount = value;
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
                         *         &lt;element name="PriceAdjustment" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
                         *       &lt;/sequence>
                         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
                         *       &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "priceAdjustment"
                        })
                        public static class PriceAdjustments {

                            @XmlElement(name = "PriceAdjustment")
                            protected List<Object> priceAdjustment;
                            @XmlAttribute(name = "Adjusted")
                            protected Float adjusted;
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
                             * Gets the value of the priceAdjustment property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the priceAdjustment property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getPriceAdjustment().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link Object }
                             * 
                             * 
                             */
                            public List<Object> getPriceAdjustment() {
                                if (priceAdjustment == null) {
                                    priceAdjustment = new ArrayList<Object>();
                                }
                                return this.priceAdjustment;
                            }

                            /**
                             * 获取adjusted属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link Float }
                             *     
                             */
                            public Float getAdjusted() {
                                return adjusted;
                            }

                            /**
                             * 设置adjusted属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Float }
                             *     
                             */
                            public void setAdjusted(Float value) {
                                this.adjusted = value;
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
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "priceAdjustments"
                    })
                    public static class Selling {

                        @XmlElement(name = "PriceAdjustments")
                        protected ExPriceAdjustmentsType priceAdjustments;
                        @XmlAttribute(name = "Amount")
                        protected BigDecimal amount;
                        @XmlAttribute(name = "CurrencyCode")
                        @XmlSchemaType(name = "anySimpleType")
                        protected String currencyCode;
                        @XmlAttribute(name = "AdjustedAmount")
                        protected BigDecimal adjustedAmount;

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
                         * 获取adjustedAmount属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getAdjustedAmount() {
                            return adjustedAmount;
                        }

                        /**
                         * 设置adjustedAmount属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setAdjustedAmount(BigDecimal value) {
                            this.adjustedAmount = value;
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
                 *         &lt;element name="PriceAdjustment" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentType" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
                 *       &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "priceAdjustment"
                })
                public static class PriceAdjustments {

                    @XmlElement(name = "PriceAdjustment")
                    protected List<ExPriceAdjustmentType> priceAdjustment;
                    @XmlAttribute(name = "Adjusted")
                    protected Float adjusted;
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
                     * Gets the value of the priceAdjustment property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the priceAdjustment property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPriceAdjustment().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ExPriceAdjustmentType }
                     * 
                     * 
                     */
                    public List<ExPriceAdjustmentType> getPriceAdjustment() {
                        if (priceAdjustment == null) {
                            priceAdjustment = new ArrayList<ExPriceAdjustmentType>();
                        }
                        return this.priceAdjustment;
                    }

                    /**
                     * 获取adjusted属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    public Float getAdjusted() {
                        return adjusted;
                    }

                    /**
                     * 设置adjusted属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    public void setAdjusted(Float value) {
                        this.adjusted = value;
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
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
                 *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class RoomStay
                    extends RoomStayType
                {

                    @XmlAttribute(name = "Reference")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger reference;

                    /**
                     * 获取reference属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getReference() {
                        return reference;
                    }

                    /**
                     * 设置reference属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setReference(BigInteger value) {
                        this.reference = value;
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
         *         &lt;element name="Extra" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                   &lt;element name="DestActivityDescriptiveContent" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType">
         *                           &lt;sequence>
         *                             &lt;element name="ExchangeRate" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ReportingExchangeRates" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            "extra"
        })
        public static class Extras {

            @XmlElement(name = "Extra")
            protected List<SearchResponse.Package.Extras.Extra> extra;

            /**
             * Gets the value of the extra property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the extra property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExtra().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SearchResponse.Package.Extras.Extra }
             * 
             * 
             */
            public List<SearchResponse.Package.Extras.Extra> getExtra() {
                if (extra == null) {
                    extra = new ArrayList<SearchResponse.Package.Extras.Extra>();
                }
                return this.extra;
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
             *         &lt;element name="DestActivityDescriptiveContent" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType">
             *                 &lt;sequence>
             *                   &lt;element name="ExchangeRate" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ReportingExchangeRates" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                "destActivityDescriptiveContent"
            })
            public static class Extra {

                @XmlElement(name = "PriceAdjustments")
                protected ExPriceAdjustmentsType priceAdjustments;
                @XmlElement(name = "DestActivityDescriptiveContent")
                protected SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent destActivityDescriptiveContent;
                @XmlAttribute(name = "Amount")
                @XmlSchemaType(name = "anySimpleType")
                protected String amount;
                @XmlAttribute(name = "CurrencyCode")
                @XmlSchemaType(name = "anySimpleType")
                protected String currencyCode;
                @XmlAttribute(name = "Type")
                @XmlSchemaType(name = "anySimpleType")
                protected String type;
                @XmlAttribute(name = "Reference")
                @XmlSchemaType(name = "anySimpleType")
                protected String reference;

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
                 * 获取destActivityDescriptiveContent属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent }
                 *     
                 */
                public SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent getDestActivityDescriptiveContent() {
                    return destActivityDescriptiveContent;
                }

                /**
                 * 设置destActivityDescriptiveContent属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent }
                 *     
                 */
                public void setDestActivityDescriptiveContent(SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent value) {
                    this.destActivityDescriptiveContent = value;
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
                 * 获取reference属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReference() {
                    return reference;
                }

                /**
                 * 设置reference属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReference(String value) {
                    this.reference = value;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType">
                 *       &lt;sequence>
                 *         &lt;element name="ExchangeRate" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ReportingExchangeRates" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
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
                    "reportingExchangeRates"
                })
                public static class DestActivityDescriptiveContent
                    extends DestActivityDescriptiveContentType
                {

                    @XmlElement(name = "ExchangeRate")
                    protected SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ExchangeRate exchangeRate;
                    @XmlElement(name = "ReportingExchangeRates")
                    protected SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ReportingExchangeRates reportingExchangeRates;

                    /**
                     * 获取exchangeRate属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ExchangeRate }
                     *     
                     */
                    public SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ExchangeRate getExchangeRate() {
                        return exchangeRate;
                    }

                    /**
                     * 设置exchangeRate属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ExchangeRate }
                     *     
                     */
                    public void setExchangeRate(SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ExchangeRate value) {
                        this.exchangeRate = value;
                    }

                    /**
                     * 获取reportingExchangeRates属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ReportingExchangeRates }
                     *     
                     */
                    public SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ReportingExchangeRates getReportingExchangeRates() {
                        return reportingExchangeRates;
                    }

                    /**
                     * 设置reportingExchangeRates属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ReportingExchangeRates }
                     *     
                     */
                    public void setReportingExchangeRates(SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.ReportingExchangeRates value) {
                        this.reportingExchangeRates = value;
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
         *         &lt;element name="Price" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Modular">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="PricedItinerary" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType">
         *                 &lt;sequence>
         *                   &lt;element name="ExchangeRate" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ReportingExchangeRates" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="OutboundSegmentReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="InboundSegmentReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Airline" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="CheckoutDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                 &lt;attribute name="Num24HourPeriods" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                 &lt;attribute name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="VehicleRangeNum" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="RedemptionChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="EarnChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="Currency" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *       &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="AmountChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="CheckoutDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="DepartureAirport" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
         *       &lt;attribute name="PickUpLocation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="SupplierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
         *       &lt;attribute name="Num24HourPeriods" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
         *       &lt;attribute name="OriginalCurrency" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
         *       &lt;attribute name="Rate" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="VehicleRangeNum" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "price",
            "priceAdjustments",
            "loyalty",
            "pricedItinerary"
        })
        public static class Flights {

            @XmlElement(name = "Price")
            protected SearchResponse.Package.Flights.Price price;
            @XmlElement(name = "PriceAdjustments")
            protected ExPriceAdjustmentsType priceAdjustments;
            @XmlElement(name = "Loyalty")
            protected List<LoyaltyPricingType> loyalty;
            @XmlElement(name = "PricedItinerary")
            protected SearchResponse.Package.Flights.PricedItinerary pricedItinerary;
            @XmlAttribute(name = "RedemptionChange")
            @XmlSchemaType(name = "anySimpleType")
            protected String redemptionChange;
            @XmlAttribute(name = "EarnChange")
            @XmlSchemaType(name = "anySimpleType")
            protected String earnChange;
            @XmlAttribute(name = "Reference", required = true)
            protected String reference;
            @XmlAttribute(name = "Amount", required = true)
            protected BigDecimal amount;
            @XmlAttribute(name = "Currency", required = true)
            protected String currency;
            @XmlAttribute(name = "Adjusted")
            @XmlSchemaType(name = "anySimpleType")
            protected String adjusted;
            @XmlAttribute(name = "OriginDestinationRPH")
            protected String originDestinationRPH;
            @XmlAttribute(name = "Selected")
            @XmlSchemaType(name = "anySimpleType")
            protected String selected;
            @XmlAttribute(name = "AmountChange")
            @XmlSchemaType(name = "anySimpleType")
            protected String amountChange;
            @XmlAttribute(name = "CheckinDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar checkinDate;
            @XmlAttribute(name = "CheckoutDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar checkoutDate;
            @XmlAttribute(name = "PickUpDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar pickUpDate;
            @XmlAttribute(name = "ReturnDate")
            @XmlSchemaType(name = "anySimpleType")
            protected String returnDate;
            @XmlAttribute(name = "Start")
            @XmlSchemaType(name = "anySimpleType")
            protected String start;
            @XmlAttribute(name = "End")
            @XmlSchemaType(name = "anySimpleType")
            protected String end;
            @XmlAttribute(name = "CombineAndSaveAmount")
            protected Float combineAndSaveAmount;
            @XmlAttribute(name = "DepartureAirport")
            @XmlSchemaType(name = "anySimpleType")
            protected String departureAirport;
            @XmlAttribute(name = "CabinClass")
            @XmlSchemaType(name = "anySimpleType")
            protected String cabinClass;
            @XmlAttribute(name = "ResBookDesigCode")
            protected String resBookDesigCode;
            @XmlAttribute(name = "PickUpLocation")
            @XmlSchemaType(name = "anySimpleType")
            protected String pickUpLocation;
            @XmlAttribute(name = "SupplierCode")
            protected String supplierCode;
            @XmlAttribute(name = "Num24HourPeriods")
            protected String num24HourPeriods;
            @XmlAttribute(name = "OriginalCurrency")
            protected String originalCurrency;
            @XmlAttribute(name = "Rate")
            protected Float rate;
            @XmlAttribute(name = "VehicleRangeNum")
            @XmlSchemaType(name = "anySimpleType")
            protected String vehicleRangeNum;

            /**
             * 获取price属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SearchResponse.Package.Flights.Price }
             *     
             */
            public SearchResponse.Package.Flights.Price getPrice() {
                return price;
            }

            /**
             * 设置price属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SearchResponse.Package.Flights.Price }
             *     
             */
            public void setPrice(SearchResponse.Package.Flights.Price value) {
                this.price = value;
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
             * Gets the value of the loyalty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the loyalty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLoyalty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LoyaltyPricingType }
             * 
             * 
             */
            public List<LoyaltyPricingType> getLoyalty() {
                if (loyalty == null) {
                    loyalty = new ArrayList<LoyaltyPricingType>();
                }
                return this.loyalty;
            }

            /**
             * 获取pricedItinerary属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SearchResponse.Package.Flights.PricedItinerary }
             *     
             */
            public SearchResponse.Package.Flights.PricedItinerary getPricedItinerary() {
                return pricedItinerary;
            }

            /**
             * 设置pricedItinerary属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SearchResponse.Package.Flights.PricedItinerary }
             *     
             */
            public void setPricedItinerary(SearchResponse.Package.Flights.PricedItinerary value) {
                this.pricedItinerary = value;
            }

            /**
             * 获取redemptionChange属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRedemptionChange() {
                return redemptionChange;
            }

            /**
             * 设置redemptionChange属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRedemptionChange(String value) {
                this.redemptionChange = value;
            }

            /**
             * 获取earnChange属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEarnChange() {
                return earnChange;
            }

            /**
             * 设置earnChange属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEarnChange(String value) {
                this.earnChange = value;
            }

            /**
             * 获取reference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference() {
                return reference;
            }

            /**
             * 设置reference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference(String value) {
                this.reference = value;
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
             * 获取currency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrency() {
                return currency;
            }

            /**
             * 设置currency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrency(String value) {
                this.currency = value;
            }

            /**
             * 获取adjusted属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdjusted() {
                return adjusted;
            }

            /**
             * 设置adjusted属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdjusted(String value) {
                this.adjusted = value;
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
             * 获取selected属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelected() {
                return selected;
            }

            /**
             * 设置selected属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelected(String value) {
                this.selected = value;
            }

            /**
             * 获取amountChange属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmountChange() {
                return amountChange;
            }

            /**
             * 设置amountChange属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmountChange(String value) {
                this.amountChange = value;
            }

            /**
             * 获取checkinDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCheckinDate() {
                return checkinDate;
            }

            /**
             * 设置checkinDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCheckinDate(XMLGregorianCalendar value) {
                this.checkinDate = value;
            }

            /**
             * 获取checkoutDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCheckoutDate() {
                return checkoutDate;
            }

            /**
             * 设置checkoutDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCheckoutDate(XMLGregorianCalendar value) {
                this.checkoutDate = value;
            }

            /**
             * 获取pickUpDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPickUpDate() {
                return pickUpDate;
            }

            /**
             * 设置pickUpDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPickUpDate(XMLGregorianCalendar value) {
                this.pickUpDate = value;
            }

            /**
             * 获取returnDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReturnDate() {
                return returnDate;
            }

            /**
             * 设置returnDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReturnDate(String value) {
                this.returnDate = value;
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
             * 获取combineAndSaveAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getCombineAndSaveAmount() {
                return combineAndSaveAmount;
            }

            /**
             * 设置combineAndSaveAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setCombineAndSaveAmount(Float value) {
                this.combineAndSaveAmount = value;
            }

            /**
             * 获取departureAirport属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartureAirport() {
                return departureAirport;
            }

            /**
             * 设置departureAirport属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartureAirport(String value) {
                this.departureAirport = value;
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
             * 获取pickUpLocation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPickUpLocation() {
                return pickUpLocation;
            }

            /**
             * 设置pickUpLocation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPickUpLocation(String value) {
                this.pickUpLocation = value;
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
             * 获取num24HourPeriods属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNum24HourPeriods() {
                return num24HourPeriods;
            }

            /**
             * 设置num24HourPeriods属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNum24HourPeriods(String value) {
                this.num24HourPeriods = value;
            }

            /**
             * 获取originalCurrency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalCurrency() {
                return originalCurrency;
            }

            /**
             * 设置originalCurrency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalCurrency(String value) {
                this.originalCurrency = value;
            }

            /**
             * 获取rate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getRate() {
                return rate;
            }

            /**
             * 设置rate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setRate(Float value) {
                this.rate = value;
            }

            /**
             * 获取vehicleRangeNum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehicleRangeNum() {
                return vehicleRangeNum;
            }

            /**
             * 设置vehicleRangeNum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehicleRangeNum(String value) {
                this.vehicleRangeNum = value;
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
             *         &lt;element name="Modular">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                "modular"
            })
            public static class Price {

                @XmlElement(name = "Modular", required = true)
                protected SearchResponse.Package.Flights.Price.Modular modular;

                /**
                 * 获取modular属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchResponse.Package.Flights.Price.Modular }
                 *     
                 */
                public SearchResponse.Package.Flights.Price.Modular getModular() {
                    return modular;
                }

                /**
                 * 设置modular属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchResponse.Package.Flights.Price.Modular }
                 *     
                 */
                public void setModular(SearchResponse.Package.Flights.Price.Modular value) {
                    this.modular = value;
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
                 *       &lt;/sequence>
                 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "priceAdjustments"
                })
                public static class Modular {

                    @XmlElement(name = "PriceAdjustments")
                    protected ExPriceAdjustmentsType priceAdjustments;
                    @XmlAttribute(name = "Amount")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String amount;
                    @XmlAttribute(name = "CurrencyCode")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String currencyCode;
                    @XmlAttribute(name = "AdjustedAmount")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String adjustedAmount;

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
                     * 获取adjustedAmount属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdjustedAmount() {
                        return adjustedAmount;
                    }

                    /**
                     * 设置adjustedAmount属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdjustedAmount(String value) {
                        this.adjustedAmount = value;
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
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType">
             *       &lt;sequence>
             *         &lt;element name="ExchangeRate" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ReportingExchangeRates" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="OutboundSegmentReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="InboundSegmentReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Airline" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}date" />
             *       &lt;attribute name="CheckoutDate" type="{http://www.w3.org/2001/XMLSchema}date" />
             *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *       &lt;attribute name="Num24HourPeriods" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *       &lt;attribute name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}date" />
             *       &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}date" />
             *       &lt;attribute name="VehicleRangeNum" type="{http://www.w3.org/2001/XMLSchema}float" />
             *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                "reportingExchangeRates"
            })
            public static class PricedItinerary
                extends PricedItineraryType
            {

                @XmlElement(name = "ExchangeRate")
                protected SearchResponse.Package.Flights.PricedItinerary.ExchangeRate exchangeRate;
                @XmlElement(name = "ReportingExchangeRates")
                protected SearchResponse.Package.Flights.PricedItinerary.ReportingExchangeRates reportingExchangeRates;
                @XmlAttribute(name = "OutboundSegmentReference")
                @XmlSchemaType(name = "anySimpleType")
                protected String outboundSegmentReference;
                @XmlAttribute(name = "InboundSegmentReference")
                @XmlSchemaType(name = "anySimpleType")
                protected String inboundSegmentReference;
                @XmlAttribute(name = "SupplierCode")
                protected String supplierCode;
                @XmlAttribute(name = "Airline")
                protected String airline;
                @XmlAttribute(name = "CheckinDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar checkinDate;
                @XmlAttribute(name = "CheckoutDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar checkoutDate;
                @XmlAttribute(name = "Reference")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger reference;
                @XmlAttribute(name = "Num24HourPeriods")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger num24HourPeriods;
                @XmlAttribute(name = "PickUpDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar pickUpDate;
                @XmlAttribute(name = "ReturnDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar returnDate;
                @XmlAttribute(name = "VehicleRangeNum")
                protected Float vehicleRangeNum;
                @XmlAttribute(name = "Start")
                @XmlSchemaType(name = "anySimpleType")
                protected String start;
                @XmlAttribute(name = "End")
                @XmlSchemaType(name = "anySimpleType")
                protected String end;

                /**
                 * 获取exchangeRate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchResponse.Package.Flights.PricedItinerary.ExchangeRate }
                 *     
                 */
                public SearchResponse.Package.Flights.PricedItinerary.ExchangeRate getExchangeRate() {
                    return exchangeRate;
                }

                /**
                 * 设置exchangeRate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchResponse.Package.Flights.PricedItinerary.ExchangeRate }
                 *     
                 */
                public void setExchangeRate(SearchResponse.Package.Flights.PricedItinerary.ExchangeRate value) {
                    this.exchangeRate = value;
                }

                /**
                 * 获取reportingExchangeRates属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchResponse.Package.Flights.PricedItinerary.ReportingExchangeRates }
                 *     
                 */
                public SearchResponse.Package.Flights.PricedItinerary.ReportingExchangeRates getReportingExchangeRates() {
                    return reportingExchangeRates;
                }

                /**
                 * 设置reportingExchangeRates属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchResponse.Package.Flights.PricedItinerary.ReportingExchangeRates }
                 *     
                 */
                public void setReportingExchangeRates(SearchResponse.Package.Flights.PricedItinerary.ReportingExchangeRates value) {
                    this.reportingExchangeRates = value;
                }

                /**
                 * 获取outboundSegmentReference属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOutboundSegmentReference() {
                    return outboundSegmentReference;
                }

                /**
                 * 设置outboundSegmentReference属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOutboundSegmentReference(String value) {
                    this.outboundSegmentReference = value;
                }

                /**
                 * 获取inboundSegmentReference属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInboundSegmentReference() {
                    return inboundSegmentReference;
                }

                /**
                 * 设置inboundSegmentReference属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInboundSegmentReference(String value) {
                    this.inboundSegmentReference = value;
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
                 * 获取checkinDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCheckinDate() {
                    return checkinDate;
                }

                /**
                 * 设置checkinDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCheckinDate(XMLGregorianCalendar value) {
                    this.checkinDate = value;
                }

                /**
                 * 获取checkoutDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCheckoutDate() {
                    return checkoutDate;
                }

                /**
                 * 设置checkoutDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCheckoutDate(XMLGregorianCalendar value) {
                    this.checkoutDate = value;
                }

                /**
                 * 获取reference属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getReference() {
                    return reference;
                }

                /**
                 * 设置reference属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setReference(BigInteger value) {
                    this.reference = value;
                }

                /**
                 * 获取num24HourPeriods属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNum24HourPeriods() {
                    return num24HourPeriods;
                }

                /**
                 * 设置num24HourPeriods属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNum24HourPeriods(BigInteger value) {
                    this.num24HourPeriods = value;
                }

                /**
                 * 获取pickUpDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getPickUpDate() {
                    return pickUpDate;
                }

                /**
                 * 设置pickUpDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setPickUpDate(XMLGregorianCalendar value) {
                    this.pickUpDate = value;
                }

                /**
                 * 获取returnDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getReturnDate() {
                    return returnDate;
                }

                /**
                 * 设置returnDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setReturnDate(XMLGregorianCalendar value) {
                    this.returnDate = value;
                }

                /**
                 * 获取vehicleRangeNum属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *     
                 */
                public Float getVehicleRangeNum() {
                    return vehicleRangeNum;
                }

                /**
                 * 设置vehicleRangeNum属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *     
                 */
                public void setVehicleRangeNum(Float value) {
                    this.vehicleRangeNum = value;
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
         *         &lt;element name="Modular">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            "modular"
        })
        public static class Price {

            @XmlElement(name = "Modular", required = true)
            protected SearchResponse.Package.Price.Modular modular;

            /**
             * 获取modular属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SearchResponse.Package.Price.Modular }
             *     
             */
            public SearchResponse.Package.Price.Modular getModular() {
                return modular;
            }

            /**
             * 设置modular属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SearchResponse.Package.Price.Modular }
             *     
             */
            public void setModular(SearchResponse.Package.Price.Modular value) {
                this.modular = value;
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
             *       &lt;/sequence>
             *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "priceAdjustments"
            })
            public static class Modular {

                @XmlElement(name = "PriceAdjustments")
                protected ExPriceAdjustmentsType priceAdjustments;
                @XmlAttribute(name = "Amount")
                @XmlSchemaType(name = "anySimpleType")
                protected String amount;
                @XmlAttribute(name = "CurrencyCode")
                @XmlSchemaType(name = "anySimpleType")
                protected String currencyCode;
                @XmlAttribute(name = "AdjustedAmount")
                @XmlSchemaType(name = "anySimpleType")
                protected String adjustedAmount;

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
                 * 获取adjustedAmount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdjustedAmount() {
                    return adjustedAmount;
                }

                /**
                 * 设置adjustedAmount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdjustedAmount(String value) {
                    this.adjustedAmount = value;
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
         *         &lt;element name="Vehicle" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Price" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Original">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Pricing">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Selling">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Modular">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Original">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Pricing">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Selling">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PriceAdjustments" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                           &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="VehAvail" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="VehAvailCore">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType">
         *                                   &lt;/extension>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
         *                             &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/>
         *                             &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="RedemptionChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="EarnChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="Category" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                 &lt;attribute name="Size" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                 &lt;attribute name="Reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                 &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *                 &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="AmountChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="PickUpDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *                 &lt;attribute name="ReturnDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Display" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                 &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="Num24HourPeriods" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                 &lt;attribute name="RangeNum" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                 &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Nights" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vehicle"
        })
        public static class Vehicles {

            @XmlElement(name = "Vehicle", required = true)
            protected List<SearchResponse.Package.Vehicles.Vehicle> vehicle;
            @XmlAttribute(name = "VendorCode")
            protected String vendorCode;
            @XmlAttribute(name = "Reference")
            protected String reference;
            @XmlAttribute(name = "Selected")
            protected Boolean selected;
            @XmlAttribute(name = "Class")
            @XmlSchemaType(name = "anySimpleType")
            protected String clazz;
            @XmlAttribute(name = "Nights")
            @XmlSchemaType(name = "anySimpleType")
            protected String nights;

            /**
             * Gets the value of the vehicle property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the vehicle property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVehicle().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SearchResponse.Package.Vehicles.Vehicle }
             * 
             * 
             */
            public List<SearchResponse.Package.Vehicles.Vehicle> getVehicle() {
                if (vehicle == null) {
                    vehicle = new ArrayList<SearchResponse.Package.Vehicles.Vehicle>();
                }
                return this.vehicle;
            }

            /**
             * 获取vendorCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVendorCode() {
                return vendorCode;
            }

            /**
             * 设置vendorCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVendorCode(String value) {
                this.vendorCode = value;
            }

            /**
             * 获取reference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference() {
                return reference;
            }

            /**
             * 设置reference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference(String value) {
                this.reference = value;
            }

            /**
             * 获取selected属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSelected() {
                return selected;
            }

            /**
             * 设置selected属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSelected(Boolean value) {
                this.selected = value;
            }

            /**
             * 获取clazz属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClazz() {
                return clazz;
            }

            /**
             * 设置clazz属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClazz(String value) {
                this.clazz = value;
            }

            /**
             * 获取nights属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNights() {
                return nights;
            }

            /**
             * 设置nights属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNights(String value) {
                this.nights = value;
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
             *         &lt;element name="Price" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Original">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Pricing">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Selling">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Modular">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Original">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Pricing">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Selling">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PriceAdjustments" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *                 &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="VehAvail" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="VehAvailCore">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType">
             *                         &lt;/extension>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
             *                   &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/>
             *                   &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="RedemptionChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="EarnChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="Category" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *       &lt;attribute name="Size" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *       &lt;attribute name="Reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *       &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
             *       &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="AmountChange" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="PickUpDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
             *       &lt;attribute name="ReturnDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
             *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Display" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *       &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="Num24HourPeriods" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *       &lt;attribute name="RangeNum" type="{http://www.w3.org/2001/XMLSchema}float" />
             *       &lt;attribute name="CombineAndSaveAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "price",
                "priceAdjustments",
                "vehAvail"
            })
            public static class Vehicle {

                @XmlElement(name = "Price")
                protected SearchResponse.Package.Vehicles.Vehicle.Price price;
                @XmlElement(name = "PriceAdjustments")
                protected SearchResponse.Package.Vehicles.Vehicle.PriceAdjustments priceAdjustments;
                @XmlElement(name = "VehAvail")
                protected List<SearchResponse.Package.Vehicles.Vehicle.VehAvail> vehAvail;
                @XmlAttribute(name = "RedemptionChange")
                @XmlSchemaType(name = "anySimpleType")
                protected String redemptionChange;
                @XmlAttribute(name = "EarnChange")
                @XmlSchemaType(name = "anySimpleType")
                protected String earnChange;
                @XmlAttribute(name = "Category")
                protected String category;
                @XmlAttribute(name = "Size")
                protected String size;
                @XmlAttribute(name = "Reference", required = true)
                protected String reference;
                @XmlAttribute(name = "Amount", required = true)
                protected BigDecimal amount;
                @XmlAttribute(name = "Adjusted")
                @XmlSchemaType(name = "anySimpleType")
                protected String adjusted;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "Selected")
                @XmlSchemaType(name = "anySimpleType")
                protected String selected;
                @XmlAttribute(name = "AmountChange")
                @XmlSchemaType(name = "anySimpleType")
                protected String amountChange;
                @XmlAttribute(name = "PickUpDate")
                protected String pickUpDate;
                @XmlAttribute(name = "ReturnDate")
                protected String returnDate;
                @XmlAttribute(name = "ID")
                protected String id;
                @XmlAttribute(name = "Display")
                protected Boolean display;
                @XmlAttribute(name = "VendorCode")
                @XmlSchemaType(name = "anySimpleType")
                protected String vendorCode;
                @XmlAttribute(name = "LocationCode")
                @XmlSchemaType(name = "anySimpleType")
                protected String locationCode;
                @XmlAttribute(name = "Num24HourPeriods")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger num24HourPeriods;
                @XmlAttribute(name = "RangeNum")
                protected Float rangeNum;
                @XmlAttribute(name = "CombineAndSaveAmount")
                protected Float combineAndSaveAmount;

                /**
                 * 获取price属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchResponse.Package.Vehicles.Vehicle.Price }
                 *     
                 */
                public SearchResponse.Package.Vehicles.Vehicle.Price getPrice() {
                    return price;
                }

                /**
                 * 设置price属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchResponse.Package.Vehicles.Vehicle.Price }
                 *     
                 */
                public void setPrice(SearchResponse.Package.Vehicles.Vehicle.Price value) {
                    this.price = value;
                }

                /**
                 * 获取priceAdjustments属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SearchResponse.Package.Vehicles.Vehicle.PriceAdjustments }
                 *     
                 */
                public SearchResponse.Package.Vehicles.Vehicle.PriceAdjustments getPriceAdjustments() {
                    return priceAdjustments;
                }

                /**
                 * 设置priceAdjustments属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SearchResponse.Package.Vehicles.Vehicle.PriceAdjustments }
                 *     
                 */
                public void setPriceAdjustments(SearchResponse.Package.Vehicles.Vehicle.PriceAdjustments value) {
                    this.priceAdjustments = value;
                }

                /**
                 * Gets the value of the vehAvail property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the vehAvail property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVehAvail().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SearchResponse.Package.Vehicles.Vehicle.VehAvail }
                 * 
                 * 
                 */
                public List<SearchResponse.Package.Vehicles.Vehicle.VehAvail> getVehAvail() {
                    if (vehAvail == null) {
                        vehAvail = new ArrayList<SearchResponse.Package.Vehicles.Vehicle.VehAvail>();
                    }
                    return this.vehAvail;
                }

                /**
                 * 获取redemptionChange属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRedemptionChange() {
                    return redemptionChange;
                }

                /**
                 * 设置redemptionChange属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRedemptionChange(String value) {
                    this.redemptionChange = value;
                }

                /**
                 * 获取earnChange属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEarnChange() {
                    return earnChange;
                }

                /**
                 * 设置earnChange属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEarnChange(String value) {
                    this.earnChange = value;
                }

                /**
                 * 获取category属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCategory() {
                    return category;
                }

                /**
                 * 设置category属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCategory(String value) {
                    this.category = value;
                }

                /**
                 * 获取size属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSize() {
                    return size;
                }

                /**
                 * 设置size属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSize(String value) {
                    this.size = value;
                }

                /**
                 * 获取reference属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReference() {
                    return reference;
                }

                /**
                 * 设置reference属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReference(String value) {
                    this.reference = value;
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
                 * 获取adjusted属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdjusted() {
                    return adjusted;
                }

                /**
                 * 设置adjusted属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdjusted(String value) {
                    this.adjusted = value;
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
                 * 获取selected属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSelected() {
                    return selected;
                }

                /**
                 * 设置selected属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSelected(String value) {
                    this.selected = value;
                }

                /**
                 * 获取amountChange属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAmountChange() {
                    return amountChange;
                }

                /**
                 * 设置amountChange属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAmountChange(String value) {
                    this.amountChange = value;
                }

                /**
                 * 获取pickUpDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPickUpDate() {
                    return pickUpDate;
                }

                /**
                 * 设置pickUpDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPickUpDate(String value) {
                    this.pickUpDate = value;
                }

                /**
                 * 获取returnDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReturnDate() {
                    return returnDate;
                }

                /**
                 * 设置returnDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReturnDate(String value) {
                    this.returnDate = value;
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
                 * 获取display属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isDisplay() {
                    if (display == null) {
                        return false;
                    } else {
                        return display;
                    }
                }

                /**
                 * 设置display属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setDisplay(Boolean value) {
                    this.display = value;
                }

                /**
                 * 获取vendorCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVendorCode() {
                    return vendorCode;
                }

                /**
                 * 设置vendorCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVendorCode(String value) {
                    this.vendorCode = value;
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
                 * 获取num24HourPeriods属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNum24HourPeriods() {
                    return num24HourPeriods;
                }

                /**
                 * 设置num24HourPeriods属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNum24HourPeriods(BigInteger value) {
                    this.num24HourPeriods = value;
                }

                /**
                 * 获取rangeNum属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *     
                 */
                public Float getRangeNum() {
                    return rangeNum;
                }

                /**
                 * 设置rangeNum属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *     
                 */
                public void setRangeNum(Float value) {
                    this.rangeNum = value;
                }

                /**
                 * 获取combineAndSaveAmount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *     
                 */
                public Float getCombineAndSaveAmount() {
                    return combineAndSaveAmount;
                }

                /**
                 * 设置combineAndSaveAmount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *     
                 */
                public void setCombineAndSaveAmount(Float value) {
                    this.combineAndSaveAmount = value;
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
                 *         &lt;element name="Original">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Pricing">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Selling">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Modular">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Original">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Pricing">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Selling">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "original",
                    "pricing",
                    "selling",
                    "modular"
                })
                public static class Price {

                    @XmlElement(name = "Original", required = true)
                    protected SearchResponse.Package.Vehicles.Vehicle.Price.Original original;
                    @XmlElement(name = "Pricing", required = true)
                    protected SearchResponse.Package.Vehicles.Vehicle.Price.Pricing pricing;
                    @XmlElement(name = "Selling", required = true)
                    protected SearchResponse.Package.Vehicles.Vehicle.Price.Selling selling;
                    @XmlElement(name = "Modular", required = true)
                    protected SearchResponse.Package.Vehicles.Vehicle.Price.Modular modular;

                    /**
                     * 获取original属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Original }
                     *     
                     */
                    public SearchResponse.Package.Vehicles.Vehicle.Price.Original getOriginal() {
                        return original;
                    }

                    /**
                     * 设置original属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Original }
                     *     
                     */
                    public void setOriginal(SearchResponse.Package.Vehicles.Vehicle.Price.Original value) {
                        this.original = value;
                    }

                    /**
                     * 获取pricing属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Pricing }
                     *     
                     */
                    public SearchResponse.Package.Vehicles.Vehicle.Price.Pricing getPricing() {
                        return pricing;
                    }

                    /**
                     * 设置pricing属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Pricing }
                     *     
                     */
                    public void setPricing(SearchResponse.Package.Vehicles.Vehicle.Price.Pricing value) {
                        this.pricing = value;
                    }

                    /**
                     * 获取selling属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Selling }
                     *     
                     */
                    public SearchResponse.Package.Vehicles.Vehicle.Price.Selling getSelling() {
                        return selling;
                    }

                    /**
                     * 设置selling属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Selling }
                     *     
                     */
                    public void setSelling(SearchResponse.Package.Vehicles.Vehicle.Price.Selling value) {
                        this.selling = value;
                    }

                    /**
                     * 获取modular属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Modular }
                     *     
                     */
                    public SearchResponse.Package.Vehicles.Vehicle.Price.Modular getModular() {
                        return modular;
                    }

                    /**
                     * 设置modular属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Modular }
                     *     
                     */
                    public void setModular(SearchResponse.Package.Vehicles.Vehicle.Price.Modular value) {
                        this.modular = value;
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
                     *         &lt;element name="Original">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Pricing">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Selling">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
                        "original",
                        "pricing",
                        "selling"
                    })
                    public static class Modular {

                        @XmlElement(name = "Original", required = true)
                        protected SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Original original;
                        @XmlElement(name = "Pricing", required = true)
                        protected SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Pricing pricing;
                        @XmlElement(name = "Selling", required = true)
                        protected SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Selling selling;

                        /**
                         * 获取original属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Original }
                         *     
                         */
                        public SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Original getOriginal() {
                            return original;
                        }

                        /**
                         * 设置original属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Original }
                         *     
                         */
                        public void setOriginal(SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Original value) {
                            this.original = value;
                        }

                        /**
                         * 获取pricing属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Pricing }
                         *     
                         */
                        public SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Pricing getPricing() {
                            return pricing;
                        }

                        /**
                         * 设置pricing属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Pricing }
                         *     
                         */
                        public void setPricing(SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Pricing value) {
                            this.pricing = value;
                        }

                        /**
                         * 获取selling属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Selling }
                         *     
                         */
                        public SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Selling getSelling() {
                            return selling;
                        }

                        /**
                         * 设置selling属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Selling }
                         *     
                         */
                        public void setSelling(SearchResponse.Package.Vehicles.Vehicle.Price.Modular.Selling value) {
                            this.selling = value;
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
                         *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Original {

                            @XmlAttribute(name = "Amount")
                            protected BigDecimal amount;
                            @XmlAttribute(name = "CurrencyCode")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String currencyCode;

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
                         *       &lt;/sequence>
                         *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "priceAdjustments"
                        })
                        public static class Pricing {

                            @XmlElement(name = "PriceAdjustments")
                            protected ExPriceAdjustmentsType priceAdjustments;
                            @XmlAttribute(name = "Amount")
                            protected BigDecimal amount;
                            @XmlAttribute(name = "CurrencyCode")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String currencyCode;
                            @XmlAttribute(name = "AdjustedAmount")
                            protected BigDecimal adjustedAmount;

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
                             * 获取adjustedAmount属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getAdjustedAmount() {
                                return adjustedAmount;
                            }

                            /**
                             * 设置adjustedAmount属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setAdjustedAmount(BigDecimal value) {
                                this.adjustedAmount = value;
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
                         *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                         *       &lt;/sequence>
                         *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "priceAdjustments"
                        })
                        public static class Selling {

                            @XmlElement(name = "PriceAdjustments")
                            protected ExPriceAdjustmentsType priceAdjustments;
                            @XmlAttribute(name = "Amount")
                            protected BigDecimal amount;
                            @XmlAttribute(name = "CurrencyCode")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String currencyCode;
                            @XmlAttribute(name = "AdjustedAmount")
                            protected BigDecimal adjustedAmount;

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
                             * 获取adjustedAmount属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getAdjustedAmount() {
                                return adjustedAmount;
                            }

                            /**
                             * 设置adjustedAmount属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setAdjustedAmount(BigDecimal value) {
                                this.adjustedAmount = value;
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
                     *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Original {

                        @XmlAttribute(name = "Amount")
                        protected BigDecimal amount;
                        @XmlAttribute(name = "CurrencyCode")
                        @XmlSchemaType(name = "anySimpleType")
                        protected String currencyCode;

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
                     *       &lt;/sequence>
                     *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "priceAdjustments"
                    })
                    public static class Pricing {

                        @XmlElement(name = "PriceAdjustments")
                        protected ExPriceAdjustmentsType priceAdjustments;
                        @XmlAttribute(name = "Amount")
                        protected BigDecimal amount;
                        @XmlAttribute(name = "CurrencyCode")
                        @XmlSchemaType(name = "anySimpleType")
                        protected String currencyCode;
                        @XmlAttribute(name = "AdjustedAmount")
                        protected BigDecimal adjustedAmount;

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
                         * 获取adjustedAmount属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getAdjustedAmount() {
                            return adjustedAmount;
                        }

                        /**
                         * 设置adjustedAmount属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setAdjustedAmount(BigDecimal value) {
                            this.adjustedAmount = value;
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
                     *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="AdjustedAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "priceAdjustments"
                    })
                    public static class Selling {

                        @XmlElement(name = "PriceAdjustments")
                        protected ExPriceAdjustmentsType priceAdjustments;
                        @XmlAttribute(name = "Amount")
                        protected BigDecimal amount;
                        @XmlAttribute(name = "CurrencyCode")
                        @XmlSchemaType(name = "anySimpleType")
                        protected String currencyCode;
                        @XmlAttribute(name = "AdjustedAmount")
                        protected BigDecimal adjustedAmount;

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
                         * 获取adjustedAmount属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getAdjustedAmount() {
                            return adjustedAmount;
                        }

                        /**
                         * 设置adjustedAmount属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setAdjustedAmount(BigDecimal value) {
                            this.adjustedAmount = value;
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
                 *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
                 *       &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "priceAdjustments"
                })
                public static class PriceAdjustments {

                    @XmlElement(name = "PriceAdjustments")
                    protected ExPriceAdjustmentsType priceAdjustments;
                    @XmlAttribute(name = "Adjusted")
                    protected Float adjusted;
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
                     * 获取adjusted属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    public Float getAdjusted() {
                        return adjusted;
                    }

                    /**
                     * 设置adjusted属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    public void setAdjusted(Float value) {
                        this.adjusted = value;
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
                 *         &lt;element name="VehAvailCore">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType">
                 *               &lt;/extension>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
                 *         &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/>
                 *         &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "vehAvailCore",
                    "vendor",
                    "vehRentalCore",
                    "vehAvailInfo"
                })
                public static class VehAvail {

                    @XmlElement(name = "VehAvailCore", required = true)
                    protected SearchResponse.Package.Vehicles.Vehicle.VehAvail.VehAvailCore vehAvailCore;
                    @XmlElement(name = "Vendor")
                    protected CompanyNameType vendor;
                    @XmlElement(name = "VehRentalCore", required = true)
                    protected VehicleRentalCoreType vehRentalCore;
                    @XmlElement(name = "VehAvailInfo")
                    protected VehicleAvailAdditionalInfoType vehAvailInfo;
                    @XmlAttribute(name = "Reference")
                    protected String reference;

                    /**
                     * 获取vehAvailCore属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SearchResponse.Package.Vehicles.Vehicle.VehAvail.VehAvailCore }
                     *     
                     */
                    public SearchResponse.Package.Vehicles.Vehicle.VehAvail.VehAvailCore getVehAvailCore() {
                        return vehAvailCore;
                    }

                    /**
                     * 设置vehAvailCore属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SearchResponse.Package.Vehicles.Vehicle.VehAvail.VehAvailCore }
                     *     
                     */
                    public void setVehAvailCore(SearchResponse.Package.Vehicles.Vehicle.VehAvail.VehAvailCore value) {
                        this.vehAvailCore = value;
                    }

                    /**
                     * 获取vendor属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link CompanyNameType }
                     *     
                     */
                    public CompanyNameType getVendor() {
                        return vendor;
                    }

                    /**
                     * 设置vendor属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CompanyNameType }
                     *     
                     */
                    public void setVendor(CompanyNameType value) {
                        this.vendor = value;
                    }

                    /**
                     * 获取vehRentalCore属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link VehicleRentalCoreType }
                     *     
                     */
                    public VehicleRentalCoreType getVehRentalCore() {
                        return vehRentalCore;
                    }

                    /**
                     * 设置vehRentalCore属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VehicleRentalCoreType }
                     *     
                     */
                    public void setVehRentalCore(VehicleRentalCoreType value) {
                        this.vehRentalCore = value;
                    }

                    /**
                     * 获取vehAvailInfo属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link VehicleAvailAdditionalInfoType }
                     *     
                     */
                    public VehicleAvailAdditionalInfoType getVehAvailInfo() {
                        return vehAvailInfo;
                    }

                    /**
                     * 设置vehAvailInfo属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VehicleAvailAdditionalInfoType }
                     *     
                     */
                    public void setVehAvailInfo(VehicleAvailAdditionalInfoType value) {
                        this.vehAvailInfo = value;
                    }

                    /**
                     * 获取reference属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getReference() {
                        return reference;
                    }

                    /**
                     * 设置reference属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setReference(String value) {
                        this.reference = value;
                    }


                    /**
                     * <p>anonymous complex type的 Java 类。
                     * 
                     * <p>以下模式片段指定包含在此类中的预期内容。
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType">
                     *     &lt;/extension>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class VehAvailCore
                        extends VehicleAvailCoreType
                    {


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
     *         &lt;element name="RoomStay" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
     *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="MoreIndicator" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomStay"
    })
    public static class RoomStays {

        @XmlElement(name = "RoomStay", required = true)
        protected List<SearchResponse.RoomStays.RoomStay> roomStay;
        @XmlAttribute(name = "MoreIndicator")
        protected String moreIndicator;

        /**
         * Gets the value of the roomStay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomStay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomStay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchResponse.RoomStays.RoomStay }
         * 
         * 
         */
        public List<SearchResponse.RoomStays.RoomStay> getRoomStay() {
            if (roomStay == null) {
                roomStay = new ArrayList<SearchResponse.RoomStays.RoomStay>();
            }
            return this.roomStay;
        }

        /**
         * 获取moreIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoreIndicator() {
            return moreIndicator;
        }

        /**
         * 设置moreIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoreIndicator(String value) {
            this.moreIndicator = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
         *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RoomStay
            extends RoomStayType
        {

            @XmlAttribute(name = "Reference")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger reference;

            /**
             * 获取reference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getReference() {
                return reference;
            }

            /**
             * 设置reference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setReference(BigInteger value) {
                this.reference = value;
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
     *         &lt;element name="VehAvail" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VehAvailCore">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *                   &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/>
     *                   &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "vehAvail"
    })
    public static class VehAvails {

        @XmlElement(name = "VehAvail", required = true)
        protected List<SearchResponse.VehAvails.VehAvail> vehAvail;

        /**
         * Gets the value of the vehAvail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehAvail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehAvail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchResponse.VehAvails.VehAvail }
         * 
         * 
         */
        public List<SearchResponse.VehAvails.VehAvail> getVehAvail() {
            if (vehAvail == null) {
                vehAvail = new ArrayList<SearchResponse.VehAvails.VehAvail>();
            }
            return this.vehAvail;
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
         *         &lt;element name="VehAvailCore">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType">
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
         *         &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/>
         *         &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vehAvailCore",
            "vendor",
            "vehRentalCore",
            "vehAvailInfo"
        })
        public static class VehAvail {

            @XmlElement(name = "VehAvailCore", required = true)
            protected SearchResponse.VehAvails.VehAvail.VehAvailCore vehAvailCore;
            @XmlElement(name = "Vendor")
            protected CompanyNameType vendor;
            @XmlElement(name = "VehRentalCore", required = true)
            protected VehicleRentalCoreType vehRentalCore;
            @XmlElement(name = "VehAvailInfo")
            protected VehicleAvailAdditionalInfoType vehAvailInfo;
            @XmlAttribute(name = "Reference")
            protected String reference;

            /**
             * 获取vehAvailCore属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SearchResponse.VehAvails.VehAvail.VehAvailCore }
             *     
             */
            public SearchResponse.VehAvails.VehAvail.VehAvailCore getVehAvailCore() {
                return vehAvailCore;
            }

            /**
             * 设置vehAvailCore属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SearchResponse.VehAvails.VehAvail.VehAvailCore }
             *     
             */
            public void setVehAvailCore(SearchResponse.VehAvails.VehAvail.VehAvailCore value) {
                this.vehAvailCore = value;
            }

            /**
             * 获取vendor属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CompanyNameType }
             *     
             */
            public CompanyNameType getVendor() {
                return vendor;
            }

            /**
             * 设置vendor属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyNameType }
             *     
             */
            public void setVendor(CompanyNameType value) {
                this.vendor = value;
            }

            /**
             * 获取vehRentalCore属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleRentalCoreType }
             *     
             */
            public VehicleRentalCoreType getVehRentalCore() {
                return vehRentalCore;
            }

            /**
             * 设置vehRentalCore属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleRentalCoreType }
             *     
             */
            public void setVehRentalCore(VehicleRentalCoreType value) {
                this.vehRentalCore = value;
            }

            /**
             * 获取vehAvailInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleAvailAdditionalInfoType }
             *     
             */
            public VehicleAvailAdditionalInfoType getVehAvailInfo() {
                return vehAvailInfo;
            }

            /**
             * 设置vehAvailInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleAvailAdditionalInfoType }
             *     
             */
            public void setVehAvailInfo(VehicleAvailAdditionalInfoType value) {
                this.vehAvailInfo = value;
            }

            /**
             * 获取reference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference() {
                return reference;
            }

            /**
             * 设置reference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference(String value) {
                this.reference = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class VehAvailCore
                extends VehicleAvailCoreType
            {


            }

        }

    }

}
