import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium3CheckBoxes extends BaseClass {
    int i = 0;
    @Test
    public void CheckBoxPractice() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        String s = " checkbox 1";
        By CHECK_BOX = By.xpath("//input[@type='checkbox']");
        List<WebElement> checkboxes = driver.findElements(CHECK_BOX);

        for(WebElement elem : checkboxes)
        {
            System.out.println(elem.isSelected());
            System.out.println(elem.findElement(By.xpath("following-sibling::label[.*]")).getText());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
