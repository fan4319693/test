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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}carType"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}driverAge"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}carCompany"/>
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
    "carType",
    "driverAge",
    "carCompany"
})
@XmlRootElement(name = "VehicleInformation")
public class VehicleInformation {

    @XmlElement(required = true)
    protected CarType carType;
    @XmlElement(required = true)
    protected DriverAge driverAge;
    @XmlElement(required = true)
    protected CarCompany carCompany;

    /**
     * 获取carType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarType }
     *     
     */
    public CarType getCarType() {
        return carType;
    }

    /**
     * 设置carType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarType }
     *     
     */
    public void setCarType(CarType value) {
        this.carType = value;
    }

    /**
     * 获取driverAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DriverAge }
     *     
     */
    public DriverAge getDriverAge() {
        return driverAge;
    }

    /**
     * 设置driverAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DriverAge }
     *     
     */
    public void setDriverAge(DriverAge value) {
        this.driverAge = value;
    }

    /**
     * 获取carCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarCompany }
     *     
     */
    public CarCompany getCarCompany() {
        return carCompany;
    }

    /**
     * 设置carCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarCompany }
     *     
     */
    public void setCarCompany(CarCompany value) {
        this.carCompany = value;
    }

}
