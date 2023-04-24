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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Point of sale information.
 * 
 * <p>SaleInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SaleInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CityCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirportCityCodeType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CountryCode">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CountryCodeType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ICAOCode">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}CurrencyCodePOSType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="Identification">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RequestorInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="UserInfo" type="{http://www.opentravel.org/OTA/2003/05}AgencyPartyType" minOccurs="0"/>
 *                             &lt;element name="OtherAgencyID" maxOccurs="3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AccountInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookingToolPartyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SourceInfo" type="{http://www.opentravel.org/OTA/2003/05}SystemSourceType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SourceInfo" type="{http://www.opentravel.org/OTA/2003/05}SystemSourceType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RequestorID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RequestorIATA" type="{http://www.opentravel.org/OTA/2003/05}IATANumberType" />
 *                           &lt;attribute name="RequestorERSP" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RequestorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RequestorPW" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RequestorType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ReportingAgency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DocStock" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AggregatorInfo" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AggregatorPartyType">
 *                           &lt;sequence>
 *                             &lt;element name="SourceInfo" type="{http://www.opentravel.org/OTA/2003/05}SystemSourceType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Geocoding" type="{http://www.opentravel.org/OTA/2003/05}GeocodingType" minOccurs="0"/>
 *         &lt;element name="TouchPoint" type="{http://www.opentravel.org/OTA/2003/05}TouchPointType" minOccurs="0"/>
 *         &lt;element name="RequestTime" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TimeStamp"/>
 *                 &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "SaleInfoType", propOrder = {
    "cityCode",
    "countryCode",
    "currencyCode",
    "identification",
    "geocoding",
    "touchPoint",
    "requestTime"
})
public class SaleInfoType {

    @XmlElement(name = "CityCode")
    protected SaleInfoType.CityCode cityCode;
    @XmlElement(name = "CountryCode", required = true)
    protected SaleInfoType.CountryCode countryCode;
    @XmlElement(name = "CurrencyCode")
    protected List<CurrencyCodePOSType> currencyCode;
    @XmlElement(name = "Identification", required = true)
    protected SaleInfoType.Identification identification;
    @XmlElement(name = "Geocoding")
    protected GeocodingType geocoding;
    @XmlElement(name = "TouchPoint")
    protected TouchPointType touchPoint;
    @XmlElement(name = "RequestTime")
    protected SaleInfoType.RequestTime requestTime;

    /**
     * 获取cityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SaleInfoType.CityCode }
     *     
     */
    public SaleInfoType.CityCode getCityCode() {
        return cityCode;
    }

    /**
     * 设置cityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SaleInfoType.CityCode }
     *     
     */
    public void setCityCode(SaleInfoType.CityCode value) {
        this.cityCode = value;
    }

    /**
     * 获取countryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SaleInfoType.CountryCode }
     *     
     */
    public SaleInfoType.CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * 设置countryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SaleInfoType.CountryCode }
     *     
     */
    public void setCountryCode(SaleInfoType.CountryCode value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyCodePOSType }
     * 
     * 
     */
    public List<CurrencyCodePOSType> getCurrencyCode() {
        if (currencyCode == null) {
            currencyCode = new ArrayList<CurrencyCodePOSType>();
        }
        return this.currencyCode;
    }

    /**
     * 获取identification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SaleInfoType.Identification }
     *     
     */
    public SaleInfoType.Identification getIdentification() {
        return identification;
    }

    /**
     * 设置identification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SaleInfoType.Identification }
     *     
     */
    public void setIdentification(SaleInfoType.Identification value) {
        this.identification = value;
    }

    /**
     * 获取geocoding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GeocodingType }
     *     
     */
    public GeocodingType getGeocoding() {
        return geocoding;
    }

    /**
     * 设置geocoding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GeocodingType }
     *     
     */
    public void setGeocoding(GeocodingType value) {
        this.geocoding = value;
    }

    /**
     * 获取touchPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TouchPointType }
     *     
     */
    public TouchPointType getTouchPoint() {
        return touchPoint;
    }

    /**
     * 设置touchPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TouchPointType }
     *     
     */
    public void setTouchPoint(TouchPointType value) {
        this.touchPoint = value;
    }

    /**
     * 获取requestTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SaleInfoType.RequestTime }
     *     
     */
    public SaleInfoType.RequestTime getRequestTime() {
        return requestTime;
    }

    /**
     * 设置requestTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SaleInfoType.RequestTime }
     *     
     */
    public void setRequestTime(SaleInfoType.RequestTime value) {
        this.requestTime = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirportCityCodeType">
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CityCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * Airport or city code.
         * Examples: JFK, NYC
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CountryCodeType">
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ICAOCode">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="2"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CountryCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "ICAOCode")
        protected String icaoCode;

        /**
         * Two character country code.
         * Example: US
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * 获取icaoCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getICAOCode() {
            return icaoCode;
        }

        /**
         * 设置icaoCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setICAOCode(String value) {
            this.icaoCode = value;
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
     *         &lt;element name="RequestorInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="UserInfo" type="{http://www.opentravel.org/OTA/2003/05}AgencyPartyType" minOccurs="0"/>
     *                   &lt;element name="OtherAgencyID" maxOccurs="3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AccountInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookingToolPartyType">
     *                           &lt;sequence>
     *                             &lt;element name="SourceInfo" type="{http://www.opentravel.org/OTA/2003/05}SystemSourceType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SourceInfo" type="{http://www.opentravel.org/OTA/2003/05}SystemSourceType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RequestorID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RequestorIATA" type="{http://www.opentravel.org/OTA/2003/05}IATANumberType" />
     *                 &lt;attribute name="RequestorERSP" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RequestorName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RequestorPW" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RequestorType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ReportingAgency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DocStock" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AggregatorInfo" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AggregatorPartyType">
     *                 &lt;sequence>
     *                   &lt;element name="SourceInfo" type="{http://www.opentravel.org/OTA/2003/05}SystemSourceType" minOccurs="0"/>
     *                 &lt;/sequence>
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
        "requestorInfo",
        "aggregatorInfo"
    })
    public static class Identification {

        @XmlElement(name = "RequestorInfo", required = true)
        protected SaleInfoType.Identification.RequestorInfo requestorInfo;
        @XmlElement(name = "AggregatorInfo")
        protected List<SaleInfoType.Identification.AggregatorInfo> aggregatorInfo;

        /**
         * 获取requestorInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SaleInfoType.Identification.RequestorInfo }
         *     
         */
        public SaleInfoType.Identification.RequestorInfo getRequestorInfo() {
            return requestorInfo;
        }

        /**
         * 设置requestorInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SaleInfoType.Identification.RequestorInfo }
         *     
         */
        public void setRequestorInfo(SaleInfoType.Identification.RequestorInfo value) {
            this.requestorInfo = value;
        }

        /**
         * Gets the value of the aggregatorInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aggregatorInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAggregatorInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaleInfoType.Identification.AggregatorInfo }
         * 
         * 
         */
        public List<SaleInfoType.Identification.AggregatorInfo> getAggregatorInfo() {
            if (aggregatorInfo == null) {
                aggregatorInfo = new ArrayList<SaleInfoType.Identification.AggregatorInfo>();
            }
            return this.aggregatorInfo;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AggregatorPartyType">
         *       &lt;sequence>
         *         &lt;element name="SourceInfo" type="{http://www.opentravel.org/OTA/2003/05}SystemSourceType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sourceInfo"
        })
        public static class AggregatorInfo
            extends AggregatorPartyType
        {

            @XmlElement(name = "SourceInfo")
            protected SystemSourceType sourceInfo;

            /**
             * 获取sourceInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SystemSourceType }
             *     
             */
            public SystemSourceType getSourceInfo() {
                return sourceInfo;
            }

            /**
             * 设置sourceInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SystemSourceType }
             *     
             */
            public void setSourceInfo(SystemSourceType value) {
                this.sourceInfo = value;
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
         *         &lt;element name="UserInfo" type="{http://www.opentravel.org/OTA/2003/05}AgencyPartyType" minOccurs="0"/>
         *         &lt;element name="OtherAgencyID" maxOccurs="3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AccountInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookingToolPartyType">
         *                 &lt;sequence>
         *                   &lt;element name="SourceInfo" type="{http://www.opentravel.org/OTA/2003/05}SystemSourceType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SourceInfo" type="{http://www.opentravel.org/OTA/2003/05}SystemSourceType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="RequestorID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RequestorIATA" type="{http://www.opentravel.org/OTA/2003/05}IATANumberType" />
         *       &lt;attribute name="RequestorERSP" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RequestorName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RequestorPW" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RequestorType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ReportingAgency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DocStock" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "userInfo",
            "otherAgencyID",
            "accountInfo",
            "sourceInfo"
        })
        public static class RequestorInfo {

            @XmlElement(name = "UserInfo")
            protected AgencyPartyType userInfo;
            @XmlElement(name = "OtherAgencyID")
            protected List<SaleInfoType.Identification.RequestorInfo.OtherAgencyID> otherAgencyID;
            @XmlElement(name = "AccountInfo")
            protected SaleInfoType.Identification.RequestorInfo.AccountInfo accountInfo;
            @XmlElement(name = "SourceInfo")
            protected SystemSourceType sourceInfo;
            @XmlAttribute(name = "RequestorID", required = true)
            protected String requestorID;
            @XmlAttribute(name = "RequestorIATA")
            protected String requestorIATA;
            @XmlAttribute(name = "RequestorERSP")
            protected String requestorERSP;
            @XmlAttribute(name = "RequestorName")
            protected String requestorName;
            @XmlAttribute(name = "RequestorPW")
            protected String requestorPW;
            @XmlAttribute(name = "RequestorType")
            protected String requestorType;
            @XmlAttribute(name = "ReportingAgency")
            protected String reportingAgency;
            @XmlAttribute(name = "DocStock")
            protected String docStock;

            /**
             * 获取userInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AgencyPartyType }
             *     
             */
            public AgencyPartyType getUserInfo() {
                return userInfo;
            }

            /**
             * 设置userInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AgencyPartyType }
             *     
             */
            public void setUserInfo(AgencyPartyType value) {
                this.userInfo = value;
            }

            /**
             * Gets the value of the otherAgencyID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the otherAgencyID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOtherAgencyID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SaleInfoType.Identification.RequestorInfo.OtherAgencyID }
             * 
             * 
             */
            public List<SaleInfoType.Identification.RequestorInfo.OtherAgencyID> getOtherAgencyID() {
                if (otherAgencyID == null) {
                    otherAgencyID = new ArrayList<SaleInfoType.Identification.RequestorInfo.OtherAgencyID>();
                }
                return this.otherAgencyID;
            }

            /**
             * 获取accountInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SaleInfoType.Identification.RequestorInfo.AccountInfo }
             *     
             */
            public SaleInfoType.Identification.RequestorInfo.AccountInfo getAccountInfo() {
                return accountInfo;
            }

            /**
             * 设置accountInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SaleInfoType.Identification.RequestorInfo.AccountInfo }
             *     
             */
            public void setAccountInfo(SaleInfoType.Identification.RequestorInfo.AccountInfo value) {
                this.accountInfo = value;
            }

            /**
             * 获取sourceInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SystemSourceType }
             *     
             */
            public SystemSourceType getSourceInfo() {
                return sourceInfo;
            }

            /**
             * 设置sourceInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SystemSourceType }
             *     
             */
            public void setSourceInfo(SystemSourceType value) {
                this.sourceInfo = value;
            }

            /**
             * 获取requestorID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestorID() {
                return requestorID;
            }

            /**
             * 设置requestorID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestorID(String value) {
                this.requestorID = value;
            }

            /**
             * 获取requestorIATA属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestorIATA() {
                return requestorIATA;
            }

            /**
             * 设置requestorIATA属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestorIATA(String value) {
                this.requestorIATA = value;
            }

            /**
             * 获取requestorERSP属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestorERSP() {
                return requestorERSP;
            }

            /**
             * 设置requestorERSP属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestorERSP(String value) {
                this.requestorERSP = value;
            }

            /**
             * 获取requestorName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestorName() {
                return requestorName;
            }

            /**
             * 设置requestorName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestorName(String value) {
                this.requestorName = value;
            }

            /**
             * 获取requestorPW属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestorPW() {
                return requestorPW;
            }

            /**
             * 设置requestorPW属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestorPW(String value) {
                this.requestorPW = value;
            }

            /**
             * 获取requestorType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestorType() {
                return requestorType;
            }

            /**
             * 设置requestorType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestorType(String value) {
                this.requestorType = value;
            }

            /**
             * 获取reportingAgency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportingAgency() {
                return reportingAgency;
            }

            /**
             * 设置reportingAgency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReportingAgency(String value) {
                this.reportingAgency = value;
            }

            /**
             * 获取docStock属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocStock() {
                return docStock;
            }

            /**
             * 设置docStock属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocStock(String value) {
                this.docStock = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookingToolPartyType">
             *       &lt;sequence>
             *         &lt;element name="SourceInfo" type="{http://www.opentravel.org/OTA/2003/05}SystemSourceType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "sourceInfo"
            })
            public static class AccountInfo
                extends BookingToolPartyType
            {

                @XmlElement(name = "SourceInfo")
                protected SystemSourceType sourceInfo;

                /**
                 * 获取sourceInfo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SystemSourceType }
                 *     
                 */
                public SystemSourceType getSourceInfo() {
                    return sourceInfo;
                }

                /**
                 * 设置sourceInfo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SystemSourceType }
                 *     
                 */
                public void setSourceInfo(SystemSourceType value) {
                    this.sourceInfo = value;
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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType"/>
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
                "id",
                "description"
            })
            public static class OtherAgencyID {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "Description", required = true)
                protected String description;

                /**
                 * 获取id属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    return id;
                }

                /**
                 * 设置id属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }

                /**
                 * 获取description属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * 设置description属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }

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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TimeStamp"/>
     *       &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RequestTime {

        @XmlAttribute(name = "TimeZone")
        protected String timeZone;
        @XmlAttribute(name = "TimeStamp", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timeStamp;

        /**
         * 获取timeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeZone() {
            return timeZone;
        }

        /**
         * 设置timeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeZone(String value) {
            this.timeZone = value;
        }

        /**
         * 获取timeStamp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimeStamp() {
            return timeStamp;
        }

        /**
         * 设置timeStamp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimeStamp(XMLGregorianCalendar value) {
            this.timeStamp = value;
        }

    }

}
