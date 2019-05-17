package com.exrcom.dream.kit.base;

import org.apache.commons.lang3.BooleanUtils;

/**
 * 1. 从String(true/false, yes/no)，转换为Boolean或boolean
 *
 * 2. 逻辑运算：取反，多个boolean的and,or 计算
 *
 */
public class BooleanUtil {

    /**
     * 使用JDK，只分析是否忽略大小写的"true", str为空时返回false
     */
    public static boolean toBoolean(String str) {
        return Boolean.parseBoolean(str);
    }

    /**
     * 使用JDK，只分析是否忽略大小写的"true", str为空时返回null
     */
    public static Boolean toBooleanObject(String str) {
        return str != null ? Boolean.valueOf(str) : null;
    }

    /**
     * 使用JDK，只分析是否忽略大小写的"true", str为空时返回 defaultValue
     */
    public static Boolean toBooleanObject(String str, Boolean defaultValue) {
        return str != null ? Boolean.valueOf(str) : defaultValue;
    }

    /**
     * wrapper for apache common BooleanUtils.toBooleanObject
     * 支持true/false, on/off, y/n, yes/no的转换, str为空或无法分析时返回null
     */
    public static Boolean parseString(String str) {
        return BooleanUtils.toBooleanObject(str);
    }

    /**
     * wrapper for apache common BooleanUtils.toBooleanDefaultIfNull
     * 支持true/false,on/off, y/n, yes/no的转换, str为空或无法分析时返回defaultValue
     */
    public static Boolean parseString(String str, Boolean defaultValue) {
        return BooleanUtils.toBooleanDefaultIfNull(BooleanUtils.toBooleanObject(str), defaultValue);
    }

    /**
     * wrapper for apache common BooleanUtils.negate
     */
    public static Boolean negate(final Boolean bool) {
        return BooleanUtils.negate(bool);
    }

    /**
     * wrapper for apache common BooleanUtils.and
     */
    public static boolean and(final boolean... array) {
        return BooleanUtils.and(array);
    }

    /**
     * wrapper for apache common BooleanUtils.or
     */
    public static boolean or(final boolean... array) {
        return BooleanUtils.or(array);
    }

}
