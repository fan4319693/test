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
 * All payment information relevant to a booking request.
 * 
 * <p>FulfillmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FulfillmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentDetail" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeliveryAddress" type="{http://www.opentravel.org/OTA/2003/05}AddressType" minOccurs="0"/>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                   &lt;element name="NamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HolderInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxRegInfo" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" maxOccurs="5" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Invoice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InvoiceTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="InvoiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TrackingReferenceID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="InvoiceIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfillmentType", propOrder = {
    "paymentDetails",
    "deliveryAddress",
    "name",
    "holderInfo",
    "invoice",
    "comment"
})
public class FulfillmentType {

    @XmlElement(name = "PaymentDetails")
    protected FulfillmentType.PaymentDetails paymentDetails;
    @XmlElement(name = "DeliveryAddress")
    protected AddressType deliveryAddress;
    @XmlElement(name = "Name")
    protected FulfillmentType.Name name;
    @XmlElement(name = "HolderInfo")
    protected FulfillmentType.HolderInfo holderInfo;
    @XmlElement(name = "Invoice")
    protected FulfillmentType.Invoice invoice;
    @XmlElement(name = "Comment")
    protected FreeTextType comment;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * 获取paymentDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentType.PaymentDetails }
     *     
     */
    public FulfillmentType.PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * 设置paymentDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentType.PaymentDetails }
     *     
     */
    public void setPaymentDetails(FulfillmentType.PaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * 获取deliveryAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * 设置deliveryAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDeliveryAddress(AddressType value) {
        this.deliveryAddress = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentType.Name }
     *     
     */
    public FulfillmentType.Name getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentType.Name }
     *     
     */
    public void setName(FulfillmentType.Name value) {
        this.name = value;
    }

    /**
     * 获取holderInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentType.HolderInfo }
     *     
     */
    public FulfillmentType.HolderInfo getHolderInfo() {
        return holderInfo;
    }

    /**
     * 设置holderInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentType.HolderInfo }
     *     
     */
    public void setHolderInfo(FulfillmentType.HolderInfo value) {
        this.holderInfo = value;
    }

    /**
     * 获取invoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentType.Invoice }
     *     
     */
    public FulfillmentType.Invoice getInvoice() {
        return invoice;
    }

    /**
     * 设置invoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentType.Invoice }
     *     
     */
    public void setInvoice(FulfillmentType.Invoice value) {
        this.invoice = value;
    }

    /**
     * 获取comment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreeTextType }
     *     
     */
    public FreeTextType getComment() {
        return comment;
    }

    /**
     * 设置comment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextType }
     *     
     */
    public void setComment(FreeTextType value) {
        this.comment = value;
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
     *         &lt;element name="TaxRegInfo" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" maxOccurs="5" minOccurs="0"/>
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
        "taxRegInfo",
        "email"
    })
    public static class HolderInfo {

        @XmlElement(name = "TaxRegInfo")
        protected UniqueIDType taxRegInfo;
        @XmlElement(name = "Email")
        protected List<EmailType> email;

        /**
         * 获取taxRegInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getTaxRegInfo() {
            return taxRegInfo;
        }

        /**
         * 设置taxRegInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setTaxRegInfo(UniqueIDType value) {
            this.taxRegInfo = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the email property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmailType }
         * 
         * 
         */
        public List<EmailType> getEmail() {
            if (email == null) {
                email = new ArrayList<EmailType>();
            }
            return this.email;
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
     *         &lt;element name="InvoiceTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="InvoiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TrackingReferenceID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *         &lt;element name="InvoiceIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "invoiceTitle",
        "invoiceType",
        "trackingReferenceID",
        "invoiceIssuer"
    })
    public static class Invoice {

        @XmlElement(name = "InvoiceTitle", required = true)
        protected String invoiceTitle;
        @XmlElement(name = "InvoiceType", required = true)
        protected String invoiceType;
        @XmlElement(name = "TrackingReferenceID")
        protected UniqueIDType trackingReferenceID;
        @XmlElement(name = "InvoiceIssuer")
        protected String invoiceIssuer;

        /**
         * 获取invoiceTitle属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceTitle() {
            return invoiceTitle;
        }

        /**
         * 设置invoiceTitle属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceTitle(String value) {
            this.invoiceTitle = value;
        }

        /**
         * 获取invoiceType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceType() {
            return invoiceType;
        }

        /**
         * 设置invoiceType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceType(String value) {
            this.invoiceType = value;
        }

        /**
         * 获取trackingReferenceID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getTrackingReferenceID() {
            return trackingReferenceID;
        }

        /**
         * 设置trackingReferenceID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setTrackingReferenceID(UniqueIDType value) {
            this.trackingReferenceID = value;
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
     *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *         &lt;element name="NamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "companyName",
        "namePrefix",
        "givenName",
        "surname"
    })
    public static class Name {

        @XmlElement(name = "CompanyName")
        protected CompanyNameType companyName;
        @XmlElement(name = "NamePrefix")
        protected String namePrefix;
        @XmlElement(name = "GivenName")
        protected String givenName;
        @XmlElement(name = "Surname")
        protected String surname;

        /**
         * 获取companyName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CompanyNameType }
         *     
         */
        public CompanyNameType getCompanyName() {
            return companyName;
        }

        /**
         * 设置companyName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyNameType }
         *     
         */
        public void setCompanyName(CompanyNameType value) {
            this.companyName = value;
        }

        /**
         * 获取namePrefix属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNamePrefix() {
            return namePrefix;
        }

        /**
         * 设置namePrefix属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNamePrefix(String value) {
            this.namePrefix = value;
        }

        /**
         * 获取givenName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGivenName() {
            return givenName;
        }

        /**
         * 设置givenName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGivenName(String value) {
            this.givenName = value;
        }

        /**
         * 获取surname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurname() {
            return surname;
        }

        /**
         * 设置surname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurname(String value) {
            this.surname = value;
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
     *         &lt;element name="PaymentDetail" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" maxOccurs="99"/>
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

        @XmlElement(name = "PaymentDetail", required = true)
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

}
