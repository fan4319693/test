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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of flight amenities related to cabin
 * 
 * <p>FlightAmenitiesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightAmenitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aircraft" type="{http://www.opentravel.org/OTA/2003/05}AircraftType"/>
 *         &lt;element name="Beverage" type="{http://www.opentravel.org/OTA/2003/05}BeverageType"/>
 *         &lt;element name="Entertainment" type="{http://www.opentravel.org/OTA/2003/05}EntertainmentType"/>
 *         &lt;element name="FreshFood" type="{http://www.opentravel.org/OTA/2003/05}FreshFoodType"/>
 *         &lt;element name="Layout" type="{http://www.opentravel.org/OTA/2003/05}LayoutType"/>
 *         &lt;element name="Power" type="{http://www.opentravel.org/OTA/2003/05}PowerType"/>
 *         &lt;element name="Wifi" type="{http://www.opentravel.org/OTA/2003/05}WifiType"/>
 *         &lt;element name="Seat">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightAmenityGroup"/>
 *                 &lt;attribute name="Legroom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Pitch" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Flatness" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CabinCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *       &lt;attribute name="SupplierCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightAmenitiesType", propOrder = {
    "aircraft",
    "beverage",
    "entertainment",
    "freshFood",
    "layout",
    "power",
    "wifi",
    "seat"
})
public class FlightAmenitiesType {

    @XmlElement(name = "Aircraft", required = true)
    protected AircraftType aircraft;
    @XmlElement(name = "Beverage", required = true)
    protected BeverageType beverage;
    @XmlElement(name = "Entertainment", required = true)
    protected EntertainmentType entertainment;
    @XmlElement(name = "FreshFood", required = true)
    protected FreshFoodType freshFood;
    @XmlElement(name = "Layout", required = true)
    protected LayoutType layout;
    @XmlElement(name = "Power", required = true)
    protected PowerType power;
    @XmlElement(name = "Wifi", required = true)
    protected WifiType wifi;
    @XmlElement(name = "Seat", required = true)
    protected FlightAmenitiesType.Seat seat;
    @XmlAttribute(name = "CabinCode", required = true)
    protected CabinType cabinCode;
    @XmlAttribute(name = "SupplierCode", required = true)
    protected String supplierCode;

    /**
     * 获取aircraft属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AircraftType }
     *     
     */
    public AircraftType getAircraft() {
        return aircraft;
    }

    /**
     * 设置aircraft属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftType }
     *     
     */
    public void setAircraft(AircraftType value) {
        this.aircraft = value;
    }

    /**
     * 获取beverage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BeverageType }
     *     
     */
    public BeverageType getBeverage() {
        return beverage;
    }

    /**
     * 设置beverage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BeverageType }
     *     
     */
    public void setBeverage(BeverageType value) {
        this.beverage = value;
    }

    /**
     * 获取entertainment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EntertainmentType }
     *     
     */
    public EntertainmentType getEntertainment() {
        return entertainment;
    }

    /**
     * 设置entertainment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EntertainmentType }
     *     
     */
    public void setEntertainment(EntertainmentType value) {
        this.entertainment = value;
    }

    /**
     * 获取freshFood属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreshFoodType }
     *     
     */
    public FreshFoodType getFreshFood() {
        return freshFood;
    }

    /**
     * 设置freshFood属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreshFoodType }
     *     
     */
    public void setFreshFood(FreshFoodType value) {
        this.freshFood = value;
    }

    /**
     * 获取layout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LayoutType }
     *     
     */
    public LayoutType getLayout() {
        return layout;
    }

    /**
     * 设置layout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LayoutType }
     *     
     */
    public void setLayout(LayoutType value) {
        this.layout = value;
    }

    /**
     * 获取power属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerType }
     *     
     */
    public PowerType getPower() {
        return power;
    }

    /**
     * 设置power属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerType }
     *     
     */
    public void setPower(PowerType value) {
        this.power = value;
    }

    /**
     * 获取wifi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WifiType }
     *     
     */
    public WifiType getWifi() {
        return wifi;
    }

    /**
     * 设置wifi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WifiType }
     *     
     */
    public void setWifi(WifiType value) {
        this.wifi = value;
    }

    /**
     * 获取seat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightAmenitiesType.Seat }
     *     
     */
    public FlightAmenitiesType.Seat getSeat() {
        return seat;
    }

    /**
     * 设置seat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightAmenitiesType.Seat }
     *     
     */
    public void setSeat(FlightAmenitiesType.Seat value) {
        this.seat = value;
    }

    /**
     * 获取cabinCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getCabinCode() {
        return cabinCode;
    }

    /**
     * 设置cabinCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setCabinCode(CabinType value) {
        this.cabinCode = value;
    }

    /**
     * 获取supplierCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * 设置supplierCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightAmenityGroup"/>
     *       &lt;attribute name="Legroom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Pitch" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Flatness" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Seat {

        @XmlAttribute(name = "Legroom", required = true)
        protected String legroom;
        @XmlAttribute(name = "Pitch", required = true)
        protected String pitch;
        @XmlAttribute(name = "Width", required = true)
        protected String width;
        @XmlAttribute(name = "Flatness", required = true)
        protected String flatness;
        @XmlAttribute(name = "ID", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlAttribute(name = "QualityLevel", required = true)
        protected String qualityLevel;
        @XmlAttribute(name = "Info", required = true)
        protected String info;
        @XmlAttribute(name = "Available")
        protected Boolean available;
        @XmlAttribute(name = "Text")
        protected String text;

        /**
         * 获取legroom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegroom() {
            return legroom;
        }

        /**
         * 设置legroom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegroom(String value) {
            this.legroom = value;
        }

        /**
         * 获取pitch属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPitch() {
            return pitch;
        }

        /**
         * 设置pitch属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPitch(String value) {
            this.pitch = value;
        }

        /**
         * 获取width属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWidth() {
            return width;
        }

        /**
         * 设置width属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWidth(String value) {
            this.width = value;
        }

        /**
         * 获取flatness属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlatness() {
            return flatness;
        }

        /**
         * 设置flatness属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlatness(String value) {
            this.flatness = value;
        }

        /**
         * 获取id属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getID() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setID(BigInteger value) {
            this.id = value;
        }

        /**
         * 获取qualityLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualityLevel() {
            return qualityLevel;
        }

        /**
         * 设置qualityLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualityLevel(String value) {
            this.qualityLevel = value;
        }

        /**
         * 获取info属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * 设置info属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
        }

        /**
         * 获取available属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAvailable() {
            return available;
        }

        /**
         * 设置available属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAvailable(Boolean value) {
            this.available = value;
        }

        /**
         * 获取text属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * 设置text属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

    }

}
