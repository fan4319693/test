//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds references for ModularProduct/PackageProduct, Flight Segment RPH, and Traveller OJ_SuperPNR_RPH for action
 * 
 * <p>OJ_ActionItemType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OJ_ActionItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Replace" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FlightSegmentRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *       &lt;attribute name="OJ_SuperPNR_RPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJ_ActionItemType")
public class OJActionItemType {

    @XmlAttribute(name = "MasterProductNumber")
    protected BigInteger masterProductNumber;
    @XmlAttribute(name = "ProductNumber")
    protected BigInteger productNumber;
    @XmlAttribute(name = "Replace")
    protected Boolean replace;
    @XmlAttribute(name = "FlightSegmentRPHList")
    protected List<String> flightSegmentRPHList;
    @XmlAttribute(name = "OJ_SuperPNR_RPHList")
    protected List<String> ojSuperPNRRPHList;

    /**
     * 获取masterProductNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMasterProductNumber() {
        return masterProductNumber;
    }

    /**
     * 设置masterProductNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMasterProductNumber(BigInteger value) {
        this.masterProductNumber = value;
    }

    /**
     * 获取productNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductNumber() {
        return productNumber;
    }

    /**
     * 设置productNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductNumber(BigInteger value) {
        this.productNumber = value;
    }

    /**
     * 获取replace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplace() {
        return replace;
    }

    /**
     * 设置replace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplace(Boolean value) {
        this.replace = value;
    }

    /**
     * Gets the value of the flightSegmentRPHList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentRPHList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentRPHList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlightSegmentRPHList() {
        if (flightSegmentRPHList == null) {
            flightSegmentRPHList = new ArrayList<String>();
        }
        return this.flightSegmentRPHList;
    }

    /**
     * Gets the value of the ojSuperPNRRPHList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ojSuperPNRRPHList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOJSuperPNRRPHList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOJSuperPNRRPHList() {
        if (ojSuperPNRRPHList == null) {
            ojSuperPNRRPHList = new ArrayList<String>();
        }
        return this.ojSuperPNRRPHList;
    }

}
