package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Mp_Activity_InsurancePo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

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
public class MpActivityInsuranceParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpActivityInsuranceParser(SerdeStrategy strategy) {
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
            Optional.ofNullable(mp.getActivity())
                    .map(ProductBase.Activity::getTPAExtensions)
                    .ifPresent( tpa -> {
                        Mp_Activity_InsurancePo po = new Mp_Activity_InsurancePo();
                        po.setSuperPnrId(spnr.getSuperPNRID());
                        po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));

                        Optional.ofNullable(tpa.getDestActivityDescriptiveContent())
                                        .ifPresent(content -> {
                                            po.setProductName(content.getName());
                                            po.setIsPricePerPerson(content.getIsPricePerPerson());
                                            po.setItemType(String.valueOf(content.getItemType()));
                                        });

                        Optional.ofNullable(tpa.getInsurance())
                                        .ifPresent(insurance -> {
                                            po.setMaximumAmountToBook(Utils.toWrapperLong(insurance.getMaximumAmountToBook()));
                                            po.setProductId(insurance.getProductID());
                                            po.setInsuranceTypeId(insurance.getProductID());
                                            po.setInsuranceStatus(insurance.getStatus());
                                            po.setInsuranceTypeId(insurance.getTypeID());

                                            po.setRefundInsuranceWithAirTicket(String.valueOf(insurance.isRefundInsuranceWithAirTicket()));
                                            po.setRefundAloneByAgent(String.valueOf(insurance.isRefundAloneByAgent()));
                                            po.setRefundInsuranceAlone(String.valueOf(insurance.isRefundInsuranceAlone()));

                                            po.setPassengerType(insurance.getTypeOfPassenger());
                                            Optional.ofNullable(insurance.getInsCoverageDetail())
                                                    .map(InsCoverageDetailType::getFlightSegmentRefs)
                                                    .map(FlightSegmentRefsType::getFlightSegmentRef)
                                                    .ifPresent(t -> {
                                                        po.setFlightSegmentRPHs(Utils.collection2String(t, FlightSegmentRefsType.FlightSegmentRef::getFlightSegmentRPH));
                                                        po.setOdRPHs(Utils.collection2String(t, FlightSegmentRefsType.FlightSegmentRef::getOriginDestinationRPH));
                                                    });
                                            Optional.ofNullable(insurance.getPlanCost())
                                                    .ifPresent(planCost -> {
                                                        po.setPlanCostAmt(Utils.number2String(planCost.getAmount()));
                                                        po.setCurrencyCode(planCost.getCurrencyCode());
                                                    });
                                            Optional.ofNullable(insurance.getQuoteDetail())
                                                    .map(QuoteDetailType::getProviderCompany)
                                                    .ifPresent(companyNameType -> {
                                                        po.setProviderCompanyCode(companyNameType.getCode());
                                                        po.setProviderCompanyName(companyNameType.getCompanyShortName());
                                                    });

                                            Optional.ofNullable(insurance.getContent())
                                                    .ifPresent(contentType -> {
                                                        po.setLanguage(contentType.getLanguage());
                                                        po.setShortContent(contentType.getShortContent());
                                                        po.setProductTag(contentType.getProductTag());
                                                        po.setProductPolicyUrl(contentType.getPolicyURL() == null ? "" : contentType.getPolicyURL().getValue());
                                                    });

                                        });
                        result.add(po);
                    });

        }
        return result;
    }
}
