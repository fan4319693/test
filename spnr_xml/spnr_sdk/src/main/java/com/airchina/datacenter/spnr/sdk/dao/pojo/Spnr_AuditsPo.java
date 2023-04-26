package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_AuditsPo </p>
 * <p>Description: 存储订单的操作日志详情（SPNR每发生一次修改，Audits下都会新增一个子节点Audit,用于存储此次修改的发生时间、操作IP等信息） </p>
 * <p>Sample: new Spnr_AuditsPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class Spnr_AuditsPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 该Audit节点的唯一标识,每次操作都递增加1
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明: 发起此次操作请求的渠道ID
     * 最后修改时间: 2023/04/20
     */
    private String requestorId;

    /**
     * 功能说明: 发起此次操作的渠道
     * 最后修改时间: 2023/04/20
     */
    private String channel;

    /**
     * 功能说明: 版本号
     * 最后修改时间: 2023/04/20
     */
    private String version;

    /**
     * 功能说明: 发起此次操作请求的时间(注：非北京时间,转换为北京时间需+8个小时)
     * 最后修改时间: 2023/04/20
     */
    private String opsTimestamp;

    /**
     * 功能说明: 发起此次操作请求的IP地址
     * 最后修改时间: 2023/04/20
     */
    private String sourceAddress;

    /**
     * 功能说明: 记录此次操作类型
     * 最后修改时间: 2023/04/20
     */
    private String action;

    /**
     * 功能说明: 渠道名或ID
     * 最后修改时间: 2023/04/20
     */
    private String agent;

    /**
     * 功能说明: 处理该次请求的服务器IP
     * 最后修改时间: 2023/04/20
     */
    private String agentUrl;

    /**
     * 功能说明: 填入此次操作的坐席UID
     * 最后修改时间: 2023/04/20
     */
    private String agency;

    /**
     * 功能说明: 填入此次操作的坐席CID
     * 最后修改时间: 2023/04/20
     */
    private String agentId;

    /**
     * 功能说明: 记录发起此次操作的坐席技能组
     * 最后修改时间: 2023/04/20
     */
    private String agentFunctionalGroup;

    /**
     * 功能说明: 记录发起此次操作的坐席行政组
     * 最后修改时间: 2023/04/20
     */
    private String agentAdministrativeGroup;

    /**
     * 功能说明: 记录操作的产品类型
     * 最后修改时间: 2023/04/20
     */
    private String eventContext;

    /**
     * 功能说明: 该产品的Product ID
     * 最后修改时间: 2023/04/20
     */
    private Long eventId;

    /**
     * 功能说明: 导致改变的Traveler
     * 最后修改时间: 2023/04/20
     */
    private Long eventOjSuperPnrRph;

    /**
     * 功能说明: 改变之前的值
     * 最后修改时间: 2023/04/20
     */
    private String eventOrigValue;

    /**
     * 功能说明: 改变之后的值
     * 最后修改时间: 2023/04/20
     */
    private String eventRefId;

    /**
     * 功能说明: 涉及的信息路径
     * 最后修改时间: 2023/04/20
     */
    private String eventPath;

    /**
     * 功能说明: 改变值的类型
     * 最后修改时间: 2023/04/20
     */
    private String eventType;

    /**
     * 功能说明: 导致改变的FlightSegment
     * 最后修改时间: 2023/04/20
     */
    private Long eventFltSegRph;

    /**
     * 功能说明: 值的路径
     * 最后修改时间: 2023/04/20
     */
    private String eventRefPath;

}