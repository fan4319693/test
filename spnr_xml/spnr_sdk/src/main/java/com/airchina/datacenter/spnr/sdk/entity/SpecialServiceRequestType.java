//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

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
 * SSR's for this booking request e.g.,. meals
 * 
 * <p>SpecialServiceRequestType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SpecialServiceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Airline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="InfoEntries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InfoEntry" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
 *         &lt;element name="ReissuePrice" type="{http://www.opentravel.org/OTA/2003/05}ReissuePriceType" minOccurs="0"/>
 *         &lt;element name="AgeQualifications" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AgeQualification" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AgeQualifyingGroup"/>
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
 *       &lt;attribute name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *       &lt;attribute name="FlightRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PassengerTypeCodeList" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialServiceRequestType", propOrder = {
    "airline",
    "text",
    "description",
    "infoEntries",
    "fee",
    "reissuePrice",
    "ageQualifications"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.AirItineraryPricingInfoType.SpecialServiceRequests.SpecialServiceRequest.class,
    com.airchina.datacenter.spnr.sdk.entity.SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest.class
})
public class SpecialServiceRequestType {

    @XmlElement(name = "Airline")
    protected CompanyNameType airline;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "Description")
    protected List<ParagraphType> description;
    @XmlElement(name = "InfoEntries")
    protected SpecialServiceRequestType.InfoEntries infoEntries;
    @XmlElement(name = "Fee")
    protected FeeType fee;
    @XmlElement(name = "ReissuePrice")
    protected ReissuePriceType reissuePrice;
    @XmlElement(name = "AgeQualifications")
    protected SpecialServiceRequestType.AgeQualifications ageQualifications;
    @XmlAttribute(name = "SSRCode")
    protected String ssrCode;
    @XmlAttribute(name = "ServiceQuantity")
    protected Integer serviceQuantity;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "RPH")
    @XmlSchemaType(name = "anySimpleType")
    protected String rph;
    @XmlAttribute(name = "TravelerRefNumberRPHList")
    protected List<String> travelerRefNumberRPHList;
    @XmlAttribute(name = "FlightRefNumberRPHList")
    protected List<String> flightRefNumberRPHList;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
    @XmlAttribute(name = "PassengerTypeCodeList")
    @XmlSchemaType(name = "anySimpleType")
    protected String passengerTypeCodeList;

    /**
     * 获取airline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getAirline() {
        return airline;
    }

    /**
     * 设置airline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setAirline(CompanyNameType value) {
        this.airline = value;
    }

    /**
     * 获取text属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * 设置text属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
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
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getDescription() {
        if (description == null) {
            description = new ArrayList<ParagraphType>();
        }
        return this.description;
    }

    /**
     * 获取infoEntries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialServiceRequestType.InfoEntries }
     *     
     */
    public SpecialServiceRequestType.InfoEntries getInfoEntries() {
        return infoEntries;
    }

    /**
     * 设置infoEntries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialServiceRequestType.InfoEntries }
     *     
     */
    public void setInfoEntries(SpecialServiceRequestType.InfoEntries value) {
        this.infoEntries = value;
    }

    /**
     * 获取fee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FeeType }
     *     
     */
    public FeeType getFee() {
        return fee;
    }

    /**
     * 设置fee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType }
     *     
     */
    public void setFee(FeeType value) {
        this.fee = value;
    }

    /**
     * 获取reissuePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReissuePriceType }
     *     
     */
    public ReissuePriceType getReissuePrice() {
        return reissuePrice;
    }

    /**
     * 设置reissuePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReissuePriceType }
     *     
     */
    public void setReissuePrice(ReissuePriceType value) {
        this.reissuePrice = value;
    }

    /**
     * 获取ageQualifications属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialServiceRequestType.AgeQualifications }
     *     
     */
    public SpecialServiceRequestType.AgeQualifications getAgeQualifications() {
        return ageQualifications;
    }

    /**
     * 设置ageQualifications属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialServiceRequestType.AgeQualifications }
     *     
     */
    public void setAgeQualifications(SpecialServiceRequestType.AgeQualifications value) {
        this.ageQualifications = value;
    }

    /**
     * 获取ssrCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * 设置ssrCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

    /**
     * 获取serviceQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceQuantity() {
        return serviceQuantity;
    }

    /**
     * 设置serviceQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceQuantity(Integer value) {
        this.serviceQuantity = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the travelerRefNumberRPHList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerRefNumberRPHList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerRefNumberRPHList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTravelerRefNumberRPHList() {
        if (travelerRefNumberRPHList == null) {
            travelerRefNumberRPHList = new ArrayList<String>();
        }
        return this.travelerRefNumberRPHList;
    }

    /**
     * Gets the value of the flightRefNumberRPHList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightRefNumberRPHList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightRefNumberRPHList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlightRefNumberRPHList() {
        if (flightRefNumberRPHList == null) {
            flightRefNumberRPHList = new ArrayList<String>();
        }
        return this.flightRefNumberRPHList;
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
     * 获取passengerTypeCodeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCodeList() {
        return passengerTypeCodeList;
    }

    /**
     * 设置passengerTypeCodeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCodeList(String value) {
        this.passengerTypeCodeList = value;
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
     *         &lt;element name="AgeQualification" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AgeQualifyingGroup"/>
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
        "ageQualification"
    })
    public static class AgeQualifications {

        @XmlElement(name = "AgeQualification", required = true)
        protected List<SpecialServiceRequestType.AgeQualifications.AgeQualification> ageQualification;

        /**
         * Gets the value of the ageQualification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ageQualification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgeQualification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialServiceRequestType.AgeQualifications.AgeQualification }
         * 
         * 
         */
        public List<SpecialServiceRequestType.AgeQualifications.AgeQualification> getAgeQualification() {
            if (ageQualification == null) {
                ageQualification = new ArrayList<SpecialServiceRequestType.AgeQualifications.AgeQualification>();
            }
            return this.ageQualification;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AgeQualifyingGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AgeQualification {

            @XmlAttribute(name = "AgeQualifyingCode")
            protected String ageQualifyingCode;
            @XmlAttribute(name = "MinAge")
            protected Integer minAge;
            @XmlAttribute(name = "MaxAge")
            protected Integer maxAge;
            @XmlAttribute(name = "AgeTimeUnit")
            protected String ageTimeUnit;
            @XmlAttribute(name = "RuleCode")
            protected String ruleCode;

            /**
             * 获取ageQualifyingCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeQualifyingCode() {
                return ageQualifyingCode;
            }

            /**
             * 设置ageQualifyingCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeQualifyingCode(String value) {
                this.ageQualifyingCode = value;
            }

            /**
             * 获取minAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMinAge() {
                return minAge;
            }

            /**
             * 设置minAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMinAge(Integer value) {
                this.minAge = value;
            }

            /**
             * 获取maxAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxAge() {
                return maxAge;
            }

            /**
             * 设置maxAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxAge(Integer value) {
                this.maxAge = value;
            }

            /**
             * 获取ageTimeUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeTimeUnit() {
                return ageTimeUnit;
            }

            /**
             * 设置ageTimeUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeTimeUnit(String value) {
                this.ageTimeUnit = value;
            }

            /**
             * 获取ruleCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRuleCode() {
                return ruleCode;
            }

            /**
             * 设置ruleCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRuleCode(String value) {
                this.ruleCode = value;
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
     *         &lt;element name="InfoEntry" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "infoEntry"
    })
    public static class InfoEntries {

        @XmlElement(name = "InfoEntry")
        protected List<SpecialServiceRequestType.InfoEntries.InfoEntry> infoEntry;

        /**
         * Gets the value of the infoEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infoEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInfoEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialServiceRequestType.InfoEntries.InfoEntry }
         * 
         * 
         */
        public List<SpecialServiceRequestType.InfoEntries.InfoEntry> getInfoEntry() {
            if (infoEntry == null) {
                infoEntry = new ArrayList<SpecialServiceRequestType.InfoEntries.InfoEntry>();
            }
            return this.infoEntry;
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
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InfoEntry {

            @XmlAttribute(name = "Name")
            @XmlSchemaType(name = "anySimpleType")
            protected String name;
            @XmlAttribute(name = "Value")
            @XmlSchemaType(name = "anySimpleType")
            protected String value;

            /**
             * 获取name属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * 设置name属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
