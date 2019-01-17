import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Selenium41ScrollIntoView extends BaseClass {
    @Test
    public void scrollIntoView() throws IOException {
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement linuxLink = driver.findElement(By.linkText("Linux"));

        captureScreenshot("beforeScrollView");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", linuxLink);

        captureScreenshot("afterScrollView");
    }
}
