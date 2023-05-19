package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirPriceInfo_FareFamilyPo </p>
 * <p>Description: 存储MP的品牌权益信息 </p>
 * <p>Sample: new MP_AirPriceInfo_FareFamilyPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_AirPriceInfo_FareFamilyPo {

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
     * 功能说明: 儿童规则按Y运价
     * 最后修改时间: 2023/04/20
     */
    private String chdRuleAsYfare;

    /**
     * 功能说明: 舱等名
     * 最后修改时间: 2023/04/20
     */
    private String cabinName;

    /**
     * 功能说明: 改为Open票
     * 最后修改时间: 2023/04/20
     */
    private String changeToOpen;

    /**
     * 功能说明: 描述
     * 最后修改时间: 2023/04/20
     */
    private String description;

    /**
     * 功能说明: 国内自助checkin
     * 最后修改时间: 2023/04/20
     */
    private String domesticSelfCheckin;

    /**
     * 功能说明: 运价基础
     * 最后修改时间: 2023/04/20
     */
    private String fareBasis;

    /**
     * 功能说明: 婴儿规则按Y运价
     * 最后修改时间: 2023/04/20
     */
    private String infRuleAsYFare;

    /**
     * 功能说明: 国际自助checkin
     * 最后修改时间: 2023/04/20
     */
    private String intlSelfCheckin;

    /**
     * 功能说明: 是否可升舱
     * 最后修改时间: 2023/04/20
     */
    private String upgradable;

    /**
     * 功能说明: ？
     * 最后修改时间: 2023/04/20
     */
    private String userType;

    /**
     * 功能说明: ？
     * 最后修改时间: 2023/04/20
     */
    private String username;

    /**
     * 功能说明: 航班出发后变更的费率
     * 最后修改时间: 2023/04/20
     */
    private String changeAftDeptRate;

    /**
     * 功能说明: 航班出发前变更的费率
     * 最后修改时间: 2023/04/20
     */
    private String changeBefDeptRate;

    /**
     * 功能说明: 航班变更费对应的货币种类
     * 最后修改时间: 2023/04/20
     */
    private String changeCurrency;

    /**
     * 功能说明: 航班变更政策适用的旅客类型
     * 最后修改时间: 2023/04/20
     */
    private String changePsgType;

    /**
     * 功能说明: 航班变更费计算的时间偏移量（相对于出发）
     * 最后修改时间: 2023/04/20
     */
    private String changeTimeThreshold;

    /**
     * 功能说明: 航班变更费类型（百分比或数值）
     * 最后修改时间: 2023/04/20
     */
    private String changeType;

    /**
     * 功能说明: 变更自愿还是非自愿
     * 最后修改时间: 2023/04/20
     */
    private String changeVoluntary;

    /**
     * 功能说明: 变更政策适用的舱位
     * 最后修改时间: 2023/04/20
     */
    private String changePolicyCabin;

    /**
     * 功能说明: 航班起飞前区间起始时间
     * 最后修改时间: 2023/04/20
     */
    private String changeStarttime;

    /**
     * 功能说明: 航班起飞前区间结束时间
     * 最后修改时间: 2023/04/20
     */
    private String changeEndtime;

    /**
     * 功能说明: 改期政策RBD
     * 最后修改时间: 2023/04/20
     */
    private String changePolicyRbd;

    /**
     * 功能说明: 改期限制
     * 最后修改时间: 2023/04/20
     */
    private String changeLimit;

    /**
     * 功能说明: 航班出发后退的费率
     * 最后修改时间: 2023/04/20
     */
    private String refundAftDeptRate;

    /**
     * 功能说明: 航班出发前退的费率
     * 最后修改时间: 2023/04/20
     */
    private String refundBefDeptRate;

    /**
     * 功能说明: 退费的货币类型
     * 最后修改时间: 2023/04/20
     */
    private String refundCurrency;

    /**
     * 功能说明: 退改政策适用的旅客类型
     * 最后修改时间: 2023/04/20
     */
    private String refundPsgType;

    /**
     * 功能说明: 退费计算的时间偏移量（相对于航班出发时间）
     * 最后修改时间: 2023/04/20
     */
    private String refundTimeThreshold;

    /**
     * 功能说明: 退费类型（百分比或数值）
     * 最后修改时间: 2023/04/20
     */
    private String refundType;

    /**
     * 功能说明: 自愿非自愿标识
     * 最后修改时间: 2023/04/20
     */
    private String refundVoluntary;

    /**
     * 功能说明: 退改政策适用舱位
     * 最后修改时间: 2023/04/20
     */
    private String refundPolicyCabin;

    /**
     * 功能说明: 退票限制
     * 最后修改时间: 2023/04/20
     */
    private String refundLimit;

    /**
     * 功能说明: 退票乘客类型
     * 最后修改时间: 2023/04/20
     */
    private String refundEligible;

    /**
     * 功能说明: 退票ruleid
     * 最后修改时间: 2023/04/20
     */
    private String refundLoyaltyRefundRuleId;

    /**
     * 功能说明: 退票结束时间
     * 最后修改时间: 2023/04/20
     */
    private String refundEndtime;

    /**
     * 功能说明: 退票开始时间
     * 最后修改时间: 2023/04/20
     */
    private String refundStarttime;

    /**
     * 功能说明: 退票政策RBD
     * 最后修改时间: 2023/04/20
     */
    private String refundPolicyRbd;

    /**
     * 功能说明: 航段序号
     * 最后修改时间: 2023/05/11
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: OD序号
     * 最后修改时间: 2023/05/11
     */
    private Long odRph;
}