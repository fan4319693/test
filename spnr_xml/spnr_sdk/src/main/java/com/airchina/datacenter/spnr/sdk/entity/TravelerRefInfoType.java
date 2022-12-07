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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Traveler information.
 * 
 * <p>TravelerRefInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TravelerRefInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Initial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Age" minOccurs="0"/>
 *           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}DateOfBirth" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Gender" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}InfantData" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ProfileIndex" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AssociationID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PaxType" use="required" type="{http://www.opentravel.org/OTA/2003/05}PAXType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerRefInfoType", propOrder = {
    "surname",
    "givenName",
    "initial",
    "title",
    "age",
    "dateOfBirth",
    "gender",
    "infantData",
    "profileIndex"
})
public class TravelerRefInfoType {

    @XmlElement(name = "Surname", required = true)
    protected String surname;
    @XmlElement(name = "GivenName", required = true)
    protected String givenName;
    @XmlElement(name = "Initial")
    protected String initial;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Age")
    protected TravelerAgeType age;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected TravelerGenderType gender;
    @XmlElement(name = "InfantData")
    protected TravelerInfantType infantData;
    @XmlElement(name = "ProfileIndex")
    protected ProfileIndexType profileIndex;
    @XmlAttribute(name = "AssociationID", required = true)
    protected String associationID;
    @XmlAttribute(name = "PaxType", required = true)
    protected String paxType;

    /**
     * 获取surname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * 设置surname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * 获取givenName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * 设置givenName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * 获取initial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitial() {
        return initial;
    }

    /**
     * 设置initial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitial(String value) {
        this.initial = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取age属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelerAgeType }
     *     
     */
    public TravelerAgeType getAge() {
        return age;
    }

    /**
     * 设置age属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerAgeType }
     *     
     */
    public void setAge(TravelerAgeType value) {
        this.age = value;
    }

    /**
     * 获取dateOfBirth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * 设置dateOfBirth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelerGenderType }
     *     
     */
    public TravelerGenderType getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerGenderType }
     *     
     */
    public void setGender(TravelerGenderType value) {
        this.gender = value;
    }

    /**
     * 获取infantData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfantType }
     *     
     */
    public TravelerInfantType getInfantData() {
        return infantData;
    }

    /**
     * 设置infantData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfantType }
     *     
     */
    public void setInfantData(TravelerInfantType value) {
        this.infantData = value;
    }

    /**
     * 获取profileIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProfileIndexType }
     *     
     */
    public ProfileIndexType getProfileIndex() {
        return profileIndex;
    }

    /**
     * 设置profileIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileIndexType }
     *     
     */
    public void setProfileIndex(ProfileIndexType value) {
        this.profileIndex = value;
    }

    /**
     * 获取associationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationID() {
        return associationID;
    }

    /**
     * 设置associationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationID(String value) {
        this.associationID = value;
    }

    /**
     * 获取paxType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * 设置paxType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

}
