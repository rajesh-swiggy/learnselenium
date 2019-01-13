import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenium45DesiredCapabilities {
    public void desiredCapabilitiesExample() {
        DesiredCapabilities capab = DesiredCapabilities.chrome();
        capab.setBrowserName("IE");

        WebDriver driver = new InternetExplorerDriver(capab);

    }
}
