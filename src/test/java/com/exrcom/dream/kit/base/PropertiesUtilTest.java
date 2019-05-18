package com.exrcom.dream.kit.base;

import org.junit.Test;

import java.util.Properties;

import static org.assertj.core.api.Assertions.assertThat;


public class PropertiesUtilTest {

    @Test
    public void testLoadFromString() {
        String proStr = "exrcom.min=1\nexrcom.max=100\ndefaultSize=10";
        Properties p = PropertiesUtil.loadFromString(proStr);
        assertThat(p.getProperty("exrcom.min")).isEqualTo("1");
        assertThat(p.getProperty("defaultSize")).isEqualTo("10");
    }
}
