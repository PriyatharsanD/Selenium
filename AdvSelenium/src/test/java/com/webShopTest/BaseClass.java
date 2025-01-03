package com.webShopTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.google.genericUtility.FileUtility;
import com.google.genericUtility.webDriverUtility.WebDriverUility;

public class BaseClass {
	WebDriverUility driverUtility= new WebDriverUility();
	FileUtility fileUtility = new FileUtility();
	WebDriver driver;
	@BeforeClass
	public void LaunchBrowser() throws Exception
	{
		driver = new ChromeDriver();
		driver.get(fileUtility.getDataFromPropertyFile("url"));
		driverUtility.waitForPageToLoad(driver);
		driverUtility.maximizeWindow(driver);
	}
	@AfterClass
	public void closeBrowser()
	{
		driverUtility.close(driver);
	}
}
