//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is used to store xPromotion related information in messages and the SPNR.
 * 
 * <p>xPromotionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="xPromotionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Session" type="{http://www.opentravel.org/OTA/2003/05}SessionType"/>
 *         &lt;element name="Impression" type="{http://www.opentravel.org/OTA/2003/05}ImpressionType"/>
 *         &lt;element name="Search">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Top">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Cheapest">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Conversion" type="{http://www.opentravel.org/OTA/2003/05}ConversionType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PromotionProfileId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TripProfileId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PromotionId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ImpressionId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SearchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PromotionProfileSessionId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TripProfileSessionId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PromotionSessionId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ImpressionSessionId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SearchSessionId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SortType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xPromotionType", propOrder = {
    "session",
    "impression",
    "search",
    "conversion"
})
public class XPromotionType {

    @XmlElement(name = "Session", required = true)
    protected SessionType session;
    @XmlElement(name = "Impression", required = true)
    protected ImpressionType impression;
    @XmlElement(name = "Search", required = true)
    protected XPromotionType.Search search;
    @XmlElement(name = "Conversion", required = true)
    protected ConversionType conversion;
    @XmlAttribute(name = "PromotionProfileId", required = true)
    protected String promotionProfileId;
    @XmlAttribute(name = "TripProfileId", required = true)
    protected String tripProfileId;
    @XmlAttribute(name = "PromotionId", required = true)
    protected String promotionId;
    @XmlAttribute(name = "ImpressionId", required = true)
    protected String impressionId;
    @XmlAttribute(name = "SearchId", required = true)
    protected String searchId;
    @XmlAttribute(name = "PromotionProfileSessionId")
    @XmlSchemaType(name = "anySimpleType")
    protected String promotionProfileSessionId;
    @XmlAttribute(name = "TripProfileSessionId")
    @XmlSchemaType(name = "anySimpleType")
    protected String tripProfileSessionId;
    @XmlAttribute(name = "PromotionSessionId")
    @XmlSchemaType(name = "anySimpleType")
    protected String promotionSessionId;
    @XmlAttribute(name = "ImpressionSessionId")
    @XmlSchemaType(name = "anySimpleType")
    protected String impressionSessionId;
    @XmlAttribute(name = "SearchSessionId")
    @XmlSchemaType(name = "anySimpleType")
    protected String searchSessionId;
    @XmlAttribute(name = "SortType")
    protected String sortType;

    /**
     * 获取session属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SessionType }
     *     
     */
    public SessionType getSession() {
        return session;
    }

    /**
     * 设置session属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SessionType }
     *     
     */
    public void setSession(SessionType value) {
        this.session = value;
    }

    /**
     * 获取impression属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImpressionType }
     *     
     */
    public ImpressionType getImpression() {
        return impression;
    }

    /**
     * 设置impression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImpressionType }
     *     
     */
    public void setImpression(ImpressionType value) {
        this.impression = value;
    }

    /**
     * 获取search属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XPromotionType.Search }
     *     
     */
    public XPromotionType.Search getSearch() {
        return search;
    }

    /**
     * 设置search属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XPromotionType.Search }
     *     
     */
    public void setSearch(XPromotionType.Search value) {
        this.search = value;
    }

    /**
     * 获取conversion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConversionType }
     *     
     */
    public ConversionType getConversion() {
        return conversion;
    }

    /**
     * 设置conversion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionType }
     *     
     */
    public void setConversion(ConversionType value) {
        this.conversion = value;
    }

    /**
     * 获取promotionProfileId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionProfileId() {
        return promotionProfileId;
    }

    /**
     * 设置promotionProfileId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionProfileId(String value) {
        this.promotionProfileId = value;
    }

    /**
     * 获取tripProfileId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripProfileId() {
        return tripProfileId;
    }

    /**
     * 设置tripProfileId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripProfileId(String value) {
        this.tripProfileId = value;
    }

    /**
     * 获取promotionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionId() {
        return promotionId;
    }

    /**
     * 设置promotionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionId(String value) {
        this.promotionId = value;
    }

    /**
     * 获取impressionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpressionId() {
        return impressionId;
    }

    /**
     * 设置impressionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpressionId(String value) {
        this.impressionId = value;
    }

    /**
     * 获取searchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * 设置searchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchId(String value) {
        this.searchId = value;
    }

    /**
     * 获取promotionProfileSessionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionProfileSessionId() {
        return promotionProfileSessionId;
    }

    /**
     * 设置promotionProfileSessionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionProfileSessionId(String value) {
        this.promotionProfileSessionId = value;
    }

    /**
     * 获取tripProfileSessionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripProfileSessionId() {
        return tripProfileSessionId;
    }

    /**
     * 设置tripProfileSessionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripProfileSessionId(String value) {
        this.tripProfileSessionId = value;
    }

    /**
     * 获取promotionSessionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionSessionId() {
        return promotionSessionId;
    }

    /**
     * 设置promotionSessionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionSessionId(String value) {
        this.promotionSessionId = value;
    }

    /**
     * 获取impressionSessionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpressionSessionId() {
        return impressionSessionId;
    }

    /**
     * 设置impressionSessionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpressionSessionId(String value) {
        this.impressionSessionId = value;
    }

    /**
     * 获取searchSessionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchSessionId() {
        return searchSessionId;
    }

    /**
     * 设置searchSessionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchSessionId(String value) {
        this.searchSessionId = value;
    }

    /**
     * 获取sortType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortType() {
        return sortType;
    }

    /**
     * 设置sortType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortType(String value) {
        this.sortType = value;
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
     *         &lt;element name="Top">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Cheapest">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "top",
        "cheapest"
    })
    public static class Search {

        @XmlElement(name = "Top", required = true)
        protected XPromotionType.Search.Top top;
        @XmlElement(name = "Cheapest", required = true)
        protected XPromotionType.Search.Cheapest cheapest;
        @XmlAttribute(name = "Type", required = true)
        protected String type;

        /**
         * 获取top属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XPromotionType.Search.Top }
         *     
         */
        public XPromotionType.Search.Top getTop() {
            return top;
        }

        /**
         * 设置top属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XPromotionType.Search.Top }
         *     
         */
        public void setTop(XPromotionType.Search.Top value) {
            this.top = value;
        }

        /**
         * 获取cheapest属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XPromotionType.Search.Cheapest }
         *     
         */
        public XPromotionType.Search.Cheapest getCheapest() {
            return cheapest;
        }

        /**
         * 设置cheapest属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XPromotionType.Search.Cheapest }
         *     
         */
        public void setCheapest(XPromotionType.Search.Cheapest value) {
            this.cheapest = value;
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
        public static class Cheapest {

            @XmlAttribute(name = "Amount")
            protected Float amount;
            @XmlAttribute(name = "BaseAmount")
            protected Float baseAmount;
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
             * 获取baseAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getBaseAmount() {
                return baseAmount;
            }

            /**
             * 设置baseAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setBaseAmount(Float value) {
                this.baseAmount = value;
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
        public static class Top {

            @XmlAttribute(name = "Amount")
            protected Float amount;
            @XmlAttribute(name = "BaseAmount")
            protected Float baseAmount;
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
             * 获取baseAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getBaseAmount() {
                return baseAmount;
            }

            /**
             * 设置baseAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setBaseAmount(Float value) {
                this.baseAmount = value;
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
