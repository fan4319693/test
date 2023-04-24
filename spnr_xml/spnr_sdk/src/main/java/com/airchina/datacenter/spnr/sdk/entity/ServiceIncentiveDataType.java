//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Incentive information.
 * 
 * <p>ServiceIncentiveDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceIncentiveDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Offer" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OfferCodeID">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="OfferSubCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AvailableUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="ExpirationDate" type="{http://www.opentravel.org/OTA/2003/05}DateTimeType"/>
 *                   &lt;element name="DiscountLevel" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}AmountCategoryType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
@XmlType(name = "ServiceIncentiveDataType", propOrder = {
    "offer"
})
public class ServiceIncentiveDataType {

    @XmlElement(name = "Offer", required = true)
    protected List<ServiceIncentiveDataType.Offer> offer;

    /**
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceIncentiveDataType.Offer }
     * 
     * 
     */
    public List<ServiceIncentiveDataType.Offer> getOffer() {
        if (offer == null) {
            offer = new ArrayList<ServiceIncentiveDataType.Offer>();
        }
        return this.offer;
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
     *         &lt;element name="OfferCodeID">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="OfferSubCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AvailableUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="ExpirationDate" type="{http://www.opentravel.org/OTA/2003/05}DateTimeType"/>
     *         &lt;element name="DiscountLevel" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}AmountCategoryType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "offerCodeID",
        "availableUnits",
        "expirationDate",
        "discountLevel"
    })
    public static class Offer {

        @XmlElement(name = "OfferCodeID", required = true)
        protected ServiceIncentiveDataType.Offer.OfferCodeID offerCodeID;
        @XmlElement(name = "AvailableUnits")
        protected BigInteger availableUnits;
        @XmlElement(name = "ExpirationDate", required = true)
        protected DateTimeType expirationDate;
        @XmlElement(name = "DiscountLevel")
        protected ServiceIncentiveDataType.Offer.DiscountLevel discountLevel;

        /**
         * 获取offerCodeID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ServiceIncentiveDataType.Offer.OfferCodeID }
         *     
         */
        public ServiceIncentiveDataType.Offer.OfferCodeID getOfferCodeID() {
            return offerCodeID;
        }

        /**
         * 设置offerCodeID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceIncentiveDataType.Offer.OfferCodeID }
         *     
         */
        public void setOfferCodeID(ServiceIncentiveDataType.Offer.OfferCodeID value) {
            this.offerCodeID = value;
        }

        /**
         * 获取availableUnits属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAvailableUnits() {
            return availableUnits;
        }

        /**
         * 设置availableUnits属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAvailableUnits(BigInteger value) {
            this.availableUnits = value;
        }

        /**
         * 获取expirationDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DateTimeType }
         *     
         */
        public DateTimeType getExpirationDate() {
            return expirationDate;
        }

        /**
         * 设置expirationDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeType }
         *     
         */
        public void setExpirationDate(DateTimeType value) {
            this.expirationDate = value;
        }

        /**
         * 获取discountLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ServiceIncentiveDataType.Offer.DiscountLevel }
         *     
         */
        public ServiceIncentiveDataType.Offer.DiscountLevel getDiscountLevel() {
            return discountLevel;
        }

        /**
         * 设置discountLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceIncentiveDataType.Offer.DiscountLevel }
         *     
         */
        public void setDiscountLevel(ServiceIncentiveDataType.Offer.DiscountLevel value) {
            this.discountLevel = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}AmountCategoryType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DiscountLevel {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Type", required = true)
            protected AmountCategoryType type;

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * 获取type属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AmountCategoryType }
             *     
             */
            public AmountCategoryType getType() {
                return type;
            }

            /**
             * 设置type属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AmountCategoryType }
             *     
             */
            public void setType(AmountCategoryType value) {
                this.type = value;
            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="OfferSubCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class OfferCodeID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "OfferSubCode")
            protected String offerSubCode;

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * 获取offerSubCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOfferSubCode() {
                return offerSubCode;
            }

            /**
             * 设置offerSubCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOfferSubCode(String value) {
                this.offerSubCode = value;
            }

        }

    }

}
