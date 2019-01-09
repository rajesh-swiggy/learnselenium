import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class Selenium28MultipleWindows1 extends BaseClass {
    @Test
    public void handleMultipleWindowsPractice() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");

        String parentWindowName = driver.getWindowHandle();

        System.out.println(parentWindowName);

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        Set<String> windows = driver.getWindowHandles();

        ArrayList<String> windowsList = new ArrayList<>(windows);

        for (int i = 0; i < windowsList.size(); i++)
        {
            System.out.println(windowsList.get(i));
        }

        for(String w : windowsList)
        {
            System.out.println(driver.switchTo().window(w).getTitle());
            if(!w.equalsIgnoreCase(parentWindowName))
            {
                driver.switchTo().window(w);
                driver.close();
            }
        }
    }
}
