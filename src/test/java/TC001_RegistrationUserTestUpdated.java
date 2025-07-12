import Pages.*;
import Utilities.PropertyFileReader;
import base.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IBaseBeforeAfter;

import java.time.Duration;

public class TC001_RegistrationUserTestUpdated extends baseclass {

    PropertyFileReader propertyFileReader = new PropertyFileReader();

    @Test
    public void registrationUserTest() {

        //Open Home Page
        HomePageUpdated homePage = new HomePageUpdated(driver);
        String confirmationMessage = homePage.openHomePage()
                .setFirstName("Praveen")
                .setLastName("Kumar")
                .setCity("Hatton")
                .setCountry("Sri Lanka")
                .setEmail("test@gmail.com")
                .selectCountry("GERMANY")
                .setUserName("PK")
                .setPassword(propertyFileReader.returnProperty("testData", "password"))
                .setConfirmPassword("Admin123")
                .clickSubmitButton()
                .CheckConfirmationMessage();

        Assert.assertTrue(confirmationMessage.contains(" user name is PK"), "Registration Failed");

        // Login to the application

        LoginPageUpdated loginPage = new LoginPageUpdated(driver);
        loginPage.ClickSignInButton();
        loginPage.EnterUserName("PK");
        loginPage.EnterPassword("Admin123");
        loginPage.ClickSubmitButton();

//        //Fill Registration Form
//        RegistrationPageUpdated registrationPage = new RegistrationPageUpdated(driver);
//        registrationPage.setFirstName("Praveen");
//        registrationPage.setLastName("Kumar");
//        registrationPage.setCity("Hatton");
//        registrationPage.setCountry("Sri Lanka");
//        registrationPage.setEmail("test@gmail.com");
//        registrationPage.selectCountry("GERMANY");
//        registrationPage.setUserName("PK");
//        registrationPage.setPassword("Admin123");
//        registrationPage.setConfirmPassword("Admin123");
//        registrationPage.clickSubmitButton();
//
//        // Registration Success Page
//
//        RegistrationSuccessPageUpdated registrationSuccessPage = new RegistrationSuccessPageUpdated(driver);
//        String confirmationMessage = registrationSuccessPage.CheckConfirmationMessage();
//
//        Assert.assertTrue(confirmationMessage.contains(" user name is PK"), "Registration Failed");


    }


}
