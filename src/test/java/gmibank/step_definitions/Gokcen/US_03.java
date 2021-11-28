package gmibank.step_definitions.Gokcen;

import gmibank.pages.SatiRegistrationPage;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_03 {
SatiRegistrationPage registrationPage=new SatiRegistrationPage();

    @Then("user sends {string} to password red")
    public void user_sends_to_password_red(String string) {
       registrationPage.firstPasswordTextBox.sendKeys(string+ Keys.ENTER);
        Assert.assertTrue(registrationPage.red.isDisplayed());
    }
    @Then("user sends {string} to password orange")
    public void user_sends_to_password_orange(String string) {
        ReusableMethods.waitFor(2);
      registrationPage.firstPasswordTextBox.sendKeys(string+Keys.ENTER);
      Assert.assertTrue(registrationPage.orange.isDisplayed());
    }
    @Then("user sends {string} to password green")
    public void user_sends_to_password_green(String string) {
        registrationPage.firstPasswordTextBox.sendKeys(string+Keys.ENTER);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registrationPage.green.isDisplayed());
    }

}
