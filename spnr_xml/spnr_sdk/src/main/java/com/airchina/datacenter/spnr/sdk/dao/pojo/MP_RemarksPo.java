package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_RemarksPo </p>
 * <p>Description: 存储MP产品退后审核信息 </p>
 * <p>Sample: new MP_RemarksPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_RemarksPo {

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
     * 功能说明: 该Remark是否是激活状态,还是已成为历史
     * 最后修改时间: 2023/04/20
     */
    private String active;

    /**
     * 功能说明: 跟审计节点关联的ID
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明: 动作代码
     * 最后修改时间: 2023/04/20
     */
    private String code;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String codeContext;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String opsDate;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String lastModified;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private Long rph;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String agent;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String agentSourceAddress;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String inTimestamp;

    /**
     * 功能说明: qualifier_item_name与qualifier_item_value组合成了qualifier_item, 如k1:v1|k2:v2|k3:v3
     * 最后修改时间: 2023/04/20
     */
    private String qualifierInfo;

}