//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ServicePriceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OfferID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "offerID"
})
@XmlRootElement(name = "ServicePrice")
public class ServicePrice
    extends ServicePriceType
{

    @XmlElement(name = "OfferID")
    protected OfferID offerID;

    /**
     * Unique PRICED Offer ID.
     * 									Example: 0981267543AQ
     * 
     * 									=notes=
     * 									1. This is a unique ID provided by the airline for a PRICED OFFER that may include Branded Fare(s); Ancillary Services(s); and/ or Ancillary Service Bundle(s).
     * 
     * 									2. This unique ID is limited to a maximum of 30 alphanumeric characters, so to ensure uniqueness between airlines in a multi-supplier scenario, it is recommended that the @Source attribute be used to identify the offering airline designator.
     * 
     * @return
     *     possible object is
     *     {@link OfferID }
     *     
     */
    public OfferID getOfferID() {
        return offerID;
    }

    /**
     * 设置offerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OfferID }
     *     
     */
    public void setOfferID(OfferID value) {
        this.offerID = value;
    }

}
