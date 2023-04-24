package com.airchina.datacenter.spnr.sdk.utils;

import com.google.common.base.Joiner;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.utils.Constants </p>
 * <p>Description: 常量类 </p>
 * <p>Sample: Constants.COMMA </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class Constants {

    //===============================常用连接符================================

    /**
     * 功能说明: 逗号
     * 最后修改时间: 2023/04/20
     */
    public static final String COMMA = ",";

    /**
     * 功能说明: 横杠
     * 最后修改时间: 2023/04/20
     */
    public static final String HYPHEN = "-";

    /**
     * 功能说明: 竖线
     * 最后修改时间: 2023/04/20
     */
    public static final String PIPE = "|";

    /**
     * 功能说明: &符
     * 最后修改时间: 2023/04/20
     */
    public static final String AMPERSAND = "&";

    /**
     * 功能说明: 空格
     * 最后修改时间: 2023/04/20
     */
    public static final String SPACE = " ";

    /**
     * 功能说明: 空串
     * 最后修改时间: 2023/04/20
     */
    public static final String EMPTY = "";

    /**
     * 功能说明: 斜杠
     * 最后修改时间: 2023/04/20
     */
    public static final String SLASH = "/";

    //===============================业务的常量值================================

    public static final String XML_PATH_DEFAULT = "/OJ_SuperPNRWriteRQ/OJ_SuperPNR";

    //===============================常用连接器================================

    /**
     * 功能说明: 空串连接器, null值变为空串
     * 最后修改时间: 2023/04/20
     */
    public static final Joiner JoinByEmptyNull2Empty = Joiner.on(EMPTY).useForNull(EMPTY);

    /**
     * 功能说明: 逗号连接器, null值变为空串
     * 最后修改时间: 2023/04/20
     */
    public static final Joiner JoinByCommaNull2Empty = Joiner.on(COMMA).useForNull(EMPTY);

    /**
     * 功能说明: 横杠连接器, null值变为空串
     * 最后修改时间: 2023/04/20
     */
    public static final Joiner JoinByHyphenNull2Empty = Joiner.on(HYPHEN).useForNull(EMPTY);

    /**
     * 功能说明: 竖线连接器, null值变为空串
     * 最后修改时间: 2023/04/20
     */
    public static final Joiner JoinByPipeNull2Empty = Joiner.on(PIPE).useForNull(EMPTY);

    /**
     * 功能说明: 斜杠连接器, null值变为空串
     * 最后修改时间: 2023/04/20
     */
    public static final Joiner JoinBySlashNull2Empty = Joiner.on(SLASH).useForNull(EMPTY);

}
