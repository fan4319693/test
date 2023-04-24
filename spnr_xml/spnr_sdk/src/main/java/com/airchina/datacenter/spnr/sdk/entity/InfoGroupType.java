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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Message processing errors and/ or information.
 * 
 * <p>InfoGroupType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InfoGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForInfo" type="{http://www.opentravel.org/OTA/2003/05}ForInfoType" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://www.opentravel.org/OTA/2003/05}ErrorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarketingData" type="{http://www.opentravel.org/OTA/2003/05}MarketingDataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoGroupType", propOrder = {
    "forInfo",
    "error",
    "marketingData"
})
public class InfoGroupType {

    @XmlElement(name = "ForInfo")
    protected ForInfoType forInfo;
    @XmlElement(name = "Error")
    protected List<ErrorType> error;
    @XmlElement(name = "MarketingData")
    protected List<MarketingDataType> marketingData;

    /**
     * 获取forInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ForInfoType }
     *     
     */
    public ForInfoType getForInfo() {
        return forInfo;
    }

    /**
     * 设置forInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ForInfoType }
     *     
     */
    public void setForInfo(ForInfoType value) {
        this.forInfo = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     * 
     * 
     */
    public List<ErrorType> getError() {
        if (error == null) {
            error = new ArrayList<ErrorType>();
        }
        return this.error;
    }

    /**
     * Gets the value of the marketingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingDataType }
     * 
     * 
     */
    public List<MarketingDataType> getMarketingData() {
        if (marketingData == null) {
            marketingData = new ArrayList<MarketingDataType>();
        }
        return this.marketingData;
    }

}
