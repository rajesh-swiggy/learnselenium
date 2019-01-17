import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Selenium39AutoITSingleFile extends BaseClass {
    @Test
    public void autoITSingleFile() throws InterruptedException, IOException {
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@type='file' and @id='file-upload']")).click();

        Runtime.getRuntime().exec("C:\\Java\\Selenium\\PracticeFiles\\AutoITScripts\\FileUpload.exe");

        Thread.sleep(5000);


    }
}
