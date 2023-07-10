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
import javax.xml.bind.annotation.XmlType;


/**
 * Common type for the Ancillary Image element. This is used when storing and reading the ancillary image information from the database in Air Ancillary Manager.
 * 
 * <p>AncillaryImage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AncillaryImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ImageThumbnailURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ContentData" use="required" type="{http://www.opentravel.org/OTA/2003/05}ContentDataType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryImage", propOrder = {
    "imageURL",
    "imageThumbnailURL"
})
public class AncillaryImage {

    @XmlElement(name = "ImageURL", required = true)
    protected String imageURL;
    @XmlElement(name = "ImageThumbnailURL", required = true)
    protected String imageThumbnailURL;
    @XmlAttribute(name = "ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "ContentData", required = true)
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
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
