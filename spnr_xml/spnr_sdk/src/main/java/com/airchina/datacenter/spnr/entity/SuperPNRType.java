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
 * <p>SuperPNRType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SuperPNRType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}POS_Type" minOccurs="0"/>
 *         &lt;element name="xPromotion" type="{http://www.opentravel.org/OTA/2003/05}xPromotionType" minOccurs="0"/>
 *         &lt;element name="ModularProduct" type="{http://www.opentravel.org/OTA/2003/05}ModularProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PackageProduct" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PackageProductType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}SPNRCommonElements"/>
 *         &lt;element name="PaymentDetails" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailsType"/>
 *         &lt;element name="Queues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RemarksType">
 *                 &lt;sequence>
 *                   &lt;element name="Queue" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Action" type="{http://www.opentravel.org/OTA/2003/05}QueueActionType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueBase"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Customer" type="{http://www.opentravel.org/OTA/2003/05}OJ_CustomerPrimaryAdditionalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BackendAudits" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BackendAudit" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
 *                             &lt;element name="Review" type="{http://www.opentravel.org/OTA/2003/05}ExternalReviewType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="FileDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Attachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attachment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AttachmentsType">
 *                           &lt;sequence>
 *                             &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}SPNR_ErrorsType" minOccurs="0"/>
 *         &lt;element name="CrossRefs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueID" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                           &lt;attribute name="SeqNo" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="Historic" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AssociatedBookings" type="{http://www.opentravel.org/OTA/2003/05}AssociatedBookingsType" minOccurs="0"/>
 *         &lt;element name="Emails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}SPNR_Email_Type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OJ_ActionItem" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Replace" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SegRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CustomerSegRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeliItineraryStatus" type="{http://www.opentravel.org/OTA/2003/05}DeliItineraryStatusType" minOccurs="0"/>
 *         &lt;element name="ItinRemarks" type="{http://www.opentravel.org/OTA/2003/05}ItinRemarksType" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.opentravel.org/OTA/2003/05}OrderCategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ActionAttributes"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CommonProductAttributes"/>
 *       &lt;attribute name="FullHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TSBookingStatus" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="pendingPayment"/>
 *             &lt;enumeration value="pendingTicket"/>
 *             &lt;enumeration value="ticketSuccess"/>
 *             &lt;enumeration value="cancelled"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ProcessingStatus" type="{http://www.opentravel.org/OTA/2003/05}ProcessingStatusType" />
 *       &lt;attribute name="SuperPNR_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TKCancelType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="LastAuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="LastFulfillmentAuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="LowerBackendAudit" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UpperBackendAudit" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SourceAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SchemaVersion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CryptoVersion" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="PendingCommit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CancelTimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuperPNRType", propOrder = {
    "pos",
    "xPromotion",
    "modularProduct",
    "packageProduct",
    "pricing",
    "remarks",
    "warnings",
    "cancellationPenalties",
    "amendmentPenalties",
    "audits",
    "paymentDetails",
    "queues",
    "customer",
    "backendAudits",
    "attachments",
    "errors",
    "crossRefs",
    "associatedBookings",
    "emails",
    "ojActionItem",
    "deliItineraryStatus",
    "itinRemarks",
    "category"
})
@XmlSeeAlso({
    OJSuperPNR.class
})
public class SuperPNRType {

    @XmlElement(name = "POS")
    protected POSType pos;
    protected XPromotionType xPromotion;
    @XmlElement(name = "ModularProduct")
    protected List<ModularProductType> modularProduct;
    @XmlElement(name = "PackageProduct")
    protected List<SuperPNRType.PackageProduct> packageProduct;
    @XmlElement(name = "Pricing", required = true)
    protected ProductPricingType pricing;
    @XmlElement(name = "Remarks")
    protected SuperPNRType.Remarks remarks;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "CancellationPenalties")
    protected CancelPenaltiesType cancellationPenalties;
    @XmlElement(name = "AmendmentPenalties")
    protected OJAmendPenaltiesType amendmentPenalties;
    @XmlElement(name = "Audits")
    protected AuditsType audits;
    @XmlElement(name = "PaymentDetails", required = true)
    protected PaymentDetailsType paymentDetails;
    @XmlElement(name = "Queues")
    protected SuperPNRType.Queues queues;
    @XmlElement(name = "Customer")
    protected List<OJCustomerPrimaryAdditionalType> customer;
    @XmlElement(name = "BackendAudits")
    protected SuperPNRType.BackendAudits backendAudits;
    @XmlElement(name = "Attachments")
    protected SuperPNRType.Attachments attachments;
    @XmlElement(name = "Errors")
    protected SPNRErrorsType errors;
    @XmlElement(name = "CrossRefs")
    protected SuperPNRType.CrossRefs crossRefs;
    @XmlElement(name = "AssociatedBookings")
    protected AssociatedBookingsType associatedBookings;
    @XmlElement(name = "Emails")
    protected SuperPNRType.Emails emails;
    @XmlElement(name = "OJ_ActionItem")
    protected SuperPNRType.OJActionItem ojActionItem;
    @XmlElement(name = "DeliItineraryStatus")
    protected DeliItineraryStatusType deliItineraryStatus;
    @XmlElement(name = "ItinRemarks")
    protected ItinRemarksType itinRemarks;
    @XmlElement(name = "Category")
    protected OrderCategoryType category;
    @XmlAttribute(name = "FullHistory")
    protected Boolean fullHistory;
    @XmlAttribute(name = "TSBookingStatus", required = true)
    protected String tsBookingStatus;
    @XmlAttribute(name = "ProcessingStatus")
    protected ProcessingStatusType processingStatus;
    @XmlAttribute(name = "SuperPNR_ID", required = true)
    protected String superPNRID;
    @XmlAttribute(name = "TKCancelType")
    protected String tkCancelType;
    @XmlAttribute(name = "Summary")
    protected Boolean summary;
    @XmlAttribute(name = "LastAuditID")
    protected Integer lastAuditID;
    @XmlAttribute(name = "LastFulfillmentAuditID")
    protected Integer lastFulfillmentAuditID;
    @XmlAttribute(name = "LowerBackendAudit")
    @XmlSchemaType(name = "anySimpleType")
    protected String lowerBackendAudit;
    @XmlAttribute(name = "UpperBackendAudit")
    @XmlSchemaType(name = "anySimpleType")
    protected String upperBackendAudit;
    @XmlAttribute(name = "SourceAddress")
    @XmlSchemaType(name = "anySimpleType")
    protected String sourceAddress;
    @XmlAttribute(name = "SchemaVersion")
    @XmlSchemaType(name = "anySimpleType")
    protected String schemaVersion;
    @XmlAttribute(name = "CryptoVersion")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cryptoVersion;
    @XmlAttribute(name = "PendingCommit")
    protected Boolean pendingCommit;
    @XmlAttribute(name = "CancelTimeLimit")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelTimeLimit;
    @XmlAttribute(name = "Action")
    protected ActionCodeType action;
    @XmlAttribute(name = "BookingStatus", required = true)
    protected String bookingStatus;
    @XmlAttribute(name = "CancellationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;
    @XmlAttribute(name = "BookingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookingDate;
    @XmlAttribute(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "PromotionType")
    protected String promotionType;
    @XmlAttribute(name = "LastModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlAttribute(name = "Destination")
    protected String destination;

    /**
     * 获取pos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link POSType }
     *     
     */
    public POSType getPOS() {
        return pos;
    }

    /**
     * 设置pos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link POSType }
     *     
     */
    public void setPOS(POSType value) {
        this.pos = value;
    }

    /**
     * 获取xPromotion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XPromotionType }
     *     
     */
    public XPromotionType getXPromotion() {
        return xPromotion;
    }

    /**
     * 设置xPromotion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XPromotionType }
     *     
     */
    public void setXPromotion(XPromotionType value) {
        this.xPromotion = value;
    }

    /**
     * Gets the value of the modularProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modularProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModularProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModularProductType }
     * 
     * 
     */
    public List<ModularProductType> getModularProduct() {
        if (modularProduct == null) {
            modularProduct = new ArrayList<ModularProductType>();
        }
        return this.modularProduct;
    }

    /**
     * Gets the value of the packageProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuperPNRType.PackageProduct }
     * 
     * 
     */
    public List<SuperPNRType.PackageProduct> getPackageProduct() {
        if (packageProduct == null) {
            packageProduct = new ArrayList<SuperPNRType.PackageProduct>();
        }
        return this.packageProduct;
    }

    /**
     * 获取pricing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getPricing() {
        return pricing;
    }

    /**
     * 设置pricing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setPricing(ProductPricingType value) {
        this.pricing = value;
    }

    /**
     * 获取remarks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SuperPNRType.Remarks }
     *     
     */
    public SuperPNRType.Remarks getRemarks() {
        return remarks;
    }

    /**
     * 设置remarks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SuperPNRType.Remarks }
     *     
     */
    public void setRemarks(SuperPNRType.Remarks value) {
        this.remarks = value;
    }

    /**
     * 获取warnings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WarningsType }
     *     
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /**
     * 设置warnings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WarningsType }
     *     
     */
    public void setWarnings(WarningsType value) {
        this.warnings = value;
    }

    /**
     * 获取cancellationPenalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancellationPenalties() {
        return cancellationPenalties;
    }

    /**
     * 设置cancellationPenalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancellationPenalties(CancelPenaltiesType value) {
        this.cancellationPenalties = value;
    }

    /**
     * 获取amendmentPenalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OJAmendPenaltiesType }
     *     
     */
    public OJAmendPenaltiesType getAmendmentPenalties() {
        return amendmentPenalties;
    }

    /**
     * 设置amendmentPenalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OJAmendPenaltiesType }
     *     
     */
    public void setAmendmentPenalties(OJAmendPenaltiesType value) {
        this.amendmentPenalties = value;
    }

    /**
     * 获取audits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AuditsType }
     *     
     */
    public AuditsType getAudits() {
        return audits;
    }

    /**
     * 设置audits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AuditsType }
     *     
     */
    public void setAudits(AuditsType value) {
        this.audits = value;
    }

    /**
     * 获取paymentDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailsType }
     *     
     */
    public PaymentDetailsType getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * 设置paymentDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailsType }
     *     
     */
    public void setPaymentDetails(PaymentDetailsType value) {
        this.paymentDetails = value;
    }

    /**
     * 获取queues属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SuperPNRType.Queues }
     *     
     */
    public SuperPNRType.Queues getQueues() {
        return queues;
    }

    /**
     * 设置queues属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SuperPNRType.Queues }
     *     
     */
    public void setQueues(SuperPNRType.Queues value) {
        this.queues = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OJCustomerPrimaryAdditionalType }
     * 
     * 
     */
    public List<OJCustomerPrimaryAdditionalType> getCustomer() {
        if (customer == null) {
            customer = new ArrayList<OJCustomerPrimaryAdditionalType>();
        }
        return this.customer;
    }

    /**
     * 获取backendAudits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SuperPNRType.BackendAudits }
     *     
     */
    public SuperPNRType.BackendAudits getBackendAudits() {
        return backendAudits;
    }

    /**
     * 设置backendAudits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SuperPNRType.BackendAudits }
     *     
     */
    public void setBackendAudits(SuperPNRType.BackendAudits value) {
        this.backendAudits = value;
    }

    /**
     * 获取attachments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SuperPNRType.Attachments }
     *     
     */
    public SuperPNRType.Attachments getAttachments() {
        return attachments;
    }

    /**
     * 设置attachments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SuperPNRType.Attachments }
     *     
     */
    public void setAttachments(SuperPNRType.Attachments value) {
        this.attachments = value;
    }

    /**
     * 获取errors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SPNRErrorsType }
     *     
     */
    public SPNRErrorsType getErrors() {
        return errors;
    }

    /**
     * 设置errors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SPNRErrorsType }
     *     
     */
    public void setErrors(SPNRErrorsType value) {
        this.errors = value;
    }

    /**
     * 获取crossRefs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SuperPNRType.CrossRefs }
     *     
     */
    public SuperPNRType.CrossRefs getCrossRefs() {
        return crossRefs;
    }

    /**
     * 设置crossRefs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SuperPNRType.CrossRefs }
     *     
     */
    public void setCrossRefs(SuperPNRType.CrossRefs value) {
        this.crossRefs = value;
    }

    /**
     * 获取associatedBookings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AssociatedBookingsType }
     *     
     */
    public AssociatedBookingsType getAssociatedBookings() {
        return associatedBookings;
    }

    /**
     * 设置associatedBookings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedBookingsType }
     *     
     */
    public void setAssociatedBookings(AssociatedBookingsType value) {
        this.associatedBookings = value;
    }

    /**
     * 获取emails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SuperPNRType.Emails }
     *     
     */
    public SuperPNRType.Emails getEmails() {
        return emails;
    }

    /**
     * 设置emails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SuperPNRType.Emails }
     *     
     */
    public void setEmails(SuperPNRType.Emails value) {
        this.emails = value;
    }

    /**
     * 获取ojActionItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SuperPNRType.OJActionItem }
     *     
     */
    public SuperPNRType.OJActionItem getOJActionItem() {
        return ojActionItem;
    }

    /**
     * 设置ojActionItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SuperPNRType.OJActionItem }
     *     
     */
    public void setOJActionItem(SuperPNRType.OJActionItem value) {
        this.ojActionItem = value;
    }

    /**
     * 获取deliItineraryStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeliItineraryStatusType }
     *     
     */
    public DeliItineraryStatusType getDeliItineraryStatus() {
        return deliItineraryStatus;
    }

    /**
     * 设置deliItineraryStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeliItineraryStatusType }
     *     
     */
    public void setDeliItineraryStatus(DeliItineraryStatusType value) {
        this.deliItineraryStatus = value;
    }

    /**
     * 获取itinRemarks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItinRemarksType }
     *     
     */
    public ItinRemarksType getItinRemarks() {
        return itinRemarks;
    }

    /**
     * 设置itinRemarks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItinRemarksType }
     *     
     */
    public void setItinRemarks(ItinRemarksType value) {
        this.itinRemarks = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderCategoryType }
     *     
     */
    public OrderCategoryType getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCategoryType }
     *     
     */
    public void setCategory(OrderCategoryType value) {
        this.category = value;
    }

    /**
     * 获取fullHistory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullHistory() {
        return fullHistory;
    }

    /**
     * 设置fullHistory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullHistory(Boolean value) {
        this.fullHistory = value;
    }

    /**
     * 获取tsBookingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSBookingStatus() {
        return tsBookingStatus;
    }

    /**
     * 设置tsBookingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSBookingStatus(String value) {
        this.tsBookingStatus = value;
    }

    /**
     * 获取processingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatusType }
     *     
     */
    public ProcessingStatusType getProcessingStatus() {
        return processingStatus;
    }

    /**
     * 设置processingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatusType }
     *     
     */
    public void setProcessingStatus(ProcessingStatusType value) {
        this.processingStatus = value;
    }

    /**
     * 获取superPNRID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperPNRID() {
        return superPNRID;
    }

    /**
     * 设置superPNRID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperPNRID(String value) {
        this.superPNRID = value;
    }

    /**
     * 获取tkCancelType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTKCancelType() {
        return tkCancelType;
    }

    /**
     * 设置tkCancelType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTKCancelType(String value) {
        this.tkCancelType = value;
    }

    /**
     * 获取summary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSummary() {
        return summary;
    }

    /**
     * 设置summary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSummary(Boolean value) {
        this.summary = value;
    }

    /**
     * 获取lastAuditID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastAuditID() {
        return lastAuditID;
    }

    /**
     * 设置lastAuditID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastAuditID(Integer value) {
        this.lastAuditID = value;
    }

    /**
     * 获取lastFulfillmentAuditID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastFulfillmentAuditID() {
        return lastFulfillmentAuditID;
    }

    /**
     * 设置lastFulfillmentAuditID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastFulfillmentAuditID(Integer value) {
        this.lastFulfillmentAuditID = value;
    }

    /**
     * 获取lowerBackendAudit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerBackendAudit() {
        return lowerBackendAudit;
    }

    /**
     * 设置lowerBackendAudit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerBackendAudit(String value) {
        this.lowerBackendAudit = value;
    }

    /**
     * 获取upperBackendAudit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperBackendAudit() {
        return upperBackendAudit;
    }

    /**
     * 设置upperBackendAudit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperBackendAudit(String value) {
        this.upperBackendAudit = value;
    }

    /**
     * 获取sourceAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /**
     * 设置sourceAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAddress(String value) {
        this.sourceAddress = value;
    }

    /**
     * 获取schemaVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * 设置schemaVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    /**
     * 获取cryptoVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCryptoVersion() {
        return cryptoVersion;
    }

    /**
     * 设置cryptoVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCryptoVersion(BigInteger value) {
        this.cryptoVersion = value;
    }

    /**
     * 获取pendingCommit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPendingCommit() {
        return pendingCommit;
    }

    /**
     * 设置pendingCommit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPendingCommit(Boolean value) {
        this.pendingCommit = value;
    }

    /**
     * 获取cancelTimeLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelTimeLimit() {
        return cancelTimeLimit;
    }

    /**
     * 设置cancelTimeLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelTimeLimit(XMLGregorianCalendar value) {
        this.cancelTimeLimit = value;
    }

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeType }
     *     
     */
    public ActionCodeType getAction() {
        return action;
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeType }
     *     
     */
    public void setAction(ActionCodeType value) {
        this.action = value;
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
     * 获取cancellationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * 设置cancellationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * 获取bookingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDate() {
        return bookingDate;
    }

    /**
     * 设置bookingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingDate(XMLGregorianCalendar value) {
        this.bookingDate = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * 获取promotionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionType() {
        return promotionType;
    }

    /**
     * 设置promotionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionType(String value) {
        this.promotionType = value;
    }

    /**
     * 获取lastModified属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * 设置lastModified属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * 获取destination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 设置destination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
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
     *         &lt;element name="Attachment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AttachmentsType">
     *                 &lt;sequence>
     *                   &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
     *                 &lt;/sequence>
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
        "attachment"
    })
    public static class Attachments {

        @XmlElement(name = "Attachment")
        protected List<SuperPNRType.Attachments.Attachment> attachment;

        /**
         * Gets the value of the attachment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuperPNRType.Attachments.Attachment }
         * 
         * 
         */
        public List<SuperPNRType.Attachments.Attachment> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<SuperPNRType.Attachments.Attachment>();
            }
            return this.attachment;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AttachmentsType">
         *       &lt;sequence>
         *         &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "agent"
        })
        public static class Attachment
            extends AttachmentsType
        {

            @XmlElement(name = "Agent")
            protected AgentDetailsType agent;

            /**
             * 获取agent属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AgentDetailsType }
             *     
             */
            public AgentDetailsType getAgent() {
                return agent;
            }

            /**
             * 设置agent属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AgentDetailsType }
             *     
             */
            public void setAgent(AgentDetailsType value) {
                this.agent = value;
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
     *         &lt;element name="BackendAudit" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
     *                   &lt;element name="Review" type="{http://www.opentravel.org/OTA/2003/05}ExternalReviewType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="FileDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "backendAudit"
    })
    public static class BackendAudits {

        @XmlElement(name = "BackendAudit")
        protected List<SuperPNRType.BackendAudits.BackendAudit> backendAudit;

        /**
         * Gets the value of the backendAudit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the backendAudit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBackendAudit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuperPNRType.BackendAudits.BackendAudit }
         * 
         * 
         */
        public List<SuperPNRType.BackendAudits.BackendAudit> getBackendAudit() {
            if (backendAudit == null) {
                backendAudit = new ArrayList<SuperPNRType.BackendAudits.BackendAudit>();
            }
            return this.backendAudit;
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
         *         &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
         *         &lt;element name="Review" type="{http://www.opentravel.org/OTA/2003/05}ExternalReviewType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="FileDate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "agent",
            "review"
        })
        public static class BackendAudit {

            @XmlElement(name = "Agent")
            protected AgentDetailsType agent;
            @XmlElement(name = "Review")
            protected List<ExternalReviewType> review;
            @XmlAttribute(name = "FileDate")
            protected String fileDate;
            @XmlAttribute(name = "AuditID")
            protected String auditID;

            /**
             * 获取agent属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AgentDetailsType }
             *     
             */
            public AgentDetailsType getAgent() {
                return agent;
            }

            /**
             * 设置agent属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AgentDetailsType }
             *     
             */
            public void setAgent(AgentDetailsType value) {
                this.agent = value;
            }

            /**
             * Gets the value of the review property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the review property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReview().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExternalReviewType }
             * 
             * 
             */
            public List<ExternalReviewType> getReview() {
                if (review == null) {
                    review = new ArrayList<ExternalReviewType>();
                }
                return this.review;
            }

            /**
             * 获取fileDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFileDate() {
                return fileDate;
            }

            /**
             * 设置fileDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFileDate(String value) {
                this.fileDate = value;
            }

            /**
             * 获取auditID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuditID() {
                return auditID;
            }

            /**
             * 设置auditID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuditID(String value) {
                this.auditID = value;
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
     *         &lt;element name="UniqueID" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *                 &lt;attribute name="SeqNo" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Historic" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "uniqueID"
    })
    public static class CrossRefs {

        @XmlElement(name = "UniqueID")
        protected List<SuperPNRType.CrossRefs.UniqueID> uniqueID;

        /**
         * Gets the value of the uniqueID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUniqueID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuperPNRType.CrossRefs.UniqueID }
         * 
         * 
         */
        public List<SuperPNRType.CrossRefs.UniqueID> getUniqueID() {
            if (uniqueID == null) {
                uniqueID = new ArrayList<SuperPNRType.CrossRefs.UniqueID>();
            }
            return this.uniqueID;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
         *       &lt;attribute name="SeqNo" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Historic" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UniqueID
            extends UniqueIDType
        {

            @XmlAttribute(name = "SeqNo")
            protected Integer seqNo;
            @XmlAttribute(name = "Historic")
            @XmlSchemaType(name = "anySimpleType")
            protected String historic;

            /**
             * 获取seqNo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSeqNo() {
                return seqNo;
            }

            /**
             * 设置seqNo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSeqNo(Integer value) {
                this.seqNo = value;
            }

            /**
             * 获取historic属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHistoric() {
                return historic;
            }

            /**
             * 设置historic属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHistoric(String value) {
                this.historic = value;
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
     *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}SPNR_Email_Type" maxOccurs="unbounded" minOccurs="0"/>
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
        "email"
    })
    public static class Emails {

        @XmlElement(name = "Email")
        protected List<SPNREmailType> email;

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
         * {@link SPNREmailType }
         * 
         * 
         */
        public List<SPNREmailType> getEmail() {
            if (email == null) {
                email = new ArrayList<SPNREmailType>();
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
     *       &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Replace" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SegRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CustomerSegRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OJActionItem {

        @XmlAttribute(name = "MasterProductNumber")
        protected String masterProductNumber;
        @XmlAttribute(name = "ProductNumber")
        protected String productNumber;
        @XmlAttribute(name = "Replace")
        protected Boolean replace;
        @XmlAttribute(name = "SegRPHList")
        protected String segRPHList;
        @XmlAttribute(name = "CustomerSegRPHList")
        protected String customerSegRPHList;

        /**
         * 获取masterProductNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMasterProductNumber() {
            return masterProductNumber;
        }

        /**
         * 设置masterProductNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMasterProductNumber(String value) {
            this.masterProductNumber = value;
        }

        /**
         * 获取productNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductNumber() {
            return productNumber;
        }

        /**
         * 设置productNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductNumber(String value) {
            this.productNumber = value;
        }

        /**
         * 获取replace属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReplace() {
            return replace;
        }

        /**
         * 设置replace属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReplace(Boolean value) {
            this.replace = value;
        }

        /**
         * 获取segRPHList属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegRPHList() {
            return segRPHList;
        }

        /**
         * 设置segRPHList属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegRPHList(String value) {
            this.segRPHList = value;
        }

        /**
         * 获取customerSegRPHList属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerSegRPHList() {
            return customerSegRPHList;
        }

        /**
         * 设置customerSegRPHList属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerSegRPHList(String value) {
            this.customerSegRPHList = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PackageProductType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PackageProduct
        extends PackageProductType
    {


    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RemarksType">
     *       &lt;sequence>
     *         &lt;element name="Queue" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Action" type="{http://www.opentravel.org/OTA/2003/05}QueueActionType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueBase"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "queue"
    })
    public static class Queues
        extends RemarksType
    {

        @XmlElement(name = "Queue")
        protected List<SuperPNRType.Queues.Queue> queue;

        /**
         * Gets the value of the queue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuperPNRType.Queues.Queue }
         * 
         * 
         */
        public List<SuperPNRType.Queues.Queue> getQueue() {
            if (queue == null) {
                queue = new ArrayList<SuperPNRType.Queues.Queue>();
            }
            return this.queue;
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
         *         &lt;element name="Action" type="{http://www.opentravel.org/OTA/2003/05}QueueActionType" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueBase"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "action"
        })
        public static class Queue {

            @XmlElement(name = "Action", required = true)
            protected List<QueueActionType> action;
            @XmlAttribute(name = "QueueID", required = true)
            protected String queueID;
            @XmlAttribute(name = "QueueName")
            protected String queueName;
            @XmlAttribute(name = "Active")
            protected Boolean active;

            /**
             * Gets the value of the action property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the action property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAction().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QueueActionType }
             * 
             * 
             */
            public List<QueueActionType> getAction() {
                if (action == null) {
                    action = new ArrayList<QueueActionType>();
                }
                return this.action;
            }

            /**
             * 获取queueID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueueID() {
                return queueID;
            }

            /**
             * 设置queueID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueueID(String value) {
                this.queueID = value;
            }

            /**
             * 获取queueName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueueName() {
                return queueName;
            }

            /**
             * 设置queueName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueueName(String value) {
                this.queueName = value;
            }

            /**
             * 获取active属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isActive() {
                return active;
            }

            /**
             * 设置active属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setActive(Boolean value) {
                this.active = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RemarksType">
     *       &lt;sequence>
     *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}OJ_RemarkType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "remark"
    })
    public static class Remarks
        extends RemarksType
    {

        @XmlElement(name = "Remark")
        protected List<OJRemarkType> remark;

        /**
         * Gets the value of the remark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OJRemarkType }
         * 
         * 
         */
        public List<OJRemarkType> getRemark() {
            if (remark == null) {
                remark = new ArrayList<OJRemarkType>();
            }
            return this.remark;
        }

    }

}
