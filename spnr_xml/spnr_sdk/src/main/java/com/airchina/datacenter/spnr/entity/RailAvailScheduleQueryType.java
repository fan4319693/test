//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines rail availability and schedule search criteria, including origin-destination information and train number and network code.
 * 
 * <p>RailAvailScheduleQueryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RailAvailScheduleQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestinationInformation" type="{http://www.opentravel.org/OTA/2003/05}RailOriginDestinationInformationType"/>
 *         &lt;element name="RailSearchCriteria" type="{http://www.opentravel.org/OTA/2003/05}TrainQueryType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxConnections" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TrainTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailAvailScheduleQueryType", propOrder = {
    "originDestinationInformation",
    "railSearchCriteria"
})
public class RailAvailScheduleQueryType {

    @XmlElement(name = "OriginDestinationInformation", required = true)
    protected RailOriginDestinationInformationType originDestinationInformation;
    @XmlElement(name = "RailSearchCriteria")
    protected List<TrainQueryType> railSearchCriteria;
    @XmlAttribute(name = "MaxConnections")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxConnections;
    @XmlAttribute(name = "TrainTypeCode")
    protected String trainTypeCode;

    /**
     * 获取originDestinationInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailOriginDestinationInformationType }
     *     
     */
    public RailOriginDestinationInformationType getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    /**
     * 设置originDestinationInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailOriginDestinationInformationType }
     *     
     */
    public void setOriginDestinationInformation(RailOriginDestinationInformationType value) {
        this.originDestinationInformation = value;
    }

    /**
     * Gets the value of the railSearchCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railSearchCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailSearchCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainQueryType }
     * 
     * 
     */
    public List<TrainQueryType> getRailSearchCriteria() {
        if (railSearchCriteria == null) {
            railSearchCriteria = new ArrayList<TrainQueryType>();
        }
        return this.railSearchCriteria;
    }

    /**
     * 获取maxConnections属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxConnections() {
        return maxConnections;
    }

    /**
     * 设置maxConnections属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxConnections(BigInteger value) {
        this.maxConnections = value;
    }

    /**
     * 获取trainTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainTypeCode() {
        return trainTypeCode;
    }

    /**
     * 设置trainTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainTypeCode(String value) {
        this.trainTypeCode = value;
    }

}
