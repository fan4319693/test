package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirPriceInfo_PTCsPo;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.ProductBase;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpAirPriceInfoPTCsParser </p>
 * <p>Description: MP_AirPriceInfo_PTCsPo 的转换器 </p>
 * <p>Sample:  new MpAirPriceInfoPTCsParser(new FieldsArrayStrategy(MP_AirPriceInfo_PTCsPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpAirPriceInfoPTCsParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpAirPriceInfoPTCsParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AirPriceInfo_PTCsPo
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
                    .map(priceInfo -> priceInfo.getPTCFareBreakdowns())
                    .map(b -> b.getPTCFareBreakdown())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(ptcs -> {
                        ptcs.forEach(ptc -> {
                            MP_AirPriceInfo_PTCsPo po = new MP_AirPriceInfo_PTCsPo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setSearchId(mp.getSearchID());
                            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                            po.setPnr(Commons.getMpPnr(mp));

                            Optional.ofNullable(ptc.getPassengerTypeQuantity())
                                    .ifPresent(q -> {
                                        po.setPassengerTypeCode(q.getCode());
                                        po.setPtcSubType(q.getPTCSubType());
                                        po.setQuantity(Utils.toWrapperLong(q.getQuantity()));
                                    });

                            Optional.ofNullable(ptc.getPassengerFare())
                                    .ifPresent(pf -> {
                                        Optional.ofNullable(pf.getBaseFare())
                                                .ifPresent(bf -> {
                                                    po.setBaseFareAdjusted(Utils.number2String(bf.getAdjusted()));
                                                    po.setBaseFareAmt(Utils.number2String(bf.getAmount()));
                                                    po.setBaseFareCurrencyCode(bf.getCurrencyCode());
                                                    po.setBaseFareOriAmt(Utils.number2String(bf.getOriginalAmount()));
                                                    po.setBaseFareOriCurrencyCode(bf.getOriginalCurrencyCode());
                                                });
                                        Optional.ofNullable(pf.getTaxes()).ifPresent(t -> {
                                            po.setTaxDetails(Commons.getTaxDetails(t.getTax()));
                                        });

                                        Optional.ofNullable(pf.getPriceAdjustments())
                                                .ifPresent(a -> {
                                                    po.setPriceAdjustmentsAmt(Utils.number2String(a.getAmount()));
                                                    po.setPriceAdjustmentsCurrencyCode(a.getCurrencyCode());
                                                });

                                        Optional.ofNullable(pf.getTotalFare())
                                                .ifPresent(t -> {
                                                    po.setTotalFareAdjusted(t.getAdjusted());
                                                    po.setTotalFareAmt(Utils.number2String(t.getAmount()));
                                                    po.setTotalFareCurrencyCode(t.getCurrencyCode());
                                                    po.setTotalFareOriAmt(Utils.number2String(t.getOriginalAmount()));
                                                    po.setTotalFareOriCurrencyCode(t.getOriginalCurrencyCode());
                                                });

                                        //原文
                                        Optional.ofNullable(pf.getTPAExtensions())
                                                .map(t -> t.getAny())
                                                .ifPresent(eleList -> {
                                                    eleList.forEach(element -> {
                                                        String eName = element.getNodeName();
                                                        String value = element.getTextContent();
                                                        switch (eName) {
                                                            case "FcPNRString":
                                                                po.setFcPnrString(value);
                                                                break;
                                                            case "FcString":
                                                                po.setFcString(value);
                                                                break;
                                                            case "FnString":
                                                                po.setFnString(value);
                                                                break;
                                                            case "FcAVString":
                                                                po.setFcAvstring(value);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    });
                                                });
                                    });

                            Optional.ofNullable(ptc.getEndorsements())
                                    .map(e -> Utils.getFirstNonNull(e.getEndorsement()))
                                    .ifPresent(e -> {
                                        po.setCharSet(e.getCharSet());
                                    });

                            result.add(po);
                        });
                    });
        }
        return result;
    }
}
