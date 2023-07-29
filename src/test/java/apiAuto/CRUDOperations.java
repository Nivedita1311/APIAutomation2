package apiAuto;

import apiUrls.ApiUrls;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CRUDOperations {

    static Response response;

    public static Response getWeatherDetails(String Url)
    {
        response =

                RestAssured.given()
                        .when()
                        .get(Url);
        return response;
    }
}
