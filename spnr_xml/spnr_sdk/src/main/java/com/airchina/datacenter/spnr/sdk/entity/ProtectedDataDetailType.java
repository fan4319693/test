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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Detailed protected data information.
 * 
 * <p>ProtectedDataDetailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProtectedDataDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProtectedDataValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Format" type="{http://www.opentravel.org/OTA/2003/05}ProtectedFormatType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EncryptDatabaseKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EncryptKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EncryptKeyMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MerchantIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TokenProviderID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TracerValue" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectedDataDetailType", propOrder = {
    "protectedDataValue",
    "format"
})
public class ProtectedDataDetailType {

    @XmlElement(name = "ProtectedDataValue", required = true)
    protected String protectedDataValue;
    @XmlElement(name = "Format", required = true)
    @XmlSchemaType(name = "string")
    protected ProtectedFormatType format;
    @XmlAttribute(name = "EncryptDatabaseKey")
    protected String encryptDatabaseKey;
    @XmlAttribute(name = "EncryptKey")
    protected String encryptKey;
    @XmlAttribute(name = "EncryptKeyMethod")
    protected String encryptKeyMethod;
    @XmlAttribute(name = "MerchantIdentifier")
    protected String merchantIdentifier;
    @XmlAttribute(name = "TokenProviderID")
    protected String tokenProviderID;
    @XmlAttribute(name = "TracerValue")
    protected BigInteger tracerValue;

    /**
     * 获取protectedDataValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedDataValue() {
        return protectedDataValue;
    }

    /**
     * 设置protectedDataValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedDataValue(String value) {
        this.protectedDataValue = value;
    }

    /**
     * 获取format属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProtectedFormatType }
     *     
     */
    public ProtectedFormatType getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectedFormatType }
     *     
     */
    public void setFormat(ProtectedFormatType value) {
        this.format = value;
    }

    /**
     * 获取encryptDatabaseKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptDatabaseKey() {
        return encryptDatabaseKey;
    }

    /**
     * 设置encryptDatabaseKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptDatabaseKey(String value) {
        this.encryptDatabaseKey = value;
    }

    /**
     * 获取encryptKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptKey() {
        return encryptKey;
    }

    /**
     * 设置encryptKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptKey(String value) {
        this.encryptKey = value;
    }

    /**
     * 获取encryptKeyMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptKeyMethod() {
        return encryptKeyMethod;
    }

    /**
     * 设置encryptKeyMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptKeyMethod(String value) {
        this.encryptKeyMethod = value;
    }

    /**
     * 获取merchantIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantIdentifier() {
        return merchantIdentifier;
    }

    /**
     * 设置merchantIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantIdentifier(String value) {
        this.merchantIdentifier = value;
    }

    /**
     * 获取tokenProviderID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenProviderID() {
        return tokenProviderID;
    }

    /**
     * 设置tokenProviderID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenProviderID(String value) {
        this.tokenProviderID = value;
    }

    /**
     * 获取tracerValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTracerValue() {
        return tracerValue;
    }

    /**
     * 设置tracerValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTracerValue(BigInteger value) {
        this.tracerValue = value;
    }

}
