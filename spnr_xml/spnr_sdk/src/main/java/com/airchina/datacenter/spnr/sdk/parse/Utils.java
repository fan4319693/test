package com.airchina.datacenter.spnr.sdk.parse;

import com.airchina.datacenter.spnr.sdk.entity.AirReservationType;
import com.airchina.datacenter.spnr.sdk.entity.EmailType;
import com.airchina.datacenter.spnr.sdk.entity.PersonNameType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class Utils {

    public static final String PIPE = "|";
    public static final String BAR = "-";

    private static final Logger LOG = LoggerFactory.getLogger(Utils.class);

    /**
     * 空安全的属性设置
     *
     * @param inputString
     * @param mapper
     * @param setter
     * @param <T>
     */
    public static <T> void nullSafeSet(Consumer<T> setter, String inputString, Function<String, T> mapper) {
        if (StringUtils.isEmpty(inputString)) {
            return;
        }
        try {
            T result = mapper.apply(inputString);
            setter.accept(result);
        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
        }
    }

    public static void nullSafeSet(Consumer<String> setter, String inputString) {
        nullSafeSet(setter, inputString, Function.identity());
    }

    public static <T> Stream<T> streamNullable(final Collection<T> collection) {
        if (collection == null) {
            return Stream.empty();
        } else {
            return collection.stream();
        }
    }

    public static int tyrParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    public static Double tryParseDouble(BigDecimal input) {
        if (input == null) {
            return null;
        }
        return input.doubleValue();
    }

    public static Double tryParseDouble(Integer input) {
        if (input == null) {
            return null;
        }
        return Double.valueOf(input);
    }

    public static String list2String(List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            return "";
        }
        return StringUtils.join(list, ",");
    }

    public static <T> T getFirstOrNull(List<T> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T getFirstOrDefault(List<T> list, T defaultValue) {
        if (CollectionUtils.isEmpty(list)) {
            return defaultValue;
        }
        return list.get(0);
    }

    public static <T> Optional<T> getFirstOptional(List<T> list) {
        if (CollectionUtils.isEmpty(list)) {
            return Optional.empty();
        }
        return Optional.of(list.get(0));
    }

    public static String getName(PersonNameType pName) {

        String personName = "";
        if (CollectionUtils.isNotEmpty(pName.getGivenName())) {
            personName += pName.getGivenName().get(0).getValue() + "/";
        }

        personName += pName.getSurname().getValue();

        return personName;

    }

    public static String getEmail(List<EmailType> emailTypes) {
        if (CollectionUtils.isEmpty(emailTypes)) {
            return "";
        }
        return emailTypes.get(0).getValue();
    }


    public static int toInt(BigDecimal intput) {
        if (intput == null) {
            return 0;
        }
        return intput.intValue();
    }

    public static int toInt(BigInteger intput) {
        if (intput == null) {
            return 0;
        }
        return intput.intValue();
    }

    public static String toString(BigInteger intput) {
        if (intput == null) {
            return "";
        }
        return String.valueOf(intput.intValue());
    }

    public static <T> String getValue(T input, Function<T, String> func) {
        if (input == null) {
            return null;
        }
        return func.apply(input);
    }

    public static String getPNR(List<AirReservationType.BookingReferenceID> refList) {
        if (CollectionUtils.isEmpty(refList)) {
            return "";
        }

        return refList.get(0).getID();
    }
}
