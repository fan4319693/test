package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_BaggagePo </p>
 * <p>Description: 存储MP附加产品：预付费行李 </p>
 * <p>Sample: new MP_BaggagePo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_BaggagePo implements Cloneable {

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
     * 功能说明: 行李能否单独取消
     * 最后修改时间: 2023/04/20
     */
    private String cancelable;

    /**
     * 功能说明: 产品数量
     * 最后修改时间: 2023/04/20
     */
    private Long quantity;

    /**
     * 功能说明: 该产品能否单独退
     * 最后修改时间: 2023/04/20
     */
    private String refundable;

    /**
     * 功能说明: 该产品是否与机票绑定
     * 最后修改时间: 2023/04/20
     */
    private String isSegBind;

    /**
     * 功能说明: 行李相对应的航段出发地
     * 最后修改时间: 2023/04/20
     */
    private String departureCode;

    /**
     * 功能说明: 行李相对应的航段到达地
     * 最后修改时间: 2023/04/20
     */
    private String arrivalCode;

    /**
     * 功能说明: 最大重量计量
     * 最后修改时间: 2023/04/20
     */
    private String maxWeight;

    /**
     * 功能说明: 最大重量计量单位
     * 最后修改时间: 2023/04/20
     */
    private String maxWeightUnit;

    /**
     * 功能说明: 购买的行李最大尺寸长度
     * 最后修改时间: 2023/04/20
     */
    private String maxDimensionslCm;

    /**
     * 功能说明: 最大尺寸计量单位
     * 最后修改时间: 2023/04/20
     */
    private String maxDimensionsUnits;

    /**
     * 功能说明: 调整金额
     * 最后修改时间: 2023/04/20
     */
    private String adjusted;

    /**
     * 功能说明: 金额
     * 最后修改时间: 2023/04/20
     */
    private String amt;

    /**
     * 功能说明: 税前金额
     * 最后修改时间: 2023/04/20
     */
    private String amtBeforeTax;

    /**
     * 功能说明: 货币代码
     * 最后修改时间: 2023/04/20
     */
    private String currencyCode;

    /**
     * 功能说明: 未知,待核实
     * 最后修改时间: 2023/04/20
     */
    private String decimalPlaces;

    /**
     * 功能说明: 未知,待核实
     * 最后修改时间: 2023/04/20
     */
    private String oriAmtAfterTax;

    /**
     * 功能说明: 原始货币代码
     * 最后修改时间: 2023/04/20
     */
    private String oriCurrencyCode;

    /**
     * 功能说明: 航班号
     * 最后修改时间: 2023/04/20
     */
    private String flightSegmentNumber;

    /**
     * 功能说明: 对应的旅客序号
     * 最后修改时间: 2023/04/20
     */
    private Long travelerRph;

    /**
     * 功能说明: 航段序号,唯一值,不变
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 未知,待核实
     * 最后修改时间: 2023/04/20
     */
    private String geoIndicator;

    /**
     * 功能说明: 销售模式
     * 最后修改时间: 2023/04/20
     */
    private String saleModel;

    /**
     * 功能说明: 出票时间
     * 最后修改时间: 2023/04/20
     */
    private String ticketTime;

    /**
     * 功能说明: 出票状态
     * 最后修改时间: 2023/04/20
     */
    private String ticketingStatus;

    /**
     * 功能说明: 票号
     * 最后修改时间: 2023/04/20
     */
    private String eTicketNumber;

    /**
     * 功能说明: PNR中展示的附加服务明细
     * 最后修改时间: 2023/04/20
     */
    private String ticketAdvisory;

    /**
     * 功能说明: 退行李手续费
     * 最后修改时间: 2023/04/20
     */
    private String cancelAmount;

    @Override
    /**
     * Description：对类进行拷贝
     * Return：com.airchina.datacenter.spnr.sdk.dao.pojo.MP_BaggagePo ：
     * Exception： 无
     * Modified History: zml 1.0 2023-06-28
     */
    public MP_BaggagePo clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (MP_BaggagePo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}