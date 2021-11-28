package gmibank.step_definitions.Gokcen;

import com.github.javafaker.Faker;
import gmibank.pages.SatiLoginPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_05 {
    Faker faker=new Faker();
    SatiLoginPage loginPage=new SatiLoginPage();
    @Given("user enter invalid userName and see error message")
    public void user_enter_invalid_user_name_and_see_error_message() {
      loginPage.usernameButton.sendKeys(faker.name().firstName()+ Keys.ENTER);
      loginPage.passwordButton.sendKeys(ConfigReader.getProperty("user_password"));
        Assert.assertTrue(loginPage.failedSignInError.isDisplayed());
    }

    @Given("user enter invalid passWord and see error message")
    public void user_enter_invalid_pass_word_and_see_error_message() {
        loginPage.passwordButton.clear();
        loginPage.usernameButton.clear();
      loginPage.passwordButton.sendKeys(faker.random().toString()+Keys.ENTER);
      loginPage.usernameButton.sendKeys(ConfigReader.getProperty("user_username"));
      ReusableMethods.waitFor(2);
        Assert.assertTrue(loginPage.failedSignInError.isDisplayed());

    }
    @Given("user enter invalid passWord&username and see error message")
    public void user_enter_invalid_pass_word_username_and_see_error_message() {
        loginPage.passwordButton.clear();
        loginPage.usernameButton.clear();
        loginPage.usernameButton.sendKeys(faker.name().firstName());
        loginPage.passwordButton.sendKeys("123");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(loginPage.failedSignInError.isDisplayed());
    }
    @Then("verify if there is an option to reset their password on the page")
    public void verify_if_there_is_an_option_to_reset_their_password_on_the_page() {
        ReusableMethods.doubleClick(loginPage.forgetYourPassword);

        ReusableMethods.waitFor(2);
        Assert.assertTrue(loginPage.resetPasswordText.isDisplayed());
        Driver.getDriver().navigate().back();
    }
    @Then("verify if there is an option to registration on the page")
    public void verify_if_there_is_an_option_to_registration_on_the_page() {
        ReusableMethods.waitFor(2);
        ReusableMethods.doubleClick(loginPage.registernewcountButton);
        loginPage.registernewcountButton.click();

     ReusableMethods.waitFor(2);
    Assert.assertTrue(loginPage.registrationPageText.isDisplayed());
    }

}
