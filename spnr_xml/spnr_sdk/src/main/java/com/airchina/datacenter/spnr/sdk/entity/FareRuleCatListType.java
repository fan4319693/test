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
 * <p>FareRuleCatListType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FareRuleCatListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACC"/>
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="AGT"/>
 *     &lt;enumeration value="APP"/>
 *     &lt;enumeration value="BLA"/>
 *     &lt;enumeration value="BOC"/>
 *     &lt;enumeration value="CHD"/>
 *     &lt;enumeration value="CMB"/>
 *     &lt;enumeration value="COT"/>
 *     &lt;enumeration value="CTC"/>
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="DEP"/>
 *     &lt;enumeration value="DSC"/>
 *     &lt;enumeration value="END"/>
 *     &lt;enumeration value="EOE"/>
 *     &lt;enumeration value="EXD"/>
 *     &lt;enumeration value="FBR"/>
 *     &lt;enumeration value="FLT"/>
 *     &lt;enumeration value="GRP"/>
 *     &lt;enumeration value="HIP"/>
 *     &lt;enumeration value="ICT"/>
 *     &lt;enumeration value="LIS"/>
 *     &lt;enumeration value="MAX"/>
 *     &lt;enumeration value="MIN"/>
 *     &lt;enumeration value="MIS"/>
 *     &lt;enumeration value="NET"/>
 *     &lt;enumeration value="OPJ"/>
 *     &lt;enumeration value="ORE"/>
 *     &lt;enumeration value="OTH"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="REF"/>
 *     &lt;enumeration value="RER"/>
 *     &lt;enumeration value="RES"/>
 *     &lt;enumeration value="ROU"/>
 *     &lt;enumeration value="SEA"/>
 *     &lt;enumeration value="SPP"/>
 *     &lt;enumeration value="STP"/>
 *     &lt;enumeration value="SUR"/>
 *     &lt;enumeration value="TCO"/>
 *     &lt;enumeration value="TKT"/>
 *     &lt;enumeration value="TOU"/>
 *     &lt;enumeration value="TRF"/>
 *     &lt;enumeration value="TVL"/>
 *     &lt;enumeration value="VCT"/>
 *     &lt;enumeration value="VOL"/>
 *     &lt;enumeration value="WHO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareRuleCatListType")
@XmlEnum
public enum FareRuleCatListType {


    /**
     * ACC = ACCOMPANIED TRAVEL
     * 
     */
    ACC,

    /**
     * ADD = ADD-ONS
     * 
     */
    ADD,

    /**
     * AGT = AGENT DISCOUNTS
     * 
     */
    AGT,

    /**
     * APP = RULE APPLICATION
     * 
     */
    APP,

    /**
     * BLA = BLACKOUT DATES
     * 
     */
    BLA,

    /**
     * BOC = BOOKING CODE
     * 
     */
    BOC,

    /**
     * CHD = CHILDREN DISCOUNTS
     * 
     */
    CHD,

    /**
     * CMB = COMBINABILITY
     * 
     */
    CMB,

    /**
     * COT = CO-TERMINALS
     * 
     */
    COT,

    /**
     * CTC = CIRCLE TRIP COMBINABILITY
     * 
     */
    CTC,

    /**
     * DAY = DAY AND / OR TIME APPLICATION
     * 
     */
    DAY,

    /**
     * DEP = DEPOSITS
     * 
     */
    DEP,

    /**
     * DSC = ALL OTHER DISCOUNTS
     * 
     */
    DSC,

    /**
     * END = TICKET ENDORSEMENTS
     * 
     */
    END,

    /**
     * EOE = END ON END COMBINABILITY
     * 
     */
    EOE,

    /**
     * EXD = TRAVEL RESTRICTIONS (DEPRECATED, USE TVL INSTEAD)
     * 
     */
    EXD,

    /**
     * FBR = FARE BY RULE
     * 
     */
    FBR,

    /**
     * FLT = FLIGHT APPLICATION
     * 
     */
    FLT,

    /**
     * GRP = GROUPS
     * 
     */
    GRP,

    /**
     * HIP = HIGHER INTERMEDIATE POINT / MILEAGE EXCEPTIONS
     * 
     */
    HIP,

    /**
     * ICT = INTERNATIONAL CONSTRUCTION
     * 
     */
    ICT,

    /**
     * LIS = LIST ALL RESTRICTIONS
     * 
     */
    LIS,

    /**
     * MAX = MAXIMUM STAY
     * 
     */
    MAX,

    /**
     * MIN = MINIMUM STAY
     * 
     */
    MIN,

    /**
     * MIS = MISCELLANEOUS PROVISIONS
     * 
     */
    MIS,

    /**
     * NET = NEGOTIATED FARES
     * 
     */
    NET,

    /**
     * OPJ = OPEN JAW COMBINABILITY
     * 
     */
    OPJ,

    /**
     * ORE = OPEN RETURN
     * 
     */
    ORE,

    /**
     * OTH = OTHER
     * 
     */
    OTH,

    /**
     * PEN = PENALTIES
     * 
     */
    PEN,

    /**
     * REF = REFUNDS
     * 
     */
    REF,

    /**
     * RER = REROUTE
     * 
     */
    RER,

    /**
     * RES = ADVANCE RESERVATION / TICKETING RESTRICTIONS
     * 
     */
    RES,

    /**
     * ROU = ROUTINGS
     * 
     */
    ROU,

    /**
     * SEA = SEASONALITY
     * 
     */
    SEA,

    /**
     * SPP = SPECIAL PROVISIONS
     * 
     */
    SPP,

    /**
     * STP = STOPOVERS
     * 
     */
    STP,

    /**
     * SUR = SURCHARGES
     * 
     */
    SUR,

    /**
     * TCO = TOUR CONDUCTOR DISCOUNTS
     * 
     */
    TCO,

    /**
     * TKT = SALES RESTRICTIONS
     * 
     */
    TKT,

    /**
     * TOU = TOURS
     * 
     */
    TOU,

    /**
     * TRF = TRANSFERS
     * 
     */
    TRF,

    /**
     * TVL = TRAVEL RESTRICTIONS
     * 
     */
    TVL,

    /**
     * VCT = VISIT ANOTHER COUNTRY
     * 
     */
    VCT,

    /**
     * VOL = VOLUNTARY CHANGES
     * 
     */
    VOL,

    /**
     * WHO = ELIGIBILITY
     * 
     */
    WHO;

    public String value() {
        return name();
    }

    public static FareRuleCatListType fromValue(String v) {
        return valueOf(v);
    }

}
