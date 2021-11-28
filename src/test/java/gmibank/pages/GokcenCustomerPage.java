package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GokcenCustomerPage {

    public GokcenCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='Password']")
    public WebElement passwordButton;
    //(//a[@role='menuitem'])[4]

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement secondSignInButton;

    @FindBy(className = "invalid-feedback")
    public  WebElement invalidPasswordMessage;

    @FindBy(xpath = "(//a[@href='#'])[3]")
    public WebElement menuDropDown;

    @FindBy(id = "username")
    public WebElement usernameText;

    @FindBy(id = "password")
    public WebElement passwordText;

    @FindBy(name="currentPassword")
   public WebElement currentPasswordText;

    @FindBy(name = "newPassword")
    public WebElement newPasswordText;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement orange;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 255, 0);']")
    public WebElement yellow;

    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement green;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement red;

    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement lightgreen;

    @FindBy(id = "confirmPassword")
    public WebElement confirmPasswordText;

}
