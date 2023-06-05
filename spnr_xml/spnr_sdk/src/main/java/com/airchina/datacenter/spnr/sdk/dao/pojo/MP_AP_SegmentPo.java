package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_SegmentPo </p>
 * <p>Description: 存储辅营产品的航段信息 </p>
 * <p>Sample: new MP_AP_SegmentPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_AP_SegmentPo {

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
     * 功能说明: OD在该MP内的唯一序列号
     * 最后修改时间: 2023/04/20
     */
    private Long odRph;

    /**
     * 功能说明: 航段RPH,SPNR内唯一序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 国内/国际
     * 最后修改时间: 2023/04/20
     */
    private String infoSource;

    /**
     * 功能说明: 更改类型
     * 最后修改时间: 2023/04/20
     */
    private String modType;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String flightNumber;

    /**
     * 功能说明: 原始航段RPH序号
     * 最后修改时间: 2023/04/20
     */
    private Long originalRph;

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
     * 功能说明: 航班出发时间
     * 最后修改时间: 2023/04/20
     */
    private String departureTime;

    /**
     * 功能说明: 航班原定出发时间
     * 最后修改时间: 2023/04/20
     */
    private String oriDepartureTime;

    /**
     * 功能说明: 航段到达时间
     * 最后修改时间: 2023/04/20
     */
    private String arrivalTime;

    /**
     * 功能说明: 航班号
     * 最后修改时间: 2023/04/20
     */
    private String marketingFlightNo;

    /**
     * 功能说明: 承运航班号
     * 最后修改时间: 2023/04/20
     */
    private String operatingFlightNo;

    /**
     * 功能说明: 联盟标识
     * 最后修改时间: 2023/04/20
     */
    private String singleVendorInd;

    /**
     * 功能说明: 舱等
     * 最后修改时间: 2023/04/20
     */
    private String cabinCode;

    /**
     * 功能说明: 预定舱位
     * 最后修改时间: 2023/04/20
     */
    private String subclass;

    /**
     * 功能说明: 航段主机状态:RR、NO、OPEN
     * 最后修改时间: 2023/04/20
     */
    private String status;

    /**
     * 功能说明: 航班飞行时间
     * 最后修改时间: 2023/04/20
     */
    private String duration;

    /**
     * 功能说明: 航程允许的剩余婴儿数量
     * 最后修改时间: 2023/04/20
     */
    private Long infantAvailQuantity;

    /**
     * 功能说明: 餐食代号
     * 最后修改时间: 2023/04/20
     */
    private String mealCode;

    /**
     * 功能说明: 分销系统航段类型,多用于国际
     * 最后修改时间: 2023/04/20
     */
    private String segmentType;

    /**
     * 功能说明: 是否占座限制
     * 最后修改时间: 2023/04/20
     */
    private String invControl;

    /**
     * 功能说明: 里程积累
     * 最后修改时间: 2023/04/20
     */
    private String mileage;

    /**
     * 功能说明: 经停次数
     * 最后修改时间: 2023/04/20
     */
    private Long stopQuantity;

    /**
     * 功能说明: 航班是否可进行预值机
     * 最后修改时间: 2023/04/20
     */
    private String preCheckin;

    /**
     * 功能说明: 是否是线上值机
     * 最后修改时间: 2023/04/20
     */
    private String onlineCheckin;

    /**
     * 功能说明: 机型
     * 最后修改时间: 2023/04/20
     */
    private String airEquipType;

    /**
     * 功能说明: 经停地代码
     * 最后修改时间: 2023/04/20
     */
    private String stopOver;

    /**
     * 功能说明: 经停机场
     * 最后修改时间: 2023/04/20
     */
    private String stoppoint;

    /**
     * 功能说明: 经停地点code类型
     * 最后修改时间: 2023/04/20
     */
    private String stopContext;

    /**
     * 功能说明: 经停时间
     * 最后修改时间: 2023/04/20
     */
    private String stopTime;

    /**
     * 功能说明: json数组,av_rph: AV序号;av_subclass:预订的子舱;av_subclass_quantity:子舱剩余数（不代表实时数值）;av_subclass_status: 子舱舱位开放状态
     * 最后修改时间: 2023/04/20
     */
    private String avInfo;

    /**
     * 功能说明: 航程类型
     * 最后修改时间: 2023/04/20
     */
    private String directionInd;

    /**
     * 功能说明: 是否缺口程
     * 最后修改时间: 2023/04/20
     */
    private String odOpenJaw;

    /**
     * 功能说明: 机票票号
     * 最后修改时间: 2023/04/20
     */
    private String eTicketNumber;

    /**
     * 功能说明: 机票状态
     * 最后修改时间: 2023/05/15
     */
    private String ticketingStatus;

    /**
     * 功能说明: 机票出票时间
     * 最后修改时间: 2023/05/15
     */
    private String ticketTime;

    /**
     * 功能说明: 标识识别码的上下文,例如 IATA、LocationId 或内部代码等。
     * 最后修改时间: 2023/04/20
     */
    private String dportContext;

    /**
     * 功能说明: 出发机场航站楼
     * 最后修改时间: 2023/04/20
     */
    private String dportTerminal;

    /**
     * 功能说明: 出发城市代码
     * 最后修改时间: 2023/04/20
     */
    private String dcity;

    /**
     * 功能说明: 出发机场国家码
     * 最后修改时间: 2023/04/20
     */
    private String dcountry;

    /**
     * 功能说明: 标识识别码的上下文,例如 IATA、ARC 或内部代码等。
     * 最后修改时间: 2023/04/20
     */
    private String aportContext;

    /**
     * 功能说明: 到达机场航站楼
     * 最后修改时间: 2023/04/20
     */
    private String aportTerminal;

    /**
     * 功能说明: 到达城市代码
     * 最后修改时间: 2023/04/20
     */
    private String acity;

    /**
     * 功能说明: 到达机场国家码
     * 最后修改时间: 2023/04/20
     */
    private String acountry;
}
