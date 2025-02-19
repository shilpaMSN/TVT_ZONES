package com.tvt.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.jayway.jsonpath.JsonPath;

public class EndpointReader {

   private  static final String JSON_FILE_PATH = "src/test/java/resources/configfiles/Endpoints.json";   // Default JSON file


// Default JSON file
    public static String getValueFromJson(String jsonPath) {
        try {
            // Read the JSON file as a String
            String jsonContent = new String(Files.readAllBytes(Paths.get(JSON_FILE_PATH)));
            // Use JsonPath to extract the value
            Object value = JsonPath.read(jsonContent, jsonPath);
            return value.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error reading file";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error parsing JSON or invalid JSONPath";
        }
    }
}
