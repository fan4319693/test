//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This is to be used for verification that the record to be returned is the specific record requested.
 * 
 * <p>VerificationPNR complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VerificationPNR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VerificationType">
 *       &lt;sequence>
 *         &lt;element name="SaleTimeSpan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TravelStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="State">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="PreTravel"/>
 *                       &lt;enumeration value="PostTravel"/>
 *                       &lt;enumeration value="InTravel"/>
 *                       &lt;enumeration value="Cancelled"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="State">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="RefundDue"/>
 *                       &lt;enumeration value="PaymentDue"/>
 *                       &lt;enumeration value="FullyPaid"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingStatus" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="State">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="booked"/>
 *                       &lt;enumeration value="cancelled"/>
 *                       &lt;enumeration value="ticketSuccess"/>
 *                       &lt;enumeration value="pendingPayment"/>
 *                       &lt;enumeration value="pendingTicket"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArchivalStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="State">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Archived"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Product" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Air" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>OperatingAirlineType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
 *                           &lt;attribute name="PromotionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="EncryptedTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Hotel" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Vehicle" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Activity" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
 *                           &lt;attribute name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CrossSell" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ProductSubType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Membership" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
 *                           &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Insurance" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
 *                           &lt;attribute name="Synchronise" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AncillaryProduct" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
 *                           &lt;attribute name="LoungeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Ferry" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Cruise" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Coupon" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Coupons" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Coupon" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remarks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Remark">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="State">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="present"/>
 *                                 &lt;enumeration value="absent"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UniqueIDs" type="{http://www.opentravel.org/OTA/2003/05}UniqueIDsType" minOccurs="0"/>
 *         &lt;element name="AgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyProductType" minOccurs="0"/>
 *         &lt;element name="RefundApplicationTimeSpan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RefundReviewTimeSpan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RefundRepayTimeSpan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StartDateTimeSpan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Payments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Payment" type="{http://www.opentravel.org/OTA/2003/05}VerificationPNRPaymentType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Refunds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Refund" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Approver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TimeSpan" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ActionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="EntryPoint" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Reason" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DepartureCountry" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Source" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Locales" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Locale">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RequestorID" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Primary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueID" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                           &lt;attribute name="EncryptedID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Profile" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ProfileType">
 *                           &lt;attribute name="EncryptedId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Queue" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ReturnHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SearchContent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="QueueID1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="QueueName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BankID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PromotionCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InsuranceExtra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdjAgentID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdjCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdjOfficeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdjustmentTimeSpan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LoyaltyCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="EncryptedCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CrossRefs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Seat" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="EmdTktNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AutoRefundStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeliItineraryStatus" type="{http://www.opentravel.org/OTA/2003/05}DeliItineraryStatusType" minOccurs="0"/>
 *         &lt;element name="HotelItineraryStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LastModifiedTimeSpan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShopId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AirTraveler" type="{http://www.opentravel.org/OTA/2003/05}AirTravelerType"/>
 *         &lt;element name="Products" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}VerificationTicketingType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Air" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="OriginDestinationOption" type="{http://www.opentravel.org/OTA/2003/05}VerificationODOType" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ReservationTimeSpan" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ticketing" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TimeSpan" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Reshop" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TimeSpan" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ModifyType" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CrossChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EncryptedPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EncryptedEmail" type="{http://www.opentravel.org/OTA/2003/05}EmailType" minOccurs="0"/>
 *         &lt;element name="AssociatedBookings" type="{http://www.opentravel.org/OTA/2003/05}AssociatedBookingsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationPNR", propOrder = {
    "saleTimeSpan",
    "travelStatus",
    "paymentStatus",
    "bookingStatus",
    "archivalStatus",
    "product",
    "coupons",
    "remarks",
    "uniqueIDs",
    "agentID",
    "loyalty",
    "refundApplicationTimeSpan",
    "refundReviewTimeSpan",
    "refundRepayTimeSpan",
    "startDateTimeSpan",
    "payments",
    "refunds",
    "departureCountry",
    "source",
    "primary",
    "queue",
    "bankID",
    "channel",
    "phone",
    "promotionCode",
    "insuranceExtra",
    "adjAgentID",
    "adjCode",
    "adjOfficeID",
    "adjustmentTimeSpan",
    "userType",
    "loyaltyCode",
    "crossRefs",
    "seat",
    "autoRefundStatus",
    "deliItineraryStatus",
    "hotelItineraryStatus",
    "lastModifiedTimeSpan",
    "shopId",
    "airTraveler",
    "products",
    "ticketing",
    "reshop",
    "modifyType",
    "encryptedPhone",
    "encryptedEmail",
    "associatedBookings"
})
public class VerificationPNR
    extends VerificationType
{

    @XmlElement(name = "SaleTimeSpan")
    protected VerificationPNR.SaleTimeSpan saleTimeSpan;
    @XmlElement(name = "TravelStatus")
    protected VerificationPNR.TravelStatus travelStatus;
    @XmlElement(name = "PaymentStatus")
    protected VerificationPNR.PaymentStatus paymentStatus;
    @XmlElement(name = "BookingStatus")
    protected List<VerificationPNR.BookingStatus> bookingStatus;
    @XmlElement(name = "ArchivalStatus")
    protected VerificationPNR.ArchivalStatus archivalStatus;
    @XmlElement(name = "Product")
    protected VerificationPNR.Product product;
    @XmlElement(name = "Coupons")
    protected VerificationPNR.Coupons coupons;
    @XmlElement(name = "Remarks")
    protected VerificationPNR.Remarks remarks;
    @XmlElement(name = "UniqueIDs")
    protected UniqueIDsType uniqueIDs;
    @XmlElement(name = "AgentID")
    protected String agentID;
    @XmlElement(name = "Loyalty")
    protected LoyaltyProductType loyalty;
    @XmlElement(name = "RefundApplicationTimeSpan")
    protected VerificationPNR.RefundApplicationTimeSpan refundApplicationTimeSpan;
    @XmlElement(name = "RefundReviewTimeSpan")
    protected VerificationPNR.RefundReviewTimeSpan refundReviewTimeSpan;
    @XmlElement(name = "RefundRepayTimeSpan")
    protected VerificationPNR.RefundRepayTimeSpan refundRepayTimeSpan;
    @XmlElement(name = "StartDateTimeSpan")
    protected VerificationPNR.StartDateTimeSpan startDateTimeSpan;
    @XmlElement(name = "Payments")
    protected VerificationPNR.Payments payments;
    @XmlElement(name = "Refunds")
    protected VerificationPNR.Refunds refunds;
    @XmlElement(name = "DepartureCountry")
    protected VerificationPNR.DepartureCountry departureCountry;
    @XmlElement(name = "Source")
    protected VerificationPNR.Source source;
    @XmlElement(name = "Primary")
    protected VerificationPNR.Primary primary;
    @XmlElement(name = "Queue")
    protected List<VerificationPNR.Queue> queue;
    @XmlElement(name = "BankID", required = true)
    protected String bankID;
    @XmlElement(name = "Channel", required = true)
    protected String channel;
    @XmlElement(name = "Phone", required = true)
    protected String phone;
    @XmlElement(name = "PromotionCode")
    protected VerificationPNR.PromotionCode promotionCode;
    @XmlElement(name = "InsuranceExtra", required = true)
    protected String insuranceExtra;
    @XmlElement(name = "AdjAgentID", required = true)
    protected String adjAgentID;
    @XmlElement(name = "AdjCode", required = true)
    protected String adjCode;
    @XmlElement(name = "AdjOfficeID", required = true)
    protected String adjOfficeID;
    @XmlElement(name = "AdjustmentTimeSpan")
    protected VerificationPNR.AdjustmentTimeSpan adjustmentTimeSpan;
    @XmlElement(name = "UserType", required = true)
    protected String userType;
    @XmlElement(name = "LoyaltyCode")
    protected VerificationPNR.LoyaltyCode loyaltyCode;
    @XmlElement(name = "CrossRefs")
    protected VerificationPNR.CrossRefs crossRefs;
    @XmlElement(name = "Seat")
    protected VerificationPNR.Seat seat;
    @XmlElement(name = "AutoRefundStatus", required = true)
    protected String autoRefundStatus;
    @XmlElement(name = "DeliItineraryStatus")
    protected DeliItineraryStatusType deliItineraryStatus;
    @XmlElement(name = "HotelItineraryStatus")
    protected VerificationPNR.HotelItineraryStatus hotelItineraryStatus;
    @XmlElement(name = "LastModifiedTimeSpan")
    protected VerificationPNR.LastModifiedTimeSpan lastModifiedTimeSpan;
    @XmlElement(name = "ShopId", required = true)
    protected String shopId;
    @XmlElement(name = "AirTraveler", required = true)
    protected AirTravelerType airTraveler;
    @XmlElement(name = "Products")
    protected VerificationPNR.Products products;
    @XmlElement(name = "Ticketing")
    protected List<VerificationPNR.Ticketing> ticketing;
    @XmlElement(name = "Reshop")
    protected List<VerificationPNR.Reshop> reshop;
    @XmlElement(name = "ModifyType")
    protected List<VerificationPNR.ModifyType> modifyType;
    @XmlElement(name = "EncryptedPhone", required = true)
    protected String encryptedPhone;
    @XmlElement(name = "EncryptedEmail")
    protected EmailType encryptedEmail;
    @XmlElement(name = "AssociatedBookings")
    protected AssociatedBookingsType associatedBookings;

    /**
     * 获取saleTimeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.SaleTimeSpan }
     *     
     */
    public VerificationPNR.SaleTimeSpan getSaleTimeSpan() {
        return saleTimeSpan;
    }

    /**
     * 设置saleTimeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.SaleTimeSpan }
     *     
     */
    public void setSaleTimeSpan(VerificationPNR.SaleTimeSpan value) {
        this.saleTimeSpan = value;
    }

    /**
     * 获取travelStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.TravelStatus }
     *     
     */
    public VerificationPNR.TravelStatus getTravelStatus() {
        return travelStatus;
    }

    /**
     * 设置travelStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.TravelStatus }
     *     
     */
    public void setTravelStatus(VerificationPNR.TravelStatus value) {
        this.travelStatus = value;
    }

    /**
     * 获取paymentStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.PaymentStatus }
     *     
     */
    public VerificationPNR.PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * 设置paymentStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.PaymentStatus }
     *     
     */
    public void setPaymentStatus(VerificationPNR.PaymentStatus value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the bookingStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationPNR.BookingStatus }
     * 
     * 
     */
    public List<VerificationPNR.BookingStatus> getBookingStatus() {
        if (bookingStatus == null) {
            bookingStatus = new ArrayList<VerificationPNR.BookingStatus>();
        }
        return this.bookingStatus;
    }

    /**
     * 获取archivalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.ArchivalStatus }
     *     
     */
    public VerificationPNR.ArchivalStatus getArchivalStatus() {
        return archivalStatus;
    }

    /**
     * 设置archivalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.ArchivalStatus }
     *     
     */
    public void setArchivalStatus(VerificationPNR.ArchivalStatus value) {
        this.archivalStatus = value;
    }

    /**
     * 获取product属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.Product }
     *     
     */
    public VerificationPNR.Product getProduct() {
        return product;
    }

    /**
     * 设置product属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.Product }
     *     
     */
    public void setProduct(VerificationPNR.Product value) {
        this.product = value;
    }

    /**
     * 获取coupons属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.Coupons }
     *     
     */
    public VerificationPNR.Coupons getCoupons() {
        return coupons;
    }

    /**
     * 设置coupons属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.Coupons }
     *     
     */
    public void setCoupons(VerificationPNR.Coupons value) {
        this.coupons = value;
    }

    /**
     * 获取remarks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.Remarks }
     *     
     */
    public VerificationPNR.Remarks getRemarks() {
        return remarks;
    }

    /**
     * 设置remarks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.Remarks }
     *     
     */
    public void setRemarks(VerificationPNR.Remarks value) {
        this.remarks = value;
    }

    /**
     * 获取uniqueIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDsType }
     *     
     */
    public UniqueIDsType getUniqueIDs() {
        return uniqueIDs;
    }

    /**
     * 设置uniqueIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDsType }
     *     
     */
    public void setUniqueIDs(UniqueIDsType value) {
        this.uniqueIDs = value;
    }

    /**
     * 获取agentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * 设置agentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentID(String value) {
        this.agentID = value;
    }

    /**
     * 获取loyalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProductType }
     *     
     */
    public LoyaltyProductType getLoyalty() {
        return loyalty;
    }

    /**
     * 设置loyalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProductType }
     *     
     */
    public void setLoyalty(LoyaltyProductType value) {
        this.loyalty = value;
    }

    /**
     * 获取refundApplicationTimeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.RefundApplicationTimeSpan }
     *     
     */
    public VerificationPNR.RefundApplicationTimeSpan getRefundApplicationTimeSpan() {
        return refundApplicationTimeSpan;
    }

    /**
     * 设置refundApplicationTimeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.RefundApplicationTimeSpan }
     *     
     */
    public void setRefundApplicationTimeSpan(VerificationPNR.RefundApplicationTimeSpan value) {
        this.refundApplicationTimeSpan = value;
    }

    /**
     * 获取refundReviewTimeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.RefundReviewTimeSpan }
     *     
     */
    public VerificationPNR.RefundReviewTimeSpan getRefundReviewTimeSpan() {
        return refundReviewTimeSpan;
    }

    /**
     * 设置refundReviewTimeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.RefundReviewTimeSpan }
     *     
     */
    public void setRefundReviewTimeSpan(VerificationPNR.RefundReviewTimeSpan value) {
        this.refundReviewTimeSpan = value;
    }

    /**
     * 获取refundRepayTimeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.RefundRepayTimeSpan }
     *     
     */
    public VerificationPNR.RefundRepayTimeSpan getRefundRepayTimeSpan() {
        return refundRepayTimeSpan;
    }

    /**
     * 设置refundRepayTimeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.RefundRepayTimeSpan }
     *     
     */
    public void setRefundRepayTimeSpan(VerificationPNR.RefundRepayTimeSpan value) {
        this.refundRepayTimeSpan = value;
    }

    /**
     * 获取startDateTimeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.StartDateTimeSpan }
     *     
     */
    public VerificationPNR.StartDateTimeSpan getStartDateTimeSpan() {
        return startDateTimeSpan;
    }

    /**
     * 设置startDateTimeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.StartDateTimeSpan }
     *     
     */
    public void setStartDateTimeSpan(VerificationPNR.StartDateTimeSpan value) {
        this.startDateTimeSpan = value;
    }

    /**
     * 获取payments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.Payments }
     *     
     */
    public VerificationPNR.Payments getPayments() {
        return payments;
    }

    /**
     * 设置payments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.Payments }
     *     
     */
    public void setPayments(VerificationPNR.Payments value) {
        this.payments = value;
    }

    /**
     * 获取refunds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.Refunds }
     *     
     */
    public VerificationPNR.Refunds getRefunds() {
        return refunds;
    }

    /**
     * 设置refunds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.Refunds }
     *     
     */
    public void setRefunds(VerificationPNR.Refunds value) {
        this.refunds = value;
    }

    /**
     * 获取departureCountry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.DepartureCountry }
     *     
     */
    public VerificationPNR.DepartureCountry getDepartureCountry() {
        return departureCountry;
    }

    /**
     * 设置departureCountry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.DepartureCountry }
     *     
     */
    public void setDepartureCountry(VerificationPNR.DepartureCountry value) {
        this.departureCountry = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.Source }
     *     
     */
    public VerificationPNR.Source getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.Source }
     *     
     */
    public void setSource(VerificationPNR.Source value) {
        this.source = value;
    }

    /**
     * 获取primary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.Primary }
     *     
     */
    public VerificationPNR.Primary getPrimary() {
        return primary;
    }

    /**
     * 设置primary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.Primary }
     *     
     */
    public void setPrimary(VerificationPNR.Primary value) {
        this.primary = value;
    }

    /**
     * Gets the value of the queue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationPNR.Queue }
     * 
     * 
     */
    public List<VerificationPNR.Queue> getQueue() {
        if (queue == null) {
            queue = new ArrayList<VerificationPNR.Queue>();
        }
        return this.queue;
    }

    /**
     * 获取bankID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * 设置bankID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankID(String value) {
        this.bankID = value;
    }

    /**
     * 获取channel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置channel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 获取promotionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.PromotionCode }
     *     
     */
    public VerificationPNR.PromotionCode getPromotionCode() {
        return promotionCode;
    }

    /**
     * 设置promotionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.PromotionCode }
     *     
     */
    public void setPromotionCode(VerificationPNR.PromotionCode value) {
        this.promotionCode = value;
    }

    /**
     * 获取insuranceExtra属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceExtra() {
        return insuranceExtra;
    }

    /**
     * 设置insuranceExtra属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceExtra(String value) {
        this.insuranceExtra = value;
    }

    /**
     * 获取adjAgentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjAgentID() {
        return adjAgentID;
    }

    /**
     * 设置adjAgentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjAgentID(String value) {
        this.adjAgentID = value;
    }

    /**
     * 获取adjCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjCode() {
        return adjCode;
    }

    /**
     * 设置adjCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjCode(String value) {
        this.adjCode = value;
    }

    /**
     * 获取adjOfficeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjOfficeID() {
        return adjOfficeID;
    }

    /**
     * 设置adjOfficeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjOfficeID(String value) {
        this.adjOfficeID = value;
    }

    /**
     * 获取adjustmentTimeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.AdjustmentTimeSpan }
     *     
     */
    public VerificationPNR.AdjustmentTimeSpan getAdjustmentTimeSpan() {
        return adjustmentTimeSpan;
    }

    /**
     * 设置adjustmentTimeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.AdjustmentTimeSpan }
     *     
     */
    public void setAdjustmentTimeSpan(VerificationPNR.AdjustmentTimeSpan value) {
        this.adjustmentTimeSpan = value;
    }

    /**
     * 获取userType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置userType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * 获取loyaltyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.LoyaltyCode }
     *     
     */
    public VerificationPNR.LoyaltyCode getLoyaltyCode() {
        return loyaltyCode;
    }

    /**
     * 设置loyaltyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.LoyaltyCode }
     *     
     */
    public void setLoyaltyCode(VerificationPNR.LoyaltyCode value) {
        this.loyaltyCode = value;
    }

    /**
     * 获取crossRefs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.CrossRefs }
     *     
     */
    public VerificationPNR.CrossRefs getCrossRefs() {
        return crossRefs;
    }

    /**
     * 设置crossRefs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.CrossRefs }
     *     
     */
    public void setCrossRefs(VerificationPNR.CrossRefs value) {
        this.crossRefs = value;
    }

    /**
     * 获取seat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.Seat }
     *     
     */
    public VerificationPNR.Seat getSeat() {
        return seat;
    }

    /**
     * 设置seat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.Seat }
     *     
     */
    public void setSeat(VerificationPNR.Seat value) {
        this.seat = value;
    }

    /**
     * 获取autoRefundStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoRefundStatus() {
        return autoRefundStatus;
    }

    /**
     * 设置autoRefundStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoRefundStatus(String value) {
        this.autoRefundStatus = value;
    }

    /**
     * 获取deliItineraryStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeliItineraryStatusType }
     *     
     */
    public DeliItineraryStatusType getDeliItineraryStatus() {
        return deliItineraryStatus;
    }

    /**
     * 设置deliItineraryStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeliItineraryStatusType }
     *     
     */
    public void setDeliItineraryStatus(DeliItineraryStatusType value) {
        this.deliItineraryStatus = value;
    }

    /**
     * 获取hotelItineraryStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.HotelItineraryStatus }
     *     
     */
    public VerificationPNR.HotelItineraryStatus getHotelItineraryStatus() {
        return hotelItineraryStatus;
    }

    /**
     * 设置hotelItineraryStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.HotelItineraryStatus }
     *     
     */
    public void setHotelItineraryStatus(VerificationPNR.HotelItineraryStatus value) {
        this.hotelItineraryStatus = value;
    }

    /**
     * 获取lastModifiedTimeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.LastModifiedTimeSpan }
     *     
     */
    public VerificationPNR.LastModifiedTimeSpan getLastModifiedTimeSpan() {
        return lastModifiedTimeSpan;
    }

    /**
     * 设置lastModifiedTimeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.LastModifiedTimeSpan }
     *     
     */
    public void setLastModifiedTimeSpan(VerificationPNR.LastModifiedTimeSpan value) {
        this.lastModifiedTimeSpan = value;
    }

    /**
     * 获取shopId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * 设置shopId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopId(String value) {
        this.shopId = value;
    }

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
     * 获取products属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerificationPNR.Products }
     *     
     */
    public VerificationPNR.Products getProducts() {
        return products;
    }

    /**
     * 设置products属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationPNR.Products }
     *     
     */
    public void setProducts(VerificationPNR.Products value) {
        this.products = value;
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
     * {@link VerificationPNR.Ticketing }
     * 
     * 
     */
    public List<VerificationPNR.Ticketing> getTicketing() {
        if (ticketing == null) {
            ticketing = new ArrayList<VerificationPNR.Ticketing>();
        }
        return this.ticketing;
    }

    /**
     * Gets the value of the reshop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reshop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReshop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationPNR.Reshop }
     * 
     * 
     */
    public List<VerificationPNR.Reshop> getReshop() {
        if (reshop == null) {
            reshop = new ArrayList<VerificationPNR.Reshop>();
        }
        return this.reshop;
    }

    /**
     * Gets the value of the modifyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationPNR.ModifyType }
     * 
     * 
     */
    public List<VerificationPNR.ModifyType> getModifyType() {
        if (modifyType == null) {
            modifyType = new ArrayList<VerificationPNR.ModifyType>();
        }
        return this.modifyType;
    }

    /**
     * 获取encryptedPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedPhone() {
        return encryptedPhone;
    }

    /**
     * 设置encryptedPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedPhone(String value) {
        this.encryptedPhone = value;
    }

    /**
     * 获取encryptedEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getEncryptedEmail() {
        return encryptedEmail;
    }

    /**
     * 设置encryptedEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setEncryptedEmail(EmailType value) {
        this.encryptedEmail = value;
    }

    /**
     * 获取associatedBookings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AssociatedBookingsType }
     *     
     */
    public AssociatedBookingsType getAssociatedBookings() {
        return associatedBookings;
    }

    /**
     * 设置associatedBookings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedBookingsType }
     *     
     */
    public void setAssociatedBookings(AssociatedBookingsType value) {
        this.associatedBookings = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdjustmentTimeSpan {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected BigInteger duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "RangeNum")
        protected BigInteger rangeNum;
        @XmlAttribute(name = "SearchTimeZone")
        protected String searchTimeZone;

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
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
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
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRangeNum(BigInteger value) {
            this.rangeNum = value;
        }

        /**
         * 获取searchTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchTimeZone() {
            return searchTimeZone;
        }

        /**
         * 设置searchTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchTimeZone(String value) {
            this.searchTimeZone = value;
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
     *       &lt;attribute name="State">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Archived"/>
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
    public static class ArchivalStatus {

        @XmlAttribute(name = "State")
        protected String state;

        /**
         * 获取state属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * 设置state属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
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
     *       &lt;attribute name="State">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="booked"/>
     *             &lt;enumeration value="cancelled"/>
     *             &lt;enumeration value="ticketSuccess"/>
     *             &lt;enumeration value="pendingPayment"/>
     *             &lt;enumeration value="pendingTicket"/>
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
    public static class BookingStatus {

        @XmlAttribute(name = "State")
        protected String state;

        /**
         * 获取state属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * 设置state属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
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
     *         &lt;element name="Coupon" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "coupon"
    })
    public static class Coupons {

        @XmlElement(name = "Coupon", required = true)
        protected List<VerificationPNR.Coupons.Coupon> coupon;

        /**
         * Gets the value of the coupon property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coupon property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoupon().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VerificationPNR.Coupons.Coupon }
         * 
         * 
         */
        public List<VerificationPNR.Coupons.Coupon> getCoupon() {
            if (coupon == null) {
                coupon = new ArrayList<VerificationPNR.Coupons.Coupon>();
            }
            return this.coupon;
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
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Coupon {

            @XmlAttribute(name = "ID")
            @XmlSchemaType(name = "anySimpleType")
            protected String id;

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
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
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
        "uniqueID"
    })
    public static class CrossRefs {

        @XmlElement(name = "UniqueID")
        protected List<UniqueIDType> uniqueID;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * Gets the value of the uniqueID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUniqueID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UniqueIDType }
         * 
         * 
         */
        public List<UniqueIDType> getUniqueID() {
            if (uniqueID == null) {
                uniqueID = new ArrayList<UniqueIDType>();
            }
            return this.uniqueID;
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
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DepartureCountry {

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
     *       &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelItineraryStatus {

        @XmlAttribute(name = "State")
        protected String state;

        /**
         * 获取state属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * 设置state属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LastModifiedTimeSpan {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected BigInteger duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "RangeNum")
        protected BigInteger rangeNum;
        @XmlAttribute(name = "SearchTimeZone")
        protected String searchTimeZone;

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
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
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
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRangeNum(BigInteger value) {
            this.rangeNum = value;
        }

        /**
         * 获取searchTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchTimeZone() {
            return searchTimeZone;
        }

        /**
         * 设置searchTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchTimeZone(String value) {
            this.searchTimeZone = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EncryptedCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LoyaltyCode {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "EncryptedCode")
        protected String encryptedCode;

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
         * 获取encryptedCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncryptedCode() {
            return encryptedCode;
        }

        /**
         * 设置encryptedCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncryptedCode(String value) {
            this.encryptedCode = value;
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
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CrossChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ModifyType {

        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "CrossChannel")
        protected Boolean crossChannel;

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
         * 获取crossChannel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCrossChannel() {
            return crossChannel;
        }

        /**
         * 设置crossChannel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCrossChannel(Boolean value) {
            this.crossChannel = value;
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
     *       &lt;attribute name="State">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="RefundDue"/>
     *             &lt;enumeration value="PaymentDue"/>
     *             &lt;enumeration value="FullyPaid"/>
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
    public static class PaymentStatus {

        @XmlAttribute(name = "State")
        protected String state;

        /**
         * 获取state属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * 设置state属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
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
     *         &lt;element name="Payment" type="{http://www.opentravel.org/OTA/2003/05}VerificationPNRPaymentType" maxOccurs="unbounded"/>
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
        "payment"
    })
    public static class Payments {

        @XmlElement(name = "Payment", required = true)
        protected List<VerificationPNRPaymentType> payment;

        /**
         * Gets the value of the payment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VerificationPNRPaymentType }
         * 
         * 
         */
        public List<VerificationPNRPaymentType> getPayment() {
            if (payment == null) {
                payment = new ArrayList<VerificationPNRPaymentType>();
            }
            return this.payment;
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
     *         &lt;element name="UniqueID" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *                 &lt;attribute name="EncryptedID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Profile" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ProfileType">
     *                 &lt;attribute name="EncryptedId" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "uniqueID",
        "profile"
    })
    public static class Primary {

        @XmlElement(name = "UniqueID")
        protected VerificationPNR.Primary.UniqueID uniqueID;
        @XmlElement(name = "Profile")
        protected VerificationPNR.Primary.Profile profile;

        /**
         * 获取uniqueID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Primary.UniqueID }
         *     
         */
        public VerificationPNR.Primary.UniqueID getUniqueID() {
            return uniqueID;
        }

        /**
         * 设置uniqueID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Primary.UniqueID }
         *     
         */
        public void setUniqueID(VerificationPNR.Primary.UniqueID value) {
            this.uniqueID = value;
        }

        /**
         * 获取profile属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Primary.Profile }
         *     
         */
        public VerificationPNR.Primary.Profile getProfile() {
            return profile;
        }

        /**
         * 设置profile属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Primary.Profile }
         *     
         */
        public void setProfile(VerificationPNR.Primary.Profile value) {
            this.profile = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ProfileType">
         *       &lt;attribute name="EncryptedId" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Profile
            extends ProfileType
        {

            @XmlAttribute(name = "EncryptedId")
            protected String encryptedId;

            /**
             * 获取encryptedId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEncryptedId() {
                return encryptedId;
            }

            /**
             * 设置encryptedId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEncryptedId(String value) {
                this.encryptedId = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
         *       &lt;attribute name="EncryptedID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UniqueID
            extends UniqueIDType
        {

            @XmlAttribute(name = "EncryptedID")
            protected String encryptedID;

            /**
             * 获取encryptedID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEncryptedID() {
                return encryptedID;
            }

            /**
             * 设置encryptedID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEncryptedID(String value) {
                this.encryptedID = value;
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
     *         &lt;element name="Air" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>OperatingAirlineType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
     *                 &lt;attribute name="PromotionType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EncryptedTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Hotel" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Vehicle" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Activity" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
     *                 &lt;attribute name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CrossSell" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ProductSubType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Membership" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
     *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Insurance" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
     *                 &lt;attribute name="Synchronise" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AncillaryProduct" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
     *                 &lt;attribute name="LoungeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Ferry" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Cruise" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Coupon" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "hotel",
        "vehicle",
        "activity",
        "membership",
        "insurance",
        "ancillaryProduct",
        "ferry",
        "cruise",
        "coupon"
    })
    public static class Product {

        @XmlElement(name = "Air")
        protected VerificationPNR.Product.Air air;
        @XmlElement(name = "Hotel")
        protected VerificationPNR.Product.Hotel hotel;
        @XmlElement(name = "Vehicle")
        protected VerificationPNR.Product.Vehicle vehicle;
        @XmlElement(name = "Activity")
        protected VerificationPNR.Product.Activity activity;
        @XmlElement(name = "Membership")
        protected List<VerificationPNR.Product.Membership> membership;
        @XmlElement(name = "Insurance")
        protected VerificationPNR.Product.Insurance insurance;
        @XmlElement(name = "AncillaryProduct")
        protected VerificationPNR.Product.AncillaryProduct ancillaryProduct;
        @XmlElement(name = "Ferry")
        protected VerificationPNR.Product.Ferry ferry;
        @XmlElement(name = "Cruise")
        protected VerificationPNR.Product.Cruise cruise;
        @XmlElement(name = "Coupon")
        protected VerificationPNR.Product.Coupon coupon;
        @XmlAttribute(name = "State")
        protected String state;
        @XmlAttribute(name = "Type")
        protected String type;

        /**
         * 获取air属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Product.Air }
         *     
         */
        public VerificationPNR.Product.Air getAir() {
            return air;
        }

        /**
         * 设置air属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Product.Air }
         *     
         */
        public void setAir(VerificationPNR.Product.Air value) {
            this.air = value;
        }

        /**
         * 获取hotel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Product.Hotel }
         *     
         */
        public VerificationPNR.Product.Hotel getHotel() {
            return hotel;
        }

        /**
         * 设置hotel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Product.Hotel }
         *     
         */
        public void setHotel(VerificationPNR.Product.Hotel value) {
            this.hotel = value;
        }

        /**
         * 获取vehicle属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Product.Vehicle }
         *     
         */
        public VerificationPNR.Product.Vehicle getVehicle() {
            return vehicle;
        }

        /**
         * 设置vehicle属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Product.Vehicle }
         *     
         */
        public void setVehicle(VerificationPNR.Product.Vehicle value) {
            this.vehicle = value;
        }

        /**
         * 获取activity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Product.Activity }
         *     
         */
        public VerificationPNR.Product.Activity getActivity() {
            return activity;
        }

        /**
         * 设置activity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Product.Activity }
         *     
         */
        public void setActivity(VerificationPNR.Product.Activity value) {
            this.activity = value;
        }

        /**
         * Gets the value of the membership property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the membership property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMembership().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VerificationPNR.Product.Membership }
         * 
         * 
         */
        public List<VerificationPNR.Product.Membership> getMembership() {
            if (membership == null) {
                membership = new ArrayList<VerificationPNR.Product.Membership>();
            }
            return this.membership;
        }

        /**
         * 获取insurance属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Product.Insurance }
         *     
         */
        public VerificationPNR.Product.Insurance getInsurance() {
            return insurance;
        }

        /**
         * 设置insurance属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Product.Insurance }
         *     
         */
        public void setInsurance(VerificationPNR.Product.Insurance value) {
            this.insurance = value;
        }

        /**
         * 获取ancillaryProduct属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Product.AncillaryProduct }
         *     
         */
        public VerificationPNR.Product.AncillaryProduct getAncillaryProduct() {
            return ancillaryProduct;
        }

        /**
         * 设置ancillaryProduct属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Product.AncillaryProduct }
         *     
         */
        public void setAncillaryProduct(VerificationPNR.Product.AncillaryProduct value) {
            this.ancillaryProduct = value;
        }

        /**
         * 获取ferry属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Product.Ferry }
         *     
         */
        public VerificationPNR.Product.Ferry getFerry() {
            return ferry;
        }

        /**
         * 设置ferry属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Product.Ferry }
         *     
         */
        public void setFerry(VerificationPNR.Product.Ferry value) {
            this.ferry = value;
        }

        /**
         * 获取cruise属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Product.Cruise }
         *     
         */
        public VerificationPNR.Product.Cruise getCruise() {
            return cruise;
        }

        /**
         * 设置cruise属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Product.Cruise }
         *     
         */
        public void setCruise(VerificationPNR.Product.Cruise value) {
            this.cruise = value;
        }

        /**
         * 获取coupon属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Product.Coupon }
         *     
         */
        public VerificationPNR.Product.Coupon getCoupon() {
            return coupon;
        }

        /**
         * 设置coupon属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Product.Coupon }
         *     
         */
        public void setCoupon(VerificationPNR.Product.Coupon value) {
            this.coupon = value;
        }

        /**
         * 获取state属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * 设置state属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
         *       &lt;attribute name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CrossSell" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ProductSubType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Activity {

            @XmlAttribute(name = "ItemCode")
            @XmlSchemaType(name = "anySimpleType")
            protected String itemCode;
            @XmlAttribute(name = "BookingReferenceID")
            protected String bookingReferenceID;
            @XmlAttribute(name = "CrossSell")
            protected Boolean crossSell;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "DestinationCode")
            protected String destinationCode;
            @XmlAttribute(name = "CustomerName")
            protected String customerName;
            @XmlAttribute(name = "ProductSubType")
            protected String productSubType;
            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "BookingChannel")
            protected String bookingChannel;
            @XmlAttribute(name = "SPNR_ProductID")
            protected String spnrProductID;
            @XmlAttribute(name = "productID")
            protected String productID;
            @XmlAttribute(name = "LandingPageProfileID")
            protected Integer landingPageProfileID;
            @XmlAttribute(name = "IsLoggedIn")
            protected Boolean isLoggedIn;
            @XmlAttribute(name = "SuperPNR_ID")
            protected String superPNRID;

            /**
             * 获取itemCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemCode() {
                return itemCode;
            }

            /**
             * 设置itemCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemCode(String value) {
                this.itemCode = value;
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
             * 获取crossSell属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCrossSell() {
                return crossSell;
            }

            /**
             * 设置crossSell属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCrossSell(Boolean value) {
                this.crossSell = value;
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
             * 获取destinationCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDestinationCode() {
                return destinationCode;
            }

            /**
             * 设置destinationCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDestinationCode(String value) {
                this.destinationCode = value;
            }

            /**
             * 获取customerName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerName() {
                return customerName;
            }

            /**
             * 设置customerName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerName(String value) {
                this.customerName = value;
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
             * 获取state属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
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
             * 获取spnrProductID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNRProductID() {
                return spnrProductID;
            }

            /**
             * 设置spnrProductID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNRProductID(String value) {
                this.spnrProductID = value;
            }

            /**
             * 获取productID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * 设置productID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * 获取landingPageProfileID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLandingPageProfileID() {
                return landingPageProfileID;
            }

            /**
             * 设置landingPageProfileID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLandingPageProfileID(Integer value) {
                this.landingPageProfileID = value;
            }

            /**
             * 获取isLoggedIn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLoggedIn() {
                return isLoggedIn;
            }

            /**
             * 设置isLoggedIn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsLoggedIn(Boolean value) {
                this.isLoggedIn = value;
            }

            /**
             * 获取superPNRID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuperPNRID() {
                return superPNRID;
            }

            /**
             * 设置superPNRID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuperPNRID(String value) {
                this.superPNRID = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
         *       &lt;attribute name="PromotionType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EncryptedTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Air
            extends OperatingAirlineType
        {

            @XmlAttribute(name = "PromotionType")
            protected String promotionType;
            @XmlAttribute(name = "TicketNumber")
            protected String ticketNumber;
            @XmlAttribute(name = "EncryptedTicketNumber")
            protected String encryptedTicketNumber;
            @XmlAttribute(name = "Route")
            protected String route;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "BookingChannel")
            protected String bookingChannel;
            @XmlAttribute(name = "SPNR_ProductID")
            protected String spnrProductID;
            @XmlAttribute(name = "productID")
            protected String productID;
            @XmlAttribute(name = "LandingPageProfileID")
            protected Integer landingPageProfileID;
            @XmlAttribute(name = "IsLoggedIn")
            protected Boolean isLoggedIn;
            @XmlAttribute(name = "SuperPNR_ID")
            protected String superPNRID;
            @XmlAttribute(name = "DocumentationRequired")
            protected String documentationRequired;
            @XmlAttribute(name = "DocReqExclCountries")
            protected List<String> docReqExclCountries;
            @XmlAttribute(name = "DocReqInclCountries")
            protected List<String> docReqInclCountries;

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
             * 获取ticketNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketNumber() {
                return ticketNumber;
            }

            /**
             * 设置ticketNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketNumber(String value) {
                this.ticketNumber = value;
            }

            /**
             * 获取encryptedTicketNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEncryptedTicketNumber() {
                return encryptedTicketNumber;
            }

            /**
             * 设置encryptedTicketNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEncryptedTicketNumber(String value) {
                this.encryptedTicketNumber = value;
            }

            /**
             * 获取route属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoute() {
                return route;
            }

            /**
             * 设置route属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoute(String value) {
                this.route = value;
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
             * 获取state属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
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
             * 获取spnrProductID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNRProductID() {
                return spnrProductID;
            }

            /**
             * 设置spnrProductID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNRProductID(String value) {
                this.spnrProductID = value;
            }

            /**
             * 获取productID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * 设置productID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * 获取landingPageProfileID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLandingPageProfileID() {
                return landingPageProfileID;
            }

            /**
             * 设置landingPageProfileID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLandingPageProfileID(Integer value) {
                this.landingPageProfileID = value;
            }

            /**
             * 获取isLoggedIn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLoggedIn() {
                return isLoggedIn;
            }

            /**
             * 设置isLoggedIn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsLoggedIn(Boolean value) {
                this.isLoggedIn = value;
            }

            /**
             * 获取superPNRID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuperPNRID() {
                return superPNRID;
            }

            /**
             * 设置superPNRID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuperPNRID(String value) {
                this.superPNRID = value;
            }

            /**
             * 获取documentationRequired属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentationRequired() {
                return documentationRequired;
            }

            /**
             * 设置documentationRequired属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentationRequired(String value) {
                this.documentationRequired = value;
            }

            /**
             * Gets the value of the docReqExclCountries property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the docReqExclCountries property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDocReqExclCountries().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getDocReqExclCountries() {
                if (docReqExclCountries == null) {
                    docReqExclCountries = new ArrayList<String>();
                }
                return this.docReqExclCountries;
            }

            /**
             * Gets the value of the docReqInclCountries property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the docReqInclCountries property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDocReqInclCountries().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getDocReqInclCountries() {
                if (docReqInclCountries == null) {
                    docReqInclCountries = new ArrayList<String>();
                }
                return this.docReqInclCountries;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
         *       &lt;attribute name="LoungeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AncillaryProduct {

            @XmlAttribute(name = "LoungeCode")
            protected String loungeCode;
            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "BookingChannel")
            protected String bookingChannel;
            @XmlAttribute(name = "SPNR_ProductID")
            protected String spnrProductID;
            @XmlAttribute(name = "productID")
            protected String productID;
            @XmlAttribute(name = "LandingPageProfileID")
            protected Integer landingPageProfileID;
            @XmlAttribute(name = "IsLoggedIn")
            protected Boolean isLoggedIn;
            @XmlAttribute(name = "SuperPNR_ID")
            protected String superPNRID;

            /**
             * 获取loungeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoungeCode() {
                return loungeCode;
            }

            /**
             * 设置loungeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoungeCode(String value) {
                this.loungeCode = value;
            }

            /**
             * 获取state属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
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
             * 获取spnrProductID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNRProductID() {
                return spnrProductID;
            }

            /**
             * 设置spnrProductID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNRProductID(String value) {
                this.spnrProductID = value;
            }

            /**
             * 获取productID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * 设置productID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * 获取landingPageProfileID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLandingPageProfileID() {
                return landingPageProfileID;
            }

            /**
             * 设置landingPageProfileID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLandingPageProfileID(Integer value) {
                this.landingPageProfileID = value;
            }

            /**
             * 获取isLoggedIn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLoggedIn() {
                return isLoggedIn;
            }

            /**
             * 设置isLoggedIn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsLoggedIn(Boolean value) {
                this.isLoggedIn = value;
            }

            /**
             * 获取superPNRID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuperPNRID() {
                return superPNRID;
            }

            /**
             * 设置superPNRID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuperPNRID(String value) {
                this.superPNRID = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Coupon {

            @XmlAttribute(name = "Type")
            protected String type;
            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "BookingChannel")
            protected String bookingChannel;
            @XmlAttribute(name = "SPNR_ProductID")
            protected String spnrProductID;
            @XmlAttribute(name = "productID")
            protected String productID;
            @XmlAttribute(name = "LandingPageProfileID")
            protected Integer landingPageProfileID;
            @XmlAttribute(name = "IsLoggedIn")
            protected Boolean isLoggedIn;
            @XmlAttribute(name = "SuperPNR_ID")
            protected String superPNRID;

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
             * 获取state属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
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
             * 获取spnrProductID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNRProductID() {
                return spnrProductID;
            }

            /**
             * 设置spnrProductID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNRProductID(String value) {
                this.spnrProductID = value;
            }

            /**
             * 获取productID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * 设置productID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * 获取landingPageProfileID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLandingPageProfileID() {
                return landingPageProfileID;
            }

            /**
             * 设置landingPageProfileID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLandingPageProfileID(Integer value) {
                this.landingPageProfileID = value;
            }

            /**
             * 获取isLoggedIn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLoggedIn() {
                return isLoggedIn;
            }

            /**
             * 设置isLoggedIn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsLoggedIn(Boolean value) {
                this.isLoggedIn = value;
            }

            /**
             * 获取superPNRID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuperPNRID() {
                return superPNRID;
            }

            /**
             * 设置superPNRID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuperPNRID(String value) {
                this.superPNRID = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Cruise {

            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "BookingChannel")
            protected String bookingChannel;
            @XmlAttribute(name = "SPNR_ProductID")
            protected String spnrProductID;
            @XmlAttribute(name = "productID")
            protected String productID;
            @XmlAttribute(name = "LandingPageProfileID")
            protected Integer landingPageProfileID;
            @XmlAttribute(name = "IsLoggedIn")
            protected Boolean isLoggedIn;
            @XmlAttribute(name = "SuperPNR_ID")
            protected String superPNRID;

            /**
             * 获取state属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
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
             * 获取spnrProductID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNRProductID() {
                return spnrProductID;
            }

            /**
             * 设置spnrProductID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNRProductID(String value) {
                this.spnrProductID = value;
            }

            /**
             * 获取productID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * 设置productID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * 获取landingPageProfileID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLandingPageProfileID() {
                return landingPageProfileID;
            }

            /**
             * 设置landingPageProfileID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLandingPageProfileID(Integer value) {
                this.landingPageProfileID = value;
            }

            /**
             * 获取isLoggedIn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLoggedIn() {
                return isLoggedIn;
            }

            /**
             * 设置isLoggedIn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsLoggedIn(Boolean value) {
                this.isLoggedIn = value;
            }

            /**
             * 获取superPNRID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuperPNRID() {
                return superPNRID;
            }

            /**
             * 设置superPNRID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuperPNRID(String value) {
                this.superPNRID = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Ferry {

            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "BookingChannel")
            protected String bookingChannel;
            @XmlAttribute(name = "SPNR_ProductID")
            protected String spnrProductID;
            @XmlAttribute(name = "productID")
            protected String productID;
            @XmlAttribute(name = "LandingPageProfileID")
            protected Integer landingPageProfileID;
            @XmlAttribute(name = "IsLoggedIn")
            protected Boolean isLoggedIn;
            @XmlAttribute(name = "SuperPNR_ID")
            protected String superPNRID;

            /**
             * 获取state属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
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
             * 获取spnrProductID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNRProductID() {
                return spnrProductID;
            }

            /**
             * 设置spnrProductID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNRProductID(String value) {
                this.spnrProductID = value;
            }

            /**
             * 获取productID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * 设置productID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * 获取landingPageProfileID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLandingPageProfileID() {
                return landingPageProfileID;
            }

            /**
             * 设置landingPageProfileID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLandingPageProfileID(Integer value) {
                this.landingPageProfileID = value;
            }

            /**
             * 获取isLoggedIn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLoggedIn() {
                return isLoggedIn;
            }

            /**
             * 设置isLoggedIn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsLoggedIn(Boolean value) {
                this.isLoggedIn = value;
            }

            /**
             * 获取superPNRID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuperPNRID() {
                return superPNRID;
            }

            /**
             * 设置superPNRID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuperPNRID(String value) {
                this.superPNRID = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Hotel {

            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "BookingChannel")
            protected String bookingChannel;
            @XmlAttribute(name = "SPNR_ProductID")
            protected String spnrProductID;
            @XmlAttribute(name = "productID")
            protected String productID;
            @XmlAttribute(name = "LandingPageProfileID")
            protected Integer landingPageProfileID;
            @XmlAttribute(name = "IsLoggedIn")
            protected Boolean isLoggedIn;
            @XmlAttribute(name = "SuperPNR_ID")
            protected String superPNRID;
            @XmlAttribute(name = "BookingOfficeCode")
            protected String bookingOfficeCode;
            @XmlAttribute(name = "ChainCode")
            protected String chainCode;
            @XmlAttribute(name = "BrandCode")
            protected String brandCode;
            @XmlAttribute(name = "HotelCode")
            protected String hotelCode;
            @XmlAttribute(name = "HotelCityCode")
            protected String hotelCityCode;
            @XmlAttribute(name = "HotelName")
            protected String hotelName;
            @XmlAttribute(name = "HotelCodeContext")
            protected String hotelCodeContext;
            @XmlAttribute(name = "ChainName")
            protected String chainName;
            @XmlAttribute(name = "BrandName")
            protected String brandName;
            @XmlAttribute(name = "AreaID")
            protected String areaID;

            /**
             * 获取state属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
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
             * 获取spnrProductID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNRProductID() {
                return spnrProductID;
            }

            /**
             * 设置spnrProductID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNRProductID(String value) {
                this.spnrProductID = value;
            }

            /**
             * 获取productID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * 设置productID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * 获取landingPageProfileID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLandingPageProfileID() {
                return landingPageProfileID;
            }

            /**
             * 设置landingPageProfileID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLandingPageProfileID(Integer value) {
                this.landingPageProfileID = value;
            }

            /**
             * 获取isLoggedIn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLoggedIn() {
                return isLoggedIn;
            }

            /**
             * 设置isLoggedIn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsLoggedIn(Boolean value) {
                this.isLoggedIn = value;
            }

            /**
             * 获取superPNRID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuperPNRID() {
                return superPNRID;
            }

            /**
             * 设置superPNRID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuperPNRID(String value) {
                this.superPNRID = value;
            }

            /**
             * 获取bookingOfficeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBookingOfficeCode() {
                return bookingOfficeCode;
            }

            /**
             * 设置bookingOfficeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBookingOfficeCode(String value) {
                this.bookingOfficeCode = value;
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
             * 获取brandCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrandCode() {
                return brandCode;
            }

            /**
             * 设置brandCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrandCode(String value) {
                this.brandCode = value;
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
             * 获取hotelName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelName() {
                return hotelName;
            }

            /**
             * 设置hotelName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelName(String value) {
                this.hotelName = value;
            }

            /**
             * 获取hotelCodeContext属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCodeContext() {
                return hotelCodeContext;
            }

            /**
             * 设置hotelCodeContext属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCodeContext(String value) {
                this.hotelCodeContext = value;
            }

            /**
             * 获取chainName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChainName() {
                return chainName;
            }

            /**
             * 设置chainName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChainName(String value) {
                this.chainName = value;
            }

            /**
             * 获取brandName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrandName() {
                return brandName;
            }

            /**
             * 设置brandName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrandName(String value) {
                this.brandName = value;
            }

            /**
             * 获取areaID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAreaID() {
                return areaID;
            }

            /**
             * 设置areaID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAreaID(String value) {
                this.areaID = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
         *       &lt;attribute name="Synchronise" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Insurance {

            @XmlAttribute(name = "Synchronise")
            protected Boolean synchronise;
            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "BookingChannel")
            protected String bookingChannel;
            @XmlAttribute(name = "SPNR_ProductID")
            protected String spnrProductID;
            @XmlAttribute(name = "productID")
            protected String productID;
            @XmlAttribute(name = "LandingPageProfileID")
            protected Integer landingPageProfileID;
            @XmlAttribute(name = "IsLoggedIn")
            protected Boolean isLoggedIn;
            @XmlAttribute(name = "SuperPNR_ID")
            protected String superPNRID;

            /**
             * 获取synchronise属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSynchronise() {
                return synchronise;
            }

            /**
             * 设置synchronise属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSynchronise(Boolean value) {
                this.synchronise = value;
            }

            /**
             * 获取state属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
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
             * 获取spnrProductID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNRProductID() {
                return spnrProductID;
            }

            /**
             * 设置spnrProductID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNRProductID(String value) {
                this.spnrProductID = value;
            }

            /**
             * 获取productID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * 设置productID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * 获取landingPageProfileID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLandingPageProfileID() {
                return landingPageProfileID;
            }

            /**
             * 设置landingPageProfileID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLandingPageProfileID(Integer value) {
                this.landingPageProfileID = value;
            }

            /**
             * 获取isLoggedIn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLoggedIn() {
                return isLoggedIn;
            }

            /**
             * 设置isLoggedIn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsLoggedIn(Boolean value) {
                this.isLoggedIn = value;
            }

            /**
             * 获取superPNRID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuperPNRID() {
                return superPNRID;
            }

            /**
             * 设置superPNRID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuperPNRID(String value) {
                this.superPNRID = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
         *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Membership {

            @XmlAttribute(name = "Status")
            protected String status;
            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "BookingChannel")
            protected String bookingChannel;
            @XmlAttribute(name = "SPNR_ProductID")
            protected String spnrProductID;
            @XmlAttribute(name = "productID")
            protected String productID;
            @XmlAttribute(name = "LandingPageProfileID")
            protected Integer landingPageProfileID;
            @XmlAttribute(name = "IsLoggedIn")
            protected Boolean isLoggedIn;
            @XmlAttribute(name = "SuperPNR_ID")
            protected String superPNRID;

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
             * 获取state属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
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
             * 获取spnrProductID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNRProductID() {
                return spnrProductID;
            }

            /**
             * 设置spnrProductID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNRProductID(String value) {
                this.spnrProductID = value;
            }

            /**
             * 获取productID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * 设置productID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * 获取landingPageProfileID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLandingPageProfileID() {
                return landingPageProfileID;
            }

            /**
             * 设置landingPageProfileID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLandingPageProfileID(Integer value) {
                this.landingPageProfileID = value;
            }

            /**
             * 获取isLoggedIn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLoggedIn() {
                return isLoggedIn;
            }

            /**
             * 设置isLoggedIn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsLoggedIn(Boolean value) {
                this.isLoggedIn = value;
            }

            /**
             * 获取superPNRID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuperPNRID() {
                return superPNRID;
            }

            /**
             * 设置superPNRID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuperPNRID(String value) {
                this.superPNRID = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_PayloadExtAttributes"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Vehicle {

            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "BookingChannel")
            protected String bookingChannel;
            @XmlAttribute(name = "SPNR_ProductID")
            protected String spnrProductID;
            @XmlAttribute(name = "productID")
            protected String productID;
            @XmlAttribute(name = "LandingPageProfileID")
            protected Integer landingPageProfileID;
            @XmlAttribute(name = "IsLoggedIn")
            protected Boolean isLoggedIn;
            @XmlAttribute(name = "SuperPNR_ID")
            protected String superPNRID;
            @XmlAttribute(name = "LocationCode", required = true)
            protected String locationCode;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "HaulZone")
            protected String haulZone;

            /**
             * 获取state属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
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
             * 获取spnrProductID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNRProductID() {
                return spnrProductID;
            }

            /**
             * 设置spnrProductID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNRProductID(String value) {
                this.spnrProductID = value;
            }

            /**
             * 获取productID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * 设置productID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * 获取landingPageProfileID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLandingPageProfileID() {
                return landingPageProfileID;
            }

            /**
             * 设置landingPageProfileID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLandingPageProfileID(Integer value) {
                this.landingPageProfileID = value;
            }

            /**
             * 获取isLoggedIn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLoggedIn() {
                return isLoggedIn;
            }

            /**
             * 设置isLoggedIn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsLoggedIn(Boolean value) {
                this.isLoggedIn = value;
            }

            /**
             * 获取superPNRID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuperPNRID() {
                return superPNRID;
            }

            /**
             * 设置superPNRID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuperPNRID(String value) {
                this.superPNRID = value;
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
             * 获取haulZone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHaulZone() {
                if (haulZone == null) {
                    return "GB";
                } else {
                    return haulZone;
                }
            }

            /**
             * 设置haulZone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHaulZone(String value) {
                this.haulZone = value;
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
     *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}VerificationTicketingType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Air" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="OriginDestinationOption" type="{http://www.opentravel.org/OTA/2003/05}VerificationODOType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ReservationTimeSpan" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "product"
    })
    public static class Products {

        @XmlElement(name = "Product")
        protected List<VerificationPNR.Products.Product> product;

        /**
         * Gets the value of the product property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the product property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VerificationPNR.Products.Product }
         * 
         * 
         */
        public List<VerificationPNR.Products.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<VerificationPNR.Products.Product>();
            }
            return this.product;
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
         *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}VerificationTicketingType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Air" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="OriginDestinationOption" type="{http://www.opentravel.org/OTA/2003/05}VerificationODOType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ReservationTimeSpan" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ticketing",
            "air",
            "reservationTimeSpan"
        })
        public static class Product {

            @XmlElement(name = "Ticketing")
            protected List<VerificationTicketingType> ticketing;
            @XmlElement(name = "Air")
            protected VerificationPNR.Products.Product.Air air;
            @XmlElement(name = "ReservationTimeSpan")
            protected VerificationPNR.Products.Product.ReservationTimeSpan reservationTimeSpan;
            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "Type")
            protected String type;

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
             * {@link VerificationTicketingType }
             * 
             * 
             */
            public List<VerificationTicketingType> getTicketing() {
                if (ticketing == null) {
                    ticketing = new ArrayList<VerificationTicketingType>();
                }
                return this.ticketing;
            }

            /**
             * 获取air属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VerificationPNR.Products.Product.Air }
             *     
             */
            public VerificationPNR.Products.Product.Air getAir() {
                return air;
            }

            /**
             * 设置air属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VerificationPNR.Products.Product.Air }
             *     
             */
            public void setAir(VerificationPNR.Products.Product.Air value) {
                this.air = value;
            }

            /**
             * 获取reservationTimeSpan属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VerificationPNR.Products.Product.ReservationTimeSpan }
             *     
             */
            public VerificationPNR.Products.Product.ReservationTimeSpan getReservationTimeSpan() {
                return reservationTimeSpan;
            }

            /**
             * 设置reservationTimeSpan属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VerificationPNR.Products.Product.ReservationTimeSpan }
             *     
             */
            public void setReservationTimeSpan(VerificationPNR.Products.Product.ReservationTimeSpan value) {
                this.reservationTimeSpan = value;
            }

            /**
             * 获取state属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="OriginDestinationOption" type="{http://www.opentravel.org/OTA/2003/05}VerificationODOType" maxOccurs="unbounded" minOccurs="0"/>
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
                "originDestinationOption"
            })
            public static class Air {

                @XmlElement(name = "OriginDestinationOption")
                protected List<VerificationODOType> originDestinationOption;

                /**
                 * Gets the value of the originDestinationOption property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the originDestinationOption property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOriginDestinationOption().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VerificationODOType }
                 * 
                 * 
                 */
                public List<VerificationODOType> getOriginDestinationOption() {
                    if (originDestinationOption == null) {
                        originDestinationOption = new ArrayList<VerificationODOType>();
                    }
                    return this.originDestinationOption;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ReservationTimeSpan {

                @XmlAttribute(name = "Start")
                protected String start;
                @XmlAttribute(name = "Duration")
                protected BigInteger duration;
                @XmlAttribute(name = "End")
                protected String end;
                @XmlAttribute(name = "RangeNum")
                protected BigInteger rangeNum;
                @XmlAttribute(name = "SearchTimeZone")
                protected String searchTimeZone;

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
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDuration() {
                    return duration;
                }

                /**
                 * 设置duration属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDuration(BigInteger value) {
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
                 * 获取rangeNum属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getRangeNum() {
                    return rangeNum;
                }

                /**
                 * 设置rangeNum属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setRangeNum(BigInteger value) {
                    this.rangeNum = value;
                }

                /**
                 * 获取searchTimeZone属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSearchTimeZone() {
                    return searchTimeZone;
                }

                /**
                 * 设置searchTimeZone属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSearchTimeZone(String value) {
                    this.searchTimeZone = value;
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
    public static class PromotionCode {

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
     *       &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ReturnHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SearchContent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="QueueID1" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="QueueName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Queue {

        @XmlAttribute(name = "QueueID")
        protected String queueID;
        @XmlAttribute(name = "ReturnHistory")
        protected Boolean returnHistory;
        @XmlAttribute(name = "SearchContent")
        protected String searchContent;
        @XmlAttribute(name = "QueueID1")
        protected String queueID1;
        @XmlAttribute(name = "QueueName")
        protected String queueName;

        /**
         * 获取queueID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueID() {
            return queueID;
        }

        /**
         * 设置queueID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueID(String value) {
            this.queueID = value;
        }

        /**
         * 获取returnHistory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnHistory() {
            return returnHistory;
        }

        /**
         * 设置returnHistory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnHistory(Boolean value) {
            this.returnHistory = value;
        }

        /**
         * 获取searchContent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchContent() {
            return searchContent;
        }

        /**
         * 设置searchContent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchContent(String value) {
            this.searchContent = value;
        }

        /**
         * 获取queueID1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueID1() {
            return queueID1;
        }

        /**
         * 设置queueID1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueID1(String value) {
            this.queueID1 = value;
        }

        /**
         * 获取queueName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueName() {
            return queueName;
        }

        /**
         * 设置queueName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueName(String value) {
            this.queueName = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RefundApplicationTimeSpan {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected BigInteger duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "RangeNum")
        protected BigInteger rangeNum;
        @XmlAttribute(name = "SearchTimeZone")
        protected String searchTimeZone;

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
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
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
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRangeNum(BigInteger value) {
            this.rangeNum = value;
        }

        /**
         * 获取searchTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchTimeZone() {
            return searchTimeZone;
        }

        /**
         * 设置searchTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchTimeZone(String value) {
            this.searchTimeZone = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RefundRepayTimeSpan {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected BigInteger duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "RangeNum")
        protected BigInteger rangeNum;
        @XmlAttribute(name = "SearchTimeZone")
        protected String searchTimeZone;

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
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
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
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRangeNum(BigInteger value) {
            this.rangeNum = value;
        }

        /**
         * 获取searchTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchTimeZone() {
            return searchTimeZone;
        }

        /**
         * 设置searchTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchTimeZone(String value) {
            this.searchTimeZone = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RefundReviewTimeSpan {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected BigInteger duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "RangeNum")
        protected BigInteger rangeNum;
        @XmlAttribute(name = "SearchTimeZone")
        protected String searchTimeZone;

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
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
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
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRangeNum(BigInteger value) {
            this.rangeNum = value;
        }

        /**
         * 获取searchTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchTimeZone() {
            return searchTimeZone;
        }

        /**
         * 设置searchTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchTimeZone(String value) {
            this.searchTimeZone = value;
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
     *         &lt;element name="Refund" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Approver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TimeSpan" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ActionType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EntryPoint" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Reason" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "refund",
        "reason"
    })
    public static class Refunds {

        @XmlElement(name = "Refund", required = true)
        protected List<VerificationPNR.Refunds.Refund> refund;
        @XmlElement(name = "Reason")
        protected List<VerificationPNR.Refunds.Reason> reason;

        /**
         * Gets the value of the refund property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refund property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefund().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VerificationPNR.Refunds.Refund }
         * 
         * 
         */
        public List<VerificationPNR.Refunds.Refund> getRefund() {
            if (refund == null) {
                refund = new ArrayList<VerificationPNR.Refunds.Refund>();
            }
            return this.refund;
        }

        /**
         * Gets the value of the reason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VerificationPNR.Refunds.Reason }
         * 
         * 
         */
        public List<VerificationPNR.Refunds.Reason> getReason() {
            if (reason == null) {
                reason = new ArrayList<VerificationPNR.Refunds.Reason>();
            }
            return this.reason;
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
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Reason {

            @XmlAttribute(name = "Type")
            protected String type;

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
         *         &lt;element name="Approver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TimeSpan" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ActionType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EntryPoint" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "approver",
            "timeSpan"
        })
        public static class Refund {

            @XmlElement(name = "Approver")
            protected String approver;
            @XmlElement(name = "TimeSpan")
            protected VerificationPNR.Refunds.Refund.TimeSpan timeSpan;
            @XmlAttribute(name = "ActionType")
            protected String actionType;
            @XmlAttribute(name = "Status")
            protected String status;
            @XmlAttribute(name = "ApplicationID")
            protected String applicationID;
            @XmlAttribute(name = "EntryPoint")
            protected String entryPoint;

            /**
             * 获取approver属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprover() {
                return approver;
            }

            /**
             * 设置approver属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprover(String value) {
                this.approver = value;
            }

            /**
             * 获取timeSpan属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VerificationPNR.Refunds.Refund.TimeSpan }
             *     
             */
            public VerificationPNR.Refunds.Refund.TimeSpan getTimeSpan() {
                return timeSpan;
            }

            /**
             * 设置timeSpan属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VerificationPNR.Refunds.Refund.TimeSpan }
             *     
             */
            public void setTimeSpan(VerificationPNR.Refunds.Refund.TimeSpan value) {
                this.timeSpan = value;
            }

            /**
             * 获取actionType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActionType() {
                return actionType;
            }

            /**
             * 设置actionType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActionType(String value) {
                this.actionType = value;
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
             * 获取applicationID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicationID() {
                return applicationID;
            }

            /**
             * 设置applicationID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicationID(String value) {
                this.applicationID = value;
            }

            /**
             * 获取entryPoint属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntryPoint() {
                return entryPoint;
            }

            /**
             * 设置entryPoint属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntryPoint(String value) {
                this.entryPoint = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TimeSpan {

                @XmlAttribute(name = "Start")
                protected String start;
                @XmlAttribute(name = "Duration")
                protected BigInteger duration;
                @XmlAttribute(name = "End")
                protected String end;
                @XmlAttribute(name = "RangeNum")
                protected BigInteger rangeNum;
                @XmlAttribute(name = "SearchTimeZone")
                protected String searchTimeZone;

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
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDuration() {
                    return duration;
                }

                /**
                 * 设置duration属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDuration(BigInteger value) {
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
                 * 获取rangeNum属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getRangeNum() {
                    return rangeNum;
                }

                /**
                 * 设置rangeNum属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setRangeNum(BigInteger value) {
                    this.rangeNum = value;
                }

                /**
                 * 获取searchTimeZone属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSearchTimeZone() {
                    return searchTimeZone;
                }

                /**
                 * 设置searchTimeZone属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSearchTimeZone(String value) {
                    this.searchTimeZone = value;
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
     *         &lt;element name="Remark">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="State">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="present"/>
     *                       &lt;enumeration value="absent"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
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
        "remark"
    })
    public static class Remarks {

        @XmlElement(name = "Remark", required = true)
        protected VerificationPNR.Remarks.Remark remark;

        /**
         * 获取remark属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Remarks.Remark }
         *     
         */
        public VerificationPNR.Remarks.Remark getRemark() {
            return remark;
        }

        /**
         * 设置remark属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Remarks.Remark }
         *     
         */
        public void setRemark(VerificationPNR.Remarks.Remark value) {
            this.remark = value;
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
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="State">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="present"/>
         *             &lt;enumeration value="absent"/>
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
        public static class Remark {

            @XmlAttribute(name = "Code")
            @XmlSchemaType(name = "anySimpleType")
            protected String code;
            @XmlAttribute(name = "State")
            protected String state;

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
             * 获取state属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
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
     *         &lt;element name="TimeSpan" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
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
        "timeSpan"
    })
    public static class Reshop {

        @XmlElement(name = "TimeSpan")
        protected VerificationPNR.Reshop.TimeSpan timeSpan;

        /**
         * 获取timeSpan属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Reshop.TimeSpan }
         *     
         */
        public VerificationPNR.Reshop.TimeSpan getTimeSpan() {
            return timeSpan;
        }

        /**
         * 设置timeSpan属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Reshop.TimeSpan }
         *     
         */
        public void setTimeSpan(VerificationPNR.Reshop.TimeSpan value) {
            this.timeSpan = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TimeSpan {

            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected BigInteger duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "RangeNum")
            protected BigInteger rangeNum;
            @XmlAttribute(name = "SearchTimeZone")
            protected String searchTimeZone;

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
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDuration() {
                return duration;
            }

            /**
             * 设置duration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDuration(BigInteger value) {
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
             * 获取rangeNum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRangeNum() {
                return rangeNum;
            }

            /**
             * 设置rangeNum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRangeNum(BigInteger value) {
                this.rangeNum = value;
            }

            /**
             * 获取searchTimeZone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSearchTimeZone() {
                return searchTimeZone;
            }

            /**
             * 设置searchTimeZone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSearchTimeZone(String value) {
                this.searchTimeZone = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SaleTimeSpan {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected BigInteger duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "RangeNum")
        protected BigInteger rangeNum;
        @XmlAttribute(name = "SearchTimeZone")
        protected String searchTimeZone;

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
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
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
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRangeNum(BigInteger value) {
            this.rangeNum = value;
        }

        /**
         * 获取searchTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchTimeZone() {
            return searchTimeZone;
        }

        /**
         * 设置searchTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchTimeZone(String value) {
            this.searchTimeZone = value;
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
     *       &lt;attribute name="EmdTktNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Seat {

        @XmlAttribute(name = "EmdTktNumber")
        protected String emdTktNumber;

        /**
         * 获取emdTktNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmdTktNumber() {
            return emdTktNumber;
        }

        /**
         * 设置emdTktNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmdTktNumber(String value) {
            this.emdTktNumber = value;
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
     *         &lt;element name="Locales" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Locale">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RequestorID" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
        "locales",
        "requestorID"
    })
    public static class Source {

        @XmlElement(name = "Locales")
        protected VerificationPNR.Source.Locales locales;
        @XmlElement(name = "RequestorID")
        protected List<Object> requestorID;

        /**
         * 获取locales属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Source.Locales }
         *     
         */
        public VerificationPNR.Source.Locales getLocales() {
            return locales;
        }

        /**
         * 设置locales属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Source.Locales }
         *     
         */
        public void setLocales(VerificationPNR.Source.Locales value) {
            this.locales = value;
        }

        /**
         * Gets the value of the requestorID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requestorID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequestorID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRequestorID() {
            if (requestorID == null) {
                requestorID = new ArrayList<Object>();
            }
            return this.requestorID;
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
         *         &lt;element name="Locale">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
            "locale"
        })
        public static class Locales {

            @XmlElement(name = "Locale", required = true)
            protected VerificationPNR.Source.Locales.Locale locale;

            /**
             * 获取locale属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VerificationPNR.Source.Locales.Locale }
             *     
             */
            public VerificationPNR.Source.Locales.Locale getLocale() {
                return locale;
            }

            /**
             * 设置locale属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VerificationPNR.Source.Locales.Locale }
             *     
             */
            public void setLocale(VerificationPNR.Source.Locales.Locale value) {
                this.locale = value;
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
             *       &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
            public static class Locale {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Included")
                protected Boolean included;

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
                 * 获取included属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isIncluded() {
                    return included;
                }

                /**
                 * 设置included属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setIncluded(Boolean value) {
                    this.included = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StartDateTimeSpan {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected BigInteger duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "RangeNum")
        protected BigInteger rangeNum;
        @XmlAttribute(name = "SearchTimeZone")
        protected String searchTimeZone;

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
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
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
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRangeNum(BigInteger value) {
            this.rangeNum = value;
        }

        /**
         * 获取searchTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchTimeZone() {
            return searchTimeZone;
        }

        /**
         * 设置searchTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchTimeZone(String value) {
            this.searchTimeZone = value;
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
     *         &lt;element name="TimeSpan" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "timeSpan"
    })
    public static class Ticketing {

        @XmlElement(name = "TimeSpan")
        protected VerificationPNR.Ticketing.TimeSpan timeSpan;
        @XmlAttribute(name = "State")
        protected String state;

        /**
         * 获取timeSpan属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationPNR.Ticketing.TimeSpan }
         *     
         */
        public VerificationPNR.Ticketing.TimeSpan getTimeSpan() {
            return timeSpan;
        }

        /**
         * 设置timeSpan属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationPNR.Ticketing.TimeSpan }
         *     
         */
        public void setTimeSpan(VerificationPNR.Ticketing.TimeSpan value) {
            this.timeSpan = value;
        }

        /**
         * 获取state属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * 设置state属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TimeSpan {

            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected BigInteger duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "RangeNum")
            protected BigInteger rangeNum;
            @XmlAttribute(name = "SearchTimeZone")
            protected String searchTimeZone;

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
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDuration() {
                return duration;
            }

            /**
             * 设置duration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDuration(BigInteger value) {
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
             * 获取rangeNum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRangeNum() {
                return rangeNum;
            }

            /**
             * 设置rangeNum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRangeNum(BigInteger value) {
                this.rangeNum = value;
            }

            /**
             * 获取searchTimeZone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSearchTimeZone() {
                return searchTimeZone;
            }

            /**
             * 设置searchTimeZone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSearchTimeZone(String value) {
                this.searchTimeZone = value;
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
     *       &lt;attribute name="State">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="PreTravel"/>
     *             &lt;enumeration value="PostTravel"/>
     *             &lt;enumeration value="InTravel"/>
     *             &lt;enumeration value="Cancelled"/>
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
    public static class TravelStatus {

        @XmlAttribute(name = "State")
        protected String state;

        /**
         * 获取state属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * 设置state属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

    }

}
