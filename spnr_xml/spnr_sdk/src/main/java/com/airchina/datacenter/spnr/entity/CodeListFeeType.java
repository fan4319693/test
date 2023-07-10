//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigDecimal;
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
 * Fees associated with a code item.
 * 
 * <p>CodeListFeeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CodeListFeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Currency">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="CurrencyCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[a-zA-Z]{3}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AlternateCurrency">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}List_LoyaltyPrgCurrency">
 *                           &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Percent">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.00"/>
 *                         &lt;maxInclusive value="100.00"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Type" type="{http://www.opentravel.org/OTA/2003/05}List_FeeTaxType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Qualifiers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChargeUnit" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Unit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeUnit">
 *                                     &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                     &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Frequency" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeFrequency">
 *                                     &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                     &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="EffectiveDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="ExpireDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Taxes" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Amount" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="Currency">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="CurrencyCode">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="[a-zA-Z]{3}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AlternateCurrency">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}List_LoyaltyPrgCurrency">
 *                                     &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Percent">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minInclusive value="0.00"/>
 *                                   &lt;maxInclusive value="100.00"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Type" type="{http://www.opentravel.org/OTA/2003/05}List_FeeTaxType" minOccurs="0"/>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="Qualifiers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ChargeUnit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Unit" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeUnit">
 *                                               &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                               &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Frequency" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeFrequency">
 *                                               &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                               &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="EffectiveDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="ExpireDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                           &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MandatoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="TaxRPH">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9]{1,8}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MandatoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TaxInclusiveInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TaxableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DeterminationMethod">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Cumulative"/>
 *             &lt;enumeration value="Exclusive"/>
 *             &lt;enumeration value="Inclusive"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FeeRPH">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{1,8}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListFeeType", propOrder = {
    "amount",
    "type",
    "description",
    "qualifiers",
    "taxes"
})
public class CodeListFeeType {

    @XmlElement(name = "Amount")
    protected CodeListFeeType.Amount amount;
    @XmlElement(name = "Type")
    protected ListFeeTaxType type;
    @XmlElement(name = "Description")
    protected List<String> description;
    @XmlElement(name = "Qualifiers")
    protected CodeListFeeType.Qualifiers qualifiers;
    @XmlElement(name = "Taxes")
    protected List<CodeListFeeType.Taxes> taxes;
    @XmlAttribute(name = "MandatoryInd")
    protected Boolean mandatoryInd;
    @XmlAttribute(name = "TaxInclusiveInd")
    protected Boolean taxInclusiveInd;
    @XmlAttribute(name = "TaxableInd")
    protected Boolean taxableInd;
    @XmlAttribute(name = "DeterminationMethod")
    protected String determinationMethod;
    @XmlAttribute(name = "FeeRPH")
    protected String feeRPH;

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeListFeeType.Amount }
     *     
     */
    public CodeListFeeType.Amount getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListFeeType.Amount }
     *     
     */
    public void setAmount(CodeListFeeType.Amount value) {
        this.amount = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ListFeeTaxType }
     *     
     */
    public ListFeeTaxType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ListFeeTaxType }
     *     
     */
    public void setType(ListFeeTaxType value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    /**
     * 获取qualifiers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeListFeeType.Qualifiers }
     *     
     */
    public CodeListFeeType.Qualifiers getQualifiers() {
        return qualifiers;
    }

    /**
     * 设置qualifiers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListFeeType.Qualifiers }
     *     
     */
    public void setQualifiers(CodeListFeeType.Qualifiers value) {
        this.qualifiers = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeListFeeType.Taxes }
     * 
     * 
     */
    public List<CodeListFeeType.Taxes> getTaxes() {
        if (taxes == null) {
            taxes = new ArrayList<CodeListFeeType.Taxes>();
        }
        return this.taxes;
    }

    /**
     * 获取mandatoryInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * 设置mandatoryInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatoryInd(Boolean value) {
        this.mandatoryInd = value;
    }

    /**
     * 获取taxInclusiveInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxInclusiveInd() {
        return taxInclusiveInd;
    }

    /**
     * 设置taxInclusiveInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInclusiveInd(Boolean value) {
        this.taxInclusiveInd = value;
    }

    /**
     * 获取taxableInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxableInd() {
        return taxableInd;
    }

    /**
     * 设置taxableInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxableInd(Boolean value) {
        this.taxableInd = value;
    }

    /**
     * 获取determinationMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminationMethod() {
        return determinationMethod;
    }

    /**
     * 设置determinationMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminationMethod(String value) {
        this.determinationMethod = value;
    }

    /**
     * 获取feeRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeRPH() {
        return feeRPH;
    }

    /**
     * 设置feeRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeRPH(String value) {
        this.feeRPH = value;
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
     *       &lt;choice>
     *         &lt;element name="Currency">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="CurrencyCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[a-zA-Z]{3}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AlternateCurrency">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}List_LoyaltyPrgCurrency">
     *                 &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Percent">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.00"/>
     *               &lt;maxInclusive value="100.00"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currency",
        "alternateCurrency",
        "percent"
    })
    public static class Amount {

        @XmlElement(name = "Currency")
        protected CodeListFeeType.Amount.Currency currency;
        @XmlElement(name = "AlternateCurrency")
        protected CodeListFeeType.Amount.AlternateCurrency alternateCurrency;
        @XmlElement(name = "Percent")
        protected BigDecimal percent;

        /**
         * 获取currency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CodeListFeeType.Amount.Currency }
         *     
         */
        public CodeListFeeType.Amount.Currency getCurrency() {
            return currency;
        }

        /**
         * 设置currency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CodeListFeeType.Amount.Currency }
         *     
         */
        public void setCurrency(CodeListFeeType.Amount.Currency value) {
            this.currency = value;
        }

        /**
         * 获取alternateCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CodeListFeeType.Amount.AlternateCurrency }
         *     
         */
        public CodeListFeeType.Amount.AlternateCurrency getAlternateCurrency() {
            return alternateCurrency;
        }

        /**
         * 设置alternateCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CodeListFeeType.Amount.AlternateCurrency }
         *     
         */
        public void setAlternateCurrency(CodeListFeeType.Amount.AlternateCurrency value) {
            this.alternateCurrency = value;
        }

        /**
         * 获取percent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /**
         * 设置percent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercent(BigDecimal value) {
            this.percent = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}List_LoyaltyPrgCurrency">
         *       &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AlternateCurrency
            extends ListLoyaltyPrgCurrency
        {

            @XmlAttribute(name = "Quantity", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger quantity;

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
         *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="CurrencyCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[a-zA-Z]{3}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Currency {

            @XmlAttribute(name = "Amount", required = true)
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

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
     *         &lt;element name="ChargeUnit" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Unit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeUnit">
     *                           &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                           &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Frequency" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeFrequency">
     *                           &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                           &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
     *       &lt;attribute name="EffectiveDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="ExpireDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "chargeUnit"
    })
    public static class Qualifiers {

        @XmlElement(name = "ChargeUnit")
        protected CodeListFeeType.Qualifiers.ChargeUnit chargeUnit;
        @XmlAttribute(name = "EffectiveDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar effectiveDateTime;
        @XmlAttribute(name = "ExpireDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar expireDateTime;
        @XmlAttribute(name = "MaxAge")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxAge;
        @XmlAttribute(name = "MinAge")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger minAge;

        /**
         * 获取chargeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CodeListFeeType.Qualifiers.ChargeUnit }
         *     
         */
        public CodeListFeeType.Qualifiers.ChargeUnit getChargeUnit() {
            return chargeUnit;
        }

        /**
         * 设置chargeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CodeListFeeType.Qualifiers.ChargeUnit }
         *     
         */
        public void setChargeUnit(CodeListFeeType.Qualifiers.ChargeUnit value) {
            this.chargeUnit = value;
        }

        /**
         * 获取effectiveDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDateTime() {
            return effectiveDateTime;
        }

        /**
         * 设置effectiveDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDateTime(XMLGregorianCalendar value) {
            this.effectiveDateTime = value;
        }

        /**
         * 获取expireDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDateTime() {
            return expireDateTime;
        }

        /**
         * 设置expireDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDateTime(XMLGregorianCalendar value) {
            this.expireDateTime = value;
        }

        /**
         * 获取maxAge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxAge() {
            return maxAge;
        }

        /**
         * 设置maxAge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxAge(BigInteger value) {
            this.maxAge = value;
        }

        /**
         * 获取minAge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinAge() {
            return minAge;
        }

        /**
         * 设置minAge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinAge(BigInteger value) {
            this.minAge = value;
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
         *         &lt;element name="Unit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeUnit">
         *                 &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                 &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Frequency" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeFrequency">
         *                 &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                 &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
            "unit",
            "frequency"
        })
        public static class ChargeUnit {

            @XmlElement(name = "Unit")
            protected CodeListFeeType.Qualifiers.ChargeUnit.Unit unit;
            @XmlElement(name = "Frequency")
            protected CodeListFeeType.Qualifiers.ChargeUnit.Frequency frequency;

            /**
             * 获取unit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CodeListFeeType.Qualifiers.ChargeUnit.Unit }
             *     
             */
            public CodeListFeeType.Qualifiers.ChargeUnit.Unit getUnit() {
                return unit;
            }

            /**
             * 设置unit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CodeListFeeType.Qualifiers.ChargeUnit.Unit }
             *     
             */
            public void setUnit(CodeListFeeType.Qualifiers.ChargeUnit.Unit value) {
                this.unit = value;
            }

            /**
             * 获取frequency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CodeListFeeType.Qualifiers.ChargeUnit.Frequency }
             *     
             */
            public CodeListFeeType.Qualifiers.ChargeUnit.Frequency getFrequency() {
                return frequency;
            }

            /**
             * 设置frequency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CodeListFeeType.Qualifiers.ChargeUnit.Frequency }
             *     
             */
            public void setFrequency(CodeListFeeType.Qualifiers.ChargeUnit.Frequency value) {
                this.frequency = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeFrequency">
             *       &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *       &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Frequency
                extends ListChargeFrequency
            {

                @XmlAttribute(name = "ExemptQty")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger exemptQty;
                @XmlAttribute(name = "MaximumQty")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger maximumQty;

                /**
                 * 获取exemptQty属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getExemptQty() {
                    return exemptQty;
                }

                /**
                 * 设置exemptQty属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setExemptQty(BigInteger value) {
                    this.exemptQty = value;
                }

                /**
                 * 获取maximumQty属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMaximumQty() {
                    return maximumQty;
                }

                /**
                 * 设置maximumQty属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMaximumQty(BigInteger value) {
                    this.maximumQty = value;
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
             *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeUnit">
             *       &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *       &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Unit
                extends ListChargeUnit
            {

                @XmlAttribute(name = "ExemptQty")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger exemptQty;
                @XmlAttribute(name = "MaximumQty")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger maximumQty;

                /**
                 * 获取exemptQty属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getExemptQty() {
                    return exemptQty;
                }

                /**
                 * 设置exemptQty属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setExemptQty(BigInteger value) {
                    this.exemptQty = value;
                }

                /**
                 * 获取maximumQty属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMaximumQty() {
                    return maximumQty;
                }

                /**
                 * 设置maximumQty属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMaximumQty(BigInteger value) {
                    this.maximumQty = value;
                }

            }

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
     *         &lt;element name="Amount" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="Currency">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="CurrencyCode">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;pattern value="[a-zA-Z]{3}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AlternateCurrency">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}List_LoyaltyPrgCurrency">
     *                           &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Percent">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;minInclusive value="0.00"/>
     *                         &lt;maxInclusive value="100.00"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Type" type="{http://www.opentravel.org/OTA/2003/05}List_FeeTaxType" minOccurs="0"/>
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="Qualifiers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ChargeUnit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Unit" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeUnit">
     *                                     &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                     &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Frequency" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeFrequency">
     *                                     &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                     &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="EffectiveDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="ExpireDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="MandatoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="TaxRPH">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{1,8}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amount",
        "type",
        "description",
        "qualifiers"
    })
    public static class Taxes {

        @XmlElement(name = "Amount")
        protected CodeListFeeType.Taxes.Amount amount;
        @XmlElement(name = "Type")
        protected ListFeeTaxType type;
        @XmlElement(name = "Description")
        protected List<String> description;
        @XmlElement(name = "Qualifiers")
        protected CodeListFeeType.Taxes.Qualifiers qualifiers;
        @XmlAttribute(name = "MandatoryInd")
        protected Boolean mandatoryInd;
        @XmlAttribute(name = "TaxRPH")
        protected String taxRPH;

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CodeListFeeType.Taxes.Amount }
         *     
         */
        public CodeListFeeType.Taxes.Amount getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CodeListFeeType.Taxes.Amount }
         *     
         */
        public void setAmount(CodeListFeeType.Taxes.Amount value) {
            this.amount = value;
        }

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ListFeeTaxType }
         *     
         */
        public ListFeeTaxType getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ListFeeTaxType }
         *     
         */
        public void setType(ListFeeTaxType value) {
            this.type = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDescription() {
            if (description == null) {
                description = new ArrayList<String>();
            }
            return this.description;
        }

        /**
         * 获取qualifiers属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CodeListFeeType.Taxes.Qualifiers }
         *     
         */
        public CodeListFeeType.Taxes.Qualifiers getQualifiers() {
            return qualifiers;
        }

        /**
         * 设置qualifiers属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CodeListFeeType.Taxes.Qualifiers }
         *     
         */
        public void setQualifiers(CodeListFeeType.Taxes.Qualifiers value) {
            this.qualifiers = value;
        }

        /**
         * 获取mandatoryInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMandatoryInd() {
            return mandatoryInd;
        }

        /**
         * 设置mandatoryInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMandatoryInd(Boolean value) {
            this.mandatoryInd = value;
        }

        /**
         * 获取taxRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxRPH() {
            return taxRPH;
        }

        /**
         * 设置taxRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxRPH(String value) {
            this.taxRPH = value;
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
         *       &lt;choice>
         *         &lt;element name="Currency">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="CurrencyCode">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="[a-zA-Z]{3}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AlternateCurrency">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}List_LoyaltyPrgCurrency">
         *                 &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Percent">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;minInclusive value="0.00"/>
         *               &lt;maxInclusive value="100.00"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "currency",
            "alternateCurrency",
            "percent"
        })
        public static class Amount {

            @XmlElement(name = "Currency")
            protected CodeListFeeType.Taxes.Amount.Currency currency;
            @XmlElement(name = "AlternateCurrency")
            protected CodeListFeeType.Taxes.Amount.AlternateCurrency alternateCurrency;
            @XmlElement(name = "Percent")
            protected BigDecimal percent;

            /**
             * 获取currency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CodeListFeeType.Taxes.Amount.Currency }
             *     
             */
            public CodeListFeeType.Taxes.Amount.Currency getCurrency() {
                return currency;
            }

            /**
             * 设置currency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CodeListFeeType.Taxes.Amount.Currency }
             *     
             */
            public void setCurrency(CodeListFeeType.Taxes.Amount.Currency value) {
                this.currency = value;
            }

            /**
             * 获取alternateCurrency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CodeListFeeType.Taxes.Amount.AlternateCurrency }
             *     
             */
            public CodeListFeeType.Taxes.Amount.AlternateCurrency getAlternateCurrency() {
                return alternateCurrency;
            }

            /**
             * 设置alternateCurrency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CodeListFeeType.Taxes.Amount.AlternateCurrency }
             *     
             */
            public void setAlternateCurrency(CodeListFeeType.Taxes.Amount.AlternateCurrency value) {
                this.alternateCurrency = value;
            }

            /**
             * 获取percent属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercent() {
                return percent;
            }

            /**
             * 设置percent属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercent(BigDecimal value) {
                this.percent = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}List_LoyaltyPrgCurrency">
             *       &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AlternateCurrency
                extends ListLoyaltyPrgCurrency
            {

                @XmlAttribute(name = "Quantity", required = true)
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger quantity;

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
             *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="CurrencyCode">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="[a-zA-Z]{3}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Currency {

                @XmlAttribute(name = "Amount", required = true)
                protected BigDecimal amount;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;

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
         *         &lt;element name="ChargeUnit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Unit" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeUnit">
         *                           &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                           &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Frequency" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeFrequency">
         *                           &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                           &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
         *       &lt;attribute name="EffectiveDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="ExpireDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "chargeUnit"
        })
        public static class Qualifiers {

            @XmlElement(name = "ChargeUnit")
            protected CodeListFeeType.Taxes.Qualifiers.ChargeUnit chargeUnit;
            @XmlAttribute(name = "EffectiveDateTime")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar effectiveDateTime;
            @XmlAttribute(name = "ExpireDateTime")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar expireDateTime;
            @XmlAttribute(name = "MaxAge")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger maxAge;
            @XmlAttribute(name = "MinAge")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger minAge;

            /**
             * 获取chargeUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CodeListFeeType.Taxes.Qualifiers.ChargeUnit }
             *     
             */
            public CodeListFeeType.Taxes.Qualifiers.ChargeUnit getChargeUnit() {
                return chargeUnit;
            }

            /**
             * 设置chargeUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CodeListFeeType.Taxes.Qualifiers.ChargeUnit }
             *     
             */
            public void setChargeUnit(CodeListFeeType.Taxes.Qualifiers.ChargeUnit value) {
                this.chargeUnit = value;
            }

            /**
             * 获取effectiveDateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEffectiveDateTime() {
                return effectiveDateTime;
            }

            /**
             * 设置effectiveDateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEffectiveDateTime(XMLGregorianCalendar value) {
                this.effectiveDateTime = value;
            }

            /**
             * 获取expireDateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getExpireDateTime() {
                return expireDateTime;
            }

            /**
             * 设置expireDateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setExpireDateTime(XMLGregorianCalendar value) {
                this.expireDateTime = value;
            }

            /**
             * 获取maxAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxAge() {
                return maxAge;
            }

            /**
             * 设置maxAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxAge(BigInteger value) {
                this.maxAge = value;
            }

            /**
             * 获取minAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinAge() {
                return minAge;
            }

            /**
             * 设置minAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinAge(BigInteger value) {
                this.minAge = value;
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
             *         &lt;element name="Unit" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeUnit">
             *                 &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                 &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Frequency" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeFrequency">
             *                 &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                 &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                "unit",
                "frequency"
            })
            public static class ChargeUnit {

                @XmlElement(name = "Unit")
                protected CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Unit unit;
                @XmlElement(name = "Frequency")
                protected CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Frequency frequency;

                /**
                 * 获取unit属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Unit }
                 *     
                 */
                public CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Unit getUnit() {
                    return unit;
                }

                /**
                 * 设置unit属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Unit }
                 *     
                 */
                public void setUnit(CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Unit value) {
                    this.unit = value;
                }

                /**
                 * 获取frequency属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Frequency }
                 *     
                 */
                public CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Frequency getFrequency() {
                    return frequency;
                }

                /**
                 * 设置frequency属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Frequency }
                 *     
                 */
                public void setFrequency(CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Frequency value) {
                    this.frequency = value;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeFrequency">
                 *       &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *       &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Frequency
                    extends ListChargeFrequency
                {

                    @XmlAttribute(name = "ExemptQty")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger exemptQty;
                    @XmlAttribute(name = "MaximumQty")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger maximumQty;

                    /**
                     * 获取exemptQty属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getExemptQty() {
                        return exemptQty;
                    }

                    /**
                     * 设置exemptQty属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setExemptQty(BigInteger value) {
                        this.exemptQty = value;
                    }

                    /**
                     * 获取maximumQty属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getMaximumQty() {
                        return maximumQty;
                    }

                    /**
                     * 设置maximumQty属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setMaximumQty(BigInteger value) {
                        this.maximumQty = value;
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
                 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeUnit">
                 *       &lt;attribute name="ExemptQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *       &lt;attribute name="MaximumQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Unit
                    extends ListChargeUnit
                {

                    @XmlAttribute(name = "ExemptQty")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger exemptQty;
                    @XmlAttribute(name = "MaximumQty")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger maximumQty;

                    /**
                     * 获取exemptQty属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getExemptQty() {
                        return exemptQty;
                    }

                    /**
                     * 设置exemptQty属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setExemptQty(BigInteger value) {
                        this.exemptQty = value;
                    }

                    /**
                     * 获取maximumQty属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getMaximumQty() {
                        return maximumQty;
                    }

                    /**
                     * 设置maximumQty属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setMaximumQty(BigInteger value) {
                        this.maximumQty = value;
                    }

                }

            }

        }

    }

}
