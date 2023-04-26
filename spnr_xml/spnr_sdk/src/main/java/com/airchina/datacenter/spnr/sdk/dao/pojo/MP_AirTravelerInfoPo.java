package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirTravelerInfoPo </p>
 * <p>Description: 存储MP的乘机人信息、常旅客卡信息 </p>
 * <p>Sample: new MP_AirTravelerInfoPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_AirTravelerInfoPo {

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
     * 功能说明: 旅客在SPNR内唯一序列号
     * 最后修改时间: 2023/04/20
     */
    private Long ojSuperPnrRph;

    /**
     * 功能说明: 旅客在MP中的唯一标识
     * 最后修改时间: 2023/04/20
     */
    private Long travelerRefNumberRph;

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
     * 功能说明: 乘机人姓名,Surname:中文姓名,或英文姓氏,GivenName:国际票英文名时才存在,存储英文名或中间名
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
     * 功能说明: 证件类型:身份证【5】军官证【6】警官证【7】士兵证【3】有效护照【2】外国人永久居留身份证【91】其他证件【14】
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
     * 功能说明: 邮箱
     * 最后修改时间: 2023/04/20
     */
    private String email;

    /**
     * 功能说明: 联系人地址是否格式化
     * 最后修改时间: 2023/04/20
     */
    private String addressFormattedInd;

    /**
     * 功能说明: 地址顺序号
     * 最后修改时间: 2023/04/20
     */
    private String addressLineindex;

    /**
     * 功能说明: 联系人所在城市名
     * 最后修改时间: 2023/04/20
     */
    private String cityName;

    /**
     * 功能说明: 州代码、省代码
     * 最后修改时间: 2023/04/20
     */
    private String stateCode;

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
     * 功能说明: 成为常客的日期
     * 最后修改时间: 2023/04/20
     */
    private String signupDate;

    /**
     * 功能说明: 常客生效日期
     * 最后修改时间: 2023/04/20
     */
    private String effectiveDate;

    /**
     * 功能说明: 常客失效日期
     * 最后修改时间: 2023/04/20
     */
    private String expireDate;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String singleVendorInd;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String stateProv;

}