import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Selenium33DragAndDropPixel extends BaseClass {
    @Test
    public void dragAndDropPixelExample() throws IOException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        By draggable_bank = By.xpath("//text()[.=' BANK ']//parent::a");

        Actions builder = new Actions(driver);
        Action dragdrop = builder.dragAndDropBy(driver.findElement(draggable_bank), 135, 40).build();

        String text_beforeDrop = driver.findElement(By.xpath("//ol[@id='bank']/li")).getText().trim();
        Assert.assertNotEquals(text_beforeDrop, "BANK");

        dragdrop.perform();

        String text_afterDrop = driver.findElement(By.xpath("//ol[@id='bank']/li")).getText().trim();
        Assert.assertEquals(text_afterDrop, "BANK");

        captureScreenshot("draganddropguru1");
    }
}
