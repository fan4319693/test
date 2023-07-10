//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * The VehicleAvailAdditionalInfoType complex type identifies the data that describes supplemental information made available as part of describing the availability and rate of one or more vehicles.
 * 
 * <p>VehicleAvailAdditionalInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailAdditionalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="PaymentRules" type="{http://www.opentravel.org/OTA/2003/05}PaymentRulesType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ChargeablePeriod" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailAdditionalInfoType", propOrder = {
    "pricedCoverages",
    "paymentRules",
    "tpaExtensions"
})
public class VehicleAvailAdditionalInfoType {

    @XmlElement(name = "PricedCoverages")
    protected VehicleAvailAdditionalInfoType.PricedCoverages pricedCoverages;
    @XmlElement(name = "PaymentRules")
    protected PaymentRulesType paymentRules;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ChargeablePeriod")
    protected Duration chargeablePeriod;

    /**
     * 获取pricedCoverages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailAdditionalInfoType.PricedCoverages }
     *     
     */
    public VehicleAvailAdditionalInfoType.PricedCoverages getPricedCoverages() {
        return pricedCoverages;
    }

    /**
     * 设置pricedCoverages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailAdditionalInfoType.PricedCoverages }
     *     
     */
    public void setPricedCoverages(VehicleAvailAdditionalInfoType.PricedCoverages value) {
        this.pricedCoverages = value;
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
     * 获取chargeablePeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getChargeablePeriod() {
        return chargeablePeriod;
    }

    /**
     * 设置chargeablePeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setChargeablePeriod(Duration value) {
        this.chargeablePeriod = value;
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

}
