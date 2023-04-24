package com.airchina.datacenter.spnr.sdk.parser;

import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.AbstractParser </p>
 * <p>Description: 转换器的抽取类 </p>
 * <p>Sample: 见impl包下实现类 </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public abstract class AbstractParser {

    /**
     * 功能说明: 实体对象的解析策略(接口,待子类实现)
     * 取值范围: 目前的实现有2种, 字段数组策略及json字符串策略, 默认使用字段数组
     * 最后修改时间: 2023/04/20
     */
    protected SerdeStrategy strategy;

    /**
     * Description: 转换器的构造器
     * Parameter:
     *  @param strategy: 实体对象的解析策略, 不能为null
     * Return: 无
     * Throws: 无
     */
    public AbstractParser(SerdeStrategy strategy){
        this.strategy = strategy;
    }

    /**
     * Description: 将xml的OJSuperPNR的特定节点解析为实体类集合(子类实现)
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体类集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    public abstract List<? extends Object> parse(OJSuperPNR spnr);

    /**
     * Description: 获取解析实体对象时的元数据(字段个数,名称,类型等), 由解析策略提供
     * Parameter: 无
     * Return: UDTF函数的元数据对象
     * Throws: 无
     */
    public StructObjectInspector getStructObjectInspector(){
        return this.strategy.getStructObjectInspector();
    }

    /**
     * Description: 公共方法, 将xml的节点解析为hive字段集合(字段数组或json串)
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: UDTF解析出的hive字段集合
     * Throws: 无
     */
    public List<? extends Object> digest(OJSuperPNR spnr){
        //先将节点解析为实体类
        List<? extends Object> parsed = parse(spnr);
        if(CollectionUtils.isEmpty(parsed)){
            return null;
        }
        //将实体类解析为hive字段集合
        List<Object> res = new LinkedList<>();
        for (Object o : parsed) {
            try {
                Object digestedObj = this.strategy.inspectObject(o);
                res.add(digestedObj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return res;
    }

}
