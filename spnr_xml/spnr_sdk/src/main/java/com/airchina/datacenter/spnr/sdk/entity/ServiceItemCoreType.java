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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Core PRICED ancillary service item definition.
 * 
 * <p>ServiceItemCoreType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceItemCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ForInfo" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}DescriptionVariable" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}DescriptionDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}BundleContent" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RedemptionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServicePrice" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TicketByDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}BookByDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrier" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}InstantPurchase" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Disclosure" minOccurs="0"/>
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
 *         &lt;element name="Endorsement" maxOccurs="unbounded" minOccurs="0">
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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Penalties" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Commission" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Combinality" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}IncentiveData" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Diagnostics" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Attributes" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}MediaReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SrvcItemAttributesGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceItemCoreType", propOrder = {
    "serviceID",
    "forInfo",
    "description",
    "descriptionVariable",
    "descriptionDetails",
    "bundleContent",
    "amount",
    "redemptionAmount",
    "servicePrice",
    "serviceLocation",
    "ticketByDate",
    "bookByDate",
    "serviceDate",
    "validatingCarrier",
    "instantPurchase",
    "disclosure",
    "bookingInstructions",
    "endorsement",
    "penalties",
    "commission",
    "combinality",
    "incentiveData",
    "diagnostics",
    "attributes",
    "mediaReference"
})
@XmlSeeAlso({
    ServiceItemRefType.class
})
public class ServiceItemCoreType {

    @XmlElement(name = "ServiceID")
    protected ServiceID serviceID;
    @XmlElement(name = "ForInfo")
    protected ServiceProcessInfoType forInfo;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "DescriptionVariable")
    protected SrvcDesVariableType descriptionVariable;
    @XmlElement(name = "DescriptionDetails")
    protected DescriptionDetails descriptionDetails;
    @XmlElement(name = "BundleContent")
    protected ServiceBundleNoPriceRefType bundleContent;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "RedemptionAmount")
    protected String redemptionAmount;
    @XmlElement(name = "ServicePrice")
    protected ServicePrice servicePrice;
    @XmlElement(name = "ServiceLocation")
    protected String serviceLocation;
    @XmlElement(name = "TicketByDate")
    protected DateTimeType ticketByDate;
    @XmlElement(name = "BookByDate")
    protected DateTimeType bookByDate;
    @XmlElement(name = "ServiceDate")
    protected DateTimeType serviceDate;
    @XmlElement(name = "ValidatingCarrier")
    protected String validatingCarrier;
    @XmlElement(name = "InstantPurchase")
    protected String instantPurchase;
    @XmlElement(name = "Disclosure")
    protected String disclosure;
    @XmlElement(name = "BookingInstructions")
    protected ServiceItemCoreType.BookingInstructions bookingInstructions;
    @XmlElement(name = "Endorsement")
    protected List<ServiceItemCoreType.Endorsement> endorsement;
    @XmlElement(name = "Penalties")
    protected ServicePenaltyType penalties;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "Combinality")
    protected ServiceCombineType combinality;
    @XmlElement(name = "IncentiveData")
    protected ServiceIncentiveDataType incentiveData;
    @XmlElement(name = "Diagnostics")
    protected DiagnosticsType diagnostics;
    @XmlElement(name = "Attributes")
    protected AttributesType attributes;
    @XmlElement(name = "MediaReference")
    protected MediaReferenceType mediaReference;
    @XmlAttribute(name = "CanUnbundle")
    protected String canUnbundle;
    @XmlAttribute(name = "FQTVCarrier")
    protected String fqtvCarrier;
    @XmlAttribute(name = "FQTVNumber")
    protected String fqtvNumber;
    @XmlAttribute(name = "FQTVStatus")
    protected String fqtvStatus;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "TypeValue")
    protected String typeValue;
    @XmlAttribute(name = "Airline")
    protected String airline;
    @XmlAttribute(name = "FareBrand")
    protected String fareBrand;
    @XmlAttribute(name = "DealID")
    protected String dealID;
    @XmlAttribute(name = "ProviderIDRef")
    protected String providerIDRef;
    @XmlAttribute(name = "NotValidBefore")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notValidBefore;
    @XmlAttribute(name = "NotValidAfter")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notValidAfter;
    @XmlAttribute(name = "ServiceType")
    protected String serviceType;
    @XmlAttribute(name = "ServiceCode")
    protected String serviceCode;
    @XmlAttribute(name = "SubCode")
    protected String subCode;
    @XmlAttribute(name = "ApplyToAll")
    protected String applyToAll;
    @XmlAttribute(name = "MaxQuantity")
    protected Integer maxQuantity;
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAttribute(name = "Icon")
    protected String icon;
    @XmlAttribute(name = "Bundle")
    protected String bundle;
    @XmlAttribute(name = "Method", required = true)
    protected String method;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "ReasonCode")
    protected String reasonCode;
    @XmlAttribute(name = "DisplayPriority")
    protected SrvcDisplayPriorityType displayPriority;
    @XmlAttribute(name = "CanDeselect")
    protected String canDeselect;

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
     * 获取forInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceProcessInfoType }
     *     
     */
    public ServiceProcessInfoType getForInfo() {
        return forInfo;
    }

    /**
     * 设置forInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProcessInfoType }
     *     
     */
    public void setForInfo(ServiceProcessInfoType value) {
        this.forInfo = value;
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
     *     {@link DescriptionDetails }
     *     
     */
    public DescriptionDetails getDescriptionDetails() {
        return descriptionDetails;
    }

    /**
     * 设置descriptionDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionDetails }
     *     
     */
    public void setDescriptionDetails(DescriptionDetails value) {
        this.descriptionDetails = value;
    }

    /**
     * 获取bundleContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceBundleNoPriceRefType }
     *     
     */
    public ServiceBundleNoPriceRefType getBundleContent() {
        return bundleContent;
    }

    /**
     * 设置bundleContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBundleNoPriceRefType }
     *     
     */
    public void setBundleContent(ServiceBundleNoPriceRefType value) {
        this.bundleContent = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * 获取redemptionAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionAmount() {
        return redemptionAmount;
    }

    /**
     * 设置redemptionAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionAmount(String value) {
        this.redemptionAmount = value;
    }

    /**
     * 获取servicePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServicePrice }
     *     
     */
    public ServicePrice getServicePrice() {
        return servicePrice;
    }

    /**
     * 设置servicePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePrice }
     *     
     */
    public void setServicePrice(ServicePrice value) {
        this.servicePrice = value;
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
     * 获取ticketByDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getTicketByDate() {
        return ticketByDate;
    }

    /**
     * 设置ticketByDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setTicketByDate(DateTimeType value) {
        this.ticketByDate = value;
    }

    /**
     * 获取bookByDate属性的值。
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
     * 获取instantPurchase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstantPurchase() {
        return instantPurchase;
    }

    /**
     * 设置instantPurchase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstantPurchase(String value) {
        this.instantPurchase = value;
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
     *     {@link ServiceItemCoreType.BookingInstructions }
     *     
     */
    public ServiceItemCoreType.BookingInstructions getBookingInstructions() {
        return bookingInstructions;
    }

    /**
     * 设置bookingInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceItemCoreType.BookingInstructions }
     *     
     */
    public void setBookingInstructions(ServiceItemCoreType.BookingInstructions value) {
        this.bookingInstructions = value;
    }

    /**
     * Gets the value of the endorsement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceItemCoreType.Endorsement }
     * 
     * 
     */
    public List<ServiceItemCoreType.Endorsement> getEndorsement() {
        if (endorsement == null) {
            endorsement = new ArrayList<ServiceItemCoreType.Endorsement>();
        }
        return this.endorsement;
    }

    /**
     * 获取penalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServicePenaltyType }
     *     
     */
    public ServicePenaltyType getPenalties() {
        return penalties;
    }

    /**
     * 设置penalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePenaltyType }
     *     
     */
    public void setPenalties(ServicePenaltyType value) {
        this.penalties = value;
    }

    /**
     * 获取commission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * 设置commission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * 获取combinality属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceCombineType }
     *     
     */
    public ServiceCombineType getCombinality() {
        return combinality;
    }

    /**
     * 设置combinality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCombineType }
     *     
     */
    public void setCombinality(ServiceCombineType value) {
        this.combinality = value;
    }

    /**
     * 获取incentiveData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceIncentiveDataType }
     *     
     */
    public ServiceIncentiveDataType getIncentiveData() {
        return incentiveData;
    }

    /**
     * 设置incentiveData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIncentiveDataType }
     *     
     */
    public void setIncentiveData(ServiceIncentiveDataType value) {
        this.incentiveData = value;
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
     * 获取attributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AttributesType }
     *     
     */
    public AttributesType getAttributes() {
        return attributes;
    }

    /**
     * 设置attributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType }
     *     
     */
    public void setAttributes(AttributesType value) {
        this.attributes = value;
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
     * 获取canUnbundle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanUnbundle() {
        return canUnbundle;
    }

    /**
     * 设置canUnbundle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanUnbundle(String value) {
        this.canUnbundle = value;
    }

    /**
     * 获取fqtvCarrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFQTVCarrier() {
        return fqtvCarrier;
    }

    /**
     * 设置fqtvCarrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFQTVCarrier(String value) {
        this.fqtvCarrier = value;
    }

    /**
     * 获取fqtvNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFQTVNumber() {
        return fqtvNumber;
    }

    /**
     * 设置fqtvNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFQTVNumber(String value) {
        this.fqtvNumber = value;
    }

    /**
     * 获取fqtvStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFQTVStatus() {
        return fqtvStatus;
    }

    /**
     * 设置fqtvStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFQTVStatus(String value) {
        this.fqtvStatus = value;
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
     * 获取typeValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeValue() {
        return typeValue;
    }

    /**
     * 设置typeValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeValue(String value) {
        this.typeValue = value;
    }

    /**
     * 获取airline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirline() {
        return airline;
    }

    /**
     * 设置airline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirline(String value) {
        this.airline = value;
    }

    /**
     * 获取fareBrand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBrand() {
        return fareBrand;
    }

    /**
     * 设置fareBrand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBrand(String value) {
        this.fareBrand = value;
    }

    /**
     * 获取dealID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealID() {
        return dealID;
    }

    /**
     * 设置dealID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealID(String value) {
        this.dealID = value;
    }

    /**
     * 获取providerIDRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderIDRef() {
        return providerIDRef;
    }

    /**
     * 设置providerIDRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderIDRef(String value) {
        this.providerIDRef = value;
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
     * 获取applyToAll属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyToAll() {
        return applyToAll;
    }

    /**
     * 设置applyToAll属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyToAll(String value) {
        this.applyToAll = value;
    }

    /**
     * 获取maxQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    /**
     * 设置maxQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxQuantity(Integer value) {
        this.maxQuantity = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
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
     * 获取bundle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundle() {
        return bundle;
    }

    /**
     * 设置bundle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundle(String value) {
        this.bundle = value;
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
     * 获取displayPriority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SrvcDisplayPriorityType }
     *     
     */
    public SrvcDisplayPriorityType getDisplayPriority() {
        return displayPriority;
    }

    /**
     * 设置displayPriority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SrvcDisplayPriorityType }
     *     
     */
    public void setDisplayPriority(SrvcDisplayPriorityType value) {
        this.displayPriority = value;
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
        protected ServiceItemCoreType.BookingInstructions.UpgradeMethod upgradeMethod;
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
         *     {@link ServiceItemCoreType.BookingInstructions.UpgradeMethod }
         *     
         */
        public ServiceItemCoreType.BookingInstructions.UpgradeMethod getUpgradeMethod() {
            return upgradeMethod;
        }

        /**
         * 设置upgradeMethod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceItemCoreType.BookingInstructions.UpgradeMethod }
         *     
         */
        public void setUpgradeMethod(ServiceItemCoreType.BookingInstructions.UpgradeMethod value) {
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
    public static class Endorsement {

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
