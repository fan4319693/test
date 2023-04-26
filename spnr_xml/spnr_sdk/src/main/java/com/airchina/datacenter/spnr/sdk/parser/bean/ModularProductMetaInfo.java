package com.airchina.datacenter.spnr.sdk.parser.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.bean.ModularProductMetaInfo </p>
 * <p>Description: 自定义的Bean, ModularProduct节点的公共属性 </p>
 * <p>Sample:  ModularProductMetaInfo mp = new ModularProductMetaInfo("x", "y", 1L) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ModularProductMetaInfo {

    /**
     * 功能说明: SPNR ID, 唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String spnrId;

    /**
     * 功能说明: 最终用户进行的搜索的ID的唯一标识。
     * 最后修改时间: 2023/04/20
     */
    private String searchId;

    /**
     * 功能说明: 该SPNR内MP唯一序号
     * 最后修改时间: 2023/04/20
     */
    private Long productNumber;

}
