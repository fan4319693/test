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
 * Request data for any valid item of inventory.
 * 
 * <p>ItineraryItemRequestType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItineraryItemRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Accommodation" type="{http://www.opentravel.org/OTA/2003/05}AccommodationSegmentRequestType"/>
 *         &lt;element name="Flight" type="{http://www.opentravel.org/OTA/2003/05}PkgFlightSegmentType"/>
 *         &lt;element name="RentalCar">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType">
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryItemRequestType", propOrder = {
    "accommodation",
    "flight",
    "rentalCar"
})
public class ItineraryItemRequestType {

    @XmlElement(name = "Accommodation")
    protected AccommodationSegmentRequestType accommodation;
    @XmlElement(name = "Flight")
    protected PkgFlightSegmentType flight;
    @XmlElement(name = "RentalCar")
    protected ItineraryItemRequestType.RentalCar rentalCar;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * 获取accommodation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccommodationSegmentRequestType }
     *     
     */
    public AccommodationSegmentRequestType getAccommodation() {
        return accommodation;
    }

    /**
     * 设置accommodation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationSegmentRequestType }
     *     
     */
    public void setAccommodation(AccommodationSegmentRequestType value) {
        this.accommodation = value;
    }

    /**
     * 获取flight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PkgFlightSegmentType }
     *     
     */
    public PkgFlightSegmentType getFlight() {
        return flight;
    }

    /**
     * 设置flight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PkgFlightSegmentType }
     *     
     */
    public void setFlight(PkgFlightSegmentType value) {
        this.flight = value;
    }

    /**
     * 获取rentalCar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItineraryItemRequestType.RentalCar }
     *     
     */
    public ItineraryItemRequestType.RentalCar getRentalCar() {
        return rentalCar;
    }

    /**
     * 设置rentalCar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryItemRequestType.RentalCar }
     *     
     */
    public void setRentalCar(ItineraryItemRequestType.RentalCar value) {
        this.rentalCar = value;
    }

    /**
     * 获取rph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * 设置rph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType">
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RentalCar
        extends VehicleRentalCoreType
    {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * 获取rph属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * 设置rph属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
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

    }

}
