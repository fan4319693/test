package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_contactPo </p>
 * <p>Description: 存储联系人信息 </p>
 * <p>Sample: new Spnr_contactPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class Spnr_contactPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 此Customer节点增加、修改时的Audit ID
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明: Customer节点在该SPNR内的唯一标识,默认为100
     * 最后修改时间: 2023/04/20
     */
    private Long customerId;

    /**
     * 功能说明: 仅用于数据库记录的特定用途
     * 最后修改时间: 2023/04/20
     */
    private Long seqNo;

    /**
     * 功能说明: 该Customer节点是否生效。true:历史节点；false:该有效节点
     * 最后修改时间: 2023/04/20
     */
    private String historic;

    /**
     * 功能说明: 旅客类型,1代表注册用户,2代表游客
     * 最后修改时间: 2023/04/20
     */
    private String accountType;

    /**
     * 功能说明: 联系人在SPNR内的序号,SPNR内唯一标识,默认为乘客数量+1
     * 最后修改时间: 2023/04/20
     */
    private Long ojSuperPnrRph;

    /**
     * 功能说明: 联系人类型,默认为ADT（成人）
     * 最后修改时间: 2023/04/20
     */
    private String passengerTypeCode;

    /**
     * 功能说明: 联系人姓名
     * 最后修改时间: 2023/04/20
     */
    private String name;

    /**
     * 功能说明: 联系人电话
     * 最后修改时间: 2023/04/20
     */
    private String telephone;

    /**
     * 功能说明: 联系人邮箱
     * 最后修改时间: 2023/04/20
     */
    private String email;

    /**
     * 功能说明: 联系人地址是否格式化
     * 最后修改时间: 2023/04/20
     */
    private String addressFormattedInd;

    /**
     * 功能说明: 用于排序地址行
     * 最后修改时间: 2023/04/20
     */
    private String addressLineindex;

    /**
     * 功能说明: 联系人所在城市名
     * 最后修改时间: 2023/04/20
     */
    private String cityName;

    /**
     * 功能说明: 联系人所在地邮编
     * 最后修改时间: 2023/04/20
     */
    private String postalCode;

    /**
     * 功能说明: 联系人所在地国家码
     * 最后修改时间: 2023/04/20
     */
    private String countryName;

    /**
     * 功能说明: 当前账号拥有者的姓名
     * 最后修改时间: 2023/04/20
     */
    private String contactname;

    /**
     * 功能说明: 当前账号拥有者的称谓 (例如, Mr., Mrs., Ms., Miss, Dr.)
     * 最后修改时间: 2023/04/20
     */
    private String contactPrefix;

    /**
     * 功能说明: 存储当前账号拥有者的联系电话
     * 最后修改时间: 2023/04/20
     */
    private String contactTel;

    /**
     * 功能说明: 当前账号拥有者的联系邮箱
     * 最后修改时间: 2023/04/20
     */
    private String contactEmail;

    /**
     * 功能说明: 当前账号拥有者的证件号码
     * 最后修改时间: 2023/04/20
     */
    private String contactDocId;

    /**
     * 功能说明: 当前账号拥有者的证件类型
     * 最后修改时间: 2023/04/20
     */
    private Long contactDocType;

    /**
     * 功能说明: 当前账号拥有者的证件签发国
     * 最后修改时间: 2023/04/20
     */
    private String contactDocNationality;

    /**
     * 功能说明: 当前账号拥有者的证件过期日期
     * 最后修改时间: 2023/04/20
     */
    private String contactDocExpireDate;

    /**
     * 功能说明: 该SPNR所属账号ID
     * 最后修改时间: 2023/04/20
     */
    private String uniqueId;

    /**
     * 功能说明: 账号来源
     * 最后修改时间: 2023/04/20
     */
    private String uniqueIdContext;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String membershipId;

    //============================Getter and Setter===============================

    public String getSuperPnrId() {
        return superPnrId;
    }

    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getHistoric() {
        return historic;
    }

    public void setHistoric(String historic) {
        this.historic = historic;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Long getOjSuperPnrRph() {
        return ojSuperPnrRph;
    }

    public void setOjSuperPnrRph(Long ojSuperPnrRph) {
        this.ojSuperPnrRph = ojSuperPnrRph;
    }

    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressFormattedInd() {
        return addressFormattedInd;
    }

    public void setAddressFormattedInd(String addressFormattedInd) {
        this.addressFormattedInd = addressFormattedInd;
    }

    public String getAddressLineindex() {
        return addressLineindex;
    }

    public void setAddressLineindex(String addressLineindex) {
        this.addressLineindex = addressLineindex;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContactPrefix() {
        return contactPrefix;
    }

    public void setContactPrefix(String contactPrefix) {
        this.contactPrefix = contactPrefix;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactDocId() {
        return contactDocId;
    }

    public void setContactDocId(String contactDocId) {
        this.contactDocId = contactDocId;
    }

    public Long getContactDocType() {
        return contactDocType;
    }

    public void setContactDocType(Long contactDocType) {
        this.contactDocType = contactDocType;
    }

    public String getContactDocNationality() {
        return contactDocNationality;
    }

    public void setContactDocNationality(String contactDocNationality) {
        this.contactDocNationality = contactDocNationality;
    }

    public String getContactDocExpireDate() {
        return contactDocExpireDate;
    }

    public void setContactDocExpireDate(String contactDocExpireDate) {
        this.contactDocExpireDate = contactDocExpireDate;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getUniqueIdContext() {
        return uniqueIdContext;
    }

    public void setUniqueIdContext(String uniqueIdContext) {
        this.uniqueIdContext = uniqueIdContext;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }
}