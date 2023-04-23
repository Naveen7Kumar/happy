package com.DD;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDri {

	@Test

	private void tc1() throws IOException {
		File f = new File("C:\\Users\\www.abcom.in\\eclipse-workspace\\DemoMaven\\testdata\\datdri.xlsx");
		FileInputStream input = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(input);

		Sheet s = w.getSheet("sheet1");

		Row r = s.getRow(0);

		Cell c = r.getCell(0);

		System.out.println(c);

	}

}
