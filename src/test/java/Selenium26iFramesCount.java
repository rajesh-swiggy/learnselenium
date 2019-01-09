import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium26iFramesCount extends BaseClass {
    @Test
    public void iFramesCountExamples() {
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        int frame_count = driver.findElements(By.tagName("frame")).size();

        System.out.println("There are total : " + frame_count + " frames in the default content area.");

        int frame_counter = 0;

        List<WebElement> frame_col = driver.findElements(By.tagName("frame"));

        for(int i=0; i < frame_col.size(); i++)
        {
            driver.switchTo().frame(i);
            List<WebElement> inner_frame_col = driver.findElements(By.tagName("frame"));
            System.out.println("There are " + inner_frame_col.size() + " frames inside frame # " + i);
            frame_counter = frame_counter + inner_frame_col.size();
        }

        System.out.println("There are total " + (int)(frame_counter+frame_count)+ " inside the whole page.");
    }
}
