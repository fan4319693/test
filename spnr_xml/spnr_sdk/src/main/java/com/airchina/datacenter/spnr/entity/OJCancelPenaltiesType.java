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
 * A collection of CancelPenalties
 * 
 * <p>OJ_CancelPenaltiesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OJ_CancelPenaltiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelPenalty" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CancelPenaltyType">
 *                 &lt;attribute name="PerPerson" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CancelPolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJ_CancelPenaltiesType", propOrder = {
    "cancelPenalty"
})
public class OJCancelPenaltiesType {

    @XmlElement(name = "CancelPenalty")
    protected List<OJCancelPenaltiesType.CancelPenalty> cancelPenalty;
    @XmlAttribute(name = "CancelPolicyIndicator")
    protected Boolean cancelPolicyIndicator;

    /**
     * Gets the value of the cancelPenalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelPenalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelPenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OJCancelPenaltiesType.CancelPenalty }
     * 
     * 
     */
    public List<OJCancelPenaltiesType.CancelPenalty> getCancelPenalty() {
        if (cancelPenalty == null) {
            cancelPenalty = new ArrayList<OJCancelPenaltiesType.CancelPenalty>();
        }
        return this.cancelPenalty;
    }

    /**
     * 获取cancelPolicyIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelPolicyIndicator() {
        return cancelPolicyIndicator;
    }

    /**
     * 设置cancelPolicyIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelPolicyIndicator(Boolean value) {
        this.cancelPolicyIndicator = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CancelPenaltyType">
     *       &lt;attribute name="PerPerson" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CancelPenalty
        extends CancelPenaltyType
    {

        @XmlAttribute(name = "PerPerson")
        protected Boolean perPerson;

        /**
         * 获取perPerson属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPerPerson() {
            return perPerson;
        }

        /**
         * 设置perPerson属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPerPerson(Boolean value) {
            this.perPerson = value;
        }

    }

}
