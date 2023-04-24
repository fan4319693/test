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
 * The VehicleAvailVendorInfoType complex type identifies the data that describes supplemental information relevant to a vendor and made available at the time that availability and rates are checked.
 * 
 * <p>VehicleAvailVendorInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailVendorInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}VendorMessagesType" minOccurs="0"/>
 *         &lt;element name="OffLocServices" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServicePricedType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="PaymentRules" type="{http://www.opentravel.org/OTA/2003/05}PaymentRulesType" minOccurs="0"/>
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
@XmlType(name = "VehicleAvailVendorInfoType", propOrder = {
    "vendorMessages",
    "offLocServices",
    "paymentRules",
    "locationDetails",
    "tourInfo",
    "tpaExtensions"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.VehicleVendorAvailabilityType.VehAvails.VehAvail.Info.class
})
public class VehicleAvailVendorInfoType {

    @XmlElement(name = "VendorMessages")
    protected VendorMessagesType vendorMessages;
    @XmlElement(name = "OffLocServices")
    protected List<OffLocationServicePricedType> offLocServices;
    @XmlElement(name = "PaymentRules")
    protected PaymentRulesType paymentRules;
    @XmlElement(name = "LocationDetails")
    protected List<VehicleLocationDetailsType> locationDetails;
    @XmlElement(name = "TourInfo")
    protected VehicleTourInfoType tourInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * 获取vendorMessages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VendorMessagesType }
     *     
     */
    public VendorMessagesType getVendorMessages() {
        return vendorMessages;
    }

    /**
     * 设置vendorMessages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VendorMessagesType }
     *     
     */
    public void setVendorMessages(VendorMessagesType value) {
        this.vendorMessages = value;
    }

    /**
     * Gets the value of the offLocServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offLocServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffLocServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffLocationServicePricedType }
     * 
     * 
     */
    public List<OffLocationServicePricedType> getOffLocServices() {
        if (offLocServices == null) {
            offLocServices = new ArrayList<OffLocationServicePricedType>();
        }
        return this.offLocServices;
    }

    /**
     * 获取paymentRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentRulesType }
     *     
     */
    public PaymentRulesType getPaymentRules() {
        return paymentRules;
    }

    /**
     * 设置paymentRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRulesType }
     *     
     */
    public void setPaymentRules(PaymentRulesType value) {
        this.paymentRules = value;
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

}
