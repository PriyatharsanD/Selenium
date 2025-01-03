package com.google.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AmazonUtility {
	public static String getDataFromExcel(int row,int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Indiqube\\selenium\\AdvSelenium\\src\\main\\resources\\TestData\\Amazon.xlsx");
		Sheet s= WorkbookFactory.create(fis).getSheet("products");
		return s.getRow(row).getCell(col).getStringCellValue();
	}
	public int getRow() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Indiqube\\selenium\\AdvSelenium\\src\\main\\resources\\TestData\\Amazon.xlsx");
		Sheet s = WorkbookFactory.create(fis).getSheet("products");
		return s.getPhysicalNumberOfRows();
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println(getDataFromExcel(1, 0));
		System.out.println(getDataFromExcel(1, 1));
		System.out.println(getDataFromExcel(2, 0));
		System.out.println(getDataFromExcel(2, 1));
	}
	
}
