import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium6DropDownBootStrap extends BaseClass {
    @Test
    public void dropdownBootstrapPractice() throws InterruptedException {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

        driver.findElement(By.xpath("//*[@id='menu1']")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        List<WebElement> tutorials_list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for(WebElement elem : tutorials_list)
        {
            if (elem.getText().equalsIgnoreCase("JavaScript"))
            {
                elem.click();
                break;
            }
        }
    }
}
