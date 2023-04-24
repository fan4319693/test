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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControl" maxOccurs="unbounded"/>
 *         &lt;element name="StatusApplicationBlackOutDates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StatusApplicationBlackOutDate" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="FromDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="ToDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Discounts" minOccurs="0"/>
 *         &lt;element name="Releases" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Release" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="NumDays" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="NumTickets" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *                           &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="NumHours" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SellingRestrictions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerTypes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CustomerType" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Regions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Region" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DistributionChannels" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DistributionChannel" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="RateType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SaleStart" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SaleEnd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusApplicationControl",
    "statusApplicationBlackOutDates",
    "discounts",
    "releases",
    "sellingRestrictions"
})
@XmlRootElement(name = "AvailabilityRates")
public class AvailabilityRates {

    @XmlElement(name = "StatusApplicationControl", required = true)
    protected List<StatusApplicationControl> statusApplicationControl;
    @XmlElement(name = "StatusApplicationBlackOutDates")
    protected AvailabilityRates.StatusApplicationBlackOutDates statusApplicationBlackOutDates;
    @XmlElement(name = "Discounts")
    protected Discounts discounts;
    @XmlElement(name = "Releases")
    protected AvailabilityRates.Releases releases;
    @XmlElement(name = "SellingRestrictions")
    protected AvailabilityRates.SellingRestrictions sellingRestrictions;
    @XmlAttribute(name = "Start")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar start;
    @XmlAttribute(name = "End")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar end;
    @XmlAttribute(name = "RPH", required = true)
    protected String rph;
    @XmlAttribute(name = "RateType")
    @XmlSchemaType(name = "anySimpleType")
    protected String rateType;
    @XmlAttribute(name = "SaleStart")
    @XmlSchemaType(name = "anySimpleType")
    protected String saleStart;
    @XmlAttribute(name = "SaleEnd")
    @XmlSchemaType(name = "anySimpleType")
    protected String saleEnd;

    /**
     * Gets the value of the statusApplicationControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusApplicationControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusApplicationControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusApplicationControl }
     * 
     * 
     */
    public List<StatusApplicationControl> getStatusApplicationControl() {
        if (statusApplicationControl == null) {
            statusApplicationControl = new ArrayList<StatusApplicationControl>();
        }
        return this.statusApplicationControl;
    }

    /**
     * 获取statusApplicationBlackOutDates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityRates.StatusApplicationBlackOutDates }
     *     
     */
    public AvailabilityRates.StatusApplicationBlackOutDates getStatusApplicationBlackOutDates() {
        return statusApplicationBlackOutDates;
    }

    /**
     * 设置statusApplicationBlackOutDates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityRates.StatusApplicationBlackOutDates }
     *     
     */
    public void setStatusApplicationBlackOutDates(AvailabilityRates.StatusApplicationBlackOutDates value) {
        this.statusApplicationBlackOutDates = value;
    }

    /**
     * 获取discounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Discounts }
     *     
     */
    public Discounts getDiscounts() {
        return discounts;
    }

    /**
     * 设置discounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Discounts }
     *     
     */
    public void setDiscounts(Discounts value) {
        this.discounts = value;
    }

    /**
     * 获取releases属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityRates.Releases }
     *     
     */
    public AvailabilityRates.Releases getReleases() {
        return releases;
    }

    /**
     * 设置releases属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityRates.Releases }
     *     
     */
    public void setReleases(AvailabilityRates.Releases value) {
        this.releases = value;
    }

    /**
     * 获取sellingRestrictions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityRates.SellingRestrictions }
     *     
     */
    public AvailabilityRates.SellingRestrictions getSellingRestrictions() {
        return sellingRestrictions;
    }

    /**
     * 设置sellingRestrictions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityRates.SellingRestrictions }
     *     
     */
    public void setSellingRestrictions(AvailabilityRates.SellingRestrictions value) {
        this.sellingRestrictions = value;
    }

    /**
     * 获取start属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * 设置start属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * 获取end属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * 设置end属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * 获取rph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * 设置rph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * 获取rateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * 设置rateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(String value) {
        this.rateType = value;
    }

    /**
     * 获取saleStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleStart() {
        return saleStart;
    }

    /**
     * 设置saleStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleStart(String value) {
        this.saleStart = value;
    }

    /**
     * 获取saleEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleEnd() {
        return saleEnd;
    }

    /**
     * 设置saleEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleEnd(String value) {
        this.saleEnd = value;
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
     *         &lt;element name="Release" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="NumDays" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="NumTickets" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="NumHours" type="{http://www.w3.org/2001/XMLSchema}int" />
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
        "release"
    })
    public static class Releases {

        @XmlElement(name = "Release")
        protected List<AvailabilityRates.Releases.Release> release;

        /**
         * Gets the value of the release property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the release property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelease().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AvailabilityRates.Releases.Release }
         * 
         * 
         */
        public List<AvailabilityRates.Releases.Release> getRelease() {
            if (release == null) {
                release = new ArrayList<AvailabilityRates.Releases.Release>();
            }
            return this.release;
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
         *       &lt;attribute name="NumDays" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="NumTickets" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
         *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="NumHours" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Release {

            @XmlAttribute(name = "NumDays")
            protected Integer numDays;
            @XmlAttribute(name = "NumTickets")
            protected Integer numTickets;
            @XmlAttribute(name = "Date")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlAttribute(name = "NumHours")
            protected Integer numHours;

            /**
             * 获取numDays属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumDays() {
                return numDays;
            }

            /**
             * 设置numDays属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumDays(Integer value) {
                this.numDays = value;
            }

            /**
             * 获取numTickets属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getNumTickets() {
                if (numTickets == null) {
                    return  0;
                } else {
                    return numTickets;
                }
            }

            /**
             * 设置numTickets属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumTickets(Integer value) {
                this.numTickets = value;
            }

            /**
             * 获取date属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * 设置date属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * 获取numHours属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumHours() {
                return numHours;
            }

            /**
             * 设置numHours属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumHours(Integer value) {
                this.numHours = value;
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
     *         &lt;element name="CustomerTypes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CustomerType" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Regions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Region" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DistributionChannels" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DistributionChannel" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
    @XmlType(name = "", propOrder = {
        "customerTypes",
        "regions",
        "distributionChannels"
    })
    public static class SellingRestrictions {

        @XmlElement(name = "CustomerTypes")
        protected AvailabilityRates.SellingRestrictions.CustomerTypes customerTypes;
        @XmlElement(name = "Regions")
        protected AvailabilityRates.SellingRestrictions.Regions regions;
        @XmlElement(name = "DistributionChannels")
        protected AvailabilityRates.SellingRestrictions.DistributionChannels distributionChannels;

        /**
         * 获取customerTypes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailabilityRates.SellingRestrictions.CustomerTypes }
         *     
         */
        public AvailabilityRates.SellingRestrictions.CustomerTypes getCustomerTypes() {
            return customerTypes;
        }

        /**
         * 设置customerTypes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailabilityRates.SellingRestrictions.CustomerTypes }
         *     
         */
        public void setCustomerTypes(AvailabilityRates.SellingRestrictions.CustomerTypes value) {
            this.customerTypes = value;
        }

        /**
         * 获取regions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailabilityRates.SellingRestrictions.Regions }
         *     
         */
        public AvailabilityRates.SellingRestrictions.Regions getRegions() {
            return regions;
        }

        /**
         * 设置regions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailabilityRates.SellingRestrictions.Regions }
         *     
         */
        public void setRegions(AvailabilityRates.SellingRestrictions.Regions value) {
            this.regions = value;
        }

        /**
         * 获取distributionChannels属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailabilityRates.SellingRestrictions.DistributionChannels }
         *     
         */
        public AvailabilityRates.SellingRestrictions.DistributionChannels getDistributionChannels() {
            return distributionChannels;
        }

        /**
         * 设置distributionChannels属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailabilityRates.SellingRestrictions.DistributionChannels }
         *     
         */
        public void setDistributionChannels(AvailabilityRates.SellingRestrictions.DistributionChannels value) {
            this.distributionChannels = value;
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
         *         &lt;element name="CustomerType" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
            "customerType"
        })
        public static class CustomerTypes {

            @XmlElement(name = "CustomerType")
            protected List<AvailabilityRates.SellingRestrictions.CustomerTypes.CustomerType> customerType;

            /**
             * Gets the value of the customerType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the customerType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustomerType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AvailabilityRates.SellingRestrictions.CustomerTypes.CustomerType }
             * 
             * 
             */
            public List<AvailabilityRates.SellingRestrictions.CustomerTypes.CustomerType> getCustomerType() {
                if (customerType == null) {
                    customerType = new ArrayList<AvailabilityRates.SellingRestrictions.CustomerTypes.CustomerType>();
                }
                return this.customerType;
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CustomerType {


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
         *         &lt;element name="DistributionChannel" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
            "distributionChannel"
        })
        public static class DistributionChannels {

            @XmlElement(name = "DistributionChannel")
            protected List<AvailabilityRates.SellingRestrictions.DistributionChannels.DistributionChannel> distributionChannel;

            /**
             * Gets the value of the distributionChannel property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the distributionChannel property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDistributionChannel().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AvailabilityRates.SellingRestrictions.DistributionChannels.DistributionChannel }
             * 
             * 
             */
            public List<AvailabilityRates.SellingRestrictions.DistributionChannels.DistributionChannel> getDistributionChannel() {
                if (distributionChannel == null) {
                    distributionChannel = new ArrayList<AvailabilityRates.SellingRestrictions.DistributionChannels.DistributionChannel>();
                }
                return this.distributionChannel;
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DistributionChannel {


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
         *         &lt;element name="Region" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
            "region"
        })
        public static class Regions {

            @XmlElement(name = "Region")
            protected List<AvailabilityRates.SellingRestrictions.Regions.Region> region;

            /**
             * Gets the value of the region property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the region property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRegion().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AvailabilityRates.SellingRestrictions.Regions.Region }
             * 
             * 
             */
            public List<AvailabilityRates.SellingRestrictions.Regions.Region> getRegion() {
                if (region == null) {
                    region = new ArrayList<AvailabilityRates.SellingRestrictions.Regions.Region>();
                }
                return this.region;
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Region {


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
     *         &lt;element name="StatusApplicationBlackOutDate" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="FromDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="ToDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "statusApplicationBlackOutDate"
    })
    public static class StatusApplicationBlackOutDates {

        @XmlElement(name = "StatusApplicationBlackOutDate")
        protected List<AvailabilityRates.StatusApplicationBlackOutDates.StatusApplicationBlackOutDate> statusApplicationBlackOutDate;

        /**
         * Gets the value of the statusApplicationBlackOutDate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statusApplicationBlackOutDate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatusApplicationBlackOutDate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AvailabilityRates.StatusApplicationBlackOutDates.StatusApplicationBlackOutDate }
         * 
         * 
         */
        public List<AvailabilityRates.StatusApplicationBlackOutDates.StatusApplicationBlackOutDate> getStatusApplicationBlackOutDate() {
            if (statusApplicationBlackOutDate == null) {
                statusApplicationBlackOutDate = new ArrayList<AvailabilityRates.StatusApplicationBlackOutDates.StatusApplicationBlackOutDate>();
            }
            return this.statusApplicationBlackOutDate;
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
         *       &lt;attribute name="FromDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="ToDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StatusApplicationBlackOutDate {

            @XmlAttribute(name = "FromDate")
            @XmlSchemaType(name = "anySimpleType")
            protected String fromDate;
            @XmlAttribute(name = "ToDate")
            @XmlSchemaType(name = "anySimpleType")
            protected String toDate;

            /**
             * 获取fromDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFromDate() {
                return fromDate;
            }

            /**
             * 设置fromDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFromDate(String value) {
                this.fromDate = value;
            }

            /**
             * 获取toDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getToDate() {
                return toDate;
            }

            /**
             * 设置toDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setToDate(String value) {
                this.toDate = value;
            }

        }

    }

}
