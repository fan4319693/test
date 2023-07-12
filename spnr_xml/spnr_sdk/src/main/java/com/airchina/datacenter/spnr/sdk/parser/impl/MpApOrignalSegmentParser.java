package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_Original_SegmentPo;
import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirAirItinerary_SegmentPo;
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
 * <p>Description: MP_AirAirItinerary_SegmentPo 的转换器 </p>
 * <p>Sample:  new MpAirAirItinerarySegmentParser(new FieldsArrayStrategy(MP_AirAirItinerary_SegmentPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpApOrignalSegmentParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpApOrignalSegmentParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AirAirItinerary_SegmentPo
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

            MP_AP_Original_SegmentPo po = new MP_AP_Original_SegmentPo();


            Utils.getFirstNonNullOptional(ancillaryProduct.getOriginalFlightSegment())
                            .ifPresent(t -> {
                                po.setSuperPnrId(spnr.getSuperPNRID());
                                po.setSuperPnrId(Utils.number2String(mp.getProductNumber()));
                                po.setFlightSegmentRph(ancillaryProduct.getFlightSegmentRPH());
                                po.setOriginalRph(t.getOriginalRPH());
                                po.setOriginalRph(t.getModType());
                                po.setOriginalRph(t.getOriginalRPH());
                                po.setCabinCode(t.getCabinCode());
                                po.setSubclass(t.getResBookDesigCode());

                                Optional.ofNullable(t.getDepartureAirport())
                                        .ifPresent(d -> {
                                            po.setDport(d.getLocationCode());
                                            po.setDportContext(d.getCodeContext());
                                            po.setDportTerminal(d.getTerminal());
                                            po.setDcity(d.getTSCityCode());
                                            po.setDcountry(d.getCountryCode());
                                        });

                                Optional.ofNullable(t.getArrivalAirport())
                                        .ifPresent(d -> {
                                            po.setDport(d.getLocationCode());
                                            po.setDportContext(d.getCodeContext());
                                            po.setDportTerminal(d.getTerminal());
                                            po.setDcity(d.getTSCityCode());
                                            po.setDcountry(d.getCountryCode());
                                        });
                            });

            result.add(po);
        }
        return result;
    }
}
