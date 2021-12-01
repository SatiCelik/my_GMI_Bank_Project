package gmibank.step_definitions.Sati;

import gmibank.pages.SatiRegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_001_Step_defs {
    
    SatiRegistrationPage satiRegistrationPage = new SatiRegistrationPage();

    @And("user goes SSN text box and enters {string}")
    public void userGoesSSNTextBoxAndEnters(String ssnNumber) {
        satiRegistrationPage.ssnTextBox.sendKeys(ssnNumber);
        
    }

    @And("goes all boxes and enters {string},{string},{string},{string},{string},{string},{string},{string}")
    public void goesAllBoxesAndEnters(String firstname, String lastname, String address, String phoneNumber, String username, String email, String password, String confirmPassword) {
        satiRegistrationPage.firstnameTextBox.sendKeys(firstname);
        satiRegistrationPage.lastnameTextBox.sendKeys(lastname);
        satiRegistrationPage.addressTextBox.sendKeys(address);
        satiRegistrationPage.phoneTextBox.sendKeys(phoneNumber);
        satiRegistrationPage.userNameTextBox.sendKeys(username);
        satiRegistrationPage.emailTextBox.sendKeys(email);
        satiRegistrationPage.firstPasswordTextBox.sendKeys(password);
        satiRegistrationPage.secondPasswordTextBox.sendKeys(confirmPassword);
    }

    @Then("user verify firstname part is not blank")
    public void userVerifyFirstnamePartIsNotBlank() {
        Assert.assertFalse(satiRegistrationPage.firstnameTextBox.getAttribute("value").isEmpty());
        
    }

    @Then("user verify lastname part is not blank")
    public void userVerifyLastnamePartIsNotBlank() {
        Assert.assertFalse(satiRegistrationPage.lastnameTextBox.getAttribute("value").isEmpty());
        
    }

    @Then("user verify address part is not blank")
    public void userVerifyAddressPartIsNotBlank() {
        Assert.assertFalse(satiRegistrationPage.addressTextBox.getAttribute("value").isEmpty());
        
    }

    @Then("user verify phone number part is not blank")
    public void userVerifyPhoneNumberPartIsNotBlank() {
        Assert.assertFalse(satiRegistrationPage.phoneTextBox.getAttribute("value").isEmpty());
    }

    @Then("user verify username part is not blank")
    public void userVerifyUsernamePartIsNotBlank() {
        Assert.assertFalse(satiRegistrationPage.userNameTextBox.getAttribute("value").isEmpty());
        
    }

    @Then("user verify email part is not blank")
    public void userVerifyEmailPartIsNotBlank() {
        Assert.assertFalse(satiRegistrationPage.emailTextBox.getAttribute("value").isEmpty());
        
    }

    @Then("user verify new password part is not blank")
    public void userVerifyNewPasswordPartIsNotBlank() {
        Assert.assertFalse(satiRegistrationPage.firstPasswordTextBox.getAttribute("value").isEmpty());
        
    }

    @Then("user verify password confirm part is not blank")
    public void userVerifyPasswordConfirmPartIsNotBlank() {
        Assert.assertFalse(satiRegistrationPage.secondPasswordTextBox.getAttribute("value").isEmpty());
        
    }

    @Then("user select register button")
    public void userSelectRegisterButton() {
        satiRegistrationPage.registerSubmitButton.click();
        
    }


}
