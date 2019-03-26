import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonTest {
    @Test
    public void OpenURL() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        Thread.sleep(30000);

        driver.findElement(By.xpath("//div[@class='glow-toaster-footer']//span[contains(text(), 'CONTINUE')]/preceding-sibling::input")).click();
    }
}
