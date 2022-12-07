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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The item-level response to a reservation request.
 * 
 * <p>DestActivityResResponseItemType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DestActivityResResponseItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickupLocation" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element name="ReservationItemReferences">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReservationItemReference" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PickupTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestActivityResResponseItemType", propOrder = {
    "pickupLocation",
    "reservationItemReferences"
})
public class DestActivityResResponseItemType {

    @XmlElement(name = "PickupLocation")
    protected ParagraphType pickupLocation;
    @XmlElement(name = "ReservationItemReferences", required = true)
    protected DestActivityResResponseItemType.ReservationItemReferences reservationItemReferences;
    @XmlAttribute(name = "PickupTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar pickupTime;

    /**
     * 获取pickupLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getPickupLocation() {
        return pickupLocation;
    }

    /**
     * 设置pickupLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setPickupLocation(ParagraphType value) {
        this.pickupLocation = value;
    }

    /**
     * 获取reservationItemReferences属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestActivityResResponseItemType.ReservationItemReferences }
     *     
     */
    public DestActivityResResponseItemType.ReservationItemReferences getReservationItemReferences() {
        return reservationItemReferences;
    }

    /**
     * 设置reservationItemReferences属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestActivityResResponseItemType.ReservationItemReferences }
     *     
     */
    public void setReservationItemReferences(DestActivityResResponseItemType.ReservationItemReferences value) {
        this.reservationItemReferences = value;
    }

    /**
     * 获取pickupTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupTime() {
        return pickupTime;
    }

    /**
     * 设置pickupTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupTime(XMLGregorianCalendar value) {
        this.pickupTime = value;
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
     *         &lt;element name="ReservationItemReference" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded"/>
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
        "reservationItemReference"
    })
    public static class ReservationItemReferences {

        @XmlElement(name = "ReservationItemReference", required = true)
        protected List<UniqueIDType> reservationItemReference;

        /**
         * Gets the value of the reservationItemReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reservationItemReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReservationItemReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UniqueIDType }
         * 
         * 
         */
        public List<UniqueIDType> getReservationItemReference() {
            if (reservationItemReference == null) {
                reservationItemReference = new ArrayList<UniqueIDType>();
            }
            return this.reservationItemReference;
        }

    }

}
