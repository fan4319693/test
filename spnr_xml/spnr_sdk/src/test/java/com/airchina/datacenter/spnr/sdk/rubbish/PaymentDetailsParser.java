package com.airchina.datacenter.spnr.sdk.rubbish;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PaymentDetailsPo;
import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PaymentinfoPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.utils.Constants;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.base.Strings;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class PaymentDetailsParser {

    public static void process(OJSuperPNR spnr, SPNRContext context) {
        if (spnr.getPaymentDetails() == null) {
            return;
        }
        fanshuaiProcessPaymentDetails(spnr, context);
        fanshuaiProcessPaymentInfo(spnr, context);

    }

    /*
    private static void processPaymentInfo(OJSuperPNR spnr, SPNRContext context) {
        Optional
                .ofNullable(spnr.getPaymentDetails().getPayments())
                .map(p -> p.getPayment())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(payments -> payments.forEach(payment -> {
                    Spnr_PaymentinfoPo po = new Spnr_PaymentinfoPo();
                    po.setSuperPnrId(context.getSPnrID());
                    po.setId(String.valueOf(payment.getID()));
                    po.setSeqNo(Long.valueOf(payment.getSeqNo()));
                    po.setAmt(Objects.isNull(payment.getAmount()) ?  Double.NaN : Double.valueOf(payment.getAmount()));
                    po.setAuditId(String.valueOf(payment.getAuditID()));
                    po.setCurrencyCode(payment.getCurrencyCode());
                    po.setHistoric(String.valueOf(payment.isHistoric()));
                    po.setHistoryId(String.valueOf(payment.getHistoryID()));
                    po.setPaymentDate(xmlDate2String(payment.getPaymentDate()));
                    po.setProductList(Utils.list2String(payment.getProductList()));
                    po.setStatus(payment.getStatus());
                    po.setTransactionType(payment.getTransactionType().value());
                    po.setPrePayInd(String.valueOf(payment.isPrePayInd()));
                    Optional.ofNullable(payment.getAgent())
                            .ifPresent(agent -> {
                                po.setAgent(agent.getAgent());
                                po.setAgentUrl(agent.getURL());
                                po.setAgency(agent.getAgency());
                            });
                    Optional
                            .ofNullable(payment.getPaymentForm())
                            .map(Utils::getFirstOrNull)
                            .map(p -> p.getOther())
                            .map(o -> o.getType())
                            .ifPresent(po::setPaymentFormType);
                    Optional
                            .ofNullable(payment.getPaymentForm())
                            .map(Utils::getFirstOrNull)
                            .map(p -> p.getOther())
                            .map(o -> o.getRef())
                            .ifPresent(refs ->
                                    po
                                            .setRefCode(refs.stream()
                                                    .map(r -> r.getCode() + ":" + r.getValue())
                                                    .collect(Collectors.joining("|"))));
                    context.getSPnrPaymentInfoPos().add(po);
                }));
    }
    */

    private static void fanshuaiProcessPaymentInfo(OJSuperPNR spnr, SPNRContext context) {
        Optional.ofNullable(spnr.getPaymentDetails())
                .map(t -> t.getPayments())
                .map(t -> t.getPayment())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(ps -> {
                    ps.forEach(payment -> {
                        Spnr_PaymentinfoPo po = new Spnr_PaymentinfoPo();

                        po.setSuperPnrId(context.getSPnrID());
                        po.setId(Utils.toWrapperLong(payment.getID()));
                        po.setSeqNo(Utils.toWrapperLong(payment.getSeqNo()));
                        po.setAmt(Utils.number2String(payment.getAmount()));
                        po.setAuditId(Utils.toWrapperLong(payment.getAuditID()));
                        po.setCurrencyCode(payment.getCurrencyCode());
                        po.setHistoric(Utils.boolean2String(payment.isHistoric()));
                        po.setHistoryId(Utils.toWrapperLong(payment.getHistoryID()));
                        po.setPaymentDate(xmlDate2StringWithShanghaiTimezone(payment.getPaymentDate()));

                        po.setProductList(Utils.collection2String(payment.getProductList()));
                        //po.setProductList(Utils.list2String(payment.getProductList()));
                        po.setStatus(payment.getStatus());

                        Optional.ofNullable(payment.getTransactionType())
                                .ifPresent(t -> po.setTransactionType(t.value()));
                        //po.setTransactionType(payment.getTransactionType().value());

                        po.setPrePayInd(Utils.boolean2String(payment.isPrePayInd()));

                        Optional.ofNullable(payment.getAgent())
                                .ifPresent(agent -> {
                                    po.setAgent(agent.getAgent());
                                    po.setAgentUrl(agent.getURL());
                                    po.setAgency(agent.getAgency());
                                    po.setAgentId(agent.getID());
                                    po.setAgentFunctionalGroup(agent.getFunctionalGroup());
                                    po.setAgentAdministrativeGroup(agent.getAdministrativeGroup());
                                });

                        Optional
                                .ofNullable(payment.getPaymentForm())
                                .map(Utils::getFirstNonNull)
                                .map(p -> p.getOther())
                                .ifPresent(t -> {
                                    po.setPaymentFormType(Utils.number2String(t.getType()));
                                    //TODO 这里的原代码与Excel不同,格式为key1:value1|key2:value2
                                    String refCode = Utils.collection2String(t.getRef(),
                                            r -> r.getCode() + ":" + Strings.nullToEmpty(r.getValue()),
                                            Constants.JoinByPipeNull2Empty);
                                    po.setRefCode(refCode);
                                });

                        context.getSPnrPaymentInfoPos().add(po);
                    });
                });
    }

    private static void fanshuaiProcessPaymentDetails(OJSuperPNR spnr, SPNRContext context) {
        Optional.ofNullable(spnr.getPaymentDetails())
                .ifPresent(details -> {
                    Spnr_PaymentDetailsPo po = new Spnr_PaymentDetailsPo();

                    po.setSuperPnrId(context.getSPnrID());

                    Utils.consumeOrNull(details.getBalance(), b -> {
                        po.setBalanceAmt(Utils.number2String(b.getAmount()));
                        po.setBalanceCurrency(b.getCurrencyCode());
                    });

                    Utils.consumeOrNull(details.getPayments(), p -> {
                        po.setPaymentsAmt(Utils.number2String(p.getAmount()));
                        po.setPaymentsCurrency(p.getCurrencyCode());
                        po.setActualAmt(Utils.number2String(p.getActualPayment()));
                        po.setLastModified(xmlDate2StringWithShanghaiTimezone(p.getLastModified()));
                    });

                    context.setSPnrPaymentDetailsPo(po);
                });

    }

    /*
    private static void processPaymentDetails(OJSuperPNR spnr, SPNRContext context) {
        Spnr_PaymentDetailsPo po = new Spnr_PaymentDetailsPo();
        PaymentDetailsType paymentDetails = spnr.getPaymentDetails();
        po.setSuperPnrId(context.getSPnrID());
        Optional.ofNullable(paymentDetails.getBalance()).ifPresent(balance -> {
            po.setBalanceAmt(Double.valueOf(balance.getAmount()));
            po.setBalanceCurrency(balance.getCurrencyCode());
        });
        Optional.ofNullable(paymentDetails.getPayments()).ifPresent(payments -> {
            po.setPaymentsAmt(Double.valueOf(payments.getAmount()));
            po.setPaymentsCurrency(payments.getCurrencyCode());
            po.setActualAmt(Double.valueOf(payments.getActualPayment()));
            po.setLastModified(xmlDate2String(payments.getLastModified()));
        });
        context.setSPnrPaymentDetailsPo(po);
    }*/
}
