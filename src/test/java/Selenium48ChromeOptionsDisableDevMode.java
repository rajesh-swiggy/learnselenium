import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium48ChromeOptionsDisableDevMode {
    public void disableDevMode() {
        // Set the chrome path
        System.setProperty("webdriver.chrome.driver", "C:\\Java\\Selenium\\ThirdPartyBrowserDrivers\\chromedriver.exe");

        // Create object of ChromeOptions class
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--disable-extensions");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver(opts);
    }
}
