package Deserialazation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;
@Tag("API")
public class CreatePostTest {

    private static final String TOKEN = "Bearer b4e645fd844b66a9936e885b67e599859d37355d6b42ff826b3aa36aa92092fe";

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://gorest.co.in/public/v2";
    }

    @Test
    public void createAndVerifyPostForRandomUser() {
        PostDto[] posts = given()
                .header("Authorization", TOKEN)
                .when().get("/posts")
                .then().statusCode(200)
                .extract().as(PostDto[].class);

        assertTrue(posts.length > 0);
        PostDto randomPost = posts[new Random().nextInt(posts.length)];
        Integer userId = randomPost.getUserId();

        PostDto newPost = new PostDto(null, userId, "Test Title " + UUID.randomUUID(), "Body content");
        PostDto createdPost = given()
                .header("Authorization", TOKEN)
                .contentType(ContentType.JSON)
                .body(newPost)
                .when().post("/posts")
                .then().statusCode(201)
                .extract().as(PostDto.class);

        PostDto[] userPosts = given()
                .header("Authorization", TOKEN)
                .when().get("/users/" + userId + "/posts")
                .then().statusCode(200)
                .extract().as(PostDto[].class);

        boolean found = Arrays.stream(userPosts)
                .anyMatch(p -> p.getId().equals(createdPost.getId()));
        assertTrue(found);
    }
}

