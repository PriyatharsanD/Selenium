package com.webShopTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.genericUtility.ExcelUtility;
import com.google.genericUtility.FileUtility;
import com.google.genericUtility.webDriverUtility.WebDriverUility;
import com.webshop.pom.HomePage;
import com.webshop.pom.LogInPage;
import com.webshop.pom.RegisterPage;
import com.webshop.pom.SuccessRegisterPage;

public class LogInTest {
	WebDriver driver;
	FileUtility fileUtility = new FileUtility();
	ExcelUtility excel = new ExcelUtility();
	WebDriverUility driverUtility = new WebDriverUility();
	@BeforeTest
	public void launchhApp() throws Exception
	{
		driver = new ChromeDriver();
		driver.get(fileUtility.getDataFromPropertyFile("url"));
		driverUtility.waitForPageToLoad(driver);
		driverUtility.maximizeWindow(driver);
	}
	
	@Test(dependsOnMethods = "registerTest")
	public void loginTest() throws Exception
	{
		HomePage home = new HomePage(driver);
		home.clickLogIn();
		LogInPage inPage = new LogInPage(driver);
		inPage.login("monishaMath123@gmail.com","moni123" );
		System.out.println(inPage.getUser());
	}
	
	@Test(priority = 1)
	public void homePageTest()
	{
		HomePage home = new HomePage(driver);
		home.clickRegister();
	}
	
	@DataProvider(name="registerData")
	public Object[][] rigisterData() throws EncryptedDocumentException, IOException
	{
		Sheet s = excel.getSheet("Register");
		int row = s.getPhysicalNumberOfRows();
		int col = s.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[3][6];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<6;j++)
			{
				data[i][j]=excel.getDataFromExcel("Register",i+1, j);
			}
		}
		return data;
	}
	
	@Test(dataProvider = "registerData",dependsOnMethods = "homePageTest")
	public void registerTest(String gender,String fn, String ln,String email,String pwd,String conPwd)
	{
		RegisterPage registerPage = new RegisterPage(driver);
		SuccessRegisterPage success = new SuccessRegisterPage(driver);
		success.clickLogOut();
		HomePage home = new HomePage(driver);
		home.clickRegister();
	}
}