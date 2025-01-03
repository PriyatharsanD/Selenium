package com.advSelenium.parallelExecution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.advSelenium.utility.generic.FileUtility;
import com.advSelenium.utility.webdrivers.DriverUtility;

public class ConfigClass {
	
	public DriverUtility driverUtility = new DriverUtility();
	public FileUtility fileUtility = new FileUtility();
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void launchBrowser(String browser) throws IOException
	{
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.drive","C:\\Users\\Priyadrashan\\Downloads\\geckodriver-v0.35.0-win32\\geckodriver");
			driver = new FirefoxDriver();
		}
		else
		{
			Assert.fail();
		}
		driverUtility.launchBrowser(driver,fileUtility.getDataFromPropertyFile("url"));
	}
	@AfterClass
	public void close()
	{
		driverUtility.close(driver);
	}
}
