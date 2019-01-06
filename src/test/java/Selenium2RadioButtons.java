import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium2RadioButtons extends BaseClass {
    @Test
    public void RadioButtonPractice() {
        driver.get("https://www.facebook.com/");

        // Value : 1 - Female, 2 - Male
        By SEX_RADIO = By.xpath("//input[@type='radio' and @name='sex']");
        List<WebElement> sexradios = driver.findElements(SEX_RADIO);
        for(WebElement elem : sexradios) {
            String value = elem.getAttribute("value");
            System.out.println("id : " + elem.getAttribute("id"));
            if(value.equalsIgnoreCase("2"))
            {
                elem.click();
            }
        }
    }
}
