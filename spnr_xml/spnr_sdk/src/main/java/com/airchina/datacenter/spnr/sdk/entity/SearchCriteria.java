//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Restrictions"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}PointsOfSale"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Dates"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformation"/>
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
    "restrictions",
    "pointsOfSale",
    "dates",
    "originDestinationInformation"
})
@XmlRootElement(name = "SearchCriteria")
public class SearchCriteria {

    @XmlElement(name = "Restrictions", required = true)
    protected Restrictions restrictions;
    @XmlElement(name = "PointsOfSale", required = true)
    protected PointsOfSale pointsOfSale;
    @XmlElement(name = "Dates", required = true)
    protected Dates dates;
    @XmlElement(name = "OriginDestinationInformation", required = true)
    protected OriginDestinationInformation originDestinationInformation;

    /**
     * Search Restriction.
     * 
     * @return
     *     possible object is
     *     {@link Restrictions }
     *     
     */
    public Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * 设置restrictions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Restrictions }
     *     
     */
    public void setRestrictions(Restrictions value) {
        this.restrictions = value;
    }

    /**
     * The points of sale associated with this Landing page.
     * 
     * @return
     *     possible object is
     *     {@link PointsOfSale }
     *     
     */
    public PointsOfSale getPointsOfSale() {
        return pointsOfSale;
    }

    /**
     * 设置pointsOfSale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PointsOfSale }
     *     
     */
    public void setPointsOfSale(PointsOfSale value) {
        this.pointsOfSale = value;
    }

    /**
     * Date
     * 
     * @return
     *     possible object is
     *     {@link Dates }
     *     
     */
    public Dates getDates() {
        return dates;
    }

    /**
     * 设置dates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Dates }
     *     
     */
    public void setDates(Dates value) {
        this.dates = value;
    }

    /**
     * Container for all of the search criteria related to location.  Used for all product types except vehicle only.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationInformation }
     *     
     */
    public OriginDestinationInformation getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    /**
     * 设置originDestinationInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationInformation }
     *     
     */
    public void setOriginDestinationInformation(OriginDestinationInformation value) {
        this.originDestinationInformation = value;
    }

}
