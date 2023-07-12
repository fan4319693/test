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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The details of a destination activity item.
 * 
 * <p>ItemType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NegotiatedPrice" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *         &lt;element name="SellingPrice" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *         &lt;element name="SubAllocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="TravelerRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialRequest" type="{http://www.opentravel.org/OTA/2003/05}SpecialRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HotelStay" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ItemReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemReference" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ItemQuantities">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="ItemQuantity">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PTCType">
 *                           &lt;sequence>
 *                             &lt;element name="Travelers" type="{http://www.opentravel.org/OTA/2003/05}TravelersType"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                           &lt;attribute name="OriginalAmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="OriginalAmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="OriginalCurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *         &lt;element name="Categories" type="{http://www.opentravel.org/OTA/2003/05}EventCategoriesType"/>
 *         &lt;element name="ReservationItemReferences" type="{http://www.opentravel.org/OTA/2003/05}ReservationItemReferencesType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}PTCs" minOccurs="0"/>
 *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DestActivityCodeGroup"/>
 *       &lt;attribute name="OptionCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="SelectedDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="SelectedTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "negotiatedPrice",
    "sellingPrice",
    "subAllocation",
    "specialRequest",
    "hotelStay",
    "itemReferences",
    "itemQuantities",
    "vehicles",
    "postResInfos",
    "categories",
    "reservationItemReferences",
    "ptCs",
    "priceAdjustments"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.DestActivityItemsType.Item.class
})
public class ItemType {

    @XmlElement(name = "NegotiatedPrice")
    protected TotalType negotiatedPrice;
    @XmlElement(name = "SellingPrice")
    protected TotalType sellingPrice;
    @XmlElement(name = "SubAllocation")
    protected ItemType.SubAllocation subAllocation;
    @XmlElement(name = "SpecialRequest")
    protected List<SpecialRequestType> specialRequest;
    @XmlElement(name = "HotelStay")
    protected ItemType.HotelStay hotelStay;
    @XmlElement(name = "ItemReferences")
    protected ItemType.ItemReferences itemReferences;
    @XmlElement(name = "ItemQuantities", required = true)
    protected ItemType.ItemQuantities itemQuantities;
    @XmlElement(name = "Vehicles")
    protected ItemType.Vehicles vehicles;
    @XmlElement(name = "PostResInfos")
    protected PostResType postResInfos;
    @XmlElement(name = "Categories", required = true)
    protected EventCategoriesType categories;
    @XmlElement(name = "ReservationItemReferences")
    protected ReservationItemReferencesType reservationItemReferences;
    @XmlElement(name = "PTCs")
    protected PTCsFromDestActivityCommonTypes ptCs;
    @XmlElement(name = "PriceAdjustments", required = true)
    protected ExPriceAdjustmentsType priceAdjustments;
    @XmlAttribute(name = "OptionCode")
    protected String optionCode;
    @XmlAttribute(name = "SelectedDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar selectedDate;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "SelectedTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar selectedTime;
    @XmlAttribute(name = "ItemCode", required = true)
    protected String itemCode;
    @XmlAttribute(name = "ConfirmedItemCode")
    protected String confirmedItemCode;

    /**
     * 获取negotiatedPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getNegotiatedPrice() {
        return negotiatedPrice;
    }

    /**
     * 设置negotiatedPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setNegotiatedPrice(TotalType value) {
        this.negotiatedPrice = value;
    }

    /**
     * 获取sellingPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getSellingPrice() {
        return sellingPrice;
    }

    /**
     * 设置sellingPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setSellingPrice(TotalType value) {
        this.sellingPrice = value;
    }

    /**
     * 获取subAllocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemType.SubAllocation }
     *     
     */
    public ItemType.SubAllocation getSubAllocation() {
        return subAllocation;
    }

    /**
     * 设置subAllocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType.SubAllocation }
     *     
     */
    public void setSubAllocation(ItemType.SubAllocation value) {
        this.subAllocation = value;
    }

    /**
     * Gets the value of the specialRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialRequestType }
     * 
     * 
     */
    public List<SpecialRequestType> getSpecialRequest() {
        if (specialRequest == null) {
            specialRequest = new ArrayList<SpecialRequestType>();
        }
        return this.specialRequest;
    }

    /**
     * 获取hotelStay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemType.HotelStay }
     *     
     */
    public ItemType.HotelStay getHotelStay() {
        return hotelStay;
    }

    /**
     * 设置hotelStay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType.HotelStay }
     *     
     */
    public void setHotelStay(ItemType.HotelStay value) {
        this.hotelStay = value;
    }

    /**
     * 获取itemReferences属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemType.ItemReferences }
     *     
     */
    public ItemType.ItemReferences getItemReferences() {
        return itemReferences;
    }

    /**
     * 设置itemReferences属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType.ItemReferences }
     *     
     */
    public void setItemReferences(ItemType.ItemReferences value) {
        this.itemReferences = value;
    }

    /**
     * 获取itemQuantities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemType.ItemQuantities }
     *     
     */
    public ItemType.ItemQuantities getItemQuantities() {
        return itemQuantities;
    }

    /**
     * 设置itemQuantities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType.ItemQuantities }
     *     
     */
    public void setItemQuantities(ItemType.ItemQuantities value) {
        this.itemQuantities = value;
    }

    /**
     * 获取vehicles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemType.Vehicles }
     *     
     */
    public ItemType.Vehicles getVehicles() {
        return vehicles;
    }

    /**
     * 设置vehicles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType.Vehicles }
     *     
     */
    public void setVehicles(ItemType.Vehicles value) {
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
     * 获取categories属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EventCategoriesType }
     *     
     */
    public EventCategoriesType getCategories() {
        return categories;
    }

    /**
     * 设置categories属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EventCategoriesType }
     *     
     */
    public void setCategories(EventCategoriesType value) {
        this.categories = value;
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
     * 获取ptCs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTCsFromDestActivityCommonTypes }
     *     
     */
    public PTCsFromDestActivityCommonTypes getPTCs() {
        return ptCs;
    }

    /**
     * 设置ptCs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTCsFromDestActivityCommonTypes }
     *     
     */
    public void setPTCs(PTCsFromDestActivityCommonTypes value) {
        this.ptCs = value;
    }

    /**
     * 获取priceAdjustments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExPriceAdjustmentsType }
     *     
     */
    public ExPriceAdjustmentsType getPriceAdjustments() {
        return priceAdjustments;
    }

    /**
     * 设置priceAdjustments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExPriceAdjustmentsType }
     *     
     */
    public void setPriceAdjustments(ExPriceAdjustmentsType value) {
        this.priceAdjustments = value;
    }

    /**
     * 获取optionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionCode() {
        return optionCode;
    }

    /**
     * 设置optionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionCode(String value) {
        this.optionCode = value;
    }

    /**
     * 获取selectedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSelectedDate() {
        return selectedDate;
    }

    /**
     * 设置selectedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSelectedDate(XMLGregorianCalendar value) {
        this.selectedDate = value;
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
        if (quantity == null) {
            return new BigInteger("1");
        } else {
            return quantity;
        }
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

    /**
     * 获取selectedTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSelectedTime() {
        return selectedTime;
    }

    /**
     * 设置selectedTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSelectedTime(XMLGregorianCalendar value) {
        this.selectedTime = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelStay {

        @XmlAttribute(name = "BookingOfficeCode")
        protected String bookingOfficeCode;
        @XmlAttribute(name = "ChainCode")
        protected String chainCode;
        @XmlAttribute(name = "BrandCode")
        protected String brandCode;
        @XmlAttribute(name = "HotelCode")
        protected String hotelCode;
        @XmlAttribute(name = "HotelCityCode")
        protected String hotelCityCode;
        @XmlAttribute(name = "HotelCityCodeContext")
        protected String hotelCityCodeContext;
        @XmlAttribute(name = "HotelName")
        protected String hotelName;
        @XmlAttribute(name = "HotelCodeContext")
        protected String hotelCodeContext;
        @XmlAttribute(name = "ChainName")
        protected String chainName;
        @XmlAttribute(name = "BrandName")
        protected String brandName;
        @XmlAttribute(name = "InvoiceIssuer")
        protected String invoiceIssuer;
        @XmlAttribute(name = "StayType")
        protected String stayType;
        @XmlAttribute(name = "AreaID")
        protected String areaID;

        /**
         * 获取bookingOfficeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingOfficeCode() {
            return bookingOfficeCode;
        }

        /**
         * 设置bookingOfficeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingOfficeCode(String value) {
            this.bookingOfficeCode = value;
        }

        /**
         * 获取chainCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainCode() {
            return chainCode;
        }

        /**
         * 设置chainCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainCode(String value) {
            this.chainCode = value;
        }

        /**
         * 获取brandCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandCode() {
            return brandCode;
        }

        /**
         * 设置brandCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandCode(String value) {
            this.brandCode = value;
        }

        /**
         * 获取hotelCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCode() {
            return hotelCode;
        }

        /**
         * 设置hotelCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCode(String value) {
            this.hotelCode = value;
        }

        /**
         * 获取hotelCityCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCityCode() {
            return hotelCityCode;
        }

        /**
         * 设置hotelCityCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCityCode(String value) {
            this.hotelCityCode = value;
        }

        /**
         * 获取hotelCityCodeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCityCodeContext() {
            return hotelCityCodeContext;
        }

        /**
         * 设置hotelCityCodeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCityCodeContext(String value) {
            this.hotelCityCodeContext = value;
        }

        /**
         * 获取hotelName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelName() {
            return hotelName;
        }

        /**
         * 设置hotelName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelName(String value) {
            this.hotelName = value;
        }

        /**
         * 获取hotelCodeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCodeContext() {
            return hotelCodeContext;
        }

        /**
         * 设置hotelCodeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCodeContext(String value) {
            this.hotelCodeContext = value;
        }

        /**
         * 获取chainName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainName() {
            return chainName;
        }

        /**
         * 设置chainName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainName(String value) {
            this.chainName = value;
        }

        /**
         * 获取brandName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandName() {
            return brandName;
        }

        /**
         * 设置brandName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandName(String value) {
            this.brandName = value;
        }

        /**
         * 获取invoiceIssuer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceIssuer() {
            return invoiceIssuer;
        }

        /**
         * 设置invoiceIssuer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceIssuer(String value) {
            this.invoiceIssuer = value;
        }

        /**
         * 获取stayType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStayType() {
            return stayType;
        }

        /**
         * 设置stayType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStayType(String value) {
            this.stayType = value;
        }

        /**
         * 获取areaID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaID() {
            return areaID;
        }

        /**
         * 设置areaID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaID(String value) {
            this.areaID = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="ItemQuantity">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PTCType">
     *                 &lt;sequence>
     *                   &lt;element name="Travelers" type="{http://www.opentravel.org/OTA/2003/05}TravelersType"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *                 &lt;attribute name="OriginalAmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="OriginalAmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="OriginalCurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
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
        "itemQuantity"
    })
    public static class ItemQuantities {

        @XmlElement(name = "ItemQuantity", required = true)
        protected List<ItemType.ItemQuantities.ItemQuantity> itemQuantity;

        /**
         * Gets the value of the itemQuantity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemQuantity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemQuantity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemType.ItemQuantities.ItemQuantity }
         * 
         * 
         */
        public List<ItemType.ItemQuantities.ItemQuantity> getItemQuantity() {
            if (itemQuantity == null) {
                itemQuantity = new ArrayList<ItemType.ItemQuantities.ItemQuantity>();
            }
            return this.itemQuantity;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PTCType">
         *       &lt;sequence>
         *         &lt;element name="Travelers" type="{http://www.opentravel.org/OTA/2003/05}TravelersType"/>
         *       &lt;/sequence>
         *       &lt;attribute name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *       &lt;attribute name="OriginalAmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="OriginalAmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="OriginalCurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "travelers"
        })
        public static class ItemQuantity
            extends PTCType
        {

            @XmlElement(name = "Travelers", required = true)
            protected TravelersType travelers;
            @XmlAttribute(name = "CategoryCode")
            @XmlSchemaType(name = "anySimpleType")
            protected String categoryCode;
            @XmlAttribute(name = "AmountAfterTax")
            protected Float amountAfterTax;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "OriginalAmountAfterTax")
            protected Float originalAmountAfterTax;
            @XmlAttribute(name = "OriginalAmountBeforeTax")
            protected Float originalAmountBeforeTax;
            @XmlAttribute(name = "OriginalCurrencyCode")
            protected String originalCurrencyCode;

            /**
             * 获取travelers属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TravelersType }
             *     
             */
            public TravelersType getTravelers() {
                return travelers;
            }

            /**
             * 设置travelers属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TravelersType }
             *     
             */
            public void setTravelers(TravelersType value) {
                this.travelers = value;
            }

            /**
             * 获取categoryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategoryCode() {
                return categoryCode;
            }

            /**
             * 设置categoryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategoryCode(String value) {
                this.categoryCode = value;
            }

            /**
             * 获取amountAfterTax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getAmountAfterTax() {
                return amountAfterTax;
            }

            /**
             * 设置amountAfterTax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setAmountAfterTax(Float value) {
                this.amountAfterTax = value;
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
             * 获取originalAmountAfterTax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getOriginalAmountAfterTax() {
                return originalAmountAfterTax;
            }

            /**
             * 设置originalAmountAfterTax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setOriginalAmountAfterTax(Float value) {
                this.originalAmountAfterTax = value;
            }

            /**
             * 获取originalAmountBeforeTax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getOriginalAmountBeforeTax() {
                return originalAmountBeforeTax;
            }

            /**
             * 设置originalAmountBeforeTax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setOriginalAmountBeforeTax(Float value) {
                this.originalAmountBeforeTax = value;
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
     *         &lt;element name="ItemReference" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded"/>
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
        "itemReference"
    })
    public static class ItemReferences {

        @XmlElement(name = "ItemReference", required = true)
        protected List<UniqueIDType> itemReference;

        /**
         * Gets the value of the itemReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UniqueIDType }
         * 
         * 
         */
        public List<UniqueIDType> getItemReference() {
            if (itemReference == null) {
                itemReference = new ArrayList<UniqueIDType>();
            }
            return this.itemReference;
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
     *       &lt;attribute name="TravelerRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SubAllocation {

        @XmlAttribute(name = "TravelerRPH", required = true)
        protected List<String> travelerRPH;

        /**
         * Gets the value of the travelerRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelerRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelerRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTravelerRPH() {
            if (travelerRPH == null) {
                travelerRPH = new ArrayList<String>();
            }
            return this.travelerRPH;
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
