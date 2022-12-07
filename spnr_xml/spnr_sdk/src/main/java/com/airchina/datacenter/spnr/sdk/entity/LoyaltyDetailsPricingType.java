//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LoyaltyDetailsPricingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LoyaltyDetailsPricingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Combinations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Combination" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Cash" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                       &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
 *                                       &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="PTCReference_List" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Redemption" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                       &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
 *                                       &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *                                       &lt;element name="Redeem" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
 *                                               &lt;attribute name="LoyaltyLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="PTCReference_List" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Earn" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}EarnType">
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PTCs" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}LoyaltyPTCType">
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="CurrencyCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="InsufficientBalance" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="BookingRateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RateReferenceContext">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="EXTERNAL"/>
 *                                 &lt;enumeration value="INTERNAL"/>
 *                                 &lt;enumeration value="BOTH"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="POINTS"/>
 *                                 &lt;enumeration value="CASH"/>
 *                                 &lt;enumeration value="MIXED"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="CheapestLoyalty" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="CheapestCash" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="PercentageOf" type="{http://www.opentravel.org/OTA/2003/05}PercentageOfString" />
 *                           &lt;attribute name="EarnQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="LoyaltyId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="LoyaltyReference_List" type="{http://www.opentravel.org/OTA/2003/05}IDList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyDetailsPricingType", propOrder = {
    "combinations"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyPricingType.Combinations.Combination.LoyaltyDetails.class
})
public class LoyaltyDetailsPricingType {

    @XmlElement(name = "Combinations", required = true)
    protected LoyaltyDetailsPricingType.Combinations combinations;
    @XmlAttribute(name = "ID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger id;
    @XmlAttribute(name = "LoyaltyReference_List")
    protected List<BigInteger> loyaltyReferenceList;

    /**
     * 获取combinations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyDetailsPricingType.Combinations }
     *     
     */
    public LoyaltyDetailsPricingType.Combinations getCombinations() {
        return combinations;
    }

    /**
     * 设置combinations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyDetailsPricingType.Combinations }
     *     
     */
    public void setCombinations(LoyaltyDetailsPricingType.Combinations value) {
        this.combinations = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the loyaltyReferenceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyReferenceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyReferenceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLoyaltyReferenceList() {
        if (loyaltyReferenceList == null) {
            loyaltyReferenceList = new ArrayList<BigInteger>();
        }
        return this.loyaltyReferenceList;
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
     *         &lt;element name="Combination" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Cash" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                             &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
     *                             &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="PTCReference_List" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Redemption" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                             &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
     *                             &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
     *                             &lt;element name="Redeem" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
     *                                     &lt;attribute name="LoyaltyLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="PTCReference_List" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Earn" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}EarnType">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PTCs" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}LoyaltyPTCType">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="CurrencyCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="InsufficientBalance" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="BookingRateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RateReferenceContext">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="EXTERNAL"/>
     *                       &lt;enumeration value="INTERNAL"/>
     *                       &lt;enumeration value="BOTH"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="POINTS"/>
     *                       &lt;enumeration value="CASH"/>
     *                       &lt;enumeration value="MIXED"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="CheapestLoyalty" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="CheapestCash" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="PercentageOf" type="{http://www.opentravel.org/OTA/2003/05}PercentageOfString" />
     *                 &lt;attribute name="EarnQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="LoyaltyId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
        "combination"
    })
    public static class Combinations {

        @XmlElement(name = "Combination", required = true)
        protected List<LoyaltyDetailsPricingType.Combinations.Combination> combination;

        /**
         * Gets the value of the combination property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the combination property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCombination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LoyaltyDetailsPricingType.Combinations.Combination }
         * 
         * 
         */
        public List<LoyaltyDetailsPricingType.Combinations.Combination> getCombination() {
            if (combination == null) {
                combination = new ArrayList<LoyaltyDetailsPricingType.Combinations.Combination>();
            }
            return this.combination;
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
         *         &lt;element name="Cash" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                   &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
         *                   &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="PTCReference_List" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Redemption" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                   &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
         *                   &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
         *                   &lt;element name="Redeem" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
         *                           &lt;attribute name="LoyaltyLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="PTCReference_List" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Earn" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}EarnType">
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PTCs" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}LoyaltyPTCType">
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="CurrencyCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="InsufficientBalance" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="BookingRateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RateReferenceContext">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="EXTERNAL"/>
         *             &lt;enumeration value="INTERNAL"/>
         *             &lt;enumeration value="BOTH"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="POINTS"/>
         *             &lt;enumeration value="CASH"/>
         *             &lt;enumeration value="MIXED"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="CheapestLoyalty" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="CheapestCash" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="PercentageOf" type="{http://www.opentravel.org/OTA/2003/05}PercentageOfString" />
         *       &lt;attribute name="EarnQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="LoyaltyId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cash",
            "redemption",
            "earn",
            "ptCs"
        })
        public static class Combination {

            @XmlElement(name = "Cash")
            protected List<LoyaltyDetailsPricingType.Combinations.Combination.Cash> cash;
            @XmlElement(name = "Redemption")
            protected LoyaltyDetailsPricingType.Combinations.Combination.Redemption redemption;
            @XmlElement(name = "Earn")
            protected LoyaltyDetailsPricingType.Combinations.Combination.Earn earn;
            @XmlElement(name = "PTCs")
            protected LoyaltyDetailsPricingType.Combinations.Combination.PTCs ptCs;
            @XmlAttribute(name = "RPH", required = true)
            protected String rph;
            @XmlAttribute(name = "Amount", required = true)
            protected float amount;
            @XmlAttribute(name = "TaxAmount")
            protected Float taxAmount;
            @XmlAttribute(name = "CurrencyCode", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String currencyCode;
            @XmlAttribute(name = "Quantity", required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;
            @XmlAttribute(name = "InsufficientBalance")
            @XmlSchemaType(name = "anySimpleType")
            protected String insufficientBalance;
            @XmlAttribute(name = "BookingRateReference")
            protected String bookingRateReference;
            @XmlAttribute(name = "RateReferenceContext")
            protected String rateReferenceContext;
            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "Sequence")
            @XmlSchemaType(name = "anySimpleType")
            protected String sequence;
            @XmlAttribute(name = "Code")
            @XmlSchemaType(name = "anySimpleType")
            protected String code;
            @XmlAttribute(name = "CheapestLoyalty")
            @XmlSchemaType(name = "anySimpleType")
            protected String cheapestLoyalty;
            @XmlAttribute(name = "CheapestCash")
            @XmlSchemaType(name = "anySimpleType")
            protected String cheapestCash;
            @XmlAttribute(name = "Percentage")
            protected BigDecimal percentage;
            @XmlAttribute(name = "PercentageOf")
            protected String percentageOf;
            @XmlAttribute(name = "EarnQuantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger earnQuantity;
            @XmlAttribute(name = "LoyaltyId")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger loyaltyId;

            /**
             * Gets the value of the cash property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cash property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCash().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LoyaltyDetailsPricingType.Combinations.Combination.Cash }
             * 
             * 
             */
            public List<LoyaltyDetailsPricingType.Combinations.Combination.Cash> getCash() {
                if (cash == null) {
                    cash = new ArrayList<LoyaltyDetailsPricingType.Combinations.Combination.Cash>();
                }
                return this.cash;
            }

            /**
             * 获取redemption属性的值。
             * 
             * @return
             *     possible object is
             *     {@link LoyaltyDetailsPricingType.Combinations.Combination.Redemption }
             *     
             */
            public LoyaltyDetailsPricingType.Combinations.Combination.Redemption getRedemption() {
                return redemption;
            }

            /**
             * 设置redemption属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link LoyaltyDetailsPricingType.Combinations.Combination.Redemption }
             *     
             */
            public void setRedemption(LoyaltyDetailsPricingType.Combinations.Combination.Redemption value) {
                this.redemption = value;
            }

            /**
             * 获取earn属性的值。
             * 
             * @return
             *     possible object is
             *     {@link LoyaltyDetailsPricingType.Combinations.Combination.Earn }
             *     
             */
            public LoyaltyDetailsPricingType.Combinations.Combination.Earn getEarn() {
                return earn;
            }

            /**
             * 设置earn属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link LoyaltyDetailsPricingType.Combinations.Combination.Earn }
             *     
             */
            public void setEarn(LoyaltyDetailsPricingType.Combinations.Combination.Earn value) {
                this.earn = value;
            }

            /**
             * 获取ptCs属性的值。
             * 
             * @return
             *     possible object is
             *     {@link LoyaltyDetailsPricingType.Combinations.Combination.PTCs }
             *     
             */
            public LoyaltyDetailsPricingType.Combinations.Combination.PTCs getPTCs() {
                return ptCs;
            }

            /**
             * 设置ptCs属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link LoyaltyDetailsPricingType.Combinations.Combination.PTCs }
             *     
             */
            public void setPTCs(LoyaltyDetailsPricingType.Combinations.Combination.PTCs value) {
                this.ptCs = value;
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
             * 获取amount属性的值。
             * 
             */
            public float getAmount() {
                return amount;
            }

            /**
             * 设置amount属性的值。
             * 
             */
            public void setAmount(float value) {
                this.amount = value;
            }

            /**
             * 获取taxAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getTaxAmount() {
                return taxAmount;
            }

            /**
             * 设置taxAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setTaxAmount(Float value) {
                this.taxAmount = value;
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
             * 获取quantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantity() {
                return quantity;
            }

            /**
             * 设置quantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }

            /**
             * 获取insufficientBalance属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInsufficientBalance() {
                return insufficientBalance;
            }

            /**
             * 设置insufficientBalance属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInsufficientBalance(String value) {
                this.insufficientBalance = value;
            }

            /**
             * 获取bookingRateReference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBookingRateReference() {
                return bookingRateReference;
            }

            /**
             * 设置bookingRateReference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBookingRateReference(String value) {
                this.bookingRateReference = value;
            }

            /**
             * 获取rateReferenceContext属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRateReferenceContext() {
                return rateReferenceContext;
            }

            /**
             * 设置rateReferenceContext属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRateReferenceContext(String value) {
                this.rateReferenceContext = value;
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
             * 获取sequence属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSequence() {
                return sequence;
            }

            /**
             * 设置sequence属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSequence(String value) {
                this.sequence = value;
            }

            /**
             * 获取code属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * 设置code属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * 获取cheapestLoyalty属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheapestLoyalty() {
                return cheapestLoyalty;
            }

            /**
             * 设置cheapestLoyalty属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheapestLoyalty(String value) {
                this.cheapestLoyalty = value;
            }

            /**
             * 获取cheapestCash属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheapestCash() {
                return cheapestCash;
            }

            /**
             * 设置cheapestCash属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheapestCash(String value) {
                this.cheapestCash = value;
            }

            /**
             * 获取percentage属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercentage() {
                return percentage;
            }

            /**
             * 设置percentage属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercentage(BigDecimal value) {
                this.percentage = value;
            }

            /**
             * 获取percentageOf属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPercentageOf() {
                return percentageOf;
            }

            /**
             * 设置percentageOf属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPercentageOf(String value) {
                this.percentageOf = value;
            }

            /**
             * 获取earnQuantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getEarnQuantity() {
                return earnQuantity;
            }

            /**
             * 设置earnQuantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setEarnQuantity(BigInteger value) {
                this.earnQuantity = value;
            }

            /**
             * 获取loyaltyId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLoyaltyId() {
                return loyaltyId;
            }

            /**
             * 设置loyaltyId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLoyaltyId(BigInteger value) {
                this.loyaltyId = value;
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
             *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *         &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
             *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType"/>
             *       &lt;/sequence>
             *       &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="PTCReference_List" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "priceAdjustments",
                "formulas",
                "total"
            })
            public static class Cash {

                @XmlElement(name = "PriceAdjustments")
                protected ExPriceAdjustmentsType priceAdjustments;
                @XmlElement(name = "Formulas")
                protected FormulasType formulas;
                @XmlElement(name = "Total", required = true)
                protected TotalType total;
                @XmlAttribute(name = "RateReference")
                protected String rateReference;
                @XmlAttribute(name = "PTCReference_List")
                protected String ptcReferenceList;

                /**
                 * 获取priceAdjustments属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ExPriceAdjustmentsType }
                 *     
                 */
                public ExPriceAdjustmentsType getPriceAdjustments() {
                    return priceAdjustments;
                }

                /**
                 * 设置priceAdjustments属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ExPriceAdjustmentsType }
                 *     
                 */
                public void setPriceAdjustments(ExPriceAdjustmentsType value) {
                    this.priceAdjustments = value;
                }

                /**
                 * 获取formulas属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link FormulasType }
                 *     
                 */
                public FormulasType getFormulas() {
                    return formulas;
                }

                /**
                 * 设置formulas属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FormulasType }
                 *     
                 */
                public void setFormulas(FormulasType value) {
                    this.formulas = value;
                }

                /**
                 * 获取total属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TotalType }
                 *     
                 */
                public TotalType getTotal() {
                    return total;
                }

                /**
                 * 设置total属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TotalType }
                 *     
                 */
                public void setTotal(TotalType value) {
                    this.total = value;
                }

                /**
                 * 获取rateReference属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRateReference() {
                    return rateReference;
                }

                /**
                 * 设置rateReference属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRateReference(String value) {
                    this.rateReference = value;
                }

                /**
                 * 获取ptcReferenceList属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPTCReferenceList() {
                    return ptcReferenceList;
                }

                /**
                 * 设置ptcReferenceList属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPTCReferenceList(String value) {
                    this.ptcReferenceList = value;
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
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}LoyaltyPTCType">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PTCs
                extends LoyaltyPTCType
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
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *         &lt;element name="Formulas" type="{http://www.opentravel.org/OTA/2003/05}FormulasType" minOccurs="0"/>
             *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
             *         &lt;element name="Redeem" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
             *                 &lt;attribute name="LoyaltyLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="PTCReference_List" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "priceAdjustments",
                "formulas",
                "total",
                "redeem"
            })
            public static class Redemption {

                @XmlElement(name = "PriceAdjustments")
                protected ExPriceAdjustmentsType priceAdjustments;
                @XmlElement(name = "Formulas")
                protected FormulasType formulas;
                @XmlElement(name = "Total")
                protected TotalType total;
                @XmlElement(name = "Redeem", required = true)
                protected List<LoyaltyDetailsPricingType.Combinations.Combination.Redemption.Redeem> redeem;
                @XmlAttribute(name = "RateReference")
                protected String rateReference;
                @XmlAttribute(name = "PTCReference_List")
                protected String ptcReferenceList;

                /**
                 * 获取priceAdjustments属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ExPriceAdjustmentsType }
                 *     
                 */
                public ExPriceAdjustmentsType getPriceAdjustments() {
                    return priceAdjustments;
                }

                /**
                 * 设置priceAdjustments属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ExPriceAdjustmentsType }
                 *     
                 */
                public void setPriceAdjustments(ExPriceAdjustmentsType value) {
                    this.priceAdjustments = value;
                }

                /**
                 * 获取formulas属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link FormulasType }
                 *     
                 */
                public FormulasType getFormulas() {
                    return formulas;
                }

                /**
                 * 设置formulas属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FormulasType }
                 *     
                 */
                public void setFormulas(FormulasType value) {
                    this.formulas = value;
                }

                /**
                 * 获取total属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TotalType }
                 *     
                 */
                public TotalType getTotal() {
                    return total;
                }

                /**
                 * 设置total属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TotalType }
                 *     
                 */
                public void setTotal(TotalType value) {
                    this.total = value;
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
                 * {@link LoyaltyDetailsPricingType.Combinations.Combination.Redemption.Redeem }
                 * 
                 * 
                 */
                public List<LoyaltyDetailsPricingType.Combinations.Combination.Redemption.Redeem> getRedeem() {
                    if (redeem == null) {
                        redeem = new ArrayList<LoyaltyDetailsPricingType.Combinations.Combination.Redemption.Redeem>();
                    }
                    return this.redeem;
                }

                /**
                 * 获取rateReference属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRateReference() {
                    return rateReference;
                }

                /**
                 * 设置rateReference属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRateReference(String value) {
                    this.rateReference = value;
                }

                /**
                 * 获取ptcReferenceList属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPTCReferenceList() {
                    return ptcReferenceList;
                }

                /**
                 * 设置ptcReferenceList属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPTCReferenceList(String value) {
                    this.ptcReferenceList = value;
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
                 *       &lt;attribute name="LoyaltyLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Redeem
                    extends RedeemType
                {

                    @XmlAttribute(name = "LoyaltyLevel")
                    protected String loyaltyLevel;

                    /**
                     * 获取loyaltyLevel属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLoyaltyLevel() {
                        return loyaltyLevel;
                    }

                    /**
                     * 设置loyaltyLevel属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLoyaltyLevel(String value) {
                        this.loyaltyLevel = value;
                    }

                }

            }

        }

    }

}
