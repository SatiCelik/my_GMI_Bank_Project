package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement MenuDropDownButton;

    @FindBy(xpath = "(//a[@role='menuitem'])[2]")
    public WebElement RegisterButton;
    @FindBy(id = "ssn")
    public WebElement ssnTextBox;

    @FindBy(name = "firstname")
    public WebElement firstnameTextBox;

    @FindBy(name = "lastname")
    public WebElement lastnameTextBox;

    @FindBy(name = "address")
    public WebElement addressTextBox;

    @FindBy(id = "mobilephone")
    public WebElement phoneTextBox;

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement menuDropDown;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement registerButton;


    @FindBy(id = "firstname")
    public WebElement firstNameTextBox;

    @FindBy(id = "lastname")
    public WebElement lastNameTextBox;


    @FindBy(xpath = "//input[@name='mobilephone']")
    public WebElement phoneNumberTextBox;


    @FindBy(id = "username")
    public WebElement userNameTextBox;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextBox;

    @FindBy(id = "secondPassword")
    public WebElement secondPasswordTextBox;

    @FindBy(id = "register-submit")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement savedMessage;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement ssnErrorMessage;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement phoneNumberErrorMessage;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement emailErrorMessage;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement addressErrorMessage;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement usernameErrorMessage;


    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement firstColorPartOfPassword;

    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement secondColorPartOfPassword;

    @FindBy(xpath = "(//li[@class='point'])[3]")
    public WebElement thirdColorPartOfPassword;

    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement fourthColorPartOfPassword;

    @FindBy(xpath = "(//li[@class='point'])[5]")
    public WebElement fifthColorPartOfPassword;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement orange;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 255, 0);']")
    public WebElement yellow;

    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement green;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement red;
}
