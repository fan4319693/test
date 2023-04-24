package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_passengersPo;
import com.airchina.datacenter.spnr.sdk.entity.OJCustomerPrimaryAdditionalType;
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
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrPassengersParser </p>
 * <p>Description: Spnr_passengersPo 的转换器 </p>
 * <p>Sample:  new SpnrPassengersParser(new FieldsArrayStrategy(Spnr_passengersPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrPassengersParser extends AbstractParser {

    public SpnrPassengersParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        Optional.ofNullable(spnr.getCustomer())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(cs -> {
                    for (OJCustomerPrimaryAdditionalType customer : cs) {
                        List<OJCustomerPrimaryAdditionalType.Additional> additionals = customer.getAdditional();
                        if (CollectionUtils.isEmpty(additionals)) {
                            continue;
                        }
                        additionals.forEach(additional -> {
                            Spnr_passengersPo po = new Spnr_passengersPo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setAuditId(Utils.toWrapperLong(customer.getAuditID()));
                            po.setCustomerId(Utils.toWrapperLong(customer.getCustomerID()));
                            po.setSeqNo(Utils.toWrapperLong(customer.getSeqNo()));

                            po.setAge(Utils.number2String(additional.getAge()));
                            po.setBirthDate(xmlDate2StringWithShanghaiTimezone(additional.getBirthDate()));
                            po.setOjSuperPnrRph(Utils.toWrapperLong((additional.getOJSuperPNRRPH())));
                            po.setPassengerTypeCode(additional.getPassengerTypeCode());

                            Utils.consumeOrNull(additional.getPersonName(), pName -> {
                                po.setTravelerName(Commons.getName(pName));
                                //拼接称谓, 如: Mr,Mrs
                                po.setNamePrefix(Utils.collection2String(pName.getNamePrefix()));
                            });

                            Utils.getFirstNonNullConsume(additional.getTelephone(), t -> {
                                po.setTelephone(Commons.getTelephone(t));
                            });

                            Utils.getFirstNonNullConsume(additional.getCitizenCountryName(), t -> {
                                po.setCitizenCountryCode(t.getCode());
                            });

                            Utils.getFirstNonNullConsume(additional.getDocument(), d -> {
                                po.setDocId(d.getDocID());
                                po.setDocType(Utils.toWrapperLong(d.getDocType()));
                                po.setDocNationality(d.getDocHolderNationality());
                                po.setDocExpireDate(xmlDate2StringWithShanghaiTimezone(d.getExpireDate()));
                            });

                            result.add(po);
                        });
                    }
                });

        return result;
    }
}
