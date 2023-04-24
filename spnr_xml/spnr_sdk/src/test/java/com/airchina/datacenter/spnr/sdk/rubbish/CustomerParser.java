package com.airchina.datacenter.spnr.sdk.rubbish;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_contactPo;
import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_passengersPo;
import com.airchina.datacenter.spnr.sdk.entity.AddressType;
import com.airchina.datacenter.spnr.sdk.entity.EmailType;
import com.airchina.datacenter.spnr.sdk.entity.OJCustomerPrimaryAdditionalType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class CustomerParser {
    public static void process(OJSuperPNR spnr, SPNRContext context) {
        if (CollectionUtils.isEmpty(spnr.getCustomer())) {
            return;
        }

        fanshuaiProcessPrimary(spnr, context);

        fanshuaiProcessAdditional(spnr, context);
    }

    /*
    private static void processAdditional(OJSuperPNR spnr, SPNRContext context) {
        spnr
                .getCustomer()
                .forEach(customer -> {
                    customer.getAdditional().forEach(additional -> {
                        Spnr_passengersPo po = new Spnr_passengersPo();
                        po.setSuperPnrId(String.valueOf(spnr.getSuperPNRID()));
                        po.setAuditId(customer.getAuditID().intValue());
                        po.setCustomerId(String.valueOf(customer.getCustomerID()));
                        po.setSeqNo((long) customer.getSeqNo());
                        po.setAge(String.valueOf(additional.getAge()));
                        po.setBirthDate(xmlDate2String(additional.getBirthDate()));
                        po.setOjSuperPnrRph(String.valueOf(additional.getOJSuperPNRRPH()));
                        po.setPassengerTypeCode(additional.getPassengerTypeCode());
                        Optional.ofNullable(additional.getPersonName())
                                .ifPresent(pName -> po.setTravelerName(Utils.getName(pName)));
                        CustomerType.Telephone tel = Utils.getFirstOrNull(additional.getTelephone());
                        if (tel != null) {
                            po.setTelephone(getTelephone(getTel(tel), tel.getRPH(), xmlIntegetToStr(tel.getIndex())));
                        }
                        Optional.ofNullable(additional.getCitizenCountryName())
                                .map(Utils::getFirstOrNull)
                                .ifPresent(c -> po.setCitizenCountryCode(c.getCode()));
                        Optional.ofNullable(additional.getDocument()).map(Utils::getFirstOrNull).ifPresent(d -> {
                            po.setDocId(String.valueOf(d.getDocID()));
                            po.setDocType(Utils.tyrParseInt(d.getDocType()));
                            po.setDocNationality(d.getDocHolderNationality());
                            po.setDocExpireDate(xmlDate2String(d.getExpireDate()));
                        });
                        context.getSPnrPassengersPos().add(po);
                    });
                });
    }
    */

    private static void fanshuaiProcessAdditional(OJSuperPNR spnr, SPNRContext context) {
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

                            context.getSPnrPassengersPos().add(po);
                        });
                    }
                });
    }

    private static void fanshuaiProcessPrimary(OJSuperPNR spnr, SPNRContext context) {
        Optional.ofNullable(spnr.getCustomer())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(customers -> {
                    customers.forEach(c -> {
                        OJCustomerPrimaryAdditionalType.Primary primary = c.getPrimary();
                        Optional.ofNullable(primary)
                                .ifPresent(p -> {
                                    Spnr_contactPo po = new Spnr_contactPo();

                                    po.setSuperPnrId(spnr.getSuperPNRID());
                                    po.setAuditId(Utils.toWrapperLong(c.getAuditID()));
                                    po.setCustomerId(Utils.toWrapperLong(c.getCustomerID()));
                                    po.setSeqNo(Utils.toWrapperLong(c.getSeqNo()));
                                    po.setHistoric(Utils.boolean2String(c.isHistoric()));

                                    po.setAccountType(p.getAccountType());
                                    po.setOjSuperPnrRph(Utils.toWrapperLong(p.getOJSuperPNRRPH()));
                                    po.setPassengerTypeCode(p.getPassengerTypeCode());
                                    //TODO 这里待确认
                                    po.setName(Commons.getName(p.getPersonName()));
                                    Utils.getFirstNonNullConsume(p.getTelephone(), t -> {
                                        po.setTelephone(Commons.getTelephone(t));
                                    });

                                    po.setEmail(Utils.getFirstNonNullApply(p.getEmail(), EmailType::getValue));

                                    Utils.getFirstNonNullConsume(p.getAddress(), t -> {
                                        po.setAddressFormattedInd(Utils.boolean2String(t.isFormattedInd()));
                                        Integer index = Utils.getFirstNonNullApply(t.getAddressLine(), AddressType.AddressLine::getIndex);
                                        po.setAddressLineindex(Utils.number2String(index));
                                        po.setCityName(t.getCityName());
                                        po.setPostalCode(t.getPostalCode());
                                        Optional.ofNullable(t.getCountryName())
                                                .ifPresent(n -> {
                                                    po.setCountryName(n.getCode());
                                                });
                                    });

                                    Utils.getFirstNonNullConsume(p.getContactPerson(), person -> {
                                        Utils.consumeOrNull(person.getPersonName(), name -> {
                                            po.setContactname(Commons.getName(name));
                                            po.setContactPrefix(Utils.collection2String(name.getNamePrefix()));
                                        });
                                        //TODO 联系人手机号使用了第一个联系人的第一个手机号
                                        Utils.getFirstNonNullConsume(person.getTelephone(), t -> {
                                            po.setContactTel(Commons.getContactTelephone(t));
                                        });

                                        Utils.getFirstNonNullConsume(person.getEmail(), t -> {
                                            po.setContactEmail(t.getValue());
                                        });

                                        Utils.getFirstNonNullConsume(person.getDocument(), t -> {
                                            po.setContactDocId(t.getDocID());
                                            po.setContactDocType(Utils.toWrapperLong(t.getDocType()));
                                            po.setContactDocNationality(t.getDocHolderNationality());
                                            po.setContactDocExpireDate(xmlDate2StringWithShanghaiTimezone(t.getExpireDate()));
                                        });
                                    });

                                    Utils.consumeOrNull(p.getUniqueID(), t -> {
                                        po.setUniqueId(t.getID());
                                        po.setUniqueIdContext(t.getIDContext());

                                    });
                                    //后加的字段
                                    po.setMembershipId(Utils.collection2String(p.getCustLoyalty(), l -> l.getMembershipID()));
                                    context.getSPnrContactPo().add(po);
                                });
                    });
                });

    }

}
