import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Selenium37TakeScreenshotsFileHandler extends BaseClass {
    @Test
    public void takeScreenshotFileHandler() {
        driver.get("https://www.google.com");

        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        try
        {
            FileHandler.copy(source, new File("./Screenshots/FileHandler.png"));
        }
        catch (WebDriverException e)
        {

        }
        catch (IOException e)
        {

        }
    }
}
