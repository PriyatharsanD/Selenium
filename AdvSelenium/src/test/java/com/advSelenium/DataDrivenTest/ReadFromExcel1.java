package com.advSelenium.DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ReadFromExcel1 {
	public static void main(String[] args) throws Exception, IOException {
		FileInputStream fis = new FileInputStream("./SampleData/sample.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sample1");
		int rows = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j).toString()+" ");
			}
			System.out.println();
		}
	}
}
