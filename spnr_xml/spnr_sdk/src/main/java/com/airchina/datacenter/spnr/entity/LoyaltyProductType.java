//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LoyaltyProductType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LoyaltyProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Redemption">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                   &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *                   &lt;element name="Redeem">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
 *       &lt;attribute name="CombinationCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Percentage" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PercentageOf" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProductType", propOrder = {
    "redemption",
    "earn",
    "ptCs"
})
public class LoyaltyProductType {

    @XmlElement(name = "Redemption", required = true)
    protected LoyaltyProductType.Redemption redemption;
    @XmlElement(name = "Earn")
    protected LoyaltyProductType.Earn earn;
    @XmlElement(name = "PTCs")
    protected LoyaltyProductType.PTCs ptCs;
    @XmlAttribute(name = "CombinationCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String combinationCode;
    @XmlAttribute(name = "Percentage", required = true)
    protected String percentage;
    @XmlAttribute(name = "PercentageOf", required = true)
    protected String percentageOf;
    @XmlAttribute(name = "IncludeTax")
    protected Boolean includeTax;

    /**
     * 获取redemption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProductType.Redemption }
     *     
     */
    public LoyaltyProductType.Redemption getRedemption() {
        return redemption;
    }

    /**
     * 设置redemption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProductType.Redemption }
     *     
     */
    public void setRedemption(LoyaltyProductType.Redemption value) {
        this.redemption = value;
    }

    /**
     * 获取earn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProductType.Earn }
     *     
     */
    public LoyaltyProductType.Earn getEarn() {
        return earn;
    }

    /**
     * 设置earn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProductType.Earn }
     *     
     */
    public void setEarn(LoyaltyProductType.Earn value) {
        this.earn = value;
    }

    /**
     * 获取ptCs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProductType.PTCs }
     *     
     */
    public LoyaltyProductType.PTCs getPTCs() {
        return ptCs;
    }

    /**
     * 设置ptCs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProductType.PTCs }
     *     
     */
    public void setPTCs(LoyaltyProductType.PTCs value) {
        this.ptCs = value;
    }

    /**
     * 获取combinationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombinationCode() {
        return combinationCode;
    }

    /**
     * 设置combinationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombinationCode(String value) {
        this.combinationCode = value;
    }

    /**
     * 获取percentage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * 设置percentage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentage(String value) {
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
     * 获取includeTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTax() {
        return includeTax;
    }

    /**
     * 设置includeTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTax(Boolean value) {
        this.includeTax = value;
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
     *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
     *         &lt;element name="Redeem">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RateReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "total",
        "redeem"
    })
    public static class Redemption {

        @XmlElement(name = "PriceAdjustments")
        protected ExPriceAdjustmentsType priceAdjustments;
        @XmlElement(name = "Total")
        protected TotalType total;
        @XmlElement(name = "Redeem", required = true)
        protected LoyaltyProductType.Redemption.Redeem redeem;
        @XmlAttribute(name = "RateReference")
        @XmlSchemaType(name = "anySimpleType")
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
         * 获取redeem属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LoyaltyProductType.Redemption.Redeem }
         *     
         */
        public LoyaltyProductType.Redemption.Redeem getRedeem() {
            return redeem;
        }

        /**
         * 设置redeem属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LoyaltyProductType.Redemption.Redeem }
         *     
         */
        public void setRedeem(LoyaltyProductType.Redemption.Redeem value) {
            this.redeem = value;
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


        }

    }

}
