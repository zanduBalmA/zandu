package Test;


	
	
	import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excell {
	public static void main(String[] args) {
	    // Specify the path to your Excel file
	    String excelFilePath = "./src/test/resources/testData/a.xlsx";

	    // Specify the test case and data column names
	    String testCaseColumnName = "TestCase";
	    String dataColumnName = "fname";

	    // Specify the target test case and data column values
	    String targetTestCase = "Login5";
	    String targetDataColumn = "ram";

	    // Configure WebDriver (ChromeDriver in this example)
	 //   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	   // WebDriver driver = new ChromeDriver();

	    try (FileInputStream fis = new FileInputStream(excelFilePath);
	         Workbook workbook = new XSSFWorkbook(fis)) {

	        // Read the first sheet from the Excel file
	        Sheet sheet = workbook.getSheetAt(0);

	        // Find the column index for the test case and data columns
	        int testCaseColumnIndex = 0;
	        int dataColumnIndex = 0;
	        Row headerRow = sheet.getRow(0);

	        for (Cell cell : headerRow) {
	            String columnName = cell.getStringCellValue();

	            if (columnName.equalsIgnoreCase(testCaseColumnName)) {
	                testCaseColumnIndex = cell.getColumnIndex();
	            } else if (columnName.equalsIgnoreCase(dataColumnName)) {
	                dataColumnIndex = cell.getColumnIndex();
	            }
	        }

	        // Retrieve data for the target test case from the data column
	        for (Row row : sheet) {
	            Cell testCaseCell = row.getCell(testCaseColumnIndex);
	            Cell dataCell = row.getCell(dataColumnIndex);

	            if (testCaseCell != null && testCaseCell.getStringCellValue().equalsIgnoreCase(targetTestCase)
	                    && dataCell != null && dataCell.getStringCellValue().equalsIgnoreCase(targetDataColumn)) {
	                String testData = dataCell.getStringCellValue();
	                System.out.println("Test Case: " + targetTestCase + ", Data Column: " + targetDataColumn +
	                        ", Test Data: " + testData);
	                break;
	            }
	        }

	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        // Close the WebDriver instance
	      //  driver.quit();
	    }
	}

	}



