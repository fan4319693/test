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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Traveler and trip information used for targeted multi-modal offers.
 * 
 * <p>MultiModalOfferType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultiModalOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestingParty">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyCompanyType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ontology" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyDefinitionType">
 *                 &lt;sequence>
 *                   &lt;element name="CompatibleWith" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyDefinitionType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestedOffer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OfferTypes" type="{http://www.opentravel.org/OTA/2003/05}OntologyOfferType"/>
 *                   &lt;element name="TimePeriod">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EarliestStart">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CalculationMethod" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Formula" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferAvailabilityStartFormula">
 *                                                         &lt;attribute name="OtherType">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="OntologyRefID">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;pattern value="[0-9]{1,8}"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Distance" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyDistanceType">
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Duration" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
 *                                                         &lt;attribute name="OtherType">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="OntologyRefID">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;pattern value="[0-9]{1,8}"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="OtherType">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="OntologyRefID">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;pattern value="[0-9]{1,8}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="DateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                     &lt;attribute name="OntologyRefID">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="[0-9]{1,8}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MaximumDuration" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
 *                                     &lt;attribute name="OtherType">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="OntologyRefID">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="[0-9]{1,8}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="OntologyRefID">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{1,8}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GuidelinePricing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MaximumPrice" type="{http://www.opentravel.org/OTA/2003/05}OntologyCurrencyType"/>
 *                             &lt;element name="Method" type="{http://www.opentravel.org/OTA/2003/05}OntologyPricingMethodType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TripPurpose" type="{http://www.opentravel.org/OTA/2003/05}OntologyTripPurposeType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="NumberInParty" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TripCharacteristics" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Mode" type="{http://www.opentravel.org/OTA/2003/05}OntologyTripModeType"/>
 *                   &lt;element name="BookingMethod" type="{http://www.opentravel.org/OTA/2003/05}OntologyBookingMethodType" minOccurs="0"/>
 *                   &lt;element name="DateTimeDuration" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyTimeDurationType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Location" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyLocationType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PriceAndPayment" type="{http://www.opentravel.org/OTA/2003/05}OntologyPaymentType" minOccurs="0"/>
 *                   &lt;element name="ReservationStatus" type="{http://www.opentravel.org/OTA/2003/05}OntologyReservationStatusType" minOccurs="0"/>
 *                   &lt;element name="Baggage" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyBaggageType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Animals" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyAnimalType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Activity" type="{http://www.opentravel.org/OTA/2003/05}OntologyActivityType" minOccurs="0"/>
 *                   &lt;element name="Lodging" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyLodgingType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Transportation" type="{http://www.opentravel.org/OTA/2003/05}OntologyTransportationType" minOccurs="0"/>
 *                   &lt;element name="TripValue" type="{http://www.opentravel.org/OTA/2003/05}OntologyValueType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TravelerCharacteristics" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TripPurpose" type="{http://www.opentravel.org/OTA/2003/05}OntologyTripPurposeType" minOccurs="0"/>
 *                   &lt;element name="Classification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyTravelerClassType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DetailInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Identification" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}OntologyNameType" minOccurs="0"/>
 *                                       &lt;element name="Age" type="{http://www.opentravel.org/OTA/2003/05}OntologyAgeBirthDateType" minOccurs="0"/>
 *                                       &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}OntologyAddressType" minOccurs="0"/>
 *                                       &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}OntologyContactType" minOccurs="0"/>
 *                                       &lt;element name="LoyaltyProgram" type="{http://www.opentravel.org/OTA/2003/05}OntologyLoyaltyType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CustomerValue" type="{http://www.opentravel.org/OTA/2003/05}OntologyValueType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ServiceAnimalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="DisabledInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="FemaleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="MaleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiModalOfferType", propOrder = {
    "requestingParty",
    "ontology",
    "requestedOffer",
    "tripCharacteristics",
    "travelerCharacteristics",
    "ontologyExtension"
})
public class MultiModalOfferType {

    @XmlElement(name = "RequestingParty", required = true)
    protected MultiModalOfferType.RequestingParty requestingParty;
    @XmlElement(name = "Ontology")
    protected MultiModalOfferType.Ontology ontology;
    @XmlElement(name = "RequestedOffer", required = true)
    protected MultiModalOfferType.RequestedOffer requestedOffer;
    @XmlElement(name = "TripCharacteristics")
    protected MultiModalOfferType.TripCharacteristics tripCharacteristics;
    @XmlElement(name = "TravelerCharacteristics")
    protected MultiModalOfferType.TravelerCharacteristics travelerCharacteristics;
    @XmlElement(name = "OntologyExtension")
    protected OntologyExtensionType ontologyExtension;

    /**
     * 获取requestingParty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MultiModalOfferType.RequestingParty }
     *     
     */
    public MultiModalOfferType.RequestingParty getRequestingParty() {
        return requestingParty;
    }

    /**
     * 设置requestingParty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MultiModalOfferType.RequestingParty }
     *     
     */
    public void setRequestingParty(MultiModalOfferType.RequestingParty value) {
        this.requestingParty = value;
    }

    /**
     * 获取ontology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MultiModalOfferType.Ontology }
     *     
     */
    public MultiModalOfferType.Ontology getOntology() {
        return ontology;
    }

    /**
     * 设置ontology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MultiModalOfferType.Ontology }
     *     
     */
    public void setOntology(MultiModalOfferType.Ontology value) {
        this.ontology = value;
    }

    /**
     * 获取requestedOffer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MultiModalOfferType.RequestedOffer }
     *     
     */
    public MultiModalOfferType.RequestedOffer getRequestedOffer() {
        return requestedOffer;
    }

    /**
     * 设置requestedOffer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MultiModalOfferType.RequestedOffer }
     *     
     */
    public void setRequestedOffer(MultiModalOfferType.RequestedOffer value) {
        this.requestedOffer = value;
    }

    /**
     * 获取tripCharacteristics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MultiModalOfferType.TripCharacteristics }
     *     
     */
    public MultiModalOfferType.TripCharacteristics getTripCharacteristics() {
        return tripCharacteristics;
    }

    /**
     * 设置tripCharacteristics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MultiModalOfferType.TripCharacteristics }
     *     
     */
    public void setTripCharacteristics(MultiModalOfferType.TripCharacteristics value) {
        this.tripCharacteristics = value;
    }

    /**
     * 获取travelerCharacteristics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MultiModalOfferType.TravelerCharacteristics }
     *     
     */
    public MultiModalOfferType.TravelerCharacteristics getTravelerCharacteristics() {
        return travelerCharacteristics;
    }

    /**
     * 设置travelerCharacteristics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MultiModalOfferType.TravelerCharacteristics }
     *     
     */
    public void setTravelerCharacteristics(MultiModalOfferType.TravelerCharacteristics value) {
        this.travelerCharacteristics = value;
    }

    /**
     * 获取ontologyExtension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyExtensionType }
     *     
     */
    public OntologyExtensionType getOntologyExtension() {
        return ontologyExtension;
    }

    /**
     * 设置ontologyExtension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyExtensionType }
     *     
     */
    public void setOntologyExtension(OntologyExtensionType value) {
        this.ontologyExtension = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyDefinitionType">
     *       &lt;sequence>
     *         &lt;element name="CompatibleWith" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyDefinitionType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
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
        "compatibleWith",
        "ontologyExtension"
    })
    public static class Ontology
        extends OntologyDefinitionType
    {

        @XmlElement(name = "CompatibleWith")
        protected List<MultiModalOfferType.Ontology.CompatibleWith> compatibleWith;
        @XmlElement(name = "OntologyExtension")
        protected OntologyExtensionType ontologyExtension;

        /**
         * Gets the value of the compatibleWith property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the compatibleWith property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompatibleWith().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultiModalOfferType.Ontology.CompatibleWith }
         * 
         * 
         */
        public List<MultiModalOfferType.Ontology.CompatibleWith> getCompatibleWith() {
            if (compatibleWith == null) {
                compatibleWith = new ArrayList<MultiModalOfferType.Ontology.CompatibleWith>();
            }
            return this.compatibleWith;
        }

        /**
         * 获取ontologyExtension属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyExtensionType }
         *     
         */
        public OntologyExtensionType getOntologyExtension() {
            return ontologyExtension;
        }

        /**
         * 设置ontologyExtension属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyExtensionType }
         *     
         */
        public void setOntologyExtension(OntologyExtensionType value) {
            this.ontologyExtension = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyDefinitionType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CompatibleWith
            extends OntologyDefinitionType
        {


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
     *         &lt;element name="OfferTypes" type="{http://www.opentravel.org/OTA/2003/05}OntologyOfferType"/>
     *         &lt;element name="TimePeriod">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EarliestStart">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CalculationMethod" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Formula" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferAvailabilityStartFormula">
     *                                               &lt;attribute name="OtherType">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="OntologyRefID">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;pattern value="[0-9]{1,8}"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Distance" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyDistanceType">
     *                                             &lt;/extension>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Duration" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
     *                                               &lt;attribute name="OtherType">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="OntologyRefID">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;pattern value="[0-9]{1,8}"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="OtherType">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="OntologyRefID">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;pattern value="[0-9]{1,8}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="DateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                           &lt;attribute name="OntologyRefID">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;pattern value="[0-9]{1,8}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MaximumDuration" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
     *                           &lt;attribute name="OtherType">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="OntologyRefID">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;pattern value="[0-9]{1,8}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="OntologyRefID">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{1,8}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GuidelinePricing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MaximumPrice" type="{http://www.opentravel.org/OTA/2003/05}OntologyCurrencyType"/>
     *                   &lt;element name="Method" type="{http://www.opentravel.org/OTA/2003/05}OntologyPricingMethodType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TripPurpose" type="{http://www.opentravel.org/OTA/2003/05}OntologyTripPurposeType" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="NumberInParty" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offerTypes",
        "timePeriod",
        "guidelinePricing",
        "tripPurpose",
        "ontologyExtension"
    })
    public static class RequestedOffer {

        @XmlElement(name = "OfferTypes", required = true)
        protected OntologyOfferType offerTypes;
        @XmlElement(name = "TimePeriod", required = true)
        protected MultiModalOfferType.RequestedOffer.TimePeriod timePeriod;
        @XmlElement(name = "GuidelinePricing")
        protected MultiModalOfferType.RequestedOffer.GuidelinePricing guidelinePricing;
        @XmlElement(name = "TripPurpose")
        protected OntologyTripPurposeType tripPurpose;
        @XmlElement(name = "OntologyExtension")
        protected OntologyExtensionType ontologyExtension;
        @XmlAttribute(name = "NumberInParty", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger numberInParty;

        /**
         * 获取offerTypes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyOfferType }
         *     
         */
        public OntologyOfferType getOfferTypes() {
            return offerTypes;
        }

        /**
         * 设置offerTypes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyOfferType }
         *     
         */
        public void setOfferTypes(OntologyOfferType value) {
            this.offerTypes = value;
        }

        /**
         * 获取timePeriod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MultiModalOfferType.RequestedOffer.TimePeriod }
         *     
         */
        public MultiModalOfferType.RequestedOffer.TimePeriod getTimePeriod() {
            return timePeriod;
        }

        /**
         * 设置timePeriod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MultiModalOfferType.RequestedOffer.TimePeriod }
         *     
         */
        public void setTimePeriod(MultiModalOfferType.RequestedOffer.TimePeriod value) {
            this.timePeriod = value;
        }

        /**
         * 获取guidelinePricing属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MultiModalOfferType.RequestedOffer.GuidelinePricing }
         *     
         */
        public MultiModalOfferType.RequestedOffer.GuidelinePricing getGuidelinePricing() {
            return guidelinePricing;
        }

        /**
         * 设置guidelinePricing属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MultiModalOfferType.RequestedOffer.GuidelinePricing }
         *     
         */
        public void setGuidelinePricing(MultiModalOfferType.RequestedOffer.GuidelinePricing value) {
            this.guidelinePricing = value;
        }

        /**
         * 获取tripPurpose属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyTripPurposeType }
         *     
         */
        public OntologyTripPurposeType getTripPurpose() {
            return tripPurpose;
        }

        /**
         * 设置tripPurpose属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyTripPurposeType }
         *     
         */
        public void setTripPurpose(OntologyTripPurposeType value) {
            this.tripPurpose = value;
        }

        /**
         * 获取ontologyExtension属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyExtensionType }
         *     
         */
        public OntologyExtensionType getOntologyExtension() {
            return ontologyExtension;
        }

        /**
         * 设置ontologyExtension属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyExtensionType }
         *     
         */
        public void setOntologyExtension(OntologyExtensionType value) {
            this.ontologyExtension = value;
        }

        /**
         * 获取numberInParty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumberInParty() {
            return numberInParty;
        }

        /**
         * 设置numberInParty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumberInParty(BigInteger value) {
            this.numberInParty = value;
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
         *         &lt;element name="MaximumPrice" type="{http://www.opentravel.org/OTA/2003/05}OntologyCurrencyType"/>
         *         &lt;element name="Method" type="{http://www.opentravel.org/OTA/2003/05}OntologyPricingMethodType" minOccurs="0"/>
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
            "maximumPrice",
            "method"
        })
        public static class GuidelinePricing {

            @XmlElement(name = "MaximumPrice", required = true)
            protected OntologyCurrencyType maximumPrice;
            @XmlElement(name = "Method")
            protected OntologyPricingMethodType method;

            /**
             * 获取maximumPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link OntologyCurrencyType }
             *     
             */
            public OntologyCurrencyType getMaximumPrice() {
                return maximumPrice;
            }

            /**
             * 设置maximumPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OntologyCurrencyType }
             *     
             */
            public void setMaximumPrice(OntologyCurrencyType value) {
                this.maximumPrice = value;
            }

            /**
             * 获取method属性的值。
             * 
             * @return
             *     possible object is
             *     {@link OntologyPricingMethodType }
             *     
             */
            public OntologyPricingMethodType getMethod() {
                return method;
            }

            /**
             * 设置method属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OntologyPricingMethodType }
             *     
             */
            public void setMethod(OntologyPricingMethodType value) {
                this.method = value;
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
         *         &lt;element name="EarliestStart">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CalculationMethod" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Formula" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferAvailabilityStartFormula">
         *                                     &lt;attribute name="OtherType">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="OntologyRefID">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;pattern value="[0-9]{1,8}"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Distance" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyDistanceType">
         *                                   &lt;/extension>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Duration" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
         *                                     &lt;attribute name="OtherType">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="OntologyRefID">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;pattern value="[0-9]{1,8}"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="OtherType">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="OntologyRefID">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;pattern value="[0-9]{1,8}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="DateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                 &lt;attribute name="OntologyRefID">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="[0-9]{1,8}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MaximumDuration" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
         *                 &lt;attribute name="OtherType">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="OntologyRefID">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="[0-9]{1,8}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="OntologyRefID">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{1,8}"/>
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
        @XmlType(name = "", propOrder = {
            "earliestStart",
            "maximumDuration",
            "ontologyExtension"
        })
        public static class TimePeriod {

            @XmlElement(name = "EarliestStart", required = true)
            protected MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart earliestStart;
            @XmlElement(name = "MaximumDuration")
            protected MultiModalOfferType.RequestedOffer.TimePeriod.MaximumDuration maximumDuration;
            @XmlElement(name = "OntologyExtension")
            protected OntologyExtensionType ontologyExtension;
            @XmlAttribute(name = "OntologyRefID")
            protected String ontologyRefID;

            /**
             * 获取earliestStart属性的值。
             * 
             * @return
             *     possible object is
             *     {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart }
             *     
             */
            public MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart getEarliestStart() {
                return earliestStart;
            }

            /**
             * 设置earliestStart属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart }
             *     
             */
            public void setEarliestStart(MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart value) {
                this.earliestStart = value;
            }

            /**
             * 获取maximumDuration属性的值。
             * 
             * @return
             *     possible object is
             *     {@link MultiModalOfferType.RequestedOffer.TimePeriod.MaximumDuration }
             *     
             */
            public MultiModalOfferType.RequestedOffer.TimePeriod.MaximumDuration getMaximumDuration() {
                return maximumDuration;
            }

            /**
             * 设置maximumDuration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link MultiModalOfferType.RequestedOffer.TimePeriod.MaximumDuration }
             *     
             */
            public void setMaximumDuration(MultiModalOfferType.RequestedOffer.TimePeriod.MaximumDuration value) {
                this.maximumDuration = value;
            }

            /**
             * 获取ontologyExtension属性的值。
             * 
             * @return
             *     possible object is
             *     {@link OntologyExtensionType }
             *     
             */
            public OntologyExtensionType getOntologyExtension() {
                return ontologyExtension;
            }

            /**
             * 设置ontologyExtension属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OntologyExtensionType }
             *     
             */
            public void setOntologyExtension(OntologyExtensionType value) {
                this.ontologyExtension = value;
            }

            /**
             * 获取ontologyRefID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOntologyRefID() {
                return ontologyRefID;
            }

            /**
             * 设置ontologyRefID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOntologyRefID(String value) {
                this.ontologyRefID = value;
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
             *         &lt;element name="CalculationMethod" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Formula" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferAvailabilityStartFormula">
             *                           &lt;attribute name="OtherType">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="OntologyRefID">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;pattern value="[0-9]{1,8}"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Distance" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyDistanceType">
             *                         &lt;/extension>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Duration" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
             *                           &lt;attribute name="OtherType">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="OntologyRefID">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;pattern value="[0-9]{1,8}"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="OtherType">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="OntologyRefID">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;pattern value="[0-9]{1,8}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="DateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *       &lt;attribute name="OntologyRefID">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="[0-9]{1,8}"/>
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
            @XmlType(name = "", propOrder = {
                "calculationMethod",
                "ontologyExtension"
            })
            public static class EarliestStart {

                @XmlElement(name = "CalculationMethod")
                protected MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod calculationMethod;
                @XmlElement(name = "OntologyExtension")
                protected OntologyExtensionType ontologyExtension;
                @XmlAttribute(name = "DateTime", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar dateTime;
                @XmlAttribute(name = "OntologyRefID")
                protected String ontologyRefID;

                /**
                 * 获取calculationMethod属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod }
                 *     
                 */
                public MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod getCalculationMethod() {
                    return calculationMethod;
                }

                /**
                 * 设置calculationMethod属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod }
                 *     
                 */
                public void setCalculationMethod(MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod value) {
                    this.calculationMethod = value;
                }

                /**
                 * 获取ontologyExtension属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link OntologyExtensionType }
                 *     
                 */
                public OntologyExtensionType getOntologyExtension() {
                    return ontologyExtension;
                }

                /**
                 * 设置ontologyExtension属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OntologyExtensionType }
                 *     
                 */
                public void setOntologyExtension(OntologyExtensionType value) {
                    this.ontologyExtension = value;
                }

                /**
                 * 获取dateTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDateTime() {
                    return dateTime;
                }

                /**
                 * 设置dateTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDateTime(XMLGregorianCalendar value) {
                    this.dateTime = value;
                }

                /**
                 * 获取ontologyRefID属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOntologyRefID() {
                    return ontologyRefID;
                }

                /**
                 * 设置ontologyRefID属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOntologyRefID(String value) {
                    this.ontologyRefID = value;
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
                 *         &lt;element name="Formula" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferAvailabilityStartFormula">
                 *                 &lt;attribute name="OtherType">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="OntologyRefID">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;pattern value="[0-9]{1,8}"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Distance" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyDistanceType">
                 *               &lt;/extension>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Duration" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
                 *                 &lt;attribute name="OtherType">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="OntologyRefID">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;pattern value="[0-9]{1,8}"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="OtherType">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="OntologyRefID">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;pattern value="[0-9]{1,8}"/>
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
                @XmlType(name = "", propOrder = {
                    "formula",
                    "distance",
                    "duration",
                    "ontologyExtension"
                })
                public static class CalculationMethod {

                    @XmlElement(name = "Formula")
                    protected MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Formula formula;
                    @XmlElement(name = "Distance")
                    protected MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Distance distance;
                    @XmlElement(name = "Duration")
                    protected MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Duration duration;
                    @XmlElement(name = "OntologyExtension")
                    protected OntologyExtensionType ontologyExtension;
                    @XmlAttribute(name = "OtherType")
                    protected String otherType;
                    @XmlAttribute(name = "OntologyRefID")
                    protected String ontologyRefID;

                    /**
                     * 获取formula属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Formula }
                     *     
                     */
                    public MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Formula getFormula() {
                        return formula;
                    }

                    /**
                     * 设置formula属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Formula }
                     *     
                     */
                    public void setFormula(MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Formula value) {
                        this.formula = value;
                    }

                    /**
                     * 获取distance属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Distance }
                     *     
                     */
                    public MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Distance getDistance() {
                        return distance;
                    }

                    /**
                     * 设置distance属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Distance }
                     *     
                     */
                    public void setDistance(MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Distance value) {
                        this.distance = value;
                    }

                    /**
                     * 获取duration属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Duration }
                     *     
                     */
                    public MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Duration getDuration() {
                        return duration;
                    }

                    /**
                     * 设置duration属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Duration }
                     *     
                     */
                    public void setDuration(MultiModalOfferType.RequestedOffer.TimePeriod.EarliestStart.CalculationMethod.Duration value) {
                        this.duration = value;
                    }

                    /**
                     * 获取ontologyExtension属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link OntologyExtensionType }
                     *     
                     */
                    public OntologyExtensionType getOntologyExtension() {
                        return ontologyExtension;
                    }

                    /**
                     * 设置ontologyExtension属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OntologyExtensionType }
                     *     
                     */
                    public void setOntologyExtension(OntologyExtensionType value) {
                        this.ontologyExtension = value;
                    }

                    /**
                     * 获取otherType属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOtherType() {
                        return otherType;
                    }

                    /**
                     * 设置otherType属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOtherType(String value) {
                        this.otherType = value;
                    }

                    /**
                     * 获取ontologyRefID属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOntologyRefID() {
                        return ontologyRefID;
                    }

                    /**
                     * 设置ontologyRefID属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOntologyRefID(String value) {
                        this.ontologyRefID = value;
                    }


                    /**
                     * <p>anonymous complex type的 Java 类。
                     * 
                     * <p>以下模式片段指定包含在此类中的预期内容。
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyDistanceType">
                     *     &lt;/extension>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Distance
                        extends OntologyDistanceType
                    {


                    }


                    /**
                     * <p>anonymous complex type的 Java 类。
                     * 
                     * <p>以下模式片段指定包含在此类中的预期内容。
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
                     *       &lt;attribute name="OtherType">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="OntologyRefID">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;pattern value="[0-9]{1,8}"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
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
                    public static class Duration {

                        @XmlValue
                        protected ListOfferDurationUOM value;
                        @XmlAttribute(name = "OtherType")
                        protected String otherType;
                        @XmlAttribute(name = "OntologyRefID")
                        protected String ontologyRefID;

                        /**
                         * Source: Unit of Measure (UOM) OpenTravel codelist.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ListOfferDurationUOM }
                         *     
                         */
                        public ListOfferDurationUOM getValue() {
                            return value;
                        }

                        /**
                         * 设置value属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ListOfferDurationUOM }
                         *     
                         */
                        public void setValue(ListOfferDurationUOM value) {
                            this.value = value;
                        }

                        /**
                         * 获取otherType属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOtherType() {
                            return otherType;
                        }

                        /**
                         * 设置otherType属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOtherType(String value) {
                            this.otherType = value;
                        }

                        /**
                         * 获取ontologyRefID属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOntologyRefID() {
                            return ontologyRefID;
                        }

                        /**
                         * 设置ontologyRefID属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOntologyRefID(String value) {
                            this.ontologyRefID = value;
                        }

                    }


                    /**
                     * <p>anonymous complex type的 Java 类。
                     * 
                     * <p>以下模式片段指定包含在此类中的预期内容。
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferAvailabilityStartFormula">
                     *       &lt;attribute name="OtherType">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="OntologyRefID">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;pattern value="[0-9]{1,8}"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
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
                    public static class Formula {

                        @XmlValue
                        protected ListOfferAvailabilityStartFormula value;
                        @XmlAttribute(name = "OtherType")
                        protected String otherType;
                        @XmlAttribute(name = "OntologyRefID")
                        protected String ontologyRefID;

                        /**
                         * Source: OpenTravel
                         * 
                         * @return
                         *     possible object is
                         *     {@link ListOfferAvailabilityStartFormula }
                         *     
                         */
                        public ListOfferAvailabilityStartFormula getValue() {
                            return value;
                        }

                        /**
                         * 设置value属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ListOfferAvailabilityStartFormula }
                         *     
                         */
                        public void setValue(ListOfferAvailabilityStartFormula value) {
                            this.value = value;
                        }

                        /**
                         * 获取otherType属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOtherType() {
                            return otherType;
                        }

                        /**
                         * 设置otherType属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOtherType(String value) {
                            this.otherType = value;
                        }

                        /**
                         * 获取ontologyRefID属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOntologyRefID() {
                            return ontologyRefID;
                        }

                        /**
                         * 设置ontologyRefID属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOntologyRefID(String value) {
                            this.ontologyRefID = value;
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
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
             *       &lt;attribute name="OtherType">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="OntologyRefID">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="[0-9]{1,8}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
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
            public static class MaximumDuration {

                @XmlValue
                protected ListOfferDurationUOM value;
                @XmlAttribute(name = "OtherType")
                protected String otherType;
                @XmlAttribute(name = "OntologyRefID")
                protected String ontologyRefID;

                /**
                 * Source: Unit of Measure (UOM) OpenTravel codelist.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListOfferDurationUOM }
                 *     
                 */
                public ListOfferDurationUOM getValue() {
                    return value;
                }

                /**
                 * 设置value属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListOfferDurationUOM }
                 *     
                 */
                public void setValue(ListOfferDurationUOM value) {
                    this.value = value;
                }

                /**
                 * 获取otherType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherType() {
                    return otherType;
                }

                /**
                 * 设置otherType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherType(String value) {
                    this.otherType = value;
                }

                /**
                 * 获取ontologyRefID属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOntologyRefID() {
                    return ontologyRefID;
                }

                /**
                 * 设置ontologyRefID属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOntologyRefID(String value) {
                    this.ontologyRefID = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyCompanyType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RequestingParty
        extends OntologyCompanyType
    {


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
     *         &lt;element name="TripPurpose" type="{http://www.opentravel.org/OTA/2003/05}OntologyTripPurposeType" minOccurs="0"/>
     *         &lt;element name="Classification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyTravelerClassType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DetailInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Identification" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}OntologyNameType" minOccurs="0"/>
     *                             &lt;element name="Age" type="{http://www.opentravel.org/OTA/2003/05}OntologyAgeBirthDateType" minOccurs="0"/>
     *                             &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}OntologyAddressType" minOccurs="0"/>
     *                             &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}OntologyContactType" minOccurs="0"/>
     *                             &lt;element name="LoyaltyProgram" type="{http://www.opentravel.org/OTA/2003/05}OntologyLoyaltyType" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CustomerValue" type="{http://www.opentravel.org/OTA/2003/05}OntologyValueType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ServiceAnimalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="DisabledInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="FemaleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="MaleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
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
        "tripPurpose",
        "classification",
        "detailInfo",
        "ontologyExtension"
    })
    public static class TravelerCharacteristics {

        @XmlElement(name = "TripPurpose")
        protected OntologyTripPurposeType tripPurpose;
        @XmlElement(name = "Classification")
        protected MultiModalOfferType.TravelerCharacteristics.Classification classification;
        @XmlElement(name = "DetailInfo")
        protected List<MultiModalOfferType.TravelerCharacteristics.DetailInfo> detailInfo;
        @XmlElement(name = "OntologyExtension")
        protected OntologyExtensionType ontologyExtension;

        /**
         * 获取tripPurpose属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyTripPurposeType }
         *     
         */
        public OntologyTripPurposeType getTripPurpose() {
            return tripPurpose;
        }

        /**
         * 设置tripPurpose属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyTripPurposeType }
         *     
         */
        public void setTripPurpose(OntologyTripPurposeType value) {
            this.tripPurpose = value;
        }

        /**
         * 获取classification属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MultiModalOfferType.TravelerCharacteristics.Classification }
         *     
         */
        public MultiModalOfferType.TravelerCharacteristics.Classification getClassification() {
            return classification;
        }

        /**
         * 设置classification属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MultiModalOfferType.TravelerCharacteristics.Classification }
         *     
         */
        public void setClassification(MultiModalOfferType.TravelerCharacteristics.Classification value) {
            this.classification = value;
        }

        /**
         * Gets the value of the detailInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detailInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetailInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultiModalOfferType.TravelerCharacteristics.DetailInfo }
         * 
         * 
         */
        public List<MultiModalOfferType.TravelerCharacteristics.DetailInfo> getDetailInfo() {
            if (detailInfo == null) {
                detailInfo = new ArrayList<MultiModalOfferType.TravelerCharacteristics.DetailInfo>();
            }
            return this.detailInfo;
        }

        /**
         * 获取ontologyExtension属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyExtensionType }
         *     
         */
        public OntologyExtensionType getOntologyExtension() {
            return ontologyExtension;
        }

        /**
         * 设置ontologyExtension属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyExtensionType }
         *     
         */
        public void setOntologyExtension(OntologyExtensionType value) {
            this.ontologyExtension = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyTravelerClassType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Classification
            extends OntologyTravelerClassType
        {


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
         *         &lt;element name="Identification" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}OntologyNameType" minOccurs="0"/>
         *                   &lt;element name="Age" type="{http://www.opentravel.org/OTA/2003/05}OntologyAgeBirthDateType" minOccurs="0"/>
         *                   &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}OntologyAddressType" minOccurs="0"/>
         *                   &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}OntologyContactType" minOccurs="0"/>
         *                   &lt;element name="LoyaltyProgram" type="{http://www.opentravel.org/OTA/2003/05}OntologyLoyaltyType" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CustomerValue" type="{http://www.opentravel.org/OTA/2003/05}OntologyValueType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ServiceAnimalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="DisabledInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="FemaleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="MaleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "identification",
            "customerValue"
        })
        public static class DetailInfo {

            @XmlElement(name = "Identification")
            protected MultiModalOfferType.TravelerCharacteristics.DetailInfo.Identification identification;
            @XmlElement(name = "CustomerValue")
            protected OntologyValueType customerValue;
            @XmlAttribute(name = "ServiceAnimalInd")
            protected Boolean serviceAnimalInd;
            @XmlAttribute(name = "DisabledInd")
            protected Boolean disabledInd;
            @XmlAttribute(name = "FemaleInd")
            protected Boolean femaleInd;
            @XmlAttribute(name = "MaleInd")
            protected Boolean maleInd;

            /**
             * 获取identification属性的值。
             * 
             * @return
             *     possible object is
             *     {@link MultiModalOfferType.TravelerCharacteristics.DetailInfo.Identification }
             *     
             */
            public MultiModalOfferType.TravelerCharacteristics.DetailInfo.Identification getIdentification() {
                return identification;
            }

            /**
             * 设置identification属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link MultiModalOfferType.TravelerCharacteristics.DetailInfo.Identification }
             *     
             */
            public void setIdentification(MultiModalOfferType.TravelerCharacteristics.DetailInfo.Identification value) {
                this.identification = value;
            }

            /**
             * 获取customerValue属性的值。
             * 
             * @return
             *     possible object is
             *     {@link OntologyValueType }
             *     
             */
            public OntologyValueType getCustomerValue() {
                return customerValue;
            }

            /**
             * 设置customerValue属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OntologyValueType }
             *     
             */
            public void setCustomerValue(OntologyValueType value) {
                this.customerValue = value;
            }

            /**
             * 获取serviceAnimalInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isServiceAnimalInd() {
                return serviceAnimalInd;
            }

            /**
             * 设置serviceAnimalInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setServiceAnimalInd(Boolean value) {
                this.serviceAnimalInd = value;
            }

            /**
             * 获取disabledInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDisabledInd() {
                return disabledInd;
            }

            /**
             * 设置disabledInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDisabledInd(Boolean value) {
                this.disabledInd = value;
            }

            /**
             * 获取femaleInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFemaleInd() {
                return femaleInd;
            }

            /**
             * 设置femaleInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFemaleInd(Boolean value) {
                this.femaleInd = value;
            }

            /**
             * 获取maleInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMaleInd() {
                return maleInd;
            }

            /**
             * 设置maleInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMaleInd(Boolean value) {
                this.maleInd = value;
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
             *         &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}OntologyNameType" minOccurs="0"/>
             *         &lt;element name="Age" type="{http://www.opentravel.org/OTA/2003/05}OntologyAgeBirthDateType" minOccurs="0"/>
             *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}OntologyAddressType" minOccurs="0"/>
             *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}OntologyContactType" minOccurs="0"/>
             *         &lt;element name="LoyaltyProgram" type="{http://www.opentravel.org/OTA/2003/05}OntologyLoyaltyType" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
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
                "name",
                "age",
                "address",
                "contact",
                "loyaltyProgram",
                "ontologyExtension"
            })
            public static class Identification {

                @XmlElement(name = "Name")
                protected OntologyNameType name;
                @XmlElement(name = "Age")
                protected OntologyAgeBirthDateType age;
                @XmlElement(name = "Address")
                protected OntologyAddressType address;
                @XmlElement(name = "Contact")
                protected OntologyContactType contact;
                @XmlElement(name = "LoyaltyProgram")
                protected List<OntologyLoyaltyType> loyaltyProgram;
                @XmlElement(name = "OntologyExtension")
                protected OntologyExtensionType ontologyExtension;

                /**
                 * 获取name属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link OntologyNameType }
                 *     
                 */
                public OntologyNameType getName() {
                    return name;
                }

                /**
                 * 设置name属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OntologyNameType }
                 *     
                 */
                public void setName(OntologyNameType value) {
                    this.name = value;
                }

                /**
                 * 获取age属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link OntologyAgeBirthDateType }
                 *     
                 */
                public OntologyAgeBirthDateType getAge() {
                    return age;
                }

                /**
                 * 设置age属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OntologyAgeBirthDateType }
                 *     
                 */
                public void setAge(OntologyAgeBirthDateType value) {
                    this.age = value;
                }

                /**
                 * 获取address属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link OntologyAddressType }
                 *     
                 */
                public OntologyAddressType getAddress() {
                    return address;
                }

                /**
                 * 设置address属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OntologyAddressType }
                 *     
                 */
                public void setAddress(OntologyAddressType value) {
                    this.address = value;
                }

                /**
                 * 获取contact属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link OntologyContactType }
                 *     
                 */
                public OntologyContactType getContact() {
                    return contact;
                }

                /**
                 * 设置contact属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OntologyContactType }
                 *     
                 */
                public void setContact(OntologyContactType value) {
                    this.contact = value;
                }

                /**
                 * Gets the value of the loyaltyProgram property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the loyaltyProgram property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLoyaltyProgram().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OntologyLoyaltyType }
                 * 
                 * 
                 */
                public List<OntologyLoyaltyType> getLoyaltyProgram() {
                    if (loyaltyProgram == null) {
                        loyaltyProgram = new ArrayList<OntologyLoyaltyType>();
                    }
                    return this.loyaltyProgram;
                }

                /**
                 * 获取ontologyExtension属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link OntologyExtensionType }
                 *     
                 */
                public OntologyExtensionType getOntologyExtension() {
                    return ontologyExtension;
                }

                /**
                 * 设置ontologyExtension属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OntologyExtensionType }
                 *     
                 */
                public void setOntologyExtension(OntologyExtensionType value) {
                    this.ontologyExtension = value;
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
     *       &lt;sequence>
     *         &lt;element name="Mode" type="{http://www.opentravel.org/OTA/2003/05}OntologyTripModeType"/>
     *         &lt;element name="BookingMethod" type="{http://www.opentravel.org/OTA/2003/05}OntologyBookingMethodType" minOccurs="0"/>
     *         &lt;element name="DateTimeDuration" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyTimeDurationType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Location" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyLocationType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PriceAndPayment" type="{http://www.opentravel.org/OTA/2003/05}OntologyPaymentType" minOccurs="0"/>
     *         &lt;element name="ReservationStatus" type="{http://www.opentravel.org/OTA/2003/05}OntologyReservationStatusType" minOccurs="0"/>
     *         &lt;element name="Baggage" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyBaggageType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Animals" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyAnimalType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Activity" type="{http://www.opentravel.org/OTA/2003/05}OntologyActivityType" minOccurs="0"/>
     *         &lt;element name="Lodging" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyLodgingType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Transportation" type="{http://www.opentravel.org/OTA/2003/05}OntologyTransportationType" minOccurs="0"/>
     *         &lt;element name="TripValue" type="{http://www.opentravel.org/OTA/2003/05}OntologyValueType" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
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
        "mode",
        "bookingMethod",
        "dateTimeDuration",
        "location",
        "priceAndPayment",
        "reservationStatus",
        "baggage",
        "animals",
        "activity",
        "lodging",
        "transportation",
        "tripValue",
        "ontologyExtension"
    })
    public static class TripCharacteristics {

        @XmlElement(name = "Mode", required = true)
        protected OntologyTripModeType mode;
        @XmlElement(name = "BookingMethod")
        protected OntologyBookingMethodType bookingMethod;
        @XmlElement(name = "DateTimeDuration")
        protected MultiModalOfferType.TripCharacteristics.DateTimeDuration dateTimeDuration;
        @XmlElement(name = "Location")
        protected List<MultiModalOfferType.TripCharacteristics.Location> location;
        @XmlElement(name = "PriceAndPayment")
        protected OntologyPaymentType priceAndPayment;
        @XmlElement(name = "ReservationStatus")
        protected OntologyReservationStatusType reservationStatus;
        @XmlElement(name = "Baggage")
        protected MultiModalOfferType.TripCharacteristics.Baggage baggage;
        @XmlElement(name = "Animals")
        protected MultiModalOfferType.TripCharacteristics.Animals animals;
        @XmlElement(name = "Activity")
        protected OntologyActivityType activity;
        @XmlElement(name = "Lodging")
        protected MultiModalOfferType.TripCharacteristics.Lodging lodging;
        @XmlElement(name = "Transportation")
        protected OntologyTransportationType transportation;
        @XmlElement(name = "TripValue")
        protected OntologyValueType tripValue;
        @XmlElement(name = "OntologyExtension")
        protected OntologyExtensionType ontologyExtension;

        /**
         * 获取mode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyTripModeType }
         *     
         */
        public OntologyTripModeType getMode() {
            return mode;
        }

        /**
         * 设置mode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyTripModeType }
         *     
         */
        public void setMode(OntologyTripModeType value) {
            this.mode = value;
        }

        /**
         * 获取bookingMethod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyBookingMethodType }
         *     
         */
        public OntologyBookingMethodType getBookingMethod() {
            return bookingMethod;
        }

        /**
         * 设置bookingMethod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyBookingMethodType }
         *     
         */
        public void setBookingMethod(OntologyBookingMethodType value) {
            this.bookingMethod = value;
        }

        /**
         * 获取dateTimeDuration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MultiModalOfferType.TripCharacteristics.DateTimeDuration }
         *     
         */
        public MultiModalOfferType.TripCharacteristics.DateTimeDuration getDateTimeDuration() {
            return dateTimeDuration;
        }

        /**
         * 设置dateTimeDuration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MultiModalOfferType.TripCharacteristics.DateTimeDuration }
         *     
         */
        public void setDateTimeDuration(MultiModalOfferType.TripCharacteristics.DateTimeDuration value) {
            this.dateTimeDuration = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the location property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultiModalOfferType.TripCharacteristics.Location }
         * 
         * 
         */
        public List<MultiModalOfferType.TripCharacteristics.Location> getLocation() {
            if (location == null) {
                location = new ArrayList<MultiModalOfferType.TripCharacteristics.Location>();
            }
            return this.location;
        }

        /**
         * 获取priceAndPayment属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyPaymentType }
         *     
         */
        public OntologyPaymentType getPriceAndPayment() {
            return priceAndPayment;
        }

        /**
         * 设置priceAndPayment属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyPaymentType }
         *     
         */
        public void setPriceAndPayment(OntologyPaymentType value) {
            this.priceAndPayment = value;
        }

        /**
         * 获取reservationStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyReservationStatusType }
         *     
         */
        public OntologyReservationStatusType getReservationStatus() {
            return reservationStatus;
        }

        /**
         * 设置reservationStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyReservationStatusType }
         *     
         */
        public void setReservationStatus(OntologyReservationStatusType value) {
            this.reservationStatus = value;
        }

        /**
         * 获取baggage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MultiModalOfferType.TripCharacteristics.Baggage }
         *     
         */
        public MultiModalOfferType.TripCharacteristics.Baggage getBaggage() {
            return baggage;
        }

        /**
         * 设置baggage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MultiModalOfferType.TripCharacteristics.Baggage }
         *     
         */
        public void setBaggage(MultiModalOfferType.TripCharacteristics.Baggage value) {
            this.baggage = value;
        }

        /**
         * 获取animals属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MultiModalOfferType.TripCharacteristics.Animals }
         *     
         */
        public MultiModalOfferType.TripCharacteristics.Animals getAnimals() {
            return animals;
        }

        /**
         * 设置animals属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MultiModalOfferType.TripCharacteristics.Animals }
         *     
         */
        public void setAnimals(MultiModalOfferType.TripCharacteristics.Animals value) {
            this.animals = value;
        }

        /**
         * 获取activity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyActivityType }
         *     
         */
        public OntologyActivityType getActivity() {
            return activity;
        }

        /**
         * 设置activity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyActivityType }
         *     
         */
        public void setActivity(OntologyActivityType value) {
            this.activity = value;
        }

        /**
         * 获取lodging属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MultiModalOfferType.TripCharacteristics.Lodging }
         *     
         */
        public MultiModalOfferType.TripCharacteristics.Lodging getLodging() {
            return lodging;
        }

        /**
         * 设置lodging属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MultiModalOfferType.TripCharacteristics.Lodging }
         *     
         */
        public void setLodging(MultiModalOfferType.TripCharacteristics.Lodging value) {
            this.lodging = value;
        }

        /**
         * 获取transportation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyTransportationType }
         *     
         */
        public OntologyTransportationType getTransportation() {
            return transportation;
        }

        /**
         * 设置transportation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyTransportationType }
         *     
         */
        public void setTransportation(OntologyTransportationType value) {
            this.transportation = value;
        }

        /**
         * 获取tripValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyValueType }
         *     
         */
        public OntologyValueType getTripValue() {
            return tripValue;
        }

        /**
         * 设置tripValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyValueType }
         *     
         */
        public void setTripValue(OntologyValueType value) {
            this.tripValue = value;
        }

        /**
         * 获取ontologyExtension属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyExtensionType }
         *     
         */
        public OntologyExtensionType getOntologyExtension() {
            return ontologyExtension;
        }

        /**
         * 设置ontologyExtension属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyExtensionType }
         *     
         */
        public void setOntologyExtension(OntologyExtensionType value) {
            this.ontologyExtension = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyAnimalType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Animals
            extends OntologyAnimalType
        {


        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyBaggageType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Baggage
            extends OntologyBaggageType
        {


        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyTimeDurationType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DateTimeDuration
            extends OntologyTimeDurationType
        {


        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyLocationType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Location
            extends OntologyLocationType
        {


        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyLodgingType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Lodging
            extends OntologyLodgingType
        {


        }

    }

}
