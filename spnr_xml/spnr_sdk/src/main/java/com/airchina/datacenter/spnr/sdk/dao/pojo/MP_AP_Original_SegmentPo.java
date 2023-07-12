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
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_Original_SegmentPo </p>
 * <p>Description: 升舱类产品的原始舱位信息 </p>
 * <p>Sample: new MP_AP_Original_SegmentPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_AP_Original_SegmentPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/06/02
     */
    private String superPnrId;

    /**
     * 功能说明: 该SPNR内MP唯一序号
     * 最后修改时间: 2023/06/02
     */
    private Long productNumber;

    /**
     * 功能说明: 订单内航段的唯一标识
     * 最后修改时间: 2023/06/02
     */
    private String flightSegmentRph;

    /**
     * 功能说明: 国内/国际
     * 最后修改时间: 2023/06/02
     */
    private String infoSource;


    /**
     * 功能说明: 改签类型
     * 最后修改时间: 2023/06/02
     */
    private String modType;

    /**
     * 功能说明: 原始航段RPH序号
     * 最后修改时间: 2023/06/02
     */
    private String originalRph;

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
     * 功能说明: 出发机场三字码
     * 最后修改时间: 2023/04/20
     */
    private String dport;

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
     * 功能说明: 到达机场三字码
     * 最后修改时间: 2023/04/20
     */
    private String aport;

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
