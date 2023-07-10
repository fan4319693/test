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
 *       &lt;attribute name="Weds" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Tue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Thur" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sun" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sat" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Mon" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Fri" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DOW")
public class DOW {

    @XmlAttribute(name = "Weds", required = true)
    protected boolean weds;
    @XmlAttribute(name = "Tue", required = true)
    protected boolean tue;
    @XmlAttribute(name = "Thur", required = true)
    protected boolean thur;
    @XmlAttribute(name = "Sun", required = true)
    protected boolean sun;
    @XmlAttribute(name = "Sat", required = true)
    protected boolean sat;
    @XmlAttribute(name = "Mon", required = true)
    protected boolean mon;
    @XmlAttribute(name = "Fri", required = true)
    protected boolean fri;

    /**
     * 获取weds属性的值。
     * 
     */
    public boolean isWeds() {
        return weds;
    }

    /**
     * 设置weds属性的值。
     * 
     */
    public void setWeds(boolean value) {
        this.weds = value;
    }

    /**
     * 获取tue属性的值。
     * 
     */
    public boolean isTue() {
        return tue;
    }

    /**
     * 设置tue属性的值。
     * 
     */
    public void setTue(boolean value) {
        this.tue = value;
    }

    /**
     * 获取thur属性的值。
     * 
     */
    public boolean isThur() {
        return thur;
    }

    /**
     * 设置thur属性的值。
     * 
     */
    public void setThur(boolean value) {
        this.thur = value;
    }

    /**
     * 获取sun属性的值。
     * 
     */
    public boolean isSun() {
        return sun;
    }

    /**
     * 设置sun属性的值。
     * 
     */
    public void setSun(boolean value) {
        this.sun = value;
    }

    /**
     * 获取sat属性的值。
     * 
     */
    public boolean isSat() {
        return sat;
    }

    /**
     * 设置sat属性的值。
     * 
     */
    public void setSat(boolean value) {
        this.sat = value;
    }

    /**
     * 获取mon属性的值。
     * 
     */
    public boolean isMon() {
        return mon;
    }

    /**
     * 设置mon属性的值。
     * 
     */
    public void setMon(boolean value) {
        this.mon = value;
    }

    /**
     * 获取fri属性的值。
     * 
     */
    public boolean isFri() {
        return fri;
    }

    /**
     * 设置fri属性的值。
     * 
     */
    public void setFri(boolean value) {
        this.fri = value;
    }

}
