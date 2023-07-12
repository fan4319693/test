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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelAvailReportContractType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelAvailReportContractType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Allocations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Allocation" type="{http://www.opentravel.org/OTA/2003/05}HotelAvailReportAllocationType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BookingRule" type="{http://www.opentravel.org/OTA/2003/05}HotelAvailReportBookingRuleType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ContractCode" use="required">
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
@XmlType(name = "HotelAvailReportContractType", propOrder = {
    "allocations",
    "bookingRules"
})
public class HotelAvailReportContractType {

    @XmlElement(name = "Allocations", required = true)
    protected HotelAvailReportContractType.Allocations allocations;
    @XmlElement(name = "BookingRules")
    protected HotelAvailReportContractType.BookingRules bookingRules;
    @XmlAttribute(name = "ContractCode", required = true)
    protected String contractCode;

    /**
     * 获取allocations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelAvailReportContractType.Allocations }
     *     
     */
    public HotelAvailReportContractType.Allocations getAllocations() {
        return allocations;
    }

    /**
     * 设置allocations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAvailReportContractType.Allocations }
     *     
     */
    public void setAllocations(HotelAvailReportContractType.Allocations value) {
        this.allocations = value;
    }

    /**
     * 获取bookingRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelAvailReportContractType.BookingRules }
     *     
     */
    public HotelAvailReportContractType.BookingRules getBookingRules() {
        return bookingRules;
    }

    /**
     * 设置bookingRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAvailReportContractType.BookingRules }
     *     
     */
    public void setBookingRules(HotelAvailReportContractType.BookingRules value) {
        this.bookingRules = value;
    }

    /**
     * 获取contractCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 设置contractCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCode(String value) {
        this.contractCode = value;
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
     *         &lt;element name="Allocation" type="{http://www.opentravel.org/OTA/2003/05}HotelAvailReportAllocationType" maxOccurs="unbounded"/>
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
        "allocation"
    })
    public static class Allocations {

        @XmlElement(name = "Allocation", required = true)
        protected List<HotelAvailReportAllocationType> allocation;

        /**
         * Gets the value of the allocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelAvailReportAllocationType }
         * 
         * 
         */
        public List<HotelAvailReportAllocationType> getAllocation() {
            if (allocation == null) {
                allocation = new ArrayList<HotelAvailReportAllocationType>();
            }
            return this.allocation;
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
     *         &lt;element name="BookingRule" type="{http://www.opentravel.org/OTA/2003/05}HotelAvailReportBookingRuleType" maxOccurs="unbounded"/>
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
        "bookingRule"
    })
    public static class BookingRules {

        @XmlElement(name = "BookingRule", required = true)
        protected List<HotelAvailReportBookingRuleType> bookingRule;

        /**
         * Gets the value of the bookingRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelAvailReportBookingRuleType }
         * 
         * 
         */
        public List<HotelAvailReportBookingRuleType> getBookingRule() {
            if (bookingRule == null) {
                bookingRule = new ArrayList<HotelAvailReportBookingRuleType>();
            }
            return this.bookingRule;
        }

    }

}
