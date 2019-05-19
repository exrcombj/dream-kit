package com.exrcom.dream.kit.io;

import com.google.common.io.Resources;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class URLResourceUtil {

    private static final String CLASSPATH_PREFIX = "classpath:";
    private static final String URL_PROTOCOL_FILE = "file";

    /**
     * 兼容无前缀, classpath:, file:// 的情况获取文件
     *
     * 如果以classpath: 定义的文件不存在会抛出IllegalArgumentException异常，以file://定义的则不会
     */
    public static File asFile(String generalPath) throws IOException {
        if (StringUtils.startsWith(generalPath, CLASSPATH_PREFIX)) {
            String resourceName = StringUtils.substringAfter(generalPath, CLASSPATH_PREFIX);
            return getFileByURL(Resources.getResource(resourceName));
        }
        try {
            // try URL
            return getFileByURL(new URL(generalPath));
        } catch (MalformedURLException ex) {
            // no URL -> treat as file path
            return new File(generalPath);
        }
    }

    private static File getFileByURL(URL fileUrl) throws FileNotFoundException {
        Validate.notNull(fileUrl, "Resource URL must not be null");
        if (!URL_PROTOCOL_FILE.equals(fileUrl.getProtocol())) {
            throw new FileNotFoundException("URL cannot be resolved to absolute file path "
                    + "because it does not reside in the file system: " + fileUrl);
        }
        try {
            return new File(toURI(fileUrl.toString()).getSchemeSpecificPart());
        } catch (URISyntaxException ex) { // NOSONAR
            // Fallback for URLs that are not valid URIs (should hardly ever happen).
            return new File(fileUrl.getFile());
        }
    }

    public static URI toURI(String location) throws URISyntaxException {
        return new URI(StringUtils.replace(location, " ", "%20"));
    }

}
