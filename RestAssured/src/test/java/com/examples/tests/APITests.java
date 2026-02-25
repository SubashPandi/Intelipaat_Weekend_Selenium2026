package com.examples.tests;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class APITests {
    String baseURL ="http://dummy.restapiexample.com/api/v1/employees";
    @Test
    public void getUser(){
        given()
                .when().get(baseURL).prettyPrint();
                //.then().statusCode(200);
               // .body("id",equalTo(2));

    }
}
