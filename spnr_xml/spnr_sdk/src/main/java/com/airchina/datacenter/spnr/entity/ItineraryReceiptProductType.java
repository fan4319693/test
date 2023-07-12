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
 * <p>ItineraryReceiptProductType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItineraryReceiptProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Recipient" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="EstimatedPrice">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                           &lt;attribute name="Local" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}OJ_RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItineraryProduct" type="{http://www.opentravel.org/OTA/2003/05}ItineraryProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvoiceInfo" type="{http://www.opentravel.org/OTA/2003/05}InvoiceInfoType" minOccurs="0"/>
 *         &lt;element name="Policy" type="{http://www.opentravel.org/OTA/2003/05}PolicyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LogisticsID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryReceiptProductType", propOrder = {
    "deliveryInfo",
    "remark",
    "itineraryProduct",
    "invoiceInfo",
    "policy"
})
public class ItineraryReceiptProductType {

    @XmlElement(name = "DeliveryInfo")
    protected ItineraryReceiptProductType.DeliveryInfo deliveryInfo;
    @XmlElement(name = "Remark")
    protected List<OJRemarkType> remark;
    @XmlElement(name = "ItineraryProduct")
    protected List<ItineraryProductType> itineraryProduct;
    @XmlElement(name = "InvoiceInfo")
    protected InvoiceInfoType invoiceInfo;
    @XmlElement(name = "Policy")
    protected List<PolicyType> policy;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "LogisticsID")
    protected String logisticsID;
    @XmlAttribute(name = "Channel")
    protected String channel;
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * 获取deliveryInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItineraryReceiptProductType.DeliveryInfo }
     *     
     */
    public ItineraryReceiptProductType.DeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    /**
     * 设置deliveryInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryReceiptProductType.DeliveryInfo }
     *     
     */
    public void setDeliveryInfo(ItineraryReceiptProductType.DeliveryInfo value) {
        this.deliveryInfo = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OJRemarkType }
     * 
     * 
     */
    public List<OJRemarkType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<OJRemarkType>();
        }
        return this.remark;
    }

    /**
     * Gets the value of the itineraryProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryProductType }
     * 
     * 
     */
    public List<ItineraryProductType> getItineraryProduct() {
        if (itineraryProduct == null) {
            itineraryProduct = new ArrayList<ItineraryProductType>();
        }
        return this.itineraryProduct;
    }

    /**
     * 获取invoiceInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInfoType }
     *     
     */
    public InvoiceInfoType getInvoiceInfo() {
        return invoiceInfo;
    }

    /**
     * 设置invoiceInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInfoType }
     *     
     */
    public void setInvoiceInfo(InvoiceInfoType value) {
        this.invoiceInfo = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyType }
     * 
     * 
     */
    public List<PolicyType> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<PolicyType>();
        }
        return this.policy;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * 获取logisticsID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsID() {
        return logisticsID;
    }

    /**
     * 设置logisticsID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsID(String value) {
        this.logisticsID = value;
    }

    /**
     * 获取channel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置channel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

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
     *         &lt;element name="Recipient" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="EstimatedPrice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                 &lt;attribute name="Local" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recipient",
        "estimatedPrice"
    })
    public static class DeliveryInfo {

        @XmlElement(name = "Recipient")
        protected List<ContactPersonType> recipient;
        @XmlElement(name = "EstimatedPrice", required = true)
        protected ItineraryReceiptProductType.DeliveryInfo.EstimatedPrice estimatedPrice;
        @XmlAttribute(name = "TrackingNumber")
        protected String trackingNumber;

        /**
         * Gets the value of the recipient property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recipient property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecipient().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactPersonType }
         * 
         * 
         */
        public List<ContactPersonType> getRecipient() {
            if (recipient == null) {
                recipient = new ArrayList<ContactPersonType>();
            }
            return this.recipient;
        }

        /**
         * 获取estimatedPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ItineraryReceiptProductType.DeliveryInfo.EstimatedPrice }
         *     
         */
        public ItineraryReceiptProductType.DeliveryInfo.EstimatedPrice getEstimatedPrice() {
            return estimatedPrice;
        }

        /**
         * 设置estimatedPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ItineraryReceiptProductType.DeliveryInfo.EstimatedPrice }
         *     
         */
        public void setEstimatedPrice(ItineraryReceiptProductType.DeliveryInfo.EstimatedPrice value) {
            this.estimatedPrice = value;
        }

        /**
         * 获取trackingNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrackingNumber() {
            return trackingNumber;
        }

        /**
         * 设置trackingNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrackingNumber(String value) {
            this.trackingNumber = value;
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
         *       &lt;attribute name="Local" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EstimatedPrice {

            @XmlAttribute(name = "Local")
            protected Boolean local;
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
             * 获取local属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLocal() {
                return local;
            }

            /**
             * 设置local属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLocal(Boolean value) {
                this.local = value;
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
