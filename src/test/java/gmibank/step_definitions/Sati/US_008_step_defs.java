package gmibank.step_definitions.Sati;

import gmibank.pages.SatiUS_006Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class US_008_step_defs {
    
    SatiUS_006Page satiUS_006Page = new SatiUS_006Page();


    @And("user select password drop down menu")
    public void userSelectPasswordDropDownMenu() {
        satiUS_006Page.ahmetDropDown.click();
        satiUS_006Page.passwordDropDown.click();
    }


    @And("user click current password button and enter current password")
    public void userClickCurrentPasswordButtonAndEnterCurrentPassword() {
        satiUS_006Page.currentPassword.click();
        satiUS_006Page.currentPassword.sendKeys("Team3user."+ Keys.ENTER);
        
    }
    @Then("user sends password to {string} color")
    public void userSendsPasswordToColor(String arg0) {
        satiUS_006Page.newPassword.click();
        satiUS_006Page.newPassword.sendKeys("red"+Keys.ENTER);
        Assert.assertTrue(satiUS_006Page.redColor.isDisplayed());
    }
    @Then("user sends password for {string} color")
    public void userSendsPasswordForColor(String orange) {
        satiUS_006Page.newPassword.click();
        satiUS_006Page.newPassword.sendKeys("orange"+Keys.ENTER);
        Assert.assertTrue(satiUS_006Page.orangeColor.isDisplayed());
    }
    @Then("user sends password for {string}")
    public void userSendsPasswordFor(String yellow) {
        satiUS_006Page.newPassword.click();
        satiUS_006Page.newPassword.sendKeys("yellow"+Keys.ENTER);
        Assert.assertTrue(satiUS_006Page.yellowColor.isDisplayed());
    }

    @Then("user sends password to {string}")
    public void userSendsPasswordTo(String green) {
        satiUS_006Page.newPassword.click();
        satiUS_006Page.newPassword.sendKeys("green"+Keys.ENTER);
        Assert.assertTrue(satiUS_006Page.greenColor.isDisplayed());
    }


    @Then("user enters password again new password confirmation")
    public void userEntersPasswordAgainNewPasswordConfirmation() {
        satiUS_006Page.newPasswordConfirmation.sendKeys("abcDE1."+Keys.ENTER);

    }

    @Then("user select save button")
    public void userSelectSaveButton() {
        satiUS_006Page.confirmPasswordSaveButton.click();

    }

    @Then("user close applicant")
    public void userCloseApplicant() {
        Driver.closeDriver();
    }


}
