import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selenium54AjaxApp extends BaseClass {
    @Test
    public void ajaxAppExample() throws InterruptedException {
        //driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/ajax.html");

        Thread.sleep(60000);

        By options = By.xpath("//div[@class='container']");
        String expectedText = "Radio button is checked and it's value is Yes";
        WebElement buttonTextElement = driver.findElement(By.xpath("//p[@class='radiobutton']"));
        WebElement yesOption = driver.findElement(By.xpath("//input[@id='yes']"));

        Wait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(options));

        String textBefore = buttonTextElement.getText().trim();

        yesOption.click();
        driver.findElement(By.id("buttoncheck")).click();

        wait.until(ExpectedConditions.visibilityOf(buttonTextElement));
        String textAfter = buttonTextElement.getText().trim();

        Assert.assertNotEquals(textBefore, textAfter);

        Assert.assertEquals(textAfter, expectedText);



    }
}
