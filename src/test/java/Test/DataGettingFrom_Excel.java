package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataGettingFrom_Excel {

	@Test
	public void login6() throws IOException {

		FileInputStream file = new FileInputStream("./src/test/resources/testData/a.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		int sheetCount = workbook.getNumberOfSheets();

		for (int i = 0; i < sheetCount; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("TestData")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> row = sheet.iterator();
				Row firstRow = row.next();
				Iterator<Cell> ce = firstRow.cellIterator();
				int k = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcase")) {
 
					}
					k++;
				}

			}
		}
	}

}
