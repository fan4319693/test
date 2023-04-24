//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>PaymentDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Balance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPaymentType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Payments" type="{http://www.opentravel.org/OTA/2003/05}PaymentsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="CollectionMethod">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="cheque"/>
 *             &lt;enumeration value="confirmcard"/>
 *             &lt;enumeration value="autocard"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="TimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsType", propOrder = {
    "balance",
    "payments"
})
public class PaymentDetailsType {

    @XmlElement(name = "Balance")
    protected PaymentDetailsType.Balance balance;
    @XmlElement(name = "Payments", required = true)
    protected PaymentsType payments;
    @XmlAttribute(name = "DueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlAttribute(name = "CollectionMethod")
    protected String collectionMethod;
    @XmlAttribute(name = "LastModified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlAttribute(name = "TimeLimit")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeLimit;

    /**
     * 获取balance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailsType.Balance }
     *     
     */
    public PaymentDetailsType.Balance getBalance() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailsType.Balance }
     *     
     */
    public void setBalance(PaymentDetailsType.Balance value) {
        this.balance = value;
    }

    /**
     * 获取payments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentsType }
     *     
     */
    public PaymentsType getPayments() {
        return payments;
    }

    /**
     * 设置payments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsType }
     *     
     */
    public void setPayments(PaymentsType value) {
        this.payments = value;
    }

    /**
     * 获取dueDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * 设置dueDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * 获取collectionMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionMethod() {
        return collectionMethod;
    }

    /**
     * 设置collectionMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionMethod(String value) {
        this.collectionMethod = value;
    }

    /**
     * 获取lastModified属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * 设置lastModified属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * 获取timeLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLimit() {
        return timeLimit;
    }

    /**
     * 设置timeLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLimit(XMLGregorianCalendar value) {
        this.timeLimit = value;
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
     *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPaymentType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "loyalty"
    })
    public static class Balance {

        @XmlElement(name = "Loyalty")
        protected LoyaltyPaymentType loyalty;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "anySimpleType")
        protected String quantity;
        @XmlAttribute(name = "Amount")
        protected Float amount;
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
         * 获取loyalty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LoyaltyPaymentType }
         *     
         */
        public LoyaltyPaymentType getLoyalty() {
            return loyalty;
        }

        /**
         * 设置loyalty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LoyaltyPaymentType }
         *     
         */
        public void setLoyalty(LoyaltyPaymentType value) {
            this.loyalty = value;
        }

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantity(String value) {
            this.quantity = value;
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
