import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Selenium1SafariBrowser {
    @Test
    public void LaunchSafari() {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
    }
}
