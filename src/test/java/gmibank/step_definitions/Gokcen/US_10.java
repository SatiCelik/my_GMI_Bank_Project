package gmibank.step_definitions.Gokcen;

import gmibank.pages.GokcenManagerPage;
import gmibank.utilities.ReusableMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class US_10 {

    public boolean hasDigit(String str){
        char[] arr=str.toCharArray();
        for (char w:arr) {
            if(Character.isDigit(w))
                return true;
        }
        return false;
    }

    public boolean hasLetter(String str){
        char[] arr=str.toCharArray();
        for (char w:arr) {
            if(Character.isLetter(w))
                return true;
        }
        return false;
    }

    GokcenManagerPage managerPage=new GokcenManagerPage();
    @Then("verify address box is not blank")
    public void verifyAddressBoxIsNotBlank() {
        String add= managerPage.addressBox.getAttribute("value").trim();
        System.out.println(add);
        Assert.assertFalse(add.isEmpty());

    }


    @Then("verify address box has letters and digits")
    public void verifyAddressBoxHasLettersAndDigits() {
        String address=  managerPage.addressBox.getAttribute("value").trim();
        System.out.println(address);
        Assert.assertTrue((hasDigit(address)&& hasLetter(address)));

    }

    @Then("verify city box is not blank")
    public void verifyCityBoxIsNotBlank() {
        managerPage.city.sendKeys("van");
        ReusableMethods.waitFor(2);
        String city=managerPage.city.getAttribute("value");
        Assert.assertFalse(city.isEmpty());
        System.out.println(city);

    }
    @Then("verify country box is not blank")
    public void verify_country_box_is_not_blank() {
        Select select=new Select(managerPage.country);
        select.selectByValue("27901");
        ReusableMethods.waitFor(2);
        String country=managerPage.country.getAttribute("value").trim();
        Assert.assertFalse((country.isEmpty()));
    }
    @Then("verify state box is not blank")
    public void verify_state_box_is_not_blank() {
        managerPage.state.sendKeys("Arkansas");
        String state=managerPage.state.getAttribute("value").trim();
        Assert.assertFalse((state.isEmpty()));

    }
    @Then("verify state box is provided as US state")
    public void verify_state_box_is_provided_as_us_state(DataTable states) {
        List<String> stateList=states.row(0);
       String str= managerPage.state.getAttribute("value").trim();
        boolean isUsState = false;
        for (String w:stateList) {
            if(w.contains(str)) {
                isUsState = true;
                break;
            }
        }
        System.out.println(stateList);
        System.out.println(str);
        Assert.assertTrue(isUsState);

    }

}
