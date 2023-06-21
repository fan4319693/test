package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirPriceInfo_FareInfosPo </p>
 * <p>Description: 存储MP中每个航段的详细运价、退改签等信息 </p>
 * <p>Sample: new MP_AirPriceInfo_FareInfosPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_AirPriceInfo_FareInfosPo implements Cloneable{

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 最终用户进行的搜索的 ID的唯一标识。
     * 最后修改时间: 2023/04/20
     */
    private String searchId;

    /**
     * 功能说明: 该SPNR内MP唯一序号
     * 最后修改时间: 2023/04/20
     */
    private Long productNumber;

    /**
     * 功能说明: PNR号
     * 最后修改时间: 2023/04/20
     */
    private String pnr;

    /**
     * 功能说明: 待核实
     * 最后修改时间: 2023/04/20
     */
    private String ticketDesignatorCode;

    /**
     * 功能说明: 航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: OD序号
     * 最后修改时间: 2023/04/20
     */
    private Long odRph;

    /**
     * 功能说明: 舱等
     * 最后修改时间: 2023/04/20
     */
    private String cabinCode;

    /**
     * 功能说明: 子舱
     * 最后修改时间: 2023/04/20
     */
    private String subclass;

    /**
     * 功能说明: 通过公司代码标识公司
     * 最后修改时间: 2023/04/20
     */
    private String filingAirlineCode;

    /**
     * 功能说明: 出发机场三字码
     * 最后修改时间: 2023/04/20
     */
    private String dport;

    /**
     * 功能说明: 到达机场三字码
     * 最后修改时间: 2023/04/20
     */
    private String aport;

    /**
     * 功能说明: 运价基础
     * 最后修改时间: 2023/04/20
     */
    private String fareBasis;

    /**
     * 功能说明: 底价扣率
     * 最后修改时间: 2023/04/20
     */
    private String disCount;

    /**
     * 功能说明: 用来记录一体运价拆分分组信息,如果为tue,则票价组件的全价包含在此段/pax类型FareInfo中。通常,它会在Fare组件的第一个段中被设置为true。
     * 最后修改时间: 2023/04/20
     */
    private String fcPriceInd;

    /**
     * 功能说明: 用来记录一体运价拆分分组信息,票价组件可以包含1个或多个分段(每个pax类型)。该RPH表示FareInfo所属的段/pax类型的票价组件。
     * 最后修改时间: 2023/04/20
     */
    private Long fcRph;

    /**
     * 功能说明: 原始运价价钱,用于记录当运价发布使用外币而询价使用CNY时的外币金额及币种信息
     * 最后修改时间: 2023/04/20
     */
    private String origPubAmt;

    /**
     * 功能说明: 原始运价价钱,用于记录当运价发布使用外币而询价使用CNY时的外币金额及币种信息的单位
     * 最后修改时间: 2023/04/20
     */
    private String origPubCurrencyCode;

    /**
     * 功能说明: 此规则的票价的票价基础代码。 它可以是空的
     * 最后修改时间: 2023/04/20
     */
    private String fareBasisCode;

    /**
     * 功能说明: 不含税价格
     * 最后修改时间: 2023/04/20
     */
    private String baseAmt;

    /**
     * 功能说明: 不含税价格的单位
     * 最后修改时间: 2023/04/20
     */
    private String baseCurrencyCode;

    /**
     * 功能说明: 价差
     * 最后修改时间: 2023/04/20
     */
    private String differFare;

    /**
     * 功能说明: 价格类型
     * 最后修改时间: 2023/04/20
     */
    private String priceType;

    /**
     * 功能说明: 变更金额
     * 最后修改时间: 2023/04/20
     */
    private String reissueAmt;

    /**
     * 功能说明: 变更费用
     * 最后修改时间: 2023/04/20
     */
    private String reissueFee;

    /**
     * 功能说明: 税收总价
     * 最后修改时间: 2023/04/20
     */
    private String taxesAmt;

    /**
     * 功能说明: 总价格
     * 最后修改时间: 2023/04/20
     */
    private String totalFare;

    /**
     * 功能说明: 机建费用
     * 最后修改时间: 2023/04/24
     */
    private String taxAirportFee;

    /**
     * 功能说明: 燃油费用
     * 最后修改时间: 2023/04/24
     */
    private String taxFuelFee;

    /**
     * 功能说明: 机建费用的单位
     * 最后修改时间: 2023/04/24
     */
    private String taxAirportCurrencyCode;

    /**
     * 功能说明: 燃油费用的单位
     * 最后修改时间: 2023/04/24
     */
    private String taxFuelCurrencyCode;

    /**
     * 功能说明: 税收详情
     * 最后修改时间: 2023/04/20
     */
    private String taxDetails;

    /**
     * 功能说明: 乘客子类型（如军警残旅客）
     * 最后修改时间: 2023/04/20
     */
    private String ptcSubType;

    /**
     * 功能说明: PTC乘客资质
     * 最后修改时间: 2023/04/20
     */
    private String ptcPsgType;

    /**
     * 功能说明: PTC数量
     * 最后修改时间: 2023/04/20
     */
    private Long ptcQuantity;

    /**
     * 功能说明: 市场最低价
     * 最后修改时间: 2023/04/20
     */
    private String lowestFare;

    /**
     * 功能说明: 市场最低价子舱
     * 最后修改时间: 2023/04/20
     */
    private String lowestFareSubclass;

    /**
     * 功能说明: 忠诚度单位的数量
     * 最后修改时间: 2023/04/20
     */
    private String earnQuantity;

    /**
     * 功能说明: 与此票价关联的票价系列代码
     * 最后修改时间: 2023/04/20
     */
    private String fareFamilyCode;

    /**
     * 功能说明: 主机返回的运价名
     * 最后修改时间: 2023/04/20
     */
    private String fareFamilyName;

    /**
     * 功能说明: 用于定义显示顺序
     * 最后修改时间: 2023/04/20
     */
    private String addOnSort;

    /**
     * 功能说明: Addon的额外信息描述
     * 最后修改时间: 2023/04/20
     */
    private String addOnSortName;

    /**
     * 功能说明: 语言字符集
     * 最后修改时间: 2023/04/20
     */
    private String addOnCharSet;

    /**
     * 功能说明: 以竖线分隔的字符串, 每个片段包含4个字段,
     *  格式 surchargeAmt: surchargeCode @ surchargeCode: surchargeNucAmt
     *  例 amount:22@code:Q|amount:32@code:Q
     * 最后修改时间: 2023/06/21
     */
    private String surchargeInfo;

}