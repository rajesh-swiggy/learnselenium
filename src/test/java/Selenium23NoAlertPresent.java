import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

public class Selenium23NoAlertPresent extends BaseClass {
    @Test
    public void alertSimpleTest() {
        // another sample website : http://demo.guru99.com/test/delete_customer.php
        driver.get("https://www.ksrtc.in/");

        // below click causes the alert to popup , it is commented to get exception
        //driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            Alert alt = driver.switchTo().alert();
            String alert_text = alt.getText();

            alt.accept();
        }
        catch (NoAlertPresentException ex)
        {
            System.out.println("received the expected exception : " + ex.toString());
            System.out.println("\n \n Stack trace error log : \n " + ex.getMessage());
        }
    }
}
