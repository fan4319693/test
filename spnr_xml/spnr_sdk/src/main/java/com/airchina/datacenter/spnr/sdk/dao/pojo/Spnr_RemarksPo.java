package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_RemarksPo </p>
 * <p>Description: 存储订单的退后审核信息 </p>
 * <p>Sample: new Spnr_RemarksPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class Spnr_RemarksPo implements Cloneable {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 该Remark是否是激活状态,还是已成为历史
     * 最后修改时间: 2023/04/20
     */
    private String active;

    /**
     * 功能说明: 跟审计节点关联的ID
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明: 动作代码
     * 最后修改时间: 2023/04/20
     */
    private String code;

    /**
     * 功能说明: 动作代码的文本
     * 最后修改时间: 2023/04/20
     */
    private String codeContext;

    /**
     * 功能说明: 增加remark项的日期和时间
     * 最后修改时间: 2023/04/20
     */
    private String remarkDate;

    /**
     * 功能说明: 它用于将所有remark元素组合在一起,当remark第一次创建时,它将被发送到RPH,此后不再更改
     * 最后修改时间: 2023/04/20
     */
    private Long historyRph;

    /**
     * 功能说明: remark项最后修改的日期和时间
     * 最后修改时间: 2023/04/20
     */
    private String lastModified;

    /**
     * 功能说明: 标记remark的唯一键
     * 最后修改时间: 2023/04/20
     */
    private Long rph;

    /**
     * 功能说明: SPNR在db中的编号标识位置
     * 最后修改时间: 2023/04/20
     */
    private Long seqNo;

    /**
     * 功能说明: 渠道名或ID
     * 最后修改时间: 2023/04/20
     */
    private String agent;

    /**
     * 功能说明: 所记录审核信息的类型
     * 最后修改时间: 2023/04/20
     */
    private String qualifierDescription;

    /**
     * 功能说明: 所记录审核信息的值
     * 最后修改时间: 2023/04/20
     */
    private String qualifierValue;

    /**
     * 功能说明: 审核所处理的航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 审核所处理的旅客序号
     * 最后修改时间: 2023/04/20
     */
    private Long ojSuperPnrRph;

    /**
     * 功能说明: 审核所关联的电子客票号
     * 最后修改时间: 2023/04/20
     */
    private String eTicketNumber;

    /**
     * 功能说明: 旅客类型
     * 最后修改时间: 2023/04/20
     */
    private String passengerTypeCode;

    /**
     * 功能说明: 审核所处理产品的原始ID
     * 最后修改时间: 2023/04/20
     */
    private Long historyId;

    /**
     * 功能说明: 审核所处理产品ID
     * 最后修改时间: 2023/04/20
     */
    private Long productNumber;

    /**
     * 功能说明: 退票条款的细分
     * 最后修改时间: 2023/04/20
     */
    private String qualifierItem;

    /**
     * 功能说明: 渠道名或坐席UID
     * 最后修改时间: 2023/06/21
     */
    private String callSeatUid;

    /**
     * 功能说明: 填入此次操作的坐席CID
     * 最后修改时间: 2023/06/21
     */
    private String callSeatCid;

    /**
     * 功能说明: 记录发起此次操作的坐席技能组
     * 最后修改时间: 2023/06/21
     */
    private String callSkillTeam;

    /**
     * 功能说明: 记录发起此次操作的坐席行政组
     * 最后修改时间: 2023/06/21
     */
    private String callAdsTeam;

    /**
     * 功能说明: qualifierInfo的序号，自增
     * 最后修改时间: 2023/06/27
     */
    private Integer qualifierRef;

    @Override
    /**
     * Description：对类进行拷贝
     * Return：com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_RemarksPo ：
     * Exception： 无
     * Modified History: zml 1.0 2023-06-28
     */
    public Spnr_RemarksPo clone() {
        try {
            return (Spnr_RemarksPo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}