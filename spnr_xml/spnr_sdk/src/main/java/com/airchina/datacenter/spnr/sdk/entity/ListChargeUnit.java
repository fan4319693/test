//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Use: This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" enumeration in combination with the Code Extension fields to exchange a value that is not in the list and is known to your trading partners.
 * 
 * <p>List_ChargeUnit complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="List_ChargeUnit">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_ChargeUnit_Base">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List_ChargeUnit", propOrder = {
    "value"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.CodeListFeeType.Qualifiers.ChargeUnit.Unit.class,
    com.airchina.datacenter.spnr.sdk.entity.CodeListFeeType.Taxes.Qualifiers.ChargeUnit.Unit.class
})
public class ListChargeUnit {

    @XmlValue
    protected ListChargeUnitBase value;

    /**
     * Source: Charge Type (CHG) OpenTravel codelist.
     * 
     * @return
     *     possible object is
     *     {@link ListChargeUnitBase }
     *     
     */
    public ListChargeUnitBase getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ListChargeUnitBase }
     *     
     */
    public void setValue(ListChargeUnitBase value) {
        this.value = value;
    }

}
