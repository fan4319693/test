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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Remarks, OSIs, Seat Requests etc.
 * 
 * <p>SpecialReqDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SpecialReqDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SeatRequest" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SeatRequestType">
 *                           &lt;sequence>
 *                             &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                           &lt;attribute name="TravelerRefNumberRPHList" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                           &lt;attribute name="FlightRefNumberRPHList" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                           &lt;attribute name="ReservationSystem">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Internal"/>
 *                                 &lt;enumeration value="External"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CreateCoupon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PreCheckinReqd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialServiceRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SpecialServiceRequest" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialServiceRequestType">
 *                           &lt;sequence>
 *                             &lt;element name="SupplierRef" type="{http://www.opentravel.org/OTA/2003/05}SupplierRefType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                           &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ReservationSystem">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Internal"/>
 *                                 &lt;enumeration value="External"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="CreateCoupon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="numProcessedPassengers" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransportRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TransportRequest" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DepartureLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *                             &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *                             &lt;element name="MarketingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                             &lt;element name="OperatingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                             &lt;element name="SupplierRef" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SupplierRefType">
 *                                     &lt;attribute name="TrainsportNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="TransportType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="SupplierRefNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                           &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                           &lt;attribute name="TransportationCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                           &lt;attribute name="SupplierRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StandaloneAncillaries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StandaloneAncillary" type="{http://www.opentravel.org/OTA/2003/05}StandaloneAncillaryType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherServiceInformations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherServiceInformation" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OtherServiceInfoType">
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remarks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Remark" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to64">
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialRemarks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SpecialRemark" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialRemarkType">
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArrangerInfo" type="{http://www.opentravel.org/OTA/2003/05}AirArrangerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialReqDetailsType", propOrder = {
    "seatRequests",
    "specialServiceRequests",
    "transportRequests",
    "standaloneAncillaries",
    "otherServiceInformations",
    "remarks",
    "specialRemarks",
    "arrangerInfo"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.ItineraryInfoType.SpecialRequestDetails.class,
    com.airchina.datacenter.spnr.sdk.entity.ReservationItemsType.SpecialRequestDetails.class,
    com.airchina.datacenter.spnr.sdk.entity.AssociatedContentType.AssocItems.SpecialRequestDetails.class,
    com.airchina.datacenter.spnr.sdk.entity.AssociatedContentType.SpecialRequestDetails.class,
    com.airchina.datacenter.spnr.sdk.entity.TravelerInfoType.SpecialReqDetails.class
})
public class SpecialReqDetailsType {

    @XmlElement(name = "SeatRequests")
    protected SpecialReqDetailsType.SeatRequests seatRequests;
    @XmlElement(name = "SpecialServiceRequests")
    protected SpecialReqDetailsType.SpecialServiceRequests specialServiceRequests;
    @XmlElement(name = "TransportRequests")
    protected SpecialReqDetailsType.TransportRequests transportRequests;
    @XmlElement(name = "StandaloneAncillaries")
    protected SpecialReqDetailsType.StandaloneAncillaries standaloneAncillaries;
    @XmlElement(name = "OtherServiceInformations")
    protected SpecialReqDetailsType.OtherServiceInformations otherServiceInformations;
    @XmlElement(name = "Remarks")
    protected SpecialReqDetailsType.Remarks remarks;
    @XmlElement(name = "SpecialRemarks")
    protected SpecialReqDetailsType.SpecialRemarks specialRemarks;
    @XmlElement(name = "ArrangerInfo")
    protected AirArrangerType arrangerInfo;

    /**
     * 获取seatRequests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType.SeatRequests }
     *     
     */
    public SpecialReqDetailsType.SeatRequests getSeatRequests() {
        return seatRequests;
    }

    /**
     * 设置seatRequests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType.SeatRequests }
     *     
     */
    public void setSeatRequests(SpecialReqDetailsType.SeatRequests value) {
        this.seatRequests = value;
    }

    /**
     * 获取specialServiceRequests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType.SpecialServiceRequests }
     *     
     */
    public SpecialReqDetailsType.SpecialServiceRequests getSpecialServiceRequests() {
        return specialServiceRequests;
    }

    /**
     * 设置specialServiceRequests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType.SpecialServiceRequests }
     *     
     */
    public void setSpecialServiceRequests(SpecialReqDetailsType.SpecialServiceRequests value) {
        this.specialServiceRequests = value;
    }

    /**
     * 获取transportRequests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType.TransportRequests }
     *     
     */
    public SpecialReqDetailsType.TransportRequests getTransportRequests() {
        return transportRequests;
    }

    /**
     * 设置transportRequests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType.TransportRequests }
     *     
     */
    public void setTransportRequests(SpecialReqDetailsType.TransportRequests value) {
        this.transportRequests = value;
    }

    /**
     * 获取standaloneAncillaries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType.StandaloneAncillaries }
     *     
     */
    public SpecialReqDetailsType.StandaloneAncillaries getStandaloneAncillaries() {
        return standaloneAncillaries;
    }

    /**
     * 设置standaloneAncillaries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType.StandaloneAncillaries }
     *     
     */
    public void setStandaloneAncillaries(SpecialReqDetailsType.StandaloneAncillaries value) {
        this.standaloneAncillaries = value;
    }

    /**
     * 获取otherServiceInformations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType.OtherServiceInformations }
     *     
     */
    public SpecialReqDetailsType.OtherServiceInformations getOtherServiceInformations() {
        return otherServiceInformations;
    }

    /**
     * 设置otherServiceInformations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType.OtherServiceInformations }
     *     
     */
    public void setOtherServiceInformations(SpecialReqDetailsType.OtherServiceInformations value) {
        this.otherServiceInformations = value;
    }

    /**
     * 获取remarks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType.Remarks }
     *     
     */
    public SpecialReqDetailsType.Remarks getRemarks() {
        return remarks;
    }

    /**
     * 设置remarks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType.Remarks }
     *     
     */
    public void setRemarks(SpecialReqDetailsType.Remarks value) {
        this.remarks = value;
    }

    /**
     * 获取specialRemarks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType.SpecialRemarks }
     *     
     */
    public SpecialReqDetailsType.SpecialRemarks getSpecialRemarks() {
        return specialRemarks;
    }

    /**
     * 设置specialRemarks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType.SpecialRemarks }
     *     
     */
    public void setSpecialRemarks(SpecialReqDetailsType.SpecialRemarks value) {
        this.specialRemarks = value;
    }

    /**
     * 获取arrangerInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirArrangerType }
     *     
     */
    public AirArrangerType getArrangerInfo() {
        return arrangerInfo;
    }

    /**
     * 设置arrangerInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirArrangerType }
     *     
     */
    public void setArrangerInfo(AirArrangerType value) {
        this.arrangerInfo = value;
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
     *         &lt;element name="OtherServiceInformation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OtherServiceInfoType">
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
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
        "otherServiceInformation"
    })
    public static class OtherServiceInformations {

        @XmlElement(name = "OtherServiceInformation", required = true)
        protected List<SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation> otherServiceInformation;

        /**
         * Gets the value of the otherServiceInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherServiceInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherServiceInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation }
         * 
         * 
         */
        public List<SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation> getOtherServiceInformation() {
            if (otherServiceInformation == null) {
                otherServiceInformation = new ArrayList<SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation>();
            }
            return this.otherServiceInformation;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OtherServiceInfoType">
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OtherServiceInformation
            extends OtherServiceInfoType
        {

            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "Operation")
            protected ActionType operation;

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
             * 获取operation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getOperation() {
                return operation;
            }

            /**
             * 设置operation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setOperation(ActionType value) {
                this.operation = value;
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
     *         &lt;element name="Remark" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to64">
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "remark"
    })
    public static class Remarks {

        @XmlElement(name = "Remark", required = true)
        protected List<SpecialReqDetailsType.Remarks.Remark> remark;

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
         * {@link SpecialReqDetailsType.Remarks.Remark }
         * 
         * 
         */
        public List<SpecialReqDetailsType.Remarks.Remark> getRemark() {
            if (remark == null) {
                remark = new ArrayList<SpecialReqDetailsType.Remarks.Remark>();
            }
            return this.remark;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to64">
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Remark {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "Operation")
            protected ActionType operation;

            /**
             * Used for Character Strings, length 1 to 64
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
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
             * 获取operation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getOperation() {
                return operation;
            }

            /**
             * 设置operation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setOperation(ActionType value) {
                this.operation = value;
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
     *         &lt;element name="SeatRequest" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SeatRequestType">
     *                 &lt;sequence>
     *                   &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *                 &lt;attribute name="TravelerRefNumberRPHList" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *                 &lt;attribute name="FlightRefNumberRPHList" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *                 &lt;attribute name="ReservationSystem">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Internal"/>
     *                       &lt;enumeration value="External"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CreateCoupon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="PreCheckinReqd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "seatRequest"
    })
    public static class SeatRequests {

        @XmlElement(name = "SeatRequest")
        protected List<SpecialReqDetailsType.SeatRequests.SeatRequest> seatRequest;
        @XmlAttribute(name = "PreCheckinReqd")
        protected Boolean preCheckinReqd;

        /**
         * Gets the value of the seatRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seatRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeatRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialReqDetailsType.SeatRequests.SeatRequest }
         * 
         * 
         */
        public List<SpecialReqDetailsType.SeatRequests.SeatRequest> getSeatRequest() {
            if (seatRequest == null) {
                seatRequest = new ArrayList<SpecialReqDetailsType.SeatRequests.SeatRequest>();
            }
            return this.seatRequest;
        }

        /**
         * 获取preCheckinReqd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPreCheckinReqd() {
            return preCheckinReqd;
        }

        /**
         * 设置preCheckinReqd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPreCheckinReqd(Boolean value) {
            this.preCheckinReqd = value;
        }


        /**
         *  AWG to revisit.
         * 
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SeatRequestType">
         *       &lt;sequence>
         *         &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *       &lt;attribute name="TravelerRefNumberRPHList" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
         *       &lt;attribute name="FlightRefNumberRPHList" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
         *       &lt;attribute name="ReservationSystem">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Internal"/>
         *             &lt;enumeration value="External"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CreateCoupon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fee"
        })
        public static class SeatRequest
            extends SeatRequestType
        {

            @XmlElement(name = "Fee")
            protected FeeType fee;
            @XmlAttribute(name = "Operation")
            protected ActionType operation;
            @XmlAttribute(name = "TravelerRefNumberRPHList", required = true)
            protected List<String> travelerRefNumberRPHList;
            @XmlAttribute(name = "FlightRefNumberRPHList", required = true)
            protected List<String> flightRefNumberRPHList;
            @XmlAttribute(name = "ReservationSystem")
            protected String reservationSystem;
            @XmlAttribute(name = "AuditID")
            protected Integer auditID;
            @XmlAttribute(name = "SupplierCode")
            protected String supplierCode;
            @XmlAttribute(name = "CreateCoupon")
            protected Boolean createCoupon;

            /**
             * 获取fee属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FeeType }
             *     
             */
            public FeeType getFee() {
                return fee;
            }

            /**
             * 设置fee属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FeeType }
             *     
             */
            public void setFee(FeeType value) {
                this.fee = value;
            }

            /**
             * 获取operation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getOperation() {
                return operation;
            }

            /**
             * 设置operation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setOperation(ActionType value) {
                this.operation = value;
            }

            /**
             * Gets the value of the travelerRefNumberRPHList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the travelerRefNumberRPHList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTravelerRefNumberRPHList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTravelerRefNumberRPHList() {
                if (travelerRefNumberRPHList == null) {
                    travelerRefNumberRPHList = new ArrayList<String>();
                }
                return this.travelerRefNumberRPHList;
            }

            /**
             * Gets the value of the flightRefNumberRPHList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightRefNumberRPHList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightRefNumberRPHList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getFlightRefNumberRPHList() {
                if (flightRefNumberRPHList == null) {
                    flightRefNumberRPHList = new ArrayList<String>();
                }
                return this.flightRefNumberRPHList;
            }

            /**
             * 获取reservationSystem属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationSystem() {
                return reservationSystem;
            }

            /**
             * 设置reservationSystem属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationSystem(String value) {
                this.reservationSystem = value;
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
             * 获取supplierCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupplierCode() {
                return supplierCode;
            }

            /**
             * 设置supplierCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupplierCode(String value) {
                this.supplierCode = value;
            }

            /**
             * 获取createCoupon属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCreateCoupon() {
                return createCoupon;
            }

            /**
             * 设置createCoupon属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCreateCoupon(Boolean value) {
                this.createCoupon = value;
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
     *         &lt;element name="SpecialRemark" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialRemarkType">
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
        "specialRemark"
    })
    public static class SpecialRemarks {

        @XmlElement(name = "SpecialRemark", required = true)
        protected List<SpecialReqDetailsType.SpecialRemarks.SpecialRemark> specialRemark;

        /**
         * Gets the value of the specialRemark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialRemark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialReqDetailsType.SpecialRemarks.SpecialRemark }
         * 
         * 
         */
        public List<SpecialReqDetailsType.SpecialRemarks.SpecialRemark> getSpecialRemark() {
            if (specialRemark == null) {
                specialRemark = new ArrayList<SpecialReqDetailsType.SpecialRemarks.SpecialRemark>();
            }
            return this.specialRemark;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialRemarkType">
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SpecialRemark
            extends SpecialRemarkType
        {

            @XmlAttribute(name = "Operation")
            protected ActionType operation;
            @XmlAttribute(name = "RPH")
            protected String rph;

            /**
             * 获取operation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getOperation() {
                return operation;
            }

            /**
             * 设置operation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setOperation(ActionType value) {
                this.operation = value;
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
     *         &lt;element name="SpecialServiceRequest" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialServiceRequestType">
     *                 &lt;sequence>
     *                   &lt;element name="SupplierRef" type="{http://www.opentravel.org/OTA/2003/05}SupplierRefType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *                 &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ReservationSystem">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Internal"/>
     *                       &lt;enumeration value="External"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="CreateCoupon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="numProcessedPassengers" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specialServiceRequest"
    })
    public static class SpecialServiceRequests {

        @XmlElement(name = "SpecialServiceRequest")
        protected List<SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest> specialServiceRequest;
        @XmlAttribute(name = "numProcessedPassengers")
        @XmlSchemaType(name = "anySimpleType")
        protected String numProcessedPassengers;

        /**
         * Gets the value of the specialServiceRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialServiceRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialServiceRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest }
         * 
         * 
         */
        public List<SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest> getSpecialServiceRequest() {
            if (specialServiceRequest == null) {
                specialServiceRequest = new ArrayList<SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest>();
            }
            return this.specialServiceRequest;
        }

        /**
         * 获取numProcessedPassengers属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumProcessedPassengers() {
            return numProcessedPassengers;
        }

        /**
         * 设置numProcessedPassengers属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumProcessedPassengers(String value) {
            this.numProcessedPassengers = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialServiceRequestType">
         *       &lt;sequence>
         *         &lt;element name="SupplierRef" type="{http://www.opentravel.org/OTA/2003/05}SupplierRefType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *       &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ReservationSystem">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Internal"/>
         *             &lt;enumeration value="External"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="CreateCoupon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "supplierRef"
        })
        public static class SpecialServiceRequest
            extends SpecialServiceRequestType
        {

            @XmlElement(name = "SupplierRef")
            protected SupplierRefType supplierRef;
            @XmlAttribute(name = "Operation")
            protected ActionType operation;
            @XmlAttribute(name = "ProductNumber")
            protected String productNumber;
            @XmlAttribute(name = "ReservationSystem")
            protected String reservationSystem;
            @XmlAttribute(name = "AuditID")
            protected Integer auditID;
            @XmlAttribute(name = "CreateCoupon")
            protected Boolean createCoupon;

            /**
             * 获取supplierRef属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SupplierRefType }
             *     
             */
            public SupplierRefType getSupplierRef() {
                return supplierRef;
            }

            /**
             * 设置supplierRef属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SupplierRefType }
             *     
             */
            public void setSupplierRef(SupplierRefType value) {
                this.supplierRef = value;
            }

            /**
             * 获取operation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getOperation() {
                return operation;
            }

            /**
             * 设置operation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setOperation(ActionType value) {
                this.operation = value;
            }

            /**
             * 获取productNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductNumber() {
                return productNumber;
            }

            /**
             * 设置productNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductNumber(String value) {
                this.productNumber = value;
            }

            /**
             * 获取reservationSystem属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationSystem() {
                return reservationSystem;
            }

            /**
             * 设置reservationSystem属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationSystem(String value) {
                this.reservationSystem = value;
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
             * 获取createCoupon属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCreateCoupon() {
                return createCoupon;
            }

            /**
             * 设置createCoupon属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCreateCoupon(Boolean value) {
                this.createCoupon = value;
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
     *         &lt;element name="StandaloneAncillary" type="{http://www.opentravel.org/OTA/2003/05}StandaloneAncillaryType" maxOccurs="unbounded"/>
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
        "standaloneAncillary"
    })
    public static class StandaloneAncillaries {

        @XmlElement(name = "StandaloneAncillary", required = true)
        protected List<StandaloneAncillaryType> standaloneAncillary;

        /**
         * Gets the value of the standaloneAncillary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the standaloneAncillary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStandaloneAncillary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StandaloneAncillaryType }
         * 
         * 
         */
        public List<StandaloneAncillaryType> getStandaloneAncillary() {
            if (standaloneAncillary == null) {
                standaloneAncillary = new ArrayList<StandaloneAncillaryType>();
            }
            return this.standaloneAncillary;
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
     *         &lt;element name="TransportRequest" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DepartureLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
     *                   &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
     *                   &lt;element name="MarketingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *                   &lt;element name="OperatingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *                   &lt;element name="SupplierRef" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SupplierRefType">
     *                           &lt;attribute name="TrainsportNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="TransportType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="SupplierRefNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *                 &lt;attribute name="TransportationCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *                 &lt;attribute name="SupplierRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
        "transportRequest"
    })
    public static class TransportRequests {

        @XmlElement(name = "TransportRequest")
        protected List<SpecialReqDetailsType.TransportRequests.TransportRequest> transportRequest;

        /**
         * Gets the value of the transportRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transportRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransportRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialReqDetailsType.TransportRequests.TransportRequest }
         * 
         * 
         */
        public List<SpecialReqDetailsType.TransportRequests.TransportRequest> getTransportRequest() {
            if (transportRequest == null) {
                transportRequest = new ArrayList<SpecialReqDetailsType.TransportRequests.TransportRequest>();
            }
            return this.transportRequest;
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
         *         &lt;element name="DepartureLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
         *         &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
         *         &lt;element name="MarketingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
         *         &lt;element name="OperatingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
         *         &lt;element name="SupplierRef" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SupplierRefType">
         *                 &lt;attribute name="TrainsportNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="TransportType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="SupplierRefNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
         *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
         *       &lt;attribute name="TransportationCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
         *       &lt;attribute name="SupplierRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "departureLocation",
            "arrivalLocation",
            "marketingCompany",
            "operatingCompany",
            "supplierRef"
        })
        public static class TransportRequest {

            @XmlElement(name = "DepartureLocation")
            protected LocationType departureLocation;
            @XmlElement(name = "ArrivalLocation")
            protected LocationType arrivalLocation;
            @XmlElement(name = "MarketingCompany")
            protected CompanyNameType marketingCompany;
            @XmlElement(name = "OperatingCompany")
            protected CompanyNameType operatingCompany;
            @XmlElement(name = "SupplierRef")
            protected SpecialReqDetailsType.TransportRequests.TransportRequest.SupplierRef supplierRef;
            @XmlAttribute(name = "RPH")
            protected List<String> rph;
            @XmlAttribute(name = "Status")
            protected String status;
            @XmlAttribute(name = "TravelerRefNumberRPHList")
            protected List<String> travelerRefNumberRPHList;
            @XmlAttribute(name = "TransportationCode")
            protected String transportationCode;
            @XmlAttribute(name = "Number")
            protected String number;
            @XmlAttribute(name = "SupplierRefNumber")
            protected String supplierRefNumber;
            @XmlAttribute(name = "DepartureDateTime")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar departureDateTime;
            @XmlAttribute(name = "ArrivalDateTime")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar arrivalDateTime;

            /**
             * 获取departureLocation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getDepartureLocation() {
                return departureLocation;
            }

            /**
             * 设置departureLocation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setDepartureLocation(LocationType value) {
                this.departureLocation = value;
            }

            /**
             * 获取arrivalLocation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getArrivalLocation() {
                return arrivalLocation;
            }

            /**
             * 设置arrivalLocation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setArrivalLocation(LocationType value) {
                this.arrivalLocation = value;
            }

            /**
             * 获取marketingCompany属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CompanyNameType }
             *     
             */
            public CompanyNameType getMarketingCompany() {
                return marketingCompany;
            }

            /**
             * 设置marketingCompany属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyNameType }
             *     
             */
            public void setMarketingCompany(CompanyNameType value) {
                this.marketingCompany = value;
            }

            /**
             * 获取operatingCompany属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CompanyNameType }
             *     
             */
            public CompanyNameType getOperatingCompany() {
                return operatingCompany;
            }

            /**
             * 设置operatingCompany属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyNameType }
             *     
             */
            public void setOperatingCompany(CompanyNameType value) {
                this.operatingCompany = value;
            }

            /**
             * 获取supplierRef属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SpecialReqDetailsType.TransportRequests.TransportRequest.SupplierRef }
             *     
             */
            public SpecialReqDetailsType.TransportRequests.TransportRequest.SupplierRef getSupplierRef() {
                return supplierRef;
            }

            /**
             * 设置supplierRef属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SpecialReqDetailsType.TransportRequests.TransportRequest.SupplierRef }
             *     
             */
            public void setSupplierRef(SpecialReqDetailsType.TransportRequests.TransportRequest.SupplierRef value) {
                this.supplierRef = value;
            }

            /**
             * Gets the value of the rph property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the rph property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRPH().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getRPH() {
                if (rph == null) {
                    rph = new ArrayList<String>();
                }
                return this.rph;
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
             * Gets the value of the travelerRefNumberRPHList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the travelerRefNumberRPHList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTravelerRefNumberRPHList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTravelerRefNumberRPHList() {
                if (travelerRefNumberRPHList == null) {
                    travelerRefNumberRPHList = new ArrayList<String>();
                }
                return this.travelerRefNumberRPHList;
            }

            /**
             * 获取transportationCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransportationCode() {
                return transportationCode;
            }

            /**
             * 设置transportationCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransportationCode(String value) {
                this.transportationCode = value;
            }

            /**
             * 获取number属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * 设置number属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * 获取supplierRefNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupplierRefNumber() {
                return supplierRefNumber;
            }

            /**
             * 设置supplierRefNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupplierRefNumber(String value) {
                this.supplierRefNumber = value;
            }

            /**
             * 获取departureDateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDepartureDateTime() {
                return departureDateTime;
            }

            /**
             * 设置departureDateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDepartureDateTime(XMLGregorianCalendar value) {
                this.departureDateTime = value;
            }

            /**
             * 获取arrivalDateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getArrivalDateTime() {
                return arrivalDateTime;
            }

            /**
             * 设置arrivalDateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setArrivalDateTime(XMLGregorianCalendar value) {
                this.arrivalDateTime = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SupplierRefType">
             *       &lt;attribute name="TrainsportNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="TransportType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="SupplierRefNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SupplierRef
                extends SupplierRefType
            {

                @XmlAttribute(name = "TrainsportNumber")
                @XmlSchemaType(name = "anySimpleType")
                protected String trainsportNumber;
                @XmlAttribute(name = "TransportType")
                @XmlSchemaType(name = "anySimpleType")
                protected String transportType;
                @XmlAttribute(name = "SupplierRefNumber")
                @XmlSchemaType(name = "anySimpleType")
                protected String supplierRefNumber;

                /**
                 * 获取trainsportNumber属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTrainsportNumber() {
                    return trainsportNumber;
                }

                /**
                 * 设置trainsportNumber属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTrainsportNumber(String value) {
                    this.trainsportNumber = value;
                }

                /**
                 * 获取transportType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransportType() {
                    return transportType;
                }

                /**
                 * 设置transportType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransportType(String value) {
                    this.transportType = value;
                }

                /**
                 * 获取supplierRefNumber属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSupplierRefNumber() {
                    return supplierRefNumber;
                }

                /**
                 * 设置supplierRefNumber属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSupplierRefNumber(String value) {
                    this.supplierRefNumber = value;
                }

            }

        }

    }

}
