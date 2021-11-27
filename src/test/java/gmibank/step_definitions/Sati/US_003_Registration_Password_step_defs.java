package gmibank.step_definitions.Sati;

import gmibank.pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_003_Registration_Password_step_defs {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user enter lowercase char for stronger password")
    public void user_enter_lowercase_char_for_stronger_password() {
        registrationPage.firstPasswordTextBox.sendKeys("a");

    }
    @Then("user verify first color part is appeared")
    public void user_verify_first_color_part_is_appeared() {
        Assert.assertTrue(registrationPage.firstColorPartOfPassword.isDisplayed());

    }


    @Given("user enter upper case char for stronger password")
    public void userEnterUpperCaseCharForStrongerPassword() {
        registrationPage.firstPasswordTextBox.sendKeys("aLi");

    }

    @Then("user verify second color part is visible")
    public void userVerifySecondColorPartIsVisible() {
        Assert.assertTrue(registrationPage.secondColorPartOfPassword.isDisplayed());

    }

    @Given("user enters digit and see the level  chart change accordingly")
    public void userEntersDigitAndSeeTheLevelChartChangeAccordingly() {
        registrationPage.firstPasswordTextBox.sendKeys("aLi12");

    }

    @Then("user verify third color part is visible")
    public void userVerifyThirdColorPartIsVisible() {
        Assert.assertTrue(registrationPage.thirdColorPartOfPassword.isDisplayed());

    }

    @Given("user enters special char and see the level  chart change accordingly")
    public void userEntersSpecialCharAndSeeTheLevelChartChangeAccordingly() {
        registrationPage.firstPasswordTextBox.sendKeys("aLi12!");

    }

    @Then("user verify fourth color part is visible")
    public void userVerifyFourthColorPartIsVisible() {
        Assert.assertTrue(registrationPage.fourthColorPartOfPassword.isDisplayed());
    }

    @Given("user enters password there should be at least {int} chars for a stronger password")
    public void userEntersPasswordThereShouldBeAtLeastCharsForAStrongerPassword(int arg0) {
        registrationPage.firstPasswordTextBox.sendKeys("aLi123!");

    }

    @Then("user verify fifth color part is visible")
    public void userVerifyFifthColorPartIsVisible() {
        Assert.assertTrue(registrationPage.fifthColorPartOfPassword.isDisplayed());
    }
}
