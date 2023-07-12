//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AssociatedBookingsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AssociatedBookingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Booking" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Product" type="{http://www.opentravel.org/OTA/2003/05}AssociatedBookingProductType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Customer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Primary">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Profile" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                               &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="SuperPNR_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AssociationType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="PARENT"/>
 *                       &lt;enumeration value="CHILD"/>
 *                       &lt;enumeration value="HISTORY"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "AssociatedBookingsType", propOrder = {
    "booking"
})
public class AssociatedBookingsType {

    @XmlElement(name = "Booking")
    protected List<AssociatedBookingsType.Booking> booking;

    /**
     * Gets the value of the booking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the booking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBooking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedBookingsType.Booking }
     * 
     * 
     */
    public List<AssociatedBookingsType.Booking> getBooking() {
        if (booking == null) {
            booking = new ArrayList<AssociatedBookingsType.Booking>();
        }
        return this.booking;
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
     *         &lt;element name="Product" type="{http://www.opentravel.org/OTA/2003/05}AssociatedBookingProductType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Customer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Primary">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Profile" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
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
     *       &lt;attribute name="SuperPNR_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AssociationType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="PARENT"/>
     *             &lt;enumeration value="CHILD"/>
     *             &lt;enumeration value="HISTORY"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "product",
        "customer"
    })
    public static class Booking {

        @XmlElement(name = "Product")
        protected List<AssociatedBookingProductType> product;
        @XmlElement(name = "Customer")
        protected AssociatedBookingsType.Booking.Customer customer;
        @XmlAttribute(name = "SuperPNR_ID", required = true)
        protected String superPNRID;
        @XmlAttribute(name = "BookingStatus")
        protected String bookingStatus;
        @XmlAttribute(name = "AssociationType")
        protected String associationType;

        /**
         * Gets the value of the product property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the product property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssociatedBookingProductType }
         * 
         * 
         */
        public List<AssociatedBookingProductType> getProduct() {
            if (product == null) {
                product = new ArrayList<AssociatedBookingProductType>();
            }
            return this.product;
        }

        /**
         * 获取customer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AssociatedBookingsType.Booking.Customer }
         *     
         */
        public AssociatedBookingsType.Booking.Customer getCustomer() {
            return customer;
        }

        /**
         * 设置customer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AssociatedBookingsType.Booking.Customer }
         *     
         */
        public void setCustomer(AssociatedBookingsType.Booking.Customer value) {
            this.customer = value;
        }

        /**
         * 获取superPNRID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuperPNRID() {
            return superPNRID;
        }

        /**
         * 设置superPNRID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuperPNRID(String value) {
            this.superPNRID = value;
        }

        /**
         * 获取bookingStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingStatus() {
            return bookingStatus;
        }

        /**
         * 设置bookingStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingStatus(String value) {
            this.bookingStatus = value;
        }

        /**
         * 获取associationType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssociationType() {
            return associationType;
        }

        /**
         * 设置associationType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssociationType(String value) {
            this.associationType = value;
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
         *         &lt;element name="Primary">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Profile" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "primary"
        })
        public static class Customer {

            @XmlElement(name = "Primary", required = true)
            protected AssociatedBookingsType.Booking.Customer.Primary primary;

            /**
             * 获取primary属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AssociatedBookingsType.Booking.Customer.Primary }
             *     
             */
            public AssociatedBookingsType.Booking.Customer.Primary getPrimary() {
                return primary;
            }

            /**
             * 设置primary属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AssociatedBookingsType.Booking.Customer.Primary }
             *     
             */
            public void setPrimary(AssociatedBookingsType.Booking.Customer.Primary value) {
                this.primary = value;
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
             *         &lt;element name="Profile" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "profile"
            })
            public static class Primary {

                @XmlElement(name = "Profile")
                protected AssociatedBookingsType.Booking.Customer.Primary.Profile profile;

                /**
                 * 获取profile属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link AssociatedBookingsType.Booking.Customer.Primary.Profile }
                 *     
                 */
                public AssociatedBookingsType.Booking.Customer.Primary.Profile getProfile() {
                    return profile;
                }

                /**
                 * 设置profile属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AssociatedBookingsType.Booking.Customer.Primary.Profile }
                 *     
                 */
                public void setProfile(AssociatedBookingsType.Booking.Customer.Primary.Profile value) {
                    this.profile = value;
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
                 *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
                 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Profile {

                    @XmlAttribute(name = "Type")
                    protected String type;
                    @XmlAttribute(name = "ID")
                    protected String id;

                    /**
                     * 获取type属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * 设置type属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * 获取id属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getID() {
                        return id;
                    }

                    /**
                     * 设置id属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setID(String value) {
                        this.id = value;
                    }

                }

            }

        }

    }

}
