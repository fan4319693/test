//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * ATPCO record S7 diagnostic information.
 * 
 * <p>S7Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="S7Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="UID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S7Type")
public class S7Type {

    @XmlAttribute(name = "UID")
    protected BigInteger uid;
    @XmlAttribute(name = "Seq")
    protected BigInteger seq;
    @XmlAttribute(name = "ExcessFirst")
    protected BigInteger excessFirst;
    @XmlAttribute(name = "ExcessLast")
    protected BigInteger excessLast;

    /**
     * 获取uid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUID() {
        return uid;
    }

    /**
     * 设置uid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUID(BigInteger value) {
        this.uid = value;
    }

    /**
     * 获取seq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeq() {
        return seq;
    }

    /**
     * 设置seq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeq(BigInteger value) {
        this.seq = value;
    }

    /**
     * 获取excessFirst属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExcessFirst() {
        return excessFirst;
    }

    /**
     * 设置excessFirst属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExcessFirst(BigInteger value) {
        this.excessFirst = value;
    }

    /**
     * 获取excessLast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExcessLast() {
        return excessLast;
    }

    /**
     * 设置excessLast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExcessLast(BigInteger value) {
        this.excessLast = value;
    }

}
