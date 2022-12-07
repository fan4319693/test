//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Generic reference data.
 * 				Examples:
 * 				Airport Code
 * 				GEO Coordinates
 * 				Names
 * 
 * <p>ReferenceDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReferenceDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Airport">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Geocoding" type="{http://www.opentravel.org/OTA/2003/05}GeocodingType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType" />
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ReferenceDataType", propOrder = {
    "airport"
})
public class ReferenceDataType {

    @XmlElement(name = "Airport", required = true)
    protected ReferenceDataType.Airport airport;

    /**
     * 获取airport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType.Airport }
     *     
     */
    public ReferenceDataType.Airport getAirport() {
        return airport;
    }

    /**
     * 设置airport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType.Airport }
     *     
     */
    public void setAirport(ReferenceDataType.Airport value) {
        this.airport = value;
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
     *         &lt;element name="Geocoding" type="{http://www.opentravel.org/OTA/2003/05}GeocodingType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "geocoding"
    })
    public static class Airport {

        @XmlElement(name = "Geocoding", required = true)
        protected GeocodingType geocoding;
        @XmlAttribute(name = "Code", required = true)
        protected String code;
        @XmlAttribute(name = "Name")
        protected String name;

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
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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

}
