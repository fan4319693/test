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
 * The SellableProduct class defines the inventoriable item for this rate plan.
 * 
 * <p>SellableProductsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SellableProductsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellableProduct" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DestinationSystemCodes" type="{http://www.opentravel.org/OTA/2003/05}DestinationSystemCodesType" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="GuestRoom" type="{http://www.opentravel.org/OTA/2003/05}GuestRoomType"/>
 *                     &lt;element name="MeetingRooms" type="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType"/>
 *                     &lt;element name="InventoryBlock">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockCodeGroup"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InventoryGroup"/>
 *                 &lt;attribute name="SellableProductRPH" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="InvNotifType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="New"/>
 *                       &lt;enumeration value="Delta"/>
 *                       &lt;enumeration value="Overlay"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="InvStatusType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Initial"/>
 *                       &lt;enumeration value="Active"/>
 *                       &lt;enumeration value="Deactivated"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="InvGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OrderSequence" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
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
@XmlType(name = "SellableProductsType", propOrder = {
    "sellableProduct"
})
public class SellableProductsType {

    @XmlElement(name = "SellableProduct", required = true)
    protected List<SellableProductsType.SellableProduct> sellableProduct;

    /**
     * Gets the value of the sellableProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellableProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellableProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellableProductsType.SellableProduct }
     * 
     * 
     */
    public List<SellableProductsType.SellableProduct> getSellableProduct() {
        if (sellableProduct == null) {
            sellableProduct = new ArrayList<SellableProductsType.SellableProduct>();
        }
        return this.sellableProduct;
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
     *         &lt;element name="DestinationSystemCodes" type="{http://www.opentravel.org/OTA/2003/05}DestinationSystemCodesType" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="GuestRoom" type="{http://www.opentravel.org/OTA/2003/05}GuestRoomType"/>
     *           &lt;element name="MeetingRooms" type="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType"/>
     *           &lt;element name="InventoryBlock">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockCodeGroup"/>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InventoryGroup"/>
     *       &lt;attribute name="SellableProductRPH" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="InvNotifType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="New"/>
     *             &lt;enumeration value="Delta"/>
     *             &lt;enumeration value="Overlay"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="InvStatusType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Initial"/>
     *             &lt;enumeration value="Active"/>
     *             &lt;enumeration value="Deactivated"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="InvGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OrderSequence" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "destinationSystemCodes",
        "guestRoom",
        "meetingRooms",
        "inventoryBlock",
        "description",
        "uniqueID"
    })
    public static class SellableProduct {

        @XmlElement(name = "DestinationSystemCodes")
        protected DestinationSystemCodesType destinationSystemCodes;
        @XmlElement(name = "GuestRoom")
        protected GuestRoomType guestRoom;
        @XmlElement(name = "MeetingRooms")
        protected MeetingRoomsType meetingRooms;
        @XmlElement(name = "InventoryBlock")
        protected SellableProductsType.SellableProduct.InventoryBlock inventoryBlock;
        @XmlElement(name = "Description")
        protected ParagraphType description;
        @XmlElement(name = "UniqueID")
        protected UniqueIDType uniqueID;
        @XmlAttribute(name = "SellableProductRPH")
        protected Integer sellableProductRPH;
        @XmlAttribute(name = "InvNotifType")
        protected String invNotifType;
        @XmlAttribute(name = "InvStatusType")
        protected String invStatusType;
        @XmlAttribute(name = "InvGroupingCode")
        protected String invGroupingCode;
        @XmlAttribute(name = "OrderSequence")
        protected Integer orderSequence;
        @XmlAttribute(name = "InvCodeApplication")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String invCodeApplication;
        @XmlAttribute(name = "InvCode")
        protected String invCode;
        @XmlAttribute(name = "InvType")
        protected String invType;
        @XmlAttribute(name = "InvTypeCode")
        protected String invTypeCode;
        @XmlAttribute(name = "IsRoom")
        protected Boolean isRoom;

        /**
         * 获取destinationSystemCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DestinationSystemCodesType }
         *     
         */
        public DestinationSystemCodesType getDestinationSystemCodes() {
            return destinationSystemCodes;
        }

        /**
         * 设置destinationSystemCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DestinationSystemCodesType }
         *     
         */
        public void setDestinationSystemCodes(DestinationSystemCodesType value) {
            this.destinationSystemCodes = value;
        }

        /**
         * 获取guestRoom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link GuestRoomType }
         *     
         */
        public GuestRoomType getGuestRoom() {
            return guestRoom;
        }

        /**
         * 设置guestRoom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link GuestRoomType }
         *     
         */
        public void setGuestRoom(GuestRoomType value) {
            this.guestRoom = value;
        }

        /**
         * 获取meetingRooms属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MeetingRoomsType }
         *     
         */
        public MeetingRoomsType getMeetingRooms() {
            return meetingRooms;
        }

        /**
         * 设置meetingRooms属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MeetingRoomsType }
         *     
         */
        public void setMeetingRooms(MeetingRoomsType value) {
            this.meetingRooms = value;
        }

        /**
         * 获取inventoryBlock属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SellableProductsType.SellableProduct.InventoryBlock }
         *     
         */
        public SellableProductsType.SellableProduct.InventoryBlock getInventoryBlock() {
            return inventoryBlock;
        }

        /**
         * 设置inventoryBlock属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SellableProductsType.SellableProduct.InventoryBlock }
         *     
         */
        public void setInventoryBlock(SellableProductsType.SellableProduct.InventoryBlock value) {
            this.inventoryBlock = value;
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
         * 获取uniqueID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getUniqueID() {
            return uniqueID;
        }

        /**
         * 设置uniqueID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setUniqueID(UniqueIDType value) {
            this.uniqueID = value;
        }

        /**
         * 获取sellableProductRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSellableProductRPH() {
            return sellableProductRPH;
        }

        /**
         * 设置sellableProductRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSellableProductRPH(Integer value) {
            this.sellableProductRPH = value;
        }

        /**
         * 获取invNotifType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvNotifType() {
            return invNotifType;
        }

        /**
         * 设置invNotifType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvNotifType(String value) {
            this.invNotifType = value;
        }

        /**
         * 获取invStatusType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvStatusType() {
            return invStatusType;
        }

        /**
         * 设置invStatusType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvStatusType(String value) {
            this.invStatusType = value;
        }

        /**
         * 获取invGroupingCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvGroupingCode() {
            return invGroupingCode;
        }

        /**
         * 设置invGroupingCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvGroupingCode(String value) {
            this.invGroupingCode = value;
        }

        /**
         * 获取orderSequence属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOrderSequence() {
            return orderSequence;
        }

        /**
         * 设置orderSequence属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOrderSequence(Integer value) {
            this.orderSequence = value;
        }

        /**
         * 获取invCodeApplication属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvCodeApplication() {
            return invCodeApplication;
        }

        /**
         * 设置invCodeApplication属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvCodeApplication(String value) {
            this.invCodeApplication = value;
        }

        /**
         * 获取invCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvCode() {
            return invCode;
        }

        /**
         * 设置invCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvCode(String value) {
            this.invCode = value;
        }

        /**
         * 获取invType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvType() {
            return invType;
        }

        /**
         * 设置invType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvType(String value) {
            this.invType = value;
        }

        /**
         * 获取invTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvTypeCode() {
            return invTypeCode;
        }

        /**
         * 设置invTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvTypeCode(String value) {
            this.invTypeCode = value;
        }

        /**
         * 获取isRoom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsRoom() {
            return isRoom;
        }

        /**
         * 设置isRoom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsRoom(Boolean value) {
            this.isRoom = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockCodeGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InventoryBlock {

            @XmlAttribute(name = "Code")
            protected String code;

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

}
