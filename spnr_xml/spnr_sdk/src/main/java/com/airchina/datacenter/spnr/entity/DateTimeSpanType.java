//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to specify a time window range by either specifying an earliest and latest date for the start date and end date or by giving a date with a time period that can be applied before and/or after the start date.
 * 
 * <p>DateTimeSpanType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DateTimeSpanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DateWindowRange" type="{http://www.opentravel.org/OTA/2003/05}TimeInstantType"/>
 *         &lt;sequence>
 *           &lt;element name="StartDateWindow" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TimeWindowGroup"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="EndDateWindow" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TimeWindowGroup"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeSpanType", propOrder = {
    "dateWindowRange",
    "startDateWindow",
    "endDateWindow"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.AvailRequestSegmentsType.AvailRequestSegment.StayDateRange.class,
    com.airchina.datacenter.spnr.entity.RoomStayType.TimeSpan.class
})
public class DateTimeSpanType {

    @XmlElement(name = "DateWindowRange")
    protected TimeInstantType dateWindowRange;
    @XmlElement(name = "StartDateWindow")
    protected DateTimeSpanType.StartDateWindow startDateWindow;
    @XmlElement(name = "EndDateWindow")
    protected DateTimeSpanType.EndDateWindow endDateWindow;
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
     * 获取dateWindowRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantType }
     *     
     */
    public TimeInstantType getDateWindowRange() {
        return dateWindowRange;
    }

    /**
     * 设置dateWindowRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantType }
     *     
     */
    public void setDateWindowRange(TimeInstantType value) {
        this.dateWindowRange = value;
    }

    /**
     * 获取startDateWindow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType.StartDateWindow }
     *     
     */
    public DateTimeSpanType.StartDateWindow getStartDateWindow() {
        return startDateWindow;
    }

    /**
     * 设置startDateWindow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType.StartDateWindow }
     *     
     */
    public void setStartDateWindow(DateTimeSpanType.StartDateWindow value) {
        this.startDateWindow = value;
    }

    /**
     * 获取endDateWindow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType.EndDateWindow }
     *     
     */
    public DateTimeSpanType.EndDateWindow getEndDateWindow() {
        return endDateWindow;
    }

    /**
     * 设置endDateWindow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType.EndDateWindow }
     *     
     */
    public void setEndDateWindow(DateTimeSpanType.EndDateWindow value) {
        this.endDateWindow = value;
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TimeWindowGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EndDateWindow {

        @XmlAttribute(name = "EarliestDate")
        protected String earliestDate;
        @XmlAttribute(name = "LatestDate")
        protected String latestDate;
        @XmlAttribute(name = "DOW")
        protected DayOfWeekType dow;

        /**
         * 获取earliestDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarliestDate() {
            return earliestDate;
        }

        /**
         * 设置earliestDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarliestDate(String value) {
            this.earliestDate = value;
        }

        /**
         * 获取latestDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatestDate() {
            return latestDate;
        }

        /**
         * 设置latestDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatestDate(String value) {
            this.latestDate = value;
        }

        /**
         * 获取dow属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDOW() {
            return dow;
        }

        /**
         * 设置dow属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDOW(DayOfWeekType value) {
            this.dow = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TimeWindowGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StartDateWindow {

        @XmlAttribute(name = "EarliestDate")
        protected String earliestDate;
        @XmlAttribute(name = "LatestDate")
        protected String latestDate;
        @XmlAttribute(name = "DOW")
        protected DayOfWeekType dow;

        /**
         * 获取earliestDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarliestDate() {
            return earliestDate;
        }

        /**
         * 设置earliestDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarliestDate(String value) {
            this.earliestDate = value;
        }

        /**
         * 获取latestDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatestDate() {
            return latestDate;
        }

        /**
         * 设置latestDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatestDate(String value) {
            this.latestDate = value;
        }

        /**
         * 获取dow属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDOW() {
            return dow;
        }

        /**
         * 设置dow属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDOW(DayOfWeekType value) {
            this.dow = value;
        }

    }

}
