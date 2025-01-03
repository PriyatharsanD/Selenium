package com.advSelenium.DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteIntoExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./SampleData/sample.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("sample4");
		sheet.createRow(1).createCell(0).setCellValue("Priya");
		FileOutputStream fos = new FileOutputStream("./DataSource/sample.xlsx");
		wb.write(fos);
		wb.close();
	}
}
