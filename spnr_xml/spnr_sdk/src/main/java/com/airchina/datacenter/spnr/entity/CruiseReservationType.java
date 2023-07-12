//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CruiseReservationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CruiseReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SailingInfo" type="{http://www.opentravel.org/OTA/2003/05}SailingCategoryInfoType"/>
 *         &lt;element name="SailingProfile" type="{http://www.opentravel.org/OTA/2003/05}CruiseProfileType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="ReservationInfo" type="{http://www.opentravel.org/OTA/2003/05}CruiseGuestInfoType"/>
 *         &lt;element name="PaymentsDue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentDue" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="PaymentNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                           &lt;attribute name="DueDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Information" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseReservationType", propOrder = {
    "sailingInfo",
    "sailingProfile",
    "reservationInfo",
    "paymentsDue",
    "information"
})
public class CruiseReservationType {

    @XmlElement(name = "SailingInfo", required = true)
    protected SailingCategoryInfoType sailingInfo;
    @XmlElement(name = "SailingProfile")
    protected List<CruiseProfileType> sailingProfile;
    @XmlElement(name = "ReservationInfo", required = true)
    protected CruiseGuestInfoType reservationInfo;
    @XmlElement(name = "PaymentsDue")
    protected CruiseReservationType.PaymentsDue paymentsDue;
    @XmlElement(name = "Information")
    protected List<ParagraphType> information;

    /**
     * 获取sailingInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SailingCategoryInfoType }
     *     
     */
    public SailingCategoryInfoType getSailingInfo() {
        return sailingInfo;
    }

    /**
     * 设置sailingInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SailingCategoryInfoType }
     *     
     */
    public void setSailingInfo(SailingCategoryInfoType value) {
        this.sailingInfo = value;
    }

    /**
     * Gets the value of the sailingProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sailingProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSailingProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseProfileType }
     * 
     * 
     */
    public List<CruiseProfileType> getSailingProfile() {
        if (sailingProfile == null) {
            sailingProfile = new ArrayList<CruiseProfileType>();
        }
        return this.sailingProfile;
    }

    /**
     * 获取reservationInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestInfoType }
     *     
     */
    public CruiseGuestInfoType getReservationInfo() {
        return reservationInfo;
    }

    /**
     * 设置reservationInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestInfoType }
     *     
     */
    public void setReservationInfo(CruiseGuestInfoType value) {
        this.reservationInfo = value;
    }

    /**
     * 获取paymentsDue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CruiseReservationType.PaymentsDue }
     *     
     */
    public CruiseReservationType.PaymentsDue getPaymentsDue() {
        return paymentsDue;
    }

    /**
     * 设置paymentsDue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseReservationType.PaymentsDue }
     *     
     */
    public void setPaymentsDue(CruiseReservationType.PaymentsDue value) {
        this.paymentsDue = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getInformation() {
        if (information == null) {
            information = new ArrayList<ParagraphType>();
        }
        return this.information;
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
     *         &lt;element name="PaymentDue" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="PaymentNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *                 &lt;attribute name="DueDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
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
    @XmlType(name = "", propOrder = {
        "paymentDue"
    })
    public static class PaymentsDue {

        @XmlElement(name = "PaymentDue", required = true)
        protected List<CruiseReservationType.PaymentsDue.PaymentDue> paymentDue;

        /**
         * Gets the value of the paymentDue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentDue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentDue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseReservationType.PaymentsDue.PaymentDue }
         * 
         * 
         */
        public List<CruiseReservationType.PaymentsDue.PaymentDue> getPaymentDue() {
            if (paymentDue == null) {
                paymentDue = new ArrayList<CruiseReservationType.PaymentsDue.PaymentDue>();
            }
            return this.paymentDue;
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
         *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="PaymentNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
         *       &lt;attribute name="DueDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PaymentDue {

            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "PaymentNumber")
            protected Integer paymentNumber;
            @XmlAttribute(name = "DueDate")
            protected String dueDate;

            /**
             * 获取amount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * 设置amount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

            /**
             * 获取paymentNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPaymentNumber() {
                return paymentNumber;
            }

            /**
             * 设置paymentNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPaymentNumber(Integer value) {
                this.paymentNumber = value;
            }

            /**
             * 获取dueDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDueDate() {
                return dueDate;
            }

            /**
             * 设置dueDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDueDate(String value) {
                this.dueDate = value;
            }

        }

    }

}
