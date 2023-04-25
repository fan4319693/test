package com.airchina.datacenter.spnr.udf;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

import com.airchina.datacenter.spnr.sdk.facade.UdtfFacade;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.parser.ParserProvider;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
 * Created by ctrip on 2022/12/7
 */
public class XmlTabUDTFTest {

    @Test
    public void originNew() throws IOException, DocumentException {
        String path = "C:\\Users\\LPT014812\\Desktop\\udf\\spnr_xml\\spnr_udtf\\src\\test\\resources\\xml";

        //String root = Objects.requireNonNull(this.getClass().getResource("/")).getPath();
        String debugXml = FileUtils.readFileToString(FileUtils.getFile(path.concat("\\变更后.xml")), Charset.defaultCharset());
        String XmlPath = "/OJ_SuperPNRWriteRQ/OJ_SuperPNR";

        debugXml = debugXml.replaceAll("xmlns=[^>,^\\s]+", "");
        Document doc;
        SAXReader reader = new SAXReader();
        doc = reader.read(IOUtils.toInputStream(debugXml, Charset.defaultCharset()));
        String xmlContent = doc.selectSingleNode(XmlPath).asXML();

        //SPNRContext obj = SuperPNRJAXBProcessor.getInstance().process(spnr.asXML());

//        Map<String, List> map = Dispatcher.convertContext(obj);
//        List pos = map.get("SPNR_PricingPo".toLowerCase());

        AbstractParser parser = ParserProvider.provide("Spnr_AuditsPo");
        List<?> res = UdtfFacade.process(xmlContent, parser);


        //Gson gson = new Gson();
        for (Object re : res) {
            if (re.getClass().isArray()) {
                System.out.println(Arrays.toString((Object[]) re));
            }
        }
    }

    @Test
    public void originMine() throws IOException, DocumentException {
//        String path = "C:\\Users\\LPT014812\\Desktop\\udf\\spnr_xml\\spnr_udtf\\src\\test\\resources\\xml";

        String root = Objects.requireNonNull(this.getClass().getResource("/")).getPath();
        String debugXml = FileUtils.readFileToString(FileUtils.getFile(root.concat("\\xml\\1.xml")), Charset.defaultCharset());
        String XmlPath = "/OJ_SuperPNRWriteRQ/OJ_SuperPNR";

        System.out.println(debugXml);
        debugXml = debugXml.replaceAll("xmlns=\"[^>,^\\s]+\"", "");


        System.out.println(debugXml);
        Document doc;
        SAXReader reader = new SAXReader();
        doc = reader.read(IOUtils.toInputStream(debugXml, Charset.defaultCharset()));
        String xmlContent = doc.selectSingleNode(XmlPath).asXML();

        Set<String> allTableNames = ParserProvider.getAllTableNames();

        for (String tableName : allTableNames) {
            AbstractParser parser = ParserProvider.provide(tableName);

            List<?> res = UdtfFacade.process(xmlContent, parser);

            int size = res != null ? res.size() : 0;
            System.out.println(tableName + ":" + size);
        }

    }


//    @Test
//    public void origin() throws IOException, DocumentException {
//        String root = Objects.requireNonNull(this.getClass().getResource("/")).getPath();
//        String debugXml = FileUtils.readFileToString(FileUtils.getFile(root.concat("xml/origin.xml")), Charset.defaultCharset());
//        String XmlPath = "/OJ_SuperPNRWriteRQ/OJ_SuperPNR";
//
//        debugXml = debugXml.replaceAll("xmlns=[^>,^\\s]+", "");
//        Document doc = null;
//        SAXReader reader = new SAXReader();
//        doc = reader.read(IOUtils.toInputStream(debugXml, Charset.defaultCharset()));
//        Node spnr = doc.selectSingleNode(XmlPath);
//
//        SPNRContxext obj = SuperPNRJAXBProcessor.getInstance().process(spnr.asXML());
//
//        assertNotNull(obj);
//    }
//
//    @Test
//    public void origin2() throws IOException, DocumentException {
//        String root = Objects.requireNonNull(this.getClass().getResource("/")).getPath();
//        String debugXml = FileUtils.readFileToString(FileUtils.getFile(root.concat("xml/Fail2.xml")), Charset.defaultCharset());
//        String XmlPath = "/OJ_SuperPNRWriteRQ/OJ_SuperPNR";
//
//        debugXml = debugXml.replaceAll("xmlns=[^>,^\\s]+", "");
//        Document doc = null;
//        SAXReader reader = new SAXReader();
//        doc = reader.read(IOUtils.toInputStream(debugXml, Charset.defaultCharset()));
//        Node spnr = doc.selectSingleNode(XmlPath);
//
//        SPNRContext obj = SuperPNRJAXBProcessor.getInstance().process(spnr.asXML());
//
//        assertNotNull(obj);
//    }
//
//    @Test
//    public void origin3() throws IOException, DocumentException {
//        String root = Objects.requireNonNull(this.getClass().getResource("/")).getPath();
//        String debugXml = FileUtils.readFileToString(FileUtils.getFile(root.concat("xml/Fail1.xml")), Charset.defaultCharset());
//        String XmlPath = "/OJ_SuperPNRWriteRQ/OJ_SuperPNR";
//
//        debugXml = debugXml.replaceAll("xmlns=[^>,^\\s]+", "");
//        Document doc = null;
//        SAXReader reader = new SAXReader();
//        doc = reader.read(IOUtils.toInputStream(debugXml, Charset.defaultCharset()));
//        Node spnr = doc.selectSingleNode(XmlPath);
//
//        SPNRContext obj = SuperPNRJAXBProcessor.getInstance().process(spnr.asXML());
//
//        assertNotNull(obj);
//    }
//
//    @Test
//    public void origin4() throws IOException, DocumentException {
//        String root = Objects.requireNonNull(this.getClass().getResource("/")).getPath();
//        String debugXml = FileUtils.readFileToString(FileUtils.getFile(root.concat("xml/行李记件带序号.xml")), Charset.defaultCharset());
//
//
//        SPNRContext obj = SuperPNRJAXBProcessor.getInstance().process(debugXml);
//
//        assertNotNull(obj);
//    }
}