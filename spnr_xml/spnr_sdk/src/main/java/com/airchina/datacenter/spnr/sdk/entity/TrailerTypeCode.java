//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TrailerTypeCode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TrailerTypeCode">
 *   &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to8">
 *     &lt;enumeration value="BGT"/>
 *     &lt;enumeration value="BTT"/>
 *     &lt;enumeration value="COT"/>
 *     &lt;enumeration value="CRV"/>
 *     &lt;enumeration value="FVT"/>
 *     &lt;enumeration value="GLT"/>
 *     &lt;enumeration value="MBT"/>
 *     &lt;enumeration value="TRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrailerTypeCode")
@XmlEnum
public enum TrailerTypeCode {


    /**
     * Baggage Trailer 
     * 
     */
    BGT,

    /**
     * Boat trailer
     * 
     * 
     */
    BTT,

    /**
     * Coach trailer
     * 
     * 
     */
    COT,

    /**
     * Caravan 
     * 
     */
    CRV,

    /**
     *  Freight vehicle trailer 
     * 
     */
    FVT,

    /**
     * Glider trailer 
     * 
     */
    GLT,

    /**
     * Minibus trailer 
     * 
     */
    MBT,

    /**
     * Trailer tent 
     * 
     */
    TRT;

    public String value() {
        return name();
    }

    public static TrailerTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
