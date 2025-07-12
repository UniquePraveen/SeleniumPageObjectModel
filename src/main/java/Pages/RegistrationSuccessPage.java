package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationSuccessPage {

    WebDriver driver;

    public RegistrationSuccessPage(WebDriver driver) {
        this.driver = driver;
    }


    By confirmationMessage = By.xpath("//b[normalize-space()='Note: Your user name is PK.']");

    public String CheckConfirmationMessage() {
        String confirmation = driver.findElement(confirmationMessage).getText();
        return confirmation;
    }

}
