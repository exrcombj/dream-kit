package com.exrcom.dream.kit.base;

import com.google.common.collect.Lists;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ObjectUtilTest {

    @Test
    public void testHashCode() {
        int hash1 = ObjectUtil.hashCode("a", "b");
        int hash2 = ObjectUtil.hashCode("a", "a");
        System.out.printf("hash1: %d, hash2: %d", hash1, hash2);
        Assertions.assertThat(hash1 - hash2).isEqualTo(1);

    }

    @Test
    public void testToPrettyString() {
        assertThat(ObjectUtil.toPrettyString(null)).isEqualTo("null");
        assertThat(ObjectUtil.toPrettyString(1)).isEqualTo("1");
        assertThat(ObjectUtil.toPrettyString(new int[] {1, 2, 3})).isEqualTo("[1, 2, 3]");
        assertThat(ObjectUtil.toPrettyString(new long[] { 1, 2 })).isEqualTo("[1, 2]");
        assertThat(ObjectUtil.toPrettyString(new double[] { 1.1d, 2.2d })).isEqualTo("[1.1, 2.2]");
        assertThat(ObjectUtil.toPrettyString(new float[] { 1.1f, 2.2f })).isEqualTo("[1.1, 2.2]");
        assertThat(ObjectUtil.toPrettyString(new boolean[] { true, false })).isEqualTo("[true, false]");

        assertThat(ObjectUtil.toPrettyString(Lists.newArrayList("1", "2"))).isEqualTo("{1,2}");




    }
}
