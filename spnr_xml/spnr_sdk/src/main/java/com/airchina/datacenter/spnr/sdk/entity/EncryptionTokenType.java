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
import javax.xml.bind.annotation.XmlType;


/**
 * OpenTravel Best Practice: Use of Encrypted, Masked or Tokenized Information: Certain OpenTravel schema may have combinations payment and/or account information with other personally identifying information, such as customer name and date of birth. For enhanced customer privacy and security, it is RECOMMENDED that the payment and account information be protected, using tokenization or some other encryption method and displayed in a masked format.
 * 
 * <p>EncryptionTokenType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EncryptionTokenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://www.opentravel.org/OTA/2003/05}WarningType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EncryptionKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EncryptionKeyMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EncryptionMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EncryptedValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Mask">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9a-zA-Z]{1,32}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Token">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9a-zA-Z]{1,32}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TokenProviderID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AuthenticationMethod">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="SecurityCode"/>
 *             &lt;enumeration value="MagneticStripe"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionTokenType", propOrder = {
    "plainText",
    "tpaExtensions",
    "warning"
})
public class EncryptionTokenType {

    @XmlElement(name = "PlainText")
    protected String plainText;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlElement(name = "Warning")
    protected WarningType warning;
    @XmlAttribute(name = "EncryptionKey")
    protected String encryptionKey;
    @XmlAttribute(name = "EncryptionKeyMethod")
    protected String encryptionKeyMethod;
    @XmlAttribute(name = "EncryptionMethod")
    protected String encryptionMethod;
    @XmlAttribute(name = "EncryptedValue")
    protected String encryptedValue;
    @XmlAttribute(name = "Mask")
    protected String mask;
    @XmlAttribute(name = "Token")
    protected String token;
    @XmlAttribute(name = "TokenProviderID")
    protected String tokenProviderID;
    @XmlAttribute(name = "AuthenticationMethod")
    protected String authenticationMethod;

    /**
     * 获取plainText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlainText() {
        return plainText;
    }

    /**
     * 设置plainText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlainText(String value) {
        this.plainText = value;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * 获取warning属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WarningType }
     *     
     */
    public WarningType getWarning() {
        return warning;
    }

    /**
     * 设置warning属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WarningType }
     *     
     */
    public void setWarning(WarningType value) {
        this.warning = value;
    }

    /**
     * 获取encryptionKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * 设置encryptionKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKey(String value) {
        this.encryptionKey = value;
    }

    /**
     * 获取encryptionKeyMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKeyMethod() {
        return encryptionKeyMethod;
    }

    /**
     * 设置encryptionKeyMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKeyMethod(String value) {
        this.encryptionKeyMethod = value;
    }

    /**
     * 获取encryptionMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionMethod() {
        return encryptionMethod;
    }

    /**
     * 设置encryptionMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionMethod(String value) {
        this.encryptionMethod = value;
    }

    /**
     * 获取encryptedValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedValue() {
        return encryptedValue;
    }

    /**
     * 设置encryptedValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedValue(String value) {
        this.encryptedValue = value;
    }

    /**
     * 获取mask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * 设置mask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * 获取token属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置token属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
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
     * 获取authenticationMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * 设置authenticationMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMethod(String value) {
        this.authenticationMethod = value;
    }

}
