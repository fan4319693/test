package com.airchina.datacenter.spnr.sdk.rubbish;


import com.airchina.datacenter.spnr.sdk.dao.pojo.SuperPNRPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.*;

/**
 * @author wgni
 * @since 2022/7/4
 */
public class SuperPNRJAXBProcessor {
    private static final Logger log = LoggerFactory.getLogger(SuperPNRJAXBProcessor.class);

    private final JAXBContext jaxbContext = JAXBContext.newInstance(OJSuperPNR.class);

    private static final SuperPNRJAXBProcessor INSTANCE;

    static {
        try {
            INSTANCE = new SuperPNRJAXBProcessor();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 单例模式
     *
     * @return
     */
    public static SuperPNRJAXBProcessor getInstance() {
        return INSTANCE;
    }

    private SuperPNRJAXBProcessor() throws JAXBException {
    }

    private OJSuperPNR parseSPNR(String xml) {
        try {
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            OJSuperPNR spnr = (OJSuperPNR) unmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes("UTF-8")));
            return spnr;
        } catch (Exception ex) {
            log.error("unmarshal OJSuperPNR Fail : {}", ex.getMessage(), ex);
            return null;
        }
    }


    private SPNRContext parseSPNR(OJSuperPNR ojSuperPNR) {
        SPNRContext context = new SPNRContext();
        parseSuperPnrPO(ojSuperPNR, context);
        POSParser.process(ojSuperPNR, context);
        CustomerParser.process(ojSuperPNR, context);
        AuditsParser.process(ojSuperPNR, context);
        QueuesParser.process(ojSuperPNR, context);
        PricingParser.process(ojSuperPNR, context);
        PaymentDetailsParser.process(ojSuperPNR, context);
        RemarksParser.process(ojSuperPNR, context);
        AssociatedBookingParser.process(ojSuperPNR, context);
//        ModularProductParser.process(ojSuperPNR, context);
        FanshuaiModularProductParser.process(ojSuperPNR, context);
        return context;
    }

    public SPNRContext process(String xml) {
        OJSuperPNR ojSuperPNR = parseSPNR(xml);
        if (ojSuperPNR == null) {
            return null;
        }
        return parseSPNR(ojSuperPNR);
    }

    public SPNRContext process(InputStream input){
        try {
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return parseSPNR((OJSuperPNR) unmarshaller.unmarshal(input));
        } catch (JAXBException ex) {
            log.error("unmarshal OJSuperPNR Fail : {}", ex.getMessage(), ex);
            return null;
        }

    }


    private void parseSuperPnrPO(OJSuperPNR spnr, SPNRContext context) {
        SuperPNRPo po = new SuperPNRPo();

        po.setSuperPnrId(String.valueOf(spnr.getSuperPNRID()));
        po.setBookingDate(xmlDate2StringWithShanghaiTimezone(spnr.getBookingDate()));
        po.setProcessingStatus(spnr.getProcessingStatus().value());
        po.setBookingStatus(spnr.getBookingStatus());
        po.setTsBookingStatus(spnr.getTSBookingStatus());
        po.setStartDate(xmlDate2StringWithUtcTimezone(spnr.getStartDate()));
        po.setEndDate(xmlDate2StringWithUtcTimezone(spnr.getEndDate()));
        po.setDestination(spnr.getDestination());
        po.setSummary(String.valueOf(spnr.isSummary()));
        po.setTkCancelType(spnr.getTKCancelType());
        po.setCancellationDate(xmlDate2StringWithShanghaiTimezone(spnr.getCancellationDate()));
        po.setFullHistory(String.valueOf(spnr.isFullHistory()));
        po.setLastAuditId((Long.valueOf(spnr.getLastAuditID())));
        po.setLastModified(xmlDate2StringWithShanghaiTimezone(spnr.getLastModified()));
        po.setSchemaVersion(spnr.getSchemaVersion());
        po.setSourceAddress(spnr.getSourceAddress());
        po.setCancelTimeLimit(xmlDate2StringWithShanghaiTimezone(spnr.getCancelTimeLimit()));
        po.setCryptoVersion(Utils.number2String(spnr.getCryptoVersion()));
        context.setSpnrPo(po);
    }


}
