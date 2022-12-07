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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies passenger(s) who will travel on the reservation.
 * 
 * <p>TravelerInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TravelerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirTraveler" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirTravelerType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ActionAttributes"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialReqDetails" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType">
 *                 &lt;attribute name="numProcessedPassengers" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerInfoType", propOrder = {
    "airTraveler",
    "specialReqDetails",
    "contact"
})
@XmlSeeAlso({
    AirReservationTravelerInfo.class,
    com.airchina.datacenter.spnr.sdk.entity.CouponRequestCommonType.TravelerInfo.class
})
public class TravelerInfoType {

    @XmlElement(name = "AirTraveler")
    protected List<TravelerInfoType.AirTraveler> airTraveler;
    @XmlElement(name = "SpecialReqDetails")
    protected List<TravelerInfoType.SpecialReqDetails> specialReqDetails;
    @XmlElement(name = "Contact")
    protected List<ContactPersonType> contact;

    /**
     * Gets the value of the airTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInfoType.AirTraveler }
     * 
     * 
     */
    public List<TravelerInfoType.AirTraveler> getAirTraveler() {
        if (airTraveler == null) {
            airTraveler = new ArrayList<TravelerInfoType.AirTraveler>();
        }
        return this.airTraveler;
    }

    /**
     * Gets the value of the specialReqDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialReqDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialReqDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInfoType.SpecialReqDetails }
     * 
     * 
     */
    public List<TravelerInfoType.SpecialReqDetails> getSpecialReqDetails() {
        if (specialReqDetails == null) {
            specialReqDetails = new ArrayList<TravelerInfoType.SpecialReqDetails>();
        }
        return this.specialReqDetails;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonType }
     * 
     * 
     */
    public List<ContactPersonType> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactPersonType>();
        }
        return this.contact;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirTravelerType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ActionAttributes"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirTraveler
        extends AirTravelerType
    {

        @XmlAttribute(name = "Action")
        protected ActionCodeType action;

        /**
         * 获取action属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ActionCodeType }
         *     
         */
        public ActionCodeType getAction() {
            return action;
        }

        /**
         * 设置action属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ActionCodeType }
         *     
         */
        public void setAction(ActionCodeType value) {
            this.action = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType">
     *       &lt;attribute name="numProcessedPassengers" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpecialReqDetails
        extends SpecialReqDetailsType
    {

        @XmlAttribute(name = "numProcessedPassengers")
        @XmlSchemaType(name = "anySimpleType")
        protected String numProcessedPassengers;

        /**
         * 获取numProcessedPassengers属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumProcessedPassengers() {
            return numProcessedPassengers;
        }

        /**
         * 设置numProcessedPassengers属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumProcessedPassengers(String value) {
            this.numProcessedPassengers = value;
        }

    }

}
