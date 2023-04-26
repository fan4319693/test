package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirAirItineraryPo;
import com.airchina.datacenter.spnr.sdk.entity.AirItineraryType;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.ProductBase;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.parser.bean.AirMetaInfo;
import com.airchina.datacenter.spnr.sdk.parser.bean.ModularProductMetaInfo;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpAirAirItineraryParser </p>
 * <p>Description: MP_AirAirItineraryPo 的转换器 </p>
 * <p>Sample:  new MpAirAirItineraryParser(new FieldsArrayStrategy(MP_AirAirItineraryPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpAirAirItineraryParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpAirAirItineraryParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AirAirItineraryPo
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
                            // 解析MP_AirAirItineraryPo
                            MP_AirAirItineraryPo po = parseMPAirAirItinerary(od, mpMetaInfo, airMetaInfo);
                            result.add(po);
                        });
                    });
        }

        return result;
    }

    /**
     * Description: 从OriginDestinationOption节点解析MP_AirAirItineraryPo
     * Parameter:
     *  @param od: OriginDestinationOption节点, 不能为null
     *  @param mpMetaInfo: 提供了ModularProduct节点的公共属性, 不能为null
     *  @param airMetaInfo: 提供了Air节点的公共属性, 不能为null
     * Return: MP_AirAirItineraryPo实体
     * Throws: 无
     */
    private MP_AirAirItineraryPo parseMPAirAirItinerary(
            final AirItineraryType.OriginDestinationOptions.OriginDestinationOption od,
            final ModularProductMetaInfo mpMetaInfo,
            AirMetaInfo airMetaInfo) {

        MP_AirAirItineraryPo po = new MP_AirAirItineraryPo();

        po.setSuperPnrId(mpMetaInfo.getSpnrId());
        po.setSearchId(mpMetaInfo.getSearchId());
        po.setProductNumber(mpMetaInfo.getProductNumber());
        po.setPnr(airMetaInfo.getPnr());
        po.setDirectionInd(airMetaInfo.getDirectionInd());
        po.setDocRequired(airMetaInfo.getDocRequired());
        po.setOdRph(Utils.toWrapperLong(od.getRPH()));
        po.setOdMajorityCarrier(od.getMajorityCarrier());
        po.setBookingChannel(od.getBookingChannel());
        po.setOdOpenjaw(od.getOpenjaw());
        po.setOdDuration(od.getDuration());
        po.setInfantAvailQuantity(Utils.toWrapperLong(od.getInfantAvailQuantity()));
        po.setMarketingFlightNum(od.getMarketingFlightNum());
        return po;
    }
}
