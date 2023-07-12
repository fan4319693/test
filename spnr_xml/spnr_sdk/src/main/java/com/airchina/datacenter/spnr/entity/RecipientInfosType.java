//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about one or more recipients.
 * 
 * <p>RecipientInfosType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RecipientInfosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecipientInfo" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
 *                 &lt;sequence>
 *                   &lt;element name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="ShippingInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                           &lt;attribute name="ShippingType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="ShippingCarrier" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Comments" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
@XmlType(name = "RecipientInfosType", propOrder = {
    "recipientInfo"
})
public class RecipientInfosType {

    @XmlElement(name = "RecipientInfo", required = true)
    protected List<RecipientInfosType.RecipientInfo> recipientInfo;

    /**
     * Gets the value of the recipientInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipientInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipientInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipientInfosType.RecipientInfo }
     * 
     * 
     */
    public List<RecipientInfosType.RecipientInfo> getRecipientInfo() {
        if (recipientInfo == null) {
            recipientInfo = new ArrayList<RecipientInfosType.RecipientInfo>();
        }
        return this.recipientInfo;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
     *       &lt;sequence>
     *         &lt;element name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="ShippingInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                 &lt;attribute name="ShippingType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="ShippingCarrier" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Comments" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reservationID",
        "shippingInfo",
        "comments"
    })
    public static class RecipientInfo
        extends ContactPersonType
    {

        @XmlElement(name = "ReservationID")
        protected List<UniqueIDType> reservationID;
        @XmlElement(name = "ShippingInfo")
        protected RecipientInfosType.RecipientInfo.ShippingInfo shippingInfo;
        @XmlElement(name = "Comments")
        protected RecipientInfosType.RecipientInfo.Comments comments;

        /**
         * Gets the value of the reservationID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reservationID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReservationID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UniqueIDType }
         * 
         * 
         */
        public List<UniqueIDType> getReservationID() {
            if (reservationID == null) {
                reservationID = new ArrayList<UniqueIDType>();
            }
            return this.reservationID;
        }

        /**
         * 获取shippingInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RecipientInfosType.RecipientInfo.ShippingInfo }
         *     
         */
        public RecipientInfosType.RecipientInfo.ShippingInfo getShippingInfo() {
            return shippingInfo;
        }

        /**
         * 设置shippingInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RecipientInfosType.RecipientInfo.ShippingInfo }
         *     
         */
        public void setShippingInfo(RecipientInfosType.RecipientInfo.ShippingInfo value) {
            this.shippingInfo = value;
        }

        /**
         * 获取comments属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RecipientInfosType.RecipientInfo.Comments }
         *     
         */
        public RecipientInfosType.RecipientInfo.Comments getComments() {
            return comments;
        }

        /**
         * 设置comments属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RecipientInfosType.RecipientInfo.Comments }
         *     
         */
        public void setComments(RecipientInfosType.RecipientInfo.Comments value) {
            this.comments = value;
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
         *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/>
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
            "comment"
        })
        public static class Comments {

            @XmlElement(name = "Comment", required = true)
            protected List<ParagraphType> comment;

            /**
             * Gets the value of the comment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the comment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ParagraphType }
             * 
             * 
             */
            public List<ParagraphType> getComment() {
                if (comment == null) {
                    comment = new ArrayList<ParagraphType>();
                }
                return this.comment;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *       &lt;attribute name="ShippingType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="ShippingCarrier" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ShippingInfo {

            @XmlAttribute(name = "ShippingType")
            protected String shippingType;
            @XmlAttribute(name = "ShippingCarrier")
            protected String shippingCarrier;
            @XmlAttribute(name = "Amount")
            protected Float amount;
            @XmlAttribute(name = "BaseAmount")
            protected Float baseAmount;
            @XmlAttribute(name = "PrePayInd")
            protected Boolean prePayInd;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;
            @XmlAttribute(name = "OriginalAmount")
            protected Float originalAmount;
            @XmlAttribute(name = "OriginalCurrencyCode")
            protected String originalCurrencyCode;

            /**
             * 获取shippingType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShippingType() {
                return shippingType;
            }

            /**
             * 设置shippingType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShippingType(String value) {
                this.shippingType = value;
            }

            /**
             * 获取shippingCarrier属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShippingCarrier() {
                return shippingCarrier;
            }

            /**
             * 设置shippingCarrier属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShippingCarrier(String value) {
                this.shippingCarrier = value;
            }

            /**
             * 获取amount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getAmount() {
                return amount;
            }

            /**
             * 设置amount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setAmount(Float value) {
                this.amount = value;
            }

            /**
             * 获取baseAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getBaseAmount() {
                return baseAmount;
            }

            /**
             * 设置baseAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setBaseAmount(Float value) {
                this.baseAmount = value;
            }

            /**
             * 获取prePayInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPrePayInd() {
                return prePayInd;
            }

            /**
             * 设置prePayInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPrePayInd(Boolean value) {
                this.prePayInd = value;
            }

            /**
             * 获取currencyCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * 设置currencyCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * 获取decimalPlaces属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * 设置decimalPlaces属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
            }

            /**
             * 获取originalAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getOriginalAmount() {
                return originalAmount;
            }

            /**
             * 设置originalAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setOriginalAmount(Float value) {
                this.originalAmount = value;
            }

            /**
             * 获取originalCurrencyCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalCurrencyCode() {
                return originalCurrencyCode;
            }

            /**
             * 设置originalCurrencyCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalCurrencyCode(String value) {
                this.originalCurrencyCode = value;
            }

        }

    }

}
