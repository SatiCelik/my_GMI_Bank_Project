package gmibank.step_definitions.Sati;

import gmibank.pages.SatiUS_006Page;
import gmibank.pages.SatiUS_009Page;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_009_step_defs {

    SatiUS_006Page satiUS_006Page = new SatiUS_006Page();
    SatiUS_009Page satiUS_009Page = new SatiUS_009Page();

    @Given("user enters Username in the sign in page")
    public void userEntersUsernameInTheSignInPage() {
        satiUS_006Page.userNameButton.sendKeys(ConfigReader.getProperty("manager_username"));

    }


    @And("user enters new password in the sign in page")
    public void userEntersNewPasswordInTheSignInPage() {
        satiUS_006Page.passwordButton.sendKeys(ConfigReader.getProperty("manager_password"));

    }

    @And("user click second sign in button")
    public void userClickSecondSignInButton() {
        satiUS_006Page.secondSignInButton.click();

    }

    @And("user goes to My Operation")
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
        satiUS_009Page.customerPageSSNTextBox.sendKeys(ConfigReader.getProperty("ssn_text_box2"));

    }

    @And("user clicks Search button")
    public void userClicksSearchButton() {
        satiUS_009Page.searchButton.click();

    }

    @Then("verify all their registration firstname, lastname, email, phone number, email, address")
    public void verifyAllTheirRegistrationFirstnameLastnameEmailPhoneNumberEmailAddress() {

        String firstname = satiUS_009Page.customerPageFirstNameTextBox.getAttribute("value").trim();
        Assert.assertTrue(firstname.length()>0);
        System.out.println(satiUS_009Page.customerPageFirstNameTextBox.getAttribute("value").trim());

        String lastname =satiUS_009Page.customerPageLastNameTextBox.getAttribute("value").trim();
        Assert.assertTrue(lastname.length()>0);
        System.out.println(satiUS_009Page.customerPageLastNameTextBox.getAttribute("value").trim());

        String email = satiUS_009Page.customerPageEmailTextBox.getAttribute("value").trim();
        Assert.assertTrue(email.length()>0);
        System.out.println(satiUS_009Page.customerPageEmailTextBox.getAttribute("value").trim());

        String phoneNumber = satiUS_009Page.customerPagePhoneNumberTextBox.getAttribute("value").trim();
        Assert.assertTrue(phoneNumber.length()>0);
        System.out.println(satiUS_009Page.customerPagePhoneNumberTextBox.getAttribute("value").trim());

        String address = satiUS_009Page.customerPageAddressTextBox.getAttribute("value").trim();
        Assert.assertTrue(address.length()>0);
        System.out.println(satiUS_009Page.customerPageAddressTextBox.getAttribute("value"));
    }

}
