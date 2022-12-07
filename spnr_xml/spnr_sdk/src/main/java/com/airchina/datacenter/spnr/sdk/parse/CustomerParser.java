package com.airchina.datacenter.spnr.sdk.parse;


import static com.airchina.datacenter.spnr.sdk.DateHelper.xmlDate2String;

import com.airchina.datacenter.spnr.sdk.SPNRContext;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_contactPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_passengersPo;
import com.airchina.datacenter.spnr.sdk.entity.CustomerType;
import com.airchina.datacenter.spnr.sdk.entity.OJCustomerPrimaryAdditionalType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import java.util.Optional;
import org.apache.commons.collections4.CollectionUtils;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class CustomerParser {
    public static void process(OJSuperPNR spnr, SPNRContext context) {
        if (CollectionUtils.isEmpty(spnr.getCustomer())) {
            return;
        }

        processPrimary(spnr, context);

        processAdditional(spnr, context);
    }

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
                            po.setTelephone(getTel(tel));
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

    private static void processPrimary(OJSuperPNR spnr, SPNRContext context) {
        spnr
                .getCustomer()
                .forEach(customer -> {

                    OJCustomerPrimaryAdditionalType.Primary primary = customer.getPrimary();
                    Spnr_contactPo po = new Spnr_contactPo();
                    po.setSuperPnrId(String.valueOf(spnr.getSuperPNRID()));
                    po.setAuditId(customer.getAuditID().intValue());
                    po.setCustomerId(String.valueOf(customer.getCustomerID()));
                    po.setSeqNo((long) customer.getSeqNo());
                    po.setHistoric(String.valueOf(customer.isHistoric()));
                    po.setAccountType(Utils.tyrParseInt(primary.getAccountType()));
                    po.setOjSuperPnrRph(Utils.tyrParseInt(primary.getOJSuperPNRRPH()));
                    po.setPassengerTypeCode(primary.getPassengerTypeCode());
                    po.setName(Utils.getName(primary.getPersonName()));
                    CustomerType.Telephone tel = Utils.getFirstOrNull(primary.getTelephone());
                    if (tel != null) {
                        po.setTelephone(getTel(tel));
                    }
                    po.setEmail(Utils.getEmail(primary.getEmail()));
                    Optional
                            .ofNullable(primary.getAddress())
                            .map(Utils::getFirstOrNull)
                            .ifPresent(addr -> {
                                po.setAddressFormattedInd(String.valueOf(addr.isFormattedInd()));
                                Utils.getFirstOptional(addr.getAddressLine()).ifPresent(line-> po.setAddressLineindex(line.getIndex()));
                                po.setCityName(addr.getCityName());
                                po.setPostalCode(addr.getPostalCode());
                                po.setCountryName(addr.getCountryName().getCode());
                            });
                    Optional.ofNullable(primary.getPersonName())
                            .ifPresent(pName -> {
                                po.setContactname(Utils.getName(pName));
                                po.setContactPrefix(Utils.list2String(pName.getNamePrefix()));
                            });
                    Optional.ofNullable(primary.getUniqueID())
                            .ifPresent(uid -> {
                                po.setUniqueId(uid.getID());
                                po.setUniqueIdContext(uid.getIDContext());
                            });
                    context.getSPnrContactPo().add(po);

                });
    }

    private static String getTel(CustomerType.Telephone telephone) {
        String telString = telephone.getPhoneLocationType() + Utils.PIPE
                + telephone.getPhoneTechType() + Utils.PIPE
                + telephone.getPhoneUseType() + Utils.PIPE
                + telephone.getCountryAccessCode() + Utils.BAR + telephone.getPhoneNumberAttr();
        return telString;
    }
}
