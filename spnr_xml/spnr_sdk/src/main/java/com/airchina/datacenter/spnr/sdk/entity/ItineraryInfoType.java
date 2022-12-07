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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItineraryInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItineraryInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" minOccurs="0"/>
 *         &lt;element name="ReservationItems" type="{http://www.opentravel.org/OTA/2003/05}ReservationItemsType" minOccurs="0"/>
 *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingFullInfo_Type" minOccurs="0"/>
 *         &lt;element name="ItineraryPricing" type="{http://www.opentravel.org/OTA/2003/05}ItinPricingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecialRequestDetails">
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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryInfoType", propOrder = {
    "contactInfo",
    "reservationItems",
    "ticketing",
    "itineraryPricing",
    "specialRequestDetails",
    "tpaExtensions"
})
public class ItineraryInfoType {

    @XmlElement(name = "ContactInfo")
    protected ContactPersonType contactInfo;
    @XmlElement(name = "ReservationItems")
    protected ReservationItemsType reservationItems;
    @XmlElement(name = "Ticketing")
    protected TicketingFullInfoType ticketing;
    @XmlElement(name = "ItineraryPricing")
    protected List<ItinPricingType> itineraryPricing;
    @XmlElement(name = "SpecialRequestDetails", required = true)
    protected ItineraryInfoType.SpecialRequestDetails specialRequestDetails;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * 获取contactInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType }
     *     
     */
    public ContactPersonType getContactInfo() {
        return contactInfo;
    }

    /**
     * 设置contactInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType }
     *     
     */
    public void setContactInfo(ContactPersonType value) {
        this.contactInfo = value;
    }

    /**
     * 获取reservationItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReservationItemsType }
     *     
     */
    public ReservationItemsType getReservationItems() {
        return reservationItems;
    }

    /**
     * 设置reservationItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationItemsType }
     *     
     */
    public void setReservationItems(ReservationItemsType value) {
        this.reservationItems = value;
    }

    /**
     * 获取ticketing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TicketingFullInfoType }
     *     
     */
    public TicketingFullInfoType getTicketing() {
        return ticketing;
    }

    /**
     * 设置ticketing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingFullInfoType }
     *     
     */
    public void setTicketing(TicketingFullInfoType value) {
        this.ticketing = value;
    }

    /**
     * Gets the value of the itineraryPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItinPricingType }
     * 
     * 
     */
    public List<ItinPricingType> getItineraryPricing() {
        if (itineraryPricing == null) {
            itineraryPricing = new ArrayList<ItinPricingType>();
        }
        return this.itineraryPricing;
    }

    /**
     * 获取specialRequestDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItineraryInfoType.SpecialRequestDetails }
     *     
     */
    public ItineraryInfoType.SpecialRequestDetails getSpecialRequestDetails() {
        return specialRequestDetails;
    }

    /**
     * 设置specialRequestDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryInfoType.SpecialRequestDetails }
     *     
     */
    public void setSpecialRequestDetails(ItineraryInfoType.SpecialRequestDetails value) {
        this.specialRequestDetails = value;
    }

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
