package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }


    By firstName_Loc = By.xpath("//input[@name='firstName']");
    By lastName_Loc = By.xpath("//input[@name='lastName']");
    By city_Loc = By.xpath("//input[@name='city']");
    By country_Loc = By.xpath("//select[@name='country']");
    By email_Loc = By.xpath("//input[@name='userName']");
    By dropDown_Loc = By.xpath("//select[@name='country']");
    By userName_Loc = By.xpath("//input[@name='email']");
    By password_Loc = By.xpath("//input[@name='password']");
    By confirmPassword_Loc = By.xpath("//input[@name='confirmPassword']");
    By submitButton_Loc = By.xpath("//input[@name='submit']");


    public void setFirstName(String firstName) {
        driver.findElement(firstName_Loc).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastName_Loc).sendKeys(lastName);
    }

    public void setCity(String city) {
        driver.findElement(city_Loc).sendKeys(city);
    }

    public void setCountry(String country){
        driver.findElement(country_Loc).sendKeys(country);
    }

    public void setEmail(String email){
        driver.findElement(email_Loc).sendKeys(email);
    }

    public void selectCountry(String country){
        Select select = new Select(driver.findElement(dropDown_Loc));
        select.selectByVisibleText(country);
    }

    public void setUserName(String userName){
        driver.findElement(userName_Loc).sendKeys(userName);
    }

    public void  setPassword(String password){
        driver.findElement(password_Loc).sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword){
        driver.findElement(confirmPassword_Loc).sendKeys(confirmPassword);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButton_Loc).click();
    }

}
