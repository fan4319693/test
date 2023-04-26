package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_BaggagePo;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.ProductBase;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpBaggageParser </p>
 * <p>Description: MP_BaggagePo 的转换器 </p>
 * <p>Sample:  new MpBaggageParser(new FieldsArrayStrategy(MP_BaggagePo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpBaggageParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpBaggageParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_BaggagePo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            ProductBase.ProductBaseBaggage baggage = mp.getBaggage();
            if (baggage == null) {
                continue;
            }

            Optional.ofNullable(baggage.getTicketing())
                    .ifPresent(ticketingInfoTypes -> ticketingInfoTypes.forEach(
                            ticketing -> {
                                MP_BaggagePo po = new MP_BaggagePo();

                                po.setSuperPnrId(spnr.getSuperPNRID());
                                po.setSearchId(mp.getSearchID());
                                po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                                po.setPnr(Commons.getMpPnr(mp));

                                po.setCancelable(Utils.boolean2String(baggage.isCancelable()));
                                po.setQuantity(Utils.toWrapperLong(baggage.getQuantity()));
                                po.setRefundable(Utils.boolean2String(baggage.isRefundable()));
                                po.setIsSegBind(Utils.boolean2String(baggage.isIsSegBind()));

                                Optional.ofNullable(baggage.getOriginDestination())
                                        .ifPresent(od -> {
                                            po.setDepartureCode(od.getDepartureCode());
                                            po.setArrivalCode(od.getArrivalCode());

                                            Optional.ofNullable(od.getService())
                                                    .ifPresent(service -> {
                                                        Optional.ofNullable(service.getBaggage())
                                                                .ifPresent(bag -> {
                                                                    Utils.getFirstNonNullConsume(bag.getMaxWeight(), t -> {
                                                                        po.setMaxWeight(Utils.number2String(t.getValue()));
                                                                        po.setMaxWeightUnit(Utils.applyOrNull(t.getUnit(), a -> a.value()));
                                                                    });
                                                                    Utils.getFirstNonNullConsume(bag.getMaxDimensions(), t -> {
                                                                        po.setMaxDimensionslCm(Utils.number2String(t.getLCM()));
                                                                        po.setMaxDimensionsUnits(Utils.applyOrNull(t.getUnits(), a -> a.value()));
                                                                    });
                                                                });

                                                        Utils.consumeOrNull(service.getTotalAmount(), totalAmount -> {
                                                            po.setAdjusted(Utils.number2String(totalAmount.getAdjusted()));
                                                            po.setAmt(Utils.number2String(totalAmount.getAmount()));
                                                            po.setAmtBeforeTax(Utils.number2String(totalAmount.getAmountBeforeTax()));
                                                            po.setCurrencyCode(totalAmount.getCurrencyCode());
                                                            po.setDecimalPlaces(Utils.number2String(totalAmount.getDecimalPlaces()));
                                                            po.setOriAmtAfterTax(Utils.number2String(totalAmount.getOriginalAmountAfterTax()));
                                                            po.setOriCurrencyCode(totalAmount.getOriginalCurrencyCode());
                                                        });
                                                        //TODO 改为逗号拼接,原来是String.valueOf(List<String>)
                                                        po.setFlightSegmentNumber(Utils.collection2String(service.getFlightSegmentNumber()));
                                                    });
                                        });

                                // TODO: 这里虽然是数组但是xds上显示的确实attribute，取第一条，而且观察数据，如果一个票对应多个航段会生成多条数据相同的
                                Utils.getFirstNonNullConsume(ticketing.getTravelerRefNumber(), num -> {
                                    po.setTravelerRph(Utils.toWrapperLong(num));
                                });
                                Utils.getFirstNonNullConsume(ticketing.getFlightSegmentRefNumber(), num -> {
                                    po.setFlightSegmentRph(Utils.toWrapperLong(num));
                                });
                                po.setGeoIndicator(ticketing.getGeoIndicator());
                                po.setSaleModel(ticketing.getSaleModel());
                                po.setTicketTime(xmlDate2StringWithShanghaiTimezone(ticketing.getTicketTime()));
                                po.setTicketingStatus(ticketing.getTicketingStatus());
                                po.setETicketNumber(ticketing.getETicketNumber());

                                String advisory = Utils.collection2String(ticketing.getTicketAdvisory(),
                                        t -> t.getValue());
                                po.setTicketAdvisory(advisory);

                                Optional.ofNullable(baggage.getCancellationPenalties())
                                        .map(p -> Utils.getFirstNonNull(p.getCancelPenalty()))
                                        .map(p -> p.getAmountPercent())
                                        .map(p -> p.getAmount())
                                        .ifPresent(a -> po.setCancelAmount(Utils.number2String(a)));

                                result.add(po);
                            }
                    ));
        }

        return result;
    }
}
