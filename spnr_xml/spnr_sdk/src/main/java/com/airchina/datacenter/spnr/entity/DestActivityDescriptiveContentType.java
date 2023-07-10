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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The DestActivityDescriptiveContentType class that describes  information about the Destination Activityl.
 * 
 * <p>DestActivityDescriptiveContentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DestActivityDescriptiveContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Addresses" type="{http://www.opentravel.org/OTA/2003/05}AddressesType"/>
 *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ContactInfosType" minOccurs="0"/>
 *         &lt;element name="Positions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Position" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PositionGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptions" minOccurs="0"/>
 *         &lt;element name="Categories" type="{http://www.opentravel.org/OTA/2003/05}EventCategoriesType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}PTCs" minOccurs="0"/>
 *         &lt;element name="BaggageAllowance" type="{http://www.opentravel.org/OTA/2003/05}CoreBagAllowanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Amenities" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
 *         &lt;element name="MultimediaObjects" type="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectsType" minOccurs="0"/>
 *         &lt;element name="RelativePositions" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionsType" minOccurs="0"/>
 *         &lt;element name="CombinationAllowed" type="{http://www.opentravel.org/OTA/2003/05}combinationAllowedType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AvailabilityAllRates" minOccurs="0"/>
 *         &lt;element name="Extras" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Extra" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Text" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="OriginalCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="OriginalPrice" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Prepaid" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketCategories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TicketCategory" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Text" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SupplierSpecificInfos" type="{http://www.opentravel.org/OTA/2003/05}SupplierSpecificInfosType" minOccurs="0"/>
 *         &lt;element name="Notifications" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Notification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentModel" type="{http://www.opentravel.org/OTA/2003/05}PaymentModel" minOccurs="0"/>
 *         &lt;element name="BiasingInfos" type="{http://www.opentravel.org/OTA/2003/05}BiasingInfos" minOccurs="0"/>
 *         &lt;element name="AssociatedProducts" type="{http://www.opentravel.org/OTA/2003/05}AssociatedProductsType" minOccurs="0"/>
 *         &lt;element name="Policies" type="{http://www.opentravel.org/OTA/2003/05}PoliciesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DestActivityReferenceGroup"/>
 *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MaxNumEvents" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DurationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LocationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WaitForApproval" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="OriginalCurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="isInventoryPerPTCType" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isTaxIncluded" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="itemType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Action" default="save">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="save"/>
 *             &lt;enumeration value="delete"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SupplierEventCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="isPricePerPerson" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SupplierExternal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ReferenceCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" default="standard" />
 *       &lt;attribute name="PhysicalEventCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Venue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BookingOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Deleted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="InventoryAction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hasHotels" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="exclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestActivityDescriptiveContentType", propOrder = {
    "addresses",
    "contactInfos",
    "positions",
    "destActivityDescriptions",
    "categories",
    "ptCs",
    "baggageAllowance",
    "amenities",
    "taxes",
    "multimediaObjects",
    "relativePositions",
    "combinationAllowed",
    "availabilityAllRates",
    "extras",
    "ticketCategories",
    "supplierSpecificInfos",
    "notifications",
    "paymentModel",
    "biasingInfos",
    "associatedProducts",
    "policies"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.SearchResponse.Package.Extras.Extra.DestActivityDescriptiveContent.class,
    com.airchina.datacenter.spnr.entity.SearchResponse.DestActivityDescriptiveContents.DestActivityDescriptiveContent.class,
    com.airchina.datacenter.spnr.entity.DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.class
})
public class DestActivityDescriptiveContentType {

    @XmlElement(name = "Addresses", required = true)
    protected AddressesType addresses;
    @XmlElement(name = "ContactInfos")
    protected ContactInfosType contactInfos;
    @XmlElement(name = "Positions")
    protected DestActivityDescriptiveContentType.Positions positions;
    @XmlElement(name = "DestActivityDescriptions")
    protected DestActivityDescriptions destActivityDescriptions;
    @XmlElement(name = "Categories")
    protected EventCategoriesType categories;
    @XmlElement(name = "PTCs")
    protected PTCsFromDestActivityCommonTypes ptCs;
    @XmlElement(name = "BaggageAllowance")
    protected List<CoreBagAllowanceType> baggageAllowance;
    @XmlElement(name = "Amenities")
    protected Amenities amenities;
    @XmlElement(name = "Taxes")
    protected TaxesType taxes;
    @XmlElement(name = "MultimediaObjects")
    protected MultimediaObjectsType multimediaObjects;
    @XmlElement(name = "RelativePositions")
    protected RelativePositionsType relativePositions;
    @XmlElement(name = "CombinationAllowed")
    protected List<CombinationAllowedType> combinationAllowed;
    @XmlElement(name = "AvailabilityAllRates")
    protected AvailabilityAllRates availabilityAllRates;
    @XmlElement(name = "Extras")
    protected DestActivityDescriptiveContentType.Extras extras;
    @XmlElement(name = "TicketCategories")
    protected DestActivityDescriptiveContentType.TicketCategories ticketCategories;
    @XmlElement(name = "SupplierSpecificInfos")
    protected SupplierSpecificInfosType supplierSpecificInfos;
    @XmlElement(name = "Notifications")
    protected DestActivityDescriptiveContentType.Notifications notifications;
    @XmlElement(name = "PaymentModel")
    protected PaymentModel paymentModel;
    @XmlElement(name = "BiasingInfos")
    protected BiasingInfos biasingInfos;
    @XmlElement(name = "AssociatedProducts")
    protected AssociatedProductsType associatedProducts;
    @XmlElement(name = "Policies")
    protected PoliciesType policies;
    @XmlAttribute(name = "Reference")
    @XmlSchemaType(name = "anySimpleType")
    protected String reference;
    @XmlAttribute(name = "MaxNumEvents")
    @XmlSchemaType(name = "anySimpleType")
    protected String maxNumEvents;
    @XmlAttribute(name = "Duration")
    @XmlSchemaType(name = "anySimpleType")
    protected String duration;
    @XmlAttribute(name = "DurationType")
    protected String durationType;
    @XmlAttribute(name = "LocationType")
    protected String locationType;
    @XmlAttribute(name = "WaitForApproval")
    protected Boolean waitForApproval;
    @XmlAttribute(name = "Enabled", required = true)
    protected boolean enabled;
    @XmlAttribute(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlAttribute(name = "OriginalCurrencyCode")
    protected String originalCurrencyCode;
    @XmlAttribute(name = "isInventoryPerPTCType", required = true)
    protected boolean isInventoryPerPTCType;
    @XmlAttribute(name = "isTaxIncluded", required = true)
    protected boolean isTaxIncluded;
    @XmlAttribute(name = "itemType", required = true)
    protected byte itemType;
    @XmlAttribute(name = "Action")
    protected String action;
    @XmlAttribute(name = "SupplierCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String supplierCode;
    @XmlAttribute(name = "SupplierEventCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String supplierEventCode;
    @XmlAttribute(name = "isPricePerPerson")
    @XmlSchemaType(name = "anySimpleType")
    protected String isPricePerPerson;
    @XmlAttribute(name = "ReasonCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String reasonCode;
    @XmlAttribute(name = "SupplierExternal")
    protected String supplierExternal;
    @XmlAttribute(name = "TimeZone")
    @XmlSchemaType(name = "anySimpleType")
    protected String timeZone;
    @XmlAttribute(name = "ReferenceCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String referenceCode;
    @XmlAttribute(name = "EventType")
    protected String eventType;
    @XmlAttribute(name = "PhysicalEventCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String physicalEventCode;
    @XmlAttribute(name = "Venue")
    @XmlSchemaType(name = "anySimpleType")
    protected String venue;
    @XmlAttribute(name = "BookingOfficeCode")
    protected String bookingOfficeCode;
    @XmlAttribute(name = "Deleted")
    protected Boolean deleted;
    @XmlAttribute(name = "InventoryAction")
    protected String inventoryAction;
    @XmlAttribute(name = "hasHotels")
    protected Boolean hasHotels;
    @XmlAttribute(name = "exclusive")
    protected Boolean exclusive;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "EventCodeContext")
    protected String eventCodeContext;
    @XmlAttribute(name = "EventCityCode")
    protected String eventCityCode;
    @XmlAttribute(name = "Exclusive")
    protected Boolean exclusiveAttr;

    /**
     * 获取addresses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressesType }
     *     
     */
    public AddressesType getAddresses() {
        return addresses;
    }

    /**
     * 设置addresses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressesType }
     *     
     */
    public void setAddresses(AddressesType value) {
        this.addresses = value;
    }

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

    /**
     * 获取positions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestActivityDescriptiveContentType.Positions }
     *     
     */
    public DestActivityDescriptiveContentType.Positions getPositions() {
        return positions;
    }

    /**
     * 设置positions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestActivityDescriptiveContentType.Positions }
     *     
     */
    public void setPositions(DestActivityDescriptiveContentType.Positions value) {
        this.positions = value;
    }

    /**
     * Provides activity description (text or URL)
     * 
     * @return
     *     possible object is
     *     {@link DestActivityDescriptions }
     *     
     */
    public DestActivityDescriptions getDestActivityDescriptions() {
        return destActivityDescriptions;
    }

    /**
     * 设置destActivityDescriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestActivityDescriptions }
     *     
     */
    public void setDestActivityDescriptions(DestActivityDescriptions value) {
        this.destActivityDescriptions = value;
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
     * Provides person types supported by the activity
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
     * Gets the value of the baggageAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoreBagAllowanceType }
     * 
     * 
     */
    public List<CoreBagAllowanceType> getBaggageAllowance() {
        if (baggageAllowance == null) {
            baggageAllowance = new ArrayList<CoreBagAllowanceType>();
        }
        return this.baggageAllowance;
    }

    /**
     * Collection of activity amenities. For example: Weelchair access,....
     * 
     * @return
     *     possible object is
     *     {@link Amenities }
     *     
     */
    public Amenities getAmenities() {
        return amenities;
    }

    /**
     * 设置amenities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Amenities }
     *     
     */
    public void setAmenities(Amenities value) {
        this.amenities = value;
    }

    /**
     * 获取taxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxesType }
     *     
     */
    public TaxesType getTaxes() {
        return taxes;
    }

    /**
     * 设置taxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesType }
     *     
     */
    public void setTaxes(TaxesType value) {
        this.taxes = value;
    }

    /**
     * 获取multimediaObjects属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MultimediaObjectsType }
     *     
     */
    public MultimediaObjectsType getMultimediaObjects() {
        return multimediaObjects;
    }

    /**
     * 设置multimediaObjects属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MultimediaObjectsType }
     *     
     */
    public void setMultimediaObjects(MultimediaObjectsType value) {
        this.multimediaObjects = value;
    }

    /**
     * 获取relativePositions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelativePositionsType }
     *     
     */
    public RelativePositionsType getRelativePositions() {
        return relativePositions;
    }

    /**
     * 设置relativePositions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelativePositionsType }
     *     
     */
    public void setRelativePositions(RelativePositionsType value) {
        this.relativePositions = value;
    }

    /**
     * Gets the value of the combinationAllowed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combinationAllowed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinationAllowed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CombinationAllowedType }
     * 
     * 
     */
    public List<CombinationAllowedType> getCombinationAllowed() {
        if (combinationAllowed == null) {
            combinationAllowed = new ArrayList<CombinationAllowedType>();
        }
        return this.combinationAllowed;
    }

    /**
     * Provides Availability, allocations and rates
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityAllRates }
     *     
     */
    public AvailabilityAllRates getAvailabilityAllRates() {
        return availabilityAllRates;
    }

    /**
     * 设置availabilityAllRates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityAllRates }
     *     
     */
    public void setAvailabilityAllRates(AvailabilityAllRates value) {
        this.availabilityAllRates = value;
    }

    /**
     * 获取extras属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestActivityDescriptiveContentType.Extras }
     *     
     */
    public DestActivityDescriptiveContentType.Extras getExtras() {
        return extras;
    }

    /**
     * 设置extras属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestActivityDescriptiveContentType.Extras }
     *     
     */
    public void setExtras(DestActivityDescriptiveContentType.Extras value) {
        this.extras = value;
    }

    /**
     * 获取ticketCategories属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestActivityDescriptiveContentType.TicketCategories }
     *     
     */
    public DestActivityDescriptiveContentType.TicketCategories getTicketCategories() {
        return ticketCategories;
    }

    /**
     * 设置ticketCategories属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestActivityDescriptiveContentType.TicketCategories }
     *     
     */
    public void setTicketCategories(DestActivityDescriptiveContentType.TicketCategories value) {
        this.ticketCategories = value;
    }

    /**
     * 获取supplierSpecificInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierSpecificInfosType }
     *     
     */
    public SupplierSpecificInfosType getSupplierSpecificInfos() {
        return supplierSpecificInfos;
    }

    /**
     * 设置supplierSpecificInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierSpecificInfosType }
     *     
     */
    public void setSupplierSpecificInfos(SupplierSpecificInfosType value) {
        this.supplierSpecificInfos = value;
    }

    /**
     * 获取notifications属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestActivityDescriptiveContentType.Notifications }
     *     
     */
    public DestActivityDescriptiveContentType.Notifications getNotifications() {
        return notifications;
    }

    /**
     * 设置notifications属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestActivityDescriptiveContentType.Notifications }
     *     
     */
    public void setNotifications(DestActivityDescriptiveContentType.Notifications value) {
        this.notifications = value;
    }

    /**
     * 获取paymentModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentModel }
     *     
     */
    public PaymentModel getPaymentModel() {
        return paymentModel;
    }

    /**
     * 设置paymentModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentModel }
     *     
     */
    public void setPaymentModel(PaymentModel value) {
        this.paymentModel = value;
    }

    /**
     * 获取biasingInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BiasingInfos }
     *     
     */
    public BiasingInfos getBiasingInfos() {
        return biasingInfos;
    }

    /**
     * 设置biasingInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BiasingInfos }
     *     
     */
    public void setBiasingInfos(BiasingInfos value) {
        this.biasingInfos = value;
    }

    /**
     * 获取associatedProducts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AssociatedProductsType }
     *     
     */
    public AssociatedProductsType getAssociatedProducts() {
        return associatedProducts;
    }

    /**
     * 设置associatedProducts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedProductsType }
     *     
     */
    public void setAssociatedProducts(AssociatedProductsType value) {
        this.associatedProducts = value;
    }

    /**
     * 获取policies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PoliciesType }
     *     
     */
    public PoliciesType getPolicies() {
        return policies;
    }

    /**
     * 设置policies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PoliciesType }
     *     
     */
    public void setPolicies(PoliciesType value) {
        this.policies = value;
    }

    /**
     * 获取reference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * 设置reference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * 获取maxNumEvents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNumEvents() {
        return maxNumEvents;
    }

    /**
     * 设置maxNumEvents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNumEvents(String value) {
        this.maxNumEvents = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * 获取durationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationType() {
        return durationType;
    }

    /**
     * 设置durationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationType(String value) {
        this.durationType = value;
    }

    /**
     * 获取locationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * 设置locationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * 获取waitForApproval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitForApproval() {
        return waitForApproval;
    }

    /**
     * 设置waitForApproval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitForApproval(Boolean value) {
        this.waitForApproval = value;
    }

    /**
     * 获取enabled属性的值。
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * 设置enabled属性的值。
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
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

    /**
     * 获取isInventoryPerPTCType属性的值。
     * 
     */
    public boolean isIsInventoryPerPTCType() {
        return isInventoryPerPTCType;
    }

    /**
     * 设置isInventoryPerPTCType属性的值。
     * 
     */
    public void setIsInventoryPerPTCType(boolean value) {
        this.isInventoryPerPTCType = value;
    }

    /**
     * 获取isTaxIncluded属性的值。
     * 
     */
    public boolean isIsTaxIncluded() {
        return isTaxIncluded;
    }

    /**
     * 设置isTaxIncluded属性的值。
     * 
     */
    public void setIsTaxIncluded(boolean value) {
        this.isTaxIncluded = value;
    }

    /**
     * 获取itemType属性的值。
     * 
     */
    public byte getItemType() {
        return itemType;
    }

    /**
     * 设置itemType属性的值。
     * 
     */
    public void setItemType(byte value) {
        this.itemType = value;
    }

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        if (action == null) {
            return "save";
        } else {
            return action;
        }
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
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
     * 获取supplierEventCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierEventCode() {
        return supplierEventCode;
    }

    /**
     * 设置supplierEventCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierEventCode(String value) {
        this.supplierEventCode = value;
    }

    /**
     * 获取isPricePerPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPricePerPerson() {
        return isPricePerPerson;
    }

    /**
     * 设置isPricePerPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPricePerPerson(String value) {
        this.isPricePerPerson = value;
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
     * 获取supplierExternal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierExternal() {
        return supplierExternal;
    }

    /**
     * 设置supplierExternal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierExternal(String value) {
        this.supplierExternal = value;
    }

    /**
     * 获取timeZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 设置timeZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * 获取referenceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceCode() {
        return referenceCode;
    }

    /**
     * 设置referenceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }

    /**
     * 获取eventType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        if (eventType == null) {
            return "standard";
        } else {
            return eventType;
        }
    }

    /**
     * 设置eventType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * 获取physicalEventCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalEventCode() {
        return physicalEventCode;
    }

    /**
     * 设置physicalEventCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalEventCode(String value) {
        this.physicalEventCode = value;
    }

    /**
     * 获取venue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenue() {
        return venue;
    }

    /**
     * 设置venue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenue(String value) {
        this.venue = value;
    }

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
     * 获取deleted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleted() {
        return deleted;
    }

    /**
     * 设置deleted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleted(Boolean value) {
        this.deleted = value;
    }

    /**
     * 获取inventoryAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryAction() {
        return inventoryAction;
    }

    /**
     * 设置inventoryAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryAction(String value) {
        this.inventoryAction = value;
    }

    /**
     * 获取hasHotels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasHotels() {
        return hasHotels;
    }

    /**
     * 设置hasHotels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasHotels(Boolean value) {
        this.hasHotels = value;
    }

    /**
     * 获取exclusive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclusive() {
        return exclusive;
    }

    /**
     * 设置exclusive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclusive(Boolean value) {
        this.exclusive = value;
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
     * 获取eventCodeContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCodeContext() {
        return eventCodeContext;
    }

    /**
     * 设置eventCodeContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCodeContext(String value) {
        this.eventCodeContext = value;
    }

    /**
     * 获取eventCityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCityCode() {
        return eventCityCode;
    }

    /**
     * 设置eventCityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCityCode(String value) {
        this.eventCityCode = value;
    }

    /**
     * 获取exclusiveAttr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclusiveAttr() {
        return exclusiveAttr;
    }

    /**
     * 设置exclusiveAttr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclusiveAttr(Boolean value) {
        this.exclusiveAttr = value;
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
     *         &lt;element name="Extra" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Text" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="OriginalCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="OriginalPrice" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Prepaid" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "extra"
    })
    public static class Extras {

        @XmlElement(name = "Extra", required = true)
        protected List<DestActivityDescriptiveContentType.Extras.Extra> extra;

        /**
         * Gets the value of the extra property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extra property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtra().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DestActivityDescriptiveContentType.Extras.Extra }
         * 
         * 
         */
        public List<DestActivityDescriptiveContentType.Extras.Extra> getExtra() {
            if (extra == null) {
                extra = new ArrayList<DestActivityDescriptiveContentType.Extras.Extra>();
            }
            return this.extra;
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
         *         &lt;element name="Description" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Text" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="OriginalCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="OriginalPrice" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Prepaid" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description"
        })
        public static class Extra {

            @XmlElement(name = "Description")
            protected DestActivityDescriptiveContentType.Extras.Extra.Description description;
            @XmlAttribute(name = "OriginalCurrencyCode")
            @XmlSchemaType(name = "anySimpleType")
            protected String originalCurrencyCode;
            @XmlAttribute(name = "OriginalPrice")
            @XmlSchemaType(name = "anySimpleType")
            protected String originalPrice;
            @XmlAttribute(name = "Selected")
            @XmlSchemaType(name = "anySimpleType")
            protected String selected;
            @XmlAttribute(name = "Prepaid")
            @XmlSchemaType(name = "anySimpleType")
            protected String prepaid;
            @XmlAttribute(name = "CurrencyCode")
            @XmlSchemaType(name = "anySimpleType")
            protected String currencyCode;
            @XmlAttribute(name = "Code", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String code;
            @XmlAttribute(name = "Name")
            @XmlSchemaType(name = "anySimpleType")
            protected String name;
            @XmlAttribute(name = "Start")
            @XmlSchemaType(name = "anySimpleType")
            protected String start;
            @XmlAttribute(name = "End")
            @XmlSchemaType(name = "anySimpleType")
            protected String end;
            @XmlAttribute(name = "Price")
            @XmlSchemaType(name = "anySimpleType")
            protected String price;

            /**
             * 获取description属性的值。
             * 
             * @return
             *     possible object is
             *     {@link DestActivityDescriptiveContentType.Extras.Extra.Description }
             *     
             */
            public DestActivityDescriptiveContentType.Extras.Extra.Description getDescription() {
                return description;
            }

            /**
             * 设置description属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link DestActivityDescriptiveContentType.Extras.Extra.Description }
             *     
             */
            public void setDescription(DestActivityDescriptiveContentType.Extras.Extra.Description value) {
                this.description = value;
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

            /**
             * 获取originalPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalPrice() {
                return originalPrice;
            }

            /**
             * 设置originalPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalPrice(String value) {
                this.originalPrice = value;
            }

            /**
             * 获取selected属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelected() {
                return selected;
            }

            /**
             * 设置selected属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelected(String value) {
                this.selected = value;
            }

            /**
             * 获取prepaid属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrepaid() {
                return prepaid;
            }

            /**
             * 设置prepaid属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrepaid(String value) {
                this.prepaid = value;
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
             * 获取start属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * 设置start属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * 获取end属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * 设置end属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
            }

            /**
             * 获取price属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrice() {
                return price;
            }

            /**
             * 设置price属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrice(String value) {
                this.price = value;
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
             *         &lt;element name="Text" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "text"
            })
            public static class Description {

                @XmlElement(name = "Text")
                protected List<DestActivityDescriptiveContentType.Extras.Extra.Description.Text> text;

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
                 * {@link DestActivityDescriptiveContentType.Extras.Extra.Description.Text }
                 * 
                 * 
                 */
                public List<DestActivityDescriptiveContentType.Extras.Extra.Description.Text> getText() {
                    if (text == null) {
                        text = new ArrayList<DestActivityDescriptiveContentType.Extras.Extra.Description.Text>();
                    }
                    return this.text;
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
                 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                public static class Text {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Language")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String language;

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
                     * 获取language属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLanguage() {
                        return language;
                    }

                    /**
                     * 设置language属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLanguage(String value) {
                        this.language = value;
                    }

                }

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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Notification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "notification"
    })
    public static class Notifications {

        @XmlElement(name = "Notification")
        protected List<DestActivityDescriptiveContentType.Notifications.Notification> notification;

        /**
         * Gets the value of the notification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DestActivityDescriptiveContentType.Notifications.Notification }
         * 
         * 
         */
        public List<DestActivityDescriptiveContentType.Notifications.Notification> getNotification() {
            if (notification == null) {
                notification = new ArrayList<DestActivityDescriptiveContentType.Notifications.Notification>();
            }
            return this.notification;
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
         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Notification {

            @XmlAttribute(name = "Code", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String code;
            @XmlAttribute(name = "Frequency")
            @XmlSchemaType(name = "anySimpleType")
            protected String frequency;

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
             * 获取frequency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrequency() {
                return frequency;
            }

            /**
             * 设置frequency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrequency(String value) {
                this.frequency = value;
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
     *         &lt;element name="Position" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PositionGroup"/>
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
        "position"
    })
    public static class Positions {

        @XmlElement(name = "Position")
        protected List<DestActivityDescriptiveContentType.Positions.Position> position;

        /**
         * Gets the value of the position property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the position property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPosition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DestActivityDescriptiveContentType.Positions.Position }
         * 
         * 
         */
        public List<DestActivityDescriptiveContentType.Positions.Position> getPosition() {
            if (position == null) {
                position = new ArrayList<DestActivityDescriptiveContentType.Positions.Position>();
            }
            return this.position;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PositionGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Position {

            @XmlAttribute(name = "Latitude")
            protected String latitude;
            @XmlAttribute(name = "Longitude")
            protected String longitude;
            @XmlAttribute(name = "Altitude")
            protected String altitude;
            @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
            protected String altitudeUnitOfMeasureCode;

            /**
             * 获取latitude属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLatitude() {
                return latitude;
            }

            /**
             * 设置latitude属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLatitude(String value) {
                this.latitude = value;
            }

            /**
             * 获取longitude属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLongitude() {
                return longitude;
            }

            /**
             * 设置longitude属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLongitude(String value) {
                this.longitude = value;
            }

            /**
             * 获取altitude属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAltitude() {
                return altitude;
            }

            /**
             * 设置altitude属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAltitude(String value) {
                this.altitude = value;
            }

            /**
             * 获取altitudeUnitOfMeasureCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAltitudeUnitOfMeasureCode() {
                return altitudeUnitOfMeasureCode;
            }

            /**
             * 设置altitudeUnitOfMeasureCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAltitudeUnitOfMeasureCode(String value) {
                this.altitudeUnitOfMeasureCode = value;
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
     *         &lt;element name="TicketCategory" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Text" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "ticketCategory"
    })
    public static class TicketCategories {

        @XmlElement(name = "TicketCategory", required = true)
        protected List<DestActivityDescriptiveContentType.TicketCategories.TicketCategory> ticketCategory;

        /**
         * Gets the value of the ticketCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DestActivityDescriptiveContentType.TicketCategories.TicketCategory }
         * 
         * 
         */
        public List<DestActivityDescriptiveContentType.TicketCategories.TicketCategory> getTicketCategory() {
            if (ticketCategory == null) {
                ticketCategory = new ArrayList<DestActivityDescriptiveContentType.TicketCategories.TicketCategory>();
            }
            return this.ticketCategory;
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
         *         &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Text" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description"
        })
        public static class TicketCategory {

            @XmlElement(name = "Description")
            protected List<DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description> description;
            @XmlAttribute(name = "Code", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String code;

            /**
             * Gets the value of the description property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the description property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description }
             * 
             * 
             */
            public List<DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description> getDescription() {
                if (description == null) {
                    description = new ArrayList<DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description>();
                }
                return this.description;
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Text" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "text"
            })
            public static class Description {

                @XmlElement(name = "Text")
                protected List<DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description.Text> text;

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
                 * {@link DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description.Text }
                 * 
                 * 
                 */
                public List<DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description.Text> getText() {
                    if (text == null) {
                        text = new ArrayList<DestActivityDescriptiveContentType.TicketCategories.TicketCategory.Description.Text>();
                    }
                    return this.text;
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
                 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                public static class Text {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Language")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String language;

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
                     * 获取language属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLanguage() {
                        return language;
                    }

                    /**
                     * 设置language属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLanguage(String value) {
                        this.language = value;
                    }

                }

            }

        }

    }

}
