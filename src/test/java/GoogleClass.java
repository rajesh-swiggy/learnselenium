import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleClass {
    @Test
    public void getLinks(){
        WebDriver driver = new ChromeDriver();
        WebElement currentSearchElement;

        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("java training");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        List<WebElement> searchOptions = driver.findElements(By.xpath("//ul[@class='erkvQe']/child::li"));
        for(int i = 1; i <= searchOptions.size(); i ++)
        {
            currentSearchElement = driver.findElement(By.xpath("//ul[@class='erkvQe']/child::li[" + i + "]//span"));

            if( currentSearchElement.getText().contains("in noida"))
            {
                currentSearchElement.click();
                break;
            }
        }
    }
}
