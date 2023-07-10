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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Traveler social networking information.
 * 
 * <p>SocialNetworkingPaxType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SocialNetworkingPaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelerIDRef">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TravelerIDRefType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PaxType"/>
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
@XmlType(name = "SocialNetworkingPaxType", propOrder = {
    "serviceName",
    "userName",
    "emailAddress",
    "travelerIDRef"
})
public class SocialNetworkingPaxType {

    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "TravelerIDRef", required = true)
    protected SocialNetworkingPaxType.TravelerIDRef travelerIDRef;

    /**
     * 获取serviceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 设置serviceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * 获取emailAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 设置emailAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * 获取travelerIDRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SocialNetworkingPaxType.TravelerIDRef }
     *     
     */
    public SocialNetworkingPaxType.TravelerIDRef getTravelerIDRef() {
        return travelerIDRef;
    }

    /**
     * 设置travelerIDRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SocialNetworkingPaxType.TravelerIDRef }
     *     
     */
    public void setTravelerIDRef(SocialNetworkingPaxType.TravelerIDRef value) {
        this.travelerIDRef = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TravelerIDRefType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PaxType"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelerIDRef
        extends TravelerIDRefType
    {

        @XmlAttribute(name = "PaxType", required = true)
        protected String paxType;

        /**
         * 获取paxType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaxType() {
            return paxType;
        }

        /**
         * 设置paxType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaxType(String value) {
            this.paxType = value;
        }

    }

}
