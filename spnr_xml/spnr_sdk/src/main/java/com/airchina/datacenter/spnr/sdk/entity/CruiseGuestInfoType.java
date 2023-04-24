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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Contains guest information for the specified sailing.
 * 
 * 
 * <p>CruiseGuestInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CruiseGuestInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationID" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReservationStatusGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GuestDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GuestDetail" type="{http://www.opentravel.org/OTA/2003/05}CruiseGuestDetailType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LinkedBookings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LinkedBooking" maxOccurs="32">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType">
 *                           &lt;attribute name="LinkTypeCode" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentOption" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
 *                           &lt;attribute name="ExtendedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="PaymentPurpose">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="GiftOrder"/>
 *                                 &lt;enumeration value="Reservation"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ExtendedDepositDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="ReferenceNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/extension>
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
@XmlType(name = "CruiseGuestInfoType", propOrder = {
    "reservationID",
    "guestDetails",
    "linkedBookings",
    "paymentOptions"
})
public class CruiseGuestInfoType {

    @XmlElement(name = "ReservationID")
    protected List<CruiseGuestInfoType.ReservationID> reservationID;
    @XmlElement(name = "GuestDetails", required = true)
    protected CruiseGuestInfoType.GuestDetails guestDetails;
    @XmlElement(name = "LinkedBookings")
    protected CruiseGuestInfoType.LinkedBookings linkedBookings;
    @XmlElement(name = "PaymentOptions")
    protected CruiseGuestInfoType.PaymentOptions paymentOptions;

    /**
     * Gets the value of the reservationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestInfoType.ReservationID }
     * 
     * 
     */
    public List<CruiseGuestInfoType.ReservationID> getReservationID() {
        if (reservationID == null) {
            reservationID = new ArrayList<CruiseGuestInfoType.ReservationID>();
        }
        return this.reservationID;
    }

    /**
     * 获取guestDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestInfoType.GuestDetails }
     *     
     */
    public CruiseGuestInfoType.GuestDetails getGuestDetails() {
        return guestDetails;
    }

    /**
     * 设置guestDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestInfoType.GuestDetails }
     *     
     */
    public void setGuestDetails(CruiseGuestInfoType.GuestDetails value) {
        this.guestDetails = value;
    }

    /**
     * 获取linkedBookings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestInfoType.LinkedBookings }
     *     
     */
    public CruiseGuestInfoType.LinkedBookings getLinkedBookings() {
        return linkedBookings;
    }

    /**
     * 设置linkedBookings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestInfoType.LinkedBookings }
     *     
     */
    public void setLinkedBookings(CruiseGuestInfoType.LinkedBookings value) {
        this.linkedBookings = value;
    }

    /**
     * 获取paymentOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestInfoType.PaymentOptions }
     *     
     */
    public CruiseGuestInfoType.PaymentOptions getPaymentOptions() {
        return paymentOptions;
    }

    /**
     * 设置paymentOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestInfoType.PaymentOptions }
     *     
     */
    public void setPaymentOptions(CruiseGuestInfoType.PaymentOptions value) {
        this.paymentOptions = value;
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
     *         &lt;element name="GuestDetail" type="{http://www.opentravel.org/OTA/2003/05}CruiseGuestDetailType" maxOccurs="9"/>
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
        "guestDetail"
    })
    public static class GuestDetails {

        @XmlElement(name = "GuestDetail", required = true)
        protected List<CruiseGuestDetailType> guestDetail;

        /**
         * Gets the value of the guestDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guestDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuestDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseGuestDetailType }
         * 
         * 
         */
        public List<CruiseGuestDetailType> getGuestDetail() {
            if (guestDetail == null) {
                guestDetail = new ArrayList<CruiseGuestDetailType>();
            }
            return this.guestDetail;
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
     *         &lt;element name="LinkedBooking" maxOccurs="32">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType">
     *                 &lt;attribute name="LinkTypeCode" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
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
        "linkedBooking"
    })
    public static class LinkedBookings {

        @XmlElement(name = "LinkedBooking", required = true)
        protected List<CruiseGuestInfoType.LinkedBookings.LinkedBooking> linkedBooking;

        /**
         * Gets the value of the linkedBooking property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linkedBooking property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinkedBooking().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseGuestInfoType.LinkedBookings.LinkedBooking }
         * 
         * 
         */
        public List<CruiseGuestInfoType.LinkedBookings.LinkedBooking> getLinkedBooking() {
            if (linkedBooking == null) {
                linkedBooking = new ArrayList<CruiseGuestInfoType.LinkedBookings.LinkedBooking>();
            }
            return this.linkedBooking;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType">
         *       &lt;attribute name="LinkTypeCode" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LinkedBooking
            extends RelatedTravelerType
        {

            @XmlAttribute(name = "LinkTypeCode")
            protected List<String> linkTypeCode;

            /**
             * Gets the value of the linkTypeCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the linkTypeCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLinkTypeCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getLinkTypeCode() {
                if (linkTypeCode == null) {
                    linkTypeCode = new ArrayList<String>();
                }
                return this.linkTypeCode;
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
     *         &lt;element name="PaymentOption" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
     *                 &lt;attribute name="ExtendedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="PaymentPurpose">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="GiftOrder"/>
     *                       &lt;enumeration value="Reservation"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="ExtendedDepositDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="ReferenceNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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
        "paymentOption"
    })
    public static class PaymentOptions {

        @XmlElement(name = "PaymentOption", required = true)
        protected List<CruiseGuestInfoType.PaymentOptions.PaymentOption> paymentOption;

        /**
         * Gets the value of the paymentOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseGuestInfoType.PaymentOptions.PaymentOption }
         * 
         * 
         */
        public List<CruiseGuestInfoType.PaymentOptions.PaymentOption> getPaymentOption() {
            if (paymentOption == null) {
                paymentOption = new ArrayList<CruiseGuestInfoType.PaymentOptions.PaymentOption>();
            }
            return this.paymentOption;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
         *       &lt;attribute name="ExtendedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="PaymentPurpose">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="GiftOrder"/>
         *             &lt;enumeration value="Reservation"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="ExtendedDepositDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="ReferenceNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PaymentOption
            extends PaymentDetailType
        {

            @XmlAttribute(name = "ExtendedIndicator")
            protected Boolean extendedIndicator;
            @XmlAttribute(name = "PaymentPurpose")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String paymentPurpose;
            @XmlAttribute(name = "ExtendedDepositDate")
            protected String extendedDepositDate;
            @XmlAttribute(name = "ReferenceNumber")
            protected String referenceNumber;

            /**
             * 获取extendedIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isExtendedIndicator() {
                return extendedIndicator;
            }

            /**
             * 设置extendedIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setExtendedIndicator(Boolean value) {
                this.extendedIndicator = value;
            }

            /**
             * 获取paymentPurpose属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentPurpose() {
                return paymentPurpose;
            }

            /**
             * 设置paymentPurpose属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentPurpose(String value) {
                this.paymentPurpose = value;
            }

            /**
             * 获取extendedDepositDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtendedDepositDate() {
                return extendedDepositDate;
            }

            /**
             * 设置extendedDepositDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtendedDepositDate(String value) {
                this.extendedDepositDate = value;
            }

            /**
             * 获取referenceNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenceNumber() {
                return referenceNumber;
            }

            /**
             * 设置referenceNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenceNumber(String value) {
                this.referenceNumber = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReservationStatusGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReservationID
        extends UniqueIDType
    {

        @XmlAttribute(name = "StatusCode")
        protected String statusCode;
        @XmlAttribute(name = "LastModifyDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastModifyDateTime;

        /**
         * 获取statusCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusCode() {
            return statusCode;
        }

        /**
         * 设置statusCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusCode(String value) {
            this.statusCode = value;
        }

        /**
         * 获取lastModifyDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastModifyDateTime() {
            return lastModifyDateTime;
        }

        /**
         * 设置lastModifyDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastModifyDateTime(XMLGregorianCalendar value) {
            this.lastModifyDateTime = value;
        }

    }

}
