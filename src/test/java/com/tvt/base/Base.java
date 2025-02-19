package com.tvt.base;
import java.io.InputStream;
import java.util.Properties;

public class Base {

    private static String baseUrl;

    public static String getBaseUrl() {
        if (baseUrl == null) {
            try {
                Properties properties = new Properties();
                InputStream inputStream = Base.class.getClassLoader().getResourceAsStream("config.properties");
                if (inputStream != null) {
                    properties.load(inputStream);
                    baseUrl = properties.getProperty("base.url");
                    inputStream.close();
                } else {
                    throw new RuntimeException("config.properties file not found in classpath");
                }
            } catch (java.io.IOException e) {
                throw new RuntimeException("Error loading config.properties file", e);
            }
        }
        return baseUrl;
    }
}




