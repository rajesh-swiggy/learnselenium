import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium32ContextClick extends BaseClass {
    @Test
    public void contextClickExample() throws InterruptedException {
        driver.get("https://www.amazon.in");

        Actions sell = new Actions(driver);
        //sell.contextClick().perform();

        sell.contextClick(driver.findElement(By.xpath("//a[@class='nav-a'][contains(text(),'Sell')]"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(20000);


    }
}
