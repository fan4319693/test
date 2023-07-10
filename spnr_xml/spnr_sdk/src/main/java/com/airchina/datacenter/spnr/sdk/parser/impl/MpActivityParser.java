package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Mp_ActivityPo;
import com.airchina.datacenter.spnr.sdk.dao.pojo.Mp_Activity_VehiclePo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpActivityParser </p>
 * <p>Description: Mp_ActivityPo 的转换器 </p>
 * <p>Sample:  new MpActivityParser(new FieldsArrayStrategy(Mp_ActivityPo.class)) </p>
 * <p>Author: ZML </p>
 * <p>Date: 2023/7/10 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpActivityParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpActivityParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AP_GroundTransport_BusPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            Optional.ofNullable(mp.getActivity())
                    .map(ProductBase.Activity::getDestActivityDescriptiveContent)
                    .ifPresent( contentType -> {
                        Mp_ActivityPo po = new Mp_ActivityPo();
                        po.setSuperPnrId(spnr.getSuperPNRID());
                        po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                        po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                        po.setProductId(contentType.getReference());
                        po.setProductCode(contentType.getCode());
                        po.setProductName(contentType.getName());

                        po.setCurrencyCode(contentType.getCurrencyCode());
                        po.setAirport(contentType.getEventCityCode());
                        po.setIsInventoryControl(contentType.isIsInventoryPerPTCType());
                        po.setIsTaxIncluded(contentType.isIsTaxIncluded());

                        po.setDesItemType(String.valueOf(contentType.getItemType()));

                        Optional.ofNullable(contentType.getAddresses())
                                .map(AddressesType::getAddress)
                                .ifPresent(addresses -> addresses.forEach(address ->  {
                                    if (address.getUseType().equals("1")) {
                                        Utils.getFirstNonNullConsume(address.getAddressLine(), l -> po.setDepAddress(l.getValue()));
                                        Utils.consumeOrNull(address.getPosition(), p -> {
                                            po.setDepLongitude(p.getLongitude());
                                            po.setDepLatitude(p.getLatitude());
                                        });
                                        Utils.consumeOrNull(address.getCityName(), po::setDepCity);
                                    } else {
                                        Utils.getFirstNonNullConsume(address.getAddressLine(), l -> po.setArrAddress(l.getValue()));
                                        Utils.consumeOrNull(address.getPosition(), p -> {
                                            po.setArrLongitude(p.getLongitude());
                                            po.setArrLatitude(p.getLatitude());
                                        });
                                        Utils.consumeOrNull(address.getCityName(), po::setArrCity);
                                    }
                                }));

                        Optional.ofNullable(contentType.getCategories())
                                .ifPresent(eventCategoriesType -> {
                                    Utils.getFirstNonNullConsume(eventCategoriesType.getCategory(), category -> {
                                        po.setMultiCity(category.getCode());
                                        po.setPickupType(category.getSubCode());
                                    });
                                });

                        Optional.ofNullable(contentType.getPolicies())
                            .map(PoliciesType::getPolicy)
                            .ifPresent(policies -> {
                                Utils.getFirstNonNullConsume(policies, policy -> {
                                    Utils.getFirstNonNullConsume(policy.getBookPolicy().getBookRestriction(), r -> {
                                        Optional.ofNullable(r.getDistance())
                                                .ifPresent(d -> {
                                                    po.setFreeMile(Utils.number2String(d.getQuantity()));
                                                    po.setFreeMileUnit(d.getUnit());
                                                });
                                    });

                                    JsonObject cancel = new JsonObject();
                                    Utils.getFirstNonNullConsume(policy.getCancelPolicy(), c -> {
                                        c.getCancelPenalty().forEach(p -> {
                                            JsonObject penalty = new JsonObject();
                                            penalty.addProperty("deadlineTime", p.getDeadline().getOffsetUnitMultiplier());
                                            penalty.addProperty("deadlineUnit", p.getDeadline().getOffsetTimeUnit());
                                            penalty.addProperty("amt", p.getAmountPercent().getAmount());
                                            cancel.addProperty(p.getPolicyCode(), penalty.toString());
                                        });
                                    } );
                                    po.setCancelPenalty(cancel.toString());

                                    JsonObject extra = new JsonObject();
                                    Utils.consumeOrNull(policy.getExtraChargePolicy(), c -> {
                                        c.getExtraChargePenalty().forEach(p -> {
                                            JsonObject penalty = new JsonObject();
                                            penalty.addProperty("type", p.getTimeSlotCharge().getChargeType());
                                            penalty.addProperty("start", p.getTimeSlotCharge().getStart());
                                            penalty.addProperty("end", p.getTimeSlotCharge().getEnd());
                                            penalty.addProperty("unit", p.getTimeSlotCharge().getUnit());
                                            penalty.addProperty("amt", p.getTimeSlotCharge().getAmountPercent().getAmount());
                                            extra.addProperty(p.getPolicyCode(), penalty.toString());
                                        });
                                        po.setExtraPenalty(extra.toString());
                                    } );
                                });
                            });
                        result.add(po);
                        });
        }
        return result;
    }
}
