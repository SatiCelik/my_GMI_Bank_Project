package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SatiUS_006Page {

    public SatiUS_006Page(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "login-item")
    public WebElement firstSignInButton;

    @FindBy(id = "username")
    public WebElement userNameButton;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement secondSignInButton;

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[3]")
    public WebElement accountMenuButton;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement userInfoDropDown;

    @FindBy(id = "firstName")
    public WebElement firstNameTextBox;

    @FindBy(id = "lastName")
    public WebElement lastNameTextBox;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "langKey")
    public WebElement languageTextBox;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
    public WebElement signOutButton;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement emailErrorMessage;

    @FindBy (xpath = "//option[1]")
    public WebElement englishOption;

    @FindBy(xpath = "//option[2]")
    public  WebElement turkishOption;



}
