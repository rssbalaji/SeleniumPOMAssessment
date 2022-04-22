package com.test.restassured;

import static io.restassured.RestAssured.*;

import Pojo.PostApiPojo;
import StepDefinition.RestAssuredTestCases;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class FirstRestAssured {

    private static String baseURI = "https://petstore.swagger.io/v2";
    //@Test
    public void firsRestMethod() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        Response response = RestAssured.given().when().get("/todos/1");
        System.out.println("status code = " + response.getStatusCode());
        System.out.println("Response body = " + response.getBody().asPrettyString());
        Assert.assertEquals(response.getStatusCode(), 200);

    }

    //@Test
    public void secondRestMethod() {

        baseURI = "https://reqres.in/api/users";
        Response response = given().queryParam("page", "2").when()
                .get("/");
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.getContentType());
        Assert.assertEquals(response.getContentType(), "application/json; charset=utf-8");
    }

    @Test
    public Response thirdRestMethodPost(Map bodyValues,String remainingURL){

        String completeURL = baseURI+remainingURL;
        RestAssured.baseURI = completeURL;

        System.out.println("URL given "+completeURL);

        JSONObject jsonObject = new JSONObject(bodyValues);
        PostApiPojo pojo = new PostApiPojo(bodyValues);

        System.out.println("Request Body "+pojo);
        System.out.println("pojo printing toString : "+pojo);

        Response response = given().contentType(ContentType.JSON).body(pojo).when().post("/");


        System.out.println("Response of my POST API = "+response.getBody().asPrettyString());
        return response;

    }


}
