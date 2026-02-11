package reusable;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    public static String fetchFile(String sheetName, int row, int cell) throws IOException, InvalidFormatException {

        FileInputStream fetchDatafile = new FileInputStream(new File("src/main/resources/TestData/Data.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fetchDatafile);
        XSSFSheet  sheet = workbook.getSheet(sheetName);
        return sheet.getRow(row).getCell(cell).getStringCellValue();



    }
}
