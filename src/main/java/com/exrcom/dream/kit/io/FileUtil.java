package com.exrcom.dream.kit.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {

    /**
     * 在 tmp 目录创建临时文件，命名为exrcom-${random.nextLong()}.tmp
     */
    public static Path createTempFile() throws IOException {
        return Files.createTempFile("exrcom-", ".tmp");
    }
}
