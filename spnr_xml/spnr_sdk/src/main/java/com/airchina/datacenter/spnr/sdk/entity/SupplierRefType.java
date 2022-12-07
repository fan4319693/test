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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * supplier reference info rerurned from GDS
 * 
 * <p>SupplierRefType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplierRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Endorsement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Info" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                 &lt;attribute name="BankBillNo" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                 &lt;attribute name="BankID" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pricing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PrePayTotal" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                           &lt;attribute name="MOR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PriceAdjustments" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PriceAdjustment" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Agent" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                     &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="CostCentre" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Manual" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                     &lt;attribute name="UnitAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                     &lt;attribute name="AuditID" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
 *                                     &lt;attribute name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Modular" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Stage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                                     &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CancellationFees" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CancellationFee" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Agent" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                     &lt;attribute name="Percentage" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *                                     &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                     &lt;attribute name="AuditID" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
 *                                     &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="OJ_SuperPNR_RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
 *                   &lt;element name="CancellationRefunds" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CancellationRefund" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BaseFare" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Taxes" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Agent" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                     &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                     &lt;attribute name="AuditID" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
 *                                     &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="OJ_SuperPNR_RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                   &lt;element name="TotalPrice">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ComponentTotal" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *                             &lt;element name="AmendmentFees" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *                             &lt;element name="ExcludedAdjustments" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *                             &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
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
 *       &lt;/sequence>
 *       &lt;attribute name="EMDTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EMDTicketDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GeoIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SaleModel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EMDRefundNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierRefType", propOrder = {
    "endorsement",
    "pricing"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.SpecialReqDetailsType.TransportRequests.TransportRequest.SupplierRef.class
})
public class SupplierRefType {

    @XmlElement(name = "Endorsement")
    protected SupplierRefType.Endorsement endorsement;
    @XmlElement(name = "Pricing")
    protected SupplierRefType.Pricing pricing;
    @XmlAttribute(name = "EMDTicketNumber")
    protected String emdTicketNumber;
    @XmlAttribute(name = "EMDTicketDate")
    protected String emdTicketDate;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "GeoIndicator")
    protected String geoIndicator;
    @XmlAttribute(name = "SaleModel")
    protected String saleModel;
    @XmlAttribute(name = "EMDRefundNumber")
    protected String emdRefundNumber;

    /**
     * 获取endorsement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierRefType.Endorsement }
     *     
     */
    public SupplierRefType.Endorsement getEndorsement() {
        return endorsement;
    }

    /**
     * 设置endorsement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierRefType.Endorsement }
     *     
     */
    public void setEndorsement(SupplierRefType.Endorsement value) {
        this.endorsement = value;
    }

    /**
     * 获取pricing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierRefType.Pricing }
     *     
     */
    public SupplierRefType.Pricing getPricing() {
        return pricing;
    }

    /**
     * 设置pricing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierRefType.Pricing }
     *     
     */
    public void setPricing(SupplierRefType.Pricing value) {
        this.pricing = value;
    }

    /**
     * 获取emdTicketNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDTicketNumber() {
        return emdTicketNumber;
    }

    /**
     * 设置emdTicketNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMDTicketNumber(String value) {
        this.emdTicketNumber = value;
    }

    /**
     * 获取emdTicketDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDTicketDate() {
        return emdTicketDate;
    }

    /**
     * 设置emdTicketDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMDTicketDate(String value) {
        this.emdTicketDate = value;
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
     * 获取geoIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoIndicator() {
        return geoIndicator;
    }

    /**
     * 设置geoIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoIndicator(String value) {
        this.geoIndicator = value;
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
     * 获取emdRefundNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDRefundNumber() {
        return emdRefundNumber;
    }

    /**
     * 设置emdRefundNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMDRefundNumber(String value) {
        this.emdRefundNumber = value;
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
     *       &lt;attribute name="Info" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *       &lt;attribute name="BankBillNo" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *       &lt;attribute name="BankID" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
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
    public static class Endorsement {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Info", required = true)
        protected String info;
        @XmlAttribute(name = "BankBillNo", required = true)
        protected String bankBillNo;
        @XmlAttribute(name = "BankID", required = true)
        protected String bankID;

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

        /**
         * 获取bankBillNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankBillNo() {
            return bankBillNo;
        }

        /**
         * 设置bankBillNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankBillNo(String value) {
            this.bankBillNo = value;
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
     *         &lt;element name="PrePayTotal" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                 &lt;attribute name="MOR" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PriceAdjustments" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PriceAdjustment" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Agent" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                           &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="CostCentre" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Manual" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                           &lt;attribute name="UnitAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                           &lt;attribute name="AuditID" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
     *                           &lt;attribute name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Modular" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Stage" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *                           &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CancellationFees" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CancellationFee" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Agent" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                           &lt;attribute name="Percentage" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *                           &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                           &lt;attribute name="AuditID" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
     *                           &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="OJ_SuperPNR_RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
     *         &lt;element name="CancellationRefunds" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CancellationRefund" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BaseFare" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *                             &lt;element name="Agent" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                           &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                           &lt;attribute name="AuditID" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
     *                           &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="OJ_SuperPNR_RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *         &lt;element name="TotalPrice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ComponentTotal" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
     *                   &lt;element name="AmendmentFees" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
     *                   &lt;element name="ExcludedAdjustments" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
     *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
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
        "prePayTotal",
        "priceAdjustments",
        "cancellationFees",
        "cancellationRefunds",
        "totalPrice"
    })
    public static class Pricing {

        @XmlElement(name = "PrePayTotal")
        protected SupplierRefType.Pricing.PrePayTotal prePayTotal;
        @XmlElement(name = "PriceAdjustments")
        protected SupplierRefType.Pricing.PriceAdjustments priceAdjustments;
        @XmlElement(name = "CancellationFees")
        protected SupplierRefType.Pricing.CancellationFees cancellationFees;
        @XmlElement(name = "CancellationRefunds")
        protected SupplierRefType.Pricing.CancellationRefunds cancellationRefunds;
        @XmlElement(name = "TotalPrice", required = true)
        protected SupplierRefType.Pricing.TotalPrice totalPrice;

        /**
         * 获取prePayTotal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierRefType.Pricing.PrePayTotal }
         *     
         */
        public SupplierRefType.Pricing.PrePayTotal getPrePayTotal() {
            return prePayTotal;
        }

        /**
         * 设置prePayTotal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierRefType.Pricing.PrePayTotal }
         *     
         */
        public void setPrePayTotal(SupplierRefType.Pricing.PrePayTotal value) {
            this.prePayTotal = value;
        }

        /**
         * 获取priceAdjustments属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierRefType.Pricing.PriceAdjustments }
         *     
         */
        public SupplierRefType.Pricing.PriceAdjustments getPriceAdjustments() {
            return priceAdjustments;
        }

        /**
         * 设置priceAdjustments属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierRefType.Pricing.PriceAdjustments }
         *     
         */
        public void setPriceAdjustments(SupplierRefType.Pricing.PriceAdjustments value) {
            this.priceAdjustments = value;
        }

        /**
         * 获取cancellationFees属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierRefType.Pricing.CancellationFees }
         *     
         */
        public SupplierRefType.Pricing.CancellationFees getCancellationFees() {
            return cancellationFees;
        }

        /**
         * 设置cancellationFees属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierRefType.Pricing.CancellationFees }
         *     
         */
        public void setCancellationFees(SupplierRefType.Pricing.CancellationFees value) {
            this.cancellationFees = value;
        }

        /**
         * 获取cancellationRefunds属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierRefType.Pricing.CancellationRefunds }
         *     
         */
        public SupplierRefType.Pricing.CancellationRefunds getCancellationRefunds() {
            return cancellationRefunds;
        }

        /**
         * 设置cancellationRefunds属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierRefType.Pricing.CancellationRefunds }
         *     
         */
        public void setCancellationRefunds(SupplierRefType.Pricing.CancellationRefunds value) {
            this.cancellationRefunds = value;
        }

        /**
         * 获取totalPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierRefType.Pricing.TotalPrice }
         *     
         */
        public SupplierRefType.Pricing.TotalPrice getTotalPrice() {
            return totalPrice;
        }

        /**
         * 设置totalPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierRefType.Pricing.TotalPrice }
         *     
         */
        public void setTotalPrice(SupplierRefType.Pricing.TotalPrice value) {
            this.totalPrice = value;
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
         *         &lt;element name="CancellationFee" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Agent" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                 &lt;attribute name="Percentage" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
         *                 &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                 &lt;attribute name="AuditID" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
         *                 &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="OJ_SuperPNR_RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
            "cancellationFee"
        })
        public static class CancellationFees {

            @XmlElement(name = "CancellationFee")
            protected List<SupplierRefType.Pricing.CancellationFees.CancellationFee> cancellationFee;
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
             * Gets the value of the cancellationFee property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cancellationFee property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCancellationFee().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SupplierRefType.Pricing.CancellationFees.CancellationFee }
             * 
             * 
             */
            public List<SupplierRefType.Pricing.CancellationFees.CancellationFee> getCancellationFee() {
                if (cancellationFee == null) {
                    cancellationFee = new ArrayList<SupplierRefType.Pricing.CancellationFees.CancellationFee>();
                }
                return this.cancellationFee;
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
             *         &lt;element name="Agent" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *       &lt;attribute name="Percentage" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
             *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *       &lt;attribute name="AuditID" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
             *       &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="OJ_SuperPNR_RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "agent"
            })
            public static class CancellationFee {

                @XmlElement(name = "Agent")
                protected SupplierRefType.Pricing.CancellationFees.CancellationFee.Agent agent;
                @XmlAttribute(name = "Percentage")
                protected BigDecimal percentage;
                @XmlAttribute(name = "Date", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar date;
                @XmlAttribute(name = "AuditID")
                protected String auditID;
                @XmlAttribute(name = "FlightSegmentRPH")
                protected String flightSegmentRPH;
                @XmlAttribute(name = "OJ_SuperPNR_RPH")
                protected String ojSuperPNRRPH;
                @XmlAttribute(name = "ProductNumber")
                protected BigInteger productNumber;
                @XmlAttribute(name = "MasterProductNumber")
                protected BigInteger masterProductNumber;
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
                 * 获取agent属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SupplierRefType.Pricing.CancellationFees.CancellationFee.Agent }
                 *     
                 */
                public SupplierRefType.Pricing.CancellationFees.CancellationFee.Agent getAgent() {
                    return agent;
                }

                /**
                 * 设置agent属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SupplierRefType.Pricing.CancellationFees.CancellationFee.Agent }
                 *     
                 */
                public void setAgent(SupplierRefType.Pricing.CancellationFees.CancellationFee.Agent value) {
                    this.agent = value;
                }

                /**
                 * 获取percentage属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPercentage() {
                    return percentage;
                }

                /**
                 * 设置percentage属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPercentage(BigDecimal value) {
                    this.percentage = value;
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
                 * 获取auditID属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuditID() {
                    return auditID;
                }

                /**
                 * 设置auditID属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuditID(String value) {
                    this.auditID = value;
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
                 * 获取ojSuperPNRRPH属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOJSuperPNRRPH() {
                    return ojSuperPNRRPH;
                }

                /**
                 * 设置ojSuperPNRRPH属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOJSuperPNRRPH(String value) {
                    this.ojSuperPNRRPH = value;
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


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Agent {

                    @XmlAttribute(name = "Agent")
                    protected String agent;
                    @XmlAttribute(name = "Agency")
                    protected String agency;
                    @XmlAttribute(name = "IATANumber")
                    protected String iataNumber;
                    @XmlAttribute(name = "PseudoCityCode")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String pseudoCityCode;
                    @XmlAttribute(name = "CountryCode")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String countryCode;
                    @XmlAttribute(name = "AgentInitials")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String agentInitials;
                    @XmlAttribute(name = "SourceAddress")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String sourceAddress;
                    @XmlAttribute(name = "Timestamp")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String timestamp;

                    /**
                     * 获取agent属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgent() {
                        return agent;
                    }

                    /**
                     * 设置agent属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgent(String value) {
                        this.agent = value;
                    }

                    /**
                     * 获取agency属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgency() {
                        return agency;
                    }

                    /**
                     * 设置agency属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgency(String value) {
                        this.agency = value;
                    }

                    /**
                     * 获取iataNumber属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIATANumber() {
                        return iataNumber;
                    }

                    /**
                     * 设置iataNumber属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIATANumber(String value) {
                        this.iataNumber = value;
                    }

                    /**
                     * 获取pseudoCityCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPseudoCityCode() {
                        return pseudoCityCode;
                    }

                    /**
                     * 设置pseudoCityCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPseudoCityCode(String value) {
                        this.pseudoCityCode = value;
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
                     * 获取agentInitials属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgentInitials() {
                        return agentInitials;
                    }

                    /**
                     * 设置agentInitials属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgentInitials(String value) {
                        this.agentInitials = value;
                    }

                    /**
                     * 获取sourceAddress属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSourceAddress() {
                        return sourceAddress;
                    }

                    /**
                     * 设置sourceAddress属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSourceAddress(String value) {
                        this.sourceAddress = value;
                    }

                    /**
                     * 获取timestamp属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTimestamp() {
                        return timestamp;
                    }

                    /**
                     * 设置timestamp属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTimestamp(String value) {
                        this.timestamp = value;
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
         *         &lt;element name="CancellationRefund" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BaseFare" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
         *                   &lt;element name="Agent" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                 &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                 &lt;attribute name="AuditID" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
         *                 &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="OJ_SuperPNR_RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "cancellationRefund"
        })
        public static class CancellationRefunds {

            @XmlElement(name = "CancellationRefund")
            protected List<SupplierRefType.Pricing.CancellationRefunds.CancellationRefund> cancellationRefund;
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
             * Gets the value of the cancellationRefund property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cancellationRefund property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCancellationRefund().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SupplierRefType.Pricing.CancellationRefunds.CancellationRefund }
             * 
             * 
             */
            public List<SupplierRefType.Pricing.CancellationRefunds.CancellationRefund> getCancellationRefund() {
                if (cancellationRefund == null) {
                    cancellationRefund = new ArrayList<SupplierRefType.Pricing.CancellationRefunds.CancellationRefund>();
                }
                return this.cancellationRefund;
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
             *         &lt;element name="BaseFare" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
             *         &lt;element name="Agent" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *       &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *       &lt;attribute name="AuditID" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
             *       &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="OJ_SuperPNR_RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "baseFare",
                "taxes",
                "agent"
            })
            public static class CancellationRefund {

                @XmlElement(name = "BaseFare")
                protected SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.BaseFare baseFare;
                @XmlElement(name = "Taxes")
                protected SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Taxes taxes;
                @XmlElement(name = "Agent")
                protected SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Agent agent;
                @XmlAttribute(name = "ProductNumber")
                protected BigInteger productNumber;
                @XmlAttribute(name = "MasterProductNumber")
                protected BigInteger masterProductNumber;
                @XmlAttribute(name = "Date")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar date;
                @XmlAttribute(name = "AuditID")
                protected String auditID;
                @XmlAttribute(name = "FlightSegmentRPH")
                protected String flightSegmentRPH;
                @XmlAttribute(name = "OJ_SuperPNR_RPH")
                protected String ojSuperPNRRPH;
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
                 * 获取baseFare属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.BaseFare }
                 *     
                 */
                public SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.BaseFare getBaseFare() {
                    return baseFare;
                }

                /**
                 * 设置baseFare属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.BaseFare }
                 *     
                 */
                public void setBaseFare(SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.BaseFare value) {
                    this.baseFare = value;
                }

                /**
                 * 获取taxes属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Taxes }
                 *     
                 */
                public SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Taxes getTaxes() {
                    return taxes;
                }

                /**
                 * 设置taxes属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Taxes }
                 *     
                 */
                public void setTaxes(SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Taxes value) {
                    this.taxes = value;
                }

                /**
                 * 获取agent属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Agent }
                 *     
                 */
                public SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Agent getAgent() {
                    return agent;
                }

                /**
                 * 设置agent属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Agent }
                 *     
                 */
                public void setAgent(SupplierRefType.Pricing.CancellationRefunds.CancellationRefund.Agent value) {
                    this.agent = value;
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
                 * 获取auditID属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuditID() {
                    return auditID;
                }

                /**
                 * 设置auditID属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuditID(String value) {
                    this.auditID = value;
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
                 * 获取ojSuperPNRRPH属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOJSuperPNRRPH() {
                    return ojSuperPNRRPH;
                }

                /**
                 * 设置ojSuperPNRRPH属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOJSuperPNRRPH(String value) {
                    this.ojSuperPNRRPH = value;
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


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Agent {

                    @XmlAttribute(name = "Agent")
                    protected String agent;
                    @XmlAttribute(name = "Agency")
                    protected String agency;
                    @XmlAttribute(name = "IATANumber")
                    protected String iataNumber;
                    @XmlAttribute(name = "PseudoCityCode")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String pseudoCityCode;
                    @XmlAttribute(name = "CountryCode")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String countryCode;
                    @XmlAttribute(name = "AgentInitials")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String agentInitials;
                    @XmlAttribute(name = "SourceAddress")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String sourceAddress;
                    @XmlAttribute(name = "Timestamp")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String timestamp;

                    /**
                     * 获取agent属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgent() {
                        return agent;
                    }

                    /**
                     * 设置agent属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgent(String value) {
                        this.agent = value;
                    }

                    /**
                     * 获取agency属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgency() {
                        return agency;
                    }

                    /**
                     * 设置agency属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgency(String value) {
                        this.agency = value;
                    }

                    /**
                     * 获取iataNumber属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIATANumber() {
                        return iataNumber;
                    }

                    /**
                     * 设置iataNumber属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIATANumber(String value) {
                        this.iataNumber = value;
                    }

                    /**
                     * 获取pseudoCityCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPseudoCityCode() {
                        return pseudoCityCode;
                    }

                    /**
                     * 设置pseudoCityCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPseudoCityCode(String value) {
                        this.pseudoCityCode = value;
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
                     * 获取agentInitials属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgentInitials() {
                        return agentInitials;
                    }

                    /**
                     * 设置agentInitials属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgentInitials(String value) {
                        this.agentInitials = value;
                    }

                    /**
                     * 获取sourceAddress属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSourceAddress() {
                        return sourceAddress;
                    }

                    /**
                     * 设置sourceAddress属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSourceAddress(String value) {
                        this.sourceAddress = value;
                    }

                    /**
                     * 获取timestamp属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTimestamp() {
                        return timestamp;
                    }

                    /**
                     * 设置timestamp属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTimestamp(String value) {
                        this.timestamp = value;
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
                public static class BaseFare {

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
         *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *       &lt;attribute name="MOR" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "loyalty"
        })
        public static class PrePayTotal {

            @XmlElement(name = "Loyalty")
            protected LoyaltyPricingType loyalty;
            @XmlAttribute(name = "MOR")
            protected String mor;
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
             * 获取mor属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOR() {
                return mor;
            }

            /**
             * 设置mor属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOR(String value) {
                this.mor = value;
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
         *         &lt;element name="PriceAdjustment" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Agent" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="CostCentre" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Manual" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                 &lt;attribute name="UnitAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                 &lt;attribute name="AuditID" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
         *                 &lt;attribute name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Modular" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Stage" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *                 &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
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
            "priceAdjustment",
            "loyalty"
        })
        public static class PriceAdjustments {

            @XmlElement(name = "PriceAdjustment")
            protected List<SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment> priceAdjustment;
            @XmlElement(name = "Loyalty")
            protected LoyaltyPricingType loyalty;
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
             * {@link SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment }
             * 
             * 
             */
            public List<SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment> getPriceAdjustment() {
                if (priceAdjustment == null) {
                    priceAdjustment = new ArrayList<SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment>();
                }
                return this.priceAdjustment;
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
             *         &lt;element name="Agent" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="CostCentre" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Manual" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *       &lt;attribute name="UnitAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
             *       &lt;attribute name="AuditID" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to8" />
             *       &lt;attribute name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Modular" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Stage" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
             *       &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "agent",
                "loyalty"
            })
            public static class PriceAdjustment {

                @XmlElement(name = "Agent")
                protected SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment.Agent agent;
                @XmlElement(name = "Loyalty")
                protected LoyaltyPricingType loyalty;
                @XmlAttribute(name = "Description")
                protected String description;
                @XmlAttribute(name = "Code", required = true)
                protected String code;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;
                @XmlAttribute(name = "CostCentre")
                protected String costCentre;
                @XmlAttribute(name = "Manual", required = true)
                protected boolean manual;
                @XmlAttribute(name = "Date", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar date;
                @XmlAttribute(name = "UnitAmount")
                protected Float unitAmount;
                @XmlAttribute(name = "AuditID")
                protected String auditID;
                @XmlAttribute(name = "PaymentID")
                protected BigInteger paymentID;
                @XmlAttribute(name = "ProductType")
                protected String productType;
                @XmlAttribute(name = "Modular")
                protected String modular;
                @XmlAttribute(name = "Stage")
                protected String stage;
                @XmlAttribute(name = "PassengerTypeCode")
                protected String passengerTypeCode;
                @XmlAttribute(name = "FlightSegmentRPH")
                protected String flightSegmentRPH;
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
                 * 获取agent属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment.Agent }
                 *     
                 */
                public SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment.Agent getAgent() {
                    return agent;
                }

                /**
                 * 设置agent属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment.Agent }
                 *     
                 */
                public void setAgent(SupplierRefType.Pricing.PriceAdjustments.PriceAdjustment.Agent value) {
                    this.agent = value;
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
                 * 获取costCentre属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCostCentre() {
                    return costCentre;
                }

                /**
                 * 设置costCentre属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCostCentre(String value) {
                    this.costCentre = value;
                }

                /**
                 * 获取manual属性的值。
                 * 
                 */
                public boolean isManual() {
                    return manual;
                }

                /**
                 * 设置manual属性的值。
                 * 
                 */
                public void setManual(boolean value) {
                    this.manual = value;
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
                 * 获取unitAmount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *     
                 */
                public Float getUnitAmount() {
                    return unitAmount;
                }

                /**
                 * 设置unitAmount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *     
                 */
                public void setUnitAmount(Float value) {
                    this.unitAmount = value;
                }

                /**
                 * 获取auditID属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuditID() {
                    return auditID;
                }

                /**
                 * 设置auditID属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuditID(String value) {
                    this.auditID = value;
                }

                /**
                 * 获取paymentID属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPaymentID() {
                    return paymentID;
                }

                /**
                 * 设置paymentID属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPaymentID(BigInteger value) {
                    this.paymentID = value;
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
                 * 获取modular属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getModular() {
                    return modular;
                }

                /**
                 * 设置modular属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setModular(String value) {
                    this.modular = value;
                }

                /**
                 * 获取stage属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStage() {
                    return stage;
                }

                /**
                 * 设置stage属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStage(String value) {
                    this.stage = value;
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


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Agency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="AgentInitials" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Agent {

                    @XmlAttribute(name = "Agent")
                    protected String agent;
                    @XmlAttribute(name = "Agency")
                    protected String agency;
                    @XmlAttribute(name = "IATANumber")
                    protected String iataNumber;
                    @XmlAttribute(name = "PseudoCityCode")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String pseudoCityCode;
                    @XmlAttribute(name = "CountryCode")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String countryCode;
                    @XmlAttribute(name = "AgentInitials")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String agentInitials;
                    @XmlAttribute(name = "SourceAddress")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String sourceAddress;
                    @XmlAttribute(name = "Timestamp")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String timestamp;

                    /**
                     * 获取agent属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgent() {
                        return agent;
                    }

                    /**
                     * 设置agent属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgent(String value) {
                        this.agent = value;
                    }

                    /**
                     * 获取agency属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgency() {
                        return agency;
                    }

                    /**
                     * 设置agency属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgency(String value) {
                        this.agency = value;
                    }

                    /**
                     * 获取iataNumber属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIATANumber() {
                        return iataNumber;
                    }

                    /**
                     * 设置iataNumber属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIATANumber(String value) {
                        this.iataNumber = value;
                    }

                    /**
                     * 获取pseudoCityCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPseudoCityCode() {
                        return pseudoCityCode;
                    }

                    /**
                     * 设置pseudoCityCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPseudoCityCode(String value) {
                        this.pseudoCityCode = value;
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
                     * 获取agentInitials属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgentInitials() {
                        return agentInitials;
                    }

                    /**
                     * 设置agentInitials属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgentInitials(String value) {
                        this.agentInitials = value;
                    }

                    /**
                     * 获取sourceAddress属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSourceAddress() {
                        return sourceAddress;
                    }

                    /**
                     * 设置sourceAddress属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSourceAddress(String value) {
                        this.sourceAddress = value;
                    }

                    /**
                     * 获取timestamp属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTimestamp() {
                        return timestamp;
                    }

                    /**
                     * 设置timestamp属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTimestamp(String value) {
                        this.timestamp = value;
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
         *         &lt;element name="ComponentTotal" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
         *         &lt;element name="AmendmentFees" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
         *         &lt;element name="ExcludedAdjustments" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
         *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
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
            "componentTotal",
            "amendmentFees",
            "excludedAdjustments",
            "loyalty"
        })
        public static class TotalPrice {

            @XmlElement(name = "ComponentTotal")
            protected CurrencyAmountType componentTotal;
            @XmlElement(name = "AmendmentFees")
            protected CurrencyAmountType amendmentFees;
            @XmlElement(name = "ExcludedAdjustments")
            protected CurrencyAmountType excludedAdjustments;
            @XmlElement(name = "Loyalty")
            protected LoyaltyPricingType loyalty;
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
             * 获取componentTotal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountType }
             *     
             */
            public CurrencyAmountType getComponentTotal() {
                return componentTotal;
            }

            /**
             * 设置componentTotal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountType }
             *     
             */
            public void setComponentTotal(CurrencyAmountType value) {
                this.componentTotal = value;
            }

            /**
             * 获取amendmentFees属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountType }
             *     
             */
            public CurrencyAmountType getAmendmentFees() {
                return amendmentFees;
            }

            /**
             * 设置amendmentFees属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountType }
             *     
             */
            public void setAmendmentFees(CurrencyAmountType value) {
                this.amendmentFees = value;
            }

            /**
             * 获取excludedAdjustments属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountType }
             *     
             */
            public CurrencyAmountType getExcludedAdjustments() {
                return excludedAdjustments;
            }

            /**
             * 设置excludedAdjustments属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountType }
             *     
             */
            public void setExcludedAdjustments(CurrencyAmountType value) {
                this.excludedAdjustments = value;
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
