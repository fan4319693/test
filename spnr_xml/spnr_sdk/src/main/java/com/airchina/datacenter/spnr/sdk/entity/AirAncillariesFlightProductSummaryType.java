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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AirAncillariesFlightProductSummaryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirAncillariesFlightProductSummaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirAncillariesProductSummaryBase">
 *       &lt;sequence>
 *         &lt;element name="FlightSegment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="OriginAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DestinationAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirAncillariesFlightProductSummaryType", propOrder = {
    "flightSegment"
})
public class AirAncillariesFlightProductSummaryType
    extends AirAncillariesProductSummaryBase
{

    @XmlElement(name = "FlightSegment", required = true)
    protected AirAncillariesFlightProductSummaryType.FlightSegment flightSegment;

    /**
     * 获取flightSegment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillariesFlightProductSummaryType.FlightSegment }
     *     
     */
    public AirAncillariesFlightProductSummaryType.FlightSegment getFlightSegment() {
        return flightSegment;
    }

    /**
     * 设置flightSegment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillariesFlightProductSummaryType.FlightSegment }
     *     
     */
    public void setFlightSegment(AirAncillariesFlightProductSummaryType.FlightSegment value) {
        this.flightSegment = value;
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
     *       &lt;attribute name="OriginAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DestinationAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightSegment {

        @XmlAttribute(name = "OriginAirport")
        protected String originAirport;
        @XmlAttribute(name = "DestinationAirport")
        protected String destinationAirport;
        @XmlAttribute(name = "Carrier")
        protected String carrier;
        @XmlAttribute(name = "FlightNumber")
        protected String flightNumber;

        /**
         * 获取originAirport属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginAirport() {
            return originAirport;
        }

        /**
         * 设置originAirport属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginAirport(String value) {
            this.originAirport = value;
        }

        /**
         * 获取destinationAirport属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationAirport() {
            return destinationAirport;
        }

        /**
         * 设置destinationAirport属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationAirport(String value) {
            this.destinationAirport = value;
        }

        /**
         * 获取carrier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarrier() {
            return carrier;
        }

        /**
         * 设置carrier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarrier(String value) {
            this.carrier = value;
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

    }

}
