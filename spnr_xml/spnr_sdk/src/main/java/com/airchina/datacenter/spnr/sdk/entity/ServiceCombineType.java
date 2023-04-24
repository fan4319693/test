//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies how offers may be combined.
 * 
 * <p>ServiceCombineType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceCombineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OfferID" minOccurs="0"/>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ServiceTypeCode"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonCode"/>
 *                 &lt;attribute name="CombineInd" use="required" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
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
@XmlType(name = "ServiceCombineType", propOrder = {
    "serviceItem"
})
public class ServiceCombineType {

    @XmlElement(name = "ServiceItem", required = true)
    protected List<ServiceCombineType.ServiceItem> serviceItem;

    /**
     * Gets the value of the serviceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCombineType.ServiceItem }
     * 
     * 
     */
    public List<ServiceCombineType.ServiceItem> getServiceItem() {
        if (serviceItem == null) {
            serviceItem = new ArrayList<ServiceCombineType.ServiceItem>();
        }
        return this.serviceItem;
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
     *       &lt;choice>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OfferID" minOccurs="0"/>
     *       &lt;/choice>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ServiceTypeCode"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonCode"/>
     *       &lt;attribute name="CombineInd" use="required" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceID",
        "offerID"
    })
    public static class ServiceItem {

        @XmlElement(name = "ServiceID")
        protected ServiceID serviceID;
        @XmlElement(name = "OfferID")
        protected OfferID offerID;
        @XmlAttribute(name = "CombineInd", required = true)
        protected String combineInd;
        @XmlAttribute(name = "ServiceType")
        protected String serviceType;
        @XmlAttribute(name = "ServiceCode")
        protected String serviceCode;
        @XmlAttribute(name = "SubCode")
        protected String subCode;
        @XmlAttribute(name = "ReasonCode")
        protected String reasonCode;

        /**
         * 获取serviceID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ServiceID }
         *     
         */
        public ServiceID getServiceID() {
            return serviceID;
        }

        /**
         * 设置serviceID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceID }
         *     
         */
        public void setServiceID(ServiceID value) {
            this.serviceID = value;
        }

        /**
         * 获取offerID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OfferID }
         *     
         */
        public OfferID getOfferID() {
            return offerID;
        }

        /**
         * 设置offerID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OfferID }
         *     
         */
        public void setOfferID(OfferID value) {
            this.offerID = value;
        }

        /**
         * 获取combineInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCombineInd() {
            return combineInd;
        }

        /**
         * 设置combineInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCombineInd(String value) {
            this.combineInd = value;
        }

        /**
         * 获取serviceType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceType() {
            return serviceType;
        }

        /**
         * 设置serviceType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceType(String value) {
            this.serviceType = value;
        }

        /**
         * 获取serviceCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceCode() {
            return serviceCode;
        }

        /**
         * 设置serviceCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceCode(String value) {
            this.serviceCode = value;
        }

        /**
         * 获取subCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubCode() {
            return subCode;
        }

        /**
         * 设置subCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubCode(String value) {
            this.subCode = value;
        }

        /**
         * 获取reasonCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonCode() {
            return reasonCode;
        }

        /**
         * 设置reasonCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonCode(String value) {
            this.reasonCode = value;
        }

    }

}
