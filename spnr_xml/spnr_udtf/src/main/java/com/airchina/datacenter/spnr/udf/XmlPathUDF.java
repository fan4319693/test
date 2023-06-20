package com.airchina.datacenter.spnr.udf;

import com.airchina.datacenter.spnr.sdk.utils.Constants;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.udf.XmlPathUDF </p>
 * <p>Description: 清洗国航原始的xml, 提取目标节点 </p>
 * <p>Sample: new XmlPathUDF() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class XmlPathUDF extends GenericUDF {

    private static final Log logger = LogFactory.getLog(XmlPathUDF.class);

    /**
     * 功能说明: 待提取国航原始xml的子节点的路径
     * 最后修改时间: 2023/04/20
     */
    private String XmlPath = Constants.XML_PATH_DEFAULT;

    /**
     * 功能说明: xml文本的读取器
     * 最后修改时间: 2023/04/20
     */
    private SAXReader reader;

    /**
     * 功能说明: 提取String的文本
     * 最后修改时间: 2023/04/20
     */
    private StringObjectInspector soi;

    /**
     * Description: UDF函数的初始化方法, 读取器
     * Parameter:
     *  @param arguments: UDF函数入参的解析器
     * Return: String类型的解析器
     * Throws: 无
     */
    @Override
    public ObjectInspector initialize(ObjectInspector[] arguments) {
        this.reader = new SAXReader();

        //该UDF默认只传一个参数, xml的文本, 提取的节点路径使用默认值,
        //若有2个参数, 则用传入的节点路径
        if (arguments.length == 2) {
            this.XmlPath = arguments[1].toString();
        }
        this.soi = (StringObjectInspector) arguments[0];
        logger.info("Set xml path as " + this.XmlPath);
        return PrimitiveObjectInspectorFactory.javaStringObjectInspector;
    }

    /**
     * Description: 清除xml文本中的无关内容(namespace, 格式为: xmlns="xxx")
     * Parameter:
     *  @param xmlContent: 待清理的xml文本, 不能为null
     * Return: 清理后的xml文本
     * Throws: 无
     */
    private String filter(String xmlContent) {
        return xmlContent.replaceAll("xmlns=\"[^>,^\\s]+\"", "").replace("&", "&amp;");
    }

    /**
     * Description: UDF函数的主方法
     * Parameter:
     *  @param arguments: UDF方法的入参, 默认一个, 第二个参数可选, 为待解析Xml的节点路径
     * Return: 选取原始xml的目标节点, 并清理后的xml文本
     * Throws: HiveException, xml解析失败时抛出, 能导致任务失败
     */
    @Override
    public Object evaluate(DeferredObject[] arguments) throws HiveException {
        String xmlContent = soi.getPrimitiveJavaObject(arguments[0].get());
        if (xmlContent == null){
            return null;
        }
        //清除xml中的无关内容
        xmlContent = filter(xmlContent);
        try {
            //获取业务相关节点
            Document doc = this.reader.read(IOUtils.toInputStream(xmlContent));
            Node spnr = doc.selectSingleNode(this.XmlPath);
            if (spnr != null) {
                //返回合法xml文本
                return spnr.asXML();
            }
        } catch (DocumentException e) {
            logger.error(e);
            throw new HiveException("Can not parse XML!");
        }
        return null;
    }

    /**
     * Description: UDF函数的显示信息
     * Parameter:
     *  @param children:
     * Return: 显示信息
     * Throws: 无
     */
    @Override
    public String getDisplayString(String[] children) {
        return "spnr_node";
    }

}
