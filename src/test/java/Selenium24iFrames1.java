import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class Selenium24iFrames1 extends BaseClass {
    @Test
    public void iFramesDemo() {
        driver.get("C:\\Java\\Selenium\\PracticeFiles\\iFrame.html");

        try {
            driver.findElement(By.linkText("Most Common Challenges You Faced in Selenium Automation")).click();
        }
        catch (NoSuchElementException ex)
        {
            System.out.println("got the expected exception.");
        }

        driver.switchTo().frame("selenium");

        try {
            driver.findElement(By.linkText("Most Common Challenges You Faced in Selenium Automation")).click();
            System.out.println("Clicked on the link inside the frame.");

        }
        catch (NoSuchElementException ex)
        {
            System.out.println("got the unexpected exception.");
        }

        try {
            driver.findElement(By.linkText("Click here for Selenium tutorial")).click();
        }
        catch (NoSuchElementException ex)
        {
            System.out.println("got the NoSuchElementException");
        }

        driver.switchTo().defaultContent();

        try {
            driver.findElement(By.linkText("Click here for Selenium tutorial")).click();
            System.out.println("Clicked on the link outside the frames.");
        }
        catch (NoSuchElementException ex)
        {
            System.out.println("got the NoSuchElementException");
        }

    }
}
