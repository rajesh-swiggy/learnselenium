import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Selenium19Alerts2 extends BaseClass {
    @Test
    public void alertPracticeJSConfirm() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Alert alt;
        By clickFor_JS_Confirm = By.xpath("//button[contains(text(), 'Click for JS Confirm')]");
        By result_msg = By.xpath("//p[@id='result']");
        String expected_result = "You clicked: Ok";
        String expected_alertText = "I am a JS Confirm";
        String actual_AlertText =null;
        String actual_ResultText = null;

        driver.findElement(clickFor_JS_Confirm).click();

        alt = driver.switchTo().alert();
        actual_AlertText = alt.getText();

        Thread.sleep(3000);

        //dismiss the alert and check text
        alt.dismiss();
        actual_ResultText = driver.findElement(result_msg).getText();

        Thread.sleep(3000);

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(expected_result, actual_ResultText, "Result msg is not as expected. Expected : " + expected_result + ", Actual : " + actual_ResultText);
        sa.assertEquals(expected_alertText, actual_AlertText,  "Alert text is not as expected. Expected : " + expected_alertText + ", Actual : " + actual_ResultText);

        // click ok this time
        driver.findElement(clickFor_JS_Confirm).click();

        alt = driver.switchTo().alert();
        actual_AlertText = alt.getText();

        Thread.sleep(3000);

        alt.accept();
        actual_ResultText = driver.findElement(result_msg).getText();

        sa.assertEquals(expected_result, actual_ResultText, "Result msg is not as expected. Expected : " + expected_result + ", Actual : " + actual_ResultText);
        sa.assertEquals(expected_alertText, actual_AlertText,  "Alert text is not as expected. Expected : " + expected_alertText + ", Actual : " + actual_ResultText);

        sa.assertAll();
    }

}
