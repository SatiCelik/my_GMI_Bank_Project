package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SatiLoginPage {

   public SatiLoginPage(){
       PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "account-menu")
    public WebElement dropDownMenuButton;

    @FindBy(id = "login-item")
    public WebElement signInDropDown;

   @FindBy(id = "username")
    public WebElement usernameButton;

   @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordButton;

   @FindBy(id = "account-menu")
    public WebElement accountMenu;

   @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

   @FindBy(xpath = "//button[@tabindex='1']")
    public WebElement cancelButton;

   @FindBy(xpath = "//div[@class='brand-icon']")
    public WebElement mainPageVisible;

   @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement errorMessageVisible;

   @FindBy(xpath = "//span[text()=\"tester team3\"]")
    public WebElement loginPageSignInVerify;
@FindBy(linkText = "Did you forget your password?")
    public WebElement forgetYourPassword;

   @FindBy(xpath = "//input[@type='email']")
    public WebElement emailTextBox;

   @FindBy(xpath = "//button[@type='submit']")
    public WebElement resetPassword;

   @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement greenPart;

   @FindBy(xpath = "//div[@class='brand-icon']")
    public WebElement registrationPageVisible;

   @FindBy(linkText = "Register a new account")
    public WebElement createNewAccount;




}


