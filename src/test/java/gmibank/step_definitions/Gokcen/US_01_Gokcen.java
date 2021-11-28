package gmibank.step_definitions.Gokcen;


import gmibank.pages.RegistrationPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import gmibank.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;


public class US_01_Gokcen {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user navigate to webpage")
    public void user_navigate_to_webpage() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @Given("user navigates to menu dropdown and click")
    public void user_navigates_to_menu_dropdown_and_click() {
        registrationPage.MenuDropDownButton.click();
    }

    @Given("user select  Register button")
    public void user_select_register_button() {
        registrationPage.RegisterButton.click();
    }

    @Given("user goes to SSN box and enters  {string}")
    public void user_goes_to_ssn_box_and_enters(String string) {

        registrationPage.ssnTextBox.sendKeys(string);
    }


    @Then("verify the first name box is not blank")
    public void verify_the_first_name_box_is_not_blank() {
//        ReusableMethods.waitForVisibility(registrationPage.firstnameTextBox,2);
        Assert.assertFalse(registrationPage.firstnameTextBox.getAttribute("value").isEmpty());
    }

    @Then("verify the last name box is not blank")
    public void verify_the_last_name_box_is_not_blank() {
        Assert.assertFalse(registrationPage.lastnameTextBox.getAttribute("value").isEmpty());
    }

    @Then("verify the adress text box is not blank")
    public void verify_the_adress_text_box_is_not_blank() {
        Assert.assertFalse(registrationPage.addressTextBox.getAttribute("value").isEmpty());
    }

    @Then("user verify the phone number text box is not blank")
    public void user_verify_the_phone_number_text_box_is_not_blank() {
        Assert.assertFalse(registrationPage.phoneTextBox.getAttribute("value").isEmpty());
    }

    @Then("user verify the username text box is not blank")
    public void user_verify_the_username_text_box_is_not_blank() {
        Assert.assertFalse(registrationPage.userNameTextBox.getAttribute("value").isEmpty());
    }

    @Then("user verify the email Text box is not blank")
    public void user_verify_the_email_text_box_is_not_blank() {
        Assert.assertFalse(registrationPage.emailTextBox.getAttribute("value").isEmpty());
    }


    @Then("user click register button")
    public void userClickRegisterButton() {
        registrationPage.registerSubmitButton.click();

    }

    @Then("verify the succes message")
    public void verifyTheSuccesMessage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registrationPage.savedMessage.getText().contains("saved"));
        System.out.println(registrationPage.savedMessage.getText());
    }

    @And("user enters {string},{string},{string},{string},{string},{string},{string},{string}")
    public void userEnters(String string, String string2, String string3, String string4, String string5, String string6,String string7,String string8) {
        registrationPage.firstnameTextBox.sendKeys(string);
        registrationPage.lastnameTextBox.sendKeys(string2);
        registrationPage.addressTextBox.sendKeys(string3);
        registrationPage.phoneTextBox.sendKeys(string4);
        registrationPage.userNameTextBox.sendKeys(string5);
        registrationPage.emailTextBox.sendKeys(string6);
        registrationPage.firstPasswordTextBox.sendKeys(string7);
        registrationPage.secondPasswordTextBox.sendKeys(string8);
    }
}
