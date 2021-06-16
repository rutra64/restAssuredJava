package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    public RequestSpecification REQUEST;

    public BaseTest() {
        try {
            Properties properties = new Properties();
            properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
            RestAssured.baseURI = properties.getProperty("api.url");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        REQUEST = RestAssured.given().contentType(ContentType.JSON);
    }
}
