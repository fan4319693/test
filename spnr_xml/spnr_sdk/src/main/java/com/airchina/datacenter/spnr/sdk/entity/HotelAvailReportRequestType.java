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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>HotelAvailReportRequestType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelAvailReportRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailTimeSpan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Suppliers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="Supplier" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SupplierCode" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="16"/>
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
 *         &lt;element name="Award" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}StayTypeGroup"/>
 *       &lt;attribute name="OJHotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CountryCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StateCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="2"/>
 *             &lt;maxLength value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="HotelCityCode" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="15"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="HotelCityCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatingProvider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatingMin" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RatingMax" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelAvailReportRequestType", propOrder = {
    "availTimeSpan",
    "suppliers",
    "award"
})
public class HotelAvailReportRequestType {

    @XmlElement(name = "AvailTimeSpan", required = true)
    protected HotelAvailReportRequestType.AvailTimeSpan availTimeSpan;
    @XmlElement(name = "Suppliers")
    protected HotelAvailReportRequestType.Suppliers suppliers;
    @XmlElement(name = "Award")
    protected List<HotelAvailReportRequestType.Award> award;
    @XmlAttribute(name = "OJHotelCode")
    protected String ojHotelCode;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "HotelCodeContext")
    protected String hotelCodeContext;
    @XmlAttribute(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlAttribute(name = "StateCode")
    protected String stateCode;
    @XmlAttribute(name = "HotelCityCode", required = true)
    protected String hotelCityCode;
    @XmlAttribute(name = "HotelCityCodeContext")
    protected String hotelCityCodeContext;
    @XmlAttribute(name = "RatingProvider")
    protected String ratingProvider;
    @XmlAttribute(name = "RatingMin")
    @XmlSchemaType(name = "anySimpleType")
    protected String ratingMin;
    @XmlAttribute(name = "RatingMax")
    @XmlSchemaType(name = "anySimpleType")
    protected String ratingMax;
    @XmlAttribute(name = "StayType")
    protected String stayType;

    /**
     * 获取availTimeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelAvailReportRequestType.AvailTimeSpan }
     *     
     */
    public HotelAvailReportRequestType.AvailTimeSpan getAvailTimeSpan() {
        return availTimeSpan;
    }

    /**
     * 设置availTimeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAvailReportRequestType.AvailTimeSpan }
     *     
     */
    public void setAvailTimeSpan(HotelAvailReportRequestType.AvailTimeSpan value) {
        this.availTimeSpan = value;
    }

    /**
     * 获取suppliers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelAvailReportRequestType.Suppliers }
     *     
     */
    public HotelAvailReportRequestType.Suppliers getSuppliers() {
        return suppliers;
    }

    /**
     * 设置suppliers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAvailReportRequestType.Suppliers }
     *     
     */
    public void setSuppliers(HotelAvailReportRequestType.Suppliers value) {
        this.suppliers = value;
    }

    /**
     * Gets the value of the award property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the award property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelAvailReportRequestType.Award }
     * 
     * 
     */
    public List<HotelAvailReportRequestType.Award> getAward() {
        if (award == null) {
            award = new ArrayList<HotelAvailReportRequestType.Award>();
        }
        return this.award;
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
     * 获取stateCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * 设置stateCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AvailTimeSpan {

        @XmlAttribute(name = "From", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar from;
        @XmlAttribute(name = "To", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar to;

        /**
         * 获取from属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFrom() {
            return from;
        }

        /**
         * 设置from属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFrom(XMLGregorianCalendar value) {
            this.from = value;
        }

        /**
         * 获取to属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTo() {
            return to;
        }

        /**
         * 设置to属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTo(XMLGregorianCalendar value) {
            this.to = value;
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
     *       &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Award {

        @XmlAttribute(name = "Provider")
        protected String provider;
        @XmlAttribute(name = "Rating")
        protected String rating;

        /**
         * 获取provider属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProvider() {
            return provider;
        }

        /**
         * 设置provider属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProvider(String value) {
            this.provider = value;
        }

        /**
         * 获取rating属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRating() {
            return rating;
        }

        /**
         * 设置rating属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRating(String value) {
            this.rating = value;
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="Supplier" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SupplierCode" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="16"/>
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
        "supplier"
    })
    public static class Suppliers {

        @XmlElement(name = "Supplier", required = true)
        protected List<HotelAvailReportRequestType.Suppliers.Supplier> supplier;

        /**
         * Gets the value of the supplier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supplier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupplier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelAvailReportRequestType.Suppliers.Supplier }
         * 
         * 
         */
        public List<HotelAvailReportRequestType.Suppliers.Supplier> getSupplier() {
            if (supplier == null) {
                supplier = new ArrayList<HotelAvailReportRequestType.Suppliers.Supplier>();
            }
            return this.supplier;
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
         *       &lt;attribute name="SupplierCode" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="16"/>
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
        public static class Supplier {

            @XmlAttribute(name = "SupplierCode", required = true)
            protected String supplierCode;

            /**
             * 获取supplierCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupplierCode() {
                return supplierCode;
            }

            /**
             * 设置supplierCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupplierCode(String value) {
                this.supplierCode = value;
            }

        }

    }

}
