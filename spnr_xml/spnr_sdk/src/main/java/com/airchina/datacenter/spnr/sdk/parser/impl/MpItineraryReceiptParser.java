package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_ItineraryReceiptPo;
import com.airchina.datacenter.spnr.sdk.entity.ItineraryReceiptProductType;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpItineraryReceiptParser </p>
 * <p>Description: MP_ItineraryReceiptPo 的转换器 </p>
 * <p>Sample:  new MpItineraryReceiptParser(new FieldsArrayStrategy(MP_ItineraryReceiptPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpItineraryReceiptParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpItineraryReceiptParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_ItineraryReceiptPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            ItineraryReceiptProductType receipt = mp.getItineraryReceipt();
            if (receipt == null) {
                continue;
            }
            Optional.ofNullable(receipt.getItineraryProduct())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(productList -> {
                        productList.forEach(product -> {
                            MP_ItineraryReceiptPo po = new MP_ItineraryReceiptPo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setSearchId(mp.getSearchID());
                            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                            po.setChannel(receipt.getChannel());
                            po.setItineraryReceiptId(receipt.getID());
                            po.setLogisticsId(receipt.getLogisticsID());
                            po.setStatus(receipt.getStatus());
                            po.setTrackingNumber(Utils.applyOrNull(receipt.getDeliveryInfo(), d -> d.getTrackingNumber()));

                            Optional.ofNullable(receipt.getDeliveryInfo())
                                    .ifPresent(deliveryInfo -> {

                                        Utils.getFirstNonNullConsume(deliveryInfo.getRecipient(), t -> {
                                            po.setRecipientPersonName(Commons.getName(t.getPersonName()));
                                            Utils.getFirstNonNullConsume(t.getTelephone(), tel -> {
                                                po.setRecipientTelephone(Commons.getRecipientTelephone(tel));
                                            });
                                            Utils.getFirstNonNullConsume(t.getAddress(), a -> {
                                                po.setRecipientAddress(Commons.getRecipientAddress(a));
                                            });
                                        });

                                        Optional.ofNullable(deliveryInfo.getEstimatedPrice())
                                                .ifPresent(p -> {
                                                    po.setEstimatedPrice(Utils.number2String(p.getAmount()));
                                                    po.setRecipientCurrencyCode(p.getCurrencyCode());
                                                });
                                    });

                            po.setProductArrivalDateTime(xmlDate2StringWithShanghaiTimezone(product.getArrivalDateTime()));
                            po.setProductChannel(product.getChannel());
                            po.setProductGeoIndicator(product.getGeoIndicator());
                            po.setProductHistoryId(Utils.toWrapperLong(product.getHistoryID()));
                            po.setProductProductNumber(Utils.toWrapperLong(product.getProductNumber()));
                            po.setProductProductType(product.getProductType());
                            Utils.getFirstNonNullConsume(product.getTicketing(), t -> {
                                po.setProductETicketNumber(t.getETicketNumber());

                                Optional.ofNullable(t.getTicketPrice())
                                        .ifPresent(p -> {
                                            po.setProductTicketPrice(Utils.number2String(p.getAmount()));
                                            po.setProductCurrencyCode(p.getCurrencyCode());
                                        });

                                Optional.ofNullable(Utils.getFirstNonNull(t.getPassengerInfo()))
                                        .map(info -> info.getPassengerName())
                                        .ifPresent(a -> {
                                            po.setProductPassengerName(Commons.getName(a));
                                        });
                            });

                            result.add(po);
                        });
                    });
        }
        return result;
    }
}
