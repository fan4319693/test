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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProductContentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProductContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShortContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LongContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Image" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ImageThumbnailURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="ContentData" type="{http://www.opentravel.org/OTA/2003/05}ContentDataType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductTag" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Language" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductContentType", propOrder = {
    "productName",
    "shortContent",
    "longContent",
    "image",
    "productTag"
})
public class ProductContentType {

    @XmlElement(name = "ProductName", required = true)
    protected String productName;
    @XmlElement(name = "ShortContent", required = true)
    protected String shortContent;
    @XmlElement(name = "LongContent", required = true)
    protected String longContent;
    @XmlElement(name = "Image")
    protected List<ProductContentType.Image> image;
    @XmlElement(name = "ProductTag")
    protected Object productTag;
    @XmlAttribute(name = "Language", required = true)
    protected String language;

    /**
     * 获取productName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置productName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * 获取shortContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortContent() {
        return shortContent;
    }

    /**
     * 设置shortContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortContent(String value) {
        this.shortContent = value;
    }

    /**
     * 获取longContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongContent() {
        return longContent;
    }

    /**
     * 设置longContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongContent(String value) {
        this.longContent = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductContentType.Image }
     * 
     * 
     */
    public List<ProductContentType.Image> getImage() {
        if (image == null) {
            image = new ArrayList<ProductContentType.Image>();
        }
        return this.image;
    }

    /**
     * 获取productTag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProductTag() {
        return productTag;
    }

    /**
     * 设置productTag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProductTag(Object value) {
        this.productTag = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ImageThumbnailURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="ContentData" type="{http://www.opentravel.org/OTA/2003/05}ContentDataType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "imageURL",
        "imageThumbnailURL"
    })
    public static class Image {

        @XmlElement(name = "ImageURL", required = true)
        protected String imageURL;
        @XmlElement(name = "ImageThumbnailURL")
        protected String imageThumbnailURL;
        @XmlAttribute(name = "ID", required = true)
        protected int id;
        @XmlAttribute(name = "ContentData")
        protected ContentDataType contentData;

        /**
         * 获取imageURL属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImageURL() {
            return imageURL;
        }

        /**
         * 设置imageURL属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImageURL(String value) {
            this.imageURL = value;
        }

        /**
         * 获取imageThumbnailURL属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImageThumbnailURL() {
            return imageThumbnailURL;
        }

        /**
         * 设置imageThumbnailURL属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImageThumbnailURL(String value) {
            this.imageThumbnailURL = value;
        }

        /**
         * 获取id属性的值。
         * 
         */
        public int getID() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         */
        public void setID(int value) {
            this.id = value;
        }

        /**
         * 获取contentData属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ContentDataType }
         *     
         */
        public ContentDataType getContentData() {
            return contentData;
        }

        /**
         * 设置contentData属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ContentDataType }
         *     
         */
        public void setContentData(ContentDataType value) {
            this.contentData = value;
        }

    }

}
