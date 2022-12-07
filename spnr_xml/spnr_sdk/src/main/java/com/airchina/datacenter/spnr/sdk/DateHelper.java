package com.airchina.datacenter.spnr.sdk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author wgni
 * @since 2022/7/4
 */
public class DateHelper {

    private static final DateTimeFormatter DEFAULT_DATETIME_PATTERN =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String xmlDate2String(XMLGregorianCalendar cal) {
        if (cal == null) {
            return null;
        }
        LocalDateTime localDateTime
                = LocalDateTime.ofInstant(cal.toGregorianCalendar().toInstant(),
                TimeZone.getDefault().toZoneId());

        return localDateTime.format(DEFAULT_DATETIME_PATTERN);

    }
}
