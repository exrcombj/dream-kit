package com.exrcom.dream.kit.io;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class FileUtilTest {

    @Test
    public void testCreateTempFile() throws IOException {
        Path tempFile = FileUtil.createTempFile();
        System.out.printf("file name: %s", tempFile.toFile().getName());
    }

    @Test
    public void testToByteArray() throws IOException {

    }

    @Test
    public void testWrite() throws IOException {
    	File file = FileUtil.createTempFile().toFile();
    	try {
    		String data = "hello exrcom";
    		FileUtil.write(data, file);
    		String result = FileUtil.toString(file);
			Assertions.assertThat(result).isEqualTo(data);
		} finally {
    		//TODO delete temp file
		}

	}
}
