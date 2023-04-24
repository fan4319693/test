//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>HotelAvailReportAllocationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelAvailReportAllocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ForDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="InitiallyAllocated" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AdjustmentToAllocation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Allocated" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Booked" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Released" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DailyCap">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Available">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AvailableOverCap" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelAvailReportAllocationType")
public class HotelAvailReportAllocationType {

    @XmlAttribute(name = "ForDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar forDate;
    @XmlAttribute(name = "InitiallyAllocated")
    @XmlSchemaType(name = "anySimpleType")
    protected String initiallyAllocated;
    @XmlAttribute(name = "AdjustmentToAllocation")
    @XmlSchemaType(name = "anySimpleType")
    protected String adjustmentToAllocation;
    @XmlAttribute(name = "Allocated", required = true)
    protected int allocated;
    @XmlAttribute(name = "Booked", required = true)
    protected int booked;
    @XmlAttribute(name = "Released", required = true)
    protected int released;
    @XmlAttribute(name = "DailyCap")
    protected Integer dailyCap;
    @XmlAttribute(name = "Available")
    protected Integer available;
    @XmlAttribute(name = "AvailableOverCap")
    @XmlSchemaType(name = "anySimpleType")
    protected String availableOverCap;

    /**
     * 获取forDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForDate() {
        return forDate;
    }

    /**
     * 设置forDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForDate(XMLGregorianCalendar value) {
        this.forDate = value;
    }

    /**
     * 获取initiallyAllocated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiallyAllocated() {
        return initiallyAllocated;
    }

    /**
     * 设置initiallyAllocated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiallyAllocated(String value) {
        this.initiallyAllocated = value;
    }

    /**
     * 获取adjustmentToAllocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentToAllocation() {
        return adjustmentToAllocation;
    }

    /**
     * 设置adjustmentToAllocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentToAllocation(String value) {
        this.adjustmentToAllocation = value;
    }

    /**
     * 获取allocated属性的值。
     * 
     */
    public int getAllocated() {
        return allocated;
    }

    /**
     * 设置allocated属性的值。
     * 
     */
    public void setAllocated(int value) {
        this.allocated = value;
    }

    /**
     * 获取booked属性的值。
     * 
     */
    public int getBooked() {
        return booked;
    }

    /**
     * 设置booked属性的值。
     * 
     */
    public void setBooked(int value) {
        this.booked = value;
    }

    /**
     * 获取released属性的值。
     * 
     */
    public int getReleased() {
        return released;
    }

    /**
     * 设置released属性的值。
     * 
     */
    public void setReleased(int value) {
        this.released = value;
    }

    /**
     * 获取dailyCap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDailyCap() {
        return dailyCap;
    }

    /**
     * 设置dailyCap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDailyCap(Integer value) {
        this.dailyCap = value;
    }

    /**
     * 获取available属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * 设置available属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailable(Integer value) {
        this.available = value;
    }

    /**
     * 获取availableOverCap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableOverCap() {
        return availableOverCap;
    }

    /**
     * 设置availableOverCap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableOverCap(String value) {
        this.availableOverCap = value;
    }

}
