import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium8ToolTipSimple extends  BaseClass{
    @Test
    public void toolTipPractice() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/social-icon.html");

        Thread.sleep(5000);
        //driver.findElement(By.xpath("//li[@id='Forms Based']")).click();
        //Thread.sleep(5000);
        WebElement user_name = driver.findElement(By.className("github"));

        Actions builder = new Actions(driver);
        builder.moveToElement(user_name).perform();

        String tooltip = user_name.getAttribute("title");

        System.out.println("'" + tooltip + "'");
    }
}
