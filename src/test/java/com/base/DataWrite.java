package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {

	public static void main(String[] args) throws IOException {
		

		File loc = new File("C:\\Users\\www.abcom.in\\eclipse-workspace\\DemoMaven\\testdata\\Kumar.xlsx");
		FileInputStream input = new FileInputStream(loc);

		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.createSheet("Appa");
		Row r = s.createRow(3);
		Cell c = r.createCell(1);
		String s1 = c.getStringCellValue();
		if (s1.equals("naveen")) {
			c.setCellValue("Oracle");
		}

		FileOutputStream output = new FileOutputStream(loc);
		w.write(output);

		System.out.println("Updation Done");

	}

}
