package com.exrcom.dream.kit.base;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ObjectUtilTest {

    @Test
    public void testHashCode() {
        int hash1 = ObjectUtil.hashCode("a", "b");
        int hash2 = ObjectUtil.hashCode("a", "a");
        System.out.printf("hash1: %d, hash2: %d", hash1, hash2);
        Assertions.assertThat(hash1 - hash2).isEqualTo(1);

    }
}
