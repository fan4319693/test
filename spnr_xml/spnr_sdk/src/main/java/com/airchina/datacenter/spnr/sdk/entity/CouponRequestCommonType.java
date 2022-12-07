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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * contains coupon required info collection for creating or updating a coupon.
 * 
 * <p>CouponRequestCommonType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CouponRequestCommonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Post" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="airline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="appUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Orgid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuperPNR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirItinerary" type="{http://www.opentravel.org/OTA/2003/05}AirItineraryType" minOccurs="0"/>
 *         &lt;element name="AirReservation" type="{http://www.opentravel.org/OTA/2003/05}AirReservationType" minOccurs="0"/>
 *         &lt;element name="PriceInfo" type="{http://www.opentravel.org/OTA/2003/05}BookingPriceInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelerInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TravelerInfoType">
 *                 &lt;attribute name="AllTravellerIncl" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Customer" type="{http://www.opentravel.org/OTA/2003/05}OJ_CustomerPrimaryAdditionalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Payments" type="{http://www.opentravel.org/OTA/2003/05}PaymentsType"/>
 *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponRequestCommonType", propOrder = {
    "post",
    "orgid",
    "owner",
    "superPNRID",
    "airItinerary",
    "airReservation",
    "priceInfo",
    "travelerInfo",
    "customer",
    "payments",
    "ticketing"
})
public class CouponRequestCommonType {

    @XmlElement(name = "Post")
    protected CouponRequestCommonType.Post post;
    @XmlElement(name = "Orgid")
    protected String orgid;
    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "SuperPNR_ID")
    protected String superPNRID;
    @XmlElement(name = "AirItinerary")
    protected AirItineraryType airItinerary;
    @XmlElement(name = "AirReservation")
    protected AirReservationType airReservation;
    @XmlElement(name = "PriceInfo")
    protected List<BookingPriceInfoType> priceInfo;
    @XmlElement(name = "TravelerInfo")
    protected CouponRequestCommonType.TravelerInfo travelerInfo;
    @XmlElement(name = "Customer")
    protected List<OJCustomerPrimaryAdditionalType> customer;
    @XmlElement(name = "Payments", required = true)
    protected PaymentsType payments;
    @XmlElement(name = "Ticketing")
    protected List<TicketingInfoType> ticketing;
    @XmlAttribute(name = "Type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String type;

    /**
     * 获取post属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponRequestCommonType.Post }
     *     
     */
    public CouponRequestCommonType.Post getPost() {
        return post;
    }

    /**
     * 设置post属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponRequestCommonType.Post }
     *     
     */
    public void setPost(CouponRequestCommonType.Post value) {
        this.post = value;
    }

    /**
     * 获取orgid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgid() {
        return orgid;
    }

    /**
     * 设置orgid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgid(String value) {
        this.orgid = value;
    }

    /**
     * 获取owner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * 设置owner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
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
     * 获取airItinerary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType }
     *     
     */
    public AirItineraryType getAirItinerary() {
        return airItinerary;
    }

    /**
     * 设置airItinerary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType }
     *     
     */
    public void setAirItinerary(AirItineraryType value) {
        this.airItinerary = value;
    }

    /**
     * 获取airReservation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirReservationType }
     *     
     */
    public AirReservationType getAirReservation() {
        return airReservation;
    }

    /**
     * 设置airReservation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationType }
     *     
     */
    public void setAirReservation(AirReservationType value) {
        this.airReservation = value;
    }

    /**
     * Gets the value of the priceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingPriceInfoType }
     * 
     * 
     */
    public List<BookingPriceInfoType> getPriceInfo() {
        if (priceInfo == null) {
            priceInfo = new ArrayList<BookingPriceInfoType>();
        }
        return this.priceInfo;
    }

    /**
     * 获取travelerInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponRequestCommonType.TravelerInfo }
     *     
     */
    public CouponRequestCommonType.TravelerInfo getTravelerInfo() {
        return travelerInfo;
    }

    /**
     * 设置travelerInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponRequestCommonType.TravelerInfo }
     *     
     */
    public void setTravelerInfo(CouponRequestCommonType.TravelerInfo value) {
        this.travelerInfo = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OJCustomerPrimaryAdditionalType }
     * 
     * 
     */
    public List<OJCustomerPrimaryAdditionalType> getCustomer() {
        if (customer == null) {
            customer = new ArrayList<OJCustomerPrimaryAdditionalType>();
        }
        return this.customer;
    }

    /**
     * 获取payments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentsType }
     *     
     */
    public PaymentsType getPayments() {
        return payments;
    }

    /**
     * 设置payments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsType }
     *     
     */
    public void setPayments(PaymentsType value) {
        this.payments = value;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingInfoType }
     * 
     * 
     */
    public List<TicketingInfoType> getTicketing() {
        if (ticketing == null) {
            ticketing = new ArrayList<TicketingInfoType>();
        }
        return this.ticketing;
    }

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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="airline" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="appUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "airline",
        "userId",
        "userType",
        "version",
        "appUserId"
    })
    public static class Post {

        @XmlElement(required = true)
        protected String airline;
        @XmlElement(required = true)
        protected String userId;
        @XmlElement(required = true)
        protected String userType;
        @XmlElement(required = true)
        protected String version;
        @XmlElement(required = true)
        protected String appUserId;

        /**
         * 获取airline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirline() {
            return airline;
        }

        /**
         * 设置airline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirline(String value) {
            this.airline = value;
        }

        /**
         * 获取userId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserId() {
            return userId;
        }

        /**
         * 设置userId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserId(String value) {
            this.userId = value;
        }

        /**
         * 获取userType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserType() {
            return userType;
        }

        /**
         * 设置userType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserType(String value) {
            this.userType = value;
        }

        /**
         * 获取version属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * 设置version属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * 获取appUserId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppUserId() {
            return appUserId;
        }

        /**
         * 设置appUserId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppUserId(String value) {
            this.appUserId = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TravelerInfoType">
     *       &lt;attribute name="AllTravellerIncl" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelerInfo
        extends TravelerInfoType
    {

        @XmlAttribute(name = "AllTravellerIncl")
        protected Boolean allTravellerIncl;

        /**
         * 获取allTravellerIncl属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllTravellerIncl() {
            return allTravellerIncl;
        }

        /**
         * 设置allTravellerIncl属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllTravellerIncl(Boolean value) {
            this.allTravellerIncl = value;
        }

    }

}
