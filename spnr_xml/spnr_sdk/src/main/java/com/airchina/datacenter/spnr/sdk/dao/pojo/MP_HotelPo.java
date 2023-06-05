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
public class MP_HotelPo {

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
     * 功能说明: 序号
     * 最后修改时间: 2023/06/02
     */
    private Long roomStayRph;


    /**
     * 功能说明:来源渠道
     * 最后修改时间: 2023/06/02
     */
    private String sourceOfBusiness;

    /**
     * 功能说明:  酒店的code值
     * 最后修改时间: 2023/06/02
     */
    private String hotelCode;

    /**
     * 功能说明: 酒店的名称
     * 最后修改时间: 2023/06/02
     */
    private String hotelName;

    /**
     * 功能说明: 酒店的类型
     * 最后修改时间: 2023/06/02
     */
    private String stayType;

    /**
     * 功能说明: 酒店所处城市
     * 最后修改时间: 2023/06/02
     */
    private String hotelCityCode;

    /**
     * 功能说明: 酒店所处区域的时区
     * 最后修改时间: 2023/06/02
     */
    private String timeZone;

    /**
     * 功能说明: 入住时间
     * 最后修改时间: 2023/06/02
     */
    private String checkInTime;

    /**
     * 功能说明: 退房时间
     * 最后修改时间: 2023/06/02
     */
    private String CheckOutTime;

    /**
     * 功能说明: 酒店电话
     * 最后修改时间: 2023/06/02
     */
    private String hotelTelephone;
}
