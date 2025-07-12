package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationSuccessPageUpdated {

    WebDriver driver;

    public RegistrationSuccessPageUpdated(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//b[normalize-space()='Note: Your user name is PK.']")
    WebElement confirmationMessage_Loc;

    public String CheckConfirmationMessage() {
        String confirmation = confirmationMessage_Loc.getText();
        return confirmation;
    }

}
