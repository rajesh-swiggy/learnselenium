import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenium46ProxyConfig {
    public void configureProxy() {
        // Create Proxy object, and set to HTTP port to 7777
        Proxy p = new Proxy();
        p.setHttpProxy("localhost:7777");

        // Create DesiredCapabilities
        DesiredCapabilities capabs = new DesiredCapabilities();
        capabs.setCapability(CapabilityType.PROXY,  p);

        // Create Driver object
        WebDriver driver = new ChromeDriver(capabs);

        // now same code as usual
    }
}
