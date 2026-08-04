package utils;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class ApiUtils {

    public static Response post(String url, String body) {
        return given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .body(body)
                .post(url);
    }

    public static Response get(String url) {
        return given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .get(url);
    }
}
