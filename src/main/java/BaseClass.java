import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    WebDriver driver;

    @BeforeMethod
    public void setupBrowser() {
        String OS = System.getProperty("os.name").toLowerCase();
        if(!OS.contains("mac"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Java\\Selenium\\ThirdPartyBrowserDrivers\\chromedriver.exe");
        }

        driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanupBrowser() {
        driver.quit();
    }
}
