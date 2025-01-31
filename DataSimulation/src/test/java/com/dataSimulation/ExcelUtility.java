package com.dataSimulation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	private String path;
	private Workbook wb;
	public ExcelUtility(String path)
	{
		this.path=path;
		try {
			wb=WorkbookFactory.create(new FileInputStream(path));
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getDataFromExcel(String sheet,int rowIndex,int colIndex)
	{
		return wb.getSheet(sheet).getRow(rowIndex).getCell(colIndex).toString();
	}
	public int getRowCount(String sheet)
	{
		return wb.getSheet(sheet).getPhysicalNumberOfRows();
	}
	public int getColCount(String sheet)
	{
		return wb.getSheet(sheet).getRow(0).getPhysicalNumberOfCells();
	}

}
