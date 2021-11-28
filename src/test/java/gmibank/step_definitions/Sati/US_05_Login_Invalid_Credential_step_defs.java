package gmibank.step_definitions.Sati;

import gmibank.pages.SatiLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_05_Login_Invalid_Credential_step_defs {

    SatiLoginPage loginPage = new SatiLoginPage();

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


    @And("Enter a valid username to the Username text box")
    public void enterAValidUsernameToTheUsernameTextBox() {
        loginPage.usernameButton.sendKeys("team3user");

    }

    @And("Enter a invalid password  to the New password  text box")
    public void enterAInvalidPasswordToTheNewPasswordTextBox() {
        loginPage.passwordButton.sendKeys("team3");
    }
    @Given("click on {string} button")
    public void click_on_button(String forget_password) {
        loginPage.forgetYourPassword.click();

    }
    @Given("Enter a valid email to the Email text box")
    public void enter_a_valid_email_to_the_email_text_box() {
        loginPage.emailTextBox.sendKeys("seriktuba084@gmail.com");

    }
    @Given("click {string} button")
    public void click_button(String reset_password) {
        loginPage.resetPassword.click();

    }
    @Then("verify the email that has to be send when enter a valid email")
    public void verify_the_email_that_has_to_be_send_when_enter_a_valid_email() {
        Assert.assertTrue(loginPage.greenPart.isDisplayed());

    }

    @And("select the {string} button")
    public void selectTheButton(String newAccount) {
        loginPage.createNewAccount.click();

    }

    @And("verify if the website navigate to Registration page")
    public void verifyIfTheWebsiteNavigateToRegistrationPage() {
        Assert.assertTrue(loginPage.registrationPageVisible.isDisplayed());
    }
}
