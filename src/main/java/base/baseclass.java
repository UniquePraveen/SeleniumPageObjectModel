package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class baseclass {

   public WebDriver driver;
   public Properties prop;

    @BeforeMethod
    public void setDriver() throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "//src//test//resources//config.properties");
        prop = new Properties();
        prop.load(fis);

        String browser = prop.getProperty("browser");
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Invalid browser specified");
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(prop.getProperty("url"));

    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
}
