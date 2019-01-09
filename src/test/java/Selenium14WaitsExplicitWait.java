import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Selenium14WaitsExplicitWait extends BaseClass {
    @Test
    public void explicitWait() throws InterruptedException {
    // Start application
        driver.get("https://www.tripadvisor.co.uk/");

        // Create object of WebDriverWait class and it will wait max of 20 seconds.
        // By default it will accepts in Seconds
        WebDriverWait wait = new WebDriverWait(driver, 20);

        // Here we will wait until element is not visible, if element is visible then it will return web element
        // or else it will throw exception
        //WebElement element = wait
          //      .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Welcome to the all‑new TripAdvisor')]")));

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Welcome to the all‑new TripAdvisor')]")));

        // if element found then we will use- In this example I just called isDisplayed method
        boolean status = element.isDisplayed();

        // if else condition
        if (status) {
            System.out.println("===== Welcome pop-up is visible======");
        } else {
            System.out.println("===== Welcome pop-up is not visible======");
        }

    }

}