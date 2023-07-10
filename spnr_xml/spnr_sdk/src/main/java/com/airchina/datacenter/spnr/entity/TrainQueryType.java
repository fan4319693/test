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
 * Defines information to do a query by train operator or specific train information.
 * 
 * <p>TrainQueryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrainQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Train" type="{http://www.opentravel.org/OTA/2003/05}TrainIdentificationType" minOccurs="0"/>
 *         &lt;element name="NetworkCode" type="{http://www.opentravel.org/OTA/2003/05}NetworkCodeType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainQueryType", propOrder = {
    "train",
    "networkCode"
})
public class TrainQueryType {

    @XmlElement(name = "Train")
    protected TrainIdentificationType train;
    @XmlElement(name = "NetworkCode")
    protected NetworkCodeType networkCode;

    /**
     * 获取train属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrainIdentificationType }
     *     
     */
    public TrainIdentificationType getTrain() {
        return train;
    }

    /**
     * 设置train属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrainIdentificationType }
     *     
     */
    public void setTrain(TrainIdentificationType value) {
        this.train = value;
    }

    /**
     * 获取networkCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetworkCodeType }
     *     
     */
    public NetworkCodeType getNetworkCode() {
        return networkCode;
    }

    /**
     * 设置networkCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCodeType }
     *     
     */
    public void setNetworkCode(NetworkCodeType value) {
        this.networkCode = value;
    }

}
