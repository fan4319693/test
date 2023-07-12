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


/**
 * The details of activity from supplier.
 * 
 * <p>DestActivityRetrieveInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DestActivityRetrieveInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestActivityItems">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Vehicles" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Vehicle" type="{http://www.opentravel.org/OTA/2003/05}VehicleType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PostResInfos" type="{http://www.opentravel.org/OTA/2003/05}PostResType" minOccurs="0"/>
 *                             &lt;element name="ReservationItemReferences" type="{http://www.opentravel.org/OTA/2003/05}ReservationItemReferencesType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DestActivityCodeGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DestActivityDescriptiveContent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ContactInfosType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestActivityRetrieveInfoType", propOrder = {
    "destActivityItems",
    "destActivityDescriptiveContent"
})
public class DestActivityRetrieveInfoType {

    @XmlElement(name = "DestActivityItems", required = true)
    protected DestActivityRetrieveInfoType.DestActivityItems destActivityItems;
    @XmlElement(name = "DestActivityDescriptiveContent")
    protected DestActivityRetrieveInfoType.DestActivityDescriptiveContent destActivityDescriptiveContent;
    @XmlAttribute(name = "Status")
    @XmlSchemaType(name = "anySimpleType")
    protected String status;

    /**
     * 获取destActivityItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestActivityRetrieveInfoType.DestActivityItems }
     *     
     */
    public DestActivityRetrieveInfoType.DestActivityItems getDestActivityItems() {
        return destActivityItems;
    }

    /**
     * 设置destActivityItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestActivityRetrieveInfoType.DestActivityItems }
     *     
     */
    public void setDestActivityItems(DestActivityRetrieveInfoType.DestActivityItems value) {
        this.destActivityItems = value;
    }

    /**
     * 获取destActivityDescriptiveContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestActivityRetrieveInfoType.DestActivityDescriptiveContent }
     *     
     */
    public DestActivityRetrieveInfoType.DestActivityDescriptiveContent getDestActivityDescriptiveContent() {
        return destActivityDescriptiveContent;
    }

    /**
     * 设置destActivityDescriptiveContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestActivityRetrieveInfoType.DestActivityDescriptiveContent }
     *     
     */
    public void setDestActivityDescriptiveContent(DestActivityRetrieveInfoType.DestActivityDescriptiveContent value) {
        this.destActivityDescriptiveContent = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ContactInfosType" minOccurs="0"/>
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
        "contactInfos"
    })
    public static class DestActivityDescriptiveContent {

        @XmlElement(name = "ContactInfos")
        protected ContactInfosType contactInfos;

        /**
         * 获取contactInfos属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ContactInfosType }
         *     
         */
        public ContactInfosType getContactInfos() {
            return contactInfos;
        }

        /**
         * 设置contactInfos属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ContactInfosType }
         *     
         */
        public void setContactInfos(ContactInfosType value) {
            this.contactInfos = value;
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
     *         &lt;element name="Item" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Vehicles" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Vehicle" type="{http://www.opentravel.org/OTA/2003/05}VehicleType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PostResInfos" type="{http://www.opentravel.org/OTA/2003/05}PostResType" minOccurs="0"/>
     *                   &lt;element name="ReservationItemReferences" type="{http://www.opentravel.org/OTA/2003/05}ReservationItemReferencesType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DestActivityCodeGroup"/>
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
        "item"
    })
    public static class DestActivityItems {

        @XmlElement(name = "Item", required = true)
        protected List<DestActivityRetrieveInfoType.DestActivityItems.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DestActivityRetrieveInfoType.DestActivityItems.Item }
         * 
         * 
         */
        public List<DestActivityRetrieveInfoType.DestActivityItems.Item> getItem() {
            if (item == null) {
                item = new ArrayList<DestActivityRetrieveInfoType.DestActivityItems.Item>();
            }
            return this.item;
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
         *         &lt;element name="Vehicles" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Vehicle" type="{http://www.opentravel.org/OTA/2003/05}VehicleType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PostResInfos" type="{http://www.opentravel.org/OTA/2003/05}PostResType" minOccurs="0"/>
         *         &lt;element name="ReservationItemReferences" type="{http://www.opentravel.org/OTA/2003/05}ReservationItemReferencesType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DestActivityCodeGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vehicles",
            "postResInfos",
            "reservationItemReferences"
        })
        public static class Item {

            @XmlElement(name = "Vehicles")
            protected DestActivityRetrieveInfoType.DestActivityItems.Item.Vehicles vehicles;
            @XmlElement(name = "PostResInfos")
            protected PostResType postResInfos;
            @XmlElement(name = "ReservationItemReferences")
            protected ReservationItemReferencesType reservationItemReferences;
            @XmlAttribute(name = "ItemCode", required = true)
            protected String itemCode;
            @XmlAttribute(name = "ConfirmedItemCode")
            protected String confirmedItemCode;

            /**
             * 获取vehicles属性的值。
             * 
             * @return
             *     possible object is
             *     {@link DestActivityRetrieveInfoType.DestActivityItems.Item.Vehicles }
             *     
             */
            public DestActivityRetrieveInfoType.DestActivityItems.Item.Vehicles getVehicles() {
                return vehicles;
            }

            /**
             * 设置vehicles属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link DestActivityRetrieveInfoType.DestActivityItems.Item.Vehicles }
             *     
             */
            public void setVehicles(DestActivityRetrieveInfoType.DestActivityItems.Item.Vehicles value) {
                this.vehicles = value;
            }

            /**
             * 获取postResInfos属性的值。
             * 
             * @return
             *     possible object is
             *     {@link PostResType }
             *     
             */
            public PostResType getPostResInfos() {
                return postResInfos;
            }

            /**
             * 设置postResInfos属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link PostResType }
             *     
             */
            public void setPostResInfos(PostResType value) {
                this.postResInfos = value;
            }

            /**
             * 获取reservationItemReferences属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ReservationItemReferencesType }
             *     
             */
            public ReservationItemReferencesType getReservationItemReferences() {
                return reservationItemReferences;
            }

            /**
             * 设置reservationItemReferences属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ReservationItemReferencesType }
             *     
             */
            public void setReservationItemReferences(ReservationItemReferencesType value) {
                this.reservationItemReferences = value;
            }

            /**
             * 获取itemCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemCode() {
                return itemCode;
            }

            /**
             * 设置itemCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemCode(String value) {
                this.itemCode = value;
            }

            /**
             * 获取confirmedItemCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConfirmedItemCode() {
                return confirmedItemCode;
            }

            /**
             * 设置confirmedItemCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConfirmedItemCode(String value) {
                this.confirmedItemCode = value;
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
             *         &lt;element name="Vehicle" type="{http://www.opentravel.org/OTA/2003/05}VehicleType" maxOccurs="unbounded"/>
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
                "vehicle"
            })
            public static class Vehicles {

                @XmlElement(name = "Vehicle", required = true)
                protected List<VehicleType> vehicle;

                /**
                 * Gets the value of the vehicle property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the vehicle property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVehicle().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VehicleType }
                 * 
                 * 
                 */
                public List<VehicleType> getVehicle() {
                    if (vehicle == null) {
                        vehicle = new ArrayList<VehicleType>();
                    }
                    return this.vehicle;
                }

            }

        }

    }

}
