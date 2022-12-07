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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The VehicleReservationType complex type identifies the data that describes a vehicle reservation.  This data includes information on the customer(s) associated with the rental and details on the vehicle that is being rented.
 * 
 * <p>VehicleReservationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerPrimaryAdditionalType">
 *                 &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Historic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehSegmentCore">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentCoreType">
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehSegmentInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentAdditionalInfoType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
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
@XmlType(name = "VehicleReservationType", propOrder = {
    "customer",
    "vehSegmentCore",
    "vehSegmentInfo"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.ProductBase.Vehicle.class
})
public class VehicleReservationType {

    @XmlElement(name = "Customer", required = true)
    protected VehicleReservationType.Customer customer;
    @XmlElement(name = "VehSegmentCore", required = true)
    protected VehicleReservationType.VehSegmentCore vehSegmentCore;
    @XmlElement(name = "VehSegmentInfo")
    protected VehicleReservationType.VehSegmentInfo vehSegmentInfo;

    /**
     * 获取customer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationType.Customer }
     *     
     */
    public VehicleReservationType.Customer getCustomer() {
        return customer;
    }

    /**
     * 设置customer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationType.Customer }
     *     
     */
    public void setCustomer(VehicleReservationType.Customer value) {
        this.customer = value;
    }

    /**
     * 获取vehSegmentCore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationType.VehSegmentCore }
     *     
     */
    public VehicleReservationType.VehSegmentCore getVehSegmentCore() {
        return vehSegmentCore;
    }

    /**
     * 设置vehSegmentCore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationType.VehSegmentCore }
     *     
     */
    public void setVehSegmentCore(VehicleReservationType.VehSegmentCore value) {
        this.vehSegmentCore = value;
    }

    /**
     * 获取vehSegmentInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationType.VehSegmentInfo }
     *     
     */
    public VehicleReservationType.VehSegmentInfo getVehSegmentInfo() {
        return vehSegmentInfo;
    }

    /**
     * 设置vehSegmentInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationType.VehSegmentInfo }
     *     
     */
    public void setVehSegmentInfo(VehicleReservationType.VehSegmentInfo value) {
        this.vehSegmentInfo = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerPrimaryAdditionalType">
     *       &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Historic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Customer
        extends CustomerPrimaryAdditionalType
    {

        @XmlAttribute(name = "AuditID")
        protected Integer auditID;
        @XmlAttribute(name = "CustomerID")
        protected Integer customerID;
        @XmlAttribute(name = "Historic")
        protected Boolean historic;

        /**
         * 获取auditID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAuditID() {
            return auditID;
        }

        /**
         * 设置auditID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAuditID(Integer value) {
            this.auditID = value;
        }

        /**
         * 获取customerID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCustomerID() {
            return customerID;
        }

        /**
         * 设置customerID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCustomerID(Integer value) {
            this.customerID = value;
        }

        /**
         * 获取historic属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHistoric() {
            return historic;
        }

        /**
         * 设置historic属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHistoric(Boolean value) {
            this.historic = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentCoreType">
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehSegmentCore
        extends VehicleSegmentCoreType
    {

        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * 获取rph属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * 设置rph属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentAdditionalInfoType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehSegmentInfo
        extends VehicleSegmentAdditionalInfoType
    {

        @XmlAttribute(name = "DocumentationRequired")
        protected String documentationRequired;
        @XmlAttribute(name = "DocReqExclCountries")
        protected List<String> docReqExclCountries;
        @XmlAttribute(name = "DocReqInclCountries")
        protected List<String> docReqInclCountries;

        /**
         * 获取documentationRequired属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentationRequired() {
            return documentationRequired;
        }

        /**
         * 设置documentationRequired属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentationRequired(String value) {
            this.documentationRequired = value;
        }

        /**
         * Gets the value of the docReqExclCountries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docReqExclCountries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocReqExclCountries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDocReqExclCountries() {
            if (docReqExclCountries == null) {
                docReqExclCountries = new ArrayList<String>();
            }
            return this.docReqExclCountries;
        }

        /**
         * Gets the value of the docReqInclCountries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docReqInclCountries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocReqInclCountries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDocReqInclCountries() {
            if (docReqInclCountries == null) {
                docReqInclCountries = new ArrayList<String>();
            }
            return this.docReqInclCountries;
        }

    }

}
