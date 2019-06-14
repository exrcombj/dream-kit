package com.exrcom.dream.kit.io;

import com.google.common.base.Charsets;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileUtil {

    /**
     * 在 tmp 目录创建临时文件，命名为exrcom-${random.nextLong()}.tmp
     */
    public static Path createTempFile() throws IOException {
        return Files.createTempFile("exrcom-", ".tmp");
    }

    /**
     * 读取文件到 byte[]
     */
    public static byte[] toByteArray(final File file) throws IOException {
        return Files.readAllBytes(file.toPath());
    }

    /**
     * 读取文件到 String
     */
    public static String toString(final File file) throws IOException {
        return com.google.common.io.Files.asCharSource(file, Charsets.UTF_8).read();
    }

	/**
	 * 读取文件内容到 List<String>
	 */
	public static List<String> toLines(final File file) throws IOException {
		return Files.readAllLines(file.toPath(), Charsets.UTF_8);
	}
}
