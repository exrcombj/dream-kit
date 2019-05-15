package com.exrcom.dream.kit.base;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BooleanUtilTest {

    @Test
    public void booleanUtilTest() {
        assertThat(BooleanUtil.toBoolean("true")).isTrue();
        assertThat(BooleanUtil.toBoolean("TruE")).isTrue();
        assertThat(BooleanUtil.toBoolean("false")).isFalse();
        assertThat(BooleanUtil.toBoolean("FalsE")).isFalse();
        assertThat(BooleanUtil.toBoolean("abc")).isFalse();
        assertThat(BooleanUtil.toBoolean(null)).isFalse();

        assertThat(BooleanUtil.toBooleanObject("true")).isTrue();
        assertThat(BooleanUtil.toBooleanObject("TruE")).isTrue();
        assertThat(BooleanUtil.toBooleanObject("T")).isFalse();
        assertThat(BooleanUtil.toBooleanObject(null)).isNull();
    }
}
