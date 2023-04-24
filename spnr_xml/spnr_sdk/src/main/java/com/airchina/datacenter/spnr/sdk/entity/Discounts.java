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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="DiscountForTickets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AllTickets" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;attribute name="NumberOfTickets" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Percentage" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "", propOrder = {
    "discountForTickets"
})
@XmlRootElement(name = "Discounts")
public class Discounts {

    @XmlElement(name = "DiscountForTickets")
    protected Discounts.DiscountForTickets discountForTickets;

    /**
     * 获取discountForTickets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Discounts.DiscountForTickets }
     *     
     */
    public Discounts.DiscountForTickets getDiscountForTickets() {
        return discountForTickets;
    }

    /**
     * 设置discountForTickets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Discounts.DiscountForTickets }
     *     
     */
    public void setDiscountForTickets(Discounts.DiscountForTickets value) {
        this.discountForTickets = value;
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
     *       &lt;attribute name="AllTickets" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="NumberOfTickets" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Percentage" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DiscountForTickets {

        @XmlAttribute(name = "AllTickets")
        protected Boolean allTickets;
        @XmlAttribute(name = "NumberOfTickets", required = true)
        protected int numberOfTickets;
        @XmlAttribute(name = "Percentage", required = true)
        protected int percentage;

        /**
         * 获取allTickets属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isAllTickets() {
            if (allTickets == null) {
                return true;
            } else {
                return allTickets;
            }
        }

        /**
         * 设置allTickets属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllTickets(Boolean value) {
            this.allTickets = value;
        }

        /**
         * 获取numberOfTickets属性的值。
         * 
         */
        public int getNumberOfTickets() {
            return numberOfTickets;
        }

        /**
         * 设置numberOfTickets属性的值。
         * 
         */
        public void setNumberOfTickets(int value) {
            this.numberOfTickets = value;
        }

        /**
         * 获取percentage属性的值。
         * 
         */
        public int getPercentage() {
            return percentage;
        }

        /**
         * 设置percentage属性的值。
         * 
         */
        public void setPercentage(int value) {
            this.percentage = value;
        }

    }

}
