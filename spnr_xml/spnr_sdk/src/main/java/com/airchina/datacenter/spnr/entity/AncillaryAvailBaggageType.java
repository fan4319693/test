//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Baggage ancillary type definition mirrors the NDC BaggageAllowanceRS schema definition without using NDC namespace.
 * 
 * Please see Baggage_CommonTypes.xsd and BaggageSimpleTypes.xsl fir further information.
 * 
 * <p>AncillaryAvailBaggageType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AncillaryAvailBaggageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}InfoGroup" minOccurs="0"/>
 *         &lt;element name="USDOT" type="{http://www.opentravel.org/OTA/2003/05}USDOTType"/>
 *         &lt;element name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="OriginDestination" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Allowance" type="{http://www.opentravel.org/OTA/2003/05}AllowanceType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CarryOnAllowance" type="{http://www.opentravel.org/OTA/2003/05}CarryOnAllowanceType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}MediaContent" minOccurs="0"/>
 *                   &lt;element name="Service" type="{http://www.opentravel.org/OTA/2003/05}AirAncillariesServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DepartureArrivalCode"/>
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
@XmlType(name = "AncillaryAvailBaggageType", propOrder = {
    "infoGroup",
    "usdot",
    "currencyCode",
    "originDestination"
})
public class AncillaryAvailBaggageType {

    @XmlElement(name = "InfoGroup")
    protected InfoGroupType infoGroup;
    @XmlElement(name = "USDOT", required = true)
    protected USDOTType usdot;
    @XmlElement(name = "CurrencyCode")
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "OriginDestination", required = true)
    protected List<AncillaryAvailBaggageType.OriginDestination> originDestination;

    /**
     * 获取infoGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InfoGroupType }
     *     
     */
    public InfoGroupType getInfoGroup() {
        return infoGroup;
    }

    /**
     * 设置infoGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InfoGroupType }
     *     
     */
    public void setInfoGroup(InfoGroupType value) {
        this.infoGroup = value;
    }

    /**
     * 获取usdot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link USDOTType }
     *     
     */
    public USDOTType getUSDOT() {
        return usdot;
    }

    /**
     * 设置usdot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link USDOTType }
     *     
     */
    public void setUSDOT(USDOTType value) {
        this.usdot = value;
    }

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the originDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryAvailBaggageType.OriginDestination }
     * 
     * 
     */
    public List<AncillaryAvailBaggageType.OriginDestination> getOriginDestination() {
        if (originDestination == null) {
            originDestination = new ArrayList<AncillaryAvailBaggageType.OriginDestination>();
        }
        return this.originDestination;
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
     *         &lt;element name="Allowance" type="{http://www.opentravel.org/OTA/2003/05}AllowanceType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CarryOnAllowance" type="{http://www.opentravel.org/OTA/2003/05}CarryOnAllowanceType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}MediaContent" minOccurs="0"/>
     *         &lt;element name="Service" type="{http://www.opentravel.org/OTA/2003/05}AirAncillariesServiceType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DepartureArrivalCode"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allowance",
        "carryOnAllowance",
        "mediaContent",
        "service"
    })
    public static class OriginDestination {

        @XmlElement(name = "Allowance")
        protected List<AllowanceType> allowance;
        @XmlElement(name = "CarryOnAllowance")
        protected List<CarryOnAllowanceType> carryOnAllowance;
        @XmlElement(name = "MediaContent")
        protected MediaContentType mediaContent;
        @XmlElement(name = "Service")
        protected List<AirAncillariesServiceType> service;
        @XmlAttribute(name = "DepartureCode", required = true)
        protected String departureCode;
        @XmlAttribute(name = "ArrivalCode", required = true)
        protected String arrivalCode;

        /**
         * Gets the value of the allowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AllowanceType }
         * 
         * 
         */
        public List<AllowanceType> getAllowance() {
            if (allowance == null) {
                allowance = new ArrayList<AllowanceType>();
            }
            return this.allowance;
        }

        /**
         * Gets the value of the carryOnAllowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carryOnAllowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarryOnAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CarryOnAllowanceType }
         * 
         * 
         */
        public List<CarryOnAllowanceType> getCarryOnAllowance() {
            if (carryOnAllowance == null) {
                carryOnAllowance = new ArrayList<CarryOnAllowanceType>();
            }
            return this.carryOnAllowance;
        }

        /**
         * 获取mediaContent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MediaContentType }
         *     
         */
        public MediaContentType getMediaContent() {
            return mediaContent;
        }

        /**
         * 设置mediaContent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MediaContentType }
         *     
         */
        public void setMediaContent(MediaContentType value) {
            this.mediaContent = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirAncillariesServiceType }
         * 
         * 
         */
        public List<AirAncillariesServiceType> getService() {
            if (service == null) {
                service = new ArrayList<AirAncillariesServiceType>();
            }
            return this.service;
        }

        /**
         * 获取departureCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureCode() {
            return departureCode;
        }

        /**
         * 设置departureCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureCode(String value) {
            this.departureCode = value;
        }

        /**
         * 获取arrivalCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrivalCode() {
            return arrivalCode;
        }

        /**
         * 设置arrivalCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrivalCode(String value) {
            this.arrivalCode = value;
        }

    }

}
