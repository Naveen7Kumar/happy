package com.DD;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dat {

	public static void main(String[] args) throws IOException {

		File loc = new File("C:\\Users\\www.abcom.in\\eclipse-workspace\\DemoMaven\\testdata\\happy.xlsx");

		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Naveen");
		Row r = s.createRow(2);
		Cell c = r.createCell(2);

		c.setCellValue("Hero");

		FileOutputStream output = new FileOutputStream(loc);
		w.write(output);
		System.out.println("Done");

	}

}
