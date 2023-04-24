//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Specify passenger numbers and types
 * 
 * <p>TravelerInfoSummaryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TravelerInfoSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatsRequested" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>nonNegativeInteger">
 *                 &lt;attribute name="infantsOnLaps" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AirTravelerAvail" type="{http://www.opentravel.org/OTA/2003/05}TravelerInformationType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="PriceRequestInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PriceRequestInformationType">
 *                 &lt;sequence>
 *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="20" minOccurs="0"/>
 *                   &lt;element name="DiscountPricing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightReference" maxOccurs="16" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="FlightRefNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountPricingGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SegmentOverride" maxOccurs="20" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SegmentNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                           &lt;attribute name="SegmentType" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Connection"/>
 *                                 &lt;enumeration value="Stopover"/>
 *                                 &lt;enumeration value="TurnaroundPoint"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Account" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="CodeOnlyFaresInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LocationRequirement" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="LocalEmployee"/>
 *                                 &lt;enumeration value="LocalResident"/>
 *                                 &lt;enumeration value="LocalNationalityShipReg"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="State" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
 *                           &lt;attribute name="Country" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
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
@XmlType(name = "TravelerInfoSummaryType", propOrder = {
    "seatsRequested",
    "airTravelerAvail",
    "priceRequestInformation"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.AirSearchCriteriaType.TravelerInfoSummary.class
})
public class TravelerInfoSummaryType {

    @XmlElement(name = "SeatsRequested")
    protected List<TravelerInfoSummaryType.SeatsRequested> seatsRequested;
    @XmlElement(name = "AirTravelerAvail")
    protected List<TravelerInformationType> airTravelerAvail;
    @XmlElement(name = "PriceRequestInformation")
    protected TravelerInfoSummaryType.PriceRequestInformation priceRequestInformation;

    /**
     * Gets the value of the seatsRequested property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatsRequested property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatsRequested().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInfoSummaryType.SeatsRequested }
     * 
     * 
     */
    public List<TravelerInfoSummaryType.SeatsRequested> getSeatsRequested() {
        if (seatsRequested == null) {
            seatsRequested = new ArrayList<TravelerInfoSummaryType.SeatsRequested>();
        }
        return this.seatsRequested;
    }

    /**
     * Gets the value of the airTravelerAvail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTravelerAvail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirTravelerAvail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInformationType }
     * 
     * 
     */
    public List<TravelerInformationType> getAirTravelerAvail() {
        if (airTravelerAvail == null) {
            airTravelerAvail = new ArrayList<TravelerInformationType>();
        }
        return this.airTravelerAvail;
    }

    /**
     * 获取priceRequestInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfoSummaryType.PriceRequestInformation }
     *     
     */
    public TravelerInfoSummaryType.PriceRequestInformation getPriceRequestInformation() {
        return priceRequestInformation;
    }

    /**
     * 设置priceRequestInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfoSummaryType.PriceRequestInformation }
     *     
     */
    public void setPriceRequestInformation(TravelerInfoSummaryType.PriceRequestInformation value) {
        this.priceRequestInformation = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PriceRequestInformationType">
     *       &lt;sequence>
     *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="20" minOccurs="0"/>
     *         &lt;element name="DiscountPricing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightReference" maxOccurs="16" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="FlightRefNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountPricingGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SegmentOverride" maxOccurs="20" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SegmentNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *                 &lt;attribute name="SegmentType" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Connection"/>
     *                       &lt;enumeration value="Stopover"/>
     *                       &lt;enumeration value="TurnaroundPoint"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Account" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="CodeOnlyFaresInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LocationRequirement" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="LocalEmployee"/>
     *                       &lt;enumeration value="LocalResident"/>
     *                       &lt;enumeration value="LocalNationalityShipReg"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="State" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
     *                 &lt;attribute name="Country" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
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
        "tax",
        "discountPricing",
        "segmentOverride",
        "account",
        "locationRequirement"
    })
    public static class PriceRequestInformation
        extends PriceRequestInformationType
    {

        @XmlElement(name = "Tax")
        protected List<AirTaxType> tax;
        @XmlElement(name = "DiscountPricing")
        protected TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing discountPricing;
        @XmlElement(name = "SegmentOverride")
        protected List<TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride> segmentOverride;
        @XmlElement(name = "Account")
        protected List<TravelerInfoSummaryType.PriceRequestInformation.Account> account;
        @XmlElement(name = "LocationRequirement")
        protected TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement locationRequirement;

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

        /**
         * 获取discountPricing属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing }
         *     
         */
        public TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing getDiscountPricing() {
            return discountPricing;
        }

        /**
         * 设置discountPricing属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing }
         *     
         */
        public void setDiscountPricing(TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing value) {
            this.discountPricing = value;
        }

        /**
         * Gets the value of the segmentOverride property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentOverride property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentOverride().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride }
         * 
         * 
         */
        public List<TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride> getSegmentOverride() {
            if (segmentOverride == null) {
                segmentOverride = new ArrayList<TravelerInfoSummaryType.PriceRequestInformation.SegmentOverride>();
            }
            return this.segmentOverride;
        }

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelerInfoSummaryType.PriceRequestInformation.Account }
         * 
         * 
         */
        public List<TravelerInfoSummaryType.PriceRequestInformation.Account> getAccount() {
            if (account == null) {
                account = new ArrayList<TravelerInfoSummaryType.PriceRequestInformation.Account>();
            }
            return this.account;
        }

        /**
         * 获取locationRequirement属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement }
         *     
         */
        public TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement getLocationRequirement() {
            return locationRequirement;
        }

        /**
         * 设置locationRequirement属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement }
         *     
         */
        public void setLocationRequirement(TravelerInfoSummaryType.PriceRequestInformation.LocationRequirement value) {
            this.locationRequirement = value;
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
         *       &lt;attribute name="CodeOnlyFaresInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Account {

            @XmlAttribute(name = "CodeOnlyFaresInd")
            protected Boolean codeOnlyFaresInd;
            @XmlAttribute(name = "Code", required = true)
            protected String code;

            /**
             * 获取codeOnlyFaresInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCodeOnlyFaresInd() {
                return codeOnlyFaresInd;
            }

            /**
             * 设置codeOnlyFaresInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCodeOnlyFaresInd(Boolean value) {
                this.codeOnlyFaresInd = value;
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
         *         &lt;element name="FlightReference" maxOccurs="16" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="FlightRefNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountPricingGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flightReference"
        })
        public static class DiscountPricing {

            @XmlElement(name = "FlightReference")
            protected List<TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference> flightReference;
            @XmlAttribute(name = "Purpose")
            protected String purpose;
            @XmlAttribute(name = "Type")
            protected String type;
            @XmlAttribute(name = "Usage")
            protected String usage;
            @XmlAttribute(name = "Discount")
            protected String discount;
            @XmlAttribute(name = "TicketDesignatorCode")
            protected String ticketDesignatorCode;
            @XmlAttribute(name = "Text")
            protected String text;

            /**
             * Gets the value of the flightReference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightReference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference }
             * 
             * 
             */
            public List<TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference> getFlightReference() {
                if (flightReference == null) {
                    flightReference = new ArrayList<TravelerInfoSummaryType.PriceRequestInformation.DiscountPricing.FlightReference>();
                }
                return this.flightReference;
            }

            /**
             * 获取purpose属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurpose() {
                return purpose;
            }

            /**
             * 设置purpose属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurpose(String value) {
                this.purpose = value;
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
             * 获取usage属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsage() {
                return usage;
            }

            /**
             * 设置usage属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsage(String value) {
                this.usage = value;
            }

            /**
             * 获取discount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiscount() {
                return discount;
            }

            /**
             * 设置discount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiscount(String value) {
                this.discount = value;
            }

            /**
             * 获取ticketDesignatorCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketDesignatorCode() {
                return ticketDesignatorCode;
            }

            /**
             * 设置ticketDesignatorCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketDesignatorCode(String value) {
                this.ticketDesignatorCode = value;
            }

            /**
             * 获取text属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * 设置text属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
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
             *       &lt;attribute name="FlightRefNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FlightReference {

                @XmlAttribute(name = "FlightRefNumber", required = true)
                protected String flightRefNumber;

                /**
                 * 获取flightRefNumber属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFlightRefNumber() {
                    return flightRefNumber;
                }

                /**
                 * 设置flightRefNumber属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFlightRefNumber(String value) {
                    this.flightRefNumber = value;
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
         *       &lt;attribute name="Type">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="LocalEmployee"/>
         *             &lt;enumeration value="LocalResident"/>
         *             &lt;enumeration value="LocalNationalityShipReg"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="State" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
         *       &lt;attribute name="Country" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LocationRequirement {

            @XmlAttribute(name = "Type")
            protected String type;
            @XmlAttribute(name = "State")
            protected String state;
            @XmlAttribute(name = "Country")
            protected String country;

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
             * 获取country属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountry() {
                return country;
            }

            /**
             * 设置country属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountry(String value) {
                this.country = value;
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
         *       &lt;attribute name="SegmentNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
         *       &lt;attribute name="SegmentType" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Connection"/>
         *             &lt;enumeration value="Stopover"/>
         *             &lt;enumeration value="TurnaroundPoint"/>
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
        public static class SegmentOverride {

            @XmlAttribute(name = "SegmentNumber", required = true)
            protected int segmentNumber;
            @XmlAttribute(name = "SegmentType", required = true)
            protected String segmentType;

            /**
             * 获取segmentNumber属性的值。
             * 
             */
            public int getSegmentNumber() {
                return segmentNumber;
            }

            /**
             * 设置segmentNumber属性的值。
             * 
             */
            public void setSegmentNumber(int value) {
                this.segmentNumber = value;
            }

            /**
             * 获取segmentType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegmentType() {
                return segmentType;
            }

            /**
             * 设置segmentType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegmentType(String value) {
                this.segmentType = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>nonNegativeInteger">
     *       &lt;attribute name="infantsOnLaps" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    public static class SeatsRequested {

        @XmlValue
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger value;
        @XmlAttribute(name = "infantsOnLaps")
        protected Boolean infantsOnLaps;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * 获取infantsOnLaps属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInfantsOnLaps() {
            return infantsOnLaps;
        }

        /**
         * 设置infantsOnLaps属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInfantsOnLaps(Boolean value) {
            this.infantsOnLaps = value;
        }

    }

}
