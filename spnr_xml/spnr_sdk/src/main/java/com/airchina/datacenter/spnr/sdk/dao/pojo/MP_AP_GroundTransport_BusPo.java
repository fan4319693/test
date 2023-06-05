/*
 * File Name: MP_AP_GroundTransportPo
 * Version: 1.0
 * Last Modified Time: 2023-03-07 16:06
 */
/*
 * Copyright @ 2013 Airchina.
 * All right reserved.
 */
package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_GroundTransportPo </p>
 * <p>Description: 存储辅营空巴联运信息 </p>
 * <p>Sample: new MP_AP_GroundTransport_BusPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_AP_GroundTransport_BusPo {

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
     * 功能说明: 辅营产品对应机票的航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 旅客在SPNR内唯一标识序号
     * 最后修改时间: 2023/04/20
     */
    private Long travelerRph;

    /**
     * 功能说明: 航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long rph;

    /**
     * 功能说明: 轨交出发站点类型
     * 最后修改时间: 2023/04/20
     */
    private String dStationType;

    /**
     * 功能说明: 轨交出发站点代号
     * 最后修改时间: 2023/04/20
     */
    private String dStationCode;

    /**
     * 功能说明: 轨交出发站点名称
     * 最后修改时间: 2023/04/20
     */
    private String dStationName;

    /**
     * 功能说明: 轨交到达站点类型
     * 最后修改时间: 2023/04/20
     */
    private String aStationType;

    /**
     * 功能说明: 轨交到达站点代号
     * 最后修改时间: 2023/04/20
     */
    private String aStationCode;

    /**
     * 功能说明: 轨交到达站点名称
     * 最后修改时间: 2023/04/20
     */
    private String aStationName;

    /**
     * 功能说明: 轨交有效期开始日期
     * 最后修改时间: 2023/04/20
     */
    private String startPeriod;

    /**
     * 功能说明: 轨交有效期截止日期
     * 最后修改时间: 2023/04/20
     */
    private String endPeriod;

    /**
     * 功能说明: 座位类型,如坐铺、卧铺等
     * 最后修改时间: 2023/04/20
     */
    private String seatType;

    /**
     * 功能说明: 席位类别,如头等、二等
     * 最后修改时间: 2023/04/20
     */
    private String clazz;

    /**
     * 功能说明: 总价
     * 最后修改时间: 2023/04/25
     */
    private String totalFareAmount;

    /**
     * 功能说明: 总价的单位
     * 最后修改时间: 2023/04/25
     */
    private String totalFareCurrencyCode;

    /**
     * 功能说明: 成本价格
     * 最后修改时间: 2023/04/20
     */
    private String basicFareAmount;

    /**
     * 功能说明: 成本价格的单位
     * 最后修改时间: 2023/04/20
     */
    private String basicFareCurrencyCode;

    /**
     * 功能说明: 公交的运行规则
     * 最后修改时间: 2023/04/20
     */
    private String duration;
}
