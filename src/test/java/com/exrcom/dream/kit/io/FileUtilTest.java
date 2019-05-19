package com.exrcom.dream.kit.io;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;

public class FileUtilTest {

    @Test
    public void testCreateTempFile() throws IOException {
        Path tempFile = FileUtil.createTempFile();
        System.out.printf("file name: %s", tempFile.toFile().getName());
    }
}
