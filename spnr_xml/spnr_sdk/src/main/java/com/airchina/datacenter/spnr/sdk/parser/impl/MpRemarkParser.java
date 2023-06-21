package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_RemarksPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpRemarkParser </p>
 * <p>Description: MP_RemarksPo 的转换器 </p>
 * <p>Sample:  new MpRemarkParser(new FieldsArrayStrategy(MP_RemarksPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpRemarkParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *
     * @param strategy: 实体对象解析策略
     *                  Throws: 无
     */
    public MpRemarkParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_RemarksPo
     * Parameter:
     *
     * @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     *              Return: 解析的实体对象集合, 不会为null, 可能为空集合
     *              Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            Optional.ofNullable(mp.getRemarks())
                    .map(r -> r.getRemark())
                    .ifPresent(rmks -> {
                        if (CollectionUtils.isNotEmpty(rmks)) {
                            for (OJRemarkType rmk : rmks) {
                                RefundQualifiersType qualifiers = rmk.getRefundQualifiers();
                                List<RefundQualifierType> refundQualifierList = qualifiers.getRefundQualifier();
                                if (CollectionUtils.isEmpty(refundQualifierList)) {
                                    continue;
                                }
                                String cancelFeesSource = null;
                                String refundApplicationId = null;
                                String automaticCalculate = null;
                                String seatReleaseType = null;
                                //首先获取到公共字段
                                for (RefundQualifierType qualifier : refundQualifierList) {
                                    String desc = qualifier.getQualifierDescription();
                                    String value = qualifier.getQualifierValue();
                                    if ("cancelFeesSource".equals(desc) && cancelFeesSource == null) {
                                        cancelFeesSource = value;
                                    }
                                    if ("refundApplicationID".equals(desc) && refundApplicationId == null) {
                                        refundApplicationId = value;
                                    }
                                    if ("automaticCalculate".equals(desc) && automaticCalculate == null) {
                                        automaticCalculate = value;
                                    }
                                    if ("seatReleaseType".equals(desc) && seatReleaseType == null) {
                                        seatReleaseType = value;
                                    }
                                }

                                for (RefundQualifierType qualifier : refundQualifierList) {
                                    MP_RemarksPo po = new MP_RemarksPo();

                                    po.setSuperPnrId(spnr.getSuperPNRID());
                                    po.setSearchId(mp.getSearchID());
                                    po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                                    po.setActive(Utils.boolean2String(rmk.isActive()));
                                    po.setAuditId(Utils.toWrapperLong(rmk.getAuditID()));
                                    po.setCode(rmk.getCode());
                                    po.setCodeContext(rmk.getCodeContext());
                                    po.setOpsDate(xmlDate2StringWithShanghaiTimezone(rmk.getDate()));
                                    po.setLastModified(xmlDate2StringWithShanghaiTimezone(rmk.getLastModified()));
                                    po.setRph(Utils.toWrapperLong(rmk.getRPH()));

                                    Utils.consumeOrNull(rmk.getAgent(), a -> {
                                        po.setAgent(a.getAgent());
                                        po.setAgentSourceAddress(a.getSourceAddress());
                                        po.setInTimestamp(a.getTimestamp());
                                        //2023-06-21添加
                                        po.setCallSeatUid(a.getAgency());
                                        po.setCallSeatCid(a.getID());
                                        po.setCallSkillTeam(a.getFunctionalGroup());
                                        po.setCallAdsTeam(a.getAdministrativeGroup());
                                    });

                                    po.setCancelFeesSource(cancelFeesSource);
                                    po.setRefundApplicationId(refundApplicationId);
                                    po.setAutomaticCalculate(automaticCalculate);
                                    po.setSeatReleaseType(seatReleaseType);
                                    //设置qualifier的json串
                                    po.setQualifierInfo(Commons.getQualifierInfo(qualifier));

                                    result.add(po);
                                }
                            }
                        }
                    });
        }
        return result;
    }


}
