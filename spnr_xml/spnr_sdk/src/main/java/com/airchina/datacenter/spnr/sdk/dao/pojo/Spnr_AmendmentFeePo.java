package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_AmendmentFeePo </p>
 * <p>Description: 存储订单的手续费（一般改期升舱需要手续费时，会在此节点下加入。每增加一次手续费，子节点增加一次。） </p>
 * <p>Sample: new Spnr_AmendmentFeePo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class Spnr_AmendmentFeePo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 对应增加此笔手续费的MP的@ProductNumber
     * 最后修改时间: 2023/04/20
     */
    private Long productNumber;

    /**
     * 功能说明: 对应此次手续费金额
     * 最后修改时间: 2023/04/20
     */
    private String amt;

    /**
     * 功能说明: 货币单位
     * 最后修改时间: 2023/04/20
     */
    private String currencyCode;

    /**
     * 功能说明: 增加此笔手续费的时间,非北京时间
     * 最后修改时间: 2023/04/20
     */
    private String opsDate;

    /**
     * 功能说明: SuperPNR 中audit的操作标识
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明: 是否人工调整
     * 最后修改时间: 2023/04/20
     */
    private String manual;

    /**
     * 功能说明: 如果此产品是另一个产品的外接件,则该参数保存该主产品的编号。可以在合成预订消息时使用它来将产品分组在一起
     * 最后修改时间: 2023/04/20
     */
    private Long masterProductNumber;

    /**
     * 功能说明: 历史产品号在日期变更或升级后取代原始产品的产品号
     * 最后修改时间: 2023/04/20
     */
    private String replacedBy;

    /**
     * 功能说明: 费用描述
     * 最后修改时间: 2023/05/12
     */
    private String description;
}