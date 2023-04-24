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
 * A collection of information that specifies how the reservation restriction should be prcessed.
 * 
 * <p>HotelReservationRestrictionsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelReservationRestrictionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IgnoreItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MinAdvBookingOffSet" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Actived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MaxAdvBookingOffset" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Actived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
 *       &lt;attribute name="Mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationRestrictionsType", propOrder = {
    "ignoreItems"
})
public class HotelReservationRestrictionsType {

    @XmlElement(name = "IgnoreItems")
    protected HotelReservationRestrictionsType.IgnoreItems ignoreItems;
    @XmlAttribute(name = "Mode")
    protected String mode;

    /**
     * 获取ignoreItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationRestrictionsType.IgnoreItems }
     *     
     */
    public HotelReservationRestrictionsType.IgnoreItems getIgnoreItems() {
        return ignoreItems;
    }

    /**
     * 设置ignoreItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationRestrictionsType.IgnoreItems }
     *     
     */
    public void setIgnoreItems(HotelReservationRestrictionsType.IgnoreItems value) {
        this.ignoreItems = value;
    }

    /**
     * 获取mode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
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
     *         &lt;element name="MinAdvBookingOffSet" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Actived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MaxAdvBookingOffset" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Actived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "minAdvBookingOffSet",
        "maxAdvBookingOffset"
    })
    public static class IgnoreItems {

        @XmlElement(name = "MinAdvBookingOffSet")
        protected HotelReservationRestrictionsType.IgnoreItems.MinAdvBookingOffSet minAdvBookingOffSet;
        @XmlElement(name = "MaxAdvBookingOffset")
        protected HotelReservationRestrictionsType.IgnoreItems.MaxAdvBookingOffset maxAdvBookingOffset;

        /**
         * 获取minAdvBookingOffSet属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HotelReservationRestrictionsType.IgnoreItems.MinAdvBookingOffSet }
         *     
         */
        public HotelReservationRestrictionsType.IgnoreItems.MinAdvBookingOffSet getMinAdvBookingOffSet() {
            return minAdvBookingOffSet;
        }

        /**
         * 设置minAdvBookingOffSet属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HotelReservationRestrictionsType.IgnoreItems.MinAdvBookingOffSet }
         *     
         */
        public void setMinAdvBookingOffSet(HotelReservationRestrictionsType.IgnoreItems.MinAdvBookingOffSet value) {
            this.minAdvBookingOffSet = value;
        }

        /**
         * 获取maxAdvBookingOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HotelReservationRestrictionsType.IgnoreItems.MaxAdvBookingOffset }
         *     
         */
        public HotelReservationRestrictionsType.IgnoreItems.MaxAdvBookingOffset getMaxAdvBookingOffset() {
            return maxAdvBookingOffset;
        }

        /**
         * 设置maxAdvBookingOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HotelReservationRestrictionsType.IgnoreItems.MaxAdvBookingOffset }
         *     
         */
        public void setMaxAdvBookingOffset(HotelReservationRestrictionsType.IgnoreItems.MaxAdvBookingOffset value) {
            this.maxAdvBookingOffset = value;
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
         *       &lt;attribute name="Actived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MaxAdvBookingOffset {

            @XmlAttribute(name = "Actived")
            protected Boolean actived;

            /**
             * 获取actived属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isActived() {
                return actived;
            }

            /**
             * 设置actived属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setActived(Boolean value) {
                this.actived = value;
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
         *       &lt;attribute name="Actived" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MinAdvBookingOffSet {

            @XmlAttribute(name = "Actived")
            protected Boolean actived;

            /**
             * 获取actived属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isActived() {
                return actived;
            }

            /**
             * 设置actived属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setActived(Boolean value) {
                this.actived = value;
            }

        }

    }

}
