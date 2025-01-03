package com.google.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcel(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Indiqube\\selenium\\AdvSelenium\\src\\main\\resources\\TestData\\WebShop.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheetName);
		return s.getRow(row).getCell(cell).getStringCellValue();
	}
	public Sheet getSheet(String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Indiqube\\selenium\\AdvSelenium\\src\\main\\resources\\TestData\\WebShop.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		return w.getSheet(sheetName);
	}
}
