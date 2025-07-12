package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUpdated {
    WebDriver driver;

    public LoginPageUpdated(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='login.php']")
    WebElement SignInButton;

    @FindBy(xpath = "//input[@name='userName']")
    WebElement UserName;

    @FindBy(xpath = "//input[@name='password']")
    WebElement Password;

    @FindBy(how = How.XPATH, using = "//input[@name='submit']")
    WebElement SubmitButton;


    public void ClickSignInButton() {
        SignInButton.click();
    }

    public void EnterUserName(String userName) {
        UserName.sendKeys(userName);
    }

    public void EnterPassword(String password) {
        Password.sendKeys(password);
    }

    public void ClickSubmitButton() {
        SubmitButton.click();
    }


}
