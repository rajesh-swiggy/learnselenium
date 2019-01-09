import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selenium18Alerts1 extends BaseClass {
    @Test
    public void alertsPracticeJSAlert() {
        // another sample website : http://demo.guru99.com/test/delete_customer.php
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        By clickFor_JS_Alert = By.xpath("//button[contains(text(), 'Click for JS Alert')]");
        By result_msg = By.xpath("//p[@id='result']");
        String expected_result = "You successfuly clicked an alert";
        String expected_alertText = "I am a JS Alert";

        driver.findElement(clickFor_JS_Alert).click();
        Alert alt = driver.switchTo().alert();

        String actual_alertText = alt.getText();

        Assert.assertEquals(actual_alertText, expected_alertText, "Alert text was not displayed correctly. Expected : " + expected_alertText + ", Actual : " + actual_alertText);

        alt.accept();

        String actual_ResultText = driver.findElement(result_msg).getText();

        Assert.assertEquals(expected_result, actual_ResultText, "Result text was not displayed as expected. Expected : "+ expected_result+ ", Actual : " + actual_ResultText);
    }
}
