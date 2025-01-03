package com.advSelenium.utility.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcel(String sheet,int row,int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream fileInputStream = new FileInputStream("D:\\Indiqube\\selenium\\AdvSelenium2\\src\\main\\resources\\DataSource\\TestScriptData\\sample.xlsx");
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		return workbook.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
	}

}
