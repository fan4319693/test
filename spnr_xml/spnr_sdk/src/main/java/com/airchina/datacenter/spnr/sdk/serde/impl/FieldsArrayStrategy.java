package com.airchina.datacenter.spnr.sdk.serde.impl;

import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.google.common.collect.Lists;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;

import java.lang.reflect.Field;
import java.util.List;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.serde.impl.FieldsArrayStrategy </p>
 * <p>Description: 将实体对象转换为字段数组 </p>
 * <p>Sample: new JsonStrategy() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class FieldsArrayStrategy implements SerdeStrategy {

    /**
     * 功能说明: 待解析的实体对象的类型
     * 取值范围: com.airchina.datacenter.spnr.sdk.dao.pojo包下的类
     * 最后修改时间: 2023/04/20
     */
    private transient Class<?> cls;

    /**
     * 功能说明: cls的属性数组
     * 依赖属性: cls
     * 最后修改时间: 2023/04/20
     */
    private Field[] fields;

    /**
     * 功能说明: 实体对象解析为Hive字段时的元数据(字段个数,名称,顺序,类型等)
     * 依赖属性: fields
     * 最后修改时间: 2023/04/20
     */
    private final StructObjectInspector structObjectInspector;

    /**
     * Description: 有参构造器
     * Parameter: 无
     *  @param cls: 待解析的实体对象的类型,不能为null
     * Throws: 无
     */
    public FieldsArrayStrategy(Class<?> cls) {
        this.cls = cls;
        this.fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
        }
        //初始化structObjectInspector,实体有多少属性，就定义多少输出字段
        List<Field> fieldList = Lists.newArrayList(this.fields);
        List<String> fieldNameList = Lists.transform(fieldList, f -> f.getName());
        List<ObjectInspector> inspectorList = Lists.transform(fieldList, f -> PrimitiveObjectInspectorFactory.
                getPrimitiveObjectInspectorFromClass(f.getType()));

        structObjectInspector = ObjectInspectorFactory.
                getStandardStructObjectInspector(fieldNameList, inspectorList);
    }

    @Override
    public StructObjectInspector getStructObjectInspector() {
        return structObjectInspector;
    }

    @Override
    public Object inspectObject(Object target) throws IllegalAccessException {
        if(target == null){
            return null;
        }
        if(!this.cls.isAssignableFrom(target.getClass())){
            throw new IllegalArgumentException("Wrong input class:" + target.getClass() + ", the input type should be " + cls.getName());
        }
        //使用反射获取字段值
        Object[] res = new Object[fields.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = fields[i].get(target);
        }
        return res;
    }

}
