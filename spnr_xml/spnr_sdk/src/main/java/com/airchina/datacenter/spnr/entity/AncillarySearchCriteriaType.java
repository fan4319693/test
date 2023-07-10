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
 * Identifies a collection of criteria for ancillary search.
 * 
 * <p>AncillarySearchCriteriaType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AncillarySearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroundTransportServiceCriteria" type="{http://www.opentravel.org/OTA/2003/05}GroundTransportServiceCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirCriteria" type="{http://www.opentravel.org/OTA/2003/05}AirSearchCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PriceCriteria" type="{http://www.opentravel.org/OTA/2003/05}PriceCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoungeCriteria" type="{http://www.opentravel.org/OTA/2003/05}LoungeCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillarySearchCriteriaType", propOrder = {
    "groundTransportServiceCriteria",
    "airCriteria",
    "priceCriteria",
    "loungeCriteria"
})
public class AncillarySearchCriteriaType {

    @XmlElement(name = "GroundTransportServiceCriteria")
    protected List<GroundTransportServiceCriteriaType> groundTransportServiceCriteria;
    @XmlElement(name = "AirCriteria")
    protected List<AirSearchCriteriaType> airCriteria;
    @XmlElement(name = "PriceCriteria")
    protected List<PriceCriteriaType> priceCriteria;
    @XmlElement(name = "LoungeCriteria")
    protected List<LoungeCriteriaType> loungeCriteria;

    /**
     * Gets the value of the groundTransportServiceCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groundTransportServiceCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroundTransportServiceCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroundTransportServiceCriteriaType }
     * 
     * 
     */
    public List<GroundTransportServiceCriteriaType> getGroundTransportServiceCriteria() {
        if (groundTransportServiceCriteria == null) {
            groundTransportServiceCriteria = new ArrayList<GroundTransportServiceCriteriaType>();
        }
        return this.groundTransportServiceCriteria;
    }

    /**
     * Gets the value of the airCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSearchCriteriaType }
     * 
     * 
     */
    public List<AirSearchCriteriaType> getAirCriteria() {
        if (airCriteria == null) {
            airCriteria = new ArrayList<AirSearchCriteriaType>();
        }
        return this.airCriteria;
    }

    /**
     * Gets the value of the priceCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceCriteriaType }
     * 
     * 
     */
    public List<PriceCriteriaType> getPriceCriteria() {
        if (priceCriteria == null) {
            priceCriteria = new ArrayList<PriceCriteriaType>();
        }
        return this.priceCriteria;
    }

    /**
     * Gets the value of the loungeCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loungeCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoungeCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoungeCriteriaType }
     * 
     * 
     */
    public List<LoungeCriteriaType> getLoungeCriteria() {
        if (loungeCriteria == null) {
            loungeCriteria = new ArrayList<LoungeCriteriaType>();
        }
        return this.loungeCriteria;
    }

}
