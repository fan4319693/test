//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of criteria for specifying flight itinerary to be searched for.
 * 
 * <p>AirSearchCriteriaType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirItinerary" type="{http://www.opentravel.org/OTA/2003/05}AirItineraryType" minOccurs="0"/>
 *         &lt;element name="TravelerInfoSummary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TravelerInfoSummaryType">
 *                 &lt;attribute name="TicketingCountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *                 &lt;attribute name="SpecificPTC_Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AirItineraryPricingInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoGroup"/>
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
@XmlType(name = "AirSearchCriteriaType", propOrder = {
    "airItinerary",
    "travelerInfoSummary",
    "airItineraryPricingInfo"
})
public class AirSearchCriteriaType {

    @XmlElement(name = "AirItinerary")
    protected AirItineraryType airItinerary;
    @XmlElement(name = "TravelerInfoSummary")
    protected AirSearchCriteriaType.TravelerInfoSummary travelerInfoSummary;
    @XmlElement(name = "AirItineraryPricingInfo")
    protected List<AirSearchCriteriaType.AirItineraryPricingInfo> airItineraryPricingInfo;

    /**
     * 获取airItinerary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType }
     *     
     */
    public AirItineraryType getAirItinerary() {
        return airItinerary;
    }

    /**
     * 设置airItinerary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType }
     *     
     */
    public void setAirItinerary(AirItineraryType value) {
        this.airItinerary = value;
    }

    /**
     * 获取travelerInfoSummary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirSearchCriteriaType.TravelerInfoSummary }
     *     
     */
    public AirSearchCriteriaType.TravelerInfoSummary getTravelerInfoSummary() {
        return travelerInfoSummary;
    }

    /**
     * 设置travelerInfoSummary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchCriteriaType.TravelerInfoSummary }
     *     
     */
    public void setTravelerInfoSummary(AirSearchCriteriaType.TravelerInfoSummary value) {
        this.travelerInfoSummary = value;
    }

    /**
     * Gets the value of the airItineraryPricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airItineraryPricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirItineraryPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSearchCriteriaType.AirItineraryPricingInfo }
     * 
     * 
     */
    public List<AirSearchCriteriaType.AirItineraryPricingInfo> getAirItineraryPricingInfo() {
        if (airItineraryPricingInfo == null) {
            airItineraryPricingInfo = new ArrayList<AirSearchCriteriaType.AirItineraryPricingInfo>();
        }
        return this.airItineraryPricingInfo;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirItineraryPricingInfo
        extends AirItineraryPricingInfoType
    {

        @XmlAttribute(name = "FarefamilyCode")
        protected String farefamilyCode;
        @XmlAttribute(name = "FarefamilyName")
        protected String farefamilyName;
        @XmlAttribute(name = "CellingPrice")
        protected String cellingPrice;
        @XmlAttribute(name = "EstimatedMaxDiscountAmount")
        protected BigDecimal estimatedMaxDiscountAmount;

        /**
         * 获取farefamilyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFarefamilyCode() {
            return farefamilyCode;
        }

        /**
         * 设置farefamilyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFarefamilyCode(String value) {
            this.farefamilyCode = value;
        }

        /**
         * 获取farefamilyName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFarefamilyName() {
            return farefamilyName;
        }

        /**
         * 设置farefamilyName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFarefamilyName(String value) {
            this.farefamilyName = value;
        }

        /**
         * 获取cellingPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCellingPrice() {
            return cellingPrice;
        }

        /**
         * 设置cellingPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCellingPrice(String value) {
            this.cellingPrice = value;
        }

        /**
         * 获取estimatedMaxDiscountAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEstimatedMaxDiscountAmount() {
            return estimatedMaxDiscountAmount;
        }

        /**
         * 设置estimatedMaxDiscountAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEstimatedMaxDiscountAmount(BigDecimal value) {
            this.estimatedMaxDiscountAmount = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TravelerInfoSummaryType">
     *       &lt;attribute name="TicketingCountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
     *       &lt;attribute name="SpecificPTC_Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelerInfoSummary
        extends TravelerInfoSummaryType
    {

        @XmlAttribute(name = "TicketingCountryCode")
        protected String ticketingCountryCode;
        @XmlAttribute(name = "SpecificPTC_Indicator")
        protected Boolean specificPTCIndicator;

        /**
         * 获取ticketingCountryCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketingCountryCode() {
            return ticketingCountryCode;
        }

        /**
         * 设置ticketingCountryCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketingCountryCode(String value) {
            this.ticketingCountryCode = value;
        }

        /**
         * 获取specificPTCIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSpecificPTCIndicator() {
            return specificPTCIndicator;
        }

        /**
         * 设置specificPTCIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSpecificPTCIndicator(Boolean value) {
            this.specificPTCIndicator = value;
        }

    }

}
