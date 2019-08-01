package com.exrcom.dream.kit.base;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BooleanUtilTest {

    @Test
    public void booleanUtilTest() {
        assertThat(BooleanUtil.toBoolean("true")).isTrue();
        assertThat(BooleanUtil.toBoolean("TRUE")).isTrue();
        assertThat(BooleanUtil.toBoolean("false")).isFalse();
        assertThat(BooleanUtil.toBoolean("FALSE")).isFalse();
        assertThat(BooleanUtil.toBoolean("abc")).isFalse();
        assertThat(BooleanUtil.toBoolean(null)).isFalse();

        assertThat(BooleanUtil.toBooleanObject("true")).isTrue();
        assertThat(BooleanUtil.toBooleanObject("TruE")).isTrue();
        assertThat(BooleanUtil.toBooleanObject("T")).isFalse();
        assertThat(BooleanUtil.toBooleanObject(null)).isNull();

        assertThat(BooleanUtil.toBooleanObject(null, true)).isTrue();
        assertThat(BooleanUtil.toBooleanObject(null, false)).isFalse();
    }

    @Test
    public void testParseString() {
        assertThat(BooleanUtil.parseString("true")).isTrue();
        assertThat(BooleanUtil.parseString("ON")).isTrue();
        assertThat(BooleanUtil.parseString("yes")).isTrue();
        assertThat(BooleanUtil.parseString("y")).isTrue();
        assertThat(BooleanUtil.parseString("t")).isTrue();

        assertThat(BooleanUtil.parseString("false")).isFalse();
        assertThat(BooleanUtil.parseString("OFF")).isFalse();
        assertThat(BooleanUtil.parseString("NO")).isFalse();

        assertThat(BooleanUtil.parseString("")).isNull();
        assertThat(BooleanUtil.parseString("abc")).isNull();
        assertThat(BooleanUtil.parseString(null)).isNull();

    }

    @Test
    public void testParseStringWithDefault() {
        assertThat(BooleanUtil.parseString("true", Boolean.FALSE)).isTrue();
        assertThat(BooleanUtil.parseString("false", Boolean.TRUE)).isFalse();

        assertThat(BooleanUtil.parseString("", Boolean.TRUE)).isTrue();
        assertThat(BooleanUtil.parseString("abc", Boolean.FALSE)).isFalse();
    }

    @Test
    public void testNegate() {
        assertThat(BooleanUtil.negate(Boolean.TRUE)).isFalse();
        assertThat(BooleanUtil.negate(Boolean.FALSE)).isTrue();
    }

    @Test
    public void testAnd() {
        assertThat(BooleanUtil.and(true, true, false)).isFalse();
        assertThat(BooleanUtil.and(true, true)).isTrue();
    }

    public void testOr() {
        assertThat(BooleanUtil.or(false, false, true)).isTrue();
        assertThat(BooleanUtil.or(false, false)).isFalse();
    }


}
