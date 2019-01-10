import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selenium31MouseHoverAmazon extends BaseClass {
    @Test
    public void mouseHoverNaukri() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement account = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"));

        Actions mouse = new Actions(driver);
        mouse.moveToElement(account).build().perform();

        Thread.sleep(3000);

        WebElement sign_in = driver.findElement(By.xpath("//span[text()='Sign in']"));
        sign_in.click();

        Thread.sleep(3000);
    }
}
