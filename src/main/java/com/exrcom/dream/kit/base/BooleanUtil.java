package com.exrcom.dream.kit.base;

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

}
