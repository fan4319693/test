//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An identifier used to uniquely reference an object in a system (e.g. an airline reservation reference, customer profile reference, booking confirmation number, or a reference to a previous availability quote). 
 * 
 * <p>UniqueID_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UniqueID_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UniqueID_Group"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniqueID_Type", propOrder = {
    "companyName"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.ModularProductType.CrossRefs.UniqueID.class,
    com.airchina.datacenter.spnr.sdk.entity.SuperPNRType.CrossRefs.UniqueID.class,
    com.airchina.datacenter.spnr.sdk.entity.TicketingFullInfoType.FlightInfo.BookingInfo.BookingReferenceID.class,
    com.airchina.datacenter.spnr.sdk.entity.ProfileVerificationType.UserID.class,
    com.airchina.datacenter.spnr.sdk.entity.VerificationPNR.Primary.UniqueID.class,
    com.airchina.datacenter.spnr.sdk.entity.RoomStaysType.RoomStay.Reference.class,
    com.airchina.datacenter.spnr.sdk.entity.VehicleReservationRQAdditionalInfoType.Reference.class,
    com.airchina.datacenter.spnr.sdk.entity.VehicleAvailCoreType.Reference.class,
    com.airchina.datacenter.spnr.sdk.entity.CruiseGuestInfoType.ReservationID.class,
    com.airchina.datacenter.spnr.sdk.entity.UniqueIDsType.UniqueID.class,
    com.airchina.datacenter.spnr.sdk.entity.AirReservationType.BookingReferenceID.class,
    com.airchina.datacenter.spnr.sdk.entity.HotelResModifyRequestType.UniqueID.class,
    com.airchina.datacenter.spnr.sdk.entity.HotelReservationType.UniqueID.class,
    SupplierBookingReferenceIDType.class,
    com.airchina.datacenter.spnr.sdk.entity.ProfileType.UserID.class,
    RequestorIDType.class,
    FerryUniqueIDType.class
})
public class UniqueIDType {

    @XmlElement(name = "CompanyName")
    protected CompanyNameType companyName;
    @XmlAttribute(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Instance")
    protected String instance;
    @XmlAttribute(name = "AuditID")
    protected String auditID;
    @XmlAttribute(name = "ID_Context")
    protected String idContext;
    @XmlAttribute(name = "Synchronise")
    protected Boolean synchronise;
    @XmlAttribute(name = "ID_Source")
    protected String idSource;
    @XmlAttribute(name = "ID")
    protected String id;

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
     * 获取url属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * 设置url属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
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
     * 获取instance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstance() {
        return instance;
    }

    /**
     * 设置instance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstance(String value) {
        this.instance = value;
    }

    /**
     * 获取auditID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditID() {
        return auditID;
    }

    /**
     * 设置auditID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditID(String value) {
        this.auditID = value;
    }

    /**
     * 获取idContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDContext() {
        return idContext;
    }

    /**
     * 设置idContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDContext(String value) {
        this.idContext = value;
    }

    /**
     * 获取synchronise属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSynchronise() {
        return synchronise;
    }

    /**
     * 设置synchronise属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSynchronise(Boolean value) {
        this.synchronise = value;
    }

    /**
     * 获取idSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDSource() {
        return idSource;
    }

    /**
     * 设置idSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDSource(String value) {
        this.idSource = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
