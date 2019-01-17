import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
In this scenario we are bound to get
UnhandledAlertException: unexpected alert open: {Alert text : I am a JS Alert}
 */
public class Selenium35TakeScreenshotFailure extends BaseClass {
    @Test
    public void takeScreenshotFailure() throws IOException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        By clickFor_JS_Alert = By.xpath("//button[contains(text(), 'Click for JS Alert')]");
        driver.findElement(clickFor_JS_Alert).click();

        captureScreenshot("failure.png");
    }

}
