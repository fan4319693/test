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
import javax.xml.bind.annotation.XmlType;


/**
 * Provides the available facilities for the enquiror's chosen property and stay.
 * 
 * <p>FacilityChoicesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FacilityChoicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableRooms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Room" type="{http://www.opentravel.org/OTA/2003/05}PkgRoomInventoryType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AvailableMealPlans" minOccurs="0">
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
 *         &lt;element name="RoomPrices" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomPrice" type="{http://www.opentravel.org/OTA/2003/05}RoomPriceType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MealPlan" type="{http://www.opentravel.org/OTA/2003/05}MealPlanCode" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OccupancyGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityChoicesType", propOrder = {
    "availableRooms",
    "availableMealPlans",
    "roomPrices"
})
public class FacilityChoicesType {

    @XmlElement(name = "AvailableRooms")
    protected FacilityChoicesType.AvailableRooms availableRooms;
    @XmlElement(name = "AvailableMealPlans")
    protected FacilityChoicesType.AvailableMealPlans availableMealPlans;
    @XmlElement(name = "RoomPrices")
    protected List<FacilityChoicesType.RoomPrices> roomPrices;
    @XmlAttribute(name = "MinOccupancy")
    protected Integer minOccupancy;
    @XmlAttribute(name = "MaxOccupancy")
    protected Integer maxOccupancy;

    /**
     * 获取availableRooms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FacilityChoicesType.AvailableRooms }
     *     
     */
    public FacilityChoicesType.AvailableRooms getAvailableRooms() {
        return availableRooms;
    }

    /**
     * 设置availableRooms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityChoicesType.AvailableRooms }
     *     
     */
    public void setAvailableRooms(FacilityChoicesType.AvailableRooms value) {
        this.availableRooms = value;
    }

    /**
     * 获取availableMealPlans属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FacilityChoicesType.AvailableMealPlans }
     *     
     */
    public FacilityChoicesType.AvailableMealPlans getAvailableMealPlans() {
        return availableMealPlans;
    }

    /**
     * 设置availableMealPlans属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityChoicesType.AvailableMealPlans }
     *     
     */
    public void setAvailableMealPlans(FacilityChoicesType.AvailableMealPlans value) {
        this.availableMealPlans = value;
    }

    /**
     * Gets the value of the roomPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityChoicesType.RoomPrices }
     * 
     * 
     */
    public List<FacilityChoicesType.RoomPrices> getRoomPrices() {
        if (roomPrices == null) {
            roomPrices = new ArrayList<FacilityChoicesType.RoomPrices>();
        }
        return this.roomPrices;
    }

    /**
     * 获取minOccupancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinOccupancy() {
        return minOccupancy;
    }

    /**
     * 设置minOccupancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinOccupancy(Integer value) {
        this.minOccupancy = value;
    }

    /**
     * 获取maxOccupancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * 设置maxOccupancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxOccupancy(Integer value) {
        this.maxOccupancy = value;
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
    public static class AvailableMealPlans {

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
     *         &lt;element name="Room" type="{http://www.opentravel.org/OTA/2003/05}PkgRoomInventoryType" maxOccurs="99"/>
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
        "room"
    })
    public static class AvailableRooms {

        @XmlElement(name = "Room", required = true)
        protected List<PkgRoomInventoryType> room;

        /**
         * Gets the value of the room property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the room property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoom().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PkgRoomInventoryType }
         * 
         * 
         */
        public List<PkgRoomInventoryType> getRoom() {
            if (room == null) {
                room = new ArrayList<PkgRoomInventoryType>();
            }
            return this.room;
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
     *         &lt;element name="RoomPrice" type="{http://www.opentravel.org/OTA/2003/05}RoomPriceType" maxOccurs="99"/>
     *       &lt;/sequence>
     *       &lt;attribute name="MealPlan" type="{http://www.opentravel.org/OTA/2003/05}MealPlanCode" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomPrice"
    })
    public static class RoomPrices {

        @XmlElement(name = "RoomPrice", required = true)
        protected List<RoomPriceType> roomPrice;
        @XmlAttribute(name = "MealPlan")
        protected String mealPlan;

        /**
         * Gets the value of the roomPrice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomPrice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomPriceType }
         * 
         * 
         */
        public List<RoomPriceType> getRoomPrice() {
            if (roomPrice == null) {
                roomPrice = new ArrayList<RoomPriceType>();
            }
            return this.roomPrice;
        }

        /**
         * 获取mealPlan属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMealPlan() {
            return mealPlan;
        }

        /**
         * 设置mealPlan属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMealPlan(String value) {
            this.mealPlan = value;
        }

    }

}
