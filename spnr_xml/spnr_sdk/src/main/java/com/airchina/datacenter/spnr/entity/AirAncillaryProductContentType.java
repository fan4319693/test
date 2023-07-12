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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AirAncillaryProductContentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirAncillaryProductContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShortContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LongContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://www.opentravel.org/OTA/2003/05}AncillaryImage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirAncillaryProductContentType", propOrder = {
    "productName",
    "shortContent",
    "longContent",
    "image",
    "productTag"
})
@XmlSeeAlso({
    AirAncillaryProductLocalisedContentType.class
})
public class AirAncillaryProductContentType {

    @XmlElement(name = "ProductName", required = true)
    protected String productName;
    @XmlElement(name = "ShortContent", required = true)
    protected String shortContent;
    @XmlElement(name = "LongContent")
    protected String longContent;
    @XmlElement(name = "Image")
    protected List<AncillaryImage> image;
    @XmlElement(name = "ProductTag")
    protected String productTag;

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
     * {@link AncillaryImage }
     * 
     * 
     */
    public List<AncillaryImage> getImage() {
        if (image == null) {
            image = new ArrayList<AncillaryImage>();
        }
        return this.image;
    }

    /**
     * 获取productTag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTag() {
        return productTag;
    }

    /**
     * 设置productTag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTag(String value) {
        this.productTag = value;
    }

}
