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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 *  =notes=
 * 				1. IMPORTANT:  This is NOT used for "included" (no charge) options.
 * 
 * <p>ServicePriceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServicePriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeType"/>
 *         &lt;element name="BasePrice" type="{http://www.opentravel.org/OTA/2003/05}ServiceBasePriceType"/>
 *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
 *         &lt;element name="ExemptedTaxes" type="{http://www.opentravel.org/OTA/2003/05}ExemptTaxType" minOccurs="0"/>
 *         &lt;element name="ReissuePrice" type="{http://www.opentravel.org/OTA/2003/05}ReissuePriceType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Redemption" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}RedemptionCurrency" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="ServicePriceCalculation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Operation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Adjustment">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}SrvcPriceAdjType" />
 *                                     &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Input" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Result" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Designator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DescriptionDetails" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Diag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RedemptionCurrency" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="ConversionRatio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Seq" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
 *       &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RedemptionOnly" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePriceType", propOrder = {
    "currencyCode",
    "basePrice",
    "taxes",
    "exemptedTaxes",
    "reissuePrice",
    "redemption",
    "redemptionCurrency",
    "servicePriceCalculation"
})
@XmlSeeAlso({
    ServicePrice.class
})
public class ServicePriceType {

    @XmlElement(name = "CurrencyCode", required = true)
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "BasePrice", required = true)
    protected ServiceBasePriceType basePrice;
    @XmlElement(name = "Taxes")
    protected TaxesType taxes;
    @XmlElement(name = "ExemptedTaxes")
    protected ExemptTaxType exemptedTaxes;
    @XmlElement(name = "ReissuePrice")
    protected ReissuePriceType reissuePrice;
    @XmlElement(name = "Redemption")
    protected RedemptionType redemption;
    @XmlElement(name = "RedemptionCurrency")
    protected RedemptionCurrencyType redemptionCurrency;
    @XmlElement(name = "ServicePriceCalculation")
    protected ServicePriceType.ServicePriceCalculation servicePriceCalculation;
    @XmlAttribute(name = "Total", required = true)
    protected BigInteger total;
    @XmlAttribute(name = "RedemptionOnly")
    protected String redemptionOnly;

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType value) {
        this.currencyCode = value;
    }

    /**
     * 获取basePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceBasePriceType }
     *     
     */
    public ServiceBasePriceType getBasePrice() {
        return basePrice;
    }

    /**
     * 设置basePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBasePriceType }
     *     
     */
    public void setBasePrice(ServiceBasePriceType value) {
        this.basePrice = value;
    }

    /**
     * 获取taxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxesType }
     *     
     */
    public TaxesType getTaxes() {
        return taxes;
    }

    /**
     * 设置taxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesType }
     *     
     */
    public void setTaxes(TaxesType value) {
        this.taxes = value;
    }

    /**
     * 获取exemptedTaxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExemptTaxType }
     *     
     */
    public ExemptTaxType getExemptedTaxes() {
        return exemptedTaxes;
    }

    /**
     * 设置exemptedTaxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptTaxType }
     *     
     */
    public void setExemptedTaxes(ExemptTaxType value) {
        this.exemptedTaxes = value;
    }

    /**
     * 获取reissuePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReissuePriceType }
     *     
     */
    public ReissuePriceType getReissuePrice() {
        return reissuePrice;
    }

    /**
     * 设置reissuePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReissuePriceType }
     *     
     */
    public void setReissuePrice(ReissuePriceType value) {
        this.reissuePrice = value;
    }

    /**
     * 获取redemption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RedemptionType }
     *     
     */
    public RedemptionType getRedemption() {
        return redemption;
    }

    /**
     * 设置redemption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionType }
     *     
     */
    public void setRedemption(RedemptionType value) {
        this.redemption = value;
    }

    /**
     * 获取redemptionCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RedemptionCurrencyType }
     *     
     */
    public RedemptionCurrencyType getRedemptionCurrency() {
        return redemptionCurrency;
    }

    /**
     * 设置redemptionCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionCurrencyType }
     *     
     */
    public void setRedemptionCurrency(RedemptionCurrencyType value) {
        this.redemptionCurrency = value;
    }

    /**
     * 获取servicePriceCalculation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServicePriceType.ServicePriceCalculation }
     *     
     */
    public ServicePriceType.ServicePriceCalculation getServicePriceCalculation() {
        return servicePriceCalculation;
    }

    /**
     * 设置servicePriceCalculation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePriceType.ServicePriceCalculation }
     *     
     */
    public void setServicePriceCalculation(ServicePriceType.ServicePriceCalculation value) {
        this.servicePriceCalculation = value;
    }

    /**
     * 获取total属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotal(BigInteger value) {
        this.total = value;
    }

    /**
     * 获取redemptionOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionOnly() {
        return redemptionOnly;
    }

    /**
     * 设置redemptionOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionOnly(String value) {
        this.redemptionOnly = value;
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
     *         &lt;element name="Operation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Adjustment">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}SrvcPriceAdjType" />
     *                           &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Input" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Result" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Designator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DescriptionDetails" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Diag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RedemptionCurrency" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="ConversionRatio" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Seq" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
        "operation"
    })
    public static class ServicePriceCalculation {

        @XmlElement(name = "Operation")
        protected List<ServicePriceType.ServicePriceCalculation.Operation> operation;

        /**
         * Gets the value of the operation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServicePriceType.ServicePriceCalculation.Operation }
         * 
         * 
         */
        public List<ServicePriceType.ServicePriceCalculation.Operation> getOperation() {
            if (operation == null) {
                operation = new ArrayList<ServicePriceType.ServicePriceCalculation.Operation>();
            }
            return this.operation;
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
         *         &lt;element name="Adjustment">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}SrvcPriceAdjType" />
         *                 &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Input" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Result" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Designator" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DescriptionDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Diag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RedemptionCurrency" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="ConversionRatio" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Seq" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "adjustment",
            "designator",
            "description",
            "descriptionDetails",
            "reason",
            "diag",
            "redemptionCurrency"
        })
        public static class Operation {

            @XmlElement(name = "Adjustment", required = true)
            protected ServicePriceType.ServicePriceCalculation.Operation.Adjustment adjustment;
            @XmlElement(name = "Designator", required = true)
            protected String designator;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "DescriptionDetails")
            protected ServicePriceType.ServicePriceCalculation.Operation.DescriptionDetails descriptionDetails;
            @XmlElement(name = "Reason")
            protected String reason;
            @XmlElement(name = "Diag")
            protected String diag;
            @XmlElement(name = "RedemptionCurrency")
            protected ServicePriceType.ServicePriceCalculation.Operation.RedemptionCurrency redemptionCurrency;
            @XmlAttribute(name = "Seq", required = true)
            protected BigInteger seq;

            /**
             * 获取adjustment属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ServicePriceType.ServicePriceCalculation.Operation.Adjustment }
             *     
             */
            public ServicePriceType.ServicePriceCalculation.Operation.Adjustment getAdjustment() {
                return adjustment;
            }

            /**
             * 设置adjustment属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ServicePriceType.ServicePriceCalculation.Operation.Adjustment }
             *     
             */
            public void setAdjustment(ServicePriceType.ServicePriceCalculation.Operation.Adjustment value) {
                this.adjustment = value;
            }

            /**
             * 获取designator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDesignator() {
                return designator;
            }

            /**
             * 设置designator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDesignator(String value) {
                this.designator = value;
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
             * 获取descriptionDetails属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ServicePriceType.ServicePriceCalculation.Operation.DescriptionDetails }
             *     
             */
            public ServicePriceType.ServicePriceCalculation.Operation.DescriptionDetails getDescriptionDetails() {
                return descriptionDetails;
            }

            /**
             * 设置descriptionDetails属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ServicePriceType.ServicePriceCalculation.Operation.DescriptionDetails }
             *     
             */
            public void setDescriptionDetails(ServicePriceType.ServicePriceCalculation.Operation.DescriptionDetails value) {
                this.descriptionDetails = value;
            }

            /**
             * 获取reason属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * 设置reason属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReason(String value) {
                this.reason = value;
            }

            /**
             * 获取diag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiag() {
                return diag;
            }

            /**
             * 设置diag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiag(String value) {
                this.diag = value;
            }

            /**
             * 获取redemptionCurrency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ServicePriceType.ServicePriceCalculation.Operation.RedemptionCurrency }
             *     
             */
            public ServicePriceType.ServicePriceCalculation.Operation.RedemptionCurrency getRedemptionCurrency() {
                return redemptionCurrency;
            }

            /**
             * 设置redemptionCurrency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ServicePriceType.ServicePriceCalculation.Operation.RedemptionCurrency }
             *     
             */
            public void setRedemptionCurrency(ServicePriceType.ServicePriceCalculation.Operation.RedemptionCurrency value) {
                this.redemptionCurrency = value;
            }

            /**
             * 获取seq属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSeq() {
                return seq;
            }

            /**
             * 设置seq属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSeq(BigInteger value) {
                this.seq = value;
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
             *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}SrvcPriceAdjType" />
             *       &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Input" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Result" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
            public static class Adjustment {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Type", required = true)
                protected String type;
                @XmlAttribute(name = "Percentage")
                protected String percentage;
                @XmlAttribute(name = "Input", required = true)
                protected BigDecimal input;
                @XmlAttribute(name = "Result", required = true)
                protected BigDecimal result;

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
                 * 获取percentage属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPercentage() {
                    return percentage;
                }

                /**
                 * 设置percentage属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPercentage(String value) {
                    this.percentage = value;
                }

                /**
                 * 获取input属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getInput() {
                    return input;
                }

                /**
                 * 设置input属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setInput(BigDecimal value) {
                    this.input = value;
                }

                /**
                 * 获取result属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getResult() {
                    return result;
                }

                /**
                 * 设置result属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setResult(BigDecimal value) {
                    this.result = value;
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
             *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
                "text"
            })
            public static class DescriptionDetails {

                @XmlElement(name = "Text", required = true)
                protected List<String> text;

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
             *       &lt;attribute name="ConversionRatio" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RedemptionCurrency {

                @XmlAttribute(name = "ConversionRatio")
                protected String conversionRatio;

                /**
                 * 获取conversionRatio属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConversionRatio() {
                    return conversionRatio;
                }

                /**
                 * 设置conversionRatio属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConversionRatio(String value) {
                    this.conversionRatio = value;
                }

            }

        }

    }

}
