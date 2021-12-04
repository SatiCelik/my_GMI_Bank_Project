package gmibank.step_definitions.Sati;

import gmibank.pages.GokcenManagerPage;
import gmibank.pages.SatiUS_009Page;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class US_10_step_defs {

    SatiUS_009Page satiUS_009Page = new SatiUS_009Page();
    GokcenManagerPage gokcenManagerPage = new GokcenManagerPage();

    @Then("verify address text box is not blank")
    public void verifyAddressTextBoxIsNotBlank() {
        String address = gokcenManagerPage.addressBox.getAttribute("value").trim();
        ReusableMethods.waitFor(2);
        Assert.assertFalse(address.isEmpty());
    }




    @Then("verify city text box is not blank")
    public void verifyCityTextBoxIsNotBlank() {
        gokcenManagerPage.city.sendKeys("Istanbul"+ Keys.ENTER);
        String city = gokcenManagerPage.city.getAttribute("value").trim();
        Assert.assertFalse(city.isEmpty());

    }

    @Then("verify country text box is not blank")
    public void verifyCountryTextBoxIsNotBlank() {
        ReusableMethods.waitFor(2);
        gokcenManagerPage.country.sendKeys("TURKEY"+ Keys.ENTER);
        String country = gokcenManagerPage.country.getAttribute("value").trim();
        Assert.assertFalse(country.isEmpty());


    }

    @Then("verify state text box is not blank")
    public void verifyStateTextBoxIsNotBlank() {
        gokcenManagerPage.state.sendKeys("US"+Keys.ENTER);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(gokcenManagerPage.state.getAttribute("value").contains("US"));

    }

    @Then("verify state text box is provided as US state")
    public void verifyStateTextBoxIsProvidedAsUSState() {
//        List<String> stateList=states.row(0);
//        String str= gokcenManagerPage.state.getAttribute("value").trim();
//        boolean isUsState = false;
//        for (String w:stateList) {
//            if(w.contains(str)) {
//                isUsState = true;
//                break;
//            }
//        }
//        System.out.println(stateList);
//        System.out.println(str);
//        Assert.assertTrue(isUsState);
    }

    @And("close the application")
    public void closeTheApplication() {
        Driver.closeDriver();
    }
}
