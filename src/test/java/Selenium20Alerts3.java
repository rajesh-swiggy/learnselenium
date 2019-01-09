import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Selenium20Alerts3 extends BaseClass {
    @Test
    public void alertPractice3() throws InterruptedException {
        // another sample website : http://demo.guru99.com/test/delete_customer.php
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Alert alt;
        By clickFor_JS_Confirm = By.xpath("//button[contains(text(), 'Click for JS Prompt')]");
        By result_msg = By.xpath("//p[@id='result']");
        String expected_alertText = "I am a JS prompt";
        String actual_AlertText =null;
        String actual_ResultText = null;
        String input_text = "I am testing JS Alert";
        String expected_result = "You entered: " + input_text;

        driver.findElement(clickFor_JS_Confirm).click();

        alt = driver.switchTo().alert();
        actual_AlertText = alt.getText();

        alt.sendKeys(input_text);
        alt.accept();

        actual_ResultText = driver.findElement(result_msg).getText();

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actual_ResultText, expected_result, "Result msg is not as expected. Expected : '" + expected_result + "', Actual : '" + actual_ResultText + "'");
        sa.assertEquals(actual_AlertText, expected_alertText, "Alert text is not as expected. Expected : '" + expected_alertText + "', Actual : '" + actual_AlertText+ "'");

        sa.assertAll();
    }
}
