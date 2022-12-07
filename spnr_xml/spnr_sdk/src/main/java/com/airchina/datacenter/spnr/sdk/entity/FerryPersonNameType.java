//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FerryPersonNameType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FerryPersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
 *       &lt;sequence>
 *         &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" minOccurs="0"/>
 *         &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}SimplifiedStringType"/>
 *         &lt;element name="MiddleName" type="{http://www.opentravel.org/OTA/2003/05}SimplifiedStringType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}SimplifiedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FerryPersonNameType")
public class FerryPersonNameType
    extends PersonNameType
{


}
