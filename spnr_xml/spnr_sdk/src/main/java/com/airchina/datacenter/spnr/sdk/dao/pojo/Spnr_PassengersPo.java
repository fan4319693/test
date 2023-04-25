package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PassengersPo </p>
 * <p>Description: 存储订单旅客信息 </p>
 * <p>Sample: new Spnr_PassengersPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class Spnr_PassengersPo {

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
     * 功能说明: 旅客年龄
     * 最后修改时间: 2023/04/20
     */
    private String age;

    /**
     * 功能说明: 出生年月日
     * 最后修改时间: 2023/04/20
     */
    private String birthDate;

    /**
     * 功能说明: 当前旅客在SPNR内唯一标识
     * 最后修改时间: 2023/04/20
     */
    private Long ojSuperPnrRph;

    /**
     * 功能说明: 乘机人乘客类型代码
     * 最后修改时间: 2023/04/20
     */
    private String passengerTypeCode;

    /**
     * 功能说明: 乘机人姓名
     * 最后修改时间: 2023/04/20
     */
    private String travelerName;

    /**
     * 功能说明: 乘机人称谓 (例如, Mr., Mrs., Ms., Miss, Dr.)
     * 最后修改时间: 2023/04/20
     */
    private String namePrefix;

    /**
     * 功能说明: 存储乘机人电话
     * 最后修改时间: 2023/04/20
     */
    private String telephone;

    /**
     * 功能说明: 乘机人国籍
     * 最后修改时间: 2023/04/20
     */
    private String citizenCountryCode;

    /**
     * 功能说明: 乘机人证件号码
     * 最后修改时间: 2023/04/20
     */
    private String docId;

    /**
     * 功能说明: 乘机人证件类型
     * 最后修改时间: 2023/04/20
     */
    private Long docType;

    /**
     * 功能说明: 乘机人证件签发国
     * 最后修改时间: 2023/04/20
     */
    private String docNationality;

    /**
     * 功能说明: 乘机人证件过期日期
     * 最后修改时间: 2023/04/20
     */
    private String docExpireDate;

}