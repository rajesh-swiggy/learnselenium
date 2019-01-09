import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selenium21AlertSimple extends BaseClass {
    @Test
    public void alertSimpleTest() {
        // another sample website : http://demo.guru99.com/test/delete_customer.php
        driver.get("https://www.ksrtc.in/");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Alert alt = driver.switchTo().alert();
        String alert_text = alt.getText();

        alt.accept();

        System.out.println("Displayed alert text is : " + alert_text);
    }
}
