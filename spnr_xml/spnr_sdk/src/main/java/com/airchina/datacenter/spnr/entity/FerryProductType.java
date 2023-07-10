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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FerryProductType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FerryProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Originator" type="{http://www.opentravel.org/OTA/2003/05}FerryPOS_Type" minOccurs="0"/>
 *         &lt;element name="ItineraryLeg" maxOccurs="2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BaseItineraryType">
 *                 &lt;sequence>
 *                   &lt;element name="AltItinerary" type="{http://www.opentravel.org/OTA/2003/05}BaseItineraryType" maxOccurs="20" minOccurs="0"/>
 *                   &lt;element name="AltAccommodation" type="{http://www.opentravel.org/OTA/2003/05}AccomType" maxOccurs="30" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerCount" type="{http://www.opentravel.org/OTA/2003/05}FerryTravellerCountType" maxOccurs="12" minOccurs="0"/>
 *         &lt;element name="CabinDetails" type="{http://www.opentravel.org/OTA/2003/05}CabinDetails" minOccurs="0"/>
 *         &lt;element name="VehicleDetails" type="{http://www.opentravel.org/OTA/2003/05}VehicleDetailsType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="PetCount" type="{http://www.opentravel.org/OTA/2003/05}PetCountType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="PassengerDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PassengerDetail" type="{http://www.opentravel.org/OTA/2003/05}PassengerDetailType" maxOccurs="19"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FerryProductType", propOrder = {
    "originator",
    "itineraryLeg",
    "passengerCount",
    "cabinDetails",
    "vehicleDetails",
    "petCount",
    "passengerDetails"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.ProductBase.Ferry.class
})
public class FerryProductType {

    @XmlElement(name = "Originator")
    protected FerryPOSType originator;
    @XmlElement(name = "ItineraryLeg", required = true)
    protected List<FerryProductType.ItineraryLeg> itineraryLeg;
    @XmlElement(name = "PassengerCount")
    protected List<FerryTravellerCountType> passengerCount;
    @XmlElement(name = "CabinDetails")
    protected CabinDetails cabinDetails;
    @XmlElement(name = "VehicleDetails")
    protected List<VehicleDetailsType> vehicleDetails;
    @XmlElement(name = "PetCount")
    protected List<PetCountType> petCount;
    @XmlElement(name = "PassengerDetails")
    protected FerryProductType.PassengerDetails passengerDetails;
    @XmlAttribute(name = "BookingReferenceID")
    @XmlSchemaType(name = "anySimpleType")
    protected String bookingReferenceID;

    /**
     * 获取originator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryPOSType }
     *     
     */
    public FerryPOSType getOriginator() {
        return originator;
    }

    /**
     * 设置originator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryPOSType }
     *     
     */
    public void setOriginator(FerryPOSType value) {
        this.originator = value;
    }

    /**
     * Gets the value of the itineraryLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryProductType.ItineraryLeg }
     * 
     * 
     */
    public List<FerryProductType.ItineraryLeg> getItineraryLeg() {
        if (itineraryLeg == null) {
            itineraryLeg = new ArrayList<FerryProductType.ItineraryLeg>();
        }
        return this.itineraryLeg;
    }

    /**
     * Gets the value of the passengerCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryTravellerCountType }
     * 
     * 
     */
    public List<FerryTravellerCountType> getPassengerCount() {
        if (passengerCount == null) {
            passengerCount = new ArrayList<FerryTravellerCountType>();
        }
        return this.passengerCount;
    }

    /**
     * 获取cabinDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CabinDetails }
     *     
     */
    public CabinDetails getCabinDetails() {
        return cabinDetails;
    }

    /**
     * 设置cabinDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CabinDetails }
     *     
     */
    public void setCabinDetails(CabinDetails value) {
        this.cabinDetails = value;
    }

    /**
     * Gets the value of the vehicleDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleDetailsType }
     * 
     * 
     */
    public List<VehicleDetailsType> getVehicleDetails() {
        if (vehicleDetails == null) {
            vehicleDetails = new ArrayList<VehicleDetailsType>();
        }
        return this.vehicleDetails;
    }

    /**
     * Gets the value of the petCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PetCountType }
     * 
     * 
     */
    public List<PetCountType> getPetCount() {
        if (petCount == null) {
            petCount = new ArrayList<PetCountType>();
        }
        return this.petCount;
    }

    /**
     * 获取passengerDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryProductType.PassengerDetails }
     *     
     */
    public FerryProductType.PassengerDetails getPassengerDetails() {
        return passengerDetails;
    }

    /**
     * 设置passengerDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryProductType.PassengerDetails }
     *     
     */
    public void setPassengerDetails(FerryProductType.PassengerDetails value) {
        this.passengerDetails = value;
    }

    /**
     * 获取bookingReferenceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingReferenceID() {
        return bookingReferenceID;
    }

    /**
     * 设置bookingReferenceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingReferenceID(String value) {
        this.bookingReferenceID = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BaseItineraryType">
     *       &lt;sequence>
     *         &lt;element name="AltItinerary" type="{http://www.opentravel.org/OTA/2003/05}BaseItineraryType" maxOccurs="20" minOccurs="0"/>
     *         &lt;element name="AltAccommodation" type="{http://www.opentravel.org/OTA/2003/05}AccomType" maxOccurs="30" minOccurs="0"/>
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
        "altItinerary",
        "altAccommodation"
    })
    public static class ItineraryLeg
        extends BaseItineraryType
    {

        @XmlElement(name = "AltItinerary")
        protected List<BaseItineraryType> altItinerary;
        @XmlElement(name = "AltAccommodation")
        protected List<AccomType> altAccommodation;

        /**
         * Gets the value of the altItinerary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the altItinerary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAltItinerary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaseItineraryType }
         * 
         * 
         */
        public List<BaseItineraryType> getAltItinerary() {
            if (altItinerary == null) {
                altItinerary = new ArrayList<BaseItineraryType>();
            }
            return this.altItinerary;
        }

        /**
         * Gets the value of the altAccommodation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the altAccommodation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAltAccommodation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccomType }
         * 
         * 
         */
        public List<AccomType> getAltAccommodation() {
            if (altAccommodation == null) {
                altAccommodation = new ArrayList<AccomType>();
            }
            return this.altAccommodation;
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
     *         &lt;element name="PassengerDetail" type="{http://www.opentravel.org/OTA/2003/05}PassengerDetailType" maxOccurs="19"/>
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
        "passengerDetail"
    })
    public static class PassengerDetails {

        @XmlElement(name = "PassengerDetail", required = true)
        protected List<PassengerDetailType> passengerDetail;

        /**
         * Gets the value of the passengerDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PassengerDetailType }
         * 
         * 
         */
        public List<PassengerDetailType> getPassengerDetail() {
            if (passengerDetail == null) {
                passengerDetail = new ArrayList<PassengerDetailType>();
            }
            return this.passengerDetail;
        }

    }

}
