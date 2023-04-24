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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The VehicleVendorAvailabilityType complex type identifies the data that describes the availability of one or more vehicles for a specific vendor, along with supplemental information about the vendor and the facilities of that vendor.
 * 
 * <p>VehicleVendorAvailabilityType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleVendorAvailabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="VehAvails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehAvail" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VehAvailCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType"/>
 *                             &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
 *                             &lt;element name="AdvanceBooking" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
 *                                     &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/>
 *                             &lt;element name="Info" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailVendorInfoType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="Display" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="PolicyStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RateCategory" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}RatePeriodSimpleType" />
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
@XmlType(name = "VehicleVendorAvailabilityType", propOrder = {
    "vendor",
    "vehAvails"
})
public class VehicleVendorAvailabilityType {

    @XmlElement(name = "Vendor")
    protected CompanyNameType vendor;
    @XmlElement(name = "VehAvails", required = true)
    protected VehicleVendorAvailabilityType.VehAvails vehAvails;

    /**
     * 获取vendor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getVendor() {
        return vendor;
    }

    /**
     * 设置vendor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setVendor(CompanyNameType value) {
        this.vendor = value;
    }

    /**
     * 获取vehAvails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleVendorAvailabilityType.VehAvails }
     *     
     */
    public VehicleVendorAvailabilityType.VehAvails getVehAvails() {
        return vehAvails;
    }

    /**
     * 设置vehAvails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleVendorAvailabilityType.VehAvails }
     *     
     */
    public void setVehAvails(VehicleVendorAvailabilityType.VehAvails value) {
        this.vehAvails = value;
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
     *         &lt;element name="VehAvail" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VehAvailCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType"/>
     *                   &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
     *                   &lt;element name="AdvanceBooking" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
     *                           &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/>
     *                   &lt;element name="Info" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailVendorInfoType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="Display" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="PolicyStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RateCategory" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}RatePeriodSimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehAvail"
    })
    public static class VehAvails {

        @XmlElement(name = "VehAvail", required = true)
        protected List<VehicleVendorAvailabilityType.VehAvails.VehAvail> vehAvail;
        @XmlAttribute(name = "RateCategory")
        protected String rateCategory;
        @XmlAttribute(name = "RatePeriod")
        protected RatePeriodSimpleType ratePeriod;

        /**
         * Gets the value of the vehAvail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehAvail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehAvail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleVendorAvailabilityType.VehAvails.VehAvail }
         * 
         * 
         */
        public List<VehicleVendorAvailabilityType.VehAvails.VehAvail> getVehAvail() {
            if (vehAvail == null) {
                vehAvail = new ArrayList<VehicleVendorAvailabilityType.VehAvails.VehAvail>();
            }
            return this.vehAvail;
        }

        /**
         * 获取rateCategory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateCategory() {
            return rateCategory;
        }

        /**
         * 设置rateCategory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateCategory(String value) {
            this.rateCategory = value;
        }

        /**
         * 获取ratePeriod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RatePeriodSimpleType }
         *     
         */
        public RatePeriodSimpleType getRatePeriod() {
            return ratePeriod;
        }

        /**
         * 设置ratePeriod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RatePeriodSimpleType }
         *     
         */
        public void setRatePeriod(RatePeriodSimpleType value) {
            this.ratePeriod = value;
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
         *         &lt;element name="VehAvailCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType"/>
         *         &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
         *         &lt;element name="AdvanceBooking" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
         *                 &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/>
         *         &lt;element name="Info" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailVendorInfoType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="Display" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="PolicyStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vehAvailCore",
            "vehAvailInfo",
            "advanceBooking",
            "vehRentalCore",
            "info"
        })
        public static class VehAvail {

            @XmlElement(name = "VehAvailCore", required = true)
            protected VehicleAvailCoreType vehAvailCore;
            @XmlElement(name = "VehAvailInfo")
            protected VehicleAvailAdditionalInfoType vehAvailInfo;
            @XmlElement(name = "AdvanceBooking")
            protected VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking advanceBooking;
            @XmlElement(name = "VehRentalCore", required = true)
            protected VehicleRentalCoreType vehRentalCore;
            @XmlElement(name = "Info")
            protected VehicleVendorAvailabilityType.VehAvails.VehAvail.Info info;
            @XmlAttribute(name = "Reference")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger reference;
            @XmlAttribute(name = "Display")
            protected Boolean display;
            @XmlAttribute(name = "PolicyStatus")
            protected String policyStatus;

            /**
             * 获取vehAvailCore属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleAvailCoreType }
             *     
             */
            public VehicleAvailCoreType getVehAvailCore() {
                return vehAvailCore;
            }

            /**
             * 设置vehAvailCore属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleAvailCoreType }
             *     
             */
            public void setVehAvailCore(VehicleAvailCoreType value) {
                this.vehAvailCore = value;
            }

            /**
             * 获取vehAvailInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleAvailAdditionalInfoType }
             *     
             */
            public VehicleAvailAdditionalInfoType getVehAvailInfo() {
                return vehAvailInfo;
            }

            /**
             * 设置vehAvailInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleAvailAdditionalInfoType }
             *     
             */
            public void setVehAvailInfo(VehicleAvailAdditionalInfoType value) {
                this.vehAvailInfo = value;
            }

            /**
             * 获取advanceBooking属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking }
             *     
             */
            public VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking getAdvanceBooking() {
                return advanceBooking;
            }

            /**
             * 设置advanceBooking属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking }
             *     
             */
            public void setAdvanceBooking(VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking value) {
                this.advanceBooking = value;
            }

            /**
             * 获取vehRentalCore属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleRentalCoreType }
             *     
             */
            public VehicleRentalCoreType getVehRentalCore() {
                return vehRentalCore;
            }

            /**
             * 设置vehRentalCore属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleRentalCoreType }
             *     
             */
            public void setVehRentalCore(VehicleRentalCoreType value) {
                this.vehRentalCore = value;
            }

            /**
             * 获取info属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleVendorAvailabilityType.VehAvails.VehAvail.Info }
             *     
             */
            public VehicleVendorAvailabilityType.VehAvails.VehAvail.Info getInfo() {
                return info;
            }

            /**
             * 设置info属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleVendorAvailabilityType.VehAvails.VehAvail.Info }
             *     
             */
            public void setInfo(VehicleVendorAvailabilityType.VehAvails.VehAvail.Info value) {
                this.info = value;
            }

            /**
             * 获取reference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getReference() {
                return reference;
            }

            /**
             * 设置reference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setReference(BigInteger value) {
                this.reference = value;
            }

            /**
             * 获取display属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDisplay() {
                return display;
            }

            /**
             * 设置display属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDisplay(Boolean value) {
                this.display = value;
            }

            /**
             * 获取policyStatus属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPolicyStatus() {
                return policyStatus;
            }

            /**
             * 设置policyStatus属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPolicyStatus(String value) {
                this.policyStatus = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
             *       &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AdvanceBooking {

                @XmlAttribute(name = "RulesApplyInd")
                protected Boolean rulesApplyInd;
                @XmlAttribute(name = "AbsoluteDeadline")
                protected String absoluteDeadline;
                @XmlAttribute(name = "OffsetTimeUnit")
                protected String offsetTimeUnit;
                @XmlAttribute(name = "OffsetUnitMultiplier")
                protected Integer offsetUnitMultiplier;
                @XmlAttribute(name = "OffsetDropTime")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String offsetDropTime;
                @XmlAttribute(name = "From")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar from;
                @XmlAttribute(name = "To")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar to;

                /**
                 * 获取rulesApplyInd属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRulesApplyInd() {
                    return rulesApplyInd;
                }

                /**
                 * 设置rulesApplyInd属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRulesApplyInd(Boolean value) {
                    this.rulesApplyInd = value;
                }

                /**
                 * 获取absoluteDeadline属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAbsoluteDeadline() {
                    return absoluteDeadline;
                }

                /**
                 * 设置absoluteDeadline属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAbsoluteDeadline(String value) {
                    this.absoluteDeadline = value;
                }

                /**
                 * 获取offsetTimeUnit属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOffsetTimeUnit() {
                    return offsetTimeUnit;
                }

                /**
                 * 设置offsetTimeUnit属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOffsetTimeUnit(String value) {
                    this.offsetTimeUnit = value;
                }

                /**
                 * 获取offsetUnitMultiplier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOffsetUnitMultiplier() {
                    return offsetUnitMultiplier;
                }

                /**
                 * 设置offsetUnitMultiplier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOffsetUnitMultiplier(Integer value) {
                    this.offsetUnitMultiplier = value;
                }

                /**
                 * 获取offsetDropTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOffsetDropTime() {
                    return offsetDropTime;
                }

                /**
                 * 设置offsetDropTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOffsetDropTime(String value) {
                    this.offsetDropTime = value;
                }

                /**
                 * 获取from属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFrom() {
                    return from;
                }

                /**
                 * 设置from属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFrom(XMLGregorianCalendar value) {
                    this.from = value;
                }

                /**
                 * 获取to属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getTo() {
                    return to;
                }

                /**
                 * 设置to属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setTo(XMLGregorianCalendar value) {
                    this.to = value;
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
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailVendorInfoType">
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Info
                extends VehicleAvailVendorInfoType
            {

                @XmlAttribute(name = "DocumentationRequired")
                protected String documentationRequired;
                @XmlAttribute(name = "DocReqExclCountries")
                protected List<String> docReqExclCountries;
                @XmlAttribute(name = "DocReqInclCountries")
                protected List<String> docReqInclCountries;

                /**
                 * 获取documentationRequired属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocumentationRequired() {
                    return documentationRequired;
                }

                /**
                 * 设置documentationRequired属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocumentationRequired(String value) {
                    this.documentationRequired = value;
                }

                /**
                 * Gets the value of the docReqExclCountries property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the docReqExclCountries property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDocReqExclCountries().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getDocReqExclCountries() {
                    if (docReqExclCountries == null) {
                        docReqExclCountries = new ArrayList<String>();
                    }
                    return this.docReqExclCountries;
                }

                /**
                 * Gets the value of the docReqInclCountries property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the docReqInclCountries property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDocReqInclCountries().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getDocReqInclCountries() {
                    if (docReqInclCountries == null) {
                        docReqInclCountries = new ArrayList<String>();
                    }
                    return this.docReqInclCountries;
                }

            }

        }

    }

}
