package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_AmendmentFeePo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrAmendmentFeeParser </p>
 * <p>Description: Spnr_AmendmentFeePo 的转换器 </p>
 * <p>Sample:  new SpnrAmendmentFeeParser(new FieldsArrayStrategy(Spnr_AmendmentFeePo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrAmendmentFeeParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public SpnrAmendmentFeeParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为Spnr_AmendmentFeePo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        Optional.ofNullable(spnr.getPricing())
                .map(t -> t.getAmendmentFees())
                .map(t -> t.getAmendmentFee())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(feeList -> {
                    feeList.forEach(fee -> {
                        Spnr_AmendmentFeePo po = new Spnr_AmendmentFeePo();

                        po.setSuperPnrId(spnr.getSuperPNRID());
                        po.setProductNumber(Utils.toWrapperLong(fee.getProductNumber()));
                        po.setAmt(Utils.number2String(fee.getAmount()));
                        po.setCurrencyCode(fee.getCurrencyCode());
                        po.setOpsDate(xmlDate2StringWithShanghaiTimezone(fee.getDate()));
                        po.setAuditId(Utils.toWrapperLong(fee.getAuditID()));
                        po.setManual(Utils.boolean2String(fee.isManual()));
                        po.setMasterProductNumber(Utils.toWrapperLong(fee.getMasterProductNumber()));
                        po.setReplacedBy(fee.getReplacedBy());
                        po.setDescription(fee.getDescription());
                        result.add(po);
                    });
                });

        return result;
    }
}
