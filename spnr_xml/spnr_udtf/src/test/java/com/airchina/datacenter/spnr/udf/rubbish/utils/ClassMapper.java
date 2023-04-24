package com.airchina.datacenter.spnr.udf.rubbish.utils;

import org.apache.hadoop.hive.serde2.objectinspector.StandardStructObjectInspector;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ClassMapper implements Serializable {

//    private final Class targetTableClz;
//
//    private Field[] javaFields;
//    private int javaFieldNum;
//    private StandardStructObjectInspector hiveStruct;
//
//    private final Function<SPNRContext, Object> selectObjFunc;
//    private final BiFunction<Object, ClassMapper, List> mapperFunc;
//
//    public List apply(SPNRContext spnrContext) {
//        return this.mapperFunc.apply(
//            this.selectObjFunc.apply(spnrContext), this
//        );
//    }
//
//    public ClassMapper(Class targetTableClz,
//        Function<SPNRContext, Object> selectObjFunc, BiFunction mapperFunc) {
//        this.targetTableClz = targetTableClz;
//        this.selectObjFunc = selectObjFunc;
//        this.mapperFunc = mapperFunc;
//    }
//
//    public StandardStructObjectInspector getHiveStruct() {
//        return hiveStruct;
//    }
//
//    public void setHiveStruct(StandardStructObjectInspector hiveStruct) {
//        this.hiveStruct = hiveStruct;
//    }
//
//    public Class getTargetTableClz() {
//        return targetTableClz;
//    }
//
//    public Field[] getJavaFields() {
//        return javaFields;
//    }
//
//    public void setJavaFields(Field[] javaFields) {
//        this.javaFields = javaFields;
//    }
//
//    public int getJavaFieldNum() {
//        return javaFieldNum;
//    }
//
//    public void setJavaFieldNum(int javaFieldNum) {
//        this.javaFieldNum = javaFieldNum;
//    }
}
