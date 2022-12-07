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


/**
 * <p>AirAncillaryBundleProductType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirAncillaryBundleProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Content" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductContentType"/>
 *         &lt;element name="Lounge" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Prices" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductPricesType" minOccurs="0"/>
 *         &lt;element name="TravelerInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AirTraveler" type="{http://www.opentravel.org/OTA/2003/05}AirTravelerType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AncillaryProducts" type="{http://www.opentravel.org/OTA/2003/05}AncillaryProductsType" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://www.opentravel.org/OTA/2003/05}BundleAttributesType" minOccurs="0"/>
 *         &lt;element name="PassengerTypes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PassengerType" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}TravelerCodes" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" use="required" type="{http://www.opentravel.org/OTA/2003/05}AncillaryProductStatusType" />
 *       &lt;attribute name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Category" use="required" type="{http://www.opentravel.org/OTA/2003/05}AncillaryProductCategoryType" />
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProductSequence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SellingProposition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Available" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirAncillaryBundleProductType", propOrder = {
    "content",
    "lounge",
    "prices",
    "travelerInfo",
    "ancillaryProducts",
    "attributes",
    "passengerTypes"
})
public class AirAncillaryBundleProductType {

    @XmlElement(name = "Content", required = true)
    protected AirAncillaryProductContentType content;
    @XmlElement(name = "Lounge", required = true)
    protected Object lounge;
    @XmlElement(name = "Prices")
    protected AirAncillaryProductPricesType prices;
    @XmlElement(name = "TravelerInfo")
    protected AirAncillaryBundleProductType.TravelerInfo travelerInfo;
    @XmlElement(name = "AncillaryProducts")
    protected AncillaryProductsType ancillaryProducts;
    @XmlElement(name = "Attributes")
    protected BundleAttributesType attributes;
    @XmlElement(name = "PassengerTypes", required = true)
    protected AirAncillaryBundleProductType.PassengerTypes passengerTypes;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "Status", required = true)
    protected AncillaryProductStatusType status;
    @XmlAttribute(name = "BookingStatus")
    protected String bookingStatus;
    @XmlAttribute(name = "BookingReferenceID")
    protected String bookingReferenceID;
    @XmlAttribute(name = "Category", required = true)
    protected AncillaryProductCategoryType category;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "ProductSequence")
    protected String productSequence;
    @XmlAttribute(name = "SellingProposition")
    protected String sellingProposition;
    @XmlAttribute(name = "Tag")
    protected String tag;
    @XmlAttribute(name = "Available")
    protected Integer available;
    @XmlAttribute(name = "SSRCode")
    protected String ssrCode;

    /**
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductContentType }
     *     
     */
    public AirAncillaryProductContentType getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductContentType }
     *     
     */
    public void setContent(AirAncillaryProductContentType value) {
        this.content = value;
    }

    /**
     * 获取lounge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLounge() {
        return lounge;
    }

    /**
     * 设置lounge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLounge(Object value) {
        this.lounge = value;
    }

    /**
     * 获取prices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductPricesType }
     *     
     */
    public AirAncillaryProductPricesType getPrices() {
        return prices;
    }

    /**
     * 设置prices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductPricesType }
     *     
     */
    public void setPrices(AirAncillaryProductPricesType value) {
        this.prices = value;
    }

    /**
     * 获取travelerInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryBundleProductType.TravelerInfo }
     *     
     */
    public AirAncillaryBundleProductType.TravelerInfo getTravelerInfo() {
        return travelerInfo;
    }

    /**
     * 设置travelerInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryBundleProductType.TravelerInfo }
     *     
     */
    public void setTravelerInfo(AirAncillaryBundleProductType.TravelerInfo value) {
        this.travelerInfo = value;
    }

    /**
     * 获取ancillaryProducts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AncillaryProductsType }
     *     
     */
    public AncillaryProductsType getAncillaryProducts() {
        return ancillaryProducts;
    }

    /**
     * 设置ancillaryProducts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryProductsType }
     *     
     */
    public void setAncillaryProducts(AncillaryProductsType value) {
        this.ancillaryProducts = value;
    }

    /**
     * 获取attributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BundleAttributesType }
     *     
     */
    public BundleAttributesType getAttributes() {
        return attributes;
    }

    /**
     * 设置attributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BundleAttributesType }
     *     
     */
    public void setAttributes(BundleAttributesType value) {
        this.attributes = value;
    }

    /**
     * 获取passengerTypes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryBundleProductType.PassengerTypes }
     *     
     */
    public AirAncillaryBundleProductType.PassengerTypes getPassengerTypes() {
        return passengerTypes;
    }

    /**
     * 设置passengerTypes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryBundleProductType.PassengerTypes }
     *     
     */
    public void setPassengerTypes(AirAncillaryBundleProductType.PassengerTypes value) {
        this.passengerTypes = value;
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

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AncillaryProductStatusType }
     *     
     */
    public AncillaryProductStatusType getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryProductStatusType }
     *     
     */
    public void setStatus(AncillaryProductStatusType value) {
        this.status = value;
    }

    /**
     * 获取bookingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingStatus() {
        return bookingStatus;
    }

    /**
     * 设置bookingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingStatus(String value) {
        this.bookingStatus = value;
    }

    /**
     * 获取bookingReferenceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingReferenceID() {
        return bookingReferenceID;
    }

    /**
     * 设置bookingReferenceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingReferenceID(String value) {
        this.bookingReferenceID = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AncillaryProductCategoryType }
     *     
     */
    public AncillaryProductCategoryType getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryProductCategoryType }
     *     
     */
    public void setCategory(AncillaryProductCategoryType value) {
        this.category = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取productSequence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSequence() {
        return productSequence;
    }

    /**
     * 设置productSequence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSequence(String value) {
        this.productSequence = value;
    }

    /**
     * 获取sellingProposition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingProposition() {
        return sellingProposition;
    }

    /**
     * 设置sellingProposition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingProposition(String value) {
        this.sellingProposition = value;
    }

    /**
     * 获取tag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * 设置tag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * 获取available属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * 设置available属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailable(Integer value) {
        this.available = value;
    }

    /**
     * 获取ssrCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * 设置ssrCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
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
     *         &lt;element name="PassengerType" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}TravelerCodes" />
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
        "passengerType"
    })
    public static class PassengerTypes {

        @XmlElement(name = "PassengerType", required = true)
        protected List<AirAncillaryBundleProductType.PassengerTypes.PassengerType> passengerType;

        /**
         * Gets the value of the passengerType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirAncillaryBundleProductType.PassengerTypes.PassengerType }
         * 
         * 
         */
        public List<AirAncillaryBundleProductType.PassengerTypes.PassengerType> getPassengerType() {
            if (passengerType == null) {
                passengerType = new ArrayList<AirAncillaryBundleProductType.PassengerTypes.PassengerType>();
            }
            return this.passengerType;
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
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}TravelerCodes" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PassengerType {

            @XmlAttribute(name = "Code", required = true)
            protected TravelerCodes code;

            /**
             * 获取code属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TravelerCodes }
             *     
             */
            public TravelerCodes getCode() {
                return code;
            }

            /**
             * 设置code属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TravelerCodes }
             *     
             */
            public void setCode(TravelerCodes value) {
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
     *         &lt;element name="AirTraveler" type="{http://www.opentravel.org/OTA/2003/05}AirTravelerType"/>
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
        "airTraveler"
    })
    public static class TravelerInfo {

        @XmlElement(name = "AirTraveler", required = true)
        protected AirTravelerType airTraveler;

        /**
         * 获取airTraveler属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirTravelerType }
         *     
         */
        public AirTravelerType getAirTraveler() {
            return airTraveler;
        }

        /**
         * 设置airTraveler属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirTravelerType }
         *     
         */
        public void setAirTraveler(AirTravelerType value) {
            this.airTraveler = value;
        }

    }

}
