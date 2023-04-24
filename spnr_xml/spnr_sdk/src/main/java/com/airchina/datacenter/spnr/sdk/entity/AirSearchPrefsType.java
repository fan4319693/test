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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines user preferences to be used in conducting a search.
 * 
 * <p>AirSearchPrefsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirSearchPrefsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="FlightTypePref" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightTypePrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareRestrictPref" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdvResTicketing" type="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType" minOccurs="0"/>
 *                   &lt;element name="StayRestrictions" type="{http://www.opentravel.org/OTA/2003/05}StayRestrictionsType" minOccurs="0"/>
 *                   &lt;element name="VoluntaryChanges" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareRestrictPrefGroup"/>
 *                 &lt;attribute name="FareDisplayCurrency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                 &lt;attribute name="CurrencyOverride" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EquipPref" type="{http://www.opentravel.org/OTA/2003/05}EquipmentTypePref" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="CabinPref" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CabinPrefGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketDistribPref" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TicketDistribPrefType">
 *                 &lt;attribute name="LastTicketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="FirstTicketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SmokingIndicatorGroup"/>
 *       &lt;attribute name="OnTimeRate" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *       &lt;attribute name="ETicketDesired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MaxStopsQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSearchPrefsType", propOrder = {
    "vendorPref",
    "flightTypePref",
    "fareRestrictPref",
    "equipPref",
    "cabinPref",
    "ticketDistribPref"
})
public class AirSearchPrefsType {

    @XmlElement(name = "VendorPref")
    protected List<CompanyNamePrefType> vendorPref;
    @XmlElement(name = "FlightTypePref")
    protected List<AirSearchPrefsType.FlightTypePref> flightTypePref;
    @XmlElement(name = "FareRestrictPref")
    protected List<AirSearchPrefsType.FareRestrictPref> fareRestrictPref;
    @XmlElement(name = "EquipPref")
    protected List<EquipmentTypePref> equipPref;
    @XmlElement(name = "CabinPref")
    protected List<AirSearchPrefsType.CabinPref> cabinPref;
    @XmlElement(name = "TicketDistribPref")
    protected List<AirSearchPrefsType.TicketDistribPref> ticketDistribPref;
    @XmlAttribute(name = "OnTimeRate")
    protected BigDecimal onTimeRate;
    @XmlAttribute(name = "ETicketDesired")
    protected Boolean eTicketDesired;
    @XmlAttribute(name = "MaxStopsQuantity")
    protected Integer maxStopsQuantity;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;

    /**
     * Gets the value of the vendorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNamePrefType }
     * 
     * 
     */
    public List<CompanyNamePrefType> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<CompanyNamePrefType>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the flightTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSearchPrefsType.FlightTypePref }
     * 
     * 
     */
    public List<AirSearchPrefsType.FlightTypePref> getFlightTypePref() {
        if (flightTypePref == null) {
            flightTypePref = new ArrayList<AirSearchPrefsType.FlightTypePref>();
        }
        return this.flightTypePref;
    }

    /**
     * Gets the value of the fareRestrictPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestrictPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRestrictPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSearchPrefsType.FareRestrictPref }
     * 
     * 
     */
    public List<AirSearchPrefsType.FareRestrictPref> getFareRestrictPref() {
        if (fareRestrictPref == null) {
            fareRestrictPref = new ArrayList<AirSearchPrefsType.FareRestrictPref>();
        }
        return this.fareRestrictPref;
    }

    /**
     * Gets the value of the equipPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentTypePref }
     * 
     * 
     */
    public List<EquipmentTypePref> getEquipPref() {
        if (equipPref == null) {
            equipPref = new ArrayList<EquipmentTypePref>();
        }
        return this.equipPref;
    }

    /**
     * Gets the value of the cabinPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSearchPrefsType.CabinPref }
     * 
     * 
     */
    public List<AirSearchPrefsType.CabinPref> getCabinPref() {
        if (cabinPref == null) {
            cabinPref = new ArrayList<AirSearchPrefsType.CabinPref>();
        }
        return this.cabinPref;
    }

    /**
     * Gets the value of the ticketDistribPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDistribPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDistribPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSearchPrefsType.TicketDistribPref }
     * 
     * 
     */
    public List<AirSearchPrefsType.TicketDistribPref> getTicketDistribPref() {
        if (ticketDistribPref == null) {
            ticketDistribPref = new ArrayList<AirSearchPrefsType.TicketDistribPref>();
        }
        return this.ticketDistribPref;
    }

    /**
     * 获取onTimeRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnTimeRate() {
        return onTimeRate;
    }

    /**
     * 设置onTimeRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnTimeRate(BigDecimal value) {
        this.onTimeRate = value;
    }

    /**
     * 获取eTicketDesired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isETicketDesired() {
        if (eTicketDesired == null) {
            return false;
        } else {
            return eTicketDesired;
        }
    }

    /**
     * 设置eTicketDesired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETicketDesired(Boolean value) {
        this.eTicketDesired = value;
    }

    /**
     * 获取maxStopsQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxStopsQuantity() {
        return maxStopsQuantity;
    }

    /**
     * 设置maxStopsQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxStopsQuantity(Integer value) {
        this.maxStopsQuantity = value;
    }

    /**
     * 获取smokingAllowed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
    }

    /**
     * 设置smokingAllowed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CabinPrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CabinPref {

        @XmlAttribute(name = "Cabin")
        protected CabinType cabin;
        @XmlAttribute(name = "AllowMultiCabin")
        protected Boolean allowMultiCabin;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;

        /**
         * 获取cabin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CabinType }
         *     
         */
        public CabinType getCabin() {
            return cabin;
        }

        /**
         * 设置cabin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CabinType }
         *     
         */
        public void setCabin(CabinType value) {
            this.cabin = value;
        }

        /**
         * 获取allowMultiCabin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllowMultiCabin() {
            return allowMultiCabin;
        }

        /**
         * 设置allowMultiCabin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllowMultiCabin(Boolean value) {
            this.allowMultiCabin = value;
        }

        /**
         * 获取preferLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            if (preferLevel == null) {
                return PreferLevelType.PREFERRED;
            } else {
                return preferLevel;
            }
        }

        /**
         * 设置preferLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
        }

    }


    /**
     *  Container used for specifying or limiting acceptable fare restrictions.
     * 
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AdvResTicketing" type="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType" minOccurs="0"/>
     *         &lt;element name="StayRestrictions" type="{http://www.opentravel.org/OTA/2003/05}StayRestrictionsType" minOccurs="0"/>
     *         &lt;element name="VoluntaryChanges" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareRestrictPrefGroup"/>
     *       &lt;attribute name="FareDisplayCurrency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *       &lt;attribute name="CurrencyOverride" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "advResTicketing",
        "stayRestrictions",
        "voluntaryChanges"
    })
    public static class FareRestrictPref {

        @XmlElement(name = "AdvResTicketing")
        protected AdvResTicketingType advResTicketing;
        @XmlElement(name = "StayRestrictions")
        protected StayRestrictionsType stayRestrictions;
        @XmlElement(name = "VoluntaryChanges")
        protected VoluntaryChangesType voluntaryChanges;
        @XmlAttribute(name = "FareDisplayCurrency")
        protected String fareDisplayCurrency;
        @XmlAttribute(name = "CurrencyOverride")
        protected String currencyOverride;
        @XmlAttribute(name = "FareRestriction")
        protected String fareRestriction;
        @XmlAttribute(name = "Date")
        protected String date;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;

        /**
         * 获取advResTicketing属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AdvResTicketingType }
         *     
         */
        public AdvResTicketingType getAdvResTicketing() {
            return advResTicketing;
        }

        /**
         * 设置advResTicketing属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AdvResTicketingType }
         *     
         */
        public void setAdvResTicketing(AdvResTicketingType value) {
            this.advResTicketing = value;
        }

        /**
         * 获取stayRestrictions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link StayRestrictionsType }
         *     
         */
        public StayRestrictionsType getStayRestrictions() {
            return stayRestrictions;
        }

        /**
         * 设置stayRestrictions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link StayRestrictionsType }
         *     
         */
        public void setStayRestrictions(StayRestrictionsType value) {
            this.stayRestrictions = value;
        }

        /**
         * 获取voluntaryChanges属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VoluntaryChangesType }
         *     
         */
        public VoluntaryChangesType getVoluntaryChanges() {
            return voluntaryChanges;
        }

        /**
         * 设置voluntaryChanges属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VoluntaryChangesType }
         *     
         */
        public void setVoluntaryChanges(VoluntaryChangesType value) {
            this.voluntaryChanges = value;
        }

        /**
         * 获取fareDisplayCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareDisplayCurrency() {
            return fareDisplayCurrency;
        }

        /**
         * 设置fareDisplayCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareDisplayCurrency(String value) {
            this.fareDisplayCurrency = value;
        }

        /**
         * 获取currencyOverride属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyOverride() {
            return currencyOverride;
        }

        /**
         * 设置currencyOverride属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyOverride(String value) {
            this.currencyOverride = value;
        }

        /**
         * 获取fareRestriction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareRestriction() {
            return fareRestriction;
        }

        /**
         * 设置fareRestriction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareRestriction(String value) {
            this.fareRestriction = value;
        }

        /**
         * 获取date属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * 设置date属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * 获取preferLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            if (preferLevel == null) {
                return PreferLevelType.PREFERRED;
            } else {
                return preferLevel;
            }
        }

        /**
         * 设置preferLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightTypePrefGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightTypePref {

        @XmlAttribute(name = "FlightType")
        protected FlightTypeType flightType;
        @XmlAttribute(name = "MaxConnections")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxConnections;
        @XmlAttribute(name = "NonScheduledFltInfo")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String nonScheduledFltInfo;
        @XmlAttribute(name = "BackhaulIndicator")
        protected Boolean backhaulIndicator;
        @XmlAttribute(name = "GroundTransportIndicator")
        protected Boolean groundTransportIndicator;
        @XmlAttribute(name = "DirectAndNonStopOnlyInd")
        protected Boolean directAndNonStopOnlyInd;
        @XmlAttribute(name = "NonStopsOnlyInd")
        protected Boolean nonStopsOnlyInd;
        @XmlAttribute(name = "OnlineConnectionsOnlyInd")
        protected Boolean onlineConnectionsOnlyInd;
        @XmlAttribute(name = "RoutingType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String routingType;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;

        /**
         * 获取flightType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FlightTypeType }
         *     
         */
        public FlightTypeType getFlightType() {
            return flightType;
        }

        /**
         * 设置flightType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlightTypeType }
         *     
         */
        public void setFlightType(FlightTypeType value) {
            this.flightType = value;
        }

        /**
         * 获取maxConnections属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxConnections() {
            return maxConnections;
        }

        /**
         * 设置maxConnections属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxConnections(BigInteger value) {
            this.maxConnections = value;
        }

        /**
         * 获取nonScheduledFltInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNonScheduledFltInfo() {
            return nonScheduledFltInfo;
        }

        /**
         * 设置nonScheduledFltInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNonScheduledFltInfo(String value) {
            this.nonScheduledFltInfo = value;
        }

        /**
         * 获取backhaulIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBackhaulIndicator() {
            return backhaulIndicator;
        }

        /**
         * 设置backhaulIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBackhaulIndicator(Boolean value) {
            this.backhaulIndicator = value;
        }

        /**
         * 获取groundTransportIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGroundTransportIndicator() {
            return groundTransportIndicator;
        }

        /**
         * 设置groundTransportIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGroundTransportIndicator(Boolean value) {
            this.groundTransportIndicator = value;
        }

        /**
         * 获取directAndNonStopOnlyInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDirectAndNonStopOnlyInd() {
            return directAndNonStopOnlyInd;
        }

        /**
         * 设置directAndNonStopOnlyInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDirectAndNonStopOnlyInd(Boolean value) {
            this.directAndNonStopOnlyInd = value;
        }

        /**
         * 获取nonStopsOnlyInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonStopsOnlyInd() {
            return nonStopsOnlyInd;
        }

        /**
         * 设置nonStopsOnlyInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonStopsOnlyInd(Boolean value) {
            this.nonStopsOnlyInd = value;
        }

        /**
         * 获取onlineConnectionsOnlyInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOnlineConnectionsOnlyInd() {
            return onlineConnectionsOnlyInd;
        }

        /**
         * 设置onlineConnectionsOnlyInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOnlineConnectionsOnlyInd(Boolean value) {
            this.onlineConnectionsOnlyInd = value;
        }

        /**
         * 获取routingType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoutingType() {
            return routingType;
        }

        /**
         * 设置routingType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoutingType(String value) {
            this.routingType = value;
        }

        /**
         * 获取preferLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            if (preferLevel == null) {
                return PreferLevelType.PREFERRED;
            } else {
                return preferLevel;
            }
        }

        /**
         * 设置preferLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TicketDistribPrefType">
     *       &lt;attribute name="LastTicketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="FirstTicketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TicketDistribPref
        extends TicketDistribPrefType
    {

        @XmlAttribute(name = "LastTicketDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastTicketDate;
        @XmlAttribute(name = "FirstTicketDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar firstTicketDate;

        /**
         * 获取lastTicketDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastTicketDate() {
            return lastTicketDate;
        }

        /**
         * 设置lastTicketDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastTicketDate(XMLGregorianCalendar value) {
            this.lastTicketDate = value;
        }

        /**
         * 获取firstTicketDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFirstTicketDate() {
            return firstTicketDate;
        }

        /**
         * 设置firstTicketDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFirstTicketDate(XMLGregorianCalendar value) {
            this.firstTicketDate = value;
        }

    }

}
