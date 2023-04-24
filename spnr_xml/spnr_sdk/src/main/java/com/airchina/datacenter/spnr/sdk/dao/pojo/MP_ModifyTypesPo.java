package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_ModifyTypesPo </p>
 * <p>Description: 存储MP产品经历了哪些变更操作（改升、改不定期、退票、分离PNR等操作） </p>
 * <p>Sample: new MP_ModifyTypesPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_ModifyTypesPo {

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
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String originalHistoryId;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private Long rph;

    /**
     * 功能说明: "对应操作的CODE值:AddRemark--退票添加remarks节点 Upgrade--改升 Split--分离PNR"
     * 最后修改时间: 2023/04/20
     */
    private String type;

    /**
     * 功能说明: 是否支持免费更改
     * 最后修改时间: 2023/04/20
     */
    private String freeDateChange;

    /**
     * 功能说明: 改升时存在该属性,表示该MP是从哪一个ModularProduct[@ProduProductNumber = $oldMPNum]变更过来的
     * 最后修改时间: 2023/04/20
     */
    private Long oldMpNum;

    /**
     * 功能说明: 改升时存在该属性,表示原始MP是否需要进行PNR分离
     * 最后修改时间: 2023/04/20
     */
    private String splitRequired;

    /**
     * 功能说明: 分离PNR时,该MP是否需要被cancel掉
     * 最后修改时间: 2023/04/20
     */
    private String needCancel;

    /**
     * 功能说明: 分离PNR时,该MP的PNR是从哪个原始PNR分离出的
     * 最后修改时间: 2023/04/20
     */
    private String oldPnr;

    /**
     * 功能说明: 改期升舱编号,固定编号+14位时间戳+4位序列（轮询使用,不够位补0）, 固定编号:改期升舱编号设置为01
     * 最后修改时间: 2023/04/20
     */
    private String reshopId;

    //============================Getter and Setter===============================

    public String getSuperPnrId() {
        return superPnrId;
    }

    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public String getOriginalHistoryId() {
        return originalHistoryId;
    }

    public void setOriginalHistoryId(String originalHistoryId) {
        this.originalHistoryId = originalHistoryId;
    }

    public Long getRph() {
        return rph;
    }

    public void setRph(Long rph) {
        this.rph = rph;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFreeDateChange() {
        return freeDateChange;
    }

    public void setFreeDateChange(String freeDateChange) {
        this.freeDateChange = freeDateChange;
    }

    public Long getOldMpNum() {
        return oldMpNum;
    }

    public void setOldMpNum(Long oldMpNum) {
        this.oldMpNum = oldMpNum;
    }

    public String getSplitRequired() {
        return splitRequired;
    }

    public void setSplitRequired(String splitRequired) {
        this.splitRequired = splitRequired;
    }

    public String getNeedCancel() {
        return needCancel;
    }

    public void setNeedCancel(String needCancel) {
        this.needCancel = needCancel;
    }

    public String getOldPnr() {
        return oldPnr;
    }

    public void setOldPnr(String oldPnr) {
        this.oldPnr = oldPnr;
    }

    public String getReshopId() {
        return reshopId;
    }

    public void setReshopId(String reshopId) {
        this.reshopId = reshopId;
    }
}