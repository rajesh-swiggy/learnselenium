import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Selenium43ScrollIntoViewHorizontal extends BaseClass {
    @Test
    public void scrollIntoViewHorizontal() throws IOException {
        driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement vbScriptLink = driver.findElement(By.linkText("VBScript"));

        captureScreenshot("beforeScrollHorizontal");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", vbScriptLink);

        captureScreenshot("afterScrollHorizontal");

    }
}
