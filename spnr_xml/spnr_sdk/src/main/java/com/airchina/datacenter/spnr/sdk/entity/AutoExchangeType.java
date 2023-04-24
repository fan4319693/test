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
import javax.xml.bind.annotation.XmlType;


/**
 *  =notes=
 * 
 * 				1. Auto exchange is sophisticated airfare shopping that enables customers to change reservations online for partially flown and wholly unflown tickets.
 * 
 * <p>AutoExchangeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AutoExchangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeType"/>
 *         &lt;element name="Penalty" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CommPenalty" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ValueOfOldTicket" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "AutoExchangeType", propOrder = {
    "currencyCode",
    "penalty",
    "commPenalty",
    "valueOfOldTicket"
})
public class AutoExchangeType {

    @XmlElement(name = "CurrencyCode", required = true)
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "Penalty")
    protected AutoExchangeType.Penalty penalty;
    @XmlElement(name = "CommPenalty")
    protected AutoExchangeType.CommPenalty commPenalty;
    @XmlElement(name = "ValueOfOldTicket")
    protected AutoExchangeType.ValueOfOldTicket valueOfOldTicket;

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType value) {
        this.currencyCode = value;
    }

    /**
     * 获取penalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AutoExchangeType.Penalty }
     *     
     */
    public AutoExchangeType.Penalty getPenalty() {
        return penalty;
    }

    /**
     * 设置penalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AutoExchangeType.Penalty }
     *     
     */
    public void setPenalty(AutoExchangeType.Penalty value) {
        this.penalty = value;
    }

    /**
     * 获取commPenalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AutoExchangeType.CommPenalty }
     *     
     */
    public AutoExchangeType.CommPenalty getCommPenalty() {
        return commPenalty;
    }

    /**
     * 设置commPenalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AutoExchangeType.CommPenalty }
     *     
     */
    public void setCommPenalty(AutoExchangeType.CommPenalty value) {
        this.commPenalty = value;
    }

    /**
     * 获取valueOfOldTicket属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AutoExchangeType.ValueOfOldTicket }
     *     
     */
    public AutoExchangeType.ValueOfOldTicket getValueOfOldTicket() {
        return valueOfOldTicket;
    }

    /**
     * 设置valueOfOldTicket属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AutoExchangeType.ValueOfOldTicket }
     *     
     */
    public void setValueOfOldTicket(AutoExchangeType.ValueOfOldTicket value) {
        this.valueOfOldTicket = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CommPenalty {

        @XmlAttribute(name = "Amount")
        protected BigInteger amount;

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmount(BigInteger value) {
            this.amount = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Penalty {

        @XmlAttribute(name = "Amount")
        protected BigInteger amount;

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmount(BigInteger value) {
            this.amount = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ValueOfOldTicket {

        @XmlAttribute(name = "Amount")
        protected BigInteger amount;

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmount(BigInteger value) {
            this.amount = value;
        }

    }

}
