package gmibank.step_definitions.Sati;

import gmibank.pojos.US_23_RegistrantPojo;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;


import static io.restassured.RestAssured.given;


public class US_023_RegistrantAPI_step_defs {

        Response response;
        US_23_RegistrantPojo actualData = new US_23_RegistrantPojo();
    String bearerToken = ConfigReader.getProperty("api_bearer_token_registrant");


    @Given("user read the registrant from {string} and extension {string}")
    public void user_read_the_registrant_from_and_extension(String endpoint, String id) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearer_token"))
                .when()
                .get(endpoint+id);
        response.prettyPrint();

        actualData = response.as(US_23_RegistrantPojo.class);
        System.out.println(actualData);

    }
    @Then("user validates the {string}")
    public void user_validates_the(String ssn) {
        Assert.assertTrue(response.getStatusCode()==200);
        Assert.assertTrue(actualData.getSsn().equals(ssn));

    }





}
