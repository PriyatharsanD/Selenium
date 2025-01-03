package com.advSelenium.DataDrivenTest;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel3 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./SampleData/sample.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet("sample3");
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			for(int j=0;j<s.getRow(0).getPhysicalNumberOfCells();j++)
			{
				if(s.getRow(i)!=null&&!(s.getRow(i).getCell(0).toString().equalsIgnoreCase("NAME")))
				{
					System.out.print(s.getRow(i).getCell(j).toString()+" ");
				}
			}
			System.out.println();
		}
	}

}
