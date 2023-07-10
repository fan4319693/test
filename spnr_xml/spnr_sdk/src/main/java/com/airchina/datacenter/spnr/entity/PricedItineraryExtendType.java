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
 *  Itinerary with pricing information.
 * 
 * <p>PricedItineraryExtendType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PricedItineraryExtendType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType">
 *       &lt;sequence>
 *         &lt;element name="Deeplink" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
 *         &lt;element name="Combo" type="{http://www.opentravel.org/OTA/2003/05}ComboType" minOccurs="0"/>
 *         &lt;element name="PTC_DocTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PTC_DocType" type="{http://www.opentravel.org/OTA/2003/05}PTC_DocTypeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PolicyStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OutboundSegmentReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="InboundSegmentReference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Airline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="CheckoutDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Num24HourPeriods" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="VehicleRangeNum" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AirlineVendorID" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaNumericLength2to3" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedItineraryExtendType", propOrder = {
    "deeplink",
    "exchangeRate",
    "reportingExchangeRates",
    "combo",
    "ptcDocTypes"
})
public class PricedItineraryExtendType
    extends PricedItineraryType
{

    @XmlElement(name = "Deeplink")
    protected Object deeplink;
    @XmlElement(name = "ExchangeRate")
    protected PricedItineraryExtendType.ExchangeRate exchangeRate;
    @XmlElement(name = "ReportingExchangeRates")
    protected PricedItineraryExtendType.ReportingExchangeRates reportingExchangeRates;
    @XmlElement(name = "Combo")
    protected ComboType combo;
    @XmlElement(name = "PTC_DocTypes")
    protected PricedItineraryExtendType.PTCDocTypes ptcDocTypes;
    @XmlAttribute(name = "PolicyStatus")
    protected String policyStatus;
    @XmlAttribute(name = "OutboundSegmentReference")
    @XmlSchemaType(name = "anySimpleType")
    protected String outboundSegmentReference;
    @XmlAttribute(name = "InboundSegmentReference")
    @XmlSchemaType(name = "anySimpleType")
    protected String inboundSegmentReference;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "Airline")
    protected String airline;
    @XmlAttribute(name = "CheckinDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkinDate;
    @XmlAttribute(name = "CheckoutDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkoutDate;
    @XmlAttribute(name = "Reference")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger reference;
    @XmlAttribute(name = "Num24HourPeriods")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger num24HourPeriods;
    @XmlAttribute(name = "PickUpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pickUpDate;
    @XmlAttribute(name = "ReturnDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar returnDate;
    @XmlAttribute(name = "VehicleRangeNum")
    protected Float vehicleRangeNum;
    @XmlAttribute(name = "Start")
    @XmlSchemaType(name = "anySimpleType")
    protected String start;
    @XmlAttribute(name = "End")
    @XmlSchemaType(name = "anySimpleType")
    protected String end;
    @XmlAttribute(name = "AirlineVendorID")
    protected String airlineVendorID;

    /**
     * 获取deeplink属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDeeplink() {
        return deeplink;
    }

    /**
     * 设置deeplink属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDeeplink(Object value) {
        this.deeplink = value;
    }

    /**
     * 获取exchangeRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricedItineraryExtendType.ExchangeRate }
     *     
     */
    public PricedItineraryExtendType.ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    /**
     * 设置exchangeRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricedItineraryExtendType.ExchangeRate }
     *     
     */
    public void setExchangeRate(PricedItineraryExtendType.ExchangeRate value) {
        this.exchangeRate = value;
    }

    /**
     * 获取reportingExchangeRates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricedItineraryExtendType.ReportingExchangeRates }
     *     
     */
    public PricedItineraryExtendType.ReportingExchangeRates getReportingExchangeRates() {
        return reportingExchangeRates;
    }

    /**
     * 设置reportingExchangeRates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricedItineraryExtendType.ReportingExchangeRates }
     *     
     */
    public void setReportingExchangeRates(PricedItineraryExtendType.ReportingExchangeRates value) {
        this.reportingExchangeRates = value;
    }

    /**
     * 获取combo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ComboType }
     *     
     */
    public ComboType getCombo() {
        return combo;
    }

    /**
     * 设置combo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ComboType }
     *     
     */
    public void setCombo(ComboType value) {
        this.combo = value;
    }

    /**
     * 获取ptcDocTypes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricedItineraryExtendType.PTCDocTypes }
     *     
     */
    public PricedItineraryExtendType.PTCDocTypes getPTCDocTypes() {
        return ptcDocTypes;
    }

    /**
     * 设置ptcDocTypes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricedItineraryExtendType.PTCDocTypes }
     *     
     */
    public void setPTCDocTypes(PricedItineraryExtendType.PTCDocTypes value) {
        this.ptcDocTypes = value;
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
     * 获取outboundSegmentReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundSegmentReference() {
        return outboundSegmentReference;
    }

    /**
     * 设置outboundSegmentReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundSegmentReference(String value) {
        this.outboundSegmentReference = value;
    }

    /**
     * 获取inboundSegmentReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundSegmentReference() {
        return inboundSegmentReference;
    }

    /**
     * 设置inboundSegmentReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundSegmentReference(String value) {
        this.inboundSegmentReference = value;
    }

    /**
     * 获取supplierCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * 设置supplierCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * 获取airline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirline() {
        return airline;
    }

    /**
     * 设置airline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirline(String value) {
        this.airline = value;
    }

    /**
     * 获取checkinDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckinDate() {
        return checkinDate;
    }

    /**
     * 设置checkinDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckinDate(XMLGregorianCalendar value) {
        this.checkinDate = value;
    }

    /**
     * 获取checkoutDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckoutDate() {
        return checkoutDate;
    }

    /**
     * 设置checkoutDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckoutDate(XMLGregorianCalendar value) {
        this.checkoutDate = value;
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
     * 获取num24HourPeriods属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNum24HourPeriods() {
        return num24HourPeriods;
    }

    /**
     * 设置num24HourPeriods属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNum24HourPeriods(BigInteger value) {
        this.num24HourPeriods = value;
    }

    /**
     * 获取pickUpDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpDate() {
        return pickUpDate;
    }

    /**
     * 设置pickUpDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpDate(XMLGregorianCalendar value) {
        this.pickUpDate = value;
    }

    /**
     * 获取returnDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDate() {
        return returnDate;
    }

    /**
     * 设置returnDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDate(XMLGregorianCalendar value) {
        this.returnDate = value;
    }

    /**
     * 获取vehicleRangeNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVehicleRangeNum() {
        return vehicleRangeNum;
    }

    /**
     * 设置vehicleRangeNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVehicleRangeNum(Float value) {
        this.vehicleRangeNum = value;
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
     * 获取airlineVendorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineVendorID() {
        return airlineVendorID;
    }

    /**
     * 设置airlineVendorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineVendorID(String value) {
        this.airlineVendorID = value;
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
     *       &lt;sequence>
     *         &lt;element name="PTC_DocType" type="{http://www.opentravel.org/OTA/2003/05}PTC_DocTypeType" maxOccurs="unbounded"/>
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
        "ptcDocType"
    })
    public static class PTCDocTypes {

        @XmlElement(name = "PTC_DocType", required = true)
        protected List<PTCDocTypeType> ptcDocType;

        /**
         * Gets the value of the ptcDocType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptcDocType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPTCDocType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCDocTypeType }
         * 
         * 
         */
        public List<PTCDocTypeType> getPTCDocType() {
            if (ptcDocType == null) {
                ptcDocType = new ArrayList<PTCDocTypeType>();
            }
            return this.ptcDocType;
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
