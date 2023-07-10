//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Itinerary information provided in a response
 * 
 * <p>BaseItineraryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BaseItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Depart" type="{http://www.opentravel.org/OTA/2003/05}DepartType"/>
 *         &lt;element name="Arrive" type="{http://www.opentravel.org/OTA/2003/05}ArriveType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="ShipName" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="PaxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="StandardUnitsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HighUnitsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CabinsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SeatsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AccomMandatoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="StandbyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="StandbyRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseItineraryType", propOrder = {
    "depart",
    "arrive"
})
@XmlSeeAlso({
    ItineraryType.class,
    com.airchina.datacenter.spnr.entity.FerryProductType.ItineraryLeg.class
})
public class BaseItineraryType {

    @XmlElement(name = "Depart", required = true)
    protected DepartType depart;
    @XmlElement(name = "Arrive", required = true)
    protected ArriveType arrive;
    @XmlAttribute(name = "RPH", required = true)
    protected String rph;
    @XmlAttribute(name = "ShipName", required = true)
    protected String shipName;
    @XmlAttribute(name = "PaxInd")
    protected Boolean paxInd;
    @XmlAttribute(name = "StandardUnitsInd")
    protected Boolean standardUnitsInd;
    @XmlAttribute(name = "HighUnitsInd")
    protected Boolean highUnitsInd;
    @XmlAttribute(name = "CabinsInd")
    protected Boolean cabinsInd;
    @XmlAttribute(name = "SeatsInd")
    protected Boolean seatsInd;
    @XmlAttribute(name = "AccomMandatoryInd")
    protected Boolean accomMandatoryInd;
    @XmlAttribute(name = "StandbyInd")
    protected Boolean standbyInd;
    @XmlAttribute(name = "StandbyRPH")
    protected String standbyRPH;

    /**
     * 获取depart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DepartType }
     *     
     */
    public DepartType getDepart() {
        return depart;
    }

    /**
     * 设置depart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DepartType }
     *     
     */
    public void setDepart(DepartType value) {
        this.depart = value;
    }

    /**
     * 获取arrive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArriveType }
     *     
     */
    public ArriveType getArrive() {
        return arrive;
    }

    /**
     * 设置arrive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArriveType }
     *     
     */
    public void setArrive(ArriveType value) {
        this.arrive = value;
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

    /**
     * 获取shipName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipName() {
        return shipName;
    }

    /**
     * 设置shipName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipName(String value) {
        this.shipName = value;
    }

    /**
     * 获取paxInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaxInd() {
        return paxInd;
    }

    /**
     * 设置paxInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaxInd(Boolean value) {
        this.paxInd = value;
    }

    /**
     * 获取standardUnitsInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandardUnitsInd() {
        return standardUnitsInd;
    }

    /**
     * 设置standardUnitsInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandardUnitsInd(Boolean value) {
        this.standardUnitsInd = value;
    }

    /**
     * 获取highUnitsInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighUnitsInd() {
        return highUnitsInd;
    }

    /**
     * 设置highUnitsInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighUnitsInd(Boolean value) {
        this.highUnitsInd = value;
    }

    /**
     * 获取cabinsInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCabinsInd() {
        return cabinsInd;
    }

    /**
     * 设置cabinsInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCabinsInd(Boolean value) {
        this.cabinsInd = value;
    }

    /**
     * 获取seatsInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeatsInd() {
        return seatsInd;
    }

    /**
     * 设置seatsInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeatsInd(Boolean value) {
        this.seatsInd = value;
    }

    /**
     * 获取accomMandatoryInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAccomMandatoryInd() {
        if (accomMandatoryInd == null) {
            return false;
        } else {
            return accomMandatoryInd;
        }
    }

    /**
     * 设置accomMandatoryInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccomMandatoryInd(Boolean value) {
        this.accomMandatoryInd = value;
    }

    /**
     * 获取standbyInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStandbyInd() {
        if (standbyInd == null) {
            return false;
        } else {
            return standbyInd;
        }
    }

    /**
     * 设置standbyInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandbyInd(Boolean value) {
        this.standbyInd = value;
    }

    /**
     * 获取standbyRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandbyRPH() {
        return standbyRPH;
    }

    /**
     * 设置standbyRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandbyRPH(String value) {
        this.standbyRPH = value;
    }

}
