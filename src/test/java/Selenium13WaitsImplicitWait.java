import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Selenium13WaitsImplicitWait extends BaseClass {
    @Test
    public void implicitWaitPractice() {
        // Loading a URL
        driver.get("https://www.redbus.in/");
        // Locating and typing in From text box.
        WebElement fromTextBox= driver.findElement(By.id("src"));
        fromTextBox.sendKeys("Ban");
        // setting implicit time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Wait starts:"+new Date());
        System.out.println("Typed Ban");

        // Clicking on first search result
        driver.findElement(By.xpath("//li[@select-id='results[100]']")).click();
        System.out.println("Selected Bangalore");
        System.out.println("Wait ends:"+new Date());
    }
}
