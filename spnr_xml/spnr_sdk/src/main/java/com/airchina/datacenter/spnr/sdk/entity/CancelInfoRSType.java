//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * May contain rules associated with canceling a reservation as well as the supplier's cancellation number.
 * 
 * <p>CancelInfoRSType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CancelInfoRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CancelRule" type="{http://www.opentravel.org/OTA/2003/05}CancelRuleType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelInfoRSType", propOrder = {
    "cancelRules",
    "uniqueID"
})
public class CancelInfoRSType {

    @XmlElement(name = "CancelRules")
    protected CancelInfoRSType.CancelRules cancelRules;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;

    /**
     * 获取cancelRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelInfoRSType.CancelRules }
     *     
     */
    public CancelInfoRSType.CancelRules getCancelRules() {
        return cancelRules;
    }

    /**
     * 设置cancelRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelInfoRSType.CancelRules }
     *     
     */
    public void setCancelRules(CancelInfoRSType.CancelRules value) {
        this.cancelRules = value;
    }

    /**
     * 获取uniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * 设置uniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
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
     *         &lt;element name="CancelRule" type="{http://www.opentravel.org/OTA/2003/05}CancelRuleType" maxOccurs="unbounded"/>
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
        "cancelRule"
    })
    public static class CancelRules {

        @XmlElement(name = "CancelRule", required = true)
        protected List<CancelRuleType> cancelRule;

        /**
         * Gets the value of the cancelRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cancelRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCancelRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CancelRuleType }
         * 
         * 
         */
        public List<CancelRuleType> getCancelRule() {
            if (cancelRule == null) {
                cancelRule = new ArrayList<CancelRuleType>();
            }
            return this.cancelRule;
        }

    }

}
