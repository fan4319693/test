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
import javax.xml.bind.annotation.XmlType;


/**
 * The Vehicle Location Liabilities Type is used to define information on the financial liabilities assumed by the renter when renting from this facility, along with optional coverage to reduce the financial liabilities. 
 * 
 * <p>VehicleLocationLiabilitiesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationLiabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coverages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Coverage" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CoverageInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
 *                             &lt;element name="CoverageFees" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CoverageFee" maxOccurs="99">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/>
 *                                                 &lt;element name="Vehicles" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Vehicle" maxOccurs="99">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
 *                                                                   &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Deductible" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                                         &lt;attribute name="LiabilityAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
 *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
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
@XmlType(name = "VehicleLocationLiabilitiesType", propOrder = {
    "coverages",
    "info",
    "tpaExtensions"
})
public class VehicleLocationLiabilitiesType {

    @XmlElement(name = "Coverages")
    protected VehicleLocationLiabilitiesType.Coverages coverages;
    @XmlElement(name = "Info")
    protected FormattedTextType info;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * 获取coverages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationLiabilitiesType.Coverages }
     *     
     */
    public VehicleLocationLiabilitiesType.Coverages getCoverages() {
        return coverages;
    }

    /**
     * 设置coverages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationLiabilitiesType.Coverages }
     *     
     */
    public void setCoverages(VehicleLocationLiabilitiesType.Coverages value) {
        this.coverages = value;
    }

    /**
     * 获取info属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextType }
     *     
     */
    public FormattedTextType getInfo() {
        return info;
    }

    /**
     * 设置info属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextType }
     *     
     */
    public void setInfo(FormattedTextType value) {
        this.info = value;
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
     *         &lt;element name="Coverage" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CoverageInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
     *                   &lt;element name="CoverageFees" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CoverageFee" maxOccurs="99">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/>
     *                                       &lt;element name="Vehicles" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Vehicle" maxOccurs="99">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
     *                                                         &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
     *                                                       &lt;/extension>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Deductible" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                                               &lt;attribute name="LiabilityAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
     *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "coverage"
    })
    public static class Coverages {

        @XmlElement(name = "Coverage")
        protected List<VehicleLocationLiabilitiesType.Coverages.Coverage> coverage;

        /**
         * Gets the value of the coverage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coverage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoverage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationLiabilitiesType.Coverages.Coverage }
         * 
         * 
         */
        public List<VehicleLocationLiabilitiesType.Coverages.Coverage> getCoverage() {
            if (coverage == null) {
                coverage = new ArrayList<VehicleLocationLiabilitiesType.Coverages.Coverage>();
            }
            return this.coverage;
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
         *         &lt;element name="CoverageInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
         *         &lt;element name="CoverageFees" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CoverageFee" maxOccurs="99">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/>
         *                             &lt;element name="Vehicles" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Vehicle" maxOccurs="99">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
         *                                               &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
         *                                             &lt;/extension>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Deductible" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                                     &lt;attribute name="LiabilityAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
         *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "coverageInfo",
            "coverageFees"
        })
        public static class Coverage {

            @XmlElement(name = "CoverageInfo")
            protected FormattedTextType coverageInfo;
            @XmlElement(name = "CoverageFees")
            protected VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees coverageFees;
            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "RequiredInd")
            protected Boolean requiredInd;

            /**
             * 获取coverageInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextType }
             *     
             */
            public FormattedTextType getCoverageInfo() {
                return coverageInfo;
            }

            /**
             * 设置coverageInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextType }
             *     
             */
            public void setCoverageInfo(FormattedTextType value) {
                this.coverageInfo = value;
            }

            /**
             * 获取coverageFees属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees }
             *     
             */
            public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees getCoverageFees() {
                return coverageFees;
            }

            /**
             * 设置coverageFees属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees }
             *     
             */
            public void setCoverageFees(VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees value) {
                this.coverageFees = value;
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
             * 获取requiredInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRequiredInd() {
                return requiredInd;
            }

            /**
             * 设置requiredInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRequiredInd(Boolean value) {
                this.requiredInd = value;
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
             *         &lt;element name="CoverageFee" maxOccurs="99">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/>
             *                   &lt;element name="Vehicles" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Vehicle" maxOccurs="99">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
             *                                     &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
             *                                   &lt;/extension>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Deductible" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *                           &lt;attribute name="LiabilityAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
                "coverageFee"
            })
            public static class CoverageFees {

                @XmlElement(name = "CoverageFee", required = true)
                protected List<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee> coverageFee;

                /**
                 * Gets the value of the coverageFee property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the coverageFee property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCoverageFee().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee }
                 * 
                 * 
                 */
                public List<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee> getCoverageFee() {
                    if (coverageFee == null) {
                        coverageFee = new ArrayList<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee>();
                    }
                    return this.coverageFee;
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
                 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/>
                 *         &lt;element name="Vehicles" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Vehicle" maxOccurs="99">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
                 *                           &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
                 *                         &lt;/extension>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Deductible" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
                 *                 &lt;attribute name="LiabilityAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
                    "charge",
                    "vehicles",
                    "deductible"
                })
                public static class CoverageFee {

                    @XmlElement(name = "Charge", required = true)
                    protected VehicleChargeType charge;
                    @XmlElement(name = "Vehicles")
                    protected VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles vehicles;
                    @XmlElement(name = "Deductible")
                    protected VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Deductible deductible;

                    /**
                     * 获取charge属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link VehicleChargeType }
                     *     
                     */
                    public VehicleChargeType getCharge() {
                        return charge;
                    }

                    /**
                     * 设置charge属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VehicleChargeType }
                     *     
                     */
                    public void setCharge(VehicleChargeType value) {
                        this.charge = value;
                    }

                    /**
                     * 获取vehicles属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles }
                     *     
                     */
                    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles getVehicles() {
                        return vehicles;
                    }

                    /**
                     * 设置vehicles属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles }
                     *     
                     */
                    public void setVehicles(VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles value) {
                        this.vehicles = value;
                    }

                    /**
                     * 获取deductible属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Deductible }
                     *     
                     */
                    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Deductible getDeductible() {
                        return deductible;
                    }

                    /**
                     * 设置deductible属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Deductible }
                     *     
                     */
                    public void setDeductible(VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Deductible value) {
                        this.deductible = value;
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
                     *       &lt;attribute name="LiabilityAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Deductible {

                        @XmlAttribute(name = "LiabilityAmount")
                        protected BigDecimal liabilityAmount;
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
                         * 获取liabilityAmount属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getLiabilityAmount() {
                            return liabilityAmount;
                        }

                        /**
                         * 设置liabilityAmount属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setLiabilityAmount(BigDecimal value) {
                            this.liabilityAmount = value;
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
                     *         &lt;element name="Vehicle" maxOccurs="99">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
                     *                 &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
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
                        "vehicle"
                    })
                    public static class Vehicles {

                        @XmlElement(name = "Vehicle", required = true)
                        protected List<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle> vehicle;

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
                         * {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle }
                         * 
                         * 
                         */
                        public List<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle> getVehicle() {
                            if (vehicle == null) {
                                vehicle = new ArrayList<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle>();
                            }
                            return this.vehicle;
                        }


                        /**
                         * <p>anonymous complex type的 Java 类。
                         * 
                         * <p>以下模式片段指定包含在此类中的预期内容。
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
                         *       &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
                         *     &lt;/extension>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Vehicle
                            extends VehicleType
                        {

                            @XmlAttribute(name = "IncludeExclude")
                            protected IncludeExcludeType includeExclude;

                            /**
                             * 获取includeExclude属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link IncludeExcludeType }
                             *     
                             */
                            public IncludeExcludeType getIncludeExclude() {
                                return includeExclude;
                            }

                            /**
                             * 设置includeExclude属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link IncludeExcludeType }
                             *     
                             */
                            public void setIncludeExclude(IncludeExcludeType value) {
                                this.includeExclude = value;
                            }

                        }

                    }

                }

            }

        }

    }

}
