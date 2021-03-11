package com.selng.demo.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.selng.demo.configs.BaseClass;

public class TestUtil extends BaseClass {

	public static String TESTDATA_SHEET_PATH = homedir + "/src/main/java/com/selng/demo/data/contactsTestData.xlsx";
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	

	public void navigateToContacts() {
		driver.navigate().to("https://ui.cogmento.com/contacts/new/");		
	}
	
	public static Object[][] getData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = workbook.getSheet(sheetName);
		Object[][] mydata = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				mydata[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
		return mydata;
	}

	public static void getscreenshotAs() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(homedir + "/screenshots/" + ".png"));
	}

}
