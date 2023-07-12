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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The HotelInfo class that describes general information about the hotel.
 * 
 * <p>HotelInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="HotelShortName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClosedSeasons" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClosedSeason" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelativePositions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelativePosition" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelativePositionType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CategoryCodes" type="{http://www.opentravel.org/OTA/2003/05}CategoryCodesType" minOccurs="0"/>
 *         &lt;element name="Descriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Renovation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Text" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;choice>
 *                               &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                               &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                             &lt;/choice>
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                           &lt;attribute name="ImmediatePlans" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="PercentOfRenovationCompleted" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *                           &lt;attribute name="AreaText" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                           &lt;attribute name="RenovationCompletionDate" type="{http://www.opentravel.org/OTA/2003/05}YearOrYearMonthType" />
 *                           &lt;attribute name="Index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType">
 *                             &lt;attribute name="InfoCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                             &lt;attribute name="AdditionalDetailCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="MultimediaDescriptions" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
 *                             &lt;attribute name="InfoCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                             &lt;attribute name="AdditionalDetailCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelInfoCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HotelInfoCode" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="OptionCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Position" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PositionGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Service" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
 *                             &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/>
 *                             &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
 *                             &lt;choice>
 *                               &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType" maxOccurs="5" minOccurs="0"/>
 *                               &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                             &lt;/choice>
 *                             &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}FeaturesType" minOccurs="0"/>
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                           &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="SupplierServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="BusinessServiceCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="AvailableToAnyGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ProximityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="MealPlanCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="MeetingRoomCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="RoomAmenity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="PropertyAmenityType" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="RecreationSrvc" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="SupplierCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Extras" minOccurs="0"/>
 *         &lt;element name="WeatherInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="WeatherInfo" type="{http://www.opentravel.org/OTA/2003/05}WeatherInfoType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OwnershipManagementInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OwnershipManagementInfo" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
 *                           &lt;attribute name="RelationshipTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Languages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Language" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
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
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *       &lt;attribute name="WhenBuilt" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="AreaWeather" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InterfaceCompliance" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="PMSSystem" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="HotelStatus" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="HotelStatusCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="TaxID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="DaylightSavingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ISO9000CertifiedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfoType", propOrder = {
    "hotelName",
    "closedSeasons",
    "relativePositions",
    "categoryCodes",
    "descriptions",
    "hotelInfoCodes",
    "position",
    "services",
    "extras",
    "weatherInfos",
    "ownershipManagementInfos",
    "languages"
})
public class HotelInfoType {

    @XmlElement(name = "HotelName")
    protected HotelInfoType.HotelName hotelName;
    @XmlElement(name = "ClosedSeasons")
    protected HotelInfoType.ClosedSeasons closedSeasons;
    @XmlElement(name = "RelativePositions")
    protected HotelInfoType.RelativePositions relativePositions;
    @XmlElement(name = "CategoryCodes")
    protected CategoryCodesType categoryCodes;
    @XmlElement(name = "Descriptions")
    protected HotelInfoType.Descriptions descriptions;
    @XmlElement(name = "HotelInfoCodes")
    protected HotelInfoType.HotelInfoCodes hotelInfoCodes;
    @XmlElement(name = "Position")
    protected HotelInfoType.Position position;
    @XmlElement(name = "Services")
    protected HotelInfoType.Services services;
    @XmlElement(name = "Extras")
    protected Extras extras;
    @XmlElement(name = "WeatherInfos")
    protected HotelInfoType.WeatherInfos weatherInfos;
    @XmlElement(name = "OwnershipManagementInfos")
    protected HotelInfoType.OwnershipManagementInfos ownershipManagementInfos;
    @XmlElement(name = "Languages")
    protected HotelInfoType.Languages languages;
    @XmlAttribute(name = "WhenBuilt")
    protected String whenBuilt;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;
    @XmlAttribute(name = "AreaWeather")
    protected String areaWeather;
    @XmlAttribute(name = "InterfaceCompliance")
    protected String interfaceCompliance;
    @XmlAttribute(name = "PMSSystem")
    protected String pmsSystem;
    @XmlAttribute(name = "HotelStatus")
    protected String hotelStatus;
    @XmlAttribute(name = "HotelStatusCode")
    protected String hotelStatusCode;
    @XmlAttribute(name = "TaxID")
    protected String taxID;
    @XmlAttribute(name = "DaylightSavingIndicator")
    protected Boolean daylightSavingIndicator;
    @XmlAttribute(name = "ISO9000CertifiedInd")
    protected Boolean iso9000CertifiedInd;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected BigInteger duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "RangeNum")
    protected BigInteger rangeNum;
    @XmlAttribute(name = "SearchTimeZone")
    protected String searchTimeZone;

    /**
     * 获取hotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.HotelName }
     *     
     */
    public HotelInfoType.HotelName getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.HotelName }
     *     
     */
    public void setHotelName(HotelInfoType.HotelName value) {
        this.hotelName = value;
    }

    /**
     * 获取closedSeasons属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.ClosedSeasons }
     *     
     */
    public HotelInfoType.ClosedSeasons getClosedSeasons() {
        return closedSeasons;
    }

    /**
     * 设置closedSeasons属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.ClosedSeasons }
     *     
     */
    public void setClosedSeasons(HotelInfoType.ClosedSeasons value) {
        this.closedSeasons = value;
    }

    /**
     * 获取relativePositions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.RelativePositions }
     *     
     */
    public HotelInfoType.RelativePositions getRelativePositions() {
        return relativePositions;
    }

    /**
     * 设置relativePositions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.RelativePositions }
     *     
     */
    public void setRelativePositions(HotelInfoType.RelativePositions value) {
        this.relativePositions = value;
    }

    /**
     * 获取categoryCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CategoryCodesType }
     *     
     */
    public CategoryCodesType getCategoryCodes() {
        return categoryCodes;
    }

    /**
     * 设置categoryCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryCodesType }
     *     
     */
    public void setCategoryCodes(CategoryCodesType value) {
        this.categoryCodes = value;
    }

    /**
     * 获取descriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.Descriptions }
     *     
     */
    public HotelInfoType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * 设置descriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.Descriptions }
     *     
     */
    public void setDescriptions(HotelInfoType.Descriptions value) {
        this.descriptions = value;
    }

    /**
     * 获取hotelInfoCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.HotelInfoCodes }
     *     
     */
    public HotelInfoType.HotelInfoCodes getHotelInfoCodes() {
        return hotelInfoCodes;
    }

    /**
     * 设置hotelInfoCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.HotelInfoCodes }
     *     
     */
    public void setHotelInfoCodes(HotelInfoType.HotelInfoCodes value) {
        this.hotelInfoCodes = value;
    }

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.Position }
     *     
     */
    public HotelInfoType.Position getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.Position }
     *     
     */
    public void setPosition(HotelInfoType.Position value) {
        this.position = value;
    }

    /**
     * 获取services属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.Services }
     *     
     */
    public HotelInfoType.Services getServices() {
        return services;
    }

    /**
     * 设置services属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.Services }
     *     
     */
    public void setServices(HotelInfoType.Services value) {
        this.services = value;
    }

    /**
     * 获取extras属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Extras }
     *     
     */
    public Extras getExtras() {
        return extras;
    }

    /**
     * 设置extras属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Extras }
     *     
     */
    public void setExtras(Extras value) {
        this.extras = value;
    }

    /**
     * 获取weatherInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.WeatherInfos }
     *     
     */
    public HotelInfoType.WeatherInfos getWeatherInfos() {
        return weatherInfos;
    }

    /**
     * 设置weatherInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.WeatherInfos }
     *     
     */
    public void setWeatherInfos(HotelInfoType.WeatherInfos value) {
        this.weatherInfos = value;
    }

    /**
     * 获取ownershipManagementInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.OwnershipManagementInfos }
     *     
     */
    public HotelInfoType.OwnershipManagementInfos getOwnershipManagementInfos() {
        return ownershipManagementInfos;
    }

    /**
     * 设置ownershipManagementInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.OwnershipManagementInfos }
     *     
     */
    public void setOwnershipManagementInfos(HotelInfoType.OwnershipManagementInfos value) {
        this.ownershipManagementInfos = value;
    }

    /**
     * 获取languages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.Languages }
     *     
     */
    public HotelInfoType.Languages getLanguages() {
        return languages;
    }

    /**
     * 设置languages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.Languages }
     *     
     */
    public void setLanguages(HotelInfoType.Languages value) {
        this.languages = value;
    }

    /**
     * 获取whenBuilt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenBuilt() {
        return whenBuilt;
    }

    /**
     * 设置whenBuilt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenBuilt(String value) {
        this.whenBuilt = value;
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
     * 获取areaWeather属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaWeather() {
        return areaWeather;
    }

    /**
     * 设置areaWeather属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaWeather(String value) {
        this.areaWeather = value;
    }

    /**
     * 获取interfaceCompliance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceCompliance() {
        return interfaceCompliance;
    }

    /**
     * 设置interfaceCompliance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceCompliance(String value) {
        this.interfaceCompliance = value;
    }

    /**
     * 获取pmsSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMSSystem() {
        return pmsSystem;
    }

    /**
     * 设置pmsSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMSSystem(String value) {
        this.pmsSystem = value;
    }

    /**
     * 获取hotelStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelStatus() {
        return hotelStatus;
    }

    /**
     * 设置hotelStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelStatus(String value) {
        this.hotelStatus = value;
    }

    /**
     * 获取hotelStatusCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelStatusCode() {
        return hotelStatusCode;
    }

    /**
     * 设置hotelStatusCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelStatusCode(String value) {
        this.hotelStatusCode = value;
    }

    /**
     * 获取taxID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxID() {
        return taxID;
    }

    /**
     * 设置taxID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxID(String value) {
        this.taxID = value;
    }

    /**
     * 获取daylightSavingIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDaylightSavingIndicator() {
        return daylightSavingIndicator;
    }

    /**
     * 设置daylightSavingIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaylightSavingIndicator(Boolean value) {
        this.daylightSavingIndicator = value;
    }

    /**
     * 获取iso9000CertifiedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISO9000CertifiedInd() {
        return iso9000CertifiedInd;
    }

    /**
     * 设置iso9000CertifiedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISO9000CertifiedInd(Boolean value) {
        this.iso9000CertifiedInd = value;
    }

    /**
     * 获取start属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * 设置start属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
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

    /**
     * 获取rangeNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRangeNum() {
        return rangeNum;
    }

    /**
     * 设置rangeNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRangeNum(BigInteger value) {
        this.rangeNum = value;
    }

    /**
     * 获取searchTimeZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTimeZone() {
        return searchTimeZone;
    }

    /**
     * 设置searchTimeZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTimeZone(String value) {
        this.searchTimeZone = value;
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
     *         &lt;element name="ClosedSeason" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" maxOccurs="unbounded"/>
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
        "closedSeason"
    })
    public static class ClosedSeasons {

        @XmlElement(name = "ClosedSeason", required = true)
        protected List<DateTimeSpanType> closedSeason;

        /**
         * Gets the value of the closedSeason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the closedSeason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClosedSeason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DateTimeSpanType }
         * 
         * 
         */
        public List<DateTimeSpanType> getClosedSeason() {
            if (closedSeason == null) {
                closedSeason = new ArrayList<DateTimeSpanType>();
            }
            return this.closedSeason;
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
     *         &lt;element name="Renovation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Text" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;choice>
     *                     &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *                     &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *                   &lt;/choice>
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *                 &lt;attribute name="ImmediatePlans" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="PercentOfRenovationCompleted" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *                 &lt;attribute name="AreaText" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                 &lt;attribute name="RenovationCompletionDate" type="{http://www.opentravel.org/OTA/2003/05}YearOrYearMonthType" />
     *                 &lt;attribute name="Index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType">
     *                   &lt;attribute name="InfoCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                   &lt;attribute name="AdditionalDetailCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="MultimediaDescriptions" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
     *                   &lt;attribute name="InfoCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                   &lt;attribute name="AdditionalDetailCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "renovation",
        "description",
        "multimediaDescriptions",
        "descriptiveText"
    })
    public static class Descriptions {

        @XmlElement(name = "Renovation")
        protected List<HotelInfoType.Descriptions.Renovation> renovation;
        @XmlElement(name = "Description")
        protected List<HotelInfoType.Descriptions.Description> description;
        @XmlElement(name = "MultimediaDescriptions")
        protected HotelInfoType.Descriptions.MultimediaDescriptions multimediaDescriptions;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;

        /**
         * Gets the value of the renovation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the renovation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRenovation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelInfoType.Descriptions.Renovation }
         * 
         * 
         */
        public List<HotelInfoType.Descriptions.Renovation> getRenovation() {
            if (renovation == null) {
                renovation = new ArrayList<HotelInfoType.Descriptions.Renovation>();
            }
            return this.renovation;
        }

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
         * {@link HotelInfoType.Descriptions.Description }
         * 
         * 
         */
        public List<HotelInfoType.Descriptions.Description> getDescription() {
            if (description == null) {
                description = new ArrayList<HotelInfoType.Descriptions.Description>();
            }
            return this.description;
        }

        /**
         * 获取multimediaDescriptions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HotelInfoType.Descriptions.MultimediaDescriptions }
         *     
         */
        public HotelInfoType.Descriptions.MultimediaDescriptions getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * 设置multimediaDescriptions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HotelInfoType.Descriptions.MultimediaDescriptions }
         *     
         */
        public void setMultimediaDescriptions(HotelInfoType.Descriptions.MultimediaDescriptions value) {
            this.multimediaDescriptions = value;
        }

        /**
         * 获取descriptiveText属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptiveText() {
            return descriptiveText;
        }

        /**
         * 设置descriptiveText属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
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
         *       &lt;attribute name="InfoCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="AdditionalDetailCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Description
            extends MultimediaObjectType
        {

            @XmlAttribute(name = "InfoCode")
            protected String infoCode;
            @XmlAttribute(name = "AdditionalDetailCode")
            protected String additionalDetailCode;

            /**
             * 获取infoCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfoCode() {
                return infoCode;
            }

            /**
             * 设置infoCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfoCode(String value) {
                this.infoCode = value;
            }

            /**
             * 获取additionalDetailCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalDetailCode() {
                return additionalDetailCode;
            }

            /**
             * 设置additionalDetailCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalDetailCode(String value) {
                this.additionalDetailCode = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
         *       &lt;attribute name="InfoCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="AdditionalDetailCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MultimediaDescriptions
            extends MultimediaDescriptionsType
        {

            @XmlAttribute(name = "InfoCode")
            protected String infoCode;
            @XmlAttribute(name = "AdditionalDetailCode")
            protected String additionalDetailCode;

            /**
             * 获取infoCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfoCode() {
                return infoCode;
            }

            /**
             * 设置infoCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfoCode(String value) {
                this.infoCode = value;
            }

            /**
             * 获取additionalDetailCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalDetailCode() {
                return additionalDetailCode;
            }

            /**
             * 设置additionalDetailCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalDetailCode(String value) {
                this.additionalDetailCode = value;
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
         *         &lt;element name="Text" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;choice>
         *           &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
         *           &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
         *         &lt;/choice>
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
         *       &lt;attribute name="ImmediatePlans" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="PercentOfRenovationCompleted" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
         *       &lt;attribute name="AreaText" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *       &lt;attribute name="RenovationCompletionDate" type="{http://www.opentravel.org/OTA/2003/05}YearOrYearMonthType" />
         *       &lt;attribute name="Index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "text",
            "description",
            "multimediaDescriptions",
            "descriptiveText"
        })
        public static class Renovation {

            @XmlElement(name = "Text")
            protected HotelInfoType.Descriptions.Renovation.Text text;
            @XmlElement(name = "Description")
            protected ParagraphType description;
            @XmlElement(name = "MultimediaDescriptions")
            protected MultimediaDescriptionsType multimediaDescriptions;
            @XmlElement(name = "DescriptiveText")
            protected String descriptiveText;
            @XmlAttribute(name = "ImmediatePlans")
            protected Boolean immediatePlans;
            @XmlAttribute(name = "PercentOfRenovationCompleted")
            protected BigDecimal percentOfRenovationCompleted;
            @XmlAttribute(name = "AreaText")
            protected String areaText;
            @XmlAttribute(name = "RenovationCompletionDate")
            protected String renovationCompletionDate;
            @XmlAttribute(name = "Index")
            @XmlSchemaType(name = "anySimpleType")
            protected String index;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected BigInteger duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "RangeNum")
            protected BigInteger rangeNum;
            @XmlAttribute(name = "SearchTimeZone")
            protected String searchTimeZone;

            /**
             * 获取text属性的值。
             * 
             * @return
             *     possible object is
             *     {@link HotelInfoType.Descriptions.Renovation.Text }
             *     
             */
            public HotelInfoType.Descriptions.Renovation.Text getText() {
                return text;
            }

            /**
             * 设置text属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link HotelInfoType.Descriptions.Renovation.Text }
             *     
             */
            public void setText(HotelInfoType.Descriptions.Renovation.Text value) {
                this.text = value;
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

            /**
             * 获取multimediaDescriptions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public MultimediaDescriptionsType getMultimediaDescriptions() {
                return multimediaDescriptions;
            }

            /**
             * 设置multimediaDescriptions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
                this.multimediaDescriptions = value;
            }

            /**
             * 获取descriptiveText属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * 设置descriptiveText属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

            /**
             * 获取immediatePlans属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isImmediatePlans() {
                return immediatePlans;
            }

            /**
             * 设置immediatePlans属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setImmediatePlans(Boolean value) {
                this.immediatePlans = value;
            }

            /**
             * 获取percentOfRenovationCompleted属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercentOfRenovationCompleted() {
                return percentOfRenovationCompleted;
            }

            /**
             * 设置percentOfRenovationCompleted属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercentOfRenovationCompleted(BigDecimal value) {
                this.percentOfRenovationCompleted = value;
            }

            /**
             * 获取areaText属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAreaText() {
                return areaText;
            }

            /**
             * 设置areaText属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAreaText(String value) {
                this.areaText = value;
            }

            /**
             * 获取renovationCompletionDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRenovationCompletionDate() {
                return renovationCompletionDate;
            }

            /**
             * 设置renovationCompletionDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRenovationCompletionDate(String value) {
                this.renovationCompletionDate = value;
            }

            /**
             * 获取index属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndex() {
                return index;
            }

            /**
             * 设置index属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndex(String value) {
                this.index = value;
            }

            /**
             * 获取start属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * 设置start属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * 获取duration属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDuration() {
                return duration;
            }

            /**
             * 设置duration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDuration(BigInteger value) {
                this.duration = value;
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

            /**
             * 获取rangeNum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRangeNum() {
                return rangeNum;
            }

            /**
             * 设置rangeNum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRangeNum(BigInteger value) {
                this.rangeNum = value;
            }

            /**
             * 获取searchTimeZone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSearchTimeZone() {
                return searchTimeZone;
            }

            /**
             * 设置searchTimeZone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSearchTimeZone(String value) {
                this.searchTimeZone = value;
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
             *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Text {

                @XmlAttribute(name = "Language")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "language")
                protected String language;

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
     *         &lt;element name="HotelInfoCode" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="OptionCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
        "hotelInfoCode"
    })
    public static class HotelInfoCodes {

        @XmlElement(name = "HotelInfoCode", required = true)
        protected List<HotelInfoType.HotelInfoCodes.HotelInfoCode> hotelInfoCode;

        /**
         * Gets the value of the hotelInfoCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelInfoCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelInfoCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelInfoType.HotelInfoCodes.HotelInfoCode }
         * 
         * 
         */
        public List<HotelInfoType.HotelInfoCodes.HotelInfoCode> getHotelInfoCode() {
            if (hotelInfoCode == null) {
                hotelInfoCode = new ArrayList<HotelInfoType.HotelInfoCodes.HotelInfoCode>();
            }
            return this.hotelInfoCode;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="OptionCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HotelInfoCode {

            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "OptionCode")
            protected String optionCode;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;

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
             * 获取optionCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOptionCode() {
                return optionCode;
            }

            /**
             * 设置optionCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOptionCode(String value) {
                this.optionCode = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="HotelShortName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
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
    public static class HotelName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "HotelShortName")
        protected String hotelShortName;

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
         * 获取hotelShortName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelShortName() {
            return hotelShortName;
        }

        /**
         * 设置hotelShortName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelShortName(String value) {
            this.hotelShortName = value;
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
     *         &lt;element name="Language" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
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
        "language"
    })
    public static class Languages {

        @XmlElement(name = "Language", required = true)
        protected List<HotelInfoType.Languages.Language> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelInfoType.Languages.Language }
         * 
         * 
         */
        public List<HotelInfoType.Languages.Language> getLanguage() {
            if (language == null) {
                language = new ArrayList<HotelInfoType.Languages.Language>();
            }
            return this.language;
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
         *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Language {

            @XmlAttribute(name = "Language")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "language")
            protected String language;

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
     *         &lt;element name="OwnershipManagementInfo" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
     *                 &lt;attribute name="RelationshipTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *               &lt;/extension>
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
        "ownershipManagementInfo"
    })
    public static class OwnershipManagementInfos {

        @XmlElement(name = "OwnershipManagementInfo", required = true)
        protected List<HotelInfoType.OwnershipManagementInfos.OwnershipManagementInfo> ownershipManagementInfo;

        /**
         * Gets the value of the ownershipManagementInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ownershipManagementInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOwnershipManagementInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelInfoType.OwnershipManagementInfos.OwnershipManagementInfo }
         * 
         * 
         */
        public List<HotelInfoType.OwnershipManagementInfos.OwnershipManagementInfo> getOwnershipManagementInfo() {
            if (ownershipManagementInfo == null) {
                ownershipManagementInfo = new ArrayList<HotelInfoType.OwnershipManagementInfos.OwnershipManagementInfo>();
            }
            return this.ownershipManagementInfo;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
         *       &lt;attribute name="RelationshipTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OwnershipManagementInfo
            extends ContactInfoType
        {

            @XmlAttribute(name = "RelationshipTypeCode")
            protected String relationshipTypeCode;

            /**
             * 获取relationshipTypeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelationshipTypeCode() {
                return relationshipTypeCode;
            }

            /**
             * 设置relationshipTypeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelationshipTypeCode(String value) {
                this.relationshipTypeCode = value;
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
     *       &lt;sequence>
     *         &lt;element name="RelativePosition" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelativePositionType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
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
        "relativePosition"
    })
    public static class RelativePositions {

        @XmlElement(name = "RelativePosition", required = true)
        protected List<HotelInfoType.RelativePositions.RelativePosition> relativePosition;

        /**
         * Gets the value of the relativePosition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relativePosition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelativePosition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelInfoType.RelativePositions.RelativePosition }
         * 
         * 
         */
        public List<HotelInfoType.RelativePositions.RelativePosition> getRelativePosition() {
            if (relativePosition == null) {
                relativePosition = new ArrayList<HotelInfoType.RelativePositions.RelativePosition>();
            }
            return this.relativePosition;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelativePositionType">
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RelativePosition
            extends RelativePositionType
        {

            @XmlAttribute(name = "Code")
            protected String code;

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
     *         &lt;element name="Service" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
     *                   &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/>
     *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType" maxOccurs="5" minOccurs="0"/>
     *                     &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *                   &lt;/choice>
     *                   &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}FeaturesType" minOccurs="0"/>
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                 &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="SupplierServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="BusinessServiceCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="AvailableToAnyGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ProximityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="MealPlanCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="MeetingRoomCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="RoomAmenity" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="PropertyAmenityType" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="RecreationSrvc" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SupplierCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "service"
    })
    public static class Services {

        @XmlElement(name = "Service", required = true)
        protected List<HotelInfoType.Services.Service> service;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelInfoType.Services.Service }
         * 
         * 
         */
        public List<HotelInfoType.Services.Service> getService() {
            if (service == null) {
                service = new ArrayList<HotelInfoType.Services.Service>();
            }
            return this.service;
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
         *         &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/>
         *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
         *         &lt;choice>
         *           &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType" maxOccurs="5" minOccurs="0"/>
         *           &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
         *         &lt;/choice>
         *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}FeaturesType" minOccurs="0"/>
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *       &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="SupplierServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BusinessServiceCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="AvailableToAnyGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ProximityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="MealPlanCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="MeetingRoomCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="RoomAmenity" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="PropertyAmenityType" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="RecreationSrvc" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SupplierCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "relativePosition",
            "operationSchedules",
            "description",
            "multimediaDescriptions",
            "features",
            "descriptiveText"
        })
        public static class Service {

            @XmlElement(name = "Contact")
            protected ContactInfoType contact;
            @XmlElement(name = "RelativePosition")
            protected RelativePositionType relativePosition;
            @XmlElement(name = "OperationSchedules")
            protected OperationSchedulesPlusChargeType operationSchedules;
            @XmlElement(name = "Description")
            protected List<MultimediaObjectType> description;
            @XmlElement(name = "MultimediaDescriptions")
            protected MultimediaDescriptionsType multimediaDescriptions;
            @XmlElement(name = "Features")
            protected FeaturesType features;
            @XmlElement(name = "DescriptiveText")
            protected String descriptiveText;
            @XmlAttribute(name = "Included")
            protected Boolean included;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "SupplierServiceCode")
            protected String supplierServiceCode;
            @XmlAttribute(name = "BusinessServiceCode")
            protected String businessServiceCode;
            @XmlAttribute(name = "ExistsCode")
            protected String existsCode;
            @XmlAttribute(name = "AvailableToAnyGuest")
            protected Boolean availableToAnyGuest;
            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "ProximityCode")
            protected String proximityCode;
            @XmlAttribute(name = "MealPlanCode")
            protected String mealPlanCode;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;
            @XmlAttribute(name = "Sort")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger sort;
            @XmlAttribute(name = "MeetingRoomCode")
            protected String meetingRoomCode;
            @XmlAttribute(name = "RoomAmenity")
            protected Integer roomAmenity;
            @XmlAttribute(name = "PropertyAmenityType")
            protected Integer propertyAmenityType;
            @XmlAttribute(name = "RecreationSrvc")
            protected Integer recreationSrvc;
            @XmlAttribute(name = "SupplierCode", required = true)
            protected String supplierCode;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;

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
             * 获取relativePosition属性的值。
             * 
             * @return
             *     possible object is
             *     {@link RelativePositionType }
             *     
             */
            public RelativePositionType getRelativePosition() {
                return relativePosition;
            }

            /**
             * 设置relativePosition属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link RelativePositionType }
             *     
             */
            public void setRelativePosition(RelativePositionType value) {
                this.relativePosition = value;
            }

            /**
             * 获取operationSchedules属性的值。
             * 
             * @return
             *     possible object is
             *     {@link OperationSchedulesPlusChargeType }
             *     
             */
            public OperationSchedulesPlusChargeType getOperationSchedules() {
                return operationSchedules;
            }

            /**
             * 设置operationSchedules属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OperationSchedulesPlusChargeType }
             *     
             */
            public void setOperationSchedules(OperationSchedulesPlusChargeType value) {
                this.operationSchedules = value;
            }

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
             * {@link MultimediaObjectType }
             * 
             * 
             */
            public List<MultimediaObjectType> getDescription() {
                if (description == null) {
                    description = new ArrayList<MultimediaObjectType>();
                }
                return this.description;
            }

            /**
             * 获取multimediaDescriptions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public MultimediaDescriptionsType getMultimediaDescriptions() {
                return multimediaDescriptions;
            }

            /**
             * 设置multimediaDescriptions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
                this.multimediaDescriptions = value;
            }

            /**
             * 获取features属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FeaturesType }
             *     
             */
            public FeaturesType getFeatures() {
                return features;
            }

            /**
             * 设置features属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FeaturesType }
             *     
             */
            public void setFeatures(FeaturesType value) {
                this.features = value;
            }

            /**
             * 获取descriptiveText属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * 设置descriptiveText属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

            /**
             * 获取included属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIncluded() {
                return included;
            }

            /**
             * 设置included属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIncluded(Boolean value) {
                this.included = value;
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
             * 获取supplierServiceCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupplierServiceCode() {
                return supplierServiceCode;
            }

            /**
             * 设置supplierServiceCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupplierServiceCode(String value) {
                this.supplierServiceCode = value;
            }

            /**
             * 获取businessServiceCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessServiceCode() {
                return businessServiceCode;
            }

            /**
             * 设置businessServiceCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessServiceCode(String value) {
                this.businessServiceCode = value;
            }

            /**
             * 获取existsCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExistsCode() {
                return existsCode;
            }

            /**
             * 设置existsCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExistsCode(String value) {
                this.existsCode = value;
            }

            /**
             * 获取availableToAnyGuest属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAvailableToAnyGuest() {
                return availableToAnyGuest;
            }

            /**
             * 设置availableToAnyGuest属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAvailableToAnyGuest(Boolean value) {
                this.availableToAnyGuest = value;
            }

            /**
             * 获取invCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * 设置invCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * 获取proximityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProximityCode() {
                return proximityCode;
            }

            /**
             * 设置proximityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProximityCode(String value) {
                this.proximityCode = value;
            }

            /**
             * 获取mealPlanCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMealPlanCode() {
                return mealPlanCode;
            }

            /**
             * 设置mealPlanCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMealPlanCode(String value) {
                this.mealPlanCode = value;
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

            /**
             * 获取sort属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSort() {
                return sort;
            }

            /**
             * 设置sort属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSort(BigInteger value) {
                this.sort = value;
            }

            /**
             * 获取meetingRoomCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMeetingRoomCode() {
                return meetingRoomCode;
            }

            /**
             * 设置meetingRoomCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMeetingRoomCode(String value) {
                this.meetingRoomCode = value;
            }

            /**
             * 获取roomAmenity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRoomAmenity() {
                return roomAmenity;
            }

            /**
             * 设置roomAmenity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRoomAmenity(Integer value) {
                this.roomAmenity = value;
            }

            /**
             * 获取propertyAmenityType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPropertyAmenityType() {
                return propertyAmenityType;
            }

            /**
             * 设置propertyAmenityType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPropertyAmenityType(Integer value) {
                this.propertyAmenityType = value;
            }

            /**
             * 获取recreationSrvc属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRecreationSrvc() {
                return recreationSrvc;
            }

            /**
             * 设置recreationSrvc属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRecreationSrvc(Integer value) {
                this.recreationSrvc = value;
            }

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
     *         &lt;element name="WeatherInfo" type="{http://www.opentravel.org/OTA/2003/05}WeatherInfoType" maxOccurs="unbounded"/>
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
        "weatherInfo"
    })
    public static class WeatherInfos {

        @XmlElement(name = "WeatherInfo", required = true)
        protected List<WeatherInfoType> weatherInfo;

        /**
         * Gets the value of the weatherInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the weatherInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWeatherInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WeatherInfoType }
         * 
         * 
         */
        public List<WeatherInfoType> getWeatherInfo() {
            if (weatherInfo == null) {
                weatherInfo = new ArrayList<WeatherInfoType>();
            }
            return this.weatherInfo;
        }

    }

}
