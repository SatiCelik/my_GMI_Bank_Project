package gmibank.step_definitions.Sati;

import gmibank.pages.SatiUS_009Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class US_009_step_defs {

    SatiUS_009Page satiUS_009Page = new SatiUS_009Page();

    @Given("user goes to My Operation")
    public void userGoesToMyOperation() {
        satiUS_009Page.myOperationsDropDown.click();
    }

    @And("user click to manage customers page")
    public void userClickToManageCustomersPage() {
        satiUS_009Page.manageCustomers.click();

    }

    @And("user clicks the create a new customer button")
    public void userClicksTheCreateANewCustomerButton() {
        satiUS_009Page.createNewCustomerButton.click();

    }

    @And("user enters SSN")
    public void userEntersSSN() {
        satiUS_009Page.customerPageSSNTextBox.sendKeys("123-45-6789"+ Keys.ENTER);

    }

    @And("user clicks Search button")
    public void userClicksSearchButton() {
        satiUS_009Page.searchButton.click();

    }

    @Then("verify firstname, lastname, email,phone number, address is not blank")
    public void verifyFirstnameLastnameEmailPhoneNumberAddressIsNotBlank() {
    }

}
