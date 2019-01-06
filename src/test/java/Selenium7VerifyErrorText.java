import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium7VerifyErrorText extends BaseClass {
    @Test
    public void VerifyErrorTextPractice() throws InterruptedException {
        driver.get("https://accounts.google.com/");
        By NEXT_BUTTON = By.xpath("//span[contains(text(),'Next')]");
        By ERROR_TEXT = By.xpath("//div[@class='GQ8Pzc']");
        String actual_error = null;
        String expected_error = "Enter an email or phone number";

        driver.findElement(NEXT_BUTTON).click();

        if(driver.findElement(ERROR_TEXT).isDisplayed())
        {
            actual_error = driver.findElement(ERROR_TEXT).getText();
        }

        Assert.assertEquals(actual_error, expected_error, "Error text is not as expected. Actual : " + actual_error + " , Expected : " + expected_error);
        Thread.sleep(3000);
    }
}
