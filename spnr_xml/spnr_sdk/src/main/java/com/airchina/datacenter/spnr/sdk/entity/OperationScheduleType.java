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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>OperationScheduleType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OperationScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationTimes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OperationTime" maxOccurs="999">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeDurationGroup"/>
 *                           &lt;attribute name="AdditionalOperationInfoCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Frequency" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                           &lt;attribute name="Text" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeDurationGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationScheduleType", propOrder = {
    "operationTimes"
})
@XmlSeeAlso({
    PeriodPriceType.class,
    OperationSchedulePlusRPHType.class,
    OperationSchedulePlusChargeType.class
})
public class OperationScheduleType {

    @XmlElement(name = "OperationTimes")
    protected OperationScheduleType.OperationTimes operationTimes;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected Duration duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "RangeNum")
    protected BigInteger rangeNum;
    @XmlAttribute(name = "SearchTimeZone")
    protected String searchTimeZone;

    /**
     * 获取operationTimes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperationScheduleType.OperationTimes }
     *     
     */
    public OperationScheduleType.OperationTimes getOperationTimes() {
        return operationTimes;
    }

    /**
     * 设置operationTimes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperationScheduleType.OperationTimes }
     *     
     */
    public void setOperationTimes(OperationScheduleType.OperationTimes value) {
        this.operationTimes = value;
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
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
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
     *       &lt;sequence>
     *         &lt;element name="OperationTime" maxOccurs="999">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeDurationGroup"/>
     *                 &lt;attribute name="AdditionalOperationInfoCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Frequency" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                 &lt;attribute name="Text" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
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
        "operationTime"
    })
    public static class OperationTimes {

        @XmlElement(name = "OperationTime", required = true)
        protected List<OperationScheduleType.OperationTimes.OperationTime> operationTime;

        /**
         * Gets the value of the operationTime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operationTime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperationTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationScheduleType.OperationTimes.OperationTime }
         * 
         * 
         */
        public List<OperationScheduleType.OperationTimes.OperationTime> getOperationTime() {
            if (operationTime == null) {
                operationTime = new ArrayList<OperationScheduleType.OperationTimes.OperationTime>();
            }
            return this.operationTime;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeDurationGroup"/>
         *       &lt;attribute name="AdditionalOperationInfoCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Frequency" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *       &lt;attribute name="Text" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OperationTime {

            @XmlAttribute(name = "AdditionalOperationInfoCode")
            protected String additionalOperationInfoCode;
            @XmlAttribute(name = "Frequency")
            protected String frequency;
            @XmlAttribute(name = "Text")
            protected String text;
            @XmlAttribute(name = "Mon")
            protected Boolean mon;
            @XmlAttribute(name = "Tue")
            protected Boolean tue;
            @XmlAttribute(name = "Weds")
            protected Boolean weds;
            @XmlAttribute(name = "Thur")
            protected Boolean thur;
            @XmlAttribute(name = "Fri")
            protected Boolean fri;
            @XmlAttribute(name = "Sat")
            protected Boolean sat;
            @XmlAttribute(name = "Sun")
            protected Boolean sun;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected Duration duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "RangeNum")
            protected BigInteger rangeNum;
            @XmlAttribute(name = "SearchTimeZone")
            protected String searchTimeZone;

            /**
             * 获取additionalOperationInfoCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalOperationInfoCode() {
                return additionalOperationInfoCode;
            }

            /**
             * 设置additionalOperationInfoCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalOperationInfoCode(String value) {
                this.additionalOperationInfoCode = value;
            }

            /**
             * 获取frequency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrequency() {
                return frequency;
            }

            /**
             * 设置frequency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrequency(String value) {
                this.frequency = value;
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
             * 获取mon属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMon() {
                return mon;
            }

            /**
             * 设置mon属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMon(Boolean value) {
                this.mon = value;
            }

            /**
             * 获取tue属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isTue() {
                return tue;
            }

            /**
             * 设置tue属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTue(Boolean value) {
                this.tue = value;
            }

            /**
             * 获取weds属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isWeds() {
                return weds;
            }

            /**
             * 设置weds属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setWeds(Boolean value) {
                this.weds = value;
            }

            /**
             * 获取thur属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isThur() {
                return thur;
            }

            /**
             * 设置thur属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setThur(Boolean value) {
                this.thur = value;
            }

            /**
             * 获取fri属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFri() {
                return fri;
            }

            /**
             * 设置fri属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFri(Boolean value) {
                this.fri = value;
            }

            /**
             * 获取sat属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSat() {
                return sat;
            }

            /**
             * 设置sat属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSat(Boolean value) {
                this.sat = value;
            }

            /**
             * 获取sun属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSun() {
                return sun;
            }

            /**
             * 设置sun属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSun(Boolean value) {
                this.sun = value;
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
             *     {@link Duration }
             *     
             */
            public Duration getDuration() {
                return duration;
            }

            /**
             * 设置duration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Duration }
             *     
             */
            public void setDuration(Duration value) {
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

}
