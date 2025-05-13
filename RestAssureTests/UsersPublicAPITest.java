package RestAssureTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UsersPublicAPITest {

    private final String token = "Bearer b4e645fd844b66a9936e885b67e599859d37355d6b42ff826b3aa36aa92092fe";

    @BeforeEach
    public void setup() {
        RestAssured.baseURI = "https://gorest.co.in/public-api";
    }

    @Test
    public void testGetUsersWithoutQueryParams() {
        Response response = when().get("/users").then().statusCode(200).extract().response();

        int code = response.jsonPath().getInt("code");
        assertThat(code, is(200));

        List<Object> users = response.jsonPath().getList("data");
        assertThat(users, hasSize(10));
    }

    @Test
    public void testGetUsersWithQueryParam() {
        Response response = given()
                .queryParam("per_page", 10)
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .extract().response();

        int code = response.jsonPath().getInt("code");
        assertThat(code, is(200));

        List<Object> users = response.jsonPath().getList("data");
        assertThat(users, hasSize(10));
    }

    @Test
    public void testGenderValidation() {
        Response response = when().get("/users").then().statusCode(200).extract().response();

        int code = response.jsonPath().getInt("code");
        assertThat(code, is(200));

        List<String> genders = response.jsonPath().getList("data.gender");
        for (String gender : genders) {
            assertThat("Gender must be male or female", gender, anyOf(equalTo("male"), equalTo("female")));
        }
    }

    @Test
    public void testDeleteAndGetUserById() {
        String email = "test" + new Random().nextInt(10000) + "@mail.com";

        Response createResponse = given()
                .header("Authorization", token)
                .contentType("application/json")
                .body("{ \"name\": \"Test User\", \"gender\": \"male\", \"email\": \"" + email + "\", \"status\": \"active\" }")
                .post("/users")
                .then()
                .statusCode(200)
                .extract().response();

        int code = createResponse.jsonPath().getInt("code");
        assertThat(code, is(201));

        int userId = createResponse.jsonPath().getInt("data.id");

        given()
                .header("Authorization", token)
                .when()
                .delete("/users/" + userId)
                .then()
                .statusCode(200)
                .body("code", equalTo(204));

        given()
                .header("Authorization", token)
                .when()
                .get("/users/" + userId)
                .then()
                .statusCode(200)
                .body("code", equalTo(404));
    }
}
