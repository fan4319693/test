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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The VehicleLocationInformationType complex type provides formatted textual information relating to the vehicle rental location.  The type of information is indicated.
 * 
 * <p>VehicleLocationInformationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
 *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationInformationType")
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.class
})
public class VehicleLocationInformationType
    extends FormattedTextType
{

    @XmlAttribute(name = "Type", required = true)
    protected String type;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
