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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Frequent traveler information with associated flight segment.
 * 
 * <p>FQTVInfoSegType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FQTVInfoSegType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SegmentIDRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FFNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FFCompanyCode" type="{http://www.opentravel.org/OTA/2003/05}AirlineCodeType"/>
 *         &lt;element name="Surname" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GivenName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "FQTVInfoSegType", propOrder = {
    "segmentIDRef",
    "ffNumber",
    "ffCompanyCode",
    "surname",
    "givenName"
})
public class FQTVInfoSegType {

    @XmlElement(name = "SegmentIDRef")
    protected List<SegmentIDRefType> segmentIDRef;
    @XmlElement(name = "FFNumber", required = true)
    protected String ffNumber;
    @XmlElement(name = "FFCompanyCode", required = true)
    protected String ffCompanyCode;
    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "GivenName")
    protected String givenName;

    /**
     * Gets the value of the segmentIDRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentIDRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentIDRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentIDRefType }
     * 
     * 
     */
    public List<SegmentIDRefType> getSegmentIDRef() {
        if (segmentIDRef == null) {
            segmentIDRef = new ArrayList<SegmentIDRefType>();
        }
        return this.segmentIDRef;
    }

    /**
     * 获取ffNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFNumber() {
        return ffNumber;
    }

    /**
     * 设置ffNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFNumber(String value) {
        this.ffNumber = value;
    }

    /**
     * 获取ffCompanyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFCompanyCode() {
        return ffCompanyCode;
    }

    /**
     * 设置ffCompanyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFCompanyCode(String value) {
        this.ffCompanyCode = value;
    }

    /**
     * 获取surname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * 设置surname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * 获取givenName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * 设置givenName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

}
