import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Selenium15WaitsExplicitWait2 extends BaseClass {
    @Test
    public void explicitWait() throws InterruptedException {
        // Start application
        driver.get("https://jqueryui.com/progressbar/#download");

        driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
        driver.findElement(By.id("downloadButton")).click();

        By complete_label = By.xpath("//div[@class='progress-label' and contains(text(),'Complete')]");
        // Create object of WebDriverWait class and it will wait max of 20 seconds.
        // By default it will accepts in Seconds
        WebDriverWait wait = new WebDriverWait(driver, 30);

        // Here we will wait until element is not visible, if element is visible then it will return web element
        // or else it will throw exception
        //WebElement element = wait
        //      .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Welcome to the all‑new TripAdvisor')]")));

        //driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(complete_label));

        // if element found then we will use- In this example I just called isDisplayed method
        boolean status = element.isDisplayed();

        // if else condition
        if (status) {
            System.out.println("===== Complete text is visible======");
        } else {
            System.out.println("===== Complete text is not visible======");
        }

    }

}