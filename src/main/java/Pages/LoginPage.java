package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

    }

    By SignInButton = By.xpath("//a[@href='login.php']");

    By UserName = By.xpath("//input[@name='userName']");
    By Password = By.xpath("//input[@name='password']");
    By SubmitButton = By.xpath("//input[@name='submit']");

    public void ClickSignInButton() {

        driver.findElement(SignInButton).click();
    }

    public void EnterUserName(String userName) {
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
    }

    public void EnterPassword(String password) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    public void ClickSubmitButton() {
        driver.findElement(SubmitButton).click();
    }




}
