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
    private String start;
    private String end;
    private Long duration;

    /**
     * 功能说明: 税后价格
     * 最后修改时间: 2023/06/02
     */
    private String amountAfterTax;

    /**
     * 功能说明: 税前价格
     * 最后修改时间: 2023/06/02
     */
    private String amountBeforeTax;

    /**
     * 功能说明: 税后价格
     * 最后修改时间: 2023/06/02
     */
    private String oriAmountAfterTax;

    /**
     * 功能说明: 税前价格
     * 最后修改时间: 2023/06/02
     */
    private String oriAmountBeforeTax;

    /**
     * 功能说明: 购买价格
     * 最后修改时间: 2023/06/02
     */
    private String currencyCode;

}
