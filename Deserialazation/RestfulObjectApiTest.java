package Deserialazation;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;
@Tag("API")
public class RestfulObjectApiTest {

    @Test
    public void getAndDeserializeRestfulObjects() {
        RestfulObjectDto[] objects = given()
                .baseUri("https://api.restful-api.dev")
                .when().get("/objects")
                .then().statusCode(200)
                .extract().as(RestfulObjectDto[].class);

        assertNotNull(objects);
        assertTrue(objects.length > 0);
        System.out.println("Fetched " + objects.length + " restful objects.");
    }
}
