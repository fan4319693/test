//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines information about a train segment.
 * 
 * <p>TrainSegmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrainSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureStation" type="{http://www.opentravel.org/OTA/2003/05}StationDetailsType"/>
 *         &lt;element name="ArrivalStation" type="{http://www.opentravel.org/OTA/2003/05}StationDetailsType" minOccurs="0"/>
 *         &lt;element name="MarketingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="OperatingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}ClassCodeType" minOccurs="0"/>
 *         &lt;element name="TrainInfo" type="{http://www.opentravel.org/OTA/2003/05}TrainInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="JourneyDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="CrossBorderInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}GroundTransportSegmentStatusType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainSegmentType", propOrder = {
    "departureStation",
    "arrivalStation",
    "marketingCompany",
    "operatingCompany",
    "equipment",
    "trainInfo"
})
@XmlSeeAlso({
    BookedTrainSegmentType.class,
    com.airchina.datacenter.spnr.sdk.entity.JourneySegmentType.TrainSegment.class
})
public class TrainSegmentType {

    @XmlElement(name = "DepartureStation", required = true)
    protected StationDetailsType departureStation;
    @XmlElement(name = "ArrivalStation")
    protected StationDetailsType arrivalStation;
    @XmlElement(name = "MarketingCompany")
    protected CompanyNameType marketingCompany;
    @XmlElement(name = "OperatingCompany")
    protected CompanyNameType operatingCompany;
    @XmlElement(name = "Equipment")
    protected ClassCodeType equipment;
    @XmlElement(name = "TrainInfo")
    protected TrainInfoType trainInfo;
    @XmlAttribute(name = "DepartureDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlAttribute(name = "ArrivalDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlAttribute(name = "StopQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger stopQuantity;
    @XmlAttribute(name = "JourneyDuration")
    protected Duration journeyDuration;
    @XmlAttribute(name = "CrossBorderInd")
    protected Boolean crossBorderInd;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Status")
    protected GroundTransportSegmentStatusType status;

    /**
     * 获取departureStation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StationDetailsType }
     *     
     */
    public StationDetailsType getDepartureStation() {
        return departureStation;
    }

    /**
     * 设置departureStation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StationDetailsType }
     *     
     */
    public void setDepartureStation(StationDetailsType value) {
        this.departureStation = value;
    }

    /**
     * 获取arrivalStation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StationDetailsType }
     *     
     */
    public StationDetailsType getArrivalStation() {
        return arrivalStation;
    }

    /**
     * 设置arrivalStation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StationDetailsType }
     *     
     */
    public void setArrivalStation(StationDetailsType value) {
        this.arrivalStation = value;
    }

    /**
     * 获取marketingCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getMarketingCompany() {
        return marketingCompany;
    }

    /**
     * 设置marketingCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setMarketingCompany(CompanyNameType value) {
        this.marketingCompany = value;
    }

    /**
     * 获取operatingCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * 设置operatingCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setOperatingCompany(CompanyNameType value) {
        this.operatingCompany = value;
    }

    /**
     * 获取equipment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClassCodeType }
     *     
     */
    public ClassCodeType getEquipment() {
        return equipment;
    }

    /**
     * 设置equipment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClassCodeType }
     *     
     */
    public void setEquipment(ClassCodeType value) {
        this.equipment = value;
    }

    /**
     * 获取trainInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrainInfoType }
     *     
     */
    public TrainInfoType getTrainInfo() {
        return trainInfo;
    }

    /**
     * 设置trainInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrainInfoType }
     *     
     */
    public void setTrainInfo(TrainInfoType value) {
        this.trainInfo = value;
    }

    /**
     * 获取departureDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * 设置departureDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTime(XMLGregorianCalendar value) {
        this.departureDateTime = value;
    }

    /**
     * 获取arrivalDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * 设置arrivalDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

    /**
     * 获取stopQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStopQuantity() {
        return stopQuantity;
    }

    /**
     * 设置stopQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStopQuantity(BigInteger value) {
        this.stopQuantity = value;
    }

    /**
     * 获取journeyDuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getJourneyDuration() {
        return journeyDuration;
    }

    /**
     * 设置journeyDuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setJourneyDuration(Duration value) {
        this.journeyDuration = value;
    }

    /**
     * 获取crossBorderInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorderInd() {
        return crossBorderInd;
    }

    /**
     * 设置crossBorderInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorderInd(Boolean value) {
        this.crossBorderInd = value;
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
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GroundTransportSegmentStatusType }
     *     
     */
    public GroundTransportSegmentStatusType getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GroundTransportSegmentStatusType }
     *     
     */
    public void setStatus(GroundTransportSegmentStatusType value) {
        this.status = value;
    }

}
