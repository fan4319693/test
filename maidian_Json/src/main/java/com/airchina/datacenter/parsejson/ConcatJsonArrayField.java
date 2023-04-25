package com.airchina.datacenter.parsejson;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector;

public class ConcatJsonArrayField extends GenericUDF {
    private StringObjectInspector stringJsonArray;
    private StringObjectInspector columnOne;
    private StringObjectInspector columnTwo;
    @Override
    public ObjectInspector initialize(ObjectInspector[] objectInspectors) throws UDFArgumentException {
        // 1. 参数个数检查
        if (objectInspectors.length != 3) {
            throw new UDFArgumentException("There must be three parameters");
        }

        // 2. 参数类型检查
        if (objectInspectors[0].getCategory() != ObjectInspector.Category.PRIMITIVE
                || !PrimitiveObjectInspector.PrimitiveCategory.STRING.equals(((PrimitiveObjectInspector)objectInspectors[0]).getPrimitiveCategory())){
            // 参数是Hive的string类型
            throw new UDFArgumentException("The first argument is a string");
        }

        if (objectInspectors[1].getCategory() != ObjectInspector.Category.PRIMITIVE
                || !PrimitiveObjectInspector.PrimitiveCategory.STRING.equals(((PrimitiveObjectInspector)objectInspectors[1]).getPrimitiveCategory())) {
            // 参数是Hive的string类型
            // 当自定义UDF参数与预期不符时，抛出异常
            throw new UDFArgumentException("The second argument is a string");
        }

        if (objectInspectors[2].getCategory() != ObjectInspector.Category.PRIMITIVE
                || !PrimitiveObjectInspector.PrimitiveCategory.STRING.equals(((PrimitiveObjectInspector)objectInspectors[2]).getPrimitiveCategory())){
            // 参数是Hive的string类型
            // 当自定义UDF参数与预期不符时，抛出异常
            throw new UDFArgumentException("The third argument is a string");
        }
        this.stringJsonArray=(StringObjectInspector) objectInspectors[0];
        this.columnOne=(StringObjectInspector) objectInspectors[1];
        this.columnTwo=(StringObjectInspector) objectInspectors[2];

        //函数返回值
        return  PrimitiveObjectInspectorFactory.javaStringObjectInspector;
    }

    @Override
    public Object evaluate(DeferredObject[] deferredObjects) throws HiveException {
        String stringJsonArray = this.stringJsonArray.getPrimitiveJavaObject(deferredObjects[0].get());
        if(StringUtils.isEmpty(stringJsonArray)){
            return "";
        }
        JSONArray array= JSONArray.parseArray(stringJsonArray);
        String columnOne = this.columnOne.getPrimitiveJavaObject(deferredObjects[1].get());
        String columnTwo = this.columnTwo.getPrimitiveJavaObject(deferredObjects[2].get());
        String resultStr="";

        for(int i=0;i<array.size();i++){
            if(array.get(i)!=null ) {
                if(i>=1){
                    resultStr+=";";
                }
                JSONObject jsonObject = JSON.parseObject(array.get(i).toString());
                String str1 = jsonObject.getString(columnOne);
                String str2 = jsonObject.getString(columnTwo);
                resultStr += str1 + "-" + str2;
            }
        }
        return resultStr;
    }

    @Override
    public String getDisplayString(String[] strings) {
        return "Function to get the value for traversing the JSON array";
    }
}
