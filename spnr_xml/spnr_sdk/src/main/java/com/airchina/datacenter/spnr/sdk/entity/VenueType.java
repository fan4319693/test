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


/**
 * <p>VenueType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VenueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ContactInfosType"/>
 *         &lt;element name="Positions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Position" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PositionGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MultimediaObjects" type="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Location" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Country" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength1to2" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VenueType", propOrder = {
    "contactInfos",
    "positions",
    "multimediaObjects"
})
public class VenueType {

    @XmlElement(name = "ContactInfos", required = true)
    protected ContactInfosType contactInfos;
    @XmlElement(name = "Positions")
    protected VenueType.Positions positions;
    @XmlElement(name = "MultimediaObjects")
    protected MultimediaObjectsType multimediaObjects;
    @XmlAttribute(name = "Name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "Location", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String location;
    @XmlAttribute(name = "Country", required = true)
    protected String country;
    @XmlAttribute(name = "ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;

    /**
     * 获取contactInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactInfosType }
     *     
     */
    public ContactInfosType getContactInfos() {
        return contactInfos;
    }

    /**
     * 设置contactInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfosType }
     *     
     */
    public void setContactInfos(ContactInfosType value) {
        this.contactInfos = value;
    }

    /**
     * 获取positions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VenueType.Positions }
     *     
     */
    public VenueType.Positions getPositions() {
        return positions;
    }

    /**
     * 设置positions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VenueType.Positions }
     *     
     */
    public void setPositions(VenueType.Positions value) {
        this.positions = value;
    }

    /**
     * 获取multimediaObjects属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MultimediaObjectsType }
     *     
     */
    public MultimediaObjectsType getMultimediaObjects() {
        return multimediaObjects;
    }

    /**
     * 设置multimediaObjects属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MultimediaObjectsType }
     *     
     */
    public void setMultimediaObjects(MultimediaObjectsType value) {
        this.multimediaObjects = value;
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
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Position" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PositionGroup"/>
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
        "position"
    })
    public static class Positions {

        @XmlElement(name = "Position")
        protected List<VenueType.Positions.Position> position;

        /**
         * Gets the value of the position property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the position property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPosition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VenueType.Positions.Position }
         * 
         * 
         */
        public List<VenueType.Positions.Position> getPosition() {
            if (position == null) {
                position = new ArrayList<VenueType.Positions.Position>();
            }
            return this.position;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PositionGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Position {

            @XmlAttribute(name = "Latitude")
            protected String latitude;
            @XmlAttribute(name = "Longitude")
            protected String longitude;
            @XmlAttribute(name = "Altitude")
            protected String altitude;
            @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
            protected String altitudeUnitOfMeasureCode;

            /**
             * 获取latitude属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLatitude() {
                return latitude;
            }

            /**
             * 设置latitude属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLatitude(String value) {
                this.latitude = value;
            }

            /**
             * 获取longitude属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLongitude() {
                return longitude;
            }

            /**
             * 设置longitude属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLongitude(String value) {
                this.longitude = value;
            }

            /**
             * 获取altitude属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAltitude() {
                return altitude;
            }

            /**
             * 设置altitude属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAltitude(String value) {
                this.altitude = value;
            }

            /**
             * 获取altitudeUnitOfMeasureCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAltitudeUnitOfMeasureCode() {
                return altitudeUnitOfMeasureCode;
            }

            /**
             * 设置altitudeUnitOfMeasureCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAltitudeUnitOfMeasureCode(String value) {
                this.altitudeUnitOfMeasureCode = value;
            }

        }

    }

}
