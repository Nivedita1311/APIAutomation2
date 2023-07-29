package stepdefinitions;

import apiAuto.CRUDOperations;
import apiUrls.ApiUrls;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;


import static Enums.ErrorMessages.WITHOUTTIMEZONE_ERRORMESSAGE;

public class GetStepdefs {

    CRUDOperations crudOperations;
    Response response;

    @Given("I am on Weather App and selected {string}")
    public void iAmOnWeatherAppAndSelected(String city) {
        switch (city) {
            case "Auckland" -> {
                response = CRUDOperations.getWeatherDetails(ApiUrls.get_GenericHourly_Auckland_Url);
                response.then().log().all();
                response.prettyPrint();
            }
            case "Wellington" -> {
                response = CRUDOperations.getWeatherDetails(ApiUrls.get_GenericHourly_Wellington_Url);
                response.then().log().all();
                response.prettyPrint();
            }
            default -> throw new RuntimeException();
        }
    }

    @Then("the weather details are displayed and status code is {int};")
    public void theWeatherDetailsAreDisplayedAndStatusCodeIs(int code) {
        Assert.assertEquals(response.getStatusCode(), code);
    }

    @And("Time Zone mandatory error message is displayed")
    public void TimeZoneMandatoryErrorMessageIsDisplayed() {
        Assert.assertEquals(response.then().extract().path("reason"), WITHOUTTIMEZONE_ERRORMESSAGE.getValue());


    }

    @Given("I am on Weather App and selected {string} with daily parameter and no Time zone.")
    public void iAmOnWeatherAppAndSelectedWithDailyParameterAndNoTimeZone(String city) {

        switch (city) {
            case "Auckland" -> {
                response = CRUDOperations.getWeatherDetails(ApiUrls.get_GenericDaily_Auckland_Url);
                response.then().log().all();
                response.prettyPrint();
            }
            case "Wellington" -> {
                response = CRUDOperations.getWeatherDetails(ApiUrls.get_GenericDaily_Wellington_Url);
                response.then().log().all();
                response.prettyPrint();
            }
            default -> throw new RuntimeException();
        }
    }
}
