//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Describes the policies of the hotel, such as the type of payments, or whether children or pets are accepted.
 * 
 * <p>PoliciesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PoliciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Policy" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="CancelPolicy" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="GuaranteePaymentPolicy" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PolicyInfoCodes" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PolicyInfoCode" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
 *                                     &lt;attribute name="Name">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                           &lt;enumeration value="AdditionalOversoldPolicy"/>
 *                                           &lt;enumeration value="EarlyCheckinAvailable"/>
 *                                           &lt;enumeration value="LateCheckoutAvailable"/>
 *                                           &lt;enumeration value="OversoldArrangeAccommodations"/>
 *                                           &lt;enumeration value="OversoldArrangeTransportation"/>
 *                                           &lt;enumeration value="OversoldNotifyContacts"/>
 *                                           &lt;enumeration value="OversoldPayOneNightRoom"/>
 *                                           &lt;enumeration value="OversoldProvidePhonecall"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CheckoutCharges" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CheckoutCharge" maxOccurs="2">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                     &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *                                     &lt;attribute name="Type">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                           &lt;enumeration value="Early"/>
 *                                           &lt;enumeration value="Late"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                     &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PaymentPolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RequiredPayment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AcceptedPayments" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="AcceptedPayment" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="BankAcct" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                                                           &lt;element name="Currency" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="PaymentType" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="BankAddress" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                     &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                                                                     &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                                                                     &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                                                                     &lt;element name="CountryName" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="PaymentCard" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="CardCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="AgressoExtraFields" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="PaymentTerm">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                             &lt;attribute name="NumDays" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="HandOffCurrency" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="HandOffRouting" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="RemittanceVia" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="PaymentMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="PaymentType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
 *                   &lt;element name="PolicyInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                             &lt;element name="ChildCategories" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ChildCategory" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="NotAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Under" type="{http://www.w3.org/2001/XMLSchema}int" />
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
 *                           &lt;attribute name="CheckInTime" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
 *                           &lt;attribute name="CheckOutTime" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
 *                           &lt;attribute name="CheckOut" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
 *                           &lt;attribute name="MinGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="MinRecommendedGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="UsualStayFreeCutoffAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="UsualStayFreeChildPerAdult" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="DefaultTaxServiceInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="KidsStayFree" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="MaxChildAge" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                           &lt;attribute name="InternetGuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ReleaseCutOff" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TaxPolicies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TaxPolicy" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType">
 *                                     &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PetsPolicies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
 *                                     &lt;attribute name="PetsPolicyCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                     &lt;attribute name="MaxPetQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *                                     &lt;attribute name="RefundableDeposit" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                     &lt;attribute name="NonRefundableFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                     &lt;attribute name="ChargeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                     &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="PetsAllowedCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Pets Allowed"/>
 *                                 &lt;enumeration value="Pets Not Allowed"/>
 *                                 &lt;enumeration value="Assistive Animals Only"/>
 *                                 &lt;enumeration value="Pets By Arrangements"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="StayRequirements" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="StayRequirement" maxOccurs="9">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
 *                                     &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="StayContext">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                           &lt;enumeration value="Checkin"/>
 *                                           &lt;enumeration value="Checkout"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CommissionPolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
 *                           &lt;sequence>
 *                             &lt;element name="PaymentCompany" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CommissionApplicability">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="AllRates"/>
 *                                 &lt;enumeration value="NoRates"/>
 *                                 &lt;enumeration value="SomeRates"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FeePolicies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FeePolicy" type="{http://www.opentravel.org/OTA/2003/05}FeeType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BookPolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BookRestriction" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Distance" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                               &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ExtraChargePolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ExtraChargePenalty" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="TimeSlotCharge" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="AmountPercent" type="{http://www.opentravel.org/OTA/2003/05}AmountPercentType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                               &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                               &lt;attribute name="StepSize" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                                               &lt;attribute name="ChargeType">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;enumeration value="Fixed"/>
 *                                                     &lt;enumeration value="Tiered"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="PolicyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
 *                 &lt;attribute name="DefaultValidBookingMinOffset" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
@XmlType(name = "PoliciesType", propOrder = {
    "policy"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.HotelDescriptiveContentType.Policies.class
})
public class PoliciesType {

    @XmlElement(name = "Policy", required = true)
    protected List<PoliciesType.Policy> policy;

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoliciesType.Policy }
     * 
     * 
     */
    public List<PoliciesType.Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<PoliciesType.Policy>();
        }
        return this.policy;
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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="CancelPolicy" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="GuaranteePaymentPolicy" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PolicyInfoCodes" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PolicyInfoCode" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
     *                           &lt;attribute name="Name">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                                 &lt;enumeration value="AdditionalOversoldPolicy"/>
     *                                 &lt;enumeration value="EarlyCheckinAvailable"/>
     *                                 &lt;enumeration value="LateCheckoutAvailable"/>
     *                                 &lt;enumeration value="OversoldArrangeAccommodations"/>
     *                                 &lt;enumeration value="OversoldArrangeTransportation"/>
     *                                 &lt;enumeration value="OversoldNotifyContacts"/>
     *                                 &lt;enumeration value="OversoldPayOneNightRoom"/>
     *                                 &lt;enumeration value="OversoldProvidePhonecall"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CheckoutCharges" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CheckoutCharge" maxOccurs="2">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                           &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *                           &lt;attribute name="Type">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                                 &lt;enumeration value="Early"/>
     *                                 &lt;enumeration value="Late"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                           &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PaymentPolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RequiredPayment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AcceptedPayments" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="AcceptedPayment" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="BankAcct" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                                                 &lt;element name="Currency" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="PaymentType" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="BankAddress" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                                                           &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                                                           &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                                                           &lt;element name="CountryName" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="PaymentCard" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="CardCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="AgressoExtraFields" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="PaymentTerm">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                                   &lt;attribute name="NumDays" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="HandOffCurrency" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="HandOffRouting" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="RemittanceVia" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="PaymentMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="PaymentType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
     *         &lt;element name="PolicyInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *                   &lt;element name="ChildCategories" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ChildCategory" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="NotAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Under" type="{http://www.w3.org/2001/XMLSchema}int" />
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
     *                 &lt;attribute name="CheckInTime" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
     *                 &lt;attribute name="CheckOutTime" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
     *                 &lt;attribute name="CheckOut" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
     *                 &lt;attribute name="MinGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="MinRecommendedGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="UsualStayFreeCutoffAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="UsualStayFreeChildPerAdult" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="DefaultTaxServiceInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="KidsStayFree" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="MaxChildAge" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *                 &lt;attribute name="InternetGuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ReleaseCutOff" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TaxPolicies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TaxPolicy" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType">
     *                           &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PetsPolicies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
     *                           &lt;attribute name="PetsPolicyCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                           &lt;attribute name="MaxPetQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
     *                           &lt;attribute name="RefundableDeposit" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                           &lt;attribute name="NonRefundableFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                           &lt;attribute name="ChargeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                           &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="PetsAllowedCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Pets Allowed"/>
     *                       &lt;enumeration value="Pets Not Allowed"/>
     *                       &lt;enumeration value="Assistive Animals Only"/>
     *                       &lt;enumeration value="Pets By Arrangements"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="StayRequirements" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="StayRequirement" maxOccurs="9">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
     *                           &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="StayContext">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                                 &lt;enumeration value="Checkin"/>
     *                                 &lt;enumeration value="Checkout"/>
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
     *         &lt;element name="CommissionPolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
     *                 &lt;sequence>
     *                   &lt;element name="PaymentCompany" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CommissionApplicability">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="AllRates"/>
     *                       &lt;enumeration value="NoRates"/>
     *                       &lt;enumeration value="SomeRates"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FeePolicies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FeePolicy" type="{http://www.opentravel.org/OTA/2003/05}FeeType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BookPolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BookRestriction" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Distance" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                     &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ExtraChargePolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ExtraChargePenalty" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="TimeSlotCharge" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="AmountPercent" type="{http://www.opentravel.org/OTA/2003/05}AmountPercentType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                     &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                     &lt;attribute name="StepSize" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *                                     &lt;attribute name="ChargeType">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;enumeration value="Fixed"/>
     *                                           &lt;enumeration value="Tiered"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="PolicyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
     *       &lt;attribute name="DefaultValidBookingMinOffset" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cancelPolicy",
        "guaranteePaymentPolicy",
        "policyInfoCodes",
        "checkoutCharges",
        "paymentPolicy",
        "policyInfo",
        "taxPolicies",
        "petsPolicies",
        "stayRequirements",
        "commissionPolicy",
        "feePolicies",
        "bookPolicy",
        "extraChargePolicy"
    })
    public static class Policy {

        @XmlElement(name = "CancelPolicy")
        protected List<CancelPenaltiesType> cancelPolicy;
        @XmlElement(name = "GuaranteePaymentPolicy")
        protected List<PoliciesType.Policy.GuaranteePaymentPolicy> guaranteePaymentPolicy;
        @XmlElement(name = "PolicyInfoCodes")
        protected List<PoliciesType.Policy.PolicyInfoCodes> policyInfoCodes;
        @XmlElement(name = "CheckoutCharges")
        protected PoliciesType.Policy.CheckoutCharges checkoutCharges;
        @XmlElement(name = "PaymentPolicy")
        protected PoliciesType.Policy.PaymentPolicy paymentPolicy;
        @XmlElement(name = "PolicyInfo")
        protected List<PoliciesType.Policy.PolicyInfo> policyInfo;
        @XmlElement(name = "TaxPolicies")
        protected PoliciesType.Policy.TaxPolicies taxPolicies;
        @XmlElement(name = "PetsPolicies")
        protected PoliciesType.Policy.PetsPolicies petsPolicies;
        @XmlElement(name = "StayRequirements")
        protected PoliciesType.Policy.StayRequirements stayRequirements;
        @XmlElement(name = "CommissionPolicy")
        protected PoliciesType.Policy.CommissionPolicy commissionPolicy;
        @XmlElement(name = "FeePolicies")
        protected PoliciesType.Policy.FeePolicies feePolicies;
        @XmlElement(name = "BookPolicy")
        protected PoliciesType.Policy.BookPolicy bookPolicy;
        @XmlElement(name = "ExtraChargePolicy")
        protected PoliciesType.Policy.ExtraChargePolicy extraChargePolicy;
        @XmlAttribute(name = "DefaultValidBookingMinOffset")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger defaultValidBookingMinOffset;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
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
        @XmlAttribute(name = "Mon")
        protected Boolean mon;
        @XmlAttribute(name = "Tue")
        protected Boolean tue;
        @XmlAttribute(name = "Weds")
        protected Boolean weds;
        @XmlAttribute(name = "Thur")
        protected Boolean thur;
        @XmlAttribute(name = "Fri")
        protected Boolean fri;
        @XmlAttribute(name = "Sat")
        protected Boolean sat;
        @XmlAttribute(name = "Sun")
        protected Boolean sun;

        /**
         * Gets the value of the cancelPolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cancelPolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCancelPolicy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CancelPenaltiesType }
         * 
         * 
         */
        public List<CancelPenaltiesType> getCancelPolicy() {
            if (cancelPolicy == null) {
                cancelPolicy = new ArrayList<CancelPenaltiesType>();
            }
            return this.cancelPolicy;
        }

        /**
         * Gets the value of the guaranteePaymentPolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guaranteePaymentPolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuaranteePaymentPolicy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PoliciesType.Policy.GuaranteePaymentPolicy }
         * 
         * 
         */
        public List<PoliciesType.Policy.GuaranteePaymentPolicy> getGuaranteePaymentPolicy() {
            if (guaranteePaymentPolicy == null) {
                guaranteePaymentPolicy = new ArrayList<PoliciesType.Policy.GuaranteePaymentPolicy>();
            }
            return this.guaranteePaymentPolicy;
        }

        /**
         * Gets the value of the policyInfoCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the policyInfoCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPolicyInfoCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PoliciesType.Policy.PolicyInfoCodes }
         * 
         * 
         */
        public List<PoliciesType.Policy.PolicyInfoCodes> getPolicyInfoCodes() {
            if (policyInfoCodes == null) {
                policyInfoCodes = new ArrayList<PoliciesType.Policy.PolicyInfoCodes>();
            }
            return this.policyInfoCodes;
        }

        /**
         * 获取checkoutCharges属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.CheckoutCharges }
         *     
         */
        public PoliciesType.Policy.CheckoutCharges getCheckoutCharges() {
            return checkoutCharges;
        }

        /**
         * 设置checkoutCharges属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.CheckoutCharges }
         *     
         */
        public void setCheckoutCharges(PoliciesType.Policy.CheckoutCharges value) {
            this.checkoutCharges = value;
        }

        /**
         * 获取paymentPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.PaymentPolicy }
         *     
         */
        public PoliciesType.Policy.PaymentPolicy getPaymentPolicy() {
            return paymentPolicy;
        }

        /**
         * 设置paymentPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.PaymentPolicy }
         *     
         */
        public void setPaymentPolicy(PoliciesType.Policy.PaymentPolicy value) {
            this.paymentPolicy = value;
        }

        /**
         * Gets the value of the policyInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the policyInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPolicyInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PoliciesType.Policy.PolicyInfo }
         * 
         * 
         */
        public List<PoliciesType.Policy.PolicyInfo> getPolicyInfo() {
            if (policyInfo == null) {
                policyInfo = new ArrayList<PoliciesType.Policy.PolicyInfo>();
            }
            return this.policyInfo;
        }

        /**
         * 获取taxPolicies属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.TaxPolicies }
         *     
         */
        public PoliciesType.Policy.TaxPolicies getTaxPolicies() {
            return taxPolicies;
        }

        /**
         * 设置taxPolicies属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.TaxPolicies }
         *     
         */
        public void setTaxPolicies(PoliciesType.Policy.TaxPolicies value) {
            this.taxPolicies = value;
        }

        /**
         * 获取petsPolicies属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.PetsPolicies }
         *     
         */
        public PoliciesType.Policy.PetsPolicies getPetsPolicies() {
            return petsPolicies;
        }

        /**
         * 设置petsPolicies属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.PetsPolicies }
         *     
         */
        public void setPetsPolicies(PoliciesType.Policy.PetsPolicies value) {
            this.petsPolicies = value;
        }

        /**
         * 获取stayRequirements属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.StayRequirements }
         *     
         */
        public PoliciesType.Policy.StayRequirements getStayRequirements() {
            return stayRequirements;
        }

        /**
         * 设置stayRequirements属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.StayRequirements }
         *     
         */
        public void setStayRequirements(PoliciesType.Policy.StayRequirements value) {
            this.stayRequirements = value;
        }

        /**
         * 获取commissionPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.CommissionPolicy }
         *     
         */
        public PoliciesType.Policy.CommissionPolicy getCommissionPolicy() {
            return commissionPolicy;
        }

        /**
         * 设置commissionPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.CommissionPolicy }
         *     
         */
        public void setCommissionPolicy(PoliciesType.Policy.CommissionPolicy value) {
            this.commissionPolicy = value;
        }

        /**
         * 获取feePolicies属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.FeePolicies }
         *     
         */
        public PoliciesType.Policy.FeePolicies getFeePolicies() {
            return feePolicies;
        }

        /**
         * 设置feePolicies属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.FeePolicies }
         *     
         */
        public void setFeePolicies(PoliciesType.Policy.FeePolicies value) {
            this.feePolicies = value;
        }

        /**
         * 获取bookPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.BookPolicy }
         *     
         */
        public PoliciesType.Policy.BookPolicy getBookPolicy() {
            return bookPolicy;
        }

        /**
         * 设置bookPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.BookPolicy }
         *     
         */
        public void setBookPolicy(PoliciesType.Policy.BookPolicy value) {
            this.bookPolicy = value;
        }

        /**
         * 获取extraChargePolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.ExtraChargePolicy }
         *     
         */
        public PoliciesType.Policy.ExtraChargePolicy getExtraChargePolicy() {
            return extraChargePolicy;
        }

        /**
         * 设置extraChargePolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.ExtraChargePolicy }
         *     
         */
        public void setExtraChargePolicy(PoliciesType.Policy.ExtraChargePolicy value) {
            this.extraChargePolicy = value;
        }

        /**
         * 获取defaultValidBookingMinOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDefaultValidBookingMinOffset() {
            return defaultValidBookingMinOffset;
        }

        /**
         * 设置defaultValidBookingMinOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDefaultValidBookingMinOffset(BigInteger value) {
            this.defaultValidBookingMinOffset = value;
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
         * 获取lastUpdated属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * 设置lastUpdated属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
        }

        /**
         * 获取codeDetail属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * 设置codeDetail属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * 获取removal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRemoval() {
            if (removal == null) {
                return false;
            } else {
                return removal;
            }
        }

        /**
         * 设置removal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
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

        /**
         * 获取mon属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMon() {
            return mon;
        }

        /**
         * 设置mon属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMon(Boolean value) {
            this.mon = value;
        }

        /**
         * 获取tue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTue() {
            return tue;
        }

        /**
         * 设置tue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTue(Boolean value) {
            this.tue = value;
        }

        /**
         * 获取weds属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWeds() {
            return weds;
        }

        /**
         * 设置weds属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWeds(Boolean value) {
            this.weds = value;
        }

        /**
         * 获取thur属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isThur() {
            return thur;
        }

        /**
         * 设置thur属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setThur(Boolean value) {
            this.thur = value;
        }

        /**
         * 获取fri属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFri() {
            return fri;
        }

        /**
         * 设置fri属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFri(Boolean value) {
            this.fri = value;
        }

        /**
         * 获取sat属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSat() {
            return sat;
        }

        /**
         * 设置sat属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSat(Boolean value) {
            this.sat = value;
        }

        /**
         * 获取sun属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSun() {
            return sun;
        }

        /**
         * 设置sun属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSun(Boolean value) {
            this.sun = value;
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
         *         &lt;element name="BookRestriction" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Distance" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                           &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
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
            "bookRestriction"
        })
        public static class BookPolicy {

            @XmlElement(name = "BookRestriction")
            protected List<PoliciesType.Policy.BookPolicy.BookRestriction> bookRestriction;

            /**
             * Gets the value of the bookRestriction property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bookRestriction property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBookRestriction().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.BookPolicy.BookRestriction }
             * 
             * 
             */
            public List<PoliciesType.Policy.BookPolicy.BookRestriction> getBookRestriction() {
                if (bookRestriction == null) {
                    bookRestriction = new ArrayList<PoliciesType.Policy.BookPolicy.BookRestriction>();
                }
                return this.bookRestriction;
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
             *         &lt;element name="Distance" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                 &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
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
                "distance"
            })
            public static class BookRestriction {

                @XmlElement(name = "Distance")
                protected PoliciesType.Policy.BookPolicy.BookRestriction.Distance distance;
                @XmlAttribute(name = "ID")
                protected String id;

                /**
                 * 获取distance属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link PoliciesType.Policy.BookPolicy.BookRestriction.Distance }
                 *     
                 */
                public PoliciesType.Policy.BookPolicy.BookRestriction.Distance getDistance() {
                    return distance;
                }

                /**
                 * 设置distance属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PoliciesType.Policy.BookPolicy.BookRestriction.Distance }
                 *     
                 */
                public void setDistance(PoliciesType.Policy.BookPolicy.BookRestriction.Distance value) {
                    this.distance = value;
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
                 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *       &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Distance {

                    @XmlAttribute(name = "Quantity")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger quantity;
                    @XmlAttribute(name = "Unit")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String unit;

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
         *         &lt;element name="CheckoutCharge" maxOccurs="2">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                 &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
         *                 &lt;attribute name="Type">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                       &lt;enumeration value="Early"/>
         *                       &lt;enumeration value="Late"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                 &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
            "checkoutCharge"
        })
        public static class CheckoutCharges {

            @XmlElement(name = "CheckoutCharge", required = true)
            protected List<PoliciesType.Policy.CheckoutCharges.CheckoutCharge> checkoutCharge;

            /**
             * Gets the value of the checkoutCharge property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the checkoutCharge property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCheckoutCharge().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.CheckoutCharges.CheckoutCharge }
             * 
             * 
             */
            public List<PoliciesType.Policy.CheckoutCharges.CheckoutCharge> getCheckoutCharge() {
                if (checkoutCharge == null) {
                    checkoutCharge = new ArrayList<PoliciesType.Policy.CheckoutCharges.CheckoutCharge>();
                }
                return this.checkoutCharge;
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
             *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *       &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
             *       &lt;attribute name="Type">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *             &lt;enumeration value="Early"/>
             *             &lt;enumeration value="Late"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *       &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "description"
            })
            public static class CheckoutCharge {

                @XmlElement(name = "Description")
                protected List<ParagraphType> description;
                @XmlAttribute(name = "Percent")
                protected BigDecimal percent;
                @XmlAttribute(name = "Type")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String type;
                @XmlAttribute(name = "NmbrOfNights")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger nmbrOfNights;
                @XmlAttribute(name = "ExistsCode")
                protected String existsCode;
                @XmlAttribute(name = "BalanceOfStayInd")
                protected Boolean balanceOfStayInd;
                @XmlAttribute(name = "CodeDetail")
                protected String codeDetail;
                @XmlAttribute(name = "Removal")
                protected Boolean removal;
                @XmlAttribute(name = "Amount")
                protected Float amount;
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
                 * Gets the value of the description property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the description property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDescription().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ParagraphType }
                 * 
                 * 
                 */
                public List<ParagraphType> getDescription() {
                    if (description == null) {
                        description = new ArrayList<ParagraphType>();
                    }
                    return this.description;
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
                 * 获取nmbrOfNights属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNmbrOfNights() {
                    return nmbrOfNights;
                }

                /**
                 * 设置nmbrOfNights属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNmbrOfNights(BigInteger value) {
                    this.nmbrOfNights = value;
                }

                /**
                 * 获取existsCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExistsCode() {
                    return existsCode;
                }

                /**
                 * 设置existsCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExistsCode(String value) {
                    this.existsCode = value;
                }

                /**
                 * 获取balanceOfStayInd属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isBalanceOfStayInd() {
                    return balanceOfStayInd;
                }

                /**
                 * 设置balanceOfStayInd属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setBalanceOfStayInd(Boolean value) {
                    this.balanceOfStayInd = value;
                }

                /**
                 * 获取codeDetail属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeDetail() {
                    return codeDetail;
                }

                /**
                 * 设置codeDetail属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeDetail(String value) {
                    this.codeDetail = value;
                }

                /**
                 * 获取removal属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isRemoval() {
                    if (removal == null) {
                        return false;
                    } else {
                        return removal;
                    }
                }

                /**
                 * 设置removal属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRemoval(Boolean value) {
                    this.removal = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
         *       &lt;sequence>
         *         &lt;element name="PaymentCompany" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="CommissionApplicability">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="AllRates"/>
         *             &lt;enumeration value="NoRates"/>
         *             &lt;enumeration value="SomeRates"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "paymentCompany"
        })
        public static class CommissionPolicy
            extends FeeType
        {

            @XmlElement(name = "PaymentCompany")
            protected List<PoliciesType.Policy.CommissionPolicy.PaymentCompany> paymentCompany;
            @XmlAttribute(name = "CommissionApplicability")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String commissionApplicability;

            /**
             * Gets the value of the paymentCompany property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the paymentCompany property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPaymentCompany().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.CommissionPolicy.PaymentCompany }
             * 
             * 
             */
            public List<PoliciesType.Policy.CommissionPolicy.PaymentCompany> getPaymentCompany() {
                if (paymentCompany == null) {
                    paymentCompany = new ArrayList<PoliciesType.Policy.CommissionPolicy.PaymentCompany>();
                }
                return this.paymentCompany;
            }

            /**
             * 获取commissionApplicability属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommissionApplicability() {
                return commissionApplicability;
            }

            /**
             * 设置commissionApplicability属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommissionApplicability(String value) {
                this.commissionApplicability = value;
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
             *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PaymentCompany {

                @XmlAttribute(name = "Name")
                protected String name;

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
         *       &lt;sequence>
         *         &lt;element name="ExtraChargePenalty" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="TimeSlotCharge" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="AmountPercent" type="{http://www.opentravel.org/OTA/2003/05}AmountPercentType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                           &lt;attribute name="StepSize" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
         *                           &lt;attribute name="ChargeType">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;enumeration value="Fixed"/>
         *                                 &lt;enumeration value="Tiered"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="PolicyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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
            "extraChargePenalty"
        })
        public static class ExtraChargePolicy {

            @XmlElement(name = "ExtraChargePenalty")
            protected List<PoliciesType.Policy.ExtraChargePolicy.ExtraChargePenalty> extraChargePenalty;

            /**
             * Gets the value of the extraChargePenalty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the extraChargePenalty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExtraChargePenalty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.ExtraChargePolicy.ExtraChargePenalty }
             * 
             * 
             */
            public List<PoliciesType.Policy.ExtraChargePolicy.ExtraChargePenalty> getExtraChargePenalty() {
                if (extraChargePenalty == null) {
                    extraChargePenalty = new ArrayList<PoliciesType.Policy.ExtraChargePolicy.ExtraChargePenalty>();
                }
                return this.extraChargePenalty;
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
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="TimeSlotCharge" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="AmountPercent" type="{http://www.opentravel.org/OTA/2003/05}AmountPercentType" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                 &lt;attribute name="StepSize" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
             *                 &lt;attribute name="ChargeType">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="Fixed"/>
             *                       &lt;enumeration value="Tiered"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="PolicyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "timeSlotCharge"
            })
            public static class ExtraChargePenalty {

                @XmlElement(name = "TimeSlotCharge")
                protected PoliciesType.Policy.ExtraChargePolicy.ExtraChargePenalty.TimeSlotCharge timeSlotCharge;
                @XmlAttribute(name = "PolicyCode")
                protected String policyCode;

                /**
                 * 获取timeSlotCharge属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link PoliciesType.Policy.ExtraChargePolicy.ExtraChargePenalty.TimeSlotCharge }
                 *     
                 */
                public PoliciesType.Policy.ExtraChargePolicy.ExtraChargePenalty.TimeSlotCharge getTimeSlotCharge() {
                    return timeSlotCharge;
                }

                /**
                 * 设置timeSlotCharge属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PoliciesType.Policy.ExtraChargePolicy.ExtraChargePenalty.TimeSlotCharge }
                 *     
                 */
                public void setTimeSlotCharge(PoliciesType.Policy.ExtraChargePolicy.ExtraChargePenalty.TimeSlotCharge value) {
                    this.timeSlotCharge = value;
                }

                /**
                 * 获取policyCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPolicyCode() {
                    return policyCode;
                }

                /**
                 * 设置policyCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPolicyCode(String value) {
                    this.policyCode = value;
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
                 *         &lt;element name="AmountPercent" type="{http://www.opentravel.org/OTA/2003/05}AmountPercentType" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *       &lt;attribute name="StepSize" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
                 *       &lt;attribute name="ChargeType">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="Fixed"/>
                 *             &lt;enumeration value="Tiered"/>
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
                    "amountPercent"
                })
                public static class TimeSlotCharge {

                    @XmlElement(name = "AmountPercent")
                    protected AmountPercentType amountPercent;
                    @XmlAttribute(name = "Start")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger start;
                    @XmlAttribute(name = "End")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger end;
                    @XmlAttribute(name = "StepSize")
                    protected BigDecimal stepSize;
                    @XmlAttribute(name = "Unit")
                    protected String unit;
                    @XmlAttribute(name = "ChargeType")
                    protected String chargeType;

                    /**
                     * 获取amountPercent属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link AmountPercentType }
                     *     
                     */
                    public AmountPercentType getAmountPercent() {
                        return amountPercent;
                    }

                    /**
                     * 设置amountPercent属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AmountPercentType }
                     *     
                     */
                    public void setAmountPercent(AmountPercentType value) {
                        this.amountPercent = value;
                    }

                    /**
                     * 获取start属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getStart() {
                        return start;
                    }

                    /**
                     * 设置start属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setStart(BigInteger value) {
                        this.start = value;
                    }

                    /**
                     * 获取end属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getEnd() {
                        return end;
                    }

                    /**
                     * 设置end属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setEnd(BigInteger value) {
                        this.end = value;
                    }

                    /**
                     * 获取stepSize属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getStepSize() {
                        return stepSize;
                    }

                    /**
                     * 设置stepSize属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setStepSize(BigDecimal value) {
                        this.stepSize = value;
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

                    /**
                     * 获取chargeType属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChargeType() {
                        return chargeType;
                    }

                    /**
                     * 设置chargeType属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChargeType(String value) {
                        this.chargeType = value;
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
         *         &lt;element name="FeePolicy" type="{http://www.opentravel.org/OTA/2003/05}FeeType" maxOccurs="unbounded"/>
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
            "feePolicy"
        })
        public static class FeePolicies {

            @XmlElement(name = "FeePolicy", required = true)
            protected List<FeeType> feePolicy;

            /**
             * Gets the value of the feePolicy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the feePolicy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFeePolicy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FeeType }
             * 
             * 
             */
            public List<FeeType> getFeePolicy() {
                if (feePolicy == null) {
                    feePolicy = new ArrayList<FeeType>();
                }
                return this.feePolicy;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GuaranteePaymentPolicy
            extends RequiredPaymentsType
        {

            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * 获取removal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
            }

            /**
             * 设置removal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
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
         *         &lt;element name="RequiredPayment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AcceptedPayments" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="AcceptedPayment" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="BankAcct" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *                                       &lt;element name="Currency" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="PaymentType" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="BankAddress" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *                                                 &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *                                                 &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *                                                 &lt;element name="CountryName" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="PaymentCard" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="CardCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="AgressoExtraFields" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="PaymentTerm">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                                         &lt;attribute name="NumDays" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="HandOffCurrency" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="HandOffRouting" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="RemittanceVia" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="PaymentMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="PaymentType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            "requiredPayment"
        })
        public static class PaymentPolicy {

            @XmlElement(name = "RequiredPayment")
            protected PoliciesType.Policy.PaymentPolicy.RequiredPayment requiredPayment;

            /**
             * 获取requiredPayment属性的值。
             * 
             * @return
             *     possible object is
             *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment }
             *     
             */
            public PoliciesType.Policy.PaymentPolicy.RequiredPayment getRequiredPayment() {
                return requiredPayment;
            }

            /**
             * 设置requiredPayment属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment }
             *     
             */
            public void setRequiredPayment(PoliciesType.Policy.PaymentPolicy.RequiredPayment value) {
                this.requiredPayment = value;
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
             *         &lt;element name="AcceptedPayments" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="AcceptedPayment" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="BankAcct" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
             *                             &lt;element name="Currency" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="PaymentType" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="BankAddress" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
             *                                       &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
             *                                       &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
             *                                       &lt;element name="CountryName" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="PaymentCard" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="CardCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="AgressoExtraFields" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="PaymentTerm">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                               &lt;attribute name="NumDays" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="HandOffCurrency" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="HandOffRouting" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="RemittanceVia" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="PaymentMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="PaymentType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                "acceptedPayments"
            })
            public static class RequiredPayment {

                @XmlElement(name = "AcceptedPayments")
                protected PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments acceptedPayments;

                /**
                 * 获取acceptedPayments属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments }
                 *     
                 */
                public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments getAcceptedPayments() {
                    return acceptedPayments;
                }

                /**
                 * 设置acceptedPayments属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments }
                 *     
                 */
                public void setAcceptedPayments(PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments value) {
                    this.acceptedPayments = value;
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
                 *         &lt;element name="AcceptedPayment" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="BankAcct" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
                 *                   &lt;element name="Currency" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="PaymentType" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="BankAddress" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
                 *                             &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
                 *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
                 *                             &lt;element name="CountryName" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="PaymentCard" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="CardCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="AgressoExtraFields" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="PaymentTerm">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                                     &lt;attribute name="NumDays" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="HandOffCurrency" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="HandOffRouting" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="RemittanceVia" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="PaymentMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="PaymentType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                    "acceptedPayment"
                })
                public static class AcceptedPayments {

                    @XmlElement(name = "AcceptedPayment")
                    protected List<PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment> acceptedPayment;

                    /**
                     * Gets the value of the acceptedPayment property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the acceptedPayment property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAcceptedPayment().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment }
                     * 
                     * 
                     */
                    public List<PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment> getAcceptedPayment() {
                        if (acceptedPayment == null) {
                            acceptedPayment = new ArrayList<PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment>();
                        }
                        return this.acceptedPayment;
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
                     *         &lt;element name="BankAcct" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
                     *         &lt;element name="Currency" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="PaymentType" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="BankAddress" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
                     *                   &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
                     *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
                     *                   &lt;element name="CountryName" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="PaymentCard" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="CardCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="AgressoExtraFields" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="PaymentTerm">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                           &lt;attribute name="NumDays" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="HandOffCurrency" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="HandOffRouting" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="RemittanceVia" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="PaymentMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="PaymentType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                        "bankAcct",
                        "bankAccName",
                        "currency",
                        "paymentType",
                        "bankAddress",
                        "paymentCard",
                        "agressoExtraFields"
                    })
                    public static class AcceptedPayment {

                        @XmlElement(name = "BankAcct")
                        protected PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAcct bankAcct;
                        @XmlElement(name = "BankAccName")
                        protected Object bankAccName;
                        @XmlElement(name = "Currency")
                        protected PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.Currency currency;
                        @XmlElement(name = "PaymentType")
                        protected PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentType paymentType;
                        @XmlElement(name = "BankAddress")
                        protected PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress bankAddress;
                        @XmlElement(name = "PaymentCard")
                        protected PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentCard paymentCard;
                        @XmlElement(name = "AgressoExtraFields")
                        protected PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields agressoExtraFields;

                        /**
                         * 获取bankAcct属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAcct }
                         *     
                         */
                        public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAcct getBankAcct() {
                            return bankAcct;
                        }

                        /**
                         * 设置bankAcct属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAcct }
                         *     
                         */
                        public void setBankAcct(PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAcct value) {
                            this.bankAcct = value;
                        }

                        /**
                         * 获取bankAccName属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getBankAccName() {
                            return bankAccName;
                        }

                        /**
                         * 设置bankAccName属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setBankAccName(Object value) {
                            this.bankAccName = value;
                        }

                        /**
                         * 获取currency属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.Currency }
                         *     
                         */
                        public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.Currency getCurrency() {
                            return currency;
                        }

                        /**
                         * 设置currency属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.Currency }
                         *     
                         */
                        public void setCurrency(PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.Currency value) {
                            this.currency = value;
                        }

                        /**
                         * 获取paymentType属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentType }
                         *     
                         */
                        public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentType getPaymentType() {
                            return paymentType;
                        }

                        /**
                         * 设置paymentType属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentType }
                         *     
                         */
                        public void setPaymentType(PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentType value) {
                            this.paymentType = value;
                        }

                        /**
                         * 获取bankAddress属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress }
                         *     
                         */
                        public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress getBankAddress() {
                            return bankAddress;
                        }

                        /**
                         * 设置bankAddress属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress }
                         *     
                         */
                        public void setBankAddress(PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress value) {
                            this.bankAddress = value;
                        }

                        /**
                         * 获取paymentCard属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentCard }
                         *     
                         */
                        public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentCard getPaymentCard() {
                            return paymentCard;
                        }

                        /**
                         * 设置paymentCard属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentCard }
                         *     
                         */
                        public void setPaymentCard(PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.PaymentCard value) {
                            this.paymentCard = value;
                        }

                        /**
                         * 获取agressoExtraFields属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields }
                         *     
                         */
                        public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields getAgressoExtraFields() {
                            return agressoExtraFields;
                        }

                        /**
                         * 设置agressoExtraFields属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields }
                         *     
                         */
                        public void setAgressoExtraFields(PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields value) {
                            this.agressoExtraFields = value;
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
                         *         &lt;element name="PaymentTerm">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *                 &lt;attribute name="NumDays" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="HandOffCurrency" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="HandOffRouting" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="RemittanceVia" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="PaymentMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="PaymentType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "paymentTerm"
                        })
                        public static class AgressoExtraFields {

                            @XmlElement(name = "PaymentTerm", required = true)
                            protected PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields.PaymentTerm paymentTerm;
                            @XmlAttribute(name = "HandOffCurrency", required = true)
                            @XmlSchemaType(name = "anySimpleType")
                            protected String handOffCurrency;
                            @XmlAttribute(name = "HandOffRouting", required = true)
                            @XmlSchemaType(name = "anySimpleType")
                            protected String handOffRouting;
                            @XmlAttribute(name = "RemittanceVia", required = true)
                            @XmlSchemaType(name = "anySimpleType")
                            protected String remittanceVia;
                            @XmlAttribute(name = "PaymentMethod", required = true)
                            @XmlSchemaType(name = "anySimpleType")
                            protected String paymentMethod;
                            @XmlAttribute(name = "PaymentType", required = true)
                            @XmlSchemaType(name = "anySimpleType")
                            protected String paymentType;

                            /**
                             * 获取paymentTerm属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields.PaymentTerm }
                             *     
                             */
                            public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields.PaymentTerm getPaymentTerm() {
                                return paymentTerm;
                            }

                            /**
                             * 设置paymentTerm属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields.PaymentTerm }
                             *     
                             */
                            public void setPaymentTerm(PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.AgressoExtraFields.PaymentTerm value) {
                                this.paymentTerm = value;
                            }

                            /**
                             * 获取handOffCurrency属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getHandOffCurrency() {
                                return handOffCurrency;
                            }

                            /**
                             * 设置handOffCurrency属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setHandOffCurrency(String value) {
                                this.handOffCurrency = value;
                            }

                            /**
                             * 获取handOffRouting属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getHandOffRouting() {
                                return handOffRouting;
                            }

                            /**
                             * 设置handOffRouting属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setHandOffRouting(String value) {
                                this.handOffRouting = value;
                            }

                            /**
                             * 获取remittanceVia属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getRemittanceVia() {
                                return remittanceVia;
                            }

                            /**
                             * 设置remittanceVia属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setRemittanceVia(String value) {
                                this.remittanceVia = value;
                            }

                            /**
                             * 获取paymentMethod属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getPaymentMethod() {
                                return paymentMethod;
                            }

                            /**
                             * 设置paymentMethod属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setPaymentMethod(String value) {
                                this.paymentMethod = value;
                            }

                            /**
                             * 获取paymentType属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getPaymentType() {
                                return paymentType;
                            }

                            /**
                             * 设置paymentType属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setPaymentType(String value) {
                                this.paymentType = value;
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
                             *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                             *       &lt;attribute name="NumDays" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class PaymentTerm {

                                @XmlAttribute(name = "Type", required = true)
                                @XmlSchemaType(name = "anySimpleType")
                                protected String type;
                                @XmlAttribute(name = "NumDays")
                                @XmlSchemaType(name = "anySimpleType")
                                protected String numDays;

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
                                 * 获取numDays属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getNumDays() {
                                    return numDays;
                                }

                                /**
                                 * 设置numDays属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setNumDays(String value) {
                                    this.numDays = value;
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
                         *       &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class BankAcct {

                            @XmlAttribute(name = "BankAcctNumber")
                            protected String bankAcctNumber;
                            @XmlAttribute(name = "BankName")
                            protected String bankName;
                            @XmlAttribute(name = "IBAN")
                            protected String iban;
                            @XmlAttribute(name = "SortCode")
                            protected String sortCode;
                            @XmlAttribute(name = "SwiftCode")
                            protected String swiftCode;

                            /**
                             * 获取bankAcctNumber属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getBankAcctNumber() {
                                return bankAcctNumber;
                            }

                            /**
                             * 设置bankAcctNumber属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setBankAcctNumber(String value) {
                                this.bankAcctNumber = value;
                            }

                            /**
                             * 获取bankName属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getBankName() {
                                return bankName;
                            }

                            /**
                             * 设置bankName属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setBankName(String value) {
                                this.bankName = value;
                            }

                            /**
                             * 获取iban属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getIBAN() {
                                return iban;
                            }

                            /**
                             * 设置iban属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setIBAN(String value) {
                                this.iban = value;
                            }

                            /**
                             * 获取sortCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSortCode() {
                                return sortCode;
                            }

                            /**
                             * 设置sortCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSortCode(String value) {
                                this.sortCode = value;
                            }

                            /**
                             * 获取swiftCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSwiftCode() {
                                return swiftCode;
                            }

                            /**
                             * 设置swiftCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSwiftCode(String value) {
                                this.swiftCode = value;
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
                         *         &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
                         *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
                         *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
                         *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
                         *         &lt;element name="CountryName" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            "streetNmbr",
                            "addressLine",
                            "area",
                            "cityName",
                            "postalCode",
                            "countryName"
                        })
                        public static class BankAddress {

                            @XmlElement(name = "StreetNmbr")
                            protected String streetNmbr;
                            @XmlElement(name = "AddressLine")
                            protected List<Object> addressLine;
                            @XmlElement(name = "Area")
                            protected Object area;
                            @XmlElement(name = "CityName")
                            protected Object cityName;
                            @XmlElement(name = "PostalCode")
                            protected Object postalCode;
                            @XmlElement(name = "CountryName")
                            protected PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress.CountryName countryName;

                            /**
                             * 获取streetNmbr属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getStreetNmbr() {
                                return streetNmbr;
                            }

                            /**
                             * 设置streetNmbr属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setStreetNmbr(String value) {
                                this.streetNmbr = value;
                            }

                            /**
                             * Gets the value of the addressLine property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the addressLine property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getAddressLine().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link Object }
                             * 
                             * 
                             */
                            public List<Object> getAddressLine() {
                                if (addressLine == null) {
                                    addressLine = new ArrayList<Object>();
                                }
                                return this.addressLine;
                            }

                            /**
                             * 获取area属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link Object }
                             *     
                             */
                            public Object getArea() {
                                return area;
                            }

                            /**
                             * 设置area属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Object }
                             *     
                             */
                            public void setArea(Object value) {
                                this.area = value;
                            }

                            /**
                             * 获取cityName属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link Object }
                             *     
                             */
                            public Object getCityName() {
                                return cityName;
                            }

                            /**
                             * 设置cityName属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Object }
                             *     
                             */
                            public void setCityName(Object value) {
                                this.cityName = value;
                            }

                            /**
                             * 获取postalCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link Object }
                             *     
                             */
                            public Object getPostalCode() {
                                return postalCode;
                            }

                            /**
                             * 设置postalCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Object }
                             *     
                             */
                            public void setPostalCode(Object value) {
                                this.postalCode = value;
                            }

                            /**
                             * 获取countryName属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress.CountryName }
                             *     
                             */
                            public PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress.CountryName getCountryName() {
                                return countryName;
                            }

                            /**
                             * 设置countryName属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress.CountryName }
                             *     
                             */
                            public void setCountryName(PoliciesType.Policy.PaymentPolicy.RequiredPayment.AcceptedPayments.AcceptedPayment.BankAddress.CountryName value) {
                                this.countryName = value;
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
                            public static class CountryName {

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
                        public static class Currency {

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
                         *       &lt;attribute name="CardCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class PaymentCard {

                            @XmlAttribute(name = "CardCode", required = true)
                            protected String cardCode;

                            /**
                             * 获取cardCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCardCode() {
                                return cardCode;
                            }

                            /**
                             * 设置cardCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCardCode(String value) {
                                this.cardCode = value;
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
                         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class PaymentType {

                            @XmlAttribute(name = "Code", required = true)
                            protected int code;

                            /**
                             * 获取code属性的值。
                             * 
                             */
                            public int getCode() {
                                return code;
                            }

                            /**
                             * 设置code属性的值。
                             * 
                             */
                            public void setCode(int value) {
                                this.code = value;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
         *                 &lt;attribute name="PetsPolicyCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                 &lt;attribute name="MaxPetQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
         *                 &lt;attribute name="RefundableDeposit" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                 &lt;attribute name="NonRefundableFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                 &lt;attribute name="ChargeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                 &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="PetsAllowedCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Pets Allowed"/>
         *             &lt;enumeration value="Pets Not Allowed"/>
         *             &lt;enumeration value="Assistive Animals Only"/>
         *             &lt;enumeration value="Pets By Arrangements"/>
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
            "petsPolicy"
        })
        public static class PetsPolicies {

            @XmlElement(name = "PetsPolicy")
            protected List<PoliciesType.Policy.PetsPolicies.PetsPolicy> petsPolicy;
            @XmlAttribute(name = "PetsAllowedCode")
            protected String petsAllowedCode;

            /**
             * Gets the value of the petsPolicy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the petsPolicy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPetsPolicy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.PetsPolicies.PetsPolicy }
             * 
             * 
             */
            public List<PoliciesType.Policy.PetsPolicies.PetsPolicy> getPetsPolicy() {
                if (petsPolicy == null) {
                    petsPolicy = new ArrayList<PoliciesType.Policy.PetsPolicies.PetsPolicy>();
                }
                return this.petsPolicy;
            }

            /**
             * 获取petsAllowedCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPetsAllowedCode() {
                return petsAllowedCode;
            }

            /**
             * 设置petsAllowedCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPetsAllowedCode(String value) {
                this.petsAllowedCode = value;
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
             *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
             *       &lt;attribute name="PetsPolicyCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *       &lt;attribute name="MaxPetQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
             *       &lt;attribute name="RefundableDeposit" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *       &lt;attribute name="NonRefundableFee" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *       &lt;attribute name="ChargeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *       &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "description"
            })
            public static class PetsPolicy {

                @XmlElement(name = "Description")
                protected List<ParagraphType> description;
                @XmlAttribute(name = "PetsPolicyCode")
                protected String petsPolicyCode;
                @XmlAttribute(name = "MaxPetQuantity")
                protected Integer maxPetQuantity;
                @XmlAttribute(name = "RefundableDeposit")
                protected BigDecimal refundableDeposit;
                @XmlAttribute(name = "NonRefundableFee")
                protected BigDecimal nonRefundableFee;
                @XmlAttribute(name = "ChargeCode")
                protected String chargeCode;
                @XmlAttribute(name = "RestrictionInd")
                protected Boolean restrictionInd;
                @XmlAttribute(name = "MinUnitOfMeasureQuantity")
                protected BigDecimal minUnitOfMeasureQuantity;
                @XmlAttribute(name = "UnitOfMeasureQuantity")
                protected BigDecimal unitOfMeasureQuantity;
                @XmlAttribute(name = "UnitOfMeasure")
                protected String unitOfMeasure;
                @XmlAttribute(name = "UnitOfMeasureCode")
                protected String unitOfMeasureCode;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;

                /**
                 * Gets the value of the description property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the description property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDescription().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ParagraphType }
                 * 
                 * 
                 */
                public List<ParagraphType> getDescription() {
                    if (description == null) {
                        description = new ArrayList<ParagraphType>();
                    }
                    return this.description;
                }

                /**
                 * 获取petsPolicyCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPetsPolicyCode() {
                    return petsPolicyCode;
                }

                /**
                 * 设置petsPolicyCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPetsPolicyCode(String value) {
                    this.petsPolicyCode = value;
                }

                /**
                 * 获取maxPetQuantity属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getMaxPetQuantity() {
                    return maxPetQuantity;
                }

                /**
                 * 设置maxPetQuantity属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setMaxPetQuantity(Integer value) {
                    this.maxPetQuantity = value;
                }

                /**
                 * 获取refundableDeposit属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getRefundableDeposit() {
                    return refundableDeposit;
                }

                /**
                 * 设置refundableDeposit属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setRefundableDeposit(BigDecimal value) {
                    this.refundableDeposit = value;
                }

                /**
                 * 获取nonRefundableFee属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNonRefundableFee() {
                    return nonRefundableFee;
                }

                /**
                 * 设置nonRefundableFee属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNonRefundableFee(BigDecimal value) {
                    this.nonRefundableFee = value;
                }

                /**
                 * 获取chargeCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChargeCode() {
                    return chargeCode;
                }

                /**
                 * 设置chargeCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChargeCode(String value) {
                    this.chargeCode = value;
                }

                /**
                 * 获取restrictionInd属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRestrictionInd() {
                    return restrictionInd;
                }

                /**
                 * 设置restrictionInd属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRestrictionInd(Boolean value) {
                    this.restrictionInd = value;
                }

                /**
                 * 获取minUnitOfMeasureQuantity属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMinUnitOfMeasureQuantity() {
                    return minUnitOfMeasureQuantity;
                }

                /**
                 * 设置minUnitOfMeasureQuantity属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMinUnitOfMeasureQuantity(BigDecimal value) {
                    this.minUnitOfMeasureQuantity = value;
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
         *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
         *         &lt;element name="ChildCategories" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ChildCategory" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="NotAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Under" type="{http://www.w3.org/2001/XMLSchema}int" />
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
         *       &lt;attribute name="CheckInTime" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
         *       &lt;attribute name="CheckOutTime" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
         *       &lt;attribute name="CheckOut" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
         *       &lt;attribute name="MinGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="MinRecommendedGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="UsualStayFreeCutoffAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="UsualStayFreeChildPerAdult" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="DefaultTaxServiceInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="KidsStayFree" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="MaxChildAge" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
         *       &lt;attribute name="InternetGuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ReleaseCutOff" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            "childCategories"
        })
        public static class PolicyInfo {

            @XmlElement(name = "Description")
            protected ParagraphType description;
            @XmlElement(name = "ChildCategories")
            protected PoliciesType.Policy.PolicyInfo.ChildCategories childCategories;
            @XmlAttribute(name = "CheckInTime")
            protected String checkInTime;
            @XmlAttribute(name = "CheckOutTime")
            protected String checkOutTime;
            @XmlAttribute(name = "CheckOut")
            protected String checkOut;
            @XmlAttribute(name = "MinGuestAge")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger minGuestAge;
            @XmlAttribute(name = "MinRecommendedGuestAge")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger minRecommendedGuestAge;
            @XmlAttribute(name = "UsualStayFreeCutoffAge")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger usualStayFreeCutoffAge;
            @XmlAttribute(name = "UsualStayFreeChildPerAdult")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger usualStayFreeChildPerAdult;
            @XmlAttribute(name = "TotalGuestCount")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger totalGuestCount;
            @XmlAttribute(name = "DefaultTaxServiceInclusive")
            protected Boolean defaultTaxServiceInclusive;
            @XmlAttribute(name = "KidsStayFree")
            protected Boolean kidsStayFree;
            @XmlAttribute(name = "MaxChildAge")
            protected Integer maxChildAge;
            @XmlAttribute(name = "InternetGuaranteeRequiredInd")
            protected Boolean internetGuaranteeRequiredInd;
            @XmlAttribute(name = "ReleaseCutOff")
            @XmlSchemaType(name = "anySimpleType")
            protected String releaseCutOff;

            /**
             * 获取description属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ParagraphType }
             *     
             */
            public ParagraphType getDescription() {
                return description;
            }

            /**
             * 设置description属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ParagraphType }
             *     
             */
            public void setDescription(ParagraphType value) {
                this.description = value;
            }

            /**
             * 获取childCategories属性的值。
             * 
             * @return
             *     possible object is
             *     {@link PoliciesType.Policy.PolicyInfo.ChildCategories }
             *     
             */
            public PoliciesType.Policy.PolicyInfo.ChildCategories getChildCategories() {
                return childCategories;
            }

            /**
             * 设置childCategories属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link PoliciesType.Policy.PolicyInfo.ChildCategories }
             *     
             */
            public void setChildCategories(PoliciesType.Policy.PolicyInfo.ChildCategories value) {
                this.childCategories = value;
            }

            /**
             * 获取checkInTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckInTime() {
                return checkInTime;
            }

            /**
             * 设置checkInTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckInTime(String value) {
                this.checkInTime = value;
            }

            /**
             * 获取checkOutTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckOutTime() {
                return checkOutTime;
            }

            /**
             * 设置checkOutTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckOutTime(String value) {
                this.checkOutTime = value;
            }

            /**
             * 获取checkOut属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckOut() {
                return checkOut;
            }

            /**
             * 设置checkOut属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckOut(String value) {
                this.checkOut = value;
            }

            /**
             * 获取minGuestAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinGuestAge() {
                return minGuestAge;
            }

            /**
             * 设置minGuestAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinGuestAge(BigInteger value) {
                this.minGuestAge = value;
            }

            /**
             * 获取minRecommendedGuestAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinRecommendedGuestAge() {
                return minRecommendedGuestAge;
            }

            /**
             * 设置minRecommendedGuestAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinRecommendedGuestAge(BigInteger value) {
                this.minRecommendedGuestAge = value;
            }

            /**
             * 获取usualStayFreeCutoffAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUsualStayFreeCutoffAge() {
                return usualStayFreeCutoffAge;
            }

            /**
             * 设置usualStayFreeCutoffAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUsualStayFreeCutoffAge(BigInteger value) {
                this.usualStayFreeCutoffAge = value;
            }

            /**
             * 获取usualStayFreeChildPerAdult属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUsualStayFreeChildPerAdult() {
                return usualStayFreeChildPerAdult;
            }

            /**
             * 设置usualStayFreeChildPerAdult属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUsualStayFreeChildPerAdult(BigInteger value) {
                this.usualStayFreeChildPerAdult = value;
            }

            /**
             * 获取totalGuestCount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalGuestCount() {
                return totalGuestCount;
            }

            /**
             * 设置totalGuestCount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalGuestCount(BigInteger value) {
                this.totalGuestCount = value;
            }

            /**
             * 获取defaultTaxServiceInclusive属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDefaultTaxServiceInclusive() {
                return defaultTaxServiceInclusive;
            }

            /**
             * 设置defaultTaxServiceInclusive属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDefaultTaxServiceInclusive(Boolean value) {
                this.defaultTaxServiceInclusive = value;
            }

            /**
             * 获取kidsStayFree属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isKidsStayFree() {
                return kidsStayFree;
            }

            /**
             * 设置kidsStayFree属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setKidsStayFree(Boolean value) {
                this.kidsStayFree = value;
            }

            /**
             * 获取maxChildAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxChildAge() {
                return maxChildAge;
            }

            /**
             * 设置maxChildAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxChildAge(Integer value) {
                this.maxChildAge = value;
            }

            /**
             * 获取internetGuaranteeRequiredInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInternetGuaranteeRequiredInd() {
                return internetGuaranteeRequiredInd;
            }

            /**
             * 设置internetGuaranteeRequiredInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInternetGuaranteeRequiredInd(Boolean value) {
                this.internetGuaranteeRequiredInd = value;
            }

            /**
             * 获取releaseCutOff属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReleaseCutOff() {
                return releaseCutOff;
            }

            /**
             * 设置releaseCutOff属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReleaseCutOff(String value) {
                this.releaseCutOff = value;
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
             *         &lt;element name="ChildCategory" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="NotAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Under" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                "childCategory"
            })
            public static class ChildCategories {

                @XmlElement(name = "ChildCategory")
                protected List<PoliciesType.Policy.PolicyInfo.ChildCategories.ChildCategory> childCategory;

                /**
                 * Gets the value of the childCategory property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the childCategory property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChildCategory().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PoliciesType.Policy.PolicyInfo.ChildCategories.ChildCategory }
                 * 
                 * 
                 */
                public List<PoliciesType.Policy.PolicyInfo.ChildCategories.ChildCategory> getChildCategory() {
                    if (childCategory == null) {
                        childCategory = new ArrayList<PoliciesType.Policy.PolicyInfo.ChildCategories.ChildCategory>();
                    }
                    return this.childCategory;
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
                 *       &lt;attribute name="NotAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Under" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ChildCategory {

                    @XmlAttribute(name = "NotAllowed")
                    protected Boolean notAllowed;
                    @XmlAttribute(name = "Under")
                    protected Integer under;

                    /**
                     * 获取notAllowed属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isNotAllowed() {
                        return notAllowed;
                    }

                    /**
                     * 设置notAllowed属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setNotAllowed(Boolean value) {
                        this.notAllowed = value;
                    }

                    /**
                     * 获取under属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getUnder() {
                        return under;
                    }

                    /**
                     * 设置under属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setUnder(Integer value) {
                        this.under = value;
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
         *         &lt;element name="PolicyInfoCode" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
         *                 &lt;attribute name="Name">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                       &lt;enumeration value="AdditionalOversoldPolicy"/>
         *                       &lt;enumeration value="EarlyCheckinAvailable"/>
         *                       &lt;enumeration value="LateCheckoutAvailable"/>
         *                       &lt;enumeration value="OversoldArrangeAccommodations"/>
         *                       &lt;enumeration value="OversoldArrangeTransportation"/>
         *                       &lt;enumeration value="OversoldNotifyContacts"/>
         *                       &lt;enumeration value="OversoldPayOneNightRoom"/>
         *                       &lt;enumeration value="OversoldProvidePhonecall"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
            "policyInfoCode"
        })
        public static class PolicyInfoCodes {

            @XmlElement(name = "PolicyInfoCode", required = true)
            protected List<PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode> policyInfoCode;

            /**
             * Gets the value of the policyInfoCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the policyInfoCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPolicyInfoCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode }
             * 
             * 
             */
            public List<PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode> getPolicyInfoCode() {
                if (policyInfoCode == null) {
                    policyInfoCode = new ArrayList<PoliciesType.Policy.PolicyInfoCodes.PolicyInfoCode>();
                }
                return this.policyInfoCode;
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
             *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
             *       &lt;attribute name="Name">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *             &lt;enumeration value="AdditionalOversoldPolicy"/>
             *             &lt;enumeration value="EarlyCheckinAvailable"/>
             *             &lt;enumeration value="LateCheckoutAvailable"/>
             *             &lt;enumeration value="OversoldArrangeAccommodations"/>
             *             &lt;enumeration value="OversoldArrangeTransportation"/>
             *             &lt;enumeration value="OversoldNotifyContacts"/>
             *             &lt;enumeration value="OversoldPayOneNightRoom"/>
             *             &lt;enumeration value="OversoldProvidePhonecall"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "description"
            })
            public static class PolicyInfoCode {

                @XmlElement(name = "Description")
                protected List<ParagraphType> description;
                @XmlAttribute(name = "Name")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String name;
                @XmlAttribute(name = "ExistsCode")
                protected String existsCode;
                @XmlAttribute(name = "CodeDetail")
                protected String codeDetail;
                @XmlAttribute(name = "Removal")
                protected Boolean removal;
                @XmlAttribute(name = "URI")
                @XmlSchemaType(name = "anyURI")
                protected String uri;
                @XmlAttribute(name = "Quantity")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger quantity;
                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * Gets the value of the description property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the description property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDescription().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ParagraphType }
                 * 
                 * 
                 */
                public List<ParagraphType> getDescription() {
                    if (description == null) {
                        description = new ArrayList<ParagraphType>();
                    }
                    return this.description;
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
                 * 获取existsCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExistsCode() {
                    return existsCode;
                }

                /**
                 * 设置existsCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExistsCode(String value) {
                    this.existsCode = value;
                }

                /**
                 * 获取codeDetail属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeDetail() {
                    return codeDetail;
                }

                /**
                 * 设置codeDetail属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeDetail(String value) {
                    this.codeDetail = value;
                }

                /**
                 * 获取removal属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isRemoval() {
                    if (removal == null) {
                        return false;
                    } else {
                        return removal;
                    }
                }

                /**
                 * 设置removal属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRemoval(Boolean value) {
                    this.removal = value;
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
         *         &lt;element name="StayRequirement" maxOccurs="9">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
         *                 &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="StayContext">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                       &lt;enumeration value="Checkin"/>
         *                       &lt;enumeration value="Checkout"/>
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
            "stayRequirement"
        })
        public static class StayRequirements {

            @XmlElement(name = "StayRequirement", required = true)
            protected List<PoliciesType.Policy.StayRequirements.StayRequirement> stayRequirement;

            /**
             * Gets the value of the stayRequirement property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stayRequirement property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStayRequirement().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.StayRequirements.StayRequirement }
             * 
             * 
             */
            public List<PoliciesType.Policy.StayRequirements.StayRequirement> getStayRequirement() {
                if (stayRequirement == null) {
                    stayRequirement = new ArrayList<PoliciesType.Policy.StayRequirements.StayRequirement>();
                }
                return this.stayRequirement;
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
             *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
             *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="StayContext">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *             &lt;enumeration value="Checkin"/>
             *             &lt;enumeration value="Checkout"/>
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
                "description"
            })
            public static class StayRequirement {

                @XmlElement(name = "Description")
                protected ParagraphType description;
                @XmlAttribute(name = "MinLOS")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger minLOS;
                @XmlAttribute(name = "MaxLOS")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger maxLOS;
                @XmlAttribute(name = "StayContext")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String stayContext;
                @XmlAttribute(name = "Mon")
                protected Boolean mon;
                @XmlAttribute(name = "Tue")
                protected Boolean tue;
                @XmlAttribute(name = "Weds")
                protected Boolean weds;
                @XmlAttribute(name = "Thur")
                protected Boolean thur;
                @XmlAttribute(name = "Fri")
                protected Boolean fri;
                @XmlAttribute(name = "Sat")
                protected Boolean sat;
                @XmlAttribute(name = "Sun")
                protected Boolean sun;

                /**
                 * 获取description属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ParagraphType }
                 *     
                 */
                public ParagraphType getDescription() {
                    return description;
                }

                /**
                 * 设置description属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ParagraphType }
                 *     
                 */
                public void setDescription(ParagraphType value) {
                    this.description = value;
                }

                /**
                 * 获取minLOS属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMinLOS() {
                    return minLOS;
                }

                /**
                 * 设置minLOS属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMinLOS(BigInteger value) {
                    this.minLOS = value;
                }

                /**
                 * 获取maxLOS属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMaxLOS() {
                    return maxLOS;
                }

                /**
                 * 设置maxLOS属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMaxLOS(BigInteger value) {
                    this.maxLOS = value;
                }

                /**
                 * 获取stayContext属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStayContext() {
                    return stayContext;
                }

                /**
                 * 设置stayContext属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStayContext(String value) {
                    this.stayContext = value;
                }

                /**
                 * 获取mon属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isMon() {
                    return mon;
                }

                /**
                 * 设置mon属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setMon(Boolean value) {
                    this.mon = value;
                }

                /**
                 * 获取tue属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isTue() {
                    return tue;
                }

                /**
                 * 设置tue属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setTue(Boolean value) {
                    this.tue = value;
                }

                /**
                 * 获取weds属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isWeds() {
                    return weds;
                }

                /**
                 * 设置weds属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setWeds(Boolean value) {
                    this.weds = value;
                }

                /**
                 * 获取thur属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isThur() {
                    return thur;
                }

                /**
                 * 设置thur属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setThur(Boolean value) {
                    this.thur = value;
                }

                /**
                 * 获取fri属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isFri() {
                    return fri;
                }

                /**
                 * 设置fri属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setFri(Boolean value) {
                    this.fri = value;
                }

                /**
                 * 获取sat属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSat() {
                    return sat;
                }

                /**
                 * 设置sat属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSat(Boolean value) {
                    this.sat = value;
                }

                /**
                 * 获取sun属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSun() {
                    return sun;
                }

                /**
                 * 设置sun属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSun(Boolean value) {
                    this.sun = value;
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
         *         &lt;element name="TaxPolicy" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType">
         *                 &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
            "taxPolicy"
        })
        public static class TaxPolicies {

            @XmlElement(name = "TaxPolicy")
            protected List<PoliciesType.Policy.TaxPolicies.TaxPolicy> taxPolicy;

            /**
             * Gets the value of the taxPolicy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the taxPolicy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTaxPolicy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.TaxPolicies.TaxPolicy }
             * 
             * 
             */
            public List<PoliciesType.Policy.TaxPolicies.TaxPolicy> getTaxPolicy() {
                if (taxPolicy == null) {
                    taxPolicy = new ArrayList<PoliciesType.Policy.TaxPolicies.TaxPolicy>();
                }
                return this.taxPolicy;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType">
             *       &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TaxPolicy
                extends TaxType
            {

                @XmlAttribute(name = "NightsForTaxExemptionQuantity")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger nightsForTaxExemptionQuantity;
                @XmlAttribute(name = "TaxableNightsQuantity")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger taxableNightsQuantity;

                /**
                 * 获取nightsForTaxExemptionQuantity属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNightsForTaxExemptionQuantity() {
                    return nightsForTaxExemptionQuantity;
                }

                /**
                 * 设置nightsForTaxExemptionQuantity属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNightsForTaxExemptionQuantity(BigInteger value) {
                    this.nightsForTaxExemptionQuantity = value;
                }

                /**
                 * 获取taxableNightsQuantity属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTaxableNightsQuantity() {
                    return taxableNightsQuantity;
                }

                /**
                 * 设置taxableNightsQuantity属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTaxableNightsQuantity(BigInteger value) {
                    this.taxableNightsQuantity = value;
                }

            }

        }

    }

}
