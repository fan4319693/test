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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Choice between summary and detailed code extension information.
 * 
 * <p>CodeListExtension complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CodeListExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Summary" type="{http://www.opentravel.org/OTA/2003/05}CodeListSummaryExtension" minOccurs="0"/>
 *         &lt;element name="Detail" type="{http://www.opentravel.org/OTA/2003/05}CodeListDetailExtension" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="ChargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProximityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="QuantityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ScheduleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListExtension", propOrder = {
    "summary",
    "detail"
})
public class CodeListExtension {

    @XmlElement(name = "Summary")
    protected CodeListSummaryExtension summary;
    @XmlElement(name = "Detail")
    protected CodeListDetailExtension detail;
    @XmlAttribute(name = "ChargeInd")
    protected Boolean chargeInd;
    @XmlAttribute(name = "ProximityInd")
    protected Boolean proximityInd;
    @XmlAttribute(name = "QuantityInd")
    protected Boolean quantityInd;
    @XmlAttribute(name = "ScheduleInd")
    protected Boolean scheduleInd;

    /**
     * 获取summary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeListSummaryExtension }
     *     
     */
    public CodeListSummaryExtension getSummary() {
        return summary;
    }

    /**
     * 设置summary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListSummaryExtension }
     *     
     */
    public void setSummary(CodeListSummaryExtension value) {
        this.summary = value;
    }

    /**
     * 获取detail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeListDetailExtension }
     *     
     */
    public CodeListDetailExtension getDetail() {
        return detail;
    }

    /**
     * 设置detail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListDetailExtension }
     *     
     */
    public void setDetail(CodeListDetailExtension value) {
        this.detail = value;
    }

    /**
     * 获取chargeInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChargeInd() {
        return chargeInd;
    }

    /**
     * 设置chargeInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChargeInd(Boolean value) {
        this.chargeInd = value;
    }

    /**
     * 获取proximityInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProximityInd() {
        return proximityInd;
    }

    /**
     * 设置proximityInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProximityInd(Boolean value) {
        this.proximityInd = value;
    }

    /**
     * 获取quantityInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityInd() {
        return quantityInd;
    }

    /**
     * 设置quantityInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityInd(Boolean value) {
        this.quantityInd = value;
    }

    /**
     * 获取scheduleInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduleInd() {
        return scheduleInd;
    }

    /**
     * 设置scheduleInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduleInd(Boolean value) {
        this.scheduleInd = value;
    }

}
