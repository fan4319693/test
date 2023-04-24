//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

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
 * <p>ReservationItemsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReservationItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TravelSegmentType">
 *                 &lt;attribute name="ItinSeqNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="IsPassive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="IssueBoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="BoardingPassIssued" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ItemPricing" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ItinPricingType">
 *                 &lt;sequence>
 *                   &lt;element name="AirFareInfo" type="{http://www.opentravel.org/OTA/2003/05}BookingPriceInfoType"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialRequestDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ChronoOrdered" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationItemsType", propOrder = {
    "item",
    "itemPricing",
    "specialRequestDetails"
})
public class ReservationItemsType {

    @XmlElement(name = "Item", required = true)
    protected List<ReservationItemsType.Item> item;
    @XmlElement(name = "ItemPricing")
    protected List<ReservationItemsType.ItemPricing> itemPricing;
    @XmlElement(name = "SpecialRequestDetails")
    protected ReservationItemsType.SpecialRequestDetails specialRequestDetails;
    @XmlAttribute(name = "ChronoOrdered")
    protected Boolean chronoOrdered;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationItemsType.Item }
     * 
     * 
     */
    public List<ReservationItemsType.Item> getItem() {
        if (item == null) {
            item = new ArrayList<ReservationItemsType.Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the itemPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationItemsType.ItemPricing }
     * 
     * 
     */
    public List<ReservationItemsType.ItemPricing> getItemPricing() {
        if (itemPricing == null) {
            itemPricing = new ArrayList<ReservationItemsType.ItemPricing>();
        }
        return this.itemPricing;
    }

    /**
     * 获取specialRequestDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReservationItemsType.SpecialRequestDetails }
     *     
     */
    public ReservationItemsType.SpecialRequestDetails getSpecialRequestDetails() {
        return specialRequestDetails;
    }

    /**
     * 设置specialRequestDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationItemsType.SpecialRequestDetails }
     *     
     */
    public void setSpecialRequestDetails(ReservationItemsType.SpecialRequestDetails value) {
        this.specialRequestDetails = value;
    }

    /**
     * 获取chronoOrdered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChronoOrdered() {
        return chronoOrdered;
    }

    /**
     * 设置chronoOrdered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChronoOrdered(Boolean value) {
        this.chronoOrdered = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TravelSegmentType">
     *       &lt;attribute name="ItinSeqNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="IsPassive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="IssueBoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="BoardingPassIssued" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Item
        extends TravelSegmentType
    {

        @XmlAttribute(name = "ItinSeqNumber")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger itinSeqNumber;
        @XmlAttribute(name = "IsPassive")
        protected Boolean isPassive;
        @XmlAttribute(name = "IssueBoardingPass")
        protected Boolean issueBoardingPass;
        @XmlAttribute(name = "BoardingPassIssued")
        protected Boolean boardingPassIssued;

        /**
         * 获取itinSeqNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getItinSeqNumber() {
            return itinSeqNumber;
        }

        /**
         * 设置itinSeqNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setItinSeqNumber(BigInteger value) {
            this.itinSeqNumber = value;
        }

        /**
         * 获取isPassive属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isIsPassive() {
            if (isPassive == null) {
                return false;
            } else {
                return isPassive;
            }
        }

        /**
         * 设置isPassive属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsPassive(Boolean value) {
            this.isPassive = value;
        }

        /**
         * 获取issueBoardingPass属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIssueBoardingPass() {
            return issueBoardingPass;
        }

        /**
         * 设置issueBoardingPass属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIssueBoardingPass(Boolean value) {
            this.issueBoardingPass = value;
        }

        /**
         * 获取boardingPassIssued属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBoardingPassIssued() {
            return boardingPassIssued;
        }

        /**
         * 设置boardingPassIssued属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBoardingPassIssued(Boolean value) {
            this.boardingPassIssued = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ItinPricingType">
     *       &lt;sequence>
     *         &lt;element name="AirFareInfo" type="{http://www.opentravel.org/OTA/2003/05}BookingPriceInfoType"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airFareInfo"
    })
    public static class ItemPricing
        extends ItinPricingType
    {

        @XmlElement(name = "AirFareInfo", required = true)
        protected BookingPriceInfoType airFareInfo;

        /**
         * 获取airFareInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BookingPriceInfoType }
         *     
         */
        public BookingPriceInfoType getAirFareInfo() {
            return airFareInfo;
        }

        /**
         * 设置airFareInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BookingPriceInfoType }
         *     
         */
        public void setAirFareInfo(BookingPriceInfoType value) {
            this.airFareInfo = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpaExtensions"
    })
    public static class SpecialRequestDetails
        extends SpecialReqDetailsType
    {

        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;

        /**
         * 获取tpaExtensions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensionsType }
         *     
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * 设置tpaExtensions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensionsType }
         *     
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
        }

    }

}
