//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The VehicleSegmentAdditionalInfoType complex type identifies the data that descibes the supplemental information assocated with a vehicle segment.  Such information may be associated with the reservation of a vehicle, but is not normally included.
 * 
 * <p>VehicleSegmentAdditionalInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleSegmentAdditionalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentRule" type="{http://www.opentravel.org/OTA/2003/05}MonetaryRuleType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RentalPaymentAmount" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="PricedCoverages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PricedCoverage" type="{http://www.opentravel.org/OTA/2003/05}CoveragePricedType" maxOccurs="15"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PricedOffLocService" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServicePricedType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="VendorMessages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VendorMessage" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LocationDetails" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationDetailsType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="TourInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleTourInfoType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSegmentAdditionalInfoType", propOrder = {
    "paymentRules",
    "rentalPaymentAmount",
    "pricedCoverages",
    "pricedOffLocService",
    "vendorMessages",
    "locationDetails",
    "tourInfo",
    "tpaExtensions"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.VehicleReservationType.VehSegmentInfo.class
})
public class VehicleSegmentAdditionalInfoType {

    @XmlElement(name = "PaymentRules")
    protected VehicleSegmentAdditionalInfoType.PaymentRules paymentRules;
    @XmlElement(name = "RentalPaymentAmount")
    protected List<PaymentDetailType> rentalPaymentAmount;
    @XmlElement(name = "PricedCoverages")
    protected VehicleSegmentAdditionalInfoType.PricedCoverages pricedCoverages;
    @XmlElement(name = "PricedOffLocService")
    protected List<OffLocationServicePricedType> pricedOffLocService;
    @XmlElement(name = "VendorMessages")
    protected VehicleSegmentAdditionalInfoType.VendorMessages vendorMessages;
    @XmlElement(name = "LocationDetails")
    protected List<VehicleLocationDetailsType> locationDetails;
    @XmlElement(name = "TourInfo")
    protected VehicleTourInfoType tourInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * 获取paymentRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleSegmentAdditionalInfoType.PaymentRules }
     *     
     */
    public VehicleSegmentAdditionalInfoType.PaymentRules getPaymentRules() {
        return paymentRules;
    }

    /**
     * 设置paymentRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSegmentAdditionalInfoType.PaymentRules }
     *     
     */
    public void setPaymentRules(VehicleSegmentAdditionalInfoType.PaymentRules value) {
        this.paymentRules = value;
    }

    /**
     * Gets the value of the rentalPaymentAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentalPaymentAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentalPaymentAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailType }
     * 
     * 
     */
    public List<PaymentDetailType> getRentalPaymentAmount() {
        if (rentalPaymentAmount == null) {
            rentalPaymentAmount = new ArrayList<PaymentDetailType>();
        }
        return this.rentalPaymentAmount;
    }

    /**
     * 获取pricedCoverages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleSegmentAdditionalInfoType.PricedCoverages }
     *     
     */
    public VehicleSegmentAdditionalInfoType.PricedCoverages getPricedCoverages() {
        return pricedCoverages;
    }

    /**
     * 设置pricedCoverages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSegmentAdditionalInfoType.PricedCoverages }
     *     
     */
    public void setPricedCoverages(VehicleSegmentAdditionalInfoType.PricedCoverages value) {
        this.pricedCoverages = value;
    }

    /**
     * Gets the value of the pricedOffLocService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedOffLocService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedOffLocService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffLocationServicePricedType }
     * 
     * 
     */
    public List<OffLocationServicePricedType> getPricedOffLocService() {
        if (pricedOffLocService == null) {
            pricedOffLocService = new ArrayList<OffLocationServicePricedType>();
        }
        return this.pricedOffLocService;
    }

    /**
     * 获取vendorMessages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleSegmentAdditionalInfoType.VendorMessages }
     *     
     */
    public VehicleSegmentAdditionalInfoType.VendorMessages getVendorMessages() {
        return vendorMessages;
    }

    /**
     * 设置vendorMessages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSegmentAdditionalInfoType.VendorMessages }
     *     
     */
    public void setVendorMessages(VehicleSegmentAdditionalInfoType.VendorMessages value) {
        this.vendorMessages = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleLocationDetailsType }
     * 
     * 
     */
    public List<VehicleLocationDetailsType> getLocationDetails() {
        if (locationDetails == null) {
            locationDetails = new ArrayList<VehicleLocationDetailsType>();
        }
        return this.locationDetails;
    }

    /**
     * 获取tourInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleTourInfoType }
     *     
     */
    public VehicleTourInfoType getTourInfo() {
        return tourInfo;
    }

    /**
     * 设置tourInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTourInfoType }
     *     
     */
    public void setTourInfo(VehicleTourInfoType value) {
        this.tourInfo = value;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }


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
     *         &lt;element name="PaymentRule" type="{http://www.opentravel.org/OTA/2003/05}MonetaryRuleType" maxOccurs="9"/>
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
        "paymentRule"
    })
    public static class PaymentRules {

        @XmlElement(name = "PaymentRule", required = true)
        protected List<MonetaryRuleType> paymentRule;

        /**
         * Gets the value of the paymentRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonetaryRuleType }
         * 
         * 
         */
        public List<MonetaryRuleType> getPaymentRule() {
            if (paymentRule == null) {
                paymentRule = new ArrayList<MonetaryRuleType>();
            }
            return this.paymentRule;
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
     *         &lt;element name="PricedCoverage" type="{http://www.opentravel.org/OTA/2003/05}CoveragePricedType" maxOccurs="15"/>
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
        "pricedCoverage"
    })
    public static class PricedCoverages {

        @XmlElement(name = "PricedCoverage", required = true)
        protected List<CoveragePricedType> pricedCoverage;

        /**
         * Gets the value of the pricedCoverage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pricedCoverage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPricedCoverage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CoveragePricedType }
         * 
         * 
         */
        public List<CoveragePricedType> getPricedCoverage() {
            if (pricedCoverage == null) {
                pricedCoverage = new ArrayList<CoveragePricedType>();
            }
            return this.pricedCoverage;
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
     *         &lt;element name="VendorMessage" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" maxOccurs="99"/>
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
        "vendorMessage"
    })
    public static class VendorMessages {

        @XmlElement(name = "VendorMessage", required = true)
        protected List<FormattedTextType> vendorMessage;

        /**
         * Gets the value of the vendorMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FormattedTextType }
         * 
         * 
         */
        public List<FormattedTextType> getVendorMessage() {
            if (vendorMessage == null) {
                vendorMessage = new ArrayList<FormattedTextType>();
            }
            return this.vendorMessage;
        }

    }

}
