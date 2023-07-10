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
import javax.xml.bind.annotation.XmlValue;


/**
 * Contains the age and amount for child prices.
 * 
 * <p>ChildAmountType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ChildAmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChildAmount" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="Under" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="SellAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="OriginalSellAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SupplierAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "ChildAmountType", propOrder = {
    "childAmount"
})
public class ChildAmountType {

    @XmlElement(name = "ChildAmount")
    protected List<ChildAmountType.ChildAmount> childAmount;

    /**
     * Gets the value of the childAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildAmountType.ChildAmount }
     * 
     * 
     */
    public List<ChildAmountType.ChildAmount> getChildAmount() {
        if (childAmount == null) {
            childAmount = new ArrayList<ChildAmountType.ChildAmount>();
        }
        return this.childAmount;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="Under" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="SellAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="OriginalSellAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SupplierAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ChildAmount {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "OriginalAmount")
        protected Float originalAmount;
        @XmlAttribute(name = "Amount", required = true)
        protected float amount;
        @XmlAttribute(name = "Under", required = true)
        protected int under;
        @XmlAttribute(name = "SellAmount")
        protected Float sellAmount;
        @XmlAttribute(name = "OriginalSellAmount")
        protected Float originalSellAmount;
        @XmlAttribute(name = "Quantity")
        protected Integer quantity;
        @XmlAttribute(name = "Selected")
        protected Boolean selected;
        @XmlAttribute(name = "SupplierAmount")
        protected Float supplierAmount;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取originalAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getOriginalAmount() {
            return originalAmount;
        }

        /**
         * 设置originalAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setOriginalAmount(Float value) {
            this.originalAmount = value;
        }

        /**
         * 获取amount属性的值。
         * 
         */
        public float getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         */
        public void setAmount(float value) {
            this.amount = value;
        }

        /**
         * 获取under属性的值。
         * 
         */
        public int getUnder() {
            return under;
        }

        /**
         * 设置under属性的值。
         * 
         */
        public void setUnder(int value) {
            this.under = value;
        }

        /**
         * 获取sellAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSellAmount() {
            return sellAmount;
        }

        /**
         * 设置sellAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSellAmount(Float value) {
            this.sellAmount = value;
        }

        /**
         * 获取originalSellAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getOriginalSellAmount() {
            return originalSellAmount;
        }

        /**
         * 设置originalSellAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setOriginalSellAmount(Float value) {
            this.originalSellAmount = value;
        }

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQuantity(Integer value) {
            this.quantity = value;
        }

        /**
         * 获取selected属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSelected() {
            return selected;
        }

        /**
         * 设置selected属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSelected(Boolean value) {
            this.selected = value;
        }

        /**
         * 获取supplierAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSupplierAmount() {
            return supplierAmount;
        }

        /**
         * 设置supplierAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSupplierAmount(Float value) {
            this.supplierAmount = value;
        }

    }

}
