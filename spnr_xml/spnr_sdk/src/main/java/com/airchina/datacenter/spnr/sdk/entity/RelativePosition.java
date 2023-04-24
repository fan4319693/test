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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RelativePosition complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RelativePosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Distance" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="DistanceUnitName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IndexPointCode" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativePosition")
public class RelativePosition {

    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "Distance", required = true)
    protected float distance;
    @XmlAttribute(name = "DistanceUnitName", required = true)
    protected String distanceUnitName;
    @XmlAttribute(name = "IndexPointCode", required = true)
    protected int indexPointCode;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

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
     * 获取distance属性的值。
     * 
     */
    public float getDistance() {
        return distance;
    }

    /**
     * 设置distance属性的值。
     * 
     */
    public void setDistance(float value) {
        this.distance = value;
    }

    /**
     * 获取distanceUnitName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnitName() {
        return distanceUnitName;
    }

    /**
     * 设置distanceUnitName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnitName(String value) {
        this.distanceUnitName = value;
    }

    /**
     * 获取indexPointCode属性的值。
     * 
     */
    public int getIndexPointCode() {
        return indexPointCode;
    }

    /**
     * 设置indexPointCode属性的值。
     * 
     */
    public void setIndexPointCode(int value) {
        this.indexPointCode = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
