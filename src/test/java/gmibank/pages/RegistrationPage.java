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


}
