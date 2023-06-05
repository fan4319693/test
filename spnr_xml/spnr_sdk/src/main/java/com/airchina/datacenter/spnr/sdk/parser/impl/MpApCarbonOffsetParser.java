package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_Carbon_OffsetPo;
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
public class MpApCarbonOffsetParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpApCarbonOffsetParser(SerdeStrategy strategy) {
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
            Optional.ofNullable(ancillaryProduct.getCarbonOffsets())
                    .map(AirAncillaryOffsetProductType::getCarbonOffset)
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(offsetTypeList -> {
                        offsetTypeList.forEach(offset -> {
                            MP_AP_Carbon_OffsetPo po = new MP_AP_Carbon_OffsetPo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));

                            po.setQuantity(Utils.number2String(offset.getAmount()));
                            po.setQuantity(offset.getUnit().value());

                            Optional.ofNullable(offset.getPrice())
                                    .map(CarbonOffsetType.Price::getBase)
                                    .ifPresent(t -> {
                                            po.setBaseAmount(Utils.number2String(t.getAmount()));
                                            po.setUnitPrice(Utils.number2String(t.getUnitPrice()));
                                            po.setBaseCurrencyCode(t.getCurrencyCode());
                                    });

                            Optional.ofNullable(offset.getPrice())
                                    .map(CarbonOffsetType.Price::getTotal)
                                    .ifPresent(t -> {
                                        po.setAdjustedAmount(Utils.number2String(t.getAdjusted()));
                                        po.setTotalAmount(Utils.number2String(t.getAmount()));
                                        po.setTotalCurrencyCode(t.getCurrencyCode());
                                    });

                            Optional.ofNullable(offset.getPrice())
                                    .map(CarbonOffsetType.Price::getLoyalty)
                                    .map(LoyaltyProductType::getRedemption)
                                    .map(LoyaltyProductType.Redemption::getRedeem)
                                    .ifPresent(t -> {
                                        po.setRedeemedAmount(Utils.number2String(t.getAmountRedeemed()));
                                        po.setQuantity(Utils.number2String(t.getQuantity()));
                                        po.setRedeemedAmountCurrencyCode(t.getCurrencyCode());
                                    });
                            result.add(po);
                        });
                    });
        }

        return result;
    }
}
