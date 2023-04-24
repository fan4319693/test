package com.airchina.datacenter.spnr.sdk.serde.impl;

import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;

import java.util.List;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.serde.impl.JsonStrategy </p>
 * <p>Description: 将实体对象转换为json </p>
 * <p>Sample: new JsonStrategy() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class JsonStrategy implements SerdeStrategy {

    /**
     * 功能说明: 实体对象解析为Hive字段时的元数据(字段个数,名称,顺序,类型等)
     * 取值范围: 只有一个string类型的字段(jsonInfo)
     * 最后修改时间: 2023/04/20
     */
    private StructObjectInspector structObjectInspector;

    /**
     * Description: 无参构造器
     * Parameter: 无
     * Throws: 无
     */
    public JsonStrategy(){
        //一个名为jsonInfo的字段, 类型为string
        List<String> names = Lists.newArrayList("jsonInfo");
        List<ObjectInspector> inspectors = Lists.newArrayList(PrimitiveObjectInspectorFactory.
                javaStringObjectInspector);
        structObjectInspector = ObjectInspectorFactory.
                getStandardStructObjectInspector(names, inspectors);
    }

    @Override
    public StructObjectInspector getStructObjectInspector() {
        return structObjectInspector;
    }

    @Override
    public Object inspectObject(Object target) {
        //使用FastJson序列化为字符串
        return JSON.toJSONString(target);
    }
}
