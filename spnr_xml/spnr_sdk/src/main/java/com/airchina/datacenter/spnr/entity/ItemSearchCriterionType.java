//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identifies the criterion for a search.
 * 
 * <p>ItemSearchCriterionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemSearchCriterionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PositionGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
 *                 &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Telephone" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TelephoneGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RefPoint" maxOccurs="999" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to64">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
 *                 &lt;attribute name="StateProv" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
 *                 &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CodeRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="VicinityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
 *                 &lt;attribute name="SegmentCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="PropertyClassCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="ArchitecturalStyleCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="OJHotelCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="External" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="HotelType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="RatingMax" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="RatingMin" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="RatingProvider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Radius" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DistanceAttributesGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Polygon" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="3">
 *                   &lt;element name="LatLong">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Latitude" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="Longitude" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
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
 *       &lt;attribute name="ExactMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ImportanceType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to16">
 *             &lt;enumeration value="Mandatory"/>
 *             &lt;enumeration value="High"/>
 *             &lt;enumeration value="Medium"/>
 *             &lt;enumeration value="Low"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Ranking" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSearchCriterionType", propOrder = {
    "position",
    "address",
    "telephone",
    "refPoint",
    "codeRef",
    "hotelRef",
    "radius",
    "polygon"
})
@XmlSeeAlso({
    HotelSearchCriterionType.class
})
public class ItemSearchCriterionType {

    @XmlElement(name = "Position")
    protected ItemSearchCriterionType.Position position;
    @XmlElement(name = "Address")
    protected ItemSearchCriterionType.Address address;
    @XmlElement(name = "Telephone")
    protected ItemSearchCriterionType.Telephone telephone;
    @XmlElement(name = "RefPoint")
    protected List<ItemSearchCriterionType.RefPoint> refPoint;
    @XmlElement(name = "CodeRef")
    protected ItemSearchCriterionType.CodeRef codeRef;
    @XmlElement(name = "HotelRef")
    protected ItemSearchCriterionType.HotelRef hotelRef;
    @XmlElement(name = "Radius")
    protected ItemSearchCriterionType.Radius radius;
    @XmlElement(name = "Polygon")
    protected ItemSearchCriterionType.Polygon polygon;
    @XmlAttribute(name = "ExactMatch")
    protected Boolean exactMatch;
    @XmlAttribute(name = "ImportanceType")
    protected String importanceType;
    @XmlAttribute(name = "Ranking")
    protected BigInteger ranking;

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Position }
     *     
     */
    public ItemSearchCriterionType.Position getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Position }
     *     
     */
    public void setPosition(ItemSearchCriterionType.Position value) {
        this.position = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Address }
     *     
     */
    public ItemSearchCriterionType.Address getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Address }
     *     
     */
    public void setAddress(ItemSearchCriterionType.Address value) {
        this.address = value;
    }

    /**
     * 获取telephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Telephone }
     *     
     */
    public ItemSearchCriterionType.Telephone getTelephone() {
        return telephone;
    }

    /**
     * 设置telephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Telephone }
     *     
     */
    public void setTelephone(ItemSearchCriterionType.Telephone value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the refPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSearchCriterionType.RefPoint }
     * 
     * 
     */
    public List<ItemSearchCriterionType.RefPoint> getRefPoint() {
        if (refPoint == null) {
            refPoint = new ArrayList<ItemSearchCriterionType.RefPoint>();
        }
        return this.refPoint;
    }

    /**
     * 获取codeRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.CodeRef }
     *     
     */
    public ItemSearchCriterionType.CodeRef getCodeRef() {
        return codeRef;
    }

    /**
     * 设置codeRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.CodeRef }
     *     
     */
    public void setCodeRef(ItemSearchCriterionType.CodeRef value) {
        this.codeRef = value;
    }

    /**
     * 获取hotelRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.HotelRef }
     *     
     */
    public ItemSearchCriterionType.HotelRef getHotelRef() {
        return hotelRef;
    }

    /**
     * 设置hotelRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.HotelRef }
     *     
     */
    public void setHotelRef(ItemSearchCriterionType.HotelRef value) {
        this.hotelRef = value;
    }

    /**
     * 获取radius属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Radius }
     *     
     */
    public ItemSearchCriterionType.Radius getRadius() {
        return radius;
    }

    /**
     * 设置radius属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Radius }
     *     
     */
    public void setRadius(ItemSearchCriterionType.Radius value) {
        this.radius = value;
    }

    /**
     * 获取polygon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Polygon }
     *     
     */
    public ItemSearchCriterionType.Polygon getPolygon() {
        return polygon;
    }

    /**
     * 设置polygon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Polygon }
     *     
     */
    public void setPolygon(ItemSearchCriterionType.Polygon value) {
        this.polygon = value;
    }

    /**
     * 获取exactMatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExactMatch() {
        return exactMatch;
    }

    /**
     * 设置exactMatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExactMatch(Boolean value) {
        this.exactMatch = value;
    }

    /**
     * 获取importanceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportanceType() {
        return importanceType;
    }

    /**
     * 设置importanceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportanceType(String value) {
        this.importanceType = value;
    }

    /**
     * 获取ranking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRanking() {
        return ranking;
    }

    /**
     * 设置ranking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRanking(BigInteger value) {
        this.ranking = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
     *       &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
        extends AddressType
    {

        @XmlAttribute(name = "SameCountryInd")
        protected Boolean sameCountryInd;

        /**
         * 获取sameCountryInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSameCountryInd() {
            return sameCountryInd;
        }

        /**
         * 设置sameCountryInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSameCountryInd(Boolean value) {
            this.sameCountryInd = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="VicinityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CodeRef
        extends LocationType
    {

        @XmlAttribute(name = "VicinityCode")
        protected String vicinityCode;

        /**
         * 获取vicinityCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVicinityCode() {
            return vicinityCode;
        }

        /**
         * 设置vicinityCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVicinityCode(String value) {
            this.vicinityCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
     *       &lt;attribute name="SegmentCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="PropertyClassCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="ArchitecturalStyleCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="OJHotelCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="External" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="HotelType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="RatingMax" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="RatingMin" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="RatingProvider" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelRef {

        @XmlAttribute(name = "SegmentCategoryCode")
        protected String segmentCategoryCode;
        @XmlAttribute(name = "PropertyClassCode")
        protected String propertyClassCode;
        @XmlAttribute(name = "ArchitecturalStyleCode")
        protected String architecturalStyleCode;
        @XmlAttribute(name = "OJHotelCode")
        @XmlSchemaType(name = "anySimpleType")
        protected String ojHotelCode;
        @XmlAttribute(name = "Priority")
        @XmlSchemaType(name = "anySimpleType")
        protected String priority;
        @XmlAttribute(name = "External")
        @XmlSchemaType(name = "anySimpleType")
        protected String external;
        @XmlAttribute(name = "HotelType")
        @XmlSchemaType(name = "anySimpleType")
        protected String hotelType;
        @XmlAttribute(name = "RatingMax")
        @XmlSchemaType(name = "anySimpleType")
        protected String ratingMax;
        @XmlAttribute(name = "RatingMin")
        @XmlSchemaType(name = "anySimpleType")
        protected String ratingMin;
        @XmlAttribute(name = "RatingProvider")
        protected String ratingProvider;
        @XmlAttribute(name = "BookingOfficeCode")
        protected String bookingOfficeCode;
        @XmlAttribute(name = "ChainCode")
        protected String chainCode;
        @XmlAttribute(name = "BrandCode")
        protected String brandCode;
        @XmlAttribute(name = "HotelCode")
        protected String hotelCode;
        @XmlAttribute(name = "HotelCityCode")
        protected String hotelCityCode;
        @XmlAttribute(name = "HotelCityCodeContext")
        protected String hotelCityCodeContext;
        @XmlAttribute(name = "HotelName")
        protected String hotelName;
        @XmlAttribute(name = "HotelCodeContext")
        protected String hotelCodeContext;
        @XmlAttribute(name = "ChainName")
        protected String chainName;
        @XmlAttribute(name = "BrandName")
        protected String brandName;
        @XmlAttribute(name = "InvoiceIssuer")
        protected String invoiceIssuer;
        @XmlAttribute(name = "StayType")
        protected String stayType;
        @XmlAttribute(name = "AreaID")
        protected String areaID;

        /**
         * 获取segmentCategoryCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegmentCategoryCode() {
            return segmentCategoryCode;
        }

        /**
         * 设置segmentCategoryCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegmentCategoryCode(String value) {
            this.segmentCategoryCode = value;
        }

        /**
         * 获取propertyClassCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyClassCode() {
            return propertyClassCode;
        }

        /**
         * 设置propertyClassCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyClassCode(String value) {
            this.propertyClassCode = value;
        }

        /**
         * 获取architecturalStyleCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArchitecturalStyleCode() {
            return architecturalStyleCode;
        }

        /**
         * 设置architecturalStyleCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArchitecturalStyleCode(String value) {
            this.architecturalStyleCode = value;
        }

        /**
         * 获取ojHotelCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOJHotelCode() {
            return ojHotelCode;
        }

        /**
         * 设置ojHotelCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOJHotelCode(String value) {
            this.ojHotelCode = value;
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
         * 获取external属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternal() {
            return external;
        }

        /**
         * 设置external属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternal(String value) {
            this.external = value;
        }

        /**
         * 获取hotelType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelType() {
            return hotelType;
        }

        /**
         * 设置hotelType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelType(String value) {
            this.hotelType = value;
        }

        /**
         * 获取ratingMax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatingMax() {
            return ratingMax;
        }

        /**
         * 设置ratingMax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatingMax(String value) {
            this.ratingMax = value;
        }

        /**
         * 获取ratingMin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatingMin() {
            return ratingMin;
        }

        /**
         * 设置ratingMin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatingMin(String value) {
            this.ratingMin = value;
        }

        /**
         * 获取ratingProvider属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatingProvider() {
            return ratingProvider;
        }

        /**
         * 设置ratingProvider属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatingProvider(String value) {
            this.ratingProvider = value;
        }

        /**
         * 获取bookingOfficeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingOfficeCode() {
            return bookingOfficeCode;
        }

        /**
         * 设置bookingOfficeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingOfficeCode(String value) {
            this.bookingOfficeCode = value;
        }

        /**
         * 获取chainCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainCode() {
            return chainCode;
        }

        /**
         * 设置chainCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainCode(String value) {
            this.chainCode = value;
        }

        /**
         * 获取brandCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandCode() {
            return brandCode;
        }

        /**
         * 设置brandCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandCode(String value) {
            this.brandCode = value;
        }

        /**
         * 获取hotelCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCode() {
            return hotelCode;
        }

        /**
         * 设置hotelCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCode(String value) {
            this.hotelCode = value;
        }

        /**
         * 获取hotelCityCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCityCode() {
            return hotelCityCode;
        }

        /**
         * 设置hotelCityCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCityCode(String value) {
            this.hotelCityCode = value;
        }

        /**
         * 获取hotelCityCodeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCityCodeContext() {
            return hotelCityCodeContext;
        }

        /**
         * 设置hotelCityCodeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCityCodeContext(String value) {
            this.hotelCityCodeContext = value;
        }

        /**
         * 获取hotelName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelName() {
            return hotelName;
        }

        /**
         * 设置hotelName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelName(String value) {
            this.hotelName = value;
        }

        /**
         * 获取hotelCodeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCodeContext() {
            return hotelCodeContext;
        }

        /**
         * 设置hotelCodeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCodeContext(String value) {
            this.hotelCodeContext = value;
        }

        /**
         * 获取chainName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainName() {
            return chainName;
        }

        /**
         * 设置chainName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainName(String value) {
            this.chainName = value;
        }

        /**
         * 获取brandName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandName() {
            return brandName;
        }

        /**
         * 设置brandName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandName(String value) {
            this.brandName = value;
        }

        /**
         * 获取invoiceIssuer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceIssuer() {
            return invoiceIssuer;
        }

        /**
         * 设置invoiceIssuer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceIssuer(String value) {
            this.invoiceIssuer = value;
        }

        /**
         * 获取stayType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStayType() {
            return stayType;
        }

        /**
         * 设置stayType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStayType(String value) {
            this.stayType = value;
        }

        /**
         * 获取areaID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaID() {
            return areaID;
        }

        /**
         * 设置areaID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaID(String value) {
            this.areaID = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="3">
     *         &lt;element name="LatLong">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Latitude" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="Longitude" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
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
        "latLong"
    })
    public static class Polygon {

        @XmlElement(name = "LatLong", required = true)
        protected List<ItemSearchCriterionType.Polygon.LatLong> latLong;

        /**
         * Gets the value of the latLong property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the latLong property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLatLong().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemSearchCriterionType.Polygon.LatLong }
         * 
         * 
         */
        public List<ItemSearchCriterionType.Polygon.LatLong> getLatLong() {
            if (latLong == null) {
                latLong = new ArrayList<ItemSearchCriterionType.Polygon.LatLong>();
            }
            return this.latLong;
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
         *       &lt;attribute name="Latitude" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="Longitude" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LatLong {

            @XmlAttribute(name = "Latitude", required = true)
            protected double latitude;
            @XmlAttribute(name = "Longitude", required = true)
            protected double longitude;

            /**
             * 获取latitude属性的值。
             * 
             */
            public double getLatitude() {
                return latitude;
            }

            /**
             * 设置latitude属性的值。
             * 
             */
            public void setLatitude(double value) {
                this.latitude = value;
            }

            /**
             * 获取longitude属性的值。
             * 
             */
            public double getLongitude() {
                return longitude;
            }

            /**
             * 设置longitude属性的值。
             * 
             */
            public void setLongitude(double value) {
                this.longitude = value;
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DistanceAttributesGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Radius {

        @XmlAttribute(name = "Distance")
        protected String distance;
        @XmlAttribute(name = "DistanceMeasure")
        protected String distanceMeasure;
        @XmlAttribute(name = "Direction")
        protected String direction;
        @XmlAttribute(name = "DistanceMax")
        protected String distanceMax;

        /**
         * 获取distance属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistance() {
            return distance;
        }

        /**
         * 设置distance属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistance(String value) {
            this.distance = value;
        }

        /**
         * 获取distanceMeasure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceMeasure() {
            return distanceMeasure;
        }

        /**
         * 设置distanceMeasure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceMeasure(String value) {
            this.distanceMeasure = value;
        }

        /**
         * 获取direction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirection() {
            return direction;
        }

        /**
         * 设置direction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirection(String value) {
            this.direction = value;
        }

        /**
         * 获取distanceMax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceMax() {
            return distanceMax;
        }

        /**
         * 设置distanceMax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceMax(String value) {
            this.distanceMax = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to64">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
     *       &lt;attribute name="StateProv" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
     *       &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
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
    public static class RefPoint {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "StateProv")
        protected String stateProv;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;

        /**
         * Used for Character Strings, length 1 to 64
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
         * 获取stateProv属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateProv() {
            return stateProv;
        }

        /**
         * 设置stateProv属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateProv(String value) {
            this.stateProv = value;
        }

        /**
         * 获取countryCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * 设置countryCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * 获取uri属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * 设置uri属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * 获取codeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * 设置codeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TelephoneGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {

        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;
        @XmlAttribute(name = "PhoneLocationType")
        protected String phoneLocationType;
        @XmlAttribute(name = "PhoneTechType")
        protected String phoneTechType;
        @XmlAttribute(name = "PhoneUseType")
        protected String phoneUseType;
        @XmlAttribute(name = "CountryAccessCode")
        protected String countryAccessCode;
        @XmlAttribute(name = "AreaCityCode")
        protected String areaCityCode;
        @XmlAttribute(name = "PhoneNumber")
        protected String phoneNumberAttr;
        @XmlAttribute(name = "EncryptedPhoneNumber")
        protected String encryptedPhoneNumber;
        @XmlAttribute(name = "Extension")
        protected String extension;
        @XmlAttribute(name = "PIN")
        protected String pin;
        @XmlAttribute(name = "FormattedInd")
        protected Boolean formattedInd;

        /**
         * 获取shareSynchInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * 设置shareSynchInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * 获取shareMarketInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * 设置shareMarketInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

        /**
         * 获取phoneLocationType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneLocationType() {
            return phoneLocationType;
        }

        /**
         * 设置phoneLocationType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneLocationType(String value) {
            this.phoneLocationType = value;
        }

        /**
         * 获取phoneTechType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneTechType() {
            return phoneTechType;
        }

        /**
         * 设置phoneTechType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneTechType(String value) {
            this.phoneTechType = value;
        }

        /**
         * 获取phoneUseType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneUseType() {
            return phoneUseType;
        }

        /**
         * 设置phoneUseType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneUseType(String value) {
            this.phoneUseType = value;
        }

        /**
         * 获取countryAccessCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryAccessCode() {
            return countryAccessCode;
        }

        /**
         * 设置countryAccessCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryAccessCode(String value) {
            this.countryAccessCode = value;
        }

        /**
         * 获取areaCityCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaCityCode() {
            return areaCityCode;
        }

        /**
         * 设置areaCityCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaCityCode(String value) {
            this.areaCityCode = value;
        }

        /**
         * 获取phoneNumberAttr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumberAttr() {
            return phoneNumberAttr;
        }

        /**
         * 设置phoneNumberAttr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumberAttr(String value) {
            this.phoneNumberAttr = value;
        }

        /**
         * 获取encryptedPhoneNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncryptedPhoneNumber() {
            return encryptedPhoneNumber;
        }

        /**
         * 设置encryptedPhoneNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncryptedPhoneNumber(String value) {
            this.encryptedPhoneNumber = value;
        }

        /**
         * 获取extension属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtension() {
            return extension;
        }

        /**
         * 设置extension属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtension(String value) {
            this.extension = value;
        }

        /**
         * 获取pin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPIN() {
            return pin;
        }

        /**
         * 设置pin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPIN(String value) {
            this.pin = value;
        }

        /**
         * 获取formattedInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isFormattedInd() {
            if (formattedInd == null) {
                return false;
            } else {
                return formattedInd;
            }
        }

        /**
         * 设置formattedInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFormattedInd(Boolean value) {
            this.formattedInd = value;
        }

    }

}
