import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Selenium25iFrames2 extends BaseClass {
    @Test
    public void iFramesPracticeWebElement() {
        driver.get("C:\\Java\\Selenium\\PracticeFiles\\iFrame.html");

        try  {
            driver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
        }
        catch (NoSuchElementException ex)
        {
            System.out.println("got the expected exception.");
        }

        WebElement selenium_frame = driver.findElement(By.xpath("//iframe[@title='selenium_news']"));
        driver.switchTo().frame(selenium_frame);

        try  {
            driver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
            System.out.println("clicked on projects as expected.");
        }
        catch (NoSuchElementException ex)
        {
            System.out.println("got the unexpected exception.");
        }

        // https://the-internet.herokuapp.com/nested_frames
    }
}
