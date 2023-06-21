package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_MPPo </p>
 * <p>Description: 存储MP的基础属性（ModularProduct（简称MP），是SPNR下最重要的一个节点，每一个MP都代表着一个产品的详情信息，如机票、保险、预付费座位、预付费餐食等预定信息，都保存在其对应的MP内。） </p>
 * <p>Sample: new Spnr_MPPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class Spnr_MPPo {

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
     * 功能说明: Link to the @historyID  of an air product for ancillary product booked with
     * 最后修改时间: 2023/04/20
     */
    private String bookedWith;

    /**
     * 功能说明: 预订产品的SUPPLIER渠道
     * 最后修改时间: 2023/04/20
     */
    private String bookingChannel;

    /**
     * 功能说明: MP预订时间,非北京时间
     * 最后修改时间: 2023/04/20
     */
    private String bookingDate;

    /**
     * 功能说明: MP状态
     * 最后修改时间: 2023/04/20
     */
    private String bookingStatus;

    /**
     * 功能说明: 取消时间
     * 最后修改时间: 2023/04/20
     */
    private String cancellationDate;

    /**
     * 功能说明: MP内最后一个航段的到达时间
     * 最后修改时间: 2023/04/20
     */
    private String endDate;

    /**
     * 功能说明: 该MP是否有效
     * 最后修改时间: 2023/04/20
     */
    private String historic;

    /**
     * 功能说明: 表明该MP是从哪一个最原始的MP变化而来的,指向该MP的@ProductNumber
     * 最后修改时间: 2023/04/20
     */
    private Long historicId;

    /**
     * 功能说明: 该MP最后一次修改时间,非北京时间
     * 最后修改时间: 2023/04/20
     */
    private String lastModified;

    /**
     * 功能说明: 如果此产品是另一个产品的附加产品,则它包含该主产品的编号。 它可以在合成预订消息时使用,以将产品组合在一起, 现阶段默认为0
     * 最后修改时间: 2023/04/20
     */
    private Long masterProductNumber;

    /**
     * 功能说明: 预订使用的语言
     * 最后修改时间: 2023/04/20
     */
    private String primaryLangId;

    /**
     * 功能说明: PNR 级别的每个产品的自定义产品 ID。新生成时基于HistoryID,部分场景分离可复用
     * 最后修改时间: 2023/04/20
     */
    private Long productId;

    /**
     * 功能说明: 产品类别
     * 最后修改时间: 2023/04/20
     */
    private String productType;

    /**
     * 功能说明: 产品类别Code值
     * 最后修改时间: 2023/04/20
     */
    private String productTypeCode;

    /**
     * 功能说明: 该MP第一个航段的起飞时间
     * 最后修改时间: 2023/04/20
     */
    private String startDate;

    /**
     * 功能说明: 该MP是否进行过同步
     * 最后修改时间: 2023/04/20
     */
    private String synchronised;

    /**
     * 功能说明: 国航用来扩充标识国航产品状态的字段
     * 最后修改时间: 2023/04/20
     */
    private String tsbookingStatus;

    /**
     * 功能说明: 指的是哪一个MP是在本MP上变化而来的,LiveID仅在@Historic = "true"的MP上存在。
     * 最后修改时间: 2023/04/20
     */
    private Long liveId;

    /**
     * 功能说明: 是否允许退票
     * 最后修改时间: 2023/04/20
     */
    private String refundable;

    /**
     * 功能说明: 产品日期更改或升级后替换此产品的productnumber
     * 最后修改时间: 2023/04/20
     */
    private String replacedBy;

    /**
     * 功能说明: 分配给请求者的权限代码,票台officeno
     * 最后修改时间: 2023/04/20
     */
    private String agentDutyCode;

    /**
     * 功能说明: 电子预订服务提供商分配的标识符
     * 最后修改时间: 2023/04/20
     */
    private String erspUserId;

    /**
     * 功能说明: 设备ID
     * 最后修改时间: 2023/04/20
     */
    private String terminalId;

    /**
     * 功能说明: 由创建系统分配的唯一标识值
     * 最后修改时间: 2023/04/20
     */
    private String requestorId;

    /**
     * 功能说明: office号（配置号）
     * 最后修改时间: 2023/04/20
     */
    private String officecode;

    /**
     * 功能说明: IATA号（结算号）
     * 最后修改时间: 2023/04/20
     */
    private String iataNumber;

    /**
     * 功能说明: 请求的渠道
     * 最后修改时间: 2023/04/20
     */
    private String channel;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String companyCode;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String companyCodeContext;

    /**
     * 功能说明: TSDF:国内票,TSIF:国际票
     * 最后修改时间: 2023/04/20
     */
    private String companyName;

    /**
     * 功能说明: 每个Note对应一条信息,以@Type和Text()值作为键值对
     * 最后修改时间: 2023/04/20
     */
    private String supplierNotes;

    /**
     * 功能说明: 二级渠道
     * 最后修改时间: 2023/04/20
     */
    private String companyDivision;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String serviceCode;

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

}