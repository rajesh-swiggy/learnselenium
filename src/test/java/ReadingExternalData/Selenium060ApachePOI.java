package ReadingExternalData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Selenium060ApachePOI  {
    public Selenium060ApachePOI() throws IOException {
        File src = new File(" /Users/Kingslayer/Documents/learnselenium/src/main/resources/ApachePOIWorkBook.xlsx ");
        FileInputStream fis = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheetAt(0);

        sheet1.getRow(0).getCell(0);

    }
}
