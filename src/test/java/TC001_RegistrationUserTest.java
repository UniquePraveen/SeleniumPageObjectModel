import Functions.CommonFunctions;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import Pages.RegistrationSuccessPage;
import base.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC001_RegistrationUserTest extends baseclass {


    @Test
    public void registrationUserTest() {

        //Open Home Page
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();

        CommonFunctions commonFunctions = new CommonFunctions(driver);
        commonFunctions.RegistrationForm();
        RegistrationSuccessPage();
        LoginToTheApplication();

    }

//    public void RegistrationForm() {
//
//        //Fill Registration Form
//        RegistrationPage registrationPage = new RegistrationPage(driver);
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
//    }

    public void RegistrationSuccessPage() {

        // Registration Success Page
        RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage(driver);
        String confirmationMessage = registrationSuccessPage.CheckConfirmationMessage();

        Assert.assertTrue(confirmationMessage.contains(" user name is PK"), "Registration Failed");
    }

    public void LoginToTheApplication() {

        // Login to the application
        LoginPage loginPage = new LoginPage(driver);
        loginPage.ClickSignInButton();
        loginPage.EnterUserName("PK");
        loginPage.EnterPassword("<PASSWORD>");
        loginPage.ClickSubmitButton();

    }


}
