package gmibank.step_definitions.Gokcen;

import gmibank.pages.GokcenCustomerPage;
import gmibank.pages.GokcenManagerPage;
import gmibank.pages.SatiLoginPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US_09 {
GokcenManagerPage managerPage=new GokcenManagerPage();
SatiLoginPage loginPage=new SatiLoginPage();

    @Given("user enters manager username and password")
    public void user_enters_manager_username_and_password() {
        loginPage.usernameButton.sendKeys(ConfigReader.getProperty("manager_username"));
        loginPage.passwordButton.sendKeys(ConfigReader.getProperty("manager_password"));
    }
    @Given("user click manage customers")
    public void user_click_manage_customers() {
        managerPage.myOperationsLink.click();
        managerPage.manageCustomersLink.click();
    }
    @Given("user click create customer")
    public void user_click_create_customer() {
        managerPage.createCustomerButton.click();
    }
    @Given("user search ssn number")
    public void user_search_ssn_number() {
      managerPage.searchSsnText.sendKeys(ConfigReader.getProperty("ssn_text_box"));
      managerPage.searchButton.click();
      ReusableMethods.waitFor(3);
    }
    @Then("verify all their registration")
    public void verify_all_their_registration() {
        ReusableMethods.waitFor(3);
        System.out.println(managerPage.firstNameBox.getAttribute("value").trim());
        System.out.println(managerPage.emailBox.getAttribute("value").trim());
        System.out.println(managerPage.addressBox.getAttribute("value").trim());
        System.out.println(managerPage.mobilePhoneNumber.getAttribute("value").trim());
        System.out.println(managerPage.lastNameBox.getAttribute("value").trim());



    }
}
