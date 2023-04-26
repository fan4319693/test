package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.SuperPNRPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

import java.util.List;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;
import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithUtcTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SuperPnrParser </p>
 * <p>Description: SuperPNRPo 的转换器 </p>
 * <p>Sample:  new SuperPnrParser(new FieldsArrayStrategy(SuperPNRPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SuperPnrParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public SuperPnrParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为SuperPNRPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        SuperPNRPo po = new SuperPNRPo();

        po.setSuperPnrId(spnr.getSuperPNRID());
        po.setBookingDate(xmlDate2StringWithShanghaiTimezone(spnr.getBookingDate()));
        po.setProcessingStatus(Utils.applyOrNull(spnr.getProcessingStatus(), t -> t.value()));
        po.setBookingStatus(spnr.getBookingStatus());
        po.setTsBookingStatus(spnr.getTSBookingStatus());
        po.setStartDate(xmlDate2StringWithUtcTimezone(spnr.getStartDate()));
        po.setEndDate(xmlDate2StringWithUtcTimezone(spnr.getEndDate()));
        po.setDestination(spnr.getDestination());
        po.setSummary(Utils.boolean2String(spnr.isSummary()));
        po.setTkCancelType(spnr.getTKCancelType());
        po.setCancellationDate(xmlDate2StringWithShanghaiTimezone(spnr.getCancellationDate()));
        po.setFullHistory(Utils.boolean2String(spnr.isFullHistory()));
        po.setLastAuditId((Utils.toWrapperLong(spnr.getLastAuditID())));
        po.setLastModified(xmlDate2StringWithShanghaiTimezone(spnr.getLastModified()));
        po.setSchemaVersion(spnr.getSchemaVersion());
        po.setSourceAddress(spnr.getSourceAddress());
        po.setCancelTimeLimit(xmlDate2StringWithShanghaiTimezone(spnr.getCancelTimeLimit()));
        po.setCryptoVersion(Utils.number2String(spnr.getCryptoVersion()));
        result.add(po);

        return result;
    }
}
