package apiAuto;

import io.restassured.RestAssured;
import io.restassured.response.Response;

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
