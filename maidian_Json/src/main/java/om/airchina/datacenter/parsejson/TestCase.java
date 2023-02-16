package om.airchina.datacenter.parsejson;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.JavaStringObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;

public class TestCase {
    public static void main(String[] args) throws HiveException {
        ConcatJsonArrayField jsonArrayField = new ConcatJsonArrayField();
        ObjectInspector inspector0 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        ObjectInspector inspector1 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        ObjectInspector inspector2 = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
        JavaStringObjectInspector initialize = (JavaStringObjectInspector) jsonArrayField.initialize(new ObjectInspector[]{
                inspector0, inspector1, inspector2});

        /* MH55FE 8miGQF/6XGq0Yj1JEllyrA==
         */

        String str="{\"storey_id\":\"zggjhk_pcgn_result_sscxq\",\"storey_name\":\"首页功能区\",\"element_id\":\"zggjhk_pcgn_result_sscxq_cxss_000001\",\"element_name\":\"重新查询\",\"trip\":\"往返\",\"flight number\":3,\"adults\":1,\"child\":1,\"infant\":1,\"disabled\":0,\"line\":[{\"num\":1,\"depcountry\":\"中国\",\"arrcountry\":\"中国\",\"depcity\":\"北京大兴\",\"arrcity\":\"重庆\",\"depairport\":\"北京大兴国际机场\",\"arrairport\":\"重庆江北机场\",\"depairport abbr\":\"pkx\",\"arrairport abbr\":\"ckg\",\"depday\":\"2023-01-10\",\"week\":2},{\"num\":2,\"depcountry\":\"中国\",\"arrcountry\":\"中国\",\"depcity\":\"重庆\",\"arrcity\":\"北京大兴\",\"depairport\":\"重庆江北机场\",\"arrairport\":\"北京大兴国际机场\",\"depairport abbr\":\"ckg\",\"arrairport abbr\":\"pkx\",\"depday\":\"2023-01-20\",\"week\":5}],\"aircraft segment\":\"pkx-ckg\"}";
        JSONObject jsonObject = JSON.parseObject(str);
        String line = jsonObject.get("line").toString();
        GenericUDF.DeferredJavaObject column = new GenericUDF.DeferredJavaObject(line);
        GenericUDF.DeferredJavaObject keyByKey = new GenericUDF.DeferredJavaObject("depairport");
        GenericUDF.DeferredJavaObject key = new GenericUDF.DeferredJavaObject("arrairport");

        Object evaluate = jsonArrayField.evaluate(new GenericUDF.DeferredObject[]{column, keyByKey, key});
        System.out.println(evaluate);
    }
}
