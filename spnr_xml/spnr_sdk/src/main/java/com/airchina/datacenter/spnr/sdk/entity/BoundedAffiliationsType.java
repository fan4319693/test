//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines an entity that provides travel services or benefits to a customer or company.
 * 
 * <p>BoundedAffiliationsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BoundedAffiliationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}AffiliationsType">
 *       &lt;sequence>
 *         &lt;element name="Organization" type="{http://www.opentravel.org/OTA/2003/05}OrganizationType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Employer" type="{http://www.opentravel.org/OTA/2003/05}EmployerType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="TravelArranger" type="{http://www.opentravel.org/OTA/2003/05}TravelArrangerType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="TravelClub" type="{http://www.opentravel.org/OTA/2003/05}TravelClubType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Insurance" type="{http://www.opentravel.org/OTA/2003/05}InsuranceType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundedAffiliationsType")
public class BoundedAffiliationsType
    extends AffiliationsType
{


}
