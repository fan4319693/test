package com.airchina.datacenter.spnr.udf;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;


public class XmlPathUDF extends GenericUDF {

    private static final Log logger = LogFactory.getLog(XmlPathUDF.class);

    private String XmlPath = "/OJ_SuperPNRWriteRQ/OJ_SuperPNR";
    private SAXReader reader;
    private StringObjectInspector soi;

    @Override
    public ObjectInspector initialize(ObjectInspector[] arguments) throws UDFArgumentException {
        this.reader = new SAXReader();

        if (arguments.length == 2) {
            this.XmlPath = arguments[1].toString();
        }
        this.soi = (StringObjectInspector) arguments[0];
        logger.info("Set xml path as " + this.XmlPath);
        return PrimitiveObjectInspectorFactory.javaStringObjectInspector;
    }

    @Override
    public Object evaluate(DeferredObject[] arguments) throws HiveException {
        String xmlContent = soi.getPrimitiveJavaObject(arguments[0].get());
        // remove namespace or may select node with null
        xmlContent = xmlContent.replaceAll("xmlns=[^>,^\\s]+", "");
        Document doc = null;
        try {
            doc = this.reader.read(IOUtils.toInputStream(xmlContent));
            Node spnr = doc.selectSingleNode(this.XmlPath);
            if (spnr != null) {
                return spnr.asXML();
            }
        } catch (DocumentException e) {
            logger.error(e);
            throw new HiveException("Can not parse XML!");
        }
        return null;
    }

    @Override
    public String getDisplayString(String[] children) {
        return null;
    }
}
