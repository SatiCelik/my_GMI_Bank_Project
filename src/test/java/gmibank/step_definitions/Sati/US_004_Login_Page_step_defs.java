package gmibank.step_definitions.Sati;

import gmibank.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_004_Login_Page_step_defs {

    LoginPage loginPage = new LoginPage();

    @And("user select dropdown menu")
    public void userSelectDropdownMenu() {
        loginPage.dropDownMenuButton.click();
    }

    @And("click on sign in dropdown button")
    public void clickOnSignInDropdownButton() {
        loginPage.signInDropDown.click();
    }


    @Given("Enter a valid username to the Username textbox")
    public void enter_a_valid_username_to_the_username_textbox() {
        loginPage.usernameButton.sendKeys("team3user");

    }
    @Given("Enter a valid password  to the New password  textbox")
    public void enter_a_valid_password_to_the_new_password_textbox() {
        loginPage.passwordButton.sendKeys("Team3user.");

    }
    @And("user select sign in button")
    public void userSelectSignInButton() {
        loginPage.signInButton.click();
    }

    @Then("Verify user goes to user login page")
    public void verify_user_goes_to_user_login_page() {
        Assert.assertTrue(loginPage.accountMenu.isDisplayed());

    }


    @And("user click on  Cancel  button")
    public void userClickOnCancelButton() {
        loginPage.cancelButton.click();

    }

    @Then("verify user goes to main page")
    public void verifyUserGoesToMainPage() {
        Assert.assertTrue(loginPage.mainPageVisible.isDisplayed());
    }
}
