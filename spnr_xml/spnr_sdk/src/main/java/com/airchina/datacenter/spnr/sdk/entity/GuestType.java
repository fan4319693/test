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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Provides information regarding the guest name and the guest's mode of transportation.
 * 
 * <p>GuestType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GuestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *         &lt;element name="GuestTransportation" type="{http://www.opentravel.org/OTA/2003/05}GuestTransportationType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GuestInfoGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestType", propOrder = {
    "guestName",
    "guestTransportation"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.CruiseBookingInfoType.GuestPrices.GuestPrice.class
})
public class GuestType {

    @XmlElement(name = "GuestName")
    protected PersonNameType guestName;
    @XmlElement(name = "GuestTransportation")
    protected List<GuestTransportationType> guestTransportation;
    @XmlAttribute(name = "GuestRefNumber")
    protected Integer guestRefNumber;
    @XmlAttribute(name = "Age")
    protected Integer age;
    @XmlAttribute(name = "Nationality")
    protected String nationality;
    @XmlAttribute(name = "GuestOccupation")
    protected String guestOccupation;
    @XmlAttribute(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "Gender")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gender;
    @XmlAttribute(name = "LoyaltyMembershipID")
    protected String loyaltyMembershipID;
    @XmlAttribute(name = "LoyalLevel")
    protected String loyalLevel;
    @XmlAttribute(name = "LoyalLevelCode")
    protected Integer loyalLevelCode;

    /**
     * 获取guestName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getGuestName() {
        return guestName;
    }

    /**
     * 设置guestName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setGuestName(PersonNameType value) {
        this.guestName = value;
    }

    /**
     * Gets the value of the guestTransportation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestTransportation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestTransportation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestTransportationType }
     * 
     * 
     */
    public List<GuestTransportationType> getGuestTransportation() {
        if (guestTransportation == null) {
            guestTransportation = new ArrayList<GuestTransportationType>();
        }
        return this.guestTransportation;
    }

    /**
     * 获取guestRefNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuestRefNumber() {
        return guestRefNumber;
    }

    /**
     * 设置guestRefNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuestRefNumber(Integer value) {
        this.guestRefNumber = value;
    }

    /**
     * 获取age属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置age属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * 获取nationality属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 设置nationality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * 获取guestOccupation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestOccupation() {
        return guestOccupation;
    }

    /**
     * 设置guestOccupation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestOccupation(String value) {
        this.guestOccupation = value;
    }

    /**
     * 获取birthDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * 设置birthDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * 获取loyaltyMembershipID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyMembershipID() {
        return loyaltyMembershipID;
    }

    /**
     * 设置loyaltyMembershipID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyMembershipID(String value) {
        this.loyaltyMembershipID = value;
    }

    /**
     * 获取loyalLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyalLevel() {
        return loyalLevel;
    }

    /**
     * 设置loyalLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyalLevel(String value) {
        this.loyalLevel = value;
    }

    /**
     * 获取loyalLevelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoyalLevelCode() {
        return loyalLevelCode;
    }

    /**
     * 设置loyalLevelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoyalLevelCode(Integer value) {
        this.loyalLevelCode = value;
    }

}
