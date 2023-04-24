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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Element to descibe a redemption record stored in the database
 * 
 * <p>RedemptionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RedemptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accruals">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Accrual" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AccrualType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AvailablePoints" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Transactions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Transaction" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedemptionTransactionType">
 *                           &lt;sequence>
 *                             &lt;element name="RedeemedProduct" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_SuperPNR_RPH"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightNumberGroup"/>
 *                                     &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="RedemptionID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Points" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SPNRID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TransactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="POINTS"/>
 *             &lt;enumeration value="MILES"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RedemptionConfirmationID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="TransactionToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionType", propOrder = {
    "accruals",
    "transactions"
})
public class RedemptionType {

    @XmlElement(name = "Accruals", required = true)
    protected RedemptionType.Accruals accruals;
    @XmlElement(name = "Transactions", required = true)
    protected RedemptionType.Transactions transactions;
    @XmlAttribute(name = "RedemptionID")
    protected String redemptionID;
    @XmlAttribute(name = "TransactionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlAttribute(name = "Points")
    protected BigInteger points;
    @XmlAttribute(name = "SPNRID")
    protected String spnrid;
    @XmlAttribute(name = "TransactionType")
    protected String transactionType;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "TransactionStatus")
    protected String transactionStatus;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "RedemptionConfirmationID")
    protected String redemptionConfirmationID;
    @XmlAttribute(name = "TransactionToken")
    protected String transactionToken;

    /**
     * 获取accruals属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RedemptionType.Accruals }
     *     
     */
    public RedemptionType.Accruals getAccruals() {
        return accruals;
    }

    /**
     * 设置accruals属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionType.Accruals }
     *     
     */
    public void setAccruals(RedemptionType.Accruals value) {
        this.accruals = value;
    }

    /**
     * 获取transactions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RedemptionType.Transactions }
     *     
     */
    public RedemptionType.Transactions getTransactions() {
        return transactions;
    }

    /**
     * 设置transactions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionType.Transactions }
     *     
     */
    public void setTransactions(RedemptionType.Transactions value) {
        this.transactions = value;
    }

    /**
     * 获取redemptionID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionID() {
        return redemptionID;
    }

    /**
     * 设置redemptionID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionID(String value) {
        this.redemptionID = value;
    }

    /**
     * 获取transactionDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * 设置transactionDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * 获取points属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPoints() {
        return points;
    }

    /**
     * 设置points属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPoints(BigInteger value) {
        this.points = value;
    }

    /**
     * 获取spnrid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPNRID() {
        return spnrid;
    }

    /**
     * 设置spnrid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPNRID(String value) {
        this.spnrid = value;
    }

    /**
     * 获取transactionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * 设置transactionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取transactionStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * 设置transactionStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatus(String value) {
        this.transactionStatus = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取redemptionConfirmationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionConfirmationID() {
        return redemptionConfirmationID;
    }

    /**
     * 设置redemptionConfirmationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionConfirmationID(String value) {
        this.redemptionConfirmationID = value;
    }

    /**
     * 获取transactionToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionToken() {
        return transactionToken;
    }

    /**
     * 设置transactionToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionToken(String value) {
        this.transactionToken = value;
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
     *         &lt;element name="Accrual" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AccrualType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="AvailablePoints" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accrual"
    })
    public static class Accruals {

        @XmlElement(name = "Accrual", required = true)
        protected List<RedemptionType.Accruals.Accrual> accrual;
        @XmlAttribute(name = "AvailablePoints")
        protected BigInteger availablePoints;

        /**
         * Gets the value of the accrual property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accrual property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccrual().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RedemptionType.Accruals.Accrual }
         * 
         * 
         */
        public List<RedemptionType.Accruals.Accrual> getAccrual() {
            if (accrual == null) {
                accrual = new ArrayList<RedemptionType.Accruals.Accrual>();
            }
            return this.accrual;
        }

        /**
         * 获取availablePoints属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAvailablePoints() {
            return availablePoints;
        }

        /**
         * 设置availablePoints属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAvailablePoints(BigInteger value) {
            this.availablePoints = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AccrualType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Accrual
            extends AccrualType
        {


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
     *       &lt;sequence>
     *         &lt;element name="Transaction" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedemptionTransactionType">
     *                 &lt;sequence>
     *                   &lt;element name="RedeemedProduct" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_SuperPNR_RPH"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightNumberGroup"/>
     *                           &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
    @XmlType(name = "", propOrder = {
        "transaction"
    })
    public static class Transactions {

        @XmlElement(name = "Transaction", required = true)
        protected List<RedemptionType.Transactions.Transaction> transaction;

        /**
         * Gets the value of the transaction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transaction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransaction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RedemptionType.Transactions.Transaction }
         * 
         * 
         */
        public List<RedemptionType.Transactions.Transaction> getTransaction() {
            if (transaction == null) {
                transaction = new ArrayList<RedemptionType.Transactions.Transaction>();
            }
            return this.transaction;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedemptionTransactionType">
         *       &lt;sequence>
         *         &lt;element name="RedeemedProduct" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_SuperPNR_RPH"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightNumberGroup"/>
         *                 &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
            "redeemedProduct"
        })
        public static class Transaction
            extends RedemptionTransactionType
        {

            @XmlElement(name = "RedeemedProduct")
            protected RedemptionType.Transactions.Transaction.RedeemedProduct redeemedProduct;

            /**
             * 获取redeemedProduct属性的值。
             * 
             * @return
             *     possible object is
             *     {@link RedemptionType.Transactions.Transaction.RedeemedProduct }
             *     
             */
            public RedemptionType.Transactions.Transaction.RedeemedProduct getRedeemedProduct() {
                return redeemedProduct;
            }

            /**
             * 设置redeemedProduct属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link RedemptionType.Transactions.Transaction.RedeemedProduct }
             *     
             */
            public void setRedeemedProduct(RedemptionType.Transactions.Transaction.RedeemedProduct value) {
                this.redeemedProduct = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_SuperPNR_RPH"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightNumberGroup"/>
             *       &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RedeemedProduct {

                @XmlAttribute(name = "Origin")
                protected String origin;
                @XmlAttribute(name = "Destination")
                protected String destination;
                @XmlAttribute(name = "ProductType")
                protected String productType;
                @XmlAttribute(name = "Carrier")
                protected String carrier;
                @XmlAttribute(name = "DepartureDateTime")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar departureDateTime;
                @XmlAttribute(name = "OJ_SuperPNR_RPH")
                protected String ojSuperPNRRPH;
                @XmlAttribute(name = "FlightNumber")
                protected String flightNumber;
                @XmlAttribute(name = "FlightNumberSuffix")
                protected String flightNumberSuffix;

                /**
                 * 获取origin属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrigin() {
                    return origin;
                }

                /**
                 * 设置origin属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrigin(String value) {
                    this.origin = value;
                }

                /**
                 * 获取destination属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestination() {
                    return destination;
                }

                /**
                 * 设置destination属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestination(String value) {
                    this.destination = value;
                }

                /**
                 * 获取productType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProductType() {
                    return productType;
                }

                /**
                 * 设置productType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProductType(String value) {
                    this.productType = value;
                }

                /**
                 * 获取carrier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCarrier() {
                    return carrier;
                }

                /**
                 * 设置carrier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCarrier(String value) {
                    this.carrier = value;
                }

                /**
                 * 获取departureDateTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDepartureDateTime() {
                    return departureDateTime;
                }

                /**
                 * 设置departureDateTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDepartureDateTime(XMLGregorianCalendar value) {
                    this.departureDateTime = value;
                }

                /**
                 * 获取ojSuperPNRRPH属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOJSuperPNRRPH() {
                    return ojSuperPNRRPH;
                }

                /**
                 * 设置ojSuperPNRRPH属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOJSuperPNRRPH(String value) {
                    this.ojSuperPNRRPH = value;
                }

                /**
                 * 获取flightNumber属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFlightNumber() {
                    return flightNumber;
                }

                /**
                 * 设置flightNumber属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFlightNumber(String value) {
                    this.flightNumber = value;
                }

                /**
                 * 获取flightNumberSuffix属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFlightNumberSuffix() {
                    return flightNumberSuffix;
                }

                /**
                 * 设置flightNumberSuffix属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFlightNumberSuffix(String value) {
                    this.flightNumberSuffix = value;
                }

            }

        }

    }

}
