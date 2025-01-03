package com.advSelenium.DataDrivenTest;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./DataSource/sample.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet s=w.getSheet("sample2");
	}

}
