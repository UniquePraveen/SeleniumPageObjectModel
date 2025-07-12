package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageUpdated {

    WebDriver driver;

    public HomePageUpdated(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='register.php']")
    WebElement registrationLink;

    public RegistrationPageUpdated openHomePage() {
        registrationLink.click();
        return new RegistrationPageUpdated(driver);
    }
}
