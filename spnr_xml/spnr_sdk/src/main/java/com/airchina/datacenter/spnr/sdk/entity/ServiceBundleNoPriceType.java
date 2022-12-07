//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

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
 * Non-Priced Optional Service BUNDLE information.
 * 
 * <p>ServiceBundleNoPriceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceBundleNoPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ItemDetail" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DescriptionVariable" type="{http://www.opentravel.org/OTA/2003/05}SrvcDesVariableType" minOccurs="0"/>
 *                             &lt;element name="DescriptionDetails" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ServiceLocation" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType" minOccurs="0"/>
 *                             &lt;element name="ServiceDate" type="{http://www.opentravel.org/OTA/2003/05}DateTimeType" minOccurs="0"/>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}BookByDate" minOccurs="0"/>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrier" minOccurs="0"/>
 *                             &lt;element name="Disclosure" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
 *                             &lt;element name="BookingInstructions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SSRCode" type="{http://www.opentravel.org/OTA/2003/05}SSRCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="UpgradeMethod" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
 *                                       &lt;element name="UserInput" type="{http://www.opentravel.org/OTA/2003/05}UserInputResponseType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Diagnostics" minOccurs="0"/>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}MediaReference" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ServiceBundleIDGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OfferID" maxOccurs="unbounded"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" maxOccurs="unbounded"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ServiceBundleGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBundleNoPriceType", propOrder = {
    "item"
})
public class ServiceBundleNoPriceType {

    @XmlElement(name = "Item", required = true)
    protected ServiceBundleNoPriceType.Item item;
    @XmlAttribute(name = "ItemCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itemCount;
    @XmlAttribute(name = "MinSelect")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minSelect;
    @XmlAttribute(name = "MaxSelect")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxSelect;

    /**
     * 获取item属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceBundleNoPriceType.Item }
     *     
     */
    public ServiceBundleNoPriceType.Item getItem() {
        return item;
    }

    /**
     * 设置item属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBundleNoPriceType.Item }
     *     
     */
    public void setItem(ServiceBundleNoPriceType.Item value) {
        this.item = value;
    }

    /**
     * 获取itemCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemCount() {
        return itemCount;
    }

    /**
     * 设置itemCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemCount(BigInteger value) {
        this.itemCount = value;
    }

    /**
     * 获取minSelect属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinSelect() {
        return minSelect;
    }

    /**
     * 设置minSelect属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinSelect(BigInteger value) {
        this.minSelect = value;
    }

    /**
     * 获取maxSelect属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSelect() {
        return maxSelect;
    }

    /**
     * 设置maxSelect属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSelect(BigInteger value) {
        this.maxSelect = value;
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
     *       &lt;choice>
     *         &lt;element name="ItemDetail" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DescriptionVariable" type="{http://www.opentravel.org/OTA/2003/05}SrvcDesVariableType" minOccurs="0"/>
     *                   &lt;element name="DescriptionDetails" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ServiceLocation" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType" minOccurs="0"/>
     *                   &lt;element name="ServiceDate" type="{http://www.opentravel.org/OTA/2003/05}DateTimeType" minOccurs="0"/>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}BookByDate" minOccurs="0"/>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrier" minOccurs="0"/>
     *                   &lt;element name="Disclosure" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
     *                   &lt;element name="BookingInstructions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SSRCode" type="{http://www.opentravel.org/OTA/2003/05}SSRCodeType" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="UpgradeMethod" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
     *                             &lt;element name="UserInput" type="{http://www.opentravel.org/OTA/2003/05}UserInputResponseType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Diagnostics" minOccurs="0"/>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}MediaReference" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ServiceBundleIDGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OfferID" maxOccurs="unbounded"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" maxOccurs="unbounded"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemDetail",
        "offerID",
        "serviceID"
    })
    public static class Item {

        @XmlElement(name = "ItemDetail")
        protected List<ServiceBundleNoPriceType.Item.ItemDetail> itemDetail;
        @XmlElement(name = "OfferID")
        protected List<OfferID> offerID;
        @XmlElement(name = "ServiceID")
        protected List<ServiceID> serviceID;

        /**
         * Gets the value of the itemDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceBundleNoPriceType.Item.ItemDetail }
         * 
         * 
         */
        public List<ServiceBundleNoPriceType.Item.ItemDetail> getItemDetail() {
            if (itemDetail == null) {
                itemDetail = new ArrayList<ServiceBundleNoPriceType.Item.ItemDetail>();
            }
            return this.itemDetail;
        }

        /**
         * Gets the value of the offerID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferID }
         * 
         * 
         */
        public List<OfferID> getOfferID() {
            if (offerID == null) {
                offerID = new ArrayList<OfferID>();
            }
            return this.offerID;
        }

        /**
         * Gets the value of the serviceID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceID }
         * 
         * 
         */
        public List<ServiceID> getServiceID() {
            if (serviceID == null) {
                serviceID = new ArrayList<ServiceID>();
            }
            return this.serviceID;
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
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DescriptionVariable" type="{http://www.opentravel.org/OTA/2003/05}SrvcDesVariableType" minOccurs="0"/>
         *         &lt;element name="DescriptionDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ServiceLocation" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType" minOccurs="0"/>
         *         &lt;element name="ServiceDate" type="{http://www.opentravel.org/OTA/2003/05}DateTimeType" minOccurs="0"/>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}BookByDate" minOccurs="0"/>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrier" minOccurs="0"/>
         *         &lt;element name="Disclosure" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
         *         &lt;element name="BookingInstructions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SSRCode" type="{http://www.opentravel.org/OTA/2003/05}SSRCodeType" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="UpgradeMethod" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
         *                   &lt;element name="UserInput" type="{http://www.opentravel.org/OTA/2003/05}UserInputResponseType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Diagnostics" minOccurs="0"/>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}MediaReference" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ServiceBundleIDGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "serviceID",
            "description",
            "descriptionVariable",
            "descriptionDetails",
            "serviceLocation",
            "serviceDate",
            "bookByDate",
            "validatingCarrier",
            "disclosure",
            "bookingInstructions",
            "diagnostics",
            "mediaReference"
        })
        public static class ItemDetail {

            @XmlElement(name = "ServiceID")
            protected ServiceID serviceID;
            @XmlElement(name = "Description", required = true)
            protected String description;
            @XmlElement(name = "DescriptionVariable")
            protected SrvcDesVariableType descriptionVariable;
            @XmlElement(name = "DescriptionDetails")
            protected ServiceBundleNoPriceType.Item.ItemDetail.DescriptionDetails descriptionDetails;
            @XmlElement(name = "ServiceLocation")
            protected String serviceLocation;
            @XmlElement(name = "ServiceDate")
            protected DateTimeType serviceDate;
            @XmlElement(name = "BookByDate")
            protected DateTimeType bookByDate;
            @XmlElement(name = "ValidatingCarrier")
            protected String validatingCarrier;
            @XmlElement(name = "Disclosure")
            protected String disclosure;
            @XmlElement(name = "BookingInstructions")
            protected ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions bookingInstructions;
            @XmlElement(name = "Diagnostics")
            protected DiagnosticsType diagnostics;
            @XmlElement(name = "MediaReference")
            protected MediaReferenceType mediaReference;
            @XmlAttribute(name = "Status")
            protected String status;
            @XmlAttribute(name = "ReasonCode")
            protected String reasonCode;
            @XmlAttribute(name = "CanDeselect")
            protected String canDeselect;
            @XmlAttribute(name = "ServiceType")
            protected String serviceType;
            @XmlAttribute(name = "ServiceCode")
            protected String serviceCode;
            @XmlAttribute(name = "SubCode")
            protected String subCode;
            @XmlAttribute(name = "Icon")
            protected String icon;
            @XmlAttribute(name = "NotValidBefore")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar notValidBefore;
            @XmlAttribute(name = "NotValidAfter")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar notValidAfter;
            @XmlAttribute(name = "Method")
            protected String method;

            /**
             * 获取serviceID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ServiceID }
             *     
             */
            public ServiceID getServiceID() {
                return serviceID;
            }

            /**
             * 设置serviceID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceID }
             *     
             */
            public void setServiceID(ServiceID value) {
                this.serviceID = value;
            }

            /**
             * 获取description属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * 设置description属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * 获取descriptionVariable属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SrvcDesVariableType }
             *     
             */
            public SrvcDesVariableType getDescriptionVariable() {
                return descriptionVariable;
            }

            /**
             * 设置descriptionVariable属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SrvcDesVariableType }
             *     
             */
            public void setDescriptionVariable(SrvcDesVariableType value) {
                this.descriptionVariable = value;
            }

            /**
             * 获取descriptionDetails属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ServiceBundleNoPriceType.Item.ItemDetail.DescriptionDetails }
             *     
             */
            public ServiceBundleNoPriceType.Item.ItemDetail.DescriptionDetails getDescriptionDetails() {
                return descriptionDetails;
            }

            /**
             * 设置descriptionDetails属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceBundleNoPriceType.Item.ItemDetail.DescriptionDetails }
             *     
             */
            public void setDescriptionDetails(ServiceBundleNoPriceType.Item.ItemDetail.DescriptionDetails value) {
                this.descriptionDetails = value;
            }

            /**
             * 获取serviceLocation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceLocation() {
                return serviceLocation;
            }

            /**
             * 设置serviceLocation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceLocation(String value) {
                this.serviceLocation = value;
            }

            /**
             * 获取serviceDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link DateTimeType }
             *     
             */
            public DateTimeType getServiceDate() {
                return serviceDate;
            }

            /**
             * 设置serviceDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link DateTimeType }
             *     
             */
            public void setServiceDate(DateTimeType value) {
                this.serviceDate = value;
            }

            /**
             * Bundled offer must be booked/ purchased by date.
             * 												Example: 2013-12-25
             * 
             * @return
             *     possible object is
             *     {@link DateTimeType }
             *     
             */
            public DateTimeType getBookByDate() {
                return bookByDate;
            }

            /**
             * 设置bookByDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link DateTimeType }
             *     
             */
            public void setBookByDate(DateTimeType value) {
                this.bookByDate = value;
            }

            /**
             * 获取validatingCarrier属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValidatingCarrier() {
                return validatingCarrier;
            }

            /**
             * 设置validatingCarrier属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValidatingCarrier(String value) {
                this.validatingCarrier = value;
            }

            /**
             * 获取disclosure属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisclosure() {
                return disclosure;
            }

            /**
             * 设置disclosure属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisclosure(String value) {
                this.disclosure = value;
            }

            /**
             * 获取bookingInstructions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions }
             *     
             */
            public ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions getBookingInstructions() {
                return bookingInstructions;
            }

            /**
             * 设置bookingInstructions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions }
             *     
             */
            public void setBookingInstructions(ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions value) {
                this.bookingInstructions = value;
            }

            /**
             * 获取diagnostics属性的值。
             * 
             * @return
             *     possible object is
             *     {@link DiagnosticsType }
             *     
             */
            public DiagnosticsType getDiagnostics() {
                return diagnostics;
            }

            /**
             * 设置diagnostics属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link DiagnosticsType }
             *     
             */
            public void setDiagnostics(DiagnosticsType value) {
                this.diagnostics = value;
            }

            /**
             * 获取mediaReference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link MediaReferenceType }
             *     
             */
            public MediaReferenceType getMediaReference() {
                return mediaReference;
            }

            /**
             * 设置mediaReference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link MediaReferenceType }
             *     
             */
            public void setMediaReference(MediaReferenceType value) {
                this.mediaReference = value;
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
             * 获取reasonCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonCode() {
                return reasonCode;
            }

            /**
             * 设置reasonCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonCode(String value) {
                this.reasonCode = value;
            }

            /**
             * 获取canDeselect属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCanDeselect() {
                return canDeselect;
            }

            /**
             * 设置canDeselect属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCanDeselect(String value) {
                this.canDeselect = value;
            }

            /**
             * 获取serviceType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceType() {
                return serviceType;
            }

            /**
             * 设置serviceType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceType(String value) {
                this.serviceType = value;
            }

            /**
             * 获取serviceCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceCode() {
                return serviceCode;
            }

            /**
             * 设置serviceCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceCode(String value) {
                this.serviceCode = value;
            }

            /**
             * 获取subCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubCode() {
                return subCode;
            }

            /**
             * 设置subCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubCode(String value) {
                this.subCode = value;
            }

            /**
             * 获取icon属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIcon() {
                return icon;
            }

            /**
             * 设置icon属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIcon(String value) {
                this.icon = value;
            }

            /**
             * 获取notValidBefore属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getNotValidBefore() {
                return notValidBefore;
            }

            /**
             * 设置notValidBefore属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setNotValidBefore(XMLGregorianCalendar value) {
                this.notValidBefore = value;
            }

            /**
             * 获取notValidAfter属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getNotValidAfter() {
                return notValidAfter;
            }

            /**
             * 设置notValidAfter属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setNotValidAfter(XMLGregorianCalendar value) {
                this.notValidAfter = value;
            }

            /**
             * 获取method属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMethod() {
                return method;
            }

            /**
             * 设置method属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMethod(String value) {
                this.method = value;
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
             *         &lt;element name="SSRCode" type="{http://www.opentravel.org/OTA/2003/05}SSRCodeType" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="UpgradeMethod" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
             *         &lt;element name="UserInput" type="{http://www.opentravel.org/OTA/2003/05}UserInputResponseType" minOccurs="0"/>
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
                "ssrCode",
                "osiText",
                "method",
                "upgradeMethod",
                "text",
                "equipment",
                "userInput"
            })
            public static class BookingInstructions {

                @XmlElement(name = "SSRCode")
                protected List<String> ssrCode;
                @XmlElement(name = "OSIText")
                protected List<String> osiText;
                @XmlElement(name = "Method")
                protected String method;
                @XmlElement(name = "UpgradeMethod")
                protected ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions.UpgradeMethod upgradeMethod;
                @XmlElement(name = "Text")
                protected List<String> text;
                @XmlElement(name = "Equipment")
                protected EquipmentDetailType equipment;
                @XmlElement(name = "UserInput")
                protected UserInputResponseType userInput;

                /**
                 * Gets the value of the ssrCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ssrCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSSRCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getSSRCode() {
                    if (ssrCode == null) {
                        ssrCode = new ArrayList<String>();
                    }
                    return this.ssrCode;
                }

                /**
                 * Gets the value of the osiText property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the osiText property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOSIText().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getOSIText() {
                    if (osiText == null) {
                        osiText = new ArrayList<String>();
                    }
                    return this.osiText;
                }

                /**
                 * 获取method属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMethod() {
                    return method;
                }

                /**
                 * 设置method属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMethod(String value) {
                    this.method = value;
                }

                /**
                 * 获取upgradeMethod属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions.UpgradeMethod }
                 *     
                 */
                public ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions.UpgradeMethod getUpgradeMethod() {
                    return upgradeMethod;
                }

                /**
                 * 设置upgradeMethod属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions.UpgradeMethod }
                 *     
                 */
                public void setUpgradeMethod(ServiceBundleNoPriceType.Item.ItemDetail.BookingInstructions.UpgradeMethod value) {
                    this.upgradeMethod = value;
                }

                /**
                 * Gets the value of the text property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the text property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getText().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getText() {
                    if (text == null) {
                        text = new ArrayList<String>();
                    }
                    return this.text;
                }

                /**
                 * 获取equipment属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link EquipmentDetailType }
                 *     
                 */
                public EquipmentDetailType getEquipment() {
                    return equipment;
                }

                /**
                 * 设置equipment属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EquipmentDetailType }
                 *     
                 */
                public void setEquipment(EquipmentDetailType value) {
                    this.equipment = value;
                }

                /**
                 * 获取userInput属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserInputResponseType }
                 *     
                 */
                public UserInputResponseType getUserInput() {
                    return userInput;
                }

                /**
                 * 设置userInput属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputResponseType }
                 *     
                 */
                public void setUserInput(UserInputResponseType value) {
                    this.userInput = value;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
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
                public static class UpgradeMethod {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "NewClass")
                    protected String newClass;

                    /**
                     * 获取value属性的值。
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
                     * 获取newClass属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNewClass() {
                        return newClass;
                    }

                    /**
                     * 设置newClass属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNewClass(String value) {
                        this.newClass = value;
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
             *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded"/>
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
                "text"
            })
            public static class DescriptionDetails {

                @XmlElement(name = "Text", required = true)
                protected List<String> text;

                /**
                 * Gets the value of the text property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the text property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getText().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getText() {
                    if (text == null) {
                        text = new ArrayList<String>();
                    }
                    return this.text;
                }

            }

        }

    }

}
