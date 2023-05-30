package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_SegmentPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Constants;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithUtcTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpApSegmentParser </p>
 * <p>Description: MP_AP_SegmentPo 的转换器 </p>
 * <p>Sample:  new MpApSegmentParser(new FieldsArrayStrategy(MP_AP_SegmentPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpApSegmentParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpApSegmentParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AP_SegmentPo
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
            AirReservationType air = ancillaryProduct.getAir();
            if (air == null) {
                continue;
            }

            String pnr = Commons.getMpPnr(mp);

            Optional.ofNullable(air.getAirItinerary())
                    .map(t -> t.getOriginDestinationOptions())
                    .map(t -> t.getOriginDestinationOption())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(optionList -> {
                        for (AirItineraryType.OriginDestinationOptions.OriginDestinationOption option : optionList) {
                            List<OriginDestinationOptionType.FlightSegment> segments = option.getFlightSegment();
                            if (CollectionUtils.isEmpty(segments)) {
                                continue;
                            }
                            Long odRph = Utils.toWrapperLong(option.getRPH());
                            segments.forEach(segment -> {
                                MP_AP_SegmentPo po = new MP_AP_SegmentPo();

                                po.setSuperPnrId(spnr.getSuperPNRID());
                                po.setSearchId(mp.getSearchID());
                                po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                                po.setPnr(pnr);
                                po.setOdRph(odRph);
                                po.setFlightSegmentRph(Utils.toWrapperLong(segment.getRPH()));
                                po.setInfoSource(segment.getInfoSource());
                                po.setModType(segment.getModType());
                                po.setFlightNumber(segment.getFlightNumber());
                                po.setOriginalRph(Utils.toWrapperLong(segment.getOriginalRPH()));

                                Optional.ofNullable(segment.getDepartureAirport())
                                        .ifPresent(d -> {
                                            po.setDport(d.getLocationCode());
                                            po.setDportContext(d.getCodeContext());
                                            po.setDportTerminal(d.getTerminal());
                                            po.setDcity(d.getTSCityCode());
                                            po.setDcountry(d.getCountryCode());
                                        });

                                Optional.ofNullable(segment.getArrivalAirport())
                                        .ifPresent(a -> {
                                            po.setAport(a.getLocationCode());
                                            po.setAportContext(a.getCodeContext());
                                            po.setAportTerminal(a.getTerminal());
                                            po.setAcity(a.getTSCityCode());
                                            po.setAcountry(a.getCountryCode());
                                        });

                                po.setDepartureTime(xmlDate2StringWithUtcTimezone(segment.getDepartureDateTime()));
                                po.setOriDepartureTime(segment.getOriginalDepartureDateTime());
                                po.setArrivalTime(xmlDate2StringWithUtcTimezone(segment.getArrivalDateTime()));

                                Utils.consumeOrNull(segment.getMarketingAirline(), t -> {
                                    po.setMarketingFlightNo(Commons.getMarketingFlightNo(segment));
                                    po.setSingleVendorInd(t.getSingleVendorInd());
                                });

                                po.setOperatingFlightNo(Commons.getOperatingFlightNo(segment));
                                po.setCabinCode(segment.getCabinCode());
                                po.setSubclass(segment.getResBookDesigCode());
                                po.setStatus(segment.getStatus());
                                po.setDuration(segment.getDuration());
                                po.setInfantAvailQuantity(Utils.toWrapperLong(segment.getInfantAvailQuantity()));
                                po.setMealCode(segment.getMealCode());
                                po.setSegmentType(segment.getSegmentType());
                                po.setInvControl(segment.getInvControl());
                                po.setMileage(segment.getMileage());
                                po.setStopQuantity(Utils.toWrapperLong(segment.getStopQuantity()));
                                po.setPreCheckin(Utils.boolean2String(segment.isPreCheckin()));
                                po.setOnlineCheckin(segment.getOnlineCheckin());

                                Utils.getFirstNonNullConsume(segment.getEquipment(), e -> po.setAirEquipType(e.getAirEquipType()));
                                po.setStopOver(segment.getStopOver());

                                Utils.getFirstNonNullConsume(segment.getStopLocation(), t -> {
                                    po.setStoppoint(t.getLocationCode());
                                    po.setStopContext(t.getCodeContext());
                                    po.setStopTime(Utils.number2String(t.getStopTime()));
                                });
                                po.setAvInfo(Commons.getAvInfoJson(segment.getBookingClassAvails()));

                                po.setDirectionInd(air.getAirItinerary().getDirectionInd().toString());
                                po.setOdOpenJaw(option.getOpenjaw());
                                List<TicketingFullInfoType> collect = Utils.streamNullable(air.getTicketing()).filter(t -> Utils.getFirstNonNullApply(t.getFlightSegmentRefNumber(), Utils::toWrapperLong) == po.getFlightSegmentRph()).collect(Collectors.toList());
                                po.setETicketNumber(Utils.getFirstNonNull(collect).getETicketNumber());
                                po.setTicketingStatus(Utils.getFirstNonNull(collect).getTicketingStatus());
                                po.setTicketTime(xmlDate2StringWithUtcTimezone(Utils.getFirstNonNull(collect).getTicketTime()));

                                result.add(po);
                            });
                        }
                    });
        }

        return result;
    }
}
