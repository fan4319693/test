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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of LengthOfStay.
 * 
 * <p>LengthsOfStayType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LengthsOfStayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LengthOfStay" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LOS_Pattern" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="FullPatternLOS" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DOW" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="OpenStatusIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MinMaxMessageType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="NoLOS"/>
 *                       &lt;enumeration value="SetMinLOS"/>
 *                       &lt;enumeration value="RemoveMinLOS"/>
 *                       &lt;enumeration value="SetMaxLOS"/>
 *                       &lt;enumeration value="RemoveMaxLOS"/>
 *                       &lt;enumeration value="SetForwardMinStay"/>
 *                       &lt;enumeration value="RemoveForwardMinStay"/>
 *                       &lt;enumeration value="SetForwardMaxStay"/>
 *                       &lt;enumeration value="RemoveForwardMaxStay"/>
 *                       &lt;enumeration value="FixedLOS"/>
 *                       &lt;enumeration value="FullPatternLOS"/>
 *                       &lt;enumeration value="MinLOS"/>
 *                       &lt;enumeration value="MaxLOS"/>
 *                       &lt;enumeration value="arrival"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="From" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="To" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlType(name = "LengthsOfStayType", propOrder = {
    "lengthOfStay"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.AvailStatusMessageType.LengthsOfStay.class
})
public class LengthsOfStayType {

    @XmlElement(name = "LengthOfStay")
    protected List<LengthsOfStayType.LengthOfStay> lengthOfStay;

    /**
     * Gets the value of the lengthOfStay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lengthOfStay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLengthOfStay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LengthsOfStayType.LengthOfStay }
     * 
     * 
     */
    public List<LengthsOfStayType.LengthOfStay> getLengthOfStay() {
        if (lengthOfStay == null) {
            lengthOfStay = new ArrayList<LengthsOfStayType.LengthOfStay>();
        }
        return this.lengthOfStay;
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
     *         &lt;element name="LOS_Pattern" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="FullPatternLOS" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DOW" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DOW_PatternGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="OpenStatusIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MinMaxMessageType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="NoLOS"/>
     *             &lt;enumeration value="SetMinLOS"/>
     *             &lt;enumeration value="RemoveMinLOS"/>
     *             &lt;enumeration value="SetMaxLOS"/>
     *             &lt;enumeration value="RemoveMaxLOS"/>
     *             &lt;enumeration value="SetForwardMinStay"/>
     *             &lt;enumeration value="RemoveForwardMinStay"/>
     *             &lt;enumeration value="SetForwardMaxStay"/>
     *             &lt;enumeration value="RemoveForwardMaxStay"/>
     *             &lt;enumeration value="FixedLOS"/>
     *             &lt;enumeration value="FullPatternLOS"/>
     *             &lt;enumeration value="MinLOS"/>
     *             &lt;enumeration value="MaxLOS"/>
     *             &lt;enumeration value="arrival"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="From" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="To" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "losPattern",
        "dow"
    })
    public static class LengthOfStay {

        @XmlElement(name = "LOS_Pattern")
        protected LengthsOfStayType.LengthOfStay.LOSPattern losPattern;
        @XmlElement(name = "DOW")
        protected LengthsOfStayType.LengthOfStay.DOW dow;
        @XmlAttribute(name = "Time")
        protected BigInteger time;
        @XmlAttribute(name = "TimeUnit")
        protected String timeUnit;
        @XmlAttribute(name = "OpenStatusIndicator")
        protected Boolean openStatusIndicator;
        @XmlAttribute(name = "MinMaxMessageType")
        protected String minMaxMessageType;
        @XmlAttribute(name = "From")
        @XmlSchemaType(name = "anySimpleType")
        protected String from;
        @XmlAttribute(name = "To")
        @XmlSchemaType(name = "anySimpleType")
        protected String to;

        /**
         * 获取losPattern属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LengthsOfStayType.LengthOfStay.LOSPattern }
         *     
         */
        public LengthsOfStayType.LengthOfStay.LOSPattern getLOSPattern() {
            return losPattern;
        }

        /**
         * 设置losPattern属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LengthsOfStayType.LengthOfStay.LOSPattern }
         *     
         */
        public void setLOSPattern(LengthsOfStayType.LengthOfStay.LOSPattern value) {
            this.losPattern = value;
        }

        /**
         * 获取dow属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LengthsOfStayType.LengthOfStay.DOW }
         *     
         */
        public LengthsOfStayType.LengthOfStay.DOW getDOW() {
            return dow;
        }

        /**
         * 设置dow属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LengthsOfStayType.LengthOfStay.DOW }
         *     
         */
        public void setDOW(LengthsOfStayType.LengthOfStay.DOW value) {
            this.dow = value;
        }

        /**
         * 获取time属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTime() {
            return time;
        }

        /**
         * 设置time属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTime(BigInteger value) {
            this.time = value;
        }

        /**
         * 获取timeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeUnit() {
            return timeUnit;
        }

        /**
         * 设置timeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeUnit(String value) {
            this.timeUnit = value;
        }

        /**
         * 获取openStatusIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOpenStatusIndicator() {
            return openStatusIndicator;
        }

        /**
         * 设置openStatusIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOpenStatusIndicator(Boolean value) {
            this.openStatusIndicator = value;
        }

        /**
         * 获取minMaxMessageType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinMaxMessageType() {
            return minMaxMessageType;
        }

        /**
         * 设置minMaxMessageType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinMaxMessageType(String value) {
            this.minMaxMessageType = value;
        }

        /**
         * 获取from属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFrom() {
            return from;
        }

        /**
         * 设置from属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFrom(String value) {
            this.from = value;
        }

        /**
         * 获取to属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTo() {
            return to;
        }

        /**
         * 设置to属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTo(String value) {
            this.to = value;
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DOW {

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
         *       &lt;attribute name="FullPatternLOS" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LOSPattern {

            @XmlAttribute(name = "FullPatternLOS")
            protected String fullPatternLOS;

            /**
             * 获取fullPatternLOS属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullPatternLOS() {
                return fullPatternLOS;
            }

            /**
             * 设置fullPatternLOS属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullPatternLOS(String value) {
                this.fullPatternLOS = value;
            }

        }

    }

}
