package org.example;

import java.io.*;
import java.util.Properties;


public class PropertiesExample {
    private static final String CONFIG_DIRECTORY = "src/main/resources/config.properties";

    public void setDataProperty(String key, String value) {
        try {
            OutputStream outputStream = new FileOutputStream(CONFIG_DIRECTORY);
            Properties properties = new Properties();
            properties.setProperty(key, value);
            properties.store(outputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDataProperty(String key) {
        try {
            InputStream inputStream = new FileInputStream(CONFIG_DIRECTORY);
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return key;
    }
}
