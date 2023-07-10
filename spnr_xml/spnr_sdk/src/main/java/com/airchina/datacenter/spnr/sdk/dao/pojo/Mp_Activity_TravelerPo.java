/*
 * File Name: Mp_Hotel_Air_Ticketing
 * Version: 1.0
 * Last Modified Time: 2023-06-02 13:48
 */
/*
 * Copyright @ 2013 Airchina.
 * All right reserved.
 */
package com.airchina.datacenter.spnr.sdk.dao.pojo;

import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Mp_Hotel_Air_TicketingPo </p>
 * <p>Description: 存储保险和专车接送涉及到的机票信息 </p>
 * <p>Sample: new Mp_Hotel_Air_TicketingPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class Mp_Activity_TravelerPo {
    /**
     * 功能说明: SPNR ID，唯一标识
     * 最后修改时间: 2023/06/02
     */
    private String superPnrId;


    /**
     * 功能说明: 该SPNR内MP唯一序号
     * 最后修改时间: 2023/06/02
     */
    private Long productNumber;


    /**
     * 功能说明: 该SPNR内乘机人唯一序号
     * 最后修改时间: 2023/06/02
     */
    private String ojSuperPnrRph;


    /**
     * 功能说明: 乘机人类型
     * 最后修改时间: 2023/06/02
     */
    private String passengerType;


    /**
     * 功能说明: 该MP内乘机人唯一序号
     * 最后修改时间: 2023/06/02
     */
    private String passengerRph;


    /**
     * 功能说明: 乘客姓名
     * 最后修改时间: 2023/06/02
     */
    private String name;

    /**
     * 功能说明: 乘客证件号
     * 最后修改时间: 2023/06/02
     */
    private String docId;

    /**
     * 功能说明: 乘客证件类型
     * 最后修改时间: 2023/06/02
     */
    private String docType;

    /**
     * 功能说明: 乘客的邮箱
     * 最后修改时间: 2023/06/02
     */
    private String email;

    /**
     * 功能说明: 乘客证件类型
     * 最后修改时间: 2023/06/02
     */
    private String phone;

    /**
     * 功能说明: 订单备注
     * 最后修改时间: 2023/06/02
     */
    private String notes;

    /**
     * 功能说明: 订单备注
     * 最后修改时间: 2023/06/02
     */
    private String verificationCode;

    /**
     * 功能说明: 联系人姓名
     * 最后修改时间: 2023/06/02
     */
    private String contactName;


    /**
     * 功能说明: 联系人手机号
     * 最后修改时间: 2023/06/02
     */
    private String contactPhone;
}