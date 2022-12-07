package com.airchina.datacenter.spnr.udf;

import static org.junit.Assert.*;

import com.airchina.datacenter.spnr.sdk.SPNRContext;
import com.airchina.datacenter.spnr.sdk.SuperPNRJAXBProcessor;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
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
    public void process() throws IOException {
        XmlTabUDTF udtf = new XmlTabUDTF();
        String path = Objects.requireNonNull(this.getClass().getResource("/")).getPath().concat("xml/1.xml");
        String xmlString =FileUtils.readFileToString(FileUtils.getFile(path), Charset.defaultCharset());

        udtf.setter("MP_itineraryreceiptPo".toLowerCase());
        List<Object[]> res = udtf.javaProcess(xmlString);
        res.size();
    }

    @Test
    public void origin() throws IOException, DocumentException {
        String root = Objects.requireNonNull(this.getClass().getResource("/")).getPath();
        String debugXml = FileUtils.readFileToString(FileUtils.getFile(root.concat("xml/origin.xml")),Charset.defaultCharset());
        String XmlPath = "/OJ_SuperPNRWriteRQ/OJ_SuperPNR";

        debugXml = debugXml.replaceAll("xmlns=[^>,^\\s]+", "");
        Document doc = null;
        SAXReader reader = new SAXReader();
        doc = reader.read(IOUtils.toInputStream(debugXml,Charset.defaultCharset()));
        Node spnr = doc.selectSingleNode(XmlPath);

        SPNRContext obj = SuperPNRJAXBProcessor.getInstance().process(spnr.asXML());

        assertNotNull(obj);
    }
}