import org.testng.annotations.Test;
import utils.BaseTest;

import static org.hamcrest.Matchers.equalTo;

public class OctocatTest extends BaseTest {

    @Test(description = "Response status is 200")
    public void statusCheck() {
        REQUEST.get()
                .then()
                .statusCode(200);
    }

    @Test(description = "Fields form response have proper values")
    public void checkFieldsValues() {
        REQUEST.get()
                .then()
                .body("name", equalTo("The Octocat"))
                .body("location", equalTo("San Francisco"));
    }
}
