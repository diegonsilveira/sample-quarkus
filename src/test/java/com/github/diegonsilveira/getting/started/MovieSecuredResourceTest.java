package com.github.diegonsilveira.getting.started;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import java.io.StringReader;
import java.net.HttpURLConnection;
import java.util.HashMap;

import javax.json.Json;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.DisabledOnNativeImage;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * Tests of the TokenSecuredResource REST endpoints
 */
@QuarkusTest
public class MovieSecuredResourceTest {

    /**
     * The test generated JWT token string
     */
    private String token;

    @BeforeEach
    public void generateToken() throws Exception {
        HashMap<String, Long> timeClaims = new HashMap<>();
        token = TokenUtils.generateTokenString("/JwtClaims.json", timeClaims);
    }

    @Test
    public void testAuthorized() {
        Response response = given().auth()
                .oauth2(token)
                .when()
                .get("/secured").andReturn();

        response.then()
                .statusCode(200);
    }
    
    @Test
    public void testUnauthorized() {
        Response response = given().auth()
                .oauth2("invalidToken")
                .when()
                .get("/secured").andReturn();

        response.then()
                .statusCode(401);
    }

}
