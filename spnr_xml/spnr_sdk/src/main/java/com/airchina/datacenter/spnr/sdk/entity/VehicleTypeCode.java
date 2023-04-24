//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehicleTypeCode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleTypeCode">
 *   &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to8">
 *     &lt;enumeration value="BIC"/>
 *     &lt;enumeration value="CAR"/>
 *     &lt;enumeration value="CMB"/>
 *     &lt;enumeration value="CMP"/>
 *     &lt;enumeration value="COA"/>
 *     &lt;enumeration value="COM"/>
 *     &lt;enumeration value="CRB"/>
 *     &lt;enumeration value="MBB"/>
 *     &lt;enumeration value="MBS"/>
 *     &lt;enumeration value="MPV"/>
 *     &lt;enumeration value="MTC"/>
 *     &lt;enumeration value="RHV"/>
 *     &lt;enumeration value="SHC"/>
 *     &lt;enumeration value="SLV"/>
 *     &lt;enumeration value="VAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleTypeCode")
@XmlEnum
public enum VehicleTypeCode {


    /**
     * Bicycle
     * 
     */
    BIC,

    /**
     * Car
     * 
     */
    CAR,

    /**
     * Camper with rear-mounted bicycle carrier 
     * 
     */
    CMB,

    /**
     * Camper 
     * 
     */
    CMP,

    /**
     * Coach 
     * 
     */
    COA,

    /**
     * Motorcycle and sidecar combination 
     * 
     */
    COM,

    /**
     * Car with rear-mounted bicycle carrier 
     * 
     */
    CRB,

    /**
     * Minibus with rear-mounted bicycle carrier 
     * 
     */
    MBB,

    /**
     * Minibus 
     * 
     */
    MBS,

    /**
     * Multi-passenger vehicle For example an Espace
     * 
     */
    MPV,

    /**
     * Motorcycle 
     * 
     */
    MTC,

    /**
     * Road haulage vehicle 
     * 
     */
    RHV,

    /**
     * Short car For example a "Smart" car. 
     * 
     */
    SHC,

    /**
     * Sports leisure vehicle For example 4x4 vehicles
     * 
     */
    SLV,

    /**
     * Van
     * 
     */
    VAN;

    public String value() {
        return name();
    }

    public static VehicleTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
