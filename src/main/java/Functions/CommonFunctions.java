package Functions;

import Pages.RegistrationPage;
import org.openqa.selenium.WebDriver;

public class CommonFunctions {

    WebDriver driver;
    public CommonFunctions(WebDriver driver) {
        this.driver = driver;
    }
    public void RegistrationForm() {

        //Fill Registration Form
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.setFirstName("Praveen");
        registrationPage.setLastName("Kumar");
        registrationPage.setCity("Hatton");
        registrationPage.setCountry("Sri Lanka");
        registrationPage.setEmail("test@gmail.com");
        registrationPage.selectCountry("GERMANY");
        registrationPage.setUserName("PK");
        registrationPage.setPassword("Admin123");
        registrationPage.setConfirmPassword("Admin123");
        registrationPage.clickSubmitButton();

    }
}
