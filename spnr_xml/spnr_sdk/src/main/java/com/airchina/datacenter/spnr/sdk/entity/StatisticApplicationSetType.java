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


/**
 * Includes the statistic data reported and the codes for which it has been aggregated, if applicable. The applicable date range for the data is defined in its attributes.
 * 
 * <p>StatisticApplicationSetType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StatisticApplicationSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatisticCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StatisticCode" maxOccurs="5">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}StatisticCodeGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RevenueCategorySummaries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RevenueCategorySummary" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RevenueCategorySummaryGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CountCategorySummaries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CountCategorySummary" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CountCategorySummaryGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReportSummaries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReportSummary" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticApplicationSetType", propOrder = {
    "statisticCodes",
    "revenueCategorySummaries",
    "countCategorySummaries",
    "reportSummaries"
})
public class StatisticApplicationSetType {

    @XmlElement(name = "StatisticCodes")
    protected StatisticApplicationSetType.StatisticCodes statisticCodes;
    @XmlElement(name = "RevenueCategorySummaries")
    protected StatisticApplicationSetType.RevenueCategorySummaries revenueCategorySummaries;
    @XmlElement(name = "CountCategorySummaries")
    protected StatisticApplicationSetType.CountCategorySummaries countCategorySummaries;
    @XmlElement(name = "ReportSummaries")
    protected StatisticApplicationSetType.ReportSummaries reportSummaries;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected BigInteger duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "RangeNum")
    protected BigInteger rangeNum;
    @XmlAttribute(name = "SearchTimeZone")
    protected String searchTimeZone;

    /**
     * 获取statisticCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StatisticApplicationSetType.StatisticCodes }
     *     
     */
    public StatisticApplicationSetType.StatisticCodes getStatisticCodes() {
        return statisticCodes;
    }

    /**
     * 设置statisticCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticApplicationSetType.StatisticCodes }
     *     
     */
    public void setStatisticCodes(StatisticApplicationSetType.StatisticCodes value) {
        this.statisticCodes = value;
    }

    /**
     * 获取revenueCategorySummaries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StatisticApplicationSetType.RevenueCategorySummaries }
     *     
     */
    public StatisticApplicationSetType.RevenueCategorySummaries getRevenueCategorySummaries() {
        return revenueCategorySummaries;
    }

    /**
     * 设置revenueCategorySummaries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticApplicationSetType.RevenueCategorySummaries }
     *     
     */
    public void setRevenueCategorySummaries(StatisticApplicationSetType.RevenueCategorySummaries value) {
        this.revenueCategorySummaries = value;
    }

    /**
     * 获取countCategorySummaries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StatisticApplicationSetType.CountCategorySummaries }
     *     
     */
    public StatisticApplicationSetType.CountCategorySummaries getCountCategorySummaries() {
        return countCategorySummaries;
    }

    /**
     * 设置countCategorySummaries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticApplicationSetType.CountCategorySummaries }
     *     
     */
    public void setCountCategorySummaries(StatisticApplicationSetType.CountCategorySummaries value) {
        this.countCategorySummaries = value;
    }

    /**
     * 获取reportSummaries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StatisticApplicationSetType.ReportSummaries }
     *     
     */
    public StatisticApplicationSetType.ReportSummaries getReportSummaries() {
        return reportSummaries;
    }

    /**
     * 设置reportSummaries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticApplicationSetType.ReportSummaries }
     *     
     */
    public void setReportSummaries(StatisticApplicationSetType.ReportSummaries value) {
        this.reportSummaries = value;
    }

    /**
     * 获取start属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * 设置start属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
    }

    /**
     * 获取end属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * 设置end属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * 获取rangeNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRangeNum() {
        return rangeNum;
    }

    /**
     * 设置rangeNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRangeNum(BigInteger value) {
        this.rangeNum = value;
    }

    /**
     * 获取searchTimeZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTimeZone() {
        return searchTimeZone;
    }

    /**
     * 设置searchTimeZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTimeZone(String value) {
        this.searchTimeZone = value;
    }


    /**
     * A collection of CountCategorySummaryType elements.
     * 
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CountCategorySummary" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CountCategorySummaryGroup"/>
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
        "countCategorySummary"
    })
    public static class CountCategorySummaries {

        @XmlElement(name = "CountCategorySummary", required = true)
        protected List<StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary> countCategorySummary;

        /**
         * Gets the value of the countCategorySummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countCategorySummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountCategorySummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary }
         * 
         * 
         */
        public List<StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary> getCountCategorySummary() {
            if (countCategorySummary == null) {
                countCategorySummary = new ArrayList<StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary>();
            }
            return this.countCategorySummary;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CountCategorySummaryGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CountCategorySummary {

            @XmlAttribute(name = "SummaryCount")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger summaryCount;
            @XmlAttribute(name = "CountCategoryCode")
            protected String countCategoryCode;

            /**
             * 获取summaryCount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSummaryCount() {
                return summaryCount;
            }

            /**
             * 设置summaryCount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSummaryCount(BigInteger value) {
                this.summaryCount = value;
            }

            /**
             * 获取countCategoryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountCategoryCode() {
                return countCategoryCode;
            }

            /**
             * 设置countCategoryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountCategoryCode(String value) {
                this.countCategoryCode = value;
            }

        }

    }


    /**
     * Container for ReportSummary elements of type ParagraphType.
     * 
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ReportSummary" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded"/>
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
        "reportSummary"
    })
    public static class ReportSummaries {

        @XmlElement(name = "ReportSummary", required = true)
        protected List<ParagraphType> reportSummary;

        /**
         * Gets the value of the reportSummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportSummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportSummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         * 
         * 
         */
        public List<ParagraphType> getReportSummary() {
            if (reportSummary == null) {
                reportSummary = new ArrayList<ParagraphType>();
            }
            return this.reportSummary;
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
     *         &lt;element name="RevenueCategorySummary" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RevenueCategorySummaryGroup"/>
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
        "revenueCategorySummary"
    })
    public static class RevenueCategorySummaries {

        @XmlElement(name = "RevenueCategorySummary", required = true)
        protected List<StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary> revenueCategorySummary;

        /**
         * Gets the value of the revenueCategorySummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the revenueCategorySummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRevenueCategorySummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary }
         * 
         * 
         */
        public List<StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary> getRevenueCategorySummary() {
            if (revenueCategorySummary == null) {
                revenueCategorySummary = new ArrayList<StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary>();
            }
            return this.revenueCategorySummary;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RevenueCategorySummaryGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RevenueCategorySummary {

            @XmlAttribute(name = "RevenueCategoryCode")
            protected String revenueCategoryCode;
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
             * 获取revenueCategoryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRevenueCategoryCode() {
                return revenueCategoryCode;
            }

            /**
             * 设置revenueCategoryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRevenueCategoryCode(String value) {
                this.revenueCategoryCode = value;
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
     *         &lt;element name="StatisticCode" maxOccurs="5">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}StatisticCodeGroup"/>
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
        "statisticCode"
    })
    public static class StatisticCodes {

        @XmlElement(name = "StatisticCode", required = true)
        protected List<StatisticApplicationSetType.StatisticCodes.StatisticCode> statisticCode;

        /**
         * Gets the value of the statisticCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statisticCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatisticCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatisticApplicationSetType.StatisticCodes.StatisticCode }
         * 
         * 
         */
        public List<StatisticApplicationSetType.StatisticCodes.StatisticCode> getStatisticCode() {
            if (statisticCode == null) {
                statisticCode = new ArrayList<StatisticApplicationSetType.StatisticCodes.StatisticCode>();
            }
            return this.statisticCode;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}StatisticCodeGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StatisticCode {

            @XmlAttribute(name = "StatCode")
            protected String statCode;
            @XmlAttribute(name = "StatCategoryCode")
            protected String statCategoryCode;

            /**
             * 获取statCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatCode() {
                return statCode;
            }

            /**
             * 设置statCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatCode(String value) {
                this.statCode = value;
            }

            /**
             * 获取statCategoryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatCategoryCode() {
                return statCategoryCode;
            }

            /**
             * 设置statCategoryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatCategoryCode(String value) {
                this.statCategoryCode = value;
            }

        }

    }

}
