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
 * Contains certain traveler-specific information required for quoting or booking an insurance plan.
 * 
 * <p>IndCoverageReqsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IndCoverageReqsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndTripCost" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightAccidentAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CoveredLuggage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LuggageItem" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LuggageDescription" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType"/>
 *                             &lt;element name="ItemDeclaredValue">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LuggagePremium" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LuggageType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreexistingConditions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreexistingCondition" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *                           &lt;attribute name="DiagnosisDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="LastTreatmentDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndCoverageReqsType", propOrder = {
    "indTripCost",
    "flightAccidentAmount",
    "coveredLuggage",
    "preexistingConditions"
})
public class IndCoverageReqsType {

    @XmlElement(name = "IndTripCost")
    protected IndCoverageReqsType.IndTripCost indTripCost;
    @XmlElement(name = "FlightAccidentAmount")
    protected IndCoverageReqsType.FlightAccidentAmount flightAccidentAmount;
    @XmlElement(name = "CoveredLuggage")
    protected IndCoverageReqsType.CoveredLuggage coveredLuggage;
    @XmlElement(name = "PreexistingConditions")
    protected IndCoverageReqsType.PreexistingConditions preexistingConditions;

    /**
     * 获取indTripCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsType.IndTripCost }
     *     
     */
    public IndCoverageReqsType.IndTripCost getIndTripCost() {
        return indTripCost;
    }

    /**
     * 设置indTripCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsType.IndTripCost }
     *     
     */
    public void setIndTripCost(IndCoverageReqsType.IndTripCost value) {
        this.indTripCost = value;
    }

    /**
     * 获取flightAccidentAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsType.FlightAccidentAmount }
     *     
     */
    public IndCoverageReqsType.FlightAccidentAmount getFlightAccidentAmount() {
        return flightAccidentAmount;
    }

    /**
     * 设置flightAccidentAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsType.FlightAccidentAmount }
     *     
     */
    public void setFlightAccidentAmount(IndCoverageReqsType.FlightAccidentAmount value) {
        this.flightAccidentAmount = value;
    }

    /**
     * 获取coveredLuggage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsType.CoveredLuggage }
     *     
     */
    public IndCoverageReqsType.CoveredLuggage getCoveredLuggage() {
        return coveredLuggage;
    }

    /**
     * 设置coveredLuggage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsType.CoveredLuggage }
     *     
     */
    public void setCoveredLuggage(IndCoverageReqsType.CoveredLuggage value) {
        this.coveredLuggage = value;
    }

    /**
     * 获取preexistingConditions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsType.PreexistingConditions }
     *     
     */
    public IndCoverageReqsType.PreexistingConditions getPreexistingConditions() {
        return preexistingConditions;
    }

    /**
     * 设置preexistingConditions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsType.PreexistingConditions }
     *     
     */
    public void setPreexistingConditions(IndCoverageReqsType.PreexistingConditions value) {
        this.preexistingConditions = value;
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
     *         &lt;element name="LuggageItem" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LuggageDescription" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType"/>
     *                   &lt;element name="ItemDeclaredValue">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LuggagePremium" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LuggageType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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
        "luggageItem"
    })
    public static class CoveredLuggage {

        @XmlElement(name = "LuggageItem", required = true)
        protected List<IndCoverageReqsType.CoveredLuggage.LuggageItem> luggageItem;

        /**
         * Gets the value of the luggageItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the luggageItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLuggageItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndCoverageReqsType.CoveredLuggage.LuggageItem }
         * 
         * 
         */
        public List<IndCoverageReqsType.CoveredLuggage.LuggageItem> getLuggageItem() {
            if (luggageItem == null) {
                luggageItem = new ArrayList<IndCoverageReqsType.CoveredLuggage.LuggageItem>();
            }
            return this.luggageItem;
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
         *         &lt;element name="LuggageDescription" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType"/>
         *         &lt;element name="ItemDeclaredValue">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LuggagePremium" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="LuggageType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "luggageDescription",
            "itemDeclaredValue",
            "luggagePremium"
        })
        public static class LuggageItem {

            @XmlElement(name = "LuggageDescription", required = true)
            protected FreeTextType luggageDescription;
            @XmlElement(name = "ItemDeclaredValue", required = true)
            protected IndCoverageReqsType.CoveredLuggage.LuggageItem.ItemDeclaredValue itemDeclaredValue;
            @XmlElement(name = "LuggagePremium")
            protected IndCoverageReqsType.CoveredLuggage.LuggageItem.LuggagePremium luggagePremium;
            @XmlAttribute(name = "LuggageType")
            protected String luggageType;

            /**
             * 获取luggageDescription属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FreeTextType }
             *     
             */
            public FreeTextType getLuggageDescription() {
                return luggageDescription;
            }

            /**
             * 设置luggageDescription属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FreeTextType }
             *     
             */
            public void setLuggageDescription(FreeTextType value) {
                this.luggageDescription = value;
            }

            /**
             * 获取itemDeclaredValue属性的值。
             * 
             * @return
             *     possible object is
             *     {@link IndCoverageReqsType.CoveredLuggage.LuggageItem.ItemDeclaredValue }
             *     
             */
            public IndCoverageReqsType.CoveredLuggage.LuggageItem.ItemDeclaredValue getItemDeclaredValue() {
                return itemDeclaredValue;
            }

            /**
             * 设置itemDeclaredValue属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link IndCoverageReqsType.CoveredLuggage.LuggageItem.ItemDeclaredValue }
             *     
             */
            public void setItemDeclaredValue(IndCoverageReqsType.CoveredLuggage.LuggageItem.ItemDeclaredValue value) {
                this.itemDeclaredValue = value;
            }

            /**
             * 获取luggagePremium属性的值。
             * 
             * @return
             *     possible object is
             *     {@link IndCoverageReqsType.CoveredLuggage.LuggageItem.LuggagePremium }
             *     
             */
            public IndCoverageReqsType.CoveredLuggage.LuggageItem.LuggagePremium getLuggagePremium() {
                return luggagePremium;
            }

            /**
             * 设置luggagePremium属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link IndCoverageReqsType.CoveredLuggage.LuggageItem.LuggagePremium }
             *     
             */
            public void setLuggagePremium(IndCoverageReqsType.CoveredLuggage.LuggageItem.LuggagePremium value) {
                this.luggagePremium = value;
            }

            /**
             * 获取luggageType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLuggageType() {
                return luggageType;
            }

            /**
             * 设置luggageType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLuggageType(String value) {
                this.luggageType = value;
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ItemDeclaredValue {

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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LuggagePremium {

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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightAccidentAmount {

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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IndTripCost {

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
     *         &lt;element name="PreexistingCondition" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
     *                 &lt;attribute name="DiagnosisDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="LastTreatmentDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
        "preexistingCondition"
    })
    public static class PreexistingConditions {

        @XmlElement(name = "PreexistingCondition", required = true)
        protected List<IndCoverageReqsType.PreexistingConditions.PreexistingCondition> preexistingCondition;

        /**
         * Gets the value of the preexistingCondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preexistingCondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreexistingCondition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndCoverageReqsType.PreexistingConditions.PreexistingCondition }
         * 
         * 
         */
        public List<IndCoverageReqsType.PreexistingConditions.PreexistingCondition> getPreexistingCondition() {
            if (preexistingCondition == null) {
                preexistingCondition = new ArrayList<IndCoverageReqsType.PreexistingConditions.PreexistingCondition>();
            }
            return this.preexistingCondition;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
         *       &lt;attribute name="DiagnosisDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="LastTreatmentDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PreexistingCondition
            extends FreeTextType
        {

            @XmlAttribute(name = "DiagnosisDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar diagnosisDate;
            @XmlAttribute(name = "LastTreatmentDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar lastTreatmentDate;

            /**
             * 获取diagnosisDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDiagnosisDate() {
                return diagnosisDate;
            }

            /**
             * 设置diagnosisDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDiagnosisDate(XMLGregorianCalendar value) {
                this.diagnosisDate = value;
            }

            /**
             * 获取lastTreatmentDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLastTreatmentDate() {
                return lastTreatmentDate;
            }

            /**
             * 设置lastTreatmentDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLastTreatmentDate(XMLGregorianCalendar value) {
                this.lastTreatmentDate = value;
            }

        }

    }

}
