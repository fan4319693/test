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
public class MP_Hotel_RoomPo {

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
     * 功能说明: 房间序号
     * 最后修改时间: 2023/06/02
     */
    private String roomTypeCode;
    /**
     * 功能说明: 房间类型
     * 最后修改时间: 2023/06/02
     */
    private Long roomRph;

    /**
     * 功能说明:来源渠道
     * 最后修改时间: 2023/06/02
     */
    private String sourceOfBusiness;

    /**
     * 功能说明: 分配单位
     * 最后修改时间: 2023/06/02
     */
    private Integer allocatedUnits;

    /**
     * 功能说明:来源渠道
     * 最后修改时间: 2023/06/02
     */
    private String mode;

    /**
     * 功能说明:乘客数量
     * 最后修改时间: 2023/06/02
     */
    private Integer numberOfGuests;

    /**
     * 功能说明: 房间数量
     * 最后修改时间: 2023/06/02
     */
    private Integer numberOfUnits;

    /**
     * 功能说明:价格类型
     * 最后修改时间: 2023/06/02
     */
    private String ratePlanCode;

    /**
     * 功能说明:剩余数量
     * 最后修改时间: 2023/06/02
     */
    private String remainingUnits;

    /**
     * 功能说明: 餐食计划的code
     * 最后修改时间: 2023/06/02
     */
    private String mealCode;

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
     * 功能说明: 购买价格
     * 最后修改时间: 2023/06/02
     */
    private String buyingAmount;

    /**
     * 功能说明: 购买价格的单位
     * 最后修改时间: 2023/06/02
     */
    private String currencyCode;

    /**
     * 功能说明: 餐食费用税后价格
     * 最后修改时间: 2023/06/02
     */
    private String mealPriceAfterTax;

    /**
     * 功能说明: 餐食费用税前价格
     * 最后修改时间: 2023/06/02
     */
    private String mealPriceBeforeTax;

    /**
     * 功能说明: 餐食费用
     * 最后修改时间: 2023/06/02
     */
    private String mealSupplierPrice;

    /**
     * 功能说明: 餐食费用的单位
     * 最后修改时间: 2023/06/02
     */
    private String mealCurrencyCode;

    /**
     * 功能说明: 供应价格
     * 最后修改时间: 2023/06/02
     */
    private String supplierAmount;

    /**
     * 功能说明: 间夜数
     * 最后修改时间: 2023/06/02
     */
    private Integer nightNumber;

    /**
     * 功能说明: 间夜计划的CODE值
     * 最后修改时间: 2023/06/02
     */
    private String nightRatePlanCode;

    /**
     * 功能说明: 间夜计划的供应价格
     * 最后修改时间: 2023/06/02
     */
    private String nightSupplierAmt;


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

    /**
     * 功能说明: 酒店地址
     * 最后修改时间: 2023/06/02
     */
    private String hotelAddress;

    /**
     * 功能说明: 酒店城市名
     * 最后修改时间: 2023/06/02
     */
    private String hotelCityName;

    /**
     * 功能说明: 入住时间
     * 最后修改时间: 2023/06/02
     */
    private String start;
    /**
     * 功能说明: 退房时间
     * 最后修改时间: 2023/06/02
     */
    private String end;

    /**
     * 功能说明: 入住天数
     * 最后修改时间: 2023/06/02
     */
    private Long duration;

    /**
     * 功能说明: 预订住宿ID
     * 最后修改时间: 2023/06/02
     */
    private String resId;

    /**
     * 功能说明: 入住人IDs
     * 最后修改时间: 2023/06/02
     */
    private String guestIds;
}
