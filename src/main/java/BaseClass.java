import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class BaseClass {
    WebDriver driver;

    @BeforeMethod
    public void setupBrowser() {
        String OS = System.getProperty("os.name").toLowerCase();
        if(!OS.contains("mac"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Java\\Selenium\\ThirdPartyBrowserDrivers\\chromedriver.exe");
        }

        driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanupBrowser(ITestResult result)
    {
        driver.quit();
    }

    public void captureScreenshot(String screenshotname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(source, new File("./Screenshots/"+screenshotname+".png"));

        System.out.println("Screenshot taken");
    }

}

