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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The AffiliationInfo object is used to identify the brand or franchise affiliations of the hotel. 
 * 
 * <p>AffiliationInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AffiliationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DistribSystems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DistribSystem" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                             &lt;element name="Marketing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Priorities" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="Priority">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                               &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                               &lt;attribute name="Priority" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="HotelCodes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
 *                           &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="External" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="UseRatePlan" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="MultiRoomTypeBookable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Brands" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Brand" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                           &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Marketing" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LoyalPrograms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LoyalProgram" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProgramDescription" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ProgramRestriction" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BlackoutDates" type="{http://www.opentravel.org/OTA/2003/05}BlackoutDateType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
 *                           &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="SecondaryProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AffiliateProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelLevel" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="ProgramCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="TravelSector" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Awards" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Award" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
 *                           &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="OfficialAppointmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="RatingSymbol">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="Diamond"/>
 *                                 &lt;enumeration value="Star"/>
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
 *         &lt;element name="PartnerInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PartnerInfo" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
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
 *         &lt;element name="Descriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "AffiliationInfoType", propOrder = {
    "distribSystems",
    "brands",
    "loyalPrograms",
    "awards",
    "partnerInfos",
    "descriptions"
})
public class AffiliationInfoType {

    @XmlElement(name = "DistribSystems")
    protected AffiliationInfoType.DistribSystems distribSystems;
    @XmlElement(name = "Brands")
    protected AffiliationInfoType.Brands brands;
    @XmlElement(name = "LoyalPrograms")
    protected AffiliationInfoType.LoyalPrograms loyalPrograms;
    @XmlElement(name = "Awards")
    protected AffiliationInfoType.Awards awards;
    @XmlElement(name = "PartnerInfos")
    protected AffiliationInfoType.PartnerInfos partnerInfos;
    @XmlElement(name = "Descriptions")
    protected AffiliationInfoType.Descriptions descriptions;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * 获取distribSystems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AffiliationInfoType.DistribSystems }
     *     
     */
    public AffiliationInfoType.DistribSystems getDistribSystems() {
        return distribSystems;
    }

    /**
     * 设置distribSystems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationInfoType.DistribSystems }
     *     
     */
    public void setDistribSystems(AffiliationInfoType.DistribSystems value) {
        this.distribSystems = value;
    }

    /**
     * 获取brands属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AffiliationInfoType.Brands }
     *     
     */
    public AffiliationInfoType.Brands getBrands() {
        return brands;
    }

    /**
     * 设置brands属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationInfoType.Brands }
     *     
     */
    public void setBrands(AffiliationInfoType.Brands value) {
        this.brands = value;
    }

    /**
     * 获取loyalPrograms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AffiliationInfoType.LoyalPrograms }
     *     
     */
    public AffiliationInfoType.LoyalPrograms getLoyalPrograms() {
        return loyalPrograms;
    }

    /**
     * 设置loyalPrograms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationInfoType.LoyalPrograms }
     *     
     */
    public void setLoyalPrograms(AffiliationInfoType.LoyalPrograms value) {
        this.loyalPrograms = value;
    }

    /**
     * 获取awards属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AffiliationInfoType.Awards }
     *     
     */
    public AffiliationInfoType.Awards getAwards() {
        return awards;
    }

    /**
     * 设置awards属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationInfoType.Awards }
     *     
     */
    public void setAwards(AffiliationInfoType.Awards value) {
        this.awards = value;
    }

    /**
     * 获取partnerInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AffiliationInfoType.PartnerInfos }
     *     
     */
    public AffiliationInfoType.PartnerInfos getPartnerInfos() {
        return partnerInfos;
    }

    /**
     * 设置partnerInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationInfoType.PartnerInfos }
     *     
     */
    public void setPartnerInfos(AffiliationInfoType.PartnerInfos value) {
        this.partnerInfos = value;
    }

    /**
     * 获取descriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AffiliationInfoType.Descriptions }
     *     
     */
    public AffiliationInfoType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * 设置descriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationInfoType.Descriptions }
     *     
     */
    public void setDescriptions(AffiliationInfoType.Descriptions value) {
        this.descriptions = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Award" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
     *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="OfficialAppointmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="RatingSymbol">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="Diamond"/>
     *                       &lt;enumeration value="Star"/>
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
        "award"
    })
    public static class Awards {

        @XmlElement(name = "Award", required = true)
        protected List<AffiliationInfoType.Awards.Award> award;

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
         * {@link AffiliationInfoType.Awards.Award }
         * 
         * 
         */
        public List<AffiliationInfoType.Awards.Award> getAward() {
            if (award == null) {
                award = new ArrayList<AffiliationInfoType.Awards.Award>();
            }
            return this.award;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
         *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="OfficialAppointmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="RatingSymbol">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="Diamond"/>
         *             &lt;enumeration value="Star"/>
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
        public static class Award {

            @XmlAttribute(name = "Date")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlAttribute(name = "Provider")
            protected String provider;
            @XmlAttribute(name = "Rating")
            protected String rating;
            @XmlAttribute(name = "OfficialAppointmentInd")
            protected Boolean officialAppointmentInd;
            @XmlAttribute(name = "RatingSymbol")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String ratingSymbol;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;

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

            /**
             * 获取officialAppointmentInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOfficialAppointmentInd() {
                return officialAppointmentInd;
            }

            /**
             * 设置officialAppointmentInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOfficialAppointmentInd(Boolean value) {
                this.officialAppointmentInd = value;
            }

            /**
             * 获取ratingSymbol属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRatingSymbol() {
                return ratingSymbol;
            }

            /**
             * 设置ratingSymbol属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRatingSymbol(String value) {
                this.ratingSymbol = value;
            }

            /**
             * 获取removal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
            }

            /**
             * 设置removal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
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
     *         &lt;element name="Brand" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                 &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Marketing" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "brand"
    })
    public static class Brands {

        @XmlElement(name = "Brand", required = true)
        protected List<AffiliationInfoType.Brands.Brand> brand;

        /**
         * Gets the value of the brand property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the brand property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBrand().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffiliationInfoType.Brands.Brand }
         * 
         * 
         */
        public List<AffiliationInfoType.Brands.Brand> getBrand() {
            if (brand == null) {
                brand = new ArrayList<AffiliationInfoType.Brands.Brand>();
            }
            return this.brand;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Marketing" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Brand {

            @XmlAttribute(name = "URL")
            protected String url;
            @XmlAttribute(name = "CategoryCode")
            protected String categoryCode;
            @XmlAttribute(name = "Marketing")
            protected String marketing;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;

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
             * 获取categoryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategoryCode() {
                return categoryCode;
            }

            /**
             * 设置categoryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategoryCode(String value) {
                this.categoryCode = value;
            }

            /**
             * 获取marketing属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketing() {
                return marketing;
            }

            /**
             * 设置marketing属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketing(String value) {
                this.marketing = value;
            }

            /**
             * 获取codeDetail属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * 设置codeDetail属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * 获取removal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
            }

            /**
             * 设置removal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
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
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/>
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
        "description"
    })
    public static class Descriptions {

        @XmlElement(name = "Description", required = true)
        protected List<ParagraphType> description;

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         * 
         * 
         */
        public List<ParagraphType> getDescription() {
            if (description == null) {
                description = new ArrayList<ParagraphType>();
            }
            return this.description;
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
     *         &lt;element name="DistribSystem" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *                   &lt;element name="Marketing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Priorities" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                             &lt;element name="Priority">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                     &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                     &lt;attribute name="Priority" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="HotelCodes" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
     *                 &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="External" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="UseRatePlan" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="MultiRoomTypeBookable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "distribSystem"
    })
    public static class DistribSystems {

        @XmlElement(name = "DistribSystem", required = true)
        protected List<AffiliationInfoType.DistribSystems.DistribSystem> distribSystem;

        /**
         * Gets the value of the distribSystem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the distribSystem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDistribSystem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffiliationInfoType.DistribSystems.DistribSystem }
         * 
         * 
         */
        public List<AffiliationInfoType.DistribSystems.DistribSystem> getDistribSystem() {
            if (distribSystem == null) {
                distribSystem = new ArrayList<AffiliationInfoType.DistribSystems.DistribSystem>();
            }
            return this.distribSystem;
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
         *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
         *         &lt;element name="Marketing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Priorities" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
         *                   &lt;element name="Priority">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                           &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                           &lt;attribute name="Priority" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="HotelCodes" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
         *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="External" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="UseRatePlan" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="MultiRoomTypeBookable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "companyName",
            "marketing",
            "priorities",
            "hotelCodes"
        })
        public static class DistribSystem {

            @XmlElement(name = "CompanyName")
            protected CompanyNameType companyName;
            @XmlElement(name = "Marketing")
            protected String marketing;
            @XmlElement(name = "Priorities")
            protected AffiliationInfoType.DistribSystems.DistribSystem.Priorities priorities;
            @XmlElement(name = "HotelCodes")
            protected AffiliationInfoType.DistribSystems.DistribSystem.HotelCodes hotelCodes;
            @XmlAttribute(name = "Priority")
            @XmlSchemaType(name = "anySimpleType")
            protected String priority;
            @XmlAttribute(name = "Enabled")
            @XmlSchemaType(name = "anySimpleType")
            protected String enabled;
            @XmlAttribute(name = "External")
            @XmlSchemaType(name = "anySimpleType")
            protected String external;
            @XmlAttribute(name = "UseRatePlan")
            @XmlSchemaType(name = "anySimpleType")
            protected String useRatePlan;
            @XmlAttribute(name = "MultiRoomTypeBookable")
            protected Boolean multiRoomTypeBookable;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;
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
             * 获取companyName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CompanyNameType }
             *     
             */
            public CompanyNameType getCompanyName() {
                return companyName;
            }

            /**
             * 设置companyName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyNameType }
             *     
             */
            public void setCompanyName(CompanyNameType value) {
                this.companyName = value;
            }

            /**
             * 获取marketing属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketing() {
                return marketing;
            }

            /**
             * 设置marketing属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketing(String value) {
                this.marketing = value;
            }

            /**
             * 获取priorities属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AffiliationInfoType.DistribSystems.DistribSystem.Priorities }
             *     
             */
            public AffiliationInfoType.DistribSystems.DistribSystem.Priorities getPriorities() {
                return priorities;
            }

            /**
             * 设置priorities属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AffiliationInfoType.DistribSystems.DistribSystem.Priorities }
             *     
             */
            public void setPriorities(AffiliationInfoType.DistribSystems.DistribSystem.Priorities value) {
                this.priorities = value;
            }

            /**
             * 获取hotelCodes属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AffiliationInfoType.DistribSystems.DistribSystem.HotelCodes }
             *     
             */
            public AffiliationInfoType.DistribSystems.DistribSystem.HotelCodes getHotelCodes() {
                return hotelCodes;
            }

            /**
             * 设置hotelCodes属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AffiliationInfoType.DistribSystems.DistribSystem.HotelCodes }
             *     
             */
            public void setHotelCodes(AffiliationInfoType.DistribSystems.DistribSystem.HotelCodes value) {
                this.hotelCodes = value;
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
             * 获取enabled属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnabled() {
                return enabled;
            }

            /**
             * 设置enabled属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnabled(String value) {
                this.enabled = value;
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
             * 获取useRatePlan属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUseRatePlan() {
                return useRatePlan;
            }

            /**
             * 设置useRatePlan属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUseRatePlan(String value) {
                this.useRatePlan = value;
            }

            /**
             * 获取multiRoomTypeBookable属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMultiRoomTypeBookable() {
                return multiRoomTypeBookable;
            }

            /**
             * 设置multiRoomTypeBookable属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMultiRoomTypeBookable(Boolean value) {
                this.multiRoomTypeBookable = value;
            }

            /**
             * 获取removal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
            }

            /**
             * 设置removal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
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
             *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
                "hotelCode"
            })
            public static class HotelCodes {

                @XmlElement(name = "HotelCode")
                protected List<Object> hotelCode;

                /**
                 * Gets the value of the hotelCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the hotelCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHotelCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getHotelCode() {
                    if (hotelCode == null) {
                        hotelCode = new ArrayList<Object>();
                    }
                    return this.hotelCode;
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
             *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
             *         &lt;element name="Priority">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                 &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                 &lt;attribute name="Priority" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                "priority"
            })
            public static class Priorities {

                @XmlElement(name = "Priority")
                protected List<AffiliationInfoType.DistribSystems.DistribSystem.Priorities.Priority> priority;

                /**
                 * Gets the value of the priority property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the priority property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPriority().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AffiliationInfoType.DistribSystems.DistribSystem.Priorities.Priority }
                 * 
                 * 
                 */
                public List<AffiliationInfoType.DistribSystems.DistribSystem.Priorities.Priority> getPriority() {
                    if (priority == null) {
                        priority = new ArrayList<AffiliationInfoType.DistribSystems.DistribSystem.Priorities.Priority>();
                    }
                    return this.priority;
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
                 *       &lt;attribute name="Priority" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Priority {

                    @XmlAttribute(name = "From", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar from;
                    @XmlAttribute(name = "To", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar to;
                    @XmlAttribute(name = "Priority", required = true)
                    protected int priority;

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

                    /**
                     * 获取priority属性的值。
                     * 
                     */
                    public int getPriority() {
                        return priority;
                    }

                    /**
                     * 设置priority属性的值。
                     * 
                     */
                    public void setPriority(int value) {
                        this.priority = value;
                    }

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
     *         &lt;element name="LoyalProgram" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProgramDescription" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ProgramRestriction" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BlackoutDates" type="{http://www.opentravel.org/OTA/2003/05}BlackoutDateType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
     *                 &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SecondaryProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AffiliateProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="HotelLevel" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="ProgramCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="TravelSector" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
        "loyalProgram"
    })
    public static class LoyalPrograms {

        @XmlElement(name = "LoyalProgram", required = true)
        protected List<AffiliationInfoType.LoyalPrograms.LoyalProgram> loyalProgram;

        /**
         * Gets the value of the loyalProgram property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loyalProgram property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLoyalProgram().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffiliationInfoType.LoyalPrograms.LoyalProgram }
         * 
         * 
         */
        public List<AffiliationInfoType.LoyalPrograms.LoyalProgram> getLoyalProgram() {
            if (loyalProgram == null) {
                loyalProgram = new ArrayList<AffiliationInfoType.LoyalPrograms.LoyalProgram>();
            }
            return this.loyalProgram;
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
         *         &lt;element name="ProgramDescription" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ProgramRestriction" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BlackoutDates" type="{http://www.opentravel.org/OTA/2003/05}BlackoutDateType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
         *       &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SecondaryProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AffiliateProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelLevel" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="ProgramCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="TravelSector" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "programDescription",
            "programRestriction",
            "blackoutDates"
        })
        public static class LoyalProgram {

            @XmlElement(name = "ProgramDescription")
            protected List<AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramDescription> programDescription;
            @XmlElement(name = "ProgramRestriction")
            protected AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramRestriction programRestriction;
            @XmlElement(name = "BlackoutDates")
            protected BlackoutDateType blackoutDates;
            @XmlAttribute(name = "ProgramName")
            protected String programName;
            @XmlAttribute(name = "SecondaryProgramName")
            protected String secondaryProgramName;
            @XmlAttribute(name = "AffiliateProgramName")
            protected String affiliateProgramName;
            @XmlAttribute(name = "HotelLevel")
            protected String hotelLevel;
            @XmlAttribute(name = "ProgramCode")
            protected String programCode;
            @XmlAttribute(name = "TravelSector")
            protected String travelSector;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * Gets the value of the programDescription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the programDescription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProgramDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramDescription }
             * 
             * 
             */
            public List<AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramDescription> getProgramDescription() {
                if (programDescription == null) {
                    programDescription = new ArrayList<AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramDescription>();
                }
                return this.programDescription;
            }

            /**
             * 获取programRestriction属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramRestriction }
             *     
             */
            public AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramRestriction getProgramRestriction() {
                return programRestriction;
            }

            /**
             * 设置programRestriction属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramRestriction }
             *     
             */
            public void setProgramRestriction(AffiliationInfoType.LoyalPrograms.LoyalProgram.ProgramRestriction value) {
                this.programRestriction = value;
            }

            /**
             * 获取blackoutDates属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BlackoutDateType }
             *     
             */
            public BlackoutDateType getBlackoutDates() {
                return blackoutDates;
            }

            /**
             * 设置blackoutDates属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BlackoutDateType }
             *     
             */
            public void setBlackoutDates(BlackoutDateType value) {
                this.blackoutDates = value;
            }

            /**
             * 获取programName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgramName() {
                return programName;
            }

            /**
             * 设置programName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgramName(String value) {
                this.programName = value;
            }

            /**
             * 获取secondaryProgramName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecondaryProgramName() {
                return secondaryProgramName;
            }

            /**
             * 设置secondaryProgramName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecondaryProgramName(String value) {
                this.secondaryProgramName = value;
            }

            /**
             * 获取affiliateProgramName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAffiliateProgramName() {
                return affiliateProgramName;
            }

            /**
             * 设置affiliateProgramName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAffiliateProgramName(String value) {
                this.affiliateProgramName = value;
            }

            /**
             * 获取hotelLevel属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelLevel() {
                return hotelLevel;
            }

            /**
             * 设置hotelLevel属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelLevel(String value) {
                this.hotelLevel = value;
            }

            /**
             * 获取programCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgramCode() {
                return programCode;
            }

            /**
             * 设置programCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgramCode(String value) {
                this.programCode = value;
            }

            /**
             * 获取travelSector属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTravelSector() {
                return travelSector;
            }

            /**
             * 设置travelSector属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTravelSector(String value) {
                this.travelSector = value;
            }

            /**
             * 获取removal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
            }

            /**
             * 设置removal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ProgramDescription
                extends ParagraphType
            {

                @XmlAttribute(name = "Removal")
                protected Boolean removal;

                /**
                 * 获取removal属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isRemoval() {
                    if (removal == null) {
                        return false;
                    } else {
                        return removal;
                    }
                }

                /**
                 * 设置removal属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRemoval(Boolean value) {
                    this.removal = value;
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
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ProgramRestriction
                extends ParagraphType
            {

                @XmlAttribute(name = "Removal")
                protected Boolean removal;

                /**
                 * 获取removal属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isRemoval() {
                    if (removal == null) {
                        return false;
                    } else {
                        return removal;
                    }
                }

                /**
                 * 设置removal属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRemoval(Boolean value) {
                    this.removal = value;
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
     *         &lt;element name="PartnerInfo" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
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
        "partnerInfo"
    })
    public static class PartnerInfos {

        @XmlElement(name = "PartnerInfo", required = true)
        protected List<AffiliationInfoType.PartnerInfos.PartnerInfo> partnerInfo;

        /**
         * Gets the value of the partnerInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the partnerInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPartnerInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffiliationInfoType.PartnerInfos.PartnerInfo }
         * 
         * 
         */
        public List<AffiliationInfoType.PartnerInfos.PartnerInfo> getPartnerInfo() {
            if (partnerInfo == null) {
                partnerInfo = new ArrayList<AffiliationInfoType.PartnerInfos.PartnerInfo>();
            }
            return this.partnerInfo;
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
         *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
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
            "contact",
            "description"
        })
        public static class PartnerInfo {

            @XmlElement(name = "Contact")
            protected ContactInfoType contact;
            @XmlElement(name = "Description")
            protected ParagraphType description;

            /**
             * 获取contact属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ContactInfoType }
             *     
             */
            public ContactInfoType getContact() {
                return contact;
            }

            /**
             * 设置contact属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ContactInfoType }
             *     
             */
            public void setContact(ContactInfoType value) {
                this.contact = value;
            }

            /**
             * 获取description属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ParagraphType }
             *     
             */
            public ParagraphType getDescription() {
                return description;
            }

            /**
             * 设置description属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ParagraphType }
             *     
             */
            public void setDescription(ParagraphType value) {
                this.description = value;
            }

        }

    }

}
