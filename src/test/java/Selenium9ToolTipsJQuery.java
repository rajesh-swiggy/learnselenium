import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium9ToolTipsJQuery extends BaseClass{
        @Test
        public void toolTipPractice() throws InterruptedException {
            driver.get("http://demo.guru99.com/test/tooltip.html");

            Thread.sleep(5000);

            WebElement download_now = driver.findElement(By.id("download_now"));

            Actions builder = new Actions(driver);
            builder.moveToElement(download_now).perform();

            WebElement tooltip = driver.findElement(By.xpath("//div[@class='box']/div/a"));

            String tooltipText = tooltip.getText();

            System.out.println("'" + tooltipText + "'");
        }
}
