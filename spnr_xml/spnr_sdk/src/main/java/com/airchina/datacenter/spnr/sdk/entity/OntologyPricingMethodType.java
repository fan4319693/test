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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Pricing method with ontology reference.
 * 
 * <p>OntologyPricingMethodType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OntologyPricingMethodType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferPricingType">
 *       &lt;attribute name="InclusiveInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ApproximateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OtherType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="OntologyRefID">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{1,8}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntologyPricingMethodType", propOrder = {
    "value"
})
public class OntologyPricingMethodType {

    @XmlValue
    protected ListOfferPricingType value;
    @XmlAttribute(name = "InclusiveInd")
    protected Boolean inclusiveInd;
    @XmlAttribute(name = "ApproximateInd")
    protected Boolean approximateInd;
    @XmlAttribute(name = "OtherType")
    protected String otherType;
    @XmlAttribute(name = "OntologyRefID")
    protected String ontologyRefID;

    /**
     * Source: Coverage Type (COV) OpenTravel codelist.
     * 
     * @return
     *     possible object is
     *     {@link ListOfferPricingType }
     *     
     */
    public ListOfferPricingType getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfferPricingType }
     *     
     */
    public void setValue(ListOfferPricingType value) {
        this.value = value;
    }

    /**
     * 获取inclusiveInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusiveInd() {
        return inclusiveInd;
    }

    /**
     * 设置inclusiveInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusiveInd(Boolean value) {
        this.inclusiveInd = value;
    }

    /**
     * 获取approximateInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateInd() {
        return approximateInd;
    }

    /**
     * 设置approximateInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateInd(Boolean value) {
        this.approximateInd = value;
    }

    /**
     * 获取otherType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherType() {
        return otherType;
    }

    /**
     * 设置otherType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherType(String value) {
        this.otherType = value;
    }

    /**
     * 获取ontologyRefID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntologyRefID() {
        return ontologyRefID;
    }

    /**
     * 设置ontologyRefID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntologyRefID(String value) {
        this.ontologyRefID = value;
    }

}
