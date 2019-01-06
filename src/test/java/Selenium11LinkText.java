import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium11LinkText extends BaseClass {
    @Test
    public void linkTextPractice() {
        driver.get("http://demo.guru99.com/test/link.html");
        driver.findElement(By.linkText("click here")).click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
    }
}
