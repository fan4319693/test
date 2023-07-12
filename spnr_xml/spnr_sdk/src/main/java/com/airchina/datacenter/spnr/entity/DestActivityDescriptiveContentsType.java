//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigDecimal;
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
 * Describe an Activity: Categories,Desctription,images,....
 * 
 * <p>DestActivityDescriptiveContentsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DestActivityDescriptiveContentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestActivityDescriptiveContent" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType">
 *                 &lt;sequence>
 *                   &lt;element name="ExchangeRate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ReportingExchangeRates" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
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
 *       &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestActivityDescriptiveContentsType", propOrder = {
    "destActivityDescriptiveContent"
})
public class DestActivityDescriptiveContentsType {

    @XmlElement(name = "DestActivityDescriptiveContent", required = true)
    protected List<DestActivityDescriptiveContentsType.DestActivityDescriptiveContent> destActivityDescriptiveContent;
    @XmlAttribute(name = "OriginDestinationRPH")
    protected String originDestinationRPH;
    @XmlAttribute(name = "FlightSegmentRPH")
    protected String flightSegmentRPH;

    /**
     * Gets the value of the destActivityDescriptiveContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destActivityDescriptiveContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestActivityDescriptiveContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DestActivityDescriptiveContentsType.DestActivityDescriptiveContent }
     * 
     * 
     */
    public List<DestActivityDescriptiveContentsType.DestActivityDescriptiveContent> getDestActivityDescriptiveContent() {
        if (destActivityDescriptiveContent == null) {
            destActivityDescriptiveContent = new ArrayList<DestActivityDescriptiveContentsType.DestActivityDescriptiveContent>();
        }
        return this.destActivityDescriptiveContent;
    }

    /**
     * 获取originDestinationRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestinationRPH() {
        return originDestinationRPH;
    }

    /**
     * 设置originDestinationRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestinationRPH(String value) {
        this.originDestinationRPH = value;
    }

    /**
     * 获取flightSegmentRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSegmentRPH() {
        return flightSegmentRPH;
    }

    /**
     * 设置flightSegmentRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSegmentRPH(String value) {
        this.flightSegmentRPH = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType">
     *       &lt;sequence>
     *         &lt;element name="ExchangeRate" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ReportingExchangeRates" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
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
        "exchangeRate",
        "reportingExchangeRates"
    })
    public static class DestActivityDescriptiveContent
        extends DestActivityDescriptiveContentType
    {

        @XmlElement(name = "ExchangeRate")
        protected DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ExchangeRate exchangeRate;
        @XmlElement(name = "ReportingExchangeRates")
        protected DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ReportingExchangeRates reportingExchangeRates;

        /**
         * 获取exchangeRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ExchangeRate }
         *     
         */
        public DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ExchangeRate getExchangeRate() {
            return exchangeRate;
        }

        /**
         * 设置exchangeRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ExchangeRate }
         *     
         */
        public void setExchangeRate(DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ExchangeRate value) {
            this.exchangeRate = value;
        }

        /**
         * 获取reportingExchangeRates属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ReportingExchangeRates }
         *     
         */
        public DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ReportingExchangeRates getReportingExchangeRates() {
            return reportingExchangeRates;
        }

        /**
         * 设置reportingExchangeRates属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ReportingExchangeRates }
         *     
         */
        public void setReportingExchangeRates(DestActivityDescriptiveContentsType.DestActivityDescriptiveContent.ReportingExchangeRates value) {
            this.reportingExchangeRates = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExchangeRate {

            @XmlAttribute(name = "FromCurrency")
            protected String fromCurrency;
            @XmlAttribute(name = "ToCurrency")
            protected String toCurrency;
            @XmlAttribute(name = "Rate")
            protected BigDecimal rate;
            @XmlAttribute(name = "Date")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar date;
            @XmlAttribute(name = "CompanyID")
            protected String companyID;
            @XmlAttribute(name = "RateID")
            protected String rateID;

            /**
             * 获取fromCurrency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFromCurrency() {
                return fromCurrency;
            }

            /**
             * 设置fromCurrency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFromCurrency(String value) {
                this.fromCurrency = value;
            }

            /**
             * 获取toCurrency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getToCurrency() {
                return toCurrency;
            }

            /**
             * 设置toCurrency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setToCurrency(String value) {
                this.toCurrency = value;
            }

            /**
             * 获取rate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRate() {
                return rate;
            }

            /**
             * 设置rate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRate(BigDecimal value) {
                this.rate = value;
            }

            /**
             * 获取date属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * 设置date属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * 获取companyID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanyID() {
                return companyID;
            }

            /**
             * 设置companyID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyID(String value) {
                this.companyID = value;
            }

            /**
             * 获取rateID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRateID() {
                return rateID;
            }

            /**
             * 设置rateID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRateID(String value) {
                this.rateID = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ReportingExchangeRates {

            @XmlAttribute(name = "FromCurrency")
            protected String fromCurrency;
            @XmlAttribute(name = "ToCurrency")
            protected String toCurrency;
            @XmlAttribute(name = "Rate")
            protected BigDecimal rate;
            @XmlAttribute(name = "Date")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar date;
            @XmlAttribute(name = "CompanyID")
            protected String companyID;
            @XmlAttribute(name = "RateID")
            protected String rateID;

            /**
             * 获取fromCurrency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFromCurrency() {
                return fromCurrency;
            }

            /**
             * 设置fromCurrency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFromCurrency(String value) {
                this.fromCurrency = value;
            }

            /**
             * 获取toCurrency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getToCurrency() {
                return toCurrency;
            }

            /**
             * 设置toCurrency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setToCurrency(String value) {
                this.toCurrency = value;
            }

            /**
             * 获取rate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRate() {
                return rate;
            }

            /**
             * 设置rate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRate(BigDecimal value) {
                this.rate = value;
            }

            /**
             * 获取date属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * 设置date属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * 获取companyID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanyID() {
                return companyID;
            }

            /**
             * 设置companyID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyID(String value) {
                this.companyID = value;
            }

            /**
             * 获取rateID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRateID() {
                return rateID;
            }

            /**
             * 设置rateID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRateID(String value) {
                this.rateID = value;
            }

        }

    }

}
