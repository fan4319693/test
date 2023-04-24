package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_POSPo </p>
 * <p>Description: 存储订单的POS信息（在SPNR内有且仅有一个，其节点用于表明该SPNR所属的航空公司、预定渠道等。） </p>
 * <p>Sample: new Spnr_POSPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class Spnr_POSPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 所属航司两字码
     * 最后修改时间: 2023/04/20
     */
    private String airlineVendorId;

    /**
     * 功能说明: IBE:网站订单；B2B：第三方订单
     * 最后修改时间: 2023/04/20
     */
    private String channel;

    /**
     * 功能说明: 发送请求方的国家代码
     * 最后修改时间: 2023/04/20
     */
    private String isoCountry;

    /**
     * 功能说明: 订单出票的货币代码
     * 最后修改时间: 2023/04/20
     */
    private String isoCurrency;

    /**
     * 功能说明: 标识用于创建此 SuperPNR 的语言环境
     * 最后修改时间: 2023/04/20
     */
    private String locale;

    /**
     * 功能说明: 标识发出预订请求的入口点。取值为omnicchannel、PostSell (MMB)、xSell和Servicing。
     * 最后修改时间: 2023/04/20
     */
    private String entryPoint;

    /**
     * 功能说明: IBE:网站订单,其他值：第三方公司代码
     * 最后修改时间: 2023/04/20
     */
    private String requestorId;

    /**
     * 功能说明: 订单请求方所属公司的名称
     * 最后修改时间: 2023/04/20
     */
    private String companyShortName;

    /**
     * 功能说明: 订单请求方所属公司的ID
     * 最后修改时间: 2023/04/20
     */
    private String companyNameCode;

    /**
     * 功能说明: 二级渠道
     * 最后修改时间: 2023/04/20
     */
    private String companyDivision;

    //============================Getter and Setter===============================

    public String getSuperPnrId() {
        return superPnrId;
    }

    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    public String getAirlineVendorId() {
        return airlineVendorId;
    }

    public void setAirlineVendorId(String airlineVendorId) {
        this.airlineVendorId = airlineVendorId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getIsoCountry() {
        return isoCountry;
    }

    public void setIsoCountry(String isoCountry) {
        this.isoCountry = isoCountry;
    }

    public String getIsoCurrency() {
        return isoCurrency;
    }

    public void setIsoCurrency(String isoCurrency) {
        this.isoCurrency = isoCurrency;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public String getRequestorId() {
        return requestorId;
    }

    public void setRequestorId(String requestorId) {
        this.requestorId = requestorId;
    }

    public String getCompanyShortName() {
        return companyShortName;
    }

    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
    }

    public String getCompanyNameCode() {
        return companyNameCode;
    }

    public void setCompanyNameCode(String companyNameCode) {
        this.companyNameCode = companyNameCode;
    }

    public String getCompanyDivision() {
        return companyDivision;
    }

    public void setCompanyDivision(String companyDivision) {
        this.companyDivision = companyDivision;
    }
}