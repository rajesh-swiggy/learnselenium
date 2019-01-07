import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver driver;

    @BeforeMethod
    public void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Java\\Selenium\\ThirdPartyBrowserDrivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void cleanupBrowser() {
        driver.quit();
    }
}
