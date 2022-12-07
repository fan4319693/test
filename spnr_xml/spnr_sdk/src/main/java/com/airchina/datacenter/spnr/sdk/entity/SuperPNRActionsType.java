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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SuperPNRActionsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SuperPNRActionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OJ_SuperPNRAction" maxOccurs="20">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
 *                   &lt;element name="Attachment" type="{http://www.opentravel.org/OTA/2003/05}AttachmentsType" minOccurs="0"/>
 *                   &lt;element name="Stages" type="{http://www.opentravel.org/OTA/2003/05}Stages_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Action" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuperPNRActionsType", propOrder = {
    "ojSuperPNRAction"
})
public class SuperPNRActionsType {

    @XmlElement(name = "OJ_SuperPNRAction", required = true)
    protected List<SuperPNRActionsType.OJSuperPNRAction> ojSuperPNRAction;

    /**
     * Gets the value of the ojSuperPNRAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ojSuperPNRAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOJSuperPNRAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuperPNRActionsType.OJSuperPNRAction }
     * 
     * 
     */
    public List<SuperPNRActionsType.OJSuperPNRAction> getOJSuperPNRAction() {
        if (ojSuperPNRAction == null) {
            ojSuperPNRAction = new ArrayList<SuperPNRActionsType.OJSuperPNRAction>();
        }
        return this.ojSuperPNRAction;
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
     *         &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
     *         &lt;element name="Attachment" type="{http://www.opentravel.org/OTA/2003/05}AttachmentsType" minOccurs="0"/>
     *         &lt;element name="Stages" type="{http://www.opentravel.org/OTA/2003/05}Stages_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Action" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "warnings",
        "attachment",
        "stages"
    })
    public static class OJSuperPNRAction {

        @XmlElement(name = "Warnings")
        protected WarningsType warnings;
        @XmlElement(name = "Attachment")
        protected AttachmentsType attachment;
        @XmlElement(name = "Stages")
        protected StagesType stages;
        @XmlAttribute(name = "MasterProductNumber")
        @XmlSchemaType(name = "anySimpleType")
        protected String masterProductNumber;
        @XmlAttribute(name = "ProductNumber")
        @XmlSchemaType(name = "anySimpleType")
        protected String productNumber;
        @XmlAttribute(name = "Action")
        @XmlSchemaType(name = "anySimpleType")
        protected String action;

        /**
         * 获取warnings属性的值。
         * 
         * @return
         *     possible object is
         *     {@link WarningsType }
         *     
         */
        public WarningsType getWarnings() {
            return warnings;
        }

        /**
         * 设置warnings属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link WarningsType }
         *     
         */
        public void setWarnings(WarningsType value) {
            this.warnings = value;
        }

        /**
         * 获取attachment属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AttachmentsType }
         *     
         */
        public AttachmentsType getAttachment() {
            return attachment;
        }

        /**
         * 设置attachment属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentsType }
         *     
         */
        public void setAttachment(AttachmentsType value) {
            this.attachment = value;
        }

        /**
         * 获取stages属性的值。
         * 
         * @return
         *     possible object is
         *     {@link StagesType }
         *     
         */
        public StagesType getStages() {
            return stages;
        }

        /**
         * 设置stages属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link StagesType }
         *     
         */
        public void setStages(StagesType value) {
            this.stages = value;
        }

        /**
         * 获取masterProductNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMasterProductNumber() {
            return masterProductNumber;
        }

        /**
         * 设置masterProductNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMasterProductNumber(String value) {
            this.masterProductNumber = value;
        }

        /**
         * 获取productNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductNumber() {
            return productNumber;
        }

        /**
         * 设置productNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductNumber(String value) {
            this.productNumber = value;
        }

        /**
         * 获取action属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * 设置action属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }

    }

}
