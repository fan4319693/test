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


/**
 * Defines the required accommodation component of a package holiday. 
 * 
 * <p>AccommodationSegmentRequestType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccommodationSegmentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identity" type="{http://www.opentravel.org/OTA/2003/05}PropertyIdentityType" minOccurs="0"/>
 *         &lt;element name="DateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType"/>
 *         &lt;element name="RoomProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomProfile" type="{http://www.opentravel.org/OTA/2003/05}RoomProfileType" maxOccurs="9"/>
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
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ResortCodeGroup"/>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationSegmentRequestType", propOrder = {
    "identity",
    "dateRange",
    "roomProfiles",
    "mealPlans"
})
public class AccommodationSegmentRequestType {

    @XmlElement(name = "Identity")
    protected PropertyIdentityType identity;
    @XmlElement(name = "DateRange", required = true)
    protected DateTimeSpanType dateRange;
    @XmlElement(name = "RoomProfiles")
    protected AccommodationSegmentRequestType.RoomProfiles roomProfiles;
    @XmlElement(name = "MealPlans")
    protected AccommodationSegmentRequestType.MealPlans mealPlans;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "ResortCode")
    protected String resortCode;
    @XmlAttribute(name = "ResortName")
    protected String resortName;

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
     *     {@link AccommodationSegmentRequestType.RoomProfiles }
     *     
     */
    public AccommodationSegmentRequestType.RoomProfiles getRoomProfiles() {
        return roomProfiles;
    }

    /**
     * 设置roomProfiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationSegmentRequestType.RoomProfiles }
     *     
     */
    public void setRoomProfiles(AccommodationSegmentRequestType.RoomProfiles value) {
        this.roomProfiles = value;
    }

    /**
     * 获取mealPlans属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccommodationSegmentRequestType.MealPlans }
     *     
     */
    public AccommodationSegmentRequestType.MealPlans getMealPlans() {
        return mealPlans;
    }

    /**
     * 设置mealPlans属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationSegmentRequestType.MealPlans }
     *     
     */
    public void setMealPlans(AccommodationSegmentRequestType.MealPlans value) {
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
     *         &lt;element name="RoomProfile" type="{http://www.opentravel.org/OTA/2003/05}RoomProfileType" maxOccurs="9"/>
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
        protected List<RoomProfileType> roomProfile;

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
         * {@link RoomProfileType }
         * 
         * 
         */
        public List<RoomProfileType> getRoomProfile() {
            if (roomProfile == null) {
                roomProfile = new ArrayList<RoomProfileType>();
            }
            return this.roomProfile;
        }

    }

}
