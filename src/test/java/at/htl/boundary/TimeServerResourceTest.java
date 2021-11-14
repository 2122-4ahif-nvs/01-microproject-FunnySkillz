package at.htl.boundary;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.startsWith;

@QuarkusTest
class TimeServerResourceTest {
    @Test
    public void fetchTime() {
        when()
                .get("time")
                .then()
                .statusCode(200)
                .body(startsWith("Time:"));
    }
}