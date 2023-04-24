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


/**
 * Agency Party Identification information.
 * 
 * <p>AgencyPartyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AgencyPartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="UserID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UserRole" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UserPW" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DutyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SignOn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LNIATA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyPartyType")
public class AgencyPartyType {

    @XmlAttribute(name = "UserID", required = true)
    protected String userID;
    @XmlAttribute(name = "UserRole")
    protected String userRole;
    @XmlAttribute(name = "UserPW")
    protected String userPW;
    @XmlAttribute(name = "DutyCode")
    protected String dutyCode;
    @XmlAttribute(name = "SignOn")
    protected String signOn;
    @XmlAttribute(name = "LNIATA")
    protected String lniata;

    /**
     * 获取userID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * 设置userID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * 获取userRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * 设置userRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRole(String value) {
        this.userRole = value;
    }

    /**
     * 获取userPW属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPW() {
        return userPW;
    }

    /**
     * 设置userPW属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPW(String value) {
        this.userPW = value;
    }

    /**
     * 获取dutyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyCode() {
        return dutyCode;
    }

    /**
     * 设置dutyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyCode(String value) {
        this.dutyCode = value;
    }

    /**
     * 获取signOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignOn() {
        return signOn;
    }

    /**
     * 设置signOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignOn(String value) {
        this.signOn = value;
    }

    /**
     * 获取lniata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNIATA() {
        return lniata;
    }

    /**
     * 设置lniata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNIATA(String value) {
        this.lniata = value;
    }

}
