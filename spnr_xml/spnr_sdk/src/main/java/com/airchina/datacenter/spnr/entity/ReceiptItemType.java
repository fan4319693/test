//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of receipt eligibility information for a product.
 * 
 * <p>ReceiptItemType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReceiptItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ItineraryProductType">
 *       &lt;sequence>
 *         &lt;element name="IneligibleReasons" type="{http://www.opentravel.org/OTA/2003/05}IneligibleReasonsType" minOccurs="0"/>
 *         &lt;element name="MailServiceCharge" type="{http://www.opentravel.org/OTA/2003/05}MailServiceChargeType" minOccurs="0"/>
 *         &lt;element name="Policies" type="{http://www.opentravel.org/OTA/2003/05}PolicyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}ReceiptTypeEum" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptItemType", propOrder = {
    "ineligibleReasons",
    "mailServiceCharge",
    "policies"
})
public class ReceiptItemType
    extends ItineraryProductType
{

    @XmlElement(name = "IneligibleReasons")
    protected IneligibleReasonsType ineligibleReasons;
    @XmlElement(name = "MailServiceCharge")
    protected MailServiceChargeType mailServiceCharge;
    @XmlElement(name = "Policies")
    protected List<PolicyListType> policies;
    @XmlAttribute(name = "GroupID")
    protected String groupID;
    @XmlAttribute(name = "Type")
    protected ReceiptTypeEum type;

    /**
     * 获取ineligibleReasons属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IneligibleReasonsType }
     *     
     */
    public IneligibleReasonsType getIneligibleReasons() {
        return ineligibleReasons;
    }

    /**
     * 设置ineligibleReasons属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IneligibleReasonsType }
     *     
     */
    public void setIneligibleReasons(IneligibleReasonsType value) {
        this.ineligibleReasons = value;
    }

    /**
     * 获取mailServiceCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MailServiceChargeType }
     *     
     */
    public MailServiceChargeType getMailServiceCharge() {
        return mailServiceCharge;
    }

    /**
     * 设置mailServiceCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MailServiceChargeType }
     *     
     */
    public void setMailServiceCharge(MailServiceChargeType value) {
        this.mailServiceCharge = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyListType }
     * 
     * 
     */
    public List<PolicyListType> getPolicies() {
        if (policies == null) {
            policies = new ArrayList<PolicyListType>();
        }
        return this.policies;
    }

    /**
     * 获取groupID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * 设置groupID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReceiptTypeEum }
     *     
     */
    public ReceiptTypeEum getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptTypeEum }
     *     
     */
    public void setType(ReceiptTypeEum value) {
        this.type = value;
    }

}
