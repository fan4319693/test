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
 * Defines rail journey origin and destination location, and time information for the request. Also includes the ability to specify a connection location for the search.
 * 
 * <p>RailOriginDestinationInformationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RailOriginDestinationInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TravelDateTimeType">
 *       &lt;sequence>
 *         &lt;element name="OriginLocation">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="MultiCityStationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DestinationLocation">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="MultiCityStationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ConnectionLocations" type="{http://www.opentravel.org/OTA/2003/05}RailConnectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailOriginDestinationInformationType", propOrder = {
    "originLocation",
    "destinationLocation",
    "connectionLocations"
})
public class RailOriginDestinationInformationType
    extends TravelDateTimeType
{

    @XmlElement(name = "OriginLocation", required = true)
    protected RailOriginDestinationInformationType.OriginLocation originLocation;
    @XmlElement(name = "DestinationLocation", required = true)
    protected RailOriginDestinationInformationType.DestinationLocation destinationLocation;
    @XmlElement(name = "ConnectionLocations")
    protected RailConnectionType connectionLocations;

    /**
     * 获取originLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailOriginDestinationInformationType.OriginLocation }
     *     
     */
    public RailOriginDestinationInformationType.OriginLocation getOriginLocation() {
        return originLocation;
    }

    /**
     * 设置originLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailOriginDestinationInformationType.OriginLocation }
     *     
     */
    public void setOriginLocation(RailOriginDestinationInformationType.OriginLocation value) {
        this.originLocation = value;
    }

    /**
     * 获取destinationLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailOriginDestinationInformationType.DestinationLocation }
     *     
     */
    public RailOriginDestinationInformationType.DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * 设置destinationLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailOriginDestinationInformationType.DestinationLocation }
     *     
     */
    public void setDestinationLocation(RailOriginDestinationInformationType.DestinationLocation value) {
        this.destinationLocation = value;
    }

    /**
     * 获取connectionLocations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailConnectionType }
     *     
     */
    public RailConnectionType getConnectionLocations() {
        return connectionLocations;
    }

    /**
     * 设置connectionLocations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailConnectionType }
     *     
     */
    public void setConnectionLocations(RailConnectionType value) {
        this.connectionLocations = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="MultiCityStationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DestinationLocation
        extends LocationType
    {

        @XmlAttribute(name = "MultiCityStationInd")
        protected Boolean multiCityStationInd;
        @XmlAttribute(name = "AlternateLocationInd")
        protected Boolean alternateLocationInd;

        /**
         * 获取multiCityStationInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMultiCityStationInd() {
            return multiCityStationInd;
        }

        /**
         * 设置multiCityStationInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMultiCityStationInd(Boolean value) {
            this.multiCityStationInd = value;
        }

        /**
         * 获取alternateLocationInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAlternateLocationInd() {
            return alternateLocationInd;
        }

        /**
         * 设置alternateLocationInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAlternateLocationInd(Boolean value) {
            this.alternateLocationInd = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="MultiCityStationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OriginLocation
        extends LocationType
    {

        @XmlAttribute(name = "MultiCityStationInd")
        protected Boolean multiCityStationInd;
        @XmlAttribute(name = "AlternateLocationInd")
        protected Boolean alternateLocationInd;

        /**
         * 获取multiCityStationInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMultiCityStationInd() {
            return multiCityStationInd;
        }

        /**
         * 设置multiCityStationInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMultiCityStationInd(Boolean value) {
            this.multiCityStationInd = value;
        }

        /**
         * 获取alternateLocationInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAlternateLocationInd() {
            return alternateLocationInd;
        }

        /**
         * 设置alternateLocationInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAlternateLocationInd(Boolean value) {
            this.alternateLocationInd = value;
        }

    }

}
