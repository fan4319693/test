//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Core image information.
 * 
 * <p>NDC_ImageType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NDC_ImageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Height">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *                 &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}MediaDimensionUnitType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Width">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *                 &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}MediaDimensionUnitType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ImageData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageText" minOccurs="0">
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
 *       &lt;/sequence>
 *       &lt;attribute name="ImageID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Symbology" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NDC_ImageType", propOrder = {
    "height",
    "width",
    "imageData",
    "imageText"
})
public class NDCImageType {

    @XmlElement(name = "Height", required = true)
    protected NDCImageType.Height height;
    @XmlElement(name = "Width", required = true)
    protected NDCImageType.Width width;
    @XmlElement(name = "ImageData")
    protected String imageData;
    @XmlElement(name = "ImageText")
    protected NDCImageType.ImageText imageText;
    @XmlAttribute(name = "ImageID")
    protected String imageID;
    @XmlAttribute(name = "Caption")
    protected String caption;
    @XmlAttribute(name = "Symbology")
    protected String symbology;
    @XmlAttribute(name = "Encoding")
    protected String encoding;
    @XmlAttribute(name = "Format")
    protected String format;

    /**
     * 获取height属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NDCImageType.Height }
     *     
     */
    public NDCImageType.Height getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NDCImageType.Height }
     *     
     */
    public void setHeight(NDCImageType.Height value) {
        this.height = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NDCImageType.Width }
     *     
     */
    public NDCImageType.Width getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NDCImageType.Width }
     *     
     */
    public void setWidth(NDCImageType.Width value) {
        this.width = value;
    }

    /**
     * 获取imageData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageData() {
        return imageData;
    }

    /**
     * 设置imageData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageData(String value) {
        this.imageData = value;
    }

    /**
     * 获取imageText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NDCImageType.ImageText }
     *     
     */
    public NDCImageType.ImageText getImageText() {
        return imageText;
    }

    /**
     * 设置imageText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NDCImageType.ImageText }
     *     
     */
    public void setImageText(NDCImageType.ImageText value) {
        this.imageText = value;
    }

    /**
     * 获取imageID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageID() {
        return imageID;
    }

    /**
     * 设置imageID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageID(String value) {
        this.imageID = value;
    }

    /**
     * 获取caption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * 设置caption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * 获取symbology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbology() {
        return symbology;
    }

    /**
     * 设置symbology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbology(String value) {
        this.symbology = value;
    }

    /**
     * 获取encoding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * 设置encoding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * 获取format属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
     *       &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}MediaDimensionUnitType" />
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
    public static class Height {

        @XmlValue
        protected int value;
        @XmlAttribute(name = "Unit", required = true)
        protected MediaDimensionUnitType unit;

        /**
         * 获取value属性的值。
         * 
         */
        public int getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         */
        public void setValue(int value) {
            this.value = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MediaDimensionUnitType }
         *     
         */
        public MediaDimensionUnitType getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MediaDimensionUnitType }
         *     
         */
        public void setUnit(MediaDimensionUnitType value) {
            this.unit = value;
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
    public static class ImageText {

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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
     *       &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}MediaDimensionUnitType" />
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
    public static class Width {

        @XmlValue
        protected int value;
        @XmlAttribute(name = "Unit", required = true)
        protected MediaDimensionUnitType unit;

        /**
         * 获取value属性的值。
         * 
         */
        public int getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         */
        public void setValue(int value) {
            this.value = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MediaDimensionUnitType }
         *     
         */
        public MediaDimensionUnitType getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MediaDimensionUnitType }
         *     
         */
        public void setUnit(MediaDimensionUnitType value) {
            this.unit = value;
        }

    }

}
