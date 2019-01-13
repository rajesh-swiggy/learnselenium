import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Selenium49ChromeOptionsDisableNotification {
    @Test
    public void disableChromeNotification() {
        // Create object of HashMap class
        Map<String, Object> prefs = new HashMap<String, Object>();

        // set the notification setting it will override the default
        // 0 - Default
        // 1 - Allow
        // 2 - Disable
        prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
        ChromeOptions opts = new ChromeOptions();
        opts.setExperimentalOption("prefs", prefs);

        // Pass the options in object during driver creation
        System.setProperty("webdriver.chrome.driver", "C:\\Java\\Selenium\\ThirdPartyBrowserDrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(opts);
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

    }
}
