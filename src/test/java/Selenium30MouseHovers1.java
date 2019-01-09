import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium30MouseHovers1 extends BaseClass {
    @Test
    public void mouseHover1Example() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        By images = By.xpath("//div[@class='figure']//following::img");

        List<WebElement> images_list = driver.findElements(images);
        for(WebElement e:images_list)
        {
            System.out.println("entering for each");
            Actions builder = new Actions(driver);
            System.out.println("crossed actions");
            builder.moveToElement(e).perform();

            System.out.println("perfoming actions.");
            WebElement view_profile_link = driver.findElement(By.linkText("View profile"));
            System.out.println("view profile crossed.");
            if(view_profile_link.isDisplayed())
            {
                view_profile_link.click();
                Thread.sleep(3000);
            }
            view_profile_link = null;
        }
    }
}
