//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for promotions. Defines the criteria used to define a promotion
 * 
 * <p>PromotionProfileType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PromotionProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Channels" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Status"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Search"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Groups"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Tags"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SearchCriteria"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TripProfiles"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Content"/>
 *         &lt;element name="FromPrices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FromPrice">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Impression" type="{http://www.opentravel.org/OTA/2003/05}ImpressionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Status" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="enabled"/>
 *             &lt;enumeration value="disabled"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="AccessLevel">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14">
 *             &lt;enumeration value="public"/>
 *             &lt;enumeration value="private"/>
 *             &lt;enumeration value="all"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Product">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8">
 *             &lt;enumeration value="H"/>
 *             &lt;enumeration value="F"/>
 *             &lt;enumeration value="V"/>
 *             &lt;enumeration value="E"/>
 *             &lt;enumeration value="HF"/>
 *             &lt;enumeration value="HFV"/>
 *             &lt;enumeration value="HV"/>
 *             &lt;enumeration value="VF"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionProfileType", propOrder = {
    "channels",
    "status",
    "search",
    "groups",
    "tags",
    "searchCriteria",
    "tripProfiles",
    "content",
    "fromPrices",
    "impression"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.PromotionProfilesType.PromotionProfiles.class
})
public class PromotionProfileType {

    @XmlElement(name = "Channels")
    protected Channels channels;
    @XmlElement(name = "Status", required = true)
    protected StatusFromPromotionCommonTypes status;
    @XmlElement(name = "Search", required = true)
    protected Search search;
    @XmlElement(name = "Groups", required = true)
    protected Groups groups;
    @XmlElement(name = "Tags", required = true)
    protected Tags tags;
    @XmlElement(name = "SearchCriteria", required = true)
    protected SearchCriteria searchCriteria;
    @XmlElement(name = "TripProfiles", required = true)
    protected TripProfiles tripProfiles;
    @XmlElement(name = "Content", required = true)
    protected Content content;
    @XmlElement(name = "FromPrices")
    protected PromotionProfileType.FromPrices fromPrices;
    @XmlElement(name = "Impression")
    protected ImpressionType impression;
    @XmlAttribute(name = "Id", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "Status", required = true)
    protected String statusAttr;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "anySimpleType")
    protected String timeStamp;
    @XmlAttribute(name = "Priority")
    @XmlSchemaType(name = "unsignedInt")
    protected Long priority;
    @XmlAttribute(name = "AccessLevel")
    protected String accessLevel;
    @XmlAttribute(name = "Product")
    protected String product;
    @XmlAttribute(name = "Language")
    @XmlSchemaType(name = "anySimpleType")
    protected String language;

    /**
     * 获取channels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Channels }
     *     
     */
    public Channels getChannels() {
        return channels;
    }

    /**
     * 设置channels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Channels }
     *     
     */
    public void setChannels(Channels value) {
        this.channels = value;
    }

    /**
     * The status of xPromotion. eg. deleted
     * 
     * @return
     *     possible object is
     *     {@link StatusFromPromotionCommonTypes }
     *     
     */
    public StatusFromPromotionCommonTypes getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatusFromPromotionCommonTypes }
     *     
     */
    public void setStatus(StatusFromPromotionCommonTypes value) {
        this.status = value;
    }

    /**
     * 获取search属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Search }
     *     
     */
    public Search getSearch() {
        return search;
    }

    /**
     * 设置search属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Search }
     *     
     */
    public void setSearch(Search value) {
        this.search = value;
    }

    /**
     * 获取groups属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Groups }
     *     
     */
    public Groups getGroups() {
        return groups;
    }

    /**
     * 设置groups属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Groups }
     *     
     */
    public void setGroups(Groups value) {
        this.groups = value;
    }

    /**
     * 获取tags属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Tags }
     *     
     */
    public Tags getTags() {
        return tags;
    }

    /**
     * 设置tags属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Tags }
     *     
     */
    public void setTags(Tags value) {
        this.tags = value;
    }

    /**
     * 获取searchCriteria属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteria }
     *     
     */
    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * 设置searchCriteria属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteria }
     *     
     */
    public void setSearchCriteria(SearchCriteria value) {
        this.searchCriteria = value;
    }

    /**
     * Trip Profile matched to flight search request
     * 
     * @return
     *     possible object is
     *     {@link TripProfiles }
     *     
     */
    public TripProfiles getTripProfiles() {
        return tripProfiles;
    }

    /**
     * 设置tripProfiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TripProfiles }
     *     
     */
    public void setTripProfiles(TripProfiles value) {
        this.tripProfiles = value;
    }

    /**
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    public Content getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    public void setContent(Content value) {
        this.content = value;
    }

    /**
     * 获取fromPrices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PromotionProfileType.FromPrices }
     *     
     */
    public PromotionProfileType.FromPrices getFromPrices() {
        return fromPrices;
    }

    /**
     * 设置fromPrices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionProfileType.FromPrices }
     *     
     */
    public void setFromPrices(PromotionProfileType.FromPrices value) {
        this.fromPrices = value;
    }

    /**
     * 获取impression属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImpressionType }
     *     
     */
    public ImpressionType getImpression() {
        return impression;
    }

    /**
     * 设置impression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImpressionType }
     *     
     */
    public void setImpression(ImpressionType value) {
        this.impression = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取statusAttr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusAttr() {
        return statusAttr;
    }

    /**
     * 设置statusAttr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusAttr(String value) {
        this.statusAttr = value;
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
     * 获取timeStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * 设置timeStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * 获取priority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * 获取accessLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * 设置accessLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLevel(String value) {
        this.accessLevel = value;
    }

    /**
     * 获取product属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * 设置product属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FromPrice">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FromPrices
        extends MainFromPrice
    {


    }

}
