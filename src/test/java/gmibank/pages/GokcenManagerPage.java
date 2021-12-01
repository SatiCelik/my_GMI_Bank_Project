package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GokcenManagerPage {

    public GokcenManagerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "My Operations")
    public WebElement myOperationsLink;

    @FindBy(xpath = "//span[text()='Manage Customers']")
    public WebElement manageCustomersLink;

    @FindBy(id = "jh-create-entity")
    public WebElement createCustomerButton;

    @FindBy(id = "search-ssn")
    public WebElement searchSsnText;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButton;

    //customer creation
    @FindBy(name = "firstName")
    public WebElement firstNameBox;

    @FindBy(name = "lastName")
    public WebElement lastNameBox;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(name = "mobilePhoneNumber")
    public WebElement mobilePhoneNumber;

    @FindBy(name = "address")
    public WebElement addressBox;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name ="country.id")
    public WebElement country;
    @FindBy(xpath = "//option[@value='27901']")
    public  WebElement Turkey;

    @FindBy(name="state")
    public WebElement state;


}