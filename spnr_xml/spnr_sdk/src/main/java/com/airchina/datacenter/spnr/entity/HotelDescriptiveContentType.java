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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The HotelDescriptiveContent element contains the descriptive information about a hotel property.
 * 
 * <p>HotelDescriptiveContentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelDescriptiveContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="DestinationSystemsCode" type="{http://www.opentravel.org/OTA/2003/05}DestinationSystemCodesType" minOccurs="0"/>
 *         &lt;element name="HotelInfo" type="{http://www.opentravel.org/OTA/2003/05}HotelInfoType" minOccurs="0"/>
 *         &lt;element name="FacilityInfo" type="{http://www.opentravel.org/OTA/2003/05}FacilityInfoType" minOccurs="0"/>
 *         &lt;element name="Policies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PoliciesType">
 *                 &lt;attribute name="GuaranteeRoomTypeViaGDS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="GuaranteeRoomTypeViaCRC" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="GuaranteeRoomTypeViaProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AreaInfo" type="{http://www.opentravel.org/OTA/2003/05}AreaInfoType" minOccurs="0"/>
 *         &lt;element name="AffiliationInfo" type="{http://www.opentravel.org/OTA/2003/05}AffiliationInfoType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="MultimediaObjects" type="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectsType" minOccurs="0"/>
 *           &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ContactInfosType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *         &lt;element name="GDS_Info" type="{http://www.opentravel.org/OTA/2003/05}GDS_InfoType" minOccurs="0"/>
 *         &lt;element name="Viewerships" type="{http://www.opentravel.org/OTA/2003/05}ViewershipsType" minOccurs="0"/>
 *         &lt;element name="EffectivePeriods" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EffectivePeriod" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DatePeriodGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaxConfigurations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TaxConfiguration"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BiasingInfos" type="{http://www.opentravel.org/OTA/2003/05}BiasingInfos" minOccurs="0"/>
 *         &lt;element name="GroupPriorities" type="{http://www.opentravel.org/OTA/2003/05}GroupPriorities" minOccurs="0"/>
 *         &lt;element name="RatePlans" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="RatePlan" type="{http://www.opentravel.org/OTA/2003/05}RatePlanType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="OJHotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AssociatedProducts" type="{http://www.opentravel.org/OTA/2003/05}AssociatedProductsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *       &lt;attribute name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="TimeZone" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="DistanceUnitOfMeasureCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="AreaUnitOfMeasureCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="WeightUnitOfMeasureCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDescriptiveContentType", propOrder = {
    "destinationSystemsCodeAndHotelInfoAndFacilityInfo"
})
public class HotelDescriptiveContentType {

    @XmlElements({
        @XmlElement(name = "DestinationSystemsCode", type = DestinationSystemCodesType.class),
        @XmlElement(name = "HotelInfo", type = HotelInfoType.class),
        @XmlElement(name = "FacilityInfo", type = FacilityInfoType.class),
        @XmlElement(name = "Policies", type = HotelDescriptiveContentType.Policies.class),
        @XmlElement(name = "AreaInfo", type = AreaInfoType.class),
        @XmlElement(name = "AffiliationInfo", type = AffiliationInfoType.class),
        @XmlElement(name = "MultimediaObjects", type = MultimediaObjectsType.class),
        @XmlElement(name = "MultimediaDescriptions", type = MultimediaDescriptionsType.class),
        @XmlElement(name = "ContactInfos", type = ContactInfosType.class),
        @XmlElement(name = "TPA_Extensions", type = TPAExtensionsType.class),
        @XmlElement(name = "GDS_Info", type = GDSInfoType.class),
        @XmlElement(name = "Viewerships", type = ViewershipsType.class),
        @XmlElement(name = "EffectivePeriods", type = HotelDescriptiveContentType.EffectivePeriods.class),
        @XmlElement(name = "TaxConfigurations", type = HotelDescriptiveContentType.TaxConfigurations.class),
        @XmlElement(name = "BiasingInfos", type = BiasingInfos.class),
        @XmlElement(name = "GroupPriorities", type = GroupPriorities.class),
        @XmlElement(name = "RatePlans", type = HotelDescriptiveContentType.RatePlans.class),
        @XmlElement(name = "AssociatedProducts", type = AssociatedProductsType.class)
    })
    protected List<Object> destinationSystemsCodeAndHotelInfoAndFacilityInfo;
    @XmlAttribute(name = "LanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageCode;
    @XmlAttribute(name = "TimeZone", required = true)
    protected String timeZone;
    @XmlAttribute(name = "DistanceUnitOfMeasureCode")
    protected String distanceUnitOfMeasureCode;
    @XmlAttribute(name = "AreaUnitOfMeasureCode")
    protected String areaUnitOfMeasureCode;
    @XmlAttribute(name = "WeightUnitOfMeasureCode")
    protected String weightUnitOfMeasureCode;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "UnitOfMeasureQuantity")
    protected BigDecimal unitOfMeasureQuantity;
    @XmlAttribute(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
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
     * Gets the value of the destinationSystemsCodeAndHotelInfoAndFacilityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationSystemsCodeAndHotelInfoAndFacilityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationSystemsCodeAndHotelInfoAndFacilityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DestinationSystemCodesType }
     * {@link HotelInfoType }
     * {@link FacilityInfoType }
     * {@link HotelDescriptiveContentType.Policies }
     * {@link AreaInfoType }
     * {@link AffiliationInfoType }
     * {@link MultimediaObjectsType }
     * {@link MultimediaDescriptionsType }
     * {@link ContactInfosType }
     * {@link TPAExtensionsType }
     * {@link GDSInfoType }
     * {@link ViewershipsType }
     * {@link HotelDescriptiveContentType.EffectivePeriods }
     * {@link HotelDescriptiveContentType.TaxConfigurations }
     * {@link BiasingInfos }
     * {@link GroupPriorities }
     * {@link HotelDescriptiveContentType.RatePlans }
     * {@link AssociatedProductsType }
     * 
     * 
     */
    public List<Object> getDestinationSystemsCodeAndHotelInfoAndFacilityInfo() {
        if (destinationSystemsCodeAndHotelInfoAndFacilityInfo == null) {
            destinationSystemsCodeAndHotelInfoAndFacilityInfo = new ArrayList<Object>();
        }
        return this.destinationSystemsCodeAndHotelInfoAndFacilityInfo;
    }

    /**
     * 获取languageCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * 设置languageCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * 获取timeZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 设置timeZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * 获取distanceUnitOfMeasureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnitOfMeasureCode() {
        return distanceUnitOfMeasureCode;
    }

    /**
     * 设置distanceUnitOfMeasureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnitOfMeasureCode(String value) {
        this.distanceUnitOfMeasureCode = value;
    }

    /**
     * 获取areaUnitOfMeasureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaUnitOfMeasureCode() {
        return areaUnitOfMeasureCode;
    }

    /**
     * 设置areaUnitOfMeasureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaUnitOfMeasureCode(String value) {
        this.areaUnitOfMeasureCode = value;
    }

    /**
     * 获取weightUnitOfMeasureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnitOfMeasureCode() {
        return weightUnitOfMeasureCode;
    }

    /**
     * 设置weightUnitOfMeasureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnitOfMeasureCode(String value) {
        this.weightUnitOfMeasureCode = value;
    }

    /**
     * 获取createDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * 设置createDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * 获取creatorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * 设置creatorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * 获取lastModifyDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * 设置lastModifyDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * 获取lastModifierID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * 设置lastModifierID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * 获取decimalPlaces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * 设置decimalPlaces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * 获取unitOfMeasureQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitOfMeasureQuantity() {
        return unitOfMeasureQuantity;
    }

    /**
     * 设置unitOfMeasureQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitOfMeasureQuantity(BigDecimal value) {
        this.unitOfMeasureQuantity = value;
    }

    /**
     * 获取unitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * 获取unitOfMeasureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * 设置unitOfMeasureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
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
     *         &lt;element name="EffectivePeriod" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DatePeriodGroup"/>
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
        "effectivePeriod"
    })
    public static class EffectivePeriods {

        @XmlElement(name = "EffectivePeriod", required = true)
        protected List<HotelDescriptiveContentType.EffectivePeriods.EffectivePeriod> effectivePeriod;

        /**
         * Gets the value of the effectivePeriod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the effectivePeriod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEffectivePeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelDescriptiveContentType.EffectivePeriods.EffectivePeriod }
         * 
         * 
         */
        public List<HotelDescriptiveContentType.EffectivePeriods.EffectivePeriod> getEffectivePeriod() {
            if (effectivePeriod == null) {
                effectivePeriod = new ArrayList<HotelDescriptiveContentType.EffectivePeriods.EffectivePeriod>();
            }
            return this.effectivePeriod;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DatePeriodGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EffectivePeriod {

            @XmlAttribute(name = "StartPeriod")
            protected String startPeriod;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "EndPeriod")
            protected String endPeriod;

            /**
             * 获取startPeriod属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartPeriod() {
                return startPeriod;
            }

            /**
             * 设置startPeriod属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartPeriod(String value) {
                this.startPeriod = value;
            }

            /**
             * 获取duration属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDuration() {
                return duration;
            }

            /**
             * 设置duration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuration(String value) {
                this.duration = value;
            }

            /**
             * 获取endPeriod属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndPeriod() {
                return endPeriod;
            }

            /**
             * 设置endPeriod属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndPeriod(String value) {
                this.endPeriod = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PoliciesType">
     *       &lt;attribute name="GuaranteeRoomTypeViaGDS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="GuaranteeRoomTypeViaCRC" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="GuaranteeRoomTypeViaProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Policies
        extends PoliciesType
    {

        @XmlAttribute(name = "GuaranteeRoomTypeViaGDS")
        protected Boolean guaranteeRoomTypeViaGDS;
        @XmlAttribute(name = "GuaranteeRoomTypeViaCRC")
        protected Boolean guaranteeRoomTypeViaCRC;
        @XmlAttribute(name = "GuaranteeRoomTypeViaProperty")
        protected Boolean guaranteeRoomTypeViaProperty;

        /**
         * 获取guaranteeRoomTypeViaGDS属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeRoomTypeViaGDS() {
            return guaranteeRoomTypeViaGDS;
        }

        /**
         * 设置guaranteeRoomTypeViaGDS属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeRoomTypeViaGDS(Boolean value) {
            this.guaranteeRoomTypeViaGDS = value;
        }

        /**
         * 获取guaranteeRoomTypeViaCRC属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeRoomTypeViaCRC() {
            return guaranteeRoomTypeViaCRC;
        }

        /**
         * 设置guaranteeRoomTypeViaCRC属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeRoomTypeViaCRC(Boolean value) {
            this.guaranteeRoomTypeViaCRC = value;
        }

        /**
         * 获取guaranteeRoomTypeViaProperty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeRoomTypeViaProperty() {
            return guaranteeRoomTypeViaProperty;
        }

        /**
         * 设置guaranteeRoomTypeViaProperty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeRoomTypeViaProperty(Boolean value) {
            this.guaranteeRoomTypeViaProperty = value;
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
     *         &lt;element name="RatePlan" type="{http://www.opentravel.org/OTA/2003/05}RatePlanType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *       &lt;attribute name="OJHotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ratePlan"
    })
    public static class RatePlans {

        @XmlElement(name = "RatePlan", required = true)
        protected List<RatePlanType> ratePlan;
        @XmlAttribute(name = "OJHotelCode")
        protected String ojHotelCode;

        /**
         * Gets the value of the ratePlan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ratePlan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRatePlan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatePlanType }
         * 
         * 
         */
        public List<RatePlanType> getRatePlan() {
            if (ratePlan == null) {
                ratePlan = new ArrayList<RatePlanType>();
            }
            return this.ratePlan;
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
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TaxConfiguration"/>
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
        "taxConfiguration"
    })
    public static class TaxConfigurations {

        @XmlElement(name = "TaxConfiguration", required = true)
        protected List<TaxConfiguration> taxConfiguration;

        /**
         * Gets the value of the taxConfiguration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxConfiguration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxConfiguration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxConfiguration }
         * 
         * 
         */
        public List<TaxConfiguration> getTaxConfiguration() {
            if (taxConfiguration == null) {
                taxConfiguration = new ArrayList<TaxConfiguration>();
            }
            return this.taxConfiguration;
        }

    }

}
