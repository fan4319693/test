//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides the number of travelers of a specific type (e.g.  Adult, Child).
 * 
 * <p>FerryTravellerCountType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FerryTravellerCountType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FerryTravellerCountBaseType">
 *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="ItineraryRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="TravelStatus" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Berthed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FerryTravellerCountType")
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.FerryReservationRequest.PassengerCount.class
})
public class FerryTravellerCountType
    extends FerryTravellerCountBaseType
{

    @XmlAttribute(name = "RPH", required = true)
    protected String rph;
    @XmlAttribute(name = "ItineraryRPH")
    protected String itineraryRPH;
    @XmlAttribute(name = "TravelStatus")
    @XmlSchemaType(name = "anySimpleType")
    protected String travelStatus;
    @XmlAttribute(name = "Berthed")
    protected Boolean berthed;

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

    /**
     * 获取itineraryRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItineraryRPH() {
        return itineraryRPH;
    }

    /**
     * 设置itineraryRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItineraryRPH(String value) {
        this.itineraryRPH = value;
    }

    /**
     * 获取travelStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelStatus() {
        return travelStatus;
    }

    /**
     * 设置travelStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelStatus(String value) {
        this.travelStatus = value;
    }

    /**
     * 获取berthed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBerthed() {
        return berthed;
    }

    /**
     * 设置berthed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBerthed(Boolean value) {
        this.berthed = value;
    }

}
