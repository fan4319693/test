package com.airchina.datacenter.spnr.sdk.facade;

import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.google.common.base.Preconditions;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.facade.UdtfFacade </p>
 * <p>Description: Udtf函数的门面, 解析xml到实体类, 再到字段集合等系列工作的入口 </p>
 * <p>Sample: UdtfFacade.process(xmlContent, parser); </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class UdtfFacade {

    /**
     * Description: 利用内部类对象将xml字符串转换为java的原始类OJSuperPNR
     * Parameter:
     *  @param xmlText: xml对象的字符串, 不能为null
     * Return: Java的原始类OJSuperPNR
     * Throws: 无
     */
    private static OJSuperPNR parseXml2JavaBean(String xmlText) {
        OJSuperPNR spnr = null;
        try {
            //内部类定义的单例对象完成转换
            spnr = SpnrXml2JavaConverter.getInstance().convert(xmlText);
        } catch (JAXBException e) {
           e.printStackTrace();
        }
        return spnr;
    }

    /**
     * Description: 根据udtf选择特定的转换器, 转换xml文本为Hive字段集合
     * Parameter:
     *  @param xmlText: 待解析的xml文本, 不能为null
     *  @param parser: 解析器, 将xml转换为特定Hive表对应的JavaBean
     * Return: 解析出的多条Hive记录对应的字段值
     * Throws: 无
     */
    public static List<? extends Object> process(String xmlText, AbstractParser parser) {
        Preconditions.checkNotNull(xmlText, "Null xmlText");
        Preconditions.checkNotNull(parser, "Null parser");

        //先将xml文本转换为Java的xml对象
        OJSuperPNR spnr = parseXml2JavaBean(xmlText);

        if (spnr != null) {
            try {
                //将OJSuperPNR转换为多条Hive记录的字段值
                List<? extends Object> list = parser.digest(spnr);
                return list;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Description: 内部定义的xml文本到xml对象的转换器
     */
    private static class SpnrXml2JavaConverter{

        /**
         * 功能说明: 单例转换器对象, 饿汉式
         * 最后修改时间: 2023/04/20
         */
        private static final SpnrXml2JavaConverter INSTANCE = new SpnrXml2JavaConverter();

        public static SpnrXml2JavaConverter getInstance() {
            return INSTANCE;
        }

        /**
         * 功能说明: xml文本反序列化为java的节点树
         * 最后修改时间: 2023/04/20
         */
        private Unmarshaller unmarshaller;

        /**
         * Description: 私有构造器, 单例模式
         * Parameter: 无
         * Throws: 无
         */
        private SpnrXml2JavaConverter() {
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(OJSuperPNR.class);
                unmarshaller = jaxbContext.createUnmarshaller();
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }

        /**
         * Description: xml文本反序列化为java的节点树
         * Parameter:
         *  @param xmlText: 待解析的xml文本
         * Return: java节点树
         * Throws JAXBException, 转换失败时抛出, 能导致任务失败
         */
        public OJSuperPNR convert(String xmlText) throws JAXBException {
            try {
                OJSuperPNR spnr = (OJSuperPNR) unmarshaller.unmarshal(
                        new ByteArrayInputStream(xmlText.getBytes("UTF-8")));
                return spnr;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}
