import org.testng.annotations.Test;

public class Selenium38ExceptionsJQueryException extends BaseClass {
    @Test
    public void jQueryExceptionError() {
        driver.get("www.amazon.com");

        // we get exception in the stack trace
        // at Selenium38ExceptionsJQueryException.jQueryExceptionError(Selenium38ExceptionsJQueryException.java:6)

    }
}
