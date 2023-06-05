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
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_HotelPo </p>
 * <p>Description: 存储中转酒店 </p>
 * <p>Sample: new MP_HotelPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_Hotel_GuestPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/06/02
     */
    private String superPnrId;

    /**
     * 功能说明: 最终用户进行的搜索的 ID的唯一标识。
     * 最后修改时间: 2023/06/02
     */
    private String searchId;

    /**
     * 功能说明: 该SPNR内MP唯一序号
     * 最后修改时间: 2023/06/02
     */
    private Long productNumber;

    /**
     * 功能说明: 订单内旅客的唯一序号
     * 最后修改时间: 2023/06/02
     */
    private Long ojSuperPnrRph;

    /**
     * 功能说明: 旅客的年龄范围，如Chind,Adult等
     * 最后修改时间: 2023/06/02
     */
    private String ageCode;

    /**
     * 功能说明: 标识旅客是否VIP
     * 最后修改时间: 2023/06/02
     */
    private String vip;

    /**
     * 功能说明: 到店时间
     * 最后修改时间: 2023/06/02
     */
    private String arrivalTimestamp;

    /**
     * 功能说明: 离店时间
     * 最后修改时间: 2023/06/02
     */
    private String departmentTimestamp;

    /**
     * 功能说明: 顾客序号
     * 最后修改时间: 2023/06/02
     */
    private Long rph;
}