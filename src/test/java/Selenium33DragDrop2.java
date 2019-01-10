import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Selenium33DragDrop2 extends BaseClass {
    @Test
    public void dragAndDrop2() throws InterruptedException, IOException {
        driver.get("http://jqueryui.com/resources/demos/droppable/default.html");;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        By draggable = By.xpath("//div[@id='draggable']");
        By droppable = By.xpath("//div[@id='droppable']");

        String text_beforeDrop = driver.findElement(droppable).getText();

        Assert.assertEquals(text_beforeDrop, "Drop here");

        Actions builder = new Actions(driver);
        Action draganddrop = builder.dragAndDrop(driver.findElement(draggable), driver.findElement(droppable)).build();
        draganddrop.perform();

        captureScreenshot("DragAndDrop2.png");
        String text_afterDrop = driver.findElement(droppable).getText();

        Assert.assertEquals(text_afterDrop, "Dropped!");

    }
}
