//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Container used to hold information regarding advance reservation and/or advance ticketing.
 * 
 * <p>AdvResTicketingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AdvResTicketingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="AdvReservation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="LatestTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="LatestPeriod" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *                 &lt;attribute name="LatestUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdvTicketing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="FromResTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="FromResPeriod" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *                 &lt;attribute name="FromResUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
 *                 &lt;attribute name="FromDepartTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="FromDepartPeriod" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *                 &lt;attribute name="FromDepartUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AdvResInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AdvTicketingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RequestedTicketingDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvResTicketingType", propOrder = {
    "advReservation",
    "advTicketing"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.RuleInfoType.ResTicketingRules.AdvResTicketing.class
})
public class AdvResTicketingType {

    @XmlElement(name = "AdvReservation")
    protected AdvResTicketingType.AdvReservation advReservation;
    @XmlElement(name = "AdvTicketing")
    protected AdvResTicketingType.AdvTicketing advTicketing;
    @XmlAttribute(name = "AdvResInd")
    protected Boolean advResInd;
    @XmlAttribute(name = "AdvTicketingInd")
    protected Boolean advTicketingInd;
    @XmlAttribute(name = "RequestedTicketingDate")
    protected String requestedTicketingDate;

    /**
     * 获取advReservation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdvResTicketingType.AdvReservation }
     *     
     */
    public AdvResTicketingType.AdvReservation getAdvReservation() {
        return advReservation;
    }

    /**
     * 设置advReservation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdvResTicketingType.AdvReservation }
     *     
     */
    public void setAdvReservation(AdvResTicketingType.AdvReservation value) {
        this.advReservation = value;
    }

    /**
     * 获取advTicketing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdvResTicketingType.AdvTicketing }
     *     
     */
    public AdvResTicketingType.AdvTicketing getAdvTicketing() {
        return advTicketing;
    }

    /**
     * 设置advTicketing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdvResTicketingType.AdvTicketing }
     *     
     */
    public void setAdvTicketing(AdvResTicketingType.AdvTicketing value) {
        this.advTicketing = value;
    }

    /**
     * 获取advResInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvResInd() {
        return advResInd;
    }

    /**
     * 设置advResInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvResInd(Boolean value) {
        this.advResInd = value;
    }

    /**
     * 获取advTicketingInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvTicketingInd() {
        return advTicketingInd;
    }

    /**
     * 设置advTicketingInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvTicketingInd(Boolean value) {
        this.advTicketingInd = value;
    }

    /**
     * 获取requestedTicketingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedTicketingDate() {
        return requestedTicketingDate;
    }

    /**
     * 设置requestedTicketingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedTicketingDate(String value) {
        this.requestedTicketingDate = value;
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
     *       &lt;attribute name="LatestTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="LatestPeriod" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *       &lt;attribute name="LatestUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdvReservation {

        @XmlAttribute(name = "LatestTimeOfDay")
        protected String latestTimeOfDay;
        @XmlAttribute(name = "LatestPeriod")
        protected String latestPeriod;
        @XmlAttribute(name = "LatestUnit")
        protected StayUnitType latestUnit;

        /**
         * 获取latestTimeOfDay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatestTimeOfDay() {
            return latestTimeOfDay;
        }

        /**
         * 设置latestTimeOfDay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatestTimeOfDay(String value) {
            this.latestTimeOfDay = value;
        }

        /**
         * 获取latestPeriod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatestPeriod() {
            return latestPeriod;
        }

        /**
         * 设置latestPeriod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatestPeriod(String value) {
            this.latestPeriod = value;
        }

        /**
         * 获取latestUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link StayUnitType }
         *     
         */
        public StayUnitType getLatestUnit() {
            return latestUnit;
        }

        /**
         * 设置latestUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link StayUnitType }
         *     
         */
        public void setLatestUnit(StayUnitType value) {
            this.latestUnit = value;
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
     *       &lt;attribute name="FromResTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="FromResPeriod" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *       &lt;attribute name="FromResUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
     *       &lt;attribute name="FromDepartTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="FromDepartPeriod" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *       &lt;attribute name="FromDepartUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdvTicketing {

        @XmlAttribute(name = "FromResTimeOfDay")
        protected String fromResTimeOfDay;
        @XmlAttribute(name = "FromResPeriod")
        protected String fromResPeriod;
        @XmlAttribute(name = "FromResUnit")
        protected StayUnitType fromResUnit;
        @XmlAttribute(name = "FromDepartTimeOfDay")
        protected String fromDepartTimeOfDay;
        @XmlAttribute(name = "FromDepartPeriod")
        protected String fromDepartPeriod;
        @XmlAttribute(name = "FromDepartUnit")
        protected StayUnitType fromDepartUnit;

        /**
         * 获取fromResTimeOfDay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromResTimeOfDay() {
            return fromResTimeOfDay;
        }

        /**
         * 设置fromResTimeOfDay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromResTimeOfDay(String value) {
            this.fromResTimeOfDay = value;
        }

        /**
         * 获取fromResPeriod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromResPeriod() {
            return fromResPeriod;
        }

        /**
         * 设置fromResPeriod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromResPeriod(String value) {
            this.fromResPeriod = value;
        }

        /**
         * 获取fromResUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link StayUnitType }
         *     
         */
        public StayUnitType getFromResUnit() {
            return fromResUnit;
        }

        /**
         * 设置fromResUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link StayUnitType }
         *     
         */
        public void setFromResUnit(StayUnitType value) {
            this.fromResUnit = value;
        }

        /**
         * 获取fromDepartTimeOfDay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromDepartTimeOfDay() {
            return fromDepartTimeOfDay;
        }

        /**
         * 设置fromDepartTimeOfDay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromDepartTimeOfDay(String value) {
            this.fromDepartTimeOfDay = value;
        }

        /**
         * 获取fromDepartPeriod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromDepartPeriod() {
            return fromDepartPeriod;
        }

        /**
         * 设置fromDepartPeriod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromDepartPeriod(String value) {
            this.fromDepartPeriod = value;
        }

        /**
         * 获取fromDepartUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link StayUnitType }
         *     
         */
        public StayUnitType getFromDepartUnit() {
            return fromDepartUnit;
        }

        /**
         * 设置fromDepartUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link StayUnitType }
         *     
         */
        public void setFromDepartUnit(StayUnitType value) {
            this.fromDepartUnit = value;
        }

    }

}
