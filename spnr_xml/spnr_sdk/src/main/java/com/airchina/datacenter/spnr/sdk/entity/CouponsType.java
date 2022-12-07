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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CouponsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CouponsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Content" type="{http://www.opentravel.org/OTA/2003/05}ProductContentType" minOccurs="0"/>
 *         &lt;element name="Pricing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Price" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyProductType" minOccurs="0"/>
 *                   &lt;element name="Discount" type="{http://www.opentravel.org/OTA/2003/05}CouponPriceType" minOccurs="0"/>
 *                   &lt;element name="OriginalTotal" type="{http://www.opentravel.org/OTA/2003/05}CouponPriceType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingReferenceID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="Coupon" type="{http://www.opentravel.org/OTA/2003/05}CouponType" maxOccurs="unbounded"/>
 *         &lt;element name="Beneficiary" type="{http://www.opentravel.org/OTA/2003/05}BeneficiaryType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="TravelerInfo" type="{http://www.opentravel.org/OTA/2003/05}TravelerInfoType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="PaymentDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentDetail" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="PolicyNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to8" />
 *       &lt;attribute name="InfoSource" type="{http://www.opentravel.org/OTA/2003/05}InfoSourceType" />
 *       &lt;attribute name="ActivityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Batch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponsType", propOrder = {
    "content",
    "pricing",
    "bookingReferenceID",
    "coupon",
    "beneficiary",
    "travelerInfo",
    "paymentDetails"
})
public class CouponsType {

    @XmlElement(name = "Content")
    protected ProductContentType content;
    @XmlElement(name = "Pricing")
    protected CouponsType.Pricing pricing;
    @XmlElement(name = "BookingReferenceID")
    protected UniqueIDType bookingReferenceID;
    @XmlElement(name = "Coupon", required = true)
    protected List<CouponType> coupon;
    @XmlElement(name = "Beneficiary")
    protected List<BeneficiaryType> beneficiary;
    @XmlElement(name = "TravelerInfo")
    protected List<TravelerInfoType> travelerInfo;
    @XmlElement(name = "PaymentDetails")
    protected CouponsType.PaymentDetails paymentDetails;
    @XmlAttribute(name = "ReferenceID")
    @XmlSchemaType(name = "anySimpleType")
    protected String referenceID;
    @XmlAttribute(name = "SupplierCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String supplierCode;
    @XmlAttribute(name = "ProductCode")
    protected String productCode;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "ExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "PassengerRPH")
    protected String passengerRPH;
    @XmlAttribute(name = "FlightSegmentRPH")
    protected String flightSegmentRPH;
    @XmlAttribute(name = "PolicyNumber")
    protected String policyNumber;
    @XmlAttribute(name = "InfoSource")
    protected String infoSource;
    @XmlAttribute(name = "ActivityCode")
    protected String activityCode;
    @XmlAttribute(name = "SourceCode")
    protected String sourceCode;
    @XmlAttribute(name = "Batch")
    protected Boolean batch;
    @XmlAttribute(name = "Channel")
    protected String channel;

    /**
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductContentType }
     *     
     */
    public ProductContentType getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductContentType }
     *     
     */
    public void setContent(ProductContentType value) {
        this.content = value;
    }

    /**
     * 获取pricing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponsType.Pricing }
     *     
     */
    public CouponsType.Pricing getPricing() {
        return pricing;
    }

    /**
     * 设置pricing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponsType.Pricing }
     *     
     */
    public void setPricing(CouponsType.Pricing value) {
        this.pricing = value;
    }

    /**
     * 获取bookingReferenceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getBookingReferenceID() {
        return bookingReferenceID;
    }

    /**
     * 设置bookingReferenceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setBookingReferenceID(UniqueIDType value) {
        this.bookingReferenceID = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coupon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoupon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponType }
     * 
     * 
     */
    public List<CouponType> getCoupon() {
        if (coupon == null) {
            coupon = new ArrayList<CouponType>();
        }
        return this.coupon;
    }

    /**
     * Gets the value of the beneficiary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficiaryType }
     * 
     * 
     */
    public List<BeneficiaryType> getBeneficiary() {
        if (beneficiary == null) {
            beneficiary = new ArrayList<BeneficiaryType>();
        }
        return this.beneficiary;
    }

    /**
     * Gets the value of the travelerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInfoType }
     * 
     * 
     */
    public List<TravelerInfoType> getTravelerInfo() {
        if (travelerInfo == null) {
            travelerInfo = new ArrayList<TravelerInfoType>();
        }
        return this.travelerInfo;
    }

    /**
     * 获取paymentDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponsType.PaymentDetails }
     *     
     */
    public CouponsType.PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * 设置paymentDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponsType.PaymentDetails }
     *     
     */
    public void setPaymentDetails(CouponsType.PaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * 获取referenceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * 设置referenceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * 获取supplierCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * 设置supplierCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * 获取productCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 设置productCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
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
     * 获取expiryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * 设置expiryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
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

    /**
     * 获取passengerRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerRPH() {
        return passengerRPH;
    }

    /**
     * 设置passengerRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerRPH(String value) {
        this.passengerRPH = value;
    }

    /**
     * 获取flightSegmentRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSegmentRPH() {
        return flightSegmentRPH;
    }

    /**
     * 设置flightSegmentRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSegmentRPH(String value) {
        this.flightSegmentRPH = value;
    }

    /**
     * 获取policyNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * 设置policyNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumber(String value) {
        this.policyNumber = value;
    }

    /**
     * 获取infoSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * 设置infoSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoSource(String value) {
        this.infoSource = value;
    }

    /**
     * 获取activityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * 设置activityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCode(String value) {
        this.activityCode = value;
    }

    /**
     * 获取sourceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * 设置sourceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCode(String value) {
        this.sourceCode = value;
    }

    /**
     * 获取batch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBatch() {
        return batch;
    }

    /**
     * 设置batch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatch(Boolean value) {
        this.batch = value;
    }

    /**
     * 获取channel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置channel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
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
     *         &lt;element name="PaymentDetail" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" maxOccurs="unbounded" minOccurs="0"/>
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
        "paymentDetail"
    })
    public static class PaymentDetails {

        @XmlElement(name = "PaymentDetail")
        protected List<PaymentDetailType> paymentDetail;

        /**
         * Gets the value of the paymentDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentDetailType }
         * 
         * 
         */
        public List<PaymentDetailType> getPaymentDetail() {
            if (paymentDetail == null) {
                paymentDetail = new ArrayList<PaymentDetailType>();
            }
            return this.paymentDetail;
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
     *         &lt;element name="Price" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
     *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyProductType" minOccurs="0"/>
     *         &lt;element name="Discount" type="{http://www.opentravel.org/OTA/2003/05}CouponPriceType" minOccurs="0"/>
     *         &lt;element name="OriginalTotal" type="{http://www.opentravel.org/OTA/2003/05}CouponPriceType" minOccurs="0"/>
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
        "price",
        "loyalty",
        "discount",
        "originalTotal"
    })
    public static class Pricing {

        @XmlElement(name = "Price")
        protected CurrencyAmountType price;
        @XmlElement(name = "Loyalty")
        protected LoyaltyProductType loyalty;
        @XmlElement(name = "Discount")
        protected CouponPriceType discount;
        @XmlElement(name = "OriginalTotal")
        protected CouponPriceType originalTotal;

        /**
         * 获取price属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountType }
         *     
         */
        public CurrencyAmountType getPrice() {
            return price;
        }

        /**
         * 设置price属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountType }
         *     
         */
        public void setPrice(CurrencyAmountType value) {
            this.price = value;
        }

        /**
         * 获取loyalty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LoyaltyProductType }
         *     
         */
        public LoyaltyProductType getLoyalty() {
            return loyalty;
        }

        /**
         * 设置loyalty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LoyaltyProductType }
         *     
         */
        public void setLoyalty(LoyaltyProductType value) {
            this.loyalty = value;
        }

        /**
         * 获取discount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CouponPriceType }
         *     
         */
        public CouponPriceType getDiscount() {
            return discount;
        }

        /**
         * 设置discount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CouponPriceType }
         *     
         */
        public void setDiscount(CouponPriceType value) {
            this.discount = value;
        }

        /**
         * 获取originalTotal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CouponPriceType }
         *     
         */
        public CouponPriceType getOriginalTotal() {
            return originalTotal;
        }

        /**
         * 设置originalTotal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CouponPriceType }
         *     
         */
        public void setOriginalTotal(CouponPriceType value) {
            this.originalTotal = value;
        }

    }

}
