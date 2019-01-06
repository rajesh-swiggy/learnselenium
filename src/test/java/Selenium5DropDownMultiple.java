import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium5DropDownMultiple extends BaseClass {
    @Test
    public void multiDropDownPractice() {
        driver.get("http://output.jsbin.com/osebed/2");

        By FRUITS = By.id("fruits");
        Select fruits_select = new Select(driver.findElement(FRUITS));

        // isMultiple
        Assert.assertTrue(fruits_select.isMultiple(), "Fruits options are not multi-select as expected.");

        // getOptions
        Reporter.log(" ====> Running the getOptions part", true);
        List<WebElement> fruits_options = fruits_select.getOptions();
        for(WebElement fruit : fruits_options)
        {
            System.out.println(fruit.getText());
        }


        // selectByIndex
        Reporter.log(" ====> Running the selectByIndex part", true);
        fruits_select.selectByIndex(1);
        List<WebElement> fruits_selected = fruits_select.getAllSelectedOptions();
        for(WebElement fruit : fruits_selected)
        {
            System.out.println("Selected option byIndex : " + fruit.getText());
            if(fruit.getText().equalsIgnoreCase("grape"))
            {
                System.out.println("Grape is selected.");
            }
            else
            {
                System.out.println("Grape is not selected.");
            }
        }
        //fruits_select.deselectAll();
        fruits_select.selectByIndex(3);
        fruits_selected = fruits_select.getAllSelectedOptions();
        for(WebElement fruit : fruits_selected)
        {
            System.out.println("Selected option byIndex : " + fruit.getText());
            if(fruit.getText().equalsIgnoreCase("grape"))
            {
                System.out.println("Grape is selected.");
            }
            else
            {
                System.out.println("Grape is not selected.");
            }
        }
        fruits_select.deselectAll();

        // check if no fruits is selected now
        fruits_selected = fruits_select.getAllSelectedOptions();
        Assert.assertTrue(fruits_selected.isEmpty(), "not all fruits were deselected.");
        if(fruits_selected.isEmpty())
        {
            System.out.println("All the options are deselected.");
        }

        // selectByVisibletext
        Reporter.log(" ====> Running the selectByVisibleText part", true);
        fruits_select.selectByVisibleText("Banana");
        fruits_selected = fruits_select.getAllSelectedOptions();
        for(WebElement fruit : fruits_selected)
        {
            System.out.println("Selected option byVisibleText : " + fruit.getText());
            if(fruit.getText().equalsIgnoreCase("grape"))
            {
                System.out.println("Grape is selected.");
            }
            else
            {
                System.out.println("Grape is not selected.");
            }
        }
        fruits_select.deselectAll();
        fruits_select.selectByVisibleText("Grape");
        fruits_selected = fruits_select.getAllSelectedOptions();
        for(WebElement fruit : fruits_selected)
        {
            System.out.println("Selected option byVisibleText : " + fruit.getText());
            if(fruit.getText().equalsIgnoreCase("grape"))
            {
                System.out.println("Grape is selected.");
            }
            else
            {
                System.out.println("Grape is not selected.");
            }
        }
        fruits_select.deselectAll();

        // check if no fruits is selected now
        fruits_selected = fruits_select.getAllSelectedOptions();
        Assert.assertTrue(fruits_selected.isEmpty(), "not all fruits were deselected.");
        if(fruits_selected.isEmpty())
        {
            System.out.println("All the options are deselected.");
        }

        // selectByValue
        Reporter.log(" ====> Running the selectByValue part", true);
        fruits_select.selectByValue("banana");
        fruits_selected = fruits_select.getAllSelectedOptions();
        for(WebElement fruit : fruits_selected)
        {
            System.out.println("Selected option byValue : " + fruit.getText());
            if(fruit.getText().equalsIgnoreCase("grape"))
            {
                System.out.println("Grape is selected.");
            }
            else
            {
                System.out.println("Grape is not selected.");
            }
        }
        fruits_select.deselectAll();
        fruits_select.selectByValue("grape");
        fruits_selected = fruits_select.getAllSelectedOptions();
        for(WebElement fruit : fruits_selected)
        {
            System.out.println("Selected option byValue : " + fruit.getText());
            if(fruit.getText().equalsIgnoreCase("grape"))
            {
                System.out.println("Grape is selected.");
            }
            else
            {
                System.out.println("Grape is not selected.");
            }
        }
        fruits_select.deselectAll();

        // check if no fruits is selected now
        fruits_selected = fruits_select.getAllSelectedOptions();
        Assert.assertTrue(fruits_selected.isEmpty(), "not all fruits were deselected.");
        if(fruits_selected.isEmpty())
        {
            System.out.println("All the options are deselected.");
        }


        // getFirstSelected
        Reporter.log(" ====> Running the getFirstSelected part", true);
        fruits_select.deselectAll();
        fruits_select.selectByVisibleText("Banana");
        fruits_select.selectByVisibleText("Apple");
        WebElement fruits_first_selection = fruits_select.getFirstSelectedOption();
        if(fruits_first_selection.getText().equalsIgnoreCase("banana") )
        {
            System.out.println("banana is the first selected option, as expected.");
        }


        // getAllSelectedOptions , covered above

        // deselectAll, covered above

        // preconditioning for deselection
        fruits_selected = fruits_select.getAllSelectedOptions();
        System.out.println("Selected fruits before select all action are : ");
        for(WebElement selected_fruit : fruits_selected)
        {
            System.out.print(selected_fruit.getText() + " , ");
        }
        System.out.println("");

        fruits_options = fruits_select.getOptions();
        for(WebElement fruit : fruits_options)
        {
            fruits_select.selectByVisibleText(fruit.getText());
        }


        fruits_selected = fruits_select.getAllSelectedOptions();
        System.out.println("Selected fruit after select all action are.");
        for(WebElement selected_fruit : fruits_selected)
        {
            System.out.print(selected_fruit.getText() + " , ");
        }

        System.out.println("");


        // deselectByIndex
        Reporter.log(" ====> Running the deselectByIndex part", true);
        fruits_select.deselectByIndex(1);
        fruits_selected = fruits_select.getAllSelectedOptions();
        for(WebElement fruit : fruits_selected)
        {
            System.out.println("Selected option deselectedByIndex : " + fruit.getText());
            if(fruit.getText().equalsIgnoreCase("apple"))
            {
                System.out.println("Apple is still selected.");
            }
            else
            {
                System.out.println("Apple is not selected now ( deselectedByIndex ).");
            }
        }


        // deselectByValue
        Reporter.log(" ====> Running the deselectByValue part", true);
        fruits_select.deselectByValue("orange");
        fruits_selected = fruits_select.getAllSelectedOptions();
        for(WebElement fruit : fruits_selected)
        {
            System.out.println("Selected option deselectByValue : " + fruit.getText());
            if(fruit.getText().equalsIgnoreCase("orange"))
            {
                System.out.println("Orange is still selected.");
            }
            else
            {
                System.out.println("Orange is not selected now ( deselectByValue ).");
            }
        }


        // deselectByvisibleText
        Reporter.log(" ====> Running the deselectByVisibleText part", true);
        fruits_select.deselectByVisibleText("Grape");
        fruits_selected = fruits_select.getAllSelectedOptions();
        for(WebElement fruit : fruits_selected)
        {
            System.out.println("Selected option deselectByVisibleText : " + fruit.getText());
            if(fruit.getText().equalsIgnoreCase("grape"))
            {
                System.out.println("Grape is still selected.");
            }
            else
            {
                System.out.println("Grape is not selected now ( deselectByVisibleText ).");
            }
        }

    }
}
