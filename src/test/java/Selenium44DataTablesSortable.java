import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium44DataTablesSortable extends BaseClass {
    @Test
    public void dataTablesSortable() throws IOException {
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        By tableHeaderToClick = By.xpath("//table[@id='table1']//span[text()='Last Name']/parent::th");
        captureScreenshot("DataTableBeforeSort");
        driver.findElement(tableHeaderToClick).click();
        captureScreenshot("DataTableAfterSort");

        By tableRows = By.xpath("//table[@id='table1']/tbody/tr");
        List<WebElement> rowsList = driver.findElements(tableRows);
        int rows = rowsList.size();

        By tableHeader = By.xpath("//table[@id='table1']/thead/tr/th");
        List<WebElement> colList = driver.findElements(tableHeader);
        int cols = colList.size();

        System.out.println("Rows : " + rows + ", Cols : " + cols);

        String valueToSearch = null;
        String colName = null;

        valueToSearch = "Conway";
        colName = "Last Name";

        boolean resultFound = false;
        int resultRow = 0;
        int resultCol = 0;
        for(int i = 1; i <= rows && !resultFound ; i++)
        {
            for(int j=1; j <= cols; j++)
            {
                String currentCellData = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
                if(currentCellData.equalsIgnoreCase(valueToSearch))
                {
                    resultFound = true;
                    resultRow = i;
                    resultCol = j;
                    break;

                }
            }

        }

        System.out.println("Row : " +resultRow + ", col : " + resultCol );
    }
}
