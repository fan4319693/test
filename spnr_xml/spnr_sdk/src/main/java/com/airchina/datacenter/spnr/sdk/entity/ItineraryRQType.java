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
import javax.xml.bind.annotation.XmlType;


/**
 * Itinerary information provided in a booking or amendment request
 * 
 * <p>ItineraryRQ_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItineraryRQ_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Depart" type="{http://www.opentravel.org/OTA/2003/05}LocationTimeType"/>
 *         &lt;element name="Arrive" type="{http://www.opentravel.org/OTA/2003/05}PortLocationType"/>
 *         &lt;element name="Accommodation" type="{http://www.opentravel.org/OTA/2003/05}AccomType" maxOccurs="25" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryRQ_Type", propOrder = {
    "depart",
    "arrive",
    "accommodation"
})
public class ItineraryRQType {

    @XmlElement(name = "Depart", required = true)
    protected LocationTimeType depart;
    @XmlElement(name = "Arrive", required = true)
    protected PortLocationType arrive;
    @XmlElement(name = "Accommodation")
    protected List<AccomType> accommodation;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * 获取depart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationTimeType }
     *     
     */
    public LocationTimeType getDepart() {
        return depart;
    }

    /**
     * 设置depart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTimeType }
     *     
     */
    public void setDepart(LocationTimeType value) {
        this.depart = value;
    }

    /**
     * 获取arrive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PortLocationType }
     *     
     */
    public PortLocationType getArrive() {
        return arrive;
    }

    /**
     * 设置arrive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PortLocationType }
     *     
     */
    public void setArrive(PortLocationType value) {
        this.arrive = value;
    }

    /**
     * Gets the value of the accommodation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccomType }
     * 
     * 
     */
    public List<AccomType> getAccommodation() {
        if (accommodation == null) {
            accommodation = new ArrayList<AccomType>();
        }
        return this.accommodation;
    }

    /**
     * 获取rph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * 设置rph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

}
