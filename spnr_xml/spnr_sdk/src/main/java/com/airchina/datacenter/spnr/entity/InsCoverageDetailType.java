//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

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
 * Provides vendor with information about the traveler(s)' requirements for insurance coverage.
 * 
 * <p>InsCoverageDetailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InsCoverageDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoverageRequirements" type="{http://www.opentravel.org/OTA/2003/05}RequestedCoveragesType" minOccurs="0"/>
 *         &lt;element name="TotalTripQuantity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MaximumTripLength" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Minimum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Maximum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalTripCost" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CoveredTrips" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CoveredTrip" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TripFeaturesType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                           &lt;attribute name="DepositDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="FinalPayDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeliveryPref" type="{http://www.opentravel.org/OTA/2003/05}DistribPrefType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="FlightSegmentRefs" type="{http://www.opentravel.org/OTA/2003/05}FlightSegmentRefsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EffectiveExpireOptionalDateGroup"/>
 *       &lt;attribute name="Type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="SingleTrip"/>
 *             &lt;enumeration value="MultiTrip"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AutoRenew" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CoverageDays" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsCoverageDetailType", propOrder = {
    "coverageRequirements",
    "totalTripQuantity",
    "maximumTripLength",
    "totalTripCost",
    "coveredTrips",
    "deliveryPref",
    "flightSegmentRefs"
})
public class InsCoverageDetailType {

    @XmlElement(name = "CoverageRequirements")
    protected RequestedCoveragesType coverageRequirements;
    @XmlElement(name = "TotalTripQuantity")
    protected InsCoverageDetailType.TotalTripQuantity totalTripQuantity;
    @XmlElement(name = "MaximumTripLength")
    protected InsCoverageDetailType.MaximumTripLength maximumTripLength;
    @XmlElement(name = "TotalTripCost")
    protected InsCoverageDetailType.TotalTripCost totalTripCost;
    @XmlElement(name = "CoveredTrips")
    protected InsCoverageDetailType.CoveredTrips coveredTrips;
    @XmlElement(name = "DeliveryPref")
    protected List<DistribPrefType> deliveryPref;
    @XmlElement(name = "FlightSegmentRefs")
    protected FlightSegmentRefsType flightSegmentRefs;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "AutoRenew")
    protected Boolean autoRenew;
    @XmlAttribute(name = "CoverageDays")
    protected Integer coverageDays;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * 获取coverageRequirements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequestedCoveragesType }
     *     
     */
    public RequestedCoveragesType getCoverageRequirements() {
        return coverageRequirements;
    }

    /**
     * 设置coverageRequirements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedCoveragesType }
     *     
     */
    public void setCoverageRequirements(RequestedCoveragesType value) {
        this.coverageRequirements = value;
    }

    /**
     * 获取totalTripQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageDetailType.TotalTripQuantity }
     *     
     */
    public InsCoverageDetailType.TotalTripQuantity getTotalTripQuantity() {
        return totalTripQuantity;
    }

    /**
     * 设置totalTripQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageDetailType.TotalTripQuantity }
     *     
     */
    public void setTotalTripQuantity(InsCoverageDetailType.TotalTripQuantity value) {
        this.totalTripQuantity = value;
    }

    /**
     * 获取maximumTripLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageDetailType.MaximumTripLength }
     *     
     */
    public InsCoverageDetailType.MaximumTripLength getMaximumTripLength() {
        return maximumTripLength;
    }

    /**
     * 设置maximumTripLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageDetailType.MaximumTripLength }
     *     
     */
    public void setMaximumTripLength(InsCoverageDetailType.MaximumTripLength value) {
        this.maximumTripLength = value;
    }

    /**
     * 获取totalTripCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageDetailType.TotalTripCost }
     *     
     */
    public InsCoverageDetailType.TotalTripCost getTotalTripCost() {
        return totalTripCost;
    }

    /**
     * 设置totalTripCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageDetailType.TotalTripCost }
     *     
     */
    public void setTotalTripCost(InsCoverageDetailType.TotalTripCost value) {
        this.totalTripCost = value;
    }

    /**
     * 获取coveredTrips属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageDetailType.CoveredTrips }
     *     
     */
    public InsCoverageDetailType.CoveredTrips getCoveredTrips() {
        return coveredTrips;
    }

    /**
     * 设置coveredTrips属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageDetailType.CoveredTrips }
     *     
     */
    public void setCoveredTrips(InsCoverageDetailType.CoveredTrips value) {
        this.coveredTrips = value;
    }

    /**
     * Gets the value of the deliveryPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistribPrefType }
     * 
     * 
     */
    public List<DistribPrefType> getDeliveryPref() {
        if (deliveryPref == null) {
            deliveryPref = new ArrayList<DistribPrefType>();
        }
        return this.deliveryPref;
    }

    /**
     * 获取flightSegmentRefs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentRefsType }
     *     
     */
    public FlightSegmentRefsType getFlightSegmentRefs() {
        return flightSegmentRefs;
    }

    /**
     * 设置flightSegmentRefs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentRefsType }
     *     
     */
    public void setFlightSegmentRefs(FlightSegmentRefsType value) {
        this.flightSegmentRefs = value;
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
     * 获取autoRenew属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRenew() {
        return autoRenew;
    }

    /**
     * 设置autoRenew属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRenew(Boolean value) {
        this.autoRenew = value;
    }

    /**
     * 获取coverageDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCoverageDays() {
        return coverageDays;
    }

    /**
     * 设置coverageDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCoverageDays(Integer value) {
        this.coverageDays = value;
    }

    /**
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * 获取expireDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * 设置expireDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
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
     *         &lt;element name="CoveredTrip" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TripFeaturesType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *                 &lt;attribute name="DepositDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="FinalPayDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
        "coveredTrip"
    })
    public static class CoveredTrips {

        @XmlElement(name = "CoveredTrip", required = true)
        protected List<InsCoverageDetailType.CoveredTrips.CoveredTrip> coveredTrip;

        /**
         * Gets the value of the coveredTrip property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coveredTrip property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoveredTrip().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InsCoverageDetailType.CoveredTrips.CoveredTrip }
         * 
         * 
         */
        public List<InsCoverageDetailType.CoveredTrips.CoveredTrip> getCoveredTrip() {
            if (coveredTrip == null) {
                coveredTrip = new ArrayList<InsCoverageDetailType.CoveredTrips.CoveredTrip>();
            }
            return this.coveredTrip;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TripFeaturesType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
         *       &lt;attribute name="DepositDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="FinalPayDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CoveredTrip
            extends TripFeaturesType
        {

            @XmlAttribute(name = "DepositDate")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar depositDate;
            @XmlAttribute(name = "FinalPayDate")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar finalPayDate;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected BigInteger duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "RangeNum")
            protected BigInteger rangeNum;
            @XmlAttribute(name = "SearchTimeZone")
            protected String searchTimeZone;

            /**
             * 获取depositDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDepositDate() {
                return depositDate;
            }

            /**
             * 设置depositDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDepositDate(XMLGregorianCalendar value) {
                this.depositDate = value;
            }

            /**
             * 获取finalPayDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFinalPayDate() {
                return finalPayDate;
            }

            /**
             * 设置finalPayDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFinalPayDate(XMLGregorianCalendar value) {
                this.finalPayDate = value;
            }

            /**
             * 获取start属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * 设置start属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * 获取duration属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDuration() {
                return duration;
            }

            /**
             * 设置duration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDuration(BigInteger value) {
                this.duration = value;
            }

            /**
             * 获取end属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * 设置end属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
            }

            /**
             * 获取rangeNum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRangeNum() {
                return rangeNum;
            }

            /**
             * 设置rangeNum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRangeNum(BigInteger value) {
                this.rangeNum = value;
            }

            /**
             * 获取searchTimeZone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSearchTimeZone() {
                return searchTimeZone;
            }

            /**
             * 设置searchTimeZone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSearchTimeZone(String value) {
                this.searchTimeZone = value;
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
     *       &lt;attribute name="Minimum" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Maximum" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MaximumTripLength {

        @XmlAttribute(name = "Minimum")
        protected String minimum;
        @XmlAttribute(name = "Maximum")
        protected String maximum;

        /**
         * 获取minimum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinimum() {
            return minimum;
        }

        /**
         * 设置minimum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinimum(String value) {
            this.minimum = value;
        }

        /**
         * 获取maximum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaximum() {
            return maximum;
        }

        /**
         * 设置maximum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaximum(String value) {
            this.maximum = value;
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
    public static class TotalTripCost {

        @XmlAttribute(name = "Amount")
        protected Float amount;
        @XmlAttribute(name = "BaseAmount")
        protected Float baseAmount;
        @XmlAttribute(name = "PrePayInd")
        protected Boolean prePayInd;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;
        @XmlAttribute(name = "OriginalAmount")
        protected Float originalAmount;
        @XmlAttribute(name = "OriginalCurrencyCode")
        protected String originalCurrencyCode;

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
         * 获取baseAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getBaseAmount() {
            return baseAmount;
        }

        /**
         * 设置baseAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setBaseAmount(Float value) {
            this.baseAmount = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalTripQuantity {

        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

    }

}
