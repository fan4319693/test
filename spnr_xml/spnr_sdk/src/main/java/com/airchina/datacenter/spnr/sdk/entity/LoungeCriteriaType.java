//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to search lounge service.
 * 
 * <p>LoungeCriteriaType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LoungeCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Airport" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TravelDateTimeSpan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
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
@XmlType(name = "LoungeCriteriaType", propOrder = {
    "airport",
    "travelDateTimeSpan"
})
public class LoungeCriteriaType {

    @XmlElement(name = "Airport")
    protected LoungeCriteriaType.Airport airport;
    @XmlElement(name = "TravelDateTimeSpan")
    protected LoungeCriteriaType.TravelDateTimeSpan travelDateTimeSpan;

    /**
     * 获取airport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoungeCriteriaType.Airport }
     *     
     */
    public LoungeCriteriaType.Airport getAirport() {
        return airport;
    }

    /**
     * 设置airport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoungeCriteriaType.Airport }
     *     
     */
    public void setAirport(LoungeCriteriaType.Airport value) {
        this.airport = value;
    }

    /**
     * 获取travelDateTimeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoungeCriteriaType.TravelDateTimeSpan }
     *     
     */
    public LoungeCriteriaType.TravelDateTimeSpan getTravelDateTimeSpan() {
        return travelDateTimeSpan;
    }

    /**
     * 设置travelDateTimeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoungeCriteriaType.TravelDateTimeSpan }
     *     
     */
    public void setTravelDateTimeSpan(LoungeCriteriaType.TravelDateTimeSpan value) {
        this.travelDateTimeSpan = value;
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
    public static class Airport {

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
    public static class TravelDateTimeSpan {

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

}
