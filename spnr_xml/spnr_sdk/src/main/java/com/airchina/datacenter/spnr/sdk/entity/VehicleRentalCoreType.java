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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The VehicleRentalCoreType complex type identifies the data that is common, or core, to almost every transaction associated with the rental of a vehicle.
 * 
 * <p>VehicleRentalCoreType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="PickUpLocation">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PickUpLocationType">
 *                   &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                   &lt;attribute name="OJVehDepotCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="PickUpVicinity" type="{http://www.opentravel.org/OTA/2003/05}VicinityType"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ReturnLocation">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                   &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                   &lt;attribute name="OJVehDepotCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="ReturnVicinity" type="{http://www.opentravel.org/OTA/2003/05}VicinityType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="PickUpDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="StartChargesDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="StopChargesDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="OneWayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OrigReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalCoreType", propOrder = {
    "pickUpLocation",
    "pickUpVicinity",
    "returnLocation",
    "returnVicinity"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.VehicleRentalTransactionType.PickUpReturnDetails.class,
    com.airchina.datacenter.spnr.sdk.entity.ItineraryItemRequestType.RentalCar.class,
    com.airchina.datacenter.spnr.sdk.entity.ItineraryItemResponseType.RentalCar.class
})
public class VehicleRentalCoreType {

    @XmlElement(name = "PickUpLocation")
    protected VehicleRentalCoreType.PickUpLocation pickUpLocation;
    @XmlElement(name = "PickUpVicinity")
    protected VicinityType pickUpVicinity;
    @XmlElement(name = "ReturnLocation")
    protected VehicleRentalCoreType.ReturnLocation returnLocation;
    @XmlElement(name = "ReturnVicinity")
    protected VicinityType returnVicinity;
    @XmlAttribute(name = "PickUpDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickUpDateTime;
    @XmlAttribute(name = "ReturnDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDateTime;
    @XmlAttribute(name = "StartChargesDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startChargesDateTime;
    @XmlAttribute(name = "StopChargesDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stopChargesDateTime;
    @XmlAttribute(name = "OneWayIndicator")
    protected Boolean oneWayIndicator;
    @XmlAttribute(name = "OrigReturnDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String origReturnDateTime;

    /**
     * 获取pickUpLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreType.PickUpLocation }
     *     
     */
    public VehicleRentalCoreType.PickUpLocation getPickUpLocation() {
        return pickUpLocation;
    }

    /**
     * 设置pickUpLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreType.PickUpLocation }
     *     
     */
    public void setPickUpLocation(VehicleRentalCoreType.PickUpLocation value) {
        this.pickUpLocation = value;
    }

    /**
     * 获取pickUpVicinity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VicinityType }
     *     
     */
    public VicinityType getPickUpVicinity() {
        return pickUpVicinity;
    }

    /**
     * 设置pickUpVicinity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VicinityType }
     *     
     */
    public void setPickUpVicinity(VicinityType value) {
        this.pickUpVicinity = value;
    }

    /**
     * 获取returnLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreType.ReturnLocation }
     *     
     */
    public VehicleRentalCoreType.ReturnLocation getReturnLocation() {
        return returnLocation;
    }

    /**
     * 设置returnLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreType.ReturnLocation }
     *     
     */
    public void setReturnLocation(VehicleRentalCoreType.ReturnLocation value) {
        this.returnLocation = value;
    }

    /**
     * 获取returnVicinity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VicinityType }
     *     
     */
    public VicinityType getReturnVicinity() {
        return returnVicinity;
    }

    /**
     * 设置returnVicinity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VicinityType }
     *     
     */
    public void setReturnVicinity(VicinityType value) {
        this.returnVicinity = value;
    }

    /**
     * 获取pickUpDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpDateTime() {
        return pickUpDateTime;
    }

    /**
     * 设置pickUpDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpDateTime(XMLGregorianCalendar value) {
        this.pickUpDateTime = value;
    }

    /**
     * 获取returnDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDateTime() {
        return returnDateTime;
    }

    /**
     * 设置returnDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDateTime(XMLGregorianCalendar value) {
        this.returnDateTime = value;
    }

    /**
     * 获取startChargesDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartChargesDateTime() {
        return startChargesDateTime;
    }

    /**
     * 设置startChargesDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartChargesDateTime(XMLGregorianCalendar value) {
        this.startChargesDateTime = value;
    }

    /**
     * 获取stopChargesDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStopChargesDateTime() {
        return stopChargesDateTime;
    }

    /**
     * 设置stopChargesDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStopChargesDateTime(XMLGregorianCalendar value) {
        this.stopChargesDateTime = value;
    }

    /**
     * 获取oneWayIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneWayIndicator() {
        return oneWayIndicator;
    }

    /**
     * 设置oneWayIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneWayIndicator(Boolean value) {
        this.oneWayIndicator = value;
    }

    /**
     * 获取origReturnDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigReturnDateTime() {
        return origReturnDateTime;
    }

    /**
     * 设置origReturnDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigReturnDateTime(String value) {
        this.origReturnDateTime = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PickUpLocationType">
     *       &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="OJVehDepotCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PickUpLocation
        extends PickUpLocationType
    {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;
        @XmlAttribute(name = "OJVehDepotCode")
        protected String ojVehDepotCode;

        /**
         * 获取extendedLocationCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedLocationCode() {
            return extendedLocationCode;
        }

        /**
         * 设置extendedLocationCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedLocationCode(String value) {
            this.extendedLocationCode = value;
        }

        /**
         * 获取ojVehDepotCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOJVehDepotCode() {
            return ojVehDepotCode;
        }

        /**
         * 设置ojVehDepotCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOJVehDepotCode(String value) {
            this.ojVehDepotCode = value;
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
     *       &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="OJVehDepotCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReturnLocation
        extends LocationType
    {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;
        @XmlAttribute(name = "OJVehDepotCode")
        protected String ojVehDepotCode;

        /**
         * 获取extendedLocationCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedLocationCode() {
            return extendedLocationCode;
        }

        /**
         * 设置extendedLocationCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedLocationCode(String value) {
            this.extendedLocationCode = value;
        }

        /**
         * 获取ojVehDepotCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOJVehDepotCode() {
            return ojVehDepotCode;
        }

        /**
         * 设置ojVehDepotCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOJVehDepotCode(String value) {
            this.ojVehDepotCode = value;
        }

    }

}
