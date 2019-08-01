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

        assertThat(BooleanUtil.toBooleanObject("true")).isEqualTo(Boolean.TRUE);
        assertThat(BooleanUtil.toBooleanObject("TruE")).isEqualTo(Boolean.TRUE);
        assertThat(BooleanUtil.toBooleanObject("T")).isEqualTo(Boolean.FALSE);
        assertThat(BooleanUtil.toBooleanObject(null)).isNull();

        assertThat(BooleanUtil.toBooleanObject(null, true)).isEqualTo(Boolean.TRUE);
        assertThat(BooleanUtil.toBooleanObject(null, false)).isEqualTo(Boolean.FALSE);
    }

    @Test
    public void testParseString() {
        assertThat(BooleanUtil.parseString("true")).isEqualTo(Boolean.TRUE);
        assertThat(BooleanUtil.parseString("ON")).isEqualTo(Boolean.TRUE);
        assertThat(BooleanUtil.parseString("yes")).isEqualTo(Boolean.TRUE);
        assertThat(BooleanUtil.parseString("y")).isEqualTo(Boolean.TRUE);
        assertThat(BooleanUtil.parseString("t")).isEqualTo(Boolean.TRUE);

        assertThat(BooleanUtil.parseString("false")).isEqualTo(Boolean.FALSE);
        assertThat(BooleanUtil.parseString("OFF")).isEqualTo(Boolean.FALSE);
        assertThat(BooleanUtil.parseString("NO")).isEqualTo(Boolean.FALSE);
        assertThat(BooleanUtil.parseString("n")).isEqualTo(Boolean.FALSE);
        assertThat(BooleanUtil.parseString("f")).isEqualTo(Boolean.FALSE);

        assertThat(BooleanUtil.parseString("")).isNull();
        assertThat(BooleanUtil.parseString("abc")).isNull();
        assertThat(BooleanUtil.parseString(null)).isNull();

    }

    @Test
    public void testParseStringWithDefault() {
        assertThat(BooleanUtil.parseString("true", Boolean.FALSE)).isEqualTo(Boolean.TRUE);
        assertThat(BooleanUtil.parseString("mm", Boolean.FALSE)).isEqualTo(Boolean.FALSE);
        assertThat(BooleanUtil.parseString("mm", Boolean.TRUE)).isEqualTo(Boolean.TRUE);

        assertThat(BooleanUtil.parseString("", Boolean.TRUE)).isTrue();
        assertThat(BooleanUtil.parseString("abc", Boolean.FALSE)).isFalse();
    }

    @Test
    public void testNegate() {
        assertThat(BooleanUtil.negate(Boolean.TRUE)).isEqualTo(Boolean.FALSE);
        assertThat(BooleanUtil.negate(Boolean.FALSE)).isEqualTo(Boolean.TRUE);
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
