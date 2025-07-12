package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPageUpdated {

    WebDriver driver;

    public RegistrationPageUpdated(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName_Loc;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName_Loc;

    @FindBy(xpath = "//input[@name='city']")
    WebElement city_Loc;

    @FindBy(xpath = "//select[@name='country']")
    WebElement country_Loc;

    @FindBy(xpath = "//input[@name='userName']")
    WebElement email_Loc;

    @FindBy(xpath = "//select[@name='country']")
    WebElement dropDown_Loc;

    @FindBy(xpath = "//input[@name='email']")
    WebElement userName_Loc;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password_Loc;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    WebElement confirmPassword_Loc;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitButton_Loc;


    public RegistrationPageUpdated setFirstName(String firstName) {
        firstName_Loc.sendKeys(firstName);
        return this;
    }

    public RegistrationPageUpdated setLastName(String lastName) {
        lastName_Loc.sendKeys(lastName);
        return this;
    }

    public RegistrationPageUpdated setCity(String city) {
        city_Loc.sendKeys(city);
        return this;
    }

    public RegistrationPageUpdated setCountry(String country) {
        country_Loc.sendKeys(country);
        return this;
    }

    public RegistrationPageUpdated setEmail(String email) {
        email_Loc.sendKeys(email);
        return this;
    }

    public RegistrationPageUpdated selectCountry(String country) {
        Select select = new Select(dropDown_Loc);
        select.selectByVisibleText(country);
        return this;
    }

    public RegistrationPageUpdated setUserName(String userName) {
        userName_Loc.sendKeys(userName);
        return this;
    }

    public RegistrationPageUpdated setPassword(String password) {
        password_Loc.sendKeys(password);
        return this;
    }

    public RegistrationPageUpdated setConfirmPassword(String confirmPassword) {
        confirmPassword_Loc.sendKeys(confirmPassword);
        return this;
    }

    public RegistrationSuccessPageUpdated clickSubmitButton() {
        submitButton_Loc.click();
        return new RegistrationSuccessPageUpdated(driver);
    }

}
