//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
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
 * <p>AirAncillariesServiceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirAncillariesServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Info" maxOccurs="0" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ForInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SegmentIDRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TravelerIDRef" maxOccurs="unbounded"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}DescriptionVariable" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}DescriptionDetails" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RedemptionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServicePrice" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrier" minOccurs="0"/>
 *         &lt;element name="MSCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Baggage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MaxWeight" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MinWeight" type="{http://www.opentravel.org/OTA/2003/05}BaggageWeightType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="MaxDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="MinDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Piece" type="{http://www.opentravel.org/OTA/2003/05}BaggagePieceType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Diagnostics" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Attributes" minOccurs="0"/>
 *         &lt;element name="S5" type="{http://www.opentravel.org/OTA/2003/05}S5Type" minOccurs="0"/>
 *         &lt;element name="S7" type="{http://www.opentravel.org/OTA/2003/05}S7Type" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}MediaReference" minOccurs="0"/>
 *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
 *         &lt;element name="ExchangeRate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Prices" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductPricesType" minOccurs="0"/>
 *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyDetailsPricingType" minOccurs="0"/>
 *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TSAncillaryProductGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SrvcItemAttributesGroup"/>
 *       &lt;attribute name="ProductAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirAncillariesServiceType", propOrder = {
    "serviceID",
    "forInfo",
    "segmentIDRef",
    "travelerIDRef",
    "description",
    "descriptionVariable",
    "descriptionDetails",
    "amount",
    "redemptionAmount",
    "servicePrice",
    "serviceLocation",
    "serviceDate",
    "validatingCarrier",
    "msCarrier",
    "disclosure",
    "bookingInstructions",
    "baggage",
    "diagnostics",
    "attributes",
    "s5",
    "s7",
    "mediaReference",
    "priceAdjustments",
    "totalAmount",
    "exchangeRate",
    "prices",
    "loyalty",
    "ticketing"
})
public class AirAncillariesServiceType {

    @XmlElement(name = "ServiceID")
    protected ServiceID serviceID;
    @XmlElement(name = "ForInfo")
    protected ServiceProcessInfoType forInfo;
    @XmlElement(name = "SegmentIDRef")
    protected List<SegmentIDRefType> segmentIDRef;
    @XmlElement(name = "TravelerIDRef", required = true)
    protected List<TravelerIDRefType> travelerIDRef;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "DescriptionVariable")
    protected SrvcDesVariableType descriptionVariable;
    @XmlElement(name = "DescriptionDetails")
    protected DescriptionDetails descriptionDetails;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "RedemptionAmount")
    protected String redemptionAmount;
    @XmlElement(name = "ServicePrice")
    protected ServicePrice servicePrice;
    @XmlElement(name = "ServiceLocation")
    protected String serviceLocation;
    @XmlElement(name = "ServiceDate")
    protected DateTimeType serviceDate;
    @XmlElement(name = "ValidatingCarrier")
    protected String validatingCarrier;
    @XmlElement(name = "MSCarrier")
    protected String msCarrier;
    @XmlElement(name = "Disclosure")
    protected String disclosure;
    @XmlElement(name = "BookingInstructions")
    protected AirAncillariesServiceType.BookingInstructions bookingInstructions;
    @XmlElement(name = "Baggage")
    protected AirAncillariesServiceType.Baggage baggage;
    @XmlElement(name = "Diagnostics")
    protected DiagnosticsType diagnostics;
    @XmlElement(name = "Attributes")
    protected AttributesType attributes;
    @XmlElement(name = "S5")
    protected S5Type s5;
    @XmlElement(name = "S7")
    protected S7Type s7;
    @XmlElement(name = "MediaReference")
    protected MediaReferenceType mediaReference;
    @XmlElement(name = "PriceAdjustments")
    protected ExPriceAdjustmentsType priceAdjustments;
    @XmlElement(name = "TotalAmount", required = true)
    protected TotalType totalAmount;
    @XmlElement(name = "ExchangeRate")
    protected List<AirAncillariesServiceType.ExchangeRate> exchangeRate;
    @XmlElement(name = "Prices")
    protected AirAncillaryProductPricesType prices;
    @XmlElement(name = "Loyalty")
    protected LoyaltyDetailsPricingType loyalty;
    @XmlElement(name = "Ticketing")
    protected TicketingInfoType ticketing;
    @XmlAttribute(name = "ProductAvailability")
    protected Boolean productAvailability;
    @XmlAttribute(name = "Category")
    @XmlSchemaType(name = "anySimpleType")
    protected String category;
    @XmlAttribute(name = "BookingChannel")
    protected String bookingChannel;
    @XmlAttribute(name = "Cancelable")
    protected Boolean cancelable;
    @XmlAttribute(name = "isSegBind")
    protected Boolean isSegBind;
    @XmlAttribute(name = "Refundable")
    protected Boolean refundable;
    @XmlAttribute(name = "Icon")
    protected String icon;
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAttribute(name = "CanDeselect")
    protected String canDeselect;
    @XmlAttribute(name = "ReasonCode")
    protected String reasonCode;
    @XmlAttribute(name = "FQTVNumber")
    protected String fqtvNumber;
    @XmlAttribute(name = "FQTVStatus")
    protected String fqtvStatus;
    @XmlAttribute(name = "FQTVCarrier")
    protected String fqtvCarrier;
    @XmlAttribute(name = "ServiceType")
    protected String serviceType;
    @XmlAttribute(name = "ServiceCode")
    protected String serviceCode;
    @XmlAttribute(name = "SubCode")
    protected String subCode;
    @XmlAttribute(name = "Method", required = true)
    protected String method;
    @XmlAttribute(name = "MaxQuantity")
    protected Integer maxQuantity;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "ApplyToAll")
    protected String applyToAll;
    @XmlAttribute(name = "Bundle")
    protected String bundle;
    @XmlAttribute(name = "CanUnbundle")
    protected String canUnbundle;
    @XmlAttribute(name = "DisplayPriority")
    protected SrvcDisplayPriorityType displayPriority;
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
     * Gets the value of the segmentIDRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentIDRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentIDRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentIDRefType }
     * 
     * 
     */
    public List<SegmentIDRefType> getSegmentIDRef() {
        if (segmentIDRef == null) {
            segmentIDRef = new ArrayList<SegmentIDRefType>();
        }
        return this.segmentIDRef;
    }

    /**
     * Gets the value of the travelerIDRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerIDRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerIDRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerIDRefType }
     * 
     * 
     */
    public List<TravelerIDRefType> getTravelerIDRef() {
        if (travelerIDRef == null) {
            travelerIDRef = new ArrayList<TravelerIDRefType>();
        }
        return this.travelerIDRef;
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
     * 获取msCarrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSCarrier() {
        return msCarrier;
    }

    /**
     * 设置msCarrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSCarrier(String value) {
        this.msCarrier = value;
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
     *     {@link AirAncillariesServiceType.BookingInstructions }
     *     
     */
    public AirAncillariesServiceType.BookingInstructions getBookingInstructions() {
        return bookingInstructions;
    }

    /**
     * 设置bookingInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillariesServiceType.BookingInstructions }
     *     
     */
    public void setBookingInstructions(AirAncillariesServiceType.BookingInstructions value) {
        this.bookingInstructions = value;
    }

    /**
     * 获取baggage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillariesServiceType.Baggage }
     *     
     */
    public AirAncillariesServiceType.Baggage getBaggage() {
        return baggage;
    }

    /**
     * 设置baggage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillariesServiceType.Baggage }
     *     
     */
    public void setBaggage(AirAncillariesServiceType.Baggage value) {
        this.baggage = value;
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
     * 获取s5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link S5Type }
     *     
     */
    public S5Type getS5() {
        return s5;
    }

    /**
     * 设置s5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link S5Type }
     *     
     */
    public void setS5(S5Type value) {
        this.s5 = value;
    }

    /**
     * 获取s7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link S7Type }
     *     
     */
    public S7Type getS7() {
        return s7;
    }

    /**
     * 设置s7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link S7Type }
     *     
     */
    public void setS7(S7Type value) {
        this.s7 = value;
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
     * 获取totalAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置totalAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setTotalAmount(TotalType value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirAncillariesServiceType.ExchangeRate }
     * 
     * 
     */
    public List<AirAncillariesServiceType.ExchangeRate> getExchangeRate() {
        if (exchangeRate == null) {
            exchangeRate = new ArrayList<AirAncillariesServiceType.ExchangeRate>();
        }
        return this.exchangeRate;
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
     * 获取loyalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyDetailsPricingType }
     *     
     */
    public LoyaltyDetailsPricingType getLoyalty() {
        return loyalty;
    }

    /**
     * 设置loyalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyDetailsPricingType }
     *     
     */
    public void setLoyalty(LoyaltyDetailsPricingType value) {
        this.loyalty = value;
    }

    /**
     * 获取ticketing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TicketingInfoType }
     *     
     */
    public TicketingInfoType getTicketing() {
        return ticketing;
    }

    /**
     * 设置ticketing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingInfoType }
     *     
     */
    public void setTicketing(TicketingInfoType value) {
        this.ticketing = value;
    }

    /**
     * 获取productAvailability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductAvailability() {
        return productAvailability;
    }

    /**
     * 设置productAvailability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductAvailability(Boolean value) {
        this.productAvailability = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * 获取bookingChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingChannel() {
        return bookingChannel;
    }

    /**
     * 设置bookingChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingChannel(String value) {
        this.bookingChannel = value;
    }

    /**
     * 获取cancelable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelable() {
        return cancelable;
    }

    /**
     * 设置cancelable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelable(Boolean value) {
        this.cancelable = value;
    }

    /**
     * 获取isSegBind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSegBind() {
        return isSegBind;
    }

    /**
     * 设置isSegBind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSegBind(Boolean value) {
        this.isSegBind = value;
    }

    /**
     * 获取refundable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundable() {
        return refundable;
    }

    /**
     * 设置refundable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundable(Boolean value) {
        this.refundable = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MaxWeight" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MinWeight" type="{http://www.opentravel.org/OTA/2003/05}BaggageWeightType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="MaxDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="MinDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Piece" type="{http://www.opentravel.org/OTA/2003/05}BaggagePieceType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
        "maxWeight",
        "minWeight",
        "maxDimensions",
        "minDimensions",
        "piece",
        "excessFirst",
        "excessLast"
    })
    public static class Baggage {

        @XmlElement(name = "MaxWeight")
        protected List<AirAncillariesServiceType.Baggage.MaxWeight> maxWeight;
        @XmlElement(name = "MinWeight")
        protected List<BaggageWeightType> minWeight;
        @XmlElement(name = "MaxDimensions")
        protected List<SPNRBaggageDimensionsType> maxDimensions;
        @XmlElement(name = "MinDimensions")
        protected List<SPNRBaggageDimensionsType> minDimensions;
        @XmlElement(name = "Piece")
        protected List<BaggagePieceType> piece;
        @XmlElement(name = "ExcessFirst")
        protected BigInteger excessFirst;
        @XmlElement(name = "ExcessLast")
        protected BigInteger excessLast;

        /**
         * Gets the value of the maxWeight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the maxWeight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMaxWeight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirAncillariesServiceType.Baggage.MaxWeight }
         * 
         * 
         */
        public List<AirAncillariesServiceType.Baggage.MaxWeight> getMaxWeight() {
            if (maxWeight == null) {
                maxWeight = new ArrayList<AirAncillariesServiceType.Baggage.MaxWeight>();
            }
            return this.maxWeight;
        }

        /**
         * Gets the value of the minWeight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the minWeight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMinWeight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaggageWeightType }
         * 
         * 
         */
        public List<BaggageWeightType> getMinWeight() {
            if (minWeight == null) {
                minWeight = new ArrayList<BaggageWeightType>();
            }
            return this.minWeight;
        }

        /**
         * Gets the value of the maxDimensions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the maxDimensions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMaxDimensions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SPNRBaggageDimensionsType }
         * 
         * 
         */
        public List<SPNRBaggageDimensionsType> getMaxDimensions() {
            if (maxDimensions == null) {
                maxDimensions = new ArrayList<SPNRBaggageDimensionsType>();
            }
            return this.maxDimensions;
        }

        /**
         * Gets the value of the minDimensions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the minDimensions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMinDimensions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SPNRBaggageDimensionsType }
         * 
         * 
         */
        public List<SPNRBaggageDimensionsType> getMinDimensions() {
            if (minDimensions == null) {
                minDimensions = new ArrayList<SPNRBaggageDimensionsType>();
            }
            return this.minDimensions;
        }

        /**
         * Gets the value of the piece property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the piece property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPiece().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaggagePieceType }
         * 
         * 
         */
        public List<BaggagePieceType> getPiece() {
            if (piece == null) {
                piece = new ArrayList<BaggagePieceType>();
            }
            return this.piece;
        }

        /**
         * 获取excessFirst属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExcessFirst() {
            return excessFirst;
        }

        /**
         * 设置excessFirst属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExcessFirst(BigInteger value) {
            this.excessFirst = value;
        }

        /**
         * 获取excessLast属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExcessLast() {
            return excessLast;
        }

        /**
         * 设置excessLast属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExcessLast(BigInteger value) {
            this.excessLast = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
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
        public static class MaxWeight {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "Unit", required = true)
            protected WeightUnitType unit;

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * 获取unit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link WeightUnitType }
             *     
             */
            public WeightUnitType getUnit() {
                return unit;
            }

            /**
             * 设置unit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link WeightUnitType }
             *     
             */
            public void setUnit(WeightUnitType value) {
                this.unit = value;
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
        "equipment"
    })
    public static class BookingInstructions {

        @XmlElement(name = "SSRCode")
        protected List<String> ssrCode;
        @XmlElement(name = "OSIText")
        protected List<String> osiText;
        @XmlElement(name = "Method")
        protected String method;
        @XmlElement(name = "UpgradeMethod")
        protected AirAncillariesServiceType.BookingInstructions.UpgradeMethod upgradeMethod;
        @XmlElement(name = "Text")
        protected List<String> text;
        @XmlElement(name = "Equipment")
        protected EquipmentDetailType equipment;

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
         *     {@link AirAncillariesServiceType.BookingInstructions.UpgradeMethod }
         *     
         */
        public AirAncillariesServiceType.BookingInstructions.UpgradeMethod getUpgradeMethod() {
            return upgradeMethod;
        }

        /**
         * 设置upgradeMethod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirAncillariesServiceType.BookingInstructions.UpgradeMethod }
         *     
         */
        public void setUpgradeMethod(AirAncillariesServiceType.BookingInstructions.UpgradeMethod value) {
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExchangeRate {

        @XmlAttribute(name = "FromCurrency")
        protected String fromCurrency;
        @XmlAttribute(name = "ToCurrency")
        protected String toCurrency;
        @XmlAttribute(name = "Rate")
        protected BigDecimal rate;
        @XmlAttribute(name = "Date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "CompanyID")
        protected String companyID;
        @XmlAttribute(name = "RateID")
        protected String rateID;

        /**
         * 获取fromCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromCurrency() {
            return fromCurrency;
        }

        /**
         * 设置fromCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromCurrency(String value) {
            this.fromCurrency = value;
        }

        /**
         * 获取toCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToCurrency() {
            return toCurrency;
        }

        /**
         * 设置toCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToCurrency(String value) {
            this.toCurrency = value;
        }

        /**
         * 获取rate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRate() {
            return rate;
        }

        /**
         * 设置rate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRate(BigDecimal value) {
            this.rate = value;
        }

        /**
         * 获取date属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * 设置date属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * 获取companyID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyID() {
            return companyID;
        }

        /**
         * 设置companyID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyID(String value) {
            this.companyID = value;
        }

        /**
         * 获取rateID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateID() {
            return rateID;
        }

        /**
         * 设置rateID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateID(String value) {
            this.rateID = value;
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
     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "text",
        "code"
    })
    public static class Info {

        @XmlElement(name = "Text", required = true)
        protected List<String> text;
        @XmlElement(name = "Code", required = true)
        protected String code;

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
