//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies charges and/or penalties associated with making ticket changes after purchase.
 * 
 * <p>VoluntaryChangesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VoluntaryChangesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Penalty" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="PenaltyType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DepartureStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="VolChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PartialTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoluntaryChangesType", propOrder = {
    "penalty"
})
public class VoluntaryChangesType {

    @XmlElement(name = "Penalty")
    protected VoluntaryChangesType.Penalty penalty;
    @XmlAttribute(name = "VolChangeInd")
    protected Boolean volChangeInd;
    @XmlAttribute(name = "PartialTicket")
    protected Boolean partialTicket;

    /**
     * 获取penalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VoluntaryChangesType.Penalty }
     *     
     */
    public VoluntaryChangesType.Penalty getPenalty() {
        return penalty;
    }

    /**
     * 设置penalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VoluntaryChangesType.Penalty }
     *     
     */
    public void setPenalty(VoluntaryChangesType.Penalty value) {
        this.penalty = value;
    }

    /**
     * 获取volChangeInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVolChangeInd() {
        return volChangeInd;
    }

    /**
     * 设置volChangeInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVolChangeInd(Boolean value) {
        this.volChangeInd = value;
    }

    /**
     * 获取partialTicket属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialTicket() {
        return partialTicket;
    }

    /**
     * 设置partialTicket属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialTicket(Boolean value) {
        this.partialTicket = value;
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
     *       &lt;attribute name="PenaltyType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DepartureStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
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

        @XmlAttribute(name = "PenaltyType")
        protected String penaltyType;
        @XmlAttribute(name = "DepartureStatus")
        protected String departureStatus;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
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
         * 获取penaltyType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPenaltyType() {
            return penaltyType;
        }

        /**
         * 设置penaltyType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPenaltyType(String value) {
            this.penaltyType = value;
        }

        /**
         * 获取departureStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureStatus() {
            return departureStatus;
        }

        /**
         * 设置departureStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureStatus(String value) {
            this.departureStatus = value;
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
