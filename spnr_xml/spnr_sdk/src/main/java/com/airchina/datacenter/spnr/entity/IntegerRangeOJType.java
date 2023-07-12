//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Range as integer type.
 * 
 * <p>IntegerRangeOJType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IntegerRangeOJType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegerRangeOJType")
public class IntegerRangeOJType {

    @XmlAttribute(name = "From", required = true)
    protected int from;
    @XmlAttribute(name = "To", required = true)
    protected int to;

    /**
     * 获取from属性的值。
     * 
     */
    public int getFrom() {
        return from;
    }

    /**
     * 设置from属性的值。
     * 
     */
    public void setFrom(int value) {
        this.from = value;
    }

    /**
     * 获取to属性的值。
     * 
     */
    public int getTo() {
        return to;
    }

    /**
     * 设置to属性的值。
     * 
     */
    public void setTo(int value) {
        this.to = value;
    }

}
