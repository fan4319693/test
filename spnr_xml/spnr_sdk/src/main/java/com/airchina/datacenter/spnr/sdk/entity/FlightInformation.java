//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}restrictionType"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}airlinePrefs"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirDirectOnly"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}seatClass"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}eticketDesired"/>
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
    "restrictionType",
    "airlinePrefs",
    "airDirectOnly",
    "seatClass",
    "eticketDesired"
})
@XmlRootElement(name = "FlightInformation")
public class FlightInformation {

    @XmlElement(required = true)
    protected String restrictionType;
    @XmlElement(required = true)
    protected AirlinePrefs airlinePrefs;
    @XmlElement(name = "AirDirectOnly")
    protected boolean airDirectOnly;
    @XmlElement(required = true)
    protected SeatClass seatClass;
    @XmlElement(required = true)
    protected EticketDesired eticketDesired;

    /**
     * This choice is added simply to make this a valid restriction per the REC
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionType() {
        return restrictionType;
    }

    /**
     * 设置restrictionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionType(String value) {
        this.restrictionType = value;
    }

    /**
     * Container for any prefences releated to the flight component.  e.g. direct/indirect, airlines, etc.  Should be updated to a capital AirlinePrefs
     * 
     * @return
     *     possible object is
     *     {@link AirlinePrefs }
     *     
     */
    public AirlinePrefs getAirlinePrefs() {
        return airlinePrefs;
    }

    /**
     * 设置airlinePrefs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirlinePrefs }
     *     
     */
    public void setAirlinePrefs(AirlinePrefs value) {
        this.airlinePrefs = value;
    }

    /**
     * Indicates whether only direct flights are to be returned or not..
     * 
     */
    public boolean isAirDirectOnly() {
        return airDirectOnly;
    }

    /**
     * 设置airDirectOnly属性的值。
     * 
     */
    public void setAirDirectOnly(boolean value) {
        this.airDirectOnly = value;
    }

    /**
     * The type of cabin class preferred.  Should be moved under AirlinePrefs.  Only used if there is an air component to the searchType.
     * 
     * @return
     *     possible object is
     *     {@link SeatClass }
     *     
     */
    public SeatClass getSeatClass() {
        return seatClass;
    }

    /**
     * 设置seatClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeatClass }
     *     
     */
    public void setSeatClass(SeatClass value) {
        this.seatClass = value;
    }

    /**
     * eticket info.
     * 
     * @return
     *     possible object is
     *     {@link EticketDesired }
     *     
     */
    public EticketDesired getEticketDesired() {
        return eticketDesired;
    }

    /**
     * 设置eticketDesired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EticketDesired }
     *     
     */
    public void setEticketDesired(EticketDesired value) {
        this.eticketDesired = value;
    }

}
