import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selenium27BootstrapModalWindow extends  BaseClass {
    @Test
    public void bootStrapModalPractice() throws InterruptedException {
        driver.get("http://seleniumpractise.blogspot.com/2016/11/handle-bootstrap-model-dialog-in.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()='Click here to Login']")).click();

        driver.findElement(By.xpath("//p[text()='This is a large modal.']/following-sibling::input")).sendKeys("RajeshKumar");

        Thread.sleep(3000);
    }
}
