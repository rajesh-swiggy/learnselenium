import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class GitExplorerTest {
    @Test
    public void gitExplorer(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://gitexplorer.com/");
        driver.findElement(By.xpath("//div[@class='css-10nd86i options-select']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='css-10nd86i options-select']//div[@class='css-15k3avv options-select__menu']")));
        List<WebElement> element1 = element.findElements(By.xpath(".//div[@role='option']"));

        for(WebElement elem : element1)
        {
            System.out.println(elem.getText());
        }

    }
}
