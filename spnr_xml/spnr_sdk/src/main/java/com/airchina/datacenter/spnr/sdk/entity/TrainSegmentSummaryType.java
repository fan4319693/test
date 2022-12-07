//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines train segment summary information, including departure and arrival stations, departure and arrival dates/times, and train identification information.
 * 
 * <p>TrainSegmentSummaryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrainSegmentSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureStation" type="{http://www.opentravel.org/OTA/2003/05}StationDetailsType"/>
 *         &lt;element name="ArrivalStation" type="{http://www.opentravel.org/OTA/2003/05}StationDetailsType"/>
 *         &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TrainIdentification" type="{http://www.opentravel.org/OTA/2003/05}TrainIdentificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainSegmentSummaryType", propOrder = {
    "departureStation",
    "arrivalStation",
    "departureDateTime",
    "arrivalDateTime",
    "trainIdentification"
})
public class TrainSegmentSummaryType {

    @XmlElement(name = "DepartureStation", required = true)
    protected StationDetailsType departureStation;
    @XmlElement(name = "ArrivalStation", required = true)
    protected StationDetailsType arrivalStation;
    @XmlElement(name = "DepartureDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlElement(name = "ArrivalDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlElement(name = "TrainIdentification", required = true)
    protected TrainIdentificationType trainIdentification;

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
     * 获取trainIdentification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrainIdentificationType }
     *     
     */
    public TrainIdentificationType getTrainIdentification() {
        return trainIdentification;
    }

    /**
     * 设置trainIdentification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrainIdentificationType }
     *     
     */
    public void setTrainIdentification(TrainIdentificationType value) {
        this.trainIdentification = value;
    }

}
