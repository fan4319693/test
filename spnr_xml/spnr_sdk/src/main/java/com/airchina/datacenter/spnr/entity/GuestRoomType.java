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
 * GuestRoomType is used to contain all the information on a guest room
 * 
 * <p>GuestRoomType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GuestRoomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Quantities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaximumAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Room" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RoomGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Amenities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Amenity" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="AmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoomLevelFees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeesType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalGuestAmount" type="{http://www.opentravel.org/OTA/2003/05}AdditionalGuestAmountType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRoomType", propOrder = {
    "quantities",
    "room",
    "amenities",
    "roomLevelFees",
    "additionalGuestAmount",
    "description"
})
public class GuestRoomType {

    @XmlElement(name = "Quantities")
    protected GuestRoomType.Quantities quantities;
    @XmlElement(name = "Room")
    protected GuestRoomType.Room room;
    @XmlElement(name = "Amenities")
    protected GuestRoomType.Amenities amenities;
    @XmlElement(name = "RoomLevelFees")
    protected GuestRoomType.RoomLevelFees roomLevelFees;
    @XmlElement(name = "AdditionalGuestAmount")
    protected List<AdditionalGuestAmountType> additionalGuestAmount;
    @XmlElement(name = "Description")
    protected ParagraphType description;

    /**
     * 获取quantities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestRoomType.Quantities }
     *     
     */
    public GuestRoomType.Quantities getQuantities() {
        return quantities;
    }

    /**
     * 设置quantities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRoomType.Quantities }
     *     
     */
    public void setQuantities(GuestRoomType.Quantities value) {
        this.quantities = value;
    }

    /**
     * 获取room属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestRoomType.Room }
     *     
     */
    public GuestRoomType.Room getRoom() {
        return room;
    }

    /**
     * 设置room属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRoomType.Room }
     *     
     */
    public void setRoom(GuestRoomType.Room value) {
        this.room = value;
    }

    /**
     * 获取amenities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestRoomType.Amenities }
     *     
     */
    public GuestRoomType.Amenities getAmenities() {
        return amenities;
    }

    /**
     * 设置amenities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRoomType.Amenities }
     *     
     */
    public void setAmenities(GuestRoomType.Amenities value) {
        this.amenities = value;
    }

    /**
     * 获取roomLevelFees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestRoomType.RoomLevelFees }
     *     
     */
    public GuestRoomType.RoomLevelFees getRoomLevelFees() {
        return roomLevelFees;
    }

    /**
     * 设置roomLevelFees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRoomType.RoomLevelFees }
     *     
     */
    public void setRoomLevelFees(GuestRoomType.RoomLevelFees value) {
        this.roomLevelFees = value;
    }

    /**
     * Gets the value of the additionalGuestAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalGuestAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalGuestAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalGuestAmountType }
     * 
     * 
     */
    public List<AdditionalGuestAmountType> getAdditionalGuestAmount() {
        if (additionalGuestAmount == null) {
            additionalGuestAmount = new ArrayList<AdditionalGuestAmountType>();
        }
        return this.additionalGuestAmount;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setDescription(ParagraphType value) {
        this.description = value;
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
     *         &lt;element name="Amenity" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="AmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
        "amenity"
    })
    public static class Amenities {

        @XmlElement(name = "Amenity", required = true)
        protected List<GuestRoomType.Amenities.Amenity> amenity;

        /**
         * Gets the value of the amenity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amenity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmenity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GuestRoomType.Amenities.Amenity }
         * 
         * 
         */
        public List<GuestRoomType.Amenities.Amenity> getAmenity() {
            if (amenity == null) {
                amenity = new ArrayList<GuestRoomType.Amenities.Amenity>();
            }
            return this.amenity;
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
         *       &lt;attribute name="AmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Amenity {

            @XmlAttribute(name = "AmenityCode")
            protected String amenityCode;

            /**
             * 获取amenityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmenityCode() {
                return amenityCode;
            }

            /**
             * 设置amenityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmenityCode(String value) {
                this.amenityCode = value;
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
     *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaximumAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Quantities {

        @XmlAttribute(name = "MaxOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxOccupancy;
        @XmlAttribute(name = "MaxRollaways")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxRollaways;
        @XmlAttribute(name = "StandardNumBeds")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger standardNumBeds;
        @XmlAttribute(name = "StandardOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger standardOccupancy;
        @XmlAttribute(name = "MaximumAdditionalGuests")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maximumAdditionalGuests;

        /**
         * 获取maxOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxOccupancy() {
            return maxOccupancy;
        }

        /**
         * 设置maxOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxOccupancy(BigInteger value) {
            this.maxOccupancy = value;
        }

        /**
         * 获取maxRollaways属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxRollaways() {
            return maxRollaways;
        }

        /**
         * 设置maxRollaways属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxRollaways(BigInteger value) {
            this.maxRollaways = value;
        }

        /**
         * 获取standardNumBeds属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStandardNumBeds() {
            return standardNumBeds;
        }

        /**
         * 设置standardNumBeds属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStandardNumBeds(BigInteger value) {
            this.standardNumBeds = value;
        }

        /**
         * 获取standardOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStandardOccupancy() {
            return standardOccupancy;
        }

        /**
         * 设置standardOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStandardOccupancy(BigInteger value) {
            this.standardOccupancy = value;
        }

        /**
         * 获取maximumAdditionalGuests属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumAdditionalGuests() {
            return maximumAdditionalGuests;
        }

        /**
         * 设置maximumAdditionalGuests属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumAdditionalGuests(BigInteger value) {
            this.maximumAdditionalGuests = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RoomGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Room {

        @XmlAttribute(name = "RoomType")
        protected String roomType;
        @XmlAttribute(name = "RoomTypeCode")
        protected String roomTypeCode;
        @XmlAttribute(name = "RoomCategory")
        protected String roomCategory;
        @XmlAttribute(name = "RoomID")
        protected String roomID;
        @XmlAttribute(name = "Floor")
        protected Integer floor;
        @XmlAttribute(name = "InvBlockCode")
        protected String invBlockCode;
        @XmlAttribute(name = "RoomLocationCode")
        protected String roomLocationCode;
        @XmlAttribute(name = "RoomViewCode")
        protected String roomViewCode;
        @XmlAttribute(name = "BedTypeCode")
        protected String bedTypeCode;
        @XmlAttribute(name = "NonSmoking")
        protected Boolean nonSmoking;
        @XmlAttribute(name = "Configuration")
        protected String configuration;
        @XmlAttribute(name = "SizeMeasurement")
        protected String sizeMeasurement;
        @XmlAttribute(name = "Quantity")
        protected Integer quantity;
        @XmlAttribute(name = "Composite")
        protected Boolean composite;
        @XmlAttribute(name = "RoomClassificationCode")
        protected String roomClassificationCode;
        @XmlAttribute(name = "RoomArchitectureCode")
        protected String roomArchitectureCode;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "PromotionVendorCode")
        protected List<String> promotionVendorCode;

        /**
         * 获取roomType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomType() {
            return roomType;
        }

        /**
         * 设置roomType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomType(String value) {
            this.roomType = value;
        }

        /**
         * 获取roomTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomTypeCode() {
            return roomTypeCode;
        }

        /**
         * 设置roomTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomTypeCode(String value) {
            this.roomTypeCode = value;
        }

        /**
         * 获取roomCategory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomCategory() {
            return roomCategory;
        }

        /**
         * 设置roomCategory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomCategory(String value) {
            this.roomCategory = value;
        }

        /**
         * 获取roomID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomID() {
            return roomID;
        }

        /**
         * 设置roomID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomID(String value) {
            this.roomID = value;
        }

        /**
         * 获取floor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFloor() {
            return floor;
        }

        /**
         * 设置floor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFloor(Integer value) {
            this.floor = value;
        }

        /**
         * 获取invBlockCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvBlockCode() {
            return invBlockCode;
        }

        /**
         * 设置invBlockCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvBlockCode(String value) {
            this.invBlockCode = value;
        }

        /**
         * 获取roomLocationCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomLocationCode() {
            return roomLocationCode;
        }

        /**
         * 设置roomLocationCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomLocationCode(String value) {
            this.roomLocationCode = value;
        }

        /**
         * 获取roomViewCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomViewCode() {
            return roomViewCode;
        }

        /**
         * 设置roomViewCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomViewCode(String value) {
            this.roomViewCode = value;
        }

        /**
         * 获取bedTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBedTypeCode() {
            return bedTypeCode;
        }

        /**
         * 设置bedTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBedTypeCode(String value) {
            this.bedTypeCode = value;
        }

        /**
         * 获取nonSmoking属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonSmoking() {
            return nonSmoking;
        }

        /**
         * 设置nonSmoking属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonSmoking(Boolean value) {
            this.nonSmoking = value;
        }

        /**
         * 获取configuration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfiguration() {
            return configuration;
        }

        /**
         * 设置configuration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfiguration(String value) {
            this.configuration = value;
        }

        /**
         * 获取sizeMeasurement属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSizeMeasurement() {
            return sizeMeasurement;
        }

        /**
         * 设置sizeMeasurement属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSizeMeasurement(String value) {
            this.sizeMeasurement = value;
        }

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQuantity(Integer value) {
            this.quantity = value;
        }

        /**
         * 获取composite属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isComposite() {
            return composite;
        }

        /**
         * 设置composite属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setComposite(Boolean value) {
            this.composite = value;
        }

        /**
         * 获取roomClassificationCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomClassificationCode() {
            return roomClassificationCode;
        }

        /**
         * 设置roomClassificationCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomClassificationCode(String value) {
            this.roomClassificationCode = value;
        }

        /**
         * 获取roomArchitectureCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomArchitectureCode() {
            return roomArchitectureCode;
        }

        /**
         * 设置roomArchitectureCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomArchitectureCode(String value) {
            this.roomArchitectureCode = value;
        }

        /**
         * 获取promotionCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotionCode() {
            return promotionCode;
        }

        /**
         * 设置promotionCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotionCode(String value) {
            this.promotionCode = value;
        }

        /**
         * Gets the value of the promotionVendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotionVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPromotionVendorCode() {
            if (promotionVendorCode == null) {
                promotionVendorCode = new ArrayList<String>();
            }
            return this.promotionVendorCode;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeesType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoomLevelFees
        extends FeesType
    {

        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;

        /**
         * 获取uri属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * 设置uri属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
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

        /**
         * 获取codeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * 设置codeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

    }

}
