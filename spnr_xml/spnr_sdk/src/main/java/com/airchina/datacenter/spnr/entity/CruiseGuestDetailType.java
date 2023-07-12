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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Provides the detail data associated with the guest for a particular sailing.
 * 
 * 
 * <p>CruiseGuestDetailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CruiseGuestDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedFareCode" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContactInfo" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GuestInfoGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GuestTransportation" type="{http://www.opentravel.org/OTA/2003/05}GuestTransportationType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="LoyaltyInfo" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LinkedTraveler" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType">
 *                 &lt;attribute name="LinkTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TravelDocument" type="{http://www.opentravel.org/OTA/2003/05}DocumentType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SelectedDining" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseDiningGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SelectedInsurance" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseInsuranceGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SelectedOptions" type="{http://www.opentravel.org/OTA/2003/05}AmenityOptionType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="SelectedPackages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SelectedPackage" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CruisePackageType">
 *                           &lt;sequence>
 *                             &lt;element name="AirInfo" type="{http://www.opentravel.org/OTA/2003/05}AirInfoType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SelectedSpecialServices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SelectedSpecialService" type="{http://www.opentravel.org/OTA/2003/05}SpecialServiceType" maxOccurs="10" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AirAccommodations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AirAccommodation" maxOccurs="10" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirInfoType">
 *                           &lt;attribute name="Comment" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                           &lt;attribute name="AirAccommodationType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CruiseDocument" type="{http://www.opentravel.org/OTA/2003/05}DocumentHandlingType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}CruiseProfileType" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GuestExistsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseGuestDetailType", propOrder = {
    "selectedFareCode",
    "contactInfo",
    "guestTransportation",
    "loyaltyInfo",
    "linkedTraveler",
    "travelDocument",
    "selectedDining",
    "selectedInsurance",
    "selectedOptions",
    "selectedPackages",
    "selectedSpecialServices",
    "airAccommodations",
    "cruiseDocument",
    "profiles"
})
public class CruiseGuestDetailType {

    @XmlElement(name = "SelectedFareCode")
    protected List<CruiseGuestDetailType.SelectedFareCode> selectedFareCode;
    @XmlElement(name = "ContactInfo")
    protected List<CruiseGuestDetailType.ContactInfo> contactInfo;
    @XmlElement(name = "GuestTransportation")
    protected List<GuestTransportationType> guestTransportation;
    @XmlElement(name = "LoyaltyInfo")
    protected List<CruiseGuestDetailType.LoyaltyInfo> loyaltyInfo;
    @XmlElement(name = "LinkedTraveler")
    protected List<CruiseGuestDetailType.LinkedTraveler> linkedTraveler;
    @XmlElement(name = "TravelDocument")
    protected List<DocumentType> travelDocument;
    @XmlElement(name = "SelectedDining")
    protected List<CruiseGuestDetailType.SelectedDining> selectedDining;
    @XmlElement(name = "SelectedInsurance")
    protected List<CruiseGuestDetailType.SelectedInsurance> selectedInsurance;
    @XmlElement(name = "SelectedOptions")
    protected List<AmenityOptionType> selectedOptions;
    @XmlElement(name = "SelectedPackages")
    protected CruiseGuestDetailType.SelectedPackages selectedPackages;
    @XmlElement(name = "SelectedSpecialServices")
    protected CruiseGuestDetailType.SelectedSpecialServices selectedSpecialServices;
    @XmlElement(name = "AirAccommodations")
    protected CruiseGuestDetailType.AirAccommodations airAccommodations;
    @XmlElement(name = "CruiseDocument")
    protected List<DocumentHandlingType> cruiseDocument;
    @XmlElement(name = "Profiles")
    protected List<CruiseProfileType> profiles;
    @XmlAttribute(name = "GuestExistsIndicator")
    protected Boolean guestExistsIndicator;

    /**
     * Gets the value of the selectedFareCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedFareCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedFareCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.SelectedFareCode }
     * 
     * 
     */
    public List<CruiseGuestDetailType.SelectedFareCode> getSelectedFareCode() {
        if (selectedFareCode == null) {
            selectedFareCode = new ArrayList<CruiseGuestDetailType.SelectedFareCode>();
        }
        return this.selectedFareCode;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.ContactInfo }
     * 
     * 
     */
    public List<CruiseGuestDetailType.ContactInfo> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<CruiseGuestDetailType.ContactInfo>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the guestTransportation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestTransportation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestTransportation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestTransportationType }
     * 
     * 
     */
    public List<GuestTransportationType> getGuestTransportation() {
        if (guestTransportation == null) {
            guestTransportation = new ArrayList<GuestTransportationType>();
        }
        return this.guestTransportation;
    }

    /**
     * Gets the value of the loyaltyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.LoyaltyInfo }
     * 
     * 
     */
    public List<CruiseGuestDetailType.LoyaltyInfo> getLoyaltyInfo() {
        if (loyaltyInfo == null) {
            loyaltyInfo = new ArrayList<CruiseGuestDetailType.LoyaltyInfo>();
        }
        return this.loyaltyInfo;
    }

    /**
     * Gets the value of the linkedTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.LinkedTraveler }
     * 
     * 
     */
    public List<CruiseGuestDetailType.LinkedTraveler> getLinkedTraveler() {
        if (linkedTraveler == null) {
            linkedTraveler = new ArrayList<CruiseGuestDetailType.LinkedTraveler>();
        }
        return this.linkedTraveler;
    }

    /**
     * Gets the value of the travelDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     * 
     * 
     */
    public List<DocumentType> getTravelDocument() {
        if (travelDocument == null) {
            travelDocument = new ArrayList<DocumentType>();
        }
        return this.travelDocument;
    }

    /**
     * Gets the value of the selectedDining property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedDining property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedDining().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.SelectedDining }
     * 
     * 
     */
    public List<CruiseGuestDetailType.SelectedDining> getSelectedDining() {
        if (selectedDining == null) {
            selectedDining = new ArrayList<CruiseGuestDetailType.SelectedDining>();
        }
        return this.selectedDining;
    }

    /**
     * Gets the value of the selectedInsurance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedInsurance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedInsurance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.SelectedInsurance }
     * 
     * 
     */
    public List<CruiseGuestDetailType.SelectedInsurance> getSelectedInsurance() {
        if (selectedInsurance == null) {
            selectedInsurance = new ArrayList<CruiseGuestDetailType.SelectedInsurance>();
        }
        return this.selectedInsurance;
    }

    /**
     * Gets the value of the selectedOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmenityOptionType }
     * 
     * 
     */
    public List<AmenityOptionType> getSelectedOptions() {
        if (selectedOptions == null) {
            selectedOptions = new ArrayList<AmenityOptionType>();
        }
        return this.selectedOptions;
    }

    /**
     * 获取selectedPackages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestDetailType.SelectedPackages }
     *     
     */
    public CruiseGuestDetailType.SelectedPackages getSelectedPackages() {
        return selectedPackages;
    }

    /**
     * 设置selectedPackages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestDetailType.SelectedPackages }
     *     
     */
    public void setSelectedPackages(CruiseGuestDetailType.SelectedPackages value) {
        this.selectedPackages = value;
    }

    /**
     * 获取selectedSpecialServices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestDetailType.SelectedSpecialServices }
     *     
     */
    public CruiseGuestDetailType.SelectedSpecialServices getSelectedSpecialServices() {
        return selectedSpecialServices;
    }

    /**
     * 设置selectedSpecialServices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestDetailType.SelectedSpecialServices }
     *     
     */
    public void setSelectedSpecialServices(CruiseGuestDetailType.SelectedSpecialServices value) {
        this.selectedSpecialServices = value;
    }

    /**
     * 获取airAccommodations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestDetailType.AirAccommodations }
     *     
     */
    public CruiseGuestDetailType.AirAccommodations getAirAccommodations() {
        return airAccommodations;
    }

    /**
     * 设置airAccommodations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestDetailType.AirAccommodations }
     *     
     */
    public void setAirAccommodations(CruiseGuestDetailType.AirAccommodations value) {
        this.airAccommodations = value;
    }

    /**
     * Gets the value of the cruiseDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cruiseDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCruiseDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentHandlingType }
     * 
     * 
     */
    public List<DocumentHandlingType> getCruiseDocument() {
        if (cruiseDocument == null) {
            cruiseDocument = new ArrayList<DocumentHandlingType>();
        }
        return this.cruiseDocument;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseProfileType }
     * 
     * 
     */
    public List<CruiseProfileType> getProfiles() {
        if (profiles == null) {
            profiles = new ArrayList<CruiseProfileType>();
        }
        return this.profiles;
    }

    /**
     * 获取guestExistsIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestExistsIndicator() {
        return guestExistsIndicator;
    }

    /**
     * 设置guestExistsIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestExistsIndicator(Boolean value) {
        this.guestExistsIndicator = value;
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
     *         &lt;element name="AirAccommodation" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirInfoType">
     *                 &lt;attribute name="Comment" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *                 &lt;attribute name="AirAccommodationType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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
        "airAccommodation"
    })
    public static class AirAccommodations {

        @XmlElement(name = "AirAccommodation")
        protected List<CruiseGuestDetailType.AirAccommodations.AirAccommodation> airAccommodation;

        /**
         * Gets the value of the airAccommodation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airAccommodation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirAccommodation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseGuestDetailType.AirAccommodations.AirAccommodation }
         * 
         * 
         */
        public List<CruiseGuestDetailType.AirAccommodations.AirAccommodation> getAirAccommodation() {
            if (airAccommodation == null) {
                airAccommodation = new ArrayList<CruiseGuestDetailType.AirAccommodations.AirAccommodation>();
            }
            return this.airAccommodation;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirInfoType">
         *       &lt;attribute name="Comment" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *       &lt;attribute name="AirAccommodationType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AirAccommodation
            extends AirInfoType
        {

            @XmlAttribute(name = "Comment")
            protected String comment;
            @XmlAttribute(name = "AirAccommodationType")
            protected String airAccommodationType;

            /**
             * 获取comment属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComment() {
                return comment;
            }

            /**
             * 设置comment属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComment(String value) {
                this.comment = value;
            }

            /**
             * 获取airAccommodationType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAirAccommodationType() {
                return airAccommodationType;
            }

            /**
             * 设置airAccommodationType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAirAccommodationType(String value) {
                this.airAccommodationType = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GuestInfoGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContactInfo
        extends ContactPersonType
    {

        @XmlAttribute(name = "GuestRefNumber")
        protected Integer guestRefNumber;
        @XmlAttribute(name = "Age")
        protected Integer age;
        @XmlAttribute(name = "Nationality")
        protected String nationality;
        @XmlAttribute(name = "GuestOccupation")
        protected String guestOccupation;
        @XmlAttribute(name = "BirthDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;
        @XmlAttribute(name = "LoyaltyMembershipID")
        protected String loyaltyMembershipID;
        @XmlAttribute(name = "LoyalLevel")
        protected String loyalLevel;
        @XmlAttribute(name = "LoyalLevelCode")
        protected Integer loyalLevelCode;
        @XmlAttribute(name = "Gender")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String gender;

        /**
         * 获取guestRefNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getGuestRefNumber() {
            return guestRefNumber;
        }

        /**
         * 设置guestRefNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setGuestRefNumber(Integer value) {
            this.guestRefNumber = value;
        }

        /**
         * 获取age属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAge() {
            return age;
        }

        /**
         * 设置age属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAge(Integer value) {
            this.age = value;
        }

        /**
         * 获取nationality属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationality() {
            return nationality;
        }

        /**
         * 设置nationality属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationality(String value) {
            this.nationality = value;
        }

        /**
         * 获取guestOccupation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuestOccupation() {
            return guestOccupation;
        }

        /**
         * 设置guestOccupation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuestOccupation(String value) {
            this.guestOccupation = value;
        }

        /**
         * 获取birthDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * 设置birthDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * 获取loyaltyMembershipID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoyaltyMembershipID() {
            return loyaltyMembershipID;
        }

        /**
         * 设置loyaltyMembershipID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoyaltyMembershipID(String value) {
            this.loyaltyMembershipID = value;
        }

        /**
         * 获取loyalLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoyalLevel() {
            return loyalLevel;
        }

        /**
         * 设置loyalLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoyalLevel(String value) {
            this.loyalLevel = value;
        }

        /**
         * 获取loyalLevelCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLoyalLevelCode() {
            return loyalLevelCode;
        }

        /**
         * 设置loyalLevelCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLoyalLevelCode(Integer value) {
            this.loyalLevelCode = value;
        }

        /**
         * 获取gender属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGender() {
            return gender;
        }

        /**
         * 设置gender属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGender(String value) {
            this.gender = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType">
     *       &lt;attribute name="LinkTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LinkedTraveler
        extends RelatedTravelerType
    {

        @XmlAttribute(name = "LinkTypeCode")
        protected String linkTypeCode;

        /**
         * 获取linkTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLinkTypeCode() {
            return linkTypeCode;
        }

        /**
         * 设置linkTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLinkTypeCode(String value) {
            this.linkTypeCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LoyaltyInfo {

        @XmlAttribute(name = "ProgramID")
        protected String programID;
        @XmlAttribute(name = "MembershipID")
        protected String membershipID;
        @XmlAttribute(name = "Password")
        protected String password;
        @XmlAttribute(name = "PasswordStatus")
        protected String passwordStatus;
        @XmlAttribute(name = "Status")
        protected String status;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "CustomerValue")
        protected String customerValue;
        @XmlAttribute(name = "SingleVendorInd")
        protected String singleVendorInd;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "VendorCode")
        protected List<String> vendorCode;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "SignupDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signupDate;
        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;
        @XmlAttribute(name = "LoyalLevel")
        protected String loyalLevel;
        @XmlAttribute(name = "LoyalLevelCode")
        protected Integer loyalLevelCode;

        /**
         * 获取programID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramID() {
            return programID;
        }

        /**
         * 设置programID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramID(String value) {
            this.programID = value;
        }

        /**
         * 获取membershipID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMembershipID() {
            return membershipID;
        }

        /**
         * 设置membershipID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMembershipID(String value) {
            this.membershipID = value;
        }

        /**
         * 获取password属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * 设置password属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * 获取passwordStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPasswordStatus() {
            return passwordStatus;
        }

        /**
         * 设置passwordStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPasswordStatus(String value) {
            this.passwordStatus = value;
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
         * 获取travelSector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * 设置travelSector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

        /**
         * 获取customerValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerValue() {
            return customerValue;
        }

        /**
         * 设置customerValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerValue(String value) {
            this.customerValue = value;
        }

        /**
         * 获取singleVendorInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingleVendorInd() {
            return singleVendorInd;
        }

        /**
         * 设置singleVendorInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingleVendorInd(String value) {
            this.singleVendorInd = value;
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
         * Gets the value of the vendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVendorCode() {
            if (vendorCode == null) {
                vendorCode = new ArrayList<String>();
            }
            return this.vendorCode;
        }

        /**
         * 获取effectiveDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * 设置effectiveDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * 获取expireDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * 设置expireDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * 获取signupDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSignupDate() {
            return signupDate;
        }

        /**
         * 设置signupDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSignupDate(XMLGregorianCalendar value) {
            this.signupDate = value;
        }

        /**
         * 获取shareSynchInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * 设置shareSynchInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * 获取shareMarketInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * 设置shareMarketInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

        /**
         * 获取loyalLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoyalLevel() {
            return loyalLevel;
        }

        /**
         * 设置loyalLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoyalLevel(String value) {
            this.loyalLevel = value;
        }

        /**
         * 获取loyalLevelCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLoyalLevelCode() {
            return loyalLevelCode;
        }

        /**
         * 设置loyalLevelCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLoyalLevelCode(Integer value) {
            this.loyalLevelCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseDiningGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedDining {

        @XmlAttribute(name = "SmokingCode")
        protected String smokingCode;
        @XmlAttribute(name = "DiningRoom")
        protected String diningRoom;
        @XmlAttribute(name = "TableSize")
        protected String tableSize;
        @XmlAttribute(name = "AgeCode")
        protected String ageCode;
        @XmlAttribute(name = "Language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlAttribute(name = "Sitting", required = true)
        protected String sitting;
        @XmlAttribute(name = "Status")
        protected String status;
        @XmlAttribute(name = "Preference")
        protected PreferLevelType preference;

        /**
         * 获取smokingCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSmokingCode() {
            return smokingCode;
        }

        /**
         * 设置smokingCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSmokingCode(String value) {
            this.smokingCode = value;
        }

        /**
         * 获取diningRoom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiningRoom() {
            return diningRoom;
        }

        /**
         * 设置diningRoom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiningRoom(String value) {
            this.diningRoom = value;
        }

        /**
         * 获取tableSize属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTableSize() {
            return tableSize;
        }

        /**
         * 设置tableSize属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTableSize(String value) {
            this.tableSize = value;
        }

        /**
         * 获取ageCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeCode() {
            return ageCode;
        }

        /**
         * 设置ageCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeCode(String value) {
            this.ageCode = value;
        }

        /**
         * 获取language属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * 设置language属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * 获取sitting属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSitting() {
            return sitting;
        }

        /**
         * 设置sitting属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSitting(String value) {
            this.sitting = value;
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
         * 获取preference属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreference() {
            return preference;
        }

        /**
         * 设置preference属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreference(PreferLevelType value) {
            this.preference = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedFareCode {

        @XmlAttribute(name = "FareCode")
        protected String fareCode;
        @XmlAttribute(name = "GroupCode")
        protected String groupCode;

        /**
         * 获取fareCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareCode() {
            return fareCode;
        }

        /**
         * 设置fareCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareCode(String value) {
            this.fareCode = value;
        }

        /**
         * 获取groupCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupCode() {
            return groupCode;
        }

        /**
         * 设置groupCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupCode(String value) {
            this.groupCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseInsuranceGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedInsurance {

        @XmlAttribute(name = "InsuranceCode")
        protected String insuranceCode;
        @XmlAttribute(name = "SelectedOptionIndicator")
        protected Boolean selectedOptionIndicator;
        @XmlAttribute(name = "DefaultIndicator")
        protected Boolean defaultIndicator;
        @XmlAttribute(name = "Status")
        protected String status;

        /**
         * 获取insuranceCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsuranceCode() {
            return insuranceCode;
        }

        /**
         * 设置insuranceCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsuranceCode(String value) {
            this.insuranceCode = value;
        }

        /**
         * 获取selectedOptionIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSelectedOptionIndicator() {
            return selectedOptionIndicator;
        }

        /**
         * 设置selectedOptionIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSelectedOptionIndicator(Boolean value) {
            this.selectedOptionIndicator = value;
        }

        /**
         * 获取defaultIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefaultIndicator() {
            return defaultIndicator;
        }

        /**
         * 设置defaultIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefaultIndicator(Boolean value) {
            this.defaultIndicator = value;
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
     *         &lt;element name="SelectedPackage" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CruisePackageType">
     *                 &lt;sequence>
     *                   &lt;element name="AirInfo" type="{http://www.opentravel.org/OTA/2003/05}AirInfoType" minOccurs="0"/>
     *                 &lt;/sequence>
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
        "selectedPackage"
    })
    public static class SelectedPackages {

        @XmlElement(name = "SelectedPackage")
        protected List<CruiseGuestDetailType.SelectedPackages.SelectedPackage> selectedPackage;

        /**
         * Gets the value of the selectedPackage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedPackage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedPackage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseGuestDetailType.SelectedPackages.SelectedPackage }
         * 
         * 
         */
        public List<CruiseGuestDetailType.SelectedPackages.SelectedPackage> getSelectedPackage() {
            if (selectedPackage == null) {
                selectedPackage = new ArrayList<CruiseGuestDetailType.SelectedPackages.SelectedPackage>();
            }
            return this.selectedPackage;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CruisePackageType">
         *       &lt;sequence>
         *         &lt;element name="AirInfo" type="{http://www.opentravel.org/OTA/2003/05}AirInfoType" minOccurs="0"/>
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
            "airInfo"
        })
        public static class SelectedPackage
            extends CruisePackageType
        {

            @XmlElement(name = "AirInfo")
            protected AirInfoType airInfo;

            /**
             * 获取airInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AirInfoType }
             *     
             */
            public AirInfoType getAirInfo() {
                return airInfo;
            }

            /**
             * 设置airInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AirInfoType }
             *     
             */
            public void setAirInfo(AirInfoType value) {
                this.airInfo = value;
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
     *         &lt;element name="SelectedSpecialService" type="{http://www.opentravel.org/OTA/2003/05}SpecialServiceType" maxOccurs="10" minOccurs="0"/>
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
        "selectedSpecialService"
    })
    public static class SelectedSpecialServices {

        @XmlElement(name = "SelectedSpecialService")
        protected List<SpecialServiceType> selectedSpecialService;

        /**
         * Gets the value of the selectedSpecialService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedSpecialService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedSpecialService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialServiceType }
         * 
         * 
         */
        public List<SpecialServiceType> getSelectedSpecialService() {
            if (selectedSpecialService == null) {
                selectedSpecialService = new ArrayList<SpecialServiceType>();
            }
            return this.selectedSpecialService;
        }

    }

}
