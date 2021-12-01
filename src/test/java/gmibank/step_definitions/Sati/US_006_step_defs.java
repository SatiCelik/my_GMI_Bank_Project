package gmibank.step_definitions.Sati;

import gmibank.pages.SatiLoginPage;
import gmibank.pages.SatiUS_006Page;

import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_006_step_defs {

    SatiLoginPage satiLoginPage = new SatiLoginPage();
    SatiUS_006Page satiUS_006Page = new SatiUS_006Page();

    @And("enters user_name")
    public void entersUser_name() {
        satiUS_006Page.userNameButton.sendKeys("team3user"+ Keys.ENTER);
    }


    @And("user enters password")
    public void userEntersPassword() {
        satiUS_006Page.passwordButton.sendKeys("Team3user.");

    }

    @Then("user select second sign in button")
    public void userSelectSecondSignInButton() {
        satiUS_006Page.secondSignInButton.click();

    }
    @Then("user open  account menu.")
    public void user_open_account_menu() {
        satiUS_006Page.accountMenuButton.click();

    }
    @Then("user click User Info")
    public void user_click_user_info() {
        satiUS_006Page.userInfoDropDown.click();

    }
    @Then("Verify  the name in the First Name textbox is {string}")
    public void verify_the_name_in_the_first_name_textbox_is(String expectedFirstName) {
        Assert.assertEquals(expectedFirstName, satiUS_006Page.firstNameTextBox.getAttribute("value"));

    }
    @Then("Verify  the  last name in the Last Name textbox is   {string}")
    public void verify_the_last_name_in_the_last_name_textbox_is(String expectedLastName) {
        Assert.assertEquals(expectedLastName, satiUS_006Page.lastNameTextBox.getAttribute("value"));

    }
    @Then("Verify  the  email in the Email textbox is  {string}")
    public void verify_the_email_in_the_email_textbox_is(String expectedEmailName) {
        Assert.assertEquals(expectedEmailName, satiUS_006Page.lastNameTextBox.getAttribute("value"));

    }
    @Then("Verify  the  selected language is {string}")
    public void verify_the_selected_language_is(String string) {
        Assert.assertTrue(satiUS_006Page.languageTextBox.getText().contains("English"));


    }

    @Then("user Sign out")
    public void userSignOut() {
        satiUS_006Page.accountMenuButton.click();
        satiUS_006Page.signOutButton.click();
    }

    @Then("Verify languages are available English and Turkish")
    public void verifyLanguagesAreAvailableEnglishAndTurkish() {
        ReusableMethods.waitFor(2);
        ReusableMethods.selectAnItemFromDropdown(satiUS_006Page.languageTextBox, "English");
        ReusableMethods.selectAnItemFromDropdown(satiUS_006Page.languageTextBox, "Turkce");

    }

    @And("Click in the firstname box and type a new firstname")
    public void clickInTheFirstnameBoxAndTypeANewFirstname() {
        satiUS_006Page.firstNameTextBox.click();
        satiUS_006Page.firstNameTextBox.clear();
        satiUS_006Page.firstNameTextBox.sendKeys("ahmet");

    }

    @And("user click save in button")
    public void userClickSaveInButton() {
        satiUS_006Page.saveButton.click();


    }

    @Then("Verify that firstname have been updated")
    public void verifyThatFirstnameHaveBeenUpdated() {
        Assert.assertTrue(satiUS_006Page.firstNameTextBox.getAttribute("value").contains("ahmet"));
    }

    @And("Click in the lastname box and type a new lastname")
    public void clickInTheLastnameBoxAndTypeANewLastname() {
        satiUS_006Page.lastNameTextBox.click();
        satiUS_006Page.lastNameTextBox.clear();
        satiUS_006Page.lastNameTextBox.sendKeys("GOK");

    }

    @Then("Verify that lastname have been updated")
    public void verifyThatLastnameHaveBeenUpdated() {
        Assert.assertTrue(satiUS_006Page.lastNameTextBox.getAttribute("value").contains("GOK"));
    }

    @And("Click in the email box and type a new email")
    public void clickInTheEmailBoxAndTypeANewEmail() {
        satiUS_006Page.emailTextBox.click();
        satiUS_006Page.emailTextBox.clear();
        satiUS_006Page.emailTextBox.sendKeys("ahmedim@gmail.com");

    }

    @Then("verify update by adding  {string} sign and {string} extension to your email")
    public void verifyUpdateByAddingSignAndExtensionToYourEmail(String arg0, String arg1) {
        Assert.assertTrue(satiUS_006Page.emailTextBox.getAttribute("value").contains("ahmedim@gmail.com"));
    }


}

