package com.airchina.datacenter.spnr.sdk.serde;


import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy </p>
 * <p>Description: 将实体对象转换为Hive字段的策略接口 </p>
 * <p>Sample: 见impl包下实现类 </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public interface SerdeStrategy {

    /**
     * Description: 实体对象解析为Hive字段时的元数据(字段个数,名称,顺序,类型等)
     * Parameter: 无
     * Return: 元数据对象
     * Throws: 无
     */
    StructObjectInspector getStructObjectInspector();

    /**
     * Description: 实体对象解析为Hive字段时的具体数据
     * Parameter: 无
     *  @param target: 待解析的实体对象, 不能为null
     * Return: 实体对象解析出的字段数据
     * Throws: Exception, 解析过程中抛出, 能导致任务失败
     */
    Object inspectObject(Object target) throws Exception;

}
