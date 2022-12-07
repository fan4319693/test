//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Seat size and marketing information definition.
 * 
 * <p>SeatDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeatDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Size" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}SeatDimensionUOMType" />
 *                 &lt;attribute name="PitchLowEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="PitchHighEnd" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="WidthLowEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="WidthHighEnd" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="BedLengthLowEnd" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="BedLengthHighEnd" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="ReclineDegree" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Marketing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Images" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ImageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Position" type="{http://www.opentravel.org/OTA/2003/05}CabinCameraPosType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Links" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Position" type="{http://www.opentravel.org/OTA/2003/05}CabinCameraPosType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Message" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDataType", propOrder = {
    "size",
    "marketing"
})
public class SeatDataType {

    @XmlElement(name = "Size")
    protected SeatDataType.Size size;
    @XmlElement(name = "Marketing")
    protected SeatDataType.Marketing marketing;

    /**
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeatDataType.Size }
     *     
     */
    public SeatDataType.Size getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDataType.Size }
     *     
     */
    public void setSize(SeatDataType.Size value) {
        this.size = value;
    }

    /**
     * 获取marketing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeatDataType.Marketing }
     *     
     */
    public SeatDataType.Marketing getMarketing() {
        return marketing;
    }

    /**
     * 设置marketing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDataType.Marketing }
     *     
     */
    public void setMarketing(SeatDataType.Marketing value) {
        this.marketing = value;
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
     *         &lt;element name="Images" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ImageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Position" type="{http://www.opentravel.org/OTA/2003/05}CabinCameraPosType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Links" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Position" type="{http://www.opentravel.org/OTA/2003/05}CabinCameraPosType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Message" maxOccurs="unbounded" minOccurs="0">
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "images",
        "links",
        "message"
    })
    public static class Marketing {

        @XmlElement(name = "Images")
        protected List<SeatDataType.Marketing.Images> images;
        @XmlElement(name = "Links")
        protected List<SeatDataType.Marketing.Links> links;
        @XmlElement(name = "Message")
        protected List<SeatDataType.Marketing.Message> message;

        /**
         * Gets the value of the images property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the images property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImages().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SeatDataType.Marketing.Images }
         * 
         * 
         */
        public List<SeatDataType.Marketing.Images> getImages() {
            if (images == null) {
                images = new ArrayList<SeatDataType.Marketing.Images>();
            }
            return this.images;
        }

        /**
         * Gets the value of the links property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the links property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinks().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SeatDataType.Marketing.Links }
         * 
         * 
         */
        public List<SeatDataType.Marketing.Links> getLinks() {
            if (links == null) {
                links = new ArrayList<SeatDataType.Marketing.Links>();
            }
            return this.links;
        }

        /**
         * Gets the value of the message property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the message property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SeatDataType.Marketing.Message }
         * 
         * 
         */
        public List<SeatDataType.Marketing.Message> getMessage() {
            if (message == null) {
                message = new ArrayList<SeatDataType.Marketing.Message>();
            }
            return this.message;
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
         *         &lt;element name="ImageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Position" type="{http://www.opentravel.org/OTA/2003/05}CabinCameraPosType" minOccurs="0"/>
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
            "imageID",
            "position"
        })
        public static class Images {

            @XmlElement(name = "ImageID", required = true)
            protected String imageID;
            @XmlElement(name = "Position")
            protected CabinCameraPosType position;

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
             * 获取position属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CabinCameraPosType }
             *     
             */
            public CabinCameraPosType getPosition() {
                return position;
            }

            /**
             * 设置position属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CabinCameraPosType }
             *     
             */
            public void setPosition(CabinCameraPosType value) {
                this.position = value;
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
         *         &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Position" type="{http://www.opentravel.org/OTA/2003/05}CabinCameraPosType" minOccurs="0"/>
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
            "linkID",
            "position"
        })
        public static class Links {

            @XmlElement(name = "LinkID", required = true)
            protected String linkID;
            @XmlElement(name = "Position")
            protected CabinCameraPosType position;

            /**
             * 获取linkID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLinkID() {
                return linkID;
            }

            /**
             * 设置linkID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLinkID(String value) {
                this.linkID = value;
            }

            /**
             * 获取position属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CabinCameraPosType }
             *     
             */
            public CabinCameraPosType getPosition() {
                return position;
            }

            /**
             * 设置position属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CabinCameraPosType }
             *     
             */
            public void setPosition(CabinCameraPosType value) {
                this.position = value;
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
        public static class Message {

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
     *       &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}SeatDimensionUOMType" />
     *       &lt;attribute name="PitchLowEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="PitchHighEnd" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="WidthLowEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="WidthHighEnd" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="BedLengthLowEnd" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="BedLengthHighEnd" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="ReclineDegree" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
    public static class Size {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Unit", required = true)
        protected SeatDimensionUOMType unit;
        @XmlAttribute(name = "PitchLowEnd", required = true)
        protected BigDecimal pitchLowEnd;
        @XmlAttribute(name = "PitchHighEnd")
        protected BigDecimal pitchHighEnd;
        @XmlAttribute(name = "WidthLowEnd", required = true)
        protected BigDecimal widthLowEnd;
        @XmlAttribute(name = "WidthHighEnd")
        protected BigDecimal widthHighEnd;
        @XmlAttribute(name = "BedLengthLowEnd")
        protected BigDecimal bedLengthLowEnd;
        @XmlAttribute(name = "BedLengthHighEnd")
        protected BigDecimal bedLengthHighEnd;
        @XmlAttribute(name = "ReclineDegree")
        protected BigDecimal reclineDegree;

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
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SeatDimensionUOMType }
         *     
         */
        public SeatDimensionUOMType getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SeatDimensionUOMType }
         *     
         */
        public void setUnit(SeatDimensionUOMType value) {
            this.unit = value;
        }

        /**
         * 获取pitchLowEnd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPitchLowEnd() {
            return pitchLowEnd;
        }

        /**
         * 设置pitchLowEnd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPitchLowEnd(BigDecimal value) {
            this.pitchLowEnd = value;
        }

        /**
         * 获取pitchHighEnd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPitchHighEnd() {
            return pitchHighEnd;
        }

        /**
         * 设置pitchHighEnd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPitchHighEnd(BigDecimal value) {
            this.pitchHighEnd = value;
        }

        /**
         * 获取widthLowEnd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWidthLowEnd() {
            return widthLowEnd;
        }

        /**
         * 设置widthLowEnd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWidthLowEnd(BigDecimal value) {
            this.widthLowEnd = value;
        }

        /**
         * 获取widthHighEnd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWidthHighEnd() {
            return widthHighEnd;
        }

        /**
         * 设置widthHighEnd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWidthHighEnd(BigDecimal value) {
            this.widthHighEnd = value;
        }

        /**
         * 获取bedLengthLowEnd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBedLengthLowEnd() {
            return bedLengthLowEnd;
        }

        /**
         * 设置bedLengthLowEnd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBedLengthLowEnd(BigDecimal value) {
            this.bedLengthLowEnd = value;
        }

        /**
         * 获取bedLengthHighEnd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBedLengthHighEnd() {
            return bedLengthHighEnd;
        }

        /**
         * 设置bedLengthHighEnd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBedLengthHighEnd(BigDecimal value) {
            this.bedLengthHighEnd = value;
        }

        /**
         * 获取reclineDegree属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getReclineDegree() {
            return reclineDegree;
        }

        /**
         * 设置reclineDegree属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setReclineDegree(BigDecimal value) {
            this.reclineDegree = value;
        }

    }

}
