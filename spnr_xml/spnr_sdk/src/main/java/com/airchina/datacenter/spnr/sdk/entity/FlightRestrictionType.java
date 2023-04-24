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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FlightRestrictionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightRestrictionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateRange" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OriginDestinationOption" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="Origin">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Destination">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RestrictionType" type="{http://www.opentravel.org/OTA/2003/05}RestrictionTypeEum" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightInfoGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRestrictionType", propOrder = {
    "dateRange",
    "originDestinationOption"
})
public class FlightRestrictionType {

    @XmlElement(name = "DateRange")
    protected FlightRestrictionType.DateRange dateRange;
    @XmlElement(name = "OriginDestinationOption")
    protected FlightRestrictionType.OriginDestinationOption originDestinationOption;
    @XmlAttribute(name = "FareFamilyCode")
    protected String fareFamilyCode;
    @XmlAttribute(name = "FlightNumbers")
    protected String flightNumbers;
    @XmlAttribute(name = "DepartureDaysOfWeek")
    protected List<DayOfWeekType> departureDaysOfWeek;
    @XmlAttribute(name = "ResBookDesigCodes")
    protected String resBookDesigCodes;
    @XmlAttribute(name = "FareBasisCodes")
    protected String fareBasisCodes;

    /**
     * 获取dateRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightRestrictionType.DateRange }
     *     
     */
    public FlightRestrictionType.DateRange getDateRange() {
        return dateRange;
    }

    /**
     * 设置dateRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRestrictionType.DateRange }
     *     
     */
    public void setDateRange(FlightRestrictionType.DateRange value) {
        this.dateRange = value;
    }

    /**
     * 获取originDestinationOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightRestrictionType.OriginDestinationOption }
     *     
     */
    public FlightRestrictionType.OriginDestinationOption getOriginDestinationOption() {
        return originDestinationOption;
    }

    /**
     * 设置originDestinationOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRestrictionType.OriginDestinationOption }
     *     
     */
    public void setOriginDestinationOption(FlightRestrictionType.OriginDestinationOption value) {
        this.originDestinationOption = value;
    }

    /**
     * 获取fareFamilyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareFamilyCode() {
        return fareFamilyCode;
    }

    /**
     * 设置fareFamilyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareFamilyCode(String value) {
        this.fareFamilyCode = value;
    }

    /**
     * 获取flightNumbers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumbers() {
        return flightNumbers;
    }

    /**
     * 设置flightNumbers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumbers(String value) {
        this.flightNumbers = value;
    }

    /**
     * Gets the value of the departureDaysOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departureDaysOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureDaysOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfWeekType }
     * 
     * 
     */
    public List<DayOfWeekType> getDepartureDaysOfWeek() {
        if (departureDaysOfWeek == null) {
            departureDaysOfWeek = new ArrayList<DayOfWeekType>();
        }
        return this.departureDaysOfWeek;
    }

    /**
     * 获取resBookDesigCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesigCodes() {
        return resBookDesigCodes;
    }

    /**
     * 设置resBookDesigCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesigCodes(String value) {
        this.resBookDesigCodes = value;
    }

    /**
     * 获取fareBasisCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCodes() {
        return fareBasisCodes;
    }

    /**
     * 设置fareBasisCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCodes(String value) {
        this.fareBasisCodes = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DateRange {

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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="Origin">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Destination">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RestrictionType" type="{http://www.opentravel.org/OTA/2003/05}RestrictionTypeEum" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "origin",
        "destination"
    })
    public static class OriginDestinationOption {

        @XmlElement(name = "Origin")
        protected FlightRestrictionType.OriginDestinationOption.Origin origin;
        @XmlElement(name = "Destination")
        protected FlightRestrictionType.OriginDestinationOption.Destination destination;
        @XmlAttribute(name = "RestrictionType")
        protected RestrictionTypeEum restrictionType;

        /**
         * 获取origin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FlightRestrictionType.OriginDestinationOption.Origin }
         *     
         */
        public FlightRestrictionType.OriginDestinationOption.Origin getOrigin() {
            return origin;
        }

        /**
         * 设置origin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlightRestrictionType.OriginDestinationOption.Origin }
         *     
         */
        public void setOrigin(FlightRestrictionType.OriginDestinationOption.Origin value) {
            this.origin = value;
        }

        /**
         * 获取destination属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FlightRestrictionType.OriginDestinationOption.Destination }
         *     
         */
        public FlightRestrictionType.OriginDestinationOption.Destination getDestination() {
            return destination;
        }

        /**
         * 设置destination属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlightRestrictionType.OriginDestinationOption.Destination }
         *     
         */
        public void setDestination(FlightRestrictionType.OriginDestinationOption.Destination value) {
            this.destination = value;
        }

        /**
         * 获取restrictionType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RestrictionTypeEum }
         *     
         */
        public RestrictionTypeEum getRestrictionType() {
            return restrictionType;
        }

        /**
         * 设置restrictionType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RestrictionTypeEum }
         *     
         */
        public void setRestrictionType(RestrictionTypeEum value) {
            this.restrictionType = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Destination {

            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "LocationName")
            protected String locationName;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "Terminal")
            protected String terminal;
            @XmlAttribute(name = "Gate")
            protected String gate;
            @XmlAttribute(name = "TS_CityCode")
            protected String tsCityCode;
            @XmlAttribute(name = "TS_CityName")
            protected String tsCityName;
            @XmlAttribute(name = "CityAirportName")
            protected String cityAirportName;
            @XmlAttribute(name = "CountryCode")
            protected String countryCode;
            @XmlAttribute(name = "CountryName")
            protected String countryName;

            /**
             * 获取locationCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * 设置locationCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
            }

            /**
             * 获取locationName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationName() {
                return locationName;
            }

            /**
             * 设置locationName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationName(String value) {
                this.locationName = value;
            }

            /**
             * 获取codeContext属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                if (codeContext == null) {
                    return "IATA";
                } else {
                    return codeContext;
                }
            }

            /**
             * 设置codeContext属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

            /**
             * 获取terminal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminal() {
                return terminal;
            }

            /**
             * 设置terminal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminal(String value) {
                this.terminal = value;
            }

            /**
             * 获取gate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGate() {
                return gate;
            }

            /**
             * 设置gate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGate(String value) {
                this.gate = value;
            }

            /**
             * 获取tsCityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTSCityCode() {
                return tsCityCode;
            }

            /**
             * 设置tsCityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTSCityCode(String value) {
                this.tsCityCode = value;
            }

            /**
             * 获取tsCityName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTSCityName() {
                return tsCityName;
            }

            /**
             * 设置tsCityName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTSCityName(String value) {
                this.tsCityName = value;
            }

            /**
             * 获取cityAirportName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityAirportName() {
                return cityAirportName;
            }

            /**
             * 设置cityAirportName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityAirportName(String value) {
                this.cityAirportName = value;
            }

            /**
             * 获取countryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * 设置countryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * 获取countryName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryName() {
                return countryName;
            }

            /**
             * 设置countryName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryName(String value) {
                this.countryName = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Origin {

            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "LocationName")
            protected String locationName;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "Terminal")
            protected String terminal;
            @XmlAttribute(name = "Gate")
            protected String gate;
            @XmlAttribute(name = "TS_CityCode")
            protected String tsCityCode;
            @XmlAttribute(name = "TS_CityName")
            protected String tsCityName;
            @XmlAttribute(name = "CityAirportName")
            protected String cityAirportName;
            @XmlAttribute(name = "CountryCode")
            protected String countryCode;
            @XmlAttribute(name = "CountryName")
            protected String countryName;

            /**
             * 获取locationCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * 设置locationCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
            }

            /**
             * 获取locationName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationName() {
                return locationName;
            }

            /**
             * 设置locationName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationName(String value) {
                this.locationName = value;
            }

            /**
             * 获取codeContext属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                if (codeContext == null) {
                    return "IATA";
                } else {
                    return codeContext;
                }
            }

            /**
             * 设置codeContext属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

            /**
             * 获取terminal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminal() {
                return terminal;
            }

            /**
             * 设置terminal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminal(String value) {
                this.terminal = value;
            }

            /**
             * 获取gate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGate() {
                return gate;
            }

            /**
             * 设置gate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGate(String value) {
                this.gate = value;
            }

            /**
             * 获取tsCityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTSCityCode() {
                return tsCityCode;
            }

            /**
             * 设置tsCityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTSCityCode(String value) {
                this.tsCityCode = value;
            }

            /**
             * 获取tsCityName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTSCityName() {
                return tsCityName;
            }

            /**
             * 设置tsCityName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTSCityName(String value) {
                this.tsCityName = value;
            }

            /**
             * 获取cityAirportName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityAirportName() {
                return cityAirportName;
            }

            /**
             * 设置cityAirportName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityAirportName(String value) {
                this.cityAirportName = value;
            }

            /**
             * 获取countryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * 设置countryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * 获取countryName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryName() {
                return countryName;
            }

            /**
             * 设置countryName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryName(String value) {
                this.countryName = value;
            }

        }

    }

}
