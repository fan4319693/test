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
 * Provides information on the source of a request.
 * 
 * <p>SourceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestorID" type="{http://www.opentravel.org/OTA/2003/05}RequestorIDType" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.opentravel.org/OTA/2003/05}PositionType" minOccurs="0"/>
 *         &lt;element name="BookingChannel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BookingChannelGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SellerProfile" type="{http://www.opentravel.org/OTA/2003/05}SellerProfileType" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://www.opentravel.org/OTA/2003/05}DeviceType" minOccurs="0"/>
 *         &lt;element name="CorporateIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CorporateID" type="{http://www.opentravel.org/OTA/2003/05}CorporateType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Config" type="{http://www.opentravel.org/OTA/2003/05}SourceConfigType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AgentSine" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="ISOCountry" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *       &lt;attribute name="ISOCurrency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="AgentDutyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="AirlineVendorID" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaNumericLength2to3" />
 *       &lt;attribute name="AirportCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaNumericLength3to5" />
 *       &lt;attribute name="FirstDepartPoint" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
 *       &lt;attribute name="ERSP_UserID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="TerminalID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="Channel" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="Locale" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TripProfile" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TestToken" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="EntryPoint" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceType", propOrder = {
    "requestorID",
    "position",
    "bookingChannel",
    "sellerProfile",
    "device",
    "corporateIDs",
    "config"
})
@XmlSeeAlso({
    FerrySourceType.class
})
public class SourceType {

    @XmlElement(name = "RequestorID")
    protected RequestorIDType requestorID;
    @XmlElement(name = "Position")
    protected PositionType position;
    @XmlElement(name = "BookingChannel")
    protected SourceType.BookingChannel bookingChannel;
    @XmlElement(name = "SellerProfile")
    protected SellerProfileType sellerProfile;
    @XmlElement(name = "Device")
    protected DeviceType device;
    @XmlElement(name = "CorporateIDs")
    protected SourceType.CorporateIDs corporateIDs;
    @XmlElement(name = "Config")
    protected SourceConfigType config;
    @XmlAttribute(name = "CityCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String cityCode;
    @XmlAttribute(name = "AgentSine")
    protected String agentSine;
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "ISOCountry")
    protected String isoCountry;
    @XmlAttribute(name = "ISOCurrency")
    protected String isoCurrency;
    @XmlAttribute(name = "AgentDutyCode")
    protected String agentDutyCode;
    @XmlAttribute(name = "AirlineVendorID")
    protected String airlineVendorID;
    @XmlAttribute(name = "AirportCode")
    protected String airportCode;
    @XmlAttribute(name = "FirstDepartPoint")
    protected String firstDepartPoint;
    @XmlAttribute(name = "ERSP_UserID")
    protected String erspUserID;
    @XmlAttribute(name = "TerminalID")
    protected String terminalID;
    @XmlAttribute(name = "Channel")
    protected String channel;
    @XmlAttribute(name = "Locale")
    @XmlSchemaType(name = "anySimpleType")
    protected String locale;
    @XmlAttribute(name = "TripProfile")
    @XmlSchemaType(name = "anySimpleType")
    protected String tripProfile;
    @XmlAttribute(name = "TestToken")
    protected String testToken;
    @XmlAttribute(name = "EntryPoint")
    protected String entryPoint;

    /**
     * 获取requestorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequestorIDType }
     *     
     */
    public RequestorIDType getRequestorID() {
        return requestorID;
    }

    /**
     * 设置requestorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorIDType }
     *     
     */
    public void setRequestorID(RequestorIDType value) {
        this.requestorID = value;
    }

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setPosition(PositionType value) {
        this.position = value;
    }

    /**
     * 获取bookingChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SourceType.BookingChannel }
     *     
     */
    public SourceType.BookingChannel getBookingChannel() {
        return bookingChannel;
    }

    /**
     * 设置bookingChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType.BookingChannel }
     *     
     */
    public void setBookingChannel(SourceType.BookingChannel value) {
        this.bookingChannel = value;
    }

    /**
     * 获取sellerProfile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SellerProfileType }
     *     
     */
    public SellerProfileType getSellerProfile() {
        return sellerProfile;
    }

    /**
     * 设置sellerProfile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SellerProfileType }
     *     
     */
    public void setSellerProfile(SellerProfileType value) {
        this.sellerProfile = value;
    }

    /**
     * 获取device属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getDevice() {
        return device;
    }

    /**
     * 设置device属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     */
    public void setDevice(DeviceType value) {
        this.device = value;
    }

    /**
     * 获取corporateIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SourceType.CorporateIDs }
     *     
     */
    public SourceType.CorporateIDs getCorporateIDs() {
        return corporateIDs;
    }

    /**
     * 设置corporateIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType.CorporateIDs }
     *     
     */
    public void setCorporateIDs(SourceType.CorporateIDs value) {
        this.corporateIDs = value;
    }

    /**
     * 获取config属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SourceConfigType }
     *     
     */
    public SourceConfigType getConfig() {
        return config;
    }

    /**
     * 设置config属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SourceConfigType }
     *     
     */
    public void setConfig(SourceConfigType value) {
        this.config = value;
    }

    /**
     * 获取cityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置cityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * 获取agentSine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSine() {
        return agentSine;
    }

    /**
     * 设置agentSine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentSine(String value) {
        this.agentSine = value;
    }

    /**
     * 获取pseudoCityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * 设置pseudoCityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * 获取isoCountry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCountry() {
        return isoCountry;
    }

    /**
     * 设置isoCountry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCountry(String value) {
        this.isoCountry = value;
    }

    /**
     * 获取isoCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCurrency() {
        return isoCurrency;
    }

    /**
     * 设置isoCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCurrency(String value) {
        this.isoCurrency = value;
    }

    /**
     * 获取agentDutyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentDutyCode() {
        return agentDutyCode;
    }

    /**
     * 设置agentDutyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentDutyCode(String value) {
        this.agentDutyCode = value;
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
     * 获取airportCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * 设置airportCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
    }

    /**
     * 获取firstDepartPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDepartPoint() {
        return firstDepartPoint;
    }

    /**
     * 设置firstDepartPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDepartPoint(String value) {
        this.firstDepartPoint = value;
    }

    /**
     * 获取erspUserID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERSPUserID() {
        return erspUserID;
    }

    /**
     * 设置erspUserID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERSPUserID(String value) {
        this.erspUserID = value;
    }

    /**
     * 获取terminalID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * 设置terminalID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * 获取channel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置channel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * 获取locale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * 设置locale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * 获取tripProfile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripProfile() {
        return tripProfile;
    }

    /**
     * 设置tripProfile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripProfile(String value) {
        this.tripProfile = value;
    }

    /**
     * 获取testToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestToken() {
        return testToken;
    }

    /**
     * 设置testToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestToken(String value) {
        this.testToken = value;
    }

    /**
     * 获取entryPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryPoint() {
        return entryPoint;
    }

    /**
     * 设置entryPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryPoint(String value) {
        this.entryPoint = value;
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
     *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BookingChannelGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "companyName"
    })
    public static class BookingChannel {

        @XmlElement(name = "CompanyName")
        protected CompanyNameType companyName;
        @XmlAttribute(name = "Type", required = true)
        protected String type;
        @XmlAttribute(name = "Primary")
        protected Boolean primary;

        /**
         * 获取companyName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CompanyNameType }
         *     
         */
        public CompanyNameType getCompanyName() {
            return companyName;
        }

        /**
         * 设置companyName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyNameType }
         *     
         */
        public void setCompanyName(CompanyNameType value) {
            this.companyName = value;
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
         * 获取primary属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimary() {
            return primary;
        }

        /**
         * 设置primary属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimary(Boolean value) {
            this.primary = value;
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
     *         &lt;element name="CorporateID" type="{http://www.opentravel.org/OTA/2003/05}CorporateType" maxOccurs="unbounded" minOccurs="0"/>
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
        "corporateID"
    })
    public static class CorporateIDs {

        @XmlElement(name = "CorporateID")
        protected List<CorporateType> corporateID;

        /**
         * Gets the value of the corporateID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the corporateID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCorporateID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CorporateType }
         * 
         * 
         */
        public List<CorporateType> getCorporateID() {
            if (corporateID == null) {
                corporateID = new ArrayList<CorporateType>();
            }
            return this.corporateID;
        }

    }

}
