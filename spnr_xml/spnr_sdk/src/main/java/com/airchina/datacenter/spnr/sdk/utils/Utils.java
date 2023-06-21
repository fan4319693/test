package com.airchina.datacenter.spnr.sdk.utils;

import com.google.common.base.Joiner;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.utils.Utils </p>
 * <p>Description: 公共类,业务无关 </p>
 * <p>Sample: Utils.toWrapperLong("100") </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class Utils {

    /**
     * Description: 集合转换为Jdk的stream流
     * Parameter:
     *  @param collection: 泛型集合,可以为空
     *  @param <T>
     * Return: jdk的stream流
     * Throws: 无
     */
    public static <T> Stream<T> streamNullable(final Collection<T> collection) {
        if (collection == null) {
            return Stream.empty();
        } else {
            return collection.stream();
        }
    }

    //****************************时间格式转换********************************

    /**
     * 功能说明: yyyy-MM-dd HH:mm:ss格式的时间转换器
     * 最后修改时间: 2023/04/20
     */
    private static final DateTimeFormatter DEFAULT_DATETIME_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * Description: xml时间格式转换(上海时区)
     * Parameter:
     *  @param cal: XMLGregorianCalendar,可以为空
     * Return: yyyy-MM-dd HH:mm:ss格式的String
     * Throws: 无
     */
    public static String xmlDate2StringWithShanghaiTimezone(XMLGregorianCalendar cal) {
        if (cal == null) {
            return null;
        }
        LocalDateTime localDateTime
                = LocalDateTime.ofInstant(cal.toGregorianCalendar().toInstant(),
                TimeZone.getTimeZone("Asia/Shanghai").toZoneId());

        return localDateTime.format(DEFAULT_DATETIME_PATTERN);
    }

    /**
     * Description: xml时间格式转换(世界统一时区)
     * Parameter:
     *  @param cal: XMLGregorianCalendar,可以为空
     * Return: yyyy-MM-dd HH:mm:ss格式的String
     * Throws: 无
     */
    public static String xmlDate2StringWithUtcTimezone(XMLGregorianCalendar cal) {
        if (cal == null) {
            return null;
        }
        LocalDateTime localDateTime
                = LocalDateTime.ofInstant(cal.toGregorianCalendar().toInstant(),
                TimeZone.getTimeZone("UTC").toZoneId());

        return localDateTime.format(DEFAULT_DATETIME_PATTERN);
    }

    //****************************字符串转化为数值类型********************************

    /**
     * Description: 数值或字符串转换为Long
     * Parameter:
     *  @param num: 待转换的对象, 仅能转换数值或字符序列类型, 可以为null
     * Return: 转换的Long
     * Throws: 无
     */
    public static Long toWrapperLong(Object num) {
        if (num == null || num == "") {
            return null;
        }
        if (Number.class.isAssignableFrom(num.getClass())) {
            return ((Number) num).longValue();
        } else if (CharSequence.class.isAssignableFrom(num.getClass())) {
            return Long.parseLong(num.toString());
        }
        return null;
    }

    /**
     * Description: 数值或字符串转换为Double
     * Parameter:
     *  @param num: 待转换的对象, 仅能转换数值或字符序列类型, 可以为null
     * Return: 转换的Double
     * Throws: 无
     */
    public static Double toWrapperDouble(Object num) {
        if (num == null) {
            return null;
        }
        if (Number.class.isAssignableFrom(num.getClass())) {
            return ((Number) num).doubleValue();
        } else if (CharSequence.class.isAssignableFrom(num.getClass())) {
            return Double.parseDouble(num.toString());
        }
        return null;
    }

    /**
     * Description: 数类型转为Double, 再转为BigDecimal
     * Parameter:
     *  @param num: 待转换的对象, 仅能转换数值或字符序列类型, 可以为null
     * Return: 转换的BigDecimal
     * Throws: 无
     */
    public static BigDecimal toBigDecimal(Object num) {
        if (num == null) {
            return null;
        }
        if (CharSequence.class.isAssignableFrom(num.getClass())) {
            double doubleValue = Double.parseDouble(num.toString());
            return BigDecimal.valueOf(doubleValue);
        } else if (Number.class.isAssignableFrom(num.getClass())) {
            return BigDecimal.valueOf(((Number) num).doubleValue());
        }
        return null;
    }

    //****************************数值、bool类型转换为String*****************************

    /**
     * Description: Boolean类转换为String
     * Parameter:
     *  @param b: 待转换的Boolean对象
     * Return: 转换的字符串("true", "false", null)
     * Throws: 无
     */
    public static String boolean2String(Boolean b) {
        if (b == null) {
            return null;
        }
        return String.valueOf(b);
    }

    /**
     * Description: 将包装数值类型转化为String
     * Parameter:
     *  @param num: 待转换的数值对象, 可以为null
     * Return: 转换的字符串
     * Throws: 无
     */
    public static String number2String(Number num) {
        if (num == null) {
            return null;
        }
        Class<? extends Number> cls = num.getClass();
        if (cls.equals(Byte.class)) {
            return String.valueOf(num.byteValue());
        } else if (cls.equals(Short.class)) {
            return String.valueOf(num.shortValue());
        } else if (cls.equals(Integer.class)) {
            return String.valueOf(num.intValue());
        } else if (cls.equals(Long.class)) {
            return String.valueOf(num.longValue());
        } else if (cls.equals(Double.class)) {
            return String.valueOf(num.doubleValue());
        } else if (cls.equals(Float.class)) {
            return String.valueOf(num.floatValue());
        } else if (cls.equals(BigDecimal.class)) {
            return ((BigDecimal) num).toPlainString();
        } else if (cls.equals(BigInteger.class)) {
            return String.valueOf(num.longValue());
        }
        return null;
    }

    //******************************数组String拼接**********************************

    /**
     * Description: 将多个String拼接起来(略过null)
     * Parameter:
     *  @param strs: 字符串数组, 可以为null
     * Return: 多个字符串拼接的串
     * Throws: 无
     */
    public static String concatStringNull2Empty(String... strs) {
        if (strs == null) {
            return Constants.EMPTY;
        }
        return joinString(Constants.JoinByEmptyNull2Empty, strs);
    }

    /**
     * Description: 将多个String用分隔符拼接
     * Parameter:
     *  @param joiner: 连接器, 不能为null
     *  @param strs: 字符串数组, 可以为null
     * Return: 用分隔符拼接起来的串
     * Throws: 无
     */
    public static String joinString(Joiner joiner, String... strs) {
        if (strs == null) {
            return null;
        }
        return joiner.join(strs);
    }

    //****************************集合String拼接********************************

    /**
     * Description: 拼接字符串, 默认使用逗号拼接(略过null)
     * Parameter:
     *  @param col: 字符串集合, 可以为null
     * Return: 用逗号拼接起来的串
     * Throws: 无
     */
    public static String collection2String(Collection<String> col) {
        return collection2String(col, Function.identity(), Constants.JoinByCommaNull2Empty);
    }

    /**
     * Description: 拼接字符串, 可以对集合做一次转换, 默认使用逗号拼接(略过null)
     * Parameter:
     *  @param col: 对象集合, 可以为null
     *  @param func: 对象转换为String的函数
     *  @param <I>
     * Return: 用逗号拼接起来的串
     * Throws: 无
     */
    public static <I> String collection2String(Collection<I> col,
                                               Function<? super I, String> func) {
        return collection2String(col, func, Constants.JoinByCommaNull2Empty);
    }

    /**
     * Description: 拼接字符串, 可以对集合做一次转换, 自定义拼接方式(分隔符,空值处理等)
     * Parameter:
     *  @param col: 对象集合, 可以为null
     *  @param func: 对象转换为String的函数
     *  @param joiner: 自定义的连接器,不能为null
     *  @param <I>
     * Return: 用分隔符拼接起来的串
     * Throws: 无
     */
    public static <I> String collection2String(Collection<I> col,
                                               Function<? super I, String> func,
                                               Joiner joiner) {
        if (col == null) {
            return null;
        }
        return joiner.join(col
                .stream()
                .map(nullFuncWrapper(func))
                .iterator());
    }

    /**
     * Description: 集合flatMap为String拼接
     * Parameter:
     *  @param col: 对象集合, 可以为null
     *  @param func: FlatMap函数
     *  @param joiner: 自定义的连接器,不能为null
     *  @param <I>
     * Return: 用分隔符拼接起来的串
     * Throws: 无
     */
    public static <I> String collectionFlatmap2String(Collection<I> col,
                                                      Function<? super I, Stream<String>> func,
                                                      Joiner joiner) {
        if (col == null) {
            return null;
        }
        Iterator<?> iter = col
                .stream()
                .flatMap(t -> t != null ? func.apply(t) : Stream.empty())
                .iterator();
        return joiner.join(iter);
    }

    /**
     * Description: Stream流拼接为字符串, 自定义拼接方式(分隔符,空值处理等)
     * Parameter:
     *  @param col: 对象集合, 可以为null
     *  @param func: 转换函数
     *  @param joiner: 自定义的连接器,不能为null
     *  @param <I>
     * Return: 用分隔符拼接起来的串
     * Throws: 无
     */
    public static <I> String stream2String(Stream<I> col,
                                           Function<? super I, String> func,
                                           Joiner joiner) {
        if (col == null) {
            return null;
        }
        return joiner.join(col
                .map(nullFuncWrapper(func))
                .iterator());
    }

    //****************************获取集合的首个非空元素********************************

    /**
     * Description: 获取集合的首个非空元素, 并转换
     * Parameter:
     *  @param col: 对象集合, 可以为null
     *  @param fun: 转换函数, 不能为null
     *  @param <I>
     *  @param <O>
     * Return: 取首个非空元素并转换, 不存在非空元素返回null
     * Throws: 无
     */
    public static <I, O> O getFirstNonNullApply(Iterable<I> col,
                                                Function<? super I, O> fun) {
        if (col == null) {
            return null;
        }
        for (I t : col) {
            if (t != null) {
                return fun.apply(t);
            }
        }
        return null;
    }

    /**
     * Description: 获取集合的首个非空元素, 并消费
     * Parameter:
     *  @param col: 对象集合, 可以为null
     *  @param fun: 消费函数, 不能为null
     * @param <I>
     * Return: 取首个非空元素并消费
     * Throws: 无
     */
    public static <I> void getFirstNonNullConsume(Iterable<I> col,
                                                  Consumer<? super I> fun) {
        if (col == null) {
            return;
        }
        for (I t : col) {
            if (t != null) {
                fun.accept(t);
                break;
            }
        }
    }

    /**
     * Description: 获取集合的首个非空元素
     * Parameter:
     *  @param col: 对象集合, 可以为null
     *  @param <T>
     * Return: 取首个非空元素, 不存在则返回null
     * Throws: 无
     */
    public static <T> T getFirstNonNull(Iterable<T> col) {
        if (col == null) {
            return null;
        }
        for (T t : col) {
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    /**
     * Description: 返回集合的首个非空的包装元素
     * Parameter:
     *  @param col: 对象集合, 可以为null
     *  @param <T>
     * Return: 取首个包装的非空元素, 不存在则返回空Option
     * Throws: 无
     */
    public static <T> Optional<T> getFirstNonNullOptional(Iterable<T> col) {
        if (col == null) {
            return Optional.empty();
        }
        for (T t : col) {
            if (t != null) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }

    /**
     * Description: 获取集合的首个非空元素，若没有返回默认值
     * Parameter:
     *  @param col: 对象集合, 可以为null
     *  @param defaultValue: 默认值
     *  @param <T>
     * Return: 首个非空元素，若没有则返回默认值
     * Throws: 无
     */
    public static <T> T getFirstNonNullOrDefault(Iterable<T> col, T defaultValue) {
        if (col == null) {
            return defaultValue;
        }
        for (T t : col) {
            if (t != null) {
                return t;
            }
        }
        return defaultValue;
    }

    //****************************空值处理函数********************************

    /**
     * Description: 类似sql的nvl函数, 第一个值为空, 则取默认的第二个值
     * Parameter:
     *  @param t: 待判断的值
     *  @param defaultValue: 默认值, 不能为null
     *  @param <T>
     * Return: t为null则返回默认值, 否则返回t
     * Throws: 无
     */
    public static <T> T null2Default(T t, T defaultValue) {
        return t != null ? t : defaultValue;
    }

    /**
     * Description: 类似sql的coalesce函数, 取数组中第一个不为null的, 都为空则返回null
     * Parameter:
     *  @param arr: 待判断的数组, 可以为null
     *  @param <T>
     * Return: 数组中首个不为null的, 都为空则返回null
     * Throws: 无
     */
    public static <T> T coalesce(T... arr) {
        if (arr == null) {
            return null;
        }
        for (T t : arr) {
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    /**
     * Description: 类似sql的coalesce函数, 取包装数组中第一个非空的, 都为空则返回null
     * Parameter:
     *  @param arr: 待判断的包装型数组, 可以为null
     *  @param <T>
     * Return: 数组中首个非空的, 都为空则返回null
     * Throws: 无
     */
    public static <T> T coalesce(Optional<T>... arr) {
        if (arr == null) {
            return null;
        }
        for (Optional<T> t : arr) {
            if (t.isPresent()) {
                return t.get();
            }
        }
        return null;
    }

    /**
     * Description: 元素非空则转换
     * Parameter:
     *  @param input: 待判断的值, 可以为null
     *  @param func: 转换函数, 不能为null
     *  @param <I>
     *  @param <O>
     * Return: input不为null则转换, 否则返回null
     * Throws: 无
     */
    public static <I, O> O applyOrNull(I input, Function<? super I, O> func) {
        if (input == null) {
            return null;
        }
        return func.apply(input);
    }

    /**
     * Description: 元素非空则消费
     * Parameter:
     *  @param input: 待判断的值, 可以为null
     *  @param func: 消费函数, 不能为null
     *  @param <I>
     * Return: 无
     * Throws: 无
     */
    public static <I> void consumeOrNull(I input, Consumer<? super I> func) {
        if (input != null) {
            func.accept(input);
        }
    }

    /**
     * Description: 对转换函数作包装，防止null值异常
     * Parameter:
     *  @param raw: 待包装的转换函数, 不能为null
     *  @param <I>
     *  @param <O>
     * Return: 排除null值后的转换函数
     * Throws: 无
     */
    private static <I, O> Function<I, O> nullFuncWrapper(Function<I, O> raw) {
        return t -> t != null ? raw.apply(t) : null;
    }

    //****************************xml相关函数********************************

    /**
     * Description: 将Xml的Node的子节点转换为Element集合, 仅在特定场景下可用
     * Parameter:
     *  @param list: Xml的Node, 不能为null
     * Return: Element集合
     * Throws: 无
     */
    public static List<Element> nodeList2Element(NodeList list) {
        int size = list.getLength();
        List<Element> res = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            res.add((Element) list.item(i));
        }
        return res;
    }

}
