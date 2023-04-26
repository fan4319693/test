package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_Baggage_TravelerPo </p>
 * <p>Description: 存储付费行李的旅客信息 </p>
 * <p>Sample: new MP_Baggage_TravelerPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_Baggage_TravelerPo {

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
     * 功能说明: 旅客在SPNR内唯一序列号
     * 最后修改时间: 2023/04/20
     */
    private Long ojSuperPnrRph;

    /**
     * 功能说明: 旅客在MP中的唯一标识
     * 最后修改时间: 2023/04/20
     */
    private Long travelerRph;

    /**
     * 功能说明: 旅客类型
     * 最后修改时间: 2023/04/20
     */
    private String passengerTypeCode;

    /**
     * 功能说明: 年龄
     * 最后修改时间: 2023/04/20
     */
    private String age;

    /**
     * 功能说明: 性别
     * 最后修改时间: 2023/04/20
     */
    private String gender;

    /**
     * 功能说明: 出生日期
     * 最后修改时间: 2023/04/20
     */
    private String birthDate;

    /**
     * 功能说明: 乘客子类型,如军警残等
     * 最后修改时间: 2023/04/20
     */
    private String ptcsubType;

    /**
     * 功能说明: 是否儿童陪伴人
     * 最后修改时间: 2023/04/20
     */
    private String verifyAdtAccompanierAge;

    /**
     * 功能说明: 是否团队票
     * 最后修改时间: 2023/04/20
     */
    private String groupInd;

    /**
     * 功能说明: 乘机人姓名: Surname:中文姓名,或英文姓氏;GivenName:国际票英文名时才存在,存储英文名或中间名
     * 最后修改时间: 2023/04/20
     */
    private String travelerName;

    /**
     * 功能说明: 称谓 (例如, Mr., Mrs., Ms., Miss, Dr.)
     * 最后修改时间: 2023/04/20
     */
    private String namePrefix;

    /**
     * 功能说明: 联系人电话
     * 最后修改时间: 2023/04/20
     */
    private String telephone;

    /**
     * 功能说明: 证件号码
     * 最后修改时间: 2023/04/20
     */
    private String docId;

    /**
     * 功能说明: 证件类型: 身份证【5】军官证【6】警官证【7】士兵证【3】有效护照【2】外国人永久居留身份证【91】其他证件【14】
     * 最后修改时间: 2023/04/20
     */
    private Long docType;

    /**
     * 功能说明: 乘客国籍
     * 最后修改时间: 2023/04/20
     */
    private String docNationality;

    /**
     * 功能说明: 过期日期
     * 最后修改时间: 2023/04/20
     */
    private String docExpireDate;

    /**
     * 功能说明: 乘客出生国家
     * 最后修改时间: 2023/04/20
     */
    private String birthCountry;

    /**
     * 功能说明: 证件签发国家
     * 最后修改时间: 2023/04/20
     */
    private String docIssueCountry;

    /**
     * 功能说明: 其他证件
     * 最后修改时间: 2023/04/20
     */
    private String additionalDoc;

    /**
     * 功能说明: 证件要求
     * 最后修改时间: 2023/04/20
     */
    private String docRequired;

    /**
     * 功能说明: 常客卡号
     * 最后修改时间: 2023/04/20
     */
    private String membershipId;

    /**
     * 功能说明: 常客卡状态
     * 最后修改时间: 2023/04/20
     */
    private String status;

    /**
     * 功能说明: 常客价值（VIP等）
     * 最后修改时间: 2023/04/20
     */
    private String customerValue;

    /**
     * 功能说明: 常客等级
     * 最后修改时间: 2023/04/20
     */
    private String loyalLevel;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String singleVendorInd;

    /**
     * 功能说明: 城市
     * 最后修改时间: 2023/04/26
     */
    private String cityName;

    /**
     * 功能说明: 省份
     * 最后修改时间: 2023/04/26
     */
    private String stateProv;

    /**
     * 功能说明: 国家
     * 最后修改时间: 2023/04/26
     */
    private String countryName;

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

    public Long getOjSuperPnrRph() {
        return ojSuperPnrRph;
    }

    public void setOjSuperPnrRph(Long ojSuperPnrRph) {
        this.ojSuperPnrRph = ojSuperPnrRph;
    }

    public Long getTravelerRph() {
        return travelerRph;
    }

    public void setTravelerRph(Long travelerRph) {
        this.travelerRph = travelerRph;
    }

    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPtcsubType() {
        return ptcsubType;
    }

    public void setPtcsubType(String ptcsubType) {
        this.ptcsubType = ptcsubType;
    }

    public String getVerifyAdtAccompanierAge() {
        return verifyAdtAccompanierAge;
    }

    public void setVerifyAdtAccompanierAge(String verifyAdtAccompanierAge) {
        this.verifyAdtAccompanierAge = verifyAdtAccompanierAge;
    }

    public String getGroupInd() {
        return groupInd;
    }

    public void setGroupInd(String groupInd) {
        this.groupInd = groupInd;
    }

    public String getTravelerName() {
        return travelerName;
    }

    public void setTravelerName(String travelerName) {
        this.travelerName = travelerName;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public Long getDocType() {
        return docType;
    }

    public void setDocType(Long docType) {
        this.docType = docType;
    }

    public String getDocNationality() {
        return docNationality;
    }

    public void setDocNationality(String docNationality) {
        this.docNationality = docNationality;
    }

    public String getDocExpireDate() {
        return docExpireDate;
    }

    public void setDocExpireDate(String docExpireDate) {
        this.docExpireDate = docExpireDate;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getDocIssueCountry() {
        return docIssueCountry;
    }

    public void setDocIssueCountry(String docIssueCountry) {
        this.docIssueCountry = docIssueCountry;
    }

    public String getAdditionalDoc() {
        return additionalDoc;
    }

    public void setAdditionalDoc(String additionalDoc) {
        this.additionalDoc = additionalDoc;
    }

    public String getDocRequired() {
        return docRequired;
    }

    public void setDocRequired(String docRequired) {
        this.docRequired = docRequired;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomerValue() {
        return customerValue;
    }

    public void setCustomerValue(String customerValue) {
        this.customerValue = customerValue;
    }

    public String getLoyalLevel() {
        return loyalLevel;
    }

    public void setLoyalLevel(String loyalLevel) {
        this.loyalLevel = loyalLevel;
    }

    public String getSingleVendorInd() {
        return singleVendorInd;
    }

    public void setSingleVendorInd(String singleVendorInd) {
        this.singleVendorInd = singleVendorInd;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateProv() {
        return stateProv;
    }

    public void setStateProv(String stateProv) {
        this.stateProv = stateProv;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
