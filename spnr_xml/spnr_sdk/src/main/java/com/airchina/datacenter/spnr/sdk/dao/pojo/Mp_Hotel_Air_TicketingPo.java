/*
 * File Name: Mp_Hotel_Air_Ticketing
 * Version: 1.0
 * Last Modified Time: 2023-06-02 13:48
 */
/*
 * Copyright @ 2013 Airchina.
 * All right reserved.
 */
package com.airchina.datacenter.spnr.sdk.dao.pojo;

import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Mp_Hotel_Air_TicketingPo </p>
 * <p>Description: 存储MP行程单信息 </p>
 * <p>Sample: new Mp_Hotel_Air_TicketingPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class Mp_Hotel_Air_TicketingPo {
    /**
     * 功能说明: SPNR ID，唯一标识
     * 最后修改时间: 2023/06/02
     */
    private String superPnrId;

    /**
     * 功能说明: 最终用户进行的搜索的 ID的唯一标识。
     * 最后修改时间: 2023/06/02
     */
    private String searchId;

    /**
     * 功能说明: 最终用户进行的搜索的 ID的唯一标识。
     * 最后修改时间: 2023/06/02
     */
    private Long productNumber;

    /**
     * 功能说明: PNR号
     * 最后修改时间: 2023/06/02
     */
    private String pnr;

    /**
     * 功能说明: 航段序号，唯一值，不变
     * 最后修改时间: 2023/06/02
     */
    private String flightSegmentRefNumber;


    /**
     * 功能说明: 出票票台
     * 最后修改时间: 2023/06/02
     */
    private String issuingAgentId;


    /**
     * 功能说明: 是否出票
     * 最后修改时间: 2023/06/02
     */
    private String printed;

    /**
     * 功能说明: T出票时间，取自主机时间
     * 最后修改时间: 2023/06/02
     */
    private String ticketTimestamp;

    /**
     * 功能说明: 主机票面状态：OPEN FOR USE , REFUND, EXCHANGE, VOID, USED/FLOWN等
     * 最后修改时间: 2023/06/02
     */
    private String ticketingStatus;

    /**
     * 功能说明: 旅客在该MP内的序号，非@OJ_SuperPNR_RPH，两者不一定相等
     * 最后修改时间: 2023/06/02
     */
    private String travelerRefNumber;

    /**
     * 功能说明: 票号
     * 最后修改时间: 2023/06/02
     */
    private String eTicketNumber;

    /**
     * 功能说明: 最晚出票时间
     * 最后修改时间: 2023/06/02
     */
    private String ticketTimeLimitTimestamp;

    /**
     * 功能说明: 记录客票有效期
     * 最后修改时间: 2023/06/02
     */
    private String expiryDateTimestamp;

    /**
     * 功能说明: OD在该MP内的唯一序列号
     * 最后修改时间: 2023/06/02
     */
    private String odRph;

    /**
     * 功能说明: 航段RPH，SPNR内唯一序号
     * 最后修改时间: 2023/06/02
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 国内/国际
     * 最后修改时间: 2023/06/02
     */
    private String infoSource;

    /**
     * 功能说明: 更改类型
     * 最后修改时间: 2023/06/02
     */
    private String modType;

    /**
     * 功能说明: 原始航段RPH序号
     * 最后修改时间: 2023/06/02
     */
    private String originalRph;

    /**
     * 功能说明: 出发机场三字码
     * 最后修改时间: 2023/06/02
     */
    private String dport;

    /**
     * 功能说明: 标识识别码的上下文，例如 IATA、LocationId 或内部代码等。
     * 最后修改时间: 2023/06/02
     */
    private String dportContext;

    /**
     * 功能说明: 出发机场航站楼
     * 最后修改时间: 2023/06/02
     */
    private String dportTerminal;

    /**
     * 功能说明: 出发城市代码
     * 最后修改时间: 2023/06/02
     */
    private String dcity;

    /**
     * 功能说明: 出发机场国家码
     * 最后修改时间: 2023/06/02
     */
    private String dcountry;

    /**
     * 功能说明: 到达机场三字码
     * 最后修改时间: 2023/06/02
     */
    private String aport;

    /**
     * 功能说明: 标识识别码的上下文，例如 IATA、ARC 或内部代码等。
     * 最后修改时间: 2023/06/02
     */
    private String aportContext;

    /**
     * 功能说明: 到达机场航站楼
     * 最后修改时间: 2023/06/02
     */
    private String aportTerminal;

    /**
     * 功能说明: 到达城市代码
     * 最后修改时间: 2023/06/02
     */
    private String acity;

    /**
     * 功能说明: 到达机场国家码
     * 最后修改时间: 2023/06/02
     */
    private String acountry;

    /**
     * 功能说明: 航班出发时间
     * 最后修改时间: 2023/06/02
     */
    private String departureTimestamp;

    /**
     * 功能说明: 航班原定出发时间
     * 最后修改时间: 2023/06/02
     */
    private String oriDepartureTimestamp;

    /**
     * 功能说明: 航段到达时间
     * 最后修改时间: 2023/06/02
     */
    private String arrivalTimestamp;

    /**
     * 功能说明: 航班号
     * 最后修改时间: 2023/06/02
     */
    private String marketingFlightNo;

    /**
     * 功能说明: 承运航班号
     * 最后修改时间: 2023/06/02
     */
    private String operatingFlightNo;

    /**
     * 功能说明: 联盟标识
     * 最后修改时间: 2023/06/02
     */
    private String singleVendorInd;

    /**
     * 功能说明: 舱等
     * 最后修改时间: 2023/06/02
     */
    private String cabinCode;

    /**
     * 功能说明: 预定舱位
     * 最后修改时间: 2023/06/02
     */
    private String subclass;

    /**
     * 功能说明: 里程积累
     * 最后修改时间: 2023/06/02
     */
    private String mileage;

    /**
     * 功能说明: 航班是否可进行预值机
     * 最后修改时间: 2023/06/02
     */
    private String preCheckin;

    /**
     * 功能说明: 是否是线上值机
     * 最后修改时间: 2023/06/02
     */
    private String onlineCheckin;

    /**
     * 功能说明: 机型
     * 最后修改时间: 2023/06/02
     */
    private String airEquipType;

    /**
     * 功能说明: 旅客在SPNR内唯一序列号
     * 最后修改时间: 2023/06/02
     */
    private String ojSuperPnrRph;


    /**
     * 功能说明: 旅客类型
     * 最后修改时间: 2023/06/02
     */
    private String passengerTypeCode;

    /**
     * 功能说明: 乘客子类型，如军警残等
     * 最后修改时间: 2023/06/02
     */
    private String ptcSubType;


    /**
     * 功能说明: 乘机人姓名
     * 最后修改时间: 2023/06/02
     */
    private String travelerName;


    /**
     * 功能说明: 乘机人电话
     * 最后修改时间: 2023/06/02
     */
    private String telephone;

    /**
     * 功能说明: 证件号码
     * 最后修改时间: 2023/06/02
     */
    private String docId;

    /**
     * 功能说明: 证件类型
     * 最后修改时间: 2023/06/02
     */
    private Long docType;

    /**
     * 功能说明: 邮箱
     * 最后修改时间: 2023/06/02
     */
    private String email;

    /**
     * 功能说明: 城市姓名
     * 最后修改时间: 2023/06/02
     */
    private String cityName;

    /**
     * 功能说明: 州代码、省代码
     * 最后修改时间: 2023/06/02
     */
    private String stateCode;

    /**
     * 功能说明: 所在地邮编
     * 最后修改时间: 2023/06/02
     */
    private String postalCode;

    /**
     * 功能说明: 所在地国家码
     * 最后修改时间: 2023/06/02
     */
    private String countryName;

    /**
     * 功能说明: 常客卡号
     * 最后修改时间: 2023/06/02
     */
    private String membershipId;

    /**
     * 功能说明: 常客卡状态
     * 最后修改时间: 2023/06/02
     */
    private String status;

    /**
     * 功能说明: 常客价值（VIP等）
     * 最后修改时间: 2023/06/02
     */
    private String customerValue;

    /**
     * 功能说明: 常客等级
     * 最后修改时间: 2023/06/02
     */
    private String loyalLevel;
}