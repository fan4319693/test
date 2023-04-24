package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_Pricing_CancellationFeesPo;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
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
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpPricingCancellationFeesParser </p>
 * <p>Description: MP_Pricing_CancellationFeesPo 的转换器 </p>
 * <p>Sample:  new MpPricingCancellationFeesParser(new FieldsArrayStrategy(MP_Pricing_CancellationFeesPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpPricingCancellationFeesParser extends AbstractParser {

    public MpPricingCancellationFeesParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            Optional.ofNullable(mp.getPricing())
                    .map(p -> p.getCancellationFees())
                    .map(a -> a.getCancellationFee())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(feeList -> feeList.forEach(fee -> {
                        MP_Pricing_CancellationFeesPo po = new MP_Pricing_CancellationFeesPo();

                        po.setSuperPnrId(spnr.getSuperPNRID());
                        po.setSearchId(mp.getSearchID());
                        po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                        po.setOjSuperPnrRph(Utils.toWrapperLong(fee.getOJSuperPNRRPH()));
                        po.setAmt(Utils.number2String(fee.getAmount()));
                        po.setCurrencyCode(fee.getCurrencyCode());
                        po.setAuditId(Utils.toWrapperLong(fee.getAuditID()));
                        po.setFlightSegmentRph(Utils.toWrapperLong(fee.getFlightSegmentRPH()));
                        po.setAddedDate(xmlDate2StringWithShanghaiTimezone(fee.getDate()));
                        po.setMasterProductNumber(Utils.toWrapperLong(fee.getMasterProductNumber()));
                        po.setPercentage(Utils.number2String(fee.getPercentage()));
                        po.setCancelProductNumber(Utils.toWrapperLong(fee.getProductNumber()));
                        po.setProductType(fee.getProductType());

                        Utils.consumeOrNull(fee.getAgent(), agent -> {
                            po.setAgent(agent.getAgent());
                            po.setAgentUrl(agent.getURL());
                            po.setAgency(agent.getAgency());
                            po.setAgentId(agent.getID());
                            po.setAgentFunctionalGroup(agent.getFunctionalGroup());
                            po.setAgentAdministrativeGroup(agent.getAdministrativeGroup());
                        });
                        result.add(po);
                    }));
        }

        return result;
    }
}
