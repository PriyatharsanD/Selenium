package com.advSelenium.DataDrivenTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.genericUtility.AmazonUtility;

public class AmazonTest {
	@Test(dataProvider = "getData")
	public void searchTest(String product,String name)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.id("twotabsearchtextbox")).submit();
		String path="//span[text()='"+name+"']/../../../../div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span/span[2]";
		System.out.println(driver.findElement(By.xpath(path)).getText());
		driver.close();	
	}
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		AmazonUtility amazonUtility = new AmazonUtility();
		Object[][] data = new Object[4][2];
		for(int i=0;i<4;i++)
		{
			data[i][0]=amazonUtility.getDataFromExcel(i+1,0);
			data[i][1]=amazonUtility.getDataFromExcel(i+1,1);
		}
		return data;
	}
}