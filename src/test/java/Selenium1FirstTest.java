import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium1FirstTest extends BaseClass {
    @Test
    public void loginFaceBook() throws InterruptedException {
        driver.get("https://www.facebook.com/");

        By USER_ID = By.xpath("//input[@id='email']");
        By PASSWORD = By.xpath("//input[@id='pass']");
        By LOGIN = By.xpath("//input[@aria-label='Log In']");
        By HOME_LINK = By.linkText("Home");

        Assert.assertTrue(driver.getTitle().contains("log in"), "Facebook is not at sign in page. Title found : '" + driver.getTitle() + "'" );

        driver.findElement(USER_ID).sendKeys("rajchahal.nsit@gmail.com");
        driver.findElement(PASSWORD).sendKeys("Doctor12#");
        driver.findElement(LOGIN).click();

        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(HOME_LINK).isDisplayed(), "Facebook is not logged in successfully.");

    }
}
