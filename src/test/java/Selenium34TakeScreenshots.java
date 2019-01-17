import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Selenium34TakeScreenshots extends BaseClass {
    @Test
    public void takeScreenshotExample() throws IOException {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing screen");
        captureScreenshot("google.png");
    }
}


/*public void captureScreenshot(String screenshotname) throws IOException {
    TakesScreenshot ts = (TakesScreenshot)driver;
    File source = ts.getScreenshotAs(OutputType.FILE);

    FileUtils.copyFile(source, new File("./Screenshots/"+screenshotname));

    System.out.println("Screenshot taken");
}*/