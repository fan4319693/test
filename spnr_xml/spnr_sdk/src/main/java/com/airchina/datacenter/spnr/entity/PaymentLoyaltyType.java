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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentLoyaltyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentLoyaltyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Earn" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}EarnType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Redeem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
 *                 &lt;sequence>
 *                   &lt;element name="SubRedeem" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
 *                           &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="CashRangeLowEnd" type="{http://www.w3.org/2001/XMLSchema}float" />
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
@XmlType(name = "PaymentLoyaltyType", propOrder = {
    "earn",
    "redeem"
})
public class PaymentLoyaltyType {

    @XmlElement(name = "Earn")
    protected PaymentLoyaltyType.Earn earn;
    @XmlElement(name = "Redeem")
    protected List<PaymentLoyaltyType.Redeem> redeem;

    /**
     * 获取earn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentLoyaltyType.Earn }
     *     
     */
    public PaymentLoyaltyType.Earn getEarn() {
        return earn;
    }

    /**
     * 设置earn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentLoyaltyType.Earn }
     *     
     */
    public void setEarn(PaymentLoyaltyType.Earn value) {
        this.earn = value;
    }

    /**
     * Gets the value of the redeem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redeem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedeem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentLoyaltyType.Redeem }
     * 
     * 
     */
    public List<PaymentLoyaltyType.Redeem> getRedeem() {
        if (redeem == null) {
            redeem = new ArrayList<PaymentLoyaltyType.Redeem>();
        }
        return this.redeem;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}EarnType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Earn
        extends EarnType
    {


    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
     *       &lt;sequence>
     *         &lt;element name="SubRedeem" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
     *                 &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="CashRangeLowEnd" type="{http://www.w3.org/2001/XMLSchema}float" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subRedeem"
    })
    public static class Redeem
        extends RedeemType
    {

        @XmlElement(name = "SubRedeem")
        protected PaymentLoyaltyType.Redeem.SubRedeem subRedeem;
        @XmlAttribute(name = "CashRangeLowEnd")
        protected Float cashRangeLowEnd;

        /**
         * 获取subRedeem属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PaymentLoyaltyType.Redeem.SubRedeem }
         *     
         */
        public PaymentLoyaltyType.Redeem.SubRedeem getSubRedeem() {
            return subRedeem;
        }

        /**
         * 设置subRedeem属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentLoyaltyType.Redeem.SubRedeem }
         *     
         */
        public void setSubRedeem(PaymentLoyaltyType.Redeem.SubRedeem value) {
            this.subRedeem = value;
        }

        /**
         * 获取cashRangeLowEnd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getCashRangeLowEnd() {
            return cashRangeLowEnd;
        }

        /**
         * 设置cashRangeLowEnd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setCashRangeLowEnd(Float value) {
            this.cashRangeLowEnd = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
         *       &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SubRedeem
            extends RedeemType
        {

            @XmlAttribute(name = "AuditID")
            protected BigInteger auditID;

            /**
             * 获取auditID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAuditID() {
                return auditID;
            }

            /**
             * 设置auditID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAuditID(BigInteger value) {
                this.auditID = value;
            }

        }

    }

}
