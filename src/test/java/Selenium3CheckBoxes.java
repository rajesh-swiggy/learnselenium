import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium3CheckBoxes extends BaseClass {
    int i = 0;
    @Test
    public void CheckBoxPractice() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        for(int i = 1; i <= 2; i++)
        {
            By CHECK_BOX = By.xpath("//form/text()[contains(.,'checkbox "+i+"')]/preceding-sibling::input");
            driver.findElement(CHECK_BOX).click();
            Thread.sleep(30000);
            System.out.println("leaving for loop");
        }

        Thread.sleep(60000);
    }
}
