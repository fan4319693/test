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
 * Defines biasing configuration set
 * 
 * <p>BiasingConfigSet complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BiasingConfigSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="BiasingConfig" type="{http://www.opentravel.org/OTA/2003/05}BiasingConfig" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TestID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TestName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TestToken" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TestLocation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiasingConfigSet", propOrder = {
    "biasingConfig"
})
public class BiasingConfigSet {

    @XmlElement(name = "BiasingConfig", required = true)
    protected List<BiasingConfig> biasingConfig;
    @XmlAttribute(name = "TestID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String testID;
    @XmlAttribute(name = "TestName")
    @XmlSchemaType(name = "anySimpleType")
    protected String testName;
    @XmlAttribute(name = "TestToken", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String testToken;
    @XmlAttribute(name = "TestLocation")
    @XmlSchemaType(name = "anySimpleType")
    protected String testLocation;

    /**
     * Gets the value of the biasingConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biasingConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiasingConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BiasingConfig }
     * 
     * 
     */
    public List<BiasingConfig> getBiasingConfig() {
        if (biasingConfig == null) {
            biasingConfig = new ArrayList<BiasingConfig>();
        }
        return this.biasingConfig;
    }

    /**
     * 获取testID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestID() {
        return testID;
    }

    /**
     * 设置testID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestID(String value) {
        this.testID = value;
    }

    /**
     * 获取testName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestName() {
        return testName;
    }

    /**
     * 设置testName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestName(String value) {
        this.testName = value;
    }

    /**
     * 获取testToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestToken() {
        return testToken;
    }

    /**
     * 设置testToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestToken(String value) {
        this.testToken = value;
    }

    /**
     * 获取testLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestLocation() {
        return testLocation;
    }

    /**
     * 设置testLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestLocation(String value) {
        this.testLocation = value;
    }

}
