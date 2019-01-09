import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Selenium22ConditionalAlert extends BaseClass {
    public void alertPracticeConditional() {
        if( isAlertPresent(driver)){
            System.out.println("checked");
        }
        else
        {
            System.out.println("not checked");
        }
    }

    private boolean isAlertPresent(WebDriver localDriver) {
       try {
           localDriver.switchTo().alert();
           return true;
       }
       catch ( NoAlertPresentException ex) {
           return false;
       }
    }
}
