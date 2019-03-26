import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeErrorReproduce {
    @Test
    public void chromerror() {
        WebDriver driver = new ChromeDriver();
        driver.get("wwww.amazon.in");
    }
}
