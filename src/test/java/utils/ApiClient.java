package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.util.Map;

public class ApiClient {

    static {
        RestAssured.baseURI = ConfigReader1.get("base.url");
    }

    public static Response post(String endpoint, Map<String, String> headers) {
        return RestAssured
                .given()
                .headers(headers)
                .post(endpoint);
    }
}
