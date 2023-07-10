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
public class Mp_ActivityPo {
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
     * 功能说明：产品编码
     * 最后修改时间：2023/7/10
     */
    private String productCode;

    /**
     * 功能说明：产品名称
     * 最后修改时间：2023/7/10
     */
    private String productName;

    /**
     * 功能说明：产品ID
     * 最后修改时间：2023/7/10
     */
    private String productId;

    /**
     * 功能说明：币种
     * 最后修改时间：2023/7/10
     */
    private String currencyCode;

    /**
     * 功能说明：服务城市机场
     * 最后修改时间：2023/7/10
     */
    private String airport;

    /**
     * 功能说明：库存控制，默认false即可
     * 最后修改时间：2023/7/10
     */
    private Boolean isInventoryControl;

    /**
     * 功能说明：是否包含税，默认false即可
     * 最后修改时间：2023/7/10
     */
    private Boolean isTaxIncluded;

    /**
     * 功能说明：目的地活动的类别，默认0即可
     * 最后修改时间：2023/7/10
     */
    private String desItemType;

    /**
     * 功能说明：出发地的城区区号
     * 最后修改时间：2023/7/10
     */
    private String depCity;

    /**
     * 功能说明：出发地的经度
     * 最后修改时间：2023/7/10
     */
    private String depLatitude;

    /**
     * 功能说明：出发地的纬度
     * 最后修改时间：2023/7/10
     */
    private String depLongitude;

    /**
     * 功能说明：出发地的详细地址
     * 最后修改时间：2023/7/10
     */
    private String depAddress;

    /**
     * 功能说明：到达地的城市
     * 最后修改时间：2023/7/10
     */
    private String arrCity;

    /**
     * 功能说明：到达地的经度
     * 最后修改时间：2023/7/10
     */
    private String arrLatitude;
    /**
     * 功能说明：到达地的纬度
     * 最后修改时间：2023/7/10
     */
    private String arrLongitude;

    /**
     * 功能说明：到达地的详细地址
     * 最后修改时间：2023/7/10
     */
    private String arrAddress;

    /**
     * 功能说明：同城还是跨城
     * 最后修改时间：2023/7/10
     */
    private String multiCity;

    /**
     * 功能说明：接送类型
     * 最后修改时间：2023/7/10
     */
    private String pickupType;


    /**
     * 功能说明：免费公里数
     * 最后修改时间：2023/7/10
     */
    private String freeMile;

    /**
     * 功能说明：免费公里数的单位
     * 最后修改时间：2023/7/10
     */
    private String freeMileUnit;

    /**
     * 功能说明：取消规则
     * 最后修改时间：2023/7/10
     */
    private String cancelPenalty;

    /**
     * 功能说明：额外规则
     * 最后修改时间：2023/7/10
     */
    private String extraPenalty;
}