//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the ship details.
 * 
 * <p>ShipInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShipInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ship" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="StabilizedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RegistrationCountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *                 &lt;attribute name="RestaurantQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="ElevatorQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaxCrewQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="MaxGuestQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="CruisingSpeed" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MaxSpeed" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="InsideCabinQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="OutsideCabinQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="InauguralDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="RefurbishedDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="BuiltDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="NextRefurbishDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShipLength" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShipVoltage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ShipReferenceGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipInfoType", propOrder = {
    "ship",
    "shipLength",
    "shipVoltage"
})
public class ShipInfoType {

    @XmlElement(name = "Ship")
    protected ShipInfoType.Ship ship;
    @XmlElement(name = "ShipLength")
    protected ShipInfoType.ShipLength shipLength;
    @XmlElement(name = "ShipVoltage")
    protected ShipInfoType.ShipVoltage shipVoltage;
    @XmlAttribute(name = "VendorCode")
    protected String vendorCode;
    @XmlAttribute(name = "VendorName")
    protected String vendorName;
    @XmlAttribute(name = "ShipCode")
    protected String shipCode;
    @XmlAttribute(name = "ShipName")
    protected String shipName;
    @XmlAttribute(name = "VendorCodeContext")
    protected String vendorCodeContext;

    /**
     * 获取ship属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipInfoType.Ship }
     *     
     */
    public ShipInfoType.Ship getShip() {
        return ship;
    }

    /**
     * 设置ship属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipInfoType.Ship }
     *     
     */
    public void setShip(ShipInfoType.Ship value) {
        this.ship = value;
    }

    /**
     * 获取shipLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipInfoType.ShipLength }
     *     
     */
    public ShipInfoType.ShipLength getShipLength() {
        return shipLength;
    }

    /**
     * 设置shipLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipInfoType.ShipLength }
     *     
     */
    public void setShipLength(ShipInfoType.ShipLength value) {
        this.shipLength = value;
    }

    /**
     * 获取shipVoltage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipInfoType.ShipVoltage }
     *     
     */
    public ShipInfoType.ShipVoltage getShipVoltage() {
        return shipVoltage;
    }

    /**
     * 设置shipVoltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipInfoType.ShipVoltage }
     *     
     */
    public void setShipVoltage(ShipInfoType.ShipVoltage value) {
        this.shipVoltage = value;
    }

    /**
     * 获取vendorCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * 设置vendorCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * 获取vendorName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * 设置vendorName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * 获取shipCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCode() {
        return shipCode;
    }

    /**
     * 设置shipCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCode(String value) {
        this.shipCode = value;
    }

    /**
     * 获取shipName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipName() {
        return shipName;
    }

    /**
     * 设置shipName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipName(String value) {
        this.shipName = value;
    }

    /**
     * 获取vendorCodeContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCodeContext() {
        return vendorCodeContext;
    }

    /**
     * 设置vendorCodeContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCodeContext(String value) {
        this.vendorCodeContext = value;
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
     *       &lt;attribute name="StabilizedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RegistrationCountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
     *       &lt;attribute name="RestaurantQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="ElevatorQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaxCrewQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="MaxGuestQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="CruisingSpeed" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="MaxSpeed" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="InsideCabinQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="OutsideCabinQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="InauguralDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="RefurbishedDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="BuiltDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="NextRefurbishDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Ship {

        @XmlAttribute(name = "StabilizedIndicator")
        protected Boolean stabilizedIndicator;
        @XmlAttribute(name = "RegistrationCountryCode")
        protected String registrationCountryCode;
        @XmlAttribute(name = "RestaurantQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger restaurantQuantity;
        @XmlAttribute(name = "ElevatorQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger elevatorQuantity;
        @XmlAttribute(name = "MaxCrewQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxCrewQuantity;
        @XmlAttribute(name = "MaxGuestQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxGuestQuantity;
        @XmlAttribute(name = "CruisingSpeed")
        protected BigDecimal cruisingSpeed;
        @XmlAttribute(name = "MaxSpeed")
        protected BigDecimal maxSpeed;
        @XmlAttribute(name = "InsideCabinQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger insideCabinQuantity;
        @XmlAttribute(name = "OutsideCabinQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger outsideCabinQuantity;
        @XmlAttribute(name = "InauguralDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar inauguralDate;
        @XmlAttribute(name = "RefurbishedDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar refurbishedDate;
        @XmlAttribute(name = "BuiltDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar builtDate;
        @XmlAttribute(name = "NextRefurbishDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar nextRefurbishDate;

        /**
         * 获取stabilizedIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isStabilizedIndicator() {
            return stabilizedIndicator;
        }

        /**
         * 设置stabilizedIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setStabilizedIndicator(Boolean value) {
            this.stabilizedIndicator = value;
        }

        /**
         * 获取registrationCountryCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationCountryCode() {
            return registrationCountryCode;
        }

        /**
         * 设置registrationCountryCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationCountryCode(String value) {
            this.registrationCountryCode = value;
        }

        /**
         * 获取restaurantQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRestaurantQuantity() {
            return restaurantQuantity;
        }

        /**
         * 设置restaurantQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRestaurantQuantity(BigInteger value) {
            this.restaurantQuantity = value;
        }

        /**
         * 获取elevatorQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getElevatorQuantity() {
            return elevatorQuantity;
        }

        /**
         * 设置elevatorQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setElevatorQuantity(BigInteger value) {
            this.elevatorQuantity = value;
        }

        /**
         * 获取maxCrewQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxCrewQuantity() {
            return maxCrewQuantity;
        }

        /**
         * 设置maxCrewQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxCrewQuantity(BigInteger value) {
            this.maxCrewQuantity = value;
        }

        /**
         * 获取maxGuestQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxGuestQuantity() {
            return maxGuestQuantity;
        }

        /**
         * 设置maxGuestQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxGuestQuantity(BigInteger value) {
            this.maxGuestQuantity = value;
        }

        /**
         * 获取cruisingSpeed属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCruisingSpeed() {
            return cruisingSpeed;
        }

        /**
         * 设置cruisingSpeed属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCruisingSpeed(BigDecimal value) {
            this.cruisingSpeed = value;
        }

        /**
         * 获取maxSpeed属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxSpeed() {
            return maxSpeed;
        }

        /**
         * 设置maxSpeed属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxSpeed(BigDecimal value) {
            this.maxSpeed = value;
        }

        /**
         * 获取insideCabinQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInsideCabinQuantity() {
            return insideCabinQuantity;
        }

        /**
         * 设置insideCabinQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInsideCabinQuantity(BigInteger value) {
            this.insideCabinQuantity = value;
        }

        /**
         * 获取outsideCabinQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOutsideCabinQuantity() {
            return outsideCabinQuantity;
        }

        /**
         * 设置outsideCabinQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOutsideCabinQuantity(BigInteger value) {
            this.outsideCabinQuantity = value;
        }

        /**
         * 获取inauguralDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getInauguralDate() {
            return inauguralDate;
        }

        /**
         * 设置inauguralDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setInauguralDate(XMLGregorianCalendar value) {
            this.inauguralDate = value;
        }

        /**
         * 获取refurbishedDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRefurbishedDate() {
            return refurbishedDate;
        }

        /**
         * 设置refurbishedDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRefurbishedDate(XMLGregorianCalendar value) {
            this.refurbishedDate = value;
        }

        /**
         * 获取builtDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBuiltDate() {
            return builtDate;
        }

        /**
         * 设置builtDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBuiltDate(XMLGregorianCalendar value) {
            this.builtDate = value;
        }

        /**
         * 获取nextRefurbishDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNextRefurbishDate() {
            return nextRefurbishDate;
        }

        /**
         * 设置nextRefurbishDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNextRefurbishDate(XMLGregorianCalendar value) {
            this.nextRefurbishDate = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ShipLength {

        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * 获取unitOfMeasureQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * 设置unitOfMeasureQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * 获取unitOfMeasure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * 设置unitOfMeasure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

        /**
         * 获取unitOfMeasureCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * 设置unitOfMeasureCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ShipVoltage {

        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * 获取unitOfMeasureQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * 设置unitOfMeasureQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * 获取unitOfMeasure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * 设置unitOfMeasure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

        /**
         * 获取unitOfMeasureCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * 设置unitOfMeasureCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
        }

    }

}
