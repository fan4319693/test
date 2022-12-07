//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Promotion with pricing information.
 * 
 * <p>PromotionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PromotionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="onclick" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FromPrices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FromPrice">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Images" type="{http://www.opentravel.org/OTA/2003/05}ImagesType" minOccurs="0"/>
 *         &lt;element name="Descriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PromotionDescriptionType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Search" type="{http://www.opentravel.org/OTA/2003/05}SearchType"/>
 *         &lt;element name="Impression" type="{http://www.opentravel.org/OTA/2003/05}ImpressionType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SearchResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Enabled"/>
 *             &lt;enumeration value="Disabled"/>
 *             &lt;enumeration value="Template"/>
 *             &lt;enumeration value="Archived"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionType", propOrder = {
    "a",
    "fromPrices",
    "images",
    "descriptions",
    "search",
    "impression",
    "searchResponse"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.PromotionsType.Promotion.class
})
public class PromotionType {

    @XmlElement(required = true)
    protected PromotionType.A a;
    @XmlElement(name = "FromPrices")
    protected PromotionType.FromPrices fromPrices;
    @XmlElement(name = "Images")
    protected ImagesType images;
    @XmlElement(name = "Descriptions")
    protected PromotionType.Descriptions descriptions;
    @XmlElement(name = "Search", required = true)
    protected SearchType search;
    @XmlElement(name = "Impression")
    protected ImpressionType impression;
    @XmlElement(name = "SearchResponse")
    protected SearchResponse searchResponse;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Priority")
    @XmlSchemaType(name = "anySimpleType")
    protected String priority;
    @XmlAttribute(name = "Id", required = true)
    protected String id;

    /**
     * 获取a属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PromotionType.A }
     *     
     */
    public PromotionType.A getA() {
        return a;
    }

    /**
     * 设置a属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionType.A }
     *     
     */
    public void setA(PromotionType.A value) {
        this.a = value;
    }

    /**
     * 获取fromPrices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PromotionType.FromPrices }
     *     
     */
    public PromotionType.FromPrices getFromPrices() {
        return fromPrices;
    }

    /**
     * 设置fromPrices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionType.FromPrices }
     *     
     */
    public void setFromPrices(PromotionType.FromPrices value) {
        this.fromPrices = value;
    }

    /**
     * 获取images属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImagesType }
     *     
     */
    public ImagesType getImages() {
        return images;
    }

    /**
     * 设置images属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImagesType }
     *     
     */
    public void setImages(ImagesType value) {
        this.images = value;
    }

    /**
     * 获取descriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PromotionType.Descriptions }
     *     
     */
    public PromotionType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * 设置descriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionType.Descriptions }
     *     
     */
    public void setDescriptions(PromotionType.Descriptions value) {
        this.descriptions = value;
    }

    /**
     * 获取search属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchType }
     *     
     */
    public SearchType getSearch() {
        return search;
    }

    /**
     * 设置search属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType }
     *     
     */
    public void setSearch(SearchType value) {
        this.search = value;
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
     * 获取searchResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchResponse }
     *     
     */
    public SearchResponse getSearchResponse() {
        return searchResponse;
    }

    /**
     * 设置searchResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResponse }
     *     
     */
    public void setSearchResponse(SearchResponse value) {
        this.searchResponse = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="onclick" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class A {

        @XmlAttribute(name = "href", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String href;
        @XmlAttribute(name = "onclick", required = true)
        protected String onclick;

        /**
         * 获取href属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHref() {
            return href;
        }

        /**
         * 设置href属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHref(String value) {
            this.href = value;
        }

        /**
         * 获取onclick属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOnclick() {
            return onclick;
        }

        /**
         * 设置onclick属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOnclick(String value) {
            this.onclick = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PromotionDescriptionType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Descriptions
        extends PromotionDescriptionType
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
