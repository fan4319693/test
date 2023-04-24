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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The FFP accumulation information.
 * 
 * <p>FFPAccumulationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FFPAccumulationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TierRates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TierRate" type="{http://www.opentravel.org/OTA/2003/05}TierRateType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RBDRates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RBDRate" type="{http://www.opentravel.org/OTA/2003/05}RBDRateType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Qualified" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FFPAccumulationType", propOrder = {
    "tierRates",
    "rbdRates"
})
public class FFPAccumulationType {

    @XmlElement(name = "TierRates")
    protected FFPAccumulationType.TierRates tierRates;
    @XmlElement(name = "RBDRates")
    protected FFPAccumulationType.RBDRates rbdRates;
    @XmlAttribute(name = "Qualified")
    protected Boolean qualified;

    /**
     * 获取tierRates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FFPAccumulationType.TierRates }
     *     
     */
    public FFPAccumulationType.TierRates getTierRates() {
        return tierRates;
    }

    /**
     * 设置tierRates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FFPAccumulationType.TierRates }
     *     
     */
    public void setTierRates(FFPAccumulationType.TierRates value) {
        this.tierRates = value;
    }

    /**
     * 获取rbdRates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FFPAccumulationType.RBDRates }
     *     
     */
    public FFPAccumulationType.RBDRates getRBDRates() {
        return rbdRates;
    }

    /**
     * 设置rbdRates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FFPAccumulationType.RBDRates }
     *     
     */
    public void setRBDRates(FFPAccumulationType.RBDRates value) {
        this.rbdRates = value;
    }

    /**
     * 获取qualified属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualified() {
        return qualified;
    }

    /**
     * 设置qualified属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualified(Boolean value) {
        this.qualified = value;
    }


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
     *         &lt;element name="RBDRate" type="{http://www.opentravel.org/OTA/2003/05}RBDRateType" maxOccurs="unbounded"/>
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
        "rbdRate"
    })
    public static class RBDRates {

        @XmlElement(name = "RBDRate", required = true)
        protected List<RBDRateType> rbdRate;

        /**
         * Gets the value of the rbdRate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rbdRate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRBDRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RBDRateType }
         * 
         * 
         */
        public List<RBDRateType> getRBDRate() {
            if (rbdRate == null) {
                rbdRate = new ArrayList<RBDRateType>();
            }
            return this.rbdRate;
        }

    }


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
     *         &lt;element name="TierRate" type="{http://www.opentravel.org/OTA/2003/05}TierRateType" maxOccurs="unbounded"/>
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
        "tierRate"
    })
    public static class TierRates {

        @XmlElement(name = "TierRate", required = true)
        protected List<TierRateType> tierRate;

        /**
         * Gets the value of the tierRate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tierRate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTierRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TierRateType }
         * 
         * 
         */
        public List<TierRateType> getTierRate() {
            if (tierRate == null) {
                tierRate = new ArrayList<TierRateType>();
            }
            return this.tierRate;
        }

    }

}
