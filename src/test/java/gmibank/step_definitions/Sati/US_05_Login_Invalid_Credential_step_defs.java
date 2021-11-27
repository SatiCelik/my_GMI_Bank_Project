package gmibank.step_definitions.Sati;

import gmibank.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_05_Login_Invalid_Credential_step_defs {

    LoginPage loginPage = new LoginPage();

    @Given("Enter a invalid username to the Username text box")
    public void enter_a_invalid_username_to_the_username_text_box() {
        loginPage.usernameButton.sendKeys("team");

    }
    @Given("Enter a valid password  to the New password  text box")
    public void enter_a_valid_password_to_the_new_password_text_box() {
        loginPage.passwordButton.sendKeys("Team3user.");

    }
    @Then("Verify user see error message")
    public void verify_user_see_error_message() {
        Assert.assertTrue(loginPage.errorMessageVisible.isDisplayed());

    }

}
