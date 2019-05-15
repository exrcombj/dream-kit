package com.exrcom.dream.kit.base.type;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TripleTest {

    @Test
    public void tripleTest() {
        Triple<String, String, Integer> triple = Triple.of("exrcom", "com", 1);
        Triple<String, String, Integer> triple2 = Triple.of("jack", "jones", 2);
        Pair<String, Integer> pair = Pair.of("exrcom", 1);

        Assertions.assertThat(triple.equals(triple2)).isFalse();
        Assertions.assertThat(triple.hashCode() == triple2.hashCode()).isFalse();
        Assertions.assertThat(triple.toString()).isEqualTo("Triple [left=exrcom, middle=com, right=1]");
        Assertions.assertThat(triple.equals(pair)).isFalse();
        Assertions.assertThat(triple.getLeft()).isEqualTo("exrcom");
        Assertions.assertThat(triple.getMiddle()).isEqualTo("com");
        Assertions.assertThat(triple.getRight()).isEqualTo(1);
    }
}
