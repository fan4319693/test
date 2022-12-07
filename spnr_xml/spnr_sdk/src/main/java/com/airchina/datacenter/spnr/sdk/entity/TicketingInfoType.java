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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Minimum information about ticketing required to complete the booking transaction.
 * 
 * <p>TicketingInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TicketingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketAdvisory" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="CheckInInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Notes" maxOccurs="30" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Note" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="History" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="TravelerSupplierRefNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="BoardingTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                 &lt;attribute name="BoardingGate" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="FlightStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CouponInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="FlightRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                 &lt;attribute name="CouponNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
 *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DocumentNumberCheckDigit">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9]{1}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PaperTicketInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RefundInfo" type="{http://www.opentravel.org/OTA/2003/05}RefundInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Remarks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}TicketRemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="TicketTimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="TicketTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="TicketType" type="{http://www.opentravel.org/OTA/2003/05}TicketType" />
 *       &lt;attribute name="TicketingStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GeoIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SaleModel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DELISTATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightSegmentRefNumber" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *       &lt;attribute name="TravelerRefNumber" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *       &lt;attribute name="ReverseTktgSegmentsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ATSRSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ATSRPrefix" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eRefundNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="Printed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PickUpNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oldTicketNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IRR" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IRRReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="INV" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="INVReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NOSH" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OFLK" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OI" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PlatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="ExpiryDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="WaitlistStatus">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="OK"/>
 *             &lt;enumeration value="RQ"/>
 *             &lt;enumeration value="NS"/>
 *             &lt;enumeration value="SA"/>
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
@XmlType(name = "TicketingInfoType", propOrder = {
    "ticketAdvisory",
    "checkInInfo",
    "couponInfo",
    "refundInfo",
    "remarks"
})
@XmlSeeAlso({
    TicketingFullInfoType.class,
    TicketingInfoRSType.class
})
public class TicketingInfoType {

    @XmlElement(name = "TicketAdvisory")
    protected List<FreeTextType> ticketAdvisory;
    @XmlElement(name = "CheckInInfo")
    protected List<TicketingInfoType.CheckInInfo> checkInInfo;
    @XmlElement(name = "CouponInfo")
    protected List<TicketingInfoType.CouponInfo> couponInfo;
    @XmlElement(name = "RefundInfo")
    protected List<RefundInfoType> refundInfo;
    @XmlElement(name = "Remarks")
    protected TicketingInfoType.Remarks remarks;
    @XmlAttribute(name = "TicketTimeLimit")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ticketTimeLimit;
    @XmlAttribute(name = "TicketTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ticketTime;
    @XmlAttribute(name = "TicketType")
    protected TicketType ticketType;
    @XmlAttribute(name = "TicketingStatus")
    protected String ticketingStatus;
    @XmlAttribute(name = "GeoIndicator")
    protected String geoIndicator;
    @XmlAttribute(name = "SaleModel")
    protected String saleModel;
    @XmlAttribute(name = "DELISTATUS")
    protected String delistatus;
    @XmlAttribute(name = "FlightSegmentRefNumber")
    protected List<String> flightSegmentRefNumber;
    @XmlAttribute(name = "TravelerRefNumber")
    protected List<String> travelerRefNumber;
    @XmlAttribute(name = "ReverseTktgSegmentsInd")
    protected Boolean reverseTktgSegmentsInd;
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "ItemNumber")
    @XmlSchemaType(name = "anySimpleType")
    protected String itemNumber;
    @XmlAttribute(name = "ATSRSequenceNumber")
    @XmlSchemaType(name = "anySimpleType")
    protected String atsrSequenceNumber;
    @XmlAttribute(name = "ATSRPrefix")
    @XmlSchemaType(name = "anySimpleType")
    protected String atsrPrefix;
    @XmlAttribute(name = "CarrierCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String carrierCode;
    @XmlAttribute(name = "eTicketNumber")
    protected String eTicketNumber;
    @XmlAttribute(name = "eRefundNumber")
    protected String eRefundNumber;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlAttribute(name = "Printed")
    protected Boolean printed;
    @XmlAttribute(name = "PickUpNo")
    protected String pickUpNo;
    @XmlAttribute(name = "oldTicketNo")
    protected String oldTicketNo;
    @XmlAttribute(name = "IRR")
    protected Boolean irr;
    @XmlAttribute(name = "IRRReason")
    protected String irrReason;
    @XmlAttribute(name = "INV")
    protected Boolean inv;
    @XmlAttribute(name = "INVReason")
    protected String invReason;
    @XmlAttribute(name = "NOSH")
    protected Boolean nosh;
    @XmlAttribute(name = "OFLK")
    protected Boolean oflk;
    @XmlAttribute(name = "OI")
    protected Boolean oi;
    @XmlAttribute(name = "IATANumber")
    protected String iataNumber;
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    @XmlAttribute(name = "ExpiryDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDateTime;
    @XmlAttribute(name = "WaitlistStatus")
    protected String waitlistStatus;

    /**
     * Gets the value of the ticketAdvisory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketAdvisory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketAdvisory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     * 
     * 
     */
    public List<FreeTextType> getTicketAdvisory() {
        if (ticketAdvisory == null) {
            ticketAdvisory = new ArrayList<FreeTextType>();
        }
        return this.ticketAdvisory;
    }

    /**
     * Gets the value of the checkInInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkInInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckInInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingInfoType.CheckInInfo }
     * 
     * 
     */
    public List<TicketingInfoType.CheckInInfo> getCheckInInfo() {
        if (checkInInfo == null) {
            checkInInfo = new ArrayList<TicketingInfoType.CheckInInfo>();
        }
        return this.checkInInfo;
    }

    /**
     * Gets the value of the couponInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingInfoType.CouponInfo }
     * 
     * 
     */
    public List<TicketingInfoType.CouponInfo> getCouponInfo() {
        if (couponInfo == null) {
            couponInfo = new ArrayList<TicketingInfoType.CouponInfo>();
        }
        return this.couponInfo;
    }

    /**
     * Gets the value of the refundInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundInfoType }
     * 
     * 
     */
    public List<RefundInfoType> getRefundInfo() {
        if (refundInfo == null) {
            refundInfo = new ArrayList<RefundInfoType>();
        }
        return this.refundInfo;
    }

    /**
     * 获取remarks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TicketingInfoType.Remarks }
     *     
     */
    public TicketingInfoType.Remarks getRemarks() {
        return remarks;
    }

    /**
     * 设置remarks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingInfoType.Remarks }
     *     
     */
    public void setRemarks(TicketingInfoType.Remarks value) {
        this.remarks = value;
    }

    /**
     * 获取ticketTimeLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketTimeLimit() {
        return ticketTimeLimit;
    }

    /**
     * 设置ticketTimeLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketTimeLimit(XMLGregorianCalendar value) {
        this.ticketTimeLimit = value;
    }

    /**
     * 获取ticketTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketTime() {
        return ticketTime;
    }

    /**
     * 设置ticketTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketTime(XMLGregorianCalendar value) {
        this.ticketTime = value;
    }

    /**
     * 获取ticketType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TicketType }
     *     
     */
    public TicketType getTicketType() {
        return ticketType;
    }

    /**
     * 设置ticketType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType }
     *     
     */
    public void setTicketType(TicketType value) {
        this.ticketType = value;
    }

    /**
     * 获取ticketingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingStatus() {
        return ticketingStatus;
    }

    /**
     * 设置ticketingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingStatus(String value) {
        this.ticketingStatus = value;
    }

    /**
     * 获取geoIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoIndicator() {
        return geoIndicator;
    }

    /**
     * 设置geoIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoIndicator(String value) {
        this.geoIndicator = value;
    }

    /**
     * 获取saleModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleModel() {
        return saleModel;
    }

    /**
     * 设置saleModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleModel(String value) {
        this.saleModel = value;
    }

    /**
     * 获取delistatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELISTATUS() {
        return delistatus;
    }

    /**
     * 设置delistatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELISTATUS(String value) {
        this.delistatus = value;
    }

    /**
     * Gets the value of the flightSegmentRefNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentRefNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlightSegmentRefNumber() {
        if (flightSegmentRefNumber == null) {
            flightSegmentRefNumber = new ArrayList<String>();
        }
        return this.flightSegmentRefNumber;
    }

    /**
     * Gets the value of the travelerRefNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerRefNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTravelerRefNumber() {
        if (travelerRefNumber == null) {
            travelerRefNumber = new ArrayList<String>();
        }
        return this.travelerRefNumber;
    }

    /**
     * 获取reverseTktgSegmentsInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseTktgSegmentsInd() {
        return reverseTktgSegmentsInd;
    }

    /**
     * 设置reverseTktgSegmentsInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseTktgSegmentsInd(Boolean value) {
        this.reverseTktgSegmentsInd = value;
    }

    /**
     * 获取pseudoCityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * 设置pseudoCityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * 获取itemNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * 设置itemNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    /**
     * 获取atsrSequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATSRSequenceNumber() {
        return atsrSequenceNumber;
    }

    /**
     * 设置atsrSequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATSRSequenceNumber(String value) {
        this.atsrSequenceNumber = value;
    }

    /**
     * 获取atsrPrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATSRPrefix() {
        return atsrPrefix;
    }

    /**
     * 设置atsrPrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATSRPrefix(String value) {
        this.atsrPrefix = value;
    }

    /**
     * 获取carrierCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * 设置carrierCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * 获取eTicketNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketNumber() {
        return eTicketNumber;
    }

    /**
     * 设置eTicketNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketNumber(String value) {
        this.eTicketNumber = value;
    }

    /**
     * 获取eRefundNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERefundNumber() {
        return eRefundNumber;
    }

    /**
     * 设置eRefundNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERefundNumber(String value) {
        this.eRefundNumber = value;
    }

    /**
     * 获取passengerTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * 设置passengerTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * 获取printed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrinted() {
        return printed;
    }

    /**
     * 设置printed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrinted(Boolean value) {
        this.printed = value;
    }

    /**
     * 获取pickUpNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpNo() {
        return pickUpNo;
    }

    /**
     * 设置pickUpNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpNo(String value) {
        this.pickUpNo = value;
    }

    /**
     * 获取oldTicketNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldTicketNo() {
        return oldTicketNo;
    }

    /**
     * 设置oldTicketNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldTicketNo(String value) {
        this.oldTicketNo = value;
    }

    /**
     * 获取irr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIRR() {
        return irr;
    }

    /**
     * 设置irr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIRR(Boolean value) {
        this.irr = value;
    }

    /**
     * 获取irrReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIRRReason() {
        return irrReason;
    }

    /**
     * 设置irrReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIRRReason(String value) {
        this.irrReason = value;
    }

    /**
     * 获取inv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINV() {
        return inv;
    }

    /**
     * 设置inv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINV(Boolean value) {
        this.inv = value;
    }

    /**
     * 获取invReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVReason() {
        return invReason;
    }

    /**
     * 设置invReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVReason(String value) {
        this.invReason = value;
    }

    /**
     * 获取nosh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNOSH() {
        return nosh;
    }

    /**
     * 设置nosh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNOSH(Boolean value) {
        this.nosh = value;
    }

    /**
     * 获取oflk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOFLK() {
        return oflk;
    }

    /**
     * 设置oflk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOFLK(Boolean value) {
        this.oflk = value;
    }

    /**
     * 获取oi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOI() {
        return oi;
    }

    /**
     * 设置oi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOI(Boolean value) {
        this.oi = value;
    }

    /**
     * 获取iataNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANumber() {
        return iataNumber;
    }

    /**
     * 设置iataNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATANumber(String value) {
        this.iataNumber = value;
    }

    /**
     * 获取platingCarrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * 设置platingCarrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * 获取expiryDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDateTime() {
        return expiryDateTime;
    }

    /**
     * 设置expiryDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDateTime(XMLGregorianCalendar value) {
        this.expiryDateTime = value;
    }

    /**
     * 获取waitlistStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitlistStatus() {
        return waitlistStatus;
    }

    /**
     * 设置waitlistStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitlistStatus(String value) {
        this.waitlistStatus = value;
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
     *         &lt;element name="Notes" maxOccurs="30" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Note" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
     *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="History" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="TravelerSupplierRefNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="BoardingTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *       &lt;attribute name="BoardingGate" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="FlightStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "notes"
    })
    public static class CheckInInfo {

        @XmlElement(name = "Notes")
        protected List<TicketingInfoType.CheckInInfo.Notes> notes;
        @XmlAttribute(name = "AuditID")
        protected Integer auditID;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "Status")
        protected String status;
        @XmlAttribute(name = "History")
        protected Boolean history;
        @XmlAttribute(name = "SeatNumber")
        @XmlSchemaType(name = "anySimpleType")
        protected String seatNumber;
        @XmlAttribute(name = "TravelerSupplierRefNumber")
        protected String travelerSupplierRefNumber;
        @XmlAttribute(name = "BoardingTime")
        protected String boardingTime;
        @XmlAttribute(name = "BoardingGate")
        protected String boardingGate;
        @XmlAttribute(name = "FlightStatus")
        protected String flightStatus;

        /**
         * Gets the value of the notes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketingInfoType.CheckInInfo.Notes }
         * 
         * 
         */
        public List<TicketingInfoType.CheckInInfo.Notes> getNotes() {
            if (notes == null) {
                notes = new ArrayList<TicketingInfoType.CheckInInfo.Notes>();
            }
            return this.notes;
        }

        /**
         * 获取auditID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAuditID() {
            return auditID;
        }

        /**
         * 设置auditID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAuditID(Integer value) {
            this.auditID = value;
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
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * 获取history属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHistory() {
            return history;
        }

        /**
         * 设置history属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHistory(Boolean value) {
            this.history = value;
        }

        /**
         * 获取seatNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeatNumber() {
            return seatNumber;
        }

        /**
         * 设置seatNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeatNumber(String value) {
            this.seatNumber = value;
        }

        /**
         * 获取travelerSupplierRefNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelerSupplierRefNumber() {
            return travelerSupplierRefNumber;
        }

        /**
         * 设置travelerSupplierRefNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelerSupplierRefNumber(String value) {
            this.travelerSupplierRefNumber = value;
        }

        /**
         * 获取boardingTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBoardingTime() {
            return boardingTime;
        }

        /**
         * 设置boardingTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBoardingTime(String value) {
            this.boardingTime = value;
        }

        /**
         * 获取boardingGate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBoardingGate() {
            return boardingGate;
        }

        /**
         * 设置boardingGate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBoardingGate(String value) {
            this.boardingGate = value;
        }

        /**
         * 获取flightStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightStatus() {
            return flightStatus;
        }

        /**
         * 设置flightStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightStatus(String value) {
            this.flightStatus = value;
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
         *         &lt;element name="Note" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
         *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "note"
        })
        public static class Notes {

            @XmlElement(name = "Note")
            protected List<TicketingInfoType.CheckInInfo.Notes.Note> note;
            @XmlAttribute(name = "Type")
            @XmlSchemaType(name = "anySimpleType")
            protected String type;

            /**
             * Gets the value of the note property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the note property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNote().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TicketingInfoType.CheckInInfo.Notes.Note }
             * 
             * 
             */
            public List<TicketingInfoType.CheckInInfo.Notes.Note> getNote() {
                if (note == null) {
                    note = new ArrayList<TicketingInfoType.CheckInInfo.Notes.Note>();
                }
                return this.note;
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
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
             *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Note
                extends FreeTextType
            {

                @XmlAttribute(name = "Type")
                @XmlSchemaType(name = "anySimpleType")
                protected String type;

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
     *       &lt;attribute name="FlightRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *       &lt;attribute name="CouponNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DocumentNumberCheckDigit">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{1}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PaperTicketInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CouponInfo {

        @XmlAttribute(name = "FlightRPH", required = true)
        protected List<String> flightRPH;
        @XmlAttribute(name = "CouponNumber", required = true)
        protected int couponNumber;
        @XmlAttribute(name = "Status")
        protected String status;
        @XmlAttribute(name = "DocumentNumberCheckDigit")
        protected String documentNumberCheckDigit;
        @XmlAttribute(name = "PaperTicketInd")
        protected Boolean paperTicketInd;
        @XmlAttribute(name = "CouponReference")
        protected String couponReference;

        /**
         * Gets the value of the flightRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFlightRPH() {
            if (flightRPH == null) {
                flightRPH = new ArrayList<String>();
            }
            return this.flightRPH;
        }

        /**
         * 获取couponNumber属性的值。
         * 
         */
        public int getCouponNumber() {
            return couponNumber;
        }

        /**
         * 设置couponNumber属性的值。
         * 
         */
        public void setCouponNumber(int value) {
            this.couponNumber = value;
        }

        /**
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * 获取documentNumberCheckDigit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentNumberCheckDigit() {
            return documentNumberCheckDigit;
        }

        /**
         * 设置documentNumberCheckDigit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentNumberCheckDigit(String value) {
            this.documentNumberCheckDigit = value;
        }

        /**
         * 获取paperTicketInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPaperTicketInd() {
            return paperTicketInd;
        }

        /**
         * 设置paperTicketInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPaperTicketInd(Boolean value) {
            this.paperTicketInd = value;
        }

        /**
         * 获取couponReference属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCouponReference() {
            return couponReference;
        }

        /**
         * 设置couponReference属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCouponReference(String value) {
            this.couponReference = value;
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
     *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}TicketRemarkType" maxOccurs="unbounded" minOccurs="0"/>
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
        "remark"
    })
    public static class Remarks {

        @XmlElement(name = "Remark")
        protected List<TicketRemarkType> remark;

        /**
         * Gets the value of the remark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketRemarkType }
         * 
         * 
         */
        public List<TicketRemarkType> getRemark() {
            if (remark == null) {
                remark = new ArrayList<TicketRemarkType>();
            }
            return this.remark;
        }

    }

}
