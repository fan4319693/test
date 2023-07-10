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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Full structure of a hotel reservation modification.
 * 
 * <p>HotelResModifyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelResModifyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelResModify" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
 *                 &lt;sequence>
 *                   &lt;element name="Verification" type="{http://www.opentravel.org/OTA/2003/05}VerificationType" maxOccurs="5" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ImmediateNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="OnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoutingHops" type="{http://www.opentravel.org/OTA/2003/05}RoutingHopType" minOccurs="0"/>
 *         &lt;element name="WrittenConfInst" type="{http://www.opentravel.org/OTA/2003/05}WrittenConfInstType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ModificationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelResModifyType", propOrder = {
    "hotelResModify",
    "routingHops",
    "writtenConfInst"
})
public class HotelResModifyType {

    @XmlElement(name = "HotelResModify", required = true)
    protected List<HotelResModifyType.HotelResModify> hotelResModify;
    @XmlElement(name = "RoutingHops")
    protected RoutingHopType routingHops;
    @XmlElement(name = "WrittenConfInst")
    protected WrittenConfInstType writtenConfInst;
    @XmlAttribute(name = "ModificationType")
    protected String modificationType;

    /**
     * Gets the value of the hotelResModify property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelResModify property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelResModify().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelResModifyType.HotelResModify }
     * 
     * 
     */
    public List<HotelResModifyType.HotelResModify> getHotelResModify() {
        if (hotelResModify == null) {
            hotelResModify = new ArrayList<HotelResModifyType.HotelResModify>();
        }
        return this.hotelResModify;
    }

    /**
     * 获取routingHops属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoutingHopType }
     *     
     */
    public RoutingHopType getRoutingHops() {
        return routingHops;
    }

    /**
     * 设置routingHops属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingHopType }
     *     
     */
    public void setRoutingHops(RoutingHopType value) {
        this.routingHops = value;
    }

    /**
     * 获取writtenConfInst属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WrittenConfInstType }
     *     
     */
    public WrittenConfInstType getWrittenConfInst() {
        return writtenConfInst;
    }

    /**
     * 设置writtenConfInst属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WrittenConfInstType }
     *     
     */
    public void setWrittenConfInst(WrittenConfInstType value) {
        this.writtenConfInst = value;
    }

    /**
     * 获取modificationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationType() {
        return modificationType;
    }

    /**
     * 设置modificationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationType(String value) {
        this.modificationType = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
     *       &lt;sequence>
     *         &lt;element name="Verification" type="{http://www.opentravel.org/OTA/2003/05}VerificationType" maxOccurs="5" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ImmediateNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="OnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "verification"
    })
    public static class HotelResModify
        extends HotelReservationType
    {

        @XmlElement(name = "Verification")
        protected List<VerificationType> verification;
        @XmlAttribute(name = "ImmediateNotification")
        protected Boolean immediateNotification;
        @XmlAttribute(name = "OnRequest")
        protected Boolean onRequest;
        @XmlAttribute(name = "PaymentType")
        @XmlSchemaType(name = "anySimpleType")
        protected String paymentType;

        /**
         * Gets the value of the verification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the verification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVerification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VerificationType }
         * 
         * 
         */
        public List<VerificationType> getVerification() {
            if (verification == null) {
                verification = new ArrayList<VerificationType>();
            }
            return this.verification;
        }

        /**
         * 获取immediateNotification属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isImmediateNotification() {
            return immediateNotification;
        }

        /**
         * 设置immediateNotification属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setImmediateNotification(Boolean value) {
            this.immediateNotification = value;
        }

        /**
         * 获取onRequest属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOnRequest() {
            return onRequest;
        }

        /**
         * 设置onRequest属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOnRequest(Boolean value) {
            this.onRequest = value;
        }

        /**
         * 获取paymentType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentType() {
            return paymentType;
        }

        /**
         * 设置paymentType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentType(String value) {
            this.paymentType = value;
        }

    }

}
