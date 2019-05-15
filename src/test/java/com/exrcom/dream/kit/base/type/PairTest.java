package com.exrcom.dream.kit.base.type;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PairTest {

    @Test
    public void pairTest() {
        Pair<String, Integer> pair = Pair.of("exrcom", 1);
        Pair<String, Integer> pair2 = Pair.of("jack", 2);

        assertThat(pair.equals(pair2)).isFalse();
        assertThat(pair.hashCode() == pair2.hashCode()).isFalse();
        assertThat(pair.toString()).isEqualTo("Pair [left=exrcom, right=1]");
        assertThat(pair.getLeft()).isEqualTo("exrcom");
        assertThat(pair.getRight()).isEqualTo(1);

    }
}
