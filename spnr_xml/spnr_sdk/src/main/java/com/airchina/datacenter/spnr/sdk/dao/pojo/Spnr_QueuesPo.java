package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_QueuesPo </p>
 * <p>Description: 存储订单的队列信息（每个Queue子节点，都代表一个队列，用于存储订单该、曾经所存在的队列） </p>
 * <p>Sample: new Spnr_QueuesPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class Spnr_QueuesPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 队列ID,数据表里作为主键存在,唯一值
     * 最后修改时间: 2023/04/20
     */
    private Long queueId;

    /**
     * 功能说明: SPNR该是否处于该队列下
     * 最后修改时间: 2023/04/20
     */
    private String active;

    /**
     * 功能说明: 队列名
     * 最后修改时间: 2023/04/20
     */
    private String queueName;

    /**
     * 功能说明: Add:加入队列Delete:从队列中移除
     * 最后修改时间: 2023/04/20
     */
    private String action;

    /**
     * 功能说明: 触发此次操作的渠道
     * 最后修改时间: 2023/04/20
     */
    private String agent;

    /**
     * 功能说明: 触发此次操作的时间,非北京时间,需+8处理
     * 最后修改时间: 2023/04/20
     */
    private String opsDate;

    /**
     * 功能说明: 数据库中的序列号
     * 最后修改时间: 2023/04/20
     */
    private Long seqNo;

    /**
     * 功能说明: 表示此项是否需要立即处理
     * 最后修改时间: 2023/04/20
     */
    private String urgent;

    /**
     * 功能说明: 此次操作的原因
     * 最后修改时间: 2023/04/20
     */
    private String reason;

    //============================Getter and Setter===============================

    public String getSuperPnrId() {
        return superPnrId;
    }

    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    public Long getQueueId() {
        return queueId;
    }

    public void setQueueId(Long queueId) {
        this.queueId = queueId;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getOpsDate() {
        return opsDate;
    }

    public void setOpsDate(String opsDate) {
        this.opsDate = opsDate;
    }

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}