package com.airchina.datacenter.spnr.udf.rubbish.utils;

import java.util.ArrayList;
import java.util.List;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.StringObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.WritableConstantStringObjectInspector;
import org.apache.hadoop.io.Text;

public class Arguments {

    public static String asConstantNonNullString(final ObjectInspector oi, final String parmaName)
        throws UDFArgumentException {
        if (!(oi instanceof WritableConstantStringObjectInspector)) {
            throw new UDFArgumentException(parmaName + " must be a constant string.");
        }
        final Text text = ((WritableConstantStringObjectInspector) oi).getWritableConstantValue();
        if (text == null) {
            throw new UDFArgumentException(parmaName + " must not be NULL.");
        }
        return text.toString();
    }

    public static List<String> asConstantNonNullStrings(final List<ObjectInspector> ois, final String name)
        throws UDFArgumentException {
        final List<String> strs = new ArrayList<>();
        for (final ObjectInspector oi : ois) {
            strs.add(asConstantNonNullString(oi, name));
        }
        return strs;
    }

    public static StringObjectInspector asString(final ObjectInspector oi, final String name)
        throws UDFArgumentException {
        if (!(oi instanceof StringObjectInspector)) {
            throw new UDFArgumentException(name + " must be of string type.");
        }
        return (StringObjectInspector) oi;
    }
}
