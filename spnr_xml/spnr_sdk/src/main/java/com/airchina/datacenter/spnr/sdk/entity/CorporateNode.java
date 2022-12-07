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
 * Representation of a subdivision of a corporation.
 * 
 * <p>CorporateNode complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CorporateNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorporateDetails" type="{http://www.opentravel.org/OTA/2003/05}CorporateDetailsType"/>
 *         &lt;element name="CorporateNode" type="{http://www.opentravel.org/OTA/2003/05}CorporateNode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Users" type="{http://www.opentravel.org/OTA/2003/05}UsersType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParentID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastRefreshed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HierarchyID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateNode", propOrder = {
    "corporateDetails",
    "corporateNode",
    "users"
})
public class CorporateNode {

    @XmlElement(name = "CorporateDetails", required = true)
    protected CorporateDetailsType corporateDetails;
    @XmlElement(name = "CorporateNode")
    protected List<CorporateNode> corporateNode;
    @XmlElement(name = "Users")
    protected UsersType users;
    @XmlAttribute(name = "Status")
    protected Integer status;
    @XmlAttribute(name = "Enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "ReadOnly")
    @XmlSchemaType(name = "anySimpleType")
    protected String readOnly;
    @XmlAttribute(name = "LastModified")
    protected String lastModified;
    @XmlAttribute(name = "Version")
    protected Integer version;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "ParentID")
    protected String parentID;
    @XmlAttribute(name = "LastRefreshed")
    protected String lastRefreshed;
    @XmlAttribute(name = "HierarchyID")
    protected String hierarchyID;

    /**
     * 获取corporateDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CorporateDetailsType }
     *     
     */
    public CorporateDetailsType getCorporateDetails() {
        return corporateDetails;
    }

    /**
     * 设置corporateDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateDetailsType }
     *     
     */
    public void setCorporateDetails(CorporateDetailsType value) {
        this.corporateDetails = value;
    }

    /**
     * Gets the value of the corporateNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateNode }
     * 
     * 
     */
    public List<CorporateNode> getCorporateNode() {
        if (corporateNode == null) {
            corporateNode = new ArrayList<CorporateNode>();
        }
        return this.corporateNode;
    }

    /**
     * 获取users属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UsersType }
     *     
     */
    public UsersType getUsers() {
        return users;
    }

    /**
     * 设置users属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UsersType }
     *     
     */
    public void setUsers(UsersType value) {
        this.users = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * 获取enabled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * 设置enabled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * 获取readOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadOnly() {
        return readOnly;
    }

    /**
     * 设置readOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadOnly(String value) {
        this.readOnly = value;
    }

    /**
     * 获取lastModified属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * 设置lastModified属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModified(String value) {
        this.lastModified = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * 获取parentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentID() {
        return parentID;
    }

    /**
     * 设置parentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentID(String value) {
        this.parentID = value;
    }

    /**
     * 获取lastRefreshed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRefreshed() {
        return lastRefreshed;
    }

    /**
     * 设置lastRefreshed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRefreshed(String value) {
        this.lastRefreshed = value;
    }

    /**
     * 获取hierarchyID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchyID() {
        return hierarchyID;
    }

    /**
     * 设置hierarchyID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchyID(String value) {
        this.hierarchyID = value;
    }

}
