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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Common reservation details for booking and amendment messages
 * 
 * <p>FerryReservationRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FerryReservationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="ContactDetail" type="{http://www.opentravel.org/OTA/2003/05}FerryContactPersonType" minOccurs="0"/>
 *         &lt;element name="ItineraryLeg" type="{http://www.opentravel.org/OTA/2003/05}ItineraryRQ_Type" maxOccurs="2"/>
 *         &lt;element name="PassengerCount" maxOccurs="12" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FerryTravellerCountType">
 *                 &lt;sequence>
 *                   &lt;element name="SpecialNeed" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength0to64">
 *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleDetail" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleDetailsType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PetCount" type="{http://www.opentravel.org/OTA/2003/05}PetCountType" maxOccurs="4" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="OwnInsuranceChoices" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="OwnInsuranceChoice" type="{http://www.opentravel.org/OTA/2003/05}OwnInsuranceChoiceType" maxOccurs="9"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Insurance" type="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions_Type" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Quotation" type="{http://www.opentravel.org/OTA/2003/05}QuotationType" minOccurs="0"/>
 *         &lt;element name="Payment" type="{http://www.opentravel.org/OTA/2003/05}FerryPaymentDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FerryReservationRequest", propOrder = {
    "passengerDetails",
    "contactDetail",
    "itineraryLeg",
    "passengerCount",
    "vehicleDetail",
    "petCount",
    "ownInsuranceChoices",
    "insurance",
    "quotation",
    "payment"
})
public class FerryReservationRequest {

    @XmlElement(name = "PassengerDetails")
    protected FerryReservationRequest.PassengerDetails passengerDetails;
    @XmlElement(name = "ContactDetail")
    protected FerryContactPersonType contactDetail;
    @XmlElement(name = "ItineraryLeg", required = true)
    protected List<ItineraryRQType> itineraryLeg;
    @XmlElement(name = "PassengerCount")
    protected List<FerryReservationRequest.PassengerCount> passengerCount;
    @XmlElement(name = "VehicleDetail")
    protected List<FerryReservationRequest.VehicleDetail> vehicleDetail;
    @XmlElement(name = "PetCount")
    protected List<PetCountType> petCount;
    @XmlElement(name = "OwnInsuranceChoices")
    protected FerryReservationRequest.OwnInsuranceChoices ownInsuranceChoices;
    @XmlElement(name = "Insurance")
    protected TPAExtensionsType insurance;
    @XmlElement(name = "Quotation")
    protected QuotationType quotation;
    @XmlElement(name = "Payment")
    protected FerryPaymentDetailType payment;

    /**
     * 获取passengerDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryReservationRequest.PassengerDetails }
     *     
     */
    public FerryReservationRequest.PassengerDetails getPassengerDetails() {
        return passengerDetails;
    }

    /**
     * 设置passengerDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryReservationRequest.PassengerDetails }
     *     
     */
    public void setPassengerDetails(FerryReservationRequest.PassengerDetails value) {
        this.passengerDetails = value;
    }

    /**
     * 获取contactDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryContactPersonType }
     *     
     */
    public FerryContactPersonType getContactDetail() {
        return contactDetail;
    }

    /**
     * 设置contactDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryContactPersonType }
     *     
     */
    public void setContactDetail(FerryContactPersonType value) {
        this.contactDetail = value;
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
     * {@link ItineraryRQType }
     * 
     * 
     */
    public List<ItineraryRQType> getItineraryLeg() {
        if (itineraryLeg == null) {
            itineraryLeg = new ArrayList<ItineraryRQType>();
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
     * {@link FerryReservationRequest.PassengerCount }
     * 
     * 
     */
    public List<FerryReservationRequest.PassengerCount> getPassengerCount() {
        if (passengerCount == null) {
            passengerCount = new ArrayList<FerryReservationRequest.PassengerCount>();
        }
        return this.passengerCount;
    }

    /**
     * Gets the value of the vehicleDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryReservationRequest.VehicleDetail }
     * 
     * 
     */
    public List<FerryReservationRequest.VehicleDetail> getVehicleDetail() {
        if (vehicleDetail == null) {
            vehicleDetail = new ArrayList<FerryReservationRequest.VehicleDetail>();
        }
        return this.vehicleDetail;
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
     * 获取ownInsuranceChoices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryReservationRequest.OwnInsuranceChoices }
     *     
     */
    public FerryReservationRequest.OwnInsuranceChoices getOwnInsuranceChoices() {
        return ownInsuranceChoices;
    }

    /**
     * 设置ownInsuranceChoices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryReservationRequest.OwnInsuranceChoices }
     *     
     */
    public void setOwnInsuranceChoices(FerryReservationRequest.OwnInsuranceChoices value) {
        this.ownInsuranceChoices = value;
    }

    /**
     * 获取insurance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getInsurance() {
        return insurance;
    }

    /**
     * 设置insurance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setInsurance(TPAExtensionsType value) {
        this.insurance = value;
    }

    /**
     * 获取quotation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QuotationType }
     *     
     */
    public QuotationType getQuotation() {
        return quotation;
    }

    /**
     * 设置quotation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationType }
     *     
     */
    public void setQuotation(QuotationType value) {
        this.quotation = value;
    }

    /**
     * 获取payment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryPaymentDetailType }
     *     
     */
    public FerryPaymentDetailType getPayment() {
        return payment;
    }

    /**
     * 设置payment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryPaymentDetailType }
     *     
     */
    public void setPayment(FerryPaymentDetailType value) {
        this.payment = value;
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
     *         &lt;element name="OwnInsuranceChoice" type="{http://www.opentravel.org/OTA/2003/05}OwnInsuranceChoiceType" maxOccurs="9"/>
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
        "ownInsuranceChoice"
    })
    public static class OwnInsuranceChoices {

        @XmlElement(name = "OwnInsuranceChoice", required = true)
        protected List<OwnInsuranceChoiceType> ownInsuranceChoice;

        /**
         * Gets the value of the ownInsuranceChoice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ownInsuranceChoice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOwnInsuranceChoice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OwnInsuranceChoiceType }
         * 
         * 
         */
        public List<OwnInsuranceChoiceType> getOwnInsuranceChoice() {
            if (ownInsuranceChoice == null) {
                ownInsuranceChoice = new ArrayList<OwnInsuranceChoiceType>();
            }
            return this.ownInsuranceChoice;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FerryTravellerCountType">
     *       &lt;sequence>
     *         &lt;element name="SpecialNeed" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength0to64">
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "specialNeed"
    })
    public static class PassengerCount
        extends FerryTravellerCountType
    {

        @XmlElement(name = "SpecialNeed")
        protected List<FerryReservationRequest.PassengerCount.SpecialNeed> specialNeed;

        /**
         * Gets the value of the specialNeed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialNeed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialNeed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FerryReservationRequest.PassengerCount.SpecialNeed }
         * 
         * 
         */
        public List<FerryReservationRequest.PassengerCount.SpecialNeed> getSpecialNeed() {
            if (specialNeed == null) {
                specialNeed = new ArrayList<FerryReservationRequest.PassengerCount.SpecialNeed>();
            }
            return this.specialNeed;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength0to64">
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
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
        public static class SpecialNeed {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Code", required = true)
            protected String code;

            /**
             * Used for Character Strings, length 0 to 64
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
             * 获取code属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * 设置code属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleDetailsType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehicleDetail
        extends VehicleDetailsType
    {


    }

}
