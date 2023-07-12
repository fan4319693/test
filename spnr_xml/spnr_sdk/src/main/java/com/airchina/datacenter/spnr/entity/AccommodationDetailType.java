//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides accommodation location, dates and classifications
 * 
 * <p>AccommodationDetailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccommodationDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AccommodationInfoType">
 *       &lt;sequence>
 *         &lt;element name="FacilityChoices" type="{http://www.opentravel.org/OTA/2003/05}FacilityChoicesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *       &lt;attribute name="BedQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to999" />
 *       &lt;attribute name="TravelOKFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationDetailType", propOrder = {
    "facilityChoices"
})
public class AccommodationDetailType
    extends AccommodationInfoType
{

    @XmlElement(name = "FacilityChoices")
    protected FacilityChoicesType facilityChoices;
    @XmlAttribute(name = "BedQuantity")
    protected Integer bedQuantity;
    @XmlAttribute(name = "TravelOKFlag")
    protected Boolean travelOKFlag;
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
     * 获取facilityChoices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FacilityChoicesType }
     *     
     */
    public FacilityChoicesType getFacilityChoices() {
        return facilityChoices;
    }

    /**
     * 设置facilityChoices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityChoicesType }
     *     
     */
    public void setFacilityChoices(FacilityChoicesType value) {
        this.facilityChoices = value;
    }

    /**
     * 获取bedQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBedQuantity() {
        return bedQuantity;
    }

    /**
     * 设置bedQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBedQuantity(Integer value) {
        this.bedQuantity = value;
    }

    /**
     * 获取travelOKFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelOKFlag() {
        return travelOKFlag;
    }

    /**
     * 设置travelOKFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelOKFlag(Boolean value) {
        this.travelOKFlag = value;
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

}
