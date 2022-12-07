//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
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


/**
 * 
 * 	A container for flight segments.
 * 	
 * 
 * <p>OriginDestinationOptionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="useLoyalty" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Baggage" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BaggageSpecificationType">
 *                 &lt;attribute name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CheckedInInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ExcessBaggageNmbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="BaggageRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="FareInfoRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="PricingRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="TravelerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}BaggageTypeType" />
 *                 &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightSegment" maxOccurs="4">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightAmenities" type="{http://www.opentravel.org/OTA/2003/05}FlightAmenitiesType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Tags" type="{http://www.opentravel.org/OTA/2003/05}TagsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Commission" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="days" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Mileage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="OnlineCheckin" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CUGAccountCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EstimatedJourneyTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationOptionType", propOrder = {
    "useLoyalty",
    "baggage",
    "flightSegment"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.AirSearchCriteriaType.OriginDestinationOption.class,
    com.airchina.datacenter.spnr.sdk.entity.AirItineraryType.OriginDestinationOptions.OriginDestinationOption.class
})
public class OriginDestinationOptionType {

    protected OriginDestinationOptionType.UseLoyalty useLoyalty;
    @XmlElement(name = "Baggage")
    protected List<OriginDestinationOptionType.Baggage> baggage;
    @XmlElement(name = "FlightSegment", required = true)
    protected List<OriginDestinationOptionType.FlightSegment> flightSegment;
    @XmlAttribute(name = "CUGAccountCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String cugAccountCode;
    @XmlAttribute(name = "EstimatedJourneyTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String estimatedJourneyTime;

    /**
     * 获取useLoyalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationOptionType.UseLoyalty }
     *     
     */
    public OriginDestinationOptionType.UseLoyalty getUseLoyalty() {
        return useLoyalty;
    }

    /**
     * 设置useLoyalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationOptionType.UseLoyalty }
     *     
     */
    public void setUseLoyalty(OriginDestinationOptionType.UseLoyalty value) {
        this.useLoyalty = value;
    }

    /**
     * Gets the value of the baggage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestinationOptionType.Baggage }
     * 
     * 
     */
    public List<OriginDestinationOptionType.Baggage> getBaggage() {
        if (baggage == null) {
            baggage = new ArrayList<OriginDestinationOptionType.Baggage>();
        }
        return this.baggage;
    }

    /**
     * Gets the value of the flightSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestinationOptionType.FlightSegment }
     * 
     * 
     */
    public List<OriginDestinationOptionType.FlightSegment> getFlightSegment() {
        if (flightSegment == null) {
            flightSegment = new ArrayList<OriginDestinationOptionType.FlightSegment>();
        }
        return this.flightSegment;
    }

    /**
     * 获取cugAccountCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUGAccountCode() {
        return cugAccountCode;
    }

    /**
     * 设置cugAccountCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUGAccountCode(String value) {
        this.cugAccountCode = value;
    }

    /**
     * 获取estimatedJourneyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedJourneyTime() {
        return estimatedJourneyTime;
    }

    /**
     * 设置estimatedJourneyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedJourneyTime(String value) {
        this.estimatedJourneyTime = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BaggageSpecificationType">
     *       &lt;attribute name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CheckedInInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ExcessBaggageNmbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="BaggageRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="FareInfoRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="PricingRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="TravelerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}BaggageTypeType" />
     *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Baggage
        extends BaggageSpecificationType
    {

        @XmlAttribute(name = "CabinCode")
        protected String cabinCode;
        @XmlAttribute(name = "CheckedInInd")
        protected Boolean checkedInInd;
        @XmlAttribute(name = "ExcessBaggageNmbr")
        protected BigInteger excessBaggageNmbr;
        @XmlAttribute(name = "BaggageRPH")
        protected String baggageRPH;
        @XmlAttribute(name = "FareInfoRPH")
        protected String fareInfoRPH;
        @XmlAttribute(name = "FlightSegmentRPH")
        protected String flightSegmentRPH;
        @XmlAttribute(name = "PricingRPH")
        protected String pricingRPH;
        @XmlAttribute(name = "TravelerRPH")
        protected String travelerRPH;
        @XmlAttribute(name = "Type")
        protected BaggageTypeType type;
        @XmlAttribute(name = "Source")
        protected String source;

        /**
         * 获取cabinCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCabinCode() {
            return cabinCode;
        }

        /**
         * 设置cabinCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCabinCode(String value) {
            this.cabinCode = value;
        }

        /**
         * 获取checkedInInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCheckedInInd() {
            return checkedInInd;
        }

        /**
         * 设置checkedInInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCheckedInInd(Boolean value) {
            this.checkedInInd = value;
        }

        /**
         * 获取excessBaggageNmbr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExcessBaggageNmbr() {
            return excessBaggageNmbr;
        }

        /**
         * 设置excessBaggageNmbr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExcessBaggageNmbr(BigInteger value) {
            this.excessBaggageNmbr = value;
        }

        /**
         * 获取baggageRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBaggageRPH() {
            return baggageRPH;
        }

        /**
         * 设置baggageRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBaggageRPH(String value) {
            this.baggageRPH = value;
        }

        /**
         * 获取fareInfoRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareInfoRPH() {
            return fareInfoRPH;
        }

        /**
         * 设置fareInfoRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareInfoRPH(String value) {
            this.fareInfoRPH = value;
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
         * 获取pricingRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPricingRPH() {
            return pricingRPH;
        }

        /**
         * 设置pricingRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPricingRPH(String value) {
            this.pricingRPH = value;
        }

        /**
         * 获取travelerRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelerRPH() {
            return travelerRPH;
        }

        /**
         * 设置travelerRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelerRPH(String value) {
            this.travelerRPH = value;
        }

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BaggageTypeType }
         *     
         */
        public BaggageTypeType getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageTypeType }
         *     
         */
        public void setType(BaggageTypeType value) {
            this.type = value;
        }

        /**
         * 获取source属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * 设置source属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType">
     *       &lt;sequence>
     *         &lt;element name="FlightAmenities" type="{http://www.opentravel.org/OTA/2003/05}FlightAmenitiesType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Tags" type="{http://www.opentravel.org/OTA/2003/05}TagsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Commission" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="days" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Mileage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="OnlineCheckin" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightAmenities",
        "tags"
    })
    public static class FlightSegment
        extends BookFlightSegmentType
    {

        @XmlElement(name = "FlightAmenities")
        protected List<FlightAmenitiesType> flightAmenities;
        @XmlElement(name = "Tags")
        protected TagsType tags;
        @XmlAttribute(name = "Commission")
        @XmlSchemaType(name = "anySimpleType")
        protected String commission;
        @XmlAttribute(name = "days")
        @XmlSchemaType(name = "anySimpleType")
        protected String days;
        @XmlAttribute(name = "Mileage")
        @XmlSchemaType(name = "anySimpleType")
        protected String mileage;
        @XmlAttribute(name = "Duration")
        @XmlSchemaType(name = "anySimpleType")
        protected String duration;
        @XmlAttribute(name = "OnlineCheckin")
        @XmlSchemaType(name = "anySimpleType")
        protected String onlineCheckin;

        /**
         * Gets the value of the flightAmenities property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightAmenities property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightAmenities().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightAmenitiesType }
         * 
         * 
         */
        public List<FlightAmenitiesType> getFlightAmenities() {
            if (flightAmenities == null) {
                flightAmenities = new ArrayList<FlightAmenitiesType>();
            }
            return this.flightAmenities;
        }

        /**
         * 获取tags属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TagsType }
         *     
         */
        public TagsType getTags() {
            return tags;
        }

        /**
         * 设置tags属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TagsType }
         *     
         */
        public void setTags(TagsType value) {
            this.tags = value;
        }

        /**
         * 获取commission属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommission() {
            return commission;
        }

        /**
         * 设置commission属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommission(String value) {
            this.commission = value;
        }

        /**
         * 获取days属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDays() {
            return days;
        }

        /**
         * 设置days属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDays(String value) {
            this.days = value;
        }

        /**
         * 获取mileage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMileage() {
            return mileage;
        }

        /**
         * 设置mileage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMileage(String value) {
            this.mileage = value;
        }

        /**
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * 获取onlineCheckin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOnlineCheckin() {
            return onlineCheckin;
        }

        /**
         * 设置onlineCheckin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOnlineCheckin(String value) {
            this.onlineCheckin = value;
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
     *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UseLoyalty {

        @XmlAttribute(name = "Value")
        @XmlSchemaType(name = "anySimpleType")
        protected String value;
        @XmlAttribute(name = "Amount")
        @XmlSchemaType(name = "anySimpleType")
        protected String amount;

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
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmount(String value) {
            this.amount = value;
        }

    }

}
