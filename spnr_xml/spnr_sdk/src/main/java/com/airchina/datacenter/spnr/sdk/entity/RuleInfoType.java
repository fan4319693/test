//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains summary fare rule information as well as detailed Rule Information for Fare Basis Codes.  Information may be actual rules data or the results returned from a rules-based inquiry.
 * 
 * <p>RuleInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RuleInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResTicketingRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdvResTicketing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType">
 *                           &lt;attribute name="FirstTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="LastTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LengthOfStayRules" type="{http://www.opentravel.org/OTA/2003/05}StayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="ChargesRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VoluntaryChanges" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" maxOccurs="10" minOccurs="0"/>
 *                   &lt;element name="VoluntaryRefunds" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" maxOccurs="10" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AgeQualifications" type="{http://www.opentravel.org/OTA/2003/05}AgeQualificationsType" minOccurs="0"/>
 *         &lt;element name="TravelerRules" type="{http://www.opentravel.org/OTA/2003/05}TravelerRulesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInfoType", propOrder = {
    "resTicketingRules",
    "lengthOfStayRules",
    "chargesRules",
    "ageQualifications",
    "travelerRules"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.FareInfoType.RuleInfo.class
})
public class RuleInfoType {

    @XmlElement(name = "ResTicketingRules")
    protected RuleInfoType.ResTicketingRules resTicketingRules;
    @XmlElement(name = "LengthOfStayRules")
    protected StayRestrictionsType lengthOfStayRules;
    @XmlElement(name = "ChargesRules")
    protected RuleInfoType.ChargesRules chargesRules;
    @XmlElement(name = "AgeQualifications")
    protected AgeQualificationsType ageQualifications;
    @XmlElement(name = "TravelerRules")
    protected TravelerRulesType travelerRules;

    /**
     * 获取resTicketingRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RuleInfoType.ResTicketingRules }
     *     
     */
    public RuleInfoType.ResTicketingRules getResTicketingRules() {
        return resTicketingRules;
    }

    /**
     * 设置resTicketingRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RuleInfoType.ResTicketingRules }
     *     
     */
    public void setResTicketingRules(RuleInfoType.ResTicketingRules value) {
        this.resTicketingRules = value;
    }

    /**
     * 获取lengthOfStayRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StayRestrictionsType }
     *     
     */
    public StayRestrictionsType getLengthOfStayRules() {
        return lengthOfStayRules;
    }

    /**
     * 设置lengthOfStayRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StayRestrictionsType }
     *     
     */
    public void setLengthOfStayRules(StayRestrictionsType value) {
        this.lengthOfStayRules = value;
    }

    /**
     * 获取chargesRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RuleInfoType.ChargesRules }
     *     
     */
    public RuleInfoType.ChargesRules getChargesRules() {
        return chargesRules;
    }

    /**
     * 设置chargesRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RuleInfoType.ChargesRules }
     *     
     */
    public void setChargesRules(RuleInfoType.ChargesRules value) {
        this.chargesRules = value;
    }

    /**
     * 获取ageQualifications属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgeQualificationsType }
     *     
     */
    public AgeQualificationsType getAgeQualifications() {
        return ageQualifications;
    }

    /**
     * 设置ageQualifications属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgeQualificationsType }
     *     
     */
    public void setAgeQualifications(AgeQualificationsType value) {
        this.ageQualifications = value;
    }

    /**
     * 获取travelerRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelerRulesType }
     *     
     */
    public TravelerRulesType getTravelerRules() {
        return travelerRules;
    }

    /**
     * 设置travelerRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerRulesType }
     *     
     */
    public void setTravelerRules(TravelerRulesType value) {
        this.travelerRules = value;
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
     *         &lt;element name="VoluntaryChanges" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" maxOccurs="10" minOccurs="0"/>
     *         &lt;element name="VoluntaryRefunds" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" maxOccurs="10" minOccurs="0"/>
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
        "voluntaryChanges",
        "voluntaryRefunds"
    })
    public static class ChargesRules {

        @XmlElement(name = "VoluntaryChanges")
        protected List<VoluntaryChangesType> voluntaryChanges;
        @XmlElement(name = "VoluntaryRefunds")
        protected List<VoluntaryChangesType> voluntaryRefunds;

        /**
         * Gets the value of the voluntaryChanges property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voluntaryChanges property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVoluntaryChanges().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VoluntaryChangesType }
         * 
         * 
         */
        public List<VoluntaryChangesType> getVoluntaryChanges() {
            if (voluntaryChanges == null) {
                voluntaryChanges = new ArrayList<VoluntaryChangesType>();
            }
            return this.voluntaryChanges;
        }

        /**
         * Gets the value of the voluntaryRefunds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voluntaryRefunds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVoluntaryRefunds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VoluntaryChangesType }
         * 
         * 
         */
        public List<VoluntaryChangesType> getVoluntaryRefunds() {
            if (voluntaryRefunds == null) {
                voluntaryRefunds = new ArrayList<VoluntaryChangesType>();
            }
            return this.voluntaryRefunds;
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
     *         &lt;element name="AdvResTicketing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType">
     *                 &lt;attribute name="FirstTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="LastTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
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
        "advResTicketing"
    })
    public static class ResTicketingRules {

        @XmlElement(name = "AdvResTicketing")
        protected RuleInfoType.ResTicketingRules.AdvResTicketing advResTicketing;

        /**
         * 获取advResTicketing属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RuleInfoType.ResTicketingRules.AdvResTicketing }
         *     
         */
        public RuleInfoType.ResTicketingRules.AdvResTicketing getAdvResTicketing() {
            return advResTicketing;
        }

        /**
         * 设置advResTicketing属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RuleInfoType.ResTicketingRules.AdvResTicketing }
         *     
         */
        public void setAdvResTicketing(RuleInfoType.ResTicketingRules.AdvResTicketing value) {
            this.advResTicketing = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType">
         *       &lt;attribute name="FirstTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="LastTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AdvResTicketing
            extends AdvResTicketingType
        {

            @XmlAttribute(name = "FirstTicketDate")
            protected String firstTicketDate;
            @XmlAttribute(name = "LastTicketDate")
            protected String lastTicketDate;

            /**
             * 获取firstTicketDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstTicketDate() {
                return firstTicketDate;
            }

            /**
             * 设置firstTicketDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstTicketDate(String value) {
                this.firstTicketDate = value;
            }

            /**
             * 获取lastTicketDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastTicketDate() {
                return lastTicketDate;
            }

            /**
             * 设置lastTicketDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastTicketDate(String value) {
                this.lastTicketDate = value;
            }

        }

    }

}
