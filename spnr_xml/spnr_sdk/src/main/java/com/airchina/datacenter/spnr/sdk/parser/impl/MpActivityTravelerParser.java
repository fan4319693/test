package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Mp_ActivityPo;
import com.airchina.datacenter.spnr.sdk.dao.pojo.Mp_Activity_TravelerPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpActivityTravelerParser </p>
 * <p>Description: Mp_Activity_TravelerPo 的转换器 </p>
 * <p>Sample:  new MpActivityTravelerParser(new FieldsArrayStrategy(Mp_Activity_TravelerPo.class)) </p>
 * <p>Author: ZML </p>
 * <p>Date: 2023/7/10 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpActivityTravelerParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpActivityTravelerParser(SerdeStrategy strategy) {
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
                    .map(ProductBase.Activity::getTravelers)
                    .map(TravelersType::getTraveler)
                    .ifPresent( travelers -> {
                        for (TravelersType.Traveler traveler : travelers) {
                            Mp_Activity_TravelerPo po = new Mp_Activity_TravelerPo();
                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));

                            Optional.ofNullable(mp.getActivity().getContact())
                                .ifPresent(c -> {
                                    po.setContactName(Commons.getName(c.getPersonName()));
                                    Utils.getFirstNonNullConsume(c.getTelephone(), t -> po.setContactPhone(Commons.getContactTelephone(t)));
                                });



                            po.setOjSuperPnrRph(traveler.getOJSuperPNRRPH());
                            po.setPassengerRph(traveler.getRPH());
                            po.setPassengerType(traveler.getPassengerTypeCode());
                            Optional.ofNullable(traveler.getProfile())
                                    .map(ProfileType::getCustomer)
                                    .ifPresent(profileType -> {
                                        po.setName(Commons.getName(profileType.getPersonName()));
                                        po.setPhone(Commons.getTelephone(Utils.getFirstNonNull(profileType.getTelephone())));

                                        Utils.getFirstNonNullConsume(profileType.getDocument(), t -> {
                                            po.setDocId(t.getDocID());
                                            po.setDocType(t.getDocType() == null ? "" : t.getDocType());
                                        });

                                        Utils.getFirstNonNullConsume(profileType.getEmail(), e -> po.setEmail(e.getValue()));
                                    });

                            Optional.ofNullable(traveler.getSpecialRequests())
                                    .map(SpecialRequestType::getSpecialRequest)
                                            .ifPresent(s -> {
                                                for (SpecialRequestType.SpecialRequest specialRequest : s) {
                                                    po.setNotes(Utils.collection2String(specialRequest.getText(), FormattedTextTextType::getValue));
                                                    break;
                                                }
                                            });

                            Utils.getFirstNonNullConsume(traveler.getTPAExtensions().getAny(), tpa -> po.setVerificationCode(tpa.getFirstChild().getNodeValue()));

                            result.add(po);
                        }
                    });
        }
        return result;
    }
}
