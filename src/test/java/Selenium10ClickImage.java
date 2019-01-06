import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium10ClickImage extends BaseClass {
    @Test
    public void clickImagePractice() throws InterruptedException {
        driver.get("https://www.facebook.com/login/identify?ctx=recover&lwv=111&ars=royal_blue_bar");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[@title='Go to Facebook home']")).click();

        String title = driver.getTitle();
        Assert.assertEquals(title, "Facebook – log in or sign up");
    }
}
