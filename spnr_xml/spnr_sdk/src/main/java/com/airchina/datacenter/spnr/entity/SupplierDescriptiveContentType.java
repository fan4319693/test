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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SupplierDescriptiveContentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplierDescriptiveContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="BookingOffices">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="BookingOffice" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Addresses">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}Address" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Names">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Phones">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Phone" type="{http://www.opentravel.org/OTA/2003/05}Phone" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Emails">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Contacts">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Contact">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SupplierNotification" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="Phones" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Phones" type="{http://www.opentravel.org/OTA/2003/05}Phone"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Emails" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="PreferredMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Contract" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ContactInfos">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfo" maxOccurs="2"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PaymentDetails" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PaymentDetail">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="BankAcct">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                                           &lt;element name="Currency">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                                           &lt;element name="BankAddress" type="{http://www.opentravel.org/OTA/2003/05}Address"/>
 *                                                           &lt;element name="AgressoExtraFields">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="PaymentTerm">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="HandOffCurrency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="HandOffRouting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;attribute name="RemittanceVia" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
 *                           &lt;attribute name="Code">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="20"/>
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
 *         &lt;element name="Policies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Policy" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AbsoluteCutoff" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
 *                           &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                           &lt;attribute name="OffsetUnitMultiplier" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to999" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Deduplication" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Algorithm">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Parameter" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Weight" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                           &lt;attribute name="WeightForNotFoundHotels" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="MinimumQuality" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AutomaticMergeThreshold" use="required" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MergeConfigurations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MergeConfiguration" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="AutoMerge" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VoucherProductTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VoucherProductType" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/>
 *       &lt;attribute name="EnableDepotRegion" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="External" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SupplierCode" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="16"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SupplierName" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
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
@XmlType(name = "SupplierDescriptiveContentType", propOrder = {
    "bookingOffices",
    "policies",
    "deduplication",
    "mergeConfigurations",
    "voucherProductTypes"
})
public class SupplierDescriptiveContentType {

    @XmlElement(name = "BookingOffices")
    protected SupplierDescriptiveContentType.BookingOffices bookingOffices;
    @XmlElement(name = "Policies")
    protected SupplierDescriptiveContentType.Policies policies;
    @XmlElement(name = "Deduplication")
    protected SupplierDescriptiveContentType.Deduplication deduplication;
    @XmlElement(name = "MergeConfigurations")
    protected SupplierDescriptiveContentType.MergeConfigurations mergeConfigurations;
    @XmlElement(name = "VoucherProductTypes")
    protected SupplierDescriptiveContentType.VoucherProductTypes voucherProductTypes;
    @XmlAttribute(name = "EnableDepotRegion")
    protected Boolean enableDepotRegion;
    @XmlAttribute(name = "Enabled", required = true)
    protected boolean enabled;
    @XmlAttribute(name = "External", required = true)
    protected boolean external;
    @XmlAttribute(name = "SupplierCode", required = true)
    protected String supplierCode;
    @XmlAttribute(name = "SupplierName", required = true)
    protected String supplierName;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;

    /**
     * 获取bookingOffices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierDescriptiveContentType.BookingOffices }
     *     
     */
    public SupplierDescriptiveContentType.BookingOffices getBookingOffices() {
        return bookingOffices;
    }

    /**
     * 设置bookingOffices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierDescriptiveContentType.BookingOffices }
     *     
     */
    public void setBookingOffices(SupplierDescriptiveContentType.BookingOffices value) {
        this.bookingOffices = value;
    }

    /**
     * 获取policies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierDescriptiveContentType.Policies }
     *     
     */
    public SupplierDescriptiveContentType.Policies getPolicies() {
        return policies;
    }

    /**
     * 设置policies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierDescriptiveContentType.Policies }
     *     
     */
    public void setPolicies(SupplierDescriptiveContentType.Policies value) {
        this.policies = value;
    }

    /**
     * 获取deduplication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierDescriptiveContentType.Deduplication }
     *     
     */
    public SupplierDescriptiveContentType.Deduplication getDeduplication() {
        return deduplication;
    }

    /**
     * 设置deduplication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierDescriptiveContentType.Deduplication }
     *     
     */
    public void setDeduplication(SupplierDescriptiveContentType.Deduplication value) {
        this.deduplication = value;
    }

    /**
     * 获取mergeConfigurations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierDescriptiveContentType.MergeConfigurations }
     *     
     */
    public SupplierDescriptiveContentType.MergeConfigurations getMergeConfigurations() {
        return mergeConfigurations;
    }

    /**
     * 设置mergeConfigurations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierDescriptiveContentType.MergeConfigurations }
     *     
     */
    public void setMergeConfigurations(SupplierDescriptiveContentType.MergeConfigurations value) {
        this.mergeConfigurations = value;
    }

    /**
     * 获取voucherProductTypes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierDescriptiveContentType.VoucherProductTypes }
     *     
     */
    public SupplierDescriptiveContentType.VoucherProductTypes getVoucherProductTypes() {
        return voucherProductTypes;
    }

    /**
     * 设置voucherProductTypes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierDescriptiveContentType.VoucherProductTypes }
     *     
     */
    public void setVoucherProductTypes(SupplierDescriptiveContentType.VoucherProductTypes value) {
        this.voucherProductTypes = value;
    }

    /**
     * 获取enableDepotRegion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDepotRegion() {
        return enableDepotRegion;
    }

    /**
     * 设置enableDepotRegion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDepotRegion(Boolean value) {
        this.enableDepotRegion = value;
    }

    /**
     * 获取enabled属性的值。
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * 设置enabled属性的值。
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * 获取external属性的值。
     * 
     */
    public boolean isExternal() {
        return external;
    }

    /**
     * 设置external属性的值。
     * 
     */
    public void setExternal(boolean value) {
        this.external = value;
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
     * 获取supplierName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置supplierName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

    /**
     * 获取createDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * 设置createDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * 获取creatorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * 设置creatorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * 获取lastModifyDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * 设置lastModifyDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * 获取lastModifierID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * 设置lastModifierID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="BookingOffice" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Addresses">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}Address" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Names">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Phones">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Phone" type="{http://www.opentravel.org/OTA/2003/05}Phone" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Emails">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Contacts">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Contact">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SupplierNotification" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="Phones" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Phones" type="{http://www.opentravel.org/OTA/2003/05}Phone"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Emails" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="PreferredMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Contract" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ContactInfos">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfo" maxOccurs="2"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PaymentDetails" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PaymentDetail">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="BankAcct">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                                                 &lt;element name="Currency">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                                                 &lt;element name="BankAddress" type="{http://www.opentravel.org/OTA/2003/05}Address"/>
     *                                                 &lt;element name="AgressoExtraFields">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="PaymentTerm">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="HandOffCurrency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="HandOffRouting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                         &lt;attribute name="RemittanceVia" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
     *                 &lt;attribute name="Code">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="20"/>
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
        "bookingOffice"
    })
    public static class BookingOffices {

        @XmlElement(name = "BookingOffice")
        protected List<SupplierDescriptiveContentType.BookingOffices.BookingOffice> bookingOffice;

        /**
         * Gets the value of the bookingOffice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingOffice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingOffice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice }
         * 
         * 
         */
        public List<SupplierDescriptiveContentType.BookingOffices.BookingOffice> getBookingOffice() {
            if (bookingOffice == null) {
                bookingOffice = new ArrayList<SupplierDescriptiveContentType.BookingOffices.BookingOffice>();
            }
            return this.bookingOffice;
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
         *         &lt;element name="Addresses">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}Address" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Names">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Phones">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Phone" type="{http://www.opentravel.org/OTA/2003/05}Phone" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Emails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Contacts">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Contact">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SupplierNotification" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="Phones" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Phones" type="{http://www.opentravel.org/OTA/2003/05}Phone"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Emails" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="PreferredMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Contract" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ContactInfos">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfo" maxOccurs="2"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PaymentDetails" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PaymentDetail">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="BankAcct">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                                       &lt;element name="Currency">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                                       &lt;element name="BankAddress" type="{http://www.opentravel.org/OTA/2003/05}Address"/>
         *                                       &lt;element name="AgressoExtraFields">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="PaymentTerm">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="HandOffCurrency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="HandOffRouting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                               &lt;attribute name="RemittanceVia" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
         *       &lt;attribute name="Code">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="20"/>
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
            "addresses",
            "names",
            "phones",
            "emails",
            "contacts",
            "supplierNotification",
            "contract"
        })
        public static class BookingOffice {

            @XmlElement(name = "Addresses", required = true)
            protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Addresses addresses;
            @XmlElement(name = "Names", required = true)
            protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names names;
            @XmlElement(name = "Phones", required = true)
            protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Phones phones;
            @XmlElement(name = "Emails", required = true)
            protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Emails emails;
            @XmlElement(name = "Contacts", required = true)
            protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts contacts;
            @XmlElement(name = "SupplierNotification")
            protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification supplierNotification;
            @XmlElement(name = "Contract")
            protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract contract;
            @XmlAttribute(name = "Code")
            protected String code;

            /**
             * 获取addresses属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Addresses }
             *     
             */
            public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Addresses getAddresses() {
                return addresses;
            }

            /**
             * 设置addresses属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Addresses }
             *     
             */
            public void setAddresses(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Addresses value) {
                this.addresses = value;
            }

            /**
             * 获取names属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names }
             *     
             */
            public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names getNames() {
                return names;
            }

            /**
             * 设置names属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names }
             *     
             */
            public void setNames(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names value) {
                this.names = value;
            }

            /**
             * 获取phones属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Phones }
             *     
             */
            public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Phones getPhones() {
                return phones;
            }

            /**
             * 设置phones属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Phones }
             *     
             */
            public void setPhones(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Phones value) {
                this.phones = value;
            }

            /**
             * 获取emails属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Emails }
             *     
             */
            public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Emails getEmails() {
                return emails;
            }

            /**
             * 设置emails属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Emails }
             *     
             */
            public void setEmails(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Emails value) {
                this.emails = value;
            }

            /**
             * 获取contacts属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts }
             *     
             */
            public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts getContacts() {
                return contacts;
            }

            /**
             * 设置contacts属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts }
             *     
             */
            public void setContacts(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts value) {
                this.contacts = value;
            }

            /**
             * 获取supplierNotification属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification }
             *     
             */
            public SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification getSupplierNotification() {
                return supplierNotification;
            }

            /**
             * 设置supplierNotification属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification }
             *     
             */
            public void setSupplierNotification(SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification value) {
                this.supplierNotification = value;
            }

            /**
             * 获取contract属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract }
             *     
             */
            public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract getContract() {
                return contract;
            }

            /**
             * 设置contract属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract }
             *     
             */
            public void setContract(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract value) {
                this.contract = value;
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}Address" maxOccurs="unbounded"/>
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
                "address"
            })
            public static class Addresses {

                @XmlElement(name = "Address", required = true)
                protected List<Address> address;

                /**
                 * Gets the value of the address property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the address property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAddress().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Address }
                 * 
                 * 
                 */
                public List<Address> getAddress() {
                    if (address == null) {
                        address = new ArrayList<Address>();
                    }
                    return this.address;
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
             *         &lt;element name="Contact">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "contact"
            })
            public static class Contacts {

                @XmlElement(name = "Contact", required = true)
                protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts.Contact contact;

                /**
                 * 获取contact属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts.Contact }
                 *     
                 */
                public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts.Contact getContact() {
                    return contact;
                }

                /**
                 * 设置contact属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts.Contact }
                 *     
                 */
                public void setContact(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contacts.Contact value) {
                    this.contact = value;
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
                 *       &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Contact {

                    @XmlAttribute(name = "FullName")
                    protected String fullName;

                    /**
                     * 获取fullName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFullName() {
                        return fullName;
                    }

                    /**
                     * 设置fullName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFullName(String value) {
                        this.fullName = value;
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
             *         &lt;element name="ContactInfos">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfo" maxOccurs="2"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PaymentDetails" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PaymentDetail">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="BankAcct">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *                             &lt;element name="Currency">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *                             &lt;element name="BankAddress" type="{http://www.opentravel.org/OTA/2003/05}Address"/>
             *                             &lt;element name="AgressoExtraFields">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="PaymentTerm">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="HandOffCurrency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="HandOffRouting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                     &lt;attribute name="RemittanceVia" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                "contactInfos",
                "paymentDetails"
            })
            public static class Contract {

                @XmlElement(name = "ContactInfos", required = true)
                protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.ContactInfos contactInfos;
                @XmlElement(name = "PaymentDetails")
                protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails paymentDetails;

                /**
                 * 获取contactInfos属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.ContactInfos }
                 *     
                 */
                public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.ContactInfos getContactInfos() {
                    return contactInfos;
                }

                /**
                 * 设置contactInfos属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.ContactInfos }
                 *     
                 */
                public void setContactInfos(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.ContactInfos value) {
                    this.contactInfos = value;
                }

                /**
                 * 获取paymentDetails属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails }
                 *     
                 */
                public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails getPaymentDetails() {
                    return paymentDetails;
                }

                /**
                 * 设置paymentDetails属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails }
                 *     
                 */
                public void setPaymentDetails(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails value) {
                    this.paymentDetails = value;
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
                 *         &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfo" maxOccurs="2"/>
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
                    "contactInfo"
                })
                public static class ContactInfos {

                    @XmlElement(name = "ContactInfo", required = true)
                    protected List<ContactInfo> contactInfo;

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
                     * {@link ContactInfo }
                     * 
                     * 
                     */
                    public List<ContactInfo> getContactInfo() {
                        if (contactInfo == null) {
                            contactInfo = new ArrayList<ContactInfo>();
                        }
                        return this.contactInfo;
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
                 *         &lt;element name="PaymentDetail">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="BankAcct">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                 *                   &lt;element name="Currency">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                 *                   &lt;element name="BankAddress" type="{http://www.opentravel.org/OTA/2003/05}Address"/>
                 *                   &lt;element name="AgressoExtraFields">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="PaymentTerm">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="HandOffCurrency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="HandOffRouting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                           &lt;attribute name="RemittanceVia" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                    "paymentDetail"
                })
                public static class PaymentDetails {

                    @XmlElement(name = "PaymentDetail", required = true)
                    protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail paymentDetail;

                    /**
                     * 获取paymentDetail属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail }
                     *     
                     */
                    public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail getPaymentDetail() {
                        return paymentDetail;
                    }

                    /**
                     * 设置paymentDetail属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail }
                     *     
                     */
                    public void setPaymentDetail(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail value) {
                        this.paymentDetail = value;
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
                     *         &lt;element name="BankAcct">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                     *         &lt;element name="Currency">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                     *         &lt;element name="BankAddress" type="{http://www.opentravel.org/OTA/2003/05}Address"/>
                     *         &lt;element name="AgressoExtraFields">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="PaymentTerm">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="HandOffCurrency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="HandOffRouting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                 &lt;attribute name="RemittanceVia" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                        "agressoExtraFields"
                    })
                    public static class PaymentDetail {

                        @XmlElement(name = "BankAcct", required = true)
                        protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.BankAcct bankAcct;
                        @XmlElement(name = "BankAccName", required = true)
                        protected Object bankAccName;
                        @XmlElement(name = "Currency", required = true)
                        protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.Currency currency;
                        @XmlElement(name = "PaymentType", required = true)
                        protected Object paymentType;
                        @XmlElement(name = "BankAddress", required = true)
                        protected Address bankAddress;
                        @XmlElement(name = "AgressoExtraFields", required = true)
                        protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields agressoExtraFields;
                        @XmlAttribute(name = "Code", required = true)
                        protected int code;

                        /**
                         * 获取bankAcct属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.BankAcct }
                         *     
                         */
                        public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.BankAcct getBankAcct() {
                            return bankAcct;
                        }

                        /**
                         * 设置bankAcct属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.BankAcct }
                         *     
                         */
                        public void setBankAcct(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.BankAcct value) {
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
                         *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.Currency }
                         *     
                         */
                        public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.Currency getCurrency() {
                            return currency;
                        }

                        /**
                         * 设置currency属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.Currency }
                         *     
                         */
                        public void setCurrency(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.Currency value) {
                            this.currency = value;
                        }

                        /**
                         * 获取paymentType属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getPaymentType() {
                            return paymentType;
                        }

                        /**
                         * 设置paymentType属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setPaymentType(Object value) {
                            this.paymentType = value;
                        }

                        /**
                         * 获取bankAddress属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Address }
                         *     
                         */
                        public Address getBankAddress() {
                            return bankAddress;
                        }

                        /**
                         * 设置bankAddress属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Address }
                         *     
                         */
                        public void setBankAddress(Address value) {
                            this.bankAddress = value;
                        }

                        /**
                         * 获取agressoExtraFields属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields }
                         *     
                         */
                        public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields getAgressoExtraFields() {
                            return agressoExtraFields;
                        }

                        /**
                         * 设置agressoExtraFields属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields }
                         *     
                         */
                        public void setAgressoExtraFields(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields value) {
                            this.agressoExtraFields = value;
                        }

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
                         *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="HandOffCurrency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="HandOffRouting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="RemittanceVia" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                            protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm paymentTerm;
                            @XmlAttribute(name = "HandOffCurrency")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String handOffCurrency;
                            @XmlAttribute(name = "HandOffRouting")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String handOffRouting;
                            @XmlAttribute(name = "PaymentMethod")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String paymentMethod;
                            @XmlAttribute(name = "PaymentType")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String paymentType;
                            @XmlAttribute(name = "RemittanceVia")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String remittanceVia;

                            /**
                             * 获取paymentTerm属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm }
                             *     
                             */
                            public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm getPaymentTerm() {
                                return paymentTerm;
                            }

                            /**
                             * 设置paymentTerm属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm }
                             *     
                             */
                            public void setPaymentTerm(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm value) {
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
                             * <p>anonymous complex type的 Java 类。
                             * 
                             * <p>以下模式片段指定包含在此类中的预期内容。
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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

                                @XmlAttribute(name = "Type")
                                @XmlSchemaType(name = "anySimpleType")
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
                         *       &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *       &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                            @XmlSchemaType(name = "anySimpleType")
                            protected String bankAcctNumber;
                            @XmlAttribute(name = "BankName")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String bankName;
                            @XmlAttribute(name = "IBAN")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String iban;
                            @XmlAttribute(name = "SortCode")
                            @XmlSchemaType(name = "anySimpleType")
                            protected String sortCode;
                            @XmlAttribute(name = "SwiftCode")
                            @XmlSchemaType(name = "anySimpleType")
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
                         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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

                            @XmlAttribute(name = "Code")
                            @XmlSchemaType(name = "anySimpleType")
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
             *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "email"
            })
            public static class Emails {

                @XmlElement(name = "Email", required = true)
                protected String email;

                /**
                 * 获取email属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmail() {
                    return email;
                }

                /**
                 * 设置email属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmail(String value) {
                    this.email = value;
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
             *         &lt;element name="Name">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "name"
            })
            public static class Names {

                @XmlElement(name = "Name", required = true)
                protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names.Name name;

                /**
                 * 获取name属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names.Name }
                 *     
                 */
                public SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names.Name getName() {
                    return name;
                }

                /**
                 * 设置name属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names.Name }
                 *     
                 */
                public void setName(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Names.Name value) {
                    this.name = value;
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
                 *       &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Name {

                    @XmlAttribute(name = "FullName")
                    protected String fullName;

                    /**
                     * 获取fullName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFullName() {
                        return fullName;
                    }

                    /**
                     * 设置fullName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFullName(String value) {
                        this.fullName = value;
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
             *         &lt;element name="Phone" type="{http://www.opentravel.org/OTA/2003/05}Phone" maxOccurs="unbounded"/>
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
                "phone"
            })
            public static class Phones {

                @XmlElement(name = "Phone", required = true)
                protected List<Phone> phone;

                /**
                 * Gets the value of the phone property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the phone property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPhone().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Phone }
                 * 
                 * 
                 */
                public List<Phone> getPhone() {
                    if (phone == null) {
                        phone = new ArrayList<Phone>();
                    }
                    return this.phone;
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
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="Phones" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Phones" type="{http://www.opentravel.org/OTA/2003/05}Phone"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Emails" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="PreferredMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "phones",
                "emails"
            })
            public static class SupplierNotification {

                @XmlElement(name = "Phones")
                protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Phones phones;
                @XmlElement(name = "Emails")
                protected SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Emails emails;
                @XmlAttribute(name = "PreferredMethod")
                @XmlSchemaType(name = "anySimpleType")
                protected String preferredMethod;

                /**
                 * 获取phones属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Phones }
                 *     
                 */
                public SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Phones getPhones() {
                    return phones;
                }

                /**
                 * 设置phones属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Phones }
                 *     
                 */
                public void setPhones(SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Phones value) {
                    this.phones = value;
                }

                /**
                 * 获取emails属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Emails }
                 *     
                 */
                public SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Emails getEmails() {
                    return emails;
                }

                /**
                 * 设置emails属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Emails }
                 *     
                 */
                public void setEmails(SupplierDescriptiveContentType.BookingOffices.BookingOffice.SupplierNotification.Emails value) {
                    this.emails = value;
                }

                /**
                 * 获取preferredMethod属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferredMethod() {
                    return preferredMethod;
                }

                /**
                 * 设置preferredMethod属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferredMethod(String value) {
                    this.preferredMethod = value;
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
                 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "email"
                })
                public static class Emails {

                    @XmlElement(name = "Email", required = true)
                    protected String email;

                    /**
                     * 获取email属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEmail() {
                        return email;
                    }

                    /**
                     * 设置email属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEmail(String value) {
                        this.email = value;
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
                 *         &lt;element name="Phones" type="{http://www.opentravel.org/OTA/2003/05}Phone"/>
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
                    "phones"
                })
                public static class Phones {

                    @XmlElement(name = "Phones", required = true)
                    protected Phone phones;

                    /**
                     * 获取phones属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Phone }
                     *     
                     */
                    public Phone getPhones() {
                        return phones;
                    }

                    /**
                     * 设置phones属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Phone }
                     *     
                     */
                    public void setPhones(Phone value) {
                        this.phones = value;
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
     *         &lt;element name="Algorithm">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Parameter" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Weight" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;attribute name="WeightForNotFoundHotels" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="MinimumQuality" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="AutomaticMergeThreshold" use="required" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "algorithm"
    })
    public static class Deduplication {

        @XmlElement(name = "Algorithm", required = true)
        protected SupplierDescriptiveContentType.Deduplication.Algorithm algorithm;
        @XmlAttribute(name = "AutomaticMergeThreshold", required = true)
        protected BigDecimal automaticMergeThreshold;

        /**
         * 获取algorithm属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierDescriptiveContentType.Deduplication.Algorithm }
         *     
         */
        public SupplierDescriptiveContentType.Deduplication.Algorithm getAlgorithm() {
            return algorithm;
        }

        /**
         * 设置algorithm属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierDescriptiveContentType.Deduplication.Algorithm }
         *     
         */
        public void setAlgorithm(SupplierDescriptiveContentType.Deduplication.Algorithm value) {
            this.algorithm = value;
        }

        /**
         * 获取automaticMergeThreshold属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAutomaticMergeThreshold() {
            return automaticMergeThreshold;
        }

        /**
         * 设置automaticMergeThreshold属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAutomaticMergeThreshold(BigDecimal value) {
            this.automaticMergeThreshold = value;
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
         *         &lt;element name="Parameter" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Weight" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *       &lt;attribute name="WeightForNotFoundHotels" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="MinimumQuality" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "parameter"
        })
        public static class Algorithm {

            @XmlElement(name = "Parameter")
            protected List<SupplierDescriptiveContentType.Deduplication.Algorithm.Parameter> parameter;
            @XmlAttribute(name = "Name", required = true)
            protected String name;
            @XmlAttribute(name = "Weight", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger weight;
            @XmlAttribute(name = "WeightForNotFoundHotels", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String weightForNotFoundHotels;
            @XmlAttribute(name = "MinimumQuality", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String minimumQuality;
            @XmlAttribute(name = "Enabled", required = true)
            protected boolean enabled;

            /**
             * Gets the value of the parameter property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parameter property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParameter().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SupplierDescriptiveContentType.Deduplication.Algorithm.Parameter }
             * 
             * 
             */
            public List<SupplierDescriptiveContentType.Deduplication.Algorithm.Parameter> getParameter() {
                if (parameter == null) {
                    parameter = new ArrayList<SupplierDescriptiveContentType.Deduplication.Algorithm.Parameter>();
                }
                return this.parameter;
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
             * 获取weight属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getWeight() {
                return weight;
            }

            /**
             * 设置weight属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setWeight(BigInteger value) {
                this.weight = value;
            }

            /**
             * 获取weightForNotFoundHotels属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWeightForNotFoundHotels() {
                return weightForNotFoundHotels;
            }

            /**
             * 设置weightForNotFoundHotels属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWeightForNotFoundHotels(String value) {
                this.weightForNotFoundHotels = value;
            }

            /**
             * 获取minimumQuality属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinimumQuality() {
                return minimumQuality;
            }

            /**
             * 设置minimumQuality属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinimumQuality(String value) {
                this.minimumQuality = value;
            }

            /**
             * 获取enabled属性的值。
             * 
             */
            public boolean isEnabled() {
                return enabled;
            }

            /**
             * 设置enabled属性的值。
             * 
             */
            public void setEnabled(boolean value) {
                this.enabled = value;
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
             *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            public static class Parameter {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Name", required = true)
                protected String name;

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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MergeConfiguration" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="AutoMerge" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "mergeConfiguration"
    })
    public static class MergeConfigurations {

        @XmlElement(name = "MergeConfiguration")
        protected List<SupplierDescriptiveContentType.MergeConfigurations.MergeConfiguration> mergeConfiguration;

        /**
         * Gets the value of the mergeConfiguration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mergeConfiguration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMergeConfiguration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SupplierDescriptiveContentType.MergeConfigurations.MergeConfiguration }
         * 
         * 
         */
        public List<SupplierDescriptiveContentType.MergeConfigurations.MergeConfiguration> getMergeConfiguration() {
            if (mergeConfiguration == null) {
                mergeConfiguration = new ArrayList<SupplierDescriptiveContentType.MergeConfigurations.MergeConfiguration>();
            }
            return this.mergeConfiguration;
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
         *       &lt;attribute name="AutoMerge" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MergeConfiguration {

            @XmlAttribute(name = "AutoMerge", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String autoMerge;
            @XmlAttribute(name = "Code", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String code;

            /**
             * 获取autoMerge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAutoMerge() {
                return autoMerge;
            }

            /**
             * 设置autoMerge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAutoMerge(String value) {
                this.autoMerge = value;
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
     *         &lt;element name="Policy" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AbsoluteCutoff" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
     *                 &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *                 &lt;attribute name="OffsetUnitMultiplier" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to999" />
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
        "policy"
    })
    public static class Policies {

        @XmlElement(name = "Policy", required = true)
        protected List<SupplierDescriptiveContentType.Policies.Policy> policy;

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
         * {@link SupplierDescriptiveContentType.Policies.Policy }
         * 
         * 
         */
        public List<SupplierDescriptiveContentType.Policies.Policy> getPolicy() {
            if (policy == null) {
                policy = new ArrayList<SupplierDescriptiveContentType.Policies.Policy>();
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
         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AbsoluteCutoff" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
         *       &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
         *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to999" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Policy {

            @XmlAttribute(name = "Code", required = true)
            protected String code;
            @XmlAttribute(name = "AbsoluteCutoff")
            protected String absoluteCutoff;
            @XmlAttribute(name = "OffsetTimeUnit")
            protected String offsetTimeUnit;
            @XmlAttribute(name = "OffsetUnitMultiplier")
            protected Integer offsetUnitMultiplier;

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
             * 获取absoluteCutoff属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAbsoluteCutoff() {
                return absoluteCutoff;
            }

            /**
             * 设置absoluteCutoff属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAbsoluteCutoff(String value) {
                this.absoluteCutoff = value;
            }

            /**
             * 获取offsetTimeUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOffsetTimeUnit() {
                return offsetTimeUnit;
            }

            /**
             * 设置offsetTimeUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOffsetTimeUnit(String value) {
                this.offsetTimeUnit = value;
            }

            /**
             * 获取offsetUnitMultiplier属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getOffsetUnitMultiplier() {
                return offsetUnitMultiplier;
            }

            /**
             * 设置offsetUnitMultiplier属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setOffsetUnitMultiplier(Integer value) {
                this.offsetUnitMultiplier = value;
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
     *         &lt;element name="VoucherProductType" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "voucherProductType"
    })
    public static class VoucherProductTypes {

        @XmlElement(name = "VoucherProductType", required = true)
        protected List<SupplierDescriptiveContentType.VoucherProductTypes.VoucherProductType> voucherProductType;

        /**
         * Gets the value of the voucherProductType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voucherProductType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVoucherProductType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SupplierDescriptiveContentType.VoucherProductTypes.VoucherProductType }
         * 
         * 
         */
        public List<SupplierDescriptiveContentType.VoucherProductTypes.VoucherProductType> getVoucherProductType() {
            if (voucherProductType == null) {
                voucherProductType = new ArrayList<SupplierDescriptiveContentType.VoucherProductTypes.VoucherProductType>();
            }
            return this.voucherProductType;
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
         *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class VoucherProductType {

            @XmlAttribute(name = "Type", required = true)
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

    }

}
