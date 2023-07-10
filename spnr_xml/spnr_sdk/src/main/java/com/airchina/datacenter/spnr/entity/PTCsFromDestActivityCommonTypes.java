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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * All passenger types supported
 * 
 * <p>PTCs element declaration的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;element name="PTCs">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="PTC" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PTCType">
 *                   &lt;attribute name="AgeMinimum" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                   &lt;attribute name="AgeMaximum" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                   &lt;attribute name="MaxCapacity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                   &lt;attribute name="MinCapacity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                   &lt;attribute name="isToBePriced" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                   &lt;attribute name="isAllowed" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;attribute name="MinimumCapacity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *         &lt;attribute name="MaximumCapacity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ptc"
})
@XmlRootElement(name = "PTCs")
public class PTCsFromDestActivityCommonTypes {

    @XmlElement(name = "PTC", required = true)
    protected List<PTCsFromDestActivityCommonTypes.PTC> ptc;
    @XmlAttribute(name = "MinimumCapacity")
    @XmlSchemaType(name = "anySimpleType")
    protected String minimumCapacity;
    @XmlAttribute(name = "MaximumCapacity")
    @XmlSchemaType(name = "anySimpleType")
    protected String maximumCapacity;

    /**
     * Gets the value of the ptc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPTC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCsFromDestActivityCommonTypes.PTC }
     * 
     * 
     */
    public List<PTCsFromDestActivityCommonTypes.PTC> getPTC() {
        if (ptc == null) {
            ptc = new ArrayList<PTCsFromDestActivityCommonTypes.PTC>();
        }
        return this.ptc;
    }

    /**
     * 获取minimumCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumCapacity() {
        return minimumCapacity;
    }

    /**
     * 设置minimumCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumCapacity(String value) {
        this.minimumCapacity = value;
    }

    /**
     * 获取maximumCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCapacity() {
        return maximumCapacity;
    }

    /**
     * 设置maximumCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCapacity(String value) {
        this.maximumCapacity = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PTCType">
     *       &lt;attribute name="AgeMinimum" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="AgeMaximum" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="MaxCapacity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="MinCapacity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="isToBePriced" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="isAllowed" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PTC
        extends PTCType
    {

        @XmlAttribute(name = "AgeMinimum")
        @XmlSchemaType(name = "anySimpleType")
        protected String ageMinimum;
        @XmlAttribute(name = "AgeMaximum")
        @XmlSchemaType(name = "anySimpleType")
        protected String ageMaximum;
        @XmlAttribute(name = "MaxCapacity")
        protected BigInteger maxCapacity;
        @XmlAttribute(name = "MinCapacity")
        protected BigInteger minCapacity;
        @XmlAttribute(name = "isToBePriced")
        @XmlSchemaType(name = "anySimpleType")
        protected String isToBePriced;
        @XmlAttribute(name = "isAllowed")
        @XmlSchemaType(name = "anySimpleType")
        protected String isAllowed;

        /**
         * 获取ageMinimum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeMinimum() {
            return ageMinimum;
        }

        /**
         * 设置ageMinimum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeMinimum(String value) {
            this.ageMinimum = value;
        }

        /**
         * 获取ageMaximum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeMaximum() {
            return ageMaximum;
        }

        /**
         * 设置ageMaximum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeMaximum(String value) {
            this.ageMaximum = value;
        }

        /**
         * 获取maxCapacity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxCapacity() {
            return maxCapacity;
        }

        /**
         * 设置maxCapacity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxCapacity(BigInteger value) {
            this.maxCapacity = value;
        }

        /**
         * 获取minCapacity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinCapacity() {
            return minCapacity;
        }

        /**
         * 设置minCapacity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinCapacity(BigInteger value) {
            this.minCapacity = value;
        }

        /**
         * 获取isToBePriced属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsToBePriced() {
            return isToBePriced;
        }

        /**
         * 设置isToBePriced属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsToBePriced(String value) {
            this.isToBePriced = value;
        }

        /**
         * 获取isAllowed属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsAllowed() {
            return isAllowed;
        }

        /**
         * 设置isAllowed属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsAllowed(String value) {
            this.isAllowed = value;
        }

    }

}
