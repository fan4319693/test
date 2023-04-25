package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirPriceInfo_ItinTotalFarePo </p>
 * <p>Description: 存储MP的行程总价 </p>
 * <p>Sample: new MP_AirPriceInfo_ItinTotalFarePo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_AirPriceInfo_ItinTotalFarePo {

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
     * 功能说明: 公共运价/私有运价
     * 最后修改时间: 2023/04/20
     */
    private String pricingSource;

    /**
     * 功能说明: 主机返回的运价CODE值
     * 最后修改时间: 2023/04/20
     */
    private String fareFamilyCode;

    /**
     * 功能说明: 主机返回的运价名
     * 最后修改时间: 2023/04/20
     */
    private String fareFamilyName;

    /**
     * 功能说明: QTE时间
     * 最后修改时间: 2023/04/20
     */
    private String priceQuoteDate;

    /**
     * 功能说明: 库存价调整金额
     * 最后修改时间: 2023/04/20
     */
    private String baseFareAdjusted;

    /**
     * 功能说明: 库存金额及货币
     * 最后修改时间: 2023/04/20
     */
    private String baseFareAmt;

    /**
     * 功能说明: 库存金额及货币单位
     * 最后修改时间: 2023/04/20
     */
    private String baseFareCurrencyCode;

    /**
     * 功能说明: 库存价原始金额及货币
     * 最后修改时间: 2023/04/20
     */
    private String baseFareOriAmt;

    /**
     * 功能说明: 库存价原始金额及货币单位
     * 最后修改时间: 2023/04/20
     */
    private String baseFareOriCurrencyCode;

    /**
     * 功能说明: 税收详情
     * 最后修改时间: 2023/04/20
     */
    private String taxDetails;

    /**
     * 功能说明: 总价调整金额
     * 最后修改时间: 2023/04/20
     */
    private String totalFareAdjusted;

    /**
     * 功能说明: 乘客将支付的总价格（包括票价、税费、费用）及货币
     * 最后修改时间: 2023/04/20
     */
    private String totalFareAmt;

    /**
     * 功能说明: 乘客将支付的总价格（包括票价、税费、费用）及货币单位
     * 最后修改时间: 2023/04/20
     */
    private String totalFareCurrencyCode;

    /**
     * 功能说明: 总价原始金额及货币
     * 最后修改时间: 2023/04/20
     */
    private String totalFareOriAmt;

    /**
     * 功能说明: 总价原始金额及货币单位
     * 最后修改时间: 2023/04/20
     */
    private String totalFareOriCurrencyCode;

}