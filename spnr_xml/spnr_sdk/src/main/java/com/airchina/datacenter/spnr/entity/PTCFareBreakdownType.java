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
import javax.xml.bind.annotation.XmlValue;


/**
 * Per passenger type code pricing for this itinerary. Set if fareBreakdown was requested.
 * 
 * <p>PTCFareBreakdownType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PTCFareBreakdownType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerTypeQuantity" type="{http://www.opentravel.org/OTA/2003/05}PassengerTypeQuantityType"/>
 *         &lt;element name="PricingSeqs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PricingSeq" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_SuperPNR_RPH"/>
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TravelerRefNumber" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareBasisCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareBasisCode" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to16">
 *                           &lt;attribute name="SegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerFare" type="{http://www.opentravel.org/OTA/2003/05}FareType"/>
 *         &lt;element name="TravelerRefNumber" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerRefNumberGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketDesignators" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TicketDesignator" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="FlightRefRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="TicketDesignatorExtension" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Endorsements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Endorsement" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonEndorsableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareInfo" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="PassengerFare" type="{http://www.opentravel.org/OTA/2003/05}FareType"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://www.opentravel.org/OTA/2003/05}PricingSourceType" />
 *       &lt;attribute name="FlightRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTCFareBreakdownType", propOrder = {
    "passengerTypeQuantity",
    "pricingSeqs",
    "fareBasisCodes",
    "passengerFare",
    "travelerRefNumber",
    "ticketDesignators",
    "endorsements",
    "fareInfo",
    "tpaExtensions"
})
public class PTCFareBreakdownType {

    @XmlElement(name = "PassengerTypeQuantity", required = true)
    protected PassengerTypeQuantityType passengerTypeQuantity;
    @XmlElement(name = "PricingSeqs")
    protected PTCFareBreakdownType.PricingSeqs pricingSeqs;
    @XmlElement(name = "FareBasisCodes")
    protected PTCFareBreakdownType.FareBasisCodes fareBasisCodes;
    @XmlElement(name = "PassengerFare", required = true)
    protected FareType passengerFare;
    @XmlElement(name = "TravelerRefNumber")
    protected List<PTCFareBreakdownType.TravelerRefNumber> travelerRefNumber;
    @XmlElement(name = "TicketDesignators")
    protected PTCFareBreakdownType.TicketDesignators ticketDesignators;
    @XmlElement(name = "Endorsements")
    protected PTCFareBreakdownType.Endorsements endorsements;
    @XmlElement(name = "FareInfo")
    protected List<PTCFareBreakdownType.FareInfo> fareInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "PricingSource")
    protected PricingSourceType pricingSource;
    @XmlAttribute(name = "FlightRefNumberRPHList")
    protected List<String> flightRefNumberRPHList;

    /**
     * 获取passengerTypeQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public PassengerTypeQuantityType getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    /**
     * 设置passengerTypeQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public void setPassengerTypeQuantity(PassengerTypeQuantityType value) {
        this.passengerTypeQuantity = value;
    }

    /**
     * 获取pricingSeqs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTCFareBreakdownType.PricingSeqs }
     *     
     */
    public PTCFareBreakdownType.PricingSeqs getPricingSeqs() {
        return pricingSeqs;
    }

    /**
     * 设置pricingSeqs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTCFareBreakdownType.PricingSeqs }
     *     
     */
    public void setPricingSeqs(PTCFareBreakdownType.PricingSeqs value) {
        this.pricingSeqs = value;
    }

    /**
     * 获取fareBasisCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTCFareBreakdownType.FareBasisCodes }
     *     
     */
    public PTCFareBreakdownType.FareBasisCodes getFareBasisCodes() {
        return fareBasisCodes;
    }

    /**
     * 设置fareBasisCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTCFareBreakdownType.FareBasisCodes }
     *     
     */
    public void setFareBasisCodes(PTCFareBreakdownType.FareBasisCodes value) {
        this.fareBasisCodes = value;
    }

    /**
     * 获取passengerFare属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getPassengerFare() {
        return passengerFare;
    }

    /**
     * 设置passengerFare属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setPassengerFare(FareType value) {
        this.passengerFare = value;
    }

    /**
     * Gets the value of the travelerRefNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerRefNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCFareBreakdownType.TravelerRefNumber }
     * 
     * 
     */
    public List<PTCFareBreakdownType.TravelerRefNumber> getTravelerRefNumber() {
        if (travelerRefNumber == null) {
            travelerRefNumber = new ArrayList<PTCFareBreakdownType.TravelerRefNumber>();
        }
        return this.travelerRefNumber;
    }

    /**
     * 获取ticketDesignators属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTCFareBreakdownType.TicketDesignators }
     *     
     */
    public PTCFareBreakdownType.TicketDesignators getTicketDesignators() {
        return ticketDesignators;
    }

    /**
     * 设置ticketDesignators属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTCFareBreakdownType.TicketDesignators }
     *     
     */
    public void setTicketDesignators(PTCFareBreakdownType.TicketDesignators value) {
        this.ticketDesignators = value;
    }

    /**
     * 获取endorsements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTCFareBreakdownType.Endorsements }
     *     
     */
    public PTCFareBreakdownType.Endorsements getEndorsements() {
        return endorsements;
    }

    /**
     * 设置endorsements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTCFareBreakdownType.Endorsements }
     *     
     */
    public void setEndorsements(PTCFareBreakdownType.Endorsements value) {
        this.endorsements = value;
    }

    /**
     * Gets the value of the fareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCFareBreakdownType.FareInfo }
     * 
     * 
     */
    public List<PTCFareBreakdownType.FareInfo> getFareInfo() {
        if (fareInfo == null) {
            fareInfo = new ArrayList<PTCFareBreakdownType.FareInfo>();
        }
        return this.fareInfo;
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
     * 获取pricingSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricingSourceType }
     *     
     */
    public PricingSourceType getPricingSource() {
        return pricingSource;
    }

    /**
     * 设置pricingSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSourceType }
     *     
     */
    public void setPricingSource(PricingSourceType value) {
        this.pricingSource = value;
    }

    /**
     * Gets the value of the flightRefNumberRPHList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightRefNumberRPHList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightRefNumberRPHList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlightRefNumberRPHList() {
        if (flightRefNumberRPHList == null) {
            flightRefNumberRPHList = new ArrayList<String>();
        }
        return this.flightRefNumberRPHList;
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
     *         &lt;element name="Endorsement" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonEndorsableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "endorsement"
    })
    public static class Endorsements {

        @XmlElement(name = "Endorsement", required = true)
        protected List<PTCFareBreakdownType.Endorsements.Endorsement> endorsement;
        @XmlAttribute(name = "NonRefundableIndicator")
        protected Boolean nonRefundableIndicator;
        @XmlAttribute(name = "NonEndorsableIndicator")
        protected Boolean nonEndorsableIndicator;

        /**
         * Gets the value of the endorsement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endorsement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEndorsement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType.Endorsements.Endorsement }
         * 
         * 
         */
        public List<PTCFareBreakdownType.Endorsements.Endorsement> getEndorsement() {
            if (endorsement == null) {
                endorsement = new ArrayList<PTCFareBreakdownType.Endorsements.Endorsement>();
            }
            return this.endorsement;
        }

        /**
         * 获取nonRefundableIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonRefundableIndicator() {
            return nonRefundableIndicator;
        }

        /**
         * 设置nonRefundableIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonRefundableIndicator(Boolean value) {
            this.nonRefundableIndicator = value;
        }

        /**
         * 获取nonEndorsableIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonEndorsableIndicator() {
            return nonEndorsableIndicator;
        }

        /**
         * 设置nonEndorsableIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonEndorsableIndicator(Boolean value) {
            this.nonEndorsableIndicator = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Endorsement
            extends FreeTextType
        {


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
     *         &lt;element name="FareBasisCode" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to16">
     *                 &lt;attribute name="SegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "fareBasisCode"
    })
    public static class FareBasisCodes {

        @XmlElement(name = "FareBasisCode", required = true)
        protected List<PTCFareBreakdownType.FareBasisCodes.FareBasisCode> fareBasisCode;

        /**
         * Gets the value of the fareBasisCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareBasisCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareBasisCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType.FareBasisCodes.FareBasisCode }
         * 
         * 
         */
        public List<PTCFareBreakdownType.FareBasisCodes.FareBasisCode> getFareBasisCode() {
            if (fareBasisCode == null) {
                fareBasisCode = new ArrayList<PTCFareBreakdownType.FareBasisCodes.FareBasisCode>();
            }
            return this.fareBasisCode;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to16">
         *       &lt;attribute name="SegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
        public static class FareBasisCode {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "SegmentRPH")
            protected String segmentRPH;

            /**
             * Used for Character Strings, length 1 to 16
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
             * 获取segmentRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegmentRPH() {
                return segmentRPH;
            }

            /**
             * 设置segmentRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegmentRPH(String value) {
                this.segmentRPH = value;
            }

        }

    }


    /**
     *  Information used to define a fare and its associated rules information.
     * 
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
     *       &lt;sequence>
     *         &lt;element name="PassengerFare" type="{http://www.opentravel.org/OTA/2003/05}FareType"/>
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
        "passengerFare"
    })
    public static class FareInfo
        extends FareInfoType
    {

        @XmlElement(name = "PassengerFare", required = true)
        protected FareType passengerFare;

        /**
         * 获取passengerFare属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FareType }
         *     
         */
        public FareType getPassengerFare() {
            return passengerFare;
        }

        /**
         * 设置passengerFare属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FareType }
         *     
         */
        public void setPassengerFare(FareType value) {
            this.passengerFare = value;
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
     *         &lt;element name="PricingSeq" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_SuperPNR_RPH"/>
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TravelerRefNumber" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
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
        "pricingSeq"
    })
    public static class PricingSeqs {

        @XmlElement(name = "PricingSeq", required = true)
        protected List<PTCFareBreakdownType.PricingSeqs.PricingSeq> pricingSeq;

        /**
         * Gets the value of the pricingSeq property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pricingSeq property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPricingSeq().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType.PricingSeqs.PricingSeq }
         * 
         * 
         */
        public List<PTCFareBreakdownType.PricingSeqs.PricingSeq> getPricingSeq() {
            if (pricingSeq == null) {
                pricingSeq = new ArrayList<PTCFareBreakdownType.PricingSeqs.PricingSeq>();
            }
            return this.pricingSeq;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_SuperPNR_RPH"/>
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TravelerRefNumber" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PricingSeq {

            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "TravelerRefNumber")
            protected List<String> travelerRefNumber;
            @XmlAttribute(name = "OJ_SuperPNR_RPH")
            protected String ojSuperPNRRPH;

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
             * Gets the value of the travelerRefNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the travelerRefNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTravelerRefNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTravelerRefNumber() {
                if (travelerRefNumber == null) {
                    travelerRefNumber = new ArrayList<String>();
                }
                return this.travelerRefNumber;
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
     *         &lt;element name="TicketDesignator" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="FlightRefRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="TicketDesignatorExtension" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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
        "ticketDesignator"
    })
    public static class TicketDesignators {

        @XmlElement(name = "TicketDesignator", required = true)
        protected List<PTCFareBreakdownType.TicketDesignators.TicketDesignator> ticketDesignator;

        /**
         * Gets the value of the ticketDesignator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketDesignator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketDesignator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType.TicketDesignators.TicketDesignator }
         * 
         * 
         */
        public List<PTCFareBreakdownType.TicketDesignators.TicketDesignator> getTicketDesignator() {
            if (ticketDesignator == null) {
                ticketDesignator = new ArrayList<PTCFareBreakdownType.TicketDesignators.TicketDesignator>();
            }
            return this.ticketDesignator;
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
         *       &lt;attribute name="FlightRefRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="TicketDesignatorExtension" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TicketDesignator {

            @XmlAttribute(name = "FlightRefRPH")
            protected String flightRefRPH;
            @XmlAttribute(name = "TicketDesignatorCode")
            protected String ticketDesignatorCode;
            @XmlAttribute(name = "TicketDesignatorExtension")
            protected String ticketDesignatorExtension;

            /**
             * 获取flightRefRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightRefRPH() {
                return flightRefRPH;
            }

            /**
             * 设置flightRefRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightRefRPH(String value) {
                this.flightRefRPH = value;
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
             * 获取ticketDesignatorExtension属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketDesignatorExtension() {
                return ticketDesignatorExtension;
            }

            /**
             * 设置ticketDesignatorExtension属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketDesignatorExtension(String value) {
                this.ticketDesignatorExtension = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerRefNumberGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelerRefNumber {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "SurnameRefNumber")
        protected String surnameRefNumber;

        /**
         * 获取rph属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * 设置rph属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * 获取surnameRefNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurnameRefNumber() {
            return surnameRefNumber;
        }

        /**
         * 设置surnameRefNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurnameRefNumber(String value) {
            this.surnameRefNumber = value;
        }

    }

}
