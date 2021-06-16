import org.testng.annotations.Test;
import utils.BaseTest;

import static constants.OctocatValues.LOCATION;
import static constants.OctocatValues.NAME;
import static org.hamcrest.Matchers.equalTo;

public class OctocatTest extends BaseTest {

    @Test(description = "Response status is 200, 'name' and 'location' fields have correct values")
    public void responseVerification() {
        REQUEST.get()
                .then()
                .statusCode(200)
                .and()
                .body("name", equalTo(NAME.getValue()))
                .body("location", equalTo(LOCATION.getValue()));
    }
}
