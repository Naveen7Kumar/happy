package com.nav;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	public static WebDriver driver;
	
	public static void drpdown(WebElement element , String Value) {
		Select s = new Select(element);
		s.selectByValue(Value);
	}

	public static void getTitle() {
		driver.getTitle();
	}
	
	public static void url() {
		driver.getCurrentUrl();
	}
	
	public static void inputText(WebElement element ,String Value) {
		element.sendKeys(Value);
	}
	
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	public static String stringData(int row, int cell) throws IOException {
		File loc = new File("C:\\Users\\www.abcom.in\\eclipse-workspace\\DemoMaven\\testdata\\pom1.xlsx");
		FileInputStream input = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String cellValue = c.getStringCellValue();
		return cellValue;

	}

	public static String numericData(int row, int cell) throws IOException {
		File loc = new File("C:\\Users\\www.abcom.in\\eclipse-workspace\\DemoMaven\\testdata\\pom1.xlsx");
		FileInputStream input = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		double numericCellValue = c.getNumericCellValue();
		long l = (long) numericCellValue;
		String valueOf = String.valueOf(l);
		return valueOf;

	}

}
