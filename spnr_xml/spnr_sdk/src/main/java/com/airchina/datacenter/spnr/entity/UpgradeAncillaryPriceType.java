//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Cabin upgrade price information.
 * 
 * <p>UpgradeAncillaryPriceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UpgradeAncillaryPriceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
 *       &lt;sequence>
 *         &lt;element name="UpgradeFrom" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BookingClass" type="{http://www.opentravel.org/OTA/2003/05}UpgradeBookingClassType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UpgradeTo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BookingClass" type="{http://www.opentravel.org/OTA/2003/05}UpgradeBookingClassType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AirTraveler" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PassengerType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AvailabilityRuleID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Available" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeAncillaryPriceType", propOrder = {
    "upgradeFrom",
    "upgradeTo",
    "airTraveler"
})
public class UpgradeAncillaryPriceType
    extends CurrencyAmountType
{

    @XmlElement(name = "UpgradeFrom")
    protected UpgradeAncillaryPriceType.UpgradeFrom upgradeFrom;
    @XmlElement(name = "UpgradeTo")
    protected UpgradeAncillaryPriceType.UpgradeTo upgradeTo;
    @XmlElement(name = "AirTraveler")
    protected UpgradeAncillaryPriceType.AirTraveler airTraveler;
    @XmlAttribute(name = "AvailabilityRuleID")
    protected String availabilityRuleID;
    @XmlAttribute(name = "Available")
    protected BigInteger available;

    /**
     * 获取upgradeFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UpgradeAncillaryPriceType.UpgradeFrom }
     *     
     */
    public UpgradeAncillaryPriceType.UpgradeFrom getUpgradeFrom() {
        return upgradeFrom;
    }

    /**
     * 设置upgradeFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UpgradeAncillaryPriceType.UpgradeFrom }
     *     
     */
    public void setUpgradeFrom(UpgradeAncillaryPriceType.UpgradeFrom value) {
        this.upgradeFrom = value;
    }

    /**
     * 获取upgradeTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UpgradeAncillaryPriceType.UpgradeTo }
     *     
     */
    public UpgradeAncillaryPriceType.UpgradeTo getUpgradeTo() {
        return upgradeTo;
    }

    /**
     * 设置upgradeTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UpgradeAncillaryPriceType.UpgradeTo }
     *     
     */
    public void setUpgradeTo(UpgradeAncillaryPriceType.UpgradeTo value) {
        this.upgradeTo = value;
    }

    /**
     * 获取airTraveler属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UpgradeAncillaryPriceType.AirTraveler }
     *     
     */
    public UpgradeAncillaryPriceType.AirTraveler getAirTraveler() {
        return airTraveler;
    }

    /**
     * 设置airTraveler属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UpgradeAncillaryPriceType.AirTraveler }
     *     
     */
    public void setAirTraveler(UpgradeAncillaryPriceType.AirTraveler value) {
        this.airTraveler = value;
    }

    /**
     * 获取availabilityRuleID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityRuleID() {
        return availabilityRuleID;
    }

    /**
     * 设置availabilityRuleID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityRuleID(String value) {
        this.availabilityRuleID = value;
    }

    /**
     * 获取available属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailable() {
        return available;
    }

    /**
     * 设置available属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailable(BigInteger value) {
        this.available = value;
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
     *         &lt;element name="PassengerType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    @XmlType(name = "", propOrder = {
        "passengerType"
    })
    public static class AirTraveler {

        @XmlElement(name = "PassengerType")
        protected List<UpgradeAncillaryPriceType.AirTraveler.PassengerType> passengerType;

        /**
         * Gets the value of the passengerType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpgradeAncillaryPriceType.AirTraveler.PassengerType }
         * 
         * 
         */
        public List<UpgradeAncillaryPriceType.AirTraveler.PassengerType> getPassengerType() {
            if (passengerType == null) {
                passengerType = new ArrayList<UpgradeAncillaryPriceType.AirTraveler.PassengerType>();
            }
            return this.passengerType;
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
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PassengerType {

            @XmlAttribute(name = "Code")
            @XmlSchemaType(name = "anySimpleType")
            protected String code;

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
     *         &lt;element name="BookingClass" type="{http://www.opentravel.org/OTA/2003/05}UpgradeBookingClassType" maxOccurs="unbounded" minOccurs="0"/>
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
        "bookingClass"
    })
    public static class UpgradeFrom {

        @XmlElement(name = "BookingClass")
        protected List<UpgradeBookingClassType> bookingClass;

        /**
         * Gets the value of the bookingClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpgradeBookingClassType }
         * 
         * 
         */
        public List<UpgradeBookingClassType> getBookingClass() {
            if (bookingClass == null) {
                bookingClass = new ArrayList<UpgradeBookingClassType>();
            }
            return this.bookingClass;
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
     *         &lt;element name="BookingClass" type="{http://www.opentravel.org/OTA/2003/05}UpgradeBookingClassType" maxOccurs="unbounded" minOccurs="0"/>
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
        "bookingClass"
    })
    public static class UpgradeTo {

        @XmlElement(name = "BookingClass")
        protected List<UpgradeBookingClassType> bookingClass;

        /**
         * Gets the value of the bookingClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpgradeBookingClassType }
         * 
         * 
         */
        public List<UpgradeBookingClassType> getBookingClass() {
            if (bookingClass == null) {
                bookingClass = new ArrayList<UpgradeBookingClassType>();
            }
            return this.bookingClass;
        }

    }

}
