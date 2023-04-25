package com.airchina.datacenter.spnr.sdk.parser.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.bean.AirMetaInfo </p>
 * <p>Description: 自定义的Bean, Air节点的公共属性 </p>
 * <p>Sample:  AirMetaInfo airMetaInfo = Commons.deriveAirMetaInfo(air) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AirMetaInfo {

    /**
     * 功能说明: PNR号
     * 最后修改时间: 2023/04/20
     */
    private String pnr;

    /**
     * 功能说明: 行程类型
     * 最后修改时间: 2023/04/20
     */
    private String directionInd;

    /**
     * 功能说明: 确定此行程是否需要 API/TSA 信息
     * 最后修改时间: 2023/04/20
     */
    private String docRequired;

}
