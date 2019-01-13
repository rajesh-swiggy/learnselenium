import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Selenium47FireFoxDefaultProfile {
    public void fireFoxDefaultProfile() {
        // Create object of ProfileIni class
        ProfilesIni init = new ProfilesIni();

        // Get the default session
        FirefoxProfile profile = init.getProfile("default");

        // Use the profile in driver initiation
        WebDriver driver = new FirefoxDriver();  //WebDriver driver = new FirefoxDriver(profile);

        driver.get("https://learn-automation.com");

        driver.quit();
    }
}
