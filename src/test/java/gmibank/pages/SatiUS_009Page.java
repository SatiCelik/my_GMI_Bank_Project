package gmibank.pages;

import com.google.j2objc.annotations.Weak;
import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SatiUS_009Page {

    public SatiUS_009Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "My Operations")
    public WebElement myOperationsDropDown;

    @FindBy(linkText = "Manage Customers")
    public WebElement manageCustomers;

    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomerButton;

    @FindBy(id = "search-ssn")
    public WebElement customerPageSSNTextBox;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement customerPageFirstNameTextBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement customerPageLastNameTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement customerPageEmailTextBox;

    @FindBy(xpath = "//input[@name='mobilePhoneNumber']")
    public WebElement customerPagePhoneNumberTextBox;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement customerPageAddressTextBox;



}
