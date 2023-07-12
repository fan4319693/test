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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Textual information to provide descriptions and/or additional information.
 * 
 * <p>FreeTextType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FreeTextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LanguageGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeTextType", propOrder = {
    "value"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.TicketingFullInfoType.Endorsements.Endorsement.class,
    CertificationType.class,
    com.airchina.datacenter.spnr.entity.FareQuoteInfoType.Endorsements.Endorsement.class,
    com.airchina.datacenter.spnr.entity.FareCodeOptionType.FareRemark.class,
    ErrorType.class,
    SPNRWarningType.class,
    com.airchina.datacenter.spnr.entity.TicketingInfoType.CheckInInfo.Notes.Note.class,
    com.airchina.datacenter.spnr.entity.PricedItineraryType.Notes.Note.class,
    CommissionInfoType.class,
    com.airchina.datacenter.spnr.entity.IndCoverageReqsType.PreexistingConditions.PreexistingCondition.class,
    com.airchina.datacenter.spnr.entity.PTCFareBreakdownType.Endorsements.Endorsement.class,
    com.airchina.datacenter.spnr.entity.AirReservationType.SupplierNotes.Note.class,
    com.airchina.datacenter.spnr.entity.InvoiceApplyType.Remark.class,
    WarningType.class,
    com.airchina.datacenter.spnr.entity.BookFlightSegmentType.Comment.class,
    com.airchina.datacenter.spnr.entity.FlightDetailsType.FlightLegInfo.Comment.class
})
public class FreeTextType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlAttribute(name = "CharSet")
    protected String charSet;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取language属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置language属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * 获取charSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharSet() {
        return charSet;
    }

    /**
     * 设置charSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharSet(String value) {
        this.charSet = value;
    }

}
