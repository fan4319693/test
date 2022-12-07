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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Code and optional string to describe a location point.
 * 
 * <p>LocationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
 *       &lt;attribute name="LocationCategory" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Identifier" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="TS_CityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "value"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.ConnectionType.ConnectionLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.RailOriginDestinationInformationType.OriginLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.RailOriginDestinationInformationType.DestinationLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.RailConnectionType.ConnectionLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.OriginDestinationInformationType.OriginLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.OriginDestinationInformationType.DestinationLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.VerificationType.StartLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.VerificationType.EndLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.VehicleAvailCoreType.VendorLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.VehicleAvailCoreType.DropOffLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.RailOriginDestinationSummaryType.OriginLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.RailOriginDestinationSummaryType.DestinationLocation.class,
    com.airchina.datacenter.spnr.sdk.entity.SailingBaseType.DeparturePort.class,
    com.airchina.datacenter.spnr.sdk.entity.SailingBaseType.ArrivalPort.class,
    com.airchina.datacenter.spnr.sdk.entity.ItemSearchCriterionType.CodeRef.class,
    StationType.class,
    AirportPrefType.class,
    com.airchina.datacenter.spnr.sdk.entity.VehicleRentalCoreType.ReturnLocation.class
})
public class LocationType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LocationCategory")
    @XmlSchemaType(name = "anySimpleType")
    protected String locationCategory;
    @XmlAttribute(name = "Identifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String identifier;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "TS_CityCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String tsCityCode;
    @XmlAttribute(name = "LocationCode", required = true)
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "HaulZone")
    protected String haulZone;

    /**
     * 获取value属性的值。
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
     * 获取locationCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCategory() {
        return locationCategory;
    }

    /**
     * 设置locationCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCategory(String value) {
        this.locationCategory = value;
    }

    /**
     * 获取identifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 设置identifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
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

}
