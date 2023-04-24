//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A Collection of HotelReservationID objects for a given reservation. The collection of all ReservationIDs can include Passenger Name Record (PNR), Guest Name Record (GNR) and Guest Folio numbers. Associated with each can be a Confirmation number which is usually given to the guest.
 * 
 * <p>HotelReservationIDsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelReservationIDsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelReservationID" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ResID_Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="ResID_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="ForGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="ResGuestRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="CancelOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="RoomRPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlType(name = "HotelReservationIDsType", propOrder = {
    "hotelReservationID"
})
public class HotelReservationIDsType {

    @XmlElement(name = "HotelReservationID", required = true)
    protected List<HotelReservationIDsType.HotelReservationID> hotelReservationID;

    /**
     * Gets the value of the hotelReservationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelReservationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelReservationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelReservationIDsType.HotelReservationID }
     * 
     * 
     */
    public List<HotelReservationIDsType.HotelReservationID> getHotelReservationID() {
        if (hotelReservationID == null) {
            hotelReservationID = new ArrayList<HotelReservationIDsType.HotelReservationID>();
        }
        return this.hotelReservationID;
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
     *       &lt;attribute name="ResID_Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="ResID_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="ForGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="ResGuestRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="CancelOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="RoomRPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelReservationID {

        @XmlAttribute(name = "ResID_Type")
        protected String resIDType;
        @XmlAttribute(name = "ResID_Value")
        protected String resIDValue;
        @XmlAttribute(name = "ResID_Source")
        protected String resIDSource;
        @XmlAttribute(name = "ResID_SourceContext")
        protected String resIDSourceContext;
        @XmlAttribute(name = "ResID_Date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar resIDDate;
        @XmlAttribute(name = "ForGuest")
        protected Boolean forGuest;
        @XmlAttribute(name = "ResGuestRPH")
        protected String resGuestRPH;
        @XmlAttribute(name = "CancelOriginatorCode")
        protected String cancelOriginatorCode;
        @XmlAttribute(name = "CancellationDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cancellationDate;
        @XmlAttribute(name = "RoomRPH")
        @XmlSchemaType(name = "anySimpleType")
        protected String roomRPH;

        /**
         * 获取resIDType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDType() {
            return resIDType;
        }

        /**
         * 设置resIDType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDType(String value) {
            this.resIDType = value;
        }

        /**
         * 获取resIDValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDValue() {
            return resIDValue;
        }

        /**
         * 设置resIDValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDValue(String value) {
            this.resIDValue = value;
        }

        /**
         * 获取resIDSource属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDSource() {
            return resIDSource;
        }

        /**
         * 设置resIDSource属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDSource(String value) {
            this.resIDSource = value;
        }

        /**
         * 获取resIDSourceContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDSourceContext() {
            return resIDSourceContext;
        }

        /**
         * 设置resIDSourceContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDSourceContext(String value) {
            this.resIDSourceContext = value;
        }

        /**
         * 获取resIDDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getResIDDate() {
            return resIDDate;
        }

        /**
         * 设置resIDDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setResIDDate(XMLGregorianCalendar value) {
            this.resIDDate = value;
        }

        /**
         * 获取forGuest属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isForGuest() {
            if (forGuest == null) {
                return false;
            } else {
                return forGuest;
            }
        }

        /**
         * 设置forGuest属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setForGuest(Boolean value) {
            this.forGuest = value;
        }

        /**
         * 获取resGuestRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResGuestRPH() {
            return resGuestRPH;
        }

        /**
         * 设置resGuestRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResGuestRPH(String value) {
            this.resGuestRPH = value;
        }

        /**
         * 获取cancelOriginatorCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelOriginatorCode() {
            return cancelOriginatorCode;
        }

        /**
         * 设置cancelOriginatorCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancelOriginatorCode(String value) {
            this.cancelOriginatorCode = value;
        }

        /**
         * 获取cancellationDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCancellationDate() {
            return cancellationDate;
        }

        /**
         * 设置cancellationDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCancellationDate(XMLGregorianCalendar value) {
            this.cancellationDate = value;
        }

        /**
         * 获取roomRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomRPH() {
            return roomRPH;
        }

        /**
         * 设置roomRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomRPH(String value) {
            this.roomRPH = value;
        }

    }

}
