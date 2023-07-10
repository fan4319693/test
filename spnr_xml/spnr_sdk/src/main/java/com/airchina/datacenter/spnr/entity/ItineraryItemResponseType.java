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


/**
 * Response data for any valid item of inventory.
 * 
 * <p>ItineraryItemResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItineraryItemResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Accommodation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identity" type="{http://www.opentravel.org/OTA/2003/05}PropertyIdentityType" minOccurs="0"/>
 *                   &lt;element name="AccommodationClass" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AccommodationClassGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType"/>
 *                   &lt;element name="RoomProfiles" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RoomProfile" maxOccurs="9">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomProfileType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Prices" maxOccurs="9" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Price" maxOccurs="9">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="SupplementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="MealPlanRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MealPlans" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MealPlan" type="{http://www.opentravel.org/OTA/2003/05}MealPlanType" maxOccurs="9"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="ResortName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="ResortCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Flight" type="{http://www.opentravel.org/OTA/2003/05}PkgFlightSegmentType"/>
 *         &lt;element name="RentalCar">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType">
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PackageItemPositionGroup"/>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryItemResponseType", propOrder = {
    "accommodation",
    "flight",
    "rentalCar"
})
public class ItineraryItemResponseType {

    @XmlElement(name = "Accommodation")
    protected ItineraryItemResponseType.Accommodation accommodation;
    @XmlElement(name = "Flight")
    protected PkgFlightSegmentType flight;
    @XmlElement(name = "RentalCar")
    protected ItineraryItemResponseType.RentalCar rentalCar;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "ItinerarySequence")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itinerarySequence;
    @XmlAttribute(name = "ChronologicalSequence")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger chronologicalSequence;

    /**
     * 获取accommodation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItineraryItemResponseType.Accommodation }
     *     
     */
    public ItineraryItemResponseType.Accommodation getAccommodation() {
        return accommodation;
    }

    /**
     * 设置accommodation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryItemResponseType.Accommodation }
     *     
     */
    public void setAccommodation(ItineraryItemResponseType.Accommodation value) {
        this.accommodation = value;
    }

    /**
     * 获取flight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PkgFlightSegmentType }
     *     
     */
    public PkgFlightSegmentType getFlight() {
        return flight;
    }

    /**
     * 设置flight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PkgFlightSegmentType }
     *     
     */
    public void setFlight(PkgFlightSegmentType value) {
        this.flight = value;
    }

    /**
     * 获取rentalCar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItineraryItemResponseType.RentalCar }
     *     
     */
    public ItineraryItemResponseType.RentalCar getRentalCar() {
        return rentalCar;
    }

    /**
     * 设置rentalCar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryItemResponseType.RentalCar }
     *     
     */
    public void setRentalCar(ItineraryItemResponseType.RentalCar value) {
        this.rentalCar = value;
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
     * 获取itinerarySequence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItinerarySequence() {
        return itinerarySequence;
    }

    /**
     * 设置itinerarySequence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItinerarySequence(BigInteger value) {
        this.itinerarySequence = value;
    }

    /**
     * 获取chronologicalSequence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChronologicalSequence() {
        return chronologicalSequence;
    }

    /**
     * 设置chronologicalSequence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChronologicalSequence(BigInteger value) {
        this.chronologicalSequence = value;
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
     *         &lt;element name="Identity" type="{http://www.opentravel.org/OTA/2003/05}PropertyIdentityType" minOccurs="0"/>
     *         &lt;element name="AccommodationClass" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AccommodationClassGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType"/>
     *         &lt;element name="RoomProfiles" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RoomProfile" maxOccurs="9">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomProfileType">
     *                           &lt;sequence>
     *                             &lt;element name="Prices" maxOccurs="9" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Price" maxOccurs="9">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="SupplementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="MealPlanRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="MealPlans" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MealPlan" type="{http://www.opentravel.org/OTA/2003/05}MealPlanType" maxOccurs="9"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="ResortName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="ResortCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "identity",
        "accommodationClass",
        "dateRange",
        "roomProfiles",
        "mealPlans"
    })
    public static class Accommodation {

        @XmlElement(name = "Identity")
        protected PropertyIdentityType identity;
        @XmlElement(name = "AccommodationClass")
        protected ItineraryItemResponseType.Accommodation.AccommodationClass accommodationClass;
        @XmlElement(name = "DateRange", required = true)
        protected DateTimeSpanType dateRange;
        @XmlElement(name = "RoomProfiles")
        protected ItineraryItemResponseType.Accommodation.RoomProfiles roomProfiles;
        @XmlElement(name = "MealPlans")
        protected ItineraryItemResponseType.Accommodation.MealPlans mealPlans;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "ResortName")
        protected String resortName;
        @XmlAttribute(name = "ResortCode")
        protected String resortCode;

        /**
         * 获取identity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PropertyIdentityType }
         *     
         */
        public PropertyIdentityType getIdentity() {
            return identity;
        }

        /**
         * 设置identity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PropertyIdentityType }
         *     
         */
        public void setIdentity(PropertyIdentityType value) {
            this.identity = value;
        }

        /**
         * 获取accommodationClass属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ItineraryItemResponseType.Accommodation.AccommodationClass }
         *     
         */
        public ItineraryItemResponseType.Accommodation.AccommodationClass getAccommodationClass() {
            return accommodationClass;
        }

        /**
         * 设置accommodationClass属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ItineraryItemResponseType.Accommodation.AccommodationClass }
         *     
         */
        public void setAccommodationClass(ItineraryItemResponseType.Accommodation.AccommodationClass value) {
            this.accommodationClass = value;
        }

        /**
         * 获取dateRange属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DateTimeSpanType }
         *     
         */
        public DateTimeSpanType getDateRange() {
            return dateRange;
        }

        /**
         * 设置dateRange属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeSpanType }
         *     
         */
        public void setDateRange(DateTimeSpanType value) {
            this.dateRange = value;
        }

        /**
         * 获取roomProfiles属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ItineraryItemResponseType.Accommodation.RoomProfiles }
         *     
         */
        public ItineraryItemResponseType.Accommodation.RoomProfiles getRoomProfiles() {
            return roomProfiles;
        }

        /**
         * 设置roomProfiles属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ItineraryItemResponseType.Accommodation.RoomProfiles }
         *     
         */
        public void setRoomProfiles(ItineraryItemResponseType.Accommodation.RoomProfiles value) {
            this.roomProfiles = value;
        }

        /**
         * 获取mealPlans属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ItineraryItemResponseType.Accommodation.MealPlans }
         *     
         */
        public ItineraryItemResponseType.Accommodation.MealPlans getMealPlans() {
            return mealPlans;
        }

        /**
         * 设置mealPlans属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ItineraryItemResponseType.Accommodation.MealPlans }
         *     
         */
        public void setMealPlans(ItineraryItemResponseType.Accommodation.MealPlans value) {
            this.mealPlans = value;
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
         * 获取resortName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResortName() {
            return resortName;
        }

        /**
         * 设置resortName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResortName(String value) {
            this.resortName = value;
        }

        /**
         * 获取resortCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResortCode() {
            return resortCode;
        }

        /**
         * 设置resortCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResortCode(String value) {
            this.resortCode = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AccommodationClassGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AccommodationClass {

            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "NationalCode")
            protected String nationalCode;
            @XmlAttribute(name = "OfficialName")
            protected String officialName;

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

            /**
             * 获取name属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * 设置name属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * 获取nationalCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNationalCode() {
                return nationalCode;
            }

            /**
             * 设置nationalCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNationalCode(String value) {
                this.nationalCode = value;
            }

            /**
             * 获取officialName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOfficialName() {
                return officialName;
            }

            /**
             * 设置officialName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOfficialName(String value) {
                this.officialName = value;
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
         *         &lt;element name="MealPlan" type="{http://www.opentravel.org/OTA/2003/05}MealPlanType" maxOccurs="9"/>
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
            "mealPlan"
        })
        public static class MealPlans {

            @XmlElement(name = "MealPlan", required = true)
            protected List<MealPlanType> mealPlan;

            /**
             * Gets the value of the mealPlan property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mealPlan property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMealPlan().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MealPlanType }
             * 
             * 
             */
            public List<MealPlanType> getMealPlan() {
                if (mealPlan == null) {
                    mealPlan = new ArrayList<MealPlanType>();
                }
                return this.mealPlan;
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
         *         &lt;element name="RoomProfile" maxOccurs="9">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomProfileType">
         *                 &lt;sequence>
         *                   &lt;element name="Prices" maxOccurs="9" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Price" maxOccurs="9">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="SupplementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="MealPlanRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            "roomProfile"
        })
        public static class RoomProfiles {

            @XmlElement(name = "RoomProfile", required = true)
            protected List<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile> roomProfile;

            /**
             * Gets the value of the roomProfile property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the roomProfile property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoomProfile().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile }
             * 
             * 
             */
            public List<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile> getRoomProfile() {
                if (roomProfile == null) {
                    roomProfile = new ArrayList<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile>();
                }
                return this.roomProfile;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomProfileType">
             *       &lt;sequence>
             *         &lt;element name="Prices" maxOccurs="9" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Price" maxOccurs="9">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="SupplementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="MealPlanRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
                "prices"
            })
            public static class RoomProfile
                extends RoomProfileType
            {

                @XmlElement(name = "Prices")
                protected List<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices> prices;

                /**
                 * Gets the value of the prices property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the prices property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPrices().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices }
                 * 
                 * 
                 */
                public List<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices> getPrices() {
                    if (prices == null) {
                        prices = new ArrayList<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices>();
                    }
                    return this.prices;
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
                 *         &lt;element name="Price" maxOccurs="9">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="SupplementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="MealPlanRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "price"
                })
                public static class Prices {

                    @XmlElement(name = "Price", required = true)
                    protected List<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price> price;
                    @XmlAttribute(name = "SupplementIndicator")
                    protected Boolean supplementIndicator;
                    @XmlAttribute(name = "MealPlanRPH")
                    protected String mealPlanRPH;

                    /**
                     * Gets the value of the price property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the price property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPrice().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price }
                     * 
                     * 
                     */
                    public List<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price> getPrice() {
                        if (price == null) {
                            price = new ArrayList<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price>();
                        }
                        return this.price;
                    }

                    /**
                     * 获取supplementIndicator属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isSupplementIndicator() {
                        return supplementIndicator;
                    }

                    /**
                     * 设置supplementIndicator属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setSupplementIndicator(Boolean value) {
                        this.supplementIndicator = value;
                    }

                    /**
                     * 获取mealPlanRPH属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMealPlanRPH() {
                        return mealPlanRPH;
                    }

                    /**
                     * 设置mealPlanRPH属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMealPlanRPH(String value) {
                        this.mealPlanRPH = value;
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
                     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Price {

                        @XmlAttribute(name = "PriceQualifier")
                        protected Integer priceQualifier;
                        @XmlAttribute(name = "PriceBasis")
                        protected PricingType priceBasis;
                        @XmlAttribute(name = "AgeQualifyingCode")
                        protected String ageQualifyingCode;
                        @XmlAttribute(name = "Age")
                        protected Integer age;
                        @XmlAttribute(name = "Count")
                        protected Integer count;
                        @XmlAttribute(name = "Amount")
                        protected Float amount;
                        @XmlAttribute(name = "BaseAmount")
                        protected Float baseAmount;
                        @XmlAttribute(name = "PrePayInd")
                        protected Boolean prePayInd;
                        @XmlAttribute(name = "CurrencyCode")
                        protected String currencyCode;
                        @XmlAttribute(name = "DecimalPlaces")
                        @XmlSchemaType(name = "nonNegativeInteger")
                        protected BigInteger decimalPlaces;
                        @XmlAttribute(name = "OriginalAmount")
                        protected Float originalAmount;
                        @XmlAttribute(name = "OriginalCurrencyCode")
                        protected String originalCurrencyCode;

                        /**
                         * 获取priceQualifier属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getPriceQualifier() {
                            return priceQualifier;
                        }

                        /**
                         * 设置priceQualifier属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setPriceQualifier(Integer value) {
                            this.priceQualifier = value;
                        }

                        /**
                         * 获取priceBasis属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link PricingType }
                         *     
                         */
                        public PricingType getPriceBasis() {
                            return priceBasis;
                        }

                        /**
                         * 设置priceBasis属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PricingType }
                         *     
                         */
                        public void setPriceBasis(PricingType value) {
                            this.priceBasis = value;
                        }

                        /**
                         * 获取ageQualifyingCode属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAgeQualifyingCode() {
                            return ageQualifyingCode;
                        }

                        /**
                         * 设置ageQualifyingCode属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAgeQualifyingCode(String value) {
                            this.ageQualifyingCode = value;
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
                         * 获取count属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getCount() {
                            return count;
                        }

                        /**
                         * 设置count属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setCount(Integer value) {
                            this.count = value;
                        }

                        /**
                         * 获取amount属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Float }
                         *     
                         */
                        public Float getAmount() {
                            return amount;
                        }

                        /**
                         * 设置amount属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Float }
                         *     
                         */
                        public void setAmount(Float value) {
                            this.amount = value;
                        }

                        /**
                         * 获取baseAmount属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Float }
                         *     
                         */
                        public Float getBaseAmount() {
                            return baseAmount;
                        }

                        /**
                         * 设置baseAmount属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Float }
                         *     
                         */
                        public void setBaseAmount(Float value) {
                            this.baseAmount = value;
                        }

                        /**
                         * 获取prePayInd属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isPrePayInd() {
                            return prePayInd;
                        }

                        /**
                         * 设置prePayInd属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setPrePayInd(Boolean value) {
                            this.prePayInd = value;
                        }

                        /**
                         * 获取currencyCode属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCurrencyCode() {
                            return currencyCode;
                        }

                        /**
                         * 设置currencyCode属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCurrencyCode(String value) {
                            this.currencyCode = value;
                        }

                        /**
                         * 获取decimalPlaces属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getDecimalPlaces() {
                            return decimalPlaces;
                        }

                        /**
                         * 设置decimalPlaces属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setDecimalPlaces(BigInteger value) {
                            this.decimalPlaces = value;
                        }

                        /**
                         * 获取originalAmount属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Float }
                         *     
                         */
                        public Float getOriginalAmount() {
                            return originalAmount;
                        }

                        /**
                         * 设置originalAmount属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Float }
                         *     
                         */
                        public void setOriginalAmount(Float value) {
                            this.originalAmount = value;
                        }

                        /**
                         * 获取originalCurrencyCode属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOriginalCurrencyCode() {
                            return originalCurrencyCode;
                        }

                        /**
                         * 设置originalCurrencyCode属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOriginalCurrencyCode(String value) {
                            this.originalCurrencyCode = value;
                        }

                    }

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType">
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RentalCar
        extends VehicleRentalCoreType
    {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Code")
        protected String code;

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
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
