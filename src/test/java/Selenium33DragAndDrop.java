import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium33DragAndDrop extends BaseClass {
    @Test
    public void dragAndDropExample() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        String initial_header_a = driver.findElement(By.xpath("//div[@id='column-a']/header")).getText();
        String initial_header_b = driver.findElement(By.xpath("//div[@id='column-b']/header")).getText();

        WebElement source_element = driver.findElement(By.id("column-a"));
        WebElement dest_element = driver.findElement(By.id("column-b"));

        Actions builder = new Actions(driver);
        //Action drag_drop = builder.dragAndDrop(source_element, dest_element).build();

        Action drag_drop = builder.clickAndHold(source_element).moveToElement(dest_element).release().build();

        drag_drop.perform();

        Thread.sleep(30000);

        // verify the header text now
        String new_header_a = driver.findElement(By.xpath("//div[@id='column-a']/header")).getText();
        String new_header_b = driver.findElement(By.xpath("//div[@id='column-b']/header")).getText();

        if(initial_header_a == new_header_b && initial_header_b == new_header_a )
            System.out.println("success");
    }
}
