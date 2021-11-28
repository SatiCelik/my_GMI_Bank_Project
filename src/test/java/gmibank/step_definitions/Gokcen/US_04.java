package gmibank.step_definitions.Gokcen;

import gmibank.pages.SatiLoginPage;
import gmibank.pages.SatiRegistrationPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_04 {
    SatiRegistrationPage registrationPage=new SatiRegistrationPage();
    SatiLoginPage loginPage=new SatiLoginPage();

    @Given("user enters valid username")
    public void userEntersValidUsername() {
        loginPage.usernameButton.sendKeys(ConfigReader.getProperty("user_username"));
    }


    @Then("user enters valid password and click sign in button")
    public void userEntersValidPasswordAndClickSignInButton() {
        loginPage.passwordButton.sendKeys(ConfigReader.getProperty("user_password"));
        loginPage.signInButton.click();

    }

    @Then("verify user sign in to login page")
    public void verifyUserSignInToLoginPage() {
        ReusableMethods.waitFor(2);
       Assert.assertTrue(loginPage.loginPageSignInVerify.getText().contains("team3"));
    }
}
