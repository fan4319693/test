//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Non-seat cabin component definition.
 * 
 * <p>ComponentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dimensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;sequence>
 *                     &lt;element name="RowEquivalent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                     &lt;element name="ColumnEquivalent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;/sequence>
 *                   &lt;element name="ActualSize">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}SeatDimensionUOMType" />
 *                           &lt;attribute name="Length" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Location" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Space">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RowRange" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Begin">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;minInclusive value="01"/>
 *                                           &lt;maxInclusive value="99"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="End">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;minInclusive value="01"/>
 *                                           &lt;maxInclusive value="99"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ColumnRange">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Begin">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="[A-Z]{1}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="End">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="[A-Z]{1}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;sequence>
 *                     &lt;element name="Row">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                             &lt;attribute name="Orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Column">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                             &lt;attribute name="Orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
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
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentType", propOrder = {
    "dimensions",
    "location",
    "marketing"
})
public class ComponentType {

    @XmlElement(name = "Dimensions")
    protected ComponentType.Dimensions dimensions;
    @XmlElement(name = "Location", required = true)
    protected List<ComponentType.Location> location;
    @XmlElement(name = "Marketing")
    protected ComponentType.Marketing marketing;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * 获取dimensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ComponentType.Dimensions }
     *     
     */
    public ComponentType.Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * 设置dimensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentType.Dimensions }
     *     
     */
    public void setDimensions(ComponentType.Dimensions value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentType.Location }
     * 
     * 
     */
    public List<ComponentType.Location> getLocation() {
        if (location == null) {
            location = new ArrayList<ComponentType.Location>();
        }
        return this.location;
    }

    /**
     * 获取marketing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ComponentType.Marketing }
     *     
     */
    public ComponentType.Marketing getMarketing() {
        return marketing;
    }

    /**
     * 设置marketing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentType.Marketing }
     *     
     */
    public void setMarketing(ComponentType.Marketing value) {
        this.marketing = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     *       &lt;choice>
     *         &lt;sequence>
     *           &lt;element name="RowEquivalent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *           &lt;element name="ColumnEquivalent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;/sequence>
     *         &lt;element name="ActualSize">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}SeatDimensionUOMType" />
     *                 &lt;attribute name="Length" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rowEquivalent",
        "columnEquivalent",
        "actualSize"
    })
    public static class Dimensions {

        @XmlElement(name = "RowEquivalent")
        protected BigDecimal rowEquivalent;
        @XmlElement(name = "ColumnEquivalent")
        protected BigDecimal columnEquivalent;
        @XmlElement(name = "ActualSize")
        protected ComponentType.Dimensions.ActualSize actualSize;

        /**
         * 获取rowEquivalent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRowEquivalent() {
            return rowEquivalent;
        }

        /**
         * 设置rowEquivalent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRowEquivalent(BigDecimal value) {
            this.rowEquivalent = value;
        }

        /**
         * 获取columnEquivalent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getColumnEquivalent() {
            return columnEquivalent;
        }

        /**
         * 设置columnEquivalent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setColumnEquivalent(BigDecimal value) {
            this.columnEquivalent = value;
        }

        /**
         * 获取actualSize属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ComponentType.Dimensions.ActualSize }
         *     
         */
        public ComponentType.Dimensions.ActualSize getActualSize() {
            return actualSize;
        }

        /**
         * 设置actualSize属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ComponentType.Dimensions.ActualSize }
         *     
         */
        public void setActualSize(ComponentType.Dimensions.ActualSize value) {
            this.actualSize = value;
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
         *       &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}SeatDimensionUOMType" />
         *       &lt;attribute name="Length" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ActualSize {

            @XmlAttribute(name = "Unit", required = true)
            protected SeatDimensionUOMType unit;
            @XmlAttribute(name = "Length", required = true)
            protected String length;
            @XmlAttribute(name = "Width", required = true)
            protected String width;

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
             * 获取length属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLength() {
                return length;
            }

            /**
             * 设置length属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLength(String value) {
                this.length = value;
            }

            /**
             * 获取width属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWidth() {
                return width;
            }

            /**
             * 设置width属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWidth(String value) {
                this.width = value;
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
     *       &lt;choice>
     *         &lt;element name="Space">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RowRange" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Begin">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;minInclusive value="01"/>
     *                                 &lt;maxInclusive value="99"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="End">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;minInclusive value="01"/>
     *                                 &lt;maxInclusive value="99"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ColumnRange">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Begin">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;pattern value="[A-Z]{1}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="End">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;pattern value="[A-Z]{1}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;sequence>
     *           &lt;element name="Row">
     *             &lt;complexType>
     *               &lt;simpleContent>
     *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *                   &lt;attribute name="Orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/extension>
     *               &lt;/simpleContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Column">
     *             &lt;complexType>
     *               &lt;simpleContent>
     *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                   &lt;attribute name="Orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/extension>
     *               &lt;/simpleContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "space",
        "row",
        "column"
    })
    public static class Location {

        @XmlElement(name = "Space")
        protected ComponentType.Location.Space space;
        @XmlElement(name = "Row")
        protected ComponentType.Location.Row row;
        @XmlElement(name = "Column")
        protected ComponentType.Location.Column column;

        /**
         * 获取space属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ComponentType.Location.Space }
         *     
         */
        public ComponentType.Location.Space getSpace() {
            return space;
        }

        /**
         * 设置space属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ComponentType.Location.Space }
         *     
         */
        public void setSpace(ComponentType.Location.Space value) {
            this.space = value;
        }

        /**
         * 获取row属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ComponentType.Location.Row }
         *     
         */
        public ComponentType.Location.Row getRow() {
            return row;
        }

        /**
         * 设置row属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ComponentType.Location.Row }
         *     
         */
        public void setRow(ComponentType.Location.Row value) {
            this.row = value;
        }

        /**
         * 获取column属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ComponentType.Location.Column }
         *     
         */
        public ComponentType.Location.Column getColumn() {
            return column;
        }

        /**
         * 设置column属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ComponentType.Location.Column }
         *     
         */
        public void setColumn(ComponentType.Location.Column value) {
            this.column = value;
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
         *       &lt;attribute name="Orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Column {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Orientation")
            protected String orientation;

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
             * 获取orientation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrientation() {
                return orientation;
            }

            /**
             * 设置orientation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrientation(String value) {
                this.orientation = value;
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
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
         *       &lt;attribute name="Orientation" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Row {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "Orientation")
            protected String orientation;

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setValue(BigInteger value) {
                this.value = value;
            }

            /**
             * 获取orientation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrientation() {
                return orientation;
            }

            /**
             * 设置orientation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrientation(String value) {
                this.orientation = value;
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
         *         &lt;element name="RowRange" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Begin">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;minInclusive value="01"/>
         *                       &lt;maxInclusive value="99"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="End">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;minInclusive value="01"/>
         *                       &lt;maxInclusive value="99"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ColumnRange">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Begin">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="[A-Z]{1}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="End">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="[A-Z]{1}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
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
            "rowRange",
            "columnRange"
        })
        public static class Space {

            @XmlElement(name = "RowRange", required = true)
            protected List<ComponentType.Location.Space.RowRange> rowRange;
            @XmlElement(name = "ColumnRange", required = true)
            protected ComponentType.Location.Space.ColumnRange columnRange;

            /**
             * Gets the value of the rowRange property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the rowRange property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRowRange().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ComponentType.Location.Space.RowRange }
             * 
             * 
             */
            public List<ComponentType.Location.Space.RowRange> getRowRange() {
                if (rowRange == null) {
                    rowRange = new ArrayList<ComponentType.Location.Space.RowRange>();
                }
                return this.rowRange;
            }

            /**
             * 获取columnRange属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ComponentType.Location.Space.ColumnRange }
             *     
             */
            public ComponentType.Location.Space.ColumnRange getColumnRange() {
                return columnRange;
            }

            /**
             * 设置columnRange属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ComponentType.Location.Space.ColumnRange }
             *     
             */
            public void setColumnRange(ComponentType.Location.Space.ColumnRange value) {
                this.columnRange = value;
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
             *       &lt;attribute name="Begin">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="[A-Z]{1}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="End">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="[A-Z]{1}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ColumnRange {

                @XmlAttribute(name = "Begin")
                protected String begin;
                @XmlAttribute(name = "End")
                protected String end;

                /**
                 * 获取begin属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBegin() {
                    return begin;
                }

                /**
                 * 设置begin属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBegin(String value) {
                    this.begin = value;
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
             *       &lt;attribute name="Begin">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;minInclusive value="01"/>
             *             &lt;maxInclusive value="99"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="End">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;minInclusive value="01"/>
             *             &lt;maxInclusive value="99"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RowRange {

                @XmlAttribute(name = "Begin")
                protected Integer begin;
                @XmlAttribute(name = "End")
                protected Integer end;

                /**
                 * 获取begin属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getBegin() {
                    return begin;
                }

                /**
                 * 设置begin属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setBegin(Integer value) {
                    this.begin = value;
                }

                /**
                 * 获取end属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getEnd() {
                    return end;
                }

                /**
                 * 设置end属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setEnd(Integer value) {
                    this.end = value;
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
        protected List<ComponentType.Marketing.Images> images;
        @XmlElement(name = "Links")
        protected List<ComponentType.Marketing.Links> links;
        @XmlElement(name = "Message")
        protected List<ComponentType.Marketing.Message> message;

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
         * {@link ComponentType.Marketing.Images }
         * 
         * 
         */
        public List<ComponentType.Marketing.Images> getImages() {
            if (images == null) {
                images = new ArrayList<ComponentType.Marketing.Images>();
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
         * {@link ComponentType.Marketing.Links }
         * 
         * 
         */
        public List<ComponentType.Marketing.Links> getLinks() {
            if (links == null) {
                links = new ArrayList<ComponentType.Marketing.Links>();
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
         * {@link ComponentType.Marketing.Message }
         * 
         * 
         */
        public List<ComponentType.Marketing.Message> getMessage() {
            if (message == null) {
                message = new ArrayList<ComponentType.Marketing.Message>();
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

}
