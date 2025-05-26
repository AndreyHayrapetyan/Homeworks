package Deserialazation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class InactiveUserTest {

    private static final String TOKEN = "Bearer b4e645fd844b66a9936e885b67e599859d37355d6b42ff826b3aa36aa92092fe";

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://gorest.co.in/public/v2";
    }

    @Test
    public void updateFirstInactiveUserToActive() {
        UserDto[] users = given()
                .header("Authorization", TOKEN)
                .when().get("/users")
                .then().statusCode(200)
                .extract().as(UserDto[].class);

        Optional<UserDto> inactiveUserOpt = Arrays.stream(users)
                .filter(u -> "inactive".equalsIgnoreCase(u.getStatus()))
                .findFirst();
        assertTrue(inactiveUserOpt.isPresent());

        UserDto user = inactiveUserOpt.get();

        Map<String, String> updateMap = new HashMap<>();
        updateMap.put("status", "active");

        UserDto updated = given()
                .header("Authorization", TOKEN)
                .contentType(ContentType.JSON)
                .body(updateMap)
                .when().put("/users/" + user.getId())
                .then().statusCode(200)
                .extract().as(UserDto.class);

        assertEquals("active", updated.getStatus());

        UserDto fetched = given()
                .header("Authorization", TOKEN)
                .when().get("/users/" + user.getId())
                .then().statusCode(200)
                .extract().as(UserDto.class);

        assertEquals("active", fetched.getStatus());
    }
}

