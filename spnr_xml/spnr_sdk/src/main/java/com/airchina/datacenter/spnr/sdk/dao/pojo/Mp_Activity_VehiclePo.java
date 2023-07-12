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
 * <p>Description: 存储保险和专车接送涉及到的机票信息 </p>
 * <p>Sample: new Mp_Hotel_Air_TicketingPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class Mp_Activity_VehiclePo {
    /**
     * 功能说明: SPNR ID，唯一标识
     * 最后修改时间: 2023/06/02
     */
    private String superPnrId;


    /**
     * 功能说明: 最终用户进行的搜索的 ID的唯一标识。
     * 最后修改时间: 2023/06/02
     */
    private Long productNumber;

    /**
     * 功能说明: 最终用户进行的搜索的 ID的唯一标识。
     * 最后修改时间: 2023/06/02
     */
    private String itemCode;

    /**
     * 功能说明: 车型编码
     * 最后修改时间: 2023/06/02
     */
    private  String vehicleCode;

    /**
     * 功能说明: 服务品牌
     * 最后修改时间: 2023/06/02
     */
    private  String vehicleModelGroup;

    /**
     * 功能说明: 服务车型
     * 最后修改时间: 2023/06/02
     */
    private  String vehicleModelName;

    /**
     * 功能说明: 车牌号
     * 最后修改时间: 2023/06/02
     */
    private  String vehicleModelIdentity;

    /**
     * 功能说明: 申请车品牌
     * 最后修改时间: 2023/06/02
     */
    private  String applyVehicleModelGroup;

    /**
     * 功能说明: 申请车型
     * 最后修改时间: 2023/06/02
     */
    private  String applyVehicleModelName;
}