import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.IOException;

public class Selenium42ScrollTillEnd extends  BaseClass {
    @Test
    public void scrollTillEnd() throws IOException {
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();

        captureScreenshot("beforeScrollEnd");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        captureScreenshot("afterScrollEnd");
    }
}
