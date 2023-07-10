//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines criteria for a rail availability query.
 * 
 * <p>RailAvailQueryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RailAvailQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailBaseQueryCriteria" type="{http://www.opentravel.org/OTA/2003/05}RailAvailScheduleQueryType" maxOccurs="99"/>
 *         &lt;element name="PassengerType" type="{http://www.opentravel.org/OTA/2003/05}RailPassengerCategoryType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ReturnInfo" type="{http://www.opentravel.org/OTA/2003/05}TravelDateTimeType" minOccurs="0"/>
 *         &lt;element name="RailPrefs" type="{http://www.opentravel.org/OTA/2003/05}RailAvailPrefsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailAvailQueryType", propOrder = {
    "availBaseQueryCriteria",
    "passengerType",
    "returnInfo",
    "railPrefs"
})
public class RailAvailQueryType {

    @XmlElement(name = "AvailBaseQueryCriteria", required = true)
    protected List<RailAvailScheduleQueryType> availBaseQueryCriteria;
    @XmlElement(name = "PassengerType")
    protected List<RailPassengerCategoryType> passengerType;
    @XmlElement(name = "ReturnInfo")
    protected TravelDateTimeType returnInfo;
    @XmlElement(name = "RailPrefs")
    protected RailAvailPrefsType railPrefs;

    /**
     * Gets the value of the availBaseQueryCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availBaseQueryCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailBaseQueryCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailAvailScheduleQueryType }
     * 
     * 
     */
    public List<RailAvailScheduleQueryType> getAvailBaseQueryCriteria() {
        if (availBaseQueryCriteria == null) {
            availBaseQueryCriteria = new ArrayList<RailAvailScheduleQueryType>();
        }
        return this.availBaseQueryCriteria;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPassengerCategoryType }
     * 
     * 
     */
    public List<RailPassengerCategoryType> getPassengerType() {
        if (passengerType == null) {
            passengerType = new ArrayList<RailPassengerCategoryType>();
        }
        return this.passengerType;
    }

    /**
     * 获取returnInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelDateTimeType }
     *     
     */
    public TravelDateTimeType getReturnInfo() {
        return returnInfo;
    }

    /**
     * 设置returnInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDateTimeType }
     *     
     */
    public void setReturnInfo(TravelDateTimeType value) {
        this.returnInfo = value;
    }

    /**
     * 获取railPrefs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailAvailPrefsType }
     *     
     */
    public RailAvailPrefsType getRailPrefs() {
        return railPrefs;
    }

    /**
     * 设置railPrefs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailAvailPrefsType }
     *     
     */
    public void setRailPrefs(RailAvailPrefsType value) {
        this.railPrefs = value;
    }

}
