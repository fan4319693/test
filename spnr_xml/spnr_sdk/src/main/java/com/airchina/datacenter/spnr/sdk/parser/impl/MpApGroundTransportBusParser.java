package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_GroundTransportPo;
import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_GroundTransport_BusPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Constants;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpApGroundTransportBusParser </p>
 * <p>Description: MP_AP_GroundTransport_BusPo 的转换器 </p>
 * <p>Sample:  new MpApGroundTransportBusParser(new FieldsArrayStrategy(MP_AP_GroundTransport_BusPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpApGroundTransportBusParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpApGroundTransportBusParser(SerdeStrategy strategy) {
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
            ProductBase.AncillaryProduct ancillaryProduct = mp.getAncillaryProduct();
            if (ancillaryProduct == null) {
                continue;
            }
            Optional.ofNullable(ancillaryProduct.getGroundTransportService())
                    .map(GroundTransportServiceType::getJourneySegment)
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(segmentList -> {
                        segmentList.forEach(segment -> {
                            // 是空轨联运，不放在空巴联运里面
                            if (segment.getBusSegment() == null) {
                                return;
                            }
                            MP_AP_GroundTransport_BusPo po = new MP_AP_GroundTransport_BusPo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setSearchId(mp.getSearchID());
                            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                            po.setFlightSegmentRph(Utils.toWrapperLong(ancillaryProduct.getFlightSegmentRPH()));
                            //TODO 此处逻辑不明,先取首个,尚未决定
                            Optional.ofNullable(ancillaryProduct.getTravelerInfo())
                                    .map(t -> Utils.getFirstNonNullApply(t.getAirTraveler(), AirTravelerType::getTravelerRefNumber))
                                    .map(AirTravelerType.TravelerRefNumber::getRPH)
                                    .ifPresent(t -> po.setTravelerRph(Utils.toWrapperLong(t)));

                            po.setRph(Utils.toWrapperLong(segment.getRPH()));
                            Utils.consumeOrNull(segment.getBusSegment(), busSegment -> {
                                Optional.ofNullable(busSegment.getDepartureStation())
                                        .map(StationDetailsType::getDetails)
                                        .ifPresent(t -> {
                                            po.setDStationType(t.getLocationCategory());
                                            po.setDStationCode(t.getLocationCode());
                                            po.setDStationName(t.getName());
                                        });

                                Optional.ofNullable(busSegment.getMarketingCompany())
                                                .ifPresent(t -> {
                                                    po.setBusCompanyCode(t.getCode());
                                                    po.setBusCompanyType(t.getCompanyType());
                                                    po.setBusCompanyShortName(t.getCompanyShortName());
                                                });

                                po.setArrivalTimestamp(Utils.xmlDate2StringWithShanghaiTimezone(busSegment.getArrivalDateTime()));
                                po.setDepartmentTimestamp(Utils.xmlDate2StringWithShanghaiTimezone(busSegment.getDepartureDateTime()));
                                Optional.ofNullable(busSegment.getJourneyDuration())
                                                .ifPresent(t -> po.setJourneyDuration(t.toString()));

                                Optional.ofNullable(busSegment.getBusInfo())
                                        .map(BusInfoType::getBus)
                                        .ifPresent(t ->
                                            po.setBusNumber(t.getBusNumber())
                                        );


                                Optional.ofNullable(busSegment.getArrivalStation())
                                        .map(StationDetailsType::getDetails)
                                        .ifPresent(t -> {
                                            po.setAStationType(t.getLocationCategory());
                                            po.setAStationCode(t.getLocationCode());
                                            po.setAStationName(t.getName());
                                        });

                                Optional.ofNullable(busSegment.getBusInfo())
                                        .map(BusInfoType::getValidDate)
                                        .ifPresent(t -> {
                                            po.setStartPeriod(t.getStartPeriod());
                                            po.setEndPeriod(t.getEndPeriod());
                                        });
                            });

                            Utils.getFirstNonNullConsume(segment.getFareOption(), fareOption -> {
                                Optional.ofNullable(fareOption.getAccommodation())
                                        .ifPresent(t -> {
                                            Optional.ofNullable(t.getSeat()).ifPresent(s -> po.setSeatType(s.value()));
                                            Optional.ofNullable(t.getClazz())
                                                    .map(AccommodationClass::getValue)
                                                    .ifPresent(c -> po.setClazz(c.value()));
                                        });

                                //TODO 目前直接加和可能出现问题，目前待定
                                po.setBasicFareAmount(Utils.number2String(Utils.streamNullable(fareOption.getPriceDetail())
                                        .map(RailPriceType::getPriceBreakdown)
                                        .map(RailFareType::getBasicFare)
                                        .mapToDouble(RailFareType.BasicFare::getAmount).sum()));
                                po.setBasicFareCurrencyCode(Utils.stream2String(Utils.streamNullable(fareOption.getPriceDetail())
                                                .map(RailPriceType::getPriceBreakdown)
                                                .map(RailFareType::getBasicFare),
                                        RailFareType.BasicFare::getCurrencyCode,
                                        Constants.JoinByCommaNull2Empty));
                                po.setTotalFareAmount(Utils.number2String(fareOption.getTotalFare().getAmount()));
                                po.setTotalFareCurrencyCode(fareOption.getTotalFare().getCurrencyCode());
                            });


                            result.add(po);
                        });
                    });
        }

        return result;
    }
}
