package gmibank.step_definitions.Gokcen;

import gmibank.pages.GokcenCustomerPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_08 {

    GokcenCustomerPage customerPage = new GokcenCustomerPage();

    @Given("user click sign in button")
    public void userClickSignInButton() {
        customerPage.signInButton.click();
    }

    @And("user click menu dropdown")
    public void userClickMenuDropdown() {
        customerPage.menuDropDown.click();
    }

    @And("Enter the username with valid credentials")
    public void enterTheUsernameWithValidCredentials() {
        customerPage.usernameText.sendKeys(ConfigReader.getProperty("customer_username"));
    }

    @And("Enter the password with valid credentials")
    public void enterThePasswordWithValidCredentials() {
        customerPage.passwordText.sendKeys(ConfigReader.getProperty("customer_password"));
    }

    @And("user click password button")
    public void userClickPasswordButton() {
        customerPage.passwordButton.click();
    }

    @Given("user enters old password")
    public void userEntersOldPassword() {
        customerPage.currentPasswordText.sendKeys(ConfigReader.getProperty("customer_password") + Keys.TAB);
        customerPage.newPasswordText.sendKeys(ConfigReader.getProperty("customer_password") + Keys.ENTER);
        //customerPage.newPasswordText.sendKeys();
    }

    @And("user click again sign in button")
    public void userClickAgainSignInButton() {
        customerPage.secondSignInButton.click();
    }

    @Then("user verify the error message")
    public void userVerifyTheErrorMessage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(customerPage.invalidPasswordMessage.getText().contains("New password should be different from the current one."));
    }

    @Given("enter at least {string} to password")
    public void enterAtLeastToPassword(String arg0) {
        customerPage.newPasswordText.sendKeys(arg0);
    }

    @Then("verify the level chart red {string}")
    public void verify_the_level_chart_red(String string) {
        Assert.assertTrue(customerPage.red.isDisplayed());
    }

    @Given("enter {string} to password")
    public void enter_to_password(String string) {
        customerPage.newPasswordText.clear();
        customerPage.newPasswordText.sendKeys(string);
    }

    @Then("verify the level chart orange {string}")
    public void verify_the_level_chart_orange(String string) {
        Assert.assertTrue(customerPage.orange.isDisplayed());
    }

    @Then("user enter {string} to password")
    public void user_enter_to_password(String string) {
        customerPage.newPasswordText.clear();

        customerPage.newPasswordText.sendKeys(string);
    }

    @Then("verify the level chart yellow {string}")
    public void verify_the_level_chart_yellow(String string) {

        Assert.assertTrue(customerPage.yellow.isDisplayed());
    }

    @Given("enters {string} to password")
    public void enters_to_password(String string) {
        customerPage.newPasswordText.clear();

        customerPage.newPasswordText.sendKeys(string);
    }

    @Then("verify the level chart lightgreen {string}")
    public void verify_the_level_chart_lightgreen(String string) {
        Assert.assertTrue(customerPage.lightgreen.isDisplayed());
    }

    @Given("enter at least 7char {string} to stronger password")
    public void enter_at_least_7char_to_stronger_password(String string) {
        customerPage.newPasswordText.clear();

        customerPage.newPasswordText.sendKeys(string);
    }

    @Then("verify the level chart green {string}")
    public void verify_the_level_chart_green(String string) {
        Assert.assertTrue(customerPage.green.isDisplayed());
    }

    @Then("confirm the new password")
    public void confirm_the_new_password() {
        customerPage.confirmPasswordText.sendKeys("aA1.zzz");

            }



}


