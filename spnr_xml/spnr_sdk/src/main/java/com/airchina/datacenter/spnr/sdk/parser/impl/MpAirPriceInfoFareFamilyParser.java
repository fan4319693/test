package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirPriceInfo_FareFamilyPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpAirPriceInfoFareFamilyParser </p>
 * <p>Description: MP_AirPriceInfo_FareFamilyPo 的转换器 </p>
 * <p>Sample:  new MpAirPriceInfoFareFamilyParser(new FieldsArrayStrategy(MP_AirPriceInfo_FareFamilyPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpAirPriceInfoFareFamilyParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpAirPriceInfoFareFamilyParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AirPriceInfo_FareFamilyPo
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
                    .map(AirItineraryPricingInfoType::getFareInfos)
                    .map(AirItineraryPricingInfoType.FareInfos::getFareInfo)
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(fareInfoList -> {
                        fareInfoList.forEach(fareInfo -> {
                            TPAExtensionsType tpa = fareInfo.getTPAExtensions();
                            if (tpa == null) {
                                return;
                            }
                            MP_AirPriceInfo_FareFamilyPo po = new MP_AirPriceInfo_FareFamilyPo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setSearchId(mp.getSearchID());
                            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                            po.setPnr(Commons.getMpPnr(mp));
                            //逗号拼接
                            po.setTicketDesignatorCode(Utils.collection2String(fareInfo.getFareReference(),
                                    t -> t.getTicketDesignatorCode())
                            );

                            //以下为原代码
                            Utils.streamNullable(tpa.getAny())
                                    .filter(ele -> "FareFamilyInfo".equalsIgnoreCase(ele.getNodeName()))
                                    .findAny()
                                    .ifPresent(element -> {
                                        po.setFareFamilyCode(element.getAttribute("FareFamilyCode"));
                                        po.setFareFamilyName(element.getAttribute("FareFamilyName"));
                                        po.setChdRuleAsYfare(element.getAttribute("CHDRuleAsYFare"));
                                        po.setCabinName(element.getAttribute("CabinName"));
                                        po.setChangeToOpen(element.getAttribute("ChangeToOpen"));
                                        po.setDescription(element.getAttribute("Description"));
                                        po.setDomesticSelfCheckin(element.getAttribute("DomesticSelfCheckin"));
                                        po.setFareBasis(element.getAttribute("FareBasis"));
                                        po.setInfRuleAsYFare(element.getAttribute("INFRuleAsYFare"));
                                        po.setIntlSelfCheckin(element.getAttribute("InternationalSelfCheckin"));
                                        po.setUpgradable(element.getAttribute("Upgradable"));
                                        po.setUserType(element.getAttribute("UserType"));
                                        po.setUsername(element.getAttribute("Username"));

                                        NodeList datechange = element.getElementsByTagName("Datechange");
                                        if (datechange.getLength() > 0) {
                                            List<Element> elementList = Utils.nodeList2Element(datechange);
                                            //TODO 未决定取哪个, 字段类型改为String
                                            po.setChangeAftDeptRate(elementList.stream().map(c -> c.getAttribute("AfterDepartureRate")).collect(Collectors.joining(",")));
                                            po.setChangeBefDeptRate(elementList.stream().map(c -> c.getAttribute("BeforeDepartureRate")).collect(Collectors.joining(",")));
                                            po.setChangeCurrency(elementList.stream().map(c -> c.getAttribute("Currency")).collect(Collectors.joining(",")));
                                            po.setChangePsgType(elementList.stream().map(c -> c.getAttribute("PassengerTypeCode")).collect(Collectors.joining(",")));
                                            po.setChangeTimeThreshold(elementList.stream().map(c -> c.getAttribute("TimeThreshold")).collect(Collectors.joining(",")));
                                            po.setChangeType(elementList.stream().map(c -> c.getAttribute("Type")).collect(Collectors.joining(",")));
                                            po.setChangeVoluntary(elementList.stream().map(c -> c.getAttribute("Voluntary")).collect(Collectors.joining(",")));
                                            po.setChangePolicyCabin(elementList.stream().map(c -> c.getAttribute("PolicyCabin")).collect(Collectors.joining(",")));
                                            po.setChangeStarttime(elementList.stream().map(c -> c.getAttribute("StartTime")).collect(Collectors.joining(",")));
                                            po.setChangeEndtime(elementList.stream().map(c -> c.getAttribute("EndTime")).collect(Collectors.joining(",")));
                                            po.setChangePolicyRbd(elementList.stream().map(c -> c.getAttribute("PolicyRbd")).collect(Collectors.joining(",")));
                                            po.setChangeLimit(elementList.stream().map(c -> c.getAttribute("Limit")).collect(Collectors.joining(",")));
                                        }

                                        NodeList refund = element.getElementsByTagName("Refund");
                                        if (refund.getLength() > 0) {
                                            List<Element> elementList = Utils.nodeList2Element(refund);
                                            po.setRefundAftDeptRate(elementList.stream().map(r -> r.getAttribute("AfterDepartureRate")).collect(Collectors.joining(",")));
                                            po.setRefundBefDeptRate(elementList.stream().map(r -> r.getAttribute("BeforeDepartureRate")).collect(Collectors.joining(",")));
                                            po.setRefundCurrency(elementList.stream().map(r -> r.getAttribute("Currency")).collect(Collectors.joining(",")));
                                            po.setRefundPsgType(elementList.stream().map(r -> r.getAttribute("PassengerTypeCode")).collect(Collectors.joining(",")));
                                            po.setRefundTimeThreshold(elementList.stream().map(r -> r.getAttribute("TimeThreshold")).collect(Collectors.joining(",")));
                                            po.setRefundType(elementList.stream().map(r -> r.getAttribute("Type")).collect(Collectors.joining(",")));
                                            po.setRefundVoluntary(elementList.stream().map(r -> r.getAttribute("Voluntary")).collect(Collectors.joining(",")));
                                            po.setRefundPolicyCabin(elementList.stream().map(r -> r.getAttribute("PolicyCabin")).collect(Collectors.joining(",")));
                                            po.setRefundLimit(elementList.stream().map(r -> r.getAttribute("Limit")).collect(Collectors.joining(",")));
                                            po.setRefundEligible(elementList.stream().map(r -> r.getAttribute("Eligible")).collect(Collectors.joining(",")));
                                            po.setRefundLoyaltyRefundRuleId(elementList.stream().map(r -> r.getAttribute("LoyaltyRefundRuleID")).collect(Collectors.joining(",")));
                                            po.setRefundEndtime(elementList.stream().map(r -> r.getAttribute("EndTime")).collect(Collectors.joining(",")));
                                            po.setRefundStarttime(elementList.stream().map(r -> r.getAttribute("StartTime")).collect(Collectors.joining(",")));
                                            po.setRefundPolicyRbd(elementList.stream().map(r -> r.getAttribute("PolicyRbd")).collect(Collectors.joining(",")));
                                        }
                                    });
                            po.setFlightSegmentRph(Utils.toWrapperLong(fareInfo.getFlightSegmentRPH()));
                            po.setOdRph(Utils.toWrapperLong(fareInfo.getOriginDestinationRPH()));

                            result.add(po);
                        });
                    });
        }

        return result;
    }
}
