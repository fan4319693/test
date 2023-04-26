package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirAirItineraryPo </p>
 * <p>Description: 存储了MP内所有行程的信息 </p>
 * <p>Sample: new MP_AirAirItineraryPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_AirAirItineraryPo {

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
     * 功能说明: 行程类型
     * 最后修改时间: 2023/04/20
     */
    private String directionInd;

    /**
     * 功能说明: 确定此行程是否需要 API/TSA 信息
     * 最后修改时间: 2023/04/20
     */
    private String docRequired;

    /**
     * 功能说明: OD在该MP内的唯一序列号
     * 最后修改时间: 2023/04/20
     */
    private Long odRph;

    /**
     * 功能说明: OD航司两字码
     * 最后修改时间: 2023/04/20
     */
    private String odMajorityCarrier;

    /**
     * 功能说明: 供应商
     * 最后修改时间: 2023/04/20
     */
    private String bookingChannel;

    /**
     * 功能说明: OD缺口程判断标志
     * 最后修改时间: 2023/04/20
     */
    private String odOpenjaw;

    /**
     * 功能说明: OD航程时间
     * 最后修改时间: 2023/04/20
     */
    private String odDuration;

    /**
     * 功能说明: OD航程允许的剩余婴儿数量
     * 最后修改时间: 2023/04/20
     */
    private Long infantAvailQuantity;

    /**
     * 功能说明: 通程航班虚拟航班号（特殊需求）
     * 最后修改时间: 2023/04/20
     */
    private String marketingFlightNum;

}