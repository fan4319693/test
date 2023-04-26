package com.airchina.datacenter.spnr.udf;

import com.airchina.datacenter.spnr.sdk.facade.UdtfFacade;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.parser.ParserProvider;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector.Category;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector.PrimitiveCategory;
import org.apache.hadoop.hive.serde2.objectinspector.StructField;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.WritableConstantStringObjectInspector;
import org.apache.hadoop.io.Text;

import java.util.List;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.udf.XmlTabUDTF </p>
 * <p>Description: 将xml文本解析为Hive表中的字段 </p>
 * <p>Sample: new XmlPathUDTF() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class XmlTabUDTF extends GenericUDTF {

    /**
     * 功能说明: 提取String的文本
     * 最后修改时间: 2023/04/20
     */
    private StringObjectInspector StringObjectInspector;

    /**
     * 功能说明: 特定的Hive表对应的转换器
     * 最后修改时间: 2023/04/20
     */
    private AbstractParser parser;

    /**
     * Description: 将UDTF传入的参数转换为java的String
     * Parameter:
     *  @param oi: Hive传入的参数, 不能为null
     *  @param parmaName: 参数名
     * Return: java String
     * Throws: UDFArgumentException, 类型非法或参数为空时抛出, 能导致任务失败
     */
    public String asConstantNonNullString(final ObjectInspector oi, final String parmaName)
            throws UDFArgumentException {
        if (!(oi instanceof WritableConstantStringObjectInspector)) {
            throw new UDFArgumentException(parmaName + " must be a constant string.");
        }
        final Text text = ((WritableConstantStringObjectInspector) oi).getWritableConstantValue();
        //参数不能为null
        if (text == null) {
            throw new UDFArgumentException(parmaName + " must not be NULL.");
        }
        return text.toString();
    }

    /**
     * Description: 验证参数类型为String
     * Parameter:
     *  @param field: 待检验的Hive参数, 不能为null
     * Return: 无
     * Throws: UDFArgumentException, 参数类型非法时抛出, 能导致任务失败
     */
    private void checkStringType(StructField field) throws UDFArgumentException {
        ObjectInspector inspector = field.getFieldObjectInspector();
        String name = field.getFieldName();
        if (inspector.getCategory() != Category.PRIMITIVE) {
            throw new UDFArgumentException("The input param " + name + " must be primitive");
        }
        PrimitiveObjectInspector category = (PrimitiveObjectInspector) (inspector);
        //非String类型则抛异常
        if (category.getPrimitiveCategory() != PrimitiveCategory.STRING) {
            throw new UDFArgumentException("The input param " + name + " must be string type");
        }
    }

    /**
     * Description: UDTF的初始化方法
     * Parameter:
     *  @param argOIs: 入参元数据, 名称，顺序，类型, 个数等, 不能为null
     * Return: UDTF函数输出的元数据
     * Throws: UDFArgumentException, 参数错误时抛出, 能导致任务失败
     */
    @Override
    public StructObjectInspector initialize(StructObjectInspector argOIs) throws UDFArgumentException {
        List<? extends StructField> fieldRefs = argOIs.getAllStructFieldRefs();
        int argsNum = fieldRefs.size();
        if (argsNum == 2) {
            //参数1: 待解析的xml文本, 参数2: 待解析的Hive表对应转换器的名称
            checkStringType(fieldRefs.get(0));

            StringObjectInspector = (StringObjectInspector)fieldRefs.get(0).getFieldObjectInspector();

            checkStringType(fieldRefs.get(1));
            ObjectInspector inspector = fieldRefs.get(1).getFieldObjectInspector();
            //获取转换器
            String tableName = asConstantNonNullString(inspector, "table_name");
            parser = ParserProvider.provide(tableName);
        } else {
            throw new UDFArgumentException("We need 2 params:xml content and corresponding table name.");
        }
        return parser.getStructObjectInspector();
    }

    /**
     * Description: UDTF的具体解析方法
     * Parameter:
     *  @param args: 执行UDTF时的入参, 2个参数, 第一个为xml文本, 第二个为待解析的hive表对应的实体类名称
     * Return: 无
     * Throws: HiveException, 解析失败时抛出, 能导致任务失败
     */
    @Override
    public void process(Object[] args) throws HiveException {
        //待解析的xml文本
        String xmlContent = StringObjectInspector.getPrimitiveJavaObject(args[0]);
        //解析出的Hive记录
        List<? extends Object> results = UdtfFacade.process(xmlContent, parser);
        if (results != null) {
            for (Object row : results) {
                forward(row);
            }
        }
    }

    /**
     * Description: UDTF执行结束后调用
     * Parameter: 无
     * Return: 无
     * Throws: 无
     */
    @Override
    public void close() {}

}
