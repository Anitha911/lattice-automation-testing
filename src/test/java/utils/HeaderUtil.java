package utils;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;

public class HeaderUtil {

    public static Map<String, String> loadHeaders(String fileName) {
        try {
            String path = "src/test/resources/headers/" + fileName;
            String content = new String(Files.readAllBytes(Paths.get(path)));
            JSONObject json = new JSONObject(content);

            Map<String, String> headers = new HashMap<>();
            for (String key : json.keySet()) {
                headers.put(key, json.get(key).toString());
            }
            return headers;
        } catch (Exception e) {
            throw new RuntimeException("Header load failed");
        }
    }
}
