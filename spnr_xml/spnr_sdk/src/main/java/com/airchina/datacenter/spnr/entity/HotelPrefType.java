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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * These are the hotel preference elements used on an instance of a profile.
 * 
 * <p>HotelPrefType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelPrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPref" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" type="{http://www.opentravel.org/OTA/2003/05}PaymentFormPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HotelChainPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyNamePref" type="{http://www.opentravel.org/OTA/2003/05}PropertyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyLocationPref" type="{http://www.opentravel.org/OTA/2003/05}PropertyLocationPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyTypePref" type="{http://www.opentravel.org/OTA/2003/05}PropertyTypePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyClassPref" type="{http://www.opentravel.org/OTA/2003/05}PropertyClassPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyAmenityPref" type="{http://www.opentravel.org/OTA/2003/05}PropertyAmenityPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoomAmenityPref" type="{http://www.opentravel.org/OTA/2003/05}RoomAmenityPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoomLocationPref" type="{http://www.opentravel.org/OTA/2003/05}RoomLocationPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BedTypePref" type="{http://www.opentravel.org/OTA/2003/05}BedTypePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FoodSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}FoodSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MediaEntertainPref" type="{http://www.opentravel.org/OTA/2003/05}MediaEntertainPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PetInfoPref" type="{http://www.opentravel.org/OTA/2003/05}PetInfoPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MealPref" type="{http://www.opentravel.org/OTA/2003/05}MealPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecreationSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}RecreationSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}BusinessSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonalSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}PersonalSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SecurityFeaturePref" type="{http://www.opentravel.org/OTA/2003/05}SecurityFeaturePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysChallFeaturePref" type="{http://www.opentravel.org/OTA/2003/05}PhysChallFeaturePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecRequestPref" type="{http://www.opentravel.org/OTA/2003/05}SpecRequestPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SmokingIndicatorGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *       &lt;attribute name="RatePlanCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *       &lt;attribute name="HotelGuestType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPrefType", propOrder = {
    "loyaltyPref",
    "paymentFormPref",
    "hotelChainPref",
    "propertyNamePref",
    "propertyLocationPref",
    "propertyTypePref",
    "propertyClassPref",
    "propertyAmenityPref",
    "roomAmenityPref",
    "roomLocationPref",
    "bedTypePref",
    "foodSrvcPref",
    "mediaEntertainPref",
    "petInfoPref",
    "mealPref",
    "recreationSrvcPref",
    "businessSrvcPref",
    "personalSrvcPref",
    "securityFeaturePref",
    "physChallFeaturePref",
    "specRequestPref",
    "tpaExtensions"
})
public class HotelPrefType {

    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPrefType> loyaltyPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPrefType> paymentFormPref;
    @XmlElement(name = "HotelChainPref")
    protected List<CompanyNamePrefType> hotelChainPref;
    @XmlElement(name = "PropertyNamePref")
    protected List<PropertyNamePrefType> propertyNamePref;
    @XmlElement(name = "PropertyLocationPref")
    protected List<PropertyLocationPrefType> propertyLocationPref;
    @XmlElement(name = "PropertyTypePref")
    protected List<PropertyTypePrefType> propertyTypePref;
    @XmlElement(name = "PropertyClassPref")
    protected List<PropertyClassPrefType> propertyClassPref;
    @XmlElement(name = "PropertyAmenityPref")
    protected List<PropertyAmenityPrefType> propertyAmenityPref;
    @XmlElement(name = "RoomAmenityPref")
    protected List<RoomAmenityPrefType> roomAmenityPref;
    @XmlElement(name = "RoomLocationPref")
    protected List<RoomLocationPrefType> roomLocationPref;
    @XmlElement(name = "BedTypePref")
    protected List<BedTypePrefType> bedTypePref;
    @XmlElement(name = "FoodSrvcPref")
    protected List<FoodSrvcPrefType> foodSrvcPref;
    @XmlElement(name = "MediaEntertainPref")
    protected List<MediaEntertainPrefType> mediaEntertainPref;
    @XmlElement(name = "PetInfoPref")
    protected List<PetInfoPrefType> petInfoPref;
    @XmlElement(name = "MealPref")
    protected List<MealPrefType> mealPref;
    @XmlElement(name = "RecreationSrvcPref")
    protected List<RecreationSrvcPrefType> recreationSrvcPref;
    @XmlElement(name = "BusinessSrvcPref")
    protected List<BusinessSrvcPrefType> businessSrvcPref;
    @XmlElement(name = "PersonalSrvcPref")
    protected List<PersonalSrvcPrefType> personalSrvcPref;
    @XmlElement(name = "SecurityFeaturePref")
    protected List<SecurityFeaturePrefType> securityFeaturePref;
    @XmlElement(name = "PhysChallFeaturePref")
    protected List<PhysChallFeaturePrefType> physChallFeaturePref;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPrefType> specRequestPref;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "HotelGuestType")
    protected String hotelGuestType;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;

    /**
     * Gets the value of the loyaltyPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPrefType }
     * 
     * 
     */
    public List<LoyaltyPrefType> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPrefType>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormPrefType }
     * 
     * 
     */
    public List<PaymentFormPrefType> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPrefType>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the hotelChainPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelChainPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelChainPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNamePrefType }
     * 
     * 
     */
    public List<CompanyNamePrefType> getHotelChainPref() {
        if (hotelChainPref == null) {
            hotelChainPref = new ArrayList<CompanyNamePrefType>();
        }
        return this.hotelChainPref;
    }

    /**
     * Gets the value of the propertyNamePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyNamePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyNamePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyNamePrefType }
     * 
     * 
     */
    public List<PropertyNamePrefType> getPropertyNamePref() {
        if (propertyNamePref == null) {
            propertyNamePref = new ArrayList<PropertyNamePrefType>();
        }
        return this.propertyNamePref;
    }

    /**
     * Gets the value of the propertyLocationPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyLocationPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyLocationPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyLocationPrefType }
     * 
     * 
     */
    public List<PropertyLocationPrefType> getPropertyLocationPref() {
        if (propertyLocationPref == null) {
            propertyLocationPref = new ArrayList<PropertyLocationPrefType>();
        }
        return this.propertyLocationPref;
    }

    /**
     * Gets the value of the propertyTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyTypePrefType }
     * 
     * 
     */
    public List<PropertyTypePrefType> getPropertyTypePref() {
        if (propertyTypePref == null) {
            propertyTypePref = new ArrayList<PropertyTypePrefType>();
        }
        return this.propertyTypePref;
    }

    /**
     * Gets the value of the propertyClassPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyClassPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyClassPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyClassPrefType }
     * 
     * 
     */
    public List<PropertyClassPrefType> getPropertyClassPref() {
        if (propertyClassPref == null) {
            propertyClassPref = new ArrayList<PropertyClassPrefType>();
        }
        return this.propertyClassPref;
    }

    /**
     * Gets the value of the propertyAmenityPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyAmenityPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyAmenityPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyAmenityPrefType }
     * 
     * 
     */
    public List<PropertyAmenityPrefType> getPropertyAmenityPref() {
        if (propertyAmenityPref == null) {
            propertyAmenityPref = new ArrayList<PropertyAmenityPrefType>();
        }
        return this.propertyAmenityPref;
    }

    /**
     * Gets the value of the roomAmenityPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomAmenityPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomAmenityPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomAmenityPrefType }
     * 
     * 
     */
    public List<RoomAmenityPrefType> getRoomAmenityPref() {
        if (roomAmenityPref == null) {
            roomAmenityPref = new ArrayList<RoomAmenityPrefType>();
        }
        return this.roomAmenityPref;
    }

    /**
     * Gets the value of the roomLocationPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomLocationPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomLocationPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomLocationPrefType }
     * 
     * 
     */
    public List<RoomLocationPrefType> getRoomLocationPref() {
        if (roomLocationPref == null) {
            roomLocationPref = new ArrayList<RoomLocationPrefType>();
        }
        return this.roomLocationPref;
    }

    /**
     * Gets the value of the bedTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bedTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBedTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BedTypePrefType }
     * 
     * 
     */
    public List<BedTypePrefType> getBedTypePref() {
        if (bedTypePref == null) {
            bedTypePref = new ArrayList<BedTypePrefType>();
        }
        return this.bedTypePref;
    }

    /**
     * Gets the value of the foodSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodSrvcPrefType }
     * 
     * 
     */
    public List<FoodSrvcPrefType> getFoodSrvcPref() {
        if (foodSrvcPref == null) {
            foodSrvcPref = new ArrayList<FoodSrvcPrefType>();
        }
        return this.foodSrvcPref;
    }

    /**
     * Gets the value of the mediaEntertainPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaEntertainPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaEntertainPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaEntertainPrefType }
     * 
     * 
     */
    public List<MediaEntertainPrefType> getMediaEntertainPref() {
        if (mediaEntertainPref == null) {
            mediaEntertainPref = new ArrayList<MediaEntertainPrefType>();
        }
        return this.mediaEntertainPref;
    }

    /**
     * Gets the value of the petInfoPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petInfoPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetInfoPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PetInfoPrefType }
     * 
     * 
     */
    public List<PetInfoPrefType> getPetInfoPref() {
        if (petInfoPref == null) {
            petInfoPref = new ArrayList<PetInfoPrefType>();
        }
        return this.petInfoPref;
    }

    /**
     * Gets the value of the mealPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MealPrefType }
     * 
     * 
     */
    public List<MealPrefType> getMealPref() {
        if (mealPref == null) {
            mealPref = new ArrayList<MealPrefType>();
        }
        return this.mealPref;
    }

    /**
     * Gets the value of the recreationSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recreationSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecreationSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecreationSrvcPrefType }
     * 
     * 
     */
    public List<RecreationSrvcPrefType> getRecreationSrvcPref() {
        if (recreationSrvcPref == null) {
            recreationSrvcPref = new ArrayList<RecreationSrvcPrefType>();
        }
        return this.recreationSrvcPref;
    }

    /**
     * Gets the value of the businessSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessSrvcPrefType }
     * 
     * 
     */
    public List<BusinessSrvcPrefType> getBusinessSrvcPref() {
        if (businessSrvcPref == null) {
            businessSrvcPref = new ArrayList<BusinessSrvcPrefType>();
        }
        return this.businessSrvcPref;
    }

    /**
     * Gets the value of the personalSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalSrvcPrefType }
     * 
     * 
     */
    public List<PersonalSrvcPrefType> getPersonalSrvcPref() {
        if (personalSrvcPref == null) {
            personalSrvcPref = new ArrayList<PersonalSrvcPrefType>();
        }
        return this.personalSrvcPref;
    }

    /**
     * Gets the value of the securityFeaturePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityFeaturePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityFeaturePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityFeaturePrefType }
     * 
     * 
     */
    public List<SecurityFeaturePrefType> getSecurityFeaturePref() {
        if (securityFeaturePref == null) {
            securityFeaturePref = new ArrayList<SecurityFeaturePrefType>();
        }
        return this.securityFeaturePref;
    }

    /**
     * Gets the value of the physChallFeaturePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physChallFeaturePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysChallFeaturePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysChallFeaturePrefType }
     * 
     * 
     */
    public List<PhysChallFeaturePrefType> getPhysChallFeaturePref() {
        if (physChallFeaturePref == null) {
            physChallFeaturePref = new ArrayList<PhysChallFeaturePrefType>();
        }
        return this.physChallFeaturePref;
    }

    /**
     * Gets the value of the specRequestPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specRequestPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecRequestPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecRequestPrefType }
     * 
     * 
     */
    public List<SpecRequestPrefType> getSpecRequestPref() {
        if (specRequestPref == null) {
            specRequestPref = new ArrayList<SpecRequestPrefType>();
        }
        return this.specRequestPref;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * 获取ratePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * 设置ratePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * 获取hotelGuestType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelGuestType() {
        return hotelGuestType;
    }

    /**
     * 设置hotelGuestType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelGuestType(String value) {
        this.hotelGuestType = value;
    }

    /**
     * 获取preferLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        if (preferLevel == null) {
            return PreferLevelType.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * 设置preferLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

    /**
     * 获取smokingAllowed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
    }

    /**
     * 设置smokingAllowed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
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

}
