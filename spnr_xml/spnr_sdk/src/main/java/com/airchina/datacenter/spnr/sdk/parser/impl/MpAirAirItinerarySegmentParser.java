package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirAirItinerary_segmentPo;
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

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithUtcTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpAirAirItinerarySegmentParser </p>
 * <p>Description: MP_AirAirItinerary_segmentPo 的转换器 </p>
 * <p>Sample:  new MpAirAirItinerarySegmentParser(new FieldsArrayStrategy(MP_AirAirItinerary_segmentPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpAirAirItinerarySegmentParser extends AbstractParser {

    public MpAirAirItinerarySegmentParser(SerdeStrategy strategy) {
        super(strategy);
    }

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
                            // 解析MP_AirAirItinerary_segmentPo
                            List<MP_AirAirItinerary_segmentPo> mpAirAirItinerarySegmentPos = parseMpAirAirItinerarySegmentPo(
                                    od, mpMetaInfo, airMetaInfo);
                            result.addAll(mpAirAirItinerarySegmentPos);
                        });
                    });
        }

        return result;
    }

    /**
     * Description: 从OriginDestinationOption节点解析MP_AirAirItinerary_segmentPo
     * Parameter:
     *  @param od: OriginDestinationOption节点, 不能为null
     *  @param mpMetaInfo: 提供了ModularProduct节点的公共属性, 不能为null
     *  @param airMetaInfo: 提供了Air节点的公共属性, 不能为null
     * Return: 解析出的MP_AirAirItinerary_segmentPo集合
     * Throws: 无
     */
    private List<MP_AirAirItinerary_segmentPo> parseMpAirAirItinerarySegmentPo(
            AirItineraryType.OriginDestinationOptions.OriginDestinationOption od,
            final ModularProductMetaInfo mpMetaInfo,
            final AirMetaInfo airMetaInfo) {
        if (CollectionUtils.isEmpty(od.getFlightSegment())) {
            return Collections.emptyList();
        }
        List<MP_AirAirItinerary_segmentPo> result = new LinkedList<>();

        od.getFlightSegment().forEach(seg -> {
            MP_AirAirItinerary_segmentPo po = new MP_AirAirItinerary_segmentPo();
            po.setSuperPnrId(mpMetaInfo.getSpnrId());
            po.setSearchId(mpMetaInfo.getSearchId());
            po.setProductNumber(mpMetaInfo.getProductNumber());
            po.setPnr(airMetaInfo.getPnr());
            po.setOdRph(Utils.toWrapperLong(od.getRPH()));
            po.setFlightSegmentRph(Utils.toWrapperLong(seg.getRPH()));
            po.setInfoSource(seg.getInfoSource());
            po.setModType(seg.getModType());
            po.setOriginalRph(Utils.toWrapperLong(seg.getOriginalRPH()));

            Optional.ofNullable(seg.getDepartureAirport())
                    .ifPresent(d -> {
                        po.setDport(d.getLocationCode());
                        po.setDportContext(d.getCodeContext());
                        po.setDportTerminal(d.getTerminal());
                        po.setDcity(d.getTSCityCode());
                        po.setDcountry(d.getCountryCode());
                    });

            Optional.ofNullable(seg.getArrivalAirport())
                    .ifPresent(a -> {
                        po.setAport(a.getLocationCode());
                        po.setAportContext(a.getCodeContext());
                        po.setAportTerminal(a.getTerminal());
                        po.setAcity(a.getTSCityCode());
                        po.setAcountry(a.getCountryCode());
                    });

            po.setDepartureTime(xmlDate2StringWithUtcTimezone(seg.getDepartureDateTime()));
            po.setOriDepartureTime(seg.getOriginalDepartureDateTime());
            po.setArrivalTime(xmlDate2StringWithUtcTimezone(seg.getArrivalDateTime()));

            Optional.ofNullable(seg.getMarketingAirline()).ifPresent(a -> {
                po.setMarketingFlightNo(Commons.getMarketingFlightNo(seg));
                po.setSingleVendorInd(a.getSingleVendorInd());
            });

            po.setOperatingFlightNo(Commons.getOperatingFlightNo(seg));
            po.setCabinCode(seg.getCabinCode());
            po.setSubclass(seg.getResBookDesigCode());
            po.setStatus(seg.getStatus());
            po.setDuration(seg.getDuration());
            po.setInfantAvailQuantity(Utils.toWrapperLong(seg.getInfantAvailQuantity()));
            po.setMealCode(seg.getMealCode());
            po.setSegmentType(seg.getSegmentType());
            po.setInvControl(seg.getInvControl());
            po.setMileage(seg.getMileage());
            po.setStopQuantity(Utils.toWrapperLong(seg.getStopQuantity()));
            po.setPreCheckin(Utils.boolean2String(seg.isPreCheckin()));
            po.setOnlineCheckin(seg.getOnlineCheckin());

            Utils.getFirstNonNullConsume(seg.getEquipment(), e -> po.setAirEquipType(e.getAirEquipType()));
            po.setStopOver(seg.getStopOver());

            Utils.getFirstNonNullConsume(seg.getStopLocation(), stopLocation -> {
                po.setStoppoint(stopLocation.getLocationCode());
                po.setStopTime(Utils.number2String(stopLocation.getStopTime()));
                po.setStopContext(stopLocation.getCodeContext());
            });

            po.setAvInfo(Commons.getAvInfoJson(seg.getBookingClassAvails()));
            result.add(po);
        });
        return result;
    }

}
