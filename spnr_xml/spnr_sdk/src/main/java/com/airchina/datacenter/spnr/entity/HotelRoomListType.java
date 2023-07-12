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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Provides the details of a rooming list.
 * 
 * <p>HotelRoomListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelRoomListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="Guests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Guest" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
 *                           &lt;sequence>
 *                             &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                             &lt;element name="Loyalty" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="GuaranteePayment" maxOccurs="2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelPaymentFormType">
 *                                     &lt;attribute name="DetailType">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="Payment"/>
 *                                           &lt;enumeration value="Guarantee"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="GuaranteeType">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32">
 *                                           &lt;enumeration value="GuaranteeRequired"/>
 *                                           &lt;enumeration value="None"/>
 *                                           &lt;enumeration value="CC/DC/Voucher"/>
 *                                           &lt;enumeration value="Profile"/>
 *                                           &lt;enumeration value="Deposit"/>
 *                                           &lt;enumeration value="PrePay"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AdditionalDetails" type="{http://www.opentravel.org/OTA/2003/05}AdditionalDetailsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="GuestAction" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                           &lt;attribute name="PrintConfoInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MasterContact" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueIDs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="9" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Loyalty" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MasterAccount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DirectBillType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BillingType"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoomStays" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomStay" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationIDsType" minOccurs="0"/>
 *                             &lt;element name="RoomShares" type="{http://www.opentravel.org/OTA/2003/05}RoomSharesType" minOccurs="0"/>
 *                             &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                             &lt;choice minOccurs="0">
 *                               &lt;sequence>
 *                                 &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType"/>
 *                                 &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
 *                               &lt;/sequence>
 *                               &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType"/>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RoomStay" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Event" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EventContact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                 &lt;attribute name="MeetingName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
 *       &lt;attribute name="GroupBlockCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomListType", propOrder = {
    "uniqueID",
    "guests",
    "masterContact",
    "masterAccount",
    "roomStays",
    "event"
})
public class HotelRoomListType {

    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "Guests")
    protected HotelRoomListType.Guests guests;
    @XmlElement(name = "MasterContact")
    protected HotelRoomListType.MasterContact masterContact;
    @XmlElement(name = "MasterAccount")
    protected HotelRoomListType.MasterAccount masterAccount;
    @XmlElement(name = "RoomStays")
    protected HotelRoomListType.RoomStays roomStays;
    @XmlElement(name = "Event")
    protected HotelRoomListType.Event event;
    @XmlAttribute(name = "GroupBlockCode")
    protected String groupBlockCode;
    @XmlAttribute(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlAttribute(name = "BookingOfficeCode")
    protected String bookingOfficeCode;
    @XmlAttribute(name = "ChainCode")
    protected String chainCode;
    @XmlAttribute(name = "BrandCode")
    protected String brandCode;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "HotelCityCode")
    protected String hotelCityCode;
    @XmlAttribute(name = "HotelCityCodeContext")
    protected String hotelCityCodeContext;
    @XmlAttribute(name = "HotelName")
    protected String hotelName;
    @XmlAttribute(name = "HotelCodeContext")
    protected String hotelCodeContext;
    @XmlAttribute(name = "ChainName")
    protected String chainName;
    @XmlAttribute(name = "BrandName")
    protected String brandName;
    @XmlAttribute(name = "InvoiceIssuer")
    protected String invoiceIssuer;
    @XmlAttribute(name = "StayType")
    protected String stayType;
    @XmlAttribute(name = "AreaID")
    protected String areaID;

    /**
     * 获取uniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * 设置uniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * 获取guests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomListType.Guests }
     *     
     */
    public HotelRoomListType.Guests getGuests() {
        return guests;
    }

    /**
     * 设置guests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomListType.Guests }
     *     
     */
    public void setGuests(HotelRoomListType.Guests value) {
        this.guests = value;
    }

    /**
     * 获取masterContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomListType.MasterContact }
     *     
     */
    public HotelRoomListType.MasterContact getMasterContact() {
        return masterContact;
    }

    /**
     * 设置masterContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomListType.MasterContact }
     *     
     */
    public void setMasterContact(HotelRoomListType.MasterContact value) {
        this.masterContact = value;
    }

    /**
     * 获取masterAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomListType.MasterAccount }
     *     
     */
    public HotelRoomListType.MasterAccount getMasterAccount() {
        return masterAccount;
    }

    /**
     * 设置masterAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomListType.MasterAccount }
     *     
     */
    public void setMasterAccount(HotelRoomListType.MasterAccount value) {
        this.masterAccount = value;
    }

    /**
     * 获取roomStays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomListType.RoomStays }
     *     
     */
    public HotelRoomListType.RoomStays getRoomStays() {
        return roomStays;
    }

    /**
     * 设置roomStays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomListType.RoomStays }
     *     
     */
    public void setRoomStays(HotelRoomListType.RoomStays value) {
        this.roomStays = value;
    }

    /**
     * 获取event属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomListType.Event }
     *     
     */
    public HotelRoomListType.Event getEvent() {
        return event;
    }

    /**
     * 设置event属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomListType.Event }
     *     
     */
    public void setEvent(HotelRoomListType.Event value) {
        this.event = value;
    }

    /**
     * 获取groupBlockCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupBlockCode() {
        return groupBlockCode;
    }

    /**
     * 设置groupBlockCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupBlockCode(String value) {
        this.groupBlockCode = value;
    }

    /**
     * 获取creationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * 设置creationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * 获取bookingOfficeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingOfficeCode() {
        return bookingOfficeCode;
    }

    /**
     * 设置bookingOfficeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingOfficeCode(String value) {
        this.bookingOfficeCode = value;
    }

    /**
     * 获取chainCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainCode() {
        return chainCode;
    }

    /**
     * 设置chainCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainCode(String value) {
        this.chainCode = value;
    }

    /**
     * 获取brandCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * 设置brandCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * 获取hotelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * 设置hotelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * 获取hotelCityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCityCode() {
        return hotelCityCode;
    }

    /**
     * 设置hotelCityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCityCode(String value) {
        this.hotelCityCode = value;
    }

    /**
     * 获取hotelCityCodeContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCityCodeContext() {
        return hotelCityCodeContext;
    }

    /**
     * 设置hotelCityCodeContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCityCodeContext(String value) {
        this.hotelCityCodeContext = value;
    }

    /**
     * 获取hotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * 获取hotelCodeContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCodeContext() {
        return hotelCodeContext;
    }

    /**
     * 设置hotelCodeContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCodeContext(String value) {
        this.hotelCodeContext = value;
    }

    /**
     * 获取chainName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * 设置chainName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainName(String value) {
        this.chainName = value;
    }

    /**
     * 获取brandName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置brandName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * 获取invoiceIssuer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceIssuer() {
        return invoiceIssuer;
    }

    /**
     * 设置invoiceIssuer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceIssuer(String value) {
        this.invoiceIssuer = value;
    }

    /**
     * 获取stayType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStayType() {
        return stayType;
    }

    /**
     * 设置stayType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStayType(String value) {
        this.stayType = value;
    }

    /**
     * 获取areaID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaID() {
        return areaID;
    }

    /**
     * 设置areaID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaID(String value) {
        this.areaID = value;
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
     *         &lt;element name="EventContact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *       &lt;attribute name="MeetingName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eventContact"
    })
    public static class Event {

        @XmlElement(name = "EventContact", required = true)
        protected ContactPersonType eventContact;
        @XmlAttribute(name = "MeetingName")
        protected String meetingName;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected BigInteger duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "RangeNum")
        protected BigInteger rangeNum;
        @XmlAttribute(name = "SearchTimeZone")
        protected String searchTimeZone;

        /**
         * 获取eventContact属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ContactPersonType }
         *     
         */
        public ContactPersonType getEventContact() {
            return eventContact;
        }

        /**
         * 设置eventContact属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ContactPersonType }
         *     
         */
        public void setEventContact(ContactPersonType value) {
            this.eventContact = value;
        }

        /**
         * 获取meetingName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeetingName() {
            return meetingName;
        }

        /**
         * 设置meetingName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeetingName(String value) {
            this.meetingName = value;
        }

        /**
         * 获取start属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * 设置start属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
            this.duration = value;
        }

        /**
         * 获取end属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * 设置end属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRangeNum(BigInteger value) {
            this.rangeNum = value;
        }

        /**
         * 获取searchTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchTimeZone() {
            return searchTimeZone;
        }

        /**
         * 设置searchTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchTimeZone(String value) {
            this.searchTimeZone = value;
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
     *         &lt;element name="Guest" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
     *                 &lt;sequence>
     *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *                   &lt;element name="Loyalty" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="GuaranteePayment" maxOccurs="2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelPaymentFormType">
     *                           &lt;attribute name="DetailType">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="Payment"/>
     *                                 &lt;enumeration value="Guarantee"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="GuaranteeType">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32">
     *                                 &lt;enumeration value="GuaranteeRequired"/>
     *                                 &lt;enumeration value="None"/>
     *                                 &lt;enumeration value="CC/DC/Voucher"/>
     *                                 &lt;enumeration value="Profile"/>
     *                                 &lt;enumeration value="Deposit"/>
     *                                 &lt;enumeration value="PrePay"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AdditionalDetails" type="{http://www.opentravel.org/OTA/2003/05}AdditionalDetailsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="GuestAction" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *                 &lt;attribute name="PrintConfoInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
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
        "guest"
    })
    public static class Guests {

        @XmlElement(name = "Guest", required = true)
        protected List<HotelRoomListType.Guests.Guest> guest;

        /**
         * Gets the value of the guest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelRoomListType.Guests.Guest }
         * 
         * 
         */
        public List<HotelRoomListType.Guests.Guest> getGuest() {
            if (guest == null) {
                guest = new ArrayList<HotelRoomListType.Guests.Guest>();
            }
            return this.guest;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
         *       &lt;sequence>
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
         *         &lt;element name="Loyalty" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="GuaranteePayment" maxOccurs="2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelPaymentFormType">
         *                 &lt;attribute name="DetailType">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="Payment"/>
         *                       &lt;enumeration value="Guarantee"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="GuaranteeType">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32">
         *                       &lt;enumeration value="GuaranteeRequired"/>
         *                       &lt;enumeration value="None"/>
         *                       &lt;enumeration value="CC/DC/Voucher"/>
         *                       &lt;enumeration value="Profile"/>
         *                       &lt;enumeration value="Deposit"/>
         *                       &lt;enumeration value="PrePay"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AdditionalDetails" type="{http://www.opentravel.org/OTA/2003/05}AdditionalDetailsType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="GuestAction" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *       &lt;attribute name="PrintConfoInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "uniqueID",
            "loyalty",
            "guaranteePayment",
            "additionalDetails"
        })
        public static class Guest
            extends ContactPersonType
        {

            @XmlElement(name = "UniqueID")
            protected UniqueIDType uniqueID;
            @XmlElement(name = "Loyalty")
            protected List<HotelRoomListType.Guests.Guest.Loyalty> loyalty;
            @XmlElement(name = "GuaranteePayment")
            protected List<HotelRoomListType.Guests.Guest.GuaranteePayment> guaranteePayment;
            @XmlElement(name = "AdditionalDetails")
            protected AdditionalDetailsType additionalDetails;
            @XmlAttribute(name = "GuestAction")
            protected ActionType guestAction;
            @XmlAttribute(name = "PrintConfoInd")
            protected Boolean printConfoInd;

            /**
             * 获取uniqueID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link UniqueIDType }
             *     
             */
            public UniqueIDType getUniqueID() {
                return uniqueID;
            }

            /**
             * 设置uniqueID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link UniqueIDType }
             *     
             */
            public void setUniqueID(UniqueIDType value) {
                this.uniqueID = value;
            }

            /**
             * Gets the value of the loyalty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the loyalty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLoyalty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link HotelRoomListType.Guests.Guest.Loyalty }
             * 
             * 
             */
            public List<HotelRoomListType.Guests.Guest.Loyalty> getLoyalty() {
                if (loyalty == null) {
                    loyalty = new ArrayList<HotelRoomListType.Guests.Guest.Loyalty>();
                }
                return this.loyalty;
            }

            /**
             * Gets the value of the guaranteePayment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the guaranteePayment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGuaranteePayment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link HotelRoomListType.Guests.Guest.GuaranteePayment }
             * 
             * 
             */
            public List<HotelRoomListType.Guests.Guest.GuaranteePayment> getGuaranteePayment() {
                if (guaranteePayment == null) {
                    guaranteePayment = new ArrayList<HotelRoomListType.Guests.Guest.GuaranteePayment>();
                }
                return this.guaranteePayment;
            }

            /**
             * 获取additionalDetails属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AdditionalDetailsType }
             *     
             */
            public AdditionalDetailsType getAdditionalDetails() {
                return additionalDetails;
            }

            /**
             * 设置additionalDetails属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalDetailsType }
             *     
             */
            public void setAdditionalDetails(AdditionalDetailsType value) {
                this.additionalDetails = value;
            }

            /**
             * 获取guestAction属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getGuestAction() {
                return guestAction;
            }

            /**
             * 设置guestAction属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setGuestAction(ActionType value) {
                this.guestAction = value;
            }

            /**
             * 获取printConfoInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPrintConfoInd() {
                return printConfoInd;
            }

            /**
             * 设置printConfoInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPrintConfoInd(Boolean value) {
                this.printConfoInd = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelPaymentFormType">
             *       &lt;attribute name="DetailType">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="Payment"/>
             *             &lt;enumeration value="Guarantee"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="GuaranteeType">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32">
             *             &lt;enumeration value="GuaranteeRequired"/>
             *             &lt;enumeration value="None"/>
             *             &lt;enumeration value="CC/DC/Voucher"/>
             *             &lt;enumeration value="Profile"/>
             *             &lt;enumeration value="Deposit"/>
             *             &lt;enumeration value="PrePay"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class GuaranteePayment
                extends HotelPaymentFormType
            {

                @XmlAttribute(name = "DetailType")
                protected String detailType;
                @XmlAttribute(name = "GuaranteeType")
                protected String guaranteeType;

                /**
                 * 获取detailType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDetailType() {
                    return detailType;
                }

                /**
                 * 设置detailType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDetailType(String value) {
                    this.detailType = value;
                }

                /**
                 * 获取guaranteeType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGuaranteeType() {
                    return guaranteeType;
                }

                /**
                 * 设置guaranteeType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGuaranteeType(String value) {
                    this.guaranteeType = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Loyalty {

                @XmlAttribute(name = "ReservationActionType")
                protected String reservationActionType;
                @XmlAttribute(name = "SelectedLoyaltyRPH")
                protected String selectedLoyaltyRPH;
                @XmlAttribute(name = "ProgramCode")
                protected String programCode;
                @XmlAttribute(name = "BonusCode")
                protected String bonusCode;
                @XmlAttribute(name = "AccountID")
                protected String accountID;
                @XmlAttribute(name = "PointsEarned")
                protected String pointsEarned;

                /**
                 * 获取reservationActionType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReservationActionType() {
                    return reservationActionType;
                }

                /**
                 * 设置reservationActionType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReservationActionType(String value) {
                    this.reservationActionType = value;
                }

                /**
                 * 获取selectedLoyaltyRPH属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSelectedLoyaltyRPH() {
                    return selectedLoyaltyRPH;
                }

                /**
                 * 设置selectedLoyaltyRPH属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSelectedLoyaltyRPH(String value) {
                    this.selectedLoyaltyRPH = value;
                }

                /**
                 * 获取programCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProgramCode() {
                    return programCode;
                }

                /**
                 * 设置programCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProgramCode(String value) {
                    this.programCode = value;
                }

                /**
                 * 获取bonusCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBonusCode() {
                    return bonusCode;
                }

                /**
                 * 设置bonusCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBonusCode(String value) {
                    this.bonusCode = value;
                }

                /**
                 * 获取accountID属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccountID() {
                    return accountID;
                }

                /**
                 * 设置accountID属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccountID(String value) {
                    this.accountID = value;
                }

                /**
                 * 获取pointsEarned属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPointsEarned() {
                    return pointsEarned;
                }

                /**
                 * 设置pointsEarned属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPointsEarned(String value) {
                    this.pointsEarned = value;
                }

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DirectBillType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BillingType"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MasterAccount
        extends DirectBillType
    {

        @XmlAttribute(name = "BillingType")
        protected String billingType;
        @XmlAttribute(name = "SignFoodAndBev")
        protected Boolean signFoodAndBev;

        /**
         * 获取billingType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingType() {
            return billingType;
        }

        /**
         * 设置billingType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingType(String value) {
            this.billingType = value;
        }

        /**
         * 获取signFoodAndBev属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isSignFoodAndBev() {
            if (signFoodAndBev == null) {
                return false;
            } else {
                return signFoodAndBev;
            }
        }

        /**
         * 设置signFoodAndBev属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSignFoodAndBev(Boolean value) {
            this.signFoodAndBev = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
     *       &lt;sequence>
     *         &lt;element name="UniqueIDs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="9" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Loyalty" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "uniqueIDs",
        "loyalty"
    })
    public static class MasterContact
        extends ContactPersonType
    {

        @XmlElement(name = "UniqueIDs")
        protected HotelRoomListType.MasterContact.UniqueIDs uniqueIDs;
        @XmlElement(name = "Loyalty")
        protected List<HotelRoomListType.MasterContact.Loyalty> loyalty;

        /**
         * 获取uniqueIDs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HotelRoomListType.MasterContact.UniqueIDs }
         *     
         */
        public HotelRoomListType.MasterContact.UniqueIDs getUniqueIDs() {
            return uniqueIDs;
        }

        /**
         * 设置uniqueIDs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HotelRoomListType.MasterContact.UniqueIDs }
         *     
         */
        public void setUniqueIDs(HotelRoomListType.MasterContact.UniqueIDs value) {
            this.uniqueIDs = value;
        }

        /**
         * Gets the value of the loyalty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loyalty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLoyalty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelRoomListType.MasterContact.Loyalty }
         * 
         * 
         */
        public List<HotelRoomListType.MasterContact.Loyalty> getLoyalty() {
            if (loyalty == null) {
                loyalty = new ArrayList<HotelRoomListType.MasterContact.Loyalty>();
            }
            return this.loyalty;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Loyalty {

            @XmlAttribute(name = "ReservationActionType")
            protected String reservationActionType;
            @XmlAttribute(name = "SelectedLoyaltyRPH")
            protected String selectedLoyaltyRPH;
            @XmlAttribute(name = "ProgramCode")
            protected String programCode;
            @XmlAttribute(name = "BonusCode")
            protected String bonusCode;
            @XmlAttribute(name = "AccountID")
            protected String accountID;
            @XmlAttribute(name = "PointsEarned")
            protected String pointsEarned;

            /**
             * 获取reservationActionType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationActionType() {
                return reservationActionType;
            }

            /**
             * 设置reservationActionType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationActionType(String value) {
                this.reservationActionType = value;
            }

            /**
             * 获取selectedLoyaltyRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelectedLoyaltyRPH() {
                return selectedLoyaltyRPH;
            }

            /**
             * 设置selectedLoyaltyRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelectedLoyaltyRPH(String value) {
                this.selectedLoyaltyRPH = value;
            }

            /**
             * 获取programCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgramCode() {
                return programCode;
            }

            /**
             * 设置programCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgramCode(String value) {
                this.programCode = value;
            }

            /**
             * 获取bonusCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBonusCode() {
                return bonusCode;
            }

            /**
             * 设置bonusCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBonusCode(String value) {
                this.bonusCode = value;
            }

            /**
             * 获取accountID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountID() {
                return accountID;
            }

            /**
             * 设置accountID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountID(String value) {
                this.accountID = value;
            }

            /**
             * 获取pointsEarned属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPointsEarned() {
                return pointsEarned;
            }

            /**
             * 设置pointsEarned属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPointsEarned(String value) {
                this.pointsEarned = value;
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
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="9" minOccurs="0"/>
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
            "uniqueID"
        })
        public static class UniqueIDs {

            @XmlElement(name = "UniqueID")
            protected List<UniqueIDType> uniqueID;

            /**
             * Gets the value of the uniqueID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUniqueID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UniqueIDType }
             * 
             * 
             */
            public List<UniqueIDType> getUniqueID() {
                if (uniqueID == null) {
                    uniqueID = new ArrayList<UniqueIDType>();
                }
                return this.uniqueID;
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
     *         &lt;element name="RoomStay" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationIDsType" minOccurs="0"/>
     *                   &lt;element name="RoomShares" type="{http://www.opentravel.org/OTA/2003/05}RoomSharesType" minOccurs="0"/>
     *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *                   &lt;choice minOccurs="0">
     *                     &lt;sequence>
     *                       &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType"/>
     *                       &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
     *                     &lt;/sequence>
     *                     &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RoomStay" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *               &lt;/extension>
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
        "roomStay"
    })
    public static class RoomStays {

        @XmlElement(name = "RoomStay", required = true)
        protected List<HotelRoomListType.RoomStays.RoomStay> roomStay;

        /**
         * Gets the value of the roomStay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomStay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomStay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelRoomListType.RoomStays.RoomStay }
         * 
         * 
         */
        public List<HotelRoomListType.RoomStays.RoomStay> getRoomStay() {
            if (roomStay == null) {
                roomStay = new ArrayList<HotelRoomListType.RoomStays.RoomStay>();
            }
            return this.roomStay;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
         *       &lt;sequence minOccurs="0">
         *         &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationIDsType" minOccurs="0"/>
         *         &lt;element name="RoomShares" type="{http://www.opentravel.org/OTA/2003/05}RoomSharesType" minOccurs="0"/>
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
         *         &lt;choice minOccurs="0">
         *           &lt;sequence>
         *             &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType"/>
         *             &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
         *           &lt;/sequence>
         *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType"/>
         *         &lt;/choice>
         *       &lt;/sequence>
         *       &lt;attribute name="RoomStay" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hotelReservationIDs",
            "roomShares",
            "uniqueID",
            "success",
            "warnings",
            "errors"
        })
        public static class RoomStay
            extends RoomStayType
        {

            @XmlElement(name = "HotelReservationIDs")
            protected HotelReservationIDsType hotelReservationIDs;
            @XmlElement(name = "RoomShares")
            protected RoomSharesType roomShares;
            @XmlElement(name = "UniqueID")
            protected UniqueIDType uniqueID;
            @XmlElement(name = "Success")
            protected SuccessType success;
            @XmlElement(name = "Warnings")
            protected WarningsType warnings;
            @XmlElement(name = "Errors")
            protected ErrorsType errors;
            @XmlAttribute(name = "RoomStay")
            protected ActionType roomStay;

            /**
             * 获取hotelReservationIDs属性的值。
             * 
             * @return
             *     possible object is
             *     {@link HotelReservationIDsType }
             *     
             */
            public HotelReservationIDsType getHotelReservationIDs() {
                return hotelReservationIDs;
            }

            /**
             * 设置hotelReservationIDs属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link HotelReservationIDsType }
             *     
             */
            public void setHotelReservationIDs(HotelReservationIDsType value) {
                this.hotelReservationIDs = value;
            }

            /**
             * 获取roomShares属性的值。
             * 
             * @return
             *     possible object is
             *     {@link RoomSharesType }
             *     
             */
            public RoomSharesType getRoomShares() {
                return roomShares;
            }

            /**
             * 设置roomShares属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link RoomSharesType }
             *     
             */
            public void setRoomShares(RoomSharesType value) {
                this.roomShares = value;
            }

            /**
             * 获取uniqueID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link UniqueIDType }
             *     
             */
            public UniqueIDType getUniqueID() {
                return uniqueID;
            }

            /**
             * 设置uniqueID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link UniqueIDType }
             *     
             */
            public void setUniqueID(UniqueIDType value) {
                this.uniqueID = value;
            }

            /**
             * 获取success属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SuccessType }
             *     
             */
            public SuccessType getSuccess() {
                return success;
            }

            /**
             * 设置success属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SuccessType }
             *     
             */
            public void setSuccess(SuccessType value) {
                this.success = value;
            }

            /**
             * 获取warnings属性的值。
             * 
             * @return
             *     possible object is
             *     {@link WarningsType }
             *     
             */
            public WarningsType getWarnings() {
                return warnings;
            }

            /**
             * 设置warnings属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link WarningsType }
             *     
             */
            public void setWarnings(WarningsType value) {
                this.warnings = value;
            }

            /**
             * 获取errors属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ErrorsType }
             *     
             */
            public ErrorsType getErrors() {
                return errors;
            }

            /**
             * 设置errors属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ErrorsType }
             *     
             */
            public void setErrors(ErrorsType value) {
                this.errors = value;
            }

            /**
             * 获取roomStay属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getRoomStay() {
                return roomStay;
            }

            /**
             * 设置roomStay属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setRoomStay(ActionType value) {
                this.roomStay = value;
            }

        }

    }

}
