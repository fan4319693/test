//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines rail journey origin and destination location, and time information for the request. Also includes the ability to specify a connection location for the search.
 * 
 * <p>RailOriginDestinationSummaryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RailOriginDestinationSummaryType">
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
 *         &lt;element name="ConnectionLocation" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OperatorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="5" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *                 &lt;attribute name="MultiCityStationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Preferences" type="{http://www.opentravel.org/OTA/2003/05}RailAvailPrefsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailOriginDestinationSummaryType", propOrder = {
    "originLocation",
    "destinationLocation",
    "connectionLocation",
    "preferences"
})
public class RailOriginDestinationSummaryType
    extends TravelDateTimeType
{

    @XmlElement(name = "OriginLocation", required = true)
    protected RailOriginDestinationSummaryType.OriginLocation originLocation;
    @XmlElement(name = "DestinationLocation", required = true)
    protected RailOriginDestinationSummaryType.DestinationLocation destinationLocation;
    @XmlElement(name = "ConnectionLocation")
    protected List<RailOriginDestinationSummaryType.ConnectionLocation> connectionLocation;
    @XmlElement(name = "Preferences")
    protected RailAvailPrefsType preferences;

    /**
     * 获取originLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailOriginDestinationSummaryType.OriginLocation }
     *     
     */
    public RailOriginDestinationSummaryType.OriginLocation getOriginLocation() {
        return originLocation;
    }

    /**
     * 设置originLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailOriginDestinationSummaryType.OriginLocation }
     *     
     */
    public void setOriginLocation(RailOriginDestinationSummaryType.OriginLocation value) {
        this.originLocation = value;
    }

    /**
     * 获取destinationLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailOriginDestinationSummaryType.DestinationLocation }
     *     
     */
    public RailOriginDestinationSummaryType.DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * 设置destinationLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailOriginDestinationSummaryType.DestinationLocation }
     *     
     */
    public void setDestinationLocation(RailOriginDestinationSummaryType.DestinationLocation value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the connectionLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailOriginDestinationSummaryType.ConnectionLocation }
     * 
     * 
     */
    public List<RailOriginDestinationSummaryType.ConnectionLocation> getConnectionLocation() {
        if (connectionLocation == null) {
            connectionLocation = new ArrayList<RailOriginDestinationSummaryType.ConnectionLocation>();
        }
        return this.connectionLocation;
    }

    /**
     * 获取preferences属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailAvailPrefsType }
     *     
     */
    public RailAvailPrefsType getPreferences() {
        return preferences;
    }

    /**
     * 设置preferences属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailAvailPrefsType }
     *     
     */
    public void setPreferences(RailAvailPrefsType value) {
        this.preferences = value;
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
     *         &lt;element name="OperatorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="5" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
     *       &lt;attribute name="MultiCityStationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operatorPref"
    })
    public static class ConnectionLocation {

        @XmlElement(name = "OperatorPref")
        protected List<CompanyNamePrefType> operatorPref;
        @XmlAttribute(name = "MultiCityStationInd")
        protected Boolean multiCityStationInd;
        @XmlAttribute(name = "LocationCode", required = true)
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "HaulZone")
        protected String haulZone;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;

        /**
         * Gets the value of the operatorPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operatorPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperatorPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyNamePrefType }
         * 
         * 
         */
        public List<CompanyNamePrefType> getOperatorPref() {
            if (operatorPref == null) {
                operatorPref = new ArrayList<CompanyNamePrefType>();
            }
            return this.operatorPref;
        }

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
         * 获取haulZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHaulZone() {
            if (haulZone == null) {
                return "GB";
            } else {
                return haulZone;
            }
        }

        /**
         * 设置haulZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHaulZone(String value) {
            this.haulZone = value;
        }

        /**
         * 获取preferLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            if (preferLevel == null) {
                return PreferLevelType.PREFERRED;
            } else {
                return preferLevel;
            }
        }

        /**
         * 设置preferLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
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
