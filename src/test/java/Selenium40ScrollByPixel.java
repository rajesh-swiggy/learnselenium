import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Selenium40ScrollByPixel extends BaseClass {
    @Test
    public void scrollByPixel() throws IOException {
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        captureScreenshot("beforeScroll");
        js.executeScript("window.scrollBy(0,1000)");
        captureScreenshot("afterScroll");
    }
}
