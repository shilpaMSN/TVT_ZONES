package com.tvt.testcases;

import org.testng.annotations.Test;

import com.apple.eawt.Application;
import com.tvt.builder.CreateUserBuilder;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class testcases {



    @Test
    public void createUser() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        RequestSpecification request = RestAssured.given();

        request.body(CreateUserBuilder.createUserBuilder())
        .contentType(ContentType.JSON)
        .when()
        .post("user")
        .then().log().all()
        .statusCode(200);
    }
}
