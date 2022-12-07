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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains a booking request for a single insurance plan
 * 
 * <p>PlanForBookRQType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PlanForBookRQType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}InsCoverageType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceCustomer" type="{http://www.opentravel.org/OTA/2003/05}InsuranceCustomerType" minOccurs="0"/>
 *         &lt;element name="PlanCost" type="{http://www.opentravel.org/OTA/2003/05}PlanCostType" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="OJT_Extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType">
 *                           &lt;attribute name="days" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Mileage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="InsuranceQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingFullInfo_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="HistoryID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanForBookRQType", propOrder = {
    "insuranceCustomer",
    "planCost",
    "uniqueID",
    "ojtExtensions",
    "ticketing"
})
public class PlanForBookRQType
    extends InsCoverageType
{

    @XmlElement(name = "InsuranceCustomer")
    protected InsuranceCustomerType insuranceCustomer;
    @XmlElement(name = "PlanCost")
    protected PlanCostType planCost;
    @XmlElement(name = "UniqueID")
    protected List<UniqueIDType> uniqueID;
    @XmlElement(name = "OJT_Extensions")
    protected PlanForBookRQType.OJTExtensions ojtExtensions;
    @XmlElement(name = "Ticketing")
    protected TicketingFullInfoType ticketing;
    @XmlAttribute(name = "HistoryID")
    @XmlSchemaType(name = "anySimpleType")
    protected String historyID;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;

    /**
     * 获取insuranceCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCustomerType }
     *     
     */
    public InsuranceCustomerType getInsuranceCustomer() {
        return insuranceCustomer;
    }

    /**
     * 设置insuranceCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCustomerType }
     *     
     */
    public void setInsuranceCustomer(InsuranceCustomerType value) {
        this.insuranceCustomer = value;
    }

    /**
     * 获取planCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PlanCostType }
     *     
     */
    public PlanCostType getPlanCost() {
        return planCost;
    }

    /**
     * 设置planCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PlanCostType }
     *     
     */
    public void setPlanCost(PlanCostType value) {
        this.planCost = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getUniqueID() {
        if (uniqueID == null) {
            uniqueID = new ArrayList<UniqueIDType>();
        }
        return this.uniqueID;
    }

    /**
     * 获取ojtExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PlanForBookRQType.OJTExtensions }
     *     
     */
    public PlanForBookRQType.OJTExtensions getOJTExtensions() {
        return ojtExtensions;
    }

    /**
     * 设置ojtExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PlanForBookRQType.OJTExtensions }
     *     
     */
    public void setOJTExtensions(PlanForBookRQType.OJTExtensions value) {
        this.ojtExtensions = value;
    }

    /**
     * 获取ticketing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TicketingFullInfoType }
     *     
     */
    public TicketingFullInfoType getTicketing() {
        return ticketing;
    }

    /**
     * 设置ticketing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingFullInfoType }
     *     
     */
    public void setTicketing(TicketingFullInfoType value) {
        this.ticketing = value;
    }

    /**
     * 获取historyID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryID() {
        return historyID;
    }

    /**
     * 设置historyID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryID(String value) {
        this.historyID = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType">
     *                 &lt;attribute name="days" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Mileage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="InsuranceQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "flightSegment",
        "insuranceQuantity"
    })
    public static class OJTExtensions {

        @XmlElement(name = "FlightSegment")
        protected List<PlanForBookRQType.OJTExtensions.FlightSegment> flightSegment;
        @XmlElement(name = "InsuranceQuantity")
        protected String insuranceQuantity;

        /**
         * Gets the value of the flightSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlanForBookRQType.OJTExtensions.FlightSegment }
         * 
         * 
         */
        public List<PlanForBookRQType.OJTExtensions.FlightSegment> getFlightSegment() {
            if (flightSegment == null) {
                flightSegment = new ArrayList<PlanForBookRQType.OJTExtensions.FlightSegment>();
            }
            return this.flightSegment;
        }

        /**
         * 获取insuranceQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsuranceQuantity() {
            return insuranceQuantity;
        }

        /**
         * 设置insuranceQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsuranceQuantity(String value) {
            this.insuranceQuantity = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType">
         *       &lt;attribute name="days" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Mileage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FlightSegment
            extends BookFlightSegmentType
        {

            @XmlAttribute(name = "days")
            @XmlSchemaType(name = "anySimpleType")
            protected String days;
            @XmlAttribute(name = "Mileage")
            @XmlSchemaType(name = "anySimpleType")
            protected String mileage;
            @XmlAttribute(name = "Duration")
            @XmlSchemaType(name = "anySimpleType")
            protected String duration;
            @XmlAttribute(name = "OriginDestinationRPH")
            @XmlSchemaType(name = "anySimpleType")
            protected String originDestinationRPH;

            /**
             * 获取days属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDays() {
                return days;
            }

            /**
             * 设置days属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDays(String value) {
                this.days = value;
            }

            /**
             * 获取mileage属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMileage() {
                return mileage;
            }

            /**
             * 设置mileage属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMileage(String value) {
                this.mileage = value;
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
             * 获取originDestinationRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginDestinationRPH() {
                return originDestinationRPH;
            }

            /**
             * 设置originDestinationRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginDestinationRPH(String value) {
                this.originDestinationRPH = value;
            }

        }

    }

}
