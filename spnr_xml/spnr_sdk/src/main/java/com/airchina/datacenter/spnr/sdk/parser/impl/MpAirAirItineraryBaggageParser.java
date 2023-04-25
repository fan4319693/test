package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirAirItinerary_BaggagePo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.parser.bean.AirMetaInfo;
import com.airchina.datacenter.spnr.sdk.parser.bean.ModularProductMetaInfo;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpAirAirItineraryBaggageParser </p>
 * <p>Description: MP_AirAirItinerary_BaggagePo 的转换器 </p>
 * <p>Sample:  new MpAirAirItineraryBaggageParser(new FieldsArrayStrategy(MP_AirAirItinerary_BaggagePo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpAirAirItineraryBaggageParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpAirAirItineraryBaggageParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AirAirItinerary_BaggagePo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            ProductBase.Air air = mp.getAir();
            if (air == null) {
                continue;
            }

            ModularProductMetaInfo mpMetaInfo = new ModularProductMetaInfo(spnr.getSuperPNRID(),
                    mp.getSearchID(),
                    Utils.toWrapperLong(mp.getProductNumber()));

            AirMetaInfo airMetaInfo = Commons.deriveAirMetaInfo(air);

            Optional.ofNullable(air.getAirItinerary())
                    .map(AirItineraryType::getOriginDestinationOptions)
                    .map(AirItineraryType.OriginDestinationOptions::getOriginDestinationOption)
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(odList -> {
                        odList.forEach(od -> {
                            // 解析MP_AirAirItineraryBaggagePo
                            List<MP_AirAirItinerary_BaggagePo> po = parseMpAirAirItineraryBaggage(od, mpMetaInfo, airMetaInfo);
                            result.addAll(po);
                        });
                    });
        }

        return result;
    }

    /**
     * Description: 从OriginDestinationOption节点解析MP_AirAirItinerary_baggagePo
     * Parameter:
     *  @param od: OriginDestinationOption节点, 不能为null
     *  @param mpMetaInfo: 提供了ModularProduct节点的公共属性, 不能为null
     *  @param airMetaInfo: 提供了Air节点的公共属性, 不能为null
     * Return: 解析出的MP_AirAirItinerary_baggagePo集合
     * Throws: 无
     */
    private List<MP_AirAirItinerary_BaggagePo> parseMpAirAirItineraryBaggage(
            AirItineraryType.OriginDestinationOptions.OriginDestinationOption od,
            final ModularProductMetaInfo mpMetaInfo,
            final AirMetaInfo airMetaInfo) {

        if (CollectionUtils.isEmpty(od.getBaggage())) {
            return Collections.emptyList();
        }
        List<MP_AirAirItinerary_BaggagePo> results = new LinkedList<>();
        od.getBaggage().forEach(baggage -> {
            MP_AirAirItinerary_BaggagePo po = new MP_AirAirItinerary_BaggagePo();
            po.setSuperPnrId(mpMetaInfo.getSpnrId());
            po.setSearchId(mpMetaInfo.getSearchId());
            po.setProductNumber(mpMetaInfo.getProductNumber());
            po.setPnr(airMetaInfo.getPnr());
            po.setOdRph(Utils.toWrapperLong(od.getRPH()));
            po.setBaggageRph(Utils.toWrapperLong(baggage.getBaggageRPH()));
            po.setFlighSegmentRph(Utils.toWrapperLong(baggage.getFlightSegmentRPH()));
            po.setPieces(Utils.toWrapperLong(baggage.getPieces()));
            po.setTravelerRph(Utils.toWrapperLong(baggage.getTravelerRPH()));
            po.setPricingRph(Utils.toWrapperLong(baggage.getPricingRPH()));

            Optional.ofNullable(baggage.getWeight())
                    .ifPresent(weight -> {
                        po.setWeight(Utils.number2String(weight.getWeight()));
                        Utils.consumeOrNull(weight.getUnit(), u -> {
                            po.setWeightUnit(u.value());
                        });
                    });

            Optional.ofNullable(baggage.getSize()).ifPresent(size -> {
                po.setSizeCode(size.getCode());
                po.setSizeDescription(size.getDescription());
                po.setSizeHeight(Utils.number2String(size.getHeight()));
                po.setSizeLength(Utils.number2String(size.getLength()));
                po.setSizeWidth(Utils.number2String(size.getWidth()));
            });

            Optional.ofNullable(baggage.getSpecialItem()).ifPresent(specialItem -> {
                po.setSpecialItemCode(specialItem.getCode());
                po.setSpecialItemContext(specialItem.getCodeContext());
                po.setSpecialItemUri(specialItem.getURI());
            });
            //抄的原文
            Optional.ofNullable(baggage.getTPAExtensions())
                    .map(TPAExtensionsType::getAny)
                    .ifPresent(elementList -> {
                        Utils.streamNullable(elementList)
                                .filter(e -> "isFPC".equalsIgnoreCase(e.getNodeName()))
                                .findAny()
                                .ifPresent(e -> po.setIsFpc(e.getNodeValue()));

                        Utils.streamNullable(elementList)
                                .filter(e -> "PassageType".equalsIgnoreCase(e.getNodeName()))
                                .findAny()
                                .ifPresent(e -> po.setPassageTypeCode(e.getAttribute("Code")));
                    });

            results.add(po);
        });
        return results;
    }
}
