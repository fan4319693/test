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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AvailabilityRates" maxOccurs="unbounded"/>
 *         &lt;element name="EventDateTime" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AllRates" maxOccurs="2"/>
 *                   &lt;element name="SupplierSpecificInfos" type="{http://www.opentravel.org/OTA/2003/05}SupplierSpecificInfosType" minOccurs="0"/>
 *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                   &lt;element name="CalculatedTotal" type="{http://www.opentravel.org/OTA/2003/05}TotalType" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TimeOnly" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="DateOnly" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="ForDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="ForTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MaxQuantity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Commission" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "availabilityRates",
    "eventDateTime"
})
@XmlRootElement(name = "AvailabilityAllRates")
public class AvailabilityAllRates {

    @XmlElement(name = "AvailabilityRates")
    protected List<AvailabilityRates> availabilityRates;
    @XmlElement(name = "EventDateTime")
    protected List<AvailabilityAllRates.EventDateTime> eventDateTime;
    @XmlAttribute(name = "CommissionPercent")
    @XmlSchemaType(name = "anySimpleType")
    protected String commissionPercent;
    @XmlAttribute(name = "MaxQuantity")
    @XmlSchemaType(name = "anySimpleType")
    protected String maxQuantity;
    @XmlAttribute(name = "Commission")
    @XmlSchemaType(name = "anySimpleType")
    protected String commission;

    /**
     * Gets the value of the availabilityRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilityRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilityRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailabilityRates }
     * 
     * 
     */
    public List<AvailabilityRates> getAvailabilityRates() {
        if (availabilityRates == null) {
            availabilityRates = new ArrayList<AvailabilityRates>();
        }
        return this.availabilityRates;
    }

    /**
     * Gets the value of the eventDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailabilityAllRates.EventDateTime }
     * 
     * 
     */
    public List<AvailabilityAllRates.EventDateTime> getEventDateTime() {
        if (eventDateTime == null) {
            eventDateTime = new ArrayList<AvailabilityAllRates.EventDateTime>();
        }
        return this.eventDateTime;
    }

    /**
     * 获取commissionPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionPercent() {
        return commissionPercent;
    }

    /**
     * 设置commissionPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionPercent(String value) {
        this.commissionPercent = value;
    }

    /**
     * 获取maxQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxQuantity() {
        return maxQuantity;
    }

    /**
     * 设置maxQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxQuantity(String value) {
        this.maxQuantity = value;
    }

    /**
     * 获取commission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommission() {
        return commission;
    }

    /**
     * 设置commission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommission(String value) {
        this.commission = value;
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
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AllRates" maxOccurs="2"/>
     *         &lt;element name="SupplierSpecificInfos" type="{http://www.opentravel.org/OTA/2003/05}SupplierSpecificInfosType" minOccurs="0"/>
     *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *         &lt;element name="CalculatedTotal" type="{http://www.opentravel.org/OTA/2003/05}TotalType" maxOccurs="2" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="TimeOnly" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="DateOnly" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="ForDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="ForTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allRates",
        "supplierSpecificInfos",
        "priceAdjustments",
        "calculatedTotal"
    })
    public static class EventDateTime {

        @XmlElement(name = "AllRates", required = true)
        protected List<AllRates> allRates;
        @XmlElement(name = "SupplierSpecificInfos")
        protected SupplierSpecificInfosType supplierSpecificInfos;
        @XmlElement(name = "PriceAdjustments")
        protected ExPriceAdjustmentsType priceAdjustments;
        @XmlElement(name = "CalculatedTotal")
        protected List<TotalType> calculatedTotal;
        @XmlAttribute(name = "TimeOnly")
        @XmlSchemaType(name = "anySimpleType")
        protected String timeOnly;
        @XmlAttribute(name = "DateOnly")
        @XmlSchemaType(name = "anySimpleType")
        protected String dateOnly;
        @XmlAttribute(name = "ForDate")
        @XmlSchemaType(name = "anySimpleType")
        protected String forDate;
        @XmlAttribute(name = "ForTime")
        @XmlSchemaType(name = "anySimpleType")
        protected String forTime;

        /**
         * Gets the value of the allRates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allRates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllRates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AllRates }
         * 
         * 
         */
        public List<AllRates> getAllRates() {
            if (allRates == null) {
                allRates = new ArrayList<AllRates>();
            }
            return this.allRates;
        }

        /**
         * 获取supplierSpecificInfos属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SupplierSpecificInfosType }
         *     
         */
        public SupplierSpecificInfosType getSupplierSpecificInfos() {
            return supplierSpecificInfos;
        }

        /**
         * 设置supplierSpecificInfos属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SupplierSpecificInfosType }
         *     
         */
        public void setSupplierSpecificInfos(SupplierSpecificInfosType value) {
            this.supplierSpecificInfos = value;
        }

        /**
         * 获取priceAdjustments属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ExPriceAdjustmentsType }
         *     
         */
        public ExPriceAdjustmentsType getPriceAdjustments() {
            return priceAdjustments;
        }

        /**
         * 设置priceAdjustments属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ExPriceAdjustmentsType }
         *     
         */
        public void setPriceAdjustments(ExPriceAdjustmentsType value) {
            this.priceAdjustments = value;
        }

        /**
         * Gets the value of the calculatedTotal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calculatedTotal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCalculatedTotal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TotalType }
         * 
         * 
         */
        public List<TotalType> getCalculatedTotal() {
            if (calculatedTotal == null) {
                calculatedTotal = new ArrayList<TotalType>();
            }
            return this.calculatedTotal;
        }

        /**
         * 获取timeOnly属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeOnly() {
            return timeOnly;
        }

        /**
         * 设置timeOnly属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeOnly(String value) {
            this.timeOnly = value;
        }

        /**
         * 获取dateOnly属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateOnly() {
            return dateOnly;
        }

        /**
         * 设置dateOnly属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOnly(String value) {
            this.dateOnly = value;
        }

        /**
         * 获取forDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForDate() {
            return forDate;
        }

        /**
         * 设置forDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForDate(String value) {
            this.forDate = value;
        }

        /**
         * 获取forTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForTime() {
            return forTime;
        }

        /**
         * 设置forTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForTime(String value) {
            this.forTime = value;
        }

    }

}
