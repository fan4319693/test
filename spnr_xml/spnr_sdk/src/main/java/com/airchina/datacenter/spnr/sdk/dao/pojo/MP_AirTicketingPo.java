package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirTicketingPo </p>
 * <p>Description: 存储MP的票面信息 </p>
 * <p>Sample: new MP_AirTicketingPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_AirTicketingPo {

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
     * 功能说明: 航段序号,唯一值,不变
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRefNumber;

    /**
     * 功能说明: 是否非自愿退票
     * 最后修改时间: 2023/04/20
     */
    private String irr;

    /**
     * 功能说明: 非自愿退票原因
     * 最后修改时间: 2023/04/20
     */
    private String irrReason;

    /**
     * 功能说明: 出票票台
     * 最后修改时间: 2023/04/20
     */
    private String issuingAgentId;

    /**
     * 功能说明: 未知,待核实
     * 最后修改时间: 2023/04/20
     */
    private String itemNumber;

    /**
     * 功能说明: 是否出票
     * 最后修改时间: 2023/04/20
     */
    private String printed;

    /**
     * 功能说明: T出票时间,取自主机时间
     * 最后修改时间: 2023/04/20
     */
    private String ticketTime;

    /**
     * 功能说明: 主机票面状态:OPEN FOR USE , REFUND, EXCHANGE, VOID, USED/FLOWN等
     * 最后修改时间: 2023/04/20
     */
    private String ticketingStatus;

    /**
     * 功能说明: 旅客在该MP内的序号,非@OJ_SuperPNR_RPH,两者不一定相等
     * 最后修改时间: 2023/04/20
     */
    private Long travelerRefNumber;

    /**
     * 功能说明: 票号
     * 最后修改时间: 2023/04/20
     */
    private String eTicketNumber;

    /**
     * 功能说明: 最晚出票时间
     * 最后修改时间: 2023/04/20
     */
    private String ticketTimeLimit;

    /**
     * 功能说明: 记录客票有效期
     * 最后修改时间: 2023/04/20
     */
    private String expiryDateTime;

    /**
     * 功能说明: 客票候补状态,用于表示客票是候补客票还是非候补客票, OK: 已确认;RQ: 已申请;NS:婴儿,无座位;SA:可用
     * 最后修改时间: 2023/04/20
     */
    private String waitlistStatus;

    /**
     * 功能说明: refund_status: 退票状态;refund_e_refund_number: 退票票号
     * 最后修改时间: 2023/04/20
     */
    private String refundInfo;

}