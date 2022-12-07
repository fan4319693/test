package com.airchina.datacenter.spnr.sdk.parse;

import static com.airchina.datacenter.spnr.sdk.DateHelper.xmlDate2String;

import com.airchina.datacenter.spnr.sdk.SPNRContext;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_PaymentDetailsPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_PaymentinfoPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.PaymentDetailsType;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.collections4.CollectionUtils;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class PaymentDetailsParser {

    public static void process(OJSuperPNR spnr, SPNRContext context) {
        if (spnr.getPaymentDetails() == null) {
            return;
        }
        processPaymentDetails(spnr, context);
        processPaymentInfo(spnr, context);

    }

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
                    po.setAmt(Double.valueOf(payment.getAmount()));
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
                                                    .map(r -> r.getCode()).collect(Collectors.joining(","))));
                    context.getSPnrPaymentInfoPos().add(po);
                }));
    }

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
    }
}
