import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Selenium36TakeScreenshotRobot extends BaseClass {
    @Test
    public void takeScreenshotRobot() throws AWTException, IOException {
        driver.get("https://www.google.com");

        // This will capture screenshot of current screen
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

        // This will store screenshot on specific location
        ImageIO.write(image, "png", new File("./Screenshots/CurrentScreenshot.png"));
    }
}
