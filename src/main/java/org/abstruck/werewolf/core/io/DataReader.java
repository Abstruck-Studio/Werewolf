package org.abstruck.werewolf.core.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

/**
 * @author Goulixiaoji
 */
public class DataReader {
    public static String readJarFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(DataReader.class.getResourceAsStream(fileName))
        );

        StringBuilder buffer = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        return buffer.toString();
    }

    public static String readJarFile(URL url) throws IOException {
        InputStream inputStream = url.openStream();
        return new BufferedReader(new InputStreamReader(inputStream))
                .lines().collect(Collectors.joining(System.lineSeparator()));
    }
}
