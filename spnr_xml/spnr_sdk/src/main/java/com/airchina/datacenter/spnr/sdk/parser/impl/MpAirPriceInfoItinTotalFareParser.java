package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirPriceInfo_ItinTotalFarePo;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.ProductBase;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpAirPriceInfoItinTotalFareParser </p>
 * <p>Description: MP_AirPriceInfo_ItinTotalFarePo 的转换器 </p>
 * <p>Sample:  new MpAirPriceInfoItinTotalFareParser(new FieldsArrayStrategy(MP_AirPriceInfo_ItinTotalFarePo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpAirPriceInfoItinTotalFareParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpAirPriceInfoItinTotalFareParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AirPriceInfo_ItinTotalFarePo
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

            //TODO 此处与原来粒度不同,原为priceInfo粒度,1->1 itinTotalFare粒度,可以
            Utils.getFirstNonNullConsume(air.getPriceInfo(), priceInfo -> {
                Optional.ofNullable(priceInfo.getItinTotalFare())
                        .ifPresent(itinTotalFare -> {
                            MP_AirPriceInfo_ItinTotalFarePo po = new MP_AirPriceInfo_ItinTotalFarePo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setSearchId(mp.getSearchID());
                            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                            po.setPnr(Commons.getMpPnr(mp));
                            po.setPricingSource(Utils.applyOrNull(priceInfo.getPricingSource(), t -> t.value()));
                            po.setFareFamilyCode(priceInfo.getFareFamilyCode());
                            po.setFareFamilyName(priceInfo.getFareFamilyName());
                            po.setPriceQuoteDate(priceInfo.getPriceQuoteDate());

                            Optional.ofNullable(itinTotalFare.getBaseFare())
                                    .ifPresent(fare -> {
                                        po.setBaseFareAdjusted(Utils.number2String(fare.getAdjusted()));
                                        po.setBaseFareAmt(Utils.number2String(fare.getAmount()));
                                        po.setBaseFareCurrencyCode(fare.getCurrencyCode());
                                        po.setBaseFareOriAmt(Utils.number2String(fare.getOriginalAmount()));
                                        po.setBaseFareOriCurrencyCode(fare.getOriginalCurrencyCode());
                                    });

                            Optional.ofNullable(itinTotalFare.getTaxes())
                                    .ifPresent(t -> {
                                        po.setTaxDetails(Commons.getTaxDetails(t.getTax()));
                                    });

                            Optional.ofNullable(itinTotalFare.getTotalFare())
                                    .ifPresent(fare -> {
                                        po.setTotalFareAdjusted(fare.getAdjusted());
                                        po.setTotalFareAmt(Utils.number2String(fare.getAmount()));
                                        po.setTotalFareCurrencyCode(fare.getCurrencyCode());
                                        po.setTotalFareOriAmt(Utils.number2String(fare.getOriginalAmount()));
                                        po.setTotalFareOriCurrencyCode(fare.getOriginalCurrencyCode());
                                    });

                            result.add(po);
                        });
            });
        }

        return result;
    }
}
