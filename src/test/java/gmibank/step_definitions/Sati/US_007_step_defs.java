package gmibank.step_definitions.Sati;

import gmibank.pages.SatiUS_006Page;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class US_007_step_defs {

    SatiUS_006Page satiUS_006Page = new SatiUS_006Page();


    @And("user enters Username on the username text box")
    public void userEntersUsernameOnTheUsernameTextBox() {
        satiUS_006Page.userNameButton.sendKeys("team3user");
    }

    @And("user enters new password")
    public void userEntersNewPassword() {
        satiUS_006Page.passwordButton.sendKeys("Team3user.");
    }

    @Given("user click account menu")
    public void userClickAccountMenu() {
        satiUS_006Page.accountMenuButton.click();


    }

    @And("select in the email box and type a new email")
    public void selectInTheEmailBoxAndTypeANewEmail() {
        satiUS_006Page.emailTextBox.click();
        satiUS_006Page.emailTextBox.clear();
        satiUS_006Page.emailTextBox.sendKeys("flowergmailcom");
    }



    @Then("verify that user account can not update with invalid email address")
    public void verifyThatUserAccountCanNotUpdateWithInvalidEmailAddress() {
        Assert.assertTrue(satiUS_006Page.emailErrorMessage.isDisplayed());
    }


    @And("user give an option language dropdown")
    public void userGiveAnOptionLanguageDropdown() {
        ReusableMethods.selectAnItemFromDropdown(satiUS_006Page.languageTextBox, "English");

    }

    @Then("verify that there is no option other than English and Turkish")
    public void verifyThatThereIsNoOptionOtherThanEnglishAndTurkish() {
        List<String> actualList = new ArrayList<>();
        actualList.add(0, satiUS_006Page.englishOption.getText());
        actualList.add(1, satiUS_006Page.turkishOption.getText());
        System.out.println(actualList);
        List<String> expectedList = new ArrayList<>();
        expectedList.add(0, "English");
        expectedList.add(1, "Türkçe");
        System.out.println(expectedList);
        Assert.assertEquals(expectedList, actualList);
    }
}