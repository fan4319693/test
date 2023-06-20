package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AncillaryProductPo;
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

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpAncillaryProductParser </p>
 * <p>Description: MP_AncillaryProductPo 的转换器 </p>
 * <p>Sample:  new MpAncillaryProductParser(new FieldsArrayStrategy(MP_AncillaryProductPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpAncillaryProductParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpAncillaryProductParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AncillaryProductPo
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
            MP_AncillaryProductPo po = new MP_AncillaryProductPo();

            po.setSuperPnrId(spnr.getSuperPNRID());
            po.setSearchId(mp.getSearchID());
            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
            po.setPnr(ancillaryProduct.getBookingReferenceID());
            po.setCancelable(Utils.boolean2String(ancillaryProduct.isCancelable()));
            po.setCategory(Utils.applyOrNull(ancillaryProduct.getCategory(), t -> t.value()));
            po.setCode(ancillaryProduct.getCode());
            po.setBookDate(xmlDate2StringWithShanghaiTimezone(ancillaryProduct.getDate()));
            po.setOrigin(ancillaryProduct.getOrigin());
            po.setDestination(ancillaryProduct.getDestination());
            po.setFlightNumber(ancillaryProduct.getFlightNumber());
            po.setFlightSegmentRph(Utils.toWrapperLong(ancillaryProduct.getFlightSegmentRPH()));
            //TODO 没有该节点,先用carrier代替
            po.setMarketingAirline(ancillaryProduct.getCarrier());
            po.setQuantity(Utils.toWrapperLong(ancillaryProduct.getQuantity()));
            po.setRefundable(Utils.boolean2String(ancillaryProduct.isRefundable()));
            po.setSeatNumber(ancillaryProduct.getSeatNumber());
            po.setType(ancillaryProduct.getType());
            po.setIsSegBind(Utils.boolean2String(ancillaryProduct.isIsSegBind()));

            //TODO 此处原来是逗号拼接,改为了取首个乘客,否则类型不兼容
            Optional.ofNullable(ancillaryProduct.getTravelerInfo())
                    .map(t -> Utils.getFirstNonNull(t.getAirTraveler()))
                    .map(t -> t.getTravelerRefNumber())
                    .ifPresent(t -> po.setTravelerRefNumberRph(Utils.toWrapperLong(t.getRPH())));

            Optional.ofNullable(ancillaryProduct.getContact())
                    .map(ContactPersonType::getPersonName)
                    .ifPresent(pName -> po.setContactPersonName(Commons.getName(pName)));

            po.setAirport(ancillaryProduct.getAirport());
            po.setBookingChannel(ancillaryProduct.getBookingChannel());
            po.setBookingReferenceId(ancillaryProduct.getBookingReferenceID());
            po.setBookingStatus(ancillaryProduct.getBookingStatus());
            po.setCabinClass(ancillaryProduct.getCabinClass());
            po.setCarrier(ancillaryProduct.getCarrier());
            po.setName(ancillaryProduct.getName());
            po.setOdRph(Utils.toWrapperLong(ancillaryProduct.getOriginDestinationRPH()));
            po.setPoolId(ancillaryProduct.getPoolID());
            po.setProductSequence(ancillaryProduct.getProductSequence());
            po.setRef(ancillaryProduct.getREF());
            po.setSellingProposition(ancillaryProduct.getSellingProposition());
            po.setSubType(ancillaryProduct.getSubType());
            po.setSupplierCode(ancillaryProduct.getSupplierCode());
            po.setSupplierProductCode(ancillaryProduct.getSupplierProductCode());

            Optional.ofNullable(ancillaryProduct.getSupplierDescriptiveContent())
                    .ifPresent(sdc -> {
                        po.setSupplierName(sdc.getSupplierName());
                        Optional.ofNullable(sdc.getBookingOffices())
                                .map(b -> Utils.getFirstNonNull(b.getBookingOffice()))
                                .map(SupplierDescriptiveContentType.BookingOffices.BookingOffice::getPhones)
                                .map(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Phones::getPhone)
                                .filter(CollectionUtils::isNotEmpty)
                                .ifPresent(phones -> {
                                    //TODO 此处以斜杠拼接,只此一见
                                    po.setSupplierPhoneNumber(Utils.collection2String(phones, p -> p.getPhoneNumber(),
                                            Constants.JoinBySlashNull2Empty)
                                    );
                                });
                    });

            po.setTag(ancillaryProduct.getTag());
            po.setTerminal(ancillaryProduct.getTerminal());

            Optional.ofNullable(ancillaryProduct.getQRData())
                    .map(qrDataType -> Utils.getFirstNonNull(qrDataType.getQRCode()))
                    .ifPresent(qrCode -> {
                        po.setQrConsumedDateTime(xmlDate2StringWithShanghaiTimezone(qrCode.getConsumedDateTime()));
                    });

            Optional.ofNullable(ancillaryProduct.getCancellationPenalties())
                    .map(t -> t.getCancelPenalty())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(penaltyList -> {
                        penaltyList.forEach(penalty -> {
                            Optional.ofNullable(penalty.getDeadline())
                                    .ifPresent(d -> {
                                        po.setCancelPenaltyDeadlineOffsetTimeUnit(d.getOffsetTimeUnit());
                                        po.setCancelPenaltyDeadlineOffsetUnitMultiplier(Utils.number2String(d.getOffsetUnitMultiplier()));
                                    });

                            Optional.ofNullable(penalty.getAmountPercent())
                                    .ifPresent(a -> po.setAmountPercent(Utils.number2String(a.getAmount())));
                        });
                    });

            Optional.ofNullable(ancillaryProduct.getSupplierBookingReferenceID())
                            .ifPresent(t -> po.setSupplierId(t.getID()));

            Optional.ofNullable(ancillaryProduct.getPrices())
                    .map(prices -> Utils.getFirstNonNull(prices.getPrice()))
                    .ifPresent(priceType -> {
                        po.setLoyaltyLevel(priceType.getLoyaltyLevel());
                        po.setPassengerTypeCode(priceType.getPassengerTypeCode());

                        Optional.ofNullable(priceType.getBase())
                                .ifPresent(base -> {
                                    po.setBaseAmount(Utils.number2String(base.getAmount()));
                                    po.setBaseCurrencyCode(base.getCurrencyCode());
                                    po.setUnitPrice(Utils.number2String(base.getUnitPrice()));
                                });

                        Optional.ofNullable(priceType.getPriceAdjustments())
                                .ifPresent(adj -> {
                                    //TODO 这里的代码与原代码一致，但业务逻辑不太理解
                                    Float amt = Optional.ofNullable(adj.getAmount())
                                            .orElse(Utils.getFirstNonNullApply(adj.getPriceAdjustment(), t -> t.getAmount()));

                                    po.setPriceAdjustmentsAmount(Utils.number2String(amt));
                                    //TODO 这里的代码与原代码一致，但业务逻辑不太理解
                                    String currencyCode = Optional.ofNullable(adj.getCurrencyCode())
                                            .orElse(Utils.getFirstNonNullApply(adj.getPriceAdjustment(), t -> t.getCurrencyCode()));

                                    po.setPriceAdjustmentsCurrencyCode(currencyCode);
                                });

                        Optional.ofNullable(priceType.getTotal())
                                .ifPresent(total -> {
                                    po.setTotalAdjusted(Utils.number2String(total.getAdjusted()));
                                    po.setTotalAdjustedCurrencyCode(total.getCurrencyCode());
                                    po.setTotalAmount(Utils.number2String(total.getAmount()));
                                    po.setTotalCurrencyCode(total.getCurrencyCode());
                                });
                    });

            result.add(po);
        }

        return result;
    }
}
