package com.exrcom.dream.kit.base;


import java.util.Arrays;

public class ObjectUtil {

    /**
     * 多个对象的HashCode串联, 组成新的HashCode
     */
    public static int hashCode(Object... objects) {
        return Arrays.hashCode(objects);
    }
}
