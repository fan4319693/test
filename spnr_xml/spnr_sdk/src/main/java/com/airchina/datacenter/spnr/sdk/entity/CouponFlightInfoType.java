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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Itinerary reservation information.
 * 
 * <p>CouponFlightInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CouponFlightInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
 *                 &lt;attribute name="DateOfDeparture" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArrivalInfomation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
 *                 &lt;attribute name="DateOfArrival" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightNumberGroup"/>
 *       &lt;attribute name="FlightStatus" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponFlightInfoType", propOrder = {
    "departureInformation",
    "arrivalInfomation"
})
public class CouponFlightInfoType {

    @XmlElement(name = "DepartureInformation", required = true)
    protected CouponFlightInfoType.DepartureInformation departureInformation;
    @XmlElement(name = "ArrivalInfomation", required = true)
    protected CouponFlightInfoType.ArrivalInfomation arrivalInfomation;
    @XmlAttribute(name = "FlightStatus")
    @XmlSchemaType(name = "anySimpleType")
    protected String flightStatus;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "FlightNumberSuffix")
    protected String flightNumberSuffix;

    /**
     * 获取departureInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponFlightInfoType.DepartureInformation }
     *     
     */
    public CouponFlightInfoType.DepartureInformation getDepartureInformation() {
        return departureInformation;
    }

    /**
     * 设置departureInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponFlightInfoType.DepartureInformation }
     *     
     */
    public void setDepartureInformation(CouponFlightInfoType.DepartureInformation value) {
        this.departureInformation = value;
    }

    /**
     * 获取arrivalInfomation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponFlightInfoType.ArrivalInfomation }
     *     
     */
    public CouponFlightInfoType.ArrivalInfomation getArrivalInfomation() {
        return arrivalInfomation;
    }

    /**
     * 设置arrivalInfomation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponFlightInfoType.ArrivalInfomation }
     *     
     */
    public void setArrivalInfomation(CouponFlightInfoType.ArrivalInfomation value) {
        this.arrivalInfomation = value;
    }

    /**
     * 获取flightStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightStatus() {
        return flightStatus;
    }

    /**
     * 设置flightStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightStatus(String value) {
        this.flightStatus = value;
    }

    /**
     * 获取flightNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * 设置flightNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * 获取flightNumberSuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumberSuffix() {
        return flightNumberSuffix;
    }

    /**
     * 设置flightNumberSuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumberSuffix(String value) {
        this.flightNumberSuffix = value;
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
     *       &lt;attribute name="DateOfArrival" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ArrivalInfomation {

        @XmlAttribute(name = "DateOfArrival")
        protected String dateOfArrival;
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
         * 获取dateOfArrival属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateOfArrival() {
            return dateOfArrival;
        }

        /**
         * 设置dateOfArrival属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOfArrival(String value) {
            this.dateOfArrival = value;
        }

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
     *       &lt;attribute name="DateOfDeparture" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DepartureInformation {

        @XmlAttribute(name = "DateOfDeparture")
        protected String dateOfDeparture;
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
         * 获取dateOfDeparture属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateOfDeparture() {
            return dateOfDeparture;
        }

        /**
         * 设置dateOfDeparture属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOfDeparture(String value) {
            this.dateOfDeparture = value;
        }

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
