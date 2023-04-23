package com.DD;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatUpd {

	public static void main(String[] args) throws IOException {

		File loc = new File("C:\\Users\\www.abcom.in\\eclipse-workspace\\DemoMaven\\testdata\\happy1.xlsx");
		FileInputStream input = new FileInputStream(loc);

		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(1);

		String s1 = c.getStringCellValue();

		if (s1.equals("Naveen")) {
			c.setCellValue("SuperStar");

		}

		FileOutputStream output = new FileOutputStream(loc);
		w.write(output);
		System.out.println("Done");

	}

}
