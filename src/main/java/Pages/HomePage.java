package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    By registrationLink = By.xpath("//a[@href='register.php']");

    public void openHomePage() {
       driver.findElement(registrationLink).click();
    }
}
