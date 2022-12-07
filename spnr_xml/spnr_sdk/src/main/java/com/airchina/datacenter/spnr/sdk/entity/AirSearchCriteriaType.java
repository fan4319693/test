//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

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
 *         &lt;element name="OriginDestinationOption" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType">
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "originDestinationOption",
    "travelerInfoSummary"
})
public class AirSearchCriteriaType {

    @XmlElement(name = "OriginDestinationOption", required = true)
    protected List<AirSearchCriteriaType.OriginDestinationOption> originDestinationOption;
    @XmlElement(name = "TravelerInfoSummary")
    protected AirSearchCriteriaType.TravelerInfoSummary travelerInfoSummary;

    /**
     * Gets the value of the originDestinationOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSearchCriteriaType.OriginDestinationOption }
     * 
     * 
     */
    public List<AirSearchCriteriaType.OriginDestinationOption> getOriginDestinationOption() {
        if (originDestinationOption == null) {
            originDestinationOption = new ArrayList<AirSearchCriteriaType.OriginDestinationOption>();
        }
        return this.originDestinationOption;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType">
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OriginDestinationOption
        extends OriginDestinationOptionType
    {

        @XmlAttribute(name = "RPH")
        protected String rph;

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
