package com.exrcom.dream.kit.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *  mark parameter, filed, method could't be null
 */
@Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD})
public @interface NotNull {
}
