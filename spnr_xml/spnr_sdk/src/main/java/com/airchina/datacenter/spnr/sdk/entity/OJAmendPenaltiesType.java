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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of AmendPenalties
 * 
 * <p>OJ_AmendPenaltiesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OJ_AmendPenaltiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmendPenalty" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CancelPenaltyType">
 *                 &lt;attribute name="PerPerson" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Change"/>
 *                       &lt;enumeration value="Upgrade"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Allowed" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CancelPolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJ_AmendPenaltiesType", propOrder = {
    "amendPenalty"
})
public class OJAmendPenaltiesType {

    @XmlElement(name = "AmendPenalty")
    protected List<OJAmendPenaltiesType.AmendPenalty> amendPenalty;
    @XmlAttribute(name = "CancelPolicyIndicator")
    protected Boolean cancelPolicyIndicator;
    @XmlAttribute(name = "Source")
    protected String source;

    /**
     * Gets the value of the amendPenalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amendPenalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmendPenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OJAmendPenaltiesType.AmendPenalty }
     * 
     * 
     */
    public List<OJAmendPenaltiesType.AmendPenalty> getAmendPenalty() {
        if (amendPenalty == null) {
            amendPenalty = new ArrayList<OJAmendPenaltiesType.AmendPenalty>();
        }
        return this.amendPenalty;
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
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
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
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Change"/>
     *             &lt;enumeration value="Upgrade"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Allowed" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AmendPenalty
        extends CancelPenaltyType
    {

        @XmlAttribute(name = "PerPerson")
        protected Boolean perPerson;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Allowed")
        @XmlSchemaType(name = "anySimpleType")
        protected String allowed;

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

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * 获取allowed属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllowed() {
            return allowed;
        }

        /**
         * 设置allowed属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllowed(String value) {
            this.allowed = value;
        }

    }

}
