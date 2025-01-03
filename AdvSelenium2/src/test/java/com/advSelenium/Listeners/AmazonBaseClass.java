package com.advSelenium.Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.advSelenium.utility.webdrivers.DriverUtility;

public class AmazonBaseClass {
	public DriverUtility driverUtility=new DriverUtility();
	public WebDriver driver;
	public static WebDriver copyDriver;
	@BeforeClass
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driverUtility.waitTillPageToLoad(driver);
		copyDriver=driver;
		
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
