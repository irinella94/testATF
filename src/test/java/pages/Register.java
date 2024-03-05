package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class Register extends PageObjects {
    @FindBy(xpath = "//h1[normalize-space()='Signing up is easy!']")
    WebElement singinUpMessage;

    @FindBy(xpath = "//b[normalize-space()='First Name:']")
    WebElement firstName;

    @FindBy(xpath = "//b[normalize-space()='Username:']")
    WebElement username;

    @FindBy(xpath = "//b[normalize-space()='Password:']")
    WebElement password;

   @FindBy (xpath = "//b[normalize-space()='Confirm:']")
    WebElement confirm;

   @FindBy (xpath = "//input[@id='customer.firstName']")
    WebElement firstNameField;

   @FindBy(xpath = "//input[@id='customer.username']")
   WebElement userNameField;

   @FindBy(xpath = "//input[@id='customer.password']")
   WebElement passwordField;

   @FindBy(xpath = "//input[@id='repeatedPassword']")
   WebElement confirmField;

   @FindBy(xpath = "//input[@value='Register']")
   WebElement registerNewAccount;

   @FindBy(xpath = "//span[@id='customer.lastName.errors']")
   WebElement lastNameIsRequired;

   @FindBy(xpath = "//span[@id='customer.address.street.errors']")
    WebElement addressIsRequired;

    @FindBy(xpath = "//span[@id='customer.address.city.errors']")
    WebElement cityIsRequired;

    @FindBy(xpath = "//span[@id='customer.address.state.errors']")
    WebElement stateIsRequired;



    public Register(WebDriver driver) {
        super(driver);
    }

}
