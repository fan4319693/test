//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehicleProductDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleProductDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehAvail" type="{http://www.opentravel.org/OTA/2003/05}VehAvailType"/>
 *         &lt;element name="PricedEquips" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PricedEquip" type="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentPricedType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
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
@XmlType(name = "VehicleProductDetailsType", propOrder = {
    "vehAvail",
    "pricedEquips"
})
public class VehicleProductDetailsType {

    @XmlElement(name = "VehAvail", required = true)
    protected VehAvailType vehAvail;
    @XmlElement(name = "PricedEquips")
    protected VehicleProductDetailsType.PricedEquips pricedEquips;

    /**
     * 获取vehAvail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehAvailType }
     *     
     */
    public VehAvailType getVehAvail() {
        return vehAvail;
    }

    /**
     * 设置vehAvail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehAvailType }
     *     
     */
    public void setVehAvail(VehAvailType value) {
        this.vehAvail = value;
    }

    /**
     * 获取pricedEquips属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleProductDetailsType.PricedEquips }
     *     
     */
    public VehicleProductDetailsType.PricedEquips getPricedEquips() {
        return pricedEquips;
    }

    /**
     * 设置pricedEquips属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleProductDetailsType.PricedEquips }
     *     
     */
    public void setPricedEquips(VehicleProductDetailsType.PricedEquips value) {
        this.pricedEquips = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PricedEquip" type="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentPricedType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pricedEquip"
    })
    public static class PricedEquips {

        @XmlElement(name = "PricedEquip", required = true)
        protected List<VehicleEquipmentPricedType> pricedEquip;

        /**
         * Gets the value of the pricedEquip property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pricedEquip property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPricedEquip().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleEquipmentPricedType }
         * 
         * 
         */
        public List<VehicleEquipmentPricedType> getPricedEquip() {
            if (pricedEquip == null) {
                pricedEquip = new ArrayList<VehicleEquipmentPricedType>();
            }
            return this.pricedEquip;
        }

    }

}
