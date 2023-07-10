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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AirAncillaryOffsetProductType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirAncillaryOffsetProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarbonOffset" type="{http://www.opentravel.org/OTA/2003/05}CarbonOffsetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
 *       &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirAncillaryOffsetProductType", propOrder = {
    "carbonOffset"
})
public class AirAncillaryOffsetProductType {

    @XmlElement(name = "CarbonOffset")
    protected List<CarbonOffsetType> carbonOffset;
    @XmlAttribute(name = "Unit")
    protected WeightUnitType unit;
    @XmlAttribute(name = "TotalAmount")
    protected Float totalAmount;

    /**
     * Gets the value of the carbonOffset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carbonOffset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarbonOffset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarbonOffsetType }
     * 
     * 
     */
    public List<CarbonOffsetType> getCarbonOffset() {
        if (carbonOffset == null) {
            carbonOffset = new ArrayList<CarbonOffsetType>();
        }
        return this.carbonOffset;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightUnitType }
     *     
     */
    public WeightUnitType getUnit() {
        return unit;
    }

    /**
     * 设置unit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightUnitType }
     *     
     */
    public void setUnit(WeightUnitType value) {
        this.unit = value;
    }

    /**
     * 获取totalAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置totalAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalAmount(Float value) {
        this.totalAmount = value;
    }

}
