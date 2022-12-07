//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Specials
 * 
 * <p>Specials complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Specials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Special" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="RoomTypes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="RoomType">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="StayDates" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="StayDate" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BookingDates" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                                                 &lt;element name="BookingDate" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="DOW">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                   &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                   &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                   &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                   &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                   &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                   &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="From" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                                         &lt;attribute name="To" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                                         &lt;attribute name="AdvancedBookingOffset">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                                               &lt;minInclusive value="1"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DOW">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ArrivalDaysOfWeek" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Discount">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="Description" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="Text" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="Language" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ContractMinStay">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 &lt;minInclusive value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ContractMaxStay">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 &lt;minInclusive value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="ApplyType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Nights" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="MinNumOfRooms">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 &lt;minInclusive value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="MaxNumOfRooms">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 &lt;minInclusive value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="MinNumOfGuests">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 &lt;minInclusive value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="MaxNumOfGuests">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 &lt;minInclusive value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Code" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ApplyOrder" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                       &lt;minInclusive value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Combinable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ApplyCheapest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "Specials", propOrder = {
    "special"
})
public class Specials {

    @XmlElement(name = "Special")
    protected List<Specials.Special> special;

    /**
     * Gets the value of the special property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the special property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Specials.Special }
     * 
     * 
     */
    public List<Specials.Special> getSpecial() {
        if (special == null) {
            special = new ArrayList<Specials.Special>();
        }
        return this.special;
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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="RoomTypes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="RoomType">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="StayDates" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="StayDate" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BookingDates" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                                       &lt;element name="BookingDate" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="DOW">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                         &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                         &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                         &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                         &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                         &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                         &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="From" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                               &lt;attribute name="To" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                               &lt;attribute name="AdvancedBookingOffset">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                                     &lt;minInclusive value="1"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DOW">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ArrivalDaysOfWeek" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Discount">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="Description" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                             &lt;element name="Text" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="Language" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ContractMinStay">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="ContractMaxStay">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="ApplyType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Nights" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="MinNumOfRooms">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="MaxNumOfRooms">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="MinNumOfGuests">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="MaxNumOfGuests">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Code" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ApplyOrder" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *             &lt;minInclusive value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Combinable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ApplyCheapest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomTypes",
        "stayDates",
        "discount"
    })
    public static class Special {

        @XmlElement(name = "RoomTypes")
        protected Specials.Special.RoomTypes roomTypes;
        @XmlElement(name = "StayDates")
        protected Specials.Special.StayDates stayDates;
        @XmlElement(name = "Discount")
        protected Specials.Special.Discount discount;
        @XmlAttribute(name = "Code", required = true)
        protected String code;
        @XmlAttribute(name = "ApplyOrder", required = true)
        protected int applyOrder;
        @XmlAttribute(name = "Enabled", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String enabled;
        @XmlAttribute(name = "Combinable")
        protected Boolean combinable;
        @XmlAttribute(name = "ApplyCheapest")
        protected Boolean applyCheapest;

        /**
         * 获取roomTypes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Specials.Special.RoomTypes }
         *     
         */
        public Specials.Special.RoomTypes getRoomTypes() {
            return roomTypes;
        }

        /**
         * 设置roomTypes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Specials.Special.RoomTypes }
         *     
         */
        public void setRoomTypes(Specials.Special.RoomTypes value) {
            this.roomTypes = value;
        }

        /**
         * 获取stayDates属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Specials.Special.StayDates }
         *     
         */
        public Specials.Special.StayDates getStayDates() {
            return stayDates;
        }

        /**
         * 设置stayDates属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Specials.Special.StayDates }
         *     
         */
        public void setStayDates(Specials.Special.StayDates value) {
            this.stayDates = value;
        }

        /**
         * 获取discount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Specials.Special.Discount }
         *     
         */
        public Specials.Special.Discount getDiscount() {
            return discount;
        }

        /**
         * 设置discount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Specials.Special.Discount }
         *     
         */
        public void setDiscount(Specials.Special.Discount value) {
            this.discount = value;
        }

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * 获取applyOrder属性的值。
         * 
         */
        public int getApplyOrder() {
            return applyOrder;
        }

        /**
         * 设置applyOrder属性的值。
         * 
         */
        public void setApplyOrder(int value) {
            this.applyOrder = value;
        }

        /**
         * 获取enabled属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnabled() {
            return enabled;
        }

        /**
         * 设置enabled属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnabled(String value) {
            this.enabled = value;
        }

        /**
         * 获取combinable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCombinable() {
            return combinable;
        }

        /**
         * 设置combinable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCombinable(Boolean value) {
            this.combinable = value;
        }

        /**
         * 获取applyCheapest属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isApplyCheapest() {
            return applyCheapest;
        }

        /**
         * 设置applyCheapest属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setApplyCheapest(Boolean value) {
            this.applyCheapest = value;
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
         *       &lt;sequence minOccurs="0">
         *         &lt;element name="Description" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
         *                   &lt;element name="Text" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="Language" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ContractMinStay">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             &lt;minInclusive value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="ContractMaxStay">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             &lt;minInclusive value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="ApplyType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Nights" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="MinNumOfRooms">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             &lt;minInclusive value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="MaxNumOfRooms">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             &lt;minInclusive value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="MinNumOfGuests">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             &lt;minInclusive value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="MaxNumOfGuests">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             &lt;minInclusive value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description"
        })
        public static class Discount {

            @XmlElement(name = "Description")
            protected Specials.Special.Discount.Description description;
            @XmlAttribute(name = "ContractMinStay")
            protected Integer contractMinStay;
            @XmlAttribute(name = "ContractMaxStay")
            protected Integer contractMaxStay;
            @XmlAttribute(name = "Code", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String code;
            @XmlAttribute(name = "Amount", required = true)
            protected float amount;
            @XmlAttribute(name = "ApplyType", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String applyType;
            @XmlAttribute(name = "Nights")
            @XmlSchemaType(name = "anySimpleType")
            protected String nights;
            @XmlAttribute(name = "MinNumOfRooms")
            protected Integer minNumOfRooms;
            @XmlAttribute(name = "MaxNumOfRooms")
            protected Integer maxNumOfRooms;
            @XmlAttribute(name = "MinNumOfGuests")
            protected Integer minNumOfGuests;
            @XmlAttribute(name = "MaxNumOfGuests")
            protected Integer maxNumOfGuests;

            /**
             * 获取description属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Specials.Special.Discount.Description }
             *     
             */
            public Specials.Special.Discount.Description getDescription() {
                return description;
            }

            /**
             * 设置description属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Specials.Special.Discount.Description }
             *     
             */
            public void setDescription(Specials.Special.Discount.Description value) {
                this.description = value;
            }

            /**
             * 获取contractMinStay属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getContractMinStay() {
                return contractMinStay;
            }

            /**
             * 设置contractMinStay属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setContractMinStay(Integer value) {
                this.contractMinStay = value;
            }

            /**
             * 获取contractMaxStay属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getContractMaxStay() {
                return contractMaxStay;
            }

            /**
             * 设置contractMaxStay属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setContractMaxStay(Integer value) {
                this.contractMaxStay = value;
            }

            /**
             * 获取code属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * 设置code属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * 获取amount属性的值。
             * 
             */
            public float getAmount() {
                return amount;
            }

            /**
             * 设置amount属性的值。
             * 
             */
            public void setAmount(float value) {
                this.amount = value;
            }

            /**
             * 获取applyType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplyType() {
                return applyType;
            }

            /**
             * 设置applyType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplyType(String value) {
                this.applyType = value;
            }

            /**
             * 获取nights属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNights() {
                return nights;
            }

            /**
             * 设置nights属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNights(String value) {
                this.nights = value;
            }

            /**
             * 获取minNumOfRooms属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMinNumOfRooms() {
                return minNumOfRooms;
            }

            /**
             * 设置minNumOfRooms属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMinNumOfRooms(Integer value) {
                this.minNumOfRooms = value;
            }

            /**
             * 获取maxNumOfRooms属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxNumOfRooms() {
                return maxNumOfRooms;
            }

            /**
             * 设置maxNumOfRooms属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxNumOfRooms(Integer value) {
                this.maxNumOfRooms = value;
            }

            /**
             * 获取minNumOfGuests属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMinNumOfGuests() {
                return minNumOfGuests;
            }

            /**
             * 设置minNumOfGuests属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMinNumOfGuests(Integer value) {
                this.minNumOfGuests = value;
            }

            /**
             * 获取maxNumOfGuests属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxNumOfGuests() {
                return maxNumOfGuests;
            }

            /**
             * 设置maxNumOfGuests属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxNumOfGuests(Integer value) {
                this.maxNumOfGuests = value;
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
             *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
             *         &lt;element name="Text" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="Language" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "text"
            })
            public static class Description {

                @XmlElement(name = "Text")
                protected List<Specials.Special.Discount.Description.Text> text;

                /**
                 * Gets the value of the text property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the text property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getText().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Specials.Special.Discount.Description.Text }
                 * 
                 * 
                 */
                public List<Specials.Special.Discount.Description.Text> getText() {
                    if (text == null) {
                        text = new ArrayList<Specials.Special.Discount.Description.Text>();
                    }
                    return this.text;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="Language" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Text {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Language", required = true)
                    @XmlSchemaType(name = "anySimpleType")
                    protected String language;

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

                    /**
                     * 获取language属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLanguage() {
                        return language;
                    }

                    /**
                     * 设置language属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLanguage(String value) {
                        this.language = value;
                    }

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
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;element name="RoomType">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "roomType"
        })
        public static class RoomTypes {

            @XmlElement(name = "RoomType", required = true)
            protected List<Specials.Special.RoomTypes.RoomType> roomType;

            /**
             * Gets the value of the roomType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the roomType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoomType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Specials.Special.RoomTypes.RoomType }
             * 
             * 
             */
            public List<Specials.Special.RoomTypes.RoomType> getRoomType() {
                if (roomType == null) {
                    roomType = new ArrayList<Specials.Special.RoomTypes.RoomType>();
                }
                return this.roomType;
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
             *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RoomType {

                @XmlAttribute(name = "Code", required = true)
                protected String code;

                /**
                 * 获取code属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * 设置code属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
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
         *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
         *         &lt;element name="StayDate" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BookingDates" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
         *                             &lt;element name="BookingDate" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="DOW">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                               &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                               &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                               &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                               &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                               &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                               &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="From" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                                     &lt;attribute name="To" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                                     &lt;attribute name="AdvancedBookingOffset">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                                           &lt;minInclusive value="1"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DOW">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ArrivalDaysOfWeek" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
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
            "stayDate"
        })
        public static class StayDates {

            @XmlElement(name = "StayDate")
            protected List<Specials.Special.StayDates.StayDate> stayDate;

            /**
             * Gets the value of the stayDate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stayDate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStayDate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Specials.Special.StayDates.StayDate }
             * 
             * 
             */
            public List<Specials.Special.StayDates.StayDate> getStayDate() {
                if (stayDate == null) {
                    stayDate = new ArrayList<Specials.Special.StayDates.StayDate>();
                }
                return this.stayDate;
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
             *         &lt;element name="BookingDates" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
             *                   &lt;element name="BookingDate" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="DOW">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                     &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                     &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                     &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                     &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                     &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                     &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="From" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                           &lt;attribute name="To" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                           &lt;attribute name="AdvancedBookingOffset">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *                                 &lt;minInclusive value="1"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DOW">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ArrivalDaysOfWeek" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *       &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "bookingDates",
                "dow",
                "arrivalDaysOfWeek"
            })
            public static class StayDate {

                @XmlElement(name = "BookingDates")
                protected Specials.Special.StayDates.StayDate.BookingDates bookingDates;
                @XmlElement(name = "DOW", required = true)
                protected Specials.Special.StayDates.StayDate.DOW dow;
                @XmlElement(name = "ArrivalDaysOfWeek")
                protected Specials.Special.StayDates.StayDate.ArrivalDaysOfWeek arrivalDaysOfWeek;
                @XmlAttribute(name = "From", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar from;
                @XmlAttribute(name = "To", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar to;

                /**
                 * 获取bookingDates属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Specials.Special.StayDates.StayDate.BookingDates }
                 *     
                 */
                public Specials.Special.StayDates.StayDate.BookingDates getBookingDates() {
                    return bookingDates;
                }

                /**
                 * 设置bookingDates属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Specials.Special.StayDates.StayDate.BookingDates }
                 *     
                 */
                public void setBookingDates(Specials.Special.StayDates.StayDate.BookingDates value) {
                    this.bookingDates = value;
                }

                /**
                 * 获取dow属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Specials.Special.StayDates.StayDate.DOW }
                 *     
                 */
                public Specials.Special.StayDates.StayDate.DOW getDOW() {
                    return dow;
                }

                /**
                 * 设置dow属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Specials.Special.StayDates.StayDate.DOW }
                 *     
                 */
                public void setDOW(Specials.Special.StayDates.StayDate.DOW value) {
                    this.dow = value;
                }

                /**
                 * 获取arrivalDaysOfWeek属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Specials.Special.StayDates.StayDate.ArrivalDaysOfWeek }
                 *     
                 */
                public Specials.Special.StayDates.StayDate.ArrivalDaysOfWeek getArrivalDaysOfWeek() {
                    return arrivalDaysOfWeek;
                }

                /**
                 * 设置arrivalDaysOfWeek属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Specials.Special.StayDates.StayDate.ArrivalDaysOfWeek }
                 *     
                 */
                public void setArrivalDaysOfWeek(Specials.Special.StayDates.StayDate.ArrivalDaysOfWeek value) {
                    this.arrivalDaysOfWeek = value;
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


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ArrivalDaysOfWeek {

                    @XmlAttribute(name = "Mon", required = true)
                    protected boolean mon;
                    @XmlAttribute(name = "Tue", required = true)
                    protected boolean tue;
                    @XmlAttribute(name = "Weds", required = true)
                    protected boolean weds;
                    @XmlAttribute(name = "Thur", required = true)
                    protected boolean thur;
                    @XmlAttribute(name = "Fri", required = true)
                    protected boolean fri;
                    @XmlAttribute(name = "Sat", required = true)
                    protected boolean sat;
                    @XmlAttribute(name = "Sun", required = true)
                    protected boolean sun;

                    /**
                     * 获取mon属性的值。
                     * 
                     */
                    public boolean isMon() {
                        return mon;
                    }

                    /**
                     * 设置mon属性的值。
                     * 
                     */
                    public void setMon(boolean value) {
                        this.mon = value;
                    }

                    /**
                     * 获取tue属性的值。
                     * 
                     */
                    public boolean isTue() {
                        return tue;
                    }

                    /**
                     * 设置tue属性的值。
                     * 
                     */
                    public void setTue(boolean value) {
                        this.tue = value;
                    }

                    /**
                     * 获取weds属性的值。
                     * 
                     */
                    public boolean isWeds() {
                        return weds;
                    }

                    /**
                     * 设置weds属性的值。
                     * 
                     */
                    public void setWeds(boolean value) {
                        this.weds = value;
                    }

                    /**
                     * 获取thur属性的值。
                     * 
                     */
                    public boolean isThur() {
                        return thur;
                    }

                    /**
                     * 设置thur属性的值。
                     * 
                     */
                    public void setThur(boolean value) {
                        this.thur = value;
                    }

                    /**
                     * 获取fri属性的值。
                     * 
                     */
                    public boolean isFri() {
                        return fri;
                    }

                    /**
                     * 设置fri属性的值。
                     * 
                     */
                    public void setFri(boolean value) {
                        this.fri = value;
                    }

                    /**
                     * 获取sat属性的值。
                     * 
                     */
                    public boolean isSat() {
                        return sat;
                    }

                    /**
                     * 设置sat属性的值。
                     * 
                     */
                    public void setSat(boolean value) {
                        this.sat = value;
                    }

                    /**
                     * 获取sun属性的值。
                     * 
                     */
                    public boolean isSun() {
                        return sun;
                    }

                    /**
                     * 设置sun属性的值。
                     * 
                     */
                    public void setSun(boolean value) {
                        this.sun = value;
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
                 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
                 *         &lt;element name="BookingDate" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="DOW">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                           &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                           &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                           &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                           &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                           &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                           &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="From" type="{http://www.w3.org/2001/XMLSchema}date" />
                 *                 &lt;attribute name="To" type="{http://www.w3.org/2001/XMLSchema}date" />
                 *                 &lt;attribute name="AdvancedBookingOffset">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
                 *                       &lt;minInclusive value="1"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
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
                    "bookingDate"
                })
                public static class BookingDates {

                    @XmlElement(name = "BookingDate")
                    protected List<Specials.Special.StayDates.StayDate.BookingDates.BookingDate> bookingDate;

                    /**
                     * Gets the value of the bookingDate property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bookingDate property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBookingDate().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Specials.Special.StayDates.StayDate.BookingDates.BookingDate }
                     * 
                     * 
                     */
                    public List<Specials.Special.StayDates.StayDate.BookingDates.BookingDate> getBookingDate() {
                        if (bookingDate == null) {
                            bookingDate = new ArrayList<Specials.Special.StayDates.StayDate.BookingDates.BookingDate>();
                        }
                        return this.bookingDate;
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
                     *         &lt;element name="DOW">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                 &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                 &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                 &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                 &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                 &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                 &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="From" type="{http://www.w3.org/2001/XMLSchema}date" />
                     *       &lt;attribute name="To" type="{http://www.w3.org/2001/XMLSchema}date" />
                     *       &lt;attribute name="AdvancedBookingOffset">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
                     *             &lt;minInclusive value="1"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "dow"
                    })
                    public static class BookingDate {

                        @XmlElement(name = "DOW", required = true)
                        protected Specials.Special.StayDates.StayDate.BookingDates.BookingDate.DOW dow;
                        @XmlAttribute(name = "From")
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar from;
                        @XmlAttribute(name = "To")
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar to;
                        @XmlAttribute(name = "AdvancedBookingOffset")
                        protected Integer advancedBookingOffset;

                        /**
                         * 获取dow属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Specials.Special.StayDates.StayDate.BookingDates.BookingDate.DOW }
                         *     
                         */
                        public Specials.Special.StayDates.StayDate.BookingDates.BookingDate.DOW getDOW() {
                            return dow;
                        }

                        /**
                         * 设置dow属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Specials.Special.StayDates.StayDate.BookingDates.BookingDate.DOW }
                         *     
                         */
                        public void setDOW(Specials.Special.StayDates.StayDate.BookingDates.BookingDate.DOW value) {
                            this.dow = value;
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

                        /**
                         * 获取advancedBookingOffset属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getAdvancedBookingOffset() {
                            return advancedBookingOffset;
                        }

                        /**
                         * 设置advancedBookingOffset属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setAdvancedBookingOffset(Integer value) {
                            this.advancedBookingOffset = value;
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
                         *       &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *       &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *       &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *       &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *       &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *       &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *       &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class DOW {

                            @XmlAttribute(name = "Mon", required = true)
                            protected boolean mon;
                            @XmlAttribute(name = "Tue", required = true)
                            protected boolean tue;
                            @XmlAttribute(name = "Weds", required = true)
                            protected boolean weds;
                            @XmlAttribute(name = "Thur", required = true)
                            protected boolean thur;
                            @XmlAttribute(name = "Fri", required = true)
                            protected boolean fri;
                            @XmlAttribute(name = "Sat", required = true)
                            protected boolean sat;
                            @XmlAttribute(name = "Sun", required = true)
                            protected boolean sun;

                            /**
                             * 获取mon属性的值。
                             * 
                             */
                            public boolean isMon() {
                                return mon;
                            }

                            /**
                             * 设置mon属性的值。
                             * 
                             */
                            public void setMon(boolean value) {
                                this.mon = value;
                            }

                            /**
                             * 获取tue属性的值。
                             * 
                             */
                            public boolean isTue() {
                                return tue;
                            }

                            /**
                             * 设置tue属性的值。
                             * 
                             */
                            public void setTue(boolean value) {
                                this.tue = value;
                            }

                            /**
                             * 获取weds属性的值。
                             * 
                             */
                            public boolean isWeds() {
                                return weds;
                            }

                            /**
                             * 设置weds属性的值。
                             * 
                             */
                            public void setWeds(boolean value) {
                                this.weds = value;
                            }

                            /**
                             * 获取thur属性的值。
                             * 
                             */
                            public boolean isThur() {
                                return thur;
                            }

                            /**
                             * 设置thur属性的值。
                             * 
                             */
                            public void setThur(boolean value) {
                                this.thur = value;
                            }

                            /**
                             * 获取fri属性的值。
                             * 
                             */
                            public boolean isFri() {
                                return fri;
                            }

                            /**
                             * 设置fri属性的值。
                             * 
                             */
                            public void setFri(boolean value) {
                                this.fri = value;
                            }

                            /**
                             * 获取sat属性的值。
                             * 
                             */
                            public boolean isSat() {
                                return sat;
                            }

                            /**
                             * 设置sat属性的值。
                             * 
                             */
                            public void setSat(boolean value) {
                                this.sat = value;
                            }

                            /**
                             * 获取sun属性的值。
                             * 
                             */
                            public boolean isSun() {
                                return sun;
                            }

                            /**
                             * 设置sun属性的值。
                             * 
                             */
                            public void setSun(boolean value) {
                                this.sun = value;
                            }

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
                 *       &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DOW {

                    @XmlAttribute(name = "Mon", required = true)
                    protected boolean mon;
                    @XmlAttribute(name = "Tue", required = true)
                    protected boolean tue;
                    @XmlAttribute(name = "Weds", required = true)
                    protected boolean weds;
                    @XmlAttribute(name = "Thur", required = true)
                    protected boolean thur;
                    @XmlAttribute(name = "Fri", required = true)
                    protected boolean fri;
                    @XmlAttribute(name = "Sat", required = true)
                    protected boolean sat;
                    @XmlAttribute(name = "Sun", required = true)
                    protected boolean sun;

                    /**
                     * 获取mon属性的值。
                     * 
                     */
                    public boolean isMon() {
                        return mon;
                    }

                    /**
                     * 设置mon属性的值。
                     * 
                     */
                    public void setMon(boolean value) {
                        this.mon = value;
                    }

                    /**
                     * 获取tue属性的值。
                     * 
                     */
                    public boolean isTue() {
                        return tue;
                    }

                    /**
                     * 设置tue属性的值。
                     * 
                     */
                    public void setTue(boolean value) {
                        this.tue = value;
                    }

                    /**
                     * 获取weds属性的值。
                     * 
                     */
                    public boolean isWeds() {
                        return weds;
                    }

                    /**
                     * 设置weds属性的值。
                     * 
                     */
                    public void setWeds(boolean value) {
                        this.weds = value;
                    }

                    /**
                     * 获取thur属性的值。
                     * 
                     */
                    public boolean isThur() {
                        return thur;
                    }

                    /**
                     * 设置thur属性的值。
                     * 
                     */
                    public void setThur(boolean value) {
                        this.thur = value;
                    }

                    /**
                     * 获取fri属性的值。
                     * 
                     */
                    public boolean isFri() {
                        return fri;
                    }

                    /**
                     * 设置fri属性的值。
                     * 
                     */
                    public void setFri(boolean value) {
                        this.fri = value;
                    }

                    /**
                     * 获取sat属性的值。
                     * 
                     */
                    public boolean isSat() {
                        return sat;
                    }

                    /**
                     * 设置sat属性的值。
                     * 
                     */
                    public void setSat(boolean value) {
                        this.sat = value;
                    }

                    /**
                     * 获取sun属性的值。
                     * 
                     */
                    public boolean isSun() {
                        return sun;
                    }

                    /**
                     * 设置sun属性的值。
                     * 
                     */
                    public void setSun(boolean value) {
                        this.sun = value;
                    }

                }

            }

        }

    }

}
