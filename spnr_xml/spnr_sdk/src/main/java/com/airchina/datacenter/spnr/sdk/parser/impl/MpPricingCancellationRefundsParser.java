package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_Pricing_CancellationRefundsPo;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpPricingCancellationRefundsParser </p>
 * <p>Description: MP_Pricing_CancellationRefundsPo 的转换器 </p>
 * <p>Sample:  new MpPricingCancellationRefundsParser(new FieldsArrayStrategy(MP_Pricing_CancellationRefundsPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpPricingCancellationRefundsParser extends AbstractParser {

    public MpPricingCancellationRefundsParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            Optional.ofNullable(mp.getPricing())
                    .map(p -> p.getCancellationRefunds())
                    .map(r -> r.getCancellationRefund())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(refundList -> refundList.forEach(
                            refund -> {
                                MP_Pricing_CancellationRefundsPo po = new MP_Pricing_CancellationRefundsPo();

                                po.setSuperPnrId(spnr.getSuperPNRID());
                                po.setSearchId(mp.getSearchID());
                                po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                                po.setAllowAuto(refund.getAllowAuto());
                                po.setAmt(Utils.number2String(refund.getAmount()));
                                po.setCurrencyCode(refund.getCurrencyCode());
                                po.setAuditId(Utils.toWrapperLong(refund.getAuditID()));
                                po.setFlightSegmentRph(Utils.toWrapperLong(refund.getFlightSegmentRPH()));
                                po.setMasterProductNumber(Utils.toWrapperLong(refund.getMasterProductNumber()));
                                po.setOjSuperPnrRph(Utils.toWrapperLong(refund.getOJSuperPNRRPH()));
                                po.setCancelRefundProductNumber(Utils.toWrapperLong(refund.getProductNumber()));
                                po.setProductType(refund.getProductType());
                                Utils.getFirstNonNullConsume(refund.getTicketing(), ticket -> {
                                    po.seteTicketNumber(ticket.getETicketNumber());

                                    Optional.ofNullable(ticket.getPricingInfo())
                                            .map(p -> p.getBaseFare())
                                            .ifPresent(fare -> {
                                                po.setBaseFareAmt(Utils.number2String(fare.getAmount()));
                                                po.setBaseFareRefundAmt(Utils.number2String(fare.getRefundAmount()));
                                            });

                                    Optional.ofNullable(ticket.getPricingInfo())
                                            .map(p -> p.getTaxes())
                                            .map(t -> t.getTax())
                                            .ifPresent(taxes ->
                                                    po.setTaxesRefund(Commons.getTaxDetails(taxes))
                                            );
                                });

                                Utils.consumeOrNull(refund.getAgent(), agent -> {
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
