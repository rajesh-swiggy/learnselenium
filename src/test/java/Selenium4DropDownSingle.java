import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium4DropDownSingle extends BaseClass {
    @Test
    public void dropDownPractice() throws InterruptedException {
        String selected_day, selected_month, selected_year;

        driver.get("https://www.facebook.com/");

        WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
        WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
        WebElement years = driver.findElement(By.xpath("//select[@id='year']"));

        Select days_dd = new Select(days);
        Select months_dd = new Select(months);
        Select years_dd = new Select(years);

        // single select - isMultiple
        Assert.assertFalse(days_dd.isMultiple(), "Days : Expected to find a single select drop down, found multi-select.");
        Assert.assertFalse(months_dd.isMultiple(), "Months : Expected to find a single select drop down, found multi-select.");
        Assert.assertFalse(years_dd.isMultiple(), "Years : Expected to find a single select drop down, found multi-select.");

        // single select - getOptions
        List<WebElement> days_Options = days_dd.getOptions();
        for(WebElement d : days_Options)
        {
            //System.out.println("Days : " + d.getText());
        }

        List<WebElement> months_options = months_dd.getOptions();
        for(WebElement m : months_options)
        {
            //System.out.println("Months : " + m.getText());
        }

        List<WebElement> years_options = years_dd.getOptions();
        for(WebElement y : years_options)
        {
            //System.out.println("Years : " + y.getText());
        }

        // single select - selectByIndex
        days_dd.selectByIndex(7);  // select day as 7
        months_dd.selectByIndex(12); // select month as Dec
        years_dd.selectByVisibleText("1985"); // select year as 1985

        selected_day = days_dd.getFirstSelectedOption().getText();
        selected_month = months_dd.getFirstSelectedOption().getText();
        selected_year = years_dd.getFirstSelectedOption().getText();

        Assert.assertTrue(selected_day.equals("7") && selected_month.equalsIgnoreCase("dec") && selected_year.equals("1985"),
                "Values are not correct. Expected : 7-Dec-1985, Actual : " + selected_day + "-" + selected_month + "-" + selected_year);

        Thread.sleep(3000);

        // reset all values
        days_dd.selectByVisibleText("Day");
        months_dd.selectByVisibleText("Month");
        years_dd.selectByVisibleText("Year");
        selected_day = null;
        selected_month = null;
        selected_year = null;

        Thread.sleep(3000);

        // single select - selectByVisibleText
        days_dd.selectByVisibleText("7");  // select day as 7
        months_dd.selectByVisibleText("Dec"); // select month as Dec
        years_dd.selectByVisibleText("1985"); // select year as 1985

        selected_day = days_dd.getFirstSelectedOption().getText();
        selected_month = months_dd.getFirstSelectedOption().getText();
        selected_year = years_dd.getFirstSelectedOption().getText();

        Assert.assertTrue(selected_day.equals("7") && selected_month.equalsIgnoreCase("dec") && selected_year.equals("1985"),
                "Values are not correct. Expected : 7-Dec-1985, Actual : " + selected_day + "-" + selected_month + "-" + selected_year);

        Thread.sleep(3000);

        // reset all values
        days_dd.selectByVisibleText("Day");
        months_dd.selectByVisibleText("Month");
        years_dd.selectByVisibleText("Year");
        selected_day = null;
        selected_month = null;
        selected_year = null;

        Thread.sleep(3000);

        // single select - selectByValue
        days_dd.selectByValue("7");  // select day as 7
        months_dd.selectByValue("12"); // select month as Dec
        years_dd.selectByValue("1985"); // select year as 1985

        selected_day = days_dd.getFirstSelectedOption().getText();
        selected_month = months_dd.getFirstSelectedOption().getText();
        selected_year = years_dd.getFirstSelectedOption().getText();

        Assert.assertTrue(selected_day.equals("7") && selected_month.equalsIgnoreCase("dec") && selected_year.equals("1985"),
                "Values are not correct. Expected : 7-Dec-1985, Actual : " + selected_day + "-" + selected_month + "-" + selected_year);

        // reset all values
        days_dd.selectByVisibleText("Day");
        months_dd.selectByVisibleText("Month");
        years_dd.selectByVisibleText("Year");
        selected_day = null;
        selected_month = null;
        selected_year = null;

        Thread.sleep(3000);


        // single select - getFirstSelectedOption

    }
}
