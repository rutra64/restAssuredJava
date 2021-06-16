import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SampleTest {

    @Test
    public void statusCheck() {
        given().when()
                .get("https://api.github.com/users/octocat")
                .then().statusCode(200);
    }
}
