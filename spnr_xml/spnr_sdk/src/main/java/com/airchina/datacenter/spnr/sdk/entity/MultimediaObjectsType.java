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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Used to send multimedia objects and the details associated with them.
 * 
 * <p>MultimediaObjectsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultimediaObjectsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultimediaObject" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType">
 *                 &lt;sequence>
 *                   &lt;element name="ImageItems" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ImageItem" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ImageFormat" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                                                 &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                                                 &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}ImageFormatTextType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="ContentData" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PictureCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RecordId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Text" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaObjectsType", propOrder = {
    "multimediaObject"
})
public class MultimediaObjectsType {

    @XmlElement(name = "MultimediaObject", required = true)
    protected List<MultimediaObjectsType.MultimediaObject> multimediaObject;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * Gets the value of the multimediaObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multimediaObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultimediaObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultimediaObjectsType.MultimediaObject }
     * 
     * 
     */
    public List<MultimediaObjectsType.MultimediaObject> getMultimediaObject() {
        if (multimediaObject == null) {
            multimediaObject = new ArrayList<MultimediaObjectsType.MultimediaObject>();
        }
        return this.multimediaObject;
    }

    /**
     * 获取lastUpdated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 设置lastUpdated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType">
     *       &lt;sequence>
     *         &lt;element name="ImageItems" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ImageItem" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ImageFormat" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *                                       &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *                                       &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}ImageFormatTextType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="ContentData" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PictureCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RecordId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Text" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "imageItems"
    })
    public static class MultimediaObject
        extends MultimediaObjectType
    {

        @XmlElement(name = "ImageItems")
        protected MultimediaObjectsType.MultimediaObject.ImageItems imageItems;

        /**
         * 获取imageItems属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MultimediaObjectsType.MultimediaObject.ImageItems }
         *     
         */
        public MultimediaObjectsType.MultimediaObject.ImageItems getImageItems() {
            return imageItems;
        }

        /**
         * 设置imageItems属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MultimediaObjectsType.MultimediaObject.ImageItems }
         *     
         */
        public void setImageItems(MultimediaObjectsType.MultimediaObject.ImageItems value) {
            this.imageItems = value;
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
         *         &lt;element name="ImageItem" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ImageFormat" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
         *                             &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
         *                             &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}ImageFormatTextType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="ContentData" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PictureCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RecordId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Text" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "imageItem"
        })
        public static class ImageItems {

            @XmlElement(name = "ImageItem")
            protected List<MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem> imageItem;

            /**
             * Gets the value of the imageItem property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the imageItem property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImageItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem }
             * 
             * 
             */
            public List<MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem> getImageItem() {
                if (imageItem == null) {
                    imageItem = new ArrayList<MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem>();
                }
                return this.imageItem;
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
             *         &lt;element name="ImageFormat" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
             *                   &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
             *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}ImageFormatTextType" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="ContentData" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PictureCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RecordId" type="{http://www.w3.org/2001/XMLSchema}int" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Text" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "imageFormat",
                "text"
            })
            public static class ImageItem {

                @XmlElement(name = "ImageFormat")
                protected MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.ImageFormat imageFormat;
                @XmlElement(name = "Text")
                protected MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.Text text;
                @XmlAttribute(name = "Category")
                protected String category;

                /**
                 * 获取imageFormat属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.ImageFormat }
                 *     
                 */
                public MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.ImageFormat getImageFormat() {
                    return imageFormat;
                }

                /**
                 * 设置imageFormat属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.ImageFormat }
                 *     
                 */
                public void setImageFormat(MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.ImageFormat value) {
                    this.imageFormat = value;
                }

                /**
                 * 获取text属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.Text }
                 *     
                 */
                public MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.Text getText() {
                    return text;
                }

                /**
                 * 设置text属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.Text }
                 *     
                 */
                public void setText(MultimediaObjectsType.MultimediaObject.ImageItems.ImageItem.Text value) {
                    this.text = value;
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
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
                 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
                 *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}ImageFormatTextType" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="ContentData" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PictureCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RecordId" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "url",
                    "image",
                    "text"
                })
                public static class ImageFormat {

                    @XmlElement(name = "URL")
                    @XmlSchemaType(name = "anyURI")
                    protected String url;
                    @XmlElement(name = "Image")
                    @XmlSchemaType(name = "anyURI")
                    protected String image;
                    @XmlElement(name = "Text")
                    protected ImageFormatTextType text;
                    @XmlAttribute(name = "ContentData")
                    protected String contentData;
                    @XmlAttribute(name = "Format")
                    protected String format;
                    @XmlAttribute(name = "PictureCategoryCode")
                    protected String pictureCategoryCode;
                    @XmlAttribute(name = "RecordId")
                    protected Integer recordId;

                    /**
                     * 获取url属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getURL() {
                        return url;
                    }

                    /**
                     * 设置url属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setURL(String value) {
                        this.url = value;
                    }

                    /**
                     * 获取image属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getImage() {
                        return image;
                    }

                    /**
                     * 设置image属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setImage(String value) {
                        this.image = value;
                    }

                    /**
                     * 获取text属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link ImageFormatTextType }
                     *     
                     */
                    public ImageFormatTextType getText() {
                        return text;
                    }

                    /**
                     * 设置text属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ImageFormatTextType }
                     *     
                     */
                    public void setText(ImageFormatTextType value) {
                        this.text = value;
                    }

                    /**
                     * 获取contentData属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContentData() {
                        return contentData;
                    }

                    /**
                     * 设置contentData属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContentData(String value) {
                        this.contentData = value;
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
                     * 获取pictureCategoryCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPictureCategoryCode() {
                        return pictureCategoryCode;
                    }

                    /**
                     * 设置pictureCategoryCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPictureCategoryCode(String value) {
                        this.pictureCategoryCode = value;
                    }

                    /**
                     * 获取recordId属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getRecordId() {
                        return recordId;
                    }

                    /**
                     * 设置recordId属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setRecordId(Integer value) {
                        this.recordId = value;
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
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
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
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "language")
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
