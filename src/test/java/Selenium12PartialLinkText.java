import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium12PartialLinkText extends BaseClass {
    @Test
    public void partialLinkText() {
        driver.get("http://demo.guru99.com/test/accessing-link.html");
        driver.findElement(By.partialLinkText("here")).click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
    }
}
