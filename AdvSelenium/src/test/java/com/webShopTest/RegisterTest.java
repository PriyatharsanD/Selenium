package com.webShopTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.genericUtility.ExcelUtility;
import com.google.genericUtility.webDriverUtility.WebDriverUility;
import com.webshop.pom.HomePage;
import com.webshop.pom.RegisterPage;
import com.webshop.pom.SuccessRegisterPage;

public class RegisterTest extends BaseClass {
	
	ExcelUtility excel = new ExcelUtility();
	@DataProvider(name="getData")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		Sheet s = excel.getSheet("Register");
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
	
	@Test(dataProvider="getData")
	public void registerTest(String gender,String fn, String ln,String email,String pwd,String conPwd)
	{
		HomePage home = new HomePage(driver);
		home.clickRegister();
		RegisterPage registerPage = new RegisterPage(driver);
		if(gender.equalsIgnoreCase("male"))
			registerPage.male.click();
		else
			registerPage.female.click();
		registerPage.firstName.sendKeys(fn);
		registerPage.lastName.sendKeys(ln);
		SuccessRegisterPage success = new SuccessRegisterPage(driver);
		success.clickLogOut();
	}
}