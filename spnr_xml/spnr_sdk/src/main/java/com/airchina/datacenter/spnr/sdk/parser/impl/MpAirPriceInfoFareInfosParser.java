package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirPriceInfo_FareInfosPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Constants;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpAirPriceInfoFareInfosParser </p>
 * <p>Description: MP_AirPriceInfo_FareInfosPo 的转换器 </p>
 * <p>Sample:  new MpAirPriceInfoFareInfosParser(new FieldsArrayStrategy(MP_AirPriceInfo_FareInfosPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpAirPriceInfoFareInfosParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpAirPriceInfoFareInfosParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AirPriceInfo_FareInfosPo
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
            Utils.getFirstNonNullOptional(air.getPriceInfo())
                    .map(t -> t.getFareInfos())
                    .map(infos -> infos.getFareInfo())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(fareInfoList -> {
                        for (AirItineraryPricingInfoType.FareInfos.FareInfo fareInfo : fareInfoList) {
                            List<FareInfoType.FareInfo> infos = fareInfo.getFareInfo();
                            if (CollectionUtils.isEmpty(infos)) {
                                continue;
                            }
                            infos.forEach(info -> {
                                MP_AirPriceInfo_FareInfosPo po = new MP_AirPriceInfo_FareInfosPo();

                                po.setSuperPnrId(spnr.getSuperPNRID());
                                po.setSearchId(mp.getSearchID());
                                po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                                po.setPnr(Commons.getMpPnr(mp));

                                //TODO 尚未确定取首个还是拼接, 逗号拼接
                                po.setTicketDesignatorCode(Utils.collection2String(fareInfo.getFareReference(),
                                        t -> t.getTicketDesignatorCode())
                                );
                                po.setFlightSegmentRph(Utils.toWrapperLong(fareInfo.getFlightSegmentRPH()));
                                po.setOdRph(Utils.toWrapperLong(fareInfo.getOriginDestinationRPH()));

                                //这里是首个,与上面的逻辑不同
                                Utils.getFirstNonNullConsume(fareInfo.getFareReference(),
                                        ref -> {
                                            po.setCabinCode(ref.getCabinCode());
                                            po.setSubclass(ref.getResBookDesigCode());
                                        });

                                Optional.ofNullable(fareInfo.getFilingAirline())
                                        .ifPresent(filingAirline -> po.setFilingAirlineCode(filingAirline.getCode()));

                                Optional.ofNullable(fareInfo.getDepartureAirport())
                                        .ifPresent(port -> po.setDport(port.getLocationCode()));

                                Optional.ofNullable(fareInfo.getArrivalAirport())
                                        .ifPresent(port -> po.setAport(port.getLocationCode()));

                                po.setFareBasis(info.getFareBasis());
                                po.setDisCount(info.getDisCount());
                                po.setFcPriceInd(Utils.boolean2String(info.isFCPriceInd()));
                                po.setFcRph(Utils.toWrapperLong(info.getFCRPH()));

                                Optional.ofNullable(info.getFare())
                                        .ifPresent(f -> {
                                            po.setOrigPubAmt(Utils.number2String(f.getOrigPubAmount()));
                                            po.setOrigPubCurrencyCode(f.getOrigPubCurrencyCode());
                                            po.setBaseAmt(Utils.number2String(f.getBaseAmount()));
                                            po.setBaseCurrencyCode(f.getCurrencyCode());
                                            po.setDifferFare(Utils.number2String(f.getDifferFare()));
                                            po.setPriceType(f.getPriceType());
                                            po.setReissueAmt(Utils.number2String(f.getReissueAmt()));
                                            po.setReissueFee(Utils.number2String(f.getReissueFee()));
                                            po.setTaxesAmt(Utils.number2String(f.getTaxAmount()));
                                            po.setTotalFare(Utils.number2String(f.getTotalFare()));
                                            Optional.ofNullable(f.getTaxes())
                                                    .ifPresent(t -> {
                                                       t.getTax().forEach(tax -> {
                                                           // 机建费用
                                                           if ("CN".equals(tax.getTaxCode())) {
                                                               po.setTaxAirportFee(tax.getAmount().toString());
                                                               po.setTaxAirportCurrencyCode(tax.getCurrencyCode());
                                                           // 燃油费用
                                                           } else if ("YQ".equals(tax.getTaxCode())) {
                                                               po.setTaxFuelFee(tax.getAmount().toString());
                                                               po.setTaxFuelCurrencyCode(tax.getCurrencyCode());
                                                           }
                                                       });
                                                        po.setTaxDetails(Commons.getTaxDetails(t.getTax()));
                                                    });
                                        });

                                po.setFareBasisCode(info.getFareBasisCode());

                                Utils.getFirstNonNullConsume(info.getPTC(), p -> {
                                    po.setPtcSubType(p.getPTCSubType());
                                    po.setPtcPsgType(p.getPassengerTypeCode());
                                    po.setPtcQuantity(Utils.toWrapperLong(p.getQuantity()));
                                });

                                //原文
                                Optional.ofNullable(fareInfo.getTPAExtensions())
                                        .map(t -> t.getAny())
                                        .filter(CollectionUtils::isNotEmpty)
                                        .ifPresent(eleList -> {
                                            eleList.forEach(ele -> {
                                                String nodeName = ele.getNodeName();
                                                if ("MarketingData".equalsIgnoreCase(nodeName)) {
                                                    NodeList lowestFare = ele.getElementsByTagName("LowestFare");
                                                    if (lowestFare.getLength() > 0) {
                                                        Element item = (Element) lowestFare.item(0);
                                                        po.setLowestFare(item.getAttribute("Amount"));
                                                        po.setLowestFareSubclass(item.getAttribute("Cabin"));
                                                    }
                                                }
                                            });
                                        });

                                Optional.ofNullable(info.getLoyalty())
                                        .map(l -> l.getCombinations())
                                        .map(l -> Utils.getFirstNonNull(l.getCombination()))
                                        .map(c -> c.getEarn())
                                        .ifPresent(e -> {
                                            po.setEarnQuantity(Utils.number2String(e.getQuantity()));
                                        });

                                Optional.ofNullable(fareInfo.getFareFamily())
                                        .ifPresent(family -> {
                                            po.setFareFamilyCode(family.getCode());
                                            po.setFareFamilyName(family.getName());
                                            Optional.ofNullable(family.getAddOns())
                                                    .map(a -> a.getAddOn())
                                                    .filter(CollectionUtils::isNotEmpty)
                                                    .ifPresent(addOnList -> {
                                                        po.setAddOnSort(Utils.collection2String(addOnList, t -> Utils.number2String(t.getSort())));
                                                        //此处用的flatMap
                                                        po.setAddOnSortName(Utils.collectionFlatmap2String(addOnList, t ->
                                                                        Utils.streamNullable(t.getDescription()).map(a -> a.getName()),
                                                                Constants.JoinByCommaNull2Empty));
                                                        //此处用的flatMap
                                                        po.setAddOnCharSet(Utils.collectionFlatmap2String(addOnList, t -> Utils
                                                                .streamNullable(t.getDescription())
                                                                .flatMap(d -> d.getText().stream())
                                                                .map(i -> i.getCharSet()), Constants.JoinByCommaNull2Empty));
                                                    });
                                        });

                                result.add(po);
                            });
                        }
                    });
        }

        return result;
    }
}
