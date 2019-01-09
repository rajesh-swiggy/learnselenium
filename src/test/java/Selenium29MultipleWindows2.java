import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Selenium29MultipleWindows2  extends BaseClass {
    @Test
    public void multipleWindowExample2() throws InterruptedException {
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Thread.sleep(3000);

        Set<String> allWindows = driver.getWindowHandles();
        ArrayList<String> windowsArray = new ArrayList<>(allWindows);

        for(int i = 0; i < windowsArray.size(); i++)
        {
            if(!windowsArray.get(i).equalsIgnoreCase(parentWindow))
            {
                driver.switchTo().window(windowsArray.get(i));
                driver.findElement(By.name("emailid")).sendKeys("rajeshchahal@gmail.com");
                driver.findElement(By.name("btnLogin")).click();


                By user_id = By.xpath("//table//td[text()='User ID :']");
                Assert.assertTrue(driver.findElement(user_id).isDisplayed(), "User ID text is not displayed.");
            }
        }

    }
}
