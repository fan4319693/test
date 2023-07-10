//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines ground transport availability and schedule search criteria, including origin-destination information and train number and network code.
 * 
 * <p>GroundTransportRouteQueryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GroundTransportRouteQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="RailQuery">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GroundTransportQueryType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BusQuery">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GroundTransportQueryType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroundTransportRouteQueryType", propOrder = {
    "railQuery",
    "busQuery"
})
public class GroundTransportRouteQueryType {

    @XmlElement(name = "RailQuery")
    protected GroundTransportRouteQueryType.RailQuery railQuery;
    @XmlElement(name = "BusQuery")
    protected GroundTransportRouteQueryType.BusQuery busQuery;

    /**
     * 获取railQuery属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GroundTransportRouteQueryType.RailQuery }
     *     
     */
    public GroundTransportRouteQueryType.RailQuery getRailQuery() {
        return railQuery;
    }

    /**
     * 设置railQuery属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GroundTransportRouteQueryType.RailQuery }
     *     
     */
    public void setRailQuery(GroundTransportRouteQueryType.RailQuery value) {
        this.railQuery = value;
    }

    /**
     * 获取busQuery属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GroundTransportRouteQueryType.BusQuery }
     *     
     */
    public GroundTransportRouteQueryType.BusQuery getBusQuery() {
        return busQuery;
    }

    /**
     * 设置busQuery属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GroundTransportRouteQueryType.BusQuery }
     *     
     */
    public void setBusQuery(GroundTransportRouteQueryType.BusQuery value) {
        this.busQuery = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GroundTransportQueryType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BusQuery
        extends GroundTransportQueryType
    {


    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GroundTransportQueryType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RailQuery
        extends GroundTransportQueryType
    {


    }

}
