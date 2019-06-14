package com.exrcom.dream.kit.io;

import com.google.common.base.Charsets;
import org.apache.commons.lang3.Validate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
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

	/**
	 * 写入 String 到 file
	 */
	public static void write(final CharSequence data, final File file) throws IOException {
		Validate.notNull(data);
		Validate.notNull(file);
		try (BufferedWriter writer = Files.newBufferedWriter(file.toPath(),
				Charsets.UTF_8, StandardOpenOption.APPEND)) {
			writer.append(data);
		}
	}
}
