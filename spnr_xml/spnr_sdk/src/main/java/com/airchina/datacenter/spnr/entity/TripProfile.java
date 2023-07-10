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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}StayDateRange"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Search"/>
 *         &lt;element name="Promotions" type="{http://www.opentravel.org/OTA/2003/05}PromotionsType"/>
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
 *       &lt;attribute name="index" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Status" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="enabled"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;enumeration value="225"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stayDateRange",
    "search",
    "promotions",
    "fromPrices",
    "impression"
})
@XmlRootElement(name = "TripProfile")
public class TripProfile {

    @XmlElement(name = "StayDateRange", required = true)
    protected StayDateRange stayDateRange;
    @XmlElement(name = "Search", required = true)
    protected Search search;
    @XmlElement(name = "Promotions", required = true)
    protected PromotionsType promotions;
    @XmlElement(name = "FromPrices")
    protected TripProfile.FromPrices fromPrices;
    @XmlElement(name = "Impression")
    protected ImpressionType impression;
    @XmlAttribute(name = "index", required = true)
    protected byte index;
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    @XmlAttribute(name = "Id", required = true)
    protected short id;
    @XmlAttribute(name = "Action")
    protected String action;
    @XmlAttribute(name = "Priority")
    protected String priority;

    /**
     * 获取stayDateRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StayDateRange }
     *     
     */
    public StayDateRange getStayDateRange() {
        return stayDateRange;
    }

    /**
     * 设置stayDateRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StayDateRange }
     *     
     */
    public void setStayDateRange(StayDateRange value) {
        this.stayDateRange = value;
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
     * 获取promotions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PromotionsType }
     *     
     */
    public PromotionsType getPromotions() {
        return promotions;
    }

    /**
     * 设置promotions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionsType }
     *     
     */
    public void setPromotions(PromotionsType value) {
        this.promotions = value;
    }

    /**
     * 获取fromPrices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TripProfile.FromPrices }
     *     
     */
    public TripProfile.FromPrices getFromPrices() {
        return fromPrices;
    }

    /**
     * 设置fromPrices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TripProfile.FromPrices }
     *     
     */
    public void setFromPrices(TripProfile.FromPrices value) {
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
     * 获取index属性的值。
     * 
     */
    public byte getIndex() {
        return index;
    }

    /**
     * 设置index属性的值。
     * 
     */
    public void setIndex(byte value) {
        this.index = value;
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
     * 获取id属性的值。
     * 
     */
    public short getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setId(short value) {
        this.id = value;
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
        return action;
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
     * 获取priority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
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
