package gmibank.step_definitions.Gokcen;

import gmibank.pages.SatiRegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_02_Gokcen {

    SatiRegistrationPage registrationPage=new SatiRegistrationPage();

    @Given("user selects SSN box and be left blank")
    public void user_selects_ssn_box_and_be_left_blank() {
       registrationPage.ssnTextBox.sendKeys(Keys.ENTER);
    }


    @Then("verify  {string} error message")
    public void verify_error_message(String string) {
        Assert.assertTrue(registrationPage.ssnErrorMessage.isDisplayed());

    }


    @And("user enter an invalid ssn number")
    public void userEnterAnInvalidSsnNumber() {
        registrationPage.ssnTextBox.sendKeys("abc.");
    }

    @And("user enters an invalid phonenumber")
    public void userEntersAnInvalidPhonenumber() {
        registrationPage.phoneTextBox.sendKeys("1101");
    }



    @And("user enters an invalid email")
    public void userEntersAnInvalidEmail() {
        registrationPage.emailTextBox.sendKeys("aaaa");

    }


    @Then("user verify   {string}  error message")
    public void userVerifyErrorMessage(String arg0) {
        Assert.assertTrue(registrationPage.phoneNumberErrorMessage.isDisplayed());

    }

    @Then("user should see  {string} error message.")
    public void userShouldSeeErrorMessage(String arg0) {
        Assert.assertTrue(registrationPage.emailErrorMessage.isDisplayed());
    }
}
